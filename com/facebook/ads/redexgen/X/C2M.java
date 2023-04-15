package com.facebook.ads.redexgen.X;

import android.os.Build;
import androidx.annotation.Nullable;
/* renamed from: com.facebook.ads.redexgen.X.2M  reason: invalid class name */
/* loaded from: assets/audience_network.dex */
public class C2M extends C0339Dw {
    public C2M(C0806Wj c0806Wj) {
        super(c0806Wj);
        setCarouselLayoutManager(c0806Wj);
    }

    @Nullable
    public C0665Qu getFullscreenCarouselRecyclerViewAdapter() {
        if (getAdapter() instanceof C0665Qu) {
            return (C0665Qu) getAdapter();
        }
        return null;
    }

    @Override // com.facebook.ads.redexgen.X.C0339Dw
    public C0833Xk getLayoutManager() {
        return (C0833Xk) super.getLayoutManager();
    }

    private void setCarouselLayoutManager(C0806Wj c0806Wj) {
        C0833Xk c0833Xk = new C0833Xk(c0806Wj, 0, false);
        if (Build.VERSION.SDK_INT >= 24) {
            c0833Xk.A1V(true);
        }
        super.setLayoutManager(c0833Xk);
    }

    @Override // com.facebook.ads.redexgen.X.C0339Dw
    public void setLayoutManager(C4T c4t) {
    }
}
