package com.facebook.ads.redexgen.X;

import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
/* renamed from: com.facebook.ads.redexgen.X.Lw  reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public final class C0538Lw extends LinearLayout {
    public static final int A06 = (int) (Kd.A02 * 10.0f);
    public static final int A07 = (int) (Kd.A02 * 44.0f);
    public int A00;
    public boolean A01;
    public final ImageView A02;
    public final LinearLayout A03;
    public final TextView A04;
    public final NB A05;

    public C0538Lw(C0806Wj c0806Wj, int i) {
        super(c0806Wj);
        this.A01 = false;
        this.A02 = new ImageView(c0806Wj);
        ImageView imageView = this.A02;
        int i2 = A06;
        imageView.setPadding(i2, i2, i2, i2);
        this.A05 = new NB(c0806Wj);
        this.A05.setProgress(0.0f);
        NB nb = this.A05;
        int i3 = A06;
        nb.setPadding(i3, i3, i3, i3);
        this.A04 = new TextView(c0806Wj);
        setOrientation(0);
        this.A03 = new LinearLayout(c0806Wj);
        this.A00 = i;
        A00();
    }

    private void A00() {
        setToolbarActionMode(this.A00);
        ViewGroup.LayoutParams layoutParams = new LinearLayout.LayoutParams(-2, -2);
        setGravity(17);
        int i = A07;
        LinearLayout.LayoutParams layoutParams2 = new LinearLayout.LayoutParams(i, i);
        LE.A0X(this.A04, true, 16);
        this.A04.setTextColor(-1);
        this.A04.setVisibility(8);
        this.A03.addView(this.A02, layoutParams2);
        this.A03.addView(this.A05, layoutParams2);
        addView(this.A03, layoutParams);
        LinearLayout.LayoutParams actionTextLayoutParams = new LinearLayout.LayoutParams(-2, -2);
        actionTextLayoutParams.gravity = 17;
        addView(this.A04, actionTextLayoutParams);
    }

    private void A01() {
        int i;
        NB nb = this.A05;
        if (this.A00 == 2) {
            i = this.A01 ? 4 : 0;
        } else {
            i = 8;
        }
        nb.setVisibility(i);
        this.A02.setVisibility(this.A00 == 2 ? 8 : 0);
    }

    public final boolean A02() {
        return !this.A04.getText().toString().isEmpty();
    }

    public final boolean A03() {
        int i = this.A00;
        return (i == 2 || i == 4) ? false : true;
    }

    public void setActionClickListener(View.OnClickListener onClickListener) {
        setOnClickListener(onClickListener);
    }

    public void setColors(int i) {
        this.A05.A02(C2U.A01(i, 77), i);
        this.A02.setColorFilter(i);
    }

    public void setInitialUnskippableSeconds(int i) {
        if (i > 0) {
            setToolbarActionMode(2);
        }
    }

    public void setProgress(float f) {
        this.A05.setProgressWithAnimation(f);
    }

    public void setProgressSpinnerInvisible(boolean z) {
        this.A01 = z;
        A01();
    }

    public void setToolbarActionMode(int i) {
        LM lm;
        this.A00 = i;
        A01();
        setVisibility(0);
        if (i == 0) {
            lm = LM.CROSS;
        } else if (i == 1) {
            lm = LM.SKIP_ARROW;
        } else if (i == 3) {
            lm = LM.MINIMIZE_ARROW;
        } else if (i != 4) {
            lm = LM.CROSS;
        } else {
            lm = LM.CROSS;
            this.A02.setVisibility(8);
            setVisibility(8);
        }
        this.A02.setImageBitmap(LN.A01(lm));
        LE.A0G(1002, this.A02);
    }

    public void setToolbarMessage(String str) {
        this.A04.setText(str);
        this.A04.setVisibility(TextUtils.isEmpty(str) ? 8 : 0);
    }

    public void setToolbarMessageEnabled(boolean z) {
        this.A04.setVisibility(z ? 0 : 4);
    }
}
