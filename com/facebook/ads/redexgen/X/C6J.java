package com.facebook.ads.redexgen.X;

import a.a.j;
import android.annotation.SuppressLint;
import androidx.annotation.Nullable;
import java.util.Arrays;
import org.json.JSONObject;
/* renamed from: com.facebook.ads.redexgen.X.6J  reason: invalid class name */
/* loaded from: assets/audience_network.dex */
public final class C6J {
    public static int A00;
    public static int A01;
    public static int A02;
    public static int A03;
    public static int A04;
    public static int A05;
    public static int A06;
    public static int A07;
    public static byte[] A08;
    public static final String A09;

    public static String A00(int i, int i2, int i3) {
        byte[] copyOfRange = Arrays.copyOfRange(A08, i, i + i2);
        for (int i4 = 0; i4 < copyOfRange.length; i4++) {
            copyOfRange[i4] = (byte) ((copyOfRange[i4] - i3) - 62);
        }
        return new String(copyOfRange);
    }

    public static void A01() {
        A08 = new byte[]{-120, -90, -88, -83, -86, 101, -87, -82, -72, -80, 101, -85, -90, -82, -79, -70, -73, -86, 115, -63, -33, -31, -26, -29, -98, -30, -25, -15, -23, -98, -15, -13, -31, -31, -29, -15, -15, -84, -63, -33, -31, -26, -29, -98, -30, -19, -11, -20, -22, -19, -33, -30, -98, -28, -33, -25, -22, -13, -16, -29, -84, -127, -97, -95, -90, -93, 94, -90, -89, -78, 108, -72, -42, -40, -35, -38, -107, -30, -34, -24, -24, -93, -83, -80, -85, -81, -66, -79, -83, -64, -75, -62, -79, -85, -65, -75, -58, -79, -85, -82, -59, -64, -79, -65, -55, -52, -57, -53, -38, -51, -55, -36, -47, -34, -51, -57, -36, -31, -40, -51, -95, -92, -97, -90, -81, -78, -83, -95, -76, -97, -76, -71, -80, -91, 21, 24, 19, 38, 25, 37, 41, 25, 39, 40, 19, 29, 24, -79, -60, -60, -75, -67, -64, -60, -78, -80, -78, -73, -76, 24, 22, 24, 29, 26, 20, 24, 36, 35, 41, 26, 45, 41, -50, -55, -47, -44, -35, -38, -51, -57, -38, -51, -55, -37, -41, -42, 22, 26, 14, 20, 18, 11, 14, 0, 3, -2, 19, 8, 12, 4, 5, 2, -4};
    }

    static {
        A01();
        A09 = C6J.class.getSimpleName();
        A05 = C01877l.A0o;
        A06 = C01877l.A0s;
        A02 = C01877l.A0l;
        A01 = C01877l.A0k;
        A03 = C01877l.A0m;
        A00 = C01877l.A0i;
        A04 = C01877l.A0n;
        A07 = C01877l.A0t;
    }

    @SuppressLint({"CatchGeneralException"})
    public static void A02(C7G c7g, AnonymousClass69 anonymousClass69, int i, String str, long j) {
        if (!A06(c7g)) {
            return;
        }
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put(A00(j.AppCompatTheme_windowNoTitle, 14, 2), anonymousClass69.A00);
            jSONObject.put(A00(134, 13, j.AppCompatTheme_windowMinWidthMajor), anonymousClass69.A01);
            if (j > 0) {
                jSONObject.put(A00(191, 9, 97), L5.A06(System.currentTimeMillis() - j));
            }
            C01887m c01887m = new C01887m(str);
            c01887m.A05(jSONObject);
            c01887m.A03(1);
            c7g.A06().A8v(A00(154, 5, 17), i, c01887m);
        } catch (Throwable deLogException) {
            c7g.A06().A3R(deLogException);
        }
    }

    public static void A03(C7G c7g, C6E c6e, String str, int i, @Nullable String str2, @Nullable Long l, @Nullable Long l2) {
        if (A06(c7g)) {
            A05(c7g, c6e.A05, c6e.A06, c6e.A07, A00(186, 5, j.AppCompatTheme_windowActionBar), str, i, str2, l, l2, null);
        }
    }

    @SuppressLint({"CatchGeneralException"})
    public static void A04(C7G c7g, C6I c6i, boolean z) {
        if (!A06(c7g)) {
            return;
        }
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put(A00(j.AppCompatTheme_windowNoTitle, 14, 2), c6i.A01);
            jSONObject.put(A00(134, 13, j.AppCompatTheme_windowMinWidthMajor), c6i.A03);
            jSONObject.put(A00(j.AppCompatTheme_textColorAlertDialogListItem, 16, 42), c6i.A02);
            jSONObject.put(A00(159, 13, j.AppCompatTheme_windowMinWidthMinor), c6i.A00);
            if (ID.A1i(c7g)) {
                jSONObject.put(A00(200, 3, 82), c6i.A04);
            }
            String A002 = z ? A00(61, 10, 0) : A00(71, 11, 55);
            int i = z ? A05 : A06;
            C01887m c01887m = new C01887m(A002);
            c01887m.A05(jSONObject);
            c01887m.A03(1);
            c7g.A06().A8v(A00(154, 5, 17), i, c01887m);
        } catch (Throwable th) {
            c7g.A06().A3R(th);
        }
    }

    @SuppressLint({"CatchGeneralException"})
    public static void A05(C7G c7g, String str, String str2, String str3, String str4, String str5, int i, @Nullable String str6, @Nullable Long l, @Nullable Long l2, @Nullable Integer num) {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put(A00(j.AppCompatTheme_windowNoTitle, 14, 2), str);
            jSONObject.put(A00(134, 13, j.AppCompatTheme_windowMinWidthMajor), str2);
            jSONObject.put(A00(j.AppCompatTheme_textColorAlertDialogListItem, 16, 42), str4);
            if (str6 != null) {
                jSONObject.put(A00(172, 14, 42), str6);
            }
            if (l != null) {
                jSONObject.put(A00(82, 22, 14), String.valueOf(l));
            }
            if (l2 != null) {
                jSONObject.put(A00(191, 9, 97), String.valueOf(l2));
            }
            if (num != null) {
                jSONObject.put(A00(147, 7, 18), String.valueOf(num));
            }
            jSONObject.put(A00(159, 13, j.AppCompatTheme_windowMinWidthMinor), str5);
            if (ID.A1i(c7g)) {
                jSONObject.put(A00(200, 3, 82), str3);
            }
            String message = A00(19, 19, 64);
            if (i == A03) {
                message = A00(38, 23, 64);
            } else if (i == A01) {
                message = A00(0, 19, 7);
            }
            C01887m c01887m = new C01887m(message);
            c01887m.A05(jSONObject);
            c01887m.A03(1);
            c7g.A06().A8v(A00(154, 5, 17), i, c01887m);
        } catch (Throwable th) {
            c7g.A06().A3R(th);
        }
    }

    public static boolean A06(C7G c7g) {
        int A062;
        if (c7g.A03().A8N()) {
            A062 = 1;
        } else {
            A062 = IF.A06(c7g);
        }
        if (A062 == 0) {
            return false;
        }
        return A062 <= 0 || c7g.A07().A00() <= 1.0d / ((double) A062);
    }
}
