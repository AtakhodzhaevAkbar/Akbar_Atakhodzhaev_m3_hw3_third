package com.example.akbar_atakhodzhaev_m3_hw3_third;

import android.view.LayoutInflater;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class ContactAdapter extends RecyclerView.Adapter<ContactViewHolder>{
    private final ArrayList<String> gpuList;

    public ContactAdapter(ArrayList<String> gpuList) {
        this.gpuList = gpuList;
    }

    @NonNull
    @Override
    public ContactViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return new ContactViewHolder(LayoutInflater.from(parent.getContext()).inflate(R.layout.item_contact, parent, false));
    }

    @Override
    public void onBindViewHolder(@NonNull ContactViewHolder viewHolder, int position) {
        viewHolder.onBind(gpuList.get(position));
    }

    @Override    public int getItemCount() {
        return gpuList.size();
    }
}
