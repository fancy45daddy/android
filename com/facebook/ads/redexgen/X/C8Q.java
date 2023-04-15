package com.facebook.ads.redexgen.X;

import java.io.IOException;
import java.util.Arrays;
/* renamed from: com.facebook.ads.redexgen.X.8Q  reason: invalid class name */
/* loaded from: assets/audience_network.dex */
public final class C8Q {
    public static byte[] A00;

    static {
        A03();
    }

    public static String A02(int i, int i2, int i3) {
        byte[] copyOfRange = Arrays.copyOfRange(A00, i, i + i2);
        for (int i4 = 0; i4 < copyOfRange.length; i4++) {
            copyOfRange[i4] = (byte) ((copyOfRange[i4] - i3) - 51);
        }
        return new String(copyOfRange);
    }

    public static void A03() {
        A00 = new byte[]{-2, -15, -17, -5, -2, -16, -21, -16, -19, 0, -19, -18, -19, -1, -15};
    }

    public static C8S A00(C0805Wi c0805Wi) {
        try {
            return new W9(c0805Wi);
        } catch (IOException e) {
            c0805Wi.A06().A8u(A02(0, 15, 89), C01877l.A2J, new C01887m(e));
            return new WC();
        }
    }

    public static D7 A01(C0805Wi c0805Wi) {
        return new D7(c0805Wi);
    }
}
