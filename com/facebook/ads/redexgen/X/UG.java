package com.facebook.ads.redexgen.X;

import com.facebook.ads.internal.exoplayer2.Format;
import java.io.EOFException;
import java.io.IOException;
import java.nio.ByteBuffer;
/* loaded from: assets/audience_network.dex */
public final class UG implements InterfaceC0279Ba {
    public static String[] A0F = {"I0oQBEUbvXwmLkE4WWtRMgz", "xnniIxRr7DxSpuMWabRYn3WDpy4qBN9b", "Y7uRaXgz80uNyvcPATB9r3b0PwOkuM1V", "hSCUvOutOZqOqVGgCzlnUKxaNOAoeOWK", "Xz3O4WRIuCzLKbQHyaIDpuywePn7", "cSGy8Fn9cMgpPa", "oA7ibzMCvoxqvUcH1m6Eely4XW9nrCN1", "6CG0cGfKidBjxaDlKmMoUzgrmHvkLCHY"};
    public long A00;
    public long A01;
    public Format A02;
    public Format A03;
    public C0348Ef A04;
    public C0348Ef A05;
    public C0348Ef A06;
    public InterfaceC0349Eg A07;
    public boolean A08;
    public boolean A09;
    public final int A0A;
    public final GI A0D;
    public final C0347Ee A0C = new C0347Ee();
    public final C0346Ed A0B = new C0346Ed();
    public final HV A0E = new HV(32);

    public UG(GI gi) {
        this.A0D = gi;
        this.A0A = gi.A6m();
        this.A04 = new C0348Ef(0L, this.A0A);
        C0348Ef c0348Ef = this.A04;
        this.A05 = c0348Ef;
        this.A06 = c0348Ef;
    }

    private int A00(int i) {
        if (!this.A06.A02) {
            this.A06.A02(this.A0D.A3L(), new C0348Ef(this.A06.A03, this.A0A));
        }
        return Math.min(i, (int) (this.A06.A03 - this.A01));
    }

    public static Format A01(Format format, long j) {
        if (format == null) {
            return null;
        }
        if (j != 0 && format.A0G != Long.MAX_VALUE) {
            return format.A0H(format.A0G + j);
        }
        return format;
    }

    private void A02(int i) {
        this.A01 += i;
        if (this.A01 == this.A06.A03) {
            this.A06 = this.A06.A00;
        }
    }

    private void A03(long j) {
        while (j >= this.A05.A03) {
            this.A05 = this.A05.A00;
        }
    }

    private void A04(long j) {
        if (j == -1) {
            return;
        }
        while (j >= this.A04.A03) {
            GI gi = this.A0D;
            GH gh = this.A04.A01;
            if (A0F[7].charAt(20) != 'U') {
                throw new RuntimeException();
            }
            String[] strArr = A0F;
            strArr[3] = "uyKFH8oWQ0ou8mdxvkWufQ8fbIwtl6Z0";
            strArr[1] = "5GODjm0a5UxNqoFNrNo0AvXndV19DDx4";
            gi.ADg(gh);
            this.A04 = this.A04.A01();
        }
        if (this.A05.A04 < this.A04.A04) {
            this.A05 = this.A04;
        }
    }

    private void A05(long j, ByteBuffer byteBuffer, int i) {
        A03(j);
        while (i > 0) {
            int remaining = (int) (this.A05.A03 - j);
            int min = Math.min(i, remaining);
            byte[] bArr = this.A05.A01.A01;
            int remaining2 = this.A05.A00(j);
            byteBuffer.put(bArr, remaining2, min);
            i -= min;
            j += min;
            int remaining3 = (j > this.A05.A03 ? 1 : (j == this.A05.A03 ? 0 : -1));
            if (remaining3 == 0) {
                this.A05 = this.A05.A00;
            }
        }
    }

    private void A06(long j, byte[] bArr, int i) {
        A03(j);
        int i2 = i;
        while (i2 > 0) {
            int min = Math.min(i2, (int) (this.A05.A03 - j));
            byte[] bArr2 = this.A05.A01.A01;
            int toCopy = this.A05.A00(j);
            int remaining = i - i2;
            System.arraycopy(bArr2, toCopy, bArr, remaining, min);
            i2 -= min;
            j += min;
            int remaining2 = (j > this.A05.A03 ? 1 : (j == this.A05.A03 ? 0 : -1));
            if (remaining2 == 0) {
                this.A05 = this.A05.A00;
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:22:0x00ae, code lost:
        if (r10 < r11) goto L35;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private void A07(com.facebook.ads.redexgen.X.C0784Vn r20, com.facebook.ads.redexgen.X.C0346Ed r21) {
        /*
            Method dump skipped, instructions count: 292
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.ads.redexgen.X.UG.A07(com.facebook.ads.redexgen.X.Vn, com.facebook.ads.redexgen.X.Ed):void");
    }

    /* JADX WARN: Incorrect condition in loop: B:7:0x0019 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private void A08(com.facebook.ads.redexgen.X.C0348Ef r6) {
        /*
            r5 = this;
            boolean r0 = r6.A02
            if (r0 != 0) goto L5
            return
        L5:
            com.facebook.ads.redexgen.X.Ef r0 = r5.A06
            boolean r4 = r0.A02
            com.facebook.ads.redexgen.X.Ef r0 = r5.A06
            long r2 = r0.A04
            long r0 = r6.A04
            long r2 = r2 - r0
            int r1 = (int) r2
            int r0 = r5.A0A
            int r1 = r1 / r0
            int r4 = r4 + r1
            com.facebook.ads.redexgen.X.GH[] r2 = new com.facebook.ads.redexgen.X.GH[r4]
            r1 = 0
        L18:
            int r0 = r2.length
            if (r1 >= r0) goto L26
            com.facebook.ads.redexgen.X.GH r0 = r6.A01
            r2[r1] = r0
            com.facebook.ads.redexgen.X.Ef r6 = r6.A01()
            int r1 = r1 + 1
            goto L18
        L26:
            com.facebook.ads.redexgen.X.GI r0 = r5.A0D
            r0.ADh(r2)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.ads.redexgen.X.UG.A08(com.facebook.ads.redexgen.X.Ef):void");
    }

    private final void A09(boolean z) {
        this.A0C.A0H(z);
        A08(this.A04);
        this.A04 = new C0348Ef(0L, this.A0A);
        C0348Ef c0348Ef = this.A04;
        this.A05 = c0348Ef;
        this.A06 = c0348Ef;
        this.A01 = 0L;
        this.A0D.AF3();
    }

    public final int A0A() {
        return this.A0C.A07();
    }

    public final int A0B() {
        return this.A0C.A05();
    }

    public final int A0C() {
        return this.A0C.A06();
    }

    public final int A0D(long j, boolean z, boolean z2) {
        return this.A0C.A08(j, z, z2);
    }

    public final int A0E(C9L c9l, C0784Vn c0784Vn, boolean z, boolean z2, long j) {
        int A09 = this.A0C.A09(c9l, c0784Vn, z, z2, this.A02, this.A0B);
        if (A09 == -5) {
            this.A02 = c9l.A00;
            return -5;
        } else if (A09 != -4) {
            if (A09 == -3) {
                return -3;
            }
            throw new IllegalStateException();
        } else {
            if (!c0784Vn.A04()) {
                long j2 = c0784Vn.A00;
                if (A0F[7].charAt(20) != 'U') {
                    throw new RuntimeException();
                }
                A0F[2] = "VD6eroQucXdNz3MsoKHIT4kATW1JDfRN";
                int result = (j2 > j ? 1 : (j2 == j ? 0 : -1));
                if (result < 0) {
                    c0784Vn.A00(Integer.MIN_VALUE);
                }
                if (c0784Vn.A0A()) {
                    A07(c0784Vn, this.A0B);
                }
                int result2 = this.A0B.A00;
                c0784Vn.A09(result2);
                long j3 = this.A0B.A01;
                ByteBuffer byteBuffer = c0784Vn.A01;
                int result3 = this.A0B.A00;
                A05(j3, byteBuffer, result3);
            }
            return -4;
        }
    }

    public final long A0F() {
        return this.A0C.A0B();
    }

    public final Format A0G() {
        return this.A0C.A0E();
    }

    public final void A0H() {
        A04(this.A0C.A0A());
    }

    public final void A0I() {
        A09(false);
    }

    public final void A0J() {
        this.A0C.A0F();
        this.A05 = this.A04;
    }

    public final void A0K(long j, boolean z, boolean z2) {
        A04(this.A0C.A0D(j, z, z2));
    }

    public final void A0L(InterfaceC0349Eg interfaceC0349Eg) {
        this.A07 = interfaceC0349Eg;
    }

    public final boolean A0M() {
        return this.A0C.A0I();
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC0279Ba
    public final void A5T(Format format) {
        Format A01 = A01(format, this.A00);
        boolean formatChanged = this.A0C.A0K(A01);
        this.A03 = format;
        this.A08 = false;
        InterfaceC0349Eg interfaceC0349Eg = this.A07;
        if (interfaceC0349Eg != null && formatChanged) {
            interfaceC0349Eg.ACY(A01);
        }
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC0279Ba
    public final int AE7(BP bp, int i, boolean z) throws IOException, InterruptedException {
        int read = bp.read(this.A06.A01.A01, this.A06.A00(this.A01), A00(i));
        if (read == -1) {
            if (z) {
                return -1;
            }
            throw new EOFException();
        }
        A02(read);
        if (A0F[4].length() != 13) {
            String[] strArr = A0F;
            strArr[0] = "gj56WjutkODHGuBsULoCjgk";
            strArr[5] = "cXoHIYif5j6YkS";
            return read;
        }
        throw new RuntimeException();
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC0279Ba
    public final void AE8(HV hv, int i) {
        while (i > 0) {
            int A00 = A00(i);
            byte[] bArr = this.A06.A01.A01;
            int bytesAppended = this.A06.A00(this.A01);
            hv.A0c(bArr, bytesAppended, A00);
            i -= A00;
            A02(A00);
        }
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC0279Ba
    public final void AE9(long j, int i, int i2, int i3, BZ bz) {
        if (this.A08) {
            A5T(this.A03);
        }
        if (this.A09) {
            if ((i & 1) == 0) {
                return;
            }
            C0347Ee c0347Ee = this.A0C;
            if (A0F[4].length() == 13) {
                throw new RuntimeException();
            }
            String[] strArr = A0F;
            strArr[3] = "x9Xeu0fQ5laTPGHIgNPQILpO6czCAzIw";
            strArr[1] = "ozcoxAULLkb5oe9KcRf5sNeK93qRoKsz";
            if (!c0347Ee.A0J(j)) {
                return;
            }
            String[] strArr2 = A0F;
            if (strArr2[0].length() == strArr2[5].length()) {
                throw new RuntimeException();
            }
            A0F[7] = "2aF6Rrv8pvM6dW2iEnwFUFag8sTvrLLb";
            this.A09 = false;
        }
        this.A0C.A0G(j + this.A00, i, (this.A01 - i2) - i3, i2, bz);
    }
}
