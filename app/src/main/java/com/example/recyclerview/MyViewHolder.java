package com.example.recyclerview;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;


public class MyViewHolder extends RecyclerView.ViewHolder {
    ImageView image;
    TextView name,description,time;

    public MyViewHolder(@NonNull View itemView) {
        super(itemView);
        image= itemView.findViewById(R.id.profile);
        name= itemView.findViewById(R.id.name);
        description=itemView.findViewById(R.id.description);
        time = itemView.findViewById(R.id.time);
    }
}
