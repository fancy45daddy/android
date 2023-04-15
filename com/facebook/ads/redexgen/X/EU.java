package com.facebook.ads.redexgen.X;

import android.view.ViewGroup;
import androidx.annotation.Nullable;
import java.util.ArrayList;
import java.util.List;
/* loaded from: assets/audience_network.dex */
public final class EU extends AbstractC0869Yw {
    public final C0806Wj A00;
    public final C0462It A01;

    public EU(C0806Wj c0806Wj, C1A c1a, List<C0718Sw> list, @Nullable C0462It c0462It) {
        super(c1a, list, c0806Wj);
        this.A00 = c0806Wj;
        this.A01 = c0462It == null ? new C0462It() : c0462It;
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Override // com.facebook.ads.redexgen.X.C4H
    /* renamed from: A01 */
    public final SN A06(ViewGroup viewGroup, int i) {
        return new SN(new C0521Le(this.A00, this.A01));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v1, types: [com.facebook.ads.internal.api.AdNativeComponentView, android.view.View, com.facebook.ads.redexgen.X.Le, java.lang.Object] */
    @Override // com.facebook.ads.redexgen.X.AbstractC0869Yw, com.facebook.ads.redexgen.X.C4H
    /* renamed from: A0H */
    public final void A0E(SN sn, int i) {
        super.A0E(sn, i);
        ?? r2 = (C0521Le) sn.A0l();
        A0F(r2.getImageCardView(), i);
        if (((AbstractC0869Yw) this).A01.get(i) != null) {
            r2.setTitle(((AbstractC0869Yw) this).A01.get(i).getAdHeadline());
            r2.setSubtitle(((AbstractC0869Yw) this).A01.get(i).getAdLinkDescription());
            r2.setButtonText(((AbstractC0869Yw) this).A01.get(i).getAdCallToAction());
        }
        ArrayList arrayList = new ArrayList();
        arrayList.add(r2);
        ((AbstractC0869Yw) this).A01.get(i).A1O(r2, r2, arrayList);
    }
}
