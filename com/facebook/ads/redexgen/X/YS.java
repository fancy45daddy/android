package com.facebook.ads.redexgen.X;

import a.a.j;
import android.util.Log;
import com.facebook.ads.AdError;
import com.facebook.ads.AdSettings;
import com.facebook.ads.internal.protocol.AdErrorType;
import java.util.Arrays;
import java.util.Locale;
/* loaded from: assets/audience_network.dex */
public final class YS implements InterfaceC00541v {
    public static byte[] A04;
    public static String[] A05 = {"iEaWyjzULIZCFnp1nESlU5XZjwcvRjHd", "KbGYZiX8Pduw0KfpYwrRe1NWFWC1OMxy", "fhu9engps4P6WEn4zln6smGq5lQXex4h", "tbT6PfDqIL055", "rKa5gX4b0", "TAsNWcfBygYGmj6nueBPL3we7Mc4FYi0", "mn5595Nd0", "gAb4cPpeQcskkpTdmUE6rt9G8rZq3FNo"};
    public EnumC00531u A00 = EnumC00531u.A03;
    public EnumC00531u A01 = EnumC00531u.A03;
    public final YP A02;
    public final C0806Wj A03;

    public static String A00(int i, int i2, int i3) {
        byte[] copyOfRange = Arrays.copyOfRange(A04, i, i + i2);
        int i4 = 0;
        while (true) {
            int length = copyOfRange.length;
            String[] strArr = A05;
            if (strArr[7].charAt(1) != strArr[5].charAt(1)) {
                throw new RuntimeException();
            }
            A05[0] = "d2XCtNqKB2PlkmIVLWNasBjUSsZJOiBr";
            if (i4 >= length) {
                return new String(copyOfRange);
            }
            copyOfRange[i4] = (byte) ((copyOfRange[i4] - i3) - 29);
            i4++;
        }
    }

    public static void A01() {
        A04 = new byte[]{-73, 11, 6, -73, 118, 104, -95, -73, -67, 104, -85, -87, -74, 104, -85, -80, -87, -74, -81, -83, 104, -111, -74, -68, -83, -81, -70, -87, -68, -79, -73, -74, 104, -115, -70, -70, -73, -70, 104, -75, -73, -84, -83, 104, -86, -63, 104, -69, -83, -68, -68, -79, -74, -81, 104, -119, -84, -101, -83, -68, -68, -79, -74, -81, -69, 118, -69, -83, -68, -111, -74, -68, -83, -81, -70, -87, -68, -79, -73, -74, -115, -70, -70, -73, -70, -107, -73, -84, -83, 112, 113, 112, 108, 107, -97, -114, -109, -113, -104, -115, -113, 120, -113, -98, -95, -103, -100, -107, -103, -59, -62, -64, 115, -41, -14, -17, -18, -25, -96, -23, -18, -12, -27, -14, -18, -31, -20, -96, -12, -14, -31, -18, -13, -23, -12, -23, -17, -18, -82, -15, 0, -7, -67, -64, -78, -75, 121, 122, -63, -74, -67, -59, 118, 119, 15, 3, -4, 15, -69, 4, 14, -69, -4, 7, 13, 0, -4, -1, 20, -69, -25, -22, -36, -33, -28, -23, -30, -57, -69, -25, -22, -36, -33, -32, -33, -69, 10, 13, -69, -18, -29, -22, -14, -28, -23, -30, -45, -57, -64, -45, Byte.MAX_VALUE, -56, -46, Byte.MAX_VALUE, -64, -53, -47, -60, -64, -61, -40, Byte.MAX_VALUE, -78, -89, -82, -74, -88, -83, -90, -14, -26, -33, -14, -98, -25, -15, -98, -20, -19, -14, -98, -54, -51, -65, -62, -61, -62};
    }

    static {
        A01();
    }

    public YS(C0806Wj c0806Wj, YP yp) {
        this.A03 = c0806Wj;
        this.A02 = yp;
    }

    private void A02(EnumC00531u enumC00531u, EnumC00531u enumC00531u2) {
        String A00 = A00(j.AppCompatTheme_windowActionModeOverlay, 26, 99);
        StringBuilder sb = new StringBuilder();
        String errorTitle = A00(j.AppCompatTheme_tooltipForegroundColor, 5, 54);
        sb.append(errorTitle);
        sb.append(enumC00531u);
        String errorTitle2 = A00(0, 4, 122);
        sb.append(errorTitle2);
        sb.append(enumC00531u2);
        String sb2 = sb.toString();
        InterfaceC01867k A06 = this.A03.A06();
        int i = C01877l.A0e;
        C01887m c01887m = new C01887m(A00, sb2);
        String errorTitle3 = A00(139, 3, j.AppCompatTheme_windowFixedHeightMinor);
        A06.A8u(errorTitle3, i, c01887m);
        String errorTitle4 = A00 + ' ' + sb2;
        this.A03.A0D().AFa(errorTitle4);
    }

    private void A03(String str, String str2, boolean z) {
        AdSettings.IntegrationErrorMode A00 = C00501r.A00(this.A03);
        String format = String.format(Locale.US, AdErrorType.INCORRECT_API_CALL_ERROR.getDefaultErrorMessage(), str, str2);
        String A002 = A00(139, 3, j.AppCompatTheme_windowFixedHeightMinor);
        String A003 = A00(91, 17, 13);
        if (!z) {
            Log.e(A003, format);
            this.A03.A06().A8u(A002, C01877l.A0c, new C01887m(format));
            this.A03.A0D().AFZ(format);
            return;
        }
        int i = C00521t.A00[A00.ordinal()];
        if (i != 1) {
            if (i == 2) {
                this.A02.A05();
                this.A02.A06(10, AdErrorType.INCORRECT_STATE_ERROR, format);
                this.A03.A0D().AFZ(format);
                Log.e(A003, format);
                this.A03.A06().A8u(A002, C01877l.A0c, new C01887m(format));
            }
            Log.e(A003, format);
            return;
        }
        String errorMessage = format + A00(4, 87, 43);
        throw new C00551w(errorMessage);
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC00541v
    public final boolean A5I() {
        boolean z = (this.A00 == EnumC00531u.A03 || this.A00 == EnumC00531u.A05) && this.A01 != EnumC00531u.A08;
        if (z) {
            this.A00 = EnumC00531u.A07;
        } else {
            A03(A00(142, 6, 52), A00(154, 42, 126), false);
        }
        return !z;
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC00541v
    public final boolean A5J() {
        boolean z = this.A00 == EnumC00531u.A06 && (this.A01 != EnumC00531u.A08 || ID.A0g(this.A03));
        if (z) {
            this.A00 = EnumC00531u.A03;
            this.A01 = EnumC00531u.A08;
        } else {
            EnumC00531u enumC00531u = this.A00;
            EnumC00531u enumC00531u2 = EnumC00531u.A06;
            String A00 = A00(148, 6, 49);
            if (enumC00531u != enumC00531u2) {
                A03(A00, A00(219, 18, 97), true);
            } else {
                A03(A00, A00(196, 23, 66), false);
            }
        }
        return !z;
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC00541v
    public final EnumC00531u A5b() {
        return this.A00;
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC00541v
    public final void AEN(EnumC00531u enumC00531u) {
        this.A00 = enumC00531u;
        this.A01 = enumC00531u;
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC00541v
    public final void AEQ(AdError adError) {
        this.A00 = EnumC00531u.A05;
        this.A01 = EnumC00531u.A05;
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC00541v
    public final void AEU() {
        if (this.A00 != EnumC00531u.A07) {
            A02(this.A00, EnumC00531u.A06);
        }
        this.A00 = EnumC00531u.A06;
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC00541v
    public final void AEa() {
        if (this.A01 != EnumC00531u.A08) {
            A02(this.A00, EnumC00531u.A09);
        }
        this.A01 = EnumC00531u.A09;
    }
}
