package com.facebook.ads.redexgen.X;

import a.a.j;
import android.text.TextUtils;
import android.widget.FrameLayout;
import androidx.annotation.Nullable;
import java.util.Arrays;
import org.json.JSONException;
import org.json.JSONObject;
/* renamed from: com.facebook.ads.redexgen.X.No  reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public final class C0582No extends FrameLayout {
    public static byte[] A0L;
    public static String[] A0M = {"tg98T7YqorVxljyy5rC9rRviyjZQ3PWt", "vfHBQfbeXMWpx0Lt9J2p4bolhXFdVoUD", "nuD8gLvjahybAxP4K7AI7EnQPexhi40p", "Mle9DIn2BhVQrDGkT0Ym6c4cXgC65WVc", "K7R1lop0AG70QQAdOPTNlaEDkQeUTiOI", "yRh0uKXr8zSd48KJrOgjFYKLFGGCRN1w", "QQOq4rDYvkiUVU0ErOwgNbjJJCuazTiH", "YmsKh0Z7MVbEzdUA2tq2qo4jdnYDOoVM"};
    @Nullable
    public EnumC0611Os A00;
    public boolean A01;
    public boolean A02;
    public boolean A03;
    public boolean A04;
    public final AnonymousClass18 A05;
    public final C6G A06;
    public final C0806Wj A07;
    public final C0444Ib A08;
    public final InterfaceC0519Lc A09;
    public final M4 A0A;
    public final InterfaceC0581Nn A0B;
    public final C0602Oj A0C;
    public final P1 A0D;
    public final C01756y A0E;
    public final AbstractC0534Lr A0F;
    public final AbstractC0532Lp A0G;
    public final AbstractC0501Kk A0H;
    public final K6 A0I;
    public final K2 A0J;
    public final AbstractC0483Jq A0K;

    public static String A02(int i, int i2, int i3) {
        byte[] copyOfRange = Arrays.copyOfRange(A0L, i, i + i2);
        for (int i4 = 0; i4 < copyOfRange.length; i4++) {
            copyOfRange[i4] = (byte) ((copyOfRange[i4] ^ i3) ^ 38);
        }
        return new String(copyOfRange);
    }

    public static void A0C() {
        A0L = new byte[]{5, 19, 20, 20, 3, 8, 18, 50, 15, 11, 3, 78, 95, 88, 75, 94, 67, 69, 68, 95, 71, 70, 87, 86, 98, 115, 103, 97, 119, 118, 80, 107, 71, 97, 119, 96, 38, 36, 57, 49, 36, 51, 37, 37};
    }

    static {
        A0C();
    }

    public C0582No(C0806Wj c0806Wj, IT it, AnonymousClass18 anonymousClass18, C6G c6g, C0444Ib c0444Ib, InterfaceC0519Lc interfaceC0519Lc, M4 m4, InterfaceC0581Nn interfaceC0581Nn) {
        super(c0806Wj);
        this.A0J = new K2() { // from class: com.facebook.ads.redexgen.X.8n
            public static byte[] A01;

            static {
                A01();
            }

            public static String A00(int i, int i2, int i3) {
                byte[] copyOfRange = Arrays.copyOfRange(A01, i, i + i2);
                for (int i4 = 0; i4 < copyOfRange.length; i4++) {
                    copyOfRange[i4] = (byte) ((copyOfRange[i4] ^ i3) ^ 5);
                }
                return new String(copyOfRange);
            }

            public static void A01() {
                A01 = new byte[]{16, 18, 5, 16, 1, 18, 5, 4};
            }

            /* JADX INFO: Access modifiers changed from: private */
            @Override // com.facebook.ads.redexgen.X.C8O
            /* renamed from: A02 */
            public final void A03(K5 k5) {
                InterfaceC0581Nn interfaceC0581Nn2;
                JSONObject A03;
                C0582No.this.A03 = true;
                interfaceC0581Nn2 = C0582No.this.A0B;
                A03 = C0582No.this.A03();
                interfaceC0581Nn2.ACd(A00(0, 8, j.AppCompatTheme_textAppearanceSearchResultSubtitle), A03);
            }
        };
        this.A0I = new K6() { // from class: com.facebook.ads.redexgen.X.8l
            public static byte[] A01;

            static {
                A01();
            }

            public static String A00(int i, int i2, int i3) {
                byte[] copyOfRange = Arrays.copyOfRange(A01, i, i + i2);
                for (int i4 = 0; i4 < copyOfRange.length; i4++) {
                    copyOfRange[i4] = (byte) ((copyOfRange[i4] ^ i3) ^ 15);
                }
                return new String(copyOfRange);
            }

            public static void A01() {
                A01 = new byte[]{65, 93, 80, 72};
            }

            /* JADX INFO: Access modifiers changed from: private */
            @Override // com.facebook.ads.redexgen.X.C8O
            /* renamed from: A02 */
            public final void A03(KV kv) {
                InterfaceC0581Nn interfaceC0581Nn2;
                JSONObject A03;
                C0582No.this.A04 = true;
                interfaceC0581Nn2 = C0582No.this.A0B;
                A03 = C0582No.this.A03();
                interfaceC0581Nn2.ACd(A00(0, 4, 62), A03);
            }
        };
        this.A0H = new AbstractC0501Kk() { // from class: com.facebook.ads.redexgen.X.8e
            public static byte[] A01;

            static {
                A01();
            }

            public static String A00(int i, int i2, int i3) {
                byte[] copyOfRange = Arrays.copyOfRange(A01, i, i + i2);
                for (int i4 = 0; i4 < copyOfRange.length; i4++) {
                    copyOfRange[i4] = (byte) ((copyOfRange[i4] ^ i3) ^ 93);
                }
                return new String(copyOfRange);
            }

            public static void A01() {
                A01 = new byte[]{28, 13, 25, 31, 9};
            }

            /* JADX INFO: Access modifiers changed from: private */
            @Override // com.facebook.ads.redexgen.X.C8O
            /* renamed from: A02 */
            public final void A03(C01736s c01736s) {
                InterfaceC0581Nn interfaceC0581Nn2;
                JSONObject A03;
                interfaceC0581Nn2 = C0582No.this.A0B;
                A03 = C0582No.this.A03();
                interfaceC0581Nn2.ACd(A00(0, 5, 49), A03);
            }
        };
        this.A0K = new AbstractC0483Jq() { // from class: com.facebook.ads.redexgen.X.8Z
            /* JADX INFO: Access modifiers changed from: private */
            @Override // com.facebook.ads.redexgen.X.C8O
            /* renamed from: A00 */
            public final void A03(C01726r c01726r) {
                C0582No.this.A0H(c01726r);
                C0582No.this.A0A();
            }
        };
        this.A0F = new AbstractC0534Lr() { // from class: com.facebook.ads.redexgen.X.8L
            public static byte[] A01;

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
                A01 = new byte[]{20, 32, 30, 33, 29, 22, 37, 22, 21};
            }

            /* JADX INFO: Access modifiers changed from: private */
            @Override // com.facebook.ads.redexgen.X.C8O
            /* renamed from: A02 */
            public final void A03(C6v c6v) {
                InterfaceC0581Nn interfaceC0581Nn2;
                P1 p1;
                JSONObject A04;
                C0582No.this.A07();
                interfaceC0581Nn2 = C0582No.this.A0B;
                C0582No c0582No = C0582No.this;
                p1 = c0582No.A0D;
                A04 = c0582No.A04(p1.getDuration());
                interfaceC0581Nn2.ACd(A00(0, 9, 100), A04);
            }
        };
        this.A0G = new AnonymousClass82(this);
        this.A03 = false;
        this.A04 = false;
        this.A02 = false;
        this.A01 = false;
        this.A07 = c0806Wj;
        this.A05 = anonymousClass18;
        this.A06 = c6g;
        this.A08 = c0444Ib;
        this.A09 = interfaceC0519Lc;
        this.A0A = m4;
        this.A0D = new P1(c0806Wj);
        this.A0B = interfaceC0581Nn;
        this.A0D.setFunnelLoggingHandler(c0444Ib);
        this.A0D.getEventBus().A03(this.A0J, this.A0I, this.A0H, this.A0K, this.A0F, this.A0G);
        this.A0E = new C01756y(c0806Wj, it, this.A0D, anonymousClass18.A0U());
        if (ID.A1L(this.A07)) {
            this.A0C = new C0602Oj(c0806Wj, it, this.A0D, anonymousClass18.A0U(), null);
        } else {
            this.A0C = null;
        }
        A0B();
        this.A0D.setVideoURI(this.A06.A0S(this.A05.A0O().A0D().A08()));
        A09();
        LE.A0M(this, this.A05.A0N().A01().A07(true));
        String videoUrl = anonymousClass18.A0O().A0D().A07();
        if (!TextUtils.isEmpty(videoUrl)) {
            NP.A00(c0806Wj, this, videoUrl);
        }
        addView(this.A0D, new FrameLayout.LayoutParams(-1, -1));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public JSONObject A03() {
        return A04(this.A0D.getCurrentPositionInMillis());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public JSONObject A04(int i) {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put(A02(0, 11, 64), i);
            jSONObject.put(A02(11, 8, 12), this.A0D.getDuration());
            jSONObject.put(A02(19, 5, 20), this.A0D.A0h());
            jSONObject.put(A02(24, 12, 52), this.A0D.A0j());
            return jSONObject;
        } catch (JSONException e) {
            throw new RuntimeException(e);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void A07() {
        if (this.A02) {
            return;
        }
        if (A0M[4].charAt(2) == 'n') {
            throw new RuntimeException();
        }
        String[] strArr = A0M;
        strArr[2] = "wYD5NcGpzh0isOAoVzlYli3P4mnoyMgF";
        strArr[3] = "lJUNZHbcIhPOnD8CvxzjDicpi9xwJBJa";
        this.A02 = true;
    }

    private void A08() {
        this.A0D.postDelayed(new RL(this), ID.A0J(this.A07));
    }

    private void A09() {
        this.A0D.postDelayed(new RK(this), ID.A0K(this.A07));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void A0A() {
        this.A0B.ACd(A02(36, 8, j.AppCompatTheme_windowActionBarOverlay), A03());
    }

    private void A0B() {
        if (!TextUtils.isEmpty(this.A05.A0O().A0D().A07())) {
            C6Z c6z = new C6Z(this.A07);
            this.A0D.A0c(c6z);
            c6z.setImage(this.A05.A0O().A0D().A07());
        }
        C6A c6a = new C6A(this.A07, true, this.A08);
        this.A0D.A0c(c6a);
        this.A0D.A0c(new JG(c6a, P5.A03, true));
        this.A0D.A0c(new C6Q(this.A07));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void A0H(C01726r c01726r) {
        if (this.A0D.getState() == EnumC0624Pf.A02 && ID.A13(this.A07)) {
            this.A0D.postDelayed(new RJ(this, c01726r), 5000L);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void A0I(String str) {
        this.A07.A0D().A2n(str);
        if (ID.A14(this.A07)) {
            A07();
            return;
        }
        InterfaceC0519Lc interfaceC0519Lc = this.A09;
        M4 m4 = this.A0A;
        String[] strArr = A0M;
        if (strArr[5].charAt(16) != strArr[6].charAt(16)) {
            throw new RuntimeException();
        }
        String[] strArr2 = A0M;
        strArr2[2] = "EBONCaOY6he3EVwrjSVJVgPSsddIWnnf";
        strArr2[3] = "quoo3J1Esh1kTLqYeLvwyhMYZuOues3Q";
        interfaceC0519Lc.A3s(m4.A6X());
        this.A09.A3s(this.A0A.A6S());
    }

    public final void A0N() {
        this.A0D.setVolume(this.A05.A0O().A0D().A09() ? 0.0f : 1.0f);
        this.A0D.A0b(EnumC0611Os.A02, 26);
        A08();
    }

    public final void A0O() {
        P1 p1 = this.A0D;
        if (p1 != null) {
            if (!this.A02) {
                p1.A0a(EnumC0606On.A03);
            }
            this.A0D.getEventBus().A04(this.A0J, this.A0I, this.A0H, this.A0K, this.A0F, this.A0G);
            this.A0D.A0V();
        }
        C0602Oj c0602Oj = this.A0C;
        if (c0602Oj != null) {
            c0602Oj.A0A();
        }
        this.A0E.A0g();
    }

    public final void A0P() {
        this.A0D.A0Z(9);
        LE.A0T(this);
        LE.A0H(this.A0D);
        LE.A0Z(this.A0D);
    }

    public final void A0Q() {
        this.A0D.A0a(EnumC0606On.A04);
    }

    public final void A0R(boolean z) {
        if (z) {
            this.A0D.setVolume(0.0f);
        } else {
            this.A0D.setVolume(1.0f);
        }
        A0A();
        if (A0M[7].charAt(5) == 'u') {
            throw new RuntimeException();
        }
        A0M[4] = "yn69DofMHsLSVfdL7HK9OU5c1k1rZYJH";
    }

    public final void A0S(boolean z) {
        if (this.A0D.A0i()) {
            return;
        }
        this.A00 = this.A0D.getVideoStartReason();
        this.A01 = z;
        this.A0D.A0e(false, 19);
    }

    public final void A0T(boolean z) {
        if (this.A0D.A0j() || this.A02 || this.A0D.getState() == EnumC0624Pf.A06 || this.A00 == null) {
            return;
        }
        boolean z2 = this.A01;
        if (A0M[7].charAt(5) == 'u') {
            throw new RuntimeException();
        }
        String[] strArr = A0M;
        strArr[1] = "icjW3n8vZZxsaCmttUmjcTI7CQu2m51p";
        strArr[0] = "kS3lp82K2YolC4kFtdcvtTBENFWE8ibh";
        if (!z2 || z) {
            this.A0D.A0b(this.A00, 27);
        }
    }

    public final void A0U(boolean z) {
        this.A0D.A0e(z, 18);
    }

    public final void A0V(boolean z) {
        this.A0D.A0b(EnumC0611Os.A04, 25);
    }
}
