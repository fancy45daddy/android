package com.facebook.ads.redexgen.X;

import com.facebook.ads.internal.exoplayer2.Format;
/* renamed from: com.facebook.ads.redexgen.X.Uw  reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public final class C0768Uw implements CU {
    public static String[] A0B = {"Egp8wbctYg3AnrLoFsY0muWOBg0DV21X", "e5h8xZQ9y742", "HWojDw1vanmhl7F", "V39ipiog0D", "u2piqSS4vuQoaStDwbY0GoBR5fBlfuuM", "rfNh4mzWhxdgTcwc6CqJaoU4clFtHzcH", "1g0ZSxhEfC", "eBXSmpY9RuNSQ1O4XZ5t"};
    public int A00;
    public int A01;
    public int A03;
    public long A04;
    public long A05;
    public Format A06;
    public InterfaceC0279Ba A07;
    public String A08;
    public final String A0A;
    public final HV A09 = new HV(new byte[18]);
    public int A02 = 0;

    public C0768Uw(String str) {
        this.A0A = str;
    }

    private void A00() {
        byte[] bArr = this.A09.A00;
        if (this.A06 == null) {
            this.A06 = AX.A03(bArr, this.A08, this.A0A, null);
            this.A07.A5T(this.A06);
        }
        this.A01 = AX.A01(bArr);
        this.A04 = (int) ((AX.A02(bArr) * 1000000) / this.A06.A0C);
    }

    private boolean A01(HV hv) {
        do {
            int A04 = hv.A04();
            String[] strArr = A0B;
            if (strArr[3].length() != strArr[6].length()) {
                throw new RuntimeException();
            }
            A0B[2] = "u2vG9yItOjfrtL1HZZufPW";
            if (A04 <= 0) {
                return false;
            }
            this.A03 <<= 8;
            this.A03 |= hv.A0E();
        } while (!AX.A07(this.A03));
        this.A09.A00[0] = (byte) ((this.A03 >> 24) & 255);
        this.A09.A00[1] = (byte) ((this.A03 >> 16) & 255);
        this.A09.A00[2] = (byte) ((this.A03 >> 8) & 255);
        this.A09.A00[3] = (byte) (this.A03 & 255);
        this.A00 = 4;
        this.A03 = 0;
        return true;
    }

    private boolean A02(HV hv, byte[] bArr, int i) {
        int min = Math.min(hv.A04(), i - this.A00);
        int bytesToRead = this.A00;
        hv.A0c(bArr, bytesToRead, min);
        int bytesToRead2 = this.A00;
        this.A00 = bytesToRead2 + min;
        int bytesToRead3 = this.A00;
        return bytesToRead3 == i;
    }

    @Override // com.facebook.ads.redexgen.X.CU
    public final void A48(HV hv) {
        while (hv.A04() > 0) {
            int i = this.A02;
            if (i != 0) {
                if (i == 1) {
                    byte[] bArr = this.A09.A00;
                    String[] strArr = A0B;
                    if (strArr[5].charAt(14) == strArr[4].charAt(14)) {
                        throw new RuntimeException();
                    }
                    String[] strArr2 = A0B;
                    strArr2[7] = "fRWG3CzCM1nyuvAzq7jz";
                    strArr2[0] = "3KzD1A3zkNrKwQoZtzGyJPl8BSj940od";
                    if (A02(hv, bArr, 18)) {
                        A00();
                        this.A09.A0Y(0);
                        this.A07.AE8(this.A09, 18);
                        this.A02 = 2;
                    }
                } else if (i == 2) {
                    int min = Math.min(hv.A04(), this.A01 - this.A00);
                    this.A07.AE8(hv, min);
                    int bytesToRead = this.A00;
                    this.A00 = bytesToRead + min;
                    int bytesToRead2 = this.A00;
                    int i2 = this.A01;
                    if (bytesToRead2 == i2) {
                        this.A07.AE9(this.A05, 1, i2, 0, null);
                        this.A05 += this.A04;
                        this.A02 = 0;
                    }
                }
            } else if (A01(hv)) {
                this.A02 = 1;
            }
        }
    }

    @Override // com.facebook.ads.redexgen.X.CU
    public final void A4V(BQ bq, C0301Ci c0301Ci) {
        c0301Ci.A05();
        this.A08 = c0301Ci.A04();
        this.A07 = bq.AF2(c0301Ci.A03(), 1);
    }

    @Override // com.facebook.ads.redexgen.X.CU
    public final void ACx() {
    }

    @Override // com.facebook.ads.redexgen.X.CU
    public final void ACy(long j, boolean z) {
        this.A05 = j;
    }

    @Override // com.facebook.ads.redexgen.X.CU
    public final void AEC() {
        this.A02 = 0;
        this.A00 = 0;
        this.A03 = 0;
    }
}
