package com.facebook.ads.redexgen.X;

import androidx.annotation.Nullable;
import com.facebook.ads.AdListener;
import com.facebook.ads.AdView;
/* renamed from: com.facebook.ads.redexgen.X.Ig  reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public final class C0449Ig implements AdView.AdViewLoadConfigBuilder, AdView.AdViewLoadConfig {
    @Nullable
    public String A00;
    public final AnonymousClass54 A01;

    public C0449Ig(AnonymousClass54 anonymousClass54) {
        this.A01 = anonymousClass54;
    }

    @Nullable
    public final String A00() {
        return this.A00;
    }

    public final AdView.AdViewLoadConfig build() {
        return this;
    }

    public final AdView.AdViewLoadConfigBuilder withAdListener(AdListener adListener) {
        this.A01.A0C(adListener);
        return this;
    }

    public final AdView.AdViewLoadConfigBuilder withBid(String str) {
        this.A00 = str;
        return this;
    }
}
