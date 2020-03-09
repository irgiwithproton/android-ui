package com.eluon.belajarui.fragment;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import androidx.annotation.IntRange;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import com.eluon.belajarui.R;

public class SharedOneFragment extends Fragment {


    public static SharedOneFragment newInstance(){
        Bundle args = new Bundle();

        SharedOneFragment fragment = new SharedOneFragment();
        fragment.setArguments(args);

        return fragment;
    }

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        final View view = inflater.inflate(R.layout.shared_one_fragment, container, false);
        return view;
    }
}
