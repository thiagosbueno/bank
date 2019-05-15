package com.example.projectretrofitbank.Interface;

import com.example.projectretrofitbank.Model.User;
import com.example.projectretrofitbank.Model.UserAccount;

import retrofit2.Call;
import retrofit2.http.Field;
import retrofit2.http.FormUrlEncoded;
import retrofit2.http.POST;

public interface UserService {

    @FormUrlEncoded
    @POST("login")
    Call<User> buscarUser(@Field("user") String user, @Field("password") String password);
}
