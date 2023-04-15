package com.facebook.ads.redexgen.X;

import java.io.IOException;
import java.util.Arrays;
/* loaded from: assets/audience_network.dex */
public final class V2 implements BO {
    public static byte[] A04;
    public static String[] A05 = {"P5w0t5YmbfCx1ojda5KKDsEMO6jqUmnr", "UdOatSKcJailVD", "", "xAiF", "epl8GGi5jyNsT2QZHjLNLopZqyhNzplR", "TY8pRi4pa4JcG30Kuv61m", "fOMFGQDuqjq2usuY2YJ2oGF", "ObZwfJQfEiVxl"};
    public static final BR A06;
    public static final int A07;
    public boolean A00;
    public final long A01;
    public final V1 A02;
    public final HV A03;

    public static String A00(int i, int i2, int i3) {
        byte[] copyOfRange = Arrays.copyOfRange(A04, i, i + i2);
        for (int i4 = 0; i4 < copyOfRange.length; i4++) {
            copyOfRange[i4] = (byte) ((copyOfRange[i4] ^ i3) ^ 57);
        }
        return new String(copyOfRange);
    }

    public static void A01() {
        A04 = new byte[]{15, 2, 117};
    }

    static {
        A01();
        A06 = new V3();
        A07 = C0430Hl.A08(A00(0, 3, 127));
    }

    public V2() {
        this(0L);
    }

    public V2(long j) {
        this.A01 = j;
        this.A02 = new V1();
        this.A03 = new HV(2786);
    }

    @Override // com.facebook.ads.redexgen.X.BO
    public final void A8G(BQ bq) {
        this.A02.A4V(bq, new C0301Ci(0, 1));
        bq.A5C();
        bq.AEE(new C0772Vb(-9223372036854775807L));
    }

    @Override // com.facebook.ads.redexgen.X.BO
    public final int ADQ(BP bp, BV bv) throws IOException, InterruptedException {
        int read = bp.read(this.A03.A00, 0, 2786);
        if (read == -1) {
            return -1;
        }
        this.A03.A0Y(0);
        this.A03.A0X(read);
        if (!this.A00) {
            this.A02.ACy(this.A01, true);
            this.A00 = true;
        }
        this.A02.A48(this.A03);
        return 0;
    }

    @Override // com.facebook.ads.redexgen.X.BO
    public final void AED(long j, long j2) {
        this.A00 = false;
        this.A02.AEC();
    }

    @Override // com.facebook.ads.redexgen.X.BO
    public final boolean AEm(BP bp) throws IOException, InterruptedException {
        HV hv = new HV(10);
        int syncBytes = 0;
        while (true) {
            bp.AD0(hv.A00, 0, 10);
            if (A05[7].length() != 13) {
                throw new RuntimeException();
            }
            A05[5] = "IuOldmz1qGC5b";
            hv.A0Y(0);
            if (hv.A0G() != A07) {
                bp.AE3();
                bp.A3K(syncBytes);
                int validFramesCount = syncBytes;
                int startPosition = 0;
                while (true) {
                    bp.AD0(hv.A00, 0, 5);
                    hv.A0Y(0);
                    int headerPosition = hv.A0I();
                    if (headerPosition != 2935) {
                        startPosition = 0;
                        bp.AE3();
                        validFramesCount++;
                        int headerPosition2 = validFramesCount - syncBytes;
                        if (headerPosition2 >= 8192) {
                            return false;
                        }
                        bp.A3K(validFramesCount);
                    } else {
                        startPosition++;
                        int headerPosition3 = A05[5].length();
                        if (headerPosition3 != 29) {
                            String[] strArr = A05;
                            strArr[3] = "a4rI";
                            strArr[6] = "EnE3h5gngskpWhoTVRGnZEO";
                            if (startPosition >= 4) {
                                return true;
                            }
                        } else if (startPosition >= 4) {
                            return true;
                        }
                        int headerPosition4 = C02499w.A05(hv.A00);
                        if (headerPosition4 == -1) {
                            return false;
                        }
                        bp.A3K(headerPosition4 - 5);
                    }
                }
            } else {
                hv.A0Z(3);
                int A0D = hv.A0D();
                syncBytes += A0D + 10;
                bp.A3K(A0D);
            }
        }
    }
}
