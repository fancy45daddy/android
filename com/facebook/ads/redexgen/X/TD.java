package com.facebook.ads.redexgen.X;

import com.facebook.ads.NativeAd;
import com.facebook.ads.internal.api.MediaViewVideoRendererApi;
/* loaded from: assets/audience_network.dex */
public class TD implements InterfaceC0455Im {
    public final /* synthetic */ MediaViewVideoRendererApi A00;
    public final /* synthetic */ T8 A01;

    public TD(T8 t8, MediaViewVideoRendererApi mediaViewVideoRendererApi) {
        this.A01 = t8;
        this.A00 = mediaViewVideoRendererApi;
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC0455Im
    public final void AES() {
        this.A00.setVolume(1.0f);
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC0455Im
    public final void AEV(NativeAd nativeAd) {
        this.A01.A0I(C0718Sw.A0L(nativeAd.getInternalNativeAd()), new T9(C0718Sw.A0L(nativeAd.getInternalNativeAd())));
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC0455Im
    public final void AF7() {
        this.A01.A0D();
    }
}
