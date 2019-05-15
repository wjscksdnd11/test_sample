package com.example.smaple_v.repo;

import com.example.smaple_v.datas.Repo;
import com.example.smaple_v.datas.User;

import java.util.List;

import retrofit2.Call;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;
import retrofit2.http.GET;
import retrofit2.http.Path;
import retrofit2.http.Query;

public interface ApiService {
    final String base_url ="https://api.github.com/";

    @GET("users/{username}")
    Call<User> getUser(@Path("username") String userName);

    @GET("users/{username}/repos")
    Call<List<Repo>> getRepo(@Path("username") String userName);

    public static final Retrofit retrofit = new Retrofit.Builder()
            .baseUrl(base_url)
            .addConverterFactory(GsonConverterFactory.create())
            .build();
}
