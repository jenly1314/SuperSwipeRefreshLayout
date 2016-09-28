package com.king.app.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;

import com.king.app.R;
import com.king.base.adapter.ViewHolderRecyclerAdapter;
import com.king.base.util.ViewHolder;

import java.util.List;

/**
 * @author Jenly <a href="mailto:jenly1314@gmail.com">Jenly</a>
 * @date 2016/9/18
 */
public class RecyclerAdapter extends ViewHolderRecyclerAdapter<String> {

    public RecyclerAdapter(Context context, List<String> listData) {
        super(context, listData);
    }

    @Override
    public View buildConvertView(LayoutInflater layoutInflater, int viewType) {
        return inflate(R.layout.list_item);
    }

    @Override
    public void bindViewDatas(ViewHolder holder, String s, int position) {
        holder.setText(R.id.tv,s);
    }
}
