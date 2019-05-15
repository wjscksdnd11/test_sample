package com.example.smaple_v.repo;

import com.example.smaple_v.datas.Container;

import java.util.List;

public interface Callback {
    void onDataLoaded(Container container);
    void onDataRepoLoaded(List<Container> containers);
    void onFail();
}
