package com.facebook.ads.redexgen.X;

import android.view.View;
import android.view.ViewGroup;
/* loaded from: assets/audience_network.dex */
public final class NP {
    public static final int A00 = LE.A00();

    public static void A00(C0806Wj c0806Wj, ViewGroup viewGroup, String str) {
        new AsyncTaskC0685Ro(viewGroup, c0806Wj).A07(str);
        View view = new View(c0806Wj);
        view.setId(A00);
        view.setLayoutParams(new ViewGroup.LayoutParams(-1, -1));
        LE.A0R(view, c0806Wj);
        viewGroup.addView(view, 0);
    }
}
