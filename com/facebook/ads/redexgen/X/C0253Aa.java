package com.facebook.ads.redexgen.X;

import com.facebook.ads.internal.exoplayer2.source.TrackGroup;
/* renamed from: com.facebook.ads.redexgen.X.Aa  reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public final class C0253Aa extends AbstractC0747Tz {
    public float A00;
    public int A01;
    public int A02;
    public long A03;
    public final float A04;
    public final float A05;
    public final long A06;
    public final long A07;
    public final long A08;
    public final long A09;
    public final GL A0A;
    public final H9 A0B;

    public C0253Aa(TrackGroup trackGroup, int[] iArr, GL gl, long j, long j2, long j3, float f, float f2, long j4, H9 h9) {
        super(trackGroup, iArr);
        this.A0A = gl;
        this.A07 = j * 1000;
        this.A06 = j2 * 1000;
        this.A08 = 1000 * j3;
        this.A04 = f;
        this.A05 = f2;
        this.A09 = j4;
        this.A0B = h9;
        this.A00 = 1.0f;
        this.A01 = 1;
        this.A03 = -9223372036854775807L;
        this.A02 = A00(Long.MIN_VALUE);
    }

    private int A00(long j) {
        long A5l = ((float) this.A0A.A5l()) * this.A04;
        int i = 0;
        for (int i2 = 0; i2 < super.A03; i2++) {
            if (j == Long.MIN_VALUE || !A00(i2, j)) {
                if (Math.round(A6f(i2).A04 * this.A00) <= A5l) {
                    return i2;
                }
                i = i2;
            }
        }
        return i;
    }

    @Override // com.facebook.ads.redexgen.X.AbstractC0747Tz, com.facebook.ads.redexgen.X.GC
    public final void A58() {
        this.A03 = -9223372036854775807L;
    }

    @Override // com.facebook.ads.redexgen.X.GC
    public final int A7O() {
        return this.A02;
    }

    @Override // com.facebook.ads.redexgen.X.AbstractC0747Tz, com.facebook.ads.redexgen.X.GC
    public final void ABj(float f) {
        this.A00 = f;
    }
}
