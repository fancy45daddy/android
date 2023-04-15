package com.facebook.ads.redexgen.X;

import a.a.j;
import androidx.annotation.Nullable;
import java.util.Arrays;
/* loaded from: assets/audience_network.dex */
public final class BW {
    public static byte[] A02;
    public final BY A00;
    public final BY A01;

    static {
        A01();
    }

    public static String A00(int i, int i2, int i3) {
        byte[] copyOfRange = Arrays.copyOfRange(A02, i, i + i2);
        for (int i4 = 0; i4 < copyOfRange.length; i4++) {
            copyOfRange[i4] = (byte) ((copyOfRange[i4] - i3) - 78);
        }
        return new String(copyOfRange);
    }

    public static void A01() {
        A02 = new byte[]{-54, -66, 1, 22};
    }

    public BW(BY by) {
        this(by, by);
    }

    public BW(BY by, BY by2) {
        this.A00 = (BY) H6.A01(by);
        this.A01 = (BY) H6.A01(by2);
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        BW bw = (BW) obj;
        return this.A00.equals(bw.A00) && this.A01.equals(bw.A01);
    }

    public final int hashCode() {
        return (this.A00.hashCode() * 31) + this.A01.hashCode();
    }

    public final String toString() {
        String str;
        StringBuilder sb = new StringBuilder();
        sb.append(A00(2, 1, 88));
        sb.append(this.A00);
        if (this.A00.equals(this.A01)) {
            str = A00(0, 0, 98);
        } else {
            str = A00(0, 2, 80) + this.A01;
        }
        sb.append(str);
        sb.append(A00(3, 1, j.AppCompatTheme_toolbarStyle));
        return sb.toString();
    }
}
