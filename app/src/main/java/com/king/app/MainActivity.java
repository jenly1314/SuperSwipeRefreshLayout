package com.king.app;


import android.os.Handler;
import android.support.v7.widget.DefaultItemAnimator;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import com.king.app.adapter.RecyclerAdapter;
import com.king.base.BaseActivity;
import com.king.base.model.EventMessage;
import com.king.widget.SuperSwipeRefreshLayout;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Jenly <a href="mailto:jenly1314@gmail.com">Jenly</a>
 * @date 2016/9/18
 */
public class MainActivity extends BaseActivity{

    private SuperSwipeRefreshLayout ssrl;

    private RecyclerView recyclerView;

    private RecyclerAdapter adapter;

    private List<String> listData;

    private int[] colors = new int[]{
            0x7fff0000,0x700ff000,0x7f0000ff
    };

    @Override
    public void initUI() {
        setContentView(R.layout.activity_main);

        ssrl = findView(R.id.ssrl);
        ssrl.setColorSchemeColors(colors);
        recyclerView = findView(R.id.recyclerView);
        recyclerView.setItemAnimator(new DefaultItemAnimator());
        recyclerView.addItemDecoration(new DividerItemDecoration(this,DividerItemDecoration.VERTICAL));
    }

    @Override
    public void addListeners() {

        ssrl.setOnRefreshListener(new SuperSwipeRefreshLayout.OnRefreshListener() {
            @Override
            public void onRefresh(SuperSwipeRefreshLayout.Direction direction) {
                if(direction == SuperSwipeRefreshLayout.Direction.TOP){
                    pullRefresh();
                }else if(direction == SuperSwipeRefreshLayout.Direction.BOTTOM){
                    loadMore();
                }
            }
        });

    }

    @Override
    public void initData() {

        listData = new ArrayList<>();

        for (int i = 0; i < 20; i++) {
            listData.add("Item" + i);
        }

        adapter = new RecyclerAdapter(context,listData);

        recyclerView.setLayoutManager(new LinearLayoutManager(context,LinearLayoutManager.VERTICAL,false));
        recyclerView.setAdapter(adapter);

    }

    private void pullRefresh(){

        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                MainActivity.this.runOnUiThread(new Runnable() {
                    @Override
                    public void run() {
                        listData.clear();
                        for (int i = 0; i < 20; i++) {
                            listData.add("Item" + i);
                        }

                        refreshView();
                    }
                });
            }
        }, 2500);
    }

    private void loadMore(){
        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                MainActivity.this.runOnUiThread(new Runnable() {
                    @Override
                    public void run() {
                        listData.add("Item" + listData.size());
                        refreshView();
                    }
                });
            }
        }, 2500);
    }

    private void refreshView(){
        adapter.notifyDataSetChanged();
        ssrl.setRefreshing(false);
    }

    @Override
    public void onEventMessage(EventMessage em) {

    }
}
