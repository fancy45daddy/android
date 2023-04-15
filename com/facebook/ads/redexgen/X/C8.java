package com.facebook.ads.redexgen.X;

import a.a.j;
import java.io.IOException;
import java.util.Arrays;
/* loaded from: assets/audience_network.dex */
public final class C8 {
    public static byte[] A00;
    public static String[] A01 = {"3vAPqkZTJ1VSon", "QUTM7SdDWyFumvZa4ixbAFeRkcyJbQtu", "xie3JnTyZ8PkMdNBWExCsKsV5Mn", "WzqQT7JP0s6wyXASN6VfDx7AAKIr1zQR", "8xy", "R913nsbqijjrVtiNLSpVoV0rL8armwI", "xGv", "6Jbm"};
    public static final int[] A02;

    public static String A00(int i, int i2, int i3) {
        byte[] copyOfRange = Arrays.copyOfRange(A00, i, i + i2);
        for (int i4 = 0; i4 < copyOfRange.length; i4++) {
            copyOfRange[i4] = (byte) ((copyOfRange[i4] ^ i3) ^ 63);
        }
        return new String(copyOfRange);
    }

    public static void A01() {
        A00 = new byte[]{75, 31, 74, 25, 123, 47, 122, 42, 111, 59, 57, 106, 17, 69, 69, 20, 58, 110, 121, 26, 78, 91, 31, 10, 94, 74, 15, 125, 4, 113, 16, 69, 60, 94, 40, 54, 79, 45, 43, 101, 123, 102, 126, 80, 71, 82, 0, 116, 38, 100, 50, 70, 75, 88, 31, 88, 70, 83, 1, 102, 124, 96, 61, 20, 14, 18, 78, 63, 37, 57, 98, 112, 106, 118, 44, 94, 68, 88, 1, 83, 73, 85, 87, 60, 51, 51, 62, 111, 114, 54, 51, 18, 15, 75, 77, 112, 117, 33, 33};
        if (A01[3].charAt(26) != 'I') {
            throw new RuntimeException();
        }
        A01[3] = "d1bTlggiE4vYEwLxNU00WUvkcSIuSb2g";
    }

    /* JADX WARN: Code restructure failed: missing block: B:28:0x0099, code lost:
        if (r13 != r16) goto L75;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x009b, code lost:
        r13 = r13 - r17.A7D();
        r0 = 8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x00ab, code lost:
        if (com.facebook.ads.redexgen.X.C8.A01[7].length() == 4) goto L78;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x00ad, code lost:
        r4 = r13 + r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x00b2, code lost:
        if (r13 != r16) goto L75;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x00b5, code lost:
        r4 = com.facebook.ads.redexgen.X.C8.A01;
        r4[6] = "BrR";
        r4[4] = "QIT";
        r4 = r13 + r0;
     */
    /* JADX WARN: Failed to parse debug info
    java.lang.ArrayIndexOutOfBoundsException: Index 19 out of bounds for length 19
    	at jadx.plugins.input.dex.sections.debuginfo.DebugInfoParser.process(DebugInfoParser.java:147)
    	at jadx.plugins.input.dex.sections.DexCodeReader.getDebugInfo(DexCodeReader.java:118)
    	at jadx.core.dex.nodes.MethodNode.getDebugInfo(MethodNode.java:567)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.visit(DebugInfoAttachVisitor.java:39)
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static boolean A05(com.facebook.ads.redexgen.X.BP r17, boolean r18) throws java.io.IOException, java.lang.InterruptedException {
        /*
            Method dump skipped, instructions count: 290
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.ads.redexgen.X.C8.A05(com.facebook.ads.redexgen.X.BP, boolean):boolean");
    }

    static {
        A01();
        A02 = new int[]{C0430Hl.A08(A00(79, 4, 5)), C0430Hl.A08(A00(59, 4, 48)), C0430Hl.A08(A00(63, 4, 66)), C0430Hl.A08(A00(67, 4, j.AppCompatTheme_textColorSearchUrl)), C0430Hl.A08(A00(71, 4, 38)), C0430Hl.A08(A00(75, 4, 8)), C0430Hl.A08(A00(43, 4, 14)), C0430Hl.A08(A00(55, 4, 15)), C0430Hl.A08(A00(51, 4, 17)), C0430Hl.A08(A00(87, 4, 61)), C0430Hl.A08(A00(91, 4, 64)), C0430Hl.A08(A00(0, 4, 71)), C0430Hl.A08(A00(4, 4, j.AppCompatTheme_windowMinWidthMinor)), C0430Hl.A08(A00(19, 4, 22)), C0430Hl.A08(A00(23, 4, 6)), C0430Hl.A08(A00(8, 4, 99)), C0430Hl.A08(A00(12, 4, 29)), C0430Hl.A08(A00(31, 4, 55)), C0430Hl.A08(A00(27, 4, 15)), C0430Hl.A08(A00(47, 4, 45)), C0430Hl.A08(A00(83, 4, j.AppCompatTheme_textColorAlertDialogListItem)), C0430Hl.A08(A00(35, 4, 68)), C0430Hl.A08(A00(95, 4, 62)), C0430Hl.A08(A00(39, 4, 23))};
    }

    public static boolean A02(int i) {
        if ((i >>> 8) == C0430Hl.A08(A00(16, 3, 54))) {
            return true;
        }
        int[] iArr = A02;
        String[] strArr = A01;
        if (strArr[6].length() != strArr[4].length()) {
            throw new RuntimeException();
        }
        A01[5] = "EPRlEFMBD24k0biyd";
        for (int i2 : iArr) {
            if (i2 == i) {
                return true;
            }
        }
        return false;
    }

    public static boolean A03(BP bp) throws IOException, InterruptedException {
        return A05(bp, true);
    }

    public static boolean A04(BP bp) throws IOException, InterruptedException {
        return A05(bp, false);
    }
}
