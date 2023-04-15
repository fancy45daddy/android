package com.facebook.ads.redexgen.X;

import android.view.View;
import android.webkit.WebView;
/* renamed from: com.facebook.ads.redexgen.X.Mb  reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public class View$OnClickListenerC0543Mb implements View.OnClickListener {
    public final /* synthetic */ C0546Me A00;

    public View$OnClickListenerC0543Mb(C0546Me c0546Me) {
        this.A00 = c0546Me;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        WebView webView;
        WebView webView2;
        if (C0480Jm.A02(this)) {
            return;
        }
        try {
            webView = this.A00.A08;
            if (!webView.canGoForward()) {
                return;
            }
            webView2 = this.A00.A08;
            webView2.goForward();
        } catch (Throwable th) {
            C0480Jm.A00(th, this);
        }
    }
}
