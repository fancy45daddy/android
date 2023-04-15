package com.facebook.ads.redexgen.X;

import android.view.View;
/* loaded from: assets/audience_network.dex */
public class MZ implements View.OnClickListener {
    public final /* synthetic */ C0546Me A00;

    public MZ(C0546Me c0546Me) {
        this.A00 = c0546Me;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        InterfaceC0545Md interfaceC0545Md;
        InterfaceC0545Md interfaceC0545Md2;
        if (C0480Jm.A02(this)) {
            return;
        }
        try {
            interfaceC0545Md = this.A00.A04;
            if (interfaceC0545Md == null) {
                return;
            }
            interfaceC0545Md2 = this.A00.A04;
            interfaceC0545Md2.AAE();
        } catch (Throwable th) {
            C0480Jm.A00(th, this);
        }
    }
}
