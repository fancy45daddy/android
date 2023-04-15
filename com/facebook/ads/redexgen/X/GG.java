package com.facebook.ads.redexgen.X;

import androidx.annotation.Nullable;
/* loaded from: assets/audience_network.dex */
public final class GG {
    public final int A00;
    public final GD A01;
    @Nullable
    public final Object A02;
    public final C02359h[] A03;

    public GG(C02359h[] c02359hArr, GC[] gcArr, @Nullable Object obj) {
        this.A03 = c02359hArr;
        this.A01 = new GD(gcArr);
        this.A02 = obj;
        this.A00 = c02359hArr.length;
    }

    public final boolean A00(int i) {
        return this.A03[i] != null;
    }

    public final boolean A01(GG gg) {
        if (gg == null || gg.A01.A01 != this.A01.A01) {
            return false;
        }
        for (int i = 0; i < this.A01.A01; i++) {
            if (!A02(gg, i)) {
                return false;
            }
        }
        return true;
    }

    public final boolean A02(GG gg, int i) {
        return gg != null && C0430Hl.A0g(this.A03[i], gg.A03[i]) && C0430Hl.A0g(this.A01.A00(i), gg.A01.A00(i));
    }
}
