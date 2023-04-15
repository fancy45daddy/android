package com.facebook.ads.redexgen.X;

import android.content.Intent;
import android.text.TextUtils;
import androidx.annotation.Nullable;
import com.facebook.ads.AdError;
import com.facebook.ads.CacheFlag;
import com.facebook.ads.RewardData;
import com.facebook.proguard.annotations.DoNotStrip;
import java.util.Arrays;
import java.util.EnumSet;
import org.json.JSONObject;
/* renamed from: com.facebook.ads.redexgen.X.1d  reason: invalid class name and case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public final class C00361d {
    public static byte[] A05;
    public static String[] A06 = {"jJreqFAWfQsm2UlBXjWleQZy51A8w9r3", "B5vxrqY9e1pfFDILbPSJEQZe5Zep9JAF", "7hwRhDIA2xM98ucsNVPICP0872", "8yYdfjKxcW1uK5E8nS4F9bT", "cwoTvwLLOWGZrFwonmn2qn9xu", "wuc4L", "VoE60CbUCih", "1JGxuEjawtyxaKItdz1AQ1lnM"};
    @Nullable
    public C6G A00;
    public N3 A01 = N3.A06;
    @Nullable
    @DoNotStrip
    public C0589Nw A02;
    public final C0865Ys A03;
    public final InterfaceC00351c A04;

    public static String A06(int i, int i2, int i3) {
        byte[] copyOfRange = Arrays.copyOfRange(A05, i, i + i2);
        for (int i4 = 0; i4 < copyOfRange.length; i4++) {
            copyOfRange[i4] = (byte) ((copyOfRange[i4] - i3) - 96);
        }
        return new String(copyOfRange);
    }

    public static void A07() {
        A05 = new byte[]{-97, -39, -27, -34, -35, -81, -44, -38, -53, -40, -44, -57, -46, -122, -85, -40, -40, -43, -40, -122, -104, -106, -106, -100, -122, -35, -49, -38, -50, -43, -37, -38, -122, -57, -122, -36, -57, -46, -49, -54, -122, -89, -54, -81, -44, -52, -43, -108, 31, 34, 29, 34, 31, 50, 31, 29, 32, 51, 44, 34, 42, 35, -45, -30, -37, -53, -48, -42, -57, -44, -43, -42, -53, -42, -53, -61, -50};
    }

    /* JADX WARN: Failed to parse debug info
    java.lang.ArrayIndexOutOfBoundsException: Index 25 out of bounds for length 23
    	at jadx.plugins.input.dex.sections.debuginfo.DebugInfoParser.startVar(DebugInfoParser.java:203)
    	at jadx.plugins.input.dex.sections.debuginfo.DebugInfoParser.process(DebugInfoParser.java:135)
    	at jadx.plugins.input.dex.sections.DexCodeReader.getDebugInfo(DexCodeReader.java:118)
    	at jadx.core.dex.nodes.MethodNode.getDebugInfo(MethodNode.java:567)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.visit(DebugInfoAttachVisitor.java:39)
     */
    private void A09(C0806Wj c0806Wj, EnumSet<CacheFlag> enumSet) {
        boolean A0r = this.A03.A0r();
        C6G A04 = A04(c0806Wj);
        A04.A0d(new C0444Ib(this.A03.A0U(), c0806Wj.A08()));
        boolean z = ID.A1W(c0806Wj) && C01405g.A0A(this.A03.A0d());
        if (z) {
            new C01405g(A04, this.A03.A0d(), this.A03.A0Y(), this.A03.A0Z(), z, new C0859Ym(this, c0806Wj, A0r)).A0B();
            return;
        }
        String A062 = A06(65, 12, 2);
        if (A0r) {
            C6C c6c = new C6C(this.A03.A0V(), this.A03.A0Z(), A062);
            c6c.A04 = true;
            c6c.A03 = A06(0, 5, 17);
            A04.A0X(c6c);
        }
        A04.A0c(new C6E(this.A03.A0R().A01(), OL.A04, OL.A04, this.A03.A0Z(), A06(65, 12, 2)));
        boolean contains = enumSet.contains(CacheFlag.VIDEO);
        int i = 0;
        boolean A29 = ID.A29(c0806Wj, PS.A03());
        for (C1B c1b : this.A03.A0c()) {
            C6E c6e = new C6E(c1b.A0D().A07(), C00421j.A00(c1b.A0D()), C00421j.A01(c1b.A0D()), this.A03.A0Z(), A06(65, 12, 2));
            if (i == 0) {
                A04.A0b(c6e);
            } else {
                A04.A0c(c6e);
            }
            for (String str : c1b.A0G().A00()) {
                A04.A0c(new C6E(str, -1, -1, this.A03.A0Z(), A06(65, 12, 2)));
            }
            if (contains && !TextUtils.isEmpty(c1b.A0D().A08())) {
                C6C c6c2 = new C6C(c1b.A0D().A08(), this.A03.A0Z(), A06(65, 12, 2), c1b.A0D().A05());
                c6c2.A04 = false;
                if (i == 0) {
                    if (!A0r || A29) {
                        A04.A0a(c6c2);
                    } else {
                        A04.A0X(c6c2);
                    }
                } else if (!A0r || A29) {
                    A04.A0Z(c6c2);
                } else {
                    A04.A0Y(c6c2);
                }
            }
            i++;
        }
        A04.A0W(new C0857Yk(this, c0806Wj, A0r), new AnonymousClass69(this.A03.A0Z(), A062));
    }

    /* JADX WARN: Failed to parse debug info
    java.lang.ArrayIndexOutOfBoundsException: Index 5 out of bounds for length 5
    	at jadx.plugins.input.dex.sections.debuginfo.DebugInfoParser.startVar(DebugInfoParser.java:203)
    	at jadx.plugins.input.dex.sections.debuginfo.DebugInfoParser.process(DebugInfoParser.java:135)
    	at jadx.plugins.input.dex.sections.DexCodeReader.getDebugInfo(DexCodeReader.java:118)
    	at jadx.core.dex.nodes.MethodNode.getDebugInfo(MethodNode.java:567)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.visit(DebugInfoAttachVisitor.java:39)
     */
    public final void A0H(C0806Wj c0806Wj, EnumSet<CacheFlag> enumSet) {
        AdError A00 = A00(c0806Wj);
        if (A00 != null) {
            this.A04.A9o(A00);
            return;
        }
        this.A04.ADc();
        if (A0C() == EnumC0471Jc.A09) {
            A08(c0806Wj);
        } else {
            A09(c0806Wj, enumSet);
        }
    }

    static {
        A07();
    }

    public C00361d(C0806Wj c0806Wj, C00491q c00491q, InterfaceC00351c interfaceC00351c, @Nullable String str) {
        JSONObject dataObject = c00491q.A03();
        this.A03 = A02(c0806Wj, c00491q, str, dataObject);
        this.A04 = interfaceC00351c;
    }

    @Nullable
    private AdError A00(C0806Wj c0806Wj) {
        if (this.A03.A0c().isEmpty()) {
            c0806Wj.A06().A8u(A06(62, 3, 18), C01877l.A0Z, new C01887m(A06(5, 43, 6)));
            return AdError.internalError(2006);
        }
        return null;
    }

    public static C0865Ys A02(C0806Wj c0806Wj, C00491q c00491q, @Nullable String str, JSONObject jSONObject) {
        C0865Ys A01 = C0865Ys.A01(jSONObject, c0806Wj);
        A01.A0i(str);
        AnonymousClass84 A012 = c00491q.A01();
        if (A012 != null) {
            A01.A0e(A012.A06());
        }
        return A01;
    }

    private C6G A04(C0806Wj c0806Wj) {
        C6G c6g = this.A00;
        return c6g != null ? c6g : new C6G(c0806Wj);
    }

    private void A08(C0806Wj c0806Wj) {
        C1W playableData = this.A03.A0O().A0D().A06();
        A0A(playableData != null ? playableData.A0A() : N3.A06);
        C0856Yj c0856Yj = new C0856Yj(this);
        C6G c6g = new C6G(c0806Wj);
        boolean z = ID.A1W(c0806Wj) && C01405g.A0A(this.A03.A0d());
        String[] strArr = A06;
        if (strArr[7].length() != strArr[4].length()) {
            throw new RuntimeException();
        }
        String[] strArr2 = A06;
        strArr2[6] = "rsw451NGt86";
        strArr2[2] = "Yd4DtCWl7E1Fg10XBidxjBNo2K";
        if (z) {
            C01405g c01405g = new C01405g(c6g, this.A03.A0d(), this.A03.A0Y(), this.A03.A0Z(), z, new C0855Yi(this));
            c6g.A0d(new C0444Ib(this.A03.A0U(), c0806Wj.A08()));
            c01405g.A0B();
            return;
        }
        C0865Ys c0865Ys = this.A03;
        String[] strArr3 = A06;
        if (strArr3[1].charAt(24) != strArr3[0].charAt(24)) {
            C00461n.A02(c0806Wj, c0865Ys, true, c0856Yj);
            return;
        }
        String[] strArr4 = A06;
        strArr4[6] = "NvwaqOE8NtZ";
        strArr4[2] = "Mi75BUZiVIPk9FHJPOQQgiG4jh";
        C00461n.A02(c0806Wj, c0865Ys, true, c0856Yj);
    }

    private void A0A(N3 n3) {
        this.A01 = n3;
    }

    public final AnonymousClass18 A0B() {
        return this.A03;
    }

    public final EnumC0471Jc A0C() {
        if (this.A03.A0r()) {
            return EnumC0471Jc.A03;
        }
        int size = this.A03.A0c().size();
        String[] strArr = A06;
        if (strArr[6].length() != strArr[2].length()) {
            A06[3] = "f4kXngrP8CD5dz";
            if (size > 1) {
                return EnumC0471Jc.A07;
            }
            if (this.A03.A0O().A0D().A06() != null) {
                EnumC0471Jc enumC0471Jc = EnumC0471Jc.A09;
                String[] strArr2 = A06;
                if (strArr2[7].length() == strArr2[4].length()) {
                    A06[3] = "ny";
                    return enumC0471Jc;
                }
            } else if (A0I()) {
                EnumC0471Jc enumC0471Jc2 = EnumC0471Jc.A0A;
                String[] strArr3 = A06;
                if (strArr3[6].length() != strArr3[2].length()) {
                    A06[3] = "JH";
                    return enumC0471Jc2;
                }
                throw new RuntimeException();
            } else {
                EnumC0471Jc enumC0471Jc3 = EnumC0471Jc.A08;
                if (A06[3].length() == 32) {
                    A06[3] = "ySAy4b6nQ";
                    return enumC0471Jc3;
                }
                String[] strArr4 = A06;
                strArr4[1] = "93R6MUXHMTxUt8WfLt1oZ3ea5zubl3sl";
                strArr4[0] = "9xXPI1nVQC4CSUB4soKlPH985bh9DAt9";
                return enumC0471Jc3;
            }
        }
        throw new RuntimeException();
    }

    public final N3 A0D() {
        return this.A01;
    }

    public final String A0E() {
        return this.A03.A0U();
    }

    public final void A0F() {
        this.A04.AF6();
    }

    public final void A0G(Intent intent, RewardData rewardData, String str) {
        this.A03.A0g(rewardData);
        this.A03.A0k(str);
        intent.putExtra(A06(48, 14, 94), this.A03);
    }

    public final boolean A0I() {
        return !TextUtils.isEmpty(this.A03.A0O().A0D().A08());
    }

    public final boolean A0J() {
        return this.A03.A0o();
    }
}
