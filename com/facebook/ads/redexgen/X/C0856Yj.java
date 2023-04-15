package com.facebook.ads.redexgen.X;

import com.facebook.ads.AdError;
/* renamed from: com.facebook.ads.redexgen.X.Yj  reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public class C0856Yj implements InterfaceC00441l {
    public final /* synthetic */ C00361d A00;

    public C0856Yj(C00361d c00361d) {
        this.A00 = c00361d;
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC00441l
    public final void ABg(AdError adError) {
        InterfaceC00351c interfaceC00351c;
        interfaceC00351c = this.A00.A04;
        interfaceC00351c.A9o(AdError.CACHE_ERROR);
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC00441l
    public final void ABh() {
        InterfaceC00351c interfaceC00351c;
        interfaceC00351c = this.A00.A04;
        interfaceC00351c.A9p();
    }
}
