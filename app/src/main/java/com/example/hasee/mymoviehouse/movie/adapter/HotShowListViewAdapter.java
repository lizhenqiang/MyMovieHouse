package com.example.hasee.mymoviehouse.movie.adapter;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import com.example.hasee.mymoviehouse.R;

import java.util.List;

/**
 * Created by lzq on 2016/11/30.
 */
public class HotShowListViewAdapter extends BaseAdapter {
    private final List<String> listViewBeens;
    private final Context mContext;



    public HotShowListViewAdapter(Context mContext, List<String> listViewBeens) {
        this.mContext = mContext;
        this.listViewBeens = listViewBeens;
    }

    @Override
    public int getCount() {


       return listViewBeens==null?null:listViewBeens.size();
    }

    @Override
    public Object getItem(int position) {
        return listViewBeens.get(position);
    }

    @Override
    public long getItemId(int position) {
        return 0;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        ViewHolder holder;
        if(convertView==null) {

            convertView = View.inflate(mContext,R.layout.item_hotshow_listview,null);
            holder = new ViewHolder();
            convertView.setTag(holder);

            holder.textView = (TextView) convertView.findViewById(R.id.text);
        }else {
            holder  = (ViewHolder) convertView.getTag();
        }
        return convertView;

    }


    private class ViewHolder {
        TextView textView;

    }
}
