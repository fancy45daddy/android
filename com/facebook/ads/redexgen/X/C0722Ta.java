package com.facebook.ads.redexgen.X;

import androidx.annotation.Nullable;
/* renamed from: com.facebook.ads.redexgen.X.Ta  reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public final class C0722Ta implements GP {
    public final int A00;
    @Nullable
    public final GN A01;
    public final GP A02;
    public final GP A03;
    public final InterfaceC0409Gq A04;
    @Nullable
    public final InterfaceC0411Gs A05;

    public C0722Ta(InterfaceC0409Gq interfaceC0409Gq, GP gp, GP gp2, GN gn, int i, InterfaceC0411Gs interfaceC0411Gs) {
        this.A04 = interfaceC0409Gq;
        this.A03 = gp;
        this.A02 = gp2;
        this.A01 = gn;
        this.A00 = i;
        this.A05 = interfaceC0411Gs;
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Override // com.facebook.ads.redexgen.X.GP
    /* renamed from: A00 */
    public final C0723Tb A4E() {
        InterfaceC0409Gq interfaceC0409Gq = this.A04;
        GQ A4E = this.A03.A4E();
        GQ A4E2 = this.A02.A4E();
        GN gn = this.A01;
        return new C0723Tb(interfaceC0409Gq, A4E, A4E2, gn != null ? gn.createDataSink() : null, this.A00, this.A05);
    }
}
