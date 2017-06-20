package com.example.zeus.myapplication;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import java.util.ArrayList;

public class CustomAdaptorClass extends ArrayAdapter<USER> {


    public CustomAdaptorClass(Context context, ArrayList<USER> users) {
        super(context, 0, users);
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        // Get the data item for this position
        USER user = getItem(position);
        // Check if an existing view is being reused, otherwise inflate the view
        if (convertView == null) {
            convertView = LayoutInflater.from(getContext()).inflate(R.layout.layoutact, parent, false);
        }
        // Lookup view for data population
        TextView tvName = (TextView) convertView.findViewById(R.id.subjectName);
        TextView tvHome = (TextView) convertView.findViewById(R.id.skillName);
        TextView leveln = (TextView) convertView.findViewById(R.id.levelno);

        // Populate the data into the template view using the data object
        // Return the completed view to render on screen
        return convertView;

    }
}