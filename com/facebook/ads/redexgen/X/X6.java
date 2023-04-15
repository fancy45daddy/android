package com.facebook.ads.redexgen.X;

import com.facebook.ads.NativeAd;
import java.util.List;
/* loaded from: assets/audience_network.dex */
public class X6 implements AnonymousClass68 {
    public final List<Z9> A00;
    public final /* synthetic */ X5 A01;

    public X6(X5 x5, List<Z9> list) {
        this.A01 = x5;
        this.A00 = list;
    }

    private void A00() {
        C5Q c5q;
        C5Q c5q2;
        C5Q c5q3;
        C0806Wj c0806Wj;
        C5Q c5q4;
        C5Q c5q5;
        C0806Wj c0806Wj2;
        c5q = this.A01.A00;
        c5q.A05(true);
        c5q2 = this.A01.A00;
        c5q2.A02();
        c5q3 = this.A01.A00;
        c5q3.A03(0);
        for (Z9 z9 : this.A00) {
            c0806Wj = this.A01.A01;
            InterfaceC0459Iq A0K = C0718Sw.A0K();
            c5q4 = this.A01.A00;
            C0718Sw c0718Sw = new C0718Sw(c0806Wj, z9, null, A0K, c5q4.A01());
            if (c0718Sw.A0y() != null && c0718Sw.A0y().A0F() != null) {
                ((YW) c0718Sw.A0y().A0F()).A00(c0718Sw);
            }
            c5q5 = this.A01.A00;
            c0806Wj2 = this.A01.A01;
            c5q5.A04(new NativeAd(c0806Wj2, c0718Sw));
        }
        C0479Jl.A00(new X7(this));
    }

    @Override // com.facebook.ads.redexgen.X.AnonymousClass68
    public final void AAB() {
        A00();
    }

    @Override // com.facebook.ads.redexgen.X.AnonymousClass68
    public final void AAI() {
        A00();
    }
}
