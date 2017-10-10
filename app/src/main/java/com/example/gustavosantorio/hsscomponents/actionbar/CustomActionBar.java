package com.example.gustavosantorio.hsscomponents.actionbar;

import android.annotation.TargetApi;
import android.content.Context;
import android.os.Build;
import android.support.annotation.DrawableRes;
import android.support.annotation.RequiresApi;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.widget.Toolbar;

import com.example.gustavosantorio.hsscomponents.R;

/**
 * Created by gustavosantorio on 09/10/17.
 */

@RequiresApi(Build.VERSION_CODES.LOLLIPOP)
public class CustomActionBar extends Toolbar {

    public CustomActionBar(Context context) {
        super(context);
    }

    public CustomActionBar(Context context, AttributeSet attrs) {
        super(context, attrs);
    }

    public CustomActionBar(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
    }

    public CustomActionBar(Context context, AttributeSet attrs, int defStyleAttr, int defStyleRes) {
        super(context, attrs, defStyleAttr, defStyleRes);
    }

    @Override
    protected void onFinishInflate() {
        super.onFinishInflate();
        addView(LayoutInflater.from(getContext()).inflate(R.layout.custom_actionbar, null));
//        setNavigationIcon(R.drawable);
    }

    @Override
    public void setNavigationIcon(@DrawableRes int resId) {
        super.setNavigationIcon(resId);
    }
}
