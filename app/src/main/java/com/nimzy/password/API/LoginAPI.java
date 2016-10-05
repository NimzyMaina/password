package com.nimzy.password.API;

/**
 * Created by user on 3/25/2016.
 */

import retrofit.Callback;
import retrofit.client.Response;
import retrofit.http.Field;
import retrofit.http.FormUrlEncoded;
import retrofit.http.POST;

public interface LoginAPI {
    @FormUrlEncoded
    @POST("/api/v1/login")
    public void loginUser(
            @Field("email") String email,
            @Field("password") String password,
            Callback<Response> callback);
}
