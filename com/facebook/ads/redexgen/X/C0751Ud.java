package com.facebook.ads.redexgen.X;
/* renamed from: com.facebook.ads.redexgen.X.Ud  reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public final class C0751Ud implements BX {
    public long A00;
    public long A01;
    public final int A02;
    public final int A03;
    public final int A04;
    public final int A05;
    public final int A06;
    public final int A07;

    public C0751Ud(int i, int i2, int i3, int i4, int i5, int i6) {
        this.A06 = i;
        this.A07 = i2;
        this.A02 = i3;
        this.A04 = i4;
        this.A03 = i5;
        this.A05 = i6;
    }

    public final int A00() {
        return this.A07 * this.A03 * this.A06;
    }

    public final int A01() {
        return this.A04;
    }

    public final int A02() {
        return this.A05;
    }

    public final int A03() {
        return this.A06;
    }

    public final int A04() {
        return this.A07;
    }

    public final long A05(long j) {
        long positionOffset = Math.max(0L, j - this.A01);
        long j2 = 1000000 * positionOffset;
        long positionOffset2 = this.A02;
        return j2 / positionOffset2;
    }

    public final void A06(long j, long j2) {
        this.A01 = j;
        this.A00 = j2;
    }

    public final boolean A07() {
        return (this.A01 == 0 || this.A00 == 0) ? false : true;
    }

    @Override // com.facebook.ads.redexgen.X.BX
    public final long A6Q() {
        long numFrames = this.A07;
        return (1000000 * (this.A00 / this.A04)) / numFrames;
    }

    @Override // com.facebook.ads.redexgen.X.BX
    public final BW A7M(long j) {
        int i = this.A04;
        long positionOffset = i;
        long j2 = ((this.A02 * j) / 1000000) / positionOffset;
        long positionOffset2 = i;
        long j3 = j2 * positionOffset2;
        long positionOffset3 = i;
        long A0E = C0430Hl.A0E(j3, 0L, this.A00 - positionOffset3);
        long j4 = this.A01 + A0E;
        long A05 = A05(j4);
        BY seekPoint = new BY(A05, j4);
        if (A05 < j) {
            long j5 = this.A00;
            int i2 = this.A04;
            if (A0E != j5 - i2) {
                long seekTimeUs = i2 + j4;
                long seekPosition = A05(seekTimeUs);
                return new BW(seekPoint, new BY(seekPosition, seekTimeUs));
            }
        }
        return new BW(seekPoint);
    }

    @Override // com.facebook.ads.redexgen.X.BX
    public final boolean A8d() {
        return true;
    }
}
