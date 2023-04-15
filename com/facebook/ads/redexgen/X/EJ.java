package com.facebook.ads.redexgen.X;

import android.view.ViewGroup;
import java.util.List;
/* loaded from: assets/audience_network.dex */
public final class EJ extends AbstractC0869Yw {
    public final C0806Wj A00;

    public EJ(C1A c1a, List<C0718Sw> list, C0806Wj c0806Wj) {
        super(c1a, list, c0806Wj);
        this.A00 = c0806Wj;
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Override // com.facebook.ads.redexgen.X.C4H
    /* renamed from: A01 */
    public final SN A06(ViewGroup viewGroup, int i) {
        return new SN(new C0525Li(this.A00));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v1, types: [com.facebook.ads.internal.api.AdNativeComponentView, android.view.View, com.facebook.ads.redexgen.X.Li] */
    @Override // com.facebook.ads.redexgen.X.AbstractC0869Yw, com.facebook.ads.redexgen.X.C4H
    /* renamed from: A0H */
    public final void A0E(SN sn, int i) {
        super.A0E(sn, i);
        ?? r3 = (C0525Li) sn.A0l();
        C0537Lu imageView = (C0537Lu) r3.getImageCardView();
        imageView.setImageDrawable(null);
        A0F(imageView, i);
        C0718Sw childAd = ((AbstractC0869Yw) this).A01.get(i);
        childAd.A11().A0F(this.A00);
        childAd.A1N(r3, r3);
    }
}
