package com.example.ayaali.secondtask.adapter;

import android.app.Activity;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.ayaali.secondtask.R;

/**
 * Created by AyaAli on a1/a12/2017.
 */

public class AdapterList2 extends ArrayAdapter<String> {

    private final String [] description;

    private final Activity context;

    public AdapterList2(String[] description, Activity context1) {
        super(context1, R.layout.item_list, description);

        this.description = description;

        this.context = context1;
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {

        LayoutInflater inflater=context.getLayoutInflater();

        View rowView=inflater.inflate(R.layout.item,null,true);
        TextView textView=(TextView) rowView.findViewById(R.id.text2);
        textView.setText(description[position]);

        return rowView;
    }
}
