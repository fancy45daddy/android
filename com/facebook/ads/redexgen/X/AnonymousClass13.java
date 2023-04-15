package com.facebook.ads.redexgen.X;

import a.a.j;
import android.net.Uri;
import android.text.TextUtils;
import android.util.Log;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
/* renamed from: com.facebook.ads.redexgen.X.13  reason: invalid class name */
/* loaded from: assets/audience_network.dex */
public final class AnonymousClass13 {
    public static byte[] A00;
    public static String[] A01 = {"qHmRz", "buvn2cesYrN8zmkoMAJdpkbnyQRY3iAF", "x7vS8I9TWcDRkC3QyQGWlMzhObF4g2wW", "AIjy2jeTbkREqnWnmOA9dVfWABJZ", "IfUpOWHYsX9n2UOxpamTmBNI3XVXxi7a", "s9Ktc", "3piv7SWQV7vtTtwTZRFeo4G9v1NaSSob", "iW7v8IxehIW1LC67DBoujqNPrB3dw9pM"};

    /* JADX WARN: Failed to parse debug info
    java.lang.ArrayIndexOutOfBoundsException: Index 62 out of bounds for length 62
    	at jadx.plugins.input.dex.sections.debuginfo.DebugInfoParser.startVar(DebugInfoParser.java:203)
    	at jadx.plugins.input.dex.sections.debuginfo.DebugInfoParser.process(DebugInfoParser.java:125)
    	at jadx.plugins.input.dex.sections.DexCodeReader.getDebugInfo(DexCodeReader.java:118)
    	at jadx.core.dex.nodes.MethodNode.getDebugInfo(MethodNode.java:567)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.visit(DebugInfoAttachVisitor.java:39)
     */
    public static AnonymousClass11 A01(C0806Wj c0806Wj, JSONObject jSONObject, String str, boolean z, int i, int i2) {
        ArrayList arrayList;
        String A02 = A02(349, 7, 70);
        if (jSONObject == null) {
            return new AnonymousClass11();
        }
        KS.A02(c0806Wj, A02(0, 23, 77));
        String optString = jSONObject.optString(A02(409, 10, 21));
        int optInt = jSONObject.optInt(A02(j.AppCompatTheme_windowFixedWidthMajor, 12, 73), 0);
        String optString2 = jSONObject.optString(A02(270, 13, j.AppCompatTheme_windowFixedWidthMinor));
        String A022 = C0500Kj.A02(jSONObject, A02(283, 12, 19));
        Uri A002 = TextUtils.isEmpty(A022) ? null : KM.A00(A022);
        String A023 = C0500Kj.A02(jSONObject, A02(128, 4, 27));
        String A012 = C0515Ky.A01(A023);
        String A024 = C0500Kj.A02(jSONObject, A02(j.AppCompatTheme_textAppearanceSearchResultSubtitle, 15, j.AppCompatTheme_windowFixedHeightMinor));
        String A025 = C0500Kj.A02(jSONObject, A02(523, 5, 61));
        String A026 = C0500Kj.A02(jSONObject, A02(515, 8, 84));
        String A027 = C0500Kj.A02(jSONObject, A02(295, 8, 64));
        String A028 = C0500Kj.A02(jSONObject, A02(469, 14, 125));
        String A029 = C0500Kj.A02(jSONObject, A02(333, 16, 98));
        String A0210 = C0500Kj.A02(jSONObject, A02(483, 21, 5));
        String A0211 = C0500Kj.A02(jSONObject, A02(87, 14, 42));
        String A0212 = C0500Kj.A02(jSONObject, A02(389, 20, j.AppCompatTheme_windowActionBarOverlay));
        String A0213 = C0500Kj.A02(jSONObject, A02(373, 16, 84));
        String A0214 = C0500Kj.A02(jSONObject, A02(356, 17, 77));
        String A0215 = C0500Kj.A02(jSONObject, A02(132, 14, 22));
        C0863Yq A013 = C0863Yq.A01(jSONObject, c0806Wj);
        C0460Ir A003 = C0460Ir.A00(jSONObject.optJSONObject(A02(303, 4, 93)));
        C0460Ir A004 = C0460Ir.A00(jSONObject.optJSONObject(A02(307, 5, j.AppCompatTheme_windowFixedWidthMajor)));
        C0461Is A005 = C0461Is.A00(jSONObject.optJSONObject(A02(504, 11, 93)));
        String A0216 = C0500Kj.A02(jSONObject, A02(528, 15, 77));
        boolean optBoolean = jSONObject.optBoolean(A02(255, 15, 84));
        boolean optBoolean2 = jSONObject.optBoolean(A02(236, 19, 6));
        int optInt2 = jSONObject.optInt(A02(444, 25, 93), 4);
        int optInt3 = jSONObject.optInt(A02(419, 25, 38), 0);
        int optInt4 = jSONObject.optInt(A02(607, 31, j.AppCompatTheme_textAppearanceSearchResultTitle), 0);
        int optInt5 = jSONObject.optInt(A02(638, 26, 67), 1000);
        JSONObject optJSONObject = jSONObject.optJSONObject(A02(53, 15, 6));
        C0460Ir A006 = optJSONObject != null ? C0460Ir.A00(optJSONObject) : null;
        String A0217 = C0500Kj.A02(jSONObject, A02(68, 19, 17));
        EnumC00150h A007 = EnumC00150h.A00(jSONObject.optString(A02(312, 21, 91)));
        JSONArray jSONArray = null;
        try {
            jSONArray = new JSONArray(jSONObject.optString(A02(219, 17, 21)));
        } catch (JSONException e) {
            c0806Wj.A06().A8u(A02, C01877l.A2B, new C01887m(e));
        }
        Collection<String> A014 = C00170j.A01(jSONArray);
        String A0218 = C0500Kj.A02(jSONObject, A02(598, 9, j.AppCompatTheme_tooltipForegroundColor));
        long optLong = jSONObject.optLong(A02(574, 24, 30), -1L);
        String A0219 = C0500Kj.A02(jSONObject, A02(565, 9, 56));
        String A0220 = A02(543, 22, 95);
        EnumC0465Iw enumC0465Iw = !jSONObject.has(A0220) ? EnumC0465Iw.A03 : jSONObject.optBoolean(A0220) ? EnumC0465Iw.A05 : EnumC0465Iw.A04;
        String A0221 = A02(190, 29, 72);
        if (A01[7].charAt(29) != '9') {
            throw new RuntimeException();
        }
        A01[7] = "1dt4CnIt66xCnA4CbnpWbYAL0az2V9Kq";
        boolean optBoolean3 = jSONObject.optBoolean(A0221);
        int optInt6 = jSONObject.optInt(A02(154, 36, j.AppCompatTheme_viewInflaterClass), 100);
        ArrayList arrayList2 = null;
        try {
            JSONArray optJSONArray = jSONObject.optJSONArray(A02(146, 8, 0));
            if (optJSONArray == null || optJSONArray.length() <= 0) {
                arrayList = null;
            } else {
                int length = optJSONArray.length();
                arrayList = new ArrayList(length);
                for (int i3 = 0; i3 < length; i3++) {
                    try {
                        arrayList.add(A01(c0806Wj, optJSONArray.getJSONObject(i3), str, true, i3, length));
                    } catch (JSONException e2) {
                        e = e2;
                        arrayList2 = arrayList;
                        c0806Wj.A06().A8u(A02, C01877l.A29, new C01887m(e));
                        Log.e(Z9.A0C, A02(23, 30, 50), e);
                        return new AnonymousClass11(A0217, A012, A023, A024, A025, A026, A027, A028, A029, A0210, A0211, A0212, A0213, A0214, A0215, A006, A013, A003, A004, A005, A0218, A0219, optLong, enumC0465Iw, z, i, i2, arrayList2, str, optString, optInt, optString2, A002, A0216, optBoolean, optBoolean2, optInt3, optInt2, optInt4, optInt5, A007, A014, optInt6, optBoolean3);
                    }
                }
            }
            arrayList2 = arrayList;
        } catch (JSONException e3) {
            e = e3;
        }
        return new AnonymousClass11(A0217, A012, A023, A024, A025, A026, A027, A028, A029, A0210, A0211, A0212, A0213, A0214, A0215, A006, A013, A003, A004, A005, A0218, A0219, optLong, enumC0465Iw, z, i, i2, arrayList2, str, optString, optInt, optString2, A002, A0216, optBoolean, optBoolean2, optInt3, optInt2, optInt4, optInt5, A007, A014, optInt6, optBoolean3);
    }

    public static String A02(int i, int i2, int i3) {
        byte[] copyOfRange = Arrays.copyOfRange(A00, i, i + i2);
        for (int i4 = 0; i4 < copyOfRange.length; i4++) {
            copyOfRange[i4] = (byte) ((copyOfRange[i4] - i3) - 112);
        }
        return new String(copyOfRange);
    }

    public static void A03() {
        A00 = new byte[]{-2, 50, 33, 38, 34, 43, 32, 34, -35, 11, 34, 49, 52, 44, 47, 40, -35, 9, 44, 30, 33, 34, 33, -9, 16, 3, 4, 14, 7, -62, 22, 17, -62, 18, 3, 20, 21, 7, -62, 5, 3, 20, 17, 23, 21, 7, 14, -62, 6, 3, 22, 3, -48, -41, -38, -43, -39, -34, -27, -33, -39, -37, -23, -43, -33, -39, -27, -28, -30, -27, -32, -28, -23, -16, -22, -28, -26, -12, -32, -19, -22, -17, -20, -32, -10, -13, -19, -5, -2, -7, 14, 12, -5, 8, 13, 6, -5, 14, 3, 9, 8, 68, 71, 89, 72, 85, 87, 76, 86, 72, 85, 66, 81, 68, 80, 72, 26, 39, 24, 37, 40, 32, 40, 24, 45, 50, 41, 30, -19, -6, -17, 4, -23, -25, -14, -14, -27, -6, -11, -27, -25, -23, -6, -17, -11, -12, -45, -47, -30, -33, -27, -29, -43, -36, 65, 77, 76, 82, 63, 71, 76, 67, 80, 61, 84, 71, 67, 85, 63, 64, 71, 74, 71, 82, 87, 61, 65, 70, 67, 65, 73, 61, 71, 76, 82, 67, 80, 84, 63, 74, 27, 39, 38, 44, 25, 33, 38, 29, 42, 23, 46, 33, 29, 47, 25, 26, 33, 36, 33, 44, 49, 23, 29, 38, 25, 26, 36, 29, 28, -23, -22, -7, -22, -24, -7, -18, -12, -13, -28, -8, -7, -9, -18, -13, -20, -8, -37, -28, -41, -40, -30, -37, -43, -23, -28, -41, -26, -23, -34, -27, -22, -43, -30, -27, -35, 41, 50, 37, 38, 48, 41, 35, 58, 45, 41, 59, 35, 48, 51, 43, 74, 83, 72, 87, 94, 85, 89, 74, 73, 68, 72, 85, 82, -23, -27, -28, -25, -30, -26, -14, -16, -16, -28, -15, -25, 24, 21, 17, 20, 28, 25, 30, 21, 54, 48, 60, 59, 77, 81, 69, 75, 73, 52, 57, 65, 44, 55, 52, 47, 44, 63, 52, 58, 57, 42, 45, 48, 51, 44, 65, 52, 58, 61, 62, 59, 64, 61, 49, 54, 55, 69, 53, 68, 59, 66, 70, 59, 65, 64, 38, 23, 40, 41, 31, 36, 29, 45, 30, 50, 48, 34, 28, 49, 47, 30, 43, 48, 41, 30, 49, 38, 44, 43, 52, 48, 37, 61, 35, 56, 54, 37, 50, 55, 48, 37, 56, 45, 51, 50, 80, 82, 79, 77, 79, 84, 69, 68, 63, 84, 82, 65, 78, 83, 76, 65, 84, 73, 79, 78, -9, -22, -10, -6, -22, -8, -7, -28, -18, -23, 9, 4, -9, 6, 9, -2, 5, 10, -11, -7, 5, 3, 6, 8, -5, 9, 9, -11, 7, 11, -9, 2, -1, 10, 15, 64, 59, 46, 61, 64, 53, 60, 65, 44, 57, 60, 52, 44, 49, 50, 57, 46, 70, 44, 64, 50, 48, 60, 59, 49, 96, 92, 80, 86, 78, 89, 76, 80, 92, 91, 97, 82, 101, 97, -24, -27, -28, -29, -24, -28, -25, -38, -39, -44, -23, -25, -42, -29, -24, -31, -42, -23, -34, -28, -29, 64, 65, 46, 63, 44, 63, 46, 65, 54, 59, 52, 55, 57, 38, 56, 45, 56, 48, 41, 33, 22, 33, 25, 18, 50, 48, 34, 33, 28, 47, 34, 45, 44, 47, 49, 28, 50, 47, 41, 69, 56, 51, 52, 62, 46, 48, 68, 67, 62, 63, 59, 48, 72, 46, 52, 61, 48, 49, 59, 52, 51, 30, 17, 12, 13, 23, 7, 21, 24, 12, 4, -9, -14, -13, -3, -19, -2, 0, -13, -6, -3, -17, -14, -19, 1, -9, 8, -13, -19, -16, 7, 2, -13, 1, 82, 69, 64, 65, 75, 59, 81, 78, 72, 76, 63, 59, 77, 55, 56, 63, 66, 63, 74, 79, 53, 57, 62, 59, 57, 65, 53, 63, 68, 63, 74, 63, 55, 66, 53, 58, 59, 66, 55, 79, 41, 28, 24, 42, 20, 21, 28, 31, 28, 39, 44, 18, 22, 27, 24, 22, 30, 18, 28, 33, 39, 24, 37, 41, 20, 31};
        String[] strArr = A01;
        if (strArr[1].charAt(29) != strArr[4].charAt(29)) {
            throw new RuntimeException();
        }
        String[] strArr2 = A01;
        strArr2[0] = "aYUm7";
        strArr2[5] = "aSssW";
    }

    static {
        A03();
    }

    public static AnonymousClass11 A00(C0806Wj c0806Wj, JSONObject jSONObject, String str) {
        return A01(c0806Wj, jSONObject, str, false, -1, 0);
    }
}
