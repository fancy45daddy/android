package com.facebook.ads.redexgen.X;

import java.util.Arrays;
/* loaded from: assets/audience_network.dex */
public class T6 extends AbstractC00210o {
    public static byte[] A01;
    public final /* synthetic */ C0718Sw A00;

    static {
        A01();
    }

    public static String A00(int i, int i2, int i3) {
        byte[] copyOfRange = Arrays.copyOfRange(A01, i, i + i2);
        for (int i4 = 0; i4 < copyOfRange.length; i4++) {
            copyOfRange[i4] = (byte) ((copyOfRange[i4] - i3) - 109);
        }
        return new String(copyOfRange);
    }

    public static void A01() {
        A01 = new byte[]{23, 42, 61, 50, 63, 46, -23, 42, 45, 60, -23, 54, 42, 55, 42, 48, 46, 59, -23, 61, 49, 46, 50, 59, -23, 56, 64, 55, -23, 50, 54, 57, 59, 46, 60, 60, 50, 56, 55, 60, -9};
    }

    public T6(C0718Sw c0718Sw) {
        this.A00 = c0718Sw;
    }

    @Override // com.facebook.ads.redexgen.X.AbstractC00210o
    public final void A0B(Z9 z9) {
        this.A00.A1T(z9);
    }

    @Override // com.facebook.ads.redexgen.X.AbstractC00210o
    public final void A0C() {
        InterfaceC0717Sv interfaceC0717Sv;
        InterfaceC0717Sv interfaceC0717Sv2;
        interfaceC0717Sv = this.A00.A0G;
        if (interfaceC0717Sv != null) {
            interfaceC0717Sv2 = this.A00.A0G;
            interfaceC0717Sv2.A9m();
        }
    }

    @Override // com.facebook.ads.redexgen.X.AbstractC00210o
    public final void A0D() {
        throw new IllegalStateException(A00(0, 41, 92));
    }

    @Override // com.facebook.ads.redexgen.X.AbstractC00210o
    public final void A0F(InterfaceC00200n interfaceC00200n) {
        EB eb;
        EB eb2;
        eb = this.A00.A0A;
        if (eb != null) {
            eb2 = this.A00.A0A;
            eb2.A0G();
        }
    }

    @Override // com.facebook.ads.redexgen.X.AbstractC00210o
    public final void A0G(J3 j3) {
        long j;
        InterfaceC0717Sv interfaceC0717Sv;
        InterfaceC0717Sv interfaceC0717Sv2;
        C0R A0D = this.A00.A11().A0D();
        j = this.A00.A00;
        A0D.A2a(L5.A01(j), j3.A03().getErrorCode(), j3.A04());
        interfaceC0717Sv = this.A00.A0G;
        if (interfaceC0717Sv != null) {
            interfaceC0717Sv2 = this.A00.A0G;
            interfaceC0717Sv2.AAc(j3);
        }
    }
}
