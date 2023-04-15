package com.facebook.ads.redexgen.X;

import com.facebook.ads.AdError;
import com.facebook.ads.RewardedInterstitialAdExtendedListener;
import com.facebook.ads.RewardedInterstitialAdListener;
import com.facebook.ads.RewardedVideoAdExtendedListener;
import com.facebook.ads.S2SRewardedInterstitialAdListener;
import com.facebook.ads.S2SRewardedVideoAdExtendedListener;
import com.facebook.ads.S2SRewardedVideoAdListener;
/* renamed from: com.facebook.ads.redexgen.X.5Y  reason: invalid class name */
/* loaded from: assets/audience_network.dex */
public class C5Y implements RewardedVideoAdExtendedListener, S2SRewardedVideoAdListener, S2SRewardedVideoAdExtendedListener {
    public final RewardedInterstitialAdListener A00;

    public C5Y(RewardedInterstitialAdListener rewardedInterstitialAdListener) {
        this.A00 = rewardedInterstitialAdListener;
    }

    public final void onAdClicked(com.facebook.ads.Ad ad) {
        this.A00.onAdClicked(ad);
    }

    public final void onAdLoaded(com.facebook.ads.Ad ad) {
        this.A00.onAdLoaded(ad);
    }

    public final void onError(com.facebook.ads.Ad ad, AdError adError) {
        this.A00.onError(ad, adError);
    }

    public final void onLoggingImpression(com.facebook.ads.Ad ad) {
        this.A00.onLoggingImpression(ad);
    }

    public final void onRewardServerFailed() {
        S2SRewardedInterstitialAdListener s2SRewardedInterstitialAdListener = this.A00;
        if (s2SRewardedInterstitialAdListener instanceof S2SRewardedInterstitialAdListener) {
            s2SRewardedInterstitialAdListener.onRewardServerFailed();
        }
    }

    public final void onRewardServerSuccess() {
        S2SRewardedInterstitialAdListener s2SRewardedInterstitialAdListener = this.A00;
        if (s2SRewardedInterstitialAdListener instanceof S2SRewardedInterstitialAdListener) {
            s2SRewardedInterstitialAdListener.onRewardServerSuccess();
        }
    }

    public final void onRewardedVideoActivityDestroyed() {
        RewardedInterstitialAdExtendedListener rewardedInterstitialAdExtendedListener = this.A00;
        if (rewardedInterstitialAdExtendedListener instanceof RewardedInterstitialAdExtendedListener) {
            rewardedInterstitialAdExtendedListener.onRewardedInterstitialActivityDestroyed();
        }
    }

    public final void onRewardedVideoClosed() {
        this.A00.onRewardedInterstitialClosed();
    }

    public final void onRewardedVideoCompleted() {
        this.A00.onRewardedInterstitialCompleted();
    }
}
