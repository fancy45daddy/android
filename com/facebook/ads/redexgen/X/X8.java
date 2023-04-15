package com.facebook.ads.redexgen.X;
/* loaded from: assets/audience_network.dex */
public class X8 extends AbstractRunnableC0475Jh {
    public final /* synthetic */ X5 A00;
    public final /* synthetic */ J3 A01;

    public X8(X5 x5, J3 j3) {
        this.A00 = x5;
        this.A01 = j3;
    }

    @Override // com.facebook.ads.redexgen.X.AbstractRunnableC0475Jh
    public final void A01() {
        C5Q c5q;
        C5Q c5q2;
        c5q = this.A00.A00;
        if (c5q.A00() != null) {
            c5q2 = this.A00.A00;
            c5q2.A00().onAdError(KP.A00(this.A01));
        }
    }
}
