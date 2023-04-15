package com.facebook.ads.redexgen.X;

import android.os.Handler;
/* renamed from: com.facebook.ads.redexgen.X.6b  reason: invalid class name and case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public class C01606b extends AbstractC0470Jb {
    public final /* synthetic */ JG A00;

    public C01606b(JG jg) {
        this.A00 = jg;
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Override // com.facebook.ads.redexgen.X.C8O
    /* renamed from: A00 */
    public final void A03(C0472Jd c0472Jd) {
        P1 p1;
        Handler handler;
        p1 = this.A00.A01;
        if (p1 == null || c0472Jd.A00().getAction() != 0) {
            return;
        }
        handler = this.A00.A04;
        handler.removeCallbacksAndMessages(null);
        this.A00.A07(new P3(this));
    }
}
