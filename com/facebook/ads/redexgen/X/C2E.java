package com.facebook.ads.redexgen.X;

import a.a.j;
import com.facebook.ads.internal.util.process.ProcessUtils;
import java.util.Arrays;
/* renamed from: com.facebook.ads.redexgen.X.2E  reason: invalid class name */
/* loaded from: assets/audience_network.dex */
public final class C2E {
    public static C2D A00;
    public static byte[] A01;

    static {
        A02();
    }

    public static String A01(int i, int i2, int i3) {
        byte[] copyOfRange = Arrays.copyOfRange(A01, i, i + i2);
        for (int i4 = 0; i4 < copyOfRange.length; i4++) {
            copyOfRange[i4] = (byte) ((copyOfRange[i4] ^ i3) ^ 45);
        }
        return new String(copyOfRange);
    }

    public static void A02() {
        A01 = new byte[]{58, 54, 52, 119, 63, 56, 58, 60, 59, 54, 54, 50, 119, 56, 61, 42, 119, 24, 29, 6, 11, 28, 9, 22, 11, 13, 16, 23, 30, 6, 26, 22, 23, 31, 16, 30};
    }

    public static C2D A00(C0805Wi c0805Wi) {
        if (A00 == null) {
            synchronized (C2D.class) {
                if (A00 == null) {
                    A00 = new C2D(new Y5(c0805Wi.getSharedPreferences(ProcessUtils.getProcessSpecificName(A01(0, 36, j.AppCompatTheme_windowFixedWidthMajor), c0805Wi), 0)));
                }
            }
        }
        return A00;
    }
}
