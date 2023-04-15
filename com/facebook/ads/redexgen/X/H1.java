package com.facebook.ads.redexgen.X;

import android.net.Uri;
import androidx.annotation.Nullable;
import java.util.Arrays;
/* loaded from: assets/audience_network.dex */
public final class H1 {
    public static byte[] A00;

    static {
        A03();
    }

    public static String A02(int i, int i2, int i3) {
        byte[] copyOfRange = Arrays.copyOfRange(A00, i, i + i2);
        for (int i4 = 0; i4 < copyOfRange.length; i4++) {
            copyOfRange[i4] = (byte) ((copyOfRange[i4] - i3) - 88);
        }
        return new String(copyOfRange);
    }

    public static void A03() {
        A00 = new byte[]{-40, -21, -30, -46, -33, -40, -31, -10, 9, 0, -16, 3, -10, -11, -6, 3};
    }

    public static long A00(H0 h0) {
        return h0.A5V(A02(0, 7, 27), -1L);
    }

    @Nullable
    public static Uri A01(H0 h0) {
        String A5X = h0.A5X(A02(7, 9, 57), null);
        if (A5X == null) {
            return null;
        }
        return Uri.parse(A5X);
    }

    public static void A04(H2 h2) {
        h2.A01(A02(7, 9, 57));
    }

    public static void A05(H2 h2, long j) {
        h2.A02(A02(0, 7, 27), j);
    }

    public static void A06(H2 h2, Uri uri) {
        h2.A03(A02(7, 9, 57), uri.toString());
    }
}
