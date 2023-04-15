package com.facebook.ads.redexgen.X;

import android.net.Uri;
import android.util.Log;
import java.util.Arrays;
import java.util.Map;
/* renamed from: com.facebook.ads.redexgen.X.El  reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public class C0354El extends AbstractC0690Rt {
    public static byte[] A02;
    public final /* synthetic */ ZC A00;
    public final /* synthetic */ Z3 A01;

    static {
        A01();
    }

    public static String A00(int i, int i2, int i3) {
        byte[] copyOfRange = Arrays.copyOfRange(A02, i, i + i2);
        for (int i4 = 0; i4 < copyOfRange.length; i4++) {
            copyOfRange[i4] = (byte) ((copyOfRange[i4] - i3) - 74);
        }
        return new String(copyOfRange);
    }

    public static void A01() {
        A02 = new byte[]{-113, -68, -68, -71, -68, 106, -81, -62, -81, -83, -65, -66, -77, -72, -79, 106, -85, -83, -66, -77, -71, -72, 2, -2, -3, 0};
    }

    public C0354El(ZC zc, Z3 z3) {
        this.A00 = zc;
        this.A01 = z3;
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC0563Mv
    public final void A9x() {
        boolean z;
        this.A00.A0E = true;
        z = this.A00.A0F;
        if (!z) {
            return;
        }
        this.A00.A09();
    }

    @Override // com.facebook.ads.redexgen.X.AbstractC0690Rt, com.facebook.ads.redexgen.X.InterfaceC0563Mv
    public final void AAD(String str, Map<String, String> extraData) {
        DY dy;
        DY dy2;
        IT it;
        String str2;
        DY dy3;
        InterfaceC00280v interfaceC00280v;
        InterfaceC00280v interfaceC00280v2;
        dy = this.A00.A03;
        dy.A0D().A3Y();
        Uri A00 = KM.A00(str);
        if (A00(22, 4, 82).equals(A00.getScheme()) && C00140g.A04(A00.getAuthority())) {
            interfaceC00280v = this.A00.A00;
            if (interfaceC00280v != null) {
                interfaceC00280v2 = this.A00.A00;
                interfaceC00280v2.AA6(this.A00);
            }
        }
        dy2 = this.A00.A03;
        it = this.A00.A04;
        AbstractC00130f adAction = C00140g.A00(dy2, it, this.A01.A63(), A00, extraData);
        if (adAction == null) {
            return;
        }
        try {
            dy3 = this.A00.A03;
            dy3.A0D().A3V();
            adAction.A0C();
        } catch (Exception e) {
            str2 = ZC.A0I;
            Log.e(str2, A00(0, 22, 0), e);
        }
    }

    @Override // com.facebook.ads.redexgen.X.AbstractC0690Rt, com.facebook.ads.redexgen.X.InterfaceC0563Mv
    public final void AAt() {
        DY dy;
        Z1 z1;
        Z1 z12;
        Z1 z13;
        dy = this.A00.A03;
        ZU A0D = dy.A0D();
        z1 = this.A00.A01;
        A0D.A3Z(z1 != null);
        z12 = this.A00.A01;
        if (z12 == null) {
            return;
        }
        z13 = this.A00.A01;
        z13.A02();
    }

    @Override // com.facebook.ads.redexgen.X.AbstractC0690Rt, com.facebook.ads.redexgen.X.InterfaceC0563Mv
    public final void ABb() {
        DY dy;
        Z1 z1;
        dy = this.A00.A03;
        dy.A0D().A3b();
        z1 = this.A00.A01;
        z1.A07();
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC0563Mv
    public final void ACo() {
    }
}
