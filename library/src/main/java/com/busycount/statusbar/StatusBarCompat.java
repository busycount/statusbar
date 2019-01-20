package com.busycount.statusbar;

import android.app.Activity;
import android.graphics.Color;
import android.os.Build;
import android.support.annotation.ColorInt;
import android.support.annotation.NonNull;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;

/**
 * StatusBarCompat
 * <p>
 * 2019/1/20 | Count.C | Created
 */
public class StatusBarCompat {

    public static void fit(@NonNull Activity activity, @ColorInt int color, boolean isDark) {
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.LOLLIPOP) {
            Window window = activity.getWindow();
            if (window == null) {
                return;
            }
            window.clearFlags(WindowManager.LayoutParams.FLAG_TRANSLUCENT_STATUS);
            window.addFlags(WindowManager.LayoutParams.FLAG_DRAWS_SYSTEM_BAR_BACKGROUNDS);


            if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.M) {
                window.setStatusBarColor(color);
                View decorView = window.getDecorView();
                if (isDark) {
                    decorView.setSystemUiVisibility(View.SYSTEM_UI_FLAG_LIGHT_STATUS_BAR);
                } else {
                    decorView.setSystemUiVisibility(0);
                }
            } else {
                if (isDark) {
                    //改不了图标颜色，就修改状态栏颜色
                    float[] fc = new float[3];
                    Color.colorToHSV(color, fc);
                    fc[2] *= 0.7;
                    window.setStatusBarColor(Color.HSVToColor(fc));
                } else {
                    window.setStatusBarColor(color);
                }
            }
        }
    }
}

