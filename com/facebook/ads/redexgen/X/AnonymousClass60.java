package com.facebook.ads.redexgen.X;

import a.a.j;
import java.util.Arrays;
/* renamed from: com.facebook.ads.redexgen.X.60  reason: invalid class name */
/* loaded from: assets/audience_network.dex */
public final class AnonymousClass60 {
    public static byte[] A06;
    public int A00;
    public long A01;
    public long A02;
    public final String A03;
    public final String A04;
    public final String A05;

    static {
        A01();
    }

    public static String A00(int i, int i2, int i3) {
        byte[] copyOfRange = Arrays.copyOfRange(A06, i, i + i2);
        for (int i4 = 0; i4 < copyOfRange.length; i4++) {
            copyOfRange[i4] = (byte) ((copyOfRange[i4] - i3) - 28);
        }
        return new String(copyOfRange);
    }

    public static void A01() {
        A06 = new byte[]{-83, -112};
    }

    public final synchronized String toString() {
        return this.A05 + A00(1, 1, 70) + this.A04 + this.A03 + A00(0, 1, j.AppCompatTheme_windowActionModeOverlay) + this.A00 + A00(0, 1, j.AppCompatTheme_windowActionModeOverlay) + this.A01 + A00(0, 1, j.AppCompatTheme_windowActionModeOverlay) + this.A02;
    }
}
