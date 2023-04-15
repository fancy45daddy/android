package com.facebook.ads.redexgen.X;

import android.graphics.drawable.GradientDrawable;
import android.text.TextUtils;
import android.view.View;
import android.view.animation.DecelerateInterpolator;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.annotation.Nullable;
/* loaded from: assets/audience_network.dex */
public final class OD extends LinearLayout {
    @Nullable
    public LinearLayout A00;
    public final int A01;
    public final C0806Wj A02;
    public final NI A03;
    public final NO A04;
    public static final int A07 = (int) (Kd.A02 * 16.0f);
    public static final int A08 = (int) (Kd.A02 * 16.0f);
    public static final int A06 = (int) (Kd.A02 * 8.0f);
    public static final int A05 = (int) (Kd.A02 * 72.0f);

    public OD(OB ob) {
        super(OB.A04(ob));
        this.A02 = OB.A04(ob);
        this.A03 = new NI(this.A02);
        this.A04 = new NO(this.A02, OB.A02(ob), true, false, true);
        this.A01 = OB.A00(ob);
        A03(ob);
    }

    public /* synthetic */ OD(OB ob, R6 r6) {
        this(ob);
    }

    private void A00() {
        A01(this.A03, 150);
        A01(this.A04, 170);
        LinearLayout linearLayout = this.A00;
        if (linearLayout != null) {
            A01(linearLayout, 190);
        }
    }

    private void A01(View view, int i) {
        view.setTranslationY(i);
        view.setScaleY(0.75f);
        view.setScaleX(0.75f);
        view.animate().translationYBy(-i).scaleX(1.0f).scaleY(1.0f).setDuration(300L).setInterpolator(new DecelerateInterpolator(2.0f));
    }

    private void A02(OB ob) {
        if (!TextUtils.isEmpty(OB.A05(ob))) {
            this.A00 = new LinearLayout(getContext());
            this.A00.setGravity(17);
            LinearLayout linearLayout = this.A00;
            int i = A08;
            linearLayout.setPadding(i, i / 2, i, i / 2);
            LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-2, -2);
            layoutParams.setMargins(0, A08 / 2, 0, 0);
            TextView textView = new TextView(getContext());
            textView.setTextColor(-1);
            LE.A0X(textView, false, 16);
            textView.setText(OB.A05(ob));
            LinearLayout.LayoutParams layoutParams2 = new LinearLayout.LayoutParams(-2, -2);
            ImageView imageView = new ImageView(getContext());
            new AsyncTaskC0685Ro(imageView, this.A02).A04().A07(OB.A06(ob));
            int i2 = A07;
            LinearLayout.LayoutParams informativeTextViewParams = new LinearLayout.LayoutParams(i2, i2);
            informativeTextViewParams.setMargins(0, 0, A08 / 2, 0);
            this.A00.addView(imageView, informativeTextViewParams);
            this.A00.addView(textView, layoutParams2);
            GradientDrawable gradientDrawable = new GradientDrawable();
            gradientDrawable.setCornerRadius(100.0f);
            gradientDrawable.setColor(469762047);
            LE.A0S(this.A00, gradientDrawable);
            addView(this.A00, layoutParams);
        }
    }

    private void A03(OB ob) {
        LE.A0M(this.A03, 0);
        this.A03.setRadius(50);
        if (OB.A01(ob).A00() == C1G.A05) {
            this.A03.setFullCircleCorners(true);
        } else {
            this.A03.setRadius(A06);
        }
        new AsyncTaskC0685Ro(this.A03, this.A02).A04().A07(OB.A03(ob).A01());
        this.A04.A01(OB.A01(ob).A06(), OB.A03(ob).A03(), null, false, true);
        this.A04.getDescriptionTextView().setAlpha(0.8f);
        this.A04.setAlignment(17);
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-2, -2);
        int i = A08;
        layoutParams.setMargins(0, i, 0, i / 2);
        View view = this.A03;
        int i2 = A05;
        LinearLayout.LayoutParams titleAndDescriptionParams = new LinearLayout.LayoutParams(i2, i2);
        addView(view, titleAndDescriptionParams);
        addView(this.A04, layoutParams);
        A02(ob);
        LE.A0M(this, -14473425);
        setGravity(17);
        setOrientation(1);
    }

    public final void A04(OC oc) {
        A00();
        postDelayed(new R6(this, oc), this.A01);
    }
}
