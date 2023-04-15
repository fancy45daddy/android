package com.facebook.ads.redexgen.X;

import android.widget.FrameLayout;
import com.facebook.ads.AdOptionsView;
import com.facebook.ads.MediaView;
import com.facebook.ads.NativeAd;
import com.facebook.ads.NativeAdLayout;
/* loaded from: assets/audience_network.dex */
public final class DZ extends XB {
    public InterfaceC0600Oh A00;

    /* JADX WARN: Failed to parse debug info
    java.lang.ArrayIndexOutOfBoundsException: Index 16 out of bounds for length 16
    	at jadx.plugins.input.dex.sections.debuginfo.DebugInfoParser.startVar(DebugInfoParser.java:203)
    	at jadx.plugins.input.dex.sections.debuginfo.DebugInfoParser.process(DebugInfoParser.java:125)
    	at jadx.plugins.input.dex.sections.DexCodeReader.getDebugInfo(DexCodeReader.java:118)
    	at jadx.core.dex.nodes.MethodNode.getDebugInfo(MethodNode.java:567)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.visit(DebugInfoAttachVisitor.java:39)
     */
    public final void A04(NativeAdLayout nativeAdLayout, C0806Wj c0806Wj, NativeAd nativeAd, C0462It c0462It) {
        NI ni = new NI(c0806Wj);
        MediaView mediaView = new MediaView(c0806Wj);
        AdOptionsView adOptionsView = new AdOptionsView(c0806Wj, nativeAd, nativeAdLayout);
        c0462It.A09(adOptionsView, 28);
        this.A00 = new C0646Qb(c0806Wj, nativeAd, c0462It, C0718Sw.A0L(nativeAd.getInternalNativeAd()).A17(), ni, mediaView, adOptionsView);
        LE.A0M(nativeAdLayout, c0462It.A00());
        nativeAd.registerViewForInteraction(nativeAdLayout, mediaView, ni, this.A00.getViewsForInteraction());
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, -1);
        layoutParams.gravity = 17;
        nativeAdLayout.addView(this.A00.getView(), layoutParams);
    }

    @Override // com.facebook.ads.redexgen.X.C5E
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.A00.unregisterView();
    }
}
