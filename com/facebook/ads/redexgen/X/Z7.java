package com.facebook.ads.redexgen.X;

import com.facebook.ads.AdError;
import java.util.concurrent.atomic.AtomicBoolean;
/* loaded from: assets/audience_network.dex */
public class Z7 implements InterfaceC01395f {
    public final /* synthetic */ C0344Eb A00;
    public final /* synthetic */ boolean A01;

    public Z7(C0344Eb c0344Eb, boolean z) {
        this.A00 = c0344Eb;
        this.A01 = z;
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC01395f
    public final void A9v() {
        C0806Wj c0806Wj;
        AtomicBoolean atomicBoolean;
        AnonymousClass14 anonymousClass14;
        C0806Wj c0806Wj2;
        AnonymousClass18 anonymousClass18;
        c0806Wj = this.A00.A04;
        if (!ID.A1F(c0806Wj) || !this.A01) {
            atomicBoolean = this.A00.A0C;
            atomicBoolean.set(true);
            anonymousClass14 = this.A00.A01;
            anonymousClass14.AC6(this.A00);
            return;
        }
        C0344Eb c0344Eb = this.A00;
        c0806Wj2 = c0344Eb.A04;
        anonymousClass18 = this.A00.A03;
        c0344Eb.A07 = C0590Nx.A01(c0806Wj2, (C0861Yo) anonymousClass18, 0, new Z8(this));
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC01395f
    public final void A9w() {
        AnonymousClass14 anonymousClass14;
        anonymousClass14 = this.A00.A01;
        anonymousClass14.AC9(this.A00, AdError.CACHE_ERROR);
    }
}
