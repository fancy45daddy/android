package com.facebook.ads.redexgen.X;

import androidx.annotation.Nullable;
import com.facebook.ads.internal.api.BuildConfigApi;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Locale;
import java.util.Set;
import org.json.JSONArray;
import org.json.JSONObject;
/* renamed from: com.facebook.ads.redexgen.X.Wt  reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public final class C0816Wt implements InterfaceC01445k {
    public static byte[] A03;
    public static String[] A04 = {"Yyt8Jrp", "FvQHlihhdkZe9tXm7YLHdG4gIBqm", "h7ITXytSbKbsxwMfZDKdUPEvMsTrizAq", "0TuNzKSIMRKA8K3EzRQL94hbriXTa7QT", "ySuQOOQJHVodSpCznPaDLfXVVxuxvbGA", "XYB8XYCfCTfWBGtKG07Wi1HuHmIQx2qC", "71D0xe3tljOi7f3b0iOVOXaXnoSWhNo4", "dwdYeokke3ChTNA3vTF4hdqHGwVronGN"};
    public final QD A01;
    public Set<InterfaceC01475n> A00 = new HashSet();
    public final List<InterfaceC01465m> A02 = new ArrayList();

    public static String A00(int i, int i2, int i3) {
        byte[] copyOfRange = Arrays.copyOfRange(A03, i, i + i2);
        for (int i4 = 0; i4 < copyOfRange.length; i4++) {
            copyOfRange[i4] = (byte) ((copyOfRange[i4] - i3) - 107);
        }
        return new String(copyOfRange);
    }

    public static void A02() {
        A03 = new byte[]{-72, -72, -67, 11, -46, -72, -67, 11, 41, 59, 59, 45, 60, 59};
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Failed to parse debug info
    java.lang.ArrayIndexOutOfBoundsException: Index 9 out of bounds for length 8
    	at jadx.plugins.input.dex.sections.debuginfo.DebugInfoParser.process(DebugInfoParser.java:147)
    	at jadx.plugins.input.dex.sections.DexCodeReader.getDebugInfo(DexCodeReader.java:118)
    	at jadx.core.dex.nodes.MethodNode.getDebugInfo(MethodNode.java:567)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.visit(DebugInfoAttachVisitor.java:39)
     */
    public synchronized void A03() {
        if (!this.A01.A8Z()) {
            BuildConfigApi.isDebug();
            return;
        }
        Set<InterfaceC01475n> A01 = A01(this.A01.A6H());
        if (!this.A00.equals(A01) && A01 != null) {
            this.A00 = A01;
            for (InterfaceC01465m interfaceC01465m : this.A02) {
                interfaceC01465m.A3S();
            }
        }
        if (BuildConfigApi.isDebug()) {
            for (InterfaceC01475n interfaceC01475n : this.A00) {
                String.format(Locale.US, A00(0, 8, 45), interfaceC01475n.A7h(), interfaceC01475n.getUrl());
            }
        }
    }

    static {
        A02();
    }

    public C0816Wt(FH fh) {
        this.A01 = fh.A4O(QE.A0B);
        this.A01.A3F(new C0817Wu(this));
        A03();
    }

    @Nullable
    public static Set<InterfaceC01475n> A01(JSONObject jSONObject) {
        C0815Ws A00;
        HashSet hashSet = new HashSet();
        JSONArray optJSONArray = jSONObject.optJSONArray(A00(8, 6, 93));
        if (optJSONArray == null) {
            return null;
        }
        for (int i = 0; i < optJSONArray.length(); i++) {
            JSONObject optJSONObject = optJSONArray.optJSONObject(i);
            if (optJSONObject == null || (A00 = C0815Ws.A00(optJSONObject)) == null) {
                return null;
            }
            hashSet.add(A00);
            if (A04[1].length() == 21) {
                throw new RuntimeException();
            }
            String[] strArr = A04;
            strArr[6] = "2zeGpFgTpOohtr7xv9EhLTO87hKhrQIZ";
            strArr[3] = "Z45Lb0RXWpRaUi2IX7mXCACeVe5qt7dU";
        }
        return hashSet;
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC01445k
    public final void A3D(InterfaceC01465m interfaceC01465m) {
        this.A02.add(interfaceC01465m);
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC01445k
    public final synchronized Set<InterfaceC01475n> A5h() {
        return new HashSet(this.A00);
    }
}
