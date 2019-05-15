package com.example.smaple_v;

import com.example.smaple_v.datas.Container;

import java.util.List;

interface MainContract {
    interface Presenter{
        void loadUser(String userName);
        void loadRepository(String userName);

    }

    interface View{
        void onLoadedUser(Container container);
        void onLoadedRepository(List<Container> container);
    }


}
