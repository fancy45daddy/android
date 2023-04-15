package com.facebook.ads.redexgen.X;

import a.a.j;
import android.annotation.SuppressLint;
import android.os.Handler;
import android.os.Looper;
import android.util.Log;
import android.util.SparseIntArray;
import androidx.annotation.Nullable;
import androidx.annotation.VisibleForTesting;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.concurrent.Executor;
import java.util.concurrent.Executors;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;
/* renamed from: com.facebook.ads.redexgen.X.7f  reason: invalid class name and case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public final class C01817f {
    @VisibleForTesting
    public static SparseIntArray A00;
    @VisibleForTesting
    public static Executor A01;
    public static boolean A02;
    public static boolean A03;
    public static byte[] A04;
    public static String[] A05 = {"lfqbOpCQc8eNVWWSF0ti", "aQ5ZOD0I", "7f7up0GBGRCd1p0enpCjG4lcj76", "dHBYXWbpLBdqteinvxBO5bOixoP3oT04", "DPNUUQYEctncegz3shse9IBb8Vdl47", "4q0rwT09y0cbatV7Yp", "6l64E9SK9p5G", "edaEIeRSccYYgTnyelVwcwdzoe4C2sfO"};
    public static final List<Integer> A06;
    public static final List<C01827g> A07;
    public static final AtomicBoolean A08;
    public static final AtomicInteger A09;
    public static final AtomicReference<C7d> A0A;
    public static final AtomicReference<InterfaceC01807e> A0B;
    public static final AtomicReference<Boolean> A0C;

    public static String A01(int i, int i2, int i3) {
        byte[] copyOfRange = Arrays.copyOfRange(A04, i, i + i2);
        for (int i4 = 0; i4 < copyOfRange.length; i4++) {
            copyOfRange[i4] = (byte) ((copyOfRange[i4] - i3) - 39);
        }
        return new String(copyOfRange);
    }

    public static void A04() {
        A04 = new byte[]{-93, -105, -40, -37, -37, -32, -21, -32, -26, -27, -40, -29, -64, -27, -35, -26, -105, -76, -105, -110, -122, -45, -53, -39, -39, -57, -51, -53, -122, -93, -122, 91, 79, -94, -92, -111, -93, -88, -97, -108, 114, -98, -109, -108, 79, 108, 79, 116, -66, -36, -23, -94, -17, -101, -25, -22, -30, -101, -65, -32, -35, -16, -30, -101, -64, -15, -32, -23, -17, -87, -101, -66, -22, -23, -17, -32, -13, -17, -101, -28, -18, -101, -23, -16, -25, -25, -87, 119, -93, -87, -94, -88, -103, -90, 110, 84, -79, -46, -49, -30, -44, -115, -48, -33, -50, -32, -43, -115, -49, -46, -48, -50, -30, -32, -46, -115, -36, -45, -115, -46, -29, -46, -37, -31, -115, -28, -42, -31, -43, -115, -32, -30, -49, -31, -26, -35, -46, -115, -86, -115, 108, -97, -118, -116, -116, -117, -116, -117, 71, -112, -107, 84, -108, -116, -108, -106, -103, -96, 71, -109, -106, -114, 71, -109, -112, -108, -112, -101, 72, 71, 115, -120, -102, -101, 71, -116, -99, -116, -107, -101, 97, 71, -108, -57, -78, -76, -65, -61, -72, -66, -67, 111, -109, -76, -79, -60, -74, 111, -108, -59, -76, -67, -61, 111, -58, -72, -61, -73, 111, -62, -60, -79, -61, -56, -65, -76, 111, -116, 111, -97, -46, -67, -65, -54, -50, -61, -55, -56, 122, -66, -49, -52, -61, -56, -63, 122, -58, -55, -63, -63, -61, -56, -63, 122, -66, -65, -68, -49, -63, 122, -65, -48, -65, -56, -50, -120, -27, 24, 3, 5, 16, 20, 9, 15, 14, -64, 19, 8, 15, 21, 12, 4, -64, 14, 15, 20, -64, 8, 1, 16, 16, 5, 14, -64, 8, 5, 18, 5, -50, -101, -105, -106, -54, -71, -66, -70, -61, -72, -70, -93, -70, -55, -52, -60, -57, -64, -28, 9, 1, 10, -69, -33, 0, -3, 16, 2, -69, -32, 17, 0, 9, 15, -69, 18, 4, 15, 3, -69, 14, 16, -3, 15, 20, 11, 0, -69, -40, -69, -53, -26, -26, -105, -28, -40, -27, -16, -105, -36, -19, -36, -27, -21, -22, -105, -26, -35, -105, -22, -20, -39, -21, -16, -25, -36, -105, -38, -26, -37, -36, -79, -105, -101, -99, -104, -99, -102, -83, -102, -104, -91, -88, -96, -96, -94, -89, -96, -21, -8, -3, -24, -19, -18, -3, -18, -20, -3, -14, -8, -9, -24, 0, -8, -24, -4, -14, -16, -9, -22, -11, -24, -19, -22, -3, -22, -24, -11, -8, -16, -16, -14, -9, -16, -62, -64, -62, -57, -60, -57, -56, -62, -49, -46, -54, -54, -52, -47, -54, -2, 13, 6, 6, -3, 4, -49, -42, -55, -59, -36, -57, -46, -49, -54, -57, -38, -49, -43, -44, -36, -45, -30, -27, -35, -32, -39};
    }

    static {
        A04();
        A00 = new SparseIntArray();
        A03 = false;
        A0B = new AtomicReference<>();
        A0A = new AtomicReference<>();
        A01 = Executors.newSingleThreadExecutor();
        A06 = Arrays.asList(10, 50, 100, 1000);
        A07 = Collections.synchronizedList(new ArrayList());
        A09 = new AtomicInteger();
        A08 = new AtomicBoolean();
        A0C = new AtomicReference<>();
        A02 = false;
    }

    public static int A00(String str, int i, C7G c7g) {
        if ((A01(457, 7, 71).equals(str) && C01877l.A1z == i) || A01(422, 5, 56).equals(str) || A01(437, 6, j.AppCompatTheme_windowActionModeOverlay).equals(str)) {
            return 200;
        }
        if (A01(386, 36, 98).equals(str)) {
            return 50;
        }
        if (A01(371, 15, 18).equals(str)) {
            return IF.A05(c7g);
        }
        if (A05[3].charAt(3) != 'Y') {
            throw new RuntimeException();
        }
        A05[7] = "MSKlPe4okWTggpeViHGlBF3nlCraGBz9";
        return -1;
    }

    public static /* synthetic */ List A02() {
        List<C01827g> list = A07;
        String[] strArr = A05;
        if (strArr[4].length() != strArr[0].length()) {
            A05[1] = "TV2BvPAOYvnRV0R5I88rwwfNZOOU8";
            return list;
        }
        throw new RuntimeException();
    }

    public static void A05(C7G c7g, int i, int i2) {
        c7g.A06().A8u(A01(427, 10, 60), C01877l.A2W, new C01887m(A01(338, 33, 80) + i, A01(87, 9, 13) + i2));
    }

    @Deprecated
    public static void A06(@Nullable C7G c7g, String str, int i, C01887m c01887m) {
        if (c7g == null) {
            A0F(new RuntimeException(A01(48, 39, 84)));
            return;
        }
        C7F.A01(c7g.A00());
        if (A02 && c01887m.A00() == 0) {
            A0D(new RuntimeException(A01(96, 44, 70) + str + A01(31, 16, 8) + i, c01887m));
        }
        try {
            if (A0I(c7g, str, i, Math.random(), c01887m)) {
                A09(c7g, str, i, c01887m);
            }
        } catch (Throwable t) {
            A0F(t);
        }
    }

    @SuppressLint({"CatchGeneralException"})
    @Deprecated
    public static void A07(C7G c7g, String str, int i, C01887m c01887m) {
        try {
            c01887m.A03(2);
            c01887m.A08(false);
            c01887m.A04(1);
            if (IF.A0Q(c7g)) {
                c01887m.A06(true);
            } else {
                c01887m.A06(false);
            }
            A06(c7g, str, i, c01887m);
        } catch (Throwable t) {
            A0F(t);
        }
    }

    @Deprecated
    public static void A08(C7G c7g, String str, int i, C01887m c01887m) {
        try {
            c01887m.A03(2);
            c01887m.A06(false);
            A06(c7g, str, i, c01887m);
        } catch (Throwable t) {
            A0F(t);
        }
    }

    public static void A09(C7G c7g, String str, int i, C01887m c01887m) {
        synchronized (C01817f.class) {
            if (!A03) {
                int A012 = IF.A01(c7g);
                int threshold = A09.getAndIncrement();
                if (threshold < A012 - 1) {
                    A07.add(new C01827g(str, i, c01887m));
                } else if (A09.get() == A012) {
                    List<C01827g> list = A07;
                    String A013 = A01(427, 10, 60);
                    int i2 = C01877l.A2T;
                    list.add(new C01827g(A013, i2, new C01887m(A01(140, 42, 0) + str + A01(47, 1, 19) + i)));
                }
            } else {
                A0A(c7g, str, i, c01887m, true);
            }
        }
    }

    public static void A0A(C7G c7g, String str, int i, C01887m c01887m, boolean z) {
        InterfaceC01807e interfaceC01807e = A0B.get();
        boolean z2 = interfaceC01807e != null && interfaceC01807e.A8b();
        if (A08.get() || z2) {
            int A002 = c01887m.A00();
            String A012 = A01(289, 17, 46);
            String A013 = A01(31, 16, 8);
            if (A002 == 0) {
                Log.e(A012, A01(182, 37, 40) + str + A013 + i, c01887m);
            } else {
                Log.i(A012, A01(306, 32, j.AppCompatTheme_windowFixedWidthMajor) + str + A013 + i + A01(19, 12, 63) + c01887m.getMessage() + A01(0, 19, 80) + c01887m.A02());
            }
        }
        C0797Wa c0797Wa = new C0797Wa(c7g, str, i, c01887m, interfaceC01807e);
        if (z) {
            A01.execute(c0797Wa);
        } else {
            c0797Wa.run();
        }
    }

    public static void A0C(C0805Wi c0805Wi, InterfaceC01807e interfaceC01807e, C7d c7d, boolean z) {
        A0A.set(c7d);
        A0B.set(interfaceC01807e);
        A08.set(z);
        synchronized (C01817f.class) {
            if (!A03) {
                A03 = true;
                A01.execute(new C0798Wb(c0805Wi));
            }
        }
    }

    public static void A0D(final RuntimeException runtimeException) {
        if (A02) {
            new Handler(Looper.getMainLooper()).post(new Runnable() { // from class: com.facebook.ads.redexgen.X.7c
                @Override // java.lang.Runnable
                public final void run() {
                    throw runtimeException;
                }
            });
        }
    }

    @Deprecated
    public static void A0E(Throwable th) {
        if (A02) {
            A0D(new RuntimeException(A01(256, 33, 121), th));
        }
    }

    public static void A0F(Throwable th) {
        Log.e(A01(289, 17, 46), A01(219, 37, 51), th);
        if (A02) {
            A0D(new RuntimeException(th));
        }
    }

    public static boolean A0H(C7G c7g) {
        Boolean shouldLogFunnelEvents = A0C.get();
        if (shouldLogFunnelEvents != null) {
            return shouldLogFunnelEvents.booleanValue();
        }
        return IF.A0A(c7g) != 0;
    }

    @SuppressLint({"CatchGeneralException"})
    @VisibleForTesting
    public static boolean A0I(C7G c7g, String str, int i, double d, C01887m c01887m) {
        double d2;
        int additionalDebugLoggingSamplingPercentage;
        int additionalDebugLoggingSamplingPercentage2;
        try {
            int A042 = IF.A04(c7g);
            if (A042 < 1) {
                return false;
            }
            HashMap<String, Integer> A0M = IF.A0M(c7g);
            String str2 = str + A01(47, 1, 19) + i;
            boolean contains = A0M.keySet().contains(str2);
            if (contains) {
                Integer num = A0M.get(str2);
                int additionalDebugLoggingSamplingPercentage3 = num != null ? num.intValue() : -1;
                if (additionalDebugLoggingSamplingPercentage3 == 0) {
                    return false;
                }
                if (additionalDebugLoggingSamplingPercentage3 > 0) {
                    return d <= 1.0d / ((double) additionalDebugLoggingSamplingPercentage3);
                }
                if (IF.A03(c7g) < 1) {
                    return false;
                }
                d2 = (A042 * additionalDebugLoggingSamplingPercentage2) / 10000.0d;
            } else if (!c01887m.A09()) {
                d2 = 0.0d;
            } else {
                d2 = A042 / 100.0d;
            }
            double A002 = c7g.A07().A00();
            if (A01(422, 5, 56).equals(str)) {
                if (c7g.A03().A8N()) {
                    return true;
                }
                int additionalDebugLoggingSamplingPercentage4 = IF.A06(c7g);
                if (additionalDebugLoggingSamplingPercentage4 == 0) {
                    return false;
                }
                if (additionalDebugLoggingSamplingPercentage4 > 0) {
                    double d3 = 1.0d / additionalDebugLoggingSamplingPercentage4;
                    if (contains) {
                        return A002 <= d3 * d2;
                    }
                    return A002 <= d3;
                }
            }
            if (A01(457, 7, 71).equals(str)) {
                if (C01877l.A1z == i) {
                    if (!A08.get()) {
                        additionalDebugLoggingSamplingPercentage = IF.A0E(c7g);
                    } else {
                        additionalDebugLoggingSamplingPercentage = 1;
                    }
                    if (additionalDebugLoggingSamplingPercentage == 0) {
                        return false;
                    }
                    if (additionalDebugLoggingSamplingPercentage > 0) {
                        double d4 = 1.0d / additionalDebugLoggingSamplingPercentage;
                        if (contains) {
                            return A002 <= d4 * d2;
                        }
                        int i2 = (A002 > d4 ? 1 : (A002 == d4 ? 0 : -1));
                        String[] strArr = A05;
                        if (strArr[4].length() != strArr[0].length()) {
                            String[] strArr2 = A05;
                            strArr2[4] = "UCVKOFALDBGOqUDhQrKLO3Bmgt3EZK";
                            strArr2[0] = "0av5HRm0swjvR429TUKJ";
                            return i2 <= 0;
                        }
                        throw new RuntimeException();
                    }
                }
            }
            if (A01(437, 6, j.AppCompatTheme_windowActionModeOverlay).equals(str)) {
                if (IF.A0S(c7g) && c01887m.A0A()) {
                    if (contains) {
                        return d >= 1.0d - d2;
                    }
                    return true;
                }
                Boolean bool = A0C.get();
                if (bool != null) {
                    return bool.booleanValue();
                }
                int additionalDebugLoggingSamplingPercentage5 = IF.A0A(c7g);
                if (additionalDebugLoggingSamplingPercentage5 == 0) {
                    A0C.set(false);
                    return false;
                } else if (additionalDebugLoggingSamplingPercentage5 > 0) {
                    double d5 = 1.0d / additionalDebugLoggingSamplingPercentage5;
                    if (contains) {
                        return A002 <= d5 * d2;
                    }
                    return A002 <= d5;
                }
            }
            if (A01(443, 14, 63).equals(str)) {
                if (c7g.A03().A8N()) {
                    return true;
                }
                int additionalDebugLoggingSamplingPercentage6 = IF.A0B(c7g);
                if (additionalDebugLoggingSamplingPercentage6 == 0) {
                    return false;
                }
                if (additionalDebugLoggingSamplingPercentage6 > 0) {
                    double d6 = 1.0d / additionalDebugLoggingSamplingPercentage6;
                    if (contains) {
                        return A002 <= d6 * d2;
                    }
                    return A002 <= d6;
                }
            }
            return d >= 1.0d - d2;
        } catch (Throwable t) {
            A0F(t);
            return false;
        }
    }

    @VisibleForTesting
    public static boolean A0J(C7G c7g, String str, int i, C01887m c01887m) {
        if (IF.A0P(c7g)) {
            int customLimit = A00.get(i);
            int eventsLimit = IF.A00(c7g);
            if (c01887m.A01() != -1) {
                eventsLimit = c01887m.A01();
            } else {
                int currentCounter = A00(str, i, c7g);
                if (eventsLimit < currentCounter) {
                    eventsLimit = currentCounter;
                }
            }
            if (customLimit >= eventsLimit) {
                if (A06.contains(Integer.valueOf(customLimit))) {
                    boolean A0B2 = c01887m.A0B();
                    if (A05[3].charAt(3) != 'Y') {
                        throw new RuntimeException();
                    }
                    String[] strArr = A05;
                    strArr[5] = "DtDXz8TrFQQZw1pkgy";
                    strArr[2] = "wKGFu6BM2pQR03pr0dyvmA98nTz";
                    if (A0B2) {
                        A05(c7g, i, customLimit);
                    }
                }
                A00.put(i, customLimit + 1);
                return true;
            }
            A00.put(i, customLimit + 1);
            return false;
        }
        return true;
    }
}
