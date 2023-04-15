package com.facebook.ads.redexgen.X;

import android.graphics.Typeface;
import android.view.View;
import android.widget.Button;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import java.util.HashMap;
import java.util.Locale;
/* renamed from: com.facebook.ads.redexgen.X.Nc  reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public final class C0570Nc extends FrameLayout {
    public final int A00;
    public final RelativeLayout A01;
    public final View$OnClickListenerC0683Rm A02;
    public final NV A03;
    public static final int A06 = (int) (Kd.A02 * 36.0f);
    public static final int A07 = (int) (Kd.A02 * 36.0f);
    public static final int A04 = (int) (Kd.A02 * 23.0f);
    public static final int A05 = (int) (Kd.A02 * 3.0f);
    public static final int A08 = (int) (Kd.A02 * 4.0f);

    public C0570Nc(NV nv, String str, C1K c1k, N8 n8) {
        super(nv.A05());
        this.A03 = nv;
        this.A00 = c1k.A08(true);
        this.A01 = new RelativeLayout(nv.A05());
        addView(this.A01, new FrameLayout.LayoutParams(-1, -1));
        this.A01.setClickable(false);
        A01(str);
        this.A02 = new View$OnClickListenerC0683Rm(nv.A05(), nv.A04().A0T(), null, nv.A06(), nv.A09(), nv.A0B(), nv.A07());
        this.A02.setCta(nv.A04().A0O().A0F(), nv.A04().A0U(), new HashMap(), n8);
        this.A02.setIsInAppBrowser(true);
        addView(this.A02, new FrameLayout.LayoutParams(-1, -1));
    }

    private void A00(View view) {
        ImageView imageView = new ImageView(this.A03.A05());
        imageView.setImageBitmap(LN.A01(LM.MINIMIZE_ARROW));
        imageView.setRotation(180.0f);
        imageView.setClickable(false);
        imageView.setColorFilter(this.A00);
        int i = A04;
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(i, i);
        int i2 = A05;
        imageView.setPadding(i2, i2, i2, i2);
        layoutParams.addRule(2, view.getId());
        layoutParams.addRule(14);
        this.A01.addView(imageView, layoutParams);
    }

    private void A01(String str) {
        Button button = new Button(this.A03.A05());
        LE.A0K(button);
        int i = A07;
        button.setPadding(i, 0, i, 0);
        button.setText(str.toUpperCase(Locale.getDefault()));
        button.setTextSize(14.0f);
        button.setTypeface(Typeface.defaultFromStyle(1));
        LE.A0O(button, this.A00, A08);
        button.setTextColor(-16777216);
        RelativeLayout.LayoutParams ctaParams = new RelativeLayout.LayoutParams(-2, A06);
        ctaParams.addRule(12);
        ctaParams.addRule(14);
        this.A01.addView(button, ctaParams);
        A00(button);
    }

    @Override // android.view.View
    public final boolean performClick() {
        return this.A02.performClick();
    }
}
