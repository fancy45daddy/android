package com.facebook.ads.redexgen.X;

import a.a.j;
import androidx.annotation.Nullable;
import java.util.Arrays;
/* renamed from: com.facebook.ads.redexgen.X.61  reason: invalid class name */
/* loaded from: assets/audience_network.dex */
public final class AnonymousClass61 {
    @Nullable
    public static AnonymousClass62 A00;
    public static boolean A01;
    public static byte[] A02;

    public static String A00(int i, int i2, int i3) {
        byte[] copyOfRange = Arrays.copyOfRange(A02, i, i + i2);
        for (int i4 = 0; i4 < copyOfRange.length; i4++) {
            copyOfRange[i4] = (byte) ((copyOfRange[i4] - i3) - 25);
        }
        return new String(copyOfRange);
    }

    public static void A02() {
        A02 = new byte[]{-24, -21, -12, -23, -18, -13, -25, -8, -15};
    }

    static {
        A02();
        A01 = false;
        A00 = null;
    }

    public static void A01() {
        synchronized (AnonymousClass61.class) {
            if (A00 == null) {
                return;
            }
            C01887m c01887m = new C01887m(A00.ADv());
            c01887m.A03(1);
            C0805Wi A002 = C7F.A00();
            if (A002 != null) {
                A002.A06().A8u(A00(0, 9, j.AppCompatTheme_tooltipFrameBackground), 3401, c01887m);
            }
            A00.reset();
        }
    }

    public static void A03(final long j) {
        if (j > 0) {
            A00 = new C0814Wr();
            new Thread(j) { // from class: com.facebook.ads.redexgen.X.63
                public final long A00;

                {
                    this.A00 = j;
                    start();
                }

                @Override // java.lang.Thread, java.lang.Runnable
                public final void run() {
                    if (C0480Jm.A02(this)) {
                        return;
                    }
                    while (true) {
                        try {
                            try {
                                Thread.sleep(this.A00);
                            } catch (Throwable th) {
                                C0480Jm.A00(th, this);
                                return;
                            }
                        } catch (InterruptedException unused) {
                        }
                        AnonymousClass61.A01();
                    }
                }
            };
        }
    }
}
