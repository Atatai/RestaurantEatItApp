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





public class ChicagoFragment extends Fragment {
    DatabaseHelper mydb;

    public ChicagoFragment() {
        // Required empty public constructor

    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment

        View view = inflater.inflate(R.layout.fragment_chicago, container, false);
        this.mydb = new DatabaseHelper(getContext());
        ArrayList<ChicagoClass> chicagoItem = new ArrayList<ChicagoClass>();                                     //remember to change drawables
        chicagoItem.add(new ChicagoClass("Cloud Gate", "$150", R.drawable.cloud_gate, "0"));
        chicagoItem.add(new ChicagoClass("The Art Institute\nof Chicago", "$550", R.drawable.art_institute_chicago, "0"));
        chicagoItem.add(new ChicagoClass("The Buckingham\nFountain", "$250", R.drawable.buckingham_fountain, "0"));
        chicagoItem.add(new ChicagoClass("Jackson Park", "100 Rs", R.drawable.jackson_park, "0"));
        chicagoItem.add(new ChicagoClass("Tribune Tower", "$100", R.drawable.tribune_tower, "0"));
        ChicagoAdapter chicagoAdapter = new ChicagoAdapter(getActivity(), chicagoItem);


        ListView listView = (ListView) view.findViewById(R.id.listview_chicago);
        listView.setAdapter(chicagoAdapter);


        return view;
    }


}
