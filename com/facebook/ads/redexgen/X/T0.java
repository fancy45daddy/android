package com.facebook.ads.redexgen.X;

import android.graphics.drawable.Drawable;
import android.view.View;
import android.widget.ImageView;
import com.facebook.ads.NativeAdLayout;
import com.facebook.ads.internal.api.AdNativeComponentView;
import java.lang.ref.WeakReference;
/* loaded from: assets/audience_network.dex */
public class T0 extends AbstractC0626Ph {
    public static String[] A04 = {"oSoBkaWeyKsp", "KBeBF", "kSDces9j50gwfjS4QfNYnWgLw2iPkymV", "EJmszBWYtRUz1Vdq", "qn5qycmxyPd80aqzWiKeSrAoNfum3VnE", "21Cce2q6wYIDkABj", "e4Lw2G3U", "jRNkDTlKn5mABl6KQSYrYYCrXHx6B19g"};
    public final /* synthetic */ View A00;
    public final /* synthetic */ Z9 A01;
    public final /* synthetic */ C0718Sw A02;
    public final /* synthetic */ boolean A03;

    public T0(C0718Sw c0718Sw, View view, boolean z, Z9 z9) {
        this.A02 = c0718Sw;
        this.A00 = view;
        this.A03 = z;
        this.A01 = z9;
    }

    @Override // com.facebook.ads.redexgen.X.AbstractC0626Ph
    public final void A00() {
        J1 j1;
        j1 = this.A02.A0e;
        j1.A06();
    }

    @Override // com.facebook.ads.redexgen.X.AbstractC0626Ph
    public final void A01() {
        J1 j1;
        j1 = this.A02.A0e;
        j1.A0A();
    }

    @Override // com.facebook.ads.redexgen.X.AbstractC0626Ph
    public final void A02() {
        J1 j1;
        J1 j12;
        C0806Wj c0806Wj;
        C0627Pi c0627Pi;
        WeakReference weakReference;
        L6 l6;
        J1 j13;
        Z0 z0;
        View view;
        View view2;
        Z0 z02;
        View view3;
        Z0 z03;
        View view4;
        Z0 z04;
        EnumC0463Iu enumC0463Iu;
        Z0 z05;
        boolean z;
        Z0 z06;
        boolean z2;
        Z0 z07;
        boolean z3;
        Z0 z08;
        boolean A0p;
        Z0 z09;
        EnumC00320z enumC00320z;
        Z0 z010;
        boolean z4;
        Z0 z011;
        NativeAdLayout nativeAdLayout;
        Z0 z012;
        String str;
        Z0 z013;
        Z0 z014;
        WeakReference weakReference2;
        WeakReference weakReference3;
        C0627Pi c0627Pi2;
        Drawable drawable;
        C0627Pi c0627Pi3;
        J1 j14;
        C0627Pi c0627Pi4;
        J1 j15;
        j1 = this.A02.A0e;
        j1.A0B();
        if (ID.A1X(this.A02.A11())) {
            AdNativeComponentView adNativeComponentView = this.A00;
            if (adNativeComponentView instanceof AdNativeComponentView) {
                View adContentsView = adNativeComponentView.getAdContentsView();
                if ((adContentsView instanceof C0608Op) && !((C0608Op) adContentsView).A02()) {
                    c0627Pi4 = this.A02.A0R;
                    c0627Pi4.A0T();
                    j15 = this.A02.A0e;
                    j15.A08();
                    return;
                }
            }
        }
        if (this.A03) {
            ImageView imageView = (ImageView) this.A00;
            if (A04[6].length() != 8) {
                throw new RuntimeException();
            }
            A04[4] = "kV1RqodiW8kqR1rQOQ4NCiAB35VpASKe";
            drawable = this.A02.A01;
            if (drawable == null) {
                c0627Pi3 = this.A02.A0R;
                c0627Pi3.A0T();
                j14 = this.A02.A0e;
                j14.A07();
                return;
            }
            C0718Sw.A0e(drawable, imageView);
        }
        j12 = this.A02.A0e;
        c0806Wj = this.A02.A0c;
        j12.A0C(c0806Wj, this.A01.A0G());
        c0627Pi = this.A02.A0R;
        if (c0627Pi != null) {
            c0627Pi2 = this.A02.A0R;
            c0627Pi2.A0V();
        }
        weakReference = this.A02.A0V;
        if (weakReference != null) {
            weakReference2 = this.A02.A0V;
            if (weakReference2.get() != null) {
                weakReference3 = this.A02.A0V;
                ((AbstractC0626Ph) weakReference3.get()).A02();
            }
        }
        l6 = this.A02.A0f;
        if (l6.A07()) {
            j13 = this.A02.A0e;
            j13.A04();
            return;
        }
        this.A02.A0b();
        z0 = this.A02.A09;
        if (z0 != null) {
            view = this.A02.A04;
            if (view != null) {
                view2 = this.A02.A06;
                if (view2 != null) {
                    z02 = this.A02.A09;
                    view3 = this.A02.A04;
                    z02.A08(view3);
                    z03 = this.A02.A09;
                    view4 = this.A02.A06;
                    z03.A07(view4);
                    z04 = this.A02.A09;
                    enumC0463Iu = this.A02.A0I;
                    z04.A0B(enumC0463Iu);
                    z05 = this.A02.A09;
                    z = this.A02.A0W;
                    z05.A0E(z);
                    z06 = this.A02.A09;
                    z2 = this.A02.A0Z;
                    z06.A0I(z2);
                    z07 = this.A02.A09;
                    z3 = this.A02.A0Y;
                    z07.A0H(z3);
                    z08 = this.A02.A09;
                    A0p = this.A02.A0p();
                    z08.A0F(A0p);
                    z09 = this.A02.A09;
                    enumC00320z = this.A02.A08;
                    z09.A09(enumC00320z);
                    z010 = this.A02.A09;
                    z4 = this.A02.A0X;
                    z010.A0G(z4);
                    z011 = this.A02.A09;
                    nativeAdLayout = this.A02.A07;
                    z011.A0A(MA.A00(nativeAdLayout));
                    z012 = this.A02.A09;
                    str = this.A02.A0S;
                    z012.A0C(str);
                    z013 = this.A02.A09;
                    z013.A0J(this.A03);
                    z014 = this.A02.A09;
                    z014.A02();
                }
            }
        }
    }
}
