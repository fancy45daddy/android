package com.facebook.ads.redexgen.X;

import com.facebook.ads.internal.exoplayer2.source.TrackGroup;
/* loaded from: assets/audience_network.dex */
public final class U0 implements GB {
    public final float A00;
    public final float A01;
    public final int A02;
    public final int A03;
    public final int A04;
    public final long A05;
    public final GL A06;
    public final H9 A07;

    public U0(GL gl) {
        this(gl, 10000, 25000, 25000, 0.75f, 0.75f, 2000L, H9.A00);
    }

    public U0(GL gl, int i, int i2, int i3, float f, float f2, long j, H9 h9) {
        this.A06 = gl;
        this.A03 = i;
        this.A02 = i2;
        this.A04 = i3;
        this.A00 = f;
        this.A01 = f2;
        this.A05 = j;
        this.A07 = h9;
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Override // com.facebook.ads.redexgen.X.GB
    /* renamed from: A00 */
    public final C0253Aa A4U(TrackGroup trackGroup, int... iArr) {
        return new C0253Aa(trackGroup, iArr, this.A06, this.A03, this.A02, this.A04, this.A00, this.A01, this.A05, this.A07);
    }
}
