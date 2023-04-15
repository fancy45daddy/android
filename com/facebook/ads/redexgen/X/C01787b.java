package com.facebook.ads.redexgen.X;

import a.a.j;
import android.os.Process;
import android.text.TextUtils;
import androidx.annotation.Nullable;
import java.lang.Thread;
import java.util.Arrays;
import java.util.Map;
/* renamed from: com.facebook.ads.redexgen.X.7b  reason: invalid class name and case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public final class C01787b implements Thread.UncaughtExceptionHandler {
    public static byte[] A04;
    public final C0805Wi A00;
    public final InterfaceC01847i A01;
    public final Thread.UncaughtExceptionHandler A02;
    public final Map<String, String> A03;

    static {
        A01();
    }

    public static String A00(int i, int i2, int i3) {
        byte[] copyOfRange = Arrays.copyOfRange(A04, i, i + i2);
        for (int i4 = 0; i4 < copyOfRange.length; i4++) {
            copyOfRange[i4] = (byte) ((copyOfRange[i4] ^ i3) ^ 65);
        }
        return new String(copyOfRange);
    }

    public static void A01() {
        A04 = new byte[]{42, 28, 94, 122, 96, 96, 122, 125, 116, 51, 80, 124, 125, 103, 118, 107, 103, 11, 7, 5, 70, 14, 9, 11, 13, 10, 7, 7, 3, 70, 9, 12, 27, 71, 86, 69, 87, 76, 20, 18, 5, 19, 30, 23, 2, 80, 86, 65, 87, 90, 83, 70, 124, 64, 76, 71, 70};
    }

    public C01787b(@Nullable Thread.UncaughtExceptionHandler uncaughtExceptionHandler, C0805Wi c0805Wi, InterfaceC01777a interfaceC01777a) {
        this(uncaughtExceptionHandler, c0805Wi, interfaceC01777a, C01857j.A00());
    }

    public C01787b(@Nullable Thread.UncaughtExceptionHandler uncaughtExceptionHandler, C0805Wi c0805Wi, InterfaceC01777a interfaceC01777a, InterfaceC01847i interfaceC01847i) {
        this.A02 = uncaughtExceptionHandler;
        if (c0805Wi != null) {
            this.A00 = c0805Wi;
            this.A03 = interfaceC01777a.A7S(c0805Wi);
            this.A01 = interfaceC01847i;
            return;
        }
        throw new IllegalArgumentException(A00(2, 15, 82));
    }

    public static void A02() {
        try {
            Process.killProcess(Process.myPid());
        } catch (Throwable unused) {
        }
        try {
            System.exit(10);
        } catch (Throwable unused2) {
        }
    }

    private void A03(Thread thread, Throwable th) {
        Thread.UncaughtExceptionHandler uncaughtExceptionHandler = this.A02;
        if (uncaughtExceptionHandler != null) {
            uncaughtExceptionHandler.uncaughtException(thread, th);
        } else {
            A02();
        }
    }

    @Override // java.lang.Thread.UncaughtExceptionHandler
    public final void uncaughtException(Thread thread, Throwable th) {
        try {
            String A03 = C0513Kw.A03(this.A00, th);
            if (!TextUtils.isEmpty(A03)) {
                String stackTraceString = A00(17, 16, 41);
                if (A03.contains(stackTraceString)) {
                    Map<String, String> A02 = new C7Z(A03, this.A03).A02();
                    String A00 = A00(38, 7, 38);
                    String stackTraceString2 = A00(33, 5, j.AppCompatTheme_textAppearanceSearchResultSubtitle);
                    A02.put(A00, stackTraceString2);
                    Throwable A002 = AbstractRunnableC0475Jh.A00();
                    String A003 = A00(45, 12, 98);
                    if (A002 != th) {
                        String stackTraceString3 = A00(0, 1, 91);
                        A02.put(A003, stackTraceString3);
                    } else {
                        String stackTraceString4 = A00(1, 1, j.AppCompatTheme_tooltipForegroundColor);
                        A02.put(A003, stackTraceString4);
                    }
                    this.A01.AFX(new C01917p(this.A00.A07().A01(), this.A00.A07().A02(), A02), this.A00);
                    if (ID.A1T(this.A00)) {
                        ID.A0c(this.A00);
                    }
                }
            }
        } catch (Exception unused) {
        }
        A03(thread, th);
    }
}
