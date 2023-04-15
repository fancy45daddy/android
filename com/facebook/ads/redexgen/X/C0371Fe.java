package com.facebook.ads.redexgen.X;

import android.graphics.Bitmap;
import java.util.Arrays;
/* renamed from: com.facebook.ads.redexgen.X.Fe  reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public final class C0371Fe {
    public static String[] A09 = {"dgnk6daQ0T87wOoHtyty7iRYaKvd8BzP", "TK3sWG", "r0T7HSyuXxeUz69yLbXIR4BhIiF2UDCf", "E94UIter8sht222SneNEBcgvWBNv8GHv", "qg4jsBrtjCwX7ZbqQAPOhxC1noKxQthL", "J", "sUrKaEkRL4ABh9brwle2ScDHOfoRuahW", "YVc6k2"};
    public int A00;
    public int A01;
    public int A02;
    public int A03;
    public int A04;
    public int A05;
    public boolean A06;
    public final HV A07 = new HV();
    public final int[] A08 = new int[256];

    /* JADX INFO: Access modifiers changed from: private */
    public void A03(HV hv, int i) {
        int totalLength;
        if (i < 4) {
            return;
        }
        hv.A0Z(3);
        int i2 = i - 4;
        if ((hv.A0E() & 128) != 0) {
            if (i2 < 7 || (totalLength = hv.A0G()) < 4) {
                return;
            }
            this.A01 = hv.A0I();
            this.A00 = hv.A0I();
            this.A07.A0W(totalLength - 4);
            i2 -= 7;
        }
        int limit = this.A07.A06();
        int position = this.A07.A07();
        if (limit < position && i2 > 0) {
            int min = Math.min(i2, position - limit);
            hv.A0c(this.A07.A00, limit, min);
            this.A07.A0Y(limit + min);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void A04(HV hv, int i) {
        if (i < 19) {
            return;
        }
        this.A05 = hv.A0I();
        this.A04 = hv.A0I();
        hv.A0Z(11);
        this.A02 = hv.A0I();
        this.A03 = hv.A0I();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void A05(HV hv, int i) {
        if (i % 5 != 2) {
            return;
        }
        hv.A0Z(2);
        Arrays.fill(this.A08, 0);
        int i2 = i / 5;
        for (int i3 = 0; i3 < i2; i3++) {
            int entryCount = hv.A0E();
            int a2 = hv.A0E();
            int A0E = hv.A0E();
            int A0E2 = hv.A0E();
            int entryCount2 = A0E - 128;
            int cb = (int) (a2 + (entryCount2 * 1.402d));
            int r = (int) ((a2 - ((A0E2 - 128) * 0.34414d)) - ((A0E - 128) * 0.71414d));
            int g = hv.A0E() << 24;
            this.A08[entryCount] = g | (C0430Hl.A06(cb, 0, 255) << 16) | (C0430Hl.A06(r, 0, 255) << 8) | C0430Hl.A06((int) (a2 + ((A0E2 - 128) * 1.772d)), 0, 255);
        }
        this.A06 = true;
    }

    public final FJ A06() {
        int A0E;
        int argbBitmapDataIndex;
        if (this.A05 == 0 || this.A04 == 0 || this.A01 == 0 || this.A00 == 0 || this.A07.A07() == 0 || this.A07.A06() != this.A07.A07() || !this.A06) {
            return null;
        }
        this.A07.A0Y(0);
        int[] iArr = new int[this.A01 * this.A00];
        int runLength = 0;
        while (runLength < iArr.length) {
            int argbBitmapDataIndex2 = this.A07.A0E();
            if (argbBitmapDataIndex2 != 0) {
                int[] argbBitmapData = this.A08;
                iArr[runLength] = argbBitmapData[argbBitmapDataIndex2];
                runLength++;
            } else {
                int argbBitmapDataIndex3 = this.A07.A0E();
                if (argbBitmapDataIndex3 == 0) {
                    continue;
                } else {
                    if ((argbBitmapDataIndex3 & 64) == 0) {
                        A0E = argbBitmapDataIndex3 & 63;
                    } else {
                        A0E = ((argbBitmapDataIndex3 & 63) << 8) | this.A07.A0E();
                    }
                    if ((argbBitmapDataIndex3 & 128) == 0) {
                        argbBitmapDataIndex = 0;
                    } else {
                        int[] iArr2 = this.A08;
                        HV hv = this.A07;
                        String[] strArr = A09;
                        String str = strArr[6];
                        String str2 = strArr[2];
                        if (str.length() != str2.length()) {
                            throw new RuntimeException();
                        }
                        String[] strArr2 = A09;
                        strArr2[6] = "LobxqobSp0chhe0OZFFwjgoplyKrXQLj";
                        strArr2[2] = "nSlIIcYQrdb8UpaoVkH7kLQAXSG8FoO0";
                        argbBitmapDataIndex = iArr2[hv.A0E()];
                    }
                    Arrays.fill(iArr, runLength, runLength + A0E, argbBitmapDataIndex);
                    runLength += A0E;
                }
            }
        }
        Bitmap createBitmap = Bitmap.createBitmap(iArr, this.A01, this.A00, Bitmap.Config.ARGB_8888);
        int argbBitmapDataIndex4 = this.A05;
        int i = this.A04;
        return new FJ(createBitmap, this.A02 / argbBitmapDataIndex4, 0, this.A03 / i, 0, this.A01 / argbBitmapDataIndex4, this.A00 / i);
    }

    public final void A07() {
        this.A05 = 0;
        this.A04 = 0;
        this.A02 = 0;
        this.A03 = 0;
        this.A01 = 0;
        this.A00 = 0;
        this.A07.A0W(0);
        this.A06 = false;
    }
}
