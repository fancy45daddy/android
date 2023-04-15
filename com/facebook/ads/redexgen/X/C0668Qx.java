package com.facebook.ads.redexgen.X;

import android.view.View;
/* renamed from: com.facebook.ads.redexgen.X.Qx  reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public class C0668Qx implements InterfaceC0574Ng {
    public final /* synthetic */ C0666Qv A00;

    public C0668Qx(C0666Qv c0666Qv) {
        this.A00 = c0666Qv;
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC0574Ng
    public final void ACg(View view) {
        if (this.A00.A09) {
            this.A00.A07 = false;
        }
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC0574Ng
    public final void ACi(View view) {
        RW rw = (RW) view;
        rw.A0g();
        if (this.A00.A09) {
            this.A00.A07 = true;
        }
        if (this.A00.A04.A0Z() && ((Integer) rw.getTag(-1593835536)).intValue() == 0) {
            this.A00.A04.A0U();
        }
    }
}
