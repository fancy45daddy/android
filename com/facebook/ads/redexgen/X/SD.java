package com.facebook.ads.redexgen.X;

import java.util.concurrent.atomic.AtomicBoolean;
/* loaded from: assets/audience_network.dex */
public class SD implements InterfaceC0517La {
    public static String[] A01 = {"h2gmCgzeOSwPpQadyubORmPME", "FUsicmE", "hn4NyL1W4e9kqLwlHKvUfsHZQMREJpya", "eHNPFabCzKzaRImgdDwbhByrCj67ZmIn", "6elmdBIgNV", "KYWsfvA8UKVAEYMYl", "OScpkLbA9Akq1WCCJj9B2P18mljyrRf1", "CLPqh0UltEqIAscKXF8yE5GQF7q0sxf27"};
    public final /* synthetic */ S9 A00;

    public SD(S9 s9) {
        this.A00 = s9;
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC0517La
    public final void AAE() {
        boolean A0Z;
        boolean z;
        C0444Ib c0444Ib;
        InterfaceC0519Lc interfaceC0519Lc;
        M4 m4;
        AtomicBoolean atomicBoolean;
        boolean A0Y;
        AtomicBoolean atomicBoolean2;
        NG ng;
        A0Z = this.A00.A0Z();
        if (A0Z) {
            S9 s9 = this.A00;
            if (A01[5].length() != 17) {
                throw new RuntimeException();
            }
            String[] strArr = A01;
            strArr[2] = "BQfapZ2cL00AEaaE3FSFtmiC2NvNVd8B";
            strArr[7] = "2Eilcj8Fw7KGtRQsL0qtkyDrsBY20NGQL";
            atomicBoolean2 = s9.A0Q;
            if (!atomicBoolean2.get()) {
                ng = this.A00.A0O;
                ng.A07(this.A00);
                return;
            }
        }
        z = this.A00.A0S;
        if (z) {
            atomicBoolean = this.A00.A0Q;
            boolean z2 = atomicBoolean.get();
            String[] strArr2 = A01;
            if (strArr2[1].length() == strArr2[4].length()) {
                throw new RuntimeException();
            }
            A01[5] = "H8RzDb7PgK43jKvxQ";
            if (!z2) {
                A0Y = this.A00.A0Y();
                if (A0Y) {
                    this.A00.A0V.setToolbarActionMode(0);
                    S9 s92 = this.A00;
                    String[] strArr3 = A01;
                    if (strArr3[1].length() != strArr3[4].length()) {
                        A01[3] = "HnGIws8hCrqNeUOcBeXjDBOXn0GrcMNy";
                        s92.A0M();
                        return;
                    }
                    s92.A0M();
                    return;
                }
            }
        }
        c0444Ib = this.A00.A0I;
        c0444Ib.A02(EnumC0443Ia.A07, null);
        interfaceC0519Lc = this.A00.A0L;
        m4 = this.A00.A0M;
        interfaceC0519Lc.A3s(m4.A6S());
    }
}
