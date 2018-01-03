package com.manu.movieconceptappjava;

import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

/**
 * Created by manu on 1/3/2018.
 */

public class CustomViewHolder extends RecyclerView.ViewHolder {

    public final TextView actorNameTV;
    public final TextView charNameTV;
    public final ImageView imageIV;


    public CustomViewHolder(View view) {
        super(view);
        actorNameTV =  view.findViewById(R.id.actorNameTV);
        charNameTV =  view.findViewById(R.id.charNameTV);
        imageIV = view.findViewById(R.id.imageView);


    }
}
