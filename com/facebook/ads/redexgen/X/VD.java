package com.facebook.ads.redexgen.X;

import a.a.j;
import com.facebook.ads.internal.exoplayer2.Format;
import com.facebook.ads.internal.exoplayer2.metadata.Metadata;
import java.io.IOException;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Arrays;
/* loaded from: assets/audience_network.dex */
public final class VD implements BO, BX {
    public static byte[] A0J;
    public static String[] A0K = {"0jSfxoXEMfCjtmnyDugkNcQJRjSOySMa", "bnCyjA5DcUmWUqivzOXdDI", "awYt8cnKxKdhDKIItvFTiUYUED9yM0q1", "Luabopmg5NHaS5SoCXeHIbwAQFsLRvJ0", "odfzLqPoxtdmNhQ8QVXSS2", "Wo8IxRBaFRXe4oQbEdt7BomqryNllMGC", "1wQy", "sEQm6Nsu4XqoPKwwi3EdYrJfunZcOKFC"};
    public static final BR A0L;
    public static final int A0M;
    public int A00;
    public int A01;
    public int A02;
    public int A03;
    public int A04;
    public int A05;
    public int A06;
    public long A07;
    public long A08;
    public BQ A09;
    public HV A0A;
    public boolean A0B;
    public C4[] A0C;
    public long[][] A0D;
    public final int A0E;
    public final HV A0F;
    public final HV A0G;
    public final HV A0H;
    public final ArrayDeque<VL> A0I;

    public static String A04(int i, int i2, int i3) {
        byte[] copyOfRange = Arrays.copyOfRange(A0J, i, i + i2);
        for (int i4 = 0; i4 < copyOfRange.length; i4++) {
            copyOfRange[i4] = (byte) ((copyOfRange[i4] ^ i3) ^ 28);
        }
        return new String(copyOfRange);
    }

    public static void A07() {
        A0J = new byte[]{57, 12, 23, 21, 88, 11, 17, 2, 29, 88, 20, 29, 11, 11, 88, 12, 16, 25, 22, 88, 16, 29, 25, 28, 29, 10, 88, 20, 29, 22, 31, 12, 16, 88, 80, 13, 22, 11, 13, 8, 8, 23, 10, 12, 29, 28, 81, 86, 4, 1, 85, 85};
    }

    static {
        A07();
        A0L = new VE();
        A0M = C0430Hl.A08(A04(48, 4, j.AppCompatTheme_textColorSearchUrl));
    }

    public VD() {
        this(0);
    }

    public VD(int i) {
        this.A0E = i;
        this.A0F = new HV(16);
        this.A0I = new ArrayDeque<>();
        this.A0H = new HV(HR.A03);
        this.A0G = new HV(4);
        this.A06 = -1;
    }

    private int A00(long j) {
        long sampleAccumulatedBytes = Long.MAX_VALUE;
        int i = 1;
        int i2 = -1;
        long j2 = Long.MAX_VALUE;
        long j3 = Long.MAX_VALUE;
        int trackIndex = 1;
        int minAccumulatedBytesTrackIndex = -1;
        int i3 = 0;
        while (true) {
            C4[] c4Arr = this.A0C;
            if (i3 >= c4Arr.length) {
                break;
            }
            C4 c4 = c4Arr[i3];
            int i4 = c4.A00;
            if (i4 != c4.A03.A01) {
                long j4 = c4.A03.A06[i4];
                long j5 = this.A0D[i3][i4];
                long j6 = j4 - j;
                int i5 = (j6 < 0 || j6 >= 262144) ? 1 : 0;
                if ((i5 == 0 && i != 0) || (i5 == i && j6 < sampleAccumulatedBytes)) {
                    i = i5;
                    sampleAccumulatedBytes = j6;
                    i2 = i3;
                    j2 = j5;
                }
                if (j5 < j3) {
                    j3 = j5;
                    trackIndex = i5;
                    minAccumulatedBytesTrackIndex = i3;
                }
            }
            i3++;
        }
        int i6 = (j3 > Long.MAX_VALUE ? 1 : (j3 == Long.MAX_VALUE ? 0 : -1));
        if (A0K[5].charAt(28) != 'l') {
            throw new RuntimeException();
        }
        String[] strArr = A0K;
        strArr[7] = "2rf3IkD44HipF2iEZWYVpECLVHr0uALb";
        strArr[0] = "2zlrhAiZVnIklu1FhIrlCsqVaSaq97eM";
        if (i6 == 0 || trackIndex == 0) {
            return i2;
        }
        long preferredSkipAmount = 10485760 + j3;
        if (j2 < preferredSkipAmount) {
            return i2;
        }
        return minAccumulatedBytesTrackIndex;
    }

    private int A01(BP bp, BV bv) throws IOException, InterruptedException {
        int i;
        long A7D = bp.A7D();
        if (this.A06 == -1) {
            this.A06 = A00(A7D);
            if (this.A06 == -1) {
                return -1;
            }
        }
        C4 c4 = this.A0C[this.A06];
        InterfaceC0279Ba trackOutput = c4.A01;
        int i2 = c4.A00;
        long j = c4.A03.A06[i2];
        int sampleSize = c4.A03.A05[i2];
        long j2 = (j - A7D) + this.A04;
        if (j2 < 0 || j2 >= 262144) {
            bv.A00 = j;
            return 1;
        }
        if (c4.A02.A02 == 1) {
            j2 += 8;
            sampleSize -= 8;
        }
        bp.AEk((int) j2);
        if (c4.A02.A01 != 0) {
            byte[] bArr = this.A0G.A00;
            bArr[0] = 0;
            bArr[1] = 0;
            bArr[2] = 0;
            int i3 = c4.A02.A01;
            int i4 = 4 - c4.A02.A01;
            while (this.A04 < sampleSize) {
                int i5 = this.A05;
                if (i5 == 0) {
                    bp.readFully(this.A0G.A00, i4, i3);
                    this.A0G.A0Y(0);
                    this.A05 = this.A0G.A0H();
                    this.A0H.A0Y(0);
                    trackOutput.AE8(this.A0H, 4);
                    this.A04 += 4;
                    sampleSize += i4;
                } else {
                    int AE7 = trackOutput.AE7(bp, i5, false);
                    this.A04 += AE7;
                    this.A05 -= AE7;
                }
            }
            i = 0;
        } else {
            while (true) {
                int i6 = this.A04;
                if (i6 >= sampleSize) {
                    break;
                }
                int AE72 = trackOutput.AE7(bp, sampleSize - i6, false);
                this.A04 += AE72;
                this.A05 -= AE72;
            }
            i = 0;
        }
        trackOutput.AE9(c4.A03.A07[i2], c4.A03.A04[i2], sampleSize, 0, null);
        c4.A00++;
        this.A06 = -1;
        this.A04 = i;
        this.A05 = i;
        return i;
    }

    public static int A02(CD cd, long j) {
        int A00 = cd.A00(j);
        if (A00 == -1) {
            return cd.A01(j);
        }
        return A00;
    }

    public static long A03(CD cd, long j, long j2) {
        int A02 = A02(cd, j);
        if (A02 == -1) {
            return j2;
        }
        return Math.min(cd.A06[A02], j2);
    }

    private ArrayList<CD> A05(VL vl, BS bs, boolean z) throws C9R {
        CA A0C;
        ArrayList<CD> arrayList = new ArrayList<>();
        int i = 0;
        while (true) {
            int size = vl.A01.size();
            String[] strArr = A0K;
            String str = strArr[2];
            String str2 = strArr[3];
            int i2 = str.length();
            if (i2 != str2.length()) {
                throw new RuntimeException();
            }
            String[] strArr2 = A0K;
            strArr2[7] = "cCqXKTxpaVHnB5xhxhubewm2proDizNi";
            strArr2[0] = "XNMFZPcuybbaYtAFLaJvO7GLnY5oO3YZ";
            if (i < size) {
                VL vl2 = vl.A01.get(i);
                int i3 = ((AbstractC0283Bp) vl2).A00;
                if (i3 == AbstractC0283Bp.A1L && (A0C = C0288Bu.A0C(vl2, vl.A07(AbstractC0283Bp.A0n), -9223372036854775807L, null, z, this.A0B)) != null) {
                    CD A0E = C0288Bu.A0E(A0C, vl2.A06(AbstractC0283Bp.A0d).A06(AbstractC0283Bp.A0h).A06(AbstractC0283Bp.A16), bs);
                    if (A0E.A01 != 0) {
                        arrayList.add(A0E);
                    }
                }
                i++;
            } else {
                return arrayList;
            }
        }
    }

    private void A06() {
        this.A03 = 0;
        this.A00 = 0;
    }

    private void A08(long j) throws C9R {
        while (!this.A0I.isEmpty() && this.A0I.peek().A00 == j) {
            VL pop = this.A0I.pop();
            if (((AbstractC0283Bp) pop).A00 == AbstractC0283Bp.A0j) {
                A0A(pop);
                this.A0I.clear();
                this.A03 = 2;
            } else if (!this.A0I.isEmpty()) {
                VL containerAtom = this.A0I.peek();
                containerAtom.A08(pop);
            }
        }
        if (this.A03 != 2) {
            A06();
        }
    }

    private void A09(long j) {
        C4[] c4Arr;
        for (C4 track : this.A0C) {
            CD cd = track.A03;
            int A00 = cd.A00(j);
            if (A00 == -1) {
                A00 = cd.A01(j);
            }
            track.A00 = A00;
        }
    }

    private void A0A(VL vl) throws C9R {
        ArrayList<CD> A05;
        int trackCount = -1;
        long j = -9223372036854775807L;
        ArrayList arrayList = new ArrayList();
        Metadata metadata = null;
        BS bs = new BS();
        VK A07 = vl.A07(AbstractC0283Bp.A1P);
        if (A07 != null && (metadata = C0288Bu.A0F(A07, this.A0B)) != null) {
            bs.A05(metadata);
        }
        try {
            A05 = A05(vl, bs, (this.A0E & 1) != 0);
        } catch (VH unused) {
            bs = new BS();
            A05 = A05(vl, bs, true);
        }
        int size = A05.size();
        for (int i = 0; i < size; i++) {
            CD cd = A05.get(i);
            CA ca = cd.A03;
            C4 c4 = new C4(ca, cd, this.A09.AF2(i, ca.A03));
            Format A0F = ca.A07.A0F(cd.A00 + 30);
            if (ca.A03 == 1) {
                if (bs.A03()) {
                    A0F = A0F.A0G(bs.A00, bs.A01);
                }
                if (metadata != null) {
                    A0F = A0F.A0J(metadata);
                }
            }
            c4.A01.A5T(A0F);
            j = Math.max(j, ca.A04 != -9223372036854775807L ? ca.A04 : cd.A02);
            if (ca.A03 == 2 && trackCount == -1) {
                trackCount = arrayList.size();
            }
            arrayList.add(c4);
        }
        this.A02 = trackCount;
        this.A08 = j;
        this.A0C = (C4[]) arrayList.toArray(new C4[arrayList.size()]);
        this.A0D = A0G(this.A0C);
        this.A09.A5C();
        this.A09.AEE(this);
    }

    public static boolean A0B(int i) {
        if (i != AbstractC0283Bp.A0j) {
            int i2 = AbstractC0283Bp.A1L;
            String[] strArr = A0K;
            if (strArr[4].length() == strArr[6].length()) {
                throw new RuntimeException();
            }
            String[] strArr2 = A0K;
            strArr2[2] = "xHWkCkmm9lwx55Xb6ilKRbCBaMi3tx91";
            strArr2[3] = "ufwmFaOIh4ETn2yFiF4b2v05oMaexVS8";
            if (i != i2 && i != AbstractC0283Bp.A0d && i != AbstractC0283Bp.A0h && i != AbstractC0283Bp.A16 && i != AbstractC0283Bp.A0N) {
                return false;
            }
        }
        return true;
    }

    public static boolean A0C(int i) {
        if (i != AbstractC0283Bp.A0c && i != AbstractC0283Bp.A0n && i != AbstractC0283Bp.A0V && i != AbstractC0283Bp.A1A && i != AbstractC0283Bp.A1D && i != AbstractC0283Bp.A1B) {
            int i2 = AbstractC0283Bp.A0C;
            if (A0K[1].length() != 22) {
                throw new RuntimeException();
            }
            A0K[1] = "WjfYMB7jPbcUwDvfNOpuH1";
            if (i != i2 && i != AbstractC0283Bp.A0O && i != AbstractC0283Bp.A19 && i != AbstractC0283Bp.A1C && i != AbstractC0283Bp.A1E && i != AbstractC0283Bp.A17 && i != AbstractC0283Bp.A0B && i != AbstractC0283Bp.A1J && i != AbstractC0283Bp.A0U && i != AbstractC0283Bp.A1P) {
                return false;
            }
        }
        return true;
    }

    private boolean A0D(BP bp) throws IOException, InterruptedException {
        if (this.A00 == 0) {
            if (!bp.ADV(this.A0F.A00, 0, 8, true)) {
                return false;
            }
            this.A00 = 8;
            this.A0F.A0Y(0);
            this.A07 = this.A0F.A0M();
            this.A01 = this.A0F.A08();
        }
        long endPosition = this.A07;
        if (endPosition == 1) {
            bp.readFully(this.A0F.A00, 8, 8);
            int headerBytesRemaining = this.A00;
            this.A00 = headerBytesRemaining + 8;
            this.A07 = this.A0F.A0N();
        } else if (endPosition == 0) {
            long A6r = bp.A6r();
            if (A6r == -1 && !this.A0I.isEmpty()) {
                A6r = this.A0I.peek().A00;
            }
            if (A6r != -1) {
                this.A07 = (A6r - bp.A7D()) + this.A00;
            }
        }
        if (this.A07 >= this.A00) {
            if (A0B(this.A01)) {
                long A7D = (bp.A7D() + this.A07) - this.A00;
                this.A0I.push(new VL(this.A01, A7D));
                if (this.A07 == this.A00) {
                    A08(A7D);
                } else {
                    A06();
                }
            } else if (A0C(this.A01)) {
                H6.A04(this.A00 == 8);
                H6.A04(this.A07 <= 2147483647L);
                this.A0A = new HV((int) this.A07);
                System.arraycopy(this.A0F.A00, 0, this.A0A.A00, 0, 8);
                this.A03 = 1;
            } else {
                this.A0A = null;
                this.A03 = 1;
            }
            return true;
        }
        throw new C9R(A04(0, 48, 100));
    }

    private boolean A0E(BP bp, BV bv) throws IOException, InterruptedException {
        long j = this.A07 - this.A00;
        long atomEndPosition = bp.A7D() + j;
        boolean z = false;
        HV hv = this.A0A;
        if (hv != null) {
            bp.readFully(hv.A00, this.A00, (int) j);
            if (this.A01 == AbstractC0283Bp.A0U) {
                this.A0B = A0F(this.A0A);
            } else if (!this.A0I.isEmpty()) {
                this.A0I.peek().A09(new VK(this.A01, this.A0A));
            }
        } else if (j < 262144) {
            bp.AEk((int) j);
        } else {
            long atomPayloadSize = bp.A7D();
            bv.A00 = atomPayloadSize + j;
            z = true;
        }
        A08(atomEndPosition);
        return z && this.A03 != 2;
    }

    /* JADX WARN: Incorrect condition in loop: B:7:0x0017 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static boolean A0F(com.facebook.ads.redexgen.X.HV r3) {
        /*
            r0 = 8
            r3.A0Y(r0)
            int r1 = r3.A08()
            int r0 = com.facebook.ads.redexgen.X.VD.A0M
            r2 = 1
            if (r1 != r0) goto Lf
            return r2
        Lf:
            r0 = 4
            r3.A0Z(r0)
        L13:
            int r0 = r3.A04()
            if (r0 <= 0) goto L22
            int r1 = r3.A08()
            int r0 = com.facebook.ads.redexgen.X.VD.A0M
            if (r1 != r0) goto L13
            return r2
        L22:
            r0 = 0
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.ads.redexgen.X.VD.A0F(com.facebook.ads.redexgen.X.HV):boolean");
    }

    public static long[][] A0G(C4[] c4Arr) {
        long[][] jArr = new long[c4Arr.length];
        int[] iArr = new int[c4Arr.length];
        long[] jArr2 = new long[c4Arr.length];
        boolean[] tracksFinished = new boolean[c4Arr.length];
        for (int i = 0; i < c4Arr.length; i++) {
            jArr[i] = new long[c4Arr[i].A03.A01];
            jArr2[i] = c4Arr[i].A03.A07[0];
        }
        long j = 0;
        int i2 = 0;
        while (i2 < c4Arr.length) {
            long j2 = Long.MAX_VALUE;
            int minTimeTrackIndex = -1;
            for (int i3 = 0; i3 < c4Arr.length; i3++) {
                if (!tracksFinished[i3]) {
                    long minTimeUs = jArr2[i3];
                    if (minTimeUs <= j2) {
                        minTimeTrackIndex = i3;
                        j2 = jArr2[i3];
                    }
                }
            }
            int i4 = iArr[minTimeTrackIndex];
            jArr[minTimeTrackIndex][i4] = j;
            j += c4Arr[minTimeTrackIndex].A03.A05[i4];
            int i5 = i4 + 1;
            iArr[minTimeTrackIndex] = i5;
            if (i5 < jArr[minTimeTrackIndex].length) {
                jArr2[minTimeTrackIndex] = c4Arr[minTimeTrackIndex].A03.A07[i5];
            } else {
                tracksFinished[minTimeTrackIndex] = true;
                i2++;
            }
        }
        return jArr;
    }

    @Override // com.facebook.ads.redexgen.X.BX
    public final long A6Q() {
        return this.A08;
    }

    @Override // com.facebook.ads.redexgen.X.BX
    public final BW A7M(long j) {
        long j2;
        long j3;
        int sampleIndex;
        C4[] c4Arr = this.A0C;
        if (c4Arr.length == 0) {
            return new BW(BY.A04);
        }
        long secondOffset = -9223372036854775807L;
        long secondTimeUs = -1;
        int i = this.A02;
        if (i != -1) {
            CD cd = c4Arr[i].A03;
            int A02 = A02(cd, j);
            if (A02 == -1) {
                return new BW(BY.A04);
            }
            j2 = cd.A07[A02];
            j3 = cd.A06[A02];
            int secondSampleIndex = (j2 > j ? 1 : (j2 == j ? 0 : -1));
            if (secondSampleIndex < 0) {
                int secondSampleIndex2 = cd.A01;
                int i2 = secondSampleIndex2 - 1;
                if (A0K[5].charAt(28) == 'l') {
                    String[] strArr = A0K;
                    strArr[4] = "wZC6PUUkwbL39FGS7qgHi4";
                    strArr[6] = "ISWp";
                    if (A02 < i2 && (sampleIndex = cd.A01(j)) != -1 && sampleIndex != A02) {
                        secondOffset = cd.A07[sampleIndex];
                        secondTimeUs = cd.A06[sampleIndex];
                    }
                }
                throw new RuntimeException();
            }
        } else {
            j2 = j;
            j3 = Long.MAX_VALUE;
        }
        int secondSampleIndex3 = 0;
        while (true) {
            C4[] c4Arr2 = this.A0C;
            if (A0K[5].charAt(28) != 'l') {
                break;
            }
            String[] strArr2 = A0K;
            strArr2[2] = "HuKpkwhwNffVsg1qOYm34WvQGcpzf7CA";
            strArr2[3] = "OpSxQ7AB5KpfVVm82hohcPrOWAs1xSas";
            if (secondSampleIndex3 < c4Arr2.length) {
                if (secondSampleIndex3 != this.A02) {
                    CD cd2 = c4Arr2[secondSampleIndex3].A03;
                    j3 = A03(cd2, j2, j3);
                    if (secondOffset != -9223372036854775807L) {
                        secondTimeUs = A03(cd2, secondOffset, secondTimeUs);
                    }
                }
                secondSampleIndex3++;
            } else {
                BY by = new BY(j2, j3);
                if (secondOffset == -9223372036854775807L) {
                    return new BW(by);
                }
                return new BW(by, new BY(secondOffset, secondTimeUs));
            }
        }
        throw new RuntimeException();
    }

    @Override // com.facebook.ads.redexgen.X.BO
    public final void A8G(BQ bq) {
        this.A09 = bq;
    }

    @Override // com.facebook.ads.redexgen.X.BX
    public final boolean A8d() {
        return true;
    }

    @Override // com.facebook.ads.redexgen.X.BO
    public final int ADQ(BP bp, BV bv) throws IOException, InterruptedException {
        while (true) {
            int i = this.A03;
            String[] strArr = A0K;
            if (strArr[2].length() != strArr[3].length()) {
                throw new RuntimeException();
            }
            String[] strArr2 = A0K;
            strArr2[7] = "qJxbwGisfZf9YKIw0pjhTsx78598m8MK";
            strArr2[0] = "kX2rligkfJBBB9teOSCW5LaSmFhGBJWo";
            if (i != 0) {
                if (i != 1) {
                    if (i == 2) {
                        return A01(bp, bv);
                    }
                    throw new IllegalStateException();
                } else if (A0E(bp, bv)) {
                    return 1;
                }
            } else if (!A0D(bp)) {
                return -1;
            }
        }
    }

    @Override // com.facebook.ads.redexgen.X.BO
    public final void AED(long j, long j2) {
        this.A0I.clear();
        this.A00 = 0;
        this.A06 = -1;
        this.A04 = 0;
        this.A05 = 0;
        if (j == 0) {
            A06();
        } else if (this.A0C == null) {
        } else {
            A09(j2);
        }
    }

    @Override // com.facebook.ads.redexgen.X.BO
    public final boolean AEm(BP bp) throws IOException, InterruptedException {
        return C8.A04(bp);
    }
}
