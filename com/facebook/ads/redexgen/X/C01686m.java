package com.facebook.ads.redexgen.X;

import android.os.Handler;
/* renamed from: com.facebook.ads.redexgen.X.6m  reason: invalid class name and case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public class C01686m extends AbstractC0470Jb {
    public final /* synthetic */ JK A00;

    public C01686m(JK jk) {
        this.A00 = jk;
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Override // com.facebook.ads.redexgen.X.C8O
    /* renamed from: A00 */
    public final void A03(C0472Jd c0472Jd) {
        P1 p1;
        boolean z;
        Handler handler;
        boolean A0D;
        boolean z2;
        Handler handler2;
        int i;
        p1 = this.A00.A01;
        if (p1 == null) {
            return;
        }
        z = this.A00.A03;
        if (z || c0472Jd.A00().getAction() != 0) {
            return;
        }
        handler = this.A00.A05;
        handler.removeCallbacksAndMessages(null);
        A0D = this.A00.A0D(PE.A05);
        if (A0D) {
            this.A00.A03();
            this.A00.A06(true, false);
        }
        z2 = this.A00.A02;
        if (!z2) {
            return;
        }
        handler2 = this.A00.A05;
        JL jl = new JL(this);
        i = this.A00.A00;
        handler2.postDelayed(jl, i);
    }
}
