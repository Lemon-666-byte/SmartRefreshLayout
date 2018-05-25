package com.yang;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;

import com.refreshview.SmartRefreshLayout;
import com.refreshview.api.RefreshLayout;
import com.refreshview.listener.OnRefreshLoadMoreListener;


public class MainActivity extends AppCompatActivity {

    private SmartRefreshLayout smartRefreshLayout;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        smartRefreshLayout = findViewById(R.id.refreshLayout);
        smartRefreshLayout.autoRefresh();
//        smartRefreshLayout.setOnRefreshLoadMoreListener(new OnRefreshLoadMoreListener() {
//            @Override
//            public void onLoadMore(@NonNull RefreshLayout refreshLayout) {
//
//            }
//
//            @Override
//            public void onRefresh(@NonNull RefreshLayout refreshLayout) {
//
//            }
//        });

        Log.e("tag", "fdfsd");

    }
}
