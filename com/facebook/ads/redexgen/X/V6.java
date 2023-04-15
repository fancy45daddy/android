package com.facebook.ads.redexgen.X;

import com.facebook.ads.internal.exoplayer2.Format;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
/* loaded from: assets/audience_network.dex */
public final class V6 extends CK {
    public static byte[] A01;
    public static String[] A02 = {"nsRNjMJCINzttEcy6gRH", "iLBhdjTg3OKb8ywbNnp8pgqKlG", "RImCZo78JGnCd", "MQCM5Bft3v5AKfjxIzCtQe6XKQuHj9cI", "eIxys3n1xHnYXLY6XFR5ULs5u2Lm7Uxd", "C5r06ne3nHFGIipq1ktKTjeYxK5IlnNR", "VUYnCtCcQXjB1sQxVfFNmblLRJpOLxas", "bjyChy1rj1vSDo4qa0ykMaouAr"};
    public static final int A03;
    public static final byte[] A04;
    public boolean A00;

    public static String A01(int i, int i2, int i3) {
        byte[] copyOfRange = Arrays.copyOfRange(A01, i, i + i2);
        for (int i4 = 0; i4 < copyOfRange.length; i4++) {
            copyOfRange[i4] = (byte) ((copyOfRange[i4] - i3) - 7);
        }
        return new String(copyOfRange);
    }

    public static void A02() {
        A01 = new byte[]{119, -104, -99, -101, -59, -39, -56, -51, -45, -109, -45, -44, -39, -41};
    }

    static {
        A02();
        A03 = C0430Hl.A08(A01(0, 4, 33));
        A04 = new byte[]{79, 112, 117, 115, 72, 101, 97, 100};
    }

    private long A00(byte[] bArr) {
        int i;
        int i2;
        int i3 = bArr[0] & 255;
        int i4 = i3 & 3;
        if (i4 == 0) {
            i = 1;
        } else if (i4 != 1 && i4 != 2) {
            int toc = bArr[1];
            i = toc & 63;
        } else {
            i = 2;
        }
        int frames = i3 >> 3;
        int i5 = frames & 3;
        if (frames >= 16) {
            i2 = 2500 << i5;
        } else if (frames >= 12) {
            int toc2 = i5 & 1;
            i2 = 10000 << toc2;
        } else {
            String[] strArr = A02;
            String str = strArr[0];
            String str2 = strArr[2];
            int frames2 = str.length();
            int toc3 = str2.length();
            if (frames2 == toc3) {
                throw new RuntimeException();
            }
            String[] strArr2 = A02;
            strArr2[0] = "5xugLvQ3PcyvpmKVP2TF";
            strArr2[2] = "0gGe0pFYIsJYF";
            if (i5 == 3) {
                i2 = 60000;
            } else {
                i2 = 10000 << i5;
            }
        }
        return i * i2;
    }

    private void A03(List<byte[]> initializationData, int i) {
        initializationData.add(ByteBuffer.allocate(8).order(ByteOrder.nativeOrder()).putLong((i * 1000000000) / 48000).array());
    }

    public static boolean A04(HV hv) {
        int A042 = hv.A04();
        byte[] bArr = A04;
        if (A042 < bArr.length) {
            return false;
        }
        byte[] bArr2 = new byte[bArr.length];
        hv.A0c(bArr2, 0, bArr.length);
        byte[] header = A04;
        return Arrays.equals(bArr2, header);
    }

    @Override // com.facebook.ads.redexgen.X.CK
    public final long A07(HV hv) {
        return A04(A00(hv.A00));
    }

    @Override // com.facebook.ads.redexgen.X.CK
    public final void A09(boolean z) {
        super.A09(z);
        if (z) {
            this.A00 = false;
        }
    }

    @Override // com.facebook.ads.redexgen.X.CK
    public final boolean A0A(HV hv, long j, CJ cj) throws IOException, InterruptedException {
        if (!this.A00) {
            byte[] copyOf = Arrays.copyOf(hv.A00, hv.A07());
            int i = copyOf[9] & 255;
            ArrayList arrayList = new ArrayList(3);
            arrayList.add(copyOf);
            A03(arrayList, ((copyOf[11] & 255) << 8) | (copyOf[10] & 255));
            A03(arrayList, 3840);
            cj.A00 = Format.A07(null, A01(4, 10, 93), null, -1, -1, i, 48000, arrayList, null, 0, null);
            this.A00 = true;
            return true;
        }
        boolean z = hv.A08() == A03;
        hv.A0Y(0);
        return z;
    }
}
