package com.uddd.myapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;

public class HomeActivity extends AppCompatActivity {
    private ListView lv;
    private ArrayList<String>items;
    private ArrayAdapter<String> adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);

        lv = findViewById(R.id.listView_home);
        items = new ArrayList<>();
        items.add("sadda");items.add("sadda");items.add("sadda");
        adapter = new ArrayAdapter<>(this,android.R.layout.simple_list_item_1,items);
        lv.setAdapter(adapter);

    }
}
