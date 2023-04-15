package com.facebook.ads.redexgen.X;

import com.facebook.ads.internal.exoplayer2.drm.DrmInitData;
/* loaded from: assets/audience_network.dex */
public final class C1 {
    public static String[] A0A = {"3clh", "In2mDQuCVOg3ihkf16hWdIIfuM6sFv5F", "x02l2Vae1akitXdZsfkSin5rPssADgyF", "voDg", "hUzVtg6QDcg3AayaGyy4Y5hfj2RvIx7z", "AYA0HHhZRav1tOhmR967ChnIf", "RG8", "bQ6q4wCv1qa3psjbWrVNO9D1ADq5zdw2"};
    public int A00;
    public int A01;
    public int A02;
    public int A03;
    public C0289Bv A04;
    public CA A05;
    public final InterfaceC0279Ba A06;
    public final CC A07 = new CC();
    public final HV A09 = new HV(1);
    public final HV A08 = new HV();

    public C1(InterfaceC0279Ba interfaceC0279Ba) {
        this.A06 = interfaceC0279Ba;
    }

    private CB A00() {
        int i = this.A07.A07.A02;
        if (this.A07.A08 != null) {
            CC cc = this.A07;
            String[] strArr = A0A;
            String str = strArr[1];
            String str2 = strArr[4];
            int charAt = str.charAt(10);
            int sampleDescriptionIndex = str2.charAt(10);
            if (charAt != sampleDescriptionIndex) {
                throw new RuntimeException();
            }
            String[] strArr2 = A0A;
            strArr2[1] = "mhitCTNVD2gTcCiZ9jaRAXWaAA0g9dMw";
            strArr2[4] = "MwiogHOaq0gqmibDd9x4nD1rPGRVV4il";
            return cc.A08;
        }
        return this.A05.A00(i);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void A01() {
        if (!this.A07.A0A) {
            return;
        }
        HV hv = this.A07.A09;
        CB encryptionBox = A00();
        if (encryptionBox.A00 != 0) {
            hv.A0Z(encryptionBox.A00);
        }
        if (this.A07.A0H[this.A01]) {
            hv.A0Z(hv.A0I() * 6);
        }
    }

    public final int A03() {
        HV hv;
        int vectorSize;
        if (this.A07.A0A) {
            CB A00 = A00();
            if (A00.A00 != 0) {
                hv = this.A07.A09;
                vectorSize = A00.A00;
            } else {
                byte[] bArr = A00.A04;
                String[] strArr = A0A;
                if (strArr[3].length() != strArr[0].length()) {
                    throw new RuntimeException();
                }
                String[] strArr2 = A0A;
                strArr2[1] = "Pfb0S5CneQgYrjeMjOJgtR7T7eyOdr1R";
                strArr2[4] = "zLY8KEVp0MgNhcadjz3HGMWIKnjSbq4p";
                this.A08.A0b(bArr, bArr.length);
                hv = this.A08;
                vectorSize = bArr.length;
            }
            boolean z = this.A07.A0H[this.A01];
            this.A09.A00[0] = (byte) ((z ? 128 : 0) | vectorSize);
            this.A09.A0Y(0);
            this.A06.AE8(this.A09, 1);
            this.A06.AE8(hv, vectorSize);
            if (!z) {
                return vectorSize + 1;
            }
            HV hv2 = this.A07.A09;
            int A0I = hv2.A0I();
            hv2.A0Z(-2);
            int i = (A0I * 6) + 2;
            this.A06.AE8(hv2, i);
            return vectorSize + 1 + i;
        }
        return 0;
    }

    public final void A04() {
        this.A07.A01();
        this.A01 = 0;
        this.A02 = 0;
        this.A00 = 0;
        this.A03 = 0;
    }

    public final void A05(long j) {
        long A01 = AnonymousClass92.A01(j);
        for (int i = this.A01; i < this.A07.A00 && this.A07.A00(i) < A01; i++) {
            boolean[] zArr = this.A07.A0I;
            String[] strArr = A0A;
            if (strArr[3].length() != strArr[0].length()) {
                throw new RuntimeException();
            }
            String[] strArr2 = A0A;
            strArr2[1] = "yYyJ6pNJ0kgjmttu9OhrBT2GfQD0mn7b";
            strArr2[4] = "spdSEizAECgh3deYwyaUKu4kY7nul1tj";
            if (zArr[i]) {
                this.A03 = i;
            }
        }
    }

    public final void A06(DrmInitData drmInitData) {
        CB encryptionBox = this.A05.A00(this.A07.A07.A02);
        this.A06.A5T(this.A05.A07.A0I(drmInitData.A02(encryptionBox != null ? encryptionBox.A02 : null)));
    }

    public final void A07(CA ca, C0289Bv c0289Bv) {
        this.A05 = (CA) H6.A01(ca);
        this.A04 = (C0289Bv) H6.A01(c0289Bv);
        this.A06.A5T(ca.A07);
        A04();
    }

    public final boolean A08() {
        this.A01++;
        this.A00++;
        int i = this.A00;
        int[] iArr = this.A07.A0E;
        int i2 = this.A02;
        if (i == iArr[i2]) {
            this.A02 = i2 + 1;
            String[] strArr = A0A;
            if (strArr[2].charAt(8) != strArr[7].charAt(8)) {
                throw new RuntimeException();
            }
            A0A[6] = "24SILmm";
            this.A00 = 0;
            return false;
        }
        return true;
    }
}
