package com.example.akbar_atakhodzhaev_m3_hw3_third;

import android.view.View;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class ContactViewHolder extends RecyclerView.ViewHolder {
    private final TextView tvGpu;
    public ContactViewHolder(@NonNull View itemView) {
        super(itemView);
        tvGpu = itemView.findViewById(R.id.tv_gpu);
    }
    public void onBind(String contact){
        tvGpu.setText(contact);
    }
}
