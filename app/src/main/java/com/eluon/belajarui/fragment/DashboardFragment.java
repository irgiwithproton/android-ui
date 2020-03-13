package com.eluon.belajarui.fragment;

import android.os.Build;
import android.os.Bundle;
import android.transition.Fade;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import com.eluon.belajarui.R;
import com.eluon.belajarui.transition.BaruTransition;
import com.synnapps.carouselview.CarouselView;
import com.synnapps.carouselview.ImageListener;

public class DashboardFragment extends Fragment {

    ZoomFragment fragment;
    CarouselView carouselView;
    int[] sImages = {R.drawable.buku, R.drawable.delete, R.drawable.save, R.drawable.update};

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable final Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.dashboard_fragment, container, false);

        // reff https://github.com/sayyam/carouselview

//        carouselView = view.findViewById(R.id.carouselView);
//        carouselView.setPageCount(sImages.length);
//
//        carouselView.setImageListener(new ImageListener() {
//            @Override
//            public void setImageForPosition(final int position, ImageView imageView) {
//                imageView.setImageResource(sImages[position]);
//                imageView.setOnClickListener(new View.OnClickListener() {
//                    @Override
//                    public void onClick(View v) {
//
//                        if (sImages[position] == R.drawable.buku){
//                            fragment = new ZoomFragment(0);
//                            if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.LOLLIPOP) {
//                                fragment.setSharedElementEnterTransition(new BaruTransition());
//                                fragment.setEnterTransition(new Fade());
//                                setExitTransition(new Fade());
//                                fragment.setSharedElementReturnTransition(new BaruTransition());
//                            }
//
//                            if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.LOLLIPOP) {
//                                getActivity().getSupportFragmentManager()
//                                        .beginTransaction()
//                                        .addSharedElement(carouselView, carouselView.getTransitionName())
//                                        .replace(R.id.for_contrainer, fragment)
//                                        .addToBackStack(null)
//                                        .commit();
//                            }
//                        }else if (sImages[position] == R.drawable.delete){
//                            fragment = new ZoomFragment(1);
//                            if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.LOLLIPOP) {
//                                fragment.setSharedElementEnterTransition(new BaruTransition());
//                                fragment.setEnterTransition(new Fade());
//                                setExitTransition(new Fade());
//                                fragment.setSharedElementReturnTransition(new BaruTransition());
//                            }
//
//                            if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.LOLLIPOP) {
//                                getActivity().getSupportFragmentManager()
//                                        .beginTransaction()
//                                        .addSharedElement(carouselView, carouselView.getTransitionName())
//                                        .replace(R.id.for_contrainer, fragment)
//                                        .addToBackStack(null)
//                                        .commit();
//                            }
//                        }else if (sImages[position] == R.drawable.save){
//                            fragment = new ZoomFragment(2);
//                            if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.LOLLIPOP) {
//                                fragment.setSharedElementEnterTransition(new BaruTransition());
//                                fragment.setEnterTransition(new Fade());
//                                setExitTransition(new Fade());
//                                fragment.setSharedElementReturnTransition(new BaruTransition());
//                            }
//
//                            if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.LOLLIPOP) {
//                                getActivity().getSupportFragmentManager()
//                                        .beginTransaction()
//                                        .addSharedElement(carouselView, carouselView.getTransitionName())
//                                        .replace(R.id.for_contrainer, fragment)
//                                        .addToBackStack(null)
//                                        .commit();
//                            }
//                        }else {
//                            fragment = new ZoomFragment(3);
//                            if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.LOLLIPOP) {
//                                fragment.setSharedElementEnterTransition(new BaruTransition());
//                                fragment.setEnterTransition(new Fade());
//                                setExitTransition(new Fade());
//                                fragment.setSharedElementReturnTransition(new BaruTransition());
//                            }
//
//                            if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.LOLLIPOP) {
//                                getActivity().getSupportFragmentManager()
//                                        .beginTransaction()
//                                        .addSharedElement(carouselView, carouselView.getTransitionName())
//                                        .replace(R.id.for_contrainer, fragment)
//                                        .addToBackStack(null)
//                                        .commit();
//                            }
//                        }
//                    }
//                });
//            }
//        });

        return view;
    }
}
