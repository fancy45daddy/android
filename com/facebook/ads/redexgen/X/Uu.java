package com.facebook.ads.redexgen.X;

import android.util.Pair;
import com.facebook.ads.internal.exoplayer2.Format;
import java.util.Arrays;
import java.util.Collections;
/* loaded from: assets/audience_network.dex */
public final class Uu implements CU {
    public static byte[] A0D;
    public static String[] A0E = {"YsqY7Lk0NG7yMwVwuR3aCKQ1vCFnnoD7", "imTBT5eeu9SEESxnKVa9Th5", "O0aT", "zBRiiCG0AgE79WafkQACjpG1QDeKkcp1", "wwjqIDfPN4cSDtn9coCmQZMwbPpUFodD", "uPTa", "JD3sFkMXr2jLKKNxvTNpqQokakbynhd6", "fAZgloKcDeiXibtKpEsUxRbbQwdcutNH"};
    public static final double[] A0F;
    public long A00;
    public long A01;
    public long A02;
    public long A03;
    public long A04;
    public InterfaceC0279Ba A05;
    public String A06;
    public boolean A07;
    public boolean A08;
    public boolean A09;
    public boolean A0A;
    public final boolean[] A0C = new boolean[4];
    public final CV A0B = new CV(128);

    public static String A01(int i, int i2, int i3) {
        byte[] copyOfRange = Arrays.copyOfRange(A0D, i, i + i2);
        int i4 = 0;
        while (true) {
            int length = copyOfRange.length;
            if (A0E[1].length() != 23) {
                throw new RuntimeException();
            }
            A0E[4] = "Ri5OGo1CF8gLgqNPBzhcn52enWrdUOS9";
            if (i4 >= length) {
                return new String(copyOfRange);
            }
            copyOfRange[i4] = (byte) ((copyOfRange[i4] - i3) - 59);
            i4++;
        }
    }

    public static void A02() {
        A0D = new byte[]{-2, -15, -20, -19, -9, -73, -11, -8, -19, -17, -70};
    }

    static {
        A02();
        A0F = new double[]{23.976023976023978d, 24.0d, 25.0d, 29.97002997002997d, 30.0d, 50.0d, 59.94005994005994d, 60.0d};
    }

    public static Pair<Format, Long> A00(CV cv, String str) {
        byte[] copyOf = Arrays.copyOf(cv.A02, cv.A00);
        int i = copyOf[4] & 255;
        int firstByte = copyOf[5] & 255;
        int aspectRatioCode = (i << 4) | (firstByte >> 4);
        int i2 = ((firstByte & 15) << 8) | (copyOf[6] & 255);
        float f = 1.0f;
        int thirdByte = (copyOf[7] & 240) >> 4;
        if (thirdByte != 2) {
            String[] strArr = A0E;
            if (strArr[2].length() == strArr[5].length()) {
                String[] strArr2 = A0E;
                strArr2[3] = "HgbrGKSiwbnHfsjka25a0ZgViwBErbAQ";
                strArr2[6] = "kgfZHtVXJwuxNbqkZAemlWCJOmm9Ylqd";
                if (thirdByte != 3) {
                    if (thirdByte == 4) {
                        f = (i2 * 121) / (aspectRatioCode * 100);
                    }
                } else {
                    f = (i2 * 16) / (aspectRatioCode * 9);
                }
            }
            throw new RuntimeException();
        }
        f = (i2 * 4) / (aspectRatioCode * 3);
        Format A03 = Format.A03(str, A01(0, 11, 77), null, -1, -1, aspectRatioCode, i2, -1.0f, Collections.singletonList(copyOf), -1, f, null);
        long j = 0;
        int thirdByte2 = (copyOf[7] & 15) - 1;
        if (thirdByte2 >= 0) {
            double[] dArr = A0F;
            if (thirdByte2 < dArr.length) {
                double d = dArr[thirdByte2];
                int i3 = cv.A01;
                int thirdByte3 = (copyOf[i3 + 9] & 96) >> 5;
                int firstByte2 = i3 + 9;
                if (A0E[1].length() == 23) {
                    A0E[1] = "JkGh2MRG0HwgK9dbH7jOqv6";
                    int frameRateExtensionN = copyOf[firstByte2] & 31;
                    if (thirdByte3 != frameRateExtensionN) {
                        int frameRateExtensionD = frameRateExtensionN + 1;
                        d *= (thirdByte3 + 1.0d) / frameRateExtensionD;
                    }
                    j = (long) (1000000.0d / d);
                }
                throw new RuntimeException();
            }
        }
        return Pair.create(A03, Long.valueOf(j));
    }

    /* JADX WARN: Code restructure failed: missing block: B:33:0x00d2, code lost:
        if (r3 != false) goto L40;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x00d6, code lost:
        if (r21.A07 == false) goto L45;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x00d8, code lost:
        r5 = r21.A09;
        r14 = r21.A05;
        r15 = r21.A03;
        r5 = r5 ? 1 : 0;
        r14.AE9(r15, r5, ((int) (r21.A04 - r21.A02)) - r4, r4, null);
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x0122, code lost:
        if (r2 != (-9223372036854775807L)) goto L57;
     */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x0124, code lost:
        r21.A03 = r2;
        r21.A09 = false;
        r21.A01 = r4;
        r21.A0A = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:51:0x0140, code lost:
        if (r2 != (-9223372036854775807L)) goto L57;
     */
    /* JADX WARN: Code restructure failed: missing block: B:54:0x0145, code lost:
        if (r21.A0A == false) goto L61;
     */
    /* JADX WARN: Code restructure failed: missing block: B:55:0x0147, code lost:
        r2 = r21.A03 + r21.A00;
     */
    /* JADX WARN: Code restructure failed: missing block: B:56:0x014d, code lost:
        r2 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:58:0x0157, code lost:
        if (r3 != false) goto L40;
     */
    @Override // com.facebook.ads.redexgen.X.CU
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void A48(com.facebook.ads.redexgen.X.HV r22) {
        /*
            Method dump skipped, instructions count: 360
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.ads.redexgen.X.Uu.A48(com.facebook.ads.redexgen.X.HV):void");
    }

    @Override // com.facebook.ads.redexgen.X.CU
    public final void A4V(BQ bq, C0301Ci c0301Ci) {
        c0301Ci.A05();
        this.A06 = c0301Ci.A04();
        this.A05 = bq.AF2(c0301Ci.A03(), 2);
    }

    @Override // com.facebook.ads.redexgen.X.CU
    public final void ACx() {
    }

    @Override // com.facebook.ads.redexgen.X.CU
    public final void ACy(long j, boolean z) {
        this.A01 = j;
    }

    @Override // com.facebook.ads.redexgen.X.CU
    public final void AEC() {
        HR.A0B(this.A0C);
        this.A0B.A00();
        this.A04 = 0L;
        this.A0A = false;
    }
}
