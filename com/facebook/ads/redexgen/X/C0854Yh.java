package com.facebook.ads.redexgen.X;

import android.webkit.WebView;
import com.facebook.ads.AdError;
/* renamed from: com.facebook.ads.redexgen.X.Yh  reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public class C0854Yh implements AnonymousClass68 {
    public final C1W A00;
    public final InterfaceC00441l A01;
    public final C6G A02;
    public final C0806Wj A03;
    public final boolean A04;

    public C0854Yh(C0806Wj c0806Wj, InterfaceC00441l interfaceC00441l, C6G c6g, C1W c1w, boolean z) {
        this.A03 = c0806Wj;
        this.A01 = interfaceC00441l;
        this.A02 = c6g;
        this.A00 = c1w;
        this.A04 = z;
    }

    private final void A00() {
        WebView webView = new WebView(this.A03);
        webView.getSettings().setCacheMode(1);
        webView.setWebViewClient(new C00451m(this.A00, this.A01, this.A04));
        webView.loadUrl(this.A00.A0E());
    }

    private void A01(boolean z) {
        if (this.A00.A09() == C1X.A05) {
            A00();
            return;
        }
        String A0E = this.A00.A0E();
        if (z) {
            C6G c6g = this.A02;
            String markupUrlResult = this.A00.A0E();
            A0E = c6g.A0R(markupUrlResult);
        }
        this.A00.A0H(A0E);
        this.A01.ABh();
    }

    @Override // com.facebook.ads.redexgen.X.AnonymousClass68
    public final void AAB() {
        if (this.A04) {
            this.A01.ABg(AdError.CACHE_ERROR);
        } else {
            A01(false);
        }
    }

    @Override // com.facebook.ads.redexgen.X.AnonymousClass68
    public final void AAI() {
        A01(true);
    }
}
