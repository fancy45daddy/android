package com.facebook.ads.redexgen.X;
/* renamed from: com.facebook.ads.redexgen.X.Jz  reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public final class C0492Jz {
    public static String[] A01 = {"vWOWhJ9TqiA1ty478f", "MWb8A3Nd6tPLcAimCp0hVAmYX6QHiaZm", "Xd3YBUkiMhOleC4V056rVyOXhinwtSii", "tT8mJINbcEXXPPmKiWyTepfA0JHaFg93", "WoudJsrKOqRuVhNYSdRTZjqc00A0B3WY", "YTheXaZSxrm1KPF5Yd", "huHeChgRkwF7QVPgKoMeW6tLhEc13T9K", "ASVM8zHOtJrSOKsDwpZwweqDqvgS8KFW"};
    public static final ThreadLocal<C0492Jz> A02 = new ThreadLocal<>();
    public final C0476Ji A00 = new C0476Ji();

    public static C0476Ji A00() {
        return A02().A00;
    }

    public static C0476Ji A01(C0491Jy c0491Jy) {
        C0476Ji currentStackTraces = new C0476Ji(A00());
        currentStackTraces.add(c0491Jy);
        return currentStackTraces;
    }

    public static C0492Jz A02() {
        C0492Jz c0492Jz = A02.get();
        String[] strArr = A01;
        if (strArr[6].charAt(1) != strArr[2].charAt(1)) {
            String[] strArr2 = A01;
            strArr2[7] = "JnfSkSuIf6osqUQGv4Nkh0Vi2QZsQFPV";
            strArr2[4] = "e9u3CRl6fKpCeCDR9nRPR0cml03xK1Bs";
            if (c0492Jz == null) {
                C0492Jz c0492Jz2 = new C0492Jz();
                A02.set(c0492Jz2);
                return c0492Jz2;
            }
            return c0492Jz;
        }
        throw new RuntimeException();
    }

    public static void A03(AbstractRunnableC0487Ju abstractRunnableC0487Ju) {
        C0476Ji A05 = abstractRunnableC0487Ju.A05();
        if (A05 != null) {
            C0476Ji createRunnableAsyncStackTrace = A02().A00;
            createRunnableAsyncStackTrace.addAll(A05);
        }
    }

    public static void A04(AbstractRunnableC0487Ju abstractRunnableC0487Ju) {
        C0476Ji A05 = abstractRunnableC0487Ju.A05();
        if (A05 != null) {
            C0476Ji createRunnableAsyncStackTrace = A02().A00;
            createRunnableAsyncStackTrace.removeAll(A05);
        }
    }
}
