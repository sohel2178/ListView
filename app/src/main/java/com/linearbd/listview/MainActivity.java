package com.linearbd.listview;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    private ListView listView;

    private List<String> data;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        listView = (ListView) findViewById(R.id.list_view);

        iniTializeList();

        MyAdapter adapter = new MyAdapter(data,getApplicationContext());
        listView.setAdapter(adapter);
    }

    private void iniTializeList() {
        data = new ArrayList<>();
        data.add("Symphony");
        data.add("Nokia");
        data.add("Motorola");
        data.add("Samsung");
        data.add("Symphony");
        data.add("Nokia");
        data.add("Motorola");
        data.add("Samsung");
        data.add("Symphony");
        data.add("Nokia");
        data.add("Motorola");
        data.add("Samsung");
        data.add("Symphony");
        data.add("Nokia");
        data.add("Motorola");
        data.add("Samsung");
        data.add("Symphony");
        data.add("Nokia");
        data.add("Motorola");
        data.add("Samsung");
        data.add("Symphony");
        data.add("Nokia");
        data.add("Motorola");
        data.add("Samsung");
        data.add("Symphony");
        data.add("Nokia");
        data.add("Motorola");
        data.add("Samsung");
        data.add("Symphony");
        data.add("Nokia");
        data.add("Motorola");
        data.add("Samsung");
        data.add("Symphony");
        data.add("Nokia");
        data.add("Motorola");
        data.add("Samsung");
        data.add("Symphony");
        data.add("Nokia");
        data.add("Motorola");
        data.add("Samsung");
        data.add("Symphony");
        data.add("Nokia");
        data.add("Motorola");
        data.add("Samsung");
        data.add("Symphony");
        data.add("Nokia");
        data.add("Motorola");
        data.add("Samsung");
        data.add("Symphony");
        data.add("Nokia");
        data.add("Motorola");
        data.add("Samsung");
        data.add("Symphony");
        data.add("Nokia");
        data.add("Motorola");
        data.add("Samsung");
        data.add("Symphony");
        data.add("Nokia");
        data.add("Motorola");
        data.add("Samsung");
        data.add("Symphony");
        data.add("Nokia");
        data.add("Motorola");
        data.add("Samsung");
        data.add("Symphony");
        data.add("Nokia");
        data.add("Motorola");
        data.add("Samsung");
        data.add("Symphony");
        data.add("Nokia");
        data.add("Motorola");
        data.add("Samsung");
        data.add("Symphony");
        data.add("Nokia");
        data.add("Motorola");
        data.add("Samsung");
        data.add("Symphony");
        data.add("Nokia");
        data.add("Motorola");
        data.add("Samsung");
        data.add("Symphony");
        data.add("Nokia");
        data.add("Motorola");
        data.add("Samsung");
        data.add("Symphony");
        data.add("Nokia");
        data.add("Motorola");
        data.add("Samsung");
        data.add("Symphony");
        data.add("Nokia");
        data.add("Motorola");
        data.add("Samsung");
        data.add("Symphony");
        data.add("Nokia");
        data.add("Motorola");
        data.add("Samsung");
        data.add("Symphony");
        data.add("Nokia");
        data.add("Motorola");
        data.add("Samsung");
        data.add("Symphony");
        data.add("Nokia");
        data.add("Motorola");
        data.add("Samsung");
        data.add("Symphony");
        data.add("Nokia");
        data.add("Motorola");
        data.add("Samsung");
        data.add("Symphony");
        data.add("Nokia");
        data.add("Motorola");
        data.add("Samsung");
        data.add("Symphony");
        data.add("Nokia");
        data.add("Motorola");
        data.add("Samsung");
        data.add("Symphony");
        data.add("Nokia");
        data.add("Motorola");
        data.add("Samsung");
        data.add("Symphony");
        data.add("Nokia");
        data.add("Motorola");
        data.add("Samsung");
        data.add("Symphony");
        data.add("Nokia");
        data.add("Motorola");
        data.add("Samsung");
        data.add("Symphony");
        data.add("Nokia");
        data.add("Motorola");
        data.add("Samsung");
        data.add("Symphony");
        data.add("Nokia");
        data.add("Motorola");
        data.add("Samsung");
        data.add("Symphony");
        data.add("Nokia");
        data.add("Motorola");
        data.add("Samsung");
        data.add("Symphony");
        data.add("Nokia");
        data.add("Motorola");
        data.add("Samsung");
    }
}
