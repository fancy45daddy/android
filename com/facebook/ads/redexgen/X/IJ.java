package com.facebook.ads.redexgen.X;

import android.view.View;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
/* loaded from: assets/audience_network.dex */
public final class IJ {
    public final View A00;
    public final C0805Wi A01;
    public final IT A02;
    public final String A03;
    public final HashMap<String, String> A04 = new HashMap<>();
    public final boolean A05;
    public final boolean A06;

    public IJ(C0805Wi c0805Wi, View view, String str, boolean z, boolean z2) {
        this.A03 = str;
        this.A01 = c0805Wi;
        this.A02 = c0805Wi.A08();
        this.A00 = view;
        this.A05 = z2;
        this.A06 = z;
    }

    public final View A00() {
        return this.A00;
    }

    public final C0805Wi A01() {
        return this.A01;
    }

    public final IT A02() {
        return this.A02;
    }

    public final String A03() {
        return this.A03;
    }

    public final Map<String, String> A04() {
        return Collections.unmodifiableMap(this.A04);
    }

    public final boolean A05() {
        return this.A05;
    }

    public final boolean A06() {
        return this.A06;
    }
}
