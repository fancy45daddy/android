package com.facebook.ads.redexgen.X;

import android.os.Handler;
/* renamed from: com.facebook.ads.redexgen.X.Pl  reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public class C0630Pl extends AbstractRunnableC0487Ju {
    public final /* synthetic */ P1 A00;

    public C0630Pl(P1 p1) {
        this.A00 = p1;
    }

    @Override // com.facebook.ads.redexgen.X.AbstractRunnableC0487Ju
    public final void A06() {
        boolean z;
        C8N c8n;
        Handler handler;
        int i;
        z = this.A00.A03;
        if (!z) {
            c8n = this.A00.A0B;
            final int currentPositionInMillis = this.A00.getCurrentPositionInMillis();
            c8n.A02(new AbstractC0535Ls(currentPositionInMillis) { // from class: com.facebook.ads.redexgen.X.6r
            });
            handler = this.A00.A07;
            i = this.A00.A00;
            handler.postDelayed(this, i);
        }
    }
}
