package com.facebook.ads.redexgen.X;

import a.a.j;
import androidx.annotation.Nullable;
import java.util.Arrays;
import org.json.JSONException;
import org.json.JSONObject;
/* renamed from: com.facebook.ads.redexgen.X.5e  reason: invalid class name and case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public class C01385e {
    public static byte[] A05;
    public static String[] A06 = {"IwGe5", "A8hIbHDMwIY7UKVNAHeGtwBKmCoLBNcL", "H0VvdZkQPfl9GvywbKbTAVPvkC7BvFU0", "eeDLrDiwzyZn1GaqUg9DZO06uYqn8isf", "TZh0Sw2dsxVxMXdj340dFQnUzLECuqag", "hGyVADXG58acDgE3vIJwpiBKlvJlQGRP", "AZD8DY1XKqK1C1MVAOcMuffFLS19AWBn", "fc6abssWsZoyWpr8fCHyT3ixVlnX2HG2"};
    @Nullable
    public final String A00;
    @Nullable
    public final String A01;
    public final String A02;
    public final String A03;
    public final boolean A04;

    public static String A01(int i, int i2, int i3) {
        byte[] copyOfRange = Arrays.copyOfRange(A05, i, i + i2);
        int i4 = 0;
        while (true) {
            int length = copyOfRange.length;
            if (A06[0].length() == 12) {
                throw new RuntimeException();
            }
            String[] strArr = A06;
            strArr[1] = "eS8IZAPFQFjEXoH0I8GlghTr6fGbdCZa";
            strArr[4] = "ifP5S9CdlxshggXp37TrbEl199f16GUc";
            if (i4 >= length) {
                return new String(copyOfRange);
            }
            copyOfRange[i4] = (byte) ((copyOfRange[i4] - i3) - 36);
            i4++;
        }
    }

    public static void A02() {
        A05 = new byte[]{-32, -21, -24, -32, -14, -49, -30, -34, -49, -40, -35, -45, -39, -40, -4, -3, 1, -10, -4, -5, -18, -7, 2, 0, 3, -13, 1, 6, -3, -14, -22, -25, -31};
        if (A06[3].charAt(4) != 'r') {
            throw new RuntimeException();
        }
        A06[0] = "hOpRzb1kYAh4f";
    }

    static {
        A02();
    }

    public C01385e(String str, String str2, @Nullable String str3, boolean z, @Nullable String str4) {
        this.A03 = str;
        this.A02 = str2;
        this.A01 = str3;
        this.A04 = z;
        this.A00 = str4;
    }

    public static C01385e A00(JSONObject jSONObject) throws JSONException {
        return new C01385e(jSONObject.getString(A01(30, 3, 81)), jSONObject.getString(A01(26, 4, j.AppCompatTheme_textColorSearchUrl)), jSONObject.optString(A01(5, 9, 70)), jSONObject.getString(A01(14, 8, j.AppCompatTheme_textColorSearchUrl)).equals(A01(22, 4, j.AppCompatTheme_toolbarNavigationButtonStyle)), jSONObject.optString(A01(0, 5, 91)));
    }
}
