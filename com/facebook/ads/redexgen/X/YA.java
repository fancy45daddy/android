package com.facebook.ads.redexgen.X;

import a.a.j;
import android.os.Bundle;
import com.facebook.ads.AdError;
import com.facebook.ads.InterstitialAdExtendedListener;
import java.util.Arrays;
/* loaded from: assets/audience_network.dex */
public final class YA extends AnonymousClass25 implements InterstitialAdExtendedListener {
    public static byte[] A01;
    public final YJ A00;

    static {
        A01();
    }

    public static String A00(int i, int i2, int i3) {
        byte[] copyOfRange = Arrays.copyOfRange(A01, i, i + i2);
        for (int i4 = 0; i4 < copyOfRange.length; i4++) {
            copyOfRange[i4] = (byte) ((copyOfRange[i4] - i3) - 77);
        }
        return new String(copyOfRange);
    }

    public static void A01() {
        A01 = new byte[]{-68, -63, -57, -46, -72, -59, -59, -62, -59, -46, -74, -62, -73, -72, -46, -66, -72, -52, -103, -100, -101, -108, -84, -106, -101, -93, -114, -103, -106, -111, -114, -95, -106, -100, -101, -84, -95, -106, -102, -110, -84, -104, -110, -90, 15, 16, 14, 27, 1, 14, 14, 11, 14, 27, 9, 1, 15, 15, -3, 3, 1, 27, 7, 1, 21};
    }

    public YA(String str, AnonymousClass27 anonymousClass27, YJ yj) {
        super(str, anonymousClass27);
        this.A00 = yj;
    }

    public final void onAdClicked(com.facebook.ads.Ad ad) {
        super.A00.ABR(1024, this.A01, null);
    }

    public final void onAdLoaded(com.facebook.ads.Ad ad) {
        Bundle bundle = new Bundle();
        bundle.putLong(A00(18, 26, 0), this.A00.A0E());
        super.A00.ABR(1020, this.A01, bundle);
    }

    public final void onError(com.facebook.ads.Ad ad, AdError adError) {
        Bundle bundle = new Bundle();
        bundle.putString(A00(44, 21, j.AppCompatTheme_windowActionBar), adError.getErrorMessage());
        bundle.putInt(A00(0, 18, 38), adError.getErrorCode());
        super.A00.ABR(1023, this.A01, bundle);
    }

    public final void onInterstitialActivityDestroyed() {
        super.A00.ABR(1026, this.A01, null);
    }

    public final void onInterstitialDismissed(com.facebook.ads.Ad ad) {
        super.A00.ABR(1022, this.A01, null);
    }

    public final void onInterstitialDisplayed(com.facebook.ads.Ad ad) {
        super.A00.ABR(1021, this.A01, null);
    }

    public final void onLoggingImpression(com.facebook.ads.Ad ad) {
        super.A00.ABR(1025, this.A01, null);
    }

    public final void onRewardedAdCompleted() {
        super.A00.ABR(3000, this.A01, null);
    }

    public final void onRewardedAdServerFailed() {
        super.A00.ABR(3002, this.A01, null);
    }

    public final void onRewardedAdServerSucceeded() {
        super.A00.ABR(3001, this.A01, null);
    }
}
