package com.lipan.ui.widget;

import android.content.Context;
import android.util.AttributeSet;
import android.util.DisplayMetrics;
import android.view.MotionEvent;
import android.widget.AbsListView;
import android.widget.ListView;
import android.widget.ScrollView;
import com.lipan.R;
import com.lipan.ui.activity.BaseActivity;
import com.lipan.utils.LogUtils;
import com.lipan.utils.UIUtils;

import java.lang.reflect.Field;

public class BaseListView extends ListView {
    public BaseListView(Context context) {
        this(context, null);
    }

    public BaseListView(Context context, AttributeSet attrs) {
        this(context, attrs, 0);
    }

    public BaseListView(Context context, AttributeSet attrs, int defStyle) {
        super(context, attrs, defStyle);
        init();
    }

    private void init() {
        setDivider(UIUtils.getResources().getDrawable(R.drawable.nothing));
        setCacheColorHint(UIUtils.getColor(R.color.bg_page));
        setSelector(UIUtils.getResources().getDrawable(R.drawable.nothing));
    }
}
