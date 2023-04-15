package com.facebook.ads.redexgen.X;

import androidx.annotation.Nullable;
import com.facebook.ads.AdExperienceType;
import com.facebook.ads.RewardData;
import com.facebook.ads.RewardedVideoAd;
import com.facebook.ads.RewardedVideoAdListener;
/* renamed from: com.facebook.ads.redexgen.X.5c  reason: invalid class name and case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public final class C01365c implements RewardedVideoAd.RewardedVideoAdLoadConfigBuilder, RewardedVideoAd.RewardedVideoLoadAdConfig {
    @Nullable
    public AdExperienceType A00;
    public C01355b A01;
    @Nullable
    public String A02;
    public boolean A03;
    public boolean A04;

    public C01365c(C01355b c01355b) {
        this.A01 = c01355b;
    }

    public final void A00() {
        this.A01.A07(this.A02, this.A00, this.A03, this.A04);
    }

    public final RewardedVideoAd.RewardedVideoLoadAdConfig build() {
        return this;
    }

    public final RewardedVideoAd.RewardedVideoAdLoadConfigBuilder withAdCompanionView(boolean z) {
        this.A04 = z;
        return this;
    }

    public final RewardedVideoAd.RewardedVideoAdLoadConfigBuilder withAdExperience(AdExperienceType adExperienceType) {
        this.A00 = adExperienceType;
        return this;
    }

    public final RewardedVideoAd.RewardedVideoAdLoadConfigBuilder withAdListener(RewardedVideoAdListener rewardedVideoAdListener) {
        this.A01.A06(rewardedVideoAdListener);
        return this;
    }

    public final RewardedVideoAd.RewardedVideoAdLoadConfigBuilder withBid(String str) {
        this.A02 = str;
        return this;
    }

    public final RewardedVideoAd.RewardedVideoAdLoadConfigBuilder withFailOnCacheFailureEnabled(boolean z) {
        this.A03 = z;
        return this;
    }

    public final RewardedVideoAd.RewardedVideoAdLoadConfigBuilder withRewardData(RewardData rewardData) {
        this.A01.A05(rewardData);
        return this;
    }
}
