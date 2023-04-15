package com.facebook.ads.redexgen.X;

import android.view.View;
/* loaded from: assets/audience_network.dex */
public class M5 implements View.OnClickListener {
    public final /* synthetic */ M8 A00;

    public M5(M8 m8) {
        this.A00 = m8;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        boolean z;
        MB mb;
        MB mb2;
        if (C0480Jm.A02(this)) {
            return;
        }
        try {
            z = this.A00.A05;
            if (z) {
                mb2 = this.A00.A04;
                mb2.A42();
                return;
            }
            mb = this.A00.A04;
            mb.A43();
        } catch (Throwable th) {
            C0480Jm.A00(th, this);
        }
    }
}
