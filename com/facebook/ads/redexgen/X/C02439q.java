package com.facebook.ads.redexgen.X;

import androidx.annotation.Nullable;
/* renamed from: com.facebook.ads.redexgen.X.9q  reason: invalid class name and case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public final class C02439q {
    public final int A00;
    public final EK A01;

    public C02439q(int i, EK ek) {
        this.A00 = i;
        this.A01 = ek;
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        C02439q c02439q = (C02439q) obj;
        return this.A00 == c02439q.A00 && this.A01.equals(c02439q.A01);
    }

    public final int hashCode() {
        return (this.A00 * 31) + this.A01.hashCode();
    }
}
