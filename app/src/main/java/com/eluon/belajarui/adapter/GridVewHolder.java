package com.eluon.belajarui.adapter;

import android.view.View;
import android.widget.ImageView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.eluon.belajarui.R;

public class GridVewHolder extends RecyclerView.ViewHolder {
    public ImageView imageView;

    public GridVewHolder(View itemView) {
        super(itemView);
        imageView = itemView.findViewById(R.id.grid_details);
    }
}
