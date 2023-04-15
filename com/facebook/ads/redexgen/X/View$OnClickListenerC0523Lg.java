package com.facebook.ads.redexgen.X;

import android.view.View;
import com.facebook.ads.internal.view.FullScreenAdToolbar;
/* renamed from: com.facebook.ads.redexgen.X.Lg  reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public class View$OnClickListenerC0523Lg implements View.OnClickListener {
    public final /* synthetic */ FullScreenAdToolbar A00;

    public View$OnClickListenerC0523Lg(FullScreenAdToolbar fullScreenAdToolbar) {
        this.A00 = fullScreenAdToolbar;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        InterfaceC0517La interfaceC0517La;
        C0538Lw c0538Lw;
        InterfaceC0517La interfaceC0517La2;
        if (C0480Jm.A02(this)) {
            return;
        }
        try {
            interfaceC0517La = this.A00.A00;
            if (interfaceC0517La != null) {
                c0538Lw = this.A00.A05;
                if (c0538Lw.A03()) {
                    interfaceC0517La2 = this.A00.A00;
                    interfaceC0517La2.AAE();
                }
            }
        } catch (Throwable th) {
            C0480Jm.A00(th, this);
        }
    }
}
