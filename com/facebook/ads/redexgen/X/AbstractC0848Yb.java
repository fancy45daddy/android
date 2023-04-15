package com.facebook.ads.redexgen.X;

import a.a.j;
import android.annotation.SuppressLint;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import androidx.annotation.Nullable;
import com.facebook.ads.AdExperienceType;
import com.facebook.ads.internal.dynamicloading.DynamicLoaderFactory;
import com.facebook.ads.internal.protocol.AdErrorType;
import java.util.Arrays;
import java.util.HashMap;
import org.json.JSONObject;
@SuppressLint({"HardcodedIPAddressUse"})
/* renamed from: com.facebook.ads.redexgen.X.Yb  reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public abstract class AbstractC0848Yb implements JV {
    public static byte[] A0D;
    public static String[] A0E = {"4yJhIog9RzpC9w4XHjq79o6hmz2pMXrt", "bLneqHgNlbzxjE", "P7gevZ65hMGDm5VmgpkLcWEi46YxYduR", "Pajg2XTKXpS0pN0AoGLcPnQoa2IWF6Z7", "YyJRdl3XxpBTstTmsw", "OvgbPt0JG7dlaj99kqPbJKVmb9CPKTVr", "21VbiQWRKHmC0d4xB3zoTsbqXtN2ZOxw", "Q3Y9mBD7X4l0uaedlY7FP5X0xCsXbtIX"};
    public static final Handler A0F;
    public static final C00250s A0G = null;
    @SuppressLint({"StaticFieldLeak"})
    public static final JW A0H = null;
    public static final String A0I;
    @Nullable
    public InterfaceC00200n A00;
    @Nullable
    public InterfaceC00200n A01;
    @Nullable
    public AnonymousClass83 A04;
    @Nullable
    public JT A05;
    @Nullable
    public AbstractC00210o A06;
    public final C00481p A07;
    public final IT A08;
    public final C00250s A09;
    public final JW A0A;
    public final C0806Wj A0B;
    public volatile boolean A0C;
    public long A03 = -1;
    @Nullable
    public String A02 = null;

    public static String A06(int i, int i2, int i3) {
        byte[] copyOfRange = Arrays.copyOfRange(A0D, i, i + i2);
        for (int i4 = 0; i4 < copyOfRange.length; i4++) {
            copyOfRange[i4] = (byte) ((copyOfRange[i4] ^ i3) ^ 8);
        }
        return new String(copyOfRange);
    }

    public static void A07() {
        A0D = new byte[]{75, 110, 107, 122, 126, 111, 120, 42, 110, 101, 111, 121, 42, 100, 101, 126, 42, 111, 114, 99, 121, 126, 78, 107, 110, Byte.MAX_VALUE, 123, 106, 125, 47, 102, 124, 47, 97, 122, 99, 99, 47, 96, 97, 47, 124, 123, 110, 125, 123, 78, 107, 54, 23, 88, 21, 23, 10, 29, 88, 25, 28, 88, 27, 25, 22, 28, 17, 28, 25, 12, 29, 11, 86, 59, 30, 3, 2, 11, 76, 13, 8, 13, 28, 24, 9, 30, 76, 24, 21, 28, 9, 66, 110, 107, 47, 110, 99, 125, 106, 110, 107, 118, 47, 124, 123, 110, 125, 123, 106, 107, 42, 59, 34, 78, 89, 43, 46, 59, 46, 0, 45, 37, 42, 44, 59, 111, 38, 60, 111, 33, 58, 35, 35, 90, 81, 92, 77, 70, 79, 75, 90, 91, 96, 86, 91, 48, 59, 35, 60, 39, 58, 59, 56, 48, 59, 33, 117, 60, 38, 117, 48, 56, 37, 33, 44, 31, 11, 28, 8, 12, 28, 23, 26, 0, 38, 26, 24, 9, 9, 16, 23, 30, 70, 65, 89, 78, 67, 70, 75, 15, 95, 67, 78, 76, 74, 66, 74, 65, 91, 15, 70, 65, 15, 93, 74, 92, 95, 64, 65, 92, 74, 66, 65, 79, 74, 113, 90, 71, 67, 75, 113, 67, 93, 49, 38, 50, 54, 38, 48, 55, 28, 42, 39};
    }

    public abstract void A0J();

    public abstract void A0L(InterfaceC00200n interfaceC00200n, AnonymousClass83 anonymousClass83, AnonymousClass81 anonymousClass81, C00491q c00491q);

    static {
        A07();
        LG.A02();
        A0I = AbstractC0848Yb.class.getSimpleName();
        A0F = new Handler(Looper.getMainLooper());
    }

    public AbstractC0848Yb(C0806Wj c0806Wj, C00481p c00481p) {
        this.A0B = c0806Wj;
        this.A07 = c00481p;
        JW jw = A0H;
        if (jw != null) {
            this.A0A = jw;
        } else {
            this.A0A = new JW(this.A0B);
        }
        this.A0A.A0P(this);
        C00250s c00250s = A0G;
        if (c00250s != null) {
            this.A09 = c00250s;
        } else {
            this.A09 = new C00250s();
        }
        DynamicLoaderFactory.makeLoader(this.A0B).getInitApi().onAdLoadInvoked(this.A0B);
        this.A08 = c0806Wj.A08();
        this.A0B.A0D().A4X();
    }

    private void A08(C0706Sj c0706Sj) {
        AnonymousClass83 placement = c0706Sj.A00();
        if (placement == null || placement.A05() == null) {
            String A06 = A06(179, 29, 39);
            J3 j3 = new J3(AdErrorType.NO_AD_PLACEMENT, A06);
            this.A0B.A0D().A4Z(j3.A03().getErrorCode(), A06);
            AbstractC00210o abstractC00210o = this.A06;
            if (abstractC00210o != null) {
                abstractC00210o.A0G(j3);
                return;
            }
            return;
        }
        this.A04 = placement;
        this.A00 = null;
        AnonymousClass83 anonymousClass83 = this.A04;
        AnonymousClass81 placementAd = anonymousClass83.A04();
        String A062 = A06(0, 0, 73);
        if (placementAd == null) {
            J3 A01 = J3.A01(AdErrorType.NO_FILL, A062);
            this.A0B.A0D().A4Z(A01.A03().getErrorCode(), A06(48, 22, j.AppCompatTheme_windowActionBarOverlay));
            AbstractC00210o abstractC00210o2 = this.A06;
            if (abstractC00210o2 != null) {
                abstractC00210o2.A0G(A01);
                return;
            }
            return;
        }
        String A02 = placementAd.A02();
        InterfaceC00200n A00 = this.A09.A00(this.A0B, anonymousClass83.A05().A0D());
        if (A00 == null) {
            this.A0B.A06().A8u(A06(j.AppCompatTheme_toolbarStyle, 3, 67), C01877l.A0a, new C01887m(A06(0, 22, 2), A02));
            AAc(J3.A00(AdErrorType.INTERNAL_ERROR));
        } else if (this.A07.A00() != A00.A79()) {
            J3 A012 = J3.A01(AdErrorType.INTERNAL_ERROR, A062);
            this.A0B.A0D().A4Z(A012.A03().getErrorCode(), A06(70, 19, 100));
            AbstractC00210o abstractC00210o3 = this.A06;
            if (abstractC00210o3 != null) {
                abstractC00210o3.A0G(A012);
            }
        } else {
            this.A00 = A00;
            AnonymousClass84 A05 = anonymousClass83.A05();
            JSONObject A04 = placementAd.A04();
            if (A04 != null) {
                String optString = A04.optString(A06(220, 10, 75));
                this.A0B.A0D().AEZ(optString);
                this.A0B.A0B(optString);
                C0805Wi A002 = C7F.A00();
                if (A002 != null) {
                    A002.A0B(optString);
                }
                A0A(A04.optJSONObject(A06(162, 17, j.AppCompatTheme_windowActionModeOverlay)));
                C00491q c00491q = new C00491q(A04, A05, this.A07.A09, A05.A0C());
                if (this.A05 == null) {
                    String A063 = A06(142, 20, 93);
                    J3 A013 = J3.A01(AdErrorType.UNKNOWN_ERROR, A063);
                    this.A0B.A0D().A4Z(A013.A03().getErrorCode(), A063);
                    AbstractC00210o abstractC00210o4 = this.A06;
                    if (abstractC00210o4 != null) {
                        abstractC00210o4.A0G(A013);
                        return;
                    }
                    return;
                }
                A0L(A00, anonymousClass83, placementAd, c00491q);
                if (A0E[6].charAt(21) == '6') {
                    throw new RuntimeException();
                }
                String[] strArr = A0E;
                strArr[4] = "m1l7KBFjFJZQKSNoNN";
                strArr[1] = "daOG7UEv1P6bC2";
                return;
            }
            String A064 = A06(j.AppCompatTheme_windowActionBarOverlay, 18, 71);
            J3 A014 = J3.A01(AdErrorType.UNKNOWN_ERROR, A064);
            this.A0B.A0D().A4Z(A014.A03().getErrorCode(), A064);
            AbstractC00210o abstractC00210o5 = this.A06;
            if (abstractC00210o5 != null) {
                abstractC00210o5.A0G(A014);
            }
        }
    }

    private final void A09(@Nullable String str, @Nullable AdExperienceType adExperienceType) {
        this.A0B.A0D().A4a(str != null);
        this.A03 = System.currentTimeMillis();
        if (Build.VERSION.SDK_INT < 17) {
            AAc(new J3(AdErrorType.API_NOT_SUPPORTED, A06(0, 0, 73)));
            return;
        }
        try {
            this.A05 = this.A07.A01(this.A0B, new JD(this.A0B, str, this.A07.A09, this.A07.A08), adExperienceType);
            if (A0E[6].charAt(21) == '6') {
                throw new RuntimeException();
            }
            String[] strArr = A0E;
            strArr[4] = "3q2wB1pMY3UXfOrLgu";
            strArr[1] = "CsXqAZILgfX2KA";
            this.A0A.A0O(this.A05);
        } catch (J4 e) {
            AAc(J3.A02(e));
        }
    }

    private void A0A(@Nullable JSONObject jSONObject) {
        if (jSONObject != null) {
            this.A02 = jSONObject.optString(A06(130, 12, 55));
            C00270u.A01(this.A0B).A0O(jSONObject);
        }
    }

    public final long A0B() {
        AnonymousClass83 anonymousClass83 = this.A04;
        if (anonymousClass83 != null) {
            return anonymousClass83.A03();
        }
        return -1L;
    }

    public final Handler A0C() {
        return A0F;
    }

    @Nullable
    public final AnonymousClass84 A0D() {
        AnonymousClass83 anonymousClass83 = this.A04;
        if (anonymousClass83 == null) {
            return null;
        }
        return anonymousClass83.A05();
    }

    @Nullable
    public final String A0E() {
        InterfaceC00200n interfaceC00200n = this.A01;
        if (interfaceC00200n == null) {
            return null;
        }
        return interfaceC00200n.A63();
    }

    public final void A0F() {
        String A63;
        this.A0B.A0D().A2e(L5.A01(this.A03));
        InterfaceC00200n interfaceC00200n = this.A01;
        if (interfaceC00200n == null || (A63 = interfaceC00200n.A63()) == null) {
            return;
        }
        HashMap hashMap = new HashMap();
        String A04 = L5.A04(this.A03);
        String clientToken = A06(208, 12, 38);
        hashMap.put(clientToken, A04);
        new C0444Ib(A63, this.A08).A02(EnumC0443Ia.A08, hashMap);
    }

    public final void A0G() {
        InterfaceC00200n interfaceC00200n = this.A01;
        String A06 = A06(j.AppCompatTheme_toolbarStyle, 3, 67);
        if (interfaceC00200n == null) {
            String A062 = A06(22, 26, 7);
            this.A0B.A06().A8u(A06, C01877l.A0Q, new C01887m(A062));
            AdErrorType adErrorType = AdErrorType.INTERNAL_ERROR;
            this.A0B.A0D().A4Z(adErrorType.getErrorCode(), A062);
            AbstractC00210o abstractC00210o = this.A06;
            if (abstractC00210o != null) {
                String errorMessage = adErrorType.getDefaultErrorMessage();
                abstractC00210o.A0G(J3.A01(adErrorType, errorMessage));
            }
            this.A0B.A0D().A4c();
        } else if (this.A0C) {
            String A063 = A06(89, 18, 7);
            this.A0B.A06().A8u(A06, C01877l.A0M, new C01887m(A063));
            AdErrorType adErrorType2 = AdErrorType.AD_ALREADY_STARTED;
            this.A0B.A0D().A4Z(adErrorType2.getErrorCode(), A063);
            AbstractC00210o abstractC00210o2 = this.A06;
            if (abstractC00210o2 != null) {
                String errorMessage2 = adErrorType2.getDefaultErrorMessage();
                abstractC00210o2.A0G(J3.A01(adErrorType2, errorMessage2));
            }
            this.A0B.A0D().A4b();
        } else {
            if (!TextUtils.isEmpty(this.A01.A63())) {
                this.A08.A9E(this.A01.A63());
            }
            this.A0B.A0D().A4d();
            this.A0C = true;
            A0J();
        }
    }

    public final void A0H() {
        A0R(false);
    }

    public final void A0I() {
        if (this.A02 != null) {
            C00270u.A01(this.A0B).A0N(this.A02);
        }
    }

    public final void A0K(@Nullable InterfaceC00200n interfaceC00200n) {
        if (interfaceC00200n != null) {
            interfaceC00200n.onDestroy();
        }
    }

    public final void A0M(AbstractC00210o abstractC00210o) {
        this.A06 = abstractC00210o;
    }

    public final void A0N(C00491q c00491q) {
        this.A0B.A0D().A4W();
        String clientToken = c00491q.A03().optString(A06(j.AppCompatTheme_viewInflaterClass, 2, 37));
        if (!TextUtils.isEmpty(clientToken)) {
            C0444Ib funnelLoggingHandler = new C0444Ib(clientToken, this.A08);
            funnelLoggingHandler.A02(EnumC0443Ia.A04, null);
        }
    }

    public void A0O(@Nullable String str) {
        A09(str, null);
    }

    public final void A0P(@Nullable String str) {
        A0O(str);
    }

    public final void A0Q(@Nullable String str, @Nullable AdExperienceType adExperienceType) {
        A09(str, adExperienceType);
    }

    public void A0R(boolean z) {
        if (!z && !this.A0C) {
            return;
        }
        this.A0B.A0D().A4e();
        A0K(this.A01);
        this.A0C = false;
    }

    public final boolean A0S() {
        AnonymousClass83 anonymousClass83 = this.A04;
        return anonymousClass83 == null || anonymousClass83.A0A();
    }

    @Override // com.facebook.ads.redexgen.X.JV
    public final synchronized void AAc(J3 j3) {
        A0C().post(new C0849Yc(this, j3));
    }

    @Override // com.facebook.ads.redexgen.X.JV
    @SuppressLint({"CatchGeneralException"})
    public final synchronized void ACM(C0706Sj c0706Sj) {
        try {
            A08(c0706Sj);
        } catch (Exception e) {
            this.A0B.A06().A8u(A06(j.AppCompatTheme_toolbarStyle, 3, 67), C01877l.A0T, new C01887m(e));
        }
    }
}
