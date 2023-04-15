package com.facebook.ads.redexgen.X;

import android.view.View;
import androidx.annotation.Nullable;
/* loaded from: assets/audience_network.dex */
public class NU {
    @Nullable
    public View A02;
    @Nullable
    public C0718Sw A03;
    @Nullable
    public AbstractC0518Lb A04;
    @Nullable
    public IX A05;
    @Nullable
    public final View A06;
    public final AnonymousClass18 A07;
    public final C0806Wj A08;
    public final IT A09;
    public final L6 A0A;
    public final InterfaceC0519Lc A0B;
    public final C0627Pi A0C;
    public int A01 = 0;
    public int A00 = 1;

    public NU(C0806Wj c0806Wj, IT it, InterfaceC0519Lc interfaceC0519Lc, AnonymousClass18 anonymousClass18, @Nullable View view, C0627Pi c0627Pi, L6 l6) {
        this.A08 = c0806Wj;
        this.A09 = it;
        this.A0B = interfaceC0519Lc;
        this.A07 = anonymousClass18;
        this.A06 = view;
        this.A0C = c0627Pi;
        this.A0A = l6;
    }

    public final NU A0D(int i) {
        this.A00 = i;
        return this;
    }

    public final NU A0E(int i) {
        this.A01 = i;
        return this;
    }

    public final NU A0F(View view) {
        this.A02 = view;
        return this;
    }

    public final NU A0G(C0718Sw c0718Sw) {
        this.A03 = c0718Sw;
        return this;
    }

    public final NU A0H(AbstractC0518Lb abstractC0518Lb) {
        this.A04 = abstractC0518Lb;
        return this;
    }

    public final NU A0I(IX ix) {
        this.A05 = ix;
        return this;
    }

    public final NV A0J() {
        return new NV(this);
    }
}
