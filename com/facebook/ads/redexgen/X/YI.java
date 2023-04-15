package com.facebook.ads.redexgen.X;

import com.facebook.ads.AdError;
import com.facebook.ads.RewardedVideoAd;
import com.facebook.ads.RewardedVideoAdListener;
import com.facebook.ads.S2SRewardedVideoAdExtendedListener;
import java.util.Arrays;
/* loaded from: assets/audience_network.dex */
public class YI extends AbstractC00210o {
    public static byte[] A01;
    public static String[] A02 = {"7kSkrPID5YMo1WnvaMIgpKB6WIhQPZTc", "kYnVnFR0h3Yv", "", "4OZGrpocgzJPR2XOpe36kiptmUtlR1IY", "AELVZqmE3v", "ezzX0t3o6v3ClFiCUOYeN27kq8G", "mBbxV2ZqaJcWXY", "eL94qTtIFL"};
    public final /* synthetic */ YG A00;

    public static String A00(int i, int i2, int i3) {
        byte[] copyOfRange = Arrays.copyOfRange(A01, i, i + i2);
        for (int i4 = 0; i4 < copyOfRange.length; i4++) {
            copyOfRange[i4] = (byte) ((copyOfRange[i4] - i3) - 61);
        }
        return new String(copyOfRange);
    }

    public static void A01() {
        A01 = new byte[]{-28, -13, -20, -53, -41, -42, -36, -38, -41, -44, -44, -51, -38, -120, -47, -37, -120, -42, -35, -44, -44};
    }

    static {
        A01();
    }

    public YI(YG yg) {
        this.A00 = yg;
    }

    @Override // com.facebook.ads.redexgen.X.AbstractC00210o
    public final void A06() {
        S2SRewardedVideoAdExtendedListener s2SRewardedVideoAdExtendedListener;
        s2SRewardedVideoAdExtendedListener = this.A00.A0B;
        s2SRewardedVideoAdExtendedListener.onRewardServerFailed();
    }

    @Override // com.facebook.ads.redexgen.X.AbstractC00210o
    public final void A07() {
        S2SRewardedVideoAdExtendedListener s2SRewardedVideoAdExtendedListener;
        s2SRewardedVideoAdExtendedListener = this.A00.A0B;
        s2SRewardedVideoAdExtendedListener.onRewardServerSuccess();
    }

    @Override // com.facebook.ads.redexgen.X.AbstractC00210o
    public final void A08() {
        RewardedVideoAd rewardedVideoAd;
        S2SRewardedVideoAdExtendedListener s2SRewardedVideoAdExtendedListener;
        rewardedVideoAd = this.A00.A03;
        if (rewardedVideoAd == null) {
            s2SRewardedVideoAdExtendedListener = this.A00.A0B;
            s2SRewardedVideoAdExtendedListener.onRewardedVideoCompleted();
        }
    }

    @Override // com.facebook.ads.redexgen.X.AbstractC00210o
    public final void A09() {
        RewardedVideoAd rewardedVideoAd;
        S2SRewardedVideoAdExtendedListener s2SRewardedVideoAdExtendedListener;
        rewardedVideoAd = this.A00.A03;
        if (rewardedVideoAd == null) {
            s2SRewardedVideoAdExtendedListener = this.A00.A0B;
            s2SRewardedVideoAdExtendedListener.onRewardedVideoActivityDestroyed();
        }
    }

    @Override // com.facebook.ads.redexgen.X.AbstractC00210o
    public final void A0A() {
        RewardedVideoAd rewardedVideoAd;
        RewardedVideoAd rewardedVideoAd2;
        long j;
        RewardedVideoAd rewardedVideoAd3;
        S2SRewardedVideoAdExtendedListener s2SRewardedVideoAdExtendedListener;
        L6 l6;
        rewardedVideoAd = this.A00.A03;
        if (rewardedVideoAd != null) {
            rewardedVideoAd2 = this.A00.A03;
            C01375d c01375d = (C01375d) rewardedVideoAd2.buildShowAdConfig();
            long currentTimeMillis = System.currentTimeMillis();
            j = this.A00.A02;
            c01375d.A02(currentTimeMillis - j);
            rewardedVideoAd3 = this.A00.A03;
            rewardedVideoAd3.show(c01375d.build());
            return;
        }
        s2SRewardedVideoAdExtendedListener = this.A00.A0B;
        s2SRewardedVideoAdExtendedListener.onRewardedVideoClosed();
        l6 = this.A00.A07;
        l6.A05();
    }

    @Override // com.facebook.ads.redexgen.X.AbstractC00210o
    public final void A0C() {
        S2SRewardedVideoAdExtendedListener s2SRewardedVideoAdExtendedListener;
        AnonymousClass24 anonymousClass24;
        s2SRewardedVideoAdExtendedListener = this.A00.A0B;
        anonymousClass24 = this.A00.A0C;
        s2SRewardedVideoAdExtendedListener.onAdClicked(anonymousClass24.A00());
    }

    @Override // com.facebook.ads.redexgen.X.AbstractC00210o
    public final void A0D() {
        S2SRewardedVideoAdExtendedListener s2SRewardedVideoAdExtendedListener;
        AnonymousClass24 anonymousClass24;
        s2SRewardedVideoAdExtendedListener = this.A00.A0B;
        anonymousClass24 = this.A00.A0C;
        s2SRewardedVideoAdExtendedListener.onLoggingImpression(anonymousClass24.A00());
    }

    @Override // com.facebook.ads.redexgen.X.AbstractC00210o
    public final void A0F(InterfaceC00200n interfaceC00200n) {
        E8 e8;
        E8 e82;
        AnonymousClass24 anonymousClass24;
        AnonymousClass24 anonymousClass242;
        E8 e83;
        AnonymousClass18 anonymousClass18;
        RewardedVideoAd rewardedVideoAd;
        S2SRewardedVideoAdExtendedListener s2SRewardedVideoAdExtendedListener;
        AnonymousClass24 anonymousClass243;
        AnonymousClass18 anonymousClass182;
        RewardedVideoAd rewardedVideoAd2;
        AnonymousClass18 anonymousClass183;
        AnonymousClass24 anonymousClass244;
        RewardedVideoAd rewardedVideoAd3;
        AnonymousClass18 anonymousClass184;
        AnonymousClass24 anonymousClass245;
        AnonymousClass18 anonymousClass185;
        AnonymousClass24 anonymousClass246;
        AnonymousClass24 anonymousClass247;
        AnonymousClass24 anonymousClass248;
        e8 = this.A00.A05;
        if (e8 == null) {
            this.A00.A0A.A06().A8u(A00(0, 3, 70), C01877l.A0N, new C01887m(A00(3, 18, 43)));
            return;
        }
        YG yg = this.A00;
        e82 = yg.A05;
        yg.A08 = e82.A0E();
        AbstractC0872Yz abstractC0872Yz = (AbstractC0872Yz) interfaceC00200n;
        anonymousClass24 = this.A00.A0C;
        if (anonymousClass24.A03 != null) {
            anonymousClass248 = this.A00.A0C;
            abstractC0872Yz.A02(anonymousClass248.A03);
        }
        anonymousClass242 = this.A00.A0C;
        int A0D = abstractC0872Yz.A0D();
        String[] strArr = A02;
        if (strArr[4].length() != strArr[7].length()) {
            throw new RuntimeException();
        }
        String[] strArr2 = A02;
        strArr2[4] = "61YjDYRNNN";
        strArr2[7] = "vT3ubuaNP5";
        anonymousClass242.A00 = A0D;
        this.A00.A09 = true;
        YG yg2 = this.A00;
        e83 = yg2.A05;
        yg2.A04 = e83.A0T();
        anonymousClass18 = this.A00.A04;
        if (anonymousClass18 != null) {
            anonymousClass184 = this.A00.A04;
            if (anonymousClass184.A0G() > 0) {
                KN kn = new KN();
                C0806Wj c0806Wj = this.A00.A0A;
                anonymousClass245 = this.A00.A0C;
                String str = anonymousClass245.A06;
                anonymousClass185 = this.A00.A04;
                if (kn.A09(c0806Wj, str, anonymousClass185.A0G())) {
                    kn.A08(this.A00.A0A, true);
                    YG yg3 = this.A00;
                    C0806Wj c0806Wj2 = yg3.A0A;
                    anonymousClass246 = this.A00.A0C;
                    String str2 = anonymousClass246.A0C;
                    anonymousClass247 = this.A00.A0C;
                    yg3.A03 = kn.A07(c0806Wj2, str2, anonymousClass247.A06);
                } else {
                    kn.A08(this.A00.A0A, false);
                }
            }
        }
        rewardedVideoAd = this.A00.A03;
        if (rewardedVideoAd == null) {
            s2SRewardedVideoAdExtendedListener = this.A00.A0B;
            anonymousClass243 = this.A00.A0C;
            s2SRewardedVideoAdExtendedListener.onAdLoaded(anonymousClass243.A00());
            return;
        }
        anonymousClass182 = this.A00.A04;
        anonymousClass182.A0m(true);
        rewardedVideoAd2 = this.A00.A03;
        RewardedVideoAd.RewardedVideoAdLoadConfigBuilder withFailOnCacheFailureEnabled = rewardedVideoAd2.buildLoadAdConfig().withFailOnCacheFailureEnabled(true);
        anonymousClass183 = this.A00.A04;
        RewardedVideoAd.RewardedVideoAdLoadConfigBuilder withRewardData = withFailOnCacheFailureEnabled.withRewardData(anonymousClass183.A0M());
        anonymousClass244 = this.A00.A0C;
        RewardedVideoAd.RewardedVideoLoadAdConfig loadAdConfig = withRewardData.withAdExperience(anonymousClass244.A02).withAdListener(new RewardedVideoAdListener() { // from class: com.facebook.ads.redexgen.X.1z
            public final void onAdClicked(com.facebook.ads.Ad ad) {
            }

            public final void onAdLoaded(com.facebook.ads.Ad ad) {
                S2SRewardedVideoAdExtendedListener s2SRewardedVideoAdExtendedListener2;
                AnonymousClass24 anonymousClass249;
                s2SRewardedVideoAdExtendedListener2 = YI.this.A00.A0B;
                anonymousClass249 = YI.this.A00.A0C;
                s2SRewardedVideoAdExtendedListener2.onAdLoaded(anonymousClass249.A00());
            }

            public final void onError(com.facebook.ads.Ad ad, AdError adError) {
                AnonymousClass18 anonymousClass186;
                S2SRewardedVideoAdExtendedListener s2SRewardedVideoAdExtendedListener2;
                AnonymousClass24 anonymousClass249;
                YI.this.A00.A03 = null;
                anonymousClass186 = YI.this.A00.A04;
                anonymousClass186.A0m(false);
                s2SRewardedVideoAdExtendedListener2 = YI.this.A00.A0B;
                anonymousClass249 = YI.this.A00.A0C;
                s2SRewardedVideoAdExtendedListener2.onAdLoaded(anonymousClass249.A00());
            }

            public final void onLoggingImpression(com.facebook.ads.Ad ad) {
            }

            public final void onRewardedVideoClosed() {
                S2SRewardedVideoAdExtendedListener s2SRewardedVideoAdExtendedListener2;
                L6 l6;
                s2SRewardedVideoAdExtendedListener2 = YI.this.A00.A0B;
                s2SRewardedVideoAdExtendedListener2.onRewardedVideoClosed();
                l6 = YI.this.A00.A07;
                l6.A05();
            }

            public final void onRewardedVideoCompleted() {
                S2SRewardedVideoAdExtendedListener s2SRewardedVideoAdExtendedListener2;
                s2SRewardedVideoAdExtendedListener2 = YI.this.A00.A0B;
                s2SRewardedVideoAdExtendedListener2.onRewardedVideoCompleted();
            }
        }).build();
        rewardedVideoAd3 = this.A00.A03;
        rewardedVideoAd3.loadAd(loadAdConfig);
    }

    @Override // com.facebook.ads.redexgen.X.AbstractC00210o
    public final void A0G(J3 j3) {
        AnonymousClass24 anonymousClass24;
        long j;
        S2SRewardedVideoAdExtendedListener s2SRewardedVideoAdExtendedListener;
        AnonymousClass24 anonymousClass242;
        this.A00.A0F(true);
        anonymousClass24 = this.A00.A0C;
        C0R A0D = anonymousClass24.A0B.A0D();
        j = this.A00.A01;
        A0D.A2a(L5.A01(j), j3.A03().getErrorCode(), j3.A04());
        s2SRewardedVideoAdExtendedListener = this.A00.A0B;
        anonymousClass242 = this.A00.A0C;
        s2SRewardedVideoAdExtendedListener.onError(anonymousClass242.A00(), KP.A00(j3));
    }
}
