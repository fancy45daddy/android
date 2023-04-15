package com.facebook.ads.redexgen.X;

import java.lang.ref.WeakReference;
/* loaded from: assets/audience_network.dex */
public class T9 implements InterfaceC0453Ik {
    public WeakReference<C0718Sw> A00;

    public T9(C0718Sw c0718Sw) {
        this.A00 = new WeakReference<>(c0718Sw);
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC0453Ik
    public final void ABe(boolean z) {
        if (this.A00.get() != null) {
            this.A00.get().A1c(z, false);
        }
    }
}
