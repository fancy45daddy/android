package com.facebook.ads.redexgen.X;

import androidx.annotation.RequiresApi;
/* renamed from: com.facebook.ads.redexgen.X.Rk  reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public class C0681Rk extends AbstractRunnableC0487Ju {
    public final /* synthetic */ NC A00;

    public C0681Rk(NC nc) {
        this.A00 = nc;
    }

    @Override // com.facebook.ads.redexgen.X.AbstractRunnableC0487Ju
    @RequiresApi(api = 16)
    public final void A06() {
        Runnable runnable;
        int i;
        this.A00.setPressed(false);
        NC nc = this.A00;
        runnable = nc.A08;
        i = this.A00.A07;
        nc.postOnAnimationDelayed(runnable, i);
    }
}
