package com.facebook.ads.redexgen.X;
/* renamed from: com.facebook.ads.redexgen.X.Ce  reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public final class C0297Ce implements VN {
    public final int A00;
    public final int A01;
    public final long A02;
    public final long A03;
    public final long A04;

    public C0297Ce(long j, long j2, BU bu) {
        this.A04 = j2;
        this.A01 = bu.A02;
        this.A00 = bu.A00;
        if (j == -1) {
            this.A02 = -1L;
            this.A03 = -9223372036854775807L;
            return;
        }
        this.A02 = j - j2;
        this.A03 = A7c(j);
    }

    @Override // com.facebook.ads.redexgen.X.BX
    public final long A6Q() {
        return this.A03;
    }

    @Override // com.facebook.ads.redexgen.X.BX
    public final BW A7M(long j) {
        long j2 = this.A02;
        if (j2 == -1) {
            return new BW(new BY(0L, this.A04));
        }
        int i = this.A01;
        long A0E = C0430Hl.A0E((((this.A00 * j) / 8000000) / i) * i, 0L, j2 - i);
        long j3 = this.A04 + A0E;
        long A7c = A7c(j3);
        BY seekPoint = new BY(A7c, j3);
        if (A7c < j) {
            long j4 = this.A02;
            int i2 = this.A01;
            if (A0E != j4 - i2) {
                long j5 = i2 + j3;
                return new BW(seekPoint, new BY(A7c(j5), j5));
            }
        }
        return new BW(seekPoint);
    }

    @Override // com.facebook.ads.redexgen.X.VN
    public final long A7c(long j) {
        return ((Math.max(0L, j - this.A04) * 1000000) * 8) / this.A00;
    }

    @Override // com.facebook.ads.redexgen.X.BX
    public final boolean A8d() {
        return this.A02 != -1;
    }
}
