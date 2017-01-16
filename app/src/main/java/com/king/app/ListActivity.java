package com.king.app;


import android.os.Handler;
import android.widget.ListView;

import com.king.app.adapter.ListAdapter;
import com.king.base.BaseActivity;
import com.king.base.model.EventMessage;
import com.king.widget.SuperSwipeRefreshLayout;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Jenly <a href="mailto:jenly1314@gmail.com">Jenly</a>
 * @sine 2016/9/18
 */
public class ListActivity extends BaseActivity{

    private SuperSwipeRefreshLayout ssrl;

    private ListView listView;

    private ListAdapter adapter;

    private List<String> listData;

    private int[] colors = new int[]{
            0x7fff0000,0x700ff000,0x7f0000ff
    };

    @Override
    public void initUI() {
        setContentView(R.layout.activity_list);

        ssrl = findView(R.id.ssrl);
        ssrl.setColorSchemeColors(colors);
        listView = findView(R.id.listView);

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

        adapter = new ListAdapter(context,listData);
        listView.setAdapter(adapter);

    }

    private void pullRefresh(){

        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                ListActivity.this.runOnUiThread(new Runnable() {
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
                ListActivity.this.runOnUiThread(new Runnable() {
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
