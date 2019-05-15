package com.example.projectretrofitbank.Retrrofit;

import com.example.projectretrofitbank.Interface.StatementsService;
import com.example.projectretrofitbank.Interface.UserService;
import com.example.projectretrofitbank.Model.Statement;

import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class RetrofitConfig {

    private final Retrofit retrofit;

    public RetrofitConfig()
    {
        this.retrofit = new Retrofit.Builder()
                .baseUrl("https://bank-app-test.herokuapp.com/api/")
                .addConverterFactory(GsonConverterFactory.create())
                .build();
    }

    public UserService getUserService() {
        return this.retrofit.create(UserService.class);
    }

    public StatementsService getStatmentsService() {
        return this.retrofit.create(StatementsService.class);
    }
}
