package com.facebook.ads.redexgen.X;

import a.a.j;
import com.facebook.ads.internal.exoplayer2.source.TrackGroupArray;
import java.util.Arrays;
/* loaded from: assets/audience_network.dex */
public final class W5 implements C9N {
    public static byte[] A0A;
    public static String[] A0B = {"ilntiKeCpn72Dx7EE3Rw9hkq75JbKAcA", "wPL2yleQwYX6RVVdEOaHMWHZq50QYzDc", "zjYhmAwspMfnQIz92oeL2kf6IR", "AEUyDf5SOKQlymFmwa942o3bdmA", "6YNynFjnDYQOqc0QM1ycbBp5CCdF169p", "D8", "MEXbIoh", "5uze5Gp41PLyaey5Hs3T"};
    public int A00;
    public boolean A01;
    public final int A02;
    public final long A03;
    public final long A04;
    public final long A05;
    public final long A06;
    public final C0742Tu A07;
    public final HZ A08;
    public final boolean A09;

    public static String A01(int i, int i2, int i3) {
        byte[] copyOfRange = Arrays.copyOfRange(A0A, i, i + i2);
        for (int i4 = 0; i4 < copyOfRange.length; i4++) {
            copyOfRange[i4] = (byte) ((copyOfRange[i4] - i3) - 24);
        }
        return new String(copyOfRange);
    }

    public static void A02() {
        A0A = new byte[]{104, -85, -87, -74, -74, -73, -68, 104, -86, -83, 104, -76, -83, -69, -69, 104, -68, -80, -87, -74, 104, -81, -88, -69, -84, -84, -85, -72, -116, -75, -72, -106, -78, -89, -65, -88, -89, -87, -79, -121, -84, -70, -85, -72, -104, -85, -88, -69, -84, -84, -85, -72, -109, -71, -54, -35, -50, -50, -51, -38, -82, -41, -38, -72, -44, -55, -31, -54, -55, -53, -45, -75, -37, -17, -29, -6, -60, -9, -24, -24, -25, -12, -49, -11, -23, -27, -22, -66, -15, -30, -30, -31, -18, -55, -17};
    }

    static {
        A02();
    }

    public W5() {
        this(new C0742Tu(true, 65536));
    }

    @Deprecated
    public W5(C0742Tu c0742Tu) {
        this(c0742Tu, 15000, 50000, 2500, 5000, -1, true);
    }

    @Deprecated
    public W5(C0742Tu c0742Tu, int i, int i2, int i3, int i4, int i5, boolean z) {
        this(c0742Tu, i, i2, i3, i4, i5, z, null);
    }

    @Deprecated
    public W5(C0742Tu c0742Tu, int i, int i2, int i3, int i4, int i5, boolean z, HZ hz) {
        String A01 = A01(21, 1, j.AppCompatTheme_textAppearanceSmallPopupMenu);
        String A012 = A01(54, 19, 80);
        A03(i3, 0, A012, A01);
        String A013 = A01(22, 32, 46);
        A03(i4, 0, A013, A01);
        String A014 = A01(84, 11, 100);
        A03(i, i3, A014, A012);
        A03(i, i4, A014, A013);
        A03(i2, i, A01(73, 11, j.AppCompatTheme_toolbarNavigationButtonStyle), A014);
        this.A07 = c0742Tu;
        this.A06 = i * 1000;
        this.A05 = i2 * 1000;
        this.A04 = i3 * 1000;
        this.A03 = i4 * 1000;
        this.A02 = i5;
        this.A09 = z;
        this.A08 = hz;
    }

    /* JADX WARN: Incorrect condition in loop: B:4:0x0003 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final int A00(com.facebook.ads.redexgen.X.W1[] r4, com.facebook.ads.redexgen.X.GD r5) {
        /*
            r3 = this;
            r2 = 0
            r1 = 0
        L2:
            int r0 = r4.length
            if (r1 >= r0) goto L19
            com.facebook.ads.redexgen.X.GC r0 = r5.A00(r1)
            if (r0 == 0) goto L16
            r0 = r4[r1]
            int r0 = r0.A7g()
            int r0 = com.facebook.ads.redexgen.X.C0430Hl.A01(r0)
            int r2 = r2 + r0
        L16:
            int r1 = r1 + 1
            goto L2
        L19:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.ads.redexgen.X.W5.A00(com.facebook.ads.redexgen.X.W1[], com.facebook.ads.redexgen.X.GD):int");
    }

    public static void A03(int i, int i2, String str, String str2) {
        boolean z = i >= i2;
        H6.A05(z, str + A01(0, 21, 48) + str2);
    }

    private void A04(boolean z) {
        this.A00 = 0;
        HZ hz = this.A08;
        if (hz != null && this.A01) {
            hz.A03(0);
        }
        this.A01 = false;
        if (z) {
            this.A07.A03();
        }
    }

    @Override // com.facebook.ads.redexgen.X.C9N
    public final GI A5f() {
        return this.A07;
    }

    @Override // com.facebook.ads.redexgen.X.C9N
    public final long A5k() {
        return 0L;
    }

    @Override // com.facebook.ads.redexgen.X.C9N
    public final void ABz() {
        A04(true);
    }

    @Override // com.facebook.ads.redexgen.X.C9N
    public final void ACL() {
        A04(true);
    }

    @Override // com.facebook.ads.redexgen.X.C9N
    public final void ACT(W1[] w1Arr, TrackGroupArray trackGroupArray, GD gd) {
        int i = this.A02;
        if (i == -1) {
            i = A00(w1Arr, gd);
        }
        this.A00 = i;
        this.A07.A04(this.A00);
    }

    @Override // com.facebook.ads.redexgen.X.C9N
    public final boolean AE5() {
        return false;
    }

    /* JADX WARN: Code restructure failed: missing block: B:21:0x0061, code lost:
        if (r3 != r4) goto L22;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x0063, code lost:
        if (r3 == false) goto L24;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x0065, code lost:
        r6.A00(0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x006b, code lost:
        r6.A03(0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x0076, code lost:
        if (r3 != r4) goto L22;
     */
    @Override // com.facebook.ads.redexgen.X.C9N
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean AEd(long r9, float r11) {
        /*
            r8 = this;
            com.facebook.ads.redexgen.X.Tu r0 = r8.A07
            int r1 = r0.A02()
            int r0 = r8.A00
            r6 = 1
            r5 = 0
            if (r1 < r0) goto L86
            r7 = 1
        Ld:
            boolean r4 = r8.A01
            long r0 = r8.A06
            r2 = 1065353216(0x3f800000, float:1.0)
            int r2 = (r11 > r2 ? 1 : (r11 == r2 ? 0 : -1))
            if (r2 <= 0) goto L21
            long r2 = com.facebook.ads.redexgen.X.C0430Hl.A0C(r0, r11)
            long r0 = r8.A05
            long r0 = java.lang.Math.min(r2, r0)
        L21:
            int r2 = (r9 > r0 ? 1 : (r9 == r0 ? 0 : -1))
            if (r2 >= 0) goto L7b
            boolean r3 = r8.A09
            java.lang.String[] r1 = com.facebook.ads.redexgen.X.W5.A0B
            r0 = 1
            r1 = r1[r0]
            r0 = 1
            char r1 = r1.charAt(r0)
            r0 = 116(0x74, float:1.63E-43)
            if (r1 == r0) goto L88
            java.lang.String[] r2 = com.facebook.ads.redexgen.X.W5.A0B
            java.lang.String r1 = "Ppn0DE"
            r0 = 5
            r2[r0] = r1
            if (r3 != 0) goto L40
            if (r7 != 0) goto L79
        L40:
            r8.A01 = r6
        L42:
            com.facebook.ads.redexgen.X.HZ r6 = r8.A08
            if (r6 == 0) goto L68
            boolean r3 = r8.A01
            java.lang.String[] r1 = com.facebook.ads.redexgen.X.W5.A0B
            r0 = 6
            r0 = r1[r0]
            int r1 = r0.length()
            r0 = 13
            if (r1 == r0) goto L6f
            java.lang.String[] r2 = com.facebook.ads.redexgen.X.W5.A0B
            java.lang.String r1 = "7hiTZk3TS6kdJpPH1OWD5iH5Lha"
            r0 = 3
            r2[r0] = r1
            java.lang.String r1 = "uWsgjDiVcVLtDVCTZxMR"
            r0 = 7
            r2[r0] = r1
            if (r3 == r4) goto L68
        L63:
            if (r3 == 0) goto L6b
            r6.A00(r5)
        L68:
            boolean r0 = r8.A01
            return r0
        L6b:
            r6.A03(r5)
            goto L68
        L6f:
            java.lang.String[] r2 = com.facebook.ads.redexgen.X.W5.A0B
            java.lang.String r1 = "I9dScF5ijEM2hd"
            r0 = 6
            r2[r0] = r1
            if (r3 == r4) goto L68
            goto L63
        L79:
            r6 = 0
            goto L40
        L7b:
            long r1 = r8.A05
            int r0 = (r9 > r1 ? 1 : (r9 == r1 ? 0 : -1))
            if (r0 > 0) goto L83
            if (r7 == 0) goto L42
        L83:
            r8.A01 = r5
            goto L42
        L86:
            r7 = 0
            goto Ld
        L88:
            java.lang.RuntimeException r0 = new java.lang.RuntimeException
            r0.<init>()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.ads.redexgen.X.W5.AEd(long, float):boolean");
    }

    @Override // com.facebook.ads.redexgen.X.C9N
    public final boolean AEg(long j, float f, boolean z) {
        long A0D = C0430Hl.A0D(j, f);
        long j2 = z ? this.A03 : this.A04;
        if (A0B[6].length() != 13) {
            A0B[6] = "eSzKm";
            return j2 <= 0 || A0D >= j2 || (!this.A09 && this.A07.A02() >= this.A00);
        }
        throw new RuntimeException();
    }

    @Override // com.facebook.ads.redexgen.X.C9N
    public final void onPrepared() {
        A04(false);
    }
}
