package com.eluon.belajarui.activity;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.media.MediaPlayer;
import android.net.Uri;
import android.os.Bundle;
import android.view.ViewGroup;
import android.view.ViewGroupOverlay;
import android.widget.MediaController;
import android.widget.ProgressBar;
import android.widget.Toast;
import android.widget.VideoView;

import com.eluon.belajarui.R;

public class OverlayActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_overlay);

        int warna = R.color.colorAccent;

        ViewGroup parent  = (ViewGroup) OverlayActivity.this.getWindow().getDecorView().getRootView();
        @SuppressLint("ResourceAsColor") Drawable dim = new ColorDrawable(warna);
        dim.setBounds(0, 0, parent.getWidth(), parent.getHeight());
        ViewGroupOverlay overlay = parent.getOverlay();
        overlay.add(dim);
    }
}
