package com.facebook.ads.redexgen.X;

import a.a.j;
import android.annotation.SuppressLint;
import android.text.TextUtils;
import android.util.Log;
import androidx.annotation.Nullable;
import java.util.Arrays;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;
/* loaded from: assets/audience_network.dex */
public final class TI implements IT {
    @Nullable
    @SuppressLint({"StaticFieldLeak"})
    public static IT A03;
    public static byte[] A04;
    public static final String A05;
    public static volatile boolean A06;
    public final C0805Wi A00;
    public final C8S A01;
    public final IS A02;

    public static String A02(int i, int i2, int i3) {
        byte[] copyOfRange = Arrays.copyOfRange(A04, i, i + i2);
        for (int i4 = 0; i4 < copyOfRange.length; i4++) {
            copyOfRange[i4] = (byte) ((copyOfRange[i4] - i3) - 79);
        }
        return new String(copyOfRange);
    }

    public static void A03() {
        A04 = new byte[]{-90, -21, -4, -21, -12, -6, -76, -88, -37, -37, -52, -44, -41, -37, -48, -43, -50, -121, -37, -42, -121, -45, -42, -50, -121, -56, -43, -121, -48, -43, -35, -56, -45, -48, -53, -121, -43, -13, -30, -28, -26, -24, -26, -17, -26, -13, -22, -28, 46, 51, 42, 31};
    }

    static {
        A03();
        A05 = TI.class.getSimpleName();
        A06 = false;
    }

    public TI(C0805Wi c0805Wi) {
        IR dispatchCallback;
        this.A00 = c0805Wi;
        if (IF.A0T(c0805Wi)) {
            this.A01 = C8Q.A00(c0805Wi);
            dispatchCallback = IY.A01(c0805Wi, this.A01);
        } else {
            D7 A01 = C8Q.A01(c0805Wi);
            dispatchCallback = IY.A00(c0805Wi, A01);
            this.A01 = A01;
        }
        this.A02 = new TL(c0805Wi, dispatchCallback);
        LJ.A08.execute(new TK(this));
        A04(c0805Wi);
    }

    public static synchronized IT A01(C0805Wi c0805Wi) {
        IT it;
        synchronized (TI.class) {
            if (A03 == null) {
                A03 = new TI(c0805Wi);
            }
            it = A03;
        }
        return it;
    }

    public static synchronized void A04(C0805Wi c0805Wi) {
        synchronized (TI.class) {
            if (A06) {
                return;
            }
            c0805Wi.A02().A9n();
            A06 = true;
        }
    }

    private void A05(IQ iq) {
        if (!iq.A0A()) {
            String str = A05;
            Log.e(str, A02(7, 29, 24) + iq.A06() + A02(0, 7, 55));
            return;
        }
        A06(iq);
        this.A01.AFW(iq, new TJ(this, iq));
    }

    @SuppressLint({"ThrowException"})
    private void A06(IQ iq) {
        switch (IU.A00[iq.A06().ordinal()]) {
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
            case 7:
                C01887m c01887m = new C01887m(new Exception(A02(36, 5, 50)));
                c01887m.A03(1);
                try {
                    c01887m.A05(new JSONObject().put(A02(48, 4, j.AppCompatTheme_toolbarStyle), iq.A06().toString()));
                } catch (JSONException unused) {
                }
                this.A00.A06().A8v(A02(41, 7, 50), C01877l.A1H, c01887m);
                return;
            default:
                return;
        }
    }

    @Override // com.facebook.ads.redexgen.X.IT
    public final void A8n(String str, Map<String, String> data) {
        A05(new IP().A04(str).A00(this.A00.A07().A01()).A03(this.A00.A07().A02()).A05(data).A01(IV.A04).A02(IW.A04).A07(this.A00));
    }

    @Override // com.facebook.ads.redexgen.X.IT
    public final void A8p(String str, Map<String, String> data) {
        A05(new IP().A04(str).A00(this.A00.A07().A01()).A03(this.A00.A07().A02()).A05(data).A01(IV.A04).A02(IW.A06).A07(this.A00));
    }

    @Override // com.facebook.ads.redexgen.X.IT
    public final void A8q(String str, Map<String, String> data) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        A05(new IP().A04(str).A00(this.A00.A07().A01()).A03(this.A00.A07().A02()).A05(data).A01(IV.A04).A02(IW.A07).A06(C0446Id.A0A(str, EnumC0443Ia.A0I)).A07(this.A00));
    }

    @Override // com.facebook.ads.redexgen.X.IT
    public final void A8r(String str, Map<String, String> data) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        A05(new IP().A04(str).A00(this.A00.A07().A01()).A03(this.A00.A07().A02()).A05(data).A01(IV.A04).A02(IW.A08).A06(C0446Id.A0A(str, EnumC0443Ia.A06)).A07(this.A00));
    }

    @Override // com.facebook.ads.redexgen.X.IT
    public final void A8t(String str, Map<String, String> data) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        A05(new IP().A04(str).A00(this.A00.A07().A01()).A03(this.A00.A07().A02()).A05(data).A01(IV.A04).A02(IW.A0B).A07(this.A00));
    }

    @Override // com.facebook.ads.redexgen.X.IT
    public final void A8x(String str, Map<String, String> data) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        A05(new IP().A04(str).A00(this.A00.A07().A01()).A03(this.A00.A07().A02()).A05(data).A01(IV.A04).A02(IW.A0C).A07(this.A00));
    }

    @Override // com.facebook.ads.redexgen.X.IT
    public final void A8z(String str, Map<String, String> data) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        A05(new IP().A04(str).A00(this.A00.A07().A01()).A03(this.A00.A07().A02()).A05(data).A01(IV.A05).A02(IW.A0D).A06(C0446Id.A0A(str, EnumC0443Ia.A0T)).A07(this.A00));
    }

    @Override // com.facebook.ads.redexgen.X.IT
    public final void A90(String str, @Nullable Map<String, String> data) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        A05(new IP().A04(str).A00(this.A00.A07().A01()).A03(this.A00.A07().A02()).A05(data).A01(IV.A05).A02(IW.A0E).A07(this.A00));
    }

    @Override // com.facebook.ads.redexgen.X.IT
    public final void A91(String str, Map<String, String> data) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        A05(new IP().A04(str).A00(this.A00.A07().A01()).A03(this.A00.A07().A02()).A05(data).A01(IV.A05).A02(IW.A0F).A06(C0446Id.A0A(str, EnumC0443Ia.A0V)).A07(this.A00));
    }

    @Override // com.facebook.ads.redexgen.X.IT
    public final void A92(String str, Map<String, String> data) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        A05(new IP().A04(str).A00(this.A00.A07().A01()).A03(this.A00.A07().A02()).A05(data).A01(IV.A05).A02(IW.A0K).A06(C0446Id.A0A(str, EnumC0443Ia.A0W)).A07(this.A00));
    }

    @Override // com.facebook.ads.redexgen.X.IT
    public final void A93(String str, Map<String, String> data) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        A05(new IP().A04(str).A00(this.A00.A07().A01()).A03(this.A00.A07().A02()).A05(data).A01(IV.A05).A02(IW.A0H).A06(C0446Id.A0A(str, EnumC0443Ia.A0X)).A07(this.A00));
    }

    @Override // com.facebook.ads.redexgen.X.IT
    public final void A95(String str, Map<String, String> data) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        A05(new IP().A04(str).A00(this.A00.A07().A01()).A03(this.A00.A07().A02()).A05(data).A01(IV.A04).A02(IW.A0J).A06(C0446Id.A0A(str, EnumC0443Ia.A0Y)).A07(this.A00));
    }

    @Override // com.facebook.ads.redexgen.X.IT
    public final void A96(String str, Map<String, String> data, String str2, IV iv) {
        A05(new IP().A04(str).A00(this.A00.A07().A01()).A03(this.A00.A07().A02()).A05(data).A01(iv).A02(IW.A00(str2)).A07(this.A00));
    }

    @Override // com.facebook.ads.redexgen.X.IT
    public final void A97(String str, Map<String, String> data) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        IQ adEvent = new IP().A04(str).A00(this.A00.A07().A01()).A03(this.A00.A07().A02()).A05(data).A01(IV.A04).A02(IW.A0L).A07(this.A00);
        A05(adEvent);
    }

    @Override // com.facebook.ads.redexgen.X.IT
    public final void A9B(String str, Map<String, String> data) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        A05(new IP().A04(str).A00(this.A00.A07().A01()).A03(this.A00.A07().A02()).A05(data).A01(IV.A05).A02(IW.A0N).A06(C0446Id.A0A(str, EnumC0443Ia.A0a)).A07(this.A00));
    }

    @Override // com.facebook.ads.redexgen.X.IT
    public final void A9C(String str, Map<String, String> data) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        A05(new IP().A04(str).A00(this.A00.A07().A01()).A03(this.A00.A07().A02()).A05(data).A01(IV.A05).A02(IW.A0O).A06(C0446Id.A0A(str, EnumC0443Ia.A0b)).A07(this.A00));
    }

    @Override // com.facebook.ads.redexgen.X.IT
    public final void A9E(String str) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        A05(new IP().A04(str).A00(this.A00.A07().A01()).A03(this.A00.A07().A02()).A01(IV.A04).A02(IW.A0P).A06(C0446Id.A0A(str, EnumC0443Ia.A0c)).A07(this.A00));
    }

    @Override // com.facebook.ads.redexgen.X.IT
    public final void A9F(String str, Map<String, String> data) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        A05(new IP().A04(str).A00(this.A00.A07().A01()).A03(this.A00.A07().A02()).A05(data).A01(IV.A04).A02(IW.A0G).A07(this.A00));
    }

    @Override // com.facebook.ads.redexgen.X.IT
    public final void A9G(String str, Map<String, String> data) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        A05(new IP().A04(str).A00(this.A00.A07().A01()).A03(this.A00.A07().A02()).A05(data).A01(IV.A05).A02(IW.A0Q).A06(C0446Id.A0A(str, EnumC0443Ia.A0g)).A07(this.A00));
    }

    @Override // com.facebook.ads.redexgen.X.IT
    public final void A9H(String str, Map<String, String> data) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        A05(new IP().A04(str).A00(this.A00.A07().A01()).A03(this.A00.A07().A02()).A05(data).A01(IV.A04).A02(IW.A0U).A06(C0446Id.A0A(str, EnumC0443Ia.A0i)).A07(this.A00));
    }

    @Override // com.facebook.ads.redexgen.X.IT
    public final void A9I(String str, Map<String, String> data) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        A05(new IP().A04(str).A00(this.A00.A07().A01()).A03(this.A00.A07().A02()).A05(data).A01(IV.A04).A02(IW.A0T).A06(C0446Id.A0A(str, EnumC0443Ia.A0j)).A07(this.A00));
    }

    @Override // com.facebook.ads.redexgen.X.IT
    public final void A9J(String str, Map<String, String> data) {
        A05(new IP().A04(str).A00(this.A00.A07().A01()).A03(this.A00.A07().A02()).A05(data).A01(IV.A05).A02(IW.A0V).A07(this.A00));
    }

    @Override // com.facebook.ads.redexgen.X.IT
    public final void A9L(String str, Map<String, String> data) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        A05(new IP().A04(str).A00(this.A00.A07().A01()).A03(this.A00.A07().A02()).A05(data).A01(IV.A05).A02(IW.A0W).A07(this.A00));
    }

    @Override // com.facebook.ads.redexgen.X.IT
    public final void AD6(String str) {
        new Q8(this.A00).execute(str);
    }
}
