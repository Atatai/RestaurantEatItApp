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





public class LouisvilleFragment extends Fragment {
    DatabaseHelper mydb;

    public LouisvilleFragment() {
        // Required empty public constructor

    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment

        View view = inflater.inflate(R.layout.fragment_louisville, container, false);
        this.mydb = new DatabaseHelper(getContext());
        ArrayList<LouisvilleClass> louisvilleItem = new ArrayList<LouisvilleClass>();                                     //remember to change drawables
        louisvilleItem.add(new LouisvilleClass("Franfort Trolley", "$150", R.drawable.frankfort_trolley, "0"));
        louisvilleItem.add(new LouisvilleClass("The Muhammad\nAli Center", "$550", R.drawable.muhammad_ali_center, "0"));
        louisvilleItem.add(new LouisvilleClass("The Old 502\nWinery", "$250", R.drawable.old_502_winery, "0"));
        louisvilleItem.add(new LouisvilleClass("Fairmount Falls", "100 Rs", R.drawable.fairmount_falls, "0"));
        louisvilleItem.add(new LouisvilleClass("The Howard\nSteamboat Museum", "$100", R.drawable.howard_steamboat_museum, "0"));
        LouisvilleAdapter louisvilleAdapter = new LouisvilleAdapter(getActivity(), louisvilleItem);


        ListView listView = (ListView) view.findViewById(R.id.listview_louisville);
        listView.setAdapter(louisvilleAdapter);


        return view;
    }


}
