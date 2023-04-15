package com.facebook.ads.redexgen.X;

import com.facebook.ads.internal.protocol.AdErrorType;
import java.util.Arrays;
/* renamed from: com.facebook.ads.redexgen.X.Ye  reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public class C0851Ye extends AbstractRunnableC0487Ju {
    public static byte[] A03;
    public final /* synthetic */ ZC A00;
    public final /* synthetic */ C00491q A01;
    public final /* synthetic */ ED A02;

    static {
        A02();
    }

    public static String A00(int i, int i2, int i3) {
        byte[] copyOfRange = Arrays.copyOfRange(A03, i, i + i2);
        for (int i4 = 0; i4 < copyOfRange.length; i4++) {
            copyOfRange[i4] = (byte) ((copyOfRange[i4] ^ i3) ^ 74);
        }
        return new String(copyOfRange);
    }

    public static void A02() {
        A03 = new byte[]{32, 5, 0, 17, 21, 4, 19, 65, 21, 8, 12, 4, 14, 20, 21, 79};
    }

    public C0851Ye(ED ed, C00491q c00491q, ZC zc) {
        this.A02 = ed;
        this.A01 = c00491q;
        this.A00 = zc;
    }

    @Override // com.facebook.ads.redexgen.X.AbstractRunnableC0487Ju
    public final void A06() {
        this.A02.A0N(this.A01);
        this.A02.A0K(this.A00);
        this.A02.AAc(new J3(AdErrorType.NETWORK_ERROR, A00(0, 16, 43)));
    }
}
