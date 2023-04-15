package com.facebook.ads.redexgen.X;

import android.util.SparseBooleanArray;
import android.view.ViewGroup;
import androidx.annotation.Nullable;
import java.util.List;
/* renamed from: com.facebook.ads.redexgen.X.Rx  reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public final class C0694Rx extends C4H<C0659Qo> {
    public int A00;
    public int A01;
    public int A02;
    public InterfaceC0519Lc A03;
    public C0627Pi A04;
    public String A05;
    public List<OM> A06;
    public final SparseBooleanArray A07 = new SparseBooleanArray();
    public final AnonymousClass18 A08;
    public final C6G A09;
    public final C0806Wj A0A;
    public final IT A0B;
    public final C0718Sw A0C;
    public final L6 A0D;
    public final AnonymousClass96 A0E;
    public final IX A0F;

    public C0694Rx(C0806Wj c0806Wj, List<OM> list, AnonymousClass18 anonymousClass18, IT it, C0718Sw c0718Sw, InterfaceC0519Lc interfaceC0519Lc, String str, AnonymousClass96 anonymousClass96, @Nullable IX ix) {
        this.A0A = c0806Wj;
        this.A0B = it;
        this.A0C = c0718Sw;
        this.A09 = c0718Sw.A10();
        this.A04 = c0718Sw.A1A();
        this.A0D = c0718Sw.A19();
        this.A03 = interfaceC0519Lc;
        this.A08 = anonymousClass18;
        this.A06 = list;
        this.A05 = str;
        this.A0E = anonymousClass96;
        this.A0F = ix;
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Override // com.facebook.ads.redexgen.X.C4H
    /* renamed from: A01 */
    public final C0659Qo A06(ViewGroup viewGroup, int i) {
        return new C0659Qo(NA.A00(new NU(this.A0A, this.A0B, this.A03, this.A08, null, this.A04, this.A0D).A0I(this.A0F).A0G(this.A0C).A0J(), this.A0C, this.A05, this.A0E), this.A07, this.A04, this.A06.size(), this.A0A);
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Override // com.facebook.ads.redexgen.X.C4H
    /* renamed from: A02 */
    public final void A0E(C0659Qo c0659Qo, int i) {
        c0659Qo.A0m(this.A04);
        c0659Qo.A0l(this.A06.get(i), this.A0B, this.A09, this.A0D, this.A05, this.A00, this.A02, this.A01);
    }

    @Override // com.facebook.ads.redexgen.X.C4H
    public final int A0D() {
        return this.A06.size();
    }

    public final void A0F(int i, int i2, int i3) {
        boolean needsUpdate = i != this.A00;
        this.A00 = i;
        this.A02 = i2;
        this.A01 = i3;
        if (needsUpdate) {
            A07();
        }
    }

    public final void A0G(C0627Pi c0627Pi) {
        this.A04 = c0627Pi;
    }
}
