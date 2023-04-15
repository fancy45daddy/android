package com.facebook.ads.redexgen.X;
/* renamed from: com.facebook.ads.redexgen.X.Yc  reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public class C0849Yc extends AbstractRunnableC0487Ju {
    public final /* synthetic */ AbstractC0848Yb A00;
    public final /* synthetic */ J3 A01;

    public C0849Yc(AbstractC0848Yb abstractC0848Yb, J3 j3) {
        this.A00 = abstractC0848Yb;
        this.A01 = j3;
    }

    @Override // com.facebook.ads.redexgen.X.AbstractRunnableC0487Ju
    public final void A06() {
        this.A00.A0B.A0D().A4Z(this.A01.A03().getErrorCode(), this.A01.A04());
        if (this.A00.A06 != null) {
            this.A00.A06.A0G(this.A01);
        }
    }
}
