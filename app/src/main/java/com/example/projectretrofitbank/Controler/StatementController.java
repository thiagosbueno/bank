package com.example.projectretrofitbank.Controler;

import com.example.projectretrofitbank.Interface.StatementsService;
import com.example.projectretrofitbank.Model.Statement;

import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class StatementController {

    private Statement statement;
    private final Retrofit retrofit;

    public StatementController() {
        this.statement = new Statement();
        this.retrofit = new Retrofit.Builder()
                .baseUrl("https://bank-app-test.herokuapp.com/api/")
                .addConverterFactory(GsonConverterFactory.create())
                .build();
    }

    public Statement getStatement() {
        return statement;
    }

    public void setStatement(Statement statement) {
        this.statement = statement;
    }

    public StatementsService getStatmentsService() {
        return this.retrofit.create(StatementsService.class);
    }
}
