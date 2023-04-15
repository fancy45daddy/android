package com.facebook.ads.redexgen.X;

import a.a.j;
import android.content.SharedPreferences;
import android.text.TextUtils;
import android.webkit.JavascriptInterface;
import com.facebook.ads.internal.api.BuildConfigApi;
import java.lang.ref.WeakReference;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;
/* loaded from: assets/audience_network.dex */
public final class O7 {
    public static byte[] A08;
    public WeakReference<C0589Nw> A00;
    public WeakReference<RH> A01 = new WeakReference<>(null);
    public boolean A02 = false;
    public final C0806Wj A03;
    public final C0577Nj A04;
    public final String A05;
    public final String A06;
    public final WeakReference<IT> A07;

    static {
        A09();
    }

    public static String A01(int i, int i2, int i3) {
        byte[] copyOfRange = Arrays.copyOfRange(A08, i, i + i2);
        for (int i4 = 0; i4 < copyOfRange.length; i4++) {
            copyOfRange[i4] = (byte) ((copyOfRange[i4] - i3) - 116);
        }
        return new String(copyOfRange);
    }

    public static void A09() {
        A08 = new byte[]{44, 56, 54, 54, 42, 55, 45, 10, 11, 12, 7, 27, 18, 26, 63, 78, 71, 58, -29, -14, -21, -21, -30, -23, -36, -32, -20, -31, -30, 12, 27, 20, 20, 11, 18, 5, 19, 11, 25, 25, 7, 13, 11, -37, -22, -29, -29, -38, -31, -44, -23, -18, -27, -38, -23, -29, -9, 52, 53, 36, 46, 41, 90, 75, 95, 93, 79, 78, 44, 99, 63, 93, 79, 92, 57, 58, 39, 56, 58, 43, 42, 8, 63, 27, 57, 43, 56, 83, 84, 65, 84, 69, 48, 45, 39, 6, 32, 52, -10, -31, -20, -11, -27};
    }

    public O7(C0806Wj c0806Wj, C0589Nw c0589Nw, IT it, C0577Nj c0577Nj, String str, String str2) {
        this.A03 = c0806Wj;
        this.A00 = new WeakReference<>(c0589Nw);
        this.A07 = new WeakReference<>(it);
        this.A04 = c0577Nj;
        this.A05 = str;
        this.A06 = str2;
    }

    public static Map<String, String> A03(JSONObject jSONObject) {
        Iterator<String> keys = jSONObject.keys();
        HashMap hashMap = new HashMap();
        while (keys.hasNext()) {
            String next = keys.next();
            hashMap.put(next, jSONObject.optString(next));
        }
        return hashMap;
    }

    private void A04() {
        RH uxListener = this.A01.get();
        if (uxListener == null) {
            return;
        }
        uxListener.close();
    }

    private void A05() {
        RH uxListener = this.A01.get();
        if (uxListener == null) {
            return;
        }
        uxListener.A7z();
    }

    private void A06() {
        RH uxListener = this.A01.get();
        if (uxListener == null) {
            return;
        }
        uxListener.A8e();
    }

    private void A07() {
        this.A03.A0D().A4t();
        this.A02 = true;
        RH uxListener = this.A01.get();
        if (uxListener == null) {
            return;
        }
        uxListener.AEt();
        if (ID.A1K(this.A03)) {
            this.A03.A09().AAN();
        }
    }

    private void A08() {
        RH uxActionsJavascriptListener = this.A01.get();
        if (uxActionsJavascriptListener == null) {
            return;
        }
        uxActionsJavascriptListener.AAl();
    }

    private void A0A(C0589Nw c0589Nw, String str) throws JSONException {
        JSONObject jSONObject = new JSONObject(str);
        SharedPreferences A00 = C0473Jf.A00(this.A03);
        String A01 = A01(0, 0, 21);
        String storageValue = jSONObject.optString(A01(57, 5, 81), A01);
        String opId = A01(54, 3, 10);
        String key = jSONObject.optString(opId, A01(7, 7, 50));
        String string = A00.getString(A01(14, 4, j.AppCompatTheme_textAppearanceSmallPopupMenu) + key, A01);
        if (string != null) {
            A01 = string;
        }
        c0589Nw.A0g(storageValue, A01);
    }

    private void A0B(C0589Nw c0589Nw, String str) throws JSONException {
        JSONObject jSONObject = new JSONObject(str);
        String A01 = A01(0, 0, 21);
        String optString = jSONObject.optString(A01(98, 5, 12), A01);
        String optString2 = jSONObject.optString(A01(57, 5, 81), A01);
        String optString3 = jSONObject.optString(A01(54, 3, 10), A01(7, 7, 50));
        SharedPreferences.Editor edit = C0473Jf.A00(this.A03).edit();
        edit.putString(A01(14, 4, j.AppCompatTheme_textAppearanceSmallPopupMenu) + optString3, optString).apply();
        c0589Nw.A0f(optString2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void A0C(O5 o5, String str) throws JSONException {
        switch (o5) {
            case A0A:
                A0I(new JSONObject(str));
                break;
            case A0E:
                A06();
                break;
            case A03:
                A04();
                break;
            case A0D:
                A07();
                break;
            case A09:
                A0K(new JSONObject(str));
                break;
            case A0H:
                A0L(new JSONObject(str));
                break;
            case A04:
                if (BuildConfigApi.isDebug()) {
                }
                break;
            case A0M:
                A05();
            case A07:
                this.A03.A0D().A55(str);
                break;
            case A0C:
            case A0N:
            case A0K:
            case A0J:
            case A0G:
                A0D(o5, str);
                break;
            case A0B:
                A0J(new JSONObject(str));
                break;
            case A08:
                A08();
                break;
            case A0I:
                A0M(new JSONObject(str));
                break;
        }
        C0589Nw c0589Nw = this.A00.get();
        if (c0589Nw == null) {
            return;
        }
        switch (o5) {
            case A06:
                c0589Nw.A0S();
                return;
            case A05:
                c0589Nw.A0R();
                return;
            case A0P:
                A0B(c0589Nw, str);
                return;
            case A0L:
                A0A(c0589Nw, str);
                return;
            case A0F:
                c0589Nw.A0i(A03(new JSONObject(str)));
                return;
            default:
                return;
        }
    }

    private void A0D(O5 o5, String str) throws JSONException {
        RH rh = this.A01.get();
        if (rh == null) {
            return;
        }
        switch (o5) {
            case A0C:
                rh.AAp();
                return;
            case A0N:
                rh.ACE();
                return;
            case A0K:
                A0G(rh, str);
                return;
            case A0J:
                A0F(rh, str);
                return;
            case A0G:
                A0E(rh, str);
                return;
            default:
                return;
        }
    }

    private void A0E(RH rh, String str) throws JSONException {
        JSONObject jSONObject = new JSONObject(str);
        String STATE_KEY = A01(87, 5, j.AppCompatTheme_tooltipForegroundColor);
        rh.ABT(jSONObject.optBoolean(STATE_KEY, false));
    }

    private void A0F(RH rh, String str) throws JSONException {
        JSONObject jSONObject = new JSONObject(str);
        String PAUSED_BY_USER_KEY = A01(62, 12, j.AppCompatTheme_windowMinWidthMajor);
        rh.ACh(jSONObject.optBoolean(PAUSED_BY_USER_KEY, false));
    }

    private void A0G(RH rh, String str) throws JSONException {
        JSONObject jSONObject = new JSONObject(str);
        String STARTED_BY_USER_KEY = A01(74, 13, 82);
        rh.ACj(jSONObject.optBoolean(STARTED_BY_USER_KEY, false));
    }

    private void A0I(JSONObject jSONObject) {
        RH rh = this.A01.get();
        if (rh == null) {
            return;
        }
        String productUrl = jSONObject.optString(A01(0, 7, 85));
        if (TextUtils.isEmpty(productUrl)) {
            rh.A7u();
        } else {
            rh.A7v(productUrl);
        }
    }

    private void A0J(JSONObject jSONObject) {
        RH uxListener = this.A01.get();
        if (uxListener == null) {
            return;
        }
        jSONObject.optString(A01(0, 7, 85));
    }

    private void A0K(JSONObject jSONObject) {
        IT it = this.A07.get();
        if (it == null) {
            return;
        }
        String optString = jSONObject.optString(A01(43, 11, 1));
        if (TextUtils.isEmpty(optString)) {
            return;
        }
        new C0444Ib(this.A06, it).A03(optString, A03(jSONObject));
    }

    private void A0L(JSONObject jSONObject) {
        int optInt = jSONObject.optInt(A01(18, 11, 9), -1);
        if (optInt == -1) {
            return;
        }
        String optString = jSONObject.optString(A01(29, 14, 50));
        if (TextUtils.isEmpty(optString)) {
            return;
        }
        this.A03.A0D().A8s(optInt, optString);
    }

    private void A0M(JSONObject jSONObject) {
        String optString;
        RH rh = this.A01.get();
        if (rh == null || (optString = jSONObject.optString(A01(92, 6, 71))) == null) {
            return;
        }
        rh.ACw(optString);
    }

    public final void A0N(RH rh) {
        this.A01 = new WeakReference<>(rh);
    }

    public final boolean A0O() {
        return this.A02;
    }

    @JavascriptInterface
    public void postMessage(String str) {
        L8.A00(new O3(this, str));
    }
}
