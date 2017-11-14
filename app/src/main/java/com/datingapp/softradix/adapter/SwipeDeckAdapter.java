package com.datingapp.softradix.adapter;

import android.content.Context;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import com.datingapp.softradix.R;

import java.util.List;

/**
 * Created by softradix on 13/11/17.
 */

public class SwipeDeckAdapter extends BaseAdapter {

    private List<String> data;
    private Context context;
    LayoutInflater inflater;

    public SwipeDeckAdapter(List<String> data, Context context) {
        inflater = LayoutInflater.from(context);
        this.data = data;
        this.context = context;
    }

    @Override
    public int getCount() {
        return data.size();
    }

    @Override
    public Object getItem(int position) {
        return data.get(position);
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(final int position, View convertView, ViewGroup parent) {

        View v = convertView;
        if(v == null){
            // normally use a viewholder
            v = inflater.inflate(R.layout.dating_card, parent, false);
        }
        /*((TextView) v.findViewById(R.id.textView2)).setText(data.get(position));*/

        v.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String item = (String)getItem(position);
                Log.i("MainActivity", item);
            }
        });

        return v;
    }
}