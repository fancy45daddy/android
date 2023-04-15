package com.facebook.ads.redexgen.X;

import java.lang.ref.WeakReference;
/* renamed from: com.facebook.ads.redexgen.X.Rs  reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public class C0689Rs extends AbstractRunnableC0487Ju {
    public final WeakReference<C0627Pi> A00;

    public C0689Rs(C0627Pi c0627Pi) {
        this.A00 = new WeakReference<>(c0627Pi);
    }

    public C0689Rs(WeakReference<C0627Pi> weakReference) {
        this.A00 = weakReference;
    }

    @Override // com.facebook.ads.redexgen.X.AbstractRunnableC0487Ju
    public final void A06() {
        C0627Pi viewabilityChecker = this.A00.get();
        if (viewabilityChecker != null) {
            viewabilityChecker.A0U();
        }
    }
}
