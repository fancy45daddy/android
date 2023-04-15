package com.facebook.ads.redexgen.X;

import androidx.annotation.Nullable;
/* renamed from: com.facebook.ads.redexgen.X.Ef  reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public final class C0348Ef {
    @Nullable
    public C0348Ef A00;
    @Nullable
    public GH A01;
    public boolean A02;
    public final long A03;
    public final long A04;

    public C0348Ef(long j, int i) {
        this.A04 = j;
        this.A03 = i + j;
    }

    public final int A00(long j) {
        return ((int) (j - this.A04)) + this.A01.A00;
    }

    public final C0348Ef A01() {
        this.A01 = null;
        C0348Ef c0348Ef = this.A00;
        this.A00 = null;
        return c0348Ef;
    }

    public final void A02(GH gh, C0348Ef c0348Ef) {
        this.A01 = gh;
        this.A00 = c0348Ef;
        this.A02 = true;
    }
}
