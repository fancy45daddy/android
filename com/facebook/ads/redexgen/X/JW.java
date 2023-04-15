package com.facebook.ads.redexgen.X;

import a.a.j;
import android.text.TextUtils;
import androidx.annotation.Nullable;
import com.facebook.ads.internal.protocol.AdErrorType;
import java.util.Arrays;
import java.util.Locale;
import java.util.Map;
import java.util.concurrent.Executor;
import java.util.concurrent.Executors;
/* loaded from: assets/audience_network.dex */
public final class JW {
    public static byte[] A07;
    public static final LH A08;
    public static final Executor A09;
    public long A00;
    @Nullable
    public JV A01;
    @Nullable
    public Map<String, String> A02;
    public final C2D A03;
    public final C0806Wj A04;
    public final JX A05;
    public final String A06;

    public static String A05(int i, int i2, int i3) {
        byte[] copyOfRange = Arrays.copyOfRange(A07, i, i + i2);
        for (int i4 = 0; i4 < copyOfRange.length; i4++) {
            copyOfRange[i4] = (byte) ((copyOfRange[i4] ^ i3) ^ 80);
        }
        return new String(copyOfRange);
    }

    public static void A0A() {
        A07 = new byte[]{57, 57, 110, 57, 51, 62, 111, 61, 122, 105, 107, 119, 117, 78, 65, 68, 72, 67, 89, 82, 95, 72, 92, 88, 72, 94, 89, 82, 68, 73, 98, 88, 11, 121, 101, 17, 11, 100, 101, 10, 108, 99, 102, 102, 10, 88, 79, 73, 79, 67, 92, 79, 78, 20, 53, 122, 28, 51, 54, 54, 122, 63, 40, 40, 53, 40, 122, 57, 53, 62, 63, 122, 1, Byte.MAX_VALUE, 41, 7, 122, Byte.MAX_VALUE, 41, 15, 13, 6, 13, 26, 1, 11, 81, 90, 75, 72, 80, 77, 84, 40, 41, 0, 47, 42, 42, 14, 41, 41, 45};
    }

    static {
        A0A();
        A08 = new LH();
        A09 = Executors.newCachedThreadPool(A08);
    }

    public JW(C0806Wj c0806Wj) {
        this(c0806Wj, C2E.A00(c0806Wj.A00()));
    }

    public JW(C0806Wj c0806Wj, C2D c2d) {
        this.A00 = -1L;
        this.A04 = c0806Wj;
        this.A05 = JX.A00();
        this.A06 = C0469Ja.A01(c0806Wj);
        this.A03 = c2d;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public InterfaceC0634Pp A03(long j, JT jt) {
        return new Sm(this, jt, j);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void A09() {
        C0806Wj c0806Wj = this.A04;
        if (c0806Wj == null || !Q6.A0A(c0806Wj)) {
            return;
        }
        C01887m c01887m = new C01887m(A05(8, 5, j.AppCompatTheme_toolbarStyle));
        c01887m.A03(1);
        this.A04.A06().A8u(A05(86, 7, j.AppCompatTheme_windowActionBar), C01877l.A1w, c01887m);
    }

    private void A0B(int i, String str) {
        String A05 = A05(93, 10, 22);
        JH.A05(A05, A05(37, 16, 122), A05(0, 8, 90));
        JH.A04(A05, String.format(Locale.US, A05(53, 26, 10), Integer.valueOf(i), str));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void A0C(J3 j3) {
        JV jv = this.A01;
        if (jv != null) {
            jv.AAc(j3);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void A0D(J3 j3) {
        L8.A00(new C0707Sk(this, j3));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void A0K(C0706Sj c0706Sj) {
        JV jv = this.A01;
        if (jv != null) {
            jv.ACM(c0706Sj);
        }
    }

    private void A0L(C0706Sj c0706Sj) {
        C7M syncModule;
        L8.A00(new C0708Sl(this, c0706Sj));
        if (ID.A1o(this.A04) && (syncModule = this.A04.A04()) != null) {
            syncModule.A5S();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void A0M(String str, long j, JT jt) {
        String clientChallenge;
        try {
            try {
                JZ A06 = this.A05.A06(this.A04, str, j);
                AnonymousClass83 A00 = A06.A00();
                if (A00 != null) {
                    ID.A0P(this.A04).A2E(A00.A08());
                    this.A04.A06().A9Q();
                    this.A03.A0N(A00.A06());
                    JS.A05(A00.A05().A0B(), jt);
                    LS.A01(this.A04, A09, A00);
                    C01887m c01887m = new C01887m(A05(30, 7, 123) + C0495Ke.A02());
                    c01887m.A04(1);
                    c01887m.A08(false);
                    this.A04.A06().A9K(A05(79, 7, 56), C01877l.A1W, c01887m);
                }
                int i = JU.A00[A06.A01().ordinal()];
                if (i == 1) {
                    C0706Sj c0706Sj = (C0706Sj) A06;
                    if (A00 != null) {
                        if (A00.A05().A0E()) {
                            JS.A07(str, jt);
                        }
                        if (this.A02 != null) {
                            clientChallenge = this.A02.get(A05(13, 17, 93));
                        } else {
                            clientChallenge = null;
                        }
                        if (!TextUtils.isEmpty(A06.A02()) && !TextUtils.isEmpty(clientChallenge)) {
                            this.A04.A01().AE2(this.A04, clientChallenge, A06.A02());
                        }
                    }
                    this.A04.A0D().A2k(L5.A01(this.A00));
                    A0L(c0706Sj);
                } else if (i != 2) {
                    AdErrorType adErrorType = AdErrorType.UNKNOWN_RESPONSE;
                    this.A04.A0D().A2j(L5.A01(this.A00), adErrorType.getErrorCode(), str, adErrorType.isPublicError());
                    A0D(J3.A01(adErrorType, str));
                } else {
                    C0705Si c0705Si = (C0705Si) A06;
                    String A04 = c0705Si.A04();
                    AdErrorType adErrorTypeFromCode = AdErrorType.adErrorTypeFromCode(c0705Si.A03(), AdErrorType.ERROR_MESSAGE);
                    A0B(c0705Si.A03(), A04);
                    if (A04 == null) {
                        A04 = str;
                    }
                    this.A04.A0D().A2j(L5.A01(this.A00), adErrorTypeFromCode.getErrorCode(), A04, adErrorTypeFromCode.isPublicError());
                    A0D(J3.A01(adErrorTypeFromCode, A04));
                }
            } catch (Exception e) {
                e = e;
                String message = e.getMessage();
                AdErrorType adErrorType2 = AdErrorType.PARSER_FAILURE;
                this.A04.A0D().A2j(L5.A01(this.A00), adErrorType2.getErrorCode(), message, adErrorType2.isPublicError());
                A0D(J3.A01(adErrorType2, message));
            }
        } catch (Exception e2) {
            e = e2;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void A0N(String str, long j, JT jt) {
        A09.execute(new C0709Sn(this, str, j, jt));
    }

    public final void A0O(JT jt) {
        this.A00 = System.currentTimeMillis();
        C01967u.A0B(this.A04);
        if (JS.A08(jt)) {
            LJ.A06.execute(new C0711Sp(this));
            String A02 = JS.A02(jt);
            if (A02 != null) {
                this.A04.A0D().AFB();
                A0N(A02, 0L, jt);
                return;
            }
            AdErrorType adErrorType = AdErrorType.LOAD_TOO_FREQUENTLY;
            this.A04.A0D().A2j(L5.A01(this.A00), adErrorType.getErrorCode(), adErrorType.getDefaultErrorMessage(), adErrorType.isPublicError());
            A0D(J3.A01(adErrorType, null));
            return;
        }
        A09.execute(new C0710So(this, jt));
    }

    public final void A0P(JV jv) {
        this.A01 = jv;
    }
}
