package com.facebook.ads.redexgen.X;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
/* loaded from: assets/audience_network.dex */
public final class VL extends AbstractC0283Bp {
    public static byte[] A03;
    public final long A00;
    public final List<VL> A01;
    public final List<VK> A02;

    static {
        A05();
    }

    public static String A04(int i, int i2, int i3) {
        byte[] copyOfRange = Arrays.copyOfRange(A03, i, i + i2);
        for (int i4 = 0; i4 < copyOfRange.length; i4++) {
            copyOfRange[i4] = (byte) ((copyOfRange[i4] - i3) - 99);
        }
        return new String(copyOfRange);
    }

    public static void A05() {
        A03 = new byte[]{0, 67, 79, 78, 84, 65, 73, 78, 69, 82, 83, 26, 0, -110, -34, -41, -45, -24, -41, -27, -84, -110};
    }

    public VL(int i, long j) {
        super(i);
        this.A00 = j;
        this.A02 = new ArrayList();
        this.A01 = new ArrayList();
    }

    public final VL A06(int i) {
        int size = this.A01.size();
        for (int i2 = 0; i2 < size; i2++) {
            VL vl = this.A01.get(i2);
            int childrenSize = ((AbstractC0283Bp) vl).A00;
            if (childrenSize == i) {
                return vl;
            }
        }
        return null;
    }

    public final VK A07(int i) {
        int size = this.A02.size();
        for (int i2 = 0; i2 < size; i2++) {
            VK vk = this.A02.get(i2);
            int childrenSize = ((AbstractC0283Bp) vk).A00;
            if (childrenSize == i) {
                return vk;
            }
        }
        return null;
    }

    public final void A08(VL vl) {
        this.A01.add(vl);
    }

    public final void A09(VK vk) {
        this.A02.add(vk);
    }

    @Override // com.facebook.ads.redexgen.X.AbstractC0283Bp
    public final String toString() {
        return AbstractC0283Bp.A02(super.A00) + A04(13, 9, 15) + Arrays.toString(this.A02.toArray()) + A04(0, 13, 125) + Arrays.toString(this.A01.toArray());
    }
}
