package com.facebook.ads.redexgen.X;

import com.facebook.ads.NativeAdBase;
import com.facebook.ads.NativeAdListener;
/* loaded from: assets/audience_network.dex */
public final class A4 implements InterfaceC0717Sv {
    public NativeAdBase A00;
    public NativeAdListener A01;

    public A4(NativeAdListener nativeAdListener, NativeAdBase nativeAdBase) {
        this.A01 = nativeAdListener;
        this.A00 = nativeAdBase;
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC0450Ih
    public final void A9m() {
        C0479Jl.A00(new C0713Sr(this));
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC0450Ih
    public final void A9q() {
        C0479Jl.A00(new C0714Ss(this));
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC0450Ih
    public final void AAc(J3 j3) {
        C0479Jl.A00(new C0716Su(this, j3));
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC0450Ih
    public final void ABI() {
        C0479Jl.A00(new C0712Sq(this));
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC0717Sv
    public final void ABN() {
        C0479Jl.A00(new C0715St(this));
    }
}
