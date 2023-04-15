package com.facebook.ads.redexgen.X;

import android.util.SparseBooleanArray;
import android.view.ViewGroup;
import androidx.annotation.Nullable;
import java.util.List;
/* renamed from: com.facebook.ads.redexgen.X.Qu  reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public final class C0665Qu extends C4H<C0659Qo> {
    public int A00;
    public int A01;
    public int A02;
    @Nullable
    public InterfaceC0519Lc A03;
    public String A04;
    public List<OM> A05;
    public final SparseBooleanArray A06 = new SparseBooleanArray();
    public final AnonymousClass18 A07;
    public final C6G A08;
    public final C0806Wj A09;
    public final IT A0A;
    public final L6 A0B;
    public final C0666Qv A0C;
    public final IX A0D;
    public final C0627Pi A0E;

    public C0665Qu(C0806Wj c0806Wj, List<OM> list, AnonymousClass18 anonymousClass18, IT it, C6G c6g, C0627Pi c0627Pi, L6 l6, InterfaceC0519Lc interfaceC0519Lc, String str, C0666Qv c0666Qv, IX ix) {
        this.A09 = c0806Wj;
        this.A0A = it;
        this.A08 = c6g;
        this.A0E = c0627Pi;
        this.A0B = l6;
        this.A03 = interfaceC0519Lc;
        this.A07 = anonymousClass18;
        this.A05 = list;
        this.A04 = str;
        this.A0C = c0666Qv;
        this.A0D = ix;
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Override // com.facebook.ads.redexgen.X.C4H
    @Nullable
    /* renamed from: A01 */
    public final C0659Qo A06(ViewGroup viewGroup, int i) {
        InterfaceC0519Lc interfaceC0519Lc = this.A03;
        if (interfaceC0519Lc == null || this.A00 == 0) {
            return null;
        }
        return new C0659Qo(NA.A01(new NU(this.A09, this.A0A, interfaceC0519Lc, this.A07, null, this.A0E, this.A0B).A0I(this.A0D).A0J(), this.A04, this.A0C), this.A06, this.A0E, this.A05.size(), this.A09);
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Override // com.facebook.ads.redexgen.X.C4H
    /* renamed from: A02 */
    public final void A0E(C0659Qo c0659Qo, int i) {
        c0659Qo.A0l(this.A05.get(i), this.A0A, this.A08, this.A0B, this.A04, this.A00, this.A02, this.A01);
    }

    @Override // com.facebook.ads.redexgen.X.C4H
    public final int A0D() {
        return this.A05.size();
    }

    public final void A0F(int i, int i2, int i3) {
        this.A00 = i;
        this.A02 = i2;
        this.A01 = i3;
    }
}
