package com.facebook.ads.redexgen.X;

import com.facebook.ads.AdExperienceType;
import com.facebook.ads.RewardData;
import com.facebook.ads.RewardedInterstitialAd;
import com.facebook.ads.RewardedInterstitialAdListener;
/* renamed from: com.facebook.ads.redexgen.X.5Z  reason: invalid class name */
/* loaded from: assets/audience_network.dex */
public final class C5Z implements RewardedInterstitialAd.RewardedInterstitialAdLoadConfigBuilder, RewardedInterstitialAd.RewardedInterstitialLoadAdConfig {
    public final C01365c A00;

    public C5Z(C01365c c01365c) {
        this.A00 = c01365c;
        this.A00.withAdExperience(AdExperienceType.AD_EXPERIENCE_TYPE_REWARDED_INTERSTITIAL);
    }

    public final void A00() {
        this.A00.A00();
    }

    public final RewardedInterstitialAd.RewardedInterstitialLoadAdConfig build() {
        return this;
    }

    public final RewardedInterstitialAd.RewardedInterstitialAdLoadConfigBuilder withAdListener(RewardedInterstitialAdListener rewardedInterstitialAdListener) {
        this.A00.withAdListener(new C5Y(rewardedInterstitialAdListener));
        return this;
    }

    public final RewardedInterstitialAd.RewardedInterstitialAdLoadConfigBuilder withBid(String str) {
        this.A00.withBid(str);
        return this;
    }

    public final RewardedInterstitialAd.RewardedInterstitialAdLoadConfigBuilder withFailOnCacheFailureEnabled(boolean z) {
        this.A00.withFailOnCacheFailureEnabled(z);
        return this;
    }

    public final RewardedInterstitialAd.RewardedInterstitialAdLoadConfigBuilder withRewardData(RewardData rewardData) {
        this.A00.withRewardData(rewardData);
        return this;
    }
}
