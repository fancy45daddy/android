package com.facebook.ads.redexgen.X;

import java.lang.ref.WeakReference;
/* renamed from: com.facebook.ads.redexgen.X.Rj  reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public class C0680Rj implements N1 {
    public final WeakReference<C02268y> A00;

    public C0680Rj(C02268y c02268y) {
        this.A00 = new WeakReference<>(c02268y);
    }

    @Override // com.facebook.ads.redexgen.X.N1
    public final void AAr(boolean z) {
        C02268y cardLayout = this.A00.get();
        if (cardLayout != null) {
            cardLayout.A04 = z;
            cardLayout.A02();
        }
    }
}
