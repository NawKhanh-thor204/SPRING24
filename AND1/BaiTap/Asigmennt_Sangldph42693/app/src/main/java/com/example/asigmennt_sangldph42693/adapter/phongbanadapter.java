package com.example.asigmennt_sangldph42693.adapter;

import android.app.Activity;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.asigmennt_sangldph42693.R;
import com.example.asigmennt_sangldph42693.model.phongban;


import java.util.ArrayList;

public class phongbanadapter extends BaseAdapter {

    private final Context context;
    private final ArrayList<phongban> list;

    public phongbanadapter(Context context, ArrayList<phongban> list) {
        this.context = context;
        this.list = list;
    }

    @Override
    public int getCount() {
        return list.size();
    }

    @Override
    public Object getItem(int position) {
        return list.get(position);
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        LayoutInflater inflater = ((Activity)context).getLayoutInflater();
        convertView = inflater.inflate(R.layout.item_phongban,parent,false);

        ImageView hinh = convertView.findViewById(R.id.imgHinh);
        TextView txtTenPB = convertView.findViewById(R.id.txtTenpb);

        hinh.setImageResource(list.get(position).getHinh());
        txtTenPB.setText(list.get(position).getTenpb());
        return convertView;
    }
}