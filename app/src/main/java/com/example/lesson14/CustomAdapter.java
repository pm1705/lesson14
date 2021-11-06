package com.example.lesson14;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

public class CustomAdapter extends BaseAdapter {
    Context context;
    String names[];
    int flags[];
    String capitals[];
    LayoutInflater inflater;

    public CustomAdapter(Context applicationContext, String[] names, int[] flags, String[] capitals) {
        this.context = context;
        this.names = names;
        this.flags = flags;
        this.capitals = capitals;
        inflater = (LayoutInflater.from(applicationContext));
    }

    @Override
    public int getCount() {
        return names.length;
    }

    @Override
    public Object getItem(int i) {
        return null;
    }

    @Override
    public long getItemId(int i) {
        return 0;
    }

    @Override
    public View getView(int i, View view, ViewGroup viewGroup) {
        view = inflater.inflate(R.layout.custom_country_item, null);
        TextView name = (TextView) view.findViewById(R.id.name);
        ImageView flag = (ImageView) view.findViewById(R.id.flag);
        TextView capital = (TextView) view.findViewById(R.id.capital);
        name.setText(names[i]);
        flag.setImageResource(flags[i]);
        capital.setText(capitals[i]);
        return view;
    }
}

