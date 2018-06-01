package com.omar.testapi.retrofit;

import com.omar.testapi.pojos.Service;

import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.Header;
import retrofit2.http.Headers;
import retrofit2.http.POST;

public interface ApiInterface {

//    @Headers({"Content-Type: application/json;charset=utf-8"})
    @POST("example/example")
    Call<Service> postService(@Body Service service);
}
