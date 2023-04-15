package com.facebook.ads.redexgen.X;

import a.a.j;
import android.view.View;
import android.view.ViewGroup;
import java.util.Arrays;
/* renamed from: com.facebook.ads.redexgen.X.Xf  reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public class C0828Xf implements InterfaceC00993q {
    public static byte[] A01;
    public static String[] A02 = {"m0v39bkLL0n2S0xNgN89hz2dGOcTpwho", "Je1TSnUfgjz87J45b10M9zAxXIUpZahJ", "5NPz60Ycb2xlrnlJbjQuqitLPDDjbzHA", "GN4TkK3T6zCNiBjoupvxTPY", "uEyRXI1LEgEguUOEBvXDLSZ", "uM6injuc1j2LJ4wHPsuMaMxVec9yzmkB", "WB5Y9xOLXhFok7BjZ8qu5ygjzkxXvdjS", "QTx8NC78KyDJtqbkFzNokRxLjqTFyIiz"};
    public final /* synthetic */ C0339Dw A00;

    public static String A00(int i, int i2, int i3) {
        byte[] copyOfRange = Arrays.copyOfRange(A01, i, i + i2);
        for (int i4 = 0; i4 < copyOfRange.length; i4++) {
            copyOfRange[i4] = (byte) ((copyOfRange[i4] - i3) - 37);
        }
        return new String(copyOfRange);
    }

    public static void A01() {
        A01 = new byte[]{-39, -9, 2, 2, -5, -6, -74, -9, 10, 10, -9, -7, -2, -74, 5, 4, -74, -9, -74, -7, -2, -1, 2, -6, -74, 13, -2, -1, -7, -2, -74, -1, 9, -74, 4, 5, 10, -74, -6, -5, 10, -9, -7, -2, -5, -6, -48, -74, -75, -77, -66, -66, -73, -74, 114, -74, -73, -58, -77, -75, -70, 114, -63, -64, 114, -77, -64, 114, -77, -66, -60, -73, -77, -74, -53, 114, -74, -73, -58, -77, -75, -70, -73, -74, 114, -75, -70, -69, -66, -74, 114};
    }

    static {
        A01();
    }

    public C0828Xf(C0339Dw c0339Dw) {
        this.A00 = c0339Dw;
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC00993q
    public final void A3T(View view, int i, ViewGroup.LayoutParams layoutParams) {
        AbstractC01194l A0G = C0339Dw.A0G(view);
        if (A0G != null) {
            if (A0G.A0e() || A0G.A0h()) {
                A0G.A0P();
            } else {
                throw new IllegalArgumentException(A00(0, 48, j.AppCompatTheme_windowActionModeOverlay) + A0G + this.A00.A1I());
            }
        }
        this.A00.attachViewToParent(view, i, layoutParams);
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC00993q
    public final void A4m(int i) {
        AbstractC01194l A0G;
        View view = A5x(i);
        if (view != null && (A0G = C0339Dw.A0G(view)) != null) {
            if (!A0G.A0e() || A0G.A0h()) {
                A0G.A0T(256);
            } else {
                throw new IllegalArgumentException(A00(48, 43, 45) + A0G + this.A00.A1I());
            }
        }
        this.A00.detachViewFromParent(i);
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC00993q
    public final View A5x(int i) {
        return this.A00.getChildAt(i);
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC00993q
    public final int A5y() {
        return this.A00.getChildCount();
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC00993q
    public final AbstractC01194l A61(View view) {
        return C0339Dw.A0G(view);
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC00993q
    public final int A8F(View view) {
        return this.A00.indexOfChild(view);
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC00993q
    public final void AAb(View view) {
        AbstractC01194l A0G = C0339Dw.A0G(view);
        if (A0G != null) {
            A0G.A07(this.A00);
        }
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC00993q
    public final void AB7(View view) {
        AbstractC01194l A0G = C0339Dw.A0G(view);
        if (A0G != null) {
            A0G.A08(this.A00);
        }
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC00993q
    public final void ADn() {
        int A5y = A5y();
        for (int i = 0; i < A5y; i++) {
            View A5x = A5x(i);
            this.A00.A1i(A5x);
            A5x.clearAnimation();
        }
        this.A00.removeAllViews();
        String[] strArr = A02;
        String str = strArr[3];
        String str2 = strArr[4];
        int length = str.length();
        int count = str2.length();
        if (length != count) {
            throw new RuntimeException();
        }
        A02[2] = "YVtNrV2twtC96zFGqk3M5li58NeZhLji";
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC00993q
    public final void ADr(int i) {
        View childAt = this.A00.getChildAt(i);
        if (childAt != null) {
            this.A00.A1i(childAt);
            childAt.clearAnimation();
        }
        C0339Dw c0339Dw = this.A00;
        if (A02[2].charAt(25) == 'R') {
            throw new RuntimeException();
        }
        A02[2] = "BurwQQkBxJzMJJK1acCycPqXpvrCcXzS";
        c0339Dw.removeViewAt(i);
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC00993q
    public final void addView(View view, int i) {
        this.A00.addView(view, i);
        this.A00.A1h(view);
    }
}
