package com.facebook.ads.redexgen.X;

import android.util.SparseBooleanArray;
import android.view.ViewGroup;
import androidx.annotation.Nullable;
import java.util.List;
/* renamed from: com.facebook.ads.redexgen.X.Qn  reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public final class C0658Qn extends C4H<C0652Qh> {
    public int A00;
    public int A01;
    public int A02;
    public int A03;
    @Nullable
    public InterfaceC0519Lc A04;
    public String A05;
    public List<OM> A06;
    public final SparseBooleanArray A07 = new SparseBooleanArray();
    public final AnonymousClass18 A08;
    public final C6G A09;
    public final C0806Wj A0A;
    public final IT A0B;
    public final L6 A0C;
    public final C0666Qv A0D;
    public final C0627Pi A0E;

    public C0658Qn(C0806Wj c0806Wj, List<OM> list, AnonymousClass18 anonymousClass18, IT it, C6G c6g, C0627Pi c0627Pi, L6 l6, InterfaceC0519Lc interfaceC0519Lc, String str, int i, int i2, int i3, int i4, C0666Qv c0666Qv) {
        this.A0A = c0806Wj;
        this.A0B = it;
        this.A09 = c6g;
        this.A0E = c0627Pi;
        this.A0C = l6;
        this.A04 = interfaceC0519Lc;
        this.A08 = anonymousClass18;
        this.A06 = list;
        this.A00 = i;
        this.A03 = i4;
        this.A05 = str;
        this.A01 = i3;
        this.A02 = i2;
        this.A0D = c0666Qv;
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Override // com.facebook.ads.redexgen.X.C4H
    /* renamed from: A01 */
    public final C0652Qh A06(ViewGroup viewGroup, int i) {
        return new C0652Qh(C0576Ni.A00(new NU(this.A0A, this.A0B, this.A04, this.A08, null, this.A0E, this.A0C).A0J(), this.A03, this.A05, this.A0D), this.A07, this.A0E, this.A00, this.A01, this.A02, this.A06.size(), this.A0A);
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Override // com.facebook.ads.redexgen.X.C4H
    /* renamed from: A02 */
    public final void A0E(C0652Qh c0652Qh, int i) {
        c0652Qh.A0l(this.A06.get(i), this.A0B, this.A09, this.A0C, this.A05);
    }

    @Override // com.facebook.ads.redexgen.X.C4H
    public final int A0D() {
        return this.A06.size();
    }
}
