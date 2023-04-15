package com.facebook.ads.redexgen.X;

import a.a.j;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
/* loaded from: assets/audience_network.dex */
public final class WR implements InterfaceC0631Pm {
    public static byte[] A01;
    public final C0805Wi A00;

    static {
        A01();
    }

    public static String A00(int i, int i2, int i3) {
        byte[] copyOfRange = Arrays.copyOfRange(A01, i, i + i2);
        for (int i4 = 0; i4 < copyOfRange.length; i4++) {
            copyOfRange[i4] = (byte) ((copyOfRange[i4] - i3) - 127);
        }
        return new String(copyOfRange);
    }

    public static void A01() {
        A01 = new byte[]{-2, -45, -20, -24, -45, -10, 21, 21, 18, -45, -8, 21, 27, 26, 15, 20, 13, -45, -6, 21, 17, 11, 20, 102, 100, 86, 99, 30, 82, 88, 86, 95, 101};
    }

    public WR(C0805Wi c0805Wi) {
        this.A00 = c0805Wi;
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC0631Pm
    public final Map<String, String> A5U(boolean z) {
        HashMap hashMap = new HashMap();
        if (!C01525s.A00().A04()) {
            hashMap.put(A00(0, 23, 39), C8G.A00().A01(this.A00, true).A7W());
        }
        hashMap.put(A00(23, 10, j.AppCompatTheme_windowFixedHeightMajor), C8K.A06(new C01977v(this.A00), this.A00, z));
        return hashMap;
    }
}
