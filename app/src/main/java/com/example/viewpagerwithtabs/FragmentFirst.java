package com.example.viewpagerwithtabs;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class FragmentFirst extends Fragment {
    private RecyclerView recyclerView;
    private List<String> list;
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        return inflater.inflate(R.layout.fragment_first, container, false);
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        initViews(view);
        buildListData();
        setAdapter();
    }

    private void setAdapter() {
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(getContext());
        recyclerView.setLayoutManager(linearLayoutManager);
        ItemAdapter itemAdapter = new ItemAdapter(list);
        recyclerView.setAdapter(itemAdapter);
    }

    private void buildListData() {
        String[] arr = {"Akash", "Abhishek", "Amol", "Laxman", "Ram", "Shayam", "Lloyd", "Mukesh", "Rahul", "Prabhkar", "Vikash", "Malkeet", "Anita", "Akanksha", "Pooja", "Priyanka"};
        Collections.addAll(list, arr);
    }

    private void initViews(View view) {
        recyclerView = view.findViewById(R.id.recyclerView);
        list = new ArrayList<>();
    }
}