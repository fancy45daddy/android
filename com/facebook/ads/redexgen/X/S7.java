package com.facebook.ads.redexgen.X;

import a.a.j;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.RelativeLayout;
import java.util.Arrays;
/* loaded from: assets/audience_network.dex */
public final class S7 implements InterfaceC0520Ld {
    public static byte[] A0C;
    public int A00;
    public C0602Oj A01;
    public C01756y A02;
    public final C0806Wj A03;
    public final IT A04;
    public final InterfaceC0519Lc A05;
    public final InterfaceC0541Lz A06;
    public final P1 A07;
    public final K6 A0B = new K6() { // from class: com.facebook.ads.redexgen.X.9V
        public static byte[] A01;
        public static String[] A02 = {"AyjpfVMH4abbuU", "C4f54F5689i8nguXYuZVyawidNrV99tP", "", "kvcj7JPhLleA0fC5", "qT9ER7mxQyIS", "DVCseFxiIzNfwa", "yADVvB6XdmuuqrvB", "b9AAn0hyeOBCYK5qzyR18"};

        public static String A00(int i, int i2, int i3) {
            byte[] copyOfRange = Arrays.copyOfRange(A01, i, i + i2);
            int i4 = 0;
            while (true) {
                int length = copyOfRange.length;
                if (A02[1].charAt(16) != 'Y') {
                    throw new RuntimeException();
                }
                String[] strArr = A02;
                strArr[7] = "MNhPeHQbaIIJpJ20hNozP";
                strArr[2] = "";
                if (i4 >= length) {
                    return new String(copyOfRange);
                }
                copyOfRange[i4] = (byte) ((copyOfRange[i4] - i3) - 60);
                i4++;
            }
        }

        public static void A01() {
            A01 = new byte[]{35, 22, 17, 18, 28, -10, 27, 33, 18, 31, 32, 33, 22, 33, 14, 25, -14, 35, 18, 27, 33};
        }

        static {
            A01();
        }

        /* JADX INFO: Access modifiers changed from: private */
        @Override // com.facebook.ads.redexgen.X.C8O
        /* renamed from: A02 */
        public final void A03(KV kv) {
            InterfaceC0519Lc interfaceC0519Lc;
            interfaceC0519Lc = S7.this.A05;
            interfaceC0519Lc.A3t(A00(0, 21, j.AppCompatTheme_windowActionModeOverlay), kv);
        }
    };
    public final AbstractC0501Kk A0A = new AbstractC0501Kk() { // from class: com.facebook.ads.redexgen.X.9U
        public static byte[] A01;

        static {
            A01();
        }

        public static String A00(int i, int i2, int i3) {
            byte[] copyOfRange = Arrays.copyOfRange(A01, i, i + i2);
            for (int i4 = 0; i4 < copyOfRange.length; i4++) {
                copyOfRange[i4] = (byte) ((copyOfRange[i4] ^ i3) ^ 63);
            }
            return new String(copyOfRange);
        }

        public static void A01() {
            A01 = new byte[]{72, 87, 90, 91, 81, 119, 80, 74, 91, 76, 77, 74, 87, 74, 95, 82, 123, 72, 91, 80, 74};
        }

        /* JADX INFO: Access modifiers changed from: private */
        @Override // com.facebook.ads.redexgen.X.C8O
        /* renamed from: A02 */
        public final void A03(C01736s c01736s) {
            InterfaceC0519Lc interfaceC0519Lc;
            interfaceC0519Lc = S7.this.A05;
            interfaceC0519Lc.A3t(A00(0, 21, 1), c01736s);
        }
    };
    public final AbstractC0534Lr A08 = new AbstractC0534Lr() { // from class: com.facebook.ads.redexgen.X.99
        public static byte[] A01;
        public static String[] A02 = {"OtZHHid0c6Ryk9CDDBq47ngXcNldIUWH", "JwrlVwQ54E2WwwQvkywQUOYHwL6g1bho", "WFiM5IPZvaQ4xMZm5xgvQ3FNROoMY2Kr", "al6ZIECO6LO12zMiuvYELaWNpYKDhozx", "wYAPbQwhGVteNN6MGdL8gA6824n9AnKf", "jTihIhEYsz4XSFMEjn7OlZEBUOzI3KNS", "mXaQIkSzTCVxPQuz9HLogqhmhIjgMyMR", "pEgzTi4rZbqmTwficQat67UuNHBZNbaD"};

        public static String A00(int i, int i2, int i3) {
            byte[] copyOfRange = Arrays.copyOfRange(A01, i, i + i2);
            for (int i4 = 0; i4 < copyOfRange.length; i4++) {
                copyOfRange[i4] = (byte) ((copyOfRange[i4] - i3) - 86);
            }
            return new String(copyOfRange);
        }

        public static void A01() {
            byte[] bArr = {17, 4, -1, 0, 10, -28, 9, 15, 0, 13, 14, 15, 4, 15, -4, 7, -32, 17, 0, 9, 15};
            String[] strArr = A02;
            if (strArr[6].charAt(4) != strArr[3].charAt(4)) {
                throw new RuntimeException();
            }
            A02[2] = "e0kN46odqljBIthjpUkTXG9hdDsWHsKW";
            A01 = bArr;
        }

        static {
            A01();
        }

        /* JADX INFO: Access modifiers changed from: private */
        @Override // com.facebook.ads.redexgen.X.C8O
        /* renamed from: A02 */
        public final void A03(C6v c6v) {
            InterfaceC0519Lc interfaceC0519Lc;
            interfaceC0519Lc = S7.this.A05;
            interfaceC0519Lc.A3t(A00(0, 21, 69), c6v);
        }
    };
    public final AbstractC0532Lp A09 = new AbstractC0532Lp() { // from class: com.facebook.ads.redexgen.X.97
        /* JADX INFO: Access modifiers changed from: private */
        @Override // com.facebook.ads.redexgen.X.C8O
        /* renamed from: A00 */
        public final void A03(C0533Lq c0533Lq) {
            InterfaceC0541Lz interfaceC0541Lz;
            interfaceC0541Lz = S7.this.A06;
            interfaceC0541Lz.AAi();
        }
    };

    static {
        A03();
    }

    public static String A02(int i, int i2, int i3) {
        byte[] copyOfRange = Arrays.copyOfRange(A0C, i, i + i2);
        for (int i4 = 0; i4 < copyOfRange.length; i4++) {
            copyOfRange[i4] = (byte) ((copyOfRange[i4] - i3) - 38);
        }
        return new String(copyOfRange);
    }

    public static void A03() {
        A0C = new byte[]{-49, -29, -30, -35, -34, -38, -49, -25, -17, -8, -11, -15, -6, 0, -32, -5, -9, -15, -6, -68, -70, -84, -107, -88, -69, -80, -67, -84, -118, -69, -88, -119, -68, -69, -69, -74, -75, -73, -86, -91, -90, -80, -118, -81, -75, -90, -77, -76, -75, -86, -75, -94, -83, -122, -73, -90, -81, -75, -99, -112, -117, -116, -106, 115, -106, -114, -114, -116, -103, -2, -15, -20, -19, -9, -43, -40, -52, 24, 11, 6, 7, 17, -11, 7, 7, 13, -10, 11, 15, 7, -66, -79, -84, -83, -73, -99, -102, -108};
    }

    public S7(C0806Wj c0806Wj, InterfaceC0541Lz interfaceC0541Lz, IT it, InterfaceC0519Lc interfaceC0519Lc) {
        this.A03 = c0806Wj;
        this.A04 = it;
        this.A06 = interfaceC0541Lz;
        this.A07 = new P1(c0806Wj);
        this.A07.A0c(new C01646h(c0806Wj));
        this.A07.getEventBus().A03(this.A0B, this.A0A, this.A08, this.A09);
        this.A05 = interfaceC0519Lc;
        this.A07.setIsFullScreen(true);
        this.A07.setVolume(1.0f);
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-1, -2);
        layoutParams.addRule(15);
        interfaceC0519Lc.A3I(this.A07, layoutParams);
        C0522Lf closeButton = new C0522Lf(c0806Wj);
        closeButton.setOnClickListener(new View$OnClickListenerC0539Lx(this));
        RelativeLayout.LayoutParams params = closeButton.getDefaultLayoutParams();
        interfaceC0519Lc.A3I(closeButton, params);
    }

    public final void A04(int i) {
        this.A07.setVideoProgressReportIntervalMs(i);
    }

    public final void A05(View view) {
        this.A07.setControlsAnchorView(view);
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC0520Ld
    public final void A8k(Intent intent, Bundle bundle, AnonymousClass59 anonymousClass59) {
        String stringExtra = intent.getStringExtra(A02(19, 18, 33));
        if (stringExtra != null && !stringExtra.isEmpty()) {
            OK ok = new OK(this.A03, stringExtra);
            RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-2, -2);
            int i = (int) (16.0f * Kd.A02);
            layoutParams.setMargins(i, i, i, i);
            layoutParams.addRule(10);
            layoutParams.addRule(9);
            ok.setOnClickListener(new View$OnClickListenerC0540Ly(this));
            this.A05.A3I(ok, layoutParams);
        }
        String ctaText = A02(77, 13, 124);
        this.A00 = intent.getIntExtra(ctaText, 0);
        C0806Wj c0806Wj = this.A03;
        IT it = this.A04;
        P1 p1 = this.A07;
        String A02 = A02(8, 11, j.AppCompatTheme_textAppearanceSearchResultTitle);
        String stringExtra2 = intent.getStringExtra(A02);
        String ctaText2 = A02(58, 11, 1);
        this.A02 = new C01756y(c0806Wj, it, p1, stringExtra2, intent.getBundleExtra(ctaText2));
        if (ID.A1L(this.A03)) {
            this.A01 = new C0602Oj(this.A03, this.A04, this.A07, intent.getStringExtra(A02), null);
        } else {
            this.A01 = null;
        }
        P1 p12 = this.A07;
        String ctaText3 = A02(69, 8, 98);
        p12.setVideoMPD(intent.getStringExtra(ctaText3));
        P1 p13 = this.A07;
        String ctaText4 = A02(90, 8, 34);
        p13.setVideoURI(intent.getStringExtra(ctaText4));
        int i2 = this.A00;
        if (i2 > 0) {
            this.A07.A0Y(i2);
        }
        String ctaText5 = A02(0, 8, 72);
        if (intent.getBooleanExtra(ctaText5, false)) {
            this.A07.A0b(EnumC0611Os.A04, 17);
        }
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC0520Ld
    public final void ABd(boolean z) {
        this.A05.A3t(A02(37, 21, 27), new L7());
        this.A07.A0W();
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC0520Ld
    public final void AC2(boolean z) {
        this.A05.A3t(A02(37, 21, 27), new C0502Kl());
        if (!this.A07.A0j()) {
            this.A07.A0b(EnumC0611Os.A04, 18);
        }
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC0520Ld
    public final void AEA(Bundle bundle) {
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC0520Ld
    public final boolean onActivityResult(int i, int i2, Intent intent) {
        return false;
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC0520Ld
    public final void onDestroy() {
        this.A05.A3t(A02(37, 21, 27), new C0482Jp(this.A00, this.A07.getCurrentPositionInMillis()));
        this.A02.A0d(this.A07.getCurrentPositionInMillis());
        C0602Oj c0602Oj = this.A01;
        if (c0602Oj != null) {
            c0602Oj.A09();
        }
        this.A07.A0Z(1);
        this.A07.A0V();
    }
}
