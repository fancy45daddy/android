package com.facebook.ads.redexgen.X;

import android.util.Pair;
import com.facebook.ads.internal.exoplayer2.Format;
import java.util.Arrays;
import java.util.Collections;
/* loaded from: assets/audience_network.dex */
public final class VY extends Bc {
    public static byte[] A03;
    public static String[] A04 = {"Es", "iHC9pRtfoWLcycijntiJYXN2", "TuGPNLSlit", "098OJ58R6u", "VNifGSmWt2UpuuC8pFHITdWilQmWPSdD", "nPBEvfeprzzMECJ3xuyevnTK", "FVZwpUplP67oS0xaMKq2ljUJ3jrVNcvU", "q6VKpvb2t6NLzvXLeBGroGgfRiC5SSnv"};
    public static final int[] A05;
    public int A00;
    public boolean A01;
    public boolean A02;

    public static String A00(int i, int i2, int i3) {
        byte[] copyOfRange = Arrays.copyOfRange(A03, i, i + i2);
        for (int i4 = 0; i4 < copyOfRange.length; i4++) {
            copyOfRange[i4] = (byte) ((copyOfRange[i4] ^ i3) ^ 15);
        }
        return new String(copyOfRange);
    }

    public static void A01() {
        A03 = new byte[]{77, 121, 104, 101, 99, 44, 106, 99, 126, 97, 109, 120, 44, 98, 99, 120, 44, Byte.MAX_VALUE, 121, 124, 124, 99, 126, 120, 105, 104, 54, 44, 99, 119, 102, 107, 109, 45, 101, 53, 51, 51, 47, 99, 110, 99, 117, 16, 4, 21, 24, 30, 94, 22, 70, 64, 64, 92, 28, 29, 16, 6, 49, 37, 52, 57, 63, Byte.MAX_VALUE, 61, 32, 100, 49, 125, 60, 49, 36, 61, 38, 50, 35, 46, 40, 104, 42, 55, 34, 32};
    }

    static {
        A01();
        A05 = new int[]{5512, 11025, 22050, 44100};
    }

    public VY(InterfaceC0279Ba interfaceC0279Ba) {
        super(interfaceC0279Ba);
    }

    @Override // com.facebook.ads.redexgen.X.Bc
    public final void A0B(HV hv, long j) throws C9R {
        if (this.A00 == 2) {
            int A042 = hv.A04();
            super.A00.AE8(hv, A042);
            super.A00.AE9(j, 1, A042, 0, null);
            return;
        }
        int A0E = hv.A0E();
        if (A0E == 0) {
            boolean z = this.A01;
            String[] strArr = A04;
            String str = strArr[7];
            String str2 = strArr[6];
            int packetType = str.charAt(9);
            if (packetType != str2.charAt(9)) {
                throw new RuntimeException();
            }
            String[] strArr2 = A04;
            strArr2[2] = "UGwyap6YoK";
            strArr2[3] = "84lnx1SX4s";
            if (!z) {
                byte[] audioSpecificConfig = new byte[hv.A04()];
                hv.A0c(audioSpecificConfig, 0, audioSpecificConfig.length);
                Pair<Integer, Integer> A032 = HA.A03(audioSpecificConfig);
                super.A00.A5T(Format.A07(null, A00(58, 15, 95), null, -1, -1, ((Integer) A032.second).intValue(), ((Integer) A032.first).intValue(), Collections.singletonList(audioSpecificConfig), null, 0, null));
                this.A01 = true;
                return;
            }
        }
        int packetType2 = this.A00;
        if (packetType2 == 10 && A0E != 1) {
            return;
        }
        int A043 = hv.A04();
        super.A00.AE8(hv, A043);
        super.A00.AE9(j, 1, A043, 0, null);
    }

    /* JADX WARN: Code restructure failed: missing block: B:16:0x0073, code lost:
        if (r7 == 8) goto L24;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x00b3, code lost:
        if (r7 == 8) goto L24;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x00b8, code lost:
        if (r7 != 10) goto L20;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x00d9, code lost:
        throw new com.facebook.ads.redexgen.X.VU(A00(0, 28, 3) + r16.A00);
     */
    @Override // com.facebook.ads.redexgen.X.Bc
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean A0C(com.facebook.ads.redexgen.X.HV r17) throws com.facebook.ads.redexgen.X.VU {
        /*
            Method dump skipped, instructions count: 222
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.ads.redexgen.X.VY.A0C(com.facebook.ads.redexgen.X.HV):boolean");
    }
}
