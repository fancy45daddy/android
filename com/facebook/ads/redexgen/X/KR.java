package com.facebook.ads.redexgen.X;

import com.facebook.ads.AdSize;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
/* loaded from: assets/audience_network.dex */
public final class KR {
    public static byte[] A00;
    public static String[] A01 = {"gFe3mTVqEc", "o3XICwck3thy8t5khkuFfgIyTYcE10rb", "CXZamXhEArpjjLRWzP01hTJHhdHKIPhL", "oFEH5ENhqq8Jzm18l75xaKQx7AXJNwzV", "R1QKRY6v8stJjzPTGoE1sFm3d511QSKK", "fRlItu1oZcW1vgjv2TfsauDW1x1gg146", "rMZj8KW6uJSswCV0wJ61u4oJuHgPLcpr", "VRcOG4k1oxgWu574CIBxVkEWQ"};
    public static final Map<J6, J8> A02;

    public static String A06(int i, int i2, int i3) {
        byte[] copyOfRange = Arrays.copyOfRange(A00, i, i + i2);
        for (int i4 = 0; i4 < copyOfRange.length; i4++) {
            copyOfRange[i4] = (byte) ((copyOfRange[i4] ^ i3) ^ 25);
        }
        return new String(copyOfRange);
    }

    public static void A07() {
        A00 = new byte[]{125, 95, 80, 25, 74, 30, 93, 76, 91, 95, 74, 91, 30, Byte.MAX_VALUE, 90, 109, 87, 68, 91, 30, 75, 77, 87, 80, 89, 30, 74, 86, 87, 77, 30, 73, 87, 90, 74, 86, 30, 95, 80, 90, 30, 86, 91, 87, 89, 86, 74, 16, 115, 72, 77, 72, 73, 81, 72, 6, 103, 66, 117, 79, 92, 67, 6, 82, 95, 86, 67, 8};
    }

    static {
        A07();
        A02 = new HashMap();
        A02.put(J6.A08, J8.A0C);
        A02.put(J6.A06, J8.A0E);
        A02.put(J6.A05, J8.A0D);
    }

    public static AdSize A00(J6 j6) {
        return AdSize.fromWidthAndHeight(j6.A03(), j6.A02());
    }

    public static AdSize A01(J8 j8) {
        for (Map.Entry<J6, J8> entry : A02.entrySet()) {
            if (entry.getValue() == j8) {
                return A00(entry.getKey());
            }
        }
        AdSize adSize = AdSize.BANNER_320_50;
        if (A01[2].charAt(13) != 'L') {
            throw new RuntimeException();
        }
        String[] strArr = A01;
        strArr[3] = "8yxIcOBY3dyXYw8tx9RnPYEelWv3PiEU";
        strArr[5] = "RuT7gwLbx9UlwnZGushHq4GsGVsr9kdh";
        return adSize;
    }

    public static J6 A02(int i) {
        if (i != 4) {
            if (i != 5) {
                if (i != 6) {
                    if (i != 7) {
                        if (i == 100) {
                            return J6.A07;
                        }
                        throw new IllegalArgumentException(A06(48, 20, 63));
                    }
                    return J6.A08;
                }
                return J6.A06;
            }
            return J6.A05;
        }
        return J6.A04;
    }

    public static J6 A03(int i, int i2) {
        if (J6.A07.A02() == i2 && J6.A07.A03() == i) {
            J6 j6 = J6.A07;
            if (A01[2].charAt(13) != 'L') {
                throw new RuntimeException();
            }
            String[] strArr = A01;
            strArr[4] = "oPyqycdUDaMLkpnFUSD1lOVVut5Ak4ux";
            strArr[6] = "t44MnsVi8idfM7jbHI01veBsrnLqKP4H";
            return j6;
        } else if (J6.A04.A02() == i2 && J6.A04.A03() == i) {
            return J6.A04;
        } else {
            if (J6.A05.A02() == i2 && J6.A05.A03() == i) {
                J6 j62 = J6.A05;
                if (A01[1].charAt(1) != 'd') {
                    String[] strArr2 = A01;
                    strArr2[4] = "zTuOoFSTcjvo6siKnZ91TQqR6FN8Kxgy";
                    strArr2[6] = "bIxUq8CGRMwo1zGvdui1T5X5wsDAfXTH";
                    return j62;
                }
                throw new RuntimeException();
            } else if (J6.A06.A02() == i2 && J6.A06.A03() == i) {
                return J6.A06;
            } else {
                if (J6.A08.A02() == i2 && J6.A08.A03() == i) {
                    return J6.A08;
                }
                throw new IllegalArgumentException(A06(0, 48, 39));
            }
        }
    }

    public static J6 A04(AdSize adSize) {
        return A03(adSize.getWidth(), adSize.getHeight());
    }

    public static J8 A05(J6 j6) {
        J8 adTemplate = A02.get(j6);
        if (adTemplate == null) {
            J8 j8 = J8.A0F;
            if (A01[1].charAt(1) != 'd') {
                String[] strArr = A01;
                strArr[3] = "UG6JCyDXDBzWMb76AfK0hQ3l3bgkgswO";
                strArr[5] = "9YhmwLNWXnVy8pTRO5fFllqJZ4ALiPvn";
                return j8;
            }
            throw new RuntimeException();
        }
        return adTemplate;
    }
}
