package com.facebook.ads.redexgen.X;

import a.a.j;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
/* renamed from: com.facebook.ads.redexgen.X.8C  reason: invalid class name */
/* loaded from: assets/audience_network.dex */
public final class C8C {
    public static HashMap<String, String> A00;
    public static byte[] A01;

    static {
        A03();
    }

    public static String A00(int i, int i2, int i3) {
        byte[] copyOfRange = Arrays.copyOfRange(A01, i, i + i2);
        for (int i4 = 0; i4 < copyOfRange.length; i4++) {
            copyOfRange[i4] = (byte) ((copyOfRange[i4] ^ i3) ^ j.AppCompatTheme_textAppearanceSearchResultSubtitle);
        }
        return new String(copyOfRange);
    }

    public static void A03() {
        A01 = new byte[]{63, 46, 46, 60, 43, 55, 50, 58, 118, 103, 103, 121, 118, 122, 114, 27, 10, 10, 12, 31, 8, 9, 14, 25, 2, 8, 0, 9, 47, 45, 38, 39, 46, 15, 19, 53, 41, 44, 63, 40, 41, 101, 114, 125, 114, 101, 106, 126, 119, 100, 115, 114, 104, 110, 111, 126, 104, 126, 126, 100, 98, 99, 114, 100, 105, 51, 60, 54, 32, 61, 59, 54};
    }

    public static synchronized Map<String, String> A01(C7G c7g) {
        synchronized (C8C.class) {
            if (A00 != null) {
                return new HashMap(A00);
            }
            A00 = new HashMap<>();
            A00.put(A00(22, 6, 41), c7g.getPackageName());
            A02(c7g, A00);
            return new HashMap(A00);
        }
    }

    public static synchronized Map<String, String> A02(C7G c7g, Map<String, String> map) {
        synchronized (C8C.class) {
            map.put(A00(41, 3, 83), A00(65, 7, 55));
            map.put(A00(44, 11, 68), c7g.A03().A7l());
            map.put(A00(33, 2, 37), c7g.A03().A7k());
            map.put(A00(35, 6, 31), C01977v.A03);
            C01977v c01977v = new C01977v(c7g);
            map.put(A00(15, 7, 63), c01977v.A06());
            map.put(A00(8, 7, 82), c01977v.A05());
            map.put(A00(0, 8, 27), String.valueOf(c01977v.A04()));
            map.put(A00(28, 5, 7), c01977v.A0A());
            map.put(A00(55, 10, 72), c7g.A07().A02());
        }
        return map;
    }
}
