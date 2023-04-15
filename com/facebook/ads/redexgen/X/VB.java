package com.facebook.ads.redexgen.X;

import a.a.j;
import java.io.EOFException;
import java.io.IOException;
import java.util.Arrays;
/* loaded from: assets/audience_network.dex */
public final class VB implements CH {
    public static byte[] A0C;
    public static String[] A0D = {"IwWJ1rAHfmexjsebXRXcDPjaU73iSJJD", "Pfa9O7smeRLr", "YVPVKTJSUnoy1mID8h1JiHhyOv", "4YIcZCc9D0v6GYbVW55qq4", "MQGq3Ss0TGTuZcZl9hZWKHAs", "ClxO0wOPMkXGPeTsbkyLqOefUDvePx9Y", "eY8aqVMBTreysgzhCT0m33TuEQRECFok", "4vNP3Dy1WFFR"};
    public int A00;
    public long A01;
    public long A02;
    public long A03;
    public long A04;
    public long A05;
    public long A06;
    public long A07;
    public final long A08;
    public final long A09;
    public final CG A0A = new CG();
    public final CK A0B;

    public static String A09(int i, int i2, int i3) {
        byte[] copyOfRange = Arrays.copyOfRange(A0C, i, i + i2);
        for (int i4 = 0; i4 < copyOfRange.length; i4++) {
            copyOfRange[i4] = (byte) ((copyOfRange[i4] ^ i3) ^ j.AppCompatTheme_viewInflaterClass);
        }
        return new String(copyOfRange);
    }

    public static void A0A() {
        A0C = new byte[]{38, 7, 72, 7, 15, 15, 72, 24, 9, 15, 13, 72, 11, 9, 6, 72, 10, 13, 72, 14, 7, 29, 6, 12, 70};
    }

    static {
        A0A();
    }

    public VB(long j, long j2, CK ck, int i, long j3) {
        H6.A03(j >= 0 && j2 > j);
        this.A0B = ck;
        this.A09 = j;
        this.A08 = j2;
        if (i == j2 - j) {
            this.A07 = j3;
            this.A00 = 3;
            return;
        }
        this.A00 = 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public long A00(long j, long j2, long j3) {
        long j4 = this.A08;
        long j5 = this.A09;
        long j6 = j + ((((j4 - j5) * j2) / this.A07) - j3);
        if (j6 < j5) {
            j6 = this.A09;
        }
        long j7 = this.A08;
        if (j6 >= j7) {
            return j7 - 1;
        }
        return j6;
    }

    private final long A01(long j, BP bp) throws IOException, InterruptedException {
        if (this.A04 == this.A01) {
            return -(this.A05 + 2);
        }
        long A7D = bp.A7D();
        if (A0D(bp, this.A01)) {
            this.A0A.A03(bp, false);
            bp.AE3();
            long j2 = j - this.A0A.A05;
            int i = this.A0A.A01 + this.A0A.A00;
            if (j2 >= 0) {
                String[] strArr = A0D;
                if (strArr[5].charAt(24) != strArr[0].charAt(24)) {
                    throw new RuntimeException();
                }
                String[] strArr2 = A0D;
                strArr2[2] = "1HFKFqyQYawdfec4zhOWKwAEhw";
                strArr2[3] = "atngC4wrhlAL4xDnem6FNv";
                if (j2 <= 72000) {
                    bp.AEk(i);
                    return -(this.A0A.A05 + 2);
                }
            }
            if (j2 < 0) {
                this.A01 = A7D;
                this.A02 = this.A0A.A05;
            } else {
                long initialPosition = bp.A7D();
                this.A04 = initialPosition + i;
                this.A05 = this.A0A.A05;
                long initialPosition2 = this.A01;
                if ((initialPosition2 - this.A04) + i < 100000) {
                    bp.AEk(i);
                    long initialPosition3 = this.A05;
                    return -(initialPosition3 + 2);
                }
            }
            long initialPosition4 = this.A01;
            long j3 = this.A04;
            if (initialPosition4 - j3 < 100000) {
                this.A01 = j3;
                return j3;
            }
            long A7D2 = bp.A7D() - (i * (j2 > 0 ? 1L : 2L));
            long j4 = this.A01;
            long granuleDistance = this.A04;
            long j5 = (j4 - granuleDistance) * j2;
            String[] strArr3 = A0D;
            if (strArr3[5].charAt(24) != strArr3[0].charAt(24)) {
                long initialPosition5 = this.A02;
                long nextPosition = A7D2 + (j5 / (initialPosition5 - this.A05));
                return Math.min(Math.max(nextPosition, granuleDistance), this.A01 - 1);
            }
            String[] strArr4 = A0D;
            strArr4[1] = "HnyCEdH4by64";
            strArr4[7] = "f67XG71IQfud";
            long nextPosition2 = A7D2 + (j5 / (this.A02 - this.A05));
            return Math.min(Math.max(nextPosition2, granuleDistance), this.A01 - 1);
        }
        long j6 = this.A04;
        if (j6 != A7D) {
            return j6;
        }
        throw new IOException(A09(0, 25, 6));
    }

    private final long A02(BP bp) throws IOException, InterruptedException {
        A0C(bp);
        this.A0A.A02();
        while ((this.A0A.A04 & 4) != 4 && bp.A7D() < this.A08) {
            this.A0A.A03(bp, false);
            bp.AEk(this.A0A.A01 + this.A0A.A00);
        }
        return this.A0A.A05;
    }

    private final long A03(BP bp, long j, long j2) throws IOException, InterruptedException {
        this.A0A.A03(bp, false);
        while (this.A0A.A05 < j) {
            bp.AEk(this.A0A.A01 + this.A0A.A00);
            j2 = this.A0A.A05;
            this.A0A.A03(bp, false);
        }
        bp.AE3();
        return j2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Override // com.facebook.ads.redexgen.X.CH
    /* renamed from: A07 */
    public final VC A4S() {
        if (this.A07 != 0) {
            return new VC(this);
        }
        return null;
    }

    private final void A0B() {
        this.A04 = this.A09;
        this.A01 = this.A08;
        this.A05 = 0L;
        this.A02 = this.A07;
    }

    private final void A0C(BP bp) throws IOException, InterruptedException {
        if (A0D(bp, this.A08)) {
            return;
        }
        throw new EOFException();
    }

    private final boolean A0D(BP bp, long j) throws IOException, InterruptedException {
        long min = Math.min(3 + j, this.A08);
        byte[] bArr = new byte[2048];
        int i = bArr.length;
        while (true) {
            if (bp.A7D() + i > min && (i = (int) (min - bp.A7D())) < 4) {
                return false;
            }
            bp.AD1(bArr, 0, i, false);
            for (int i2 = 0; i2 < i - 3; i2++) {
                int peekLength = bArr[i2];
                if (peekLength == 79 && bArr[i2 + 1] == 103 && bArr[i2 + 2] == 103) {
                    int peekLength2 = bArr[i2 + 3];
                    if (peekLength2 == 83) {
                        bp.AEk(i2);
                        return true;
                    }
                }
            }
            bp.AEk(i - 3);
        }
    }

    @Override // com.facebook.ads.redexgen.X.CH
    public final long ADR(BP bp) throws IOException, InterruptedException {
        long currentGranule;
        int i = this.A00;
        if (i == 0) {
            this.A03 = bp.A7D();
            this.A00 = 1;
            long j = this.A08 - 65307;
            if (j > this.A03) {
                return j;
            }
        } else if (i != 1) {
            if (i != 2) {
                if (i == 3) {
                    return -1L;
                }
                throw new IllegalStateException();
            }
            long currentGranule2 = this.A06;
            if (currentGranule2 == 0) {
                currentGranule = 0;
            } else {
                long position = A01(currentGranule2, bp);
                if (position >= 0) {
                    return position;
                }
                currentGranule = A03(bp, this.A06, -(position + 2));
            }
            this.A00 = 3;
            return -(2 + currentGranule);
        }
        long lastPageSearchPosition = A02(bp);
        this.A07 = lastPageSearchPosition;
        this.A00 = 3;
        return this.A03;
    }

    @Override // com.facebook.ads.redexgen.X.CH
    public final long AEs(long j) {
        int i = this.A00;
        H6.A03(i == 3 || i == 2);
        long j2 = 0;
        if (j != 0) {
            j2 = this.A0B.A04(j);
        }
        this.A06 = j2;
        this.A00 = 2;
        A0B();
        long j3 = this.A06;
        String[] strArr = A0D;
        if (strArr[5].charAt(24) != strArr[0].charAt(24)) {
            throw new RuntimeException();
        }
        A0D[6] = "l4iEtEKEuRK6wb9mepvhy";
        return j3;
    }
}
