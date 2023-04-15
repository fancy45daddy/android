package com.facebook.ads.redexgen.X;

import java.util.Arrays;
import java.util.List;
import org.json.JSONObject;
/* renamed from: com.facebook.ads.redexgen.X.Yu  reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public final class C0867Yu extends AnonymousClass18 {
    public static byte[] A00 = null;
    public static final long serialVersionUID = 5751287062553772012L;

    static {
        A04();
    }

    public static String A03(int i, int i2, int i3) {
        byte[] copyOfRange = Arrays.copyOfRange(A00, i, i + i2);
        for (int i4 = 0; i4 < copyOfRange.length; i4++) {
            copyOfRange[i4] = (byte) ((copyOfRange[i4] - i3) - 8);
        }
        return new String(copyOfRange);
    }

    public static void A04() {
        A00 = new byte[]{-123, -124, -111, -111, -120, -107};
    }

    public C0867Yu(List<C1B> list) {
        super(list);
    }

    public static C0867Yu A01(JSONObject jSONObject, C0806Wj c0806Wj) {
        C0867Yu c0867Yu = new C0867Yu(AnonymousClass18.A02(jSONObject, c0806Wj, new C0868Yv()));
        c0867Yu.A0l(jSONObject);
        c0867Yu.A0j(A03(0, 6, 27));
        return c0867Yu;
    }

    @Override // com.facebook.ads.redexgen.X.AnonymousClass18
    public final int A0J() {
        return 0;
    }

    @Override // com.facebook.ads.redexgen.X.AnonymousClass18
    public final int A0K() {
        return 0;
    }
}
