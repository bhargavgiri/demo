package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        RecyclerView recyclerView = findViewById(R.id.recyclerview);
        recyclerView.setHasFixedSize(true);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));

        MyCarData[] myCarData =new MyCarData[]{
                new MyCarData("Suzuki", "Alto", "2018", R.drawable.alto),
                new MyCarData("Suzuki", "Baleno", "2019", R.drawable.baleno),
                new MyCarData("BMW", "Z4", "2020", R.drawable.bmw),
                new MyCarData("Hundai", "Venue", "2015", R.drawable.venue),
                new MyCarData("Suzuki", "Swift", "2015", R.drawable.swift)
        };
        MyCarAdapter myCarAdapter = new MyCarAdapter(myCarData,MainActivity.this);
        recyclerView.setAdapter(myCarAdapter );
    }
}