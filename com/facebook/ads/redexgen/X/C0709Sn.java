package com.facebook.ads.redexgen.X;
/* renamed from: com.facebook.ads.redexgen.X.Sn  reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public class C0709Sn extends AbstractRunnableC0487Ju {
    public final /* synthetic */ long A00;
    public final /* synthetic */ JT A01;
    public final /* synthetic */ JW A02;
    public final /* synthetic */ String A03;

    public C0709Sn(JW jw, String str, long j, JT jt) {
        this.A02 = jw;
        this.A03 = str;
        this.A00 = j;
        this.A01 = jt;
    }

    @Override // com.facebook.ads.redexgen.X.AbstractRunnableC0487Ju
    public final void A06() {
        this.A02.A0M(this.A03, this.A00, this.A01);
    }
}
