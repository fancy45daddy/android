package com.facebook.ads.redexgen.X;

import java.util.Map;
/* loaded from: assets/audience_network.dex */
public abstract class FD implements QV {
    public final C0378Fl A00;
    public final EnumC0645Qa A01;

    public FD(C0378Fl c0378Fl, EnumC0645Qa enumC0645Qa) {
        this.A00 = c0378Fl;
        this.A01 = enumC0645Qa;
    }

    @Override // com.facebook.ads.redexgen.X.QV
    public void A3O(Map<QD, EnumC0645Qa> map, Map<FI, QN> map2) {
        map.put(this.A00, this.A01);
    }
}
