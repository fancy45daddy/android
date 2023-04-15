package com.facebook.ads.redexgen.X;

import java.util.Map;
/* loaded from: assets/audience_network.dex */
public class Y4 extends AbstractC00622d<K, V> {
    public final /* synthetic */ Y3 A00;

    public Y4(Y3 y3) {
        this.A00 = y3;
    }

    @Override // com.facebook.ads.redexgen.X.AbstractC00622d
    public final int A04() {
        return ((C00652g) this.A00).A00;
    }

    @Override // com.facebook.ads.redexgen.X.AbstractC00622d
    public final int A05(Object obj) {
        return this.A00.A08(obj);
    }

    @Override // com.facebook.ads.redexgen.X.AbstractC00622d
    public final int A06(Object obj) {
        return this.A00.A07(obj);
    }

    @Override // com.facebook.ads.redexgen.X.AbstractC00622d
    public final Object A07(int i, int i2) {
        return this.A00.A02[(i << 1) + i2];
    }

    @Override // com.facebook.ads.redexgen.X.AbstractC00622d
    public final V A08(int i, V value) {
        return this.A00.A0C(i, value);
    }

    @Override // com.facebook.ads.redexgen.X.AbstractC00622d
    public final Map<K, V> A0A() {
        return this.A00;
    }

    @Override // com.facebook.ads.redexgen.X.AbstractC00622d
    public final void A0D() {
        this.A00.clear();
    }

    @Override // com.facebook.ads.redexgen.X.AbstractC00622d
    public final void A0E(int i) {
        this.A00.A0A(i);
    }

    @Override // com.facebook.ads.redexgen.X.AbstractC00622d
    public final void A0F(K key, V value) {
        this.A00.put(key, value);
    }
}
