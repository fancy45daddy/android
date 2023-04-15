package com.facebook.ads.redexgen.X;

import java.io.IOException;
import java.util.ArrayDeque;
import java.util.Arrays;
/* loaded from: assets/audience_network.dex */
public final class VS implements Bg {
    public static byte[] A07;
    public int A00;
    public int A01;
    public long A02;
    public InterfaceC0281Bi A03;
    public final byte[] A06 = new byte[8];
    public final ArrayDeque<C0280Bf> A05 = new ArrayDeque<>();
    public final C0282Bn A04 = new C0282Bn();

    static {
        A05();
    }

    public static String A03(int i, int i2, int i3) {
        byte[] copyOfRange = Arrays.copyOfRange(A07, i, i + i2);
        for (int i4 = 0; i4 < copyOfRange.length; i4++) {
            copyOfRange[i4] = (byte) ((copyOfRange[i4] - i3) - 28);
        }
        return new String(copyOfRange);
    }

    public static void A05() {
        A07 = new byte[]{101, -118, -110, 125, -120, -123, Byte.MIN_VALUE, 60, -127, -120, -127, -119, -127, -118, -112, 60, -112, -107, -116, -127, 60, -73, -36, -28, -49, -38, -41, -46, -114, -44, -38, -35, -49, -30, -114, -31, -41, -24, -45, -88, -114, -95, -58, -50, -71, -60, -63, -68, 120, -63, -58, -52, -67, -65, -67, -54, 120, -53, -63, -46, -67, -110, 120, -64, -31, -33, -42, -37, -44, -115, -46, -39, -46, -38, -46, -37, -31, -115, -32, -42, -25, -46, -89, -115};
    }

    private double A00(BP bp, int i) throws IOException, InterruptedException {
        long A02 = A02(bp, i);
        if (i == 4) {
            return Float.intBitsToFloat((int) A02);
        }
        return Double.longBitsToDouble(A02);
    }

    private long A01(BP bp) throws IOException, InterruptedException {
        bp.AE3();
        while (true) {
            bp.AD0(this.A06, 0, 4);
            int A00 = C0282Bn.A00(this.A06[0]);
            if (A00 != -1 && A00 <= 4) {
                int A01 = (int) C0282Bn.A01(this.A06, A00, false);
                if (this.A03.A8U(A01)) {
                    bp.AEk(A00);
                    return A01;
                }
            }
            bp.AEk(1);
        }
    }

    private long A02(BP bp, int i) throws IOException, InterruptedException {
        bp.readFully(this.A06, 0, i);
        long j = 0;
        for (int i2 = 0; i2 < i; i2++) {
            long value = this.A06[i2] & 255;
            j = (j << 8) | value;
        }
        return j;
    }

    private String A04(BP bp, int i) throws IOException, InterruptedException {
        if (i == 0) {
            return A03(0, 0, 34);
        }
        byte[] bArr = new byte[i];
        bp.readFully(bArr, 0, i);
        while (i > 0 && bArr[i - 1] == 0) {
            i--;
        }
        return new String(bArr, 0, i);
    }

    @Override // com.facebook.ads.redexgen.X.Bg
    public final void A8H(InterfaceC0281Bi interfaceC0281Bi) {
        this.A03 = interfaceC0281Bi;
    }

    @Override // com.facebook.ads.redexgen.X.Bg
    public final boolean ADS(BP bp) throws IOException, InterruptedException {
        long j;
        int i;
        H6.A04(this.A03 != null);
        while (true) {
            if (!this.A05.isEmpty()) {
                long A7D = bp.A7D();
                j = this.A05.peek().A01;
                if (A7D >= j) {
                    InterfaceC0281Bi interfaceC0281Bi = this.A03;
                    i = this.A05.pop().A00;
                    interfaceC0281Bi.A5B(i);
                    return true;
                }
            }
            if (this.A01 == 0) {
                long A05 = this.A04.A05(bp, true, false, 4);
                if (A05 == -2) {
                    A05 = A01(bp);
                }
                if (A05 == -1) {
                    return false;
                }
                this.A00 = (int) A05;
                this.A01 = 1;
            }
            if (this.A01 == 1) {
                this.A02 = this.A04.A05(bp, false, true, 8);
                this.A01 = 2;
            }
            int A6R = this.A03.A6R(this.A00);
            if (A6R != 0) {
                if (A6R == 1) {
                    long A7D2 = bp.A7D();
                    this.A05.push(new C0280Bf(this.A00, A7D2 + this.A02));
                    this.A03.AEp(this.A00, A7D2, this.A02);
                    this.A01 = 0;
                    return true;
                } else if (A6R == 2) {
                    long j2 = this.A02;
                    if (j2 <= 8) {
                        this.A03.A8J(this.A00, A02(bp, (int) j2));
                        this.A01 = 0;
                        return true;
                    }
                    throw new C9R(A03(41, 22, 60) + this.A02);
                } else if (A6R == 3) {
                    long j3 = this.A02;
                    if (j3 <= 2147483647L) {
                        this.A03.AEx(this.A00, A04(bp, (int) j3));
                        this.A01 = 0;
                        return true;
                    }
                    throw new C9R(A03(63, 21, 81) + this.A02);
                } else if (A6R == 4) {
                    this.A03.A3r(this.A00, (int) this.A02, bp);
                    this.A01 = 0;
                    return true;
                } else if (A6R == 5) {
                    long j4 = this.A02;
                    int type = (j4 > 4L ? 1 : (j4 == 4L ? 0 : -1));
                    if (type != 0) {
                        int type2 = (j4 > 8L ? 1 : (j4 == 8L ? 0 : -1));
                        if (type2 != 0) {
                            throw new C9R(A03(21, 20, 82) + this.A02);
                        }
                    }
                    InterfaceC0281Bi interfaceC0281Bi2 = this.A03;
                    int i2 = this.A00;
                    int type3 = (int) this.A02;
                    interfaceC0281Bi2.A5P(i2, A00(bp, type3));
                    this.A01 = 0;
                    return true;
                } else {
                    throw new C9R(A03(0, 21, 0) + A6R);
                }
            }
            int type4 = (int) this.A02;
            bp.AEk(type4);
            this.A01 = 0;
        }
    }

    @Override // com.facebook.ads.redexgen.X.Bg
    public final void reset() {
        this.A01 = 0;
        this.A05.clear();
        this.A04.A06();
    }
}
