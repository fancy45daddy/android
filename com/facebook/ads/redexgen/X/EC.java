package com.facebook.ads.redexgen.X;
/* loaded from: assets/audience_network.dex */
public final class EC extends AbstractC0848Yb {
    public EC(C0806Wj c0806Wj, C00481p c00481p) {
        super(c0806Wj, c00481p);
    }

    private InterfaceC00300x A00(Runnable runnable) {
        return new YZ(this, runnable);
    }

    @Override // com.facebook.ads.redexgen.X.AbstractC0848Yb
    public final void A0J() {
        ZB interstitialAdapter = (ZB) this.A01;
        interstitialAdapter.A0B();
    }

    @Override // com.facebook.ads.redexgen.X.AbstractC0848Yb
    public final void A0L(InterfaceC00200n interfaceC00200n, AnonymousClass83 anonymousClass83, AnonymousClass81 anonymousClass81, C00491q c00491q) {
        ZB zb = (ZB) interfaceC00200n;
        C0847Ya c0847Ya = new C0847Ya(this, c00491q, zb);
        A0C().postDelayed(c0847Ya, anonymousClass83.A05().A05());
        zb.A0A(this.A0B, A00(c0847Ya), c00491q, this.A07.A0A, this.A07.A04, this.A07.A05, this.A07.A02);
    }

    public final AnonymousClass18 A0T() {
        return ((ZB) this.A01).A09();
    }
}
