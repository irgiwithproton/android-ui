package com.eluon.belajarui.fragment;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import com.eluon.belajarui.R;

public class SharedTwoFragment extends Fragment {

    public static SharedTwoFragment newInstance(){
        Bundle args = new Bundle();

        SharedTwoFragment fragment = new SharedTwoFragment();
        fragment.setArguments(args);

        return fragment;
    }

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        final View view = inflater.inflate(R.layout.shared_two_fragment, container, false);
        return view;
    }
}
