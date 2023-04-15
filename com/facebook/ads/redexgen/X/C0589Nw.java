package com.facebook.ads.redexgen.X;

import a.a.j;
import android.annotation.SuppressLint;
import android.annotation.TargetApi;
import android.os.Build;
import android.util.Base64;
import androidx.annotation.Nullable;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.Locale;
import java.util.Map;
import java.util.UUID;
import java.util.concurrent.atomic.AtomicInteger;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
/* renamed from: com.facebook.ads.redexgen.X.Nw */
/* loaded from: assets/audience_network.dex */
public final class C0589Nw {
    public static byte[] A0K;
    public static final AtomicInteger A0L;
    public static final AtomicInteger A0M;
    @Nullable
    public InterfaceC0579Nl A02;
    @Nullable
    public InterfaceC0587Nu A03;
    @Nullable
    public InterfaceC0588Nv A04;
    @Nullable
    public C0627Pi A05;
    public final int A08;
    public final AnonymousClass18 A09;
    public final C6G A0A;
    public final C0806Wj A0B;
    public final IT A0C;
    public final C0444Ib A0D;
    public final C0577Nj A0E;
    public final RI A0F;
    public final O7 A0G;
    public final O8 A0H;
    public final LinkedList<C0586Nt> A0J = new LinkedList<>();
    public L6 A01 = new L6();
    public boolean A07 = true;
    public boolean A06 = false;
    public long A00 = -1;
    public final String A0I = UUID.randomUUID().toString();

    public static String A0A(int i, int i2, int i3) {
        byte[] copyOfRange = Arrays.copyOfRange(A0K, i, i + i2);
        for (int i4 = 0; i4 < copyOfRange.length; i4++) {
            copyOfRange[i4] = (byte) ((copyOfRange[i4] ^ i3) ^ 2);
        }
        return new String(copyOfRange);
    }

    public static void A0D() {
        A0K = new byte[]{37, 63, 39, 56, 59, 39, 57, 13, 34, 40, 62, 35, 37, 40, 5, 34, 56, 41, 62, 42, 45, 47, 41, 5, 0, 54, 1, 20, 11, 22, 16, 13, 10, 3, 34, 13, 10, 13, 23, 12, 1, 0, 76, 67, 65, 23, 67, 77, 95, 96, 101, 83, 100, 113, 110, 115, 117, 104, 111, 102, 82, 117, 96, 115, 117, 100, 101, 41, 38, 36, 114, 38, 40, 58, 34, 55, 55, 34, 32, 43, 38, 39, 20, 21, 13, 54, 46, 10, 9, 28, 11, 0, 13, 12, 46, 26, 9, 5, 13, 44, 9, 28, 9, 84, 66, 69, 69, 82, 89, 67, 96, 97, 121, 66, 90, 48, 36, 55, 59, 51, 37, 120, 121, 86, 116, 99, 126, 97, 126, 99, 110, 71, 118, 98, 100, 114, 115, 63, 48, 50, 100, 48, 62, 44, 36, 37, 10, 40, 63, 34, 61, 34, 63, 50, 25, 46, 56, 62, 38, 46, 47, 99, 108, 110, 56, 108, 98, 112, 83, 82, Byte.MAX_VALUE, 80, 83, 79, 89, 122, 73, 80, 80, 79, 95, 78, 89, 89, 82, 106, 85, 89, 75, 20, 27, 25, 79, 27, 21, 67, 66, 106, 89, 64, 64, 95, 79, 94, 73, 73, 66, 122, 69, 73, 91, 4, 11, 9, 95, 11, 5, 72, 73, 113, 70, 75, 82, 66, 117, 66, 70, 67, 15, 0, 2, 84, 0, 11, 7, 0, 2, 84, 0, 11, 7, 0, 2, 84, 0, 14, 28, 120, 121, 65, 118, 123, 98, 114, 64, 101, 126, 99, 99, 114, 121, 63, 48, 50, 100, 48, 59, 55, 48, 50, 100, 48, 62, 44, 106, 124, 122, 118, 119, 125, 70, 122, 113, 120, 119, 119, 124, 117, 20, 2, 19, 38, 18, 19, 15, 44, 2, 30, 79, 64, 66, 20, 64, 75, 64, 66, 20, 64, 78, 92, 77, 91, 74, 124, 95, 77, 91, 8, 10, Byte.MAX_VALUE, 77, 77, 91, 74, 77, 22, 25, 27, 77, 25, 18, 25, 27, 77, 25, 23, 2, 20, 5, 51, 16, 2, 20, 71, 69, 50, 30, 31, 23, 24, 22, 89, 86, 84, 2, 86, 93, 86, 84, 2, 86, 88, 57, 34, 57, 44, 33, 26, 27, 3, 56, 32, 38, 33, 63, 29, 2, 15, 14, 4, 46, 29, 14, 5, 31, 67, 76, 78, 24, 76, 71, 75, 76, 78, 24, 76, 71, 75, 76, 78, 24, 76, 66, 80, 14, 17, 29, 15, 42, 29, 25, 28, 1, 44, 23, 43, 16, 23, 15, 80, 95, 93, 11, 95, 81, 67};
    }

    /* JADX WARN: Failed to parse debug info
    java.lang.ArrayIndexOutOfBoundsException: Index 22 out of bounds for length 22
    	at jadx.plugins.input.dex.sections.debuginfo.DebugInfoParser.startVar(DebugInfoParser.java:203)
    	at jadx.plugins.input.dex.sections.debuginfo.DebugInfoParser.process(DebugInfoParser.java:135)
    	at jadx.plugins.input.dex.sections.DexCodeReader.getDebugInfo(DexCodeReader.java:118)
    	at jadx.core.dex.nodes.MethodNode.getDebugInfo(MethodNode.java:567)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.visit(DebugInfoAttachVisitor.java:39)
     */
    public final void A0i(Map<String, String> map) {
        String A0A = A0A(87, 16, j.AppCompatTheme_toolbarNavigationButtonStyle);
        if (map.containsKey(A0A) && ID.A1L(this.A0B)) {
            try {
                JSONArray jSONArray = new JSONArray(map.get(A0A));
                ArrayList arrayList = new ArrayList();
                for (int i = 0; i < jSONArray.length(); i++) {
                    JSONArray jSONArray2 = new JSONArray(jSONArray.getString(i));
                    String string = jSONArray2.getString(0);
                    String string2 = jSONArray2.getString(1);
                    String string3 = jSONArray2.getString(2);
                    String string4 = jSONArray2.getString(3);
                    if (string != null && string2 != null && string3 != null) {
                        R2 r2 = new R2(this.A09.A0U(), Long.parseLong(string), Long.parseLong(string2), Long.parseLong(string3));
                        r2.A05(Long.parseLong(string4));
                        arrayList.add(r2);
                    }
                }
                String A04 = R1.A04(arrayList);
                HashMap hashMap = new HashMap();
                hashMap.put(A0A(j.AppCompatTheme_windowFixedHeightMinor, 6, 84), A04);
                if (A04 != null) {
                    this.A0C.A9C(this.A09.A0U(), hashMap);
                }
            } catch (Exception e) {
                this.A0B.A06().A8u(A0A(274, 14, 27), 3600, new C01887m(e));
            }
        }
        if (map.containsKey(A0A)) {
            map.remove(A0A);
        }
        this.A0C.A8t(this.A09.A0U(), new N2(map).A03(this.A05).A05());
    }

    static {
        A0D();
        A0M = new AtomicInteger();
        A0L = new AtomicInteger();
    }

    public C0589Nw(C0806Wj c0806Wj, AnonymousClass18 anonymousClass18, IT it, int i) {
        this.A0B = c0806Wj;
        this.A0C = it;
        this.A09 = anonymousClass18;
        this.A08 = i;
        this.A0F = new RI(this, c0806Wj);
        this.A0A = new C6G(this.A0B);
        this.A0D = new C0444Ib(anonymousClass18.A0U(), it);
        this.A0E = new C0577Nj(anonymousClass18.A0Z(), anonymousClass18.A0O().A0D().A08(), i);
        this.A0H = O9.A00(this.A0B, anonymousClass18.A0d(), this.A0A, this.A0D, this.A0E, A0H());
        this.A0G = new O7(this.A0B, this, it, this.A0E, this.A0I, anonymousClass18.A0U());
    }

    public static /* synthetic */ AnonymousClass18 A01(C0589Nw c0589Nw) {
        return c0589Nw.A09;
    }

    public static /* synthetic */ InterfaceC0579Nl A06(C0589Nw c0589Nw) {
        return c0589Nw.A02;
    }

    public static AtomicInteger A0B() {
        return A0L;
    }

    private void A0C() {
        A0F(new C0586Nt(A0A(288, 22, j.AppCompatTheme_textAppearanceSearchResultSubtitle), new String[]{this.A0I, A0A(1, 6, 11)}));
        String assets = Base64.encodeToString(this.A0H.A05.toString().getBytes(), 0).replace(A0A(0, 1, 45), A0A(0, 0, j.AppCompatTheme_tooltipFrameBackground));
        String assets2 = this.A0I;
        A0F(new C0586Nt(A0A(310, 26, 60), new String[]{assets, assets2}));
    }

    @TargetApi(21)
    public synchronized void A0E() {
        if (this.A06) {
            while (!this.A0J.isEmpty()) {
                C0586Nt poll = this.A0J.poll();
                if (poll != null) {
                    this.A0F.A05(String.format(Locale.US, poll.A00, poll.A02));
                    if (poll.A01) {
                        this.A0D.A02(EnumC0443Ia.A0L, null);
                        this.A0B.A0D().A4u(poll.A00);
                    }
                }
            }
        }
    }

    private synchronized void A0F(C0586Nt c0586Nt) {
        this.A0J.offer(c0586Nt);
        A0E();
    }

    private boolean A0H() {
        return !A0I();
    }

    private boolean A0I() {
        return ID.A29(this.A0B, PS.A03());
    }

    public final C0444Ib A0K() {
        return this.A0D;
    }

    public final L6 A0L() {
        return this.A01;
    }

    public final C0577Nj A0M() {
        return this.A0E;
    }

    @Nullable
    public final InterfaceC0579Nl A0N() {
        return this.A02;
    }

    public final RI A0O() {
        return this.A0F;
    }

    public final void A0P() {
        A0F(new C0586Nt(A0A(23, 26, j.AppCompatTheme_textAppearanceSearchResultTitle), new String[]{this.A0I}));
    }

    public final void A0Q() {
        A0F(new C0586Nt(A0A(49, 25, 3), new String[]{this.A0I}));
    }

    public final void A0R() {
        this.A07 = true;
    }

    public final void A0S() {
        this.A07 = false;
    }

    public final void A0T() {
        A0F(new C0586Nt(A0A(121, 23, 21), new String[]{this.A0I}));
    }

    public final void A0U() {
        A0F(new C0586Nt(A0A(168, 27, 62), new String[]{this.A0I}));
    }

    public final void A0V() {
        A0F(new C0586Nt(A0A(195, 22, 46), new String[]{this.A0I}));
    }

    public final void A0W() {
        A0F(new C0586Nt(A0A(404, 22, 122), new String[]{this.A0I}));
    }

    @SuppressLint({"AddJavascriptInterface"})
    public final void A0X() {
        String str;
        if (Build.VERSION.SDK_INT > 16) {
            this.A0F.addJavascriptInterface(this.A0G, A0A(7, 16, 78));
        }
        this.A0D.A02(EnumC0443Ia.A0O, null);
        if (this.A08 == 3) {
            str = this.A0H.A00;
        } else {
            str = this.A0H.A01;
        }
        this.A0F.loadUrl(str);
        this.A00 = System.currentTimeMillis();
        JSONObject jSONObject = new JSONObject();
        try {
            String url = A0A(372, 3, 81);
            jSONObject.put(url, str);
            jSONObject.put(A0A(j.AppCompatTheme_textAppearanceSmallPopupMenu, 12, 53), C0590Nx.A00());
            jSONObject.put(A0A(362, 10, 79), A0M.getAndIncrement());
            jSONObject.put(A0A(74, 13, 65), A0L);
        } catch (JSONException unused) {
        }
        this.A0B.A0D().A50(jSONObject.toString());
        A0C();
    }

    public final void A0Y() {
        A0F(new C0586Nt(A0A(144, 24, 73), new String[]{this.A0I}));
    }

    public final void A0Z(L6 l6) {
        this.A01 = l6;
    }

    public final void A0a(@Nullable InterfaceC0579Nl interfaceC0579Nl) {
        this.A02 = interfaceC0579Nl;
    }

    public final void A0b(InterfaceC0587Nu interfaceC0587Nu) {
        this.A03 = interfaceC0587Nu;
    }

    public final void A0c(InterfaceC0588Nv interfaceC0588Nv) {
        this.A04 = interfaceC0588Nv;
    }

    public final void A0d(RH rh) {
        this.A0G.A0N(rh);
    }

    public final void A0e(@Nullable C0627Pi c0627Pi) {
        this.A05 = c0627Pi;
    }

    public final void A0f(String str) {
        A0F(new C0586Nt(A0A(247, 27, 21), new String[]{this.A0I, str}));
    }

    public final void A0g(String str, String str2) {
        A0F(new C0586Nt(A0A(217, 30, 37), new String[]{this.A0I, str, str2}));
    }

    public final void A0h(String str, JSONObject jSONObject) {
        A0F(new C0586Nt(A0A(375, 29, j.AppCompatTheme_textColorSearchUrl), new String[]{this.A0I, str, jSONObject.toString()}, false));
    }

    public final void A0j(JSONObject jSONObject) {
        A0F(new C0586Nt(A0A(336, 26, j.AppCompatTheme_windowFixedHeightMinor), new String[]{Base64.encodeToString(jSONObject.toString().getBytes(), 0).replace(A0A(0, 1, 45), A0A(0, 0, j.AppCompatTheme_tooltipFrameBackground)), this.A0I}));
    }

    public final boolean A0k() {
        return this.A0G.A0O();
    }

    public final boolean A0l() {
        return this.A07;
    }
}
