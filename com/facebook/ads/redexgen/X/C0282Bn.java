package com.facebook.ads.redexgen.X;

import java.io.IOException;
import java.util.Arrays;
/* renamed from: com.facebook.ads.redexgen.X.Bn  reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public final class C0282Bn {
    public static byte[] A03;
    public static final long[] A04;
    public int A00;
    public int A01;
    public final byte[] A02 = new byte[8];

    public static String A02(int i, int i2, int i3) {
        byte[] copyOfRange = Arrays.copyOfRange(A03, i, i + i2);
        for (int i4 = 0; i4 < copyOfRange.length; i4++) {
            copyOfRange[i4] = (byte) ((copyOfRange[i4] ^ i3) ^ 42);
        }
        return new String(copyOfRange);
    }

    public static void A03() {
        A03 = new byte[]{0, 33, 110, 56, 47, 34, 39, 42, 110, 56, 47, 60, 39, 32, 58, 110, 34, 43, 32, 41, 58, 38, 110, 35, 47, 61, 37, 110, 40, 33, 59, 32, 42};
    }

    static {
        A03();
        A04 = new long[]{128, 64, 32, 16, 8, 4, 2, 1};
    }

    public static int A00(int i) {
        int i2 = 0;
        while (true) {
            long[] jArr = A04;
            int varIntLength = jArr.length;
            if (i2 >= varIntLength) {
                return -1;
            }
            int varIntLength2 = ((jArr[i2] & i) > 0L ? 1 : ((jArr[i2] & i) == 0L ? 0 : -1));
            if (varIntLength2 != 0) {
                return i2 + 1;
            }
            i2++;
        }
    }

    public static long A01(byte[] bArr, int i, boolean z) {
        long j = bArr[0] & 255;
        if (z) {
            j &= A04[i - 1] ^ (-1);
        }
        for (int i2 = 1; i2 < i; i2++) {
            long varint = bArr[i2];
            j = (j << 8) | (varint & 255);
        }
        return j;
    }

    public final int A04() {
        return this.A00;
    }

    public final long A05(BP bp, boolean z, boolean z2, int i) throws IOException, InterruptedException {
        if (this.A01 == 0) {
            if (!bp.ADV(this.A02, 0, 1, z)) {
                return -1L;
            }
            int firstByte = this.A02[0] & 255;
            this.A00 = A00(firstByte);
            if (this.A00 != -1) {
                this.A01 = 1;
            } else {
                throw new IllegalStateException(A02(0, 33, 100));
            }
        }
        int i2 = this.A00;
        if (i2 > i) {
            this.A01 = 0;
            return -2L;
        }
        if (i2 != 1) {
            bp.readFully(this.A02, 1, i2 - 1);
        }
        this.A01 = 0;
        return A01(this.A02, this.A00, z2);
    }

    public final void A06() {
        this.A01 = 0;
        this.A00 = 0;
    }
}
