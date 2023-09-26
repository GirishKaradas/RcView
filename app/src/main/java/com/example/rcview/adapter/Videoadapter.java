package com.example.rcview.adapter;

import android.view.Display;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.rcview.R;
import com.example.rcview.model.ModelVideo;

import java.util.List;

public class Videoadapter extends RecyclerView.Adapter {

    private List<ModelVideo>data;
    @NonNull
    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View itemview = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_video,parent,false);
        return null;
    }

    public static class MyViewHolder extends RecyclerView.ViewHolder{

        public MyViewHolder(@NonNull View itemView) {
            super(itemView);
        }
    }

    @Override
    public void onBindViewHolder(@NonNull RecyclerView.ViewHolder holder, int position) {

    }
    public void setData(List<ModelVideo>data){
        this.data = data;
        notifyDataSetChanged();

    }

    @Override
    public int getItemCount() {
        return 0;
    }
}
