package com.facebook.ads.redexgen.X;

import a.a.j;
import java.util.Arrays;
/* loaded from: assets/audience_network.dex */
public class KA implements Runnable {
    public static byte[] A01;
    public final /* synthetic */ C0806Wj A00;

    static {
        A01();
    }

    public static String A00(int i, int i2, int i3) {
        byte[] copyOfRange = Arrays.copyOfRange(A01, i, i + i2);
        for (int i4 = 0; i4 < copyOfRange.length; i4++) {
            copyOfRange[i4] = (byte) ((copyOfRange[i4] ^ i3) ^ j.AppCompatTheme_windowMinWidthMajor);
        }
        return new String(copyOfRange);
    }

    public static void A01() {
        A01 = new byte[]{97, 122, 125, 98, 97, 99, 104, 99, 116, 111, 101};
    }

    public KA(C0806Wj c0806Wj) {
        this.A00 = c0806Wj;
    }

    @Override // java.lang.Runnable
    public final void run() {
        if (C0480Jm.A02(this)) {
            return;
        }
        try {
            C01887m c01887m = new C01887m(A00(0, 4, 88));
            c01887m.A03(1);
            c01887m.A04(1);
            c01887m.A08(false);
            this.A00.A06().A8v(A00(4, 7, j.AppCompatTheme_windowActionBarOverlay), C01877l.A1Y, c01887m);
        } catch (Throwable th) {
            C0480Jm.A00(th, this);
        }
    }
}
