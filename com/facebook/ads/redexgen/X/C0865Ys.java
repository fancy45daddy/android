package com.facebook.ads.redexgen.X;

import java.io.Serializable;
import java.util.Arrays;
import java.util.List;
import org.json.JSONObject;
/* renamed from: com.facebook.ads.redexgen.X.Ys  reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public final class C0865Ys extends AnonymousClass18 implements Serializable {
    public static byte[] A00 = null;
    public static final long serialVersionUID = 5751287062553772011L;

    static {
        A04();
    }

    public static String A03(int i, int i2, int i3) {
        byte[] copyOfRange = Arrays.copyOfRange(A00, i, i + i2);
        for (int i4 = 0; i4 < copyOfRange.length; i4++) {
            copyOfRange[i4] = (byte) ((copyOfRange[i4] ^ i3) ^ 98);
        }
        return new String(copyOfRange);
    }

    public static void A04() {
        A00 = new byte[]{72, 79, 85, 68, 83, 82, 85, 72, 85, 72, 64, 77};
    }

    public C0865Ys(List<C1B> list) {
        super(list);
    }

    public static C0865Ys A01(JSONObject jSONObject, C0806Wj c0806Wj) {
        C0865Ys c0865Ys = new C0865Ys(AnonymousClass18.A02(jSONObject, c0806Wj, new C0866Yt()));
        c0865Ys.A0l(jSONObject);
        c0865Ys.A0j(A03(0, 12, 67));
        return c0865Ys;
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
