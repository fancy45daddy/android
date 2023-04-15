package com.facebook.ads.redexgen.X;

import java.util.Map;
/* loaded from: assets/audience_network.dex */
public class NM extends C2A {
    public final /* synthetic */ C0553Ml A00;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public NM(C0553Ml c0553Ml, double d, double d2, double d3, boolean z) {
        super(d, d2, d3, z);
        this.A00 = c0553Ml;
    }

    @Override // com.facebook.ads.redexgen.X.C2A
    public final void A00(boolean z, boolean z2, C2C c2c) {
        IT it;
        String str;
        Map<String, String> A0J;
        if (z2) {
            it = this.A00.A06;
            str = this.A00.A0B;
            A0J = this.A00.A0J(EnumC0605Om.A03);
            it.A9L(str, A0J);
        }
    }
}
