package com.facebook.ads.redexgen.X;
/* renamed from: com.facebook.ads.redexgen.X.Yx  reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public class C0870Yx implements N1 {
    public final /* synthetic */ int A00;
    public final /* synthetic */ AbstractC0869Yw A01;
    public final /* synthetic */ C0718Sw A02;

    public C0870Yx(AbstractC0869Yw abstractC0869Yw, int i, C0718Sw c0718Sw) {
        this.A01 = abstractC0869Yw;
        this.A00 = i;
        this.A02 = c0718Sw;
    }

    @Override // com.facebook.ads.redexgen.X.N1
    public final void AAr(boolean z) {
        AbstractC0626Ph abstractC0626Ph;
        if (this.A00 == 0) {
            C0718Sw c0718Sw = this.A02;
            abstractC0626Ph = this.A01.A04;
            c0718Sw.A1Z(abstractC0626Ph);
        }
        this.A02.A1c(z, true);
    }
}
