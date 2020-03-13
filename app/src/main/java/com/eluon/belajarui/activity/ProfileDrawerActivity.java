package com.eluon.belajarui.activity;

import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.widget.ConstraintLayout;

import android.os.Bundle;
import android.view.View;
import android.view.ViewGroupOverlay;
import android.view.ViewOverlay;

import com.eluon.belajarui.R;

public class ProfileDrawerActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_profile_drawer);

        ConstraintLayout wadah = findViewById(R.id.wadah);
        ViewGroupOverlay over = wadah.getOverlay();
        over.add(getApplicationContext().getResources().getDrawable(R.drawable.gambar));
    }
}
