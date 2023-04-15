package com.facebook.ads.redexgen.X;

import android.view.View;
/* loaded from: assets/audience_network.dex */
public class ND implements View.OnClickListener {
    public final /* synthetic */ NG A00;

    public ND(NG ng) {
        this.A00 = ng;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        NF nf;
        AbstractC0518Lb abstractC0518Lb;
        View[] viewArr;
        P1 p1;
        P1 p12;
        P1 p13;
        AbstractC0518Lb abstractC0518Lb2;
        if (C0480Jm.A02(this)) {
            return;
        }
        try {
            nf = this.A00.A04;
            nf.ABJ();
            abstractC0518Lb = this.A00.A00;
            if (abstractC0518Lb != null) {
                abstractC0518Lb2 = this.A00.A00;
                LE.A0L(abstractC0518Lb2);
            }
            viewArr = this.A00.A06;
            for (View view2 : viewArr) {
                LE.A0N(view2, 0);
            }
            LE.A0J(this.A00);
            p1 = this.A00.A05;
            if (p1 == null) {
                return;
            }
            p12 = this.A00.A05;
            LE.A0N(p12, 0);
            p13 = this.A00.A05;
            p13.A0b(EnumC0611Os.A02, 14);
        } catch (Throwable th) {
            C0480Jm.A00(th, this);
        }
    }
}
