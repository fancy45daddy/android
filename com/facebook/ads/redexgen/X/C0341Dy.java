package com.facebook.ads.redexgen.X;

import android.content.Context;
import android.util.DisplayMetrics;
import android.view.View;
/* renamed from: com.facebook.ads.redexgen.X.Dy  reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public class C0341Dy extends C0832Xj {
    public final /* synthetic */ C0340Dx A00;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0341Dy(C0340Dx c0340Dx, Context context) {
        super(context);
        this.A00 = c0340Dx;
    }

    @Override // com.facebook.ads.redexgen.X.C0832Xj, com.facebook.ads.redexgen.X.AbstractC01144g
    public final void A0I(View view, C01164i c01164i, C01124e c01124e) {
        C0340Dx c0340Dx = this.A00;
        int[] A0H = c0340Dx.A0H(((XU) c0340Dx).A00.getLayoutManager(), view);
        int time = A0H[0];
        int dy = A0H[1];
        int dx = A0M(Math.max(Math.abs(time), Math.abs(dy)));
        if (dx > 0) {
            c01124e.A04(time, dy, dx, ((C0832Xj) this).A04);
        }
    }

    @Override // com.facebook.ads.redexgen.X.C0832Xj
    public final float A0J(DisplayMetrics displayMetrics) {
        return 100.0f / displayMetrics.densityDpi;
    }

    @Override // com.facebook.ads.redexgen.X.C0832Xj
    public final int A0L(int i) {
        return Math.min(100, super.A0L(i));
    }
}
