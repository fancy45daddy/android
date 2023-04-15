package com.facebook.ads.redexgen.X;

import a.a.j;
import android.os.Bundle;
import com.facebook.ads.AdError;
import com.facebook.ads.S2SRewardedVideoAdExtendedListener;
import java.util.Arrays;
/* loaded from: assets/audience_network.dex */
public final class Y9 extends AnonymousClass25 implements S2SRewardedVideoAdExtendedListener {
    public static byte[] A02;
    public final YG A00;
    public final AnonymousClass24 A01;

    static {
        A01();
    }

    public static String A00(int i, int i2, int i3) {
        byte[] copyOfRange = Arrays.copyOfRange(A02, i, i + i2);
        for (int i4 = 0; i4 < copyOfRange.length; i4++) {
            copyOfRange[i4] = (byte) ((copyOfRange[i4] ^ i3) ^ 24);
        }
        return new String(copyOfRange);
    }

    public static void A01() {
        A02 = new byte[]{103, 96, 122, 113, 107, 124, 124, 97, 124, 113, 109, 97, 106, 107, 113, 101, 107, 119, 34, 37, 63, 52, 57, 61, 52, 61, 34, 47, 46, 36, 52, 47, 62, 57, 42, 63, 34, 36, 37, 52, 32, 46, 50, 62, 61, 60, 53, 45, 59, 60, 36, 51, 62, 59, 54, 51, 38, 59, 61, 60, 45, 38, 59, 63, 55, 45, 57, 55, 43, 74, 77, 75, 70, 92, 75, 75, 86, 75, 70, 84, 92, 74, 74, 88, 94, 92, 70, 82, 92, 64};
    }

    public Y9(String str, AnonymousClass27 anonymousClass27, YG yg, AnonymousClass24 anonymousClass24) {
        super(str, anonymousClass27);
        this.A00 = yg;
        this.A01 = anonymousClass24;
    }

    public final void onAdClicked(com.facebook.ads.Ad ad) {
        super.A00.ABR(2104, super.A01, null);
    }

    public final void onAdLoaded(com.facebook.ads.Ad ad) {
        Bundle bundle = new Bundle();
        bundle.putLong(A00(43, 26, j.AppCompatTheme_toolbarNavigationButtonStyle), this.A00.A0H());
        bundle.putInt(A00(18, 25, j.AppCompatTheme_windowFixedHeightMinor), this.A01.A00);
        super.A00.ABR(2100, super.A01, bundle);
    }

    public final void onError(com.facebook.ads.Ad ad, AdError adError) {
        Bundle bundle = new Bundle();
        bundle.putString(A00(69, 21, 1), adError.getErrorMessage());
        bundle.putInt(A00(0, 18, 54), adError.getErrorCode());
        super.A00.ABR(2103, super.A01, bundle);
    }

    public final void onLoggingImpression(com.facebook.ads.Ad ad) {
        super.A00.ABR(2105, super.A01, null);
    }

    public final void onRewardServerFailed() {
        super.A00.ABR(3002, super.A01, null);
    }

    public final void onRewardServerSuccess() {
        super.A00.ABR(3001, super.A01, null);
    }

    public final void onRewardedVideoActivityDestroyed() {
        super.A00.ABR(2106, super.A01, null);
    }

    public final void onRewardedVideoClosed() {
        super.A00.ABR(2110, super.A01, null);
    }

    public final void onRewardedVideoCompleted() {
        super.A00.ABR(3000, super.A01, null);
    }
}
