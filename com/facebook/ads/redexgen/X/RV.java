package com.facebook.ads.redexgen.X;

import java.lang.ref.WeakReference;
/* loaded from: assets/audience_network.dex */
public class RV implements N1 {
    public final WeakReference<AbstractC02188q> A00;

    public RV(AbstractC02188q abstractC02188q) {
        this.A00 = new WeakReference<>(abstractC02188q);
    }

    @Override // com.facebook.ads.redexgen.X.N1
    public final void AAr(boolean z) {
        AbstractC02188q cardLayout = this.A00.get();
        if (cardLayout != null) {
            cardLayout.A06 = z;
            cardLayout.A01();
        }
    }
}
