package com.facebook.ads.redexgen.X;

import a.a.j;
import android.annotation.SuppressLint;
import android.os.Build;
import android.text.TextUtils;
import android.util.Log;
import android.webkit.WebSettings;
import android.widget.FrameLayout;
import android.widget.RelativeLayout;
import androidx.annotation.Nullable;
import java.lang.ref.WeakReference;
import java.util.Arrays;
import java.util.Map;
import java.util.concurrent.atomic.AtomicBoolean;
import org.json.JSONException;
import org.json.JSONObject;
@SuppressLint({"ViewConstructor"})
/* loaded from: assets/audience_network.dex */
public final class OX extends FrameLayout {
    public static byte[] A0C;
    public static String[] A0D = {"2LrpfYyae0azpeRldXrTpIs5j5WolZYJ", "aTWFoH17M5HvBaS06GyoTMgY8LK09kB1", "ZT9jJV1ne", "vwbwskwEgIVHj6V8wHV", "a8UIfMhCahgZVDol7QIaAFMNjSR7v8Rm", "pauq9xVSe1TSbn6Nh8iDWIypG", "tig0s2h3zWgeN1kA13N6tuAlrnUP1dby", "gu60Pcp0oAdbO9RcUpkXMIBgrMh0CW0V"};
    public static final float A0E;
    public static final RelativeLayout.LayoutParams A0F;
    public int A00;
    public long A01;
    public Map<String, String> A02;
    public final AnonymousClass18 A03;
    public final C1W A04;
    public final C0806Wj A05;
    public final IT A06;
    public final InterfaceC0563Mv A07;
    public final C0687Rq A08;
    public final OV A09;
    public final AtomicBoolean A0A;
    public final AtomicBoolean A0B;

    public static String A06(int i, int i2, int i3) {
        byte[] copyOfRange = Arrays.copyOfRange(A0C, i, i + i2);
        for (int i4 = 0; i4 < copyOfRange.length; i4++) {
            int i5 = copyOfRange[i4] ^ i3;
            if (A0D[5].length() != 25) {
                throw new RuntimeException();
            }
            A0D[4] = "2xsSJQdmJTzWNKbVkLPVv70adF3crTtp";
            copyOfRange[i4] = (byte) (i5 ^ 37);
        }
        return new String(copyOfRange);
    }

    public static void A09() {
        A0C = new byte[]{11, 47, 29, 33, 44, 52, 44, 47, 33, 40, 12, 41, 52, 5, 22, 23, 13, 10, 3, 68, 1, 22, 22, 11, 22, 52, 8, 5, 29, 5, 6, 8, 1, 68, 0, 11, 39, 16, 5, 39, 8, 13, 7, 15, 68, 16, 22, 13, 3, 3, 1, 22, 1, 0, 68, 19, 13, 16, 12, 68, 20, 22, 1, 73, 1, 18, 1, 10, 16, 68, 7, 8, 13, 7, 15, 23, 68, 7, 11, 17, 10, 16, 68, 5, 10, 0, 68, 32, 1, 8, 5, 29, 106, 86, 91, 67, 91, 88, 86, 95, 123, 94, 73, 108, 83, 95, 77, 102, 97, 99, 109, 106, 36, 104, 107, 101, 96, 109, 106, 99, 36, 118, 97, 105, 107, 112, 97, 36, 116, 104, 101, 125, 101, 102, 104, 97, 61, 50, 55, 61, 53, 45, 112, 113, 120, 117, 109, 93, 65, 76, 84, 76, 79, 65, 72, 55, 43, 38, 62, 38, 37, 43, 34, 24, 53, 34, 42, 40, 51, 34, 21, 2, 10, 8, 19, 2, 56, 20, 2, 20, 20, 14, 8, 9, 56, 14, 3, 20, 15, 11, 5, 14, 107, 121, 126, 67, 106, 117, 121, 107};
    }

    static {
        A09();
        A0E = (int) (Kd.A02 * 4.0f);
        A0F = new RelativeLayout.LayoutParams(-1, -1);
    }

    public OX(C0806Wj c0806Wj, AnonymousClass18 anonymousClass18, C1W c1w, IT it, OV ov, Map<String, String> playableMetricsData) {
        super(c0806Wj);
        this.A0A = new AtomicBoolean(false);
        this.A0B = new AtomicBoolean(false);
        this.A01 = -1L;
        this.A00 = 0;
        this.A07 = new AbstractC0690Rt() { // from class: com.facebook.ads.redexgen.X.76
            @Override // com.facebook.ads.redexgen.X.InterfaceC0563Mv
            public final void A9x() {
            }

            @Override // com.facebook.ads.redexgen.X.AbstractC0690Rt, com.facebook.ads.redexgen.X.InterfaceC0563Mv
            public final void AAh(int i, @Nullable String str) {
                AtomicBoolean atomicBoolean;
                OV ov2;
                atomicBoolean = OX.this.A0B;
                atomicBoolean.set(true);
                ov2 = OX.this.A09;
                ov2.ABE();
            }

            @Override // com.facebook.ads.redexgen.X.AbstractC0690Rt, com.facebook.ads.redexgen.X.InterfaceC0563Mv
            public final void AAt() {
                AtomicBoolean atomicBoolean;
                AtomicBoolean atomicBoolean2;
                OV ov2;
                atomicBoolean = OX.this.A0B;
                if (atomicBoolean.get()) {
                    return;
                }
                atomicBoolean2 = OX.this.A0A;
                if (!atomicBoolean2.compareAndSet(false, true)) {
                    return;
                }
                ov2 = OX.this.A09;
                ov2.AAt();
            }

            @Override // com.facebook.ads.redexgen.X.InterfaceC0563Mv
            public final void ACo() {
                OV ov2;
                ov2 = OX.this.A09;
                ov2.ACo();
            }
        };
        this.A05 = c0806Wj;
        this.A03 = anonymousClass18;
        this.A04 = c1w;
        this.A06 = it;
        this.A09 = ov;
        this.A02 = playableMetricsData;
        this.A08 = A04();
        if (ID.A1K(this.A05)) {
            this.A05.A09().AFD(this.A08, this.A03.A0U(), false);
        }
        addView(this.A08, A0F);
    }

    public static /* synthetic */ int A00(OX ox) {
        int i = ox.A00;
        ox.A00 = i + 1;
        return i;
    }

    @SuppressLint({"AddJavascriptInterface", "ClickableViewAccessibility"})
    private C0687Rq A04() {
        C0687Rq c0687Rq = new C0687Rq(this.A05, new WeakReference(this.A07), 10, ID.A1R(this.A05));
        c0687Rq.setCornerRadius(A0E);
        c0687Rq.setLogMultipleImpressions(false);
        c0687Rq.setCheckAssetsByJavascriptBridge(false);
        c0687Rq.setWebViewTimeoutInMillis(this.A04.A08());
        c0687Rq.setRequestId(this.A03.A0Z());
        c0687Rq.setOnTouchListener(new OW(this));
        WebSettings settings = c0687Rq.getSettings();
        settings.setLoadWithOverviewMode(true);
        settings.setUseWideViewPort(true);
        settings.setAllowFileAccess(true);
        if (Build.VERSION.SDK_INT >= 16) {
            settings.setAllowFileAccessFromFileURLs(true);
        }
        if (Build.VERSION.SDK_INT > 16) {
            c0687Rq.addJavascriptInterface(new OY(this.A05, this, this.A06, this.A02, this.A03.A0U()), A06(0, 12, j.AppCompatTheme_textColorAlertDialogListItem));
        }
        return c0687Rq;
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x00b8, code lost:
        if (r3 <= com.facebook.ads.redexgen.X.ID.A0G(r8)) goto L12;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x00ba, code lost:
        r3 = r9.A09;
        r2 = com.facebook.ads.redexgen.X.OX.A0D;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x00ce, code lost:
        if (r2[0].charAt(14) == r2[7].charAt(14)) goto L17;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x00d0, code lost:
        r3.AAK();
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x00d3, code lost:
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x00d4, code lost:
        r2 = com.facebook.ads.redexgen.X.OX.A0D;
        r2[0] = "1qrV4xG42mjJ5wR1PYF4mguO0xYm8sMw";
        r2[7] = "To2gWJFbGkwQ4PRGYAw3BZd3UXo54AHv";
        r3.AAK();
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x00f2, code lost:
        if (r3 <= com.facebook.ads.redexgen.X.ID.A0G(r8)) goto L12;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x00f5, code lost:
        r6.A03(0);
        r9.A05.A06().A8u(r5, com.facebook.ads.redexgen.X.C01877l.A2D, r6);
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:?, code lost:
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:?, code lost:
        return;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void A0A() {
        /*
            Method dump skipped, instructions count: 272
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.ads.redexgen.X.OX.A0A():void");
    }

    public final void A0B() {
        String A0E2;
        if (this.A04.A0J()) {
            C01887m c01887m = new C01887m(A06(j.AppCompatTheme_toolbarStyle, 29, 33));
            JSONObject jSONObject = new JSONObject();
            try {
                jSONObject.put(A06(170, 17, 66), this.A04.A0F());
                jSONObject.put(A06(187, 5, 69), this.A03.A0U());
            } catch (JSONException e) {
                Log.e(A06(92, 15, 31), A06(12, 13, 65), e);
            }
            c01887m.A05(jSONObject);
            c01887m.A03(1);
            InterfaceC01867k A06 = this.A05.A06();
            if (A0D[4].charAt(0) == 'P') {
                throw new RuntimeException();
            }
            A0D[1] = "TEDpWyR4sKSlO4xRZxixfnQAFgDgpHMF";
            int i = C01877l.A2F;
            String A062 = A06(155, 15, 98);
            A06.A8v(A062, i, c01887m);
            if (ID.A0n(this.A05) && L3.A00(this.A05) == L2.A07) {
                this.A05.A06().A8v(A062, C01877l.A2E, c01887m);
                this.A07.AAh(0, null);
                return;
            }
        }
        try {
            C0687Rq c0687Rq = this.A08;
            if (!TextUtils.isEmpty(this.A04.A0B())) {
                A0E2 = this.A04.A0B();
            } else {
                A0E2 = this.A04.A0E();
            }
            c0687Rq.loadUrl(A0E2);
        } catch (Exception e2) {
            this.A05.A06().A8u(A06(192, 8, 57), C01877l.A2c, new C01887m(e2));
        }
    }

    public final void A0C() {
        if (ID.A1K(this.A05)) {
            C0806Wj c0806Wj = this.A05;
            if (A0D[2].length() == 31) {
                throw new RuntimeException();
            }
            A0D[1] = "2a9geg5CZy9bcTekyOeVTlcxLNQduX9G";
            c0806Wj.A09().AF4(this.A08);
        }
        this.A08.removeJavascriptInterface(A06(0, 12, j.AppCompatTheme_textColorAlertDialogListItem));
        if (A0D[3].length() != 23) {
            A0D[6] = "33aduEcFLWt6pdjLdZ5sJJvVvr5WDkst";
            this.A08.destroy();
            return;
        }
        this.A08.destroy();
    }

    public L6 getTouchDataRecorder() {
        return this.A08.getTouchDataRecorder();
    }

    @Nullable
    public C0627Pi getViewabilityChecker() {
        return this.A08.getViewabilityChecker();
    }
}
