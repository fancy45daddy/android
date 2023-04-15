package com.facebook.ads.redexgen.X;

import a.a.j;
import android.net.Uri;
import androidx.annotation.Nullable;
import java.util.Arrays;
import java.util.Map;
/* renamed from: com.facebook.ads.redexgen.X.0g  reason: invalid class name and case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public final class C00140g {
    public static byte[] A00;
    public static final String A01;

    /* JADX WARN: Failed to parse debug info
    java.lang.ArrayIndexOutOfBoundsException: Index 22 out of bounds for length 21
    	at jadx.plugins.input.dex.sections.debuginfo.DebugInfoParser.startVar(DebugInfoParser.java:203)
    	at jadx.plugins.input.dex.sections.debuginfo.DebugInfoParser.process(DebugInfoParser.java:135)
    	at jadx.plugins.input.dex.sections.DexCodeReader.getDebugInfo(DexCodeReader.java:118)
    	at jadx.core.dex.nodes.MethodNode.getDebugInfo(MethodNode.java:567)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.visit(DebugInfoAttachVisitor.java:39)
     */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0090  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x00a0  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00cd  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x0115  */
    @androidx.annotation.Nullable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static com.facebook.ads.redexgen.X.AbstractC00130f A01(com.facebook.ads.redexgen.X.C0806Wj r14, com.facebook.ads.redexgen.X.IT r15, java.lang.String r16, @androidx.annotation.Nullable android.net.Uri r17, java.util.Map<java.lang.String, java.lang.String> r18, boolean r19, boolean r20) {
        /*
            Method dump skipped, instructions count: 286
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.ads.redexgen.X.C00140g.A01(com.facebook.ads.redexgen.X.Wj, com.facebook.ads.redexgen.X.IT, java.lang.String, android.net.Uri, java.util.Map, boolean, boolean):com.facebook.ads.redexgen.X.0f");
    }

    public static String A02(int i, int i2, int i3) {
        byte[] copyOfRange = Arrays.copyOfRange(A00, i, i + i2);
        for (int i4 = 0; i4 < copyOfRange.length; i4++) {
            copyOfRange[i4] = (byte) ((copyOfRange[i4] ^ i3) ^ 33);
        }
        return new String(copyOfRange);
    }

    public static void A03() {
        A00 = new byte[]{111, 84, 91, 88, 86, 95, 26, 78, 85, 26, 74, 91, 72, 73, 95, 26, 80, 73, 85, 84, 26, 94, 91, 78, 91, 26, 83, 84, 26, 123, 94, 123, 89, 78, 83, 85, 84, 124, 91, 89, 78, 85, 72, 67, 20, 19, 22, 3, 22, 82, 83, 78, 84, 73, 88, 65, 94, 75, 64, 113, 66, 71, 64, 69, 98, 115, 96, 97, 123, 124, 117, 27, 10, 24, 24, 31, 3, 25, 4, 30, 12, 3, 39, 32, 59, 38, 49, 47, 41, 46, 62, 51, 44, 33, 32, 42, 26, 48, 55, 41};
    }

    static {
        A03();
        A01 = C00140g.class.getSimpleName();
    }

    @Nullable
    public static AbstractC00130f A00(C0806Wj c0806Wj, IT it, String str, @Nullable Uri uri, Map<String, String> extraData) {
        return A01(c0806Wj, it, str, uri, extraData, true, false);
    }

    public static boolean A04(String str) {
        return A02(82, 5, j.AppCompatTheme_windowFixedWidthMinor).equalsIgnoreCase(str) || A02(55, 9, 15).equalsIgnoreCase(str);
    }
}
