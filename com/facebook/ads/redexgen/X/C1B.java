package com.facebook.ads.redexgen.X;

import a.a.j;
import java.io.Serializable;
import java.util.Arrays;
import org.json.JSONObject;
/* renamed from: com.facebook.ads.redexgen.X.1B  reason: invalid class name */
/* loaded from: assets/audience_network.dex */
public final class C1B implements Serializable {
    public static byte[] A0A = null;
    public static String[] A0B = {"R5DeYR6FKIddoQ1tNFb4QO1F3D7YHRG7", "hniB1BSXMiqlCD6U", "jhH7rQZzgqsha0FGspkq8z1DrJIjsBJk", "lw6F7y1SoSoTAEcdzLyYaN1xEC1Q2oWX", "ic1GHkKPsX6vyCRQCqNODZsBJ", "Aw8qdmnq9PbtDTR9ez9n3jUjtBry3vCr", "3as5zHbOptZ96SzIdP7nSqOic", "mvWErpvjRXL0vWcjCyiUNQO7TD5zouZh"};
    public static final long serialVersionUID = 85021702336014823L;
    public C1D A00;
    public C1E A01;
    public C1I A02;
    public C1L A03;
    public C1M A04;
    public boolean A05;
    public boolean A06;
    public boolean A07;
    public boolean A08;
    public boolean A09;

    public static String A01(int i, int i2, int i3) {
        byte[] copyOfRange = Arrays.copyOfRange(A0A, i, i + i2);
        for (int i4 = 0; i4 < copyOfRange.length; i4++) {
            byte b2 = (byte) ((copyOfRange[i4] ^ i3) ^ 58);
            String[] strArr = A0B;
            if (strArr[3].charAt(22) != strArr[0].charAt(22)) {
                throw new RuntimeException();
            }
            String[] strArr2 = A0B;
            strArr2[2] = "LXXQrjhAH5CnLq5fKQjRUnrA3R85ks8i";
            strArr2[7] = "Vzc9rcIkwZ9oA3QEo9fi0aCOPKhgVZjz";
            copyOfRange[i4] = b2;
        }
        return new String(copyOfRange);
    }

    public static void A03() {
        A0A = new byte[]{61, 0, 84, 3, 29, 24, 24, 84, 21, 1, 0, 27, 25, 21, 0, 29, 23, 21, 24, 24, 13, 84, 27, 4, 17, 26, 84, 29, 26, 84, 47, 7, 17, 23, 7, 41, 7, 116, 113, 74, 118, 103, 112, 116, 97, 124, 99, 112, 74, 97, 108, 101, 112, 117, 120, 115, 110, 15, 24, 25, 25, 2, 3, 50, 4, 14, 2, 3, 23, 21, 24, 24, 43, 0, 27, 43, 21, 23, 0, 29, 27, 26, 1, 3, 22, 7, 5, 13, 16, 27, 92, 93, 84, 89, 65, 103, 91, 84, 81, 91, 83, 103, 76, 93, 64, 76, 87, 86, 64, 71, 90, 93, 82, 71, 90, 92, 93, 108, 71, 90, 71, 95, 86, 56, 51, 57, 2, 62, 60, 47, 57, 2, 52, 48, 60, 58, 56, 46, 73, 77, 78, 75, 112, 76, 64, 66, 66, 78, 65, 75, 83, 81, 90, 81, 70, 93, 87, 107, 64, 81, 76, 64, 35, 46, 34, 44, 35, 63, 7, 3, 15, 9, 11, 64, 90, 118, 91, 76, 94, 72, 91, 77, 76, 77, 118, 72, 77, 60, 38, 10, 35, 60, 49, 48, 58, 10, 52, 32, 49, 60, 58, 10, 56, 32, 33, 48, 49, 31, 5, 41, 1, 23, 2, 21, 30, 41, 23, 24, 18, 41, 20, 4, 25, 1, 5, 19, 82, 65, 84, 73, 78, 71, Byte.MAX_VALUE, 67, 79, 85, 78, 84, 43, 56, 45, 48, 55, 62, 6, 47, 56, 53, 44, 60, 46, 56, 62, 50, 51, 57, 46, 2, 59, 50, 47, 2, 47, 56, 42, 60, 47, 57, 67, 88, 95, 71, 111, 85, 94, 84, 111, 83, 81, 66, 84, 9, 18, 21, 13, 37, 31, 2, 19, 14, 37, 14, 8, 27, 20, 9, 19, 14, 19, 21, 20, 43, 48, 55, 47, 7, 49, 54, 44, 42, 55, 7, 44, 42, 57, 54, 43, 49, 44, 49, 55, 54, 48, 40, 42, 51, 28, 34, 45, 39, 28, 47, 44, 48, 38, 28, 49, 38, 52, 34, 49, 39, 71, 95, 93, 68, 68, 85, 86, 88, 81, 107, 71, 81, 87, 91, 90, 80, 71, 105, 117, 121, 115, 123, 118, 69, 121, 117, 116, 110, Byte.MAX_VALUE, 98, 110, 70, 64, 87, 65, 92, 65, 89, 80, 51, 46, 51, 43, 34, 77, 86, 75, 83, 81, 72, 72, 89, 90, 84, 93, 103, 75, 93, 91, 87, 86, 92, 75, 117, 114, 108, 36, 59, 54, 55, 61, 13, 51, 39, 38, 61, 34, 62, 51, 43, 13, 55, 60, 51, 48, 62, 55, 54, 118, 105, 100, 101, 111, 95, 100, 117, 114, 97, 116, 105, 111, 110, 95, 115, 101, 99, 36, 59, 54, 55, 61, 13, 34, 32, 55, 62, 61, 51, 54, 13, 33, 59, 40, 55, 13, 48, 43, 38, 55, 33, 113, 110, 99, 98, 104, 88, 114, 117, 107, 88, 70, 75, 91, 71};
    }

    static {
        A03();
    }

    public static C1B A00(JSONObject jSONObject) {
        int optInt;
        C1B c1b = new C1B();
        c1b.A06(new C1H().A0H(jSONObject.optString(A01(381, 5, 125))).A0G(jSONObject.optString(A01(373, 8, 15))).A0B(jSONObject.optString(A01(53, 4, 45))).A0F(jSONObject.optString(A01(359, 14, 32))).A0E(jSONObject.optString(A01(238, 12, 99))).A0D(jSONObject.optString(A01(226, 12, 26))).A09(jSONObject.optString(A01(37, 16, 47))).A0A(jSONObject.optString(A01(82, 8, 88))).A0C(jSONObject.optString(A01(j.AppCompatTheme_toolbarNavigationButtonStyle, 17, 9))).A0I());
        c1b.A07(new C1L(jSONObject.optString(A01(138, 12, 21)), jSONObject.optString(A01(68, 14, 78)), jSONObject.optJSONObject(A01(57, 11, 87)), jSONObject.optString(A02(jSONObject))));
        String A01 = A01(386, 19, 2);
        if (jSONObject.optInt(A01, -1) == -1) {
            if (A0B[1].length() == 16) {
                A0B[5] = "m0SNHJxvul7tSRvrfYkKg9k0pQQtrIDe";
                optInt = jSONObject.optInt(A01(342, 17, 14), -1);
            }
            throw new RuntimeException();
        }
        optInt = jSONObject.optInt(A01, -1);
        C1D A0I = new C1D().A0K(jSONObject.optString(A01(472, 9, 61))).A0H(jSONObject.optLong(A01(448, 24, j.AppCompatTheme_textColorAlertDialogListItem), -1L)).A0F(optInt).A0E(jSONObject.optInt(A01(250, 18, j.AppCompatTheme_textAppearanceSmallPopupMenu), Integer.MAX_VALUE)).A0I(C1W.A01(jSONObject));
        JSONObject optJSONObject = jSONObject.optJSONObject(A01(168, 5, 84));
        if (optJSONObject != null) {
            C1D A0D = A0I.A0J(optJSONObject.optString(A01(405, 3, 58))).A0D(optJSONObject.optInt(A01(481, 5, 21)));
            int unskippableSeconds = A0B[1].length();
            if (unskippableSeconds == 16) {
                A0B[5] = "WsiHjZ6Ab9OhwgLQk07kFOW3FmkdrPnz";
                A0D.A0C(optJSONObject.optInt(A01(162, 6, j.AppCompatTheme_windowActionModeOverlay)));
            }
            throw new RuntimeException();
        }
        c1b.A04(A0I);
        c1b.A0C(jSONObject.optBoolean(A01(301, 21, 98)));
        c1b.A08(new C1M(C0500Kj.A04(jSONObject.optJSONArray(A01(123, 15, j.AppCompatTheme_textAppearanceSmallPopupMenu)))));
        c1b.A09(jSONObject.optBoolean(A01(207, 19, 76)));
        return c1b;
    }

    public static String A02(JSONObject jSONObject) {
        String A01 = A01(90, 16, 2);
        String A012 = A01(0, 37, 78);
        String optString = jSONObject.optString(A01, A012);
        if (optString.equals(A012)) {
            JSONObject optJSONObject = jSONObject.optJSONObject(A01(150, 12, 14));
            if (optJSONObject != null) {
                A012 = optJSONObject.optString(A01, A012);
            }
            return A012;
        }
        return optString;
    }

    private void A04(C1D c1d) {
        this.A00 = c1d;
    }

    private final void A05(C1E c1e) {
        this.A01 = c1e;
    }

    private final void A06(C1I c1i) {
        this.A02 = c1i;
    }

    private final void A07(C1L c1l) {
        this.A03 = c1l;
    }

    private final void A08(C1M c1m) {
        this.A04 = c1m;
    }

    private final void A09(boolean z) {
        this.A06 = z;
    }

    private final void A0A(boolean z) {
        this.A07 = z;
    }

    private final void A0B(boolean z) {
        this.A08 = z;
    }

    private final void A0C(boolean z) {
        this.A09 = z;
    }

    public final C1E A0D() {
        return this.A01;
    }

    public final C1I A0E() {
        return this.A02;
    }

    public final C1L A0F() {
        return this.A03;
    }

    public final C1M A0G() {
        return this.A04;
    }

    public final void A0H(JSONObject jSONObject) {
        A05(this.A00.A0O());
    }

    public final void A0I(JSONObject jSONObject) {
        this.A00.A0M(jSONObject.optBoolean(A01(408, 22, j.AppCompatTheme_textColorAlertDialogListItem)));
        this.A00.A0L(jSONObject.optBoolean(A01(187, 20, j.AppCompatTheme_windowActionBar), true));
        A05(this.A00.A0O());
        A0L(jSONObject.optBoolean(A01(173, 14, 19)));
        A0A(jSONObject.optBoolean(A01(268, 13, 10)));
        A0B(jSONObject.optBoolean(A01(281, 20, 64)));
    }

    public final void A0J(JSONObject jSONObject) {
        this.A00.A0L(jSONObject.optBoolean(A01(187, 20, j.AppCompatTheme_windowActionBar), true));
        A05(this.A00.A0O());
    }

    public final void A0K(JSONObject jSONObject) {
        this.A00.A0G(jSONObject.optInt(A01(430, 18, 58)));
        this.A00.A0L(jSONObject.optBoolean(A01(187, 20, j.AppCompatTheme_windowActionBar), true));
        this.A00.A0N(jSONObject.optBoolean(A01(322, 20, 121), false));
        A05(this.A00.A0O());
        A0A(jSONObject.optBoolean(A01(268, 13, 10)));
    }

    public final void A0L(boolean z) {
        this.A05 = z;
    }

    public final boolean A0M() {
        return this.A05;
    }

    public final boolean A0N() {
        return this.A06;
    }

    public final boolean A0O() {
        return this.A07;
    }

    public final boolean A0P() {
        return this.A09;
    }
}
