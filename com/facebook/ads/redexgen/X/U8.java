package com.facebook.ads.redexgen.X;

import java.util.List;
/* loaded from: assets/audience_network.dex */
public final class U8 implements FK {
    public final List<FJ> A00;

    public U8(List<FJ> list) {
        this.A00 = list;
    }

    @Override // com.facebook.ads.redexgen.X.FK
    public final List<FJ> A69(long j) {
        return this.A00;
    }

    @Override // com.facebook.ads.redexgen.X.FK
    public final long A6Z(int i) {
        return 0L;
    }

    @Override // com.facebook.ads.redexgen.X.FK
    public final int A6a() {
        return 1;
    }

    @Override // com.facebook.ads.redexgen.X.FK
    public final int A6y(long j) {
        return -1;
    }
}
