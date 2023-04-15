package com.facebook.ads.redexgen.X;

import java.io.IOException;
/* renamed from: com.facebook.ads.redexgen.X.Ck  reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public final class C0303Ck {
    public final int A00;
    public final long A01;

    public C0303Ck(int i, long j) {
        this.A00 = i;
        this.A01 = j;
    }

    public static C0303Ck A00(BP bp, HV hv) throws IOException, InterruptedException {
        bp.AD0(hv.A00, 0, 8);
        hv.A0Y(0);
        int A08 = hv.A08();
        long size = hv.A0K();
        return new C0303Ck(A08, size);
    }
}
