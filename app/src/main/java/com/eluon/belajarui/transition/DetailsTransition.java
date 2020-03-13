package com.eluon.belajarui.transition;

import android.content.Context;
import android.util.AttributeSet;

import androidx.transition.ChangeBounds;
import androidx.transition.ChangeImageTransform;
import androidx.transition.ChangeTransform;
import androidx.transition.TransitionSet;

public class DetailsTransition extends TransitionSet {
    public DetailsTransition(){
        init();
    }

    public DetailsTransition(Context context, AttributeSet attrs) {
        super(context, attrs);
        init();
    }

    private void init(){
        setOrdering(ORDERING_TOGETHER);
        addTransition(new ChangeBounds()).
                addTransition(new ChangeTransform()).
                addTransition(new ChangeImageTransform());
    }
}
