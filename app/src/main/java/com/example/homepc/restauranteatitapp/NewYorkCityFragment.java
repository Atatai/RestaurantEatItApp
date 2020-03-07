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





public class NewYorkCityFragment extends Fragment {
    DatabaseHelper mydb;

    public NewYorkCityFragment() {
        // Required empty public constructor

    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment

        View view = inflater.inflate(R.layout.fragment_new_york_city, container, false);              //need to change fragment
        this.mydb = new DatabaseHelper(getContext());
        ArrayList<NewYorkCityClass> nycItem = new ArrayList<NewYorkCityClass>();                                     //remember to change drawables
        nycItem.add(new NewYorkCityClass("Statue of\nLiberty", "$150", R.drawable.statue_liberty,"0"));
        nycItem.add(new NewYorkCityClass("Grand Central\nTerminal", "$550", R.drawable.grand_central_terminal,"0"));
        nycItem.add(new NewYorkCityClass("St. Patrick's\nCathedral", "$250", R.drawable.st_patricks_cathedral,"0"));
        nycItem.add(new NewYorkCityClass("Yankee Stadium", "100 Rs", R.drawable.yankee_stadium,"0"));
        nycItem.add(new NewYorkCityClass("One World\nTrade Center", "$100", R.drawable.trade_center,"0"));
        NewYorkCityAdapter newYorkCityAdapter = new NewYorkCityAdapter(getActivity(),nycItem);


        ListView listView = (ListView) view.findViewById(R.id.listview_new_york_city);
        listView.setAdapter(newYorkCityAdapter);



        return view;
    }





}
