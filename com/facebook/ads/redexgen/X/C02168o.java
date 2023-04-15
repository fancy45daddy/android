package com.facebook.ads.redexgen.X;

import a.a.j;
import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import android.util.Log;
import android.view.MotionEvent;
import android.widget.FrameLayout;
import com.facebook.ads.internal.util.activity.AdActivityIntent;
import com.facebook.ads.internal.view.dynamiclayout.DynamicWebViewController$AdFormatType;
import java.util.Arrays;
import java.util.HashMap;
@SuppressLint({"ViewConstructor"})
/* renamed from: com.facebook.ads.redexgen.X.8o  reason: invalid class name and case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public final class C02168o extends FrameLayout implements RH {
    public static byte[] A0A;
    public static String[] A0B = {"gR8VXB3ia", "OJTiurBFiCqcREvzh7o4PkhSqDGudpIq", "iaBHwIBC1utH6CwOSIC2yyAu4ZYXfJ61", "YdU4", "YcTfP9iPeB3iMp", "vsmHP1kkKyGC9kag", "2EZKw0n31g6TC4", "KAWIkc2sX"};
    public C0627Pi A00;
    @DynamicWebViewController$AdFormatType
    public final int A01;
    public final AnonymousClass18 A02;
    public final C0806Wj A03;
    public final IT A04;
    public final L6 A05;
    public final InterfaceC0579Nl A06;
    public final C0589Nw A07;
    public final String A08;
    public final boolean A09;

    public static String A01(int i, int i2, int i3) {
        byte[] copyOfRange = Arrays.copyOfRange(A0A, i, i + i2);
        for (int i4 = 0; i4 < copyOfRange.length; i4++) {
            copyOfRange[i4] = (byte) ((copyOfRange[i4] ^ i3) ^ j.AppCompatTheme_windowActionModeOverlay);
        }
        return new String(copyOfRange);
    }

    public static void A02() {
        A0A = new byte[]{118, 84, 91, 18, 65, 21, 70, 65, 84, 71, 65, 21, 116, 64, 81, 92, 80, 91, 86, 80, 123, 80, 65, 66, 90, 71, 94, 116, 86, 65, 92, 67, 92, 65, 76, 27, 21, 120, 84, 94, 80, 21, 70, 64, 71, 80, 21, 65, 93, 84, 65, 21, 92, 65, 18, 70, 21, 92, 91, 21, 76, 90, 64, 71, 21, 116, 91, 81, 71, 90, 92, 81, 120, 84, 91, 92, 83, 80, 70, 65, 27, 77, 88, 89, 21, 83, 92, 89, 80, 27, 30, 26, 25, 45, 60, 49, 61, 54, 59, 61, 22, 61, 44, 47, 55, 42, 51, 54, 57, 8, 54, 52, 35, 62, 33, 62, 35, 46, 64, 79, 90, 71, 88, 75, 111, 74, 106, 79, 90, 79, 108, 91, 64, 74, 66, 75, 47, 48, 60, 46, 13, 32, 41, 60};
    }

    static {
        A02();
    }

    public C02168o(C0806Wj c0806Wj, IT it, AnonymousClass18 anonymousClass18, String str, @DynamicWebViewController$AdFormatType int i) {
        this(c0806Wj, it, null, anonymousClass18, str, i, null);
    }

    public C02168o(C0806Wj c0806Wj, IT it, InterfaceC0579Nl interfaceC0579Nl, AnonymousClass18 anonymousClass18, String str, @DynamicWebViewController$AdFormatType int i, L6 l6) {
        super(c0806Wj);
        this.A03 = c0806Wj;
        this.A04 = it;
        this.A02 = anonymousClass18;
        this.A08 = str;
        this.A06 = interfaceC0579Nl;
        this.A01 = i;
        if (this.A01 == 3) {
            this.A07 = new C0589Nw(this.A03, anonymousClass18, it, i);
            this.A09 = false;
        } else {
            C0589Nw preloadedDynamicWebViewController = C0590Nx.A02(anonymousClass18.A0Z());
            if (preloadedDynamicWebViewController != null) {
                this.A07 = preloadedDynamicWebViewController;
                this.A09 = true;
            } else {
                this.A07 = new C0589Nw(this.A03, anonymousClass18, it, i);
                C0590Nx.A03(anonymousClass18, this.A07);
                this.A09 = false;
            }
        }
        if (l6 != null) {
            this.A05 = l6;
            this.A07.A0Z(l6);
        } else {
            this.A05 = this.A07.A0L();
        }
        this.A07.A0c(new RO(this));
        this.A07.A0a(interfaceC0579Nl);
        EnumC0499Ki.A04(this, EnumC0499Ki.A0A);
        if (ID.A1K(c0806Wj)) {
            c0806Wj.A09().AFF(this.A07.A0O(), anonymousClass18.A0U(), false, false, true);
        }
        A04();
    }

    private final void A03() {
        this.A07.A0d(this);
        if (!this.A09) {
            this.A03.A0D().A4v();
            this.A07.A0X();
        } else {
            this.A03.A0D().A4w();
            String[] strArr = A0B;
            if (strArr[6].length() != strArr[4].length()) {
                throw new RuntimeException();
            }
            String[] strArr2 = A0B;
            strArr2[6] = "EW3rEVX7vA8fzU";
            strArr2[4] = "ztAtYR2DvpL08d";
            if (this.A07.A0k()) {
                if (this.A01 == 4) {
                    InterfaceC0579Nl interfaceC0579Nl = this.A06;
                    if (interfaceC0579Nl != null) {
                        interfaceC0579Nl.AAZ(this);
                    }
                    if (ID.A1K(this.A03)) {
                        this.A03.A09().AAN();
                    }
                } else {
                    AEt();
                }
            }
        }
        A08();
    }

    private final void A04() {
        C0589Nw.A0B().incrementAndGet();
        A03();
        this.A07.A0W();
    }

    private void A05(Intent intent, AnonymousClass18 anonymousClass18) {
        intent.putExtra(A01(136, 8, 40), EnumC0471Jc.A04);
        intent.putExtra(A01(j.AppCompatTheme_windowMinWidthMajor, 18, 95), anonymousClass18);
        intent.addFlags(268435456);
    }

    @SuppressLint({"CatchGeneralException"})
    private final void A06(AnonymousClass18 anonymousClass18) {
        AdActivityIntent A04 = K9.A04(this.A03);
        A05(A04, anonymousClass18);
        try {
            K9.A09(this.A03, A04);
        } catch (Exception e) {
            this.A03.A06().A8u(A01(j.AppCompatTheme_toolbarStyle, 11, 38), C01877l.A0D, new C01887m(e));
            Log.e(A01(90, 17, 41), A01(0, 90, 68), e);
        }
    }

    private void A07(String str) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        new N9(this.A03, this.A08, this.A00, this.A05, this.A04).A08(this.A02.A0U(), str, new HashMap());
    }

    public final void A08() {
        LE.A0J(this.A07.A0O());
        addView(this.A07.A0O(), new FrameLayout.LayoutParams(-1, -1));
    }

    @Override // com.facebook.ads.redexgen.X.RH
    public final void A7u() {
        A07(this.A02.A0O().A0F().A05());
    }

    @Override // com.facebook.ads.redexgen.X.RH
    public final void A7v(String str) {
        A07(str);
    }

    @Override // com.facebook.ads.redexgen.X.RH
    public final void A7z() {
    }

    @Override // com.facebook.ads.redexgen.X.RH
    public final void A8e() {
        new Handler(Looper.getMainLooper()).post(new RN(this));
    }

    @Override // com.facebook.ads.redexgen.X.RH
    public final void AAl() {
        A06(this.A02);
    }

    @Override // com.facebook.ads.redexgen.X.RH
    public final void AAp() {
    }

    @Override // com.facebook.ads.redexgen.X.RH
    public final void ABT(boolean z) {
    }

    @Override // com.facebook.ads.redexgen.X.RH
    public final void ACE() {
    }

    @Override // com.facebook.ads.redexgen.X.RH
    public final void ACh(boolean z) {
    }

    @Override // com.facebook.ads.redexgen.X.RH
    public final void ACj(boolean z) {
    }

    @Override // com.facebook.ads.redexgen.X.RH
    public final void ACw(String str) {
    }

    @Override // com.facebook.ads.redexgen.X.RH
    public final void AEt() {
        InterfaceC0579Nl interfaceC0579Nl = this.A06;
        if (interfaceC0579Nl != null) {
            interfaceC0579Nl.AAZ(this);
        }
    }

    @Override // com.facebook.ads.redexgen.X.RH
    public final void close() {
    }

    public IT getAdEventManager() {
        return this.A04;
    }

    public C0589Nw getDynamicWebViewController() {
        return this.A07;
    }

    @Override // android.view.View
    @SuppressLint({"ClickableViewAccessibility"})
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        requestDisallowInterceptTouchEvent(true);
        return super.onTouchEvent(motionEvent);
    }

    public void setAdViewabilityChecker(C0627Pi c0627Pi) {
        this.A00 = c0627Pi;
        this.A07.A0e(c0627Pi);
    }
}
