package com.facebook.ads.redexgen.X;

import android.widget.FrameLayout;
import com.facebook.ads.AdOptionsView;
import com.facebook.ads.MediaView;
import com.facebook.ads.NativeAdLayout;
import com.facebook.ads.NativeBannerAd;
/* loaded from: assets/audience_network.dex */
public final class Dt extends XB {
    public InterfaceC0600Oh A00;

    public final void A04(C0806Wj c0806Wj, NativeBannerAd nativeBannerAd, C0462It c0462It, NativeAdLayout nativeAdLayout) {
        MediaView mediaView = new MediaView(nativeAdLayout.getContext());
        AdOptionsView adOptionsView = new AdOptionsView(nativeAdLayout.getContext(), nativeBannerAd, nativeAdLayout);
        c0462It.A09(adOptionsView, 20);
        this.A00 = new C0647Qc(c0806Wj, nativeBannerAd, c0462It, C0718Sw.A0L(nativeBannerAd.getInternalNativeAd()).A17(), mediaView, adOptionsView);
        LE.A0M(nativeAdLayout, c0462It.A00());
        nativeBannerAd.registerViewForInteraction(nativeAdLayout, mediaView, this.A00.getViewsForInteraction());
        FrameLayout.LayoutParams contentParams = new FrameLayout.LayoutParams(-1, -1);
        contentParams.gravity = 17;
        nativeAdLayout.addView(this.A00.getView(), contentParams);
    }

    @Override // com.facebook.ads.redexgen.X.C5E
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.A00.unregisterView();
    }
}
