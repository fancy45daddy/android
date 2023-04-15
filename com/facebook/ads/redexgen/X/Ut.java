package com.facebook.ads.redexgen.X;

import java.util.Arrays;
/* loaded from: assets/audience_network.dex */
public final class Ut implements CU {
    public static byte[] A0E;
    public static String[] A0F = {"OaAtDjibDffMS", "aj2yyuicdEn8dhTDbWTrD1WtuleVGPEx", "a3NvGU2CXdpQvxvcysdReyA6yUgKGJjf", "4BBSavRiCGZis8TiCNo6nDJqjRzxnCkr", "3Isw3BGBXoN1VbjlJcagr5xDVNXHwLpI", "HfhncQp7sGaDAl", "zNtUp", "pzzsrx2QpEHePoyNV"};
    public long A00;
    public long A01;
    public InterfaceC0279Ba A02;
    public CY A03;
    public String A04;
    public boolean A05;
    public final C0296Cd A09;
    public final boolean A0B;
    public final boolean A0C;
    public final boolean[] A0D = new boolean[3];
    public final C0293Ca A08 = new C0293Ca(7, 128);
    public final C0293Ca A06 = new C0293Ca(8, 128);
    public final C0293Ca A07 = new C0293Ca(6, 128);
    public final HV A0A = new HV();

    public static String A00(int i, int i2, int i3) {
        byte[] copyOfRange = Arrays.copyOfRange(A0E, i, i + i2);
        for (int i4 = 0; i4 < copyOfRange.length; i4++) {
            copyOfRange[i4] = (byte) ((copyOfRange[i4] ^ i3) ^ 52);
        }
        return new String(copyOfRange);
    }

    public static void A01() {
        A0E = new byte[]{37, 58, 55, 54, 60, 124, 50, 37, 48};
    }

    static {
        A01();
    }

    public Ut(C0296Cd c0296Cd, boolean z, boolean z2) {
        this.A09 = c0296Cd;
        this.A0B = z;
        this.A0C = z2;
    }

    /* JADX WARN: Code restructure failed: missing block: B:29:0x0175, code lost:
        if (r4.A03() != false) goto L30;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x0177, code lost:
        r24.A03.A04(com.facebook.ads.redexgen.X.HR.A05(r24.A06.A01, 3, r24.A06.A00));
        r24.A06.A00();
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x019f, code lost:
        if (r4.A03() != false) goto L30;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private void A02(long r25, int r27, int r28, long r29) {
        /*
            Method dump skipped, instructions count: 424
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.ads.redexgen.X.Ut.A02(long, int, int, long):void");
    }

    private void A03(long j, int i, long j2) {
        if (!this.A05 || this.A03.A07()) {
            this.A08.A01(i);
            this.A06.A01(i);
        }
        this.A07.A01(i);
        String[] strArr = A0F;
        if (strArr[4].charAt(8) != strArr[2].charAt(8)) {
            throw new RuntimeException();
        }
        String[] strArr2 = A0F;
        strArr2[5] = "7DOfm1dA88ob89";
        strArr2[0] = "yqrgSqZS2XcB9";
        this.A03.A03(j, i, j2);
    }

    private void A04(byte[] bArr, int i, int i2) {
        if (!this.A05 || this.A03.A07()) {
            this.A08.A02(bArr, i, i2);
            this.A06.A02(bArr, i, i2);
        }
        this.A07.A02(bArr, i, i2);
        this.A03.A06(bArr, i, i2);
    }

    @Override // com.facebook.ads.redexgen.X.CU
    public final void A48(HV hv) {
        int A06 = hv.A06();
        int A07 = hv.A07();
        byte[] bArr = hv.A00;
        long j = this.A01;
        int offset = hv.A04();
        this.A01 = j + offset;
        InterfaceC0279Ba interfaceC0279Ba = this.A02;
        int offset2 = hv.A04();
        interfaceC0279Ba.AE8(hv, offset2);
        while (true) {
            int A04 = HR.A04(bArr, A06, A07, this.A0D);
            if (A04 == A07) {
                A04(bArr, A06, A07);
                return;
            }
            int lengthToNalUnit = HR.A01(bArr, A04);
            int i = A04 - A06;
            if (i > 0) {
                A04(bArr, A06, A04);
            }
            int i2 = A07 - A04;
            long j2 = this.A01 - i2;
            int offset3 = i < 0 ? -i : 0;
            A02(j2, i2, offset3, this.A00);
            A03(j2, lengthToNalUnit, this.A00);
            A06 = A04 + 3;
        }
    }

    @Override // com.facebook.ads.redexgen.X.CU
    public final void A4V(BQ bq, C0301Ci c0301Ci) {
        c0301Ci.A05();
        this.A04 = c0301Ci.A04();
        this.A02 = bq.AF2(c0301Ci.A03(), 2);
        this.A03 = new CY(this.A02, this.A0B, this.A0C);
        this.A09.A03(bq, c0301Ci);
    }

    @Override // com.facebook.ads.redexgen.X.CU
    public final void ACx() {
    }

    @Override // com.facebook.ads.redexgen.X.CU
    public final void ACy(long j, boolean z) {
        this.A00 = j;
    }

    @Override // com.facebook.ads.redexgen.X.CU
    public final void AEC() {
        HR.A0B(this.A0D);
        this.A08.A00();
        this.A06.A00();
        this.A07.A00();
        this.A03.A01();
        this.A01 = 0L;
    }
}
