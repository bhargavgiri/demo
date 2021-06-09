package com.example.myapplication;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class MyCarAdapter extends RecyclerView.Adapter<MyCarAdapter.ViewHolder> {
    MyCarData[] myCarData;
    Context context;
    public MyCarAdapter(MyCarData[] myCarData, MainActivity activity){
        this.myCarData = myCarData;
        this.context = activity;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater layoutInflater = LayoutInflater.from(parent.getContext());
        View view = layoutInflater.inflate(R.layout.car_item_list,parent,false);
        ViewHolder viewHolder = new ViewHolder(view);
        return viewHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        final MyCarData myCarDataList = myCarData[position];
        holder.textViewbrand.setText(myCarDataList.getBrand());
        holder.textViewcar.setText(myCarDataList.getCar());
        holder.textViewyear.setText(myCarDataList.getYear());
        holder.carimage.setImageResource(myCarDataList.getImage());
    }

    @Override
    public int getItemCount() {
        return 0;
    }

    public class ViewHolder extends RecyclerView.ViewHolder{
        ImageView carimage;
        TextView textViewbrand;
        TextView textViewcar;
        TextView textViewyear;
        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            carimage = itemView.findViewById(R.id.imageview);
            textViewbrand = itemView.findViewById(R.id.textviewbrand);
            textViewcar = itemView.findViewById(R.id.textviewcarname);
            textViewyear = itemView.findViewById(R.id.textviewyear);
        }
    }
}
