package com.facebook.ads.redexgen.X;

import java.util.Map;
/* loaded from: assets/audience_network.dex */
public class ZE extends AbstractC0626Ph {
    public final /* synthetic */ ZC A00;

    public ZE(ZC zc) {
        this.A00 = zc;
    }

    @Override // com.facebook.ads.redexgen.X.AbstractC0626Ph
    public final void A02() {
        L6 l6;
        L6 l62;
        DY dy;
        Z1 z1;
        DY dy2;
        C0867Yu c0867Yu;
        C0627Pi c0627Pi;
        L6 l63;
        C0867Yu c0867Yu2;
        IT it;
        C0867Yu c0867Yu3;
        C0627Pi c0627Pi2;
        l6 = this.A00.A05;
        if (!l6.A07()) {
            l62 = this.A00.A05;
            l62.A05();
            dy = this.A00.A03;
            ZU A0D = dy.A0D();
            z1 = this.A00.A01;
            A0D.A3Z(z1 != null);
            dy2 = this.A00.A03;
            dy2.A0D().A2Y();
            c0867Yu = this.A00.A02;
            AnonymousClass29.A00(c0867Yu.A0W());
            N2 n2 = new N2();
            c0627Pi = this.A00.A0A;
            N2 A03 = n2.A03(c0627Pi);
            l63 = this.A00.A05;
            N2 A02 = A03.A02(l63);
            c0867Yu2 = this.A00.A02;
            Map<String, String> A05 = A02.A04(c0867Yu2.A0X()).A05();
            it = this.A00.A04;
            c0867Yu3 = this.A00.A02;
            it.A8z(c0867Yu3.A0U(), A05);
            c0627Pi2 = this.A00.A0A;
            c0627Pi2.A0V();
        }
    }
}
