package com.facebook.ads.redexgen.X;

import com.facebook.ads.AdError;
import java.util.concurrent.atomic.AtomicBoolean;
/* loaded from: assets/audience_network.dex */
public class Z4 implements InterfaceC00441l {
    public final /* synthetic */ C0344Eb A00;

    public Z4(C0344Eb c0344Eb) {
        this.A00 = c0344Eb;
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC00441l
    public final void ABg(AdError adError) {
        AnonymousClass14 anonymousClass14;
        anonymousClass14 = this.A00.A01;
        anonymousClass14.AC9(this.A00, adError);
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC00441l
    public final void ABh() {
        AtomicBoolean atomicBoolean;
        AnonymousClass14 anonymousClass14;
        atomicBoolean = this.A00.A0C;
        atomicBoolean.set(true);
        anonymousClass14 = this.A00.A01;
        anonymousClass14.AC6(this.A00);
    }
}
