package com.facebook.ads.redexgen.X;

import android.view.View;
/* loaded from: assets/audience_network.dex */
public class MN implements View.OnClickListener {
    public final /* synthetic */ C2H A00;
    public final /* synthetic */ MD A01;
    public final /* synthetic */ S2 A02;

    public MN(S2 s2, MD md, C2H c2h) {
        this.A02 = s2;
        this.A01 = md;
        this.A00 = c2h;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        if (C0480Jm.A02(this)) {
            return;
        }
        try {
            this.A01.A01();
            this.A02.A0B.ABZ(this.A00);
        } catch (Throwable th) {
            C0480Jm.A00(th, this);
        }
    }
}
