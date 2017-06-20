package com.example.zeus.myapplication;

import android.app.Activity;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.Layout;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

        @Override
        protected void onCreate(Bundle savedInstanceState) {
            super.onCreate(savedInstanceState);
            setContentView(R.layout.activity_main);
            populatelist();
        }

    public void populatelist() {
        ArrayList<USER> arrayOfUsers = USER.getUsers();
        CustomAdaptorClass adapter = new CustomAdaptorClass(this, arrayOfUsers);
        ListView listView = (ListView) findViewById(R.id.list1);
        listView.setAdapter(adapter);
    }
    }
