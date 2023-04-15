package com.facebook.ads.redexgen.X;

import androidx.annotation.RequiresApi;
/* renamed from: com.facebook.ads.redexgen.X.Rl  reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public class C0682Rl extends AbstractRunnableC0487Ju {
    public final /* synthetic */ NC A00;

    public C0682Rl(NC nc) {
        this.A00 = nc;
    }

    @Override // com.facebook.ads.redexgen.X.AbstractRunnableC0487Ju
    @RequiresApi(api = 16)
    public final void A06() {
        Runnable runnable;
        int i;
        if (this.A00.isPressed()) {
            NC nc = this.A00;
            i = nc.A07;
            nc.postDelayed(this, i);
            return;
        }
        this.A00.setPressed(true);
        NC nc2 = this.A00;
        runnable = nc2.A09;
        nc2.postOnAnimationDelayed(runnable, 250L);
    }
}
