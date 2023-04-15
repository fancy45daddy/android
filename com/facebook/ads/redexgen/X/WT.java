package com.facebook.ads.redexgen.X;

import android.content.Context;
import android.view.View;
/* loaded from: assets/audience_network.dex */
public class WT implements InterfaceC0478Jk {
    @Override // com.facebook.ads.redexgen.X.InterfaceC0478Jk
    public final void ADt(Throwable th, Object obj) {
        if (obj instanceof C7E) {
            C0806Wj adContext = ((C7E) obj).A5Z();
            if (adContext != null) {
                adContext.A0H(th);
            }
        } else if (!(obj instanceof View)) {
        } else {
            Context context = ((View) obj).getContext();
            if (!(context instanceof C0806Wj)) {
                return;
            }
            ((C0806Wj) context).A0H(th);
        }
    }
}
