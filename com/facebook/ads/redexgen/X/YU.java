package com.facebook.ads.redexgen.X;

import com.facebook.ads.internal.protocol.AdErrorType;
/* loaded from: assets/audience_network.dex */
public class YU extends AbstractRunnableC0487Ju {
    public final /* synthetic */ C0344Eb A00;
    public final /* synthetic */ C00491q A01;
    public final /* synthetic */ E8 A02;

    public YU(E8 e8, C00491q c00491q, C0344Eb c0344Eb) {
        this.A02 = e8;
        this.A01 = c00491q;
        this.A00 = c0344Eb;
    }

    @Override // com.facebook.ads.redexgen.X.AbstractRunnableC0487Ju
    public final void A06() {
        this.A02.A0N(this.A01);
        this.A02.A0K(this.A00);
        this.A02.A00 = null;
        AdErrorType adErrorType = AdErrorType.RV_AD_TIMEOUT;
        this.A02.A0B.A0D().A4Z(adErrorType.getErrorCode(), adErrorType.getDefaultErrorMessage());
        this.A02.A06.A0G(new J3(adErrorType, ""));
    }
}
