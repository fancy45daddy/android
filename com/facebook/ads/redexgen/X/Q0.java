package com.facebook.ads.redexgen.X;

import androidx.annotation.Nullable;
import java.util.Arrays;
/* loaded from: assets/audience_network.dex */
public abstract class Q0 {
    public static byte[] A05;
    public C0641Pw A00;
    public EnumC0644Pz A01;
    public String A02;
    public String A03;
    public byte[] A04;

    static {
        A01();
    }

    public static String A00(int i, int i2, int i3) {
        byte[] copyOfRange = Arrays.copyOfRange(A05, i, i + i2);
        for (int i4 = 0; i4 < copyOfRange.length; i4++) {
            copyOfRange[i4] = (byte) ((copyOfRange[i4] - i3) - 21);
        }
        return new String(copyOfRange);
    }

    public static void A01() {
        A05 = new byte[]{119};
    }

    public Q0(String str, @Nullable Q2 q2, C0641Pw c0641Pw) {
        this.A03 = A00(0, 0, 77);
        if (str != null) {
            this.A03 = str;
        }
        if (q2 != null && !q2.A06().isEmpty()) {
            this.A03 += A00(0, 1, 35) + q2.A06();
        }
        this.A00 = c0641Pw;
    }

    public final C0641Pw A02() {
        return this.A00;
    }

    public final EnumC0644Pz A03() {
        return this.A01;
    }

    public final String A04() {
        return this.A02;
    }

    public final String A05() {
        return this.A03;
    }

    public final byte[] A06() {
        return this.A04;
    }
}
