package com.linearbd.listview;

import android.content.Context;
import android.support.v4.content.ContextCompat;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;

/**
 * Created by Genius 03 on 8/28/2017.
 */

public class MyAdapter extends BaseAdapter {
    private List<String> stringList;
    private Context context;
    private LayoutInflater inflater;

    private int[] colors= new int[]{
          R.color.symphony_color,R.color.nokia_color,R.color.motorola_color,R.color.samsung_color
    };

    public MyAdapter(List<String> stringList, Context context) {
        this.stringList = stringList;
        this.context = context;
        this.inflater = LayoutInflater.from(context);
    }

    @Override
    public int getCount() {
        return stringList.size();
    }

    @Override
    public Object getItem(int i) {
        return stringList.get(i);
    }

    @Override
    public long getItemId(int i) {
        return i;
    }

    @Override
    public View getView(int position, View view, ViewGroup viewGroup) {
        view = inflater.inflate(R.layout.single_item,viewGroup,false);

        int remainder = position%colors.length;

        TextView textView = view.findViewById(R.id.text_view);
        ImageView ivCircle = view.findViewById(R.id.iv_circle);
        ivCircle.setColorFilter(ContextCompat.getColor(context,colors[remainder]));

        textView.setTextColor(ContextCompat.getColor(context,colors[remainder]));
        textView.setText(stringList.get(position));
        return view;
    }
}
