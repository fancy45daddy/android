package com.facebook.ads.redexgen.X;

import a.a.j;
import android.annotation.SuppressLint;
import android.content.ComponentName;
import android.content.Intent;
import android.net.Uri;
import android.os.Build;
import android.text.TextUtils;
import android.util.Log;
import androidx.annotation.Nullable;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
/* renamed from: com.facebook.ads.redexgen.X.Eu  reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public final class C0361Eu extends ZO {
    public static byte[] A02;
    public static String[] A03 = {"eZwrQOnpnpQE2xbRo0zNjy7tlobdqdqH", "SFt7WwZUn", "NjRPf9lXQVcUlHZaPZ2tHyzwDKEOZm5m", "vsw9aGbGyLBdbL44W3z8tEYPUFR7w9", "bZApvv", "GYK1wV", "jBSwIULngy0dc0IzE6SbgF9ev3BAFzHy", "9HFC3JFq8"};
    public static final String A04;
    public final Uri A00;
    public final Map<String, String> A01;

    public static String A03(int i, int i2, int i3) {
        byte[] copyOfRange = Arrays.copyOfRange(A02, i, i + i2);
        for (int i4 = 0; i4 < copyOfRange.length; i4++) {
            int i5 = (copyOfRange[i4] - i3) - 27;
            String[] strArr = A03;
            if (strArr[6].charAt(23) == strArr[0].charAt(23)) {
                throw new RuntimeException();
            }
            A03[3] = "uqLwDcTKX4SWJds2FMBMp5QNw2MnWtU";
            copyOfRange[i4] = (byte) i5;
        }
        return new String(copyOfRange);
    }

    /* JADX WARN: Failed to parse debug info
    java.lang.ArrayIndexOutOfBoundsException: Index 4 out of bounds for length 4
    	at jadx.plugins.input.dex.sections.debuginfo.DebugInfoParser.startVar(DebugInfoParser.java:203)
    	at jadx.plugins.input.dex.sections.debuginfo.DebugInfoParser.process(DebugInfoParser.java:125)
    	at jadx.plugins.input.dex.sections.DexCodeReader.getDebugInfo(DexCodeReader.java:118)
    	at jadx.core.dex.nodes.MethodNode.getDebugInfo(MethodNode.java:567)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.visit(DebugInfoAttachVisitor.java:39)
     */
    private final List<Intent> A05() {
        List<C00180k> A042 = A04();
        ArrayList arrayList = new ArrayList();
        if (A042 != null) {
            for (C00180k c00180k : A042) {
                Intent A00 = A00(c00180k);
                if (A00 != null) {
                    arrayList.add(A00);
                }
            }
        }
        return arrayList;
    }

    public static void A06() {
        A02 = new byte[]{106, -105, -105, -108, -105, 69, -107, -122, -105, -104, -114, -109, -116, 69, -122, -107, -107, -104, -114, -103, -118, -124, -119, -122, -103, -122, -124, -97, -89, -86, -93, -94, 94, -78, -83, 94, -83, -82, -93, -84, 94, -85, -97, -80, -87, -93, -78, 94, -77, -80, -86, 120, 94, -29, -27, -5, 8, -2, 12, 9, 3, -2, -108, -95, -105, -91, -94, -100, -105, 97, -100, -95, -89, -104, -95, -89, 97, -108, -106, -89, -100, -94, -95, 97, 119, 124, 116, Byte.MAX_VALUE, -94, -81, -91, -77, -80, -86, -91, 111, -86, -81, -75, -90, -81, -75, 111, -94, -92, -75, -86, -80, -81, 111, -105, -118, -122, -104, -8, 7, 7, 10, 0, 11, -4, -10, -5, -8, 11, -8, -3, -15, 2, -5, -11, 4, -54, -65, -65, -12, -11, 4, -15, -7, -4, 3, -49, -7, -12, -51, -75, 3, -26, -25, -36, -27, -36, -37, -42, -37, -36, -36, -25, -29, -32, -27, -30, -108, -107, -118, -109, -118, -119, -124, -104, -103, -108, -105, -118, -124, -117, -122, -111, -111, -121, -122, -120, -112, -124, -102, -105, -111, -38, -37, -48, -39, -48, -49, -54, -34, -33, -38, -35, -48, -54, -32, -35, -41, -70, -85, -68, -67, -77, -72, -79, -51, -50, -55, -52, -65, -71, -61, -66, -10, -9, -14, -11, -24, -30, -8, -11, -17, -96, -95, -100, -97, -110, -116, -94, -97, -103, -116, -92, -110, -113, -116, -109, -114, -103, -103, -113, -114, -112, -104, -90, -105, -98, 108, -72, -87, -80, -76, -74, -77, -79, -76, -72, 126};
    }

    static {
        A06();
        A04 = C0361Eu.class.getSimpleName();
    }

    public C0361Eu(C0806Wj c0806Wj, IT it, String str, Uri uri, Map<String, String> extraData, @Nullable C00190m c00190m, boolean z) {
        super(c0806Wj, it, str, c00190m, z);
        this.A00 = uri;
        this.A01 = extraData;
    }

    /* JADX WARN: Code restructure failed: missing block: B:15:0x0048, code lost:
        if (r3.startsWith(r0) != false) goto L16;
     */
    @androidx.annotation.Nullable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private android.content.Intent A00(com.facebook.ads.redexgen.X.C00180k r10) {
        /*
            Method dump skipped, instructions count: 286
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.ads.redexgen.X.C0361Eu.A00(com.facebook.ads.redexgen.X.0k):android.content.Intent");
    }

    private Intent A01(C00180k c00180k) {
        Intent intent = new Intent(A03(88, 26, 38));
        intent.addFlags(268435456);
        if (!TextUtils.isEmpty(c00180k.A05()) && !TextUtils.isEmpty(c00180k.A04())) {
            intent.setComponent(new ComponentName(c00180k.A05(), c00180k.A04()));
        }
        if (!TextUtils.isEmpty(c00180k.A03())) {
            intent.setData(KM.A00(c00180k.A03()));
        }
        return intent;
    }

    private final Uri A02() {
        String queryParameter = this.A00.getQueryParameter(A03(219, 9, j.AppCompatTheme_textColorAlertDialogListItem));
        if (!TextUtils.isEmpty(queryParameter)) {
            return KM.A00(queryParameter);
        }
        Uri uri = this.A00;
        String storeUrl = A03(211, 8, 63);
        String storeId = uri.getQueryParameter(storeUrl);
        Locale locale = Locale.US;
        Object[] objArr = {storeId};
        String storeUrl2 = A03(126, 22, j.AppCompatTheme_windowFixedWidthMinor);
        return KM.A00(String.format(locale, storeUrl2, objArr));
    }

    @Nullable
    private List<C00180k> A04() {
        String queryParameter = this.A00.getQueryParameter(A03(j.AppCompatTheme_windowFixedHeightMajor, 12, 124));
        if (TextUtils.isEmpty(queryParameter)) {
            return null;
        }
        String appsiteDataString = A03(53, 2, j.AppCompatTheme_tooltipFrameBackground);
        if (appsiteDataString.equals(queryParameter)) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        try {
            JSONObject jSONObject = new JSONObject(queryParameter);
            String appsiteDataString2 = A03(55, 7, 127);
            JSONArray optJSONArray = jSONObject.optJSONArray(appsiteDataString2);
            if (optJSONArray != null) {
                for (int i = 0; i < optJSONArray.length(); i++) {
                    C00180k A00 = C00180k.A00(optJSONArray.optJSONObject(i));
                    if (A00 != null) {
                        arrayList.add(A00);
                    }
                }
            }
        } catch (JSONException e) {
            InterfaceC01867k A06 = ((AbstractC00130f) this).A00.A06();
            int i2 = C01877l.A23;
            C01887m c01887m = new C01887m(e);
            String appsiteDataString3 = A03(204, 7, 47);
            A06.A8u(appsiteDataString3, i2, c01887m);
            String str = A04;
            String appsiteDataString4 = A03(0, 26, 10);
            Log.w(str, appsiteDataString4, e);
        }
        return arrayList;
    }

    private boolean A07() {
        List<Intent> appLaunchIntents = A05();
        if (appLaunchIntents == null) {
            return false;
        }
        for (Intent intent : appLaunchIntents) {
            if (K9.A0B(((AbstractC00130f) this).A00, intent)) {
                return true;
            }
        }
        return false;
    }

    private boolean A08() throws K7 {
        KL kl = new KL();
        try {
            KL.A0A(kl, ((AbstractC00130f) this).A00, A02(), ((AbstractC00130f) this).A02);
            return true;
        } catch (Exception unused) {
            String str = A03(26, 27, 35) + this.A00.toString();
            String queryParameter = this.A00.getQueryParameter(A03(228, 22, 18));
            if (queryParameter != null && queryParameter.length() > 0) {
                KL.A0A(kl, ((AbstractC00130f) this).A00, KM.A00(queryParameter), ((AbstractC00130f) this).A02);
                return false;
            }
            return false;
        }
    }

    public static boolean A09(C0806Wj c0806Wj, String str) {
        if (Build.VERSION.SDK_INT >= 30 && str != null) {
            boolean A1S = ID.A1S(c0806Wj);
            if (A03[3].length() == 13) {
                throw new RuntimeException();
            }
            String[] strArr = A03;
            strArr[7] = "1LqNNd92i";
            strArr[1] = "QkgxMECyk";
            if (A1S) {
                return true;
            }
        }
        return false;
    }

    @Override // com.facebook.ads.redexgen.X.AbstractC00130f
    @Nullable
    @SuppressLint({"CatchGeneralException"})
    public final EnumC00120e A0A() {
        EnumC00120e enumC00120e = null;
        String A032 = A03(148, 15, 92);
        boolean A0F = A0F(this.A00);
        if (!A0F) {
            A0F = A07();
        }
        if (!A0F) {
            try {
                A032 = A08() ? A03(188, 16, 80) : A03(163, 25, 10);
            } catch (Exception unused) {
                enumC00120e = EnumC00120e.A02;
            }
        }
        this.A01.put(A032, String.valueOf(true));
        return enumC00120e;
    }

    @Override // com.facebook.ads.redexgen.X.ZO
    public final void A0D() {
        EnumC00120e enumC00120e = null;
        if (((ZO) this).A02) {
            enumC00120e = A0A();
        } else {
            this.A01.put(A03(188, 16, 80), String.valueOf(true));
        }
        Map<String, String> map = this.A01;
        if (A03[3].length() == 13) {
            throw new RuntimeException();
        }
        A03[2] = "sgzsFq3t5RzUzGxHOqvhuB7Tq08HlvIk";
        A0E(map, enumC00120e);
    }
}
