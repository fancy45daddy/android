package com.facebook.ads.redexgen.X;

import a.a.j;
import android.graphics.drawable.GradientDrawable;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import java.util.Arrays;
/* loaded from: assets/audience_network.dex */
public final class LZ extends LinearLayout {
    public static byte[] A04;
    public static final int A05;
    public static final int A06;
    public static final int A07;
    public static final int A08;
    public static final int A09;
    public final ImageView A00;
    public final ImageView A01;
    public final C2D A02;
    public final C0806Wj A03;

    public static String A02(int i, int i2, int i3) {
        byte[] copyOfRange = Arrays.copyOfRange(A04, i, i + i2);
        for (int i4 = 0; i4 < copyOfRange.length; i4++) {
            copyOfRange[i4] = (byte) ((copyOfRange[i4] ^ i3) ^ 91);
        }
        return new String(copyOfRange);
    }

    public static void A03() {
        A04 = new byte[]{118, 83};
    }

    static {
        A03();
        A08 = (int) (Kd.A02 * 50.0f);
        A05 = (int) (Kd.A02 * 10.0f);
        A06 = (int) (Kd.A02 * 20.0f);
        A09 = (int) (Kd.A02 * 4.0f);
        A07 = (int) (Kd.A02 * 12.0f);
    }

    public LZ(C0806Wj c0806Wj, int i) {
        super(c0806Wj);
        this.A03 = c0806Wj;
        this.A02 = C2E.A00(c0806Wj.A00());
        setOrientation(0);
        this.A00 = new ImageView(c0806Wj);
        this.A01 = new ImageView(c0806Wj);
        A04(i);
    }

    private void A04(int i) {
        LM lm;
        A05(this.A00, LM.AD_CHOICES_ICON);
        if (i == 2) {
            int i2 = A05;
            setPadding(i2, i2 / 3, i2, i2 / 3);
            TextView textView = new TextView(this.A03);
            textView.setText(A02(0, 2, j.AppCompatTheme_tooltipForegroundColor));
            textView.setTextColor(-1);
            int i3 = A05;
            textView.setPadding(0, i3 / 2, i3 / 2, i3 / 2);
            LE.A0X(textView, true, 13);
            LinearLayout.LayoutParams textViewParams = new LinearLayout.LayoutParams(-2, -2);
            textViewParams.gravity = 16;
            addView(textView, textViewParams);
            int i4 = A07;
            LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(i4, i4);
            layoutParams.gravity = 16;
            addView(this.A00, layoutParams);
            return;
        }
        int i5 = A05;
        setPadding(i5, i5, i5, i5);
        if (i == 1) {
            lm = LM.AN_INFO_ICON;
        } else {
            lm = LM.DEFAULT_INFO_ICON;
        }
        A05(this.A01, lm);
        int i6 = A06;
        LinearLayout.LayoutParams layoutParams2 = new LinearLayout.LayoutParams(i6, i6);
        layoutParams2.gravity = 17;
        addView(this.A01, layoutParams2);
        int i7 = A06;
        LinearLayout.LayoutParams layoutParams3 = new LinearLayout.LayoutParams(i7, i7);
        layoutParams3.setMargins(A09, 0, 0, 0);
        layoutParams3.gravity = 17;
        addView(this.A00, layoutParams3);
    }

    public static void A05(ImageView imageView, LM lm) {
        imageView.setScaleType(ImageView.ScaleType.FIT_CENTER);
        imageView.setImageBitmap(LN.A01(lm));
        imageView.setColorFilter(-1);
    }

    public void setAdDetails(C1U c1u, String str, C0444Ib c0444Ib, InterfaceC0519Lc interfaceC0519Lc) {
        setOnClickListener(new LY(this, c0444Ib, interfaceC0519Lc, str, c1u));
    }

    @Override // android.view.View
    public void setBackgroundColor(int i) {
        GradientDrawable gradientDrawable = new GradientDrawable();
        gradientDrawable.setShape(0);
        gradientDrawable.setCornerRadius(A08);
        gradientDrawable.setColor(i);
        LE.A0S(this, gradientDrawable);
    }

    public void setIconColors(int i) {
        this.A00.setColorFilter(i);
        this.A01.setColorFilter(i);
    }
}
