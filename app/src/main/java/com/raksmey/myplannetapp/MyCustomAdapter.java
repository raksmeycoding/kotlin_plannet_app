package com.raksmey.myplannetapp;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import java.util.ArrayList;

public class MyCustomAdapter extends ArrayAdapter<Planned> {
    private ArrayList<Planned> plannedArrayList;
    private Context context;

    public MyCustomAdapter(ArrayList<Planned> plannedArrayList, Context context) {
        super(context, R.layout.item_list_layout, plannedArrayList);
        this.plannedArrayList = plannedArrayList;
        this.context = context;

    }


    private static class MyViewHolder {
        TextView plannetName;
        TextView moonCount;
        ImageView plannetImage;
    }


    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        Planned planned = getItem(position);

        // Inflate the layout
        MyViewHolder myViewHolder;
        final View result;

        if (convertView == null) {
            myViewHolder = new MyViewHolder();
            LayoutInflater inflater = LayoutInflater.from(getContext());
            convertView = inflater.inflate(R.layout.item_list_layout, parent, false);

            // finding the view
            myViewHolder.plannetName = (TextView) convertView.findViewById(R.id.id_planned_name);
            myViewHolder.moonCount = (TextView) convertView.findViewById(R.id.id_moon);
            myViewHolder.plannetImage = (ImageView) convertView.findViewById(R.id.id_image_view);

            result = convertView;

            convertView.setTag(myViewHolder);
        } else {
            myViewHolder = (MyViewHolder) convertView.getTag();
            result = convertView;
        }

        assert planned != null;
        myViewHolder.plannetName.setText(planned.getPlannedName());
        myViewHolder.moonCount.setText(planned.getMoonCount());
        myViewHolder.plannetImage.setImageResource(planned.getPlannedImage());

        return result;


    }
}
