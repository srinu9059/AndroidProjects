package com.example.recyclerview;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class MyAdapter extends RecyclerView.Adapter<MyViewHolder> {

    Context context;
    List<CardItems>items;

    public MyAdapter(Context context, List<CardItems> items) {
        this.context = context;
        this.items = items;
    }

    @NonNull
    @Override
    public MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return new MyViewHolder(LayoutInflater.from(context).inflate(R.layout.activity_card_items,parent,false));
    }

    @Override
    public void onBindViewHolder(@NonNull MyViewHolder holder, int position) {
        holder.image.setImageResource(items.get(position).getImage());
        holder.name.setText(items.get(position).getName());
        holder.description.setText(items.get(position).getDescription());
        holder.time.setText(items.get(position).getTime());
    }

    @Override
    public int getItemCount() {
        return items.size();
    }
}
