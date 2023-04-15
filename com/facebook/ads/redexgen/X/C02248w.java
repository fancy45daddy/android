package com.facebook.ads.redexgen.X;

import a.a.j;
import android.content.res.Configuration;
import android.os.Bundle;
import android.util.Pair;
import android.view.View;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import androidx.annotation.Nullable;
import com.facebook.ads.internal.view.ToolbarActionView$ToolbarActionMode;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicBoolean;
/* renamed from: com.facebook.ads.redexgen.X.8w  reason: invalid class name and case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public final class C02248w extends AbstractC0678Rh implements InterfaceC0536Lt {
    public static byte[] A0D;
    public static String[] A0E = {"QUFYIN7o4MSHfMbcaqgxGqdg8oING", "Qixa92rp7KQSHPhBId3L5m9SXc6gxNRP", "TUKhftCqFUFv9xNbjbPA3CLhBIkdW", "aNiMBj1VMT3xct4Co4hWzqTsg", "QYSCqyZ4CS", "VjIbmM2G6pRRrYhuKIf6SOzC6eQUF7eo", "KFJXOgKoK7JNlCBWMf", "dachHr6cLZKwbIDqTeRsc0FgbmZCJ"};
    @Nullable
    public View A00;
    public View A01;
    public C0806Wj A02;
    @Nullable
    public AbstractC0518Lb A03;
    public C0595Oc A04;
    @Nullable
    public HH A05;
    public boolean A06;
    public final InterfaceC0519Lc A07;
    public final NF A08;
    public final NG A09;
    public final P1 A0A;
    public final IX A0B;
    public final AtomicBoolean A0C;

    public static String A02(int i, int i2, int i3) {
        byte[] copyOfRange = Arrays.copyOfRange(A0D, i, i + i2);
        for (int i4 = 0; i4 < copyOfRange.length; i4++) {
            copyOfRange[i4] = (byte) ((copyOfRange[i4] - i3) - 13);
        }
        return new String(copyOfRange);
    }

    public static void A07() {
        A0D = new byte[]{-53, -60, -39, -56, -30, -42, -41, -60, -43, -41, -52, -47, -54, -30, -60, -47, -52, -48, -60, -41, -52, -46, -47, -42, -30, -45, -49, -60, -36, -56, -57, -51, -48, -44, -58, -32, -45, -58, -40, -62, -45, -59, -32, -44, -60, -45, -58, -58, -49, -32, -44, -55, -48, -40, -49, -53, -75, -57, -45, -71, -62, -72, -45, -73, -75, -58, -72, -45, -57, -68, -61, -53, -62};
    }

    static {
        A07();
    }

    public C02248w(NV nv) {
        super(nv, false);
        this.A0C = new AtomicBoolean(false);
        this.A06 = false;
        this.A02 = nv.A05();
        this.A03 = nv.A08();
        this.A01 = new View(this.A02);
        LE.A0K(this.A01);
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(0, 0);
        layoutParams.addRule(13);
        addView(this.A01, layoutParams);
        A04();
        this.A07 = nv.A09();
        NP.A00(nv.A05(), this, getAdInfo().A0D().A07());
        this.A0A = A00(nv);
        getAdDetailsView().bringToFront();
        this.A0B = A01(nv);
        A0f();
        this.A04 = new C0595Oc(this.A02, nv.A06(), getAdDataBundle());
        this.A08 = new C0676Rf(this);
        this.A09 = new NG(nv, getAdDataBundle(), this.A0A, this.A0B, getAdDetailsView(), this.A07, this.A08);
    }

    private P1 A00(NV nv) {
        P1 p1 = (P1) nv.A02();
        int A0e = A0e(nv.A08());
        ImageView imageView = (ImageView) nv.A03();
        int i = AbstractC0678Rh.A0D;
        int i2 = AbstractC0678Rh.A0D;
        int toolbarHeight = AbstractC0678Rh.A0D;
        imageView.setPadding(i, i2, toolbarHeight, AbstractC0678Rh.A0D);
        int toolbarHeight2 = AbstractC0678Rh.A0E;
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(toolbarHeight2, AbstractC0678Rh.A0E);
        int toolbarHeight3 = AbstractC0678Rh.A0C;
        layoutParams.setMargins(0, A0e, toolbarHeight3, 0);
        layoutParams.addRule(11);
        layoutParams.addRule(10);
        RelativeLayout.LayoutParams layoutParams2 = new RelativeLayout.LayoutParams(-1, -1);
        layoutParams2.addRule(13);
        addView(p1, layoutParams2);
        p1.addView(imageView, layoutParams);
        return p1;
    }

    private IX A01(NV nv) {
        IX A0A = nv.A0A();
        A0A.A06(-1, AbstractC0678Rh.A09);
        A0A.setPadding(AbstractC0678Rh.A0H, AbstractC0678Rh.A0H, AbstractC0678Rh.A0H, AbstractC0678Rh.A0H);
        RelativeLayout.LayoutParams progressBarLayoutParams = new RelativeLayout.LayoutParams(-1, AbstractC0678Rh.A0G);
        progressBarLayoutParams.addRule(12);
        addView(A0A, progressBarLayoutParams);
        return A0A;
    }

    private void A03() {
        if (getAnimationPlugin() != null) {
            getAnimationPlugin().A0E();
            this.A0A.A0d(getAnimationPlugin());
        }
    }

    private void A04() {
        AbstractC0518Lb abstractC0518Lb = this.A03;
        if (abstractC0518Lb == null) {
            return;
        }
        this.A05 = new HH(abstractC0518Lb, 400, -abstractC0518Lb.getToolbarHeight(), 0);
    }

    private void A05() {
        new C0444Ib(getAdDataBundle().A0U(), getAdEventManager()).A02(EnumC0443Ia.A0r, null);
        if (!getAdInfo().A0O()) {
            return;
        }
        this.A0C.set(true);
        LE.A0T(this);
        LE.A0H(this.A0A);
        LE.A0Z(this.A0A, this.A0B, this.A09, this.A00);
        LE.A0L(this.A03);
        C0595Oc c0595Oc = this.A04;
        View$OnClickListenerC0683Rm ctaButton = getCtaButton();
        String[] strArr = A0E;
        if (strArr[2].length() != strArr[0].length()) {
            throw new RuntimeException();
        }
        A0E[3] = "FxfG3zWETYKhpCEsP1aqGpvXk";
        Pair<EnumC0594Ob, View> A03 = c0595Oc.A03(ctaButton);
        this.A00 = (View) A03.second;
        int i = NW.A00[((EnumC0594Ob) A03.first).ordinal()];
        if (i == 1) {
            getAdDetailsView().setVisibility(0);
            RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-1, -1);
            layoutParams.setMargins(0, A0e(this.A03), 0, 0);
            layoutParams.addRule(2, getAdDetailsView().getId());
            addView(this.A00, layoutParams);
        } else if (i != 2) {
        } else {
            LE.A0Z(getAdDetailsView());
            RelativeLayout.LayoutParams layoutParams2 = new RelativeLayout.LayoutParams(-1, -1);
            layoutParams2.setMargins(AbstractC0678Rh.A0F, AbstractC0678Rh.A0F, AbstractC0678Rh.A0F, AbstractC0678Rh.A0F);
            addView(this.A00, layoutParams2);
        }
    }

    private void A06() {
        HH hh = this.A05;
        if (hh != null) {
            hh.A3M(true, false);
        }
        if (getAdDetailsAnimation() != null) {
            getAdDetailsAnimation().A3M(true, false);
        }
    }

    @Override // com.facebook.ads.redexgen.X.NR
    public final void A09(C6v c6v) {
        super.A09(c6v);
        A05();
    }

    @Override // com.facebook.ads.redexgen.X.NR
    public final void A0A(C01726r c01726r) {
        super.A0A(c01726r);
        int videoLengthMs = c01726r.A00();
        int duration = this.A0A.getDuration() - videoLengthMs;
        if (getAnimationPlugin() != null) {
            int videoLengthMs2 = A0E[1].charAt(18);
            if (videoLengthMs2 != 51) {
                throw new RuntimeException();
            }
            A0E[5] = "xiBnzSw2W6K3rvYkwdUGMYXv5m3ZqRWR";
            if (duration < 3000 && getAnimationPlugin().A0J()) {
                getAnimationPlugin().A0F();
            }
        }
    }

    @Override // com.facebook.ads.redexgen.X.NR
    public final void A0W() {
        super.A0W();
        A03();
        this.A03 = null;
    }

    @Override // com.facebook.ads.redexgen.X.AbstractC0678Rh, com.facebook.ads.redexgen.X.NR
    public final void A0b(C1B c1b, String str, double d, @Nullable Bundle bundle) {
        super.A0b(c1b, str, d, bundle);
        if (bundle == null) {
            bundle = new Bundle();
        }
        if (!bundle.getBoolean(A02(0, 31, j.AppCompatTheme_windowMinWidthMajor), false)) {
            A06();
        }
        if (bundle.getBoolean(A02(55, 18, j.AppCompatTheme_textAppearanceSmallPopupMenu), false)) {
            A05();
        }
        if (bundle.getBoolean(A02(31, 24, j.AppCompatTheme_windowFixedWidthMajor), false)) {
            NG ng = this.A09;
            if (A0E[1].charAt(18) != '3') {
                throw new RuntimeException();
            }
            String[] strArr = A0E;
            strArr[2] = "jjtMTZWEM7Dg1szUnnnmuTjwvMhej";
            strArr[0] = "cexdZia4vusGbXInA5fVVHDcQrSB4";
            ng.A07(this);
        }
    }

    @Override // com.facebook.ads.redexgen.X.NR
    public final boolean A0c() {
        return true;
    }

    @Override // com.facebook.ads.redexgen.X.NR
    public final boolean A0d(boolean z) {
        if (z && !this.A06) {
            boolean z2 = this.A0C.get();
            String[] strArr = A0E;
            if (strArr[7].length() != strArr[4].length()) {
                String[] strArr2 = A0E;
                strArr2[2] = "IfEmWBIDBUNw5tL7YhS4lNzldGhzw";
                strArr2[0] = "8CoNQoXVMdzgwU1krh95bRLsSKKH4";
                if (!z2) {
                    this.A09.A07(this);
                    return true;
                }
            }
            throw new RuntimeException();
        }
        boolean A0O = getAdInfo().A0O();
        if (A0E[5].charAt(17) != 'k') {
            A0E[1] = "YRUjLZqfjvY5EOxU383ujQcW8j7gUgor";
            if (A0O && !this.A0C.get()) {
                this.A0A.A0a(EnumC0606On.A08);
                return true;
            }
            return false;
        }
        throw new RuntimeException();
    }

    @Override // com.facebook.ads.redexgen.X.AbstractC0678Rh
    public final void A0f() {
        super.A0f();
        if (getAnimationPlugin() != null) {
            getAnimationPlugin().A8l(this.A0A);
        }
    }

    public final boolean A0g() {
        return getAdInfo().A0O();
    }

    @Override // com.facebook.ads.redexgen.X.NR
    @ToolbarActionView$ToolbarActionMode
    public int getCloseButtonStyle() {
        if (A0g() && !this.A0C.get()) {
            return 1;
        }
        return super.getCloseButtonStyle();
    }

    @Override // com.facebook.ads.redexgen.X.AbstractC0678Rh, com.facebook.ads.redexgen.X.NR, android.view.View
    public final void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
    }
}
