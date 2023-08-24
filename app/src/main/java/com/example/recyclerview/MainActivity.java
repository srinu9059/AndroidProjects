package com.example.recyclerview;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.widget.ImageView;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    RecyclerView recyclerView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        recyclerView = findViewById(R.id.recyclerView);
        List<CardItems>items=new ArrayList<>();
        for(int i = 0;i<=1000;i++){
            items.add(new CardItems(R.drawable.baby,"Srinu","Handsome","10:30"));

        }
//        items.add(new CardItems(R.drawable.baby,"Srinu","Handsome","10:30"));
//        items.add(new CardItems(R.drawable.baby,"Srinu","Handsome","10:30"));
//        items.add(new CardItems(R.drawable.baby,"Srinu","Handsome","10:30"));
//        items.add(new CardItems(R.drawable.baby,"Srinu","Handsome","10:30"));
//        items.add(new CardItems(R.drawable.baby,"Srinu","Handsome","10:30"));
//        items.add(new CardItems(R.drawable.baby,"Srinu","Handsome","10:30"));
//        items.add(new CardItems(R.drawable.baby,"Srinu","Handsome","10:30"));


        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        recyclerView.setAdapter(new MyAdapter(getApplicationContext(),items));
    }
}