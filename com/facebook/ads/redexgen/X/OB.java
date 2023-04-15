package com.facebook.ads.redexgen.X;

import androidx.annotation.Nullable;
/* loaded from: assets/audience_network.dex */
public final class OB {
    @Nullable
    public String A02;
    @Nullable
    public String A03;
    public final C1I A04;
    public final C1U A05;
    public final C0806Wj A06;
    public C1K A01 = C1K.A01(null);
    public int A00 = 1000;

    public OB(C0806Wj c0806Wj, C1I c1i, C1U c1u) {
        this.A06 = c0806Wj;
        this.A04 = c1i;
        this.A05 = c1u;
    }

    public static /* synthetic */ int A00(OB ob) {
        return ob.A00;
    }

    public static /* synthetic */ C1I A01(OB ob) {
        return ob.A04;
    }

    public static /* synthetic */ C1K A02(OB ob) {
        return ob.A01;
    }

    public static /* synthetic */ C1U A03(OB ob) {
        return ob.A05;
    }

    public static /* synthetic */ C0806Wj A04(OB ob) {
        return ob.A06;
    }

    public static /* synthetic */ String A05(OB ob) {
        return ob.A03;
    }

    public static /* synthetic */ String A06(OB ob) {
        return ob.A02;
    }

    public final OB A07(int i) {
        this.A00 = i;
        return this;
    }

    public final OB A08(C1K c1k) {
        this.A01 = c1k;
        return this;
    }

    public final OB A09(String str) {
        this.A02 = str;
        return this;
    }

    public final OB A0A(String str) {
        this.A03 = str;
        return this;
    }

    public final OD A0B() {
        return new OD(this, null);
    }
}
