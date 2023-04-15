package com.facebook.ads.redexgen.X;

import java.util.Arrays;
import org.json.JSONException;
/* loaded from: assets/audience_network.dex */
public class TS implements QF {
    public static byte[] A02;
    public final /* synthetic */ C0805Wi A00;
    public final /* synthetic */ QD A01;

    static {
        A01();
    }

    public static String A00(int i, int i2, int i3) {
        byte[] copyOfRange = Arrays.copyOfRange(A02, i, i + i2);
        for (int i4 = 0; i4 < copyOfRange.length; i4++) {
            copyOfRange[i4] = (byte) ((copyOfRange[i4] - i3) - 32);
        }
        return new String(copyOfRange);
    }

    public static void A01() {
        A02 = new byte[]{-120, -121, -125, -106, -105, -108, -121, -127, -123, -111, -112, -120, -117, -119};
    }

    public TS(QD qd, C0805Wi c0805Wi) {
        this.A01 = qd;
        this.A00 = c0805Wi;
    }

    @Override // com.facebook.ads.redexgen.X.QF
    public final void A3u() {
        try {
            ID.A0P(this.A00).A2F(this.A01.A6H().optJSONObject(A00(0, 14, 2)));
        } catch (JSONException e) {
            this.A00.A06().A3R(e);
        }
    }
}
