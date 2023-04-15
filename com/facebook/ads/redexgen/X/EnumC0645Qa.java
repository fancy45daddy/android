package com.facebook.ads.redexgen.X;

import a.a.j;
import java.util.Arrays;
import java.util.Locale;
/* renamed from: com.facebook.ads.redexgen.X.Qa  reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public enum EnumC0645Qa {
    A03(A01(35, 4, j.AppCompatTheme_textColorAlertDialogListItem)),
    A04(A01(39, 4, j.AppCompatTheme_windowActionModeOverlay));
    
    public static byte[] A01;
    public String A00;

    public static String A01(int i, int i2, int i3) {
        byte[] copyOfRange = Arrays.copyOfRange(A01, i, i + i2);
        for (int i4 = 0; i4 < copyOfRange.length; i4++) {
            copyOfRange[i4] = (byte) ((copyOfRange[i4] - i3) - 86);
        }
        return new String(copyOfRange);
    }

    public static void A02() {
        A01 = new byte[]{-99, -84, -93, -93, -22, 15, 23, 2, 13, 10, 5, -63, 20, 6, 19, 23, 6, 19, -63, 19, 6, 20, 17, 16, 15, 20, 6, -37, -63, -58, 20, -34, -40, -40, -29, 36, 51, 42, 42, 50, 44, 44, 55};
    }

    static {
        A02();
    }

    EnumC0645Qa(String str) {
        this.A00 = str;
    }

    public static EnumC0645Qa A00(String str) {
        EnumC0645Qa[] values;
        for (EnumC0645Qa enumC0645Qa : values()) {
            if (enumC0645Qa.A00.equals(str)) {
                return enumC0645Qa;
            }
        }
        throw new IllegalArgumentException(String.format(Locale.US, A01(4, 27, 75), str));
    }
}
