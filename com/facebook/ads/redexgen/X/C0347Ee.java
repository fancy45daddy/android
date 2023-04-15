package com.facebook.ads.redexgen.X;

import com.facebook.ads.internal.exoplayer2.Format;
/* renamed from: com.facebook.ads.redexgen.X.Ee  reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public final class C0347Ee {
    public static String[] A0I = {"CqT0KuE1AFfImBFy4ik", "hGcHjrCi226kocD9vKzS9HyQAF0ZqssA", "ZD81yrpYsqeXe4L", "XJx", "nsm5GlP1XQIMmswL2BtDEyl4JYnPccJt", "OHNFP06lkToQsW2YsoX4lx0", "UGSwurzNNOniPMx0TIQOqAAX3osRvTJh", "YaODE33QO8vEeLZGxHQ5TNBfWhqIAS5S"};
    public int A00;
    public int A01 = 1000;
    public int A02;
    public int A03;
    public int A04;
    public int A05;
    public long A06;
    public long A07;
    public Format A08;
    public boolean A09;
    public boolean A0A;
    public int[] A0B;
    public int[] A0C;
    public int[] A0D;
    public long[] A0E;
    public long[] A0F;
    public Format[] A0G;
    public BZ[] A0H;

    /* JADX WARN: Failed to parse debug info
    java.lang.ArrayIndexOutOfBoundsException: Index 12 out of bounds for length 12
    	at jadx.plugins.input.dex.sections.debuginfo.DebugInfoParser.process(DebugInfoParser.java:147)
    	at jadx.plugins.input.dex.sections.DexCodeReader.getDebugInfo(DexCodeReader.java:118)
    	at jadx.core.dex.nodes.MethodNode.getDebugInfo(MethodNode.java:567)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.visit(DebugInfoAttachVisitor.java:39)
     */
    public final synchronized int A09(C9L c9l, C0784Vn c0784Vn, boolean z, boolean z2, Format format, C0346Ed c0346Ed) {
        if (!A0I()) {
            if (z2) {
                c0784Vn.A02(4);
                return -4;
            } else if (this.A08 == null || (!z && this.A08 == format)) {
                return -3;
            } else {
                c9l.A00 = this.A08;
                return -5;
            }
        }
        int A00 = A00(this.A03);
        if (z || this.A0G[A00] != format) {
            c9l.A00 = this.A0G[A00];
            return -5;
        } else if (c0784Vn.A0B()) {
            return -3;
        } else {
            c0784Vn.A00 = this.A0F[A00];
            c0784Vn.A02(this.A0B[A00]);
            c0346Ed.A00 = this.A0C[A00];
            c0346Ed.A01 = this.A0E[A00];
            c0346Ed.A02 = this.A0H[A00];
            this.A03++;
            return -4;
        }
    }

    /* JADX WARN: Failed to parse debug info
    java.lang.ArrayIndexOutOfBoundsException: Index 21 out of bounds for length 21
    	at jadx.plugins.input.dex.sections.debuginfo.DebugInfoParser.process(DebugInfoParser.java:147)
    	at jadx.plugins.input.dex.sections.DexCodeReader.getDebugInfo(DexCodeReader.java:118)
    	at jadx.core.dex.nodes.MethodNode.getDebugInfo(MethodNode.java:567)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.visit(DebugInfoAttachVisitor.java:39)
     */
    public final synchronized void A0G(long j, int i, long j2, int i2, BZ bz) {
        if (this.A0A) {
            if ((i & 1) == 0) {
                return;
            }
            this.A0A = false;
        }
        H6.A04(!this.A09);
        A04(j);
        int A00 = A00(this.A02);
        this.A0F[A00] = j;
        this.A0E[A00] = j2;
        this.A0C[A00] = i2;
        this.A0B[A00] = i;
        this.A0H[A00] = bz;
        this.A0G[A00] = this.A08;
        this.A0D[A00] = this.A05;
        this.A02++;
        if (this.A02 == this.A01) {
            int i3 = this.A01 + 1000;
            int[] iArr = new int[i3];
            long[] jArr = new long[i3];
            long[] jArr2 = new long[i3];
            int[] iArr2 = new int[i3];
            int[] iArr3 = new int[i3];
            BZ[] bzArr = new BZ[i3];
            Format[] formatArr = new Format[i3];
            int i4 = this.A01 - this.A04;
            System.arraycopy(this.A0E, this.A04, jArr, 0, i4);
            System.arraycopy(this.A0F, this.A04, jArr2, 0, i4);
            System.arraycopy(this.A0B, this.A04, iArr2, 0, i4);
            System.arraycopy(this.A0C, this.A04, iArr3, 0, i4);
            System.arraycopy(this.A0H, this.A04, bzArr, 0, i4);
            System.arraycopy(this.A0G, this.A04, formatArr, 0, i4);
            System.arraycopy(this.A0D, this.A04, iArr, 0, i4);
            int i5 = this.A04;
            System.arraycopy(this.A0E, 0, jArr, i4, i5);
            System.arraycopy(this.A0F, 0, jArr2, i4, i5);
            System.arraycopy(this.A0B, 0, iArr2, i4, i5);
            System.arraycopy(this.A0C, 0, iArr3, i4, i5);
            System.arraycopy(this.A0H, 0, bzArr, i4, i5);
            System.arraycopy(this.A0G, 0, formatArr, i4, i5);
            System.arraycopy(this.A0D, 0, iArr, i4, i5);
            this.A0E = jArr;
            this.A0F = jArr2;
            this.A0B = iArr2;
            this.A0C = iArr3;
            this.A0H = bzArr;
            this.A0G = formatArr;
            this.A0D = iArr;
            this.A04 = 0;
            this.A02 = this.A01;
            this.A01 = i3;
        }
    }

    /* JADX WARN: Failed to parse debug info
    java.lang.ArrayIndexOutOfBoundsException: Index 9 out of bounds for length 9
    	at jadx.plugins.input.dex.sections.debuginfo.DebugInfoParser.process(DebugInfoParser.java:147)
    	at jadx.plugins.input.dex.sections.DexCodeReader.getDebugInfo(DexCodeReader.java:118)
    	at jadx.core.dex.nodes.MethodNode.getDebugInfo(MethodNode.java:567)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.visit(DebugInfoAttachVisitor.java:39)
     */
    public final synchronized boolean A0J(long j) {
        if (this.A02 == 0) {
            return j > this.A06;
        } else if (Math.max(this.A06, A03(this.A03)) >= j) {
            return false;
        } else {
            int i = this.A02;
            int A00 = A00(this.A02 - 1);
            while (i > this.A03 && this.A0F[A00] >= j) {
                i--;
                A00--;
                if (A00 == -1) {
                    A00 = this.A01 - 1;
                }
            }
            A0C(this.A00 + i);
            return true;
        }
    }

    public C0347Ee() {
        int i = this.A01;
        this.A0D = new int[i];
        this.A0E = new long[i];
        this.A0F = new long[i];
        this.A0B = new int[i];
        this.A0C = new int[i];
        this.A0H = new BZ[i];
        this.A0G = new Format[i];
        this.A06 = Long.MIN_VALUE;
        this.A07 = Long.MIN_VALUE;
        this.A09 = true;
        this.A0A = true;
    }

    private int A00(int i) {
        int i2 = this.A04 + i;
        int relativeIndex = this.A01;
        return i2 < relativeIndex ? i2 : i2 - relativeIndex;
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0032, code lost:
        if ((r0 & 1) != 0) goto L16;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private int A01(int r8, int r9, long r10, boolean r12) {
        /*
            r7 = this;
            r6 = -1
            r3 = 0
        L2:
            if (r3 >= r9) goto L45
            long[] r0 = r7.A0F
            r4 = r0[r8]
            java.lang.String[] r2 = com.facebook.ads.redexgen.X.C0347Ee.A0I
            r0 = 3
            r1 = r2[r0]
            r0 = 5
            r0 = r2[r0]
            int r1 = r1.length()
            int r0 = r0.length()
            if (r1 == r0) goto L3f
            java.lang.String[] r2 = com.facebook.ads.redexgen.X.C0347Ee.A0I
            java.lang.String r1 = "JFV"
            r0 = 3
            r2[r0] = r1
            java.lang.String r1 = "8A9T2ZHBGF6P3L1HGcqfomX"
            r0 = 5
            r2[r0] = r1
            int r0 = (r4 > r10 ? 1 : (r4 == r10 ? 0 : -1))
            if (r0 > 0) goto L45
            if (r12 == 0) goto L34
            int[] r0 = r7.A0B
            r0 = r0[r8]
            r0 = r0 & 1
            if (r0 == 0) goto L35
        L34:
            r6 = r3
        L35:
            int r8 = r8 + 1
            int r0 = r7.A01
            if (r8 != r0) goto L3c
            r8 = 0
        L3c:
            int r3 = r3 + 1
            goto L2
        L3f:
            java.lang.RuntimeException r0 = new java.lang.RuntimeException
            r0.<init>()
            throw r0
        L45:
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.ads.redexgen.X.C0347Ee.A01(int, int, long, boolean):int");
    }

    private long A02(int i) {
        this.A06 = Math.max(this.A06, A03(i));
        this.A02 -= i;
        this.A00 += i;
        this.A04 += i;
        int i2 = this.A04;
        int i3 = this.A01;
        if (i2 >= i3) {
            int i4 = i2 - i3;
            String[] strArr = A0I;
            if (strArr[7].charAt(18) != strArr[6].charAt(18)) {
                throw new RuntimeException();
            }
            A0I[2] = "rmPQqkiHfMf";
            this.A04 = i4;
        }
        this.A03 -= i;
        if (this.A03 < 0) {
            if (A0I[2].length() == 8) {
                throw new RuntimeException();
            }
            String[] strArr2 = A0I;
            strArr2[4] = "rGNm6jdFTVK86xam60qdwwsNjuy3SfLS";
            strArr2[1] = "zCUBtEUnOSv2Jph2uhLKbu226T4aXBY5";
            this.A03 = 0;
        }
        if (this.A02 == 0) {
            int i5 = this.A04;
            if (i5 == 0) {
                i5 = this.A01;
            }
            int i6 = i5 - 1;
            long j = this.A0E[i6];
            int relativeLastDiscardIndex = this.A0C[i6];
            return j + relativeLastDiscardIndex;
        }
        return this.A0E[this.A04];
    }

    private long A03(int i) {
        if (i == 0) {
            return Long.MIN_VALUE;
        }
        long j = Long.MIN_VALUE;
        int A00 = A00(i - 1);
        for (int i2 = 0; i2 < i; i2++) {
            j = Math.max(j, this.A0F[A00]);
            int i3 = this.A0B[A00];
            if ((i3 & 1) != 0) {
                break;
            }
            A00--;
            if (A00 == -1) {
                int i4 = this.A01;
                String[] strArr = A0I;
                if (strArr[4].charAt(25) == strArr[1].charAt(25)) {
                    throw new RuntimeException();
                }
                String[] strArr2 = A0I;
                strArr2[3] = "3tp";
                strArr2[5] = "Z0W9OfGRhIfCW820bOQ6uFB";
                A00 = i4 - 1;
            }
        }
        return j;
    }

    private final synchronized void A04(long j) {
        this.A07 = Math.max(this.A07, j);
    }

    public final int A05() {
        return this.A00 + this.A03;
    }

    public final int A06() {
        return this.A00 + this.A02;
    }

    public final synchronized int A07() {
        int i;
        i = this.A02 - this.A03;
        int skipCount = this.A02;
        this.A03 = skipCount;
        return i;
    }

    public final synchronized int A08(long j, boolean z, boolean z2) {
        int A00 = A00(this.A03);
        if (A0I()) {
            int relativeReadIndex = (j > this.A0F[A00] ? 1 : (j == this.A0F[A00] ? 0 : -1));
            if (relativeReadIndex >= 0) {
                int relativeReadIndex2 = (j > this.A07 ? 1 : (j == this.A07 ? 0 : -1));
                if (relativeReadIndex2 <= 0 || z2) {
                    int i = this.A02;
                    int relativeReadIndex3 = this.A03;
                    int offset = A01(A00, i - relativeReadIndex3, j, z);
                    if (offset == -1) {
                        return -1;
                    }
                    int relativeReadIndex4 = this.A03;
                    this.A03 = relativeReadIndex4 + offset;
                    return offset;
                }
            }
        }
        return -1;
    }

    public final synchronized long A0A() {
        if (this.A02 == 0) {
            return -1L;
        }
        return A02(this.A02);
    }

    public final synchronized long A0B() {
        return this.A07;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x002f  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x002a A[RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final long A0C(int r6) {
        /*
            r5 = this;
            int r2 = r5.A06()
            int r2 = r2 - r6
            r4 = 1
            if (r2 < 0) goto L2d
            int r1 = r5.A02
            int r0 = r5.A03
            int r1 = r1 - r0
            if (r2 > r1) goto L2d
            r0 = 1
        L10:
            com.facebook.ads.redexgen.X.H6.A03(r0)
            int r0 = r5.A02
            int r0 = r0 - r2
            r5.A02 = r0
            long r2 = r5.A06
            int r0 = r5.A02
            long r0 = r5.A03(r0)
            long r0 = java.lang.Math.max(r2, r0)
            r5.A07 = r0
            int r0 = r5.A02
            if (r0 != 0) goto L2f
            r0 = 0
            return r0
        L2d:
            r0 = 0
            goto L10
        L2f:
            int r0 = r0 - r4
            int r1 = r5.A00(r0)
            long[] r0 = r5.A0E
            r2 = r0[r1]
            int[] r0 = r5.A0C
            r0 = r0[r1]
            long r0 = (long) r0
            long r2 = r2 + r0
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.ads.redexgen.X.C0347Ee.A0C(int):long");
    }

    public final synchronized long A0D(long j, boolean z, boolean z2) {
        if (this.A02 != 0 && j >= this.A0F[this.A04]) {
            int A01 = A01(this.A04, (!z2 || this.A03 == this.A02) ? this.A02 : this.A03 + 1, j, z);
            if (A01 == -1) {
                return -1L;
            }
            return A02(A01);
        }
        return -1L;
    }

    public final synchronized Format A0E() {
        return this.A09 ? null : this.A08;
    }

    public final synchronized void A0F() {
        this.A03 = 0;
    }

    public final void A0H(boolean z) {
        this.A02 = 0;
        this.A00 = 0;
        this.A04 = 0;
        this.A03 = 0;
        this.A0A = true;
        this.A06 = Long.MIN_VALUE;
        this.A07 = Long.MIN_VALUE;
        if (z) {
            this.A08 = null;
            this.A09 = true;
        }
    }

    public final synchronized boolean A0I() {
        return this.A03 != this.A02;
    }

    public final synchronized boolean A0K(Format format) {
        if (format == null) {
            this.A09 = true;
            return false;
        }
        this.A09 = false;
        if (C0430Hl.A0g(format, this.A08)) {
            return false;
        }
        this.A08 = format;
        return true;
    }
}
