package com.facebook.ads.redexgen.X;

import a.a.j;
import android.net.Uri;
import android.os.Handler;
import androidx.annotation.Nullable;
import com.facebook.ads.internal.exoplayer2.Format;
import com.facebook.ads.internal.exoplayer2.source.TrackGroup;
import com.facebook.ads.internal.exoplayer2.source.TrackGroupArray;
import java.io.IOException;
import java.util.Arrays;
/* loaded from: assets/audience_network.dex */
public final class B6 implements UH, BQ, InterfaceC0395Gc<UL>, InterfaceC0398Gf, InterfaceC0349Eg {
    public static byte[] A0c;
    public static String[] A0d = {"iI0ZOGUFhjVKOFZqbUjTJbzZriBk", "wCM5SpVnQk8vEGvx3xuFkFQnwN8gnHkn", "CC", "sZUrtXRAji2vfBWVwphN9cenOJ8FQWpp", "F506DqgxlNyYyNAR0eHuGAxqIBb0RwxX", "mj8nEZtHpBznvwUNQKJPsV2u1H4", "sYtV3FATfn8NsU7nH3", "hZDPske6mXbyt4vhVom9Ng"};
    public int A00;
    public int A01;
    public int A02;
    public long A04;
    public BX A07;
    @Nullable
    public UI A08;
    public TrackGroupArray A09;
    public boolean A0A;
    public boolean A0B;
    public boolean A0C;
    public boolean A0D;
    public boolean A0E;
    public boolean A0F;
    public boolean A0G;
    public boolean A0H;
    public boolean A0I;
    public boolean[] A0L;
    public boolean[] A0M;
    public boolean[] A0N;
    public final int A0O;
    public final long A0P;
    public final Uri A0Q;
    public final EG A0S;
    public final EH A0T;
    public final EX A0U;
    public final GI A0V;
    public final GQ A0W;
    @Nullable
    public final String A0b;
    public final C0729Th A0X = new C0729Th(A07(0, 27, 82));
    public final HC A0Y = new HC();
    public final Runnable A0Z = new EE(this);
    public final Runnable A0a = new EF(this);
    public final Handler A0R = new Handler();
    public int[] A0J = new int[0];
    public UG[] A0K = new UG[0];
    public long A06 = -9223372036854775807L;
    public long A05 = -1;
    public long A03 = -9223372036854775807L;

    public static String A07(int i, int i2, int i3) {
        byte[] copyOfRange = Arrays.copyOfRange(A0c, i, i + i2);
        int i4 = 0;
        while (true) {
            int length = copyOfRange.length;
            if (A0d[7].length() != 22) {
                throw new RuntimeException();
            }
            A0d[2] = "Up";
            if (i4 >= length) {
                return new String(copyOfRange);
            }
            copyOfRange[i4] = (byte) ((copyOfRange[i4] ^ i3) ^ j.AppCompatTheme_windowNoTitle);
            i4++;
        }
    }

    public static void A0B() {
        A0c = new byte[]{102, 69, 75, 78, 79, 88, 16, 111, 82, 94, 88, 75, 73, 94, 69, 88, 103, 79, 78, 67, 75, 122, 79, 88, 67, 69, 78};
    }

    /* JADX WARN: Code restructure failed: missing block: B:157:0x0108, code lost:
        if (r8.A08() != false) goto L64;
     */
    /* JADX WARN: Code restructure failed: missing block: B:158:0x010a, code lost:
        r4 = r12.A0K;
        r3 = r4.length;
     */
    /* JADX WARN: Code restructure failed: missing block: B:159:0x010d, code lost:
        if (r7 >= r3) goto L67;
     */
    /* JADX WARN: Code restructure failed: missing block: B:160:0x010f, code lost:
        r4[r7].A0H();
        r7 = r7 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:162:0x0122, code lost:
        if (r8.A08() != false) goto L64;
     */
    /* JADX WARN: Code restructure failed: missing block: B:164:0x0125, code lost:
        r4 = r12.A0K;
        r3 = r4.length;
     */
    /* JADX WARN: Code restructure failed: missing block: B:165:0x0128, code lost:
        if (r7 >= r3) goto L74;
     */
    /* JADX WARN: Code restructure failed: missing block: B:166:0x012a, code lost:
        r4[r7].A0I();
        r7 = r7 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:179:0x015e, code lost:
        r12.A0X.A05();
     */
    /* JADX WARN: Failed to parse debug info
    java.lang.ArrayIndexOutOfBoundsException: Index 20 out of bounds for length 19
    	at jadx.plugins.input.dex.sections.debuginfo.DebugInfoParser.process(DebugInfoParser.java:147)
    	at jadx.plugins.input.dex.sections.DexCodeReader.getDebugInfo(DexCodeReader.java:118)
    	at jadx.core.dex.nodes.MethodNode.getDebugInfo(MethodNode.java:567)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.visit(DebugInfoAttachVisitor.java:39)
     */
    @Override // com.facebook.ads.redexgen.X.UH
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final long AEI(com.facebook.ads.redexgen.X.GC[] r13, boolean[] r14, com.facebook.ads.redexgen.X.InterfaceC0350Eh[] r15, boolean[] r16, long r17) {
        /*
            Method dump skipped, instructions count: 364
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.ads.redexgen.X.B6.AEI(com.facebook.ads.redexgen.X.GC[], boolean[], com.facebook.ads.redexgen.X.Eh[], boolean[], long):long");
    }

    static {
        A0B();
    }

    public B6(Uri uri, GQ gq, BO[] boArr, int i, EX ex, EH eh, GI gi, @Nullable String str, int i2) {
        this.A0Q = uri;
        this.A0W = gq;
        this.A0O = i;
        this.A0U = ex;
        this.A0T = eh;
        this.A0V = gi;
        this.A0b = str;
        this.A0P = i2;
        this.A0S = new EG(boArr, this);
        this.A00 = i == -1 ? 3 : i;
        ex.A03();
    }

    private int A00() {
        UG[] ugArr;
        int i = 0;
        for (UG ug : this.A0K) {
            String[] strArr = A0d;
            String str = strArr[5];
            String str2 = strArr[0];
            int length = str.length();
            int extractedSamplesCount = str2.length();
            if (length == extractedSamplesCount) {
                throw new RuntimeException();
            }
            String[] strArr2 = A0d;
            strArr2[3] = "qSOUgbz3JlJaX9UdXA1gn9agrJ83m9Y6";
            strArr2[1] = "wkCF1xtIBevCyUX610AjJpYT598Om9ct";
            int extractedSamplesCount2 = ug.A0C();
            i += extractedSamplesCount2;
        }
        return i;
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC0395Gc
    /* renamed from: A01 */
    public final int ABC(UL ul, long j, long j2, IOException iOException) {
        GU gu;
        long j3;
        long j4;
        boolean isErrorFatal = A0N(iOException);
        EX ex = this.A0U;
        gu = ul.A03;
        j3 = ul.A02;
        long j5 = this.A03;
        j4 = ul.A00;
        ex.A0H(gu, 1, -1, null, 0, null, j3, j5, j, j2, j4, iOException, isErrorFatal);
        A0E(ul);
        if (isErrorFatal) {
            return 3;
        }
        int A00 = A00();
        boolean madeProgress = A00 > this.A02;
        if (A0L(ul, A00)) {
            return madeProgress ? 1 : 0;
        }
        return 2;
    }

    private long A02() {
        UG[] ugArr;
        long j = Long.MIN_VALUE;
        for (UG ug : this.A0K) {
            if (A0d[6].length() != 18) {
                throw new RuntimeException();
            }
            A0d[6] = "ZyGj31aUIwj7oXhThZ";
            long largestQueuedTimestampUs = ug.A0F();
            j = Math.max(j, largestQueuedTimestampUs);
        }
        return j;
    }

    public void A09() {
        if (this.A0G || this.A0F || this.A07 == null || !this.A0H) {
            return;
        }
        for (UG ug : this.A0K) {
            if (ug.A0G() == null) {
                return;
            }
        }
        this.A0Y.A01();
        int length = this.A0K.length;
        TrackGroup[] trackGroupArr = new TrackGroup[length];
        this.A0N = new boolean[length];
        this.A0L = new boolean[length];
        this.A0M = new boolean[length];
        this.A03 = this.A07.A6Q();
        int i = 0;
        while (true) {
            boolean z = true;
            if (i < length) {
                Format A0G = this.A0K[i].A0G();
                trackGroupArr[i] = new TrackGroup(A0G);
                String str = A0G.A0O;
                if (!HO.A0B(str)) {
                    boolean A09 = HO.A09(str);
                    if (A0d[7].length() != 22) {
                        throw new RuntimeException();
                    }
                    A0d[4] = "sORkCePcQUNrHwPTmIu9z8sBJIN6eDJt";
                    if (!A09) {
                        z = false;
                    }
                }
                this.A0N[i] = z;
                this.A0A |= z;
                i++;
            } else {
                this.A09 = new TrackGroupArray(trackGroupArr);
                if (this.A0O == -1) {
                    int trackCount = (this.A05 > (-1L) ? 1 : (this.A05 == (-1L) ? 0 : -1));
                    if (trackCount == 0) {
                        int trackCount2 = (this.A07.A6Q() > (-9223372036854775807L) ? 1 : (this.A07.A6Q() == (-9223372036854775807L) ? 0 : -1));
                        if (trackCount2 == 0) {
                            this.A00 = 6;
                        }
                    }
                }
                this.A0F = true;
                this.A0T.ACF(this.A03, this.A07.A8d());
                this.A08.ABq(this);
                return;
            }
        }
    }

    private void A0A() {
        GU gu;
        long j;
        UL ul = new UL(this, this.A0Q, this.A0W, this.A0S, this.A0Y);
        if (this.A0F) {
            H6.A04(A0I());
            long j2 = this.A03;
            if (j2 != -9223372036854775807L && this.A06 >= j2) {
                this.A0B = true;
                this.A06 = -9223372036854775807L;
                return;
            }
            ul.A04(this.A07.A7M(this.A06).A00.A00, this.A06);
            this.A06 = -9223372036854775807L;
        }
        this.A02 = A00();
        long A04 = this.A0X.A04(ul, this, this.A00);
        EX ex = this.A0U;
        gu = ul.A03;
        j = ul.A02;
        ex.A0E(gu, 1, -1, null, 0, null, j, this.A03, A04);
    }

    private void A0C(int i) {
        if (!this.A0M[i]) {
            Format A01 = this.A09.A01(i).A01(0);
            this.A0U.A06(HO.A01(A01.A0O), A01, 0, null, this.A04);
            this.A0M[i] = true;
        }
    }

    private void A0D(int i) {
        if (!this.A0E || !this.A0N[i] || this.A0K[i].A0M()) {
            return;
        }
        this.A06 = 0L;
        this.A0E = false;
        this.A0D = true;
        this.A04 = 0L;
        this.A02 = 0;
        for (UG ug : this.A0K) {
            ug.A0I();
        }
        this.A08.AAJ(this);
    }

    private void A0E(UL ul) {
        long j;
        if (this.A05 != -1) {
            return;
        }
        j = ul.A01;
        this.A05 = j;
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC0395Gc
    /* renamed from: A0F */
    public final void ABB(UL ul, long j, long j2) {
        GU gu;
        long j3;
        long j4;
        long j5;
        if (this.A03 == -9223372036854775807L) {
            long A02 = A02();
            if (A02 == Long.MIN_VALUE) {
                j5 = 0;
            } else {
                j5 = 10000 + A02;
            }
            this.A03 = j5;
            this.A0T.ACF(this.A03, this.A07.A8d());
        }
        EX ex = this.A0U;
        gu = ul.A03;
        j3 = ul.A02;
        long j6 = this.A03;
        j4 = ul.A00;
        ex.A0G(gu, 1, -1, null, 0, null, j3, j6, j, j2, j4);
        A0E(ul);
        this.A0B = true;
        this.A08.AAJ(this);
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC0395Gc
    /* renamed from: A0G */
    public final void AB9(UL ul, long j, long j2, boolean z) {
        GU gu;
        long j3;
        long j4;
        EX ex = this.A0U;
        gu = ul.A03;
        j3 = ul.A02;
        long j5 = this.A03;
        j4 = ul.A00;
        ex.A0F(gu, 1, -1, null, 0, null, j3, j5, j, j2, j4);
        if (!z) {
            A0E(ul);
            for (UG ug : this.A0K) {
                ug.A0I();
            }
            if (this.A01 > 0) {
                this.A08.AAJ(this);
            }
        }
    }

    private boolean A0I() {
        return this.A06 != -9223372036854775807L;
    }

    private boolean A0J() {
        if (!this.A0D) {
            boolean A0I = A0I();
            if (A0d[4].charAt(6) == 'Y') {
                throw new RuntimeException();
            }
            A0d[7] = "wEe5Kid34hKwvsAXbAWEFW";
            if (!A0I) {
                return false;
            }
        }
        return true;
    }

    private boolean A0K(long j) {
        int length = this.A0K.length;
        int i = 0;
        while (true) {
            if (i >= length) {
                return true;
            }
            UG ug = this.A0K[i];
            ug.A0J();
            int i2 = ug.A0D(j, true, false);
            if ((i2 != -1) || (!this.A0N[i] && this.A0A)) {
                i++;
            }
        }
        return false;
    }

    /* JADX WARN: Code restructure failed: missing block: B:39:0x0031, code lost:
        if (r7 != (-9223372036854775807L)) goto L28;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private boolean A0L(com.facebook.ads.redexgen.X.UL r10, int r11) {
        /*
            r9 = this;
            long r1 = r9.A05
            r6 = 1
            r3 = -1
            int r0 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r0 != 0) goto L33
            com.facebook.ads.redexgen.X.BX r0 = r9.A07
            if (r0 == 0) goto L3c
            long r7 = r0.A6Q()
            r3 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            java.lang.String[] r2 = com.facebook.ads.redexgen.X.B6.A0d
            r0 = 5
            r1 = r2[r0]
            r0 = 0
            r0 = r2[r0]
            int r1 = r1.length()
            int r0 = r0.length()
            if (r1 == r0) goto L36
            java.lang.String[] r2 = com.facebook.ads.redexgen.X.B6.A0d
            java.lang.String r1 = "Q0rpoNhjqPePbxzXOOIqRvZr1JNrttpQ"
            r0 = 4
            r2[r0] = r1
            int r0 = (r7 > r3 ? 1 : (r7 == r3 ? 0 : -1))
            if (r0 == 0) goto L3c
        L33:
            r9.A02 = r11
            return r6
        L36:
            java.lang.RuntimeException r0 = new java.lang.RuntimeException
            r0.<init>()
            throw r0
        L3c:
            boolean r0 = r9.A0F
            r5 = 0
            if (r0 == 0) goto L65
            boolean r0 = r9.A0J()
            if (r0 != 0) goto L65
            r9.A0E = r6
            java.lang.String[] r1 = com.facebook.ads.redexgen.X.B6.A0d
            r0 = 4
            r1 = r1[r0]
            r0 = 6
            char r1 = r1.charAt(r0)
            r0 = 89
            if (r1 == r0) goto L5f
            java.lang.String[] r2 = com.facebook.ads.redexgen.X.B6.A0d
            java.lang.String r1 = "yM"
            r0 = 2
            r2[r0] = r1
            return r5
        L5f:
            java.lang.RuntimeException r0 = new java.lang.RuntimeException
            r0.<init>()
            throw r0
        L65:
            boolean r0 = r9.A0F
            r9.A0D = r0
            r2 = 0
            r9.A04 = r2
            r9.A02 = r5
            com.facebook.ads.redexgen.X.UG[] r4 = r9.A0K
            int r1 = r4.length
        L72:
            if (r5 >= r1) goto L7c
            r0 = r4[r5]
            r0.A0I()
            int r5 = r5 + 1
            goto L72
        L7c:
            r10.A04(r2, r2)
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.ads.redexgen.X.B6.A0L(com.facebook.ads.redexgen.X.UL, int):boolean");
    }

    public static boolean A0N(IOException iOException) {
        return iOException instanceof UE;
    }

    public final int A0O(int i, long j) {
        int skipCount;
        if (A0J()) {
            return 0;
        }
        UG ug = this.A0K[i];
        if (this.A0B && j > ug.A0F()) {
            skipCount = ug.A0A();
        } else {
            skipCount = ug.A0D(j, true, true);
            if (skipCount == -1) {
                skipCount = 0;
            }
        }
        if (skipCount > 0) {
            A0C(i);
        } else {
            A0D(i);
        }
        return skipCount;
    }

    public final int A0P(int i, C9L c9l, C0784Vn c0784Vn, boolean z) {
        if (A0J()) {
            return -3;
        }
        UG ug = this.A0K[i];
        boolean z2 = this.A0B;
        long j = this.A04;
        if (A0d[6].length() != 18) {
            throw new RuntimeException();
        }
        A0d[4] = "BZZhA5HnQ267vlJC28K7sY9wv6QGzHwf";
        int A0E = ug.A0E(c9l, c0784Vn, z, z2, j);
        if (A0E == -4) {
            A0C(i);
        } else if (A0E == -3) {
            A0D(i);
        }
        return A0E;
    }

    public final void A0Q() throws IOException {
        this.A0X.A06(this.A00);
    }

    public final void A0R() {
        if (this.A0F) {
            for (UG ug : this.A0K) {
                ug.A0H();
            }
        }
        this.A0X.A07(this);
        this.A0R.removeCallbacksAndMessages(null);
        this.A08 = null;
        this.A0G = true;
        this.A0U.A04();
    }

    public final boolean A0S(int i) {
        return !A0J() && (this.A0B || this.A0K[i].A0M());
    }

    @Override // com.facebook.ads.redexgen.X.UH
    public final boolean A4A(long j) {
        if (this.A0B || this.A0E) {
            return false;
        }
        if (this.A0F) {
            int i = this.A01;
            if (A0d[4].charAt(6) == 'Y') {
                throw new RuntimeException();
            }
            A0d[4] = "7rVHsGRdVZCry1KpVG9eopTEFKGRMHdR";
            if (i == 0) {
                return false;
            }
        }
        boolean A02 = this.A0Y.A02();
        boolean continuedLoading = this.A0X.A08();
        if (!continuedLoading) {
            A0A();
            String[] strArr = A0d;
            if (strArr[5].length() != strArr[0].length()) {
                A0d[4] = "GZZ8Yg3MT0LKLUTCQO9quz1OXrB3914Q";
                return true;
            }
            A0d[4] = "KAHjzw5ailzTQNPlHwAo2zZrrjfyTj4F";
            return false;
        }
        return A02;
    }

    @Override // com.facebook.ads.redexgen.X.UH
    public final void A4p(long j, boolean z) {
        int length = this.A0K.length;
        for (int i = 0; i < length; i++) {
            this.A0K[i].A0K(j, z, this.A0L[i]);
        }
    }

    @Override // com.facebook.ads.redexgen.X.BQ
    public final void A5C() {
        this.A0H = true;
        this.A0R.post(this.A0Z);
    }

    @Override // com.facebook.ads.redexgen.X.UH
    public final long A5c(long j, C02379j c02379j) {
        if (!this.A07.A8d()) {
            return 0L;
        }
        BW A7M = this.A07.A7M(j);
        return C0430Hl.A0I(j, c02379j, A7M.A00.A01, A7M.A01.A01);
    }

    @Override // com.facebook.ads.redexgen.X.UH
    public final long A5r() {
        long A02;
        if (this.A0B) {
            return Long.MIN_VALUE;
        }
        if (A0I()) {
            long j = this.A06;
            if (A0d[6].length() == 18) {
                A0d[4] = "v1DtQTmxA3FTsqocwnKPSJWZapJDPMlv";
                return j;
            }
        } else {
            if (this.A0A) {
                A02 = Long.MAX_VALUE;
                if (A0d[6].length() == 18) {
                    A0d[7] = "vaKypmx8P8ApWe5d9yUSyn";
                    int length = this.A0K.length;
                    for (int i = 0; i < length; i++) {
                        if (this.A0N[i]) {
                            UG ug = this.A0K[i];
                            String[] strArr = A0d;
                            String str = strArr[5];
                            String str2 = strArr[0];
                            int length2 = str.length();
                            int trackCount = str2.length();
                            if (length2 == trackCount) {
                                throw new RuntimeException();
                            }
                            A0d[7] = "ClOx81htkGLxdwhy5PY2qE";
                            A02 = Math.min(A02, ug.A0F());
                        }
                    }
                }
            } else {
                A02 = A02();
            }
            int trackCount2 = (A02 > Long.MIN_VALUE ? 1 : (A02 == Long.MIN_VALUE ? 0 : -1));
            if (trackCount2 == 0) {
                return this.A04;
            }
            return A02;
        }
        throw new RuntimeException();
    }

    @Override // com.facebook.ads.redexgen.X.UH
    public final long A6z() {
        if (this.A01 == 0) {
            return Long.MIN_VALUE;
        }
        return A5r();
    }

    @Override // com.facebook.ads.redexgen.X.UH
    public final TrackGroupArray A7f() {
        return this.A09;
    }

    @Override // com.facebook.ads.redexgen.X.UH
    public final void A9S() throws IOException {
        A0Q();
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC0398Gf
    public final void ABG() {
        for (UG ug : this.A0K) {
            ug.A0I();
        }
        this.A0S.A03();
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC0349Eg
    public final void ACY(Format format) {
        this.A0R.post(this.A0Z);
    }

    @Override // com.facebook.ads.redexgen.X.UH
    public final void AD9(UI ui, long j) {
        this.A08 = ui;
        this.A0Y.A02();
        A0A();
    }

    @Override // com.facebook.ads.redexgen.X.UH
    public final long ADU() {
        if (!this.A0C) {
            this.A0U.A05();
            this.A0C = true;
        }
        if (this.A0D) {
            if (this.A0B || A00() > this.A02) {
                this.A0D = false;
                return this.A04;
            }
            return -9223372036854775807L;
        }
        return -9223372036854775807L;
    }

    @Override // com.facebook.ads.redexgen.X.UH
    public final void ADb(long j) {
    }

    @Override // com.facebook.ads.redexgen.X.BQ
    public final void AEE(BX bx) {
        this.A07 = bx;
        this.A0R.post(this.A0Z);
    }

    @Override // com.facebook.ads.redexgen.X.UH
    public final long AEH(long j) {
        if (!this.A07.A8d()) {
            j = 0;
        }
        this.A04 = j;
        this.A0D = false;
        if (!A0I() && A0K(j)) {
            return j;
        }
        this.A0E = false;
        this.A06 = j;
        this.A0B = false;
        if (this.A0X.A08()) {
            this.A0X.A05();
        } else {
            for (UG ug : this.A0K) {
                ug.A0I();
            }
        }
        return j;
    }

    @Override // com.facebook.ads.redexgen.X.BQ
    public final InterfaceC0279Ba AF2(int i, int i2) {
        int length = this.A0K.length;
        for (int i3 = 0; i3 < length; i3++) {
            int trackCount = this.A0J[i3];
            if (trackCount == i) {
                return this.A0K[i3];
            }
        }
        UG ug = new UG(this.A0V);
        ug.A0L(this);
        int trackCount2 = length + 1;
        this.A0J = Arrays.copyOf(this.A0J, trackCount2);
        this.A0J[length] = i;
        int trackCount3 = length + 1;
        this.A0K = (UG[]) Arrays.copyOf(this.A0K, trackCount3);
        this.A0K[length] = ug;
        return ug;
    }
}
