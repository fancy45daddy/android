package com.facebook.ads.redexgen.X;

import com.facebook.ads.AdError;
import java.util.concurrent.atomic.AtomicBoolean;
/* loaded from: assets/audience_network.dex */
public class Z5 implements InterfaceC01395f {
    public final /* synthetic */ C0344Eb A00;

    public Z5(C0344Eb c0344Eb) {
        this.A00 = c0344Eb;
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC01395f
    public final void A9v() {
        AtomicBoolean atomicBoolean;
        AnonymousClass14 anonymousClass14;
        atomicBoolean = this.A00.A0C;
        atomicBoolean.set(true);
        anonymousClass14 = this.A00.A01;
        anonymousClass14.AC6(this.A00);
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC01395f
    public final void A9w() {
        AnonymousClass14 anonymousClass14;
        anonymousClass14 = this.A00.A01;
        anonymousClass14.AC9(this.A00, AdError.CACHE_ERROR);
    }
}
