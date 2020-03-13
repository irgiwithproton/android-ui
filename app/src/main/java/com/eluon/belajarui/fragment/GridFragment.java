package com.eluon.belajarui.fragment;

import android.os.Bundle;
import android.transition.Fade;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.eluon.belajarui.R;
import com.eluon.belajarui.adapter.GridAdapter;
import com.eluon.belajarui.adapter.GridClickListener;
import com.eluon.belajarui.adapter.GridVewHolder;
import com.eluon.belajarui.transition.DetailsTransition;

//public class GridFragment extends Fragment implements GridClickListener{

//    @Nullable
//    @Override
//    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
//        View view = inflater.inflate(R.layout.dashboard_fragment, container, false);
//        return view;
//    }
//
//    @Override
//    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
//        super.onViewCreated(view, savedInstanceState);
//
//        RecyclerView recyclerView = view.findViewById(R.id.ini_recycle);
//        recyclerView.setAdapter(new GridAdapter(2, this));
//        recyclerView.setLayoutManager(new GridLayoutManager(getContext(), 2));
//    }
//
//
//    @Override
//    public void onGridClicked(GridVewHolder mHolder, int position) {
//        int gridNumber = (position % 6) + 1;
//
//        SharedOneFragment oneFragment = SharedOneFragment.newInstance(gridNumber);
//
//        oneFragment.setSharedElementEnterTransition(new DetailsTransition());
//        oneFragment.setEnterTransition(new Fade());
//        setExitTransition(new Fade());
//        oneFragment.setSharedElementReturnTransition(new DetailsTransition());
//
//        getActivity().getSupportFragmentManager()
//                .beginTransaction()
//                .addSharedElement(mHolder.imageView, "gridImage")
//                .replace(R.id.frameku, oneFragment)
//                .addToBackStack(null)
//                .commit();
//    }
//}
