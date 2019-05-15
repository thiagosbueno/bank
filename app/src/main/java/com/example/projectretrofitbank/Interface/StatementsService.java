package com.example.projectretrofitbank.Interface;

import com.example.projectretrofitbank.Model.Statement;
import com.example.projectretrofitbank.Model.User;

import retrofit2.Call;
import retrofit2.http.Field;
import retrofit2.http.FormUrlEncoded;
import retrofit2.http.GET;
import retrofit2.http.POST;
import retrofit2.http.Path;
import retrofit2.http.Query;

public interface StatementsService {

//    @FormUrlEncoded
    @GET("statements/{userId}")
    Call<Statement> buscarStatements(@Path("userId") int userId); //, @Field("user") String user, @Field("password") String password
}
