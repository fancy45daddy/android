package com.facebook.ads.redexgen.X;

import java.util.Arrays;
/* renamed from: com.facebook.ads.redexgen.X.Tu  reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public final class C0742Tu implements GI {
    public static byte[] A08;
    public int A00;
    public int A01;
    public int A02;
    public GH[] A03;
    public final int A04;
    public final boolean A05;
    public final byte[] A06;
    public final GH[] A07;

    static {
        A01();
    }

    public static String A00(int i, int i2, int i3) {
        byte[] copyOfRange = Arrays.copyOfRange(A08, i, i + i2);
        for (int i4 = 0; i4 < copyOfRange.length; i4++) {
            copyOfRange[i4] = (byte) ((copyOfRange[i4] - i3) - 123);
        }
        return new String(copyOfRange);
    }

    public static void A01() {
        A08 = new byte[]{-69, -81, -2, 23, 14, 33, 25, 14, 12, 29, 14, 13, -55, 10, 21, 21, 24, 12, 10, 29, 18, 24, 23, -29, -55};
    }

    public C0742Tu(boolean z, int i) {
        this(z, i, 0);
    }

    public C0742Tu(boolean z, int i, int i2) {
        H6.A03(i > 0);
        H6.A03(i2 >= 0);
        this.A05 = z;
        this.A04 = i;
        this.A01 = i2;
        this.A03 = new GH[i2 + 100];
        if (i2 > 0) {
            this.A06 = new byte[i2 * i];
            for (int i3 = 0; i3 < i2; i3++) {
                this.A03[i3] = new GH(this.A06, i3 * i);
            }
        } else {
            this.A06 = null;
        }
        this.A07 = new GH[1];
    }

    public final synchronized int A02() {
        return this.A00 * this.A04;
    }

    public final synchronized void A03() {
        if (this.A05) {
            A04(0);
        }
    }

    public final synchronized void A04(int i) {
        boolean targetBufferSizeReduced = i < this.A02;
        this.A02 = i;
        if (targetBufferSizeReduced) {
            AF3();
        }
    }

    @Override // com.facebook.ads.redexgen.X.GI
    public final synchronized GH A3L() {
        GH gh;
        this.A00++;
        if (this.A01 > 0) {
            GH[] ghArr = this.A03;
            int i = this.A01 - 1;
            this.A01 = i;
            gh = ghArr[i];
            this.A03[this.A01] = null;
        } else {
            gh = new GH(new byte[this.A04], 0);
        }
        return gh;
    }

    @Override // com.facebook.ads.redexgen.X.GI
    public final int A6m() {
        return this.A04;
    }

    @Override // com.facebook.ads.redexgen.X.GI
    public final synchronized void ADg(GH gh) {
        this.A07[0] = gh;
        ADh(this.A07);
    }

    @Override // com.facebook.ads.redexgen.X.GI
    public final synchronized void ADh(GH[] ghArr) {
        if (this.A01 + ghArr.length >= this.A03.length) {
            this.A03 = (GH[]) Arrays.copyOf(this.A03, Math.max(this.A03.length * 2, this.A01 + ghArr.length));
        }
        for (GH gh : ghArr) {
            if (gh.A01 != this.A06 && gh.A01.length != this.A04) {
                throw new IllegalArgumentException(A00(2, 23, 46) + System.identityHashCode(gh.A01) + A00(0, 2, 20) + System.identityHashCode(this.A06) + A00(0, 2, 20) + gh.A01.length + A00(0, 2, 20) + this.A04);
            }
            GH[] ghArr2 = this.A03;
            int i = this.A01;
            this.A01 = i + 1;
            ghArr2[i] = gh;
        }
        this.A00 -= ghArr.length;
        notifyAll();
    }

    @Override // com.facebook.ads.redexgen.X.GI
    public final synchronized void AF3() {
        int A04 = C0430Hl.A04(this.A02, this.A04);
        int targetAllocationCount = this.A00;
        int max = Math.max(0, A04 - targetAllocationCount);
        int targetAllocationCount2 = this.A01;
        if (max >= targetAllocationCount2) {
            return;
        }
        if (this.A06 != null) {
            int lowIndex = 0;
            int targetAllocationCount3 = this.A01;
            int highIndex = targetAllocationCount3 - 1;
            while (lowIndex <= highIndex) {
                GH highAllocation = this.A03[lowIndex];
                if (highAllocation.A01 == this.A06) {
                    lowIndex++;
                } else {
                    GH lowAllocation = this.A03[highIndex];
                    if (lowAllocation.A01 != this.A06) {
                        highIndex--;
                    } else {
                        this.A03[lowIndex] = lowAllocation;
                        int targetAllocationCount4 = highIndex - 1;
                        this.A03[highIndex] = highAllocation;
                        highIndex = targetAllocationCount4;
                        lowIndex++;
                    }
                }
            }
            max = Math.max(max, lowIndex);
            int targetAllocationCount5 = this.A01;
            if (max >= targetAllocationCount5) {
                return;
            }
        }
        GH[] ghArr = this.A03;
        int targetAvailableCount = this.A01;
        Arrays.fill(ghArr, max, targetAvailableCount, (Object) null);
        this.A01 = max;
    }
}
