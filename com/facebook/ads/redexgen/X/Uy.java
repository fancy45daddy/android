package com.facebook.ads.redexgen.X;

import android.util.Log;
import android.util.Pair;
import com.facebook.ads.internal.exoplayer2.Format;
import java.util.Arrays;
import java.util.Collections;
/* loaded from: assets/audience_network.dex */
public final class Uy implements CU {
    public static byte[] A0H;
    public static String[] A0I = {"wge6vcbYVd2LlwU9IzXxO7y1yc7Npjql", "e4ah1", "HxlECSCujzZIBhcakhB8llOPpIPg4jPi", "c3jgZ7razfwrLoite54T", "YnWTxT53I9VC0eKuEFoJi1GxqSMOrSIM", "mGJBSiyG9M2YGViPKeXmqCjoZalx0YC5", "VtpTHv8dn8NrwXo7ikKBEmVWKD8j4YCX", "dqOZRsMzwGVkln1A4hbisIXuNnIWGGSy"};
    public static final byte[] A0J;
    public int A00;
    public int A01;
    public int A02;
    public int A03;
    public long A04;
    public long A05;
    public long A06;
    public InterfaceC0279Ba A07;
    public InterfaceC0279Ba A08;
    public InterfaceC0279Ba A09;
    public String A0A;
    public boolean A0B;
    public boolean A0C;
    public final HU A0D;
    public final HV A0E;
    public final String A0F;
    public final boolean A0G;

    public static String A00(int i, int i2, int i3) {
        byte[] copyOfRange = Arrays.copyOfRange(A0H, i, i + i2);
        for (int i4 = 0; i4 < copyOfRange.length; i4++) {
            byte b2 = (byte) ((copyOfRange[i4] - i3) - 49);
            if (A0I[4].charAt(1) != 'n') {
                throw new RuntimeException();
            }
            A0I[4] = "bnluMaXE1Uw3b3JGoNOZfy6HcCqjlXqz";
            copyOfRange[i4] = b2;
        }
        return new String(copyOfRange);
    }

    public static void A06() {
        A0H = new byte[]{-120, 124, -66, -47, -48, 124, -67, -49, -49, -47, -55, -59, -54, -61, 124, -99, -99, -97, 124, -88, -97, -118, -118, -83, -67, -68, -101, -82, -86, -83, -82, -69, -18, 15, 30, 15, 13, 30, 15, 14, -54, 11, 31, 14, 19, 25, -54, 25, 12, 20, 15, 13, 30, -54, 30, 35, 26, 15, -28, -54, -26, -11, -11, -15, -18, -24, -26, -7, -18, -12, -13, -76, -18, -23, -72, 16, 36, 19, 24, 30, -34, 28, 31, -29, 16, -36, 27, 16, 35, 28};
    }

    static {
        A06();
        A0J = new byte[]{73, 68, 51};
    }

    public Uy(boolean z) {
        this(z, null);
    }

    public Uy(boolean z, String str) {
        this.A0D = new HU(new byte[7]);
        this.A0E = new HV(Arrays.copyOf(A0J, 10));
        A03();
        this.A0G = z;
        this.A0F = str;
    }

    private void A01() throws C9R {
        this.A0D.A07(0);
        if (!this.A0C) {
            int A04 = this.A0D.A04(2) + 1;
            if (A04 != 2) {
                Log.w(A00(22, 10, 24), A00(32, 28, 121) + A04 + A00(0, 22, 43));
                A04 = 2;
            }
            int A042 = this.A0D.A04(4);
            this.A0D.A08(1);
            int audioObjectType = this.A0D.A04(3);
            byte[] A07 = HA.A07(A04, A042, audioObjectType);
            Pair<Integer, Integer> A03 = HA.A03(A07);
            Format A072 = Format.A07(this.A0A, A00(75, 15, 126), null, -1, -1, ((Integer) A03.second).intValue(), ((Integer) A03.first).intValue(), Collections.singletonList(A07), null, 0, this.A0F);
            int audioObjectType2 = A072.A0C;
            this.A05 = 1024000000 / audioObjectType2;
            this.A09.A5T(A072);
            this.A0C = true;
        } else {
            HU hu = this.A0D;
            String[] strArr = A0I;
            if (strArr[3].length() == strArr[1].length()) {
                throw new RuntimeException();
            }
            A0I[4] = "gnfbeCT7ETb0BF6eGTwxRLZIMNoo6eBq";
            hu.A08(10);
        }
        this.A0D.A08(4);
        int A043 = (this.A0D.A04(13) - 2) - 5;
        if (this.A0B) {
            A043 -= 2;
        }
        InterfaceC0279Ba interfaceC0279Ba = this.A09;
        long j = this.A05;
        if (A0I[0].charAt(1) != 'g') {
            throw new RuntimeException();
        }
        String[] strArr2 = A0I;
        strArr2[5] = "DPeEZCdjnoP4QwMjUw7HIDON5EObNWtY";
        strArr2[6] = "TWt76gMmW2EkEQM2OhdsBT8X6vSrq3Ij";
        A07(interfaceC0279Ba, j, 0, A043);
    }

    private void A02() {
        this.A08.AE8(this.A0E, 10);
        this.A0E.A0Y(6);
        A07(this.A08, 0L, 10, this.A0E.A0D() + 10);
    }

    private void A03() {
        this.A03 = 0;
        this.A00 = 0;
        this.A01 = 256;
    }

    private void A04() {
        this.A03 = 2;
        this.A00 = 0;
    }

    private void A05() {
        this.A03 = 1;
        this.A00 = A0J.length;
        this.A02 = 0;
        this.A0E.A0Y(0);
    }

    private void A07(InterfaceC0279Ba interfaceC0279Ba, long j, int i, int i2) {
        this.A03 = 3;
        this.A00 = i;
        this.A07 = interfaceC0279Ba;
        this.A04 = j;
        this.A02 = i2;
    }

    private void A08(HV hv) {
        byte[] bArr = hv.A00;
        int A06 = hv.A06();
        int A07 = hv.A07();
        while (A06 < A07) {
            int position = A06 + 1;
            int i = bArr[A06] & 255;
            if (this.A01 == 512 && i >= 240 && i != 255) {
                this.A0B = (i & 1) == 0;
                A04();
                hv.A0Y(position);
                return;
            }
            int endOffset = this.A01;
            int data = endOffset | i;
            if (data == 329) {
                this.A01 = 768;
            } else if (data == 511) {
                this.A01 = 512;
            } else if (data == 836) {
                this.A01 = 1024;
            } else if (data != 1075) {
                if (endOffset != 256) {
                    this.A01 = 256;
                    A06 = position - 1;
                }
            } else {
                A05();
                hv.A0Y(position);
                return;
            }
            A06 = position;
        }
        hv.A0Y(A06);
    }

    private void A09(HV hv) {
        int min = Math.min(hv.A04(), this.A02 - this.A00);
        this.A07.AE8(hv, min);
        int bytesToRead = this.A00;
        this.A00 = bytesToRead + min;
        int bytesToRead2 = this.A00;
        int i = this.A02;
        if (bytesToRead2 == i) {
            this.A07.AE9(this.A06, 1, i, 0, null);
            this.A06 += this.A04;
            A03();
        }
    }

    private boolean A0A(HV hv, byte[] bArr, int i) {
        int min = Math.min(hv.A04(), i - this.A00);
        int bytesToRead = this.A00;
        hv.A0c(bArr, bytesToRead, min);
        int bytesToRead2 = this.A00;
        this.A00 = bytesToRead2 + min;
        int bytesToRead3 = this.A00;
        return bytesToRead3 == i;
    }

    @Override // com.facebook.ads.redexgen.X.CU
    public final void A48(HV hv) throws C9R {
        while (hv.A04() > 0) {
            int i = this.A03;
            if (i == 0) {
                A08(hv);
            } else if (i != 1) {
                String[] strArr = A0I;
                if (strArr[5].charAt(25) == strArr[6].charAt(25)) {
                    throw new RuntimeException();
                }
                String[] strArr2 = A0I;
                strArr2[5] = "9CqnxzaEQimEcBf5cSINZxdBysafSxdF";
                strArr2[6] = "zLp55t2V8ycwykcXwXcmLQHdTFNUXCiS";
                if (i == 2) {
                    boolean A0A = A0A(hv, this.A0D.A00, this.A0B ? 7 : 5);
                    if (A0I[0].charAt(1) == 'g') {
                        String[] strArr3 = A0I;
                        strArr3[3] = "PBSyuwIG2tPzzgRnoBM9";
                        strArr3[1] = "owzwp";
                        if (A0A) {
                            A01();
                        }
                    } else if (A0A) {
                        A01();
                    }
                } else if (i == 3) {
                    A09(hv);
                }
            } else if (A0A(hv, this.A0E.A00, 10)) {
                A02();
            }
        }
    }

    @Override // com.facebook.ads.redexgen.X.CU
    public final void A4V(BQ bq, C0301Ci c0301Ci) {
        c0301Ci.A05();
        this.A0A = c0301Ci.A04();
        this.A09 = bq.AF2(c0301Ci.A03(), 1);
        if (this.A0G) {
            c0301Ci.A05();
            this.A08 = bq.AF2(c0301Ci.A03(), 4);
            this.A08.A5T(Format.A0B(c0301Ci.A04(), A00(60, 15, 84), null, -1, null));
            return;
        }
        this.A08 = new C0774Vd();
    }

    @Override // com.facebook.ads.redexgen.X.CU
    public final void ACx() {
    }

    @Override // com.facebook.ads.redexgen.X.CU
    public final void ACy(long j, boolean z) {
        this.A06 = j;
    }

    @Override // com.facebook.ads.redexgen.X.CU
    public final void AEC() {
        A03();
    }
}
