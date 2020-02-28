package com.example.habitsmostinspiringsuccess;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;


public class ListAdapter2 extends BaseAdapter {

    LayoutInflater inflater;
    private List<Data>list = null;
    private ArrayList<Data> arraylist;
    Context context;

    public ListAdapter2(Activity context, List<Data> openSite) {
        this.context=context;
        this.list = openSite;
        inflater = LayoutInflater.from(context);
        this.arraylist = new ArrayList<>();
        this.arraylist.addAll(openSite);

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

    public View getView(final int position, View view, ViewGroup parent) {
        View Item =inflater.inflate(R.layout.item_list, null,true);

        TextView txtTitle = (TextView) Item.findViewById(R.id.titleid);
        TextView txtPart = (TextView) Item.findViewById(R.id.partid);

        txtTitle.setText(list.get(position).getSubject1());
        txtPart.setText(list.get(position).getPart1());

        Item.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View arg0) {
                Intent i = new Intent(context,SnigleItem.class);
                i.putExtra("subjectt",list.get(position).getSubject1());
                i.putExtra("image",list.get(position).getText1());

                context.startActivity(i);
            }
        });

        return Item;



    };

    public void filter(String charText) {
        charText = charText.toLowerCase(Locale.getDefault());
        list.clear();
        if (charText.length() == 0) {
            list.addAll(arraylist);
        }
        else
        {
            for (Data wp : arraylist)
            {
                if (wp.getSubject1().toLowerCase(Locale.getDefault()).contains(charText))
                {
                    list.add(wp);
                }
            }
        }
        notifyDataSetChanged();
    }
}
