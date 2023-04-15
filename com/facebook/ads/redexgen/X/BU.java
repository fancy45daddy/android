package com.facebook.ads.redexgen.X;

import a.a.j;
import java.util.Arrays;
/* loaded from: assets/audience_network.dex */
public final class BU {
    public static byte[] A07;
    public static String[] A08 = {"nifcRfbON53gzILOru2Jo77QmnI", "", "YclbigHQdqatdiMMFtmKc8uyfonoIz5d", "Fd6hY4xBxF4WCtFqE3EitLo6QTPCTd6g", "7NOpBqgVdvht54TmD9wxn6mxDDhXMYkr", "z0qKCLYmn7ETA7vnAfdm8yGWNV", "FyibQKYxxp5WU6WV5DKbmcaitux", "b6Jzn18op"};
    public static final int[] A09;
    public static final int[] A0A;
    public static final int[] A0B;
    public static final int[] A0C;
    public static final int[] A0D;
    public static final int[] A0E;
    public static final String[] A0F;
    public int A00;
    public int A01;
    public int A02;
    public int A03;
    public int A04;
    public int A05;
    public String A06;

    public static String A01(int i, int i2, int i3) {
        byte[] copyOfRange = Arrays.copyOfRange(A07, i, i + i2);
        for (int i4 = 0; i4 < copyOfRange.length; i4++) {
            copyOfRange[i4] = (byte) ((copyOfRange[i4] - i3) - 101);
        }
        return new String(copyOfRange);
    }

    public static void A02() {
        A07 = new byte[]{-25, -5, -22, -17, -11, -75, -13, -10, -21, -19, 20, 40, 23, 28, 34, -30, 32, 35, 24, 26, -32, -1, -28, 0, 20, 3, 8, 14, -50, 12, 15, 4, 6, -52, -21, -47};
    }

    /* JADX WARN: Failed to parse debug info
    java.lang.ArrayIndexOutOfBoundsException: Index 18 out of bounds for length 18
    	at jadx.plugins.input.dex.sections.debuginfo.DebugInfoParser.process(DebugInfoParser.java:147)
    	at jadx.plugins.input.dex.sections.DexCodeReader.getDebugInfo(DexCodeReader.java:118)
    	at jadx.core.dex.nodes.MethodNode.getDebugInfo(MethodNode.java:567)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.visit(DebugInfoAttachVisitor.java:39)
     */
    public static boolean A04(int i, BU bu) {
        int i2;
        int i3;
        int i4;
        int i5;
        int i6;
        int i7;
        int i8;
        if ((i & (-2097152)) != -2097152 || (i2 = (i >>> 19) & 3) == 1 || (i3 = (i >>> 17) & 3) == 0 || (i4 = (i >>> 12) & 15) == 0 || i4 == 15 || (i5 = (i >>> 10) & 3) == 3) {
            return false;
        }
        int i9 = A0E[i5];
        if (i2 == 2) {
            i9 /= 2;
        } else if (i2 == 0) {
            i9 /= 4;
        }
        int i10 = (i >>> 9) & 1;
        if (i3 == 3) {
            if (i2 == 3) {
                int[] iArr = A09;
                int i11 = i4 - 1;
                if (A08[1].length() != 0) {
                    throw new RuntimeException();
                }
                A08[1] = "";
                i6 = iArr[i11];
            } else {
                i6 = A0D[i4 - 1];
            }
            i8 = (((i6 * 12000) / i9) + i10) * 4;
            i7 = 384;
        } else {
            if (i2 == 3) {
                i6 = i3 == 2 ? A0A[i4 - 1] : A0B[i4 - 1];
                i7 = 1152;
                i8 = ((144000 * i6) / i9) + i10;
            } else {
                i6 = A0C[i4 - 1];
                i7 = i3 == 1 ? 576 : 1152;
                i8 = (((i3 == 1 ? 72000 : 144000) * i6) / i9) + i10;
            }
        }
        bu.A03(i2, A0F[3 - i3], i8, i9, ((i >> 6) & 3) == 3 ? 1 : 2, i6 * 1000, i7);
        return true;
    }

    static {
        A02();
        A0F = new String[]{A01(10, 13, 78), A01(23, 13, 58), A01(0, 10, 33)};
        A0E = new int[]{44100, 48000, 32000};
        A09 = new int[]{32, 64, 96, 128, 160, 192, 224, 256, 288, 320, 352, 384, 416, 448};
        A0D = new int[]{32, 48, 56, 64, 80, 96, j.AppCompatTheme_windowActionBarOverlay, 128, 144, 160, 176, 192, 224, 256};
        A0A = new int[]{32, 48, 56, 64, 80, 96, j.AppCompatTheme_windowActionBarOverlay, 128, 160, 192, 224, 256, 320, 384};
        A0B = new int[]{32, 40, 48, 56, 64, 80, 96, j.AppCompatTheme_windowActionBarOverlay, 128, 160, 192, 224, 256, 320};
        A0C = new int[]{8, 16, 24, 32, 40, 48, 56, 64, 80, 96, j.AppCompatTheme_windowActionBarOverlay, 128, 144, 160};
    }

    public static int A00(int i) {
        int samplingRateIndex;
        int i2;
        int i3;
        int padding;
        int version;
        if ((i & (-2097152)) != -2097152 || (samplingRateIndex = (i >>> 19) & 3) == 1 || (i2 = (i >>> 17) & 3) == 0) {
            return -1;
        }
        int i4 = i >>> 12;
        if (A08[1].length() == 0) {
            A08[3] = "b2l2aaEsQdCjJRobZM3AI6pzp0fCTcXg";
            int i5 = i4 & 15;
            if (i5 == 0 || i5 == 15 || (i3 = (i >>> 10) & 3) == 3) {
                return -1;
            }
            int i6 = A0E[i3];
            if (samplingRateIndex == 2) {
                i6 /= 2;
            } else if (samplingRateIndex == 0) {
                i6 /= 4;
            }
            int i7 = (i >>> 9) & 1;
            if (i2 == 3) {
                if (samplingRateIndex == 3) {
                    int version2 = i5 - 1;
                    version = A09[version2];
                } else {
                    int version3 = i5 - 1;
                    version = A0D[version3];
                }
                int i8 = version * 12000;
                String[] strArr = A08;
                String str = strArr[6];
                String str2 = strArr[0];
                int bitrate = str.length();
                int version4 = str2.length();
                if (bitrate != version4) {
                    throw new RuntimeException();
                }
                String[] strArr2 = A08;
                strArr2[4] = "oe92MVCyaQQCtYlB63NB1CxE35U7HQE5";
                strArr2[2] = "cgh7vNrWE365WSGkm1qsPTYGoGRnPBar";
                int version5 = ((i8 / i6) + i7) * 4;
                return version5;
            }
            if (samplingRateIndex == 3) {
                if (i2 == 2) {
                    int version6 = i5 - 1;
                    padding = A0A[version6];
                } else {
                    int version7 = i5 - 1;
                    padding = A0B[version7];
                }
            } else {
                int[] iArr = A0C;
                String[] strArr3 = A08;
                String str3 = strArr3[6];
                String str4 = strArr3[0];
                int length = str3.length();
                int version8 = str4.length();
                if (length != version8) {
                    String[] strArr4 = A08;
                    strArr4[7] = "UFIEXEz4g";
                    strArr4[5] = "u6DSTaNAwdJldo1ZeFLEjMNQPO";
                    int version9 = i5 - 1;
                    padding = iArr[version9];
                } else {
                    A08[3] = "uh43YA7kDZkFV42L4FFbPgJOsOuCYlNO";
                    int version10 = i5 - 1;
                    padding = iArr[version10];
                }
            }
            String[] strArr5 = A08;
            String str5 = strArr5[4];
            String str6 = strArr5[2];
            int charAt = str5.charAt(29);
            int version11 = str6.charAt(29);
            if (charAt != version11) {
                String[] strArr6 = A08;
                strArr6[7] = "EFM751Hfm";
                strArr6[5] = "lrmHfueLLigjg4doS9Ay4icuU4";
                if (samplingRateIndex == 3) {
                    return ((144000 * padding) / i6) + i7;
                }
                return (((i2 == 1 ? 72000 : 144000) * padding) / i6) + i7;
            }
        }
        throw new RuntimeException();
    }

    private void A03(int i, String str, int i2, int i3, int i4, int i5, int i6) {
        this.A05 = i;
        this.A06 = str;
        this.A02 = i2;
        this.A03 = i3;
        this.A01 = i4;
        this.A00 = i5;
        this.A04 = i6;
    }
}
