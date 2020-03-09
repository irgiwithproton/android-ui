package com.eluon.belajarui.adapter;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.core.view.ViewCompat;
import androidx.recyclerview.widget.RecyclerView;

import com.eluon.belajarui.R;

public class GridAdapter extends RecyclerView.Adapter<GridVewHolder> {

    int mSize;
    GridClickListener listener;

    public GridAdapter(int mSize, GridClickListener listener) {
        this.mSize = mSize;
        this.listener = listener;
    }

    @NonNull
    @Override
    public GridVewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater inflater = LayoutInflater.from(parent.getContext());
        View cell = inflater.inflate(R.layout.grid_item, parent, false);
        return new GridVewHolder(cell);
    }

    @Override
    public void onBindViewHolder(@NonNull final GridVewHolder holder, final int position) {
        switch (position % 2){
            case 0:
                holder.imageView.setImageResource(R.drawable.buku);
                break;
            case 1:
                holder.imageView.setImageResource(R.drawable.delete);
                break;
        }

        ViewCompat.setTransitionName(holder.imageView, String.valueOf(position)+"_image");

        holder.imageView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                listener.onGridClicked(holder, position);
            }
        });
    }

    @Override
    public int getItemCount() {
        return mSize;
    }
}
