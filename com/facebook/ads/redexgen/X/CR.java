package com.facebook.ads.redexgen.X;

import a.a.j;
import android.util.Log;
import java.util.Arrays;
/* loaded from: assets/audience_network.dex */
public final class CR {
    public static byte[] A00;
    public static String[] A01 = {"97CkWcXqrjyz7Qw2gcwWTf0UsRxLJkLY", "KmKspjn8yBhlsuKfHc5dD1By4HqwQES7", "tM7dEAyUMmHTAlM7QEv8AsYa9vZW08DW", "cnFzSmdUdmsM2SVrr3BadDXsi4nDpClW", "tMN7ldEkNAphgvj5y1u3W8bdaUauudV5", "yEIP5bnoN3ttum2IDgG23FKNyE9RzpP8", "N0hhc3G9NfQEzjT9vQvNmE", "ceiH1Z9CkPvfm4IJnpqvFzCjzC6OBPie"};

    /* JADX WARN: Failed to parse debug info
    java.lang.ArrayIndexOutOfBoundsException: Index 19 out of bounds for length 19
    	at jadx.plugins.input.dex.sections.debuginfo.DebugInfoParser.startVar(DebugInfoParser.java:203)
    	at jadx.plugins.input.dex.sections.debuginfo.DebugInfoParser.process(DebugInfoParser.java:125)
    	at jadx.plugins.input.dex.sections.DexCodeReader.getDebugInfo(DexCodeReader.java:118)
    	at jadx.core.dex.nodes.MethodNode.getDebugInfo(MethodNode.java:567)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.visit(DebugInfoAttachVisitor.java:39)
     */
    public static CQ A04(HV hv) throws C9R {
        A0A(1, hv, false);
        long A0K = hv.A0K();
        int A0E = hv.A0E();
        long A0K2 = hv.A0K();
        int A0A = hv.A0A();
        int A0A2 = hv.A0A();
        int A0A3 = hv.A0A();
        int A0E2 = hv.A0E();
        return new CQ(A0K, A0E, A0K2, A0A, A0A2, A0A3, (int) Math.pow(2.0d, A0E2 & 15), (int) Math.pow(2.0d, (A0E2 & 240) >> 4), (hv.A0E() & 1) > 0, Arrays.copyOf(hv.A00, hv.A07()));
    }

    public static String A05(int i, int i2, int i3) {
        byte[] copyOfRange = Arrays.copyOfRange(A00, i, i + i2);
        for (int i4 = 0; i4 < copyOfRange.length; i4++) {
            copyOfRange[i4] = (byte) ((copyOfRange[i4] ^ i3) ^ 55);
        }
        return new String(copyOfRange);
    }

    public static void A06() {
        A00 = new byte[]{35, 26, 7, 23, 28, 6, 32, 1, 28, 25, 74, 87, 95, 74, 76, 91, 74, 75, 15, 76, 71, 78, 93, 78, 76, 91, 74, 93, 92, 15, 8, 89, 64, 93, 77, 70, 92, 8, 100, 121, 113, 100, 98, 117, 100, 101, 33, 98, 110, 101, 100, 33, 99, 110, 110, 106, 33, 117, 110, 33, 114, 117, 96, 115, 117, 33, 118, 104, 117, 105, 33, 90, 49, 121, 52, 55, 45, 33, 49, 121, 53, 50, 45, 33, 49, 121, 53, 51, 92, 33, 96, 117, 33, 88, 69, 77, 88, 94, 73, 88, 89, 29, 85, 88, 92, 89, 88, 79, 29, 73, 68, 77, 88, 29, 47, 37, 38, 38, 59, 105, 61, 48, 57, 44, 105, 46, 59, 44, 40, 61, 44, 59, 105, 61, 33, 40, 39, 105, 120, 105, 39, 38, 61, 105, 45, 44, 42, 38, 45, 40, 43, 37, 44, 115, 105, 20, 0, 19, 31, 27, 28, 21, 82, 16, 27, 6, 82, 19, 20, 6, 23, 0, 82, 31, 29, 22, 23, 1, 82, 28, 29, 6, 82, 1, 23, 6, 82, 19, 1, 82, 23, 10, 2, 23, 17, 6, 23, 22, 87, 67, 80, 92, 88, 95, 86, 17, 83, 88, 69, 17, 84, 73, 65, 84, 82, 69, 84, 85, 17, 69, 94, 17, 83, 84, 17, 66, 84, 69, 66, 65, 65, 69, 91, 94, 14, 90, 87, 94, 75, 14, 73, 92, 75, 79, 90, 75, 92, 14, 90, 70, 79, 64, 14, 28, 14, 64, 65, 90, 14, 74, 75, 77, 65, 74, 79, 76, 66, 75, 20, 14, 38, 42, 59, 59, 34, 37, 44, 107, 63, 50, 59, 46, 107, 36, 63, 35, 46, 57, 107, 63, 35, 42, 37, 107, 123, 107, 37, 36, 63, 107, 56, 62, 59, 59, 36, 57, 63, 46, 47, 113, 107, 41, 53, 56, 58, 60, 49, 54, 53, 61, 60, 43, 121, 54, 63, 121, 45, 48, 52, 60, 121, 61, 54, 52, 56, 48, 55, 121, 45, 43, 56, 55, 42, 63, 54, 43, 52, 42, 121, 55, 54, 45, 121, 35, 60, 43, 54, 60, 61, 121, 54, 44, 45, 84, 67, 85, 79, 66, 83, 67, 114, 95, 86, 67, 6, 65, 84, 67, 71, 82, 67, 84, 6, 82, 78, 71, 72, 6, 20, 6, 79, 85, 6, 72, 73, 82, 6, 66, 67, 69, 73, 66, 71, 68, 74, 67, 113, 106, 37, 119, 96, 118, 96, 119, 115, 96, 97, 37, 103, 108, 113, 118, 37, 104, 112, 118, 113, 37, 103, 96, 37, Byte.MAX_VALUE, 96, 119, 106, 37, 100, 99, 113, 96, 119, 37, 104, 100, 117, 117, 108, 107, 98, 37, 102, 106, 112, 117, 105, 108, 107, 98, 37, 118, 113, 96, 117, 118, 3, 24, 24, 87, 4, 31, 24, 5, 3, 87, 31, 18, 22, 19, 18, 5, 77, 87};
    }

    static {
        A06();
    }

    public static int A00(int i) {
        int i2 = 0;
        while (i > 0) {
            i2++;
            String[] strArr = A01;
            String str = strArr[1];
            String str2 = strArr[0];
            int charAt = str.charAt(17);
            int val = str2.charAt(17);
            if (charAt != val) {
                throw new RuntimeException();
            }
            A01[3] = "aCblbtCs51TFarEUteijDfi4L2eIPPB5";
            i >>>= 1;
        }
        return i2;
    }

    public static long A01(long j, long j2) {
        return (long) Math.floor(Math.pow(j, 1.0d / j2));
    }

    /* JADX WARN: Incorrect condition in loop: B:18:0x004f */
    /* JADX WARN: Incorrect condition in loop: B:8:0x0025 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static com.facebook.ads.redexgen.X.CN A02(com.facebook.ads.redexgen.X.CL r12) throws com.facebook.ads.redexgen.X.C9R {
        /*
            Method dump skipped, instructions count: 264
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.ads.redexgen.X.CR.A02(com.facebook.ads.redexgen.X.CL):com.facebook.ads.redexgen.X.CN");
    }

    /* JADX WARN: Incorrect condition in loop: B:4:0x0023 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static com.facebook.ads.redexgen.X.CO A03(com.facebook.ads.redexgen.X.HV r9) throws com.facebook.ads.redexgen.X.C9R {
        /*
            r1 = 3
            r0 = 0
            A0A(r1, r9, r0)
            r3 = 7
            long r1 = r9.A0K()
            int r0 = (int) r1
            int r3 = r3 + 4
            java.lang.String r5 = r9.A0S(r0)
            int r0 = r5.length()
            int r3 = r3 + r0
            long r1 = r9.A0K()
            int r0 = (int) r1
            java.lang.String[] r4 = new java.lang.String[r0]
            int r6 = r3 + 4
            r3 = 0
        L20:
            long r7 = (long) r3
            int r0 = (r7 > r1 ? 1 : (r7 == r1 ? 0 : -1))
            if (r0 >= 0) goto L3c
            long r7 = r9.A0K()
            int r0 = (int) r7
            int r6 = r6 + 4
            java.lang.String r0 = r9.A0S(r0)
            r4[r3] = r0
            r0 = r4[r3]
            int r0 = r0.length()
            int r6 = r6 + r0
            int r3 = r3 + 1
            goto L20
        L3c:
            int r0 = r9.A0E()
            r3 = r0 & 1
            java.lang.String[] r1 = com.facebook.ads.redexgen.X.CR.A01
            r0 = 6
            r0 = r1[r0]
            int r1 = r0.length()
            r0 = 22
            if (r1 == r0) goto L55
            java.lang.RuntimeException r0 = new java.lang.RuntimeException
            r0.<init>()
            throw r0
        L55:
            java.lang.String[] r2 = com.facebook.ads.redexgen.X.CR.A01
            java.lang.String r1 = "uufDOlXzPXn7e2vsUzYQOzPoYhXCwGZ3"
            r0 = 7
            r2[r0] = r1
            if (r3 == 0) goto L66
            int r1 = r6 + 1
            com.facebook.ads.redexgen.X.CO r0 = new com.facebook.ads.redexgen.X.CO
            r0.<init>(r5, r4, r1)
            return r0
        L66:
            r2 = 198(0xc6, float:2.77E-43)
            r1 = 30
            r0 = 6
            java.lang.String r1 = A05(r2, r1, r0)
            com.facebook.ads.redexgen.X.9R r0 = new com.facebook.ads.redexgen.X.9R
            r0.<init>(r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.ads.redexgen.X.CR.A03(com.facebook.ads.redexgen.X.HV):com.facebook.ads.redexgen.X.CO");
    }

    public static void A07(int i, CL cl) throws C9R {
        int i2;
        int A02 = cl.A02(6) + 1;
        for (int i3 = 0; i3 < A02; i3++) {
            int A022 = cl.A02(16);
            if (A022 != 0) {
                Log.e(A05(0, 10, 66), A05(270, 41, 124) + A022);
            } else {
                if (cl.A04()) {
                    i2 = cl.A02(4) + 1;
                } else {
                    i2 = 1;
                }
                boolean A04 = cl.A04();
                if (A01[7].charAt(17) == '3') {
                    throw new RuntimeException();
                }
                String[] strArr = A01;
                strArr[1] = "2d5iZcFzMvct5JxqCcZ0JFUoYSVZwGiZ";
                strArr[0] = "NTut6iZFc5ITOEQfsc6CPFa8BEeWuqD1";
                if (A04) {
                    int j = cl.A02(8) + 1;
                    for (int i4 = 0; i4 < j; i4++) {
                        int mappingsCount = i - 1;
                        cl.A03(A00(mappingsCount));
                        int mappingsCount2 = i - 1;
                        cl.A03(A00(mappingsCount2));
                    }
                }
                int mappingsCount3 = cl.A02(2);
                if (mappingsCount3 == 0) {
                    if (i2 > 1) {
                        for (int mappingsCount4 = 0; mappingsCount4 < i; mappingsCount4++) {
                            cl.A03(4);
                        }
                    }
                    for (int mappingsCount5 = 0; mappingsCount5 < i2; mappingsCount5++) {
                        cl.A03(8);
                        cl.A03(8);
                        cl.A03(8);
                    }
                } else {
                    throw new C9R(A05(406, 58, 50));
                }
            }
        }
    }

    public static void A08(CL cl) throws C9R {
        int A02 = cl.A02(6) + 1;
        for (int j = 0; j < A02; j++) {
            int A022 = cl.A02(16);
            if (A022 == 0) {
                cl.A03(8);
                cl.A03(16);
                cl.A03(16);
                cl.A03(6);
                cl.A03(8);
                int floorCount = cl.A02(4);
                int floorCount2 = floorCount + 1;
                for (int i = 0; i < floorCount2; i++) {
                    cl.A03(8);
                }
            } else if (A022 != 1) {
                throw new C9R(A05(j.AppCompatTheme_windowFixedHeightMajor, 41, 126) + A022);
            } else {
                int j2 = cl.A02(5);
                int i2 = -1;
                int[] classDimensions = new int[j2];
                for (int floorCount3 = 0; floorCount3 < j2; floorCount3++) {
                    classDimensions[floorCount3] = cl.A02(4);
                    if (classDimensions[floorCount3] > i2) {
                        i2 = classDimensions[floorCount3];
                    }
                }
                int[] iArr = new int[i2 + 1];
                int partitions = 0;
                while (true) {
                    int length = iArr.length;
                    String[] strArr = A01;
                    String str = strArr[1];
                    String str2 = strArr[0];
                    int floorCount4 = str.charAt(17);
                    if (floorCount4 != str2.charAt(17)) {
                        throw new RuntimeException();
                    }
                    A01[5] = "G5LXKc5ovtw5smiaOglq2UN4xBS1bXIF";
                    if (partitions < length) {
                        iArr[partitions] = cl.A02(3) + 1;
                        int A023 = cl.A02(2);
                        if (A023 > 0) {
                            cl.A03(8);
                        }
                        for (int floorCount5 = 0; floorCount5 < (1 << A023); floorCount5++) {
                            cl.A03(8);
                        }
                        partitions++;
                    } else {
                        cl.A03(2);
                        int partitions2 = cl.A02(4);
                        int i3 = 0;
                        int floorCount6 = 0;
                        for (int i4 = 0; i4 < j2; i4++) {
                            i3 += iArr[classDimensions[i4]];
                            while (floorCount6 < i3) {
                                cl.A03(partitions2);
                                floorCount6++;
                            }
                        }
                    }
                }
            }
        }
    }

    public static void A09(CL cl) throws C9R {
        int A02 = cl.A02(6) + 1;
        for (int i = 0; i < A02; i++) {
            int residueCount = cl.A02(16);
            if (residueCount <= 2) {
                cl.A03(24);
                cl.A03(24);
                cl.A03(24);
                int A022 = cl.A02(6) + 1;
                cl.A03(8);
                int[] iArr = new int[A022];
                for (int i2 = 0; i2 < A022; i2++) {
                    int i3 = 0;
                    int residueCount2 = cl.A02(3);
                    if (cl.A04()) {
                        i3 = cl.A02(5);
                    }
                    iArr[i2] = (i3 * 8) + residueCount2;
                }
                for (int i4 = 0; i4 < A022; i4++) {
                    for (int i5 = 0; i5 < 8; i5++) {
                        int residueCount3 = iArr[i4];
                        if ((residueCount3 & (1 << i5)) != 0) {
                            cl.A03(8);
                        }
                    }
                }
            } else {
                throw new C9R(A05(363, 43, 17));
            }
        }
    }

    public static boolean A0A(int i, HV hv, boolean z) throws C9R {
        if (hv.A04() < 7) {
            if (z) {
                return false;
            }
            throw new C9R(A05(464, 18, 64) + hv.A04());
        } else if (hv.A0E() != i) {
            if (z) {
                return false;
            }
            throw new C9R(A05(93, 21, 10) + Integer.toHexString(i));
        } else if (hv.A0E() != 118 || hv.A0E() != 111 || hv.A0E() != 114 || hv.A0E() != 98 || hv.A0E() != 105 || hv.A0E() != 115) {
            if (z) {
                return false;
            }
            throw new C9R(A05(10, 28, 24));
        } else if (A01[6].length() != 22) {
            throw new RuntimeException();
        } else {
            String[] strArr = A01;
            strArr[1] = "3PFcydRg4Lp36gDWvcJwdxiXGhHOWBjb";
            strArr[0] = "aGBtdcQRGSwkEsynEcaJAL8zRbeII6kr";
            return true;
        }
    }

    public static CP[] A0B(CL cl) {
        int A02 = cl.A02(6) + 1;
        CP[] cpArr = new CP[A02];
        for (int windowType = 0; windowType < A02; windowType++) {
            boolean A04 = cl.A04();
            int A022 = cl.A02(16);
            int i = cl.A02(16);
            cpArr[windowType] = new CP(A04, A022, i, cl.A02(8));
        }
        return cpArr;
    }

    public static CP[] A0C(HV hv, int i) throws C9R {
        A0A(5, hv, false);
        int A0E = hv.A0E() + 1;
        CL cl = new CL(hv.A00);
        int numberOfBooks = hv.A06();
        cl.A03(numberOfBooks * 8);
        for (int numberOfBooks2 = 0; numberOfBooks2 < A0E; numberOfBooks2++) {
            A02(cl);
        }
        int numberOfBooks3 = cl.A02(6);
        int timeCount = numberOfBooks3 + 1;
        for (int i2 = 0; i2 < timeCount; i2++) {
            int numberOfBooks4 = cl.A02(16);
            if (numberOfBooks4 != 0) {
                throw new C9R(A05(311, 52, j.AppCompatTheme_viewInflaterClass));
            }
        }
        A08(cl);
        A09(cl);
        A07(i, cl);
        CP[] A0B = A0B(cl);
        if (cl.A04()) {
            return A0B;
        }
        throw new C9R(A05(155, 43, 69));
    }
}
