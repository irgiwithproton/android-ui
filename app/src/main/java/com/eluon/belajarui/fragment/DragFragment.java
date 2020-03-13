package com.eluon.belajarui.fragment;

import android.content.Context;
import android.os.Bundle;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.widget.ContentFrameLayout;
import androidx.fragment.app.Fragment;

import com.eluon.belajarui.R;
import com.hoanganhtuan95ptit.draggable.DraggablePanel;

import org.jetbrains.annotations.NotNull;

public class DragFragment extends Fragment {

    DraggablePanel draggablePanel;
    Button max, min, close;
    ImageView vClose, vPlay, vPause;

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        final View view = inflater.inflate(R.layout.fragment_drag, container, false);
        final View view2 = inflater.inflate(R.layout.drag_bottom, container, false);
        View view3 = inflater.inflate(R.layout.drag_top, container, false);

        draggablePanel = view.findViewById(R.id.draggablePanel);
        max = view.findViewById(R.id.custom_max);
        min = view.findViewById(R.id.custom_min);
        close = view.findViewById(R.id.custom_close);
        vClose = view.findViewById(R.id.ivClose);
        vPlay = view.findViewById(R.id.ivPlay);
        vPause = view.findViewById(R.id.ivPause);

        draggablePanel.setDraggableListener(new DraggablePanel.DraggableListener() {
            @Override
            public void onChangeState(@NotNull DraggablePanel.State state) {

            }

            @Override
            public void onChangePercent(float percent) {
                View alpha = view.findViewById(R.id.custom_for_view);
                View shadow = view2.findViewById(R.id.shadow);
                alpha.setAlpha((float)1 - percent);
                shadow.setAlpha(percent);
                Log.i("Percent", "nilainya: "+percent);
            }
        });

        vClose.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                draggablePanel.close();
                Log.i("infoClose", "Bisa");
                //Toast.makeText(getContext(), "Image Bisa", Toast.LENGTH_SHORT).show();
            }
        });

        vPlay.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });

        vPause.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                .
            }
        });

        getFragmentManager().beginTransaction().replace(R.id.frameTop, new TopFragment()).commit();
        getFragmentManager().beginTransaction().replace(R.id.frameBottom, new TopFragment()).commit();

        max.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                draggablePanel.maximize();
            }
        });

        min.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                draggablePanel.minimize();
            }
        });

        close.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                draggablePanel.close();
            }
        });

        return view;
    }
}
