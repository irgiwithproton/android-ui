package com.eluon.belajarui.fragment;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import com.eluon.belajarui.R;

public class ZoomFragment extends Fragment {

    int status;
    ImageView imageView;

    public ZoomFragment(int status) {
        this.status = status;
    }

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        final View view = inflater.inflate(R.layout.fragment_zoom, container, false);

        imageView = view.findViewById(R.id.comp_zoom);

        if (status == 0){
            imageView.setImageResource(R.drawable.buku);
        }else if (status == 1){
            imageView.setImageResource(R.drawable.delete);
        }else if (status == 2){
            imageView.setImageResource(R.drawable.save);
        }else {
            imageView.setImageResource(R.drawable.update);
        }

        return view;
    }


}
