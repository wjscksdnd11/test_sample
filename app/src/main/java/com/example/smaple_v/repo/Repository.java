package com.example.smaple_v.repo;

import android.util.Log;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import com.example.smaple_v.Constants;
import com.example.smaple_v.datas.Container;
import com.example.smaple_v.datas.Repo;
import com.example.smaple_v.datas.User;
import com.example.smaple_v.utils.AppExecutors;


import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import javax.annotation.Nonnull;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class Repository {
    private AppExecutors mAppExecutors;
    private ApiService apiService;

    public Repository() {
        apiService = ApiService.retrofit.create(ApiService.class);
        mAppExecutors = new AppExecutors();
    }

    public void getUser(final com.example.smaple_v.repo.Callback callback,String userName) {
        try {
            Call<User> call = apiService.getUser(userName);
            call.enqueue(new Callback<User>() {
                Runnable runnable;

                @Override
                public void onResponse(@Nonnull Call<User> call, @NonNull final Response<User> response) {
                    if (response.body() != null) {
                        runnable = new Runnable() {
                            @Override
                            public void run() {
                                Container container = new Container();
                                User user = response.body();
                                container.data = user;
                                container.viewType = Constants.USER;
                                callback.onDataLoaded(container);
                            }
                        };
                    } else {
                        runnable = new Runnable() {
                            @Override
                            public void run() {
                                callback.onFail();
                            }
                        };
                    }

                    mAppExecutors.mainThread().execute(runnable);
                }

                @Override
                public void onFailure(@Nullable Call<User> call, @Nonnull final Throwable t) {
                    mAppExecutors.mainThread().execute(new Runnable() {
                        @Override
                        public void run() {
                            Log.i("error", t.getMessage());
                            callback.onFail();
                        }
                    });
                }

            });


        } catch (Exception e) {
            e.printStackTrace();
            callback.onFail();
        }
    }

    public void getRepo(final com.example.smaple_v.repo.Callback callback,String userName) {
        try {
            Call<List<Repo>> call = apiService.getRepo(userName);
            call.enqueue(new Callback<List<Repo>>() {
                Runnable runnable;

                @Override
                public void onResponse(@Nonnull Call<List<Repo>> call, @NonNull final Response<List<Repo>> response) {
                    if (response.body() != null) {
                        runnable = new Runnable() {
                            @Override
                            public void run() {
                                List<Repo> repos = response.body();
                                List<Container> containers  = new ArrayList<>();
                                Collections.sort(repos);
                                for (Repo repo : repos) {
                                    Container container = new Container();
                                    container.data = repo;
                                    container.viewType = Constants.REPOSITORY;
                                    containers.add(container);
                                }
                                callback.onDataRepoLoaded(containers);
                            }
                        };
                    } else {
                        runnable = new Runnable() {
                            @Override
                            public void run() {
                                callback.onFail();
                            }
                        };
                    }

                    mAppExecutors.mainThread().execute(runnable);
                }

                @Override
                public void onFailure(@Nullable Call<List<Repo>> call, @Nonnull final Throwable t) {
                    mAppExecutors.mainThread().execute(new Runnable() {
                        @Override
                        public void run() {
                            Log.i("error", t.getMessage());
                            callback.onFail();
                        }
                    });
                }

            });


        } catch (Exception e) {
            e.printStackTrace();
            callback.onFail();
        }
    }

}
