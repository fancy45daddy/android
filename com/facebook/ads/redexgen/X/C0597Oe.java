package com.facebook.ads.redexgen.X;

import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.facebook.ads.AdOptionsView;
import com.facebook.ads.NativeBannerAd;
/* renamed from: com.facebook.ads.redexgen.X.Oe  reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public final class C0597Oe extends LinearLayout {
    public C0597Oe(C0806Wj c0806Wj, NativeBannerAd nativeBannerAd, EnumC0463Iu enumC0463Iu, C0462It c0462It, AdOptionsView adOptionsView) {
        super(c0806Wj);
        TextView textView = new TextView(getContext());
        c0462It.A08(textView);
        textView.setText(nativeBannerAd.getAdvertiserName());
        textView.setEllipsize(TextUtils.TruncateAt.END);
        textView.setMaxLines(1);
        TextView textView2 = new TextView(getContext());
        c0462It.A06(textView2);
        textView2.setText(nativeBannerAd.getAdUntrimmedBodyText());
        textView2.setLines(enumC0463Iu == EnumC0463Iu.A07 ? 2 : 1);
        LinearLayout linearLayout = new LinearLayout(getContext());
        linearLayout.setOrientation(0);
        linearLayout.setGravity(16);
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(0, -2);
        layoutParams.weight = 1.0f;
        linearLayout.addView(textView, layoutParams);
        linearLayout.addView((View) adOptionsView, (ViewGroup.LayoutParams) new LinearLayout.LayoutParams(-2, -2));
        setOrientation(1);
        ViewGroup.LayoutParams layoutParams2 = new LinearLayout.LayoutParams(-1, -2);
        addView(linearLayout, layoutParams2);
        addView(textView2, layoutParams2);
    }
}
