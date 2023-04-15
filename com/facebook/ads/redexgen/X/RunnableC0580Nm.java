package com.facebook.ads.redexgen.X;

import java.util.Arrays;
/* renamed from: com.facebook.ads.redexgen.X.Nm  reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public class RunnableC0580Nm implements Runnable {
    public static byte[] A01;
    public final /* synthetic */ AnonymousClass82 A00;

    static {
        A01();
    }

    public static String A00(int i, int i2, int i3) {
        byte[] copyOfRange = Arrays.copyOfRange(A01, i, i + i2);
        for (int i4 = 0; i4 < copyOfRange.length; i4++) {
            copyOfRange[i4] = (byte) ((copyOfRange[i4] - i3) - 44);
        }
        return new String(copyOfRange);
    }

    public static void A01() {
        A01 = new byte[]{-44, -25, -30, -29, -19, -50, -22, -33, -9, -32, -33, -31, -23, -61, -16, -16, -19, -16};
    }

    public RunnableC0580Nm(AnonymousClass82 anonymousClass82) {
        this.A00 = anonymousClass82;
    }

    @Override // java.lang.Runnable
    public final void run() {
        if (C0480Jm.A02(this)) {
            return;
        }
        try {
            this.A00.A00.A0I(A00(0, 18, 82));
        } catch (Throwable th) {
            C0480Jm.A00(th, this);
        }
    }
}
