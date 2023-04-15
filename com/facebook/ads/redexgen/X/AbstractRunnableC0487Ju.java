package com.facebook.ads.redexgen.X;

import a.a.j;
import android.annotation.SuppressLint;
import androidx.annotation.Nullable;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;
@SuppressLint({"CatchGeneralException"})
/* renamed from: com.facebook.ads.redexgen.X.Ju  reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public abstract class AbstractRunnableC0487Ju implements Runnable {
    public static byte[] A01;
    public static final AtomicBoolean A02;
    public static final AtomicBoolean A03;
    public static final AtomicReference<InterfaceC0478Jk> A04;
    @Nullable
    public final C0476Ji A00;

    public static String A01(int i, int i2, int i3) {
        byte[] copyOfRange = Arrays.copyOfRange(A01, i, i + i2);
        for (int i4 = 0; i4 < copyOfRange.length; i4++) {
            copyOfRange[i4] = (byte) ((copyOfRange[i4] ^ i3) ^ j.AppCompatTheme_windowFixedWidthMajor);
        }
        return new String(copyOfRange);
    }

    public static void A02() {
        A01 = new byte[]{124, 91, 64, 64, 79, 76, 66, 75, 14, 77, 92, 75, 79, 90, 75, 74, 0, 14, 122, 70, 92, 75, 79, 74, 20, 14};
    }

    public abstract void A06();

    static {
        A02();
        A02 = new AtomicBoolean();
        A03 = new AtomicBoolean(false);
        A04 = new AtomicReference<>();
    }

    public AbstractRunnableC0487Ju() {
        if (A03.get()) {
            this.A00 = C0492Jz.A01(new C0491Jy(A01(0, 26, 90) + Thread.currentThread().getName()));
            return;
        }
        this.A00 = null;
    }

    public static void A03(boolean z) {
        A03.set(z);
    }

    public static void A04(boolean z, InterfaceC0478Jk interfaceC0478Jk) {
        A02.set(z);
        A04.set(interfaceC0478Jk);
    }

    @Nullable
    public final C0476Ji A05() {
        return this.A00;
    }

    @Override // java.lang.Runnable
    public final void run() {
        if (C0480Jm.A02(this)) {
            return;
        }
        try {
            if (A03.get()) {
                C0492Jz.A03(this);
            }
            A06();
            if (A03.get()) {
                C0492Jz.A04(this);
            }
        } catch (Throwable th) {
            C0480Jm.A00(th, this);
        }
    }
}
