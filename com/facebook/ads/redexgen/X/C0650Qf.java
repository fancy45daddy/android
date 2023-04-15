package com.facebook.ads.redexgen.X;

import android.widget.ImageView;
import android.widget.RelativeLayout;
/* renamed from: com.facebook.ads.redexgen.X.Qf  reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public final class C0650Qf extends NJ {
    public final ImageView A00;
    public final C0806Wj A01;

    public C0650Qf(C0806Wj c0806Wj) {
        super(c0806Wj);
        this.A01 = c0806Wj;
        this.A00 = new ImageView(c0806Wj);
        this.A00.setAdjustViewBounds(true);
        addView(this.A00, new RelativeLayout.LayoutParams(-2, -1));
    }

    public final void A00(String str) {
        AsyncTaskC0685Ro downloadImageTask = new AsyncTaskC0685Ro(this.A00, this.A01);
        downloadImageTask.A04();
        downloadImageTask.A07(str);
    }
}
