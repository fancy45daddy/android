package com.facebook.ads.redexgen.X;

import android.view.View;
import android.webkit.WebView;
/* renamed from: com.facebook.ads.redexgen.X.Ma  reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public class View$OnClickListenerC0542Ma implements View.OnClickListener {
    public final /* synthetic */ C0546Me A00;

    public View$OnClickListenerC0542Ma(C0546Me c0546Me) {
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
            if (!webView.canGoBack()) {
                return;
            }
            webView2 = this.A00.A08;
            webView2.goBack();
        } catch (Throwable th) {
            C0480Jm.A00(th, this);
        }
    }
}
