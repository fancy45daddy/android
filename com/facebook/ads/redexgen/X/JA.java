package com.facebook.ads.redexgen.X;

import android.util.DisplayMetrics;
import android.view.View;
import android.widget.RelativeLayout;
/* loaded from: assets/audience_network.dex */
public final class JA {
    public static J8 A00(DisplayMetrics displayMetrics) {
        int i = (int) (displayMetrics.widthPixels / displayMetrics.density);
        int screenWidth = displayMetrics.heightPixels;
        int screenHeight = (int) (screenWidth / displayMetrics.density);
        if (C0495Ke.A04(i, screenHeight)) {
            return J8.A0H;
        }
        if (screenHeight > i) {
            return J8.A0J;
        }
        return J8.A0G;
    }

    public static void A01(DisplayMetrics displayMetrics, View view, J6 j6) {
        int ceil;
        int i = (int) (displayMetrics.widthPixels / displayMetrics.density);
        int screenWidth = j6.A03();
        if (i >= screenWidth) {
            ceil = displayMetrics.widthPixels;
        } else {
            int screenWidth2 = j6.A03();
            ceil = (int) Math.ceil(screenWidth2 * displayMetrics.density);
        }
        int screenWidth3 = j6.A02();
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(ceil, (int) Math.ceil(screenWidth3 * displayMetrics.density));
        layoutParams.addRule(14, -1);
        view.setLayoutParams(layoutParams);
    }
}
