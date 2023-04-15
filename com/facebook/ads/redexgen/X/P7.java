package com.facebook.ads.redexgen.X;

import android.view.View;
/* loaded from: assets/audience_network.dex */
public class P7 implements View.OnClickListener {
    public final /* synthetic */ JF A00;

    public P7(JF jf) {
        this.A00 = jf;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        C0444Ib c0444Ib;
        C0806Wj c0806Wj;
        P1 p1;
        boolean A07;
        P1 p12;
        P1 p13;
        if (C0480Jm.A02(this)) {
            return;
        }
        try {
            c0444Ib = this.A00.A03;
            c0444Ib.A02(EnumC0443Ia.A0d, null);
            c0806Wj = this.A00.A02;
            c0806Wj.A0D().A2z();
            p1 = this.A00.A00;
            if (p1 != null) {
                A07 = this.A00.A07();
                if (A07) {
                    p13 = this.A00.A00;
                    p13.setVolume(1.0f);
                } else {
                    p12 = this.A00.A00;
                    p12.setVolume(0.0f);
                }
                this.A00.A09();
            }
        } catch (Throwable th) {
            C0480Jm.A00(th, this);
        }
    }
}
