package com.facebook.ads.redexgen.X;

import java.util.Arrays;
import org.json.JSONObject;
/* loaded from: assets/audience_network.dex */
public class RR implements InterfaceC0581Nn {
    public static byte[] A01;
    public final /* synthetic */ C02178p A00;

    static {
        A01();
    }

    public static String A00(int i, int i2, int i3) {
        byte[] copyOfRange = Arrays.copyOfRange(A01, i, i + i2);
        for (int i4 = 0; i4 < copyOfRange.length; i4++) {
            copyOfRange[i4] = (byte) ((copyOfRange[i4] - i3) - 23);
        }
        return new String(copyOfRange);
    }

    public static void A01() {
        A01 = new byte[]{-49, -53, -64, -40};
    }

    public RR(C02178p c02178p) {
        this.A00 = c02178p;
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC0581Nn
    public final void ACd(String str, JSONObject jSONObject) {
        C0589Nw c0589Nw;
        C0806Wj c0806Wj;
        C0806Wj c0806Wj2;
        if (str.equals(A00(0, 4, 72))) {
            this.A00.AEt();
            c0806Wj = this.A00.A07;
            if (ID.A1K(c0806Wj)) {
                c0806Wj2 = this.A00.A07;
                c0806Wj2.A09().AAN();
            }
        }
        c0589Nw = this.A00.A0F;
        c0589Nw.A0h(str, jSONObject);
    }
}
