package com.facebook.ads.redexgen.X;

import android.text.TextUtils;
/* loaded from: assets/audience_network.dex */
public class SA implements OV {
    public final /* synthetic */ S9 A00;

    public SA(S9 s9) {
        this.A00 = s9;
    }

    public /* synthetic */ SA(S9 s9, SG sg) {
        this(s9);
    }

    @Override // com.facebook.ads.redexgen.X.OV
    public final void AAK() {
        this.A00.A0X(true);
    }

    @Override // com.facebook.ads.redexgen.X.OV
    public final void AAt() {
        AnonymousClass18 anonymousClass18;
        InterfaceC0519Lc interfaceC0519Lc;
        M4 m4;
        IT it;
        AnonymousClass18 anonymousClass182;
        OX ox;
        OX ox2;
        AnonymousClass18 anonymousClass183;
        C0806Wj c0806Wj;
        anonymousClass18 = this.A00.A0D;
        if (!TextUtils.isEmpty(anonymousClass18.A0U())) {
            it = this.A00.A0H;
            anonymousClass182 = this.A00.A0D;
            String A0U = anonymousClass182.A0U();
            N2 n2 = new N2();
            ox = this.A00.A06;
            N2 A03 = n2.A03(ox.getViewabilityChecker());
            ox2 = this.A00.A06;
            it.A8z(A0U, A03.A02(ox2.getTouchDataRecorder()).A05());
            anonymousClass183 = this.A00.A0D;
            AnonymousClass29.A00(anonymousClass183.A0W());
            c0806Wj = this.A00.A0G;
            c0806Wj.A0D().A2Y();
        }
        interfaceC0519Lc = this.A00.A0L;
        m4 = this.A00.A0M;
        interfaceC0519Lc.A3s(m4.A6k());
    }

    @Override // com.facebook.ads.redexgen.X.OV
    public final void ABE() {
        InterfaceC0519Lc interfaceC0519Lc;
        M4 m4;
        interfaceC0519Lc = this.A00.A0L;
        m4 = this.A00.A0M;
        interfaceC0519Lc.A3s(m4.A6X());
    }

    @Override // com.facebook.ads.redexgen.X.OV
    public final void ACo() {
        InterfaceC0519Lc interfaceC0519Lc;
        interfaceC0519Lc = this.A00.A0L;
        interfaceC0519Lc.AA9(15);
    }
}
