package com.facebook.ads.redexgen.X;

import android.view.View;
/* loaded from: assets/audience_network.dex */
public class M6 implements View.OnClickListener {
    public final /* synthetic */ M8 A00;

    public M6(M8 m8) {
        this.A00 = m8;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        MB mb;
        if (C0480Jm.A02(this)) {
            return;
        }
        try {
            mb = this.A00.A04;
            mb.A8h();
        } catch (Throwable th) {
            C0480Jm.A00(th, this);
        }
    }
}
