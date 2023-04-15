package com.facebook.ads.redexgen.X;

import androidx.annotation.Nullable;
/* renamed from: com.facebook.ads.redexgen.X.9j  reason: invalid class name and case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public final class C02379j {
    public final long A00;
    public final long A01;
    public static final C02379j A04 = new C02379j(0, 0);
    public static final C02379j A02 = new C02379j(Long.MAX_VALUE, Long.MAX_VALUE);
    public static final C02379j A06 = new C02379j(Long.MAX_VALUE, 0);
    public static final C02379j A05 = new C02379j(0, Long.MAX_VALUE);
    public static final C02379j A03 = A04;

    public C02379j(long j, long j2) {
        H6.A03(j >= 0);
        H6.A03(j2 >= 0);
        this.A01 = j;
        this.A00 = j2;
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        C02379j c02379j = (C02379j) obj;
        return this.A01 == c02379j.A01 && this.A00 == c02379j.A00;
    }

    public final int hashCode() {
        return (((int) this.A01) * 31) + ((int) this.A00);
    }
}
