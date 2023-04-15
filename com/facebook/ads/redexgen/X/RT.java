package com.facebook.ads.redexgen.X;

import java.util.Map;
/* loaded from: assets/audience_network.dex */
public class RT extends AbstractC0626Ph {
    public final /* synthetic */ C02178p A00;

    public RT(C02178p c02178p) {
        this.A00 = c02178p;
    }

    @Override // com.facebook.ads.redexgen.X.AbstractC0626Ph
    public final void A02() {
        L6 l6;
        L6 l62;
        C0627Pi c0627Pi;
        L6 l63;
        IT it;
        AnonymousClass18 anonymousClass18;
        C0806Wj c0806Wj;
        AnonymousClass18 anonymousClass182;
        InterfaceC0519Lc interfaceC0519Lc;
        InterfaceC0519Lc interfaceC0519Lc2;
        M4 m4;
        l6 = this.A00.A0B;
        if (!l6.A07()) {
            l62 = this.A00.A0B;
            l62.A05();
            N2 n2 = new N2();
            c0627Pi = this.A00.A0H;
            N2 A03 = n2.A03(c0627Pi);
            l63 = this.A00.A0B;
            Map<String, String> A05 = A03.A02(l63).A05();
            it = this.A00.A08;
            anonymousClass18 = this.A00.A06;
            it.A8z(anonymousClass18.A0U(), A05);
            c0806Wj = this.A00.A07;
            c0806Wj.A0D().A2Y();
            anonymousClass182 = this.A00.A06;
            AnonymousClass29.A00(anonymousClass182.A0W());
            interfaceC0519Lc = this.A00.A0C;
            if (interfaceC0519Lc != null) {
                interfaceC0519Lc2 = this.A00.A0C;
                m4 = this.A00.A0D;
                interfaceC0519Lc2.A3s(m4.A6k());
            }
        }
    }
}
