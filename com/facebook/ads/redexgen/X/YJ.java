package com.facebook.ads.redexgen.X;

import android.util.Log;
import androidx.annotation.Nullable;
import com.facebook.ads.AdError;
import com.facebook.ads.CacheFlag;
import com.facebook.ads.InterstitialAd;
import com.facebook.ads.InterstitialAdExtendedListener;
import com.facebook.ads.internal.api.AdCompanionView;
import com.facebook.ads.internal.protocol.AdErrorType;
import com.facebook.ads.internal.protocol.AdPlacementType;
import java.util.Arrays;
import java.util.EnumSet;
/* loaded from: assets/audience_network.dex */
public final class YJ implements InterfaceC00561x {
    public static byte[] A0B;
    public static String[] A0C = {"Q9RghtL5kPMxXUG2hlpmHrVaJwYYGwGq", "TIO3FaU0Mikock0w3rckrPhiuYRMfGhJ", "k6SAISDvmHdOF1rkjeEeymm6HvDlJVR0", "eDRhFd25R2oFsFg27vb0d5UADzs1KoZv", "MaVPWgska1IH7XOKtPwNB8GdxIWUIxDt", "dS1g8OO0fBonmOwqVSSlXi39LbvMIXQb", "JdFW5Fpsu4G", "QGzwgj8zvaLwI8"};
    public static final String A0D;
    @Nullable
    public InterstitialAd A01;
    @Nullable
    public AnonymousClass18 A02;
    @Nullable
    public EC A03;
    @Nullable
    public XT A04;
    public boolean A06;
    public boolean A07;
    public final C0806Wj A08;
    public final InterstitialAdExtendedListener A09;
    public final AnonymousClass20 A0A;
    public long A00 = -1;
    public L6 A05 = new L6();

    public static String A0A(int i, int i2, int i3) {
        byte[] copyOfRange = Arrays.copyOfRange(A0B, i, i + i2);
        for (int i4 = 0; i4 < copyOfRange.length; i4++) {
            copyOfRange[i4] = (byte) ((copyOfRange[i4] - i3) - 110);
        }
        return new String(copyOfRange);
    }

    public static void A0B() {
        A0B = new byte[]{-59, -14, -92, -27, -24, -92, -16, -13, -27, -24, -92, -19, -9, -92, -27, -16, -10, -23, -27, -24, -3, -92, -19, -14, -92, -12, -10, -13, -21, -10, -23, -9, -9, -78, -92, -35, -13, -7, -92, -9, -20, -13, -7, -16, -24, -92, -5, -27, -19, -8, -92, -22, -13, -10, -92, -27, -24, -48, -13, -27, -24, -23, -24, -84, -83, -92, -8, -13, -92, -26, -23, -92, -25, -27, -16, -16, -23, -24, -4, 33, 39, 24, 37, 38, 39, 28, 39, 28, 20, 31, -45, 31, 34, 20, 23, -45, 22, 20, 31, 31, 24, 23, -45, 42, 27, 28, 31, 24, -45, 38, 27, 34, 42, 28, 33, 26, -45, 28, 33, 39, 24, 37, 38, 39, 28, 39, 28, 20, 31, -31, 13, 28, 21};
    }

    static {
        A0B();
        A0D = YJ.class.getSimpleName();
    }

    public YJ(AnonymousClass20 anonymousClass20, AnonymousClass27 anonymousClass27, String str) {
        this.A0A = anonymousClass20;
        this.A08 = anonymousClass20.A05();
        this.A09 = new YA(str, anonymousClass27, this);
    }

    public final long A0E() {
        EC ec = this.A03;
        if (ec != null) {
            return ec.A0B();
        }
        return -1L;
    }

    public final void A0F() {
        EC ec = this.A03;
        if (ec != null) {
            ec.A0M(new YK(this));
            this.A03.A0R(true);
            this.A03 = null;
            this.A07 = false;
            this.A06 = false;
        }
    }

    public final void A0G() {
        XT xt = this.A04;
        if (xt != null) {
            xt.A02();
        }
    }

    public final void A0H(AdCompanionView adCompanionView) {
        AnonymousClass18 anonymousClass18;
        this.A04 = (XT) adCompanionView.getAdCompanionViewApi();
        C0806Wj c0806Wj = this.A08;
        if (c0806Wj != null && (anonymousClass18 = this.A02) != null) {
            this.A04.A03(c0806Wj, anonymousClass18);
        }
    }

    public final void A0I(@Nullable EnumSet<CacheFlag> enumSet, @Nullable String str) {
        String A02;
        this.A00 = System.currentTimeMillis();
        if (!this.A07 && this.A03 != null) {
            Log.w(A0D, A0A(0, 78, 22));
        }
        this.A07 = false;
        if (this.A06 && !ID.A0g(this.A08)) {
            this.A08.A06().A8u(A0A(130, 3, 62), C01877l.A0L, new C01887m(A0A(78, 52, 69)));
            AdErrorType adErrorType = AdErrorType.LOAD_CALLED_WHILE_SHOWING_AD;
            this.A08.A0D().A2a(L5.A01(this.A00), adErrorType.getErrorCode(), adErrorType.getDefaultErrorMessage());
            this.A09.onError(this.A0A.A01(), new AdError(adErrorType.getErrorCode(), adErrorType.getDefaultErrorMessage()));
            return;
        }
        EC ec = this.A03;
        if (ec != null) {
            ec.A0M(new YO(this));
            this.A03.A0H();
            this.A03 = null;
        }
        C00481p c00481p = new C00481p(this.A0A.A09(), JA.A00(this.A08.getResources().getDisplayMetrics()), AdPlacementType.INTERSTITIAL, J6.A07, 1, enumSet);
        if (ID.A1q(this.A08) && (A02 = KN.A02(this.A08, this.A0A.A07())) != null) {
            AnonymousClass20 anonymousClass20 = this.A0A;
            if (A0C[6].length() != 11) {
                throw new RuntimeException();
            }
            String[] strArr = A0C;
            strArr[3] = "6YCA3PHZSlLj0jmN2b2hvaW99ZyRMwjh";
            strArr[5] = "7PoIPIeUN8KAt8vfreK3c69iBAU82q7R";
            anonymousClass20.A0H(A02);
        }
        c00481p.A06(this.A0A.A07());
        c00481p.A07(this.A0A.A08());
        c00481p.A04(this.A0A.A03());
        this.A03 = new EC(this.A08, c00481p);
        this.A03.A0M(new YL(this));
        this.A03.A0P(str);
    }

    public final boolean A0J() {
        EC ec = this.A03;
        return ec == null || ec.A0S();
    }

    public final boolean A0K() {
        return this.A07;
    }

    public final boolean A0L() {
        AdError adError = AdError.SHOW_CALLED_BEFORE_LOAD_ERROR;
        if (!this.A07) {
            this.A08.A0D().A2a(L5.A01(this.A00), adError.getErrorCode(), adError.getErrorMessage());
            this.A09.onError(this.A0A.A01(), adError);
            return false;
        }
        EC ec = this.A03;
        if (ec == null) {
            this.A08.A06().A8u(A0A(130, 3, 62), C01877l.A0S, new C01887m(AdErrorType.INTERSTITIAL_CONTROLLER_IS_NULL.getDefaultErrorMessage()));
            this.A08.A0D().A2a(L5.A01(this.A00), adError.getErrorCode(), adError.getErrorMessage());
            this.A09.onError(this.A0A.A01(), adError);
            return false;
        }
        ec.A0G();
        this.A06 = true;
        this.A07 = false;
        return true;
    }
}
