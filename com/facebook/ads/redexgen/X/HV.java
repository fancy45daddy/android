package com.facebook.ads.redexgen.X;

import java.nio.charset.Charset;
import java.util.Arrays;
/* loaded from: assets/audience_network.dex */
public final class HV {
    public static byte[] A03;
    public static String[] A04 = {"HJCnnsvFRKCxDDAbEWuhDIcdg3xeT1pm", "aXWy8CvsRXCMVcJtmBA1wVRdgUuSFZpH", "GQPvM", "pDI65rPXKWggiakX8tUTXOsWDv9apWvH", "LM6A01RjpialbK5Oi", "vEfQavrNrAXrkYYeEOthMrPonFtv4Upj", "EEXi7u9hiAizt85cGACEO5SSNblzx1I5", "5Jpn3XfqvoPj"};
    public byte[] A00;
    public int A01;
    public int A02;

    public static String A00(int i, int i2, int i3) {
        byte[] copyOfRange = Arrays.copyOfRange(A03, i, i + i2);
        for (int i4 = 0; i4 < copyOfRange.length; i4++) {
            copyOfRange[i4] = (byte) ((copyOfRange[i4] - i3) - 24);
        }
        return new String(copyOfRange);
    }

    public static void A01() {
        A03 = new byte[]{-33, 4, 12, -9, 2, -1, -6, -74, -21, -22, -36, -61, -50, -74, 9, -5, 7, 11, -5, 4, -7, -5, -74, -7, 5, 4, 10, -1, 4, 11, -9, 10, -1, 5, 4, -74, -8, 15, 10, -5, -48, -74, -67, -30, -22, -43, -32, -35, -40, -108, -55, -56, -70, -95, -84, -108, -25, -39, -27, -23, -39, -30, -41, -39, -108, -38, -35, -26, -25, -24, -108, -42, -19, -24, -39, -82, -108, -113, -86, -85, 91, -99, -92, -81, 91, -87, -86, -81, 91, -75, -96, -83, -86, 117, 91, -49, -50, -64, -89, -78};
    }

    static {
        A01();
    }

    public HV() {
    }

    public HV(int i) {
        this.A00 = new byte[i];
        this.A01 = i;
    }

    public HV(byte[] bArr) {
        this.A00 = bArr;
        this.A01 = bArr.length;
    }

    public HV(byte[] bArr, int i) {
        this.A00 = bArr;
        this.A01 = i;
    }

    public final char A02() {
        byte[] bArr = this.A00;
        int i = this.A02;
        return (char) ((bArr[i + 1] & 255) | ((bArr[i] & 255) << 8));
    }

    public final double A03() {
        return Double.longBitsToDouble(A0L());
    }

    public final int A04() {
        return this.A01 - this.A02;
    }

    public final int A05() {
        byte[] bArr = this.A00;
        if (bArr == null) {
            return 0;
        }
        return bArr.length;
    }

    public final int A06() {
        return this.A02;
    }

    public final int A07() {
        return this.A01;
    }

    public final int A08() {
        byte[] bArr = this.A00;
        int i = this.A02;
        this.A02 = i + 1;
        int i2 = (bArr[i] & 255) << 24;
        int i3 = this.A02;
        this.A02 = i3 + 1;
        int i4 = i2 | ((bArr[i3] & 255) << 16);
        int i5 = this.A02;
        this.A02 = i5 + 1;
        int i6 = i4 | ((bArr[i5] & 255) << 8);
        int i7 = this.A02;
        this.A02 = i7 + 1;
        return (bArr[i7] & 255) | i6;
    }

    public final int A09() {
        byte[] bArr = this.A00;
        int i = this.A02;
        this.A02 = i + 1;
        int i2 = ((bArr[i] & 255) << 24) >> 8;
        int i3 = this.A02;
        this.A02 = i3 + 1;
        int i4 = i2 | ((bArr[i3] & 255) << 8);
        int i5 = this.A02;
        this.A02 = i5 + 1;
        return (bArr[i5] & 255) | i4;
    }

    public final int A0A() {
        byte[] bArr = this.A00;
        int i = this.A02;
        this.A02 = i + 1;
        int i2 = bArr[i] & 255;
        int i3 = this.A02;
        this.A02 = i3 + 1;
        int i4 = i2 | ((bArr[i3] & 255) << 8);
        int i5 = this.A02;
        this.A02 = i5 + 1;
        int i6 = i4 | ((bArr[i5] & 255) << 16);
        int i7 = this.A02;
        this.A02 = i7 + 1;
        return ((bArr[i7] & 255) << 24) | i6;
    }

    public final int A0B() {
        int A0A = A0A();
        if (A0A >= 0) {
            return A0A;
        }
        throw new IllegalStateException(A00(77, 18, 35) + A0A);
    }

    public final int A0C() {
        byte[] bArr = this.A00;
        int i = this.A02;
        this.A02 = i + 1;
        int i2 = bArr[i] & 255;
        int i3 = this.A02;
        this.A02 = i3 + 1;
        return ((bArr[i3] & 255) << 8) | i2;
    }

    public final int A0D() {
        int b2 = A0E();
        int b1 = A0E();
        int b4 = A0E();
        int b3 = A0E();
        int b22 = (b2 << 21) | (b1 << 14);
        int b12 = b4 << 7;
        return b22 | b12 | b3;
    }

    public final int A0E() {
        byte[] bArr = this.A00;
        int i = this.A02;
        this.A02 = i + 1;
        return bArr[i] & 255;
    }

    public final int A0F() {
        byte[] bArr = this.A00;
        int i = this.A02;
        this.A02 = i + 1;
        int i2 = (bArr[i] & 255) << 8;
        int i3 = this.A02;
        this.A02 = i3 + 1;
        int i4 = (bArr[i3] & 255) | i2;
        int result = this.A02;
        this.A02 = result + 2;
        return i4;
    }

    public final int A0G() {
        byte[] bArr = this.A00;
        int i = this.A02;
        this.A02 = i + 1;
        int i2 = (bArr[i] & 255) << 16;
        int i3 = this.A02;
        this.A02 = i3 + 1;
        int i4 = i2 | ((bArr[i3] & 255) << 8);
        int i5 = this.A02;
        this.A02 = i5 + 1;
        return (bArr[i5] & 255) | i4;
    }

    public final int A0H() {
        int A08 = A08();
        if (A08 >= 0) {
            return A08;
        }
        throw new IllegalStateException(A00(77, 18, 35) + A08);
    }

    public final int A0I() {
        byte[] bArr = this.A00;
        int i = this.A02;
        this.A02 = i + 1;
        int i2 = (bArr[i] & 255) << 8;
        int i3 = this.A02;
        this.A02 = i3 + 1;
        return (bArr[i3] & 255) | i2;
    }

    public final long A0J() {
        byte[] bArr = this.A00;
        int i = this.A02;
        this.A02 = i + 1;
        int i2 = this.A02;
        this.A02 = i2 + 1;
        int i3 = this.A02;
        this.A02 = i3 + 1;
        int i4 = this.A02;
        this.A02 = i4 + 1;
        int i5 = this.A02;
        this.A02 = i5 + 1;
        int i6 = this.A02;
        this.A02 = i6 + 1;
        int i7 = this.A02;
        this.A02 = i7 + 1;
        int i8 = this.A02;
        this.A02 = i8 + 1;
        return (bArr[i] & 255) | ((bArr[i2] & 255) << 8) | ((bArr[i3] & 255) << 16) | ((bArr[i4] & 255) << 24) | ((bArr[i5] & 255) << 32) | ((bArr[i6] & 255) << 40) | ((bArr[i7] & 255) << 48) | ((255 & bArr[i8]) << 56);
    }

    public final long A0K() {
        byte[] bArr = this.A00;
        int i = this.A02;
        this.A02 = i + 1;
        int i2 = this.A02;
        this.A02 = i2 + 1;
        int i3 = this.A02;
        this.A02 = i3 + 1;
        int i4 = this.A02;
        this.A02 = i4 + 1;
        return (bArr[i] & 255) | ((bArr[i2] & 255) << 8) | ((bArr[i3] & 255) << 16) | ((255 & bArr[i4]) << 24);
    }

    public final long A0L() {
        byte[] bArr = this.A00;
        int i = this.A02;
        this.A02 = i + 1;
        int i2 = this.A02;
        this.A02 = i2 + 1;
        int i3 = this.A02;
        this.A02 = i3 + 1;
        int i4 = this.A02;
        this.A02 = i4 + 1;
        int i5 = this.A02;
        this.A02 = i5 + 1;
        int i6 = this.A02;
        this.A02 = i6 + 1;
        int i7 = this.A02;
        this.A02 = i7 + 1;
        int i8 = this.A02;
        this.A02 = i8 + 1;
        return ((bArr[i] & 255) << 56) | ((bArr[i2] & 255) << 48) | ((bArr[i3] & 255) << 40) | ((bArr[i4] & 255) << 32) | ((bArr[i5] & 255) << 24) | ((bArr[i6] & 255) << 16) | ((bArr[i7] & 255) << 8) | (255 & bArr[i8]);
    }

    public final long A0M() {
        byte[] bArr = this.A00;
        int i = this.A02;
        this.A02 = i + 1;
        int i2 = this.A02;
        this.A02 = i2 + 1;
        int i3 = this.A02;
        this.A02 = i3 + 1;
        int i4 = this.A02;
        this.A02 = i4 + 1;
        return ((bArr[i] & 255) << 24) | ((bArr[i2] & 255) << 16) | ((bArr[i3] & 255) << 8) | (255 & bArr[i4]);
    }

    public final long A0N() {
        long A0L = A0L();
        if (A0L >= 0) {
            return A0L;
        }
        throw new IllegalStateException(A00(77, 18, 35) + A0L);
    }

    public final long A0O() {
        int i = 0;
        byte[] bArr = this.A00;
        int length = this.A02;
        long j = bArr[length];
        int i2 = 7;
        while (true) {
            if (i2 < 0) {
                break;
            }
            int length2 = 1 << i2;
            int i3 = ((length2 & j) > 0L ? 1 : ((length2 & j) == 0L ? 0 : -1));
            if (A04[3].charAt(7) == 'H') {
                throw new RuntimeException();
            }
            A04[7] = "lhGNf9ZIwuKG";
            if (i3 != 0) {
                i2--;
            } else if (i2 < 6) {
                int length3 = 1 << i2;
                j &= length3 - 1;
                i = 7 - i2;
            } else if (i2 == 7) {
                i = 1;
            }
        }
        if (i != 0) {
            int x = 1;
            while (x < i) {
                byte[] bArr2 = this.A00;
                int length4 = this.A02;
                byte b2 = bArr2[length4 + x];
                if ((b2 & 192) == 128) {
                    long j2 = j << 6;
                    String[] strArr = A04;
                    String str = strArr[5];
                    String str2 = strArr[6];
                    int charAt = str.charAt(9);
                    int length5 = str2.charAt(9);
                    if (charAt != length5) {
                        A04[7] = "BvJ8XuqLfWkj";
                        int length6 = b2 & 63;
                        j = j2 | length6;
                        x += 0;
                    } else {
                        A04[7] = "bl64THqm1YbP";
                        int length7 = b2 & 63;
                        j = j2 | length7;
                        x++;
                    }
                } else {
                    throw new NumberFormatException(A00(0, 42, 126) + j);
                }
            }
            int length8 = this.A02;
            this.A02 = length8 + i;
            return j;
        }
        throw new NumberFormatException(A00(42, 35, 92) + j);
    }

    /* JADX WARN: Code restructure failed: missing block: B:33:0x0096, code lost:
        if (r0 == r3) goto L35;
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x0098, code lost:
        return r4;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x00a2, code lost:
        if (r0 == r3) goto L35;
     */
    /* JADX WARN: Incorrect condition in loop: B:12:0x002c */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.String A0P() {
        /*
            r6 = this;
            int r0 = r6.A04()
            if (r0 != 0) goto L28
            r3 = 0
            java.lang.String[] r1 = com.facebook.ads.redexgen.X.HV.A04
            r0 = 3
            r1 = r1[r0]
            r0 = 7
            char r1 = r1.charAt(r0)
            r0 = 72
            if (r1 == r0) goto L22
            java.lang.String[] r2 = com.facebook.ads.redexgen.X.HV.A04
            java.lang.String r1 = "Lp13SRVWSAlchtHB237WPpHnlSgF4gaJ"
            r0 = 5
            r2[r0] = r1
            java.lang.String r1 = "rKST0dS6uAv5sauBNsTeIX1rNmAgPgcE"
            r0 = 6
            r2[r0] = r1
            return r3
        L22:
            java.lang.RuntimeException r0 = new java.lang.RuntimeException
            r0.<init>()
            throw r0
        L28:
            int r5 = r6.A02
        L2a:
            int r0 = r6.A01
            if (r5 >= r0) goto L3b
            byte[] r0 = r6.A00
            r0 = r0[r5]
            boolean r0 = com.facebook.ads.redexgen.X.C0430Hl.A0d(r0)
            if (r0 != 0) goto L3b
            int r5 = r5 + 1
            goto L2a
        L3b:
            int r4 = r6.A02
            int r0 = r5 - r4
            r3 = 3
            if (r0 < r3) goto L5d
            byte[] r2 = r6.A00
            r1 = r2[r4]
            r0 = -17
            if (r1 != r0) goto L5d
            int r0 = r4 + 1
            r1 = r2[r0]
            r0 = -69
            if (r1 != r0) goto L5d
            int r0 = r4 + 2
            r1 = r2[r0]
            r0 = -65
            if (r1 != r0) goto L5d
            int r4 = r4 + r3
            r6.A02 = r4
        L5d:
            byte[] r2 = r6.A00
            int r1 = r6.A02
            int r0 = r5 - r1
            java.lang.String r4 = com.facebook.ads.redexgen.X.C0430Hl.A0R(r2, r1, r0)
            r6.A02 = r5
            int r2 = r6.A02
            int r3 = r6.A01
            if (r2 != r3) goto L70
            return r4
        L70:
            byte[] r0 = r6.A00
            r1 = r0[r2]
            r0 = 13
            if (r1 != r0) goto La5
            int r0 = r2 + 1
            r6.A02 = r0
            java.lang.String[] r1 = com.facebook.ads.redexgen.X.HV.A04
            r0 = 2
            r0 = r1[r0]
            int r1 = r0.length()
            r0 = 5
            if (r1 == r0) goto L99
            java.lang.String[] r2 = com.facebook.ads.redexgen.X.HV.A04
            java.lang.String r1 = "7WLwSFEg60VT5h1w5xCSRnUKgnyD8yNS"
            r0 = 1
            r2[r0] = r1
            java.lang.String r1 = "aRAvn4znRhpfiIQyr1UPz3MngzOxDO2U"
            r0 = 0
            r2[r0] = r1
            int r0 = r6.A02
            if (r0 != r3) goto La5
        L98:
            return r4
        L99:
            java.lang.String[] r2 = com.facebook.ads.redexgen.X.HV.A04
            java.lang.String r1 = "q7voCOqIwzwrpNWuoMFHLwpJUMmmskbB"
            r0 = 3
            r2[r0] = r1
            int r0 = r6.A02
            if (r0 != r3) goto La5
            goto L98
        La5:
            byte[] r0 = r6.A00
            int r2 = r6.A02
            r1 = r0[r2]
            r0 = 10
            if (r1 != r0) goto Lb3
            int r0 = r2 + 1
            r6.A02 = r0
        Lb3:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.ads.redexgen.X.HV.A0P():java.lang.String");
    }

    /* JADX WARN: Incorrect condition in loop: B:8:0x000c */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.String A0Q() {
        /*
            r4 = this;
            int r0 = r4.A04()
            if (r0 != 0) goto L8
            r0 = 0
            return r0
        L8:
            int r3 = r4.A02
        La:
            int r0 = r4.A01
            if (r3 >= r0) goto L17
            byte[] r0 = r4.A00
            r0 = r0[r3]
            if (r0 == 0) goto L17
            int r3 = r3 + 1
            goto La
        L17:
            byte[] r2 = r4.A00
            int r1 = r4.A02
            int r0 = r3 - r1
            java.lang.String r2 = com.facebook.ads.redexgen.X.C0430Hl.A0R(r2, r1, r0)
            r4.A02 = r3
            int r1 = r4.A02
            int r0 = r4.A01
            if (r1 >= r0) goto L2d
            int r0 = r1 + 1
            r4.A02 = r0
        L2d:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.ads.redexgen.X.HV.A0Q():java.lang.String");
    }

    public final String A0R(int i) {
        if (i == 0) {
            return A00(0, 0, 47);
        }
        int i2 = i;
        int stringLength = this.A02;
        int lastIndex = (stringLength + i) - 1;
        int stringLength2 = this.A01;
        if (lastIndex < stringLength2) {
            int stringLength3 = this.A00[lastIndex];
            if (stringLength3 == 0) {
                i2--;
            }
        }
        byte[] bArr = this.A00;
        int stringLength4 = this.A02;
        String A0R = C0430Hl.A0R(bArr, stringLength4, i2);
        int stringLength5 = this.A02;
        this.A02 = stringLength5 + i;
        return A0R;
    }

    public final String A0S(int i) {
        return A0T(i, Charset.forName(A00(95, 5, 98)));
    }

    public final String A0T(int i, Charset charset) {
        String str = new String(this.A00, this.A02, i, charset);
        this.A02 += i;
        return str;
    }

    public final short A0U() {
        byte[] bArr = this.A00;
        int i = this.A02;
        this.A02 = i + 1;
        int i2 = (bArr[i] & 255) << 8;
        int i3 = this.A02;
        this.A02 = i3 + 1;
        return (short) ((bArr[i3] & 255) | i2);
    }

    public final void A0V() {
        this.A02 = 0;
        this.A01 = 0;
    }

    public final void A0W(int i) {
        A0b(A05() < i ? new byte[i] : this.A00, i);
    }

    public final void A0X(int i) {
        H6.A03(i >= 0 && i <= this.A00.length);
        this.A01 = i;
    }

    public final void A0Y(int i) {
        H6.A03(i >= 0 && i <= this.A01);
        this.A02 = i;
    }

    public final void A0Z(int i) {
        A0Y(this.A02 + i);
    }

    public final void A0a(HU hu, int i) {
        A0c(hu.A00, 0, i);
        hu.A07(0);
    }

    public final void A0b(byte[] bArr, int i) {
        this.A00 = bArr;
        this.A01 = i;
        this.A02 = 0;
    }

    public final void A0c(byte[] bArr, int i, int i2) {
        System.arraycopy(this.A00, this.A02, bArr, i, i2);
        this.A02 += i2;
    }
}
