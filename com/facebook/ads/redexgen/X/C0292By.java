package com.facebook.ads.redexgen.X;
/* renamed from: com.facebook.ads.redexgen.X.By  reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public final class C0292By {
    public static String[] A00 = {"5xEbc1UmueoelDSrZ01pbd3BmJNIPp1U", "V2pwOmwpGDtIWtnsLDXNbgXk3OH02STy", "ZygQfCeNfaSOACHLv", "IIEFhzt6S27nqtVGpISchgUV1ko256DH", "7IV1id8R", "S", "X", "3B1kWjUEw7n1jDPOxVE4cJw7NZn0CFn3"};

    public static C0291Bx A00(int i, long[] jArr, int[] iArr, long j) {
        int chunkSamplesRemaining = 8192 / i;
        int i2 = 0;
        for (int i3 : iArr) {
            i2 += C0430Hl.A04(i3, chunkSamplesRemaining);
        }
        long[] jArr2 = new long[i2];
        String[] strArr = A00;
        String str = strArr[5];
        String str2 = strArr[6];
        int maxSampleCount = str.length();
        if (maxSampleCount != str2.length()) {
            throw new RuntimeException();
        }
        String[] strArr2 = A00;
        strArr2[4] = "MOnhYedn";
        strArr2[2] = "VzeyWK1Y20Sbegflw";
        int[] iArr2 = new int[i2];
        int originalSampleIndex = 0;
        long[] timestamps = new long[i2];
        int[] flags = new int[i2];
        int i4 = 0;
        int bufferSampleCount = 0;
        for (int i5 = 0; i5 < iArr.length; i5++) {
            int rechunkedSampleCount = iArr[i5];
            long j2 = jArr[i5];
            while (rechunkedSampleCount > 0) {
                int min = Math.min(chunkSamplesRemaining, rechunkedSampleCount);
                jArr2[bufferSampleCount] = j2;
                iArr2[bufferSampleCount] = i * min;
                originalSampleIndex = Math.max(originalSampleIndex, iArr2[bufferSampleCount]);
                timestamps[bufferSampleCount] = i4 * j;
                flags[bufferSampleCount] = 1;
                j2 += iArr2[bufferSampleCount];
                i4 += min;
                rechunkedSampleCount -= min;
                bufferSampleCount++;
            }
        }
        return new C0291Bx(jArr2, iArr2, originalSampleIndex, timestamps, flags, j * i4);
    }
}
