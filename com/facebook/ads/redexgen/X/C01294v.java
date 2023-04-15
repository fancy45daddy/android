package com.facebook.ads.redexgen.X;

import a.a.j;
import android.os.Debug;
import android.os.Handler;
import android.os.Looper;
import com.facebook.ads.internal.api.BuildConfigApi;
import java.util.Arrays;
/* renamed from: com.facebook.ads.redexgen.X.4v  reason: invalid class name and case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public final class C01294v extends Thread {
    public static byte[] A07;
    public static String[] A08 = {"22scehDHoaCOvZMprlsBZA8XDImDmfKB", "weKghC0VptQmI5ngiGaEXX", "Hf9H6", "FJiPG4ANJnN6", "MZm2fX9OE1lWAQp9g7i9e16yKVjr6LaO", "qv5p39sFFmKE2Upe5HhwzyNbLjT31UC6", "BSHanWyHkNGNXcGKwO9o06mFf", "6OihQTIk4xH7HyNYKpu4LMiaEL1fh7ec"};
    public static final String A09;
    public final int A00;
    public final Handler A01;
    public final C01314x A02;
    public final C0806Wj A03;
    public final Runnable A04;
    public volatile long A05;
    public volatile boolean A06;

    public static String A01(int i, int i2, int i3) {
        byte[] copyOfRange = Arrays.copyOfRange(A07, i, i + i2);
        for (int i4 = 0; i4 < copyOfRange.length; i4++) {
            copyOfRange[i4] = (byte) ((copyOfRange[i4] ^ i3) ^ j.AppCompatTheme_windowFixedWidthMajor);
        }
        return new String(copyOfRange);
    }

    public static void A02() {
        A07 = new byte[]{97, 101, 10, 102, 105, 117, 10, 99, 66, 83, 66, 68, 83, 72, 85, 103, 101, 110, 101, 114, 105, 99};
    }

    static {
        A02();
        A09 = C01294v.class.getName();
    }

    public C01294v(C0806Wj c0806Wj, C01314x c01314x) {
        this(c0806Wj, c01314x, ID.A07(c0806Wj));
    }

    public C01294v(C0806Wj c0806Wj, C01314x c01314x, int i) {
        this.A01 = new Handler(Looper.getMainLooper());
        this.A04 = new Runnable() { // from class: com.facebook.ads.redexgen.X.4u
            @Override // java.lang.Runnable
            public final void run() {
                if (C0480Jm.A02(this)) {
                    return;
                }
                try {
                    C01294v.this.A05 = 0L;
                    C01294v.this.A06 = false;
                } catch (Throwable th) {
                    C0480Jm.A00(th, this);
                }
            }
        };
        this.A05 = 0L;
        this.A06 = false;
        setName(A01(0, 15, 83));
        this.A00 = i;
        this.A03 = c0806Wj;
        this.A02 = c01314x;
    }

    @Override // java.lang.Thread, java.lang.Runnable
    public final void run() {
        if (C0480Jm.A02(this)) {
            return;
        }
        try {
            long j = this.A00;
            while (!isInterrupted()) {
                long interval = this.A05;
                String[] strArr = A08;
                if (strArr[1].length() != strArr[2].length()) {
                    String[] strArr2 = A08;
                    strArr2[3] = "QDJRY7exkP3l";
                    strArr2[6] = "zyOVtGNErBmKt3HrtbWcAlOC0";
                    boolean z = interval == 0;
                    this.A05 = j;
                    if (z) {
                        this.A01.post(this.A04);
                    }
                    try {
                        Thread.sleep(j);
                        long interval2 = this.A05;
                        if (interval2 != 0 && !this.A06 && !Debug.isDebuggerConnected()) {
                            if (this.A02.A05()) {
                                this.A03.A06().A8u(A01(15, 7, j.AppCompatTheme_windowFixedWidthMajor), C01877l.A1D, new C01887m(this.A02.A04()));
                            }
                            this.A06 = true;
                        }
                    } catch (InterruptedException unused) {
                        BuildConfigApi.isDebug();
                        return;
                    }
                } else {
                    throw new RuntimeException();
                }
            }
        } catch (Throwable th) {
            C0480Jm.A00(th, this);
        }
    }
}
