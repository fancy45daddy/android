package com.facebook.ads.redexgen.X;

import java.util.concurrent.atomic.AtomicBoolean;
/* loaded from: assets/audience_network.dex */
public class SE implements OC {
    public final /* synthetic */ S9 A00;

    public SE(S9 s9) {
        this.A00 = s9;
    }

    @Override // com.facebook.ads.redexgen.X.OC
    public final void AB4() {
        AtomicBoolean atomicBoolean;
        atomicBoolean = this.A00.A0R;
        atomicBoolean.set(true);
        this.A00.A0N();
    }
}
