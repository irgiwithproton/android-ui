package com.eluon.belajarui.fragment;

import android.os.Build;
import android.os.Bundle;
import android.transition.Fade;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewOverlay;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.app.ActionBarDrawerToggle;
import androidx.cardview.widget.CardView;
import androidx.fragment.app.Fragment;

import com.eluon.belajarui.R;
import com.eluon.belajarui.transition.BaruTransition;
import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.google.android.material.navigation.NavigationView;
import com.synnapps.carouselview.CarouselView;
import com.synnapps.carouselview.ImageListener;

public class BackDashboardFragment extends Fragment {

    ActionBarDrawerToggle toggle;
    NavigationView navigationView;
    FloatingActionButton floatingActionButton;
    Button toOverlay;
    ViewOverlay overlayActivity;
    CardView one, two, three;
    ImageView imgOne, imgTwo, imgThree;

    View vtwo;

    ZoomFragment fragment;

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable final Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.dashboard_fragment, container, false);

//        imgOne = view.findViewById(R.id.gambar_one);
//        imgTwo = view.findViewById(R.id.gambar_two);
//        imgThree = view.findViewById(R.id.gambar_three);
//
//        one = view.findViewById(R.id.profile_images1);
//        two = view.findViewById(R.id.profile_images2);
//        three = view.findViewById(R.id.profile_images3);

//        getActivity().getSupportFragmentManager()
//                .beginTransaction()
//                .replace(R.id.frameku, new SumberFragment())
//                .commit();

//        vtwo = inflater.inflate(R.layout.layout_view, container, false);

//        toOverlay = view.findViewById(R.id.to_overlay);
//        toOverlay.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
////                ViewGroupOverlay overlay = (ViewGroupOverlay) toOverlay.getOverlay();
////                overlayActivity = toOverlay.getOverlay();
////                overlayActivity.add(getResources().getDrawable(R.drawable.gambar));
////                overlay.add(vtwo);
//
//                Intent intent = new Intent(getActivity(), OverlayActivity.class);
//                startActivity(intent);
//            }
//        });

        // overlay
//        final Drawable image = ResourcesCompat.getDrawable(getResources(), R.drawable.ic_dashboard_black_24dp, null);
//        overlayActivity = toOverlay.getOverlay();
//        toOverlay.post(new Runnable() {
//            @Override
//            public void run() {
//                overlayActivity.add(image);
//            }
//        });

//        ImageView forFullScreen = view.findViewById(R.id.potrait_img);
//        forFullScreen.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                Intent intent = new Intent(getActivity(), ViewImagesActivity.class);
//                startActivity(intent);
//            }
//        });

//        getActivity().getSupportFragmentManager()
//                .beginTransaction()
//                .add(R.id.frameku, new GridFragment())
//                .commit();

//        one.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                SharedOneFragment onFrag = SharedOneFragment.newInstance();
//
////                onFrag.setSharedElementEnterTransition(TransitionInflater.from(getContext()).inflateTransition(R.transition.explode));
////                onFrag.setEnterTransition(TransitionInflater.from(getContext()).inflateTransition(R.transition.explode));
//                setExitTransition(TransitionInflater.from(getContext()).inflateTransition(R.transition.change_image_transform));
//                onFrag.setSharedElementReturnTransition(TransitionInflater.from(getContext()).inflateTransition(R.transition.change_image_transform));
//
//                getActivity().getSupportFragmentManager()
//                        .beginTransaction()
//                        .addSharedElement(imgOne, ViewCompat.getTransitionName(imgOne))
//                        .replace(R.id.for_contrainer, onFrag)
//                        .addToBackStack(null)
//                        .commit();
//            }
//        });

//        two.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                SharedTwoFragment onFragTwo = SharedTwoFragment.newInstance();
//
//                if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.LOLLIPOP) {
//                    onFragTwo.setSharedElementEnterTransition(new DetailsTransition());
//                    onFragTwo.setEnterTransition(new DetailsTransition());
//                    setExitTransition(new DetailsTransition());
//                    onFragTwo.setSharedElementReturnTransition(new DetailsTransition());
//                }
//
////                onFragTwo.setSharedElementEnterTransition(TransitionInflater.from(getContext()).inflateTransition(R.transition.change_image_transform));
////                onFragTwo.setEnterTransition(TransitionInflater.from(getContext()).inflateTransition(R.transition.change_image_transform));
////                setExitTransition(TransitionInflater.from(getContext()).inflateTransition(R.transition.change_image_transform));
////                onFragTwo.setSharedElementReturnTransition(TransitionInflater.from(getContext()).inflateTransition(R.transition.change_image_transform));
//
//                getActivity().getSupportFragmentManager()
//                        .beginTransaction()
////                        .addSharedElement(imgTwo, "delete_trans")
//                        .addSharedElement(imgTwo, ViewCompat.getTransitionName(imgTwo))
//                        .replace(R.id.for_contrainer, onFragTwo)
//                        .addToBackStack(null)
//                        .commit();
//            }
//        });
//
//        three.setOnClickListener(new View.OnClickListener() {
//            @RequiresApi(api = Build.VERSION_CODES.LOLLIPOP)
//            @Override
//            public void onClick(View v) {
//                Intent intent = new Intent(getActivity(), SharedThreeActivity.class);
//                ActivityOptions options = null;
////                if (android.os.Build.VERSION.SDK_INT >= android.os.Build.VERSION_CODES.LOLLIPOP) {
//                    options = ActivityOptions.makeSceneTransitionAnimation(getActivity(), imgThree, ViewCompat.getTransitionName(imgThree));
////                }
//                getActivity().startActivity(intent, options.toBundle());
//            }
//        });

//        CollapsingToolbarLayout collapsingToolbarLayout = view.findViewById(R.id.collap_layout);
//        collapsingToolbarLayout.setTitle("Ini Toolbar");

//        final ImageView imageView = view.findViewById(R.id.backdrop);
//        Glide.with(getActivity()).load(R.drawable.header_slide).apply(RequestOptions.centerCropTransform()).into(imageView);

//        floatingActionButton = view.findViewById(R.id.float_btn);
//        floatingActionButton.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                Snackbar.make(v, "Ini snackbar", Snackbar.LENGTH_LONG)
//                        .setAction("Action", null).show();


//            }
//        });

        // reff https://github.com/sayyam/carouselview
        final CarouselView carouselView;
        final int[] sImages = {R.drawable.buku, R.drawable.delete, R.drawable.save};

        carouselView = view.findViewById(R.id.carouselView);
        carouselView.setPageCount(sImages.length);

        fragment = new ZoomFragment(0);

        ImageListener imgListener = new ImageListener(){

            @Override
            public void setImageForPosition(final int position, final ImageView imageView) {
                imageView.setImageResource(sImages[position]);
                imageView.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        if  (sImages[position] == R.drawable.buku){
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
                            Toast.makeText(getActivity(), "Delete", Toast.LENGTH_SHORT).show();
                        }else {
                            Toast.makeText(getActivity(), "Save", Toast.LENGTH_SHORT).show();
                        }
                    }
                });
            }
        };
        carouselView.setImageListener(imgListener);


//        getActivity().getSupportFragmentManager()
//            .beginTransaction()
//            .add(R.id.frame_bos, new LanjutanFragment())
//            .commit();

        return view;
    }
}
