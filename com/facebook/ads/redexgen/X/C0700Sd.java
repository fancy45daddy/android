package com.facebook.ads.redexgen.X;

import android.os.Handler;
/* renamed from: com.facebook.ads.redexgen.X.Sd  reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public class C0700Sd extends AbstractRunnableC0487Ju {
    public final /* synthetic */ KX A00;

    public C0700Sd(KX kx) {
        this.A00 = kx;
    }

    @Override // com.facebook.ads.redexgen.X.AbstractRunnableC0487Ju
    public final void A06() {
        Handler handler;
        if (this.A00.A05()) {
            this.A00.A01();
            handler = this.A00.A03;
            handler.postDelayed(this, 250L);
        }
    }
}
