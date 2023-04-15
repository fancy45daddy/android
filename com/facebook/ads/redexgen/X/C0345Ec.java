package com.facebook.ads.redexgen.X;

import com.facebook.ads.AdError;
import java.util.concurrent.atomic.AtomicBoolean;
/* renamed from: com.facebook.ads.redexgen.X.Ec  reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public class C0345Ec extends AbstractC0852Yf {
    public final /* synthetic */ C0344Eb A00;
    public final /* synthetic */ AbstractC0872Yz A01;
    public final /* synthetic */ C0861Yo A02;
    public final /* synthetic */ boolean A03;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0345Ec(C0344Eb c0344Eb, boolean z, boolean z2, C0861Yo c0861Yo, AbstractC0872Yz abstractC0872Yz) {
        super(z);
        this.A00 = c0344Eb;
        this.A03 = z2;
        this.A02 = c0861Yo;
        this.A01 = abstractC0872Yz;
    }

    @Override // com.facebook.ads.redexgen.X.AbstractC0852Yf
    public final void A00() {
        AnonymousClass14 anonymousClass14;
        anonymousClass14 = this.A00.A01;
        anonymousClass14.AC9(this.A01, AdError.CACHE_ERROR);
    }

    @Override // com.facebook.ads.redexgen.X.AbstractC0852Yf
    public final void A01(boolean z) {
        C0806Wj c0806Wj;
        AtomicBoolean atomicBoolean;
        AnonymousClass14 anonymousClass14;
        C0806Wj c0806Wj2;
        c0806Wj = this.A00.A04;
        if (!ID.A1F(c0806Wj) || !this.A03) {
            atomicBoolean = this.A00.A0C;
            atomicBoolean.set(true);
            anonymousClass14 = this.A00.A01;
            anonymousClass14.AC6(this.A01);
            return;
        }
        C0344Eb c0344Eb = this.A00;
        c0806Wj2 = c0344Eb.A04;
        c0344Eb.A07 = C0590Nx.A01(c0806Wj2, this.A02, 0, new Z6(this));
    }
}
