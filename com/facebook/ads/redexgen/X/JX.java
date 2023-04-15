package com.facebook.ads.redexgen.X;

import a.a.j;
import android.text.TextUtils;
import com.facebook.ads.internal.protocol.AdErrorType;
import java.util.Arrays;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
/* loaded from: assets/audience_network.dex */
public final class JX {
    public static JX A00;
    public static byte[] A01;

    /* JADX WARN: Failed to parse debug info
    java.lang.ArrayIndexOutOfBoundsException: Index 15 out of bounds for length 15
    	at jadx.plugins.input.dex.sections.debuginfo.DebugInfoParser.startVar(DebugInfoParser.java:203)
    	at jadx.plugins.input.dex.sections.debuginfo.DebugInfoParser.process(DebugInfoParser.java:125)
    	at jadx.plugins.input.dex.sections.DexCodeReader.getDebugInfo(DexCodeReader.java:118)
    	at jadx.core.dex.nodes.MethodNode.getDebugInfo(MethodNode.java:567)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.visit(DebugInfoAttachVisitor.java:39)
     */
    private C0706Sj A01(C0806Wj c0806Wj, JSONObject jSONObject, long j) throws JSONException {
        JSONObject jSONObject2 = jSONObject.getJSONArray(A04(124, 10, 18)).getJSONObject(0);
        AnonymousClass83 anonymousClass83 = new AnonymousClass83(AnonymousClass84.A00(jSONObject2.getJSONObject(A04(88, 10, 63))), jSONObject2.optString(A04(j.AppCompatTheme_textAppearanceSmallPopupMenu, 14, 70)), jSONObject2.optString(A04(0, 19, 98)));
        String A04 = A04(26, 3, 57);
        if (jSONObject2.has(A04)) {
            JSONArray jSONArray = jSONObject2.getJSONArray(A04);
            for (int i = 0; i < jSONArray.length(); i++) {
                JSONObject jSONObject3 = jSONArray.getJSONObject(i);
                C0446Id.A06(c0806Wj, jSONObject3, j, null);
                String optString = jSONObject3.optString(A04(19, 7, 39));
                String optString2 = jSONObject3.optString(A04(73, 15, 82));
                JSONObject optJSONObject = jSONObject3.optJSONObject(A04(51, 4, 3));
                JSONArray optJSONArray = jSONObject3.optJSONArray(A04(134, 8, 21));
                if (optJSONObject != null) {
                    anonymousClass83.A09(new AnonymousClass81(optString, optString2, optJSONObject, optJSONArray));
                } else {
                    c0806Wj.A0D().A4Z(AdErrorType.UNKNOWN_ERROR.getErrorCode(), A04(55, 18, j.AppCompatTheme_windowFixedWidthMajor));
                }
            }
        }
        return new C0706Sj(anonymousClass83, jSONObject.optString(A04(29, 18, 1)));
    }

    public static String A04(int i, int i2, int i3) {
        byte[] copyOfRange = Arrays.copyOfRange(A01, i, i + i2);
        for (int i4 = 0; i4 < copyOfRange.length; i4++) {
            copyOfRange[i4] = (byte) ((copyOfRange[i4] ^ i3) ^ j.AppCompatTheme_windowMinWidthMinor);
        }
        return new String(copyOfRange);
    }

    public static void A05() {
        A01 = new byte[]{116, 113, 74, 103, 112, 101, 122, 103, 97, 124, 123, 114, 74, 118, 122, 123, 115, 124, 114, 49, 52, 49, 32, 36, 53, 34, 47, 42, 61, 23, 24, 41, 0, 23, 26, 31, 18, 23, 2, 31, 25, 24, 41, 3, 3, 31, 18, 96, 108, 103, 102, 16, 21, 0, 21, 103, 98, 119, 98, 76, 97, 105, 102, 96, 119, 35, 106, 112, 35, 109, 118, 111, 111, 65, 68, 81, 68, 122, 72, 74, 65, 64, 73, 122, 81, 92, 85, 64, 44, 45, 46, 33, 38, 33, 60, 33, 39, 38, 69, 82, 82, 79, 82, 87, 84, 80, 69, 68, 67, 84, 110, 82, 94, 95, 87, 88, 86, 66, 74, 92, 92, 78, 72, 74, 21, 9, 4, 6, 0, 8, 0, 11, 17, 22, 22, 16, 3, 1, 9, 7, 16, 17, 77, 64, 73, 92};
    }

    static {
        A05();
        A00 = new JX();
    }

    public static synchronized JX A00() {
        JX jx;
        synchronized (JX.class) {
            jx = A00;
        }
        return jx;
    }

    private C0705Si A02(JSONObject jSONObject) {
        return new C0705Si(jSONObject.optString(A04(j.AppCompatTheme_windowFixedWidthMinor, 7, 88), A04(0, 0, 87)), jSONObject.optInt(A04(47, 4, j.AppCompatTheme_windowFixedWidthMajor), 0), null);
    }

    private C0705Si A03(JSONObject jSONObject) {
        try {
            JSONArray placements = jSONObject.getJSONArray(A04(124, 10, 18));
            JSONObject definition = placements.getJSONObject(0);
            AnonymousClass84 A002 = AnonymousClass84.A00(definition.getJSONObject(A04(88, 10, 63)));
            String featureConfig = definition.optString(A04(j.AppCompatTheme_textAppearanceSmallPopupMenu, 14, 70));
            return new C0705Si(jSONObject.optString(A04(j.AppCompatTheme_windowFixedWidthMinor, 7, 88), A04(0, 0, 87)), jSONObject.optInt(A04(47, 4, j.AppCompatTheme_windowFixedWidthMajor), 0), new AnonymousClass83(A002, featureConfig, definition.optString(A04(0, 19, 98))));
        } catch (JSONException unused) {
            return A02(jSONObject);
        }
    }

    public final JZ A06(C0806Wj c0806Wj, String str, long j) throws JSONException {
        if (!TextUtils.isEmpty(str)) {
            JSONObject jSONObject = new JSONObject(str);
            String optString = jSONObject.optString(A04(142, 4, 78));
            char c = 65535;
            int hashCode = optString.hashCode();
            String A04 = A04(98, 5, 87);
            if (hashCode != 96432) {
                if (hashCode == 96784904 && optString.equals(A04)) {
                    c = 1;
                }
            } else if (optString.equals(A04(26, 3, 57))) {
                c = 0;
            }
            if (c == 0) {
                return A01(c0806Wj, jSONObject, j);
            }
            if (c != 1) {
                JSONObject jsonResponse = jSONObject.optJSONObject(A04);
                if (jsonResponse != null) {
                    return A02(jsonResponse);
                }
            } else {
                return A03(jSONObject);
            }
        }
        return new JZ(JY.A04);
    }
}
