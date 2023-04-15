package com.facebook.ads.redexgen.X;

import a.a.j;
import com.facebook.ads.internal.api.BuildConfigApi;
import java.util.Arrays;
import java.util.Locale;
/* renamed from: com.facebook.ads.redexgen.X.Ww  reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public final class C0819Ww implements InterfaceC01415h {
    public static byte[] A02;
    public static final String A03;
    public final InterfaceC01445k A00;
    public final C6G A01;

    public static String A00(int i, int i2, int i3) {
        byte[] copyOfRange = Arrays.copyOfRange(A02, i, i + i2);
        for (int i4 = 0; i4 < copyOfRange.length; i4++) {
            copyOfRange[i4] = (byte) ((copyOfRange[i4] - i3) - 112);
        }
        return new String(copyOfRange);
    }

    public static void A02() {
        A02 = new byte[]{50, 84, 71, 78, 81, 67, 70, 75, 80, 73, 2, 7, 70, 2, 67, 85, 85, 71, 86, 85, 58, 92, 79, 86, 89, 75, 78, 83, 88, 81, 10, 83, 87, 75, 81, 79, 36, 10, 15, 93, 35, 69, 56, 63, 66, 52, 55, 60, 65, 58, -13, 64, 52, 69, 62, 72, 67, 13, -13, -8, 70, 25, 59, 46, 53, 56, 42, 45, 50, 55, 48, -23, 63, 50, 45, 46, 56, 3, -23, -18, 60, -33, -82, -31, -31, -79, -78, -81, -81, -88, -35, -77, -82, -83, -88, -84, -84, -32, -76, -88, -36, -83, -36, -82, -88, -83, -36, -83, -36, -32, -83, -33, -35, -34, -34, -32, -81, 58, 60, 47, 48, 47, 62, 45, 50, 19, 12, 9, 12, 13, 21, 12};
    }

    static {
        A02();
        A03 = C0819Ww.class.getSimpleName();
    }

    public C0819Ww(InterfaceC01445k interfaceC01445k, C0805Wi c0805Wi) {
        this.A00 = interfaceC01445k;
        this.A00.A3D(new C0821Wy(this));
        this.A01 = new C6G(c0805Wi);
        A01();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void A01() {
        if (BuildConfigApi.isDebug()) {
            String.format(Locale.US, A00(0, 20, j.AppCompatTheme_windowFixedHeightMajor), Integer.valueOf(this.A00.A5h().size()));
        }
        for (InterfaceC01475n asset : this.A00.A5h()) {
            int i = C01435j.A00[asset.A7h().ordinal()];
            if (i == 1) {
                A04(asset.getUrl());
            } else if (i == 2) {
                A06(asset.getUrl());
            } else if (i == 3) {
                A05(asset.getUrl());
            }
        }
        this.A01.A0W(new C0820Wx(this), new AnonymousClass69(A00(81, 36, 11), A00(125, 7, 46)));
    }

    private void A04(String str) {
        if (BuildConfigApi.isDebug()) {
            String.format(Locale.US, A00(20, 20, 122), str);
        }
        C6E c6e = new C6E(str, -1, -1, A00(81, 36, 11), A00(125, 7, 46));
        c6e.A01 = A00(j.AppCompatTheme_windowFixedWidthMinor, 8, 90);
        this.A01.A0b(c6e);
    }

    private void A05(String str) {
        if (BuildConfigApi.isDebug()) {
            String.format(Locale.US, A00(40, 21, 99), str);
        }
        C6C c6c = new C6C(str, A00(81, 36, 11), A00(125, 7, 46));
        c6c.A04 = true;
        c6c.A02 = A00(j.AppCompatTheme_windowFixedWidthMinor, 8, 90);
        this.A01.A0X(c6c);
    }

    private void A06(String str) {
        if (BuildConfigApi.isDebug()) {
            String.format(Locale.US, A00(61, 20, 89), str);
        }
        C6C c6c = new C6C(str, A00(81, 36, 11), A00(125, 7, 46));
        c6c.A04 = false;
        c6c.A02 = A00(j.AppCompatTheme_windowFixedWidthMinor, 8, 90);
        this.A01.A0a(c6c);
    }
}
