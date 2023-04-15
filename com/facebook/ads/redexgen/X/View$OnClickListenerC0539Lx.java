package com.facebook.ads.redexgen.X;

import android.view.View;
/* renamed from: com.facebook.ads.redexgen.X.Lx  reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public class View$OnClickListenerC0539Lx implements View.OnClickListener {
    public final /* synthetic */ S7 A00;

    public View$OnClickListenerC0539Lx(S7 s7) {
        this.A00 = s7;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        InterfaceC0541Lz interfaceC0541Lz;
        if (C0480Jm.A02(this)) {
            return;
        }
        try {
            interfaceC0541Lz = this.A00.A06;
            interfaceC0541Lz.AAi();
        } catch (Throwable th) {
            C0480Jm.A00(th, this);
        }
    }
}
