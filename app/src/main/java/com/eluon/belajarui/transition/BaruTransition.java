package com.eluon.belajarui.transition;

import android.os.Build;
import android.transition.ChangeBounds;
import android.transition.ChangeImageTransform;
import android.transition.ChangeTransform;
import android.transition.TransitionSet;

import androidx.annotation.RequiresApi;

public class BaruTransition extends TransitionSet {
    @RequiresApi(api = Build.VERSION_CODES.LOLLIPOP)
    public BaruTransition() {
        setOrdering(ORDERING_TOGETHER);
        addTransition(new ChangeBounds()).
                addTransition(new ChangeTransform()).
                addTransition(new ChangeImageTransform());
    }
}
