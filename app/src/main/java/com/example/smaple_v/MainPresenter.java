package com.example.smaple_v;

import com.example.smaple_v.datas.Container;
import com.example.smaple_v.repo.Callback;
import com.example.smaple_v.repo.Repository;

import java.util.List;

public class MainPresenter implements MainContract.Presenter {

    public Repository mRepo;
    public MainContract.View mView;
    public MainPresenter(MainContract.View view) {
        mRepo = new Repository();
        mView = view;
    }

    @Override
    public void loadUser(String userName) {
        mRepo.getUser(new Callback() {
            @Override
            public void onDataLoaded(Container container) {
                mView.onLoadedUser(container);
            }

            @Override
            public void onDataRepoLoaded(List<Container> containers) {

            }

            @Override
            public void onFail() {

            }
        },userName);
    }

    @Override
    public void loadRepository(String userName) {
            mRepo.getRepo(new Callback() {
                @Override
                public void onDataLoaded(Container container) {
                }

                @Override
                public void onDataRepoLoaded(List<Container> containers) {
                    mView.onLoadedRepository(containers);

                }

                @Override
                public void onFail() {
                }
            },userName);
    }
}
