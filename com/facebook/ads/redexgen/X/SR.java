package com.facebook.ads.redexgen.X;
/* loaded from: assets/audience_network.dex */
public class SR implements AnonymousClass57 {
    public final /* synthetic */ SO A00;

    public SR(SO so) {
        this.A00 = so;
    }

    @Override // com.facebook.ads.redexgen.X.AnonymousClass57
    public final boolean A8K() {
        C0696Rz c0696Rz;
        C0696Rz c0696Rz2;
        c0696Rz = this.A00.A0B;
        if (c0696Rz.canGoBack()) {
            c0696Rz2 = this.A00.A0B;
            c0696Rz2.goBack();
            return true;
        }
        return false;
    }
}
