package com.facebook.ads.redexgen.X;

import a.a.j;
import android.content.Intent;
import android.widget.RelativeLayout;
import java.util.Arrays;
/* renamed from: com.facebook.ads.redexgen.X.56 */
/* loaded from: assets/audience_network.dex */
public class AnonymousClass56 {
    public static byte[] A04;
    public static String[] A05 = {"3Lm1xoiqmVz", "7", "e", "S", "b9tO4", "WiIyJoqu6MmGONLqJ4ol82uO906afJVw", "5gKa3hz9VQf", "ZFmxpCIwvmg"};
    public final Intent A00;
    public final AnonymousClass59 A01;
    public final C0806Wj A02;
    public final IT A03;

    public static String A0O(int i, int i2, int i3) {
        byte[] copyOfRange = Arrays.copyOfRange(A04, i, i + i2);
        for (int i4 = 0; i4 < copyOfRange.length; i4++) {
            copyOfRange[i4] = (byte) ((copyOfRange[i4] ^ i3) ^ 79);
        }
        return new String(copyOfRange);
    }

    public static void A0P() {
        A04 = new byte[]{51, 54, 13, 54, 51, 38, 51, 13, 48, 39, 60, 54, 62, 55, 18, 29, 8, 21, 10, 25, 61, 24, 56, 29, 8, 29, 62, 9, 18, 24, 16, 25, 73, 94, 76, 90, 73, 95, 94, 95, 109, 82, 95, 94, 84, 122, 95, Byte.MAX_VALUE, 90, 79, 90, 121, 78, 85, 95, 87, 94, 69, 90, 87, 86, 92, 108, 71, 90, 94, 86, 108, 67, 92, 95, 95, 90, 93, 84, 108, 90, 93, 71, 86, 65, 69, 82, 95};
    }

    static {
        A0P();
    }

    public AnonymousClass56(AnonymousClass59 anonymousClass59, Intent intent, IT it, C0806Wj c0806Wj) {
        this.A01 = anonymousClass59;
        this.A00 = intent;
        this.A03 = it;
        this.A02 = c0806Wj;
    }

    private C0865Ys A00() {
        return (C0865Ys) this.A00.getSerializableExtra(A0O(0, 14, 29));
    }

    public InterfaceC0520Ld A02() {
        AnonymousClass59 anonymousClass59 = this.A01;
        return new SO(anonymousClass59, this.A02, this.A03, new XR(anonymousClass59));
    }

    public InterfaceC0520Ld A03() {
        return new C02178p(this.A02, this.A03, new XR(this.A01), A00(), new S6(), 1);
    }

    public InterfaceC0520Ld A04() {
        return new C02178p(this.A02, this.A03, new XR(this.A01), (C0861Yo) this.A00.getSerializableExtra(A0O(32, 25, j.AppCompatTheme_windowFixedWidthMajor)), new S5(), 0);
    }

    public InterfaceC0520Ld A05() {
        AnonymousClass18 dataBundle = (AnonymousClass18) this.A00.getSerializableExtra(A0O(14, 18, 51));
        if (dataBundle == null) {
            return null;
        }
        String A0Z = dataBundle.A0Z();
        String[] strArr = A05;
        if (strArr[2].length() != strArr[3].length()) {
            throw new RuntimeException();
        }
        String[] strArr2 = A05;
        strArr2[4] = "1M84Q";
        strArr2[6] = "leaDHdAWfWg";
        C0589Nw A02 = C0590Nx.A02(A0Z);
        if (A02 == null) {
            return null;
        }
        return new RM(this.A02, new XR(this.A01), A02);
    }

    public InterfaceC0520Ld A06() {
        if (ID.A23(this.A02)) {
            C0806Wj c0806Wj = this.A02;
            return new AnonymousClass79(c0806Wj, this.A03, new C6G(c0806Wj), new XR(this.A01), A00());
        }
        C0806Wj c0806Wj2 = this.A02;
        return new AnonymousClass77(c0806Wj2, this.A03, new C6G(c0806Wj2), new XR(this.A01), A00());
    }

    public InterfaceC0520Ld A07() {
        return new AnonymousClass80(this.A02, new S6(), this.A03, A00(), new C6G(this.A02), new XR(this.A01));
    }

    public InterfaceC0520Ld A08() {
        return new S9(this.A02, this.A03, new XR(this.A01), A00(), null, new S6());
    }

    public InterfaceC0520Ld A09() {
        return new C7C(this.A02, new S6(), this.A03, A00(), new C6G(this.A02), new XR(this.A01));
    }

    public InterfaceC0520Ld A0A() {
        return new C7C(this.A02, new S5(), this.A03, (C0861Yo) this.A00.getSerializableExtra(A0O(32, 25, j.AppCompatTheme_windowFixedWidthMajor)), new C6G(this.A02), new Du(this.A01));
    }

    public InterfaceC0520Ld A0B() {
        C0861Yo c0861Yo = (C0861Yo) this.A00.getSerializableExtra(A0O(32, 25, j.AppCompatTheme_windowFixedWidthMajor));
        return new S9(this.A02, this.A03, new Du(this.A01), c0861Yo, c0861Yo.A0a(), new S5());
    }

    public InterfaceC0520Ld A0C(RelativeLayout relativeLayout) {
        S7 s7 = new S7(this.A02, new XQ(this), this.A03, new XR(this.A01));
        s7.A05(relativeLayout);
        s7.A04(this.A00.getIntExtra(A0O(57, 27, 124), 200));
        LE.A0M(relativeLayout, -16777216);
        return s7;
    }
}
