package com.facebook.ads.redexgen.X;
/* loaded from: assets/audience_network.dex */
public class QX extends AbstractRunnableC0487Ju {
    public final /* synthetic */ C0602Oj A00;

    public QX(C0602Oj c0602Oj) {
        this.A00 = c0602Oj;
    }

    @Override // com.facebook.ads.redexgen.X.AbstractRunnableC0487Ju
    public final void A06() {
        P1 p1;
        LC lc;
        AbstractC0501Kk abstractC0501Kk;
        AbstractC0534Lr abstractC0534Lr;
        p1 = this.A00.A02;
        C8N<C8O, C8M> eventBus = p1.getEventBus();
        lc = this.A00.A04;
        abstractC0501Kk = this.A00.A05;
        abstractC0534Lr = this.A00.A03;
        eventBus.A04(lc, abstractC0501Kk, abstractC0534Lr);
    }
}
