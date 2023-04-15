package com.facebook.ads.redexgen.X;
/* renamed from: com.facebook.ads.redexgen.X.Xe  reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public class C0827Xe implements InterfaceC00963n {
    public final /* synthetic */ C0339Dw A00;

    public C0827Xe(C0339Dw c0339Dw) {
        this.A00 = c0339Dw;
    }

    private final void A00(C00973o c00973o) {
        int i = c00973o.A00;
        if (i == 1) {
            this.A00.A06.A1Q(this.A00, c00973o.A02, c00973o.A01);
        } else if (i == 2) {
            this.A00.A06.A1R(this.A00, c00973o.A02, c00973o.A01);
        } else if (i == 4) {
            this.A00.A06.A1T(this.A00, c00973o.A02, c00973o.A01, c00973o.A03);
        } else if (i != 8) {
        } else {
            this.A00.A06.A1S(this.A00, c00973o.A02, c00973o.A01, 1);
        }
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC00963n
    public final AbstractC01194l A5O(int i) {
        AbstractC01194l A1G = this.A00.A1G(i, true);
        if (A1G == null || this.A00.A01.A0K(A1G.A0H)) {
            return null;
        }
        return A1G;
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC00963n
    public final void A9O(int i, int i2, Object obj) {
        this.A00.A1f(i, i2, obj);
        this.A00.A0H = true;
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC00963n
    public final void A9i(int i, int i2) {
        this.A00.A1c(i, i2);
        this.A00.A0G = true;
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC00963n
    public final void A9j(int i, int i2) {
        this.A00.A1d(i, i2);
        this.A00.A0G = true;
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC00963n
    public final void A9k(int i, int i2) {
        this.A00.A1g(i, i2, true);
        C0339Dw c0339Dw = this.A00;
        c0339Dw.A0G = true;
        c0339Dw.A0s.A00 += i2;
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC00963n
    public final void A9l(int i, int i2) {
        this.A00.A1g(i, i2, false);
        this.A00.A0G = true;
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC00963n
    public final void AAP(C00973o c00973o) {
        A00(c00973o);
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC00963n
    public final void AAR(C00973o c00973o) {
        A00(c00973o);
    }
}
