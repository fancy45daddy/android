package com.facebook.ads.redexgen.X;

import java.util.concurrent.atomic.AtomicBoolean;
/* loaded from: assets/audience_network.dex */
public class R8 extends AbstractRunnableC0487Ju {
    public final /* synthetic */ AnonymousClass80 A00;

    public R8(AnonymousClass80 anonymousClass80) {
        this.A00 = anonymousClass80;
    }

    @Override // com.facebook.ads.redexgen.X.AbstractRunnableC0487Ju
    public final void A06() {
        NR nr;
        int closeButtonStyle;
        AtomicBoolean atomicBoolean;
        NR nr2;
        nr = this.A00.A00;
        if (nr != null) {
            nr2 = this.A00.A00;
            nr2.A0Z();
        }
        AbstractC0518Lb abstractC0518Lb = this.A00.A07;
        closeButtonStyle = this.A00.getCloseButtonStyle();
        abstractC0518Lb.setToolbarActionMode(closeButtonStyle);
        atomicBoolean = this.A00.A05;
        atomicBoolean.set(true);
    }
}
