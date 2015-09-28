package com.bestfunforever.recycleviewextentsion.internal;

import android.content.Context;
import android.util.AttributeSet;
import android.view.ViewGroup;
import android.widget.RelativeLayout;

/**
 * Created by nguyenxuan on 9/19/2015.
 */
public abstract class BaseLoadingLayout extends RelativeLayout {

    public abstract int getContentSize();
    public abstract void onPull(float scaleOfLayout);
    public abstract  void pullToRefresh();
    public abstract void refreshing();
    public abstract void releaseToRefresh();
    public abstract void reset();

    public BaseLoadingLayout(Context context, AttributeSet attrs) {
        super(context, attrs);
    }


    public final void setHeight(int height) {
        ViewGroup.LayoutParams lp = (ViewGroup.LayoutParams) getLayoutParams();
        lp.height = height;
        requestLayout();
    }

    public final void setWidth(int width) {
        ViewGroup.LayoutParams lp = (ViewGroup.LayoutParams) getLayoutParams();
        lp.width = width;
        requestLayout();
    }


}