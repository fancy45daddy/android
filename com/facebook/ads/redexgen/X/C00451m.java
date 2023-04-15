package com.facebook.ads.redexgen.X;

import android.graphics.Bitmap;
import android.os.Handler;
import android.webkit.RenderProcessGoneDetail;
import android.webkit.WebResourceError;
import android.webkit.WebResourceRequest;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import androidx.annotation.RequiresApi;
import com.facebook.ads.AdError;
/* renamed from: com.facebook.ads.redexgen.X.1m  reason: invalid class name and case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public class C00451m extends WebViewClient {
    public boolean A00 = false;
    public final C1W A01;
    public final InterfaceC00441l A02;
    public final boolean A03;

    public C00451m(C1W c1w, InterfaceC00441l interfaceC00441l, boolean z) {
        this.A01 = c1w;
        this.A02 = interfaceC00441l;
        this.A03 = z;
    }

    private void A00() {
        if (this.A03) {
            this.A02.ABg(AdError.CACHE_ERROR);
        } else {
            A01();
        }
    }

    private void A01() {
        InterfaceC00441l interfaceC00441l = this.A02;
        if (interfaceC00441l != null) {
            interfaceC00441l.ABh();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void A02() {
        A00();
    }

    @Override // android.webkit.WebViewClient
    public final void onPageFinished(WebView webView, String str) {
        this.A00 = true;
        A01();
    }

    @Override // android.webkit.WebViewClient
    public final void onPageStarted(WebView webView, String str, Bitmap bitmap) {
        super.onPageStarted(webView, str, bitmap);
        new Handler().postDelayed(new C0853Yg(this), this.A01.A08());
    }

    @Override // android.webkit.WebViewClient
    public final void onReceivedError(WebView webView, WebResourceRequest webResourceRequest, WebResourceError webResourceError) {
        this.A00 = true;
        A02();
    }

    @Override // android.webkit.WebViewClient
    @RequiresApi(api = 26)
    public final boolean onRenderProcessGone(WebView webView, RenderProcessGoneDetail renderProcessGoneDetail) {
        AbstractC0560Ms.A02(C01877l.A2d);
        A00();
        return true;
    }
}
