package com.facebook.ads.redexgen.X;

import android.util.AttributeSet;
import android.widget.RelativeLayout;
import androidx.annotation.Nullable;
/* loaded from: assets/audience_network.dex */
public abstract class M1 extends RelativeLayout implements InterfaceC0612Ot {
    @Nullable
    public P1 A00;

    public M1(C0806Wj c0806Wj) {
        super(c0806Wj);
    }

    public M1(C0806Wj c0806Wj, AttributeSet attributeSet, int i) {
        super(c0806Wj, attributeSet, i);
        RelativeLayout.LayoutParams params = new RelativeLayout.LayoutParams(-1, -1);
        setLayoutParams(params);
    }

    public void A07() {
    }

    public void A08() {
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC0612Ot
    public final void A8l(P1 p1) {
        this.A00 = p1;
        A07();
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC0612Ot
    public final void AF5(P1 p1) {
        A08();
        this.A00 = null;
    }

    @Nullable
    public P1 getVideoView() {
        return this.A00;
    }
}
