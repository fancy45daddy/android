package com.facebook.ads.redexgen.X;

import a.a.j;
import androidx.annotation.Nullable;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
/* loaded from: assets/audience_network.dex */
public final class Z3 implements InterfaceC00160i {
    public static byte[] A08;
    public static String[] A09 = {"a8CS69kVNecuN9Nm4E1lChlBM", "ag8ss2YsLKCBvL1N8ZsAQ7i2G", "9IBuBVemd2S2dbE3BWmY83r4APvNrK7d", "ZoqrROBX", "uf7sNUy4ZjnbrmNcJuZuOOSXLwo6bRiZ", "LuNKGusWtlIWkNNSsxJCgMD8UDEcDleP", "s1ncMgVhGbgxvH35X0QQBiYqSsxlrK3j", "2ghFrXKxVbUZFk6auJt6qCgV8pKBUCZ9"};
    public final EnumC00150h A00;
    public final String A01;
    public final String A02;
    @Nullable
    public final String A03;
    public final String A04;
    public final String A05;
    public final Collection<String> A06;
    public final Map<String, String> A07;

    /* JADX WARN: Failed to parse debug info
    java.lang.ArrayIndexOutOfBoundsException: Index 14 out of bounds for length 14
    	at jadx.plugins.input.dex.sections.debuginfo.DebugInfoParser.startVar(DebugInfoParser.java:203)
    	at jadx.plugins.input.dex.sections.debuginfo.DebugInfoParser.process(DebugInfoParser.java:125)
    	at jadx.plugins.input.dex.sections.DexCodeReader.getDebugInfo(DexCodeReader.java:118)
    	at jadx.core.dex.nodes.MethodNode.getDebugInfo(MethodNode.java:567)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.visit(DebugInfoAttachVisitor.java:39)
     */
    @Nullable
    public static Z3 A00(JSONObject jSONObject) {
        JSONArray jSONArray;
        if (jSONObject == null) {
            return null;
        }
        String optString = jSONObject.optString(A01(71, 6, 34));
        String optString2 = jSONObject.optString(A01(0, 18, 13));
        String optString3 = jSONObject.optString(A01(85, 10, 34));
        String A02 = C0500Kj.A02(jSONObject, A01(18, 2, 2));
        EnumC00150h A00 = EnumC00150h.A00(jSONObject.optString(A01(50, 21, 57)));
        try {
            jSONArray = new JSONArray(jSONObject.optString(A01(20, 17, 58)));
        } catch (JSONException e) {
            e.printStackTrace();
            jSONArray = null;
        }
        Collection<String> A01 = C00170j.A01(jSONArray);
        JSONObject optJSONObject = jSONObject.optJSONObject(A01(77, 8, 98));
        HashMap hashMap = new HashMap();
        if (optJSONObject != null) {
            Iterator<String> keys = optJSONObject.keys();
            while (true) {
                boolean hasNext = keys.hasNext();
                if (A09[4].charAt(10) == 'n') {
                    String[] strArr = A09;
                    strArr[3] = "3Uh3uJOo";
                    strArr[1] = "LYOYANb7jIXToaEoAzTea1MWV";
                    if (!hasNext) {
                        break;
                    }
                    String next = keys.next();
                    hashMap.put(next, optJSONObject.optString(next));
                } else {
                    throw new RuntimeException();
                }
            }
        }
        return new Z3(optString, optString2, A00, A01, hashMap, optString3, A02, C0500Kj.A02(jSONObject, A01(37, 13, 95)));
    }

    public static String A01(int i, int i2, int i3) {
        byte[] copyOfRange = Arrays.copyOfRange(A08, i, i + i2);
        for (int i4 = 0; i4 < copyOfRange.length; i4++) {
            copyOfRange[i4] = (byte) ((copyOfRange[i4] ^ i3) ^ j.AppCompatTheme_textAppearanceSearchResultSubtitle);
        }
        return new String(copyOfRange);
    }

    public static void A02() {
        A08 = new byte[]{9, 11, 28, 1, 30, 9, 28, 1, 7, 6, 55, 11, 7, 5, 5, 9, 6, 12, 4, 19, 59, 58, 43, 58, 60, 43, 54, 48, 49, 0, 44, 43, 45, 54, 49, 56, 44, 95, 84, 89, 72, 67, 74, 78, 95, 94, 101, 89, 74, 87, 53, 50, 42, 61, 48, 53, 56, 61, 40, 53, 51, 50, 3, 62, 57, 52, 61, 42, 53, 51, 46, 42, 38, 53, 44, 50, 55, 106, 98, 115, 102, 99, 102, 115, 102, 53, 34, 54, 50, 34, 52, 51, 24, 46, 35};
    }

    static {
        A02();
    }

    public Z3(String str, String str2, EnumC00150h enumC00150h, Collection<String> detectionStrings, Map<String, String> metadata, String str3, String str4, @Nullable String str5) {
        this.A04 = str;
        this.A01 = str2;
        this.A00 = enumC00150h;
        this.A06 = detectionStrings;
        this.A07 = metadata;
        this.A05 = str3;
        this.A02 = str4;
        this.A03 = str5;
    }

    public final String A03() {
        return this.A01;
    }

    public final String A04() {
        return this.A04;
    }

    @Nullable
    public final String A05() {
        return this.A03;
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC00160i
    public final String A63() {
        return this.A02;
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC00160i
    @Nullable
    public final Collection<String> A6M() {
        return this.A06;
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC00160i
    @Nullable
    public final EnumC00150h A6n() {
        return this.A00;
    }
}
