package com.facebook.ads.redexgen.X;

import androidx.annotation.Nullable;
import com.facebook.infer.annotation.Nullsafe;
@Nullsafe(Nullsafe.Mode.LOCAL)
/* renamed from: com.facebook.ads.redexgen.X.a1  reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public abstract class AbstractC0895a1 {
    @Nullable
    public InterfaceC0896a2 A00;

    public final void A00() {
        InterfaceC0896a2 interfaceC0896a2 = this.A00;
        if (interfaceC0896a2 != null) {
            interfaceC0896a2.onStart();
        }
    }

    public final void A01() {
        InterfaceC0896a2 interfaceC0896a2 = this.A00;
        if (interfaceC0896a2 != null) {
            interfaceC0896a2.onStop();
        }
    }

    public final void A02(InterfaceC0896a2 interfaceC0896a2) {
        this.A00 = interfaceC0896a2;
    }
}
