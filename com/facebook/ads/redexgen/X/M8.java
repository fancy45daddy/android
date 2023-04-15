package com.facebook.ads.redexgen.X;

import android.graphics.drawable.GradientDrawable;
import android.text.TextUtils;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
/* loaded from: assets/audience_network.dex */
public final class M8 extends RelativeLayout {
    public final int A00;
    public final int A01;
    public final C2D A02;
    public final C0806Wj A03;
    public final MB A04;
    public final boolean A05;
    public static final int A09 = (int) (Kd.A02 * 16.0f);
    public static final int A0A = (int) (Kd.A02 * 8.0f);
    public static final int A0D = (int) (Kd.A02 * 44.0f);
    public static final int A08 = (int) (Kd.A02 * 10.0f);
    public static final int A07 = A09 - A08;
    public static final int A0E = (int) (Kd.A02 * 75.0f);
    public static final int A0B = (int) (Kd.A02 * 25.0f);
    public static final int A0F = (int) (Kd.A02 * 45.0f);
    public static final int A0C = (int) (Kd.A02 * 15.0f);
    public static final int A06 = (int) (Kd.A02 * 16.0f);

    public M8(M7 m7) {
        super(M7.A01(m7));
        this.A03 = M7.A01(m7);
        this.A02 = C2E.A00(this.A03.A00());
        this.A04 = M7.A03(m7);
        this.A01 = M7.A09(m7) ? A0E : A0F;
        this.A00 = M7.A09(m7) ? A0B : A0C;
        this.A05 = M7.A0A(m7);
        setFocusable(true);
        View A01 = A01(m7);
        View A00 = A00(m7);
        View footerView = getFooterView();
        LE.A0K(A01);
        LE.A0K(A00);
        LE.A0K(footerView);
        RelativeLayout.LayoutParams footerParams = new RelativeLayout.LayoutParams(-1, -2);
        footerParams.addRule(10);
        RelativeLayout.LayoutParams headerParams = new RelativeLayout.LayoutParams(-1, -1);
        headerParams.addRule(13);
        headerParams.addRule(3, A01.getId());
        headerParams.addRule(2, footerView.getId());
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-1, -2);
        layoutParams.addRule(12);
        int i = A09;
        layoutParams.setMargins(i, 0, i, i);
        addView(A01, footerParams);
        addView(A00, headerParams);
        addView(footerView, layoutParams);
        footerView.setVisibility(M7.A0B(m7) ? 0 : 8);
    }

    public /* synthetic */ M8(M7 m7, M5 m5) {
        this(m7);
    }

    private View A00(M7 m7) {
        ImageView imageView = new ImageView(getContext());
        int i = this.A00;
        imageView.setPadding(i, i, i, i);
        imageView.setImageBitmap(LN.A01(M7.A02(m7)));
        imageView.setColorFilter(-1);
        int i2 = this.A01;
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(i2, i2);
        GradientDrawable gradientDrawable = new GradientDrawable();
        gradientDrawable.setShape(1);
        gradientDrawable.setColor(M7.A00(m7));
        LE.A0S(imageView, gradientDrawable);
        layoutParams.gravity = 17;
        int i3 = A09;
        layoutParams.setMargins(i3, 0, i3, i3);
        TextView textView = new TextView(getContext());
        LE.A0X(textView, true, 20);
        textView.setTextColor(-14934495);
        textView.setText(M7.A04(m7));
        textView.setGravity(17);
        LinearLayout.LayoutParams layoutParams2 = new LinearLayout.LayoutParams(-1, -2);
        int i4 = A09;
        layoutParams2.setMargins(i4, 0, i4, i4);
        TextView textView2 = new TextView(getContext());
        LE.A0X(textView2, false, 16);
        textView2.setTextColor(-10459280);
        textView2.setText(M7.A05(m7));
        textView2.setGravity(17);
        LinearLayout.LayoutParams subtitleParams = new LinearLayout.LayoutParams(-1, -2);
        int i5 = A09;
        subtitleParams.setMargins(i5, 0, i5, i5);
        LinearLayout linearLayout = new LinearLayout(getContext());
        linearLayout.setOrientation(1);
        linearLayout.setGravity(17);
        linearLayout.addView(imageView, layoutParams);
        linearLayout.addView(textView, layoutParams2);
        linearLayout.addView(textView2, subtitleParams);
        if (M7.A08(m7)) {
            LinearLayout linearLayout2 = new LinearLayout(getContext());
            linearLayout2.setOrientation(0);
            linearLayout2.setGravity(17);
            if (!TextUtils.isEmpty(M7.A06(m7))) {
                NI ni = new NI(this.A03);
                int i6 = A0F;
                LinearLayout.LayoutParams subtitleParams2 = new LinearLayout.LayoutParams(i6, i6);
                subtitleParams2.setMargins(0, 0, A0A, 0);
                ni.setFullCircleCorners(true);
                AsyncTaskC0685Ro asyncTaskC0685Ro = new AsyncTaskC0685Ro(ni, this.A03);
                int i7 = A0F;
                asyncTaskC0685Ro.A05(i7, i7).A07(M7.A06(m7));
                linearLayout2.addView(ni, subtitleParams2);
            }
            MD md = new MD(this.A03);
            md.setData(M7.A07(m7), LM.CHECKMARK);
            md.setSelected(true);
            linearLayout2.addView(md, new LinearLayout.LayoutParams(-2, -2));
            linearLayout.addView(linearLayout2);
        }
        return linearLayout;
    }

    private View A01(M7 m7) {
        LinearLayout linearLayout = new LinearLayout(getContext());
        linearLayout.setOrientation(0);
        if (M7.A0C(m7)) {
            ImageView imageView = new ImageView(getContext());
            int i = A08;
            imageView.setPadding(i, i, i, i);
            imageView.setScaleType(ImageView.ScaleType.FIT_CENTER);
            imageView.setImageBitmap(LN.A01(LM.CROSS));
            imageView.setOnClickListener(new M5(this));
            int i2 = A0D;
            LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(i2, i2);
            int i3 = A07;
            layoutParams.setMargins(i3, i3, i3, i3);
            linearLayout.addView(imageView, layoutParams);
        }
        return linearLayout;
    }

    private View getFooterView() {
        ImageView imageView = new ImageView(getContext());
        imageView.setImageBitmap(LN.A01(LM.SETTINGS));
        imageView.setColorFilter(-13272859);
        int i = A06;
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(i, i);
        layoutParams.gravity = 17;
        TextView managePrefsText = new TextView(getContext());
        LE.A0X(managePrefsText, false, 16);
        managePrefsText.setTextColor(-13272859);
        int i2 = A0A;
        managePrefsText.setPadding(i2, i2, i2, i2);
        managePrefsText.setText(this.A02.A0J());
        LinearLayout.LayoutParams settingsIconParams = new LinearLayout.LayoutParams(-2, -2);
        settingsIconParams.gravity = 17;
        LinearLayout linearLayout = new LinearLayout(getContext());
        linearLayout.setOrientation(0);
        linearLayout.setGravity(17);
        linearLayout.setOnClickListener(new M6(this));
        linearLayout.addView(imageView, layoutParams);
        linearLayout.addView(managePrefsText, settingsIconParams);
        return linearLayout;
    }
}
