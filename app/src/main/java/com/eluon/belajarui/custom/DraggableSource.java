package com.eluon.belajarui.custom;

import android.content.Context;
import android.util.AttributeSet;
import android.util.Log;
import android.widget.FrameLayout;

import com.eluon.belajarui.R;
import com.hoanganhtuan95ptit.draggable.DraggablePanel;
import com.hoanganhtuan95ptit.draggable.utils.ViewExtensionsKt;

import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

public class DraggableSource extends DraggablePanel {

    private int mWidthWhenMax = 0;
    private int mWidthWhenMiddle = 0;
    private int mWidthWhenMin = 0;

    public int getmWidthWhenMax() {
        return mWidthWhenMax;
    }

    public void setmWidthWhenMax(int mWidthWhenMax) {
        this.mWidthWhenMax = mWidthWhenMax;
    }

    public int getmWidthWhenMiddle() {
        return mWidthWhenMiddle;
    }

    public void setmWidthWhenMiddle(int mWidthWhenMiddle) {
        this.mWidthWhenMiddle = mWidthWhenMiddle;
    }

    public int getmWidthWhenMin() {
        return mWidthWhenMin;
    }

    public void setmWidthWhenMin(int mWidthWhenMin) {
        this.mWidthWhenMin = mWidthWhenMin;
    }

    public DraggableSource(@NotNull Context context, @Nullable AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
    }

    public DraggableSource(@NotNull Context context, @Nullable AttributeSet attrs) {
        super(context, attrs);
        this.getFrameFirst().addView(ViewExtensionsKt.inflate(this, R.layout.drag_top));
        this.getFrameSecond().addView(ViewExtensionsKt.inflate(this, R.layout.drag_bottom));
        Log.i("info", "c2");
    }

    public DraggableSource(@NotNull Context context) {
        super(context);
    }

    @Override
    public void initFrame() {
        this.mWidthWhenMax = this.getWidth();
        this.mWidthWhenMiddle = (int)((float)this.getWidth() - this.getMPercentWhenMiddle() * (float)this.getMMarginEdgeWhenMin());
        //mWidthWhenMin = this.getMHeightWhenMin();
        this.mWidthWhenMin = this.getMHeightWhenMin() * 22 / 9;
        Log.i("ini", "init frame berjalan"+mWidthWhenMin);
        super.initFrame();
    }

    @Override
    public void refreshFrameFirst() {
        float width = this.getMCurrentPercent() < this.getMPercentWhenMiddle()
                ? (float)this.mWidthWhenMax - (float)(this.mWidthWhenMax - this.mWidthWhenMiddle)
                * this.getMCurrentPercent() : (float)this.mWidthWhenMiddle - (float)(this.mWidthWhenMiddle - this.mWidthWhenMin)
                * (this.getMCurrentPercent() - this.getMPercentWhenMiddle())
                / ((float)1 - this.getMPercentWhenMiddle());
        FrameLayout frameLayout = findViewById(R.id.frameTop);
        ViewExtensionsKt.reWidth(frameLayout, (int)width);
        Log.i("info", "refresh frame first"+width);
        super.refreshFrameFirst();
    }

}
