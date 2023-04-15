package com.facebook.ads.redexgen.X;

import java.util.Collections;
import java.util.List;
import java.util.Map;
/* loaded from: assets/audience_network.dex */
public final class U5 implements FK {
    public final C0374Fh A00;
    public final Map<String, C0380Fn> A01;
    public final Map<String, C0375Fi> A02;
    public final long[] A03;

    public U5(C0374Fh c0374Fh, Map<String, C0380Fn> map, Map<String, C0375Fi> map2) {
        Map<String, C0380Fn> emptyMap;
        this.A00 = c0374Fh;
        this.A02 = map2;
        if (map != null) {
            emptyMap = Collections.unmodifiableMap(map);
        } else {
            emptyMap = Collections.emptyMap();
        }
        this.A01 = emptyMap;
        this.A03 = c0374Fh.A0F();
    }

    @Override // com.facebook.ads.redexgen.X.FK
    public final List<FJ> A69(long j) {
        return this.A00.A0D(j, this.A01, this.A02);
    }

    @Override // com.facebook.ads.redexgen.X.FK
    public final long A6Z(int i) {
        return this.A03[i];
    }

    @Override // com.facebook.ads.redexgen.X.FK
    public final int A6a() {
        return this.A03.length;
    }

    @Override // com.facebook.ads.redexgen.X.FK
    public final int A6y(long j) {
        int A0A = C0430Hl.A0A(this.A03, j, false, false);
        int index = this.A03.length;
        if (A0A < index) {
            return A0A;
        }
        return -1;
    }
}
