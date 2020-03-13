package com.eluon.belajarui.sharedku;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.app.ActivityOptions;
import android.app.Dialog;
import android.content.Intent;
import android.graphics.Color;
import android.graphics.Point;
import android.graphics.Rect;
import android.graphics.drawable.ColorDrawable;
import android.os.Build;
import android.os.Bundle;
import android.transition.Fade;
import android.transition.TransitionSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.DecelerateInterpolator;
import android.widget.ImageView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import com.eluon.belajarui.MainActivity;
import com.eluon.belajarui.R;
import com.eluon.belajarui.activity.PopUpKuActivity;
import com.eluon.belajarui.transition.BaruTransition;

public class SumberFragment extends Fragment {

    ImageView satu, dua, tiga;
    BukuFragment bukuFragment;
    SaveFragment saveFragment;
    DeleteFragment deleteFragment;
    Dialog dialog;
    private Animator currentAnimator;
    private int shortAnimationDuration;

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable final Bundle savedInstanceState) {
        final View view = inflater.inflate(R.layout.fragment_sumber, container, false);

        bukuFragment = new BukuFragment();
        saveFragment = new SaveFragment();
        deleteFragment = new DeleteFragment();
        dialog = new Dialog(getActivity());

        satu = view.findViewById(R.id.img_satu);
        dua = view.findViewById(R.id.img_dua);
        tiga = view.findViewById(R.id.img_tiga);

        satu.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.LOLLIPOP) {
                    bukuFragment.setSharedElementEnterTransition(new BaruTransition());
                    bukuFragment.setEnterTransition(new Fade());
                    setExitTransition(new Fade());
                    bukuFragment.setSharedElementReturnTransition(new BaruTransition());
                }

                if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.LOLLIPOP) {
//                    getActivity().getSupportFragmentManager()
//                            .beginTransaction()
//                            .addSharedElement(satu, satu.getTransitionName())
//                            .replace(R.id.frameku, bukuFragment)
//                            .addToBackStack(null)
//                            .commit();
                }

            }
        });

        dua.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
//                if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.LOLLIPOP) {
//                    saveFragment.setSharedElementEnterTransition(new BaruTransition());
//                    saveFragment.setEnterTransition(new Fade());
//                    setExitTransition(new Fade());
//                    saveFragment.setSharedElementReturnTransition(new BaruTransition());
//                }
//
//                if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.LOLLIPOP) {
//                    getActivity().getSupportFragmentManager()
//                            .beginTransaction()
//                            .addSharedElement(dua, dua.getTransitionName())
//                            .replace(R.id.frameku, saveFragment)
//                            .addToBackStack(null)
//                            .commit();
//                }

                // pop up images
//                dialog.setContentView(R.layout.dialog_save);
//
//                dialog.getWindow().setBackgroundDrawable(new ColorDrawable(Color.TRANSPARENT));
//                dialog.getWindow().getAttributes().windowAnimations = R.style.DialogLagi;
//                dialog.show();

//                zoomImageFromThumb(dua, R.drawable.save, view);
                Intent intent = new Intent(getActivity(), PopUpKuActivity.class);
                if (android.os.Build.VERSION.SDK_INT >= android.os.Build.VERSION_CODES.LOLLIPOP) {
                    ActivityOptions options = ActivityOptions.makeSceneTransitionAnimation(getActivity(), dua, dua.getTransitionName());
                    startActivityForResult(intent, 100, options.toBundle());
                }
            }
        });

        tiga.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.LOLLIPOP) {
                    deleteFragment.setSharedElementEnterTransition(new BaruTransition());
                    deleteFragment.setEnterTransition(new Fade());
                    setExitTransition(new Fade());
                    deleteFragment.setSharedElementReturnTransition(new BaruTransition());
                }

                if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.LOLLIPOP) {
//                    getActivity().getSupportFragmentManager()
//                            .beginTransaction()
//                            .addSharedElement(tiga, tiga.getTransitionName())
//                            .replace(R.id.frameku, deleteFragment)
//                            .addToBackStack(null)
//                            .commit();
                }
            }
        });

        return view;
    }

//    private void zoomImageFromThumb(final View thumbView, int imageResId, View v) {
//        // If there's an animation in progress, cancel it
//        // immediately and proceed with this one.
//        if (currentAnimator != null) {
//            currentAnimator.cancel();
//        }
//
//        // Load the high-resolution "zoomed-in" image.
//        final ImageView expandedImageView = v.findViewById(
//                R.id.zoomImages);
//        expandedImageView.setImageResource(imageResId);
//
//        // Calculate the starting and ending bounds for the zoomed-in image.
//        // This step involves lots of math. Yay, math.
//        final Rect startBounds = new Rect();
//        final Rect finalBounds = new Rect();
//        final Point globalOffset = new Point();
//
//        // The start bounds are the global visible rectangle of the thumbnail,
//        // and the final bounds are the global visible rectangle of the container
//        // view. Also set the container view's offset as the origin for the
//        // bounds, since that's the origin for the positioning animation
//        // properties (X, Y).
//        thumbView.getGlobalVisibleRect(startBounds);
//        v.findViewById(R.id.tempatnya)
//                .getGlobalVisibleRect(finalBounds, globalOffset);
//        startBounds.offset(-globalOffset.x, -globalOffset.y);
//        finalBounds.offset(-globalOffset.x, -globalOffset.y);
//
//        // Adjust the start bounds to be the same aspect ratio as the final
//        // bounds using the "center crop" technique. This prevents undesirable
//        // stretching during the animation. Also calculate the start scaling
//        // factor (the end scaling factor is always 1.0).
//        float startScale;
//        if ((float) finalBounds.width() / finalBounds.height()
//                > (float) startBounds.width() / startBounds.height()) {
//            // Extend start bounds horizontally
//            startScale = (float) startBounds.height() / finalBounds.height();
//            float startWidth = startScale * finalBounds.width();
//            float deltaWidth = (startWidth - startBounds.width()) / 2;
//            startBounds.left -= deltaWidth;
//            startBounds.right += deltaWidth;
//        } else {
//            // Extend start bounds vertically
//            startScale = (float) startBounds.width() / finalBounds.width();
//            float startHeight = startScale * finalBounds.height();
//            float deltaHeight = (startHeight - startBounds.height()) / 2;
//            startBounds.top -= deltaHeight;
//            startBounds.bottom += deltaHeight;
//        }
//
//        // Hide the thumbnail and show the zoomed-in view. When the animation
//        // begins, it will position the zoomed-in view in the place of the
//        // thumbnail.
//        thumbView.setAlpha(0f);
//        expandedImageView.setVisibility(View.VISIBLE);
//
//        // Set the pivot point for SCALE_X and SCALE_Y transformations
//        // to the top-left corner of the zoomed-in view (the default
//        // is the center of the view).
//        expandedImageView.setPivotX(0f);
//        expandedImageView.setPivotY(0f);
//
//        // Construct and run the parallel animation of the four translation and
//        // scale properties (X, Y, SCALE_X, and SCALE_Y).
//        AnimatorSet set = new AnimatorSet();
//        set
//                .play(ObjectAnimator.ofFloat(expandedImageView, View.X,
//                        startBounds.left, finalBounds.left))
//                .with(ObjectAnimator.ofFloat(expandedImageView, View.Y,
//                        startBounds.top, finalBounds.top))
//                .with(ObjectAnimator.ofFloat(expandedImageView, View.SCALE_X,
//                        startScale, 1f))
//                .with(ObjectAnimator.ofFloat(expandedImageView,
//                        View.SCALE_Y, startScale, 1f));
//        set.setDuration(shortAnimationDuration);
//        set.setInterpolator(new DecelerateInterpolator());
//        set.addListener(new AnimatorListenerAdapter() {
//            @Override
//            public void onAnimationEnd(Animator animation) {
//                currentAnimator = null;
//            }
//
//            @Override
//            public void onAnimationCancel(Animator animation) {
//                currentAnimator = null;
//            }
//        });
//        set.start();
//        currentAnimator = set;
//
//        // Upon clicking the zoomed-in image, it should zoom back down
//        // to the original bounds and show the thumbnail instead of
//        // the expanded image.
//        final float startScaleFinal = startScale;
//        expandedImageView.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//                if (currentAnimator != null) {
//                    currentAnimator.cancel();
//                }
//
//                // Animate the four positioning/sizing properties in parallel,
//                // back to their original values.
//                AnimatorSet set = new AnimatorSet();
//                set.play(ObjectAnimator
//                        .ofFloat(expandedImageView, View.X, startBounds.left))
//                        .with(ObjectAnimator
//                                .ofFloat(expandedImageView,
//                                        View.Y,startBounds.top))
//                        .with(ObjectAnimator
//                                .ofFloat(expandedImageView,
//                                        View.SCALE_X, startScaleFinal))
//                        .with(ObjectAnimator
//                                .ofFloat(expandedImageView,
//                                        View.SCALE_Y, startScaleFinal));
//                set.setDuration(shortAnimationDuration);
//                set.setInterpolator(new DecelerateInterpolator());
//                set.addListener(new AnimatorListenerAdapter() {
//                    @Override
//                    public void onAnimationEnd(Animator animation) {
//                        thumbView.setAlpha(1f);
//                        expandedImageView.setVisibility(View.GONE);
//                        currentAnimator = null;
//                    }
//
//                    @Override
//                    public void onAnimationCancel(Animator animation) {
//                        thumbView.setAlpha(1f);
//                        expandedImageView.setVisibility(View.GONE);
//                        currentAnimator = null;
//                    }
//                });
//                set.start();
//                currentAnimator = set;
//            }
//        });
//    }
}
