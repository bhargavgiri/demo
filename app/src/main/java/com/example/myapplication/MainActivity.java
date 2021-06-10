package com.example.myapplication;

import androidx.annotation.RequiresApi;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Build;
import android.os.Bundle;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {


    ArrayList<MyCarData> myCarData;
    MyCarAdapter myCarAdapter;
    MyCarData myCarData1;
    ArrayList<MyCarData> carlist;

    @RequiresApi(api = Build.VERSION_CODES.N)
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        RecyclerView recyclerView = findViewById(R.id.recyclerview);

  
        carlist = new ArrayList<>();
        carlist.add(new MyCarData("Suzuki", "Alto", "2018", R.drawable.alto));
        carlist.add(new MyCarData("Suzuki", "Baleno", "2019", R.drawable.baleno));
        carlist.add(new MyCarData("BMW", "Z4", "2020", R.drawable.bmw));
        carlist.add(new MyCarData("Hundai", "Venue", "2015", R.drawable.venue));
        carlist.add(new MyCarData("Suzuki", "Swift", "2015", R.drawable.swift));

        recyclerView.setHasFixedSize(true);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        MyCarAdapter myCarAdapter = new MyCarAdapter(carlist, MainActivity.this);
        recyclerView.setAdapter(myCarAdapter);
    }
}