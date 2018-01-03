package com.manu.movieconceptappjava;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by manu on 1/3/2018.
 */

public class MyRecyclerAdapter extends RecyclerView.Adapter<CustomViewHolder> {

    private List<CastModel> mValues = new ArrayList<>();
    private Context context;

    public MyRecyclerAdapter(Context context, List<CastModel> mValues){
        this.mValues = mValues;
        this.context=context;
    }

    @Override
    public CustomViewHolder onCreateViewHolder(ViewGroup parent, final int viewType){
        View view= LayoutInflater.from(parent.getContext()).inflate(R.layout.recycler_row,parent,false);
        return new CustomViewHolder(view);
    }

    @Override
    public void onBindViewHolder(final CustomViewHolder holder,final int position){
        holder.actorNameTV.setText(mValues.get(position).getActorName());
        holder.charNameTV.setText(mValues.get(position).getCharName());
        holder.imageIV.setImageResource(mValues.get(position).getImageName());

    }

    @Override
    public int getItemCount(){
        return mValues.size();
    }

}