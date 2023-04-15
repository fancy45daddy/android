package com.facebook.ads.redexgen.X;

import com.facebook.ads.AdError;
/* renamed from: com.facebook.ads.redexgen.X.Ym  reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public class C0859Ym implements InterfaceC01395f {
    public final /* synthetic */ C00361d A00;
    public final /* synthetic */ C0806Wj A01;
    public final /* synthetic */ boolean A02;

    public C0859Ym(C00361d c00361d, C0806Wj c0806Wj, boolean z) {
        this.A00 = c00361d;
        this.A01 = c0806Wj;
        this.A02 = z;
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC01395f
    public final void A9v() {
        InterfaceC00351c interfaceC00351c;
        C0865Ys c0865Ys;
        if (!ID.A1C(this.A01) || !this.A02) {
            interfaceC00351c = this.A00.A04;
            interfaceC00351c.A9p();
            return;
        }
        C00361d c00361d = this.A00;
        C0806Wj c0806Wj = this.A01;
        c0865Ys = c00361d.A03;
        c00361d.A02 = C0590Nx.A01(c0806Wj, c0865Ys, 1, new C0860Yn(this));
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC01395f
    public final void A9w() {
        InterfaceC00351c interfaceC00351c;
        interfaceC00351c = this.A00.A04;
        interfaceC00351c.A9o(AdError.CACHE_ERROR);
    }
}
