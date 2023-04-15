package com.facebook.ads.redexgen.X;

import android.content.Context;
import androidx.annotation.Nullable;
import java.io.PrintWriter;
import java.util.Arrays;
import java.util.Random;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
/* renamed from: com.facebook.ads.redexgen.X.Kw  reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public final class C0513Kw {
    public static byte[] A00;
    public static final Pattern A01;

    public static String A02(int i, int i2, int i3) {
        byte[] copyOfRange = Arrays.copyOfRange(A00, i, i + i2);
        for (int i4 = 0; i4 < copyOfRange.length; i4++) {
            copyOfRange[i4] = (byte) ((copyOfRange[i4] ^ i3) ^ 124);
        }
        return new String(copyOfRange);
    }

    public static void A07() {
        A00 = new byte[]{89, 45, 2, 90, 16, 5, 45, 2, 90, 42, 16, 92, 11, 95, 44, 90, 88, 42, 48, 92, 43, 44, 95, 91, 120, 78, 73, 73, 94, 85, 79, 27, 72, 79, 90, 88, 80, 27, 79, 73, 90, 88, 94, 33, 45, 47, 108, 36, 35, 33, 39, 32, 45, 45, 41, 108, 35, 38, 49};
    }

    static {
        A07();
        A01 = Pattern.compile(A02(0, 24, 13));
    }

    public static String A00() {
        return A06(new Exception(A02(24, 19, 71)), -1, -1, false);
    }

    public static String A01(int i) {
        if (i <= 0) {
            return null;
        }
        float rate = new Random().nextFloat();
        if (rate >= 1.0f / i) {
            return null;
        }
        return A00();
    }

    public static String A03(Context context, @Nullable Throwable th) {
        int A0H = ID.A0H(context);
        int maxStacktraceLines = ID.A02(context);
        return A06(th, A0H, maxStacktraceLines, ID.A15(context));
    }

    public static String A04(String str) {
        Matcher matcher = A01.matcher(str);
        if (matcher.matches()) {
            return matcher.group(1);
        }
        return str;
    }

    public static String A06(@Nullable Throwable th, int i, int i2, boolean z) {
        String A02 = A02(0, 0, 122);
        if (th == null) {
            return A02;
        }
        try {
            C0698Sb c0698Sb = new C0698Sb();
            InterfaceC0511Ku interfaceC0511Ku = c0698Sb;
            if (i2 >= 0) {
                interfaceC0511Ku = new SZ(interfaceC0511Ku, i2);
            }
            if (i >= 0) {
                interfaceC0511Ku = new SY(interfaceC0511Ku, i, i);
            }
            if (z) {
                interfaceC0511Ku = new C0697Sa(interfaceC0511Ku);
            }
            InterfaceC0511Ku input = new C0699Sc(c0698Sb, 1, interfaceC0511Ku);
            th.printStackTrace(new PrintWriter(new C0512Kv(input)));
            input.flush();
            return c0698Sb.toString();
        } catch (Exception unused) {
            return A02;
        }
    }

    public static boolean A08(C0510Kt c0510Kt) {
        String middle = c0510Kt.A02();
        if (middle == null) {
            return false;
        }
        if (A0A(middle)) {
            return true;
        }
        for (String middle2 : c0510Kt.A01()) {
            if (A0A(middle2)) {
                return true;
            }
        }
        for (String middle3 : c0510Kt.A00()) {
            if (A0A(middle3)) {
                return true;
            }
        }
        return false;
    }

    public static boolean A0A(String str) {
        return str.contains(A02(43, 16, 62));
    }
}
