package com.example.myapplication;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class MyCarAdapter extends RecyclerView.Adapter<MyCarAdapter.ViewHolder> {
  /*  MyCarData[] myCarData;*/
    Context context;
    List<MyCarData> myCarData;
    String brand,car,year;
  String image;
    public MyCarAdapter() {
    }

    public MyCarAdapter(List<MyCarData> myCarData, MainActivity activity){
        this.myCarData = myCarData;
        this.context = activity;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater layoutInflater = LayoutInflater.from(parent.getContext());
        View view = layoutInflater.inflate(R.layout.car_item_list,parent,false);
       // ViewHolder viewHolder = new ViewHolder(view);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
       /* final MyCarData myCarDataList = myCarData[position];
        ;*/

        MyCarData myCarDataList=myCarData.get(position);
        holder.textViewbrand.setText(myCarDataList.getBrand());
        holder.textViewcar.setText(myCarDataList.getCar());
        holder.textViewyear.setText(myCarDataList.getYear());
        holder.carimage.setImageResource(myCarDataList.getImage());
        holder.layout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                brand=myCarDataList.getBrand();
                car=myCarDataList.getCar();
                year=myCarDataList.getYear();
                image= String.valueOf(myCarDataList.getImage());
                Intent intent=new Intent(context,)
            }
        });
    }

    @Override
    public int getItemCount() {
        return myCarData.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder{
        ImageView carimage;
        TextView textViewbrand;
        TextView textViewcar;
        TextView textViewyear;
        RelativeLayout layout;
        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            layout=itemView.findViewById(R.id.linearLayout);
            carimage = itemView.findViewById(R.id.imageview);
            textViewbrand = itemView.findViewById(R.id.textviewbrand);
            textViewcar = itemView.findViewById(R.id.textviewcarname);
            textViewyear = itemView.findViewById(R.id.textviewyear);
        }
    }
}
