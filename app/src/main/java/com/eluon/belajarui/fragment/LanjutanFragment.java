package com.eluon.belajarui.fragment;

import android.os.Build;
import android.os.Bundle;
import android.transition.Fade;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import com.eluon.belajarui.R;
import com.eluon.belajarui.transition.BaruTransition;
import com.synnapps.carouselview.CarouselView;
import com.synnapps.carouselview.ImageListener;

public class LanjutanFragment extends Fragment {

    CarouselView carouselView;
    int[] img = {R.drawable.buku, R.drawable.delete, R.drawable.save};
    ZoomFragment fragment;

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        final View view = inflater.inflate(R.layout.fragment_lanjutan, container, false);

        fragment = new ZoomFragment(0);

        carouselView = view.findViewById(R.id.cv);
        carouselView.setPageCount(img.length);
        carouselView.setImageListener(new ImageListener() {
            @Override
            public void setImageForPosition(final int position, ImageView imageView) {
                imageView.setImageResource(img[position]);
                imageView.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
//                        if (img[position] == R.drawable.buku){
//                            if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.LOLLIPOP) {
//                                fragment.setSharedElementEnterTransition(new BaruTransition());
//                                fragment.setEnterTransition(new android.transition.Fade());
//                                setExitTransition(new android.transition.Fade());
//                                fragment.setSharedElementReturnTransition(new BaruTransition());
//                            }
//
//                            if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.LOLLIPOP) {
//                                getActivity().getSupportFragmentManager()
//                                    .beginTransaction()
//                                    .addSharedElement(carouselView, carouselView.getTransitionName())
//                                    .replace(R.id.frame_bos, fragment)
//                                    .addToBackStack(null)
//                                    .commit();
//                            }
//                            Toast.makeText(getActivity(), "Buku", Toast.LENGTH_SHORT).show();
//                        }else if (img[position] == R.drawable.delete){
//                            Toast.makeText(getActivity(), "Delete", Toast.LENGTH_SHORT).show();
//                        }else {
//                            Toast.makeText(getActivity(), "Save", Toast.LENGTH_SHORT).show();
//                        }
                    }
                });
            }
        });

        return view;
    }
}
