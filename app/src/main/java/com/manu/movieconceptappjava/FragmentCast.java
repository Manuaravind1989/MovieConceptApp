package com.manu.movieconceptappjava;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.ArrayList;

/**
 * Created by manu on 1/3/2018.
 */

public class FragmentCast extends Fragment {

    private RecyclerView recyclerView;
    MyRecyclerAdapter myRecyclerAdapter;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_cast, container, false);


        recyclerView = view.findViewById(R.id.recyclerview);
        myRecyclerAdapter = new MyRecyclerAdapter(getActivity(), getListOfData());
        recyclerView.setHasFixedSize(true);
        RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(getActivity());
        recyclerView.setLayoutManager(layoutManager);
        recyclerView.setAdapter(myRecyclerAdapter);
        return view;
    }

    private ArrayList<CastModel> getListOfData() {
        ArrayList<CastModel> listofData = new ArrayList<>();
        listofData.add(new CastModel(R.drawable.ing, "Prabhas","Bahubali"));
        listofData.add(new CastModel(R.mipmap.balla, "Rana Daggubati","Hallaladeva"));
        listofData.add(new CastModel(R.mipmap.satya, "Sathyaraj","Kattappa"));
        listofData.add(new CastModel(R.mipmap.anushka, "Anushka Shetty","Devasena"));
        listofData.add(new CastModel(R.mipmap.remya, "Remya Krishanan","Sivagami"));
        listofData.add(new CastModel(R.mipmap.nassar, "Nassar","Bijjaladeva"));
        listofData.add(new CastModel(R.mipmap.tamanah, "Tamannah","Avantika"));

        return listofData;
    }

}









