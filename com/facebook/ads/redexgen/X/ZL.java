package com.facebook.ads.redexgen.X;

import java.util.concurrent.CountDownLatch;
/* loaded from: assets/audience_network.dex */
public class ZL extends AbstractRunnableC0487Ju {
    public final /* synthetic */ C00270u A00;

    public ZL(C00270u c00270u) {
        this.A00 = c00270u;
    }

    @Override // com.facebook.ads.redexgen.X.AbstractRunnableC0487Ju
    public final void A06() {
        C00260t c00260t;
        CountDownLatch countDownLatch;
        this.A00.A07();
        c00260t = this.A00.A02;
        c00260t.A06();
        countDownLatch = this.A00.A05;
        countDownLatch.countDown();
    }
}
