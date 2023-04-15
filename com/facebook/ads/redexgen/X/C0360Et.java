package com.facebook.ads.redexgen.X;

import android.net.Uri;
/* renamed from: com.facebook.ads.redexgen.X.Et  reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public final class C0360Et {
    public final int A00;
    public final int[] A01;
    public final long[] A02;
    public final Uri[] A03;

    public C0360Et() {
        this(-1, new int[0], new Uri[0], new long[0]);
    }

    public C0360Et(int i, int[] iArr, Uri[] uriArr, long[] jArr) {
        H6.A03(iArr.length == uriArr.length);
        this.A00 = i;
        this.A01 = iArr;
        this.A03 = uriArr;
        this.A02 = jArr;
    }

    public final int A00() {
        return A01(-1);
    }

    public final int A01(int i) {
        int i2 = i + 1;
        while (true) {
            int[] iArr = this.A01;
            int nextAdIndexToPlay = iArr.length;
            if (i2 >= nextAdIndexToPlay) {
                break;
            }
            int nextAdIndexToPlay2 = iArr[i2];
            if (nextAdIndexToPlay2 == 0 || iArr[i2] == 1) {
                break;
            }
            i2++;
        }
        return i2;
    }

    public final boolean A02() {
        return this.A00 == -1 || A00() < this.A00;
    }
}
