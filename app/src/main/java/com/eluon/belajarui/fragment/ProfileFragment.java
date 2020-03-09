package com.eluon.belajarui.fragment;

import android.content.Context;
import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.drawable.BitmapDrawable;
import android.os.Build;
import android.os.Bundle;
import android.transition.Fade;
import android.view.Gravity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.PopupWindow;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.widget.NestedScrollView;
import androidx.fragment.app.Fragment;
import androidx.palette.graphics.Palette;
import androidx.viewpager.widget.ViewPager;

import com.eluon.belajarui.R;
import com.eluon.belajarui.transition.BaruTransition;
import com.synnapps.carouselview.CarouselView;
import com.synnapps.carouselview.ImageListener;

public class ProfileFragment extends Fragment {

    ZoomFragment fragment;
    CarouselView carouselView;
    NestedScrollView profileku;

    int[] sImages = {R.drawable.gambar_a, R.drawable.gambar_b, R.drawable.gambar_c};

    @Nullable
    @Override
    public View onCreateView(@NonNull final LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.profile_fragment, container, false);

        carouselView = view.findViewById(R.id.aww);
        profileku = view.findViewById(R.id.profilemain);

        carouselView.setPageCount(sImages.length);

        carouselView.setImageListener(new ImageListener() {
            @Override
            public void setImageForPosition(final int position, ImageView imageView) {
                imageView.setImageResource(sImages[position]);

                //onclick
                imageView.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {

                        if (sImages[position] == R.drawable.buku){
                            fragment = new ZoomFragment(0);
                            if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.LOLLIPOP) {
                                fragment.setSharedElementEnterTransition(new BaruTransition());
                                fragment.setEnterTransition(new Fade());
                                setExitTransition(new Fade());
                                fragment.setSharedElementReturnTransition(new BaruTransition());
                            }

                            if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.LOLLIPOP) {
                                getActivity().getSupportFragmentManager()
                                        .beginTransaction()
                                        .addSharedElement(carouselView, carouselView.getTransitionName())
                                        .replace(R.id.for_contrainer, fragment)
                                        .addToBackStack(null)
                                        .commit();
                            }
                        }else if (sImages[position] == R.drawable.delete){
                            fragment = new ZoomFragment(1);
                            if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.LOLLIPOP) {
                                fragment.setSharedElementEnterTransition(new BaruTransition());
                                fragment.setEnterTransition(new Fade());
                                setExitTransition(new Fade());
                                fragment.setSharedElementReturnTransition(new BaruTransition());
                            }

                            if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.LOLLIPOP) {
                                getActivity().getSupportFragmentManager()
                                        .beginTransaction()
                                        .addSharedElement(carouselView, carouselView.getTransitionName())
                                        .replace(R.id.for_contrainer, fragment)
                                        .addToBackStack(null)
                                        .commit();
                            }
                        }else if (sImages[position] == R.drawable.save){
                            fragment = new ZoomFragment(2);
                            if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.LOLLIPOP) {
                                fragment.setSharedElementEnterTransition(new BaruTransition());
                                fragment.setEnterTransition(new Fade());
                                setExitTransition(new Fade());
                                fragment.setSharedElementReturnTransition(new BaruTransition());
                            }

                            if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.LOLLIPOP) {
                                getActivity().getSupportFragmentManager()
                                        .beginTransaction()
                                        .addSharedElement(carouselView, carouselView.getTransitionName())
                                        .replace(R.id.for_contrainer, fragment)
                                        .addToBackStack(null)
                                        .commit();
                            }
                        }else {
                            fragment = new ZoomFragment(3);
                            if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.LOLLIPOP) {
                                fragment.setSharedElementEnterTransition(new BaruTransition());
                                fragment.setEnterTransition(new Fade());
                                setExitTransition(new Fade());
                                fragment.setSharedElementReturnTransition(new BaruTransition());
                            }

                            if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.LOLLIPOP) {
                                getActivity().getSupportFragmentManager()
                                        .beginTransaction()
                                        .addSharedElement(carouselView, carouselView.getTransitionName())
                                        .replace(R.id.for_contrainer, fragment)
                                        .addToBackStack(null)
                                        .commit();
                            }
                        }
                    }
                });
            }
        });
        carouselView.addOnPageChangeListener(new ViewPager.OnPageChangeListener() {
            @Override
            public void onPageScrolled(int position, float positionOffset, int positionOffsetPixels) {
                //pallete

                Bitmap bitmap = BitmapFactory.decodeResource(getResources(), sImages[position]);
                Palette.from(bitmap).generate(new Palette.PaletteAsyncListener() {
                    @Override
                    public void onGenerated(@Nullable Palette palette) {
                        if  (palette != null){
                            //profileku.setBackgroundColor(palette.getVibrantColor(R.attr.colorPrimary));
                            //profileku.setBackgroundColor(palette.getMutedSwatch().getRgb());
                            //profileku.setBackgroundColor(palette.getDominantColor(R.attr.colorPrimary));
                            profileku.setBackgroundColor(palette.getLightVibrantColor(R.attr.colorPrimary));
                        }else {
                            Toast.makeText(getActivity(), "Color not found", Toast.LENGTH_SHORT).show();
                        }
                    }
                });
            }

            @Override
            public void onPageSelected(int position) {

            }

            @Override
            public void onPageScrollStateChanged(int state) {

            }
        });

        return view;
    }
}
