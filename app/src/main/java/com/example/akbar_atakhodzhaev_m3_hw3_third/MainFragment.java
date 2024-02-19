package com.example.akbar_atakhodzhaev_m3_hw3_third;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;


public class MainFragment extends Fragment {
    private RecyclerView rvGpu;
    private final ArrayList<String> gpuList =new ArrayList<>();
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_main, container, false);
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        initView();
        loaddata();
        ContactAdapter contactAdapter=new ContactAdapter(gpuList);
        rvGpu.setAdapter(contactAdapter);
    }
    private void initView(){
        rvGpu =requireActivity().findViewById(R.id.rv_gpu);
    }
    private void loaddata(){
        gpuList.add("Nvidia 3060");
        gpuList.add("Nvidia 3070");
        gpuList.add("Nvidia 3080");
        gpuList.add("Nvidia 3090");
        gpuList.add("Nvidia 4060");
        gpuList.add("Nvidia 4070");
        gpuList.add("Nvidia 4080");
        gpuList.add("Nvidia 4090");
        gpuList.add("Nvidia 1060");
        gpuList.add("Nvidia 1070");
        gpuList.add("Nvidia 1080");
        gpuList.add("Nvidia 1090");
        gpuList.add("Nvidia 2060");
    }
}