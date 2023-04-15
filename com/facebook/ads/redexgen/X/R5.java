package com.facebook.ads.redexgen.X;

import java.util.Arrays;
/* loaded from: assets/audience_network.dex */
public class R5 extends AbstractRunnableC0487Ju {
    public static byte[] A02;
    public final /* synthetic */ C7C A00;
    public final /* synthetic */ C01726r A01;

    static {
        A02();
    }

    public static String A00(int i, int i2, int i3) {
        byte[] copyOfRange = Arrays.copyOfRange(A02, i, i + i2);
        for (int i4 = 0; i4 < copyOfRange.length; i4++) {
            copyOfRange[i4] = (byte) ((copyOfRange[i4] - i3) - 53);
        }
        return new String(copyOfRange);
    }

    public static void A02() {
        A02 = new byte[]{-126, -75, -90, -90, -91, -78, -87, -82, -89, 96, -87, -82, -92, -91, -90, -87, -82, -87, -76, -91, -84, -71};
    }

    public R5(C7C c7c, C01726r c01726r) {
        this.A00 = c7c;
        this.A01 = c01726r;
    }

    @Override // com.facebook.ads.redexgen.X.AbstractRunnableC0487Ju
    public final void A06() {
        P1 p1;
        P1 p12;
        p1 = this.A00.A0B;
        if (p1.getState() == EnumC0624Pf.A02) {
            p12 = this.A00.A0B;
            if (p12.getCurrentPositionInMillis() == A00()) {
                this.A00.A0G(A00(0, 22, 11));
            }
        }
    }
}
