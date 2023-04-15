package com.facebook.ads.redexgen.X;

import android.view.View;
/* renamed from: com.facebook.ads.redexgen.X.Xb  reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public class C0824Xb implements InterfaceC01224o {
    public final /* synthetic */ C4T A00;

    public C0824Xb(C4T c4t) {
        this.A00 = c4t;
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC01224o
    public final View A5x(int i) {
        return this.A00.A0t(i);
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC01224o
    public final int A5z(View view) {
        return this.A00.A0j(view) + ((C4U) view.getLayoutParams()).bottomMargin;
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC01224o
    public final int A60(View view) {
        return this.A00.A0o(view) - ((C4U) view.getLayoutParams()).topMargin;
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC01224o
    public final int A75() {
        return this.A00.A0X() - this.A00.A0d();
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC01224o
    public final int A76() {
        return this.A00.A0g();
    }
}
