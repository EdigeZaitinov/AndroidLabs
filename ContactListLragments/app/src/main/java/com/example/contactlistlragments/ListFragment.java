package com.example.contactlistlragments;

import android.os.Bundle;

import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;


public class ListFragment extends Fragment {
    RecyclerView recyclerView;
    RecyclerView.Adapter myAdapter;
    RecyclerView.LayoutManager layoutManager;
    View view;
    public ListFragment() {
        // Required empty public constructor
    }

    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
       view=inflater.inflate(R.layout.fragment_list, container, false);
        return view;
    }

    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
        recyclerView=view.findViewById(R.id.listFrag);
        recyclerView.setHasFixedSize(true);
        layoutManager=new LinearLayoutManager(this.getActivity());
        recyclerView.setLayoutManager(layoutManager);
        myAdapter=new ContactAdapter(this.getActivity(),ContactBase.people);
        recyclerView.setAdapter(myAdapter);
    }
}
