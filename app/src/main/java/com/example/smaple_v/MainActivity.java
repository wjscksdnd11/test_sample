package com.example.smaple_v;

import android.app.AppComponentFactory;
import android.net.Uri;
import android.os.Bundle;
import android.util.Log;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.example.smaple_v.datas.Container;

import java.util.List;


public class MainActivity extends AppCompatActivity implements MainContract.View {
    private MainPresenter presenter;
    private RecyclerView mRecyclerView;
    private MainAdapter mainAdapter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mRecyclerView = findViewById(R.id.recycler_view);
        mRecyclerView.setLayoutManager(new LinearLayoutManager(this));
        mainAdapter = new MainAdapter();
        mRecyclerView.setAdapter(mainAdapter);
        Uri data = this.getIntent().getData();
        presenter  = new MainPresenter(this);


        if (data != null && data.isHierarchical()) {
            String uri = this.getIntent().getDataString();
            if (uri != null) {
                String userName = uri.replaceAll("testapp://repos/","");
                Log.i("main", userName);
                presenter.loadUser(userName);
                presenter.loadRepository(userName);
            }

        }


    }


    @Override
    public void onLoadedUser(Container container) {
        mainAdapter.replaceUser(container);
    }

    @Override
    public void onLoadedRepository(List<Container> container) {
        mainAdapter.replaceRepository(container);
    }

}
