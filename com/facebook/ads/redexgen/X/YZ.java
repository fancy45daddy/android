package com.facebook.ads.redexgen.X;

import a.a.j;
import android.content.Intent;
import android.text.TextUtils;
import com.facebook.ads.AdError;
import java.util.Arrays;
/* loaded from: assets/audience_network.dex */
public class YZ implements InterfaceC00300x {
    public static byte[] A02;
    public static String[] A03 = {"CodBKn6Rx4Nd2NCJ9VlYeJoUvBmT0K9p", "5Rf8WjvcJZOUdeEvkpnEyeT6h0OK8cqO", "9H9umRBAwWbsUQsHVAjP1GvoefoGWKiv", "nqryT6E7", "BkgpBj4q", "vUmBCwuwnOwC6wDkIlhiKnb32h6Srhe1", "47HB5bdSxtP74yDXUEGozfNjn4WOkRGN", "xids5JFtyjlo4uGEh5DI8Wwgi7h0jVQM"};
    public final /* synthetic */ EC A00;
    public final /* synthetic */ Runnable A01;

    public static String A00(int i, int i2, int i3) {
        byte[] copyOfRange = Arrays.copyOfRange(A02, i, i + i2);
        for (int i4 = 0; i4 < copyOfRange.length; i4++) {
            int i5 = (copyOfRange[i4] ^ i3) ^ 34;
            String[] strArr = A03;
            if (strArr[5].charAt(5) == strArr[1].charAt(5)) {
                throw new RuntimeException();
            }
            String[] strArr2 = A03;
            strArr2[5] = "sVZQ6Ml9fBzEITS5ybXWTtwXQoWqWbAN";
            strArr2[1] = "MwEMOJFXQFuJpU8zWQ85tYeWswvxAO3B";
            copyOfRange[i4] = (byte) i5;
        }
        return new String(copyOfRange);
    }

    public static void A01() {
        A02 = new byte[]{99, 61, 57, 58, 62, 111, 99, 15, 42, 47, 62, 58, 43, 60, 110, 39, 61, 110, 32, 59, 34, 34, 110, 33, 32, 110, 34, 33, 47, 42, 7, 32, 58, 43, 60, 61, 58, 39, 58, 39, 47, 34, 15, 42, 93, 122, 96, 113, 102, 103, 96, 125, 96, 125, 117, 120, 52, 125, 121, 100, 102, 113, 103, 103, 125, 123, 122, 52, 114, 125, 102, 113, 112, 106, 101, 84, 106, 104, Byte.MAX_VALUE, 98, 125, 98, Byte.MAX_VALUE, 114, 47, 32, 42, 60, 33, 39, 42, 96, 39, 32, 58, 43, 32, 58, 96, 47, 45, 58, 39, 33, 32, 96, 24, 7, 11, 25, 110, Byte.MAX_VALUE, 102, 11, 10, 45, 10, 16, 1, 22, 23, 16, 13, 16, 13, 5, 8, 40, 11, 3, 3, 13, 10, 3, 45, 9, 20, 22, 1, 23, 23, 13, 11, 10};
    }

    static {
        A01();
    }

    public YZ(EC ec, Runnable runnable) {
        this.A00 = ec;
        this.A01 = runnable;
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC00300x
    public final void AAv(ZB zb, String str, boolean z) {
        this.A00.A06.A0C();
        boolean clickUrlDefined = !TextUtils.isEmpty(str);
        if (z && clickUrlDefined) {
            try {
                Intent intent = new Intent(A00(84, 26, j.AppCompatTheme_tooltipForegroundColor));
                intent.setData(KM.A00(str));
                K9.A0B(this.A00.A0B, intent);
            } catch (K7 e) {
                Throwable cause = e.getCause();
                Throwable th = e;
                if (cause != null) {
                    th = e.getCause();
                }
                this.A00.A0B.A06().A8u(A00(73, 11, 41), C01877l.A04, new C01887m(th));
            }
        }
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC00300x
    public final void AAw(ZB zb) {
        this.A00.A06.A04();
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC00300x
    public final void AAx(ZB zb) {
        this.A00.A06.A05();
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC00300x
    public final void AAy(ZB zb) {
        if (zb != this.A00.A00) {
            return;
        }
        if (zb == null) {
            this.A00.A0B.A06().A8u(A00(j.AppCompatTheme_viewInflaterClass, 3, 45), C01877l.A0X, new C01887m(A00(7, 37, j.AppCompatTheme_tooltipForegroundColor)));
            AAz(zb, AdError.internalError(2004));
            return;
        }
        this.A00.A0C().removeCallbacks(this.A01);
        EC ec = this.A00;
        ec.A01 = zb;
        ec.A0F();
        this.A00.A06.A0F(zb);
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC00300x
    public final void AAz(ZB zb, AdError adError) {
        if (zb != this.A00.A00) {
            return;
        }
        this.A00.A0C().removeCallbacks(this.A01);
        this.A00.A0K(zb);
        this.A00.A0B.A0D().A4Z(adError.getErrorCode(), adError.getErrorMessage());
        this.A00.A06.A0G(new J3(adError.getErrorCode(), adError.getErrorMessage()));
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC00300x
    public final void AB0(ZB zb) {
        JH.A05(A00(j.AppCompatTheme_windowActionModeOverlay, 31, 70), A00(44, 29, 54), A00(0, 7, 121));
        this.A00.A06.A0D();
        this.A00.A0I();
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC00300x
    public final void AB1() {
        this.A00.A06.A08();
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC00300x
    public final void AB2() {
        this.A00.A06.A06();
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC00300x
    public final void AB3() {
        this.A00.A06.A07();
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC00300x
    public final void onInterstitialActivityDestroyed() {
        this.A00.A06.A02();
    }
}
