package com.facebook.ads.redexgen.X;

import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.facebook.ads.AdOptionsView;
import com.facebook.ads.NativeAd;
/* renamed from: com.facebook.ads.redexgen.X.Oi  reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public final class C0601Oi extends LinearLayout {
    public static final int A00 = (int) (Kd.A02 * 32.0f);
    public static final int A01 = (int) (Kd.A02 * 8.0f);

    public C0601Oi(C0806Wj c0806Wj, NativeAd nativeAd, C0462It c0462It, NI ni, AdOptionsView adOptionsView) {
        super(c0806Wj);
        setOrientation(0);
        ni.setFullCircleCorners(true);
        int i = A00;
        LinearLayout.LayoutParams iconViewParams = new LinearLayout.LayoutParams(i, i);
        iconViewParams.gravity = 16;
        iconViewParams.setMargins(0, 0, A01, 0);
        addView(ni, iconViewParams);
        TextView textView = new TextView(c0806Wj);
        c0462It.A08(textView);
        textView.setMaxLines(1);
        textView.setText(nativeAd.getAdvertiserName());
        TextView sponsoredTextView = new TextView(c0806Wj);
        c0462It.A06(sponsoredTextView);
        sponsoredTextView.setMaxLines(1);
        sponsoredTextView.setText(nativeAd.getSponsoredTranslation());
        LinearLayout linearLayout = new LinearLayout(c0806Wj);
        linearLayout.setOrientation(1);
        LinearLayout.LayoutParams iconViewParams2 = new LinearLayout.LayoutParams(0, -2);
        iconViewParams2.weight = 1.0f;
        iconViewParams2.gravity = 16;
        LinearLayout.LayoutParams textContainerParams = new LinearLayout.LayoutParams(-1, -2);
        linearLayout.addView(textView, textContainerParams);
        LinearLayout.LayoutParams textContainerParams2 = new LinearLayout.LayoutParams(-1, -2);
        linearLayout.addView(sponsoredTextView, textContainerParams2);
        addView(linearLayout, iconViewParams2);
        LinearLayout.LayoutParams textContainerParams3 = new LinearLayout.LayoutParams(-2, -2);
        addView((View) adOptionsView, (ViewGroup.LayoutParams) textContainerParams3);
    }
}
