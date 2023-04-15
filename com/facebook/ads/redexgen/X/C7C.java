package com.facebook.ads.redexgen.X;

import android.text.TextUtils;
import android.widget.FrameLayout;
import androidx.annotation.Nullable;
import androidx.annotation.VisibleForTesting;
import java.util.Arrays;
/* renamed from: com.facebook.ads.redexgen.X.7C  reason: invalid class name */
/* loaded from: assets/audience_network.dex */
public final class C7C extends RB {
    public static byte[] A0L;
    public static String[] A0M = {"Mriq29lS8vjEPztqvg4mnlhqPa1pf4jw", "J0ebGdEZD5oKohgNzUxMA3JiHaSF4bRJ", "IT9tvlYp44pYwsfxgtsksFS", "El43mrOkb3qqMjbYlNbneDDC3riKbt8u", "SsyQgLhJr8BA6K4Jeu0226NIXlotTSUK", "5pKSfcHcmxRzGJ6MCKbxSHPk9j0pnkgf", "vZ9Xs81YGHnjRjGsoTeSsIOHxP", "Y9Sammkz"};
    @Nullable
    public NR A00;
    public C0596Od A01;
    @Nullable
    public EnumC0611Os A02;
    public boolean A03;
    public boolean A04;
    public boolean A05;
    public boolean A06;
    public boolean A07;
    public boolean A08;
    public final AnonymousClass57 A09;
    public final C0602Oj A0A;
    public final P1 A0B;
    public final C01756y A0C;
    public final AbstractC0534Lr A0D;
    public final AbstractC0532Lp A0E;
    public final AbstractC0501Kk A0F;
    public final K6 A0G;
    public final K2 A0H;
    public final AbstractC0483Jq A0I;
    public final JF A0J;
    public final IX A0K;

    public static String A03(int i, int i2, int i3) {
        byte[] copyOfRange = Arrays.copyOfRange(A0L, i, i + i2);
        for (int i4 = 0; i4 < copyOfRange.length; i4++) {
            copyOfRange[i4] = (byte) ((copyOfRange[i4] - i3) - 88);
        }
        return new String(copyOfRange);
    }

    public static void A08() {
        A0L = new byte[]{-3, 21, 7, 5, 21, -1};
    }

    static {
        A08();
    }

    public C7C(C0806Wj c0806Wj, M4 m4, IT it, AnonymousClass18 anonymousClass18, C6G c6g, InterfaceC0519Lc interfaceC0519Lc) {
        super(c0806Wj, m4, it, anonymousClass18, c6g, interfaceC0519Lc);
        this.A09 = new R4(this);
        this.A0H = new K2() { // from class: com.facebook.ads.redexgen.X.7z
            /* JADX INFO: Access modifiers changed from: private */
            @Override // com.facebook.ads.redexgen.X.C8O
            /* renamed from: A00 */
            public final void A03(K5 k5) {
                C7C.this.A07 = true;
            }
        };
        this.A0G = new K6() { // from class: com.facebook.ads.redexgen.X.7y
            /* JADX INFO: Access modifiers changed from: private */
            @Override // com.facebook.ads.redexgen.X.C8O
            /* renamed from: A00 */
            public final void A03(KV kv) {
                C7C.this.A08 = true;
                C7C.this.A0P();
            }
        };
        this.A0F = new AbstractC0501Kk() { // from class: com.facebook.ads.redexgen.X.7x
            /* JADX INFO: Access modifiers changed from: private */
            @Override // com.facebook.ads.redexgen.X.C8O
            /* renamed from: A00 */
            public final void A03(C01736s c01736s) {
            }
        };
        this.A0I = new AbstractC0483Jq() { // from class: com.facebook.ads.redexgen.X.7w
            /* JADX INFO: Access modifiers changed from: private */
            @Override // com.facebook.ads.redexgen.X.C8O
            /* renamed from: A00 */
            public final void A03(C01726r c01726r) {
                NR nr;
                C7C.this.A0F(c01726r);
                C7C.this.A0E(c01726r);
                nr = C7C.this.A00;
                nr.A0A(c01726r);
            }
        };
        this.A0D = new AbstractC0534Lr() { // from class: com.facebook.ads.redexgen.X.7o
            /* JADX INFO: Access modifiers changed from: private */
            @Override // com.facebook.ads.redexgen.X.C8O
            /* renamed from: A00 */
            public final void A03(C6v c6v) {
                P1 p1;
                C7C c7c = C7C.this;
                p1 = c7c.A0B;
                c7c.A0D(c6v, p1.getState() != EnumC0624Pf.A06, false);
            }
        };
        this.A0E = new C01837h(this);
        boolean z = false;
        this.A07 = false;
        this.A08 = false;
        this.A06 = false;
        this.A05 = false;
        this.A04 = false;
        this.A0B = new P1(super.A03);
        this.A0B.setFunnelLoggingHandler(super.A05);
        this.A0B.getEventBus().A03(this.A0H, this.A0G, this.A0F, this.A0I, this.A0D, this.A0E);
        this.A0C = new C01756y(super.A03, super.A04, this.A0B, super.A01.A0U());
        if (ID.A1L(super.A03)) {
            this.A0A = new C0602Oj(super.A03, super.A04, this.A0B, super.A01.A0U(), null);
        } else {
            this.A0A = null;
        }
        this.A01 = new C0596Od(super.A03, super.A09, super.A01.A0a(), interfaceC0519Lc);
        this.A0J = new JF(super.A03, super.A05);
        this.A0K = new IX(super.A03);
        A07();
        this.A0B.setVideoURI(super.A02.A0S(super.A01.A0O().A0D().A08()));
        A05();
        int A03 = super.A01.A0O().A0D().A03();
        if (ID.A1f(super.A03)) {
            this.A05 = A03 == 0;
        } else {
            this.A05 = A03 <= 0;
        }
        if (super.A01.A0O().A0M() && super.A01.A0O().A0D().A02() > 0) {
            z = true;
        }
        this.A03 = z;
        LE.A0M(this, super.A01.A0N().A01().A07(true));
        if (ID.A1Z(super.A03)) {
            super.A07.setProgressSpinnerInvisible(true);
        }
    }

    private NR A00(int i) {
        return NS.A00(new NU(super.A03, super.A04, super.A08, super.A01, this.A0B, super.A0A, super.A06).A0E(super.A07.getToolbarHeight()).A0H(super.A07).A0D(i).A0F(this.A0J).A0I(this.A0K).A0J(), null, true);
    }

    private void A04() {
        this.A0B.postDelayed(new R3(this), ID.A0J(super.A03));
    }

    private void A05() {
        this.A0B.postDelayed(new R0(this), ID.A0K(super.A03));
    }

    private void A06() {
        this.A05 = true;
        NR nr = this.A00;
        if (nr != null) {
            nr.A0Z();
        }
    }

    private void A07() {
        this.A0B.A0c(this.A0K);
        this.A0B.A0c(this.A0J);
        if (!TextUtils.isEmpty(super.A01.A0O().A0D().A07())) {
            C6Z c6z = new C6Z(super.A03);
            this.A0B.A0c(c6z);
            c6z.setImage(super.A01.A0O().A0D().A07());
        }
        C6A c6a = new C6A(super.A03, true, super.A05);
        this.A0B.A0c(c6a);
        this.A0B.A0c(new JG(c6a, P5.A03, true));
        this.A0B.A0c(new C6Q(super.A03));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void A0D(C6v c6v, boolean z, boolean z2) {
        if (this.A06) {
            return;
        }
        if (A0M[6].length() != 26) {
            throw new RuntimeException();
        }
        String[] strArr = A0M;
        strArr[2] = "N5ZIPH8mvSXK1CHoPTlSEsF";
        strArr[7] = "PVGkj9Ta";
        this.A06 = true;
        if (!this.A05) {
            A06();
        }
        NR nr = this.A00;
        if (nr != null) {
            nr.A09(c6v);
        }
        super.A07.setToolbarActionMessage(A03(0, 0, 25));
        A0H(z, z2);
        super.A07.setToolbarActionMode(getCloseButtonStyle());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void A0E(C01726r c01726r) {
        if (this.A0B.getState() == EnumC0624Pf.A02 && ID.A13(super.A03)) {
            this.A0B.postDelayed(new R5(this, c01726r), 5000L);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void A0F(C01726r c01726r) {
        int A00 = c01726r.A00();
        if (this.A03) {
            int currentPosMs = A00 / 1000;
            int totalSecondsForReward = super.A01.A0O().A0D().A02() - currentPosMs;
            if (totalSecondsForReward > 0) {
                super.A07.setToolbarActionMessage(super.A01.A0S().A00().replace(A03(0, 6, 74), String.valueOf(totalSecondsForReward)));
            } else {
                super.A07.setToolbarActionMessage(A03(0, 0, 25));
                A0H(false, false);
            }
        }
        int currentPosMs2 = super.A01.A0O().A0D().A03();
        int currentPosMs3 = this.A0B.getDuration();
        float seenPercentage = A00 / Math.min(currentPosMs2 * 1000.0f, currentPosMs3);
        super.A07.setProgress(100.0f * seenPercentage);
        int currentPosMs4 = (seenPercentage > 1.0f ? 1 : (seenPercentage == 1.0f ? 0 : -1));
        if (currentPosMs4 >= 0 && !this.A05) {
            A06();
            String[] strArr = A0M;
            String str = strArr[2];
            String str2 = strArr[7];
            int length = str.length();
            int currentPosMs5 = str2.length();
            if (length == currentPosMs5) {
                throw new RuntimeException();
            }
            String[] strArr2 = A0M;
            strArr2[0] = "PXM0w4DTcyhv6xVVxlaJPbpxowOdlGPl";
            strArr2[4] = "ZagmJHoPVKqTZKI94Zh80WtjAbW4VeCE";
            AbstractC0518Lb abstractC0518Lb = super.A07;
            int currentPosMs6 = getCloseButtonStyle();
            abstractC0518Lb.setToolbarActionMode(currentPosMs6);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void A0G(String str) {
        int i = 0;
        int i2 = 0;
        P1 p1 = this.A0B;
        if (p1 != null) {
            i = p1.getCurrentPositionInMillis();
            i2 = this.A0B.getDuration();
            this.A0B.A0Z(3);
        }
        super.A03.A0D().A2n(str);
        if (ID.A14(super.A03)) {
            A0D(new C6v(i, i2), false, true);
            return;
        }
        InterfaceC0519Lc interfaceC0519Lc = super.A08;
        int duration = A0M[3].charAt(0);
        if (duration == 122) {
            throw new RuntimeException();
        }
        A0M[3] = "uhCmlX27t5rzSWT78KYVdoY12DutI5Be";
        interfaceC0519Lc.A3s(super.A09.A6X());
        super.A08.A3s(super.A09.A6S());
    }

    private synchronized void A0H(boolean z, boolean z2) {
        if (this.A03 && !z && !z2) {
            super.A08.A3s(super.A09.A5Y());
            this.A01.A05();
            this.A03 = false;
            if (this.A00 != null) {
                this.A00.A0X();
            }
            return;
        }
        this.A03 = false;
    }

    @Override // com.facebook.ads.redexgen.X.RB
    public final void A0Q() {
        LE.A0L(this.A00);
        LE.A0L(super.A07);
        this.A0B.setVolume(super.A01.A0O().A0D().A09() ? 0.0f : 1.0f);
        this.A0B.A0b(EnumC0611Os.A02, 20);
        NR nr = this.A00;
        if (nr != null && this.A03) {
            nr.A0Y();
        }
        NR nr2 = this.A00;
        if (nr2 != null && !this.A05) {
            nr2.A0a();
        }
        A04();
    }

    @Override // com.facebook.ads.redexgen.X.RB
    public final void A0S(AnonymousClass59 anonymousClass59) {
        anonymousClass59.A0K(this.A09);
        int orientation = anonymousClass59.A0H().getResources().getConfiguration().orientation;
        this.A00 = A00(orientation);
        addView(this.A00, RB.A0D);
        addView(super.A07, new FrameLayout.LayoutParams(-1, super.A07.getToolbarHeight()));
        LE.A0H(this.A00);
        LE.A0H(super.A07);
        NR nr = this.A00;
        setUpFullscreenMode(nr != null && nr.A0c());
    }

    @Override // com.facebook.ads.redexgen.X.RB
    public final boolean A0T() {
        NR nr = this.A00;
        return nr != null && nr.A0d(this.A03);
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC0520Ld
    public final void ABd(boolean z) {
        if (this.A0B.A0i()) {
            return;
        }
        this.A02 = this.A0B.getVideoStartReason();
        this.A04 = z;
        this.A0B.A0e(false, 13);
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC0520Ld
    public final void AC2(boolean z) {
        if (this.A0B.A0j() || this.A06 || this.A0B.getState() == EnumC0624Pf.A06 || this.A02 == null) {
            return;
        }
        if (!this.A04 || z) {
            P1 p1 = this.A0B;
            EnumC0611Os enumC0611Os = this.A02;
            String[] strArr = A0M;
            if (strArr[0].charAt(8) == strArr[4].charAt(8)) {
                throw new RuntimeException();
            }
            A0M[1] = "5vrQw9TAnlgebYwA7tbvLzoGHglPMjBr";
            p1.A0b(enumC0611Os, 19);
        }
    }

    private int getCloseButtonStyle() {
        NR nr = this.A00;
        if (nr != null) {
            return nr.getCloseButtonStyle();
        }
        return 0;
    }

    @Override // com.facebook.ads.redexgen.X.RB, com.facebook.ads.redexgen.X.InterfaceC0520Ld
    public final void onDestroy() {
        super.onDestroy();
        if (ID.A1K(super.A03)) {
            super.A03.A09().AF4(this.A0B);
        }
        NR nr = this.A00;
        if (nr != null) {
            nr.A0W();
        }
        P1 p1 = this.A0B;
        if (p1 != null) {
            if (!this.A06) {
                p1.A0a(EnumC0606On.A05);
            }
            this.A0B.getEventBus().A04(this.A0H, this.A0G, this.A0F, this.A0I, this.A0D, this.A0E);
            this.A0B.A0V();
        }
        C0602Oj c0602Oj = this.A0A;
        if (c0602Oj != null) {
            c0602Oj.A0A();
        }
        this.A0C.A0g();
    }

    @VisibleForTesting
    public void setServerSideRewardHandler(C0596Od c0596Od) {
        this.A01 = c0596Od;
    }
}
