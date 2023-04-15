package com.facebook.ads.redexgen.X;

import android.view.View;
/* loaded from: assets/audience_network.dex */
public class MP implements View.OnClickListener {
    public final /* synthetic */ MR A00;

    public MP(MR mr) {
        this.A00 = mr;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        MB mb;
        if (C0480Jm.A02(this)) {
            return;
        }
        try {
            mb = this.A00.A02;
            mb.A7r();
        } catch (Throwable th) {
            C0480Jm.A00(th, this);
        }
    }
}
