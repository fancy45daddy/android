package com.facebook.ads.redexgen.X;

import android.text.TextUtils;
import android.view.View;
/* loaded from: assets/audience_network.dex */
public class LY implements View.OnClickListener {
    public final /* synthetic */ C1U A00;
    public final /* synthetic */ C0444Ib A01;
    public final /* synthetic */ LZ A02;
    public final /* synthetic */ InterfaceC0519Lc A03;
    public final /* synthetic */ String A04;

    public LY(LZ lz, C0444Ib c0444Ib, InterfaceC0519Lc interfaceC0519Lc, String str, C1U c1u) {
        this.A02 = lz;
        this.A01 = c0444Ib;
        this.A03 = interfaceC0519Lc;
        this.A04 = str;
        this.A00 = c1u;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        C2D c2d;
        C0806Wj c0806Wj;
        C0806Wj c0806Wj2;
        if (C0480Jm.A02(this)) {
            return;
        }
        try {
            this.A01.A02(EnumC0443Ia.A0A, null);
            c2d = this.A02.A02;
            c0806Wj = this.A02.A03;
            if (c2d.A0O(c0806Wj.A00(), true)) {
                this.A03.A8g(this.A04, this.A00);
            } else if (!TextUtils.isEmpty(this.A00.A00())) {
                KL kl = new KL();
                c0806Wj2 = this.A02.A03;
                KL.A0E(kl, c0806Wj2, KM.A00(this.A00.A00()), this.A04);
            }
        } catch (Throwable th) {
            C0480Jm.A00(th, this);
        }
    }
}
