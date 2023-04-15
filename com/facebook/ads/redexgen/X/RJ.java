package com.facebook.ads.redexgen.X;

import java.util.Arrays;
/* loaded from: assets/audience_network.dex */
public class RJ extends AbstractRunnableC0487Ju {
    public static byte[] A02;
    public final /* synthetic */ C0582No A00;
    public final /* synthetic */ C01726r A01;

    static {
        A02();
    }

    public static String A00(int i, int i2, int i3) {
        byte[] copyOfRange = Arrays.copyOfRange(A02, i, i + i2);
        for (int i4 = 0; i4 < copyOfRange.length; i4++) {
            copyOfRange[i4] = (byte) ((copyOfRange[i4] ^ i3) ^ 46);
        }
        return new String(copyOfRange);
    }

    public static void A02() {
        A02 = new byte[]{93, 106, 121, 121, 122, 109, 118, 113, 120, 63, 118, 113, 123, 122, 121, 118, 113, 118, 107, 122, 115, 102};
    }

    public RJ(C0582No c0582No, C01726r c01726r) {
        this.A00 = c0582No;
        this.A01 = c01726r;
    }

    @Override // com.facebook.ads.redexgen.X.AbstractRunnableC0487Ju
    public final void A06() {
        P1 p1;
        P1 p12;
        p1 = this.A00.A0D;
        if (p1.getState() == EnumC0624Pf.A02) {
            p12 = this.A00.A0D;
            if (p12.getCurrentPositionInMillis() == A00()) {
                this.A00.A0I(A00(0, 22, 49));
            }
        }
    }
}
