package com.facebook.ads.redexgen.X;

import a.a.j;
import androidx.annotation.Nullable;
import java.util.Arrays;
/* renamed from: com.facebook.ads.redexgen.X.6C  reason: invalid class name */
/* loaded from: assets/audience_network.dex */
public class C6C {
    public static byte[] A09;
    public long A00;
    @Nullable
    public Integer A01;
    public String A02;
    public String A03;
    public boolean A04;
    public boolean A05;
    public final String A06;
    public final String A07;
    public final String A08;

    static {
        A01();
    }

    public static String A00(int i, int i2, int i3) {
        byte[] copyOfRange = Arrays.copyOfRange(A09, i, i + i2);
        for (int i4 = 0; i4 < copyOfRange.length; i4++) {
            copyOfRange[i4] = (byte) ((copyOfRange[i4] - i3) - 16);
        }
        return new String(copyOfRange);
    }

    public static void A01() {
        A09 = new byte[]{-77, -74, -88, -85};
    }

    public C6C(String str, String str2, String str3) {
        this.A03 = A00(0, 0, j.AppCompatTheme_textAppearanceSearchResultTitle);
        this.A02 = A00(0, 4, 55);
        this.A00 = -1L;
        this.A08 = str;
        this.A07 = str2;
        this.A06 = str3;
        this.A01 = null;
    }

    public C6C(String str, String str2, String str3, long j) {
        this.A03 = A00(0, 0, j.AppCompatTheme_textAppearanceSearchResultTitle);
        this.A02 = A00(0, 4, 55);
        this.A00 = -1L;
        this.A08 = str;
        this.A07 = str2;
        this.A06 = str3;
        this.A01 = null;
        this.A00 = j;
    }
}
