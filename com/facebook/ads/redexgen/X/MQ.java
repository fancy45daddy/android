package com.facebook.ads.redexgen.X;

import android.view.View;
/* loaded from: assets/audience_network.dex */
public class MQ implements View.OnClickListener {
    public final /* synthetic */ C2H A00;
    public final /* synthetic */ MD A01;
    public final /* synthetic */ MR A02;

    public MQ(MR mr, MD md, C2H c2h) {
        this.A02 = mr;
        this.A01 = md;
        this.A00 = c2h;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        MB mb;
        if (C0480Jm.A02(this)) {
            return;
        }
        try {
            this.A01.A01();
            mb = this.A02.A02;
            mb.ABZ(this.A00);
        } catch (Throwable th) {
            C0480Jm.A00(th, this);
        }
    }
}
