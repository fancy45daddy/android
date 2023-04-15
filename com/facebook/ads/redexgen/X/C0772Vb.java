package com.facebook.ads.redexgen.X;
/* renamed from: com.facebook.ads.redexgen.X.Vb  reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public final class C0772Vb implements BX {
    public final long A00;
    public final BW A01;

    public C0772Vb(long j) {
        this(j, 0L);
    }

    public C0772Vb(long j, long j2) {
        this.A00 = j;
        this.A01 = new BW(j2 == 0 ? BY.A04 : new BY(0L, j2));
    }

    @Override // com.facebook.ads.redexgen.X.BX
    public final long A6Q() {
        return this.A00;
    }

    @Override // com.facebook.ads.redexgen.X.BX
    public final BW A7M(long j) {
        return this.A01;
    }

    @Override // com.facebook.ads.redexgen.X.BX
    public final boolean A8d() {
        return false;
    }
}
