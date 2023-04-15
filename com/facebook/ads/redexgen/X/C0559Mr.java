package com.facebook.ads.redexgen.X;

import android.webkit.RenderProcessGoneDetail;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import androidx.annotation.RequiresApi;
/* renamed from: com.facebook.ads.redexgen.X.Mr  reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public class C0559Mr extends WebViewClient {
    public final /* synthetic */ AbstractC0560Ms A00;

    public C0559Mr(AbstractC0560Ms abstractC0560Ms) {
        this.A00 = abstractC0560Ms;
    }

    @Override // android.webkit.WebViewClient
    @RequiresApi(api = 26)
    public final boolean onRenderProcessGone(WebView webView, RenderProcessGoneDetail renderProcessGoneDetail) {
        AbstractC0560Ms.A02(C01877l.A2e);
        return true;
    }
}
