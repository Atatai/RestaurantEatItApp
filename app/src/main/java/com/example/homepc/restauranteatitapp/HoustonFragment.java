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





public class HoustonFragment extends Fragment {
    DatabaseHelper mydb;

    public HoustonFragment() {
        // Required empty public constructor

    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment

        View view = inflater.inflate(R.layout.fragment_houston, container, false);
        this.mydb = new DatabaseHelper(getContext());
        ArrayList<HoustonClass> houstonItem = new ArrayList<HoustonClass>();                                     //remember to change drawables
        houstonItem.add(new HoustonClass("Houston Space\nCenter", "$150", R.drawable.space_center, "0"));
        houstonItem.add(new HoustonClass("Hermann Square", "$550", R.drawable.hermann_square, "0"));
        houstonItem.add(new HoustonClass("Hotel Zaza", "$250", R.drawable.hotel_zaza, "0"));
        houstonItem.add(new HoustonClass("The Houston\nZoo", "100 Rs", R.drawable.houston_zoo, "0"));
        houstonItem.add(new HoustonClass("San Jacinto\nMonument", "$100", R.drawable.san_jacinto, "0"));
        HoustonAdapter houstonAdapter = new HoustonAdapter(getActivity(), houstonItem);


        ListView listView = (ListView) view.findViewById(R.id.listview_houston);
        listView.setAdapter(houstonAdapter);


        return view;
    }


}
