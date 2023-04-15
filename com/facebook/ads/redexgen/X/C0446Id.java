package com.facebook.ads.redexgen.X;

import a.a.j;
import android.text.TextUtils;
import android.view.View;
import androidx.annotation.Nullable;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
/* renamed from: com.facebook.ads.redexgen.X.Id  reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public final class C0446Id {
    public static byte[] A00;
    public static final Map<String, String> A01;
    public static final Map<String, List<String>> A02;

    public static String A00(int i, int i2, int i3) {
        byte[] copyOfRange = Arrays.copyOfRange(A00, i, i + i2);
        for (int i4 = 0; i4 < copyOfRange.length; i4++) {
            copyOfRange[i4] = (byte) ((copyOfRange[i4] - i3) - 27);
        }
        return new String(copyOfRange);
    }

    public static void A03() {
        A00 = new byte[]{-68, -51, -49, -52, -33, -52, -42, -27, -34, -34, -43, -36, -3, 0, -14, -11, -16, 5, -6, -2, -10, -16, -2, 4, -68, -81, -69, -65, -81, -67, -66, -87, -66, -77, -73, -81, -87, -73, -67, -111, -108, 123, -126, -111, -118, -118, -127, -120, 123, -120, -117, -125, -125, -123, -118, -125};
    }

    static {
        A03();
        A02 = new HashMap();
        A01 = new HashMap();
    }

    @Nullable
    public static String A01(String str) {
        return A01.get(str);
    }

    public static List<String> A02(C0806Wj c0806Wj, JSONArray jSONArray) {
        ArrayList arrayList = new ArrayList();
        for (int eventIndex = 0; eventIndex < jSONArray.length(); eventIndex++) {
            try {
                arrayList.add(jSONArray.getString(eventIndex));
            } catch (JSONException e) {
                c0806Wj.A06().A8u(A00(39, 17, 1), C01877l.A1C, new C01887m(e));
            }
        }
        return arrayList;
    }

    public static void A04(View view, C0444Ib c0444Ib, EnumC0443Ia enumC0443Ia) {
        view.addOnAttachStateChangeListener(new View$OnAttachStateChangeListenerC0445Ic(c0444Ib, enumC0443Ia));
    }

    public static void A05(C0806Wj c0806Wj, String str, long j) {
        IT adEventManager = c0806Wj.A08();
        C0444Ib c0444Ib = new C0444Ib(str, adEventManager);
        HashMap hashMap = new HashMap();
        hashMap.put(A00(24, 15, 47), L5.A06(j));
        hashMap.put(A00(12, 12, j.AppCompatTheme_windowMinWidthMajor), L5.A04(j));
        c0444Ib.A02(EnumC0443Ia.A0D, hashMap);
    }

    public static void A06(C0806Wj c0806Wj, JSONObject jSONObject, long j, @Nullable String str) {
        JSONObject optJSONObject = jSONObject.optJSONObject(A00(2, 4, 80));
        if (optJSONObject == null) {
            return;
        }
        JSONArray optJSONArray = jSONObject.optJSONArray(A00(6, 6, 85));
        if (TextUtils.isEmpty(str) && optJSONArray != null) {
            A07(c0806Wj, optJSONObject, A02(c0806Wj, optJSONArray), j, null);
        } else if (TextUtils.isEmpty(str) || !A02.containsKey(str)) {
        } else {
            A07(c0806Wj, optJSONObject, A02.get(str), j, str);
        }
    }

    public static void A07(C0806Wj c0806Wj, JSONObject jSONObject, List<String> list, long j, @Nullable String str) {
        String A002 = A00(0, 2, 62);
        if (jSONObject.has(A002)) {
            String clientToken = jSONObject.optString(A002);
            A08(clientToken, str);
            A09(clientToken, list);
            A05(c0806Wj, clientToken, j);
        }
    }

    public static void A08(@Nullable String str, @Nullable String str2) {
        if (TextUtils.isEmpty(str) || TextUtils.isEmpty(str2)) {
            return;
        }
        A01.put(str, str2);
    }

    public static void A09(String str, List<String> events) {
        if (TextUtils.isEmpty(str) || events.isEmpty()) {
            return;
        }
        A02.put(str, events);
    }

    public static boolean A0A(String str, EnumC0443Ia enumC0443Ia) {
        return A0B(str, enumC0443Ia.A02());
    }

    public static boolean A0B(String str, String str2) {
        return A02.containsKey(str) && A02.get(str).contains(str2);
    }
}
