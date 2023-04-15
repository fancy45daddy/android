package com.facebook.ads.redexgen.X;
/* loaded from: assets/audience_network.dex */
public class RE implements KW {
    public final /* synthetic */ int A00;
    public final /* synthetic */ AbstractRunnableC0487Ju A01;
    public final /* synthetic */ RB A02;

    public RE(RB rb, int i, AbstractRunnableC0487Ju abstractRunnableC0487Ju) {
        this.A02 = rb;
        this.A00 = i;
        this.A01 = abstractRunnableC0487Ju;
    }

    @Override // com.facebook.ads.redexgen.X.KW
    public final void AAH() {
        this.A01.run();
    }

    @Override // com.facebook.ads.redexgen.X.KW
    public final void ABs(float f) {
        this.A02.A07.setProgress(100.0f * (1.0f - (f / this.A00)));
    }
}
