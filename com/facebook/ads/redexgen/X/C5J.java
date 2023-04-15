package com.facebook.ads.redexgen.X;

import androidx.annotation.Nullable;
import com.facebook.ads.CacheFlag;
import com.facebook.ads.InterstitialAd;
import com.facebook.ads.InterstitialAdExtendedListener;
import com.facebook.ads.InterstitialAdListener;
import com.facebook.ads.RewardData;
import com.facebook.ads.RewardedAdListener;
import java.util.EnumSet;
/* renamed from: com.facebook.ads.redexgen.X.5J  reason: invalid class name */
/* loaded from: assets/audience_network.dex */
public final class C5J implements InterstitialAd.InterstitialAdLoadConfigBuilder, InterstitialAd.InterstitialLoadAdConfig {
    public C5I A00;
    @Nullable
    public String A01;
    public EnumSet<CacheFlag> A02;
    public boolean A03;

    public C5J(C5I c5i) {
        this.A00 = c5i;
    }

    public final void A00() {
        if (this.A02 == null) {
            this.A02 = CacheFlag.ALL;
        }
        this.A00.A05(this.A02, this.A01, this.A03);
    }

    public final InterstitialAd.InterstitialLoadAdConfig build() {
        return this;
    }

    public final InterstitialAd.InterstitialAdLoadConfigBuilder withAdCompanionView(boolean z) {
        this.A03 = z;
        return this;
    }

    public final InterstitialAd.InterstitialAdLoadConfigBuilder withAdListener(InterstitialAdListener interstitialAdListener) {
        this.A00.A02(interstitialAdListener);
        if (interstitialAdListener instanceof InterstitialAdExtendedListener) {
            this.A00.A04((InterstitialAdExtendedListener) interstitialAdListener);
        }
        return this;
    }

    public final InterstitialAd.InterstitialAdLoadConfigBuilder withBid(String str) {
        this.A01 = str;
        return this;
    }

    public final InterstitialAd.InterstitialAdLoadConfigBuilder withCacheFlags(EnumSet<CacheFlag> cacheFlags) {
        this.A02 = cacheFlags;
        return this;
    }

    public final InterstitialAd.InterstitialAdLoadConfigBuilder withRewardData(RewardData rewardData) {
        this.A00.A03(rewardData);
        return this;
    }

    public final InterstitialAd.InterstitialAdLoadConfigBuilder withRewardedAdListener(RewardedAdListener rewardedAdListener) {
        this.A00.A04(rewardedAdListener);
        return this;
    }
}
