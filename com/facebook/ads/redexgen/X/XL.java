package com.facebook.ads.redexgen.X;

import a.a.j;
import android.os.Build;
import android.view.View;
import androidx.annotation.Nullable;
import java.util.Arrays;
/* loaded from: assets/audience_network.dex */
public final class XL extends AbstractC00210o {
    public static byte[] A03;
    @Nullable
    public View A00;
    public final AnonymousClass54 A01;
    public final DY A02;

    static {
        A03();
    }

    public static String A02(int i, int i2, int i3) {
        byte[] copyOfRange = Arrays.copyOfRange(A03, i, i + i2);
        for (int i4 = 0; i4 < copyOfRange.length; i4++) {
            copyOfRange[i4] = (byte) ((copyOfRange[i4] - i3) - 53);
        }
        return new String(copyOfRange);
    }

    public static void A03() {
        A03 = new byte[]{-23, 7, 20, 20, 21, 26, -58, 22, 24, 11, 25, 11, 20, 26, -58, 20, 27, 18, 18, -58, 7, 10, -4, 15, 11, 29};
    }

    public XL(AnonymousClass54 anonymousClass54) {
        this.A02 = anonymousClass54.A09();
        this.A01 = anonymousClass54;
    }

    @Override // com.facebook.ads.redexgen.X.AbstractC00210o
    public final void A0C() {
        this.A02.A0D().A3d();
        C0479Jl.A00(new XN(this));
    }

    @Override // com.facebook.ads.redexgen.X.AbstractC00210o
    public final void A0D() {
        this.A02.A0D().A3g();
        C0479Jl.A00(new XM(this));
    }

    @Override // com.facebook.ads.redexgen.X.AbstractC00210o
    public final void A0E(View view) {
        if (view != null) {
            this.A02.A0D().A3f();
            this.A00 = view;
            this.A01.A07().removeAllViews();
            this.A01.A07().addView(this.A00);
            if (this.A00 instanceof C0687Rq) {
                JA.A01(this.A01.A05(), this.A00, this.A01.A0A());
            }
            ED controller = this.A01.A08();
            if (controller != null) {
                controller.A0F();
            }
            C0479Jl.A00(new XO(this));
            AnonymousClass54 anonymousClass54 = this.A01;
            anonymousClass54.A0B(anonymousClass54.A07(), this.A00);
            if (Build.VERSION.SDK_INT >= 18 && ID.A0y(this.A01.A07().getContext())) {
                final N0 n0 = new N0();
                this.A01.A0D(n0);
                n0.A0C(this.A01.getPlacementId());
                n0.A0B(this.A01.A07().getContext().getPackageName());
                if (this.A01.A08() != null && this.A01.A08().A0D() != null) {
                    n0.A09(this.A01.A08().A0D().A0C());
                }
                View view2 = this.A00;
                if (view2 instanceof C0687Rq) {
                    n0.A0A(((C0687Rq) view2).getViewabilityChecker());
                }
                this.A00.setOnLongClickListener(new View.OnLongClickListener() { // from class: com.facebook.ads.redexgen.X.5D
                    @Override // android.view.View.OnLongClickListener
                    public final boolean onLongClick(View view3) {
                        View view4;
                        View view5;
                        View view6;
                        view4 = XL.this.A00;
                        if (view4 != null) {
                            N0 n02 = n0;
                            view5 = XL.this.A00;
                            int width = view5.getWidth();
                            view6 = XL.this.A00;
                            n02.setBounds(0, 0, width, view6.getHeight());
                            N0 n03 = n0;
                            n03.A0D(!n03.A0E());
                        }
                        return true;
                    }
                });
                this.A00.getOverlay().add(n0);
                return;
            }
            return;
        }
        throw new IllegalStateException(A02(0, 26, j.AppCompatTheme_windowActionModeOverlay));
    }

    @Override // com.facebook.ads.redexgen.X.AbstractC00210o
    public final void A0F(InterfaceC00200n interfaceC00200n) {
        this.A02.A0D().A3e(this.A01.A08() != null);
        if (this.A01.A08() != null) {
            this.A01.A08().A0G();
        }
    }

    @Override // com.facebook.ads.redexgen.X.AbstractC00210o
    public final void A0G(J3 j3) {
        this.A02.A0D().A2a(L5.A01(this.A01.A04()), j3.A03().getErrorCode(), j3.A04());
        C0479Jl.A00(new XP(this, j3));
    }
}
