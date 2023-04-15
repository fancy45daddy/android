package com.facebook.ads.redexgen.X;

import androidx.annotation.Nullable;
import java.util.concurrent.atomic.AtomicReference;
/* renamed from: com.facebook.ads.redexgen.X.7F  reason: invalid class name */
/* loaded from: assets/audience_network.dex */
public final class C7F {
    public static final AtomicReference<C0805Wi> A00 = new AtomicReference<>();

    @Nullable
    public static C0805Wi A00() {
        return A00.get();
    }

    public static void A01(C0805Wi c0805Wi) {
        if (c0805Wi == null) {
            return;
        }
        A00.compareAndSet(null, c0805Wi);
    }
}
