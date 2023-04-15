package com.facebook.ads.redexgen.X;

import android.annotation.TargetApi;
import android.media.AudioAttributes;
import androidx.annotation.Nullable;
/* renamed from: com.facebook.ads.redexgen.X.9z  reason: invalid class name and case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public final class C02529z {
    public static final C02529z A04 = new Object() { // from class: com.facebook.ads.redexgen.X.9y
        public int A00 = 0;
        public int A01 = 0;
        public int A02 = 1;

        public final C02529z A00() {
            return new C02529z(this.A00, this.A01, this.A02);
        }
    }.A00();
    public AudioAttributes A00;
    public final int A01;
    public final int A02;
    public final int A03;

    public C02529z(int i, int i2, int i3) {
        this.A01 = i;
        this.A02 = i2;
        this.A03 = i3;
    }

    @TargetApi(21)
    public final AudioAttributes A00() {
        if (this.A00 == null) {
            this.A00 = new AudioAttributes.Builder().setContentType(this.A01).setFlags(this.A02).setUsage(this.A03).build();
        }
        return this.A00;
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        C02529z c02529z = (C02529z) obj;
        return this.A01 == c02529z.A01 && this.A02 == c02529z.A02 && this.A03 == c02529z.A03;
    }

    public final int hashCode() {
        int result = this.A01;
        int result2 = this.A03;
        return (((((17 * 31) + result) * 31) + this.A02) * 31) + result2;
    }
}
