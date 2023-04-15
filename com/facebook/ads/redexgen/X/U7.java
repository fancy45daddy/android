package com.facebook.ads.redexgen.X;

import java.util.Collections;
import java.util.List;
/* loaded from: assets/audience_network.dex */
public final class U7 implements FK {
    public final long[] A00;
    public final FJ[] A01;

    public U7(FJ[] fjArr, long[] jArr) {
        this.A01 = fjArr;
        this.A00 = jArr;
    }

    @Override // com.facebook.ads.redexgen.X.FK
    public final List<FJ> A69(long j) {
        int A0B = C0430Hl.A0B(this.A00, j, true, false);
        if (A0B != -1) {
            FJ[] fjArr = this.A01;
            if (fjArr[A0B] != null) {
                return Collections.singletonList(fjArr[A0B]);
            }
        }
        return Collections.emptyList();
    }

    @Override // com.facebook.ads.redexgen.X.FK
    public final long A6Z(int i) {
        boolean z = true;
        H6.A03(i >= 0);
        if (i >= this.A00.length) {
            z = false;
        }
        H6.A03(z);
        return this.A00[i];
    }

    @Override // com.facebook.ads.redexgen.X.FK
    public final int A6a() {
        return this.A00.length;
    }

    @Override // com.facebook.ads.redexgen.X.FK
    public final int A6y(long j) {
        int A0A = C0430Hl.A0A(this.A00, j, false, false);
        int index = this.A00.length;
        if (A0A < index) {
            return A0A;
        }
        return -1;
    }
}
