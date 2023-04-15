package com.facebook.ads.redexgen.X;

import java.util.Arrays;
/* loaded from: assets/audience_network.dex */
public class Z2 extends AbstractRunnableC0487Ju {
    public static byte[] A01;
    public final /* synthetic */ Z1 A00;

    static {
        A02();
    }

    public static String A00(int i, int i2, int i3) {
        byte[] copyOfRange = Arrays.copyOfRange(A01, i, i + i2);
        for (int i4 = 0; i4 < copyOfRange.length; i4++) {
            copyOfRange[i4] = (byte) ((copyOfRange[i4] - i3) - 95);
        }
        return new String(copyOfRange);
    }

    public static void A02() {
        A01 = new byte[]{-20, -29, -8, -29, -11, -27, -12, -21, -14, -10, -68};
    }

    public Z2(Z1 z1) {
        this.A00 = z1;
    }

    @Override // com.facebook.ads.redexgen.X.AbstractRunnableC0487Ju
    public final void A06() {
        C0806Wj c0806Wj;
        AbstractC0560Ms abstractC0560Ms;
        Z3 z3;
        c0806Wj = this.A00.A02;
        c0806Wj.A0D().AFM();
        abstractC0560Ms = this.A00.A04;
        StringBuilder sb = new StringBuilder();
        sb.append(A00(0, 11, 35));
        z3 = this.A00.A00;
        sb.append(z3.A03());
        abstractC0560Ms.loadUrl(sb.toString());
    }
}
