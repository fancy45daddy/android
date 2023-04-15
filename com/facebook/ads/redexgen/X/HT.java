package com.facebook.ads.redexgen.X;

import android.animation.ValueAnimator;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.Nullable;
/* loaded from: assets/audience_network.dex */
public final class HT implements PF {
    public int A00;
    @Nullable
    public ValueAnimator A01;
    public PE A02 = PE.A05;
    public final int A03;
    public final int A04;
    public final View A05;

    public HT(View view, int i, int i2, int i3) {
        this.A05 = view;
        this.A03 = i;
        this.A00 = i2;
        this.A04 = i3;
    }

    private ValueAnimator A00(int i, int i2, View view) {
        ValueAnimator ofInt = ValueAnimator.ofInt(i, i2);
        ofInt.setDuration(this.A03);
        ofInt.addUpdateListener(new PI(this, view));
        return ofInt;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void A07(boolean z) {
        if (z) {
            this.A02 = PE.A06;
            this.A01 = A00(this.A00, this.A04, this.A05);
            this.A01.addListener(new PH(this));
            this.A01.start();
            return;
        }
        ViewGroup.LayoutParams layoutParams = this.A05.getLayoutParams();
        layoutParams.height = this.A04;
        this.A05.setLayoutParams(layoutParams);
        LE.A0H(this.A05);
        this.A02 = PE.A05;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void A08(boolean z) {
        LE.A0L(this.A05);
        if (z) {
            this.A02 = PE.A04;
            this.A01 = A00(this.A04, this.A00, this.A05);
            this.A01.addListener(new PG(this));
            this.A01.start();
            return;
        }
        ViewGroup.LayoutParams layoutParams = this.A05.getLayoutParams();
        layoutParams.height = this.A00;
        this.A05.setLayoutParams(layoutParams);
        this.A02 = PE.A03;
    }

    @Override // com.facebook.ads.redexgen.X.PF
    public final void A3M(boolean z, boolean z2) {
        if (z2) {
            A07(z);
        } else {
            A08(z);
        }
    }

    @Override // com.facebook.ads.redexgen.X.PF
    public final PE A7V() {
        return this.A02;
    }

    @Override // com.facebook.ads.redexgen.X.PF
    public final void cancel() {
        ValueAnimator valueAnimator = this.A01;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
    }
}
