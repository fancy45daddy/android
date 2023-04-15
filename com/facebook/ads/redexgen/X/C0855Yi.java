package com.facebook.ads.redexgen.X;

import com.facebook.ads.AdError;
/* renamed from: com.facebook.ads.redexgen.X.Yi  reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public class C0855Yi implements InterfaceC01395f {
    public final /* synthetic */ C00361d A00;

    public C0855Yi(C00361d c00361d) {
        this.A00 = c00361d;
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC01395f
    public final void A9v() {
        InterfaceC00351c interfaceC00351c;
        interfaceC00351c = this.A00.A04;
        interfaceC00351c.A9p();
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC01395f
    public final void A9w() {
        InterfaceC00351c interfaceC00351c;
        interfaceC00351c = this.A00.A04;
        interfaceC00351c.A9o(AdError.CACHE_ERROR);
    }
}
