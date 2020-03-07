package com.example.homepc.restauranteatitapp;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;





public class MiamiFragment extends Fragment {
    DatabaseHelper mydb;

    public MiamiFragment() {
        // Required empty public constructor

    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment

        View view = inflater.inflate(R.layout.fragment_miami, container, false);              //need to change fragment
        this.mydb = new DatabaseHelper(getContext());
        ArrayList<MiamiClass> miamiItem = new ArrayList<MiamiClass>();                                     //remember to change drawables
        miamiItem.add(new MiamiClass("American Airlines\nArena", "$150", R.drawable.american_airlines_arena,"0"));
        miamiItem.add(new MiamiClass("Bayfront Park", "$550", R.drawable.bayfront_park,"0"));
        miamiItem.add(new MiamiClass("Miami Art\nDistrict", "$250", R.drawable.art_deco_district,"0"));
        miamiItem.add(new MiamiClass("Miami Seaquarium", "100 Rs", R.drawable.miami_seaquarium,"0"));
        miamiItem.add(new MiamiClass("Miami South\nBeach", "$100", R.drawable.south_beach,"0"));
        MiamiAdapter miamiAdapter = new MiamiAdapter(getActivity(),miamiItem);


        ListView listView = (ListView) view.findViewById(R.id.listview_miami);
        listView.setAdapter(miamiAdapter);



        return view;
    }





}