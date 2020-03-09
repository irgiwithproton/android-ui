package com.eluon.belajarui.shared;

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

public class DariFragment extends Fragment {

    ImageView buku, save, delete;

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_dari, container, false);

        final KeFragment keFragment = new KeFragment();
        final KeDuaFragment keDuaFragment = new KeDuaFragment();
        final KeTigaFragment keTigaFragment = new KeTigaFragment();

        buku = view.findViewById(R.id.gambar_satu);
        save = view.findViewById(R.id.gambar_dua);
        delete = view.findViewById(R.id.gambar_tiga);

        buku.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.LOLLIPOP){
                    keFragment.setSharedElementEnterTransition(new BaruTransition());
                    keFragment.setEnterTransition(new Fade());
                    setExitTransition(new Fade());
                    keFragment.setSharedElementReturnTransition(new BaruTransition());
                }

                if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.LOLLIPOP) {
//                    getActivity().getSupportFragmentManager()
//                            .beginTransaction()
//                            .addSharedElement(buku, buku.getTransitionName())
//                            .replace(R.id.frameku, keFragment)
//                            .addToBackStack(null)
//                            .commit();
                }
            }
        });

//        save.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.LOLLIPOP){
//                    keFragment.setSharedElementEnterTransition(new BaruTransition());
//                    keFragment.setEnterTransition(new Fade());
//                    setExitTransition(new Fade());
//                    keFragment.setSharedElementReturnTransition(new BaruTransition());
//                }
//
//                if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.LOLLIPOP) {
//                    getActivity().getSupportFragmentManager()
//                            .beginTransaction()
//                            .addSharedElement(save, save.getTransitionName())
//                            .replace(R.id.frameku, keFragment)
//                            .addToBackStack(null)
//                            .commit();
//                }
//            }
//        });

//        delete.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.LOLLIPOP){
//                    keFragment.setSharedElementEnterTransition(new BaruTransition());
//                    keFragment.setEnterTransition(new Fade());
//                    setExitTransition(new Fade());
//                    keFragment.setSharedElementReturnTransition(new BaruTransition());
//                }
//
//                if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.LOLLIPOP) {
//                    getActivity().getSupportFragmentManager()
//                            .beginTransaction()
//                            .addSharedElement(delete, delete.getTransitionName())
//                            .replace(R.id.frameku, keFragment)
//                            .addToBackStack(null)
//                            .commit();
//                }
//            }
//        });

        return view;
    }
}
