package com.facebook.ads.redexgen.X;

import com.facebook.ads.RewardedInterstitialAd;
/* renamed from: com.facebook.ads.redexgen.X.5a  reason: invalid class name and case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public final class C01345a implements RewardedInterstitialAd.RewardedInterstitialAdShowConfigBuilder, RewardedInterstitialAd.RewardedInterstitialShowAdConfig {
    public final C01375d A00;

    public C01345a(C01375d c01375d) {
        this.A00 = c01375d;
    }

    public final C01375d A00() {
        return this.A00;
    }

    public final RewardedInterstitialAd.RewardedInterstitialShowAdConfig build() {
        return this;
    }

    public final RewardedInterstitialAd.RewardedInterstitialAdShowConfigBuilder withAppOrientation(int i) {
        this.A00.withAppOrientation(i);
        return this;
    }
}
