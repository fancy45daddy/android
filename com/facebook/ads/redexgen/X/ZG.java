package com.facebook.ads.redexgen.X;
/* loaded from: assets/audience_network.dex */
public class ZG extends AbstractRunnableC0487Ju {
    public final /* synthetic */ ZF A00;
    public final /* synthetic */ C02168o A01;

    public ZG(ZF zf, C02168o c02168o) {
        this.A00 = zf;
        this.A01 = c02168o;
    }

    @Override // com.facebook.ads.redexgen.X.AbstractRunnableC0487Ju
    public final void A06() {
        C0627Pi c0627Pi;
        C0627Pi c0627Pi2;
        C0627Pi c0627Pi3;
        this.A00.A00.A09();
        c0627Pi = this.A00.A00.A0A;
        if (c0627Pi != null) {
            C02168o c02168o = this.A01;
            c0627Pi2 = this.A00.A00.A0A;
            c02168o.setAdViewabilityChecker(c0627Pi2);
            c0627Pi3 = this.A00.A00.A0A;
            c0627Pi3.A0U();
        }
    }
}
