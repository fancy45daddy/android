package com.facebook.ads.redexgen.X;

import androidx.annotation.Nullable;
/* renamed from: com.facebook.ads.redexgen.X.9T  reason: invalid class name */
/* loaded from: assets/audience_network.dex */
public final class C9T {
    public static final C9T A04 = new C9T(1.0f);
    public final float A00;
    public final float A01;
    public final boolean A02;
    public final int A03;

    public C9T(float f) {
        this(f, 1.0f, false);
    }

    public C9T(float f, float f2, boolean z) {
        H6.A03(f > 0.0f);
        H6.A03(f2 > 0.0f);
        this.A01 = f;
        this.A00 = f2;
        this.A02 = z;
        this.A03 = Math.round(1000.0f * f);
    }

    public final long A00(long j) {
        return this.A03 * j;
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        C9T c9t = (C9T) obj;
        return this.A01 == c9t.A01 && this.A00 == c9t.A00 && this.A02 == c9t.A02;
    }

    public final int hashCode() {
        int result = Float.floatToRawIntBits(this.A01);
        int result2 = this.A02 ? 1 : 0;
        return (((((17 * 31) + result) * 31) + Float.floatToRawIntBits(this.A00)) * 31) + result2;
    }
}
