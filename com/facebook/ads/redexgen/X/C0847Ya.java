package com.facebook.ads.redexgen.X;

import com.facebook.ads.internal.protocol.AdErrorType;
/* renamed from: com.facebook.ads.redexgen.X.Ya  reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public class C0847Ya extends AbstractRunnableC0487Ju {
    public final /* synthetic */ ZB A00;
    public final /* synthetic */ C00491q A01;
    public final /* synthetic */ EC A02;

    public C0847Ya(EC ec, C00491q c00491q, ZB zb) {
        this.A02 = ec;
        this.A01 = c00491q;
        this.A00 = zb;
    }

    @Override // com.facebook.ads.redexgen.X.AbstractRunnableC0487Ju
    public final void A06() {
        this.A02.A0N(this.A01);
        this.A02.A0K(this.A00);
        this.A02.A00 = null;
        J3 A00 = J3.A00(AdErrorType.INTERSTITIAL_AD_TIMEOUT);
        this.A02.A0B.A0D().A4Z(A00.A03().getErrorCode(), A00.A04());
        this.A02.A06.A0G(A00);
    }
}
