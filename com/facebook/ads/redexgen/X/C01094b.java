package com.facebook.ads.redexgen.X;

import a.a.j;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.Nullable;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
/* renamed from: com.facebook.ads.redexgen.X.4b  reason: invalid class name and case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public final class C01094b {
    public static byte[] A09;
    public static String[] A0A = {"ulA9tMpXJ0Fgz3L6", "kmBp6JcSqPlb9eogqvbvj6g5ppHVaWSS", "klPqAM4BpBJNr6xIOjiQhoS6UO4TrOHS", "7VyM9GgXJuu8YzSYQI3HrMroeBYRJajD", "jF2bnw6E6wYHKm8plX11kYiLrSAbSJmD", "6pBnRch9VxXRPJwtqH0gd323b09mKXXU", "Clk2oRExhn8z5HC1wWkAqM8aEwWEfAA8", "Myq33IQdIYqIzBMhSJhfspyke76FBM0c"};
    public C4a A01;
    public AbstractC01174j A04;
    public final /* synthetic */ C0339Dw A08;
    public final ArrayList<AbstractC01194l> A05 = new ArrayList<>();
    public ArrayList<AbstractC01194l> A02 = null;
    public final ArrayList<AbstractC01194l> A06 = new ArrayList<>();
    public final List<AbstractC01194l> A07 = Collections.unmodifiableList(this.A05);
    public int A03 = 2;
    public int A00 = 2;

    public static String A04(int i, int i2, int i3) {
        byte[] copyOfRange = Arrays.copyOfRange(A09, i, i + i2);
        for (int i4 = 0; i4 < copyOfRange.length; i4++) {
            copyOfRange[i4] = (byte) ((copyOfRange[i4] - i3) - 58);
        }
        return new String(copyOfRange);
    }

    public static void A05() {
        A09 = new byte[]{-91, -18, -8, -58, -7, -7, -26, -24, -19, -22, -23, -65, -59, -32, 39, 30, 30, 43, 29, 44, -14, -53, -48, -62, -21, 22, 7, 15, -62, 5, 17, 23, 16, 22, -36, -38, -33, 36, 37, 18, 37, 22, -21, -99, -69, -58, -58, -65, -66, 122, -51, -67, -52, -69, -54, 122, -48, -61, -65, -47, 122, -47, -61, -50, -62, 122, -69, -56, 122, -61, -56, -48, -69, -58, -61, -66, 122, -48, -61, -65, -47, -120, 122, -93, -56, -48, -69, -58, -61, -66, 122, -48, -61, -65, -47, -51, 122, -67, -69, -56, -56, -55, -50, 122, -68, -65, 122, -52, -65, -49, -51, -65, -66, 122, -64, -52, -55, -57, 122, -51, -67, -52, -69, -54, -122, 122, -50, -62, -65, -45, 122, -51, -62, -55, -49, -58, -66, 122, -52, -65, -68, -55, -49, -56, -66, 122, -64, -52, -55, -57, 122, -52, -65, -67, -45, -67, -58, -65, -52, 122, -54, -55, -55, -58, -120, -7, 30, 19, 31, 30, 35, 25, 35, 36, 21, 30, 19, 41, -48, 20, 21, 36, 21, 19, 36, 21, 20, -34, -48, -7, 30, 38, 17, 28, 25, 20, -48, 25, 36, 21, 29, -48, 32, 31, 35, 25, 36, 25, 31, 30, -48, -13, 24, 13, 25, 24, 29, 19, 29, 30, 15, 24, 13, 35, -54, 14, 15, 30, 15, 13, 30, 15, 14, -40, -54, -13, 24, 32, 11, 22, 19, 14, -54, 32, 19, 15, 33, -54, 18, 25, 22, 14, 15, 28, -54, 11, 14, 11, 26, 30, 15, 28, -54, 26, 25, 29, 19, 30, 19, 25, 24, -125, -88, -80, -101, -90, -93, -98, 90, -93, -82, -97, -89, 90, -86, -87, -83, -93, -82, -93, -87, -88, 90, -63, -47, -32, -49, -34, -34, -45, -46, -114, -35, -32, -114, -49, -30, -30, -49, -47, -42, -45, -46, -114, -28, -41, -45, -27, -31, -114, -37, -49, -25, -114, -36, -35, -30, -114, -48, -45, -114, -32, -45, -47, -25, -47, -38, -45, -46, -100, -114, -41, -31, -63, -47, -32, -49, -34, -88, -35, -10, -7, -87, -19, -18, -3, -22, -20, -15, -18, -19, -87, -1, -14, -18, 0, -87, -4, -15, -8, -2, -11, -19, -87, -21, -18, -87, -5, -18, -10, -8, -1, -18, -19, -87, -17, -5, -8, -10, -87, -37, -18, -20, 2, -20, -11, -18, -5, -33, -14, -18, 0, -87, -21, -18, -17, -8, -5, -18, -87, -14, -3, -87, -20, -22, -9, -87, -21, -18, -87, -5, -18, -20, 2, -20, -11, -18, -19, -61, -87, -102, -72, -65, -81, -76, -83, 102, -70, -75, 102, -72, -85, -87, -65, -87, -78, -85, 102, -89, -76, 102, -81, -83, -76, -75, -72, -85, -86, 102, -68, -81, -85, -67, 102, -82, -75, -78, -86, -85, -72, 116, 102, -97, -75, -69, 102, -71, -82, -75, -69, -78, -86, 102, -84, -81, -72, -71, -70, 102, -87, -89, -78, -78, 102, -71, -70, -75, -74, -113, -83, -76, -75, -72, -81, -76, -83, -100, -81, -85, -67, 110, -68, -81, -85, -67, 111, 102, -88, -85, -84, -75, -72, -85, 102, -87, -89, -78, -78, -81, -76, -83, 102, -72, -85, -87, -65, -87, -78, -85, 116, -19, -21, -6, -36, -17, -21, -3, -52, -11, -8, -42, -11, -7, -17, -6, -17, -11, -12, -57, -12, -22, -38, -1, -10, -21, -90, -8, -21, -6, -5, -8, -12, -21, -22, -90, -25, -90, -4, -17, -21, -3, -90, -6, -18, -25, -6, -90, -17, -7, -90, -17, -19, -12, -11, -8, -21, -22, -76, -90, -33, -11, -5, -90, -13, -5, -7, -6, -90, -23, -25, -14, -14, -90, -7, -6, -11, -10, -49, -19, -12, -11, -8, -17, -12, -19, -90, -24, -21, -20, -11, -8, -21, -90, -8, -21, -6, -5, -8, -12, -17, -12, -19, -90, -6, -18, -17, -7, -90, -4, -17, -21, -3, -76, -78, -80, -65, -95, -76, -80, -62, -111, -70, -67, -101, -70, -66, -76, -65, -76, -70, -71, -116, -71, -81, -97, -60, -69, -80, 107, -67, -80, -65, -64, -67, -71, -80, -81, 107, -84, 107, -63, -76, -80, -62, 107, -62, -77, -76, -82, -77, 107, -81, -70, -80, -66, 107, -71, -70, -65, 107, -77, -84, -63, -80, 107, -84, 107, -95, -76, -80, -62, -109, -70, -73, -81, -80, -67, -63, -74, -50, -60, -54, -55, 117, -66, -61, -71, -70, -51, 117, -56, -67, -60, -54, -63, -71, 117, -61, -60, -55, 117, -73, -70, 117, -126, -122, 117, -74, -69, -55, -70, -57, 117, -54, -61, -67, -66, -71, -66, -61, -68, 117, -74, 117, -53, -66, -70, -52, -113, -25, -26, -50, -31, -35, -17, -54, -35, -37, -15, -37, -28, -35, -36};
    }

    static {
        A05();
    }

    public C01094b(C0339Dw c0339Dw) {
        this.A08 = c0339Dw;
    }

    private final View A00(int i, boolean z) {
        return A0I(i, z, Long.MAX_VALUE).A0H;
    }

    private final AbstractC01194l A01(int i) {
        int size;
        int A0D;
        ArrayList<AbstractC01194l> arrayList = this.A02;
        if (arrayList == null || (size = arrayList.size()) == 0) {
            return null;
        }
        for (int i2 = 0; i2 < size; i2++) {
            AbstractC01194l abstractC01194l = this.A02.get(i2);
            if (!abstractC01194l.A0i()) {
                int i3 = abstractC01194l.A0I();
                if (i3 == i) {
                    abstractC01194l.A0T(32);
                    return abstractC01194l;
                }
            }
        }
        if (this.A08.A04.A0B() && (A0D = this.A08.A00.A0D(i)) > 0) {
            int offsetPosition = this.A08.A04.A0D();
            if (A0D < offsetPosition) {
                long A04 = this.A08.A04.A04(A0D);
                for (int i4 = 0; i4 < size; i4++) {
                    AbstractC01194l abstractC01194l2 = this.A02.get(i4);
                    if (!abstractC01194l2.A0i()) {
                        int offsetPosition2 = (abstractC01194l2.A0K() > A04 ? 1 : (abstractC01194l2.A0K() == A04 ? 0 : -1));
                        if (offsetPosition2 == 0) {
                            abstractC01194l2.A0T(32);
                            return abstractC01194l2;
                        }
                    }
                }
            }
        }
        return null;
    }

    private final AbstractC01194l A02(int i, boolean z) {
        View A08;
        int size = this.A05.size();
        for (int i2 = 0; i2 < size; i2++) {
            AbstractC01194l abstractC01194l = this.A05.get(i2);
            if (!abstractC01194l.A0i()) {
                int scrapCount = abstractC01194l.A0I();
                if (scrapCount == i && !abstractC01194l.A0b() && (this.A08.A0s.A09 || !abstractC01194l.A0c())) {
                    abstractC01194l.A0T(32);
                    return abstractC01194l;
                }
            }
        }
        if (!z && (A08 = this.A08.A01.A08(i)) != null) {
            AbstractC01194l A0G = C0339Dw.A0G(A08);
            this.A08.A01.A0G(A08);
            int A07 = this.A08.A01.A07(A08);
            if (A07 != -1) {
                this.A08.A01.A0C(A07);
                A0W(A08);
                A0G.A0T(8224);
                return A0G;
            }
            throw new IllegalStateException(A04(727, 52, 27) + A0G + this.A08.A1I());
        }
        int size2 = this.A06.size();
        for (int i3 = 0; i3 < size2; i3++) {
            AbstractC01194l abstractC01194l2 = this.A06.get(i3);
            if (!abstractC01194l2.A0b()) {
                int scrapCount2 = abstractC01194l2.A0I();
                if (scrapCount2 == i) {
                    if (!z) {
                        this.A06.remove(i3);
                    }
                    return abstractC01194l2;
                }
            }
        }
        return null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:15:0x0046, code lost:
        throw new java.lang.RuntimeException();
     */
    /* JADX WARN: Removed duplicated region for block: B:29:0x009a  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x00d4 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:63:0x00ec A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final com.facebook.ads.redexgen.X.AbstractC01194l A03(long r8, int r10, boolean r11) {
        /*
            Method dump skipped, instructions count: 313
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.ads.redexgen.X.C01094b.A03(long, int, boolean):com.facebook.ads.redexgen.X.4l");
    }

    private final void A06() {
        boolean z;
        int count = this.A06.size();
        for (int count2 = count - 1; count2 >= 0; count2--) {
            A07(count2);
        }
        this.A06.clear();
        z = C0339Dw.A1E;
        if (z) {
            this.A08.A02.A02();
        }
    }

    private final void A07(int i) {
        A0d(this.A06.get(i), true);
        this.A06.remove(i);
    }

    private void A08(ViewGroup viewGroup, boolean z) {
        for (int childCount = viewGroup.getChildCount() - 1; childCount >= 0; childCount--) {
            View childAt = viewGroup.getChildAt(childCount);
            if (childAt instanceof ViewGroup) {
                String[] strArr = A0A;
                String str = strArr[7];
                String str2 = strArr[6];
                int charAt = str.charAt(8);
                int i = str2.charAt(8);
                if (charAt == i) {
                    throw new RuntimeException();
                }
                A0A[4] = "0ZJbYELQTNKw4GYvMFOIJ2JFgvUoupt2";
                A08((ViewGroup) childAt, true);
            }
        }
        if (!z) {
            return;
        }
        if (viewGroup.getVisibility() == 4) {
            viewGroup.setVisibility(0);
            viewGroup.setVisibility(4);
            return;
        }
        int visibility = viewGroup.getVisibility();
        viewGroup.setVisibility(4);
        viewGroup.setVisibility(visibility);
    }

    private void A09(AbstractC01194l abstractC01194l) {
        if (this.A08.A1s()) {
            View view = abstractC01194l.A0H;
            if (AnonymousClass38.A00(view) == 0) {
                AnonymousClass38.A09(view, 1);
            }
            if (!AnonymousClass38.A0F(view)) {
                abstractC01194l.A0T(16384);
                AnonymousClass38.A0B(view, this.A08.A09.A0A());
            }
        }
    }

    private void A0A(AbstractC01194l abstractC01194l) {
        if (abstractC01194l.A0H instanceof ViewGroup) {
            A08((ViewGroup) abstractC01194l.A0H, false);
        }
    }

    private final void A0B(AbstractC01194l abstractC01194l) {
        if (this.A08.A07 != null) {
            throw new NullPointerException(A04(779, 14, 62));
        }
        C4H c4h = this.A08.A04;
        if (this.A08.A0s != null) {
            this.A08.A0t.A0B(abstractC01194l);
        }
    }

    private final boolean A0C(AbstractC01194l abstractC01194l) {
        if (abstractC01194l.A0c()) {
            return this.A08.A0s.A07();
        }
        if (abstractC01194l.A03 >= 0 && abstractC01194l.A03 < this.A08.A04.A0D()) {
            if (!this.A08.A0s.A07()) {
                int A03 = this.A08.A04.A03(abstractC01194l.A03);
                int type = abstractC01194l.A0H();
                if (A03 != type) {
                    return false;
                }
            }
            return !this.A08.A04.A0B() || abstractC01194l.A0K() == this.A08.A04.A04(abstractC01194l.A03);
        }
        throw new IndexOutOfBoundsException(A04(211, 60, j.AppCompatTheme_windowActionBarOverlay) + abstractC01194l + this.A08.A1I());
    }

    private boolean A0D(AbstractC01194l abstractC01194l, int i, int i2, long startBindNs) {
        abstractC01194l.A08 = this.A08;
        int A0H = abstractC01194l.A0H();
        long nanoTime = this.A08.getNanoTime();
        int viewType = (startBindNs > Long.MAX_VALUE ? 1 : (startBindNs == Long.MAX_VALUE ? 0 : -1));
        if (viewType != 0) {
            C4a c4a = this.A01;
            String[] strArr = A0A;
            String str = strArr[5];
            String str2 = strArr[3];
            int charAt = str.charAt(0);
            int viewType2 = str2.charAt(0);
            if (charAt == viewType2) {
                throw new RuntimeException();
            }
            A0A[0] = "We3abAYlnqMpJzTP";
            if (!c4a.A0A(A0H, nanoTime, startBindNs)) {
                return false;
            }
        }
        this.A08.A04.A0A(abstractC01194l, i);
        this.A01.A05(abstractC01194l.A0H(), this.A08.getNanoTime() - nanoTime);
        A09(abstractC01194l);
        if (this.A08.A0s.A07()) {
            abstractC01194l.A04 = i2;
            return true;
        }
        return true;
    }

    public final int A0E() {
        return this.A05.size();
    }

    public final View A0F(int i) {
        return this.A05.get(i).A0H;
    }

    public final View A0G(int i) {
        return A00(i, false);
    }

    public final C4a A0H() {
        if (this.A01 == null) {
            this.A01 = new C4a();
        }
        return this.A01;
    }

    @Nullable
    public final AbstractC01194l A0I(int i, boolean z, long j) {
        C4U c4u;
        boolean fromScrapOrHiddenOrCache;
        C0339Dw A0I;
        AbstractC01174j abstractC01174j;
        View A00;
        if (i >= 0 && i < this.A08.A0s.A03()) {
            boolean z2 = false;
            AbstractC01194l abstractC01194l = null;
            boolean fromScrapOrHiddenOrCache2 = this.A08.A0s.A07();
            boolean z3 = true;
            if (fromScrapOrHiddenOrCache2) {
                abstractC01194l = A01(i);
                z2 = abstractC01194l != null;
            }
            if (abstractC01194l == null && (abstractC01194l = A02(i, z)) != null) {
                boolean fromScrapOrHiddenOrCache3 = A0C(abstractC01194l);
                if (!fromScrapOrHiddenOrCache3) {
                    if (!z) {
                        abstractC01194l.A0T(4);
                        boolean fromScrapOrHiddenOrCache4 = abstractC01194l.A0d();
                        if (fromScrapOrHiddenOrCache4) {
                            this.A08.removeDetachedView(abstractC01194l.A0H, false);
                            abstractC01194l.A0S();
                        } else {
                            boolean fromScrapOrHiddenOrCache5 = abstractC01194l.A0i();
                            if (fromScrapOrHiddenOrCache5) {
                                abstractC01194l.A0O();
                            }
                        }
                        A0b(abstractC01194l);
                    }
                    abstractC01194l = null;
                } else {
                    z2 = true;
                }
            }
            if (abstractC01194l == null) {
                int A0D = this.A08.A00.A0D(i);
                if (A0D >= 0 && A0D < this.A08.A04.A0D()) {
                    int A03 = this.A08.A04.A03(A0D);
                    boolean fromScrapOrHiddenOrCache6 = this.A08.A04.A0B();
                    if (fromScrapOrHiddenOrCache6 && (abstractC01194l = A03(this.A08.A04.A04(A0D), A03, z)) != null) {
                        abstractC01194l.A03 = A0D;
                        z2 = true;
                    }
                    if (abstractC01194l == null && (abstractC01174j = this.A04) != null && (A00 = abstractC01174j.A00(this, i, A03)) != null) {
                        abstractC01194l = this.A08.A1H(A00);
                        if (abstractC01194l != null) {
                            boolean fromScrapOrHiddenOrCache7 = abstractC01194l.A0h();
                            if (fromScrapOrHiddenOrCache7) {
                                throw new IllegalArgumentException(A04(540, j.AppCompatTheme_windowActionModeOverlay, 76) + this.A08.A1I());
                            }
                        } else {
                            throw new IllegalArgumentException(A04(653, 74, 17) + this.A08.A1I());
                        }
                    }
                    if (abstractC01194l == null) {
                        C4a A0H = A0H();
                        String[] strArr = A0A;
                        if (strArr[5].charAt(0) != strArr[3].charAt(0)) {
                            A0A[4] = "3K2bfdY4Lns5cH4Uqi6qZhk44zURNmgZ";
                            abstractC01194l = A0H.A03(A03);
                            if (abstractC01194l != null) {
                                abstractC01194l.A0Q();
                                boolean fromScrapOrHiddenOrCache8 = C0339Dw.A1C;
                                if (fromScrapOrHiddenOrCache8) {
                                    A0A(abstractC01194l);
                                }
                            }
                        }
                        throw new RuntimeException();
                    }
                    if (abstractC01194l == null) {
                        long nanoTime = this.A08.getNanoTime();
                        if (j != Long.MAX_VALUE) {
                            boolean fromScrapOrHiddenOrCache9 = this.A01.A0B(A03, nanoTime, j);
                            if (!fromScrapOrHiddenOrCache9) {
                                return null;
                            }
                        }
                        C4H c4h = this.A08.A04;
                        C0339Dw c0339Dw = this.A08;
                        String[] strArr2 = A0A;
                        if (strArr2[5].charAt(0) == strArr2[3].charAt(0)) {
                            throw new RuntimeException();
                        }
                        String[] strArr3 = A0A;
                        strArr3[5] = "ofPrqBOY4KV1O5mmTOXtQojU6rRVoJMb";
                        strArr3[3] = "dfUBDtyf096LhSCdUEMmmzbvfUZbBbNe";
                        abstractC01194l = c4h.A05(c0339Dw, A03);
                        fromScrapOrHiddenOrCache = C0339Dw.A1E;
                        if (fromScrapOrHiddenOrCache && (A0I = C0339Dw.A0I(abstractC01194l.A0H)) != null) {
                            abstractC01194l.A09 = new WeakReference<>(A0I);
                        }
                        this.A01.A06(A03, this.A08.getNanoTime() - nanoTime);
                    }
                } else {
                    throw new IndexOutOfBoundsException(A04(165, 46, j.AppCompatTheme_windowMinWidthMajor) + i + A04(13, 8, 126) + A0D + A04(35, 8, j.AppCompatTheme_windowMinWidthMinor) + this.A08.A0s.A03() + this.A08.A1I());
                }
            }
            if (z2 && !this.A08.A0s.A07() && abstractC01194l.A0k(8192)) {
                abstractC01194l.A0U(0, 8192);
                if (this.A08.A0s.A0C) {
                    int changeFlags = C4P.A00(abstractC01194l);
                    C4O info = this.A08.A05.A09(this.A08.A0s, abstractC01194l, changeFlags | 4096, abstractC01194l.A0L());
                    this.A08.A1m(abstractC01194l, info);
                }
            }
            boolean z4 = false;
            if (this.A08.A0s.A07() && abstractC01194l.A0a()) {
                abstractC01194l.A04 = i;
            } else if (!abstractC01194l.A0a() || abstractC01194l.A0g() || abstractC01194l.A0b()) {
                z4 = A0D(abstractC01194l, this.A08.A00.A0D(i), i, j);
            }
            ViewGroup.LayoutParams layoutParams = abstractC01194l.A0H.getLayoutParams();
            if (layoutParams == null) {
                c4u = (C4U) this.A08.generateDefaultLayoutParams();
                abstractC01194l.A0H.setLayoutParams(c4u);
            } else if (!this.A08.checkLayoutParams(layoutParams)) {
                c4u = (C4U) this.A08.generateLayoutParams(layoutParams);
                abstractC01194l.A0H.setLayoutParams(c4u);
            } else {
                if (A0A[0].length() == 16) {
                    A0A[4] = "WeHbAL2DpvJL4iRMn0O7hIhaGbvumhB7";
                    c4u = (C4U) layoutParams;
                }
                throw new RuntimeException();
            }
            c4u.A00 = abstractC01194l;
            c4u.A02 = (z2 && z4) ? false : false;
            return abstractC01194l;
        }
        throw new IndexOutOfBoundsException(A04(271, 22, 0) + i + A04(12, 1, 99) + i + A04(21, 14, j.AppCompatTheme_textColorAlertDialogListItem) + this.A08.A0s.A03() + this.A08.A1I());
    }

    public final List<AbstractC01194l> A0J() {
        return this.A07;
    }

    public final void A0K() {
        int size = this.A06.size();
        for (int i = 0; i < size; i++) {
            this.A06.get(i).A0M();
        }
        int i2 = this.A05.size();
        for (int scrapCount = 0; scrapCount < i2; scrapCount++) {
            this.A05.get(scrapCount).A0M();
        }
        ArrayList<AbstractC01194l> arrayList = this.A02;
        String[] strArr = A0A;
        String str = strArr[2];
        String str2 = strArr[1];
        int scrapCount2 = str.charAt(0);
        int cachedCount = str2.charAt(0);
        if (scrapCount2 != cachedCount) {
            throw new RuntimeException();
        }
        String[] strArr2 = A0A;
        strArr2[7] = "w7WcMXH384MQxArKBWq9tfOfmOANhXYh";
        strArr2[6] = "ji6HgViVTGyvfONq8Vqt8Uaju4D1iJHU";
        if (arrayList != null) {
            int changedScrapCount = arrayList.size();
            for (int scrapCount3 = 0; scrapCount3 < changedScrapCount; scrapCount3++) {
                this.A02.get(scrapCount3).A0M();
            }
        }
    }

    public final void A0L() {
        this.A05.clear();
        ArrayList<AbstractC01194l> arrayList = this.A02;
        if (arrayList != null) {
            arrayList.clear();
        }
    }

    public final void A0M() {
        int size = this.A06.size();
        for (int i = 0; i < size; i++) {
            C4U c4u = (C4U) this.A06.get(i).A0H.getLayoutParams();
            if (c4u != null) {
                c4u.A01 = true;
            }
        }
    }

    public final void A0N() {
        if (this.A08.A04 != null && this.A08.A04.A0B()) {
            int size = this.A06.size();
            for (int i = 0; i < size; i++) {
                AbstractC01194l abstractC01194l = this.A06.get(i);
                int i2 = A0A[0].length();
                if (i2 != 16) {
                    throw new RuntimeException();
                }
                String[] strArr = A0A;
                strArr[2] = "kx9etu5Uswf3mlSSd54JM5SDJxoMGNTv";
                strArr[1] = "kxxNK4Rys8aPJuu822sP3fs8sDM7v1G0";
                if (abstractC01194l != null) {
                    abstractC01194l.A0T(6);
                    abstractC01194l.A0Y(null);
                }
            }
            return;
        }
        A06();
    }

    public final void A0O() {
        int i;
        if (this.A08.A06 != null) {
            C4T c4t = this.A08.A06;
            if (A0A[0].length() == 16) {
                String[] strArr = A0A;
                strArr[2] = "kSelswvDf1EbxUzrii1mBr6dHJR0d4zj";
                strArr[1] = "kcuGN1lunmBh6z5P1vsNJWvgiUTpOK0Q";
                i = c4t.A00;
            }
            throw new RuntimeException();
        }
        i = 0;
        int extraCache = this.A03;
        this.A00 = extraCache + i;
        int extraCache2 = this.A06.size();
        for (int i2 = extraCache2 - 1; i2 >= 0; i2--) {
            int size = this.A06.size();
            String[] strArr2 = A0A;
            String str = strArr2[2];
            String str2 = strArr2[1];
            int i3 = str.charAt(0);
            int extraCache3 = str2.charAt(0);
            if (i3 != extraCache3) {
                throw new RuntimeException();
            }
            String[] strArr3 = A0A;
            strArr3[2] = "kpxxdOz3cEfo3MLV8RPQuR2Jasv2n6jF";
            strArr3[1] = "kgO1H2GjmHeLX2ZusVi9gFRUJKE1zGI0";
            int extraCache4 = this.A00;
            if (size > extraCache4) {
                A07(i2);
            } else {
                return;
            }
        }
    }

    public final void A0P() {
        this.A05.clear();
        A06();
    }

    public final void A0Q(int i) {
        this.A03 = i;
        A0O();
    }

    public final void A0R(int i, int i2) {
        int size = this.A06.size();
        for (int i3 = 0; i3 < size; i3++) {
            AbstractC01194l abstractC01194l = this.A06.get(i3);
            if (abstractC01194l != null) {
                int cachedCount = abstractC01194l.A03;
                if (cachedCount >= i) {
                    abstractC01194l.A0W(i2, true);
                }
            }
        }
    }

    public final void A0S(int i, int i2) {
        int i3;
        int i4;
        int i5;
        if (i < i2) {
            i3 = i;
            i4 = i2;
            i5 = -1;
        } else {
            i3 = i2;
            i4 = i;
            i5 = 1;
        }
        int size = this.A06.size();
        for (int i6 = 0; i6 < size; i6++) {
            AbstractC01194l abstractC01194l = this.A06.get(i6);
            if (abstractC01194l != null) {
                int start = abstractC01194l.A03;
                if (start >= i3) {
                    int start2 = abstractC01194l.A03;
                    if (start2 > i4) {
                        continue;
                    } else {
                        int i7 = abstractC01194l.A03;
                        String[] strArr = A0A;
                        String str = strArr[5];
                        String str2 = strArr[3];
                        int end = str.charAt(0);
                        int start3 = str2.charAt(0);
                        if (end == start3) {
                            throw new RuntimeException();
                        }
                        String[] strArr2 = A0A;
                        strArr2[2] = "kvvW4F2OCwdEIl1qwIuxYVFpmp0ugJY5";
                        strArr2[1] = "kzcCp2wTfEGQm2KGuN32b5oIYABnQWPG";
                        if (i7 == i) {
                            int start4 = i2 - i;
                            abstractC01194l.A0W(start4, false);
                        } else {
                            abstractC01194l.A0W(i5, false);
                        }
                    }
                } else {
                    continue;
                }
            }
        }
    }

    public final void A0T(int i, int i2) {
        int positionEnd;
        int i3 = i + i2;
        for (int i4 = this.A06.size() - 1; i4 >= 0; i4--) {
            AbstractC01194l abstractC01194l = this.A06.get(i4);
            if (abstractC01194l != null && (positionEnd = abstractC01194l.A03) >= i && positionEnd < i3) {
                abstractC01194l.A0T(2);
                A07(i4);
            }
        }
    }

    public final void A0U(int i, int i2, boolean z) {
        int i3 = i + i2;
        int removedEnd = this.A06.size();
        for (int i4 = removedEnd - 1; i4 >= 0; i4--) {
            AbstractC01194l abstractC01194l = this.A06.get(i4);
            if (abstractC01194l != null) {
                int removedEnd2 = abstractC01194l.A03;
                if (removedEnd2 >= i3) {
                    int removedEnd3 = -i2;
                    abstractC01194l.A0W(removedEnd3, z);
                } else {
                    int removedEnd4 = abstractC01194l.A03;
                    if (removedEnd4 >= i) {
                        abstractC01194l.A0T(8);
                        A07(i4);
                    }
                }
            }
        }
    }

    public final void A0V(View view) {
        AbstractC01194l A0G = C0339Dw.A0G(view);
        A0G.A0F = null;
        A0G.A0G = false;
        A0G.A0O();
        A0b(A0G);
    }

    public final void A0W(View view) {
        AbstractC01194l A0G = C0339Dw.A0G(view);
        if (A0G.A0k(12) || !A0G.A0f() || this.A08.A20(A0G)) {
            boolean A0b = A0G.A0b();
            if (A0A[0].length() != 16) {
                throw new RuntimeException();
            }
            String[] strArr = A0A;
            strArr[5] = "cscHAR4ImnAFzAxZJ9yqjMNa91RcN8Vb";
            strArr[3] = "pspTzLDNU823NSI2ymIgIumCpfqVQlal";
            if (!A0b || A0G.A0c() || this.A08.A04.A0B()) {
                A0G.A0X(this, false);
                this.A05.add(A0G);
                return;
            }
            throw new IllegalArgumentException(A04(43, 122, 32) + this.A08.A1I());
        }
        if (this.A02 == null) {
            this.A02 = new ArrayList<>();
        }
        A0G.A0X(this, true);
        this.A02.add(A0G);
    }

    public final void A0X(View view) {
        AbstractC01194l A0G = C0339Dw.A0G(view);
        if (A0G.A0e()) {
            this.A08.removeDetachedView(view, false);
        }
        if (A0G.A0d()) {
            A0G.A0S();
        } else if (A0G.A0i()) {
            A0G.A0O();
        }
        A0b(A0G);
    }

    public final void A0Y(C4H c4h, C4H c4h2, boolean z) {
        A0P();
        A0H().A08(c4h, c4h2, z);
    }

    public final void A0Z(C4a c4a) {
        C4a c4a2 = this.A01;
        if (c4a2 != null) {
            c4a2.A04();
        }
        this.A01 = c4a;
        if (c4a != null) {
            this.A01.A07(this.A08.getAdapter());
        }
    }

    public final void A0a(AbstractC01174j abstractC01174j) {
        this.A04 = abstractC01174j;
    }

    /* JADX WARN: Code restructure failed: missing block: B:28:0x009f, code lost:
        if (r0 != false) goto L33;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x00bd, code lost:
        if (r5 > 0) goto L37;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x00bf, code lost:
        r0 = r10.A0k(526);
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x00c5, code lost:
        if (r0 != false) goto L57;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x00c7, code lost:
        r2 = r9.A06.size();
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x00cf, code lost:
        if (r2 < r9.A00) goto L43;
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x00d1, code lost:
        if (r2 <= 0) goto L43;
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x00d3, code lost:
        A07(0);
        r2 = r2 - 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x00d8, code lost:
        r0 = com.facebook.ads.redexgen.X.C0339Dw.A1E;
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x00dc, code lost:
        if (r0 == false) goto L56;
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x00de, code lost:
        if (r2 <= 0) goto L56;
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x00e0, code lost:
        r0 = r9.A08.A02.A05(r10.A03);
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x00ea, code lost:
        if (r0 != false) goto L56;
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x00ec, code lost:
        r2 = r2 - 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x00ee, code lost:
        if (r2 < 0) goto L55;
     */
    /* JADX WARN: Code restructure failed: missing block: B:46:0x00f0, code lost:
        r1 = r9.A06.get(r2).A03;
        r0 = r9.A08.A02.A05(r1);
     */
    /* JADX WARN: Code restructure failed: missing block: B:47:0x0102, code lost:
        if (r0 != false) goto L52;
     */
    /* JADX WARN: Code restructure failed: missing block: B:48:0x0104, code lost:
        r2 = r2 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:49:0x0106, code lost:
        r9.A06.add(r2, r10);
        r7 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:50:0x010c, code lost:
        if (r7 != false) goto L24;
     */
    /* JADX WARN: Code restructure failed: missing block: B:51:0x010e, code lost:
        A0d(r10, true);
        r6 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:58:0x0123, code lost:
        r2 = r2 - 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:60:0x012d, code lost:
        if (r5 > 0) goto L37;
     */
    /* JADX WARN: Removed duplicated region for block: B:27:0x009b  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x00b6  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x0126  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void A0b(com.facebook.ads.redexgen.X.AbstractC01194l r10) {
        /*
            Method dump skipped, instructions count: 384
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.ads.redexgen.X.C01094b.A0b(com.facebook.ads.redexgen.X.4l):void");
    }

    public final void A0c(AbstractC01194l abstractC01194l) {
        boolean z;
        z = abstractC01194l.A0G;
        if (z) {
            this.A02.remove(abstractC01194l);
        } else {
            this.A05.remove(abstractC01194l);
        }
        abstractC01194l.A0F = null;
        abstractC01194l.A0G = false;
        abstractC01194l.A0O();
    }

    public final void A0d(AbstractC01194l abstractC01194l, boolean z) {
        C0339Dw.A0t(abstractC01194l);
        if (abstractC01194l.A0k(16384)) {
            abstractC01194l.A0U(0, 16384);
            AnonymousClass38.A0B(abstractC01194l.A0H, null);
        }
        if (z) {
            A0B(abstractC01194l);
        }
        abstractC01194l.A08 = null;
        A0H().A09(abstractC01194l);
    }
}
