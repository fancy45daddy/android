package com.facebook.ads.redexgen.X;

import android.os.Handler;
/* renamed from: com.facebook.ads.redexgen.X.Rp  reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public class C0686Rp extends AbstractRunnableC0487Ju {
    public final /* synthetic */ N0 A00;

    public C0686Rp(N0 n0) {
        this.A00 = n0;
    }

    @Override // com.facebook.ads.redexgen.X.AbstractRunnableC0487Ju
    public final void A06() {
        boolean z;
        Handler handler;
        Runnable runnable;
        this.A00.A03();
        z = this.A00.A08;
        if (z) {
            handler = this.A00.A0D;
            runnable = this.A00.A0F;
            handler.postDelayed(runnable, 250L);
        }
    }
}
