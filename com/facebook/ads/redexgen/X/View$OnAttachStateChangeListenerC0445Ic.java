package com.facebook.ads.redexgen.X;

import android.view.View;
/* renamed from: com.facebook.ads.redexgen.X.Ic  reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public class View$OnAttachStateChangeListenerC0445Ic implements View.OnAttachStateChangeListener {
    public final /* synthetic */ EnumC0443Ia A00;
    public final /* synthetic */ C0444Ib A01;

    public View$OnAttachStateChangeListenerC0445Ic(C0444Ib c0444Ib, EnumC0443Ia enumC0443Ia) {
        this.A01 = c0444Ib;
        this.A00 = enumC0443Ia;
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(View view) {
        this.A01.A02(this.A00, null);
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(View view) {
    }
}
