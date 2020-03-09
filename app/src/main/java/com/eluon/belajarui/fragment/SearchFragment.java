package com.eluon.belajarui.fragment;

import android.annotation.SuppressLint;
import android.graphics.drawable.Drawable;
import android.media.MediaPlayer;
import android.net.Uri;
import android.os.Bundle;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import android.view.animation.ScaleAnimation;
import android.widget.ImageButton;
import android.widget.LinearLayout;
import android.widget.MediaController;
import android.widget.ProgressBar;
import android.widget.RelativeLayout;
import android.widget.TextView;
import android.widget.Toast;
import android.widget.VideoView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.core.view.MotionEventCompat;
import androidx.fragment.app.Fragment;

import com.eluon.belajarui.R;
import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.sothree.slidinguppanel.SlidingUpPanelLayout;

public class SearchFragment extends Fragment {

    SlidingUpPanelLayout sliding;
    RelativeLayout layout;
    FloatingActionButton floatingActionButton;
    ImageButton closeButton, playButton;
    LinearLayout dragView;
    VideoView kecil, besar;
    ProgressBar loadKecil, loadGede;
    TextView ini;

    boolean statusView = true;
    String path = "https://www.ebookfrenzy.com/android_book/movie.mp4";
    int playIcon = R.drawable.ic_play_arrow_black_24dp;
    int pauseIcon = R.drawable.ic_pause_black_24dp;
    private boolean play = false;

    @Nullable
    @Override
    public View onCreateView(@NonNull final LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.search_fragment, container, false);

        sliding = view.findViewById(R.id.sliding_layout);
        layout = view.findViewById(R.id.kecil);
        floatingActionButton = view.findViewById(R.id.floatt);
        closeButton = view.findViewById(R.id.close_kecil);
        playButton = view.findViewById(R.id.follow);
        dragView = view.findViewById(R.id.dragViewLayout);
        kecil = view.findViewById(R.id.gmb_kecil);
        besar = view.findViewById(R.id.gmb_gede);
        loadKecil = view.findViewById(R.id.load_kecil);
        loadGede = view.findViewById(R.id.load_gede);
        ini = view.findViewById(R.id.main);

        //for video

        MediaController mediaController = new MediaController(getActivity());
        //mediaController.setAnchorView(besar);

        //besar.setMediaController(mediaController);
        //besar.requestFocus();

        besar.setVideoURI(Uri.parse(path));
        kecil.setVideoURI(Uri.parse(path));

        playButton.setEnabled(false);
        playButton.setImageResource(playIcon);

        besar.setOnPreparedListener(new MediaPlayer.OnPreparedListener() {
            @Override
            public void onPrepared(MediaPlayer mp) {
                //besar.start();
                //kecil.start();

                loadGede.setVisibility(View.GONE);
                loadKecil.setVisibility(View.GONE);
                playButton.setEnabled(true);
                besar.setEnabled(true);
            }
        });

        playButton.setImageResource(playIcon);
        playButton.setEnabled(false);

        besar.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
            @Override
            public void onCompletion(MediaPlayer mp) {
                if (play){
                    /*besar.stopPlayback();
                    kecil.stopPlayback();*/
                    play = false;
                    playButton.setImageResource(playIcon);
                }
            }
        });

        playButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (play){
                    play = false;
                    playButton.setImageResource(playIcon);
                    besar.pause();
                    kecil.pause();
                    System.out.println("Play");
                    ini.setText("Lagi Pause");
                }else {
                    play = true;
                    playButton.setImageResource(pauseIcon);
                    besar.start();
                    kecil.start();
                    System.out.println("Pause");
                    ini.setText("Lagi Start");
                }
            }
        });

        //hide and show minimaze

        closeButton.setOnClickListener(new View.OnClickListener() {
            @SuppressLint("RestrictedApi")
            @Override
            public void onClick(View v) {
                dragView.setVisibility(View.GONE);
                floatingActionButton.setVisibility(View.VISIBLE);
                besar.pause();
                kecil.pause();
                play = false;
                playButton.setImageResource(playIcon);
            }
        });

        floatingActionButton.setOnClickListener(new View.OnClickListener() {
            @SuppressLint("RestrictedApi")
            @Override
            public void onClick(View v) {
                floatingActionButton.setVisibility(View.GONE);
                dragView.setVisibility(View.VISIBLE);
            }
        });

        layout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (sliding.getPanelState() != SlidingUpPanelLayout.PanelState.EXPANDED){
                    sliding.setPanelState(SlidingUpPanelLayout.PanelState.EXPANDED);
                }
            }
        });

        layout.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View v, MotionEvent event) {
                int action = MotionEventCompat.getActionMasked(event);

                if (sliding.getPanelState() != SlidingUpPanelLayout.PanelState.EXPANDED){
                    switch (action){
                        case (MotionEvent.ACTION_UP):
                            sliding.setPanelState(SlidingUpPanelLayout.PanelState.EXPANDED);
                            return true;
                        default:
                            return false;
                    }
                }else {
                    return false;
                }
            }
        });

        sliding.setPanelState(SlidingUpPanelLayout.PanelState.EXPANDED);
        sliding.addPanelSlideListener(new SlidingUpPanelLayout.PanelSlideListener() {
            @Override
            public void onPanelSlide(View panel, float slideOffset) {
                Log.i("Result", "Panel offset");
            }

            @Override
            public void onPanelStateChanged(View panel, SlidingUpPanelLayout.PanelState previousState, SlidingUpPanelLayout.PanelState newState) {
                if  (newState == SlidingUpPanelLayout.PanelState.EXPANDED){
                    final Animation animation = new ScaleAnimation(
                            1f, 1f,
                            0.0f, 1.0f,
                            Animation.RELATIVE_TO_SELF, 0f,
                            Animation.RELATIVE_TO_SELF, 1f);
                    animation.setFillAfter(true);
                    animation.setDuration(500);
                    layout.startAnimation(animation);
                    layout.setVisibility(View.GONE);
                }else{
                    layout.setVisibility(View.VISIBLE);
                }
                Log.i("Result", "Panel state Change");
            }
        });

        if (sliding != null &&
                sliding.getPanelState() == SlidingUpPanelLayout.PanelState.EXPANDED ||
                sliding.getPanelState() == SlidingUpPanelLayout.PanelState.ANCHORED) {

            layout.setVisibility(View.GONE);

        }else{

            layout.setVisibility(View.VISIBLE);

        }

        return view;
    }


}
