package com.facebook.ads.redexgen.X;

import a.a.j;
import android.content.Context;
import androidx.annotation.Nullable;
import com.facebook.ads.AdError;
import com.facebook.ads.CacheFlag;
import com.facebook.ads.ExtraHints;
import com.facebook.ads.InterstitialAd;
import com.facebook.ads.InterstitialAdListener;
import com.facebook.ads.RewardData;
import com.facebook.ads.RewardedAdListener;
import com.facebook.ads.internal.api.AdCompanionView;
import com.facebook.ads.internal.api.InterstitialAdApi;
import com.facebook.ads.internal.context.Repairable;
import com.facebook.ads.internal.protocol.AdPlacementType;
import java.util.Arrays;
import java.util.EnumSet;
/* renamed from: com.facebook.ads.redexgen.X.5I  reason: invalid class name */
/* loaded from: assets/audience_network.dex */
public final class C5I implements InterstitialAdApi, Repairable {
    public static byte[] A05;
    public static String[] A06 = {"S822El9zG6GuADGrtluuLX363osWhxiG", "ZFI3hp6NIHNPBZ8p7tKJKM6DxTur89gU", "rKe2xKovfMLHVnc2kJBHIfRtW7KI2joW", "CTsEdbmp9bu3ZhSS7yZH02ALmjP1FNtP", "mPYAOoIIU9PuPwOlU3lFT13mhy9mIxzC", "", "", "HqZNdyzgU2LJRhG9zHJvoyCPzWSUAGCn"};
    public boolean A00;
    public final InterstitialAd A01;
    public final AnonymousClass20 A02;
    public final E7 A03;
    public final C0806Wj A04;

    public static String A00(int i, int i2, int i3) {
        byte[] copyOfRange = Arrays.copyOfRange(A05, i, i + i2);
        for (int i4 = 0; i4 < copyOfRange.length; i4++) {
            int i5 = copyOfRange[i4] - i3;
            if (A06[0].charAt(22) != '3') {
                throw new RuntimeException();
            }
            A06[4] = "dLq0XFJawohP2A9uDPm8W8ZKhW9iXRhW";
            copyOfRange[i4] = (byte) (i5 - 126);
        }
        return new String(copyOfRange);
    }

    public static void A01() {
        A05 = new byte[]{-32, 20, 18, -24, -29, 21, 21, 19, -70, -25, -67, -67, -74, -24, -26, -22, 56, 93, 99, 84, 97, 93, 80, 91, 15, 84, 97, 97, 94, 97, 29, -7, -49, -12, -6, -21, -8, -7, -6, -17, -6, -17, -25, -14, -90, -25, -22, -90, -22, -21, -7, -6, -8, -11, -1, -21, -22, -29, 8, 14, -1, 12, 13, 14, 3, 14, 3, -5, 6, -70, -5, -2, -70, 6, 9, -5, -2, -70, 12, -1, 11, 15, -1, 13, 14, -1, -2, -56, -19, -13, -28, -15, -14, -13, -24, -13, -24, -32, -21, -97, -32, -29, -97, -14, -25, -18, -10, -97, -30, -32, -21, -21, -28, -29, 7, -42, 9, -34, 7, -38, -35, -10, -9, 5, 6, 4, 1, 11, -28, -17, -52, -17, -31, -28, -63, -28, 49, 38, 45, 53};
    }

    static {
        A01();
    }

    public C5I(Context context, String str, InterstitialAd interstitialAd) {
        this.A01 = interstitialAd;
        this.A04 = C5G.A03(context);
        this.A04.A0D().A2g(AdPlacementType.INTERSTITIAL.toString(), str);
        this.A02 = new AnonymousClass20(this.A04, interstitialAd, str);
        this.A04.A0G(this);
        this.A03 = new E7(this.A02);
    }

    public final void A02(InterstitialAdListener interstitialAdListener) {
        this.A04.A0D().A2Z(interstitialAdListener != null);
        this.A02.A0D(interstitialAdListener);
        if (A06[0].charAt(22) != '3') {
            throw new RuntimeException();
        }
        A06[4] = "rYQ6gTbtajntBm3fXVm84HcfyQ9ACN8J";
    }

    public final void A03(RewardData rewardData) {
        this.A02.A0E(rewardData);
    }

    public final void A04(RewardedAdListener rewardedAdListener) {
        this.A02.A0F(rewardedAdListener);
    }

    public final void A05(EnumSet<CacheFlag> enumSet, @Nullable String str, boolean z) {
        JH.A05(A00(128, 8, 2), A00(57, 30, 28), A00(j.AppCompatTheme_windowFixedHeightMajor, 7, 39));
        if (str == null) {
            this.A04.A0D().A2d();
        } else {
            this.A04.A0D().A2c();
        }
        this.A00 = z;
        this.A03.A09(this.A01, enumSet, str);
        this.A04.A0D().A2b();
    }

    public final InterstitialAd.InterstitialAdLoadConfigBuilder buildLoadAdConfig() {
        return new C5J(this);
    }

    public final InterstitialAd.InterstitialAdShowConfigBuilder buildShowAdConfig() {
        return new C5K();
    }

    public final void destroy() {
        JH.A05(A00(121, 7, 20), A00(32, 25, 8), A00(8, 8, 7));
        if (ID.A1b(this.A04)) {
            return;
        }
        this.A03.A05();
        this.A04.A0D().A2h();
    }

    public final void finalize() {
        this.A03.A04();
    }

    public final String getPlacementId() {
        return this.A02.A09();
    }

    public final boolean isAdInvalidated() {
        boolean A0A = this.A03.A0A();
        this.A04.A0D().A4Y(A0A);
        return A0A;
    }

    public final boolean isAdLoaded() {
        return this.A03.A0B();
    }

    public final void loadAd() {
        A05(CacheFlag.ALL, null, false);
    }

    public final void loadAd(InterstitialAd.InterstitialLoadAdConfig interstitialLoadAdConfig) {
        ((C5J) interstitialLoadAdConfig).A00();
    }

    public final void registerAdCompanionView(AdCompanionView adCompanionView) {
        if (this.A00 && this.A03.A07() != null) {
            this.A03.A07().A0H(adCompanionView);
        }
    }

    public final void repair(Throwable th) {
        if (this.A02.A02() != null) {
            InterstitialAdListener A02 = this.A02.A02();
            InterstitialAd interstitialAd = this.A01;
            A02.onError(interstitialAd, new AdError(2001, A00(16, 16, j.AppCompatTheme_windowActionModeOverlay) + C0513Kw.A03(this.A04, th)));
        }
    }

    @Deprecated
    public final void setExtraHints(ExtraHints extraHints) {
        this.A02.A0H(extraHints.getHints());
        this.A02.A0I(extraHints.getMediationData());
    }

    public final boolean show() {
        JH.A05(A00(136, 4, 64), A00(87, 27, 1), A00(0, 8, 49));
        this.A04.A0D().A2m();
        boolean A0C = this.A03.A0C(this.A01, new C5K());
        this.A04.A0D().A2l(A0C);
        return A0C;
    }

    public final boolean show(InterstitialAd.InterstitialShowAdConfig interstitialShowAdConfig) {
        this.A04.A0D().A2m();
        boolean A0C = this.A03.A0C(this.A01, interstitialShowAdConfig);
        this.A04.A0D().A2l(A0C);
        return A0C;
    }

    public final void unregisterAdCompanionView() {
        if (this.A00 && this.A03.A07() != null) {
            this.A03.A07().A0G();
        }
    }
}
