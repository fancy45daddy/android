package com.facebook.ads.redexgen.X;

import android.annotation.SuppressLint;
import android.text.TextUtils;
import androidx.annotation.Nullable;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
/* renamed from: com.facebook.ads.redexgen.X.5s  reason: invalid class name and case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public final class C01525s {
    public static byte[] A00;
    public static String[] A01 = {"zJ7sRo3sU3MwvYkxVq5sKXU", "uwqdBBQkb", "sk1pAaPClwmr1DZFuM4XEVJDjMgj4luU", "2DEAuAVf", "LM1sVeBw6DNfIdZzIYsj5hqYQDPEhJFy", "hYSBjzGCwuKpFZFqojmwIwdxMJLMCyYz", "BWOi5Qn34m6VEGTMmYfzcDYeX0GTjOOy", "rscTiGR64sMWr7IEiXLU0M2EjoTwZlLg"};
    public static final AtomicReference<C01505q> A02;
    public static final AtomicReference<String> A03;

    public static String A04(int i, int i2, int i3) {
        byte[] copyOfRange = Arrays.copyOfRange(A00, i, i + i2);
        for (int i4 = 0; i4 < copyOfRange.length; i4++) {
            copyOfRange[i4] = (byte) ((copyOfRange[i4] - i3) - 52);
        }
        return new String(copyOfRange);
    }

    public static void A05() {
        A00 = new byte[]{-98, -90, -95, -100, -84, -77, -94, -81, -81, -90, -95, -94, -95, -97, -88, -97, -84, -93, -99, -20, -25, -23, -28, -30, -14, -7, -24, -11, -11, -20, -25, -24};
    }

    static {
        A05();
        A02 = new AtomicReference<>();
        A03 = new AtomicReference<>(A04(0, 0, 68));
    }

    public static C01505q A00() {
        C01505q c01505q = A02.get();
        if (A01[6].charAt(15) == 'M') {
            String[] strArr = A01;
            strArr[3] = "GQnQs3ZS";
            strArr[1] = "yTwJu7KeR";
            C01505q c01505q2 = c01505q;
            if (c01505q2 == null) {
                C01505q A002 = C01505q.A00();
                String[] strArr2 = A01;
                if (strArr2[3].length() != strArr2[1].length()) {
                    A01[0] = "yvynwBtI7EoQ7kGRkYf58OE";
                    return A002;
                }
            } else {
                return c01505q2;
            }
        }
        throw new RuntimeException();
    }

    /* JADX WARN: Code restructure failed: missing block: B:4:0x000a, code lost:
        if (android.text.TextUtils.isEmpty(r6.A03()) != false) goto L2;
     */
    @androidx.annotation.Nullable
    @android.annotation.SuppressLint({"CatchGeneralException"})
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static com.facebook.ads.redexgen.X.C01505q A01(com.facebook.ads.redexgen.X.C7G r5, com.facebook.ads.redexgen.X.C01505q r6) {
        /*
            if (r6 == 0) goto Lc
            java.lang.String r0 = r6.A03()     // Catch: java.lang.Throwable -> L11
            boolean r0 = android.text.TextUtils.isEmpty(r0)     // Catch: java.lang.Throwable -> L11
            if (r0 == 0) goto L28
        Lc:
            com.facebook.ads.redexgen.X.5q r0 = com.facebook.ads.redexgen.X.C01575y.A00(r5)     // Catch: java.lang.Throwable -> L11
            return r0
        L11:
            r0 = move-exception
            com.facebook.ads.redexgen.X.7k r5 = r5.A06()
            int r4 = com.facebook.ads.redexgen.X.C01877l.A1Q
            com.facebook.ads.redexgen.X.7m r3 = new com.facebook.ads.redexgen.X.7m
            r3.<init>(r0)
            r2 = 12
            r1 = 7
            r0 = 6
            java.lang.String r0 = A04(r2, r1, r0)
            r5.A8u(r0, r4, r3)
        L28:
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.ads.redexgen.X.C01525s.A01(com.facebook.ads.redexgen.X.7G, com.facebook.ads.redexgen.X.5q):com.facebook.ads.redexgen.X.5q");
    }

    @Nullable
    @SuppressLint({"CatchGeneralException"})
    public static C01505q A02(C7G c7g, C01505q c01505q, C01515r c01515r) {
        C01535t c01535t = null;
        try {
            if (IC.A06(c7g) && (c01505q == null || TextUtils.isEmpty(c01505q.A03()))) {
                c01535t = C01545u.A00(c7g.getContentResolver());
            }
        } catch (Throwable th) {
            c7g.A06().A8u(A04(12, 7, 6), C01877l.A1S, new C01887m(th));
        }
        if (c01535t != null && c01535t.A01 != null) {
            A03.set(c01535t.A01);
            c01515r.A05(c01535t.A01);
        }
        if (c01505q == null && c01535t != null && !TextUtils.isEmpty(c01535t.A00)) {
            return new C01505q(c01535t.A00, c01535t.A02, EnumC01495p.A05);
        }
        return c01505q;
    }

    public static String A03() {
        String attributionId = A03.get();
        if (attributionId == null) {
            return A04(0, 0, 68);
        }
        return attributionId;
    }

    public static void A06(C01515r c01515r) {
        A02.set(c01515r.A02());
        A03.set(c01515r.A03());
    }

    @SuppressLint({"CatchGeneralException"})
    public static void A07(C7G c7g) {
        long j;
        C01505q advertisingIdInfo;
        try {
            C01515r c01515r = new C01515r(c7g);
            A06(c01515r);
            if (A08()) {
                return;
            }
            C01505q advertisingIdInfo2 = A02.get();
            if (advertisingIdInfo2 != null && !TextUtils.isEmpty(advertisingIdInfo2.A03())) {
                j = advertisingIdInfo2.A01();
            } else {
                j = -1;
            }
            if (j > 0 && System.currentTimeMillis() - j < IC.A00(c7g)) {
                return;
            }
            if (IC.A07(c7g)) {
                advertisingIdInfo = A01(c7g, A02(c7g, null, c01515r));
            } else {
                advertisingIdInfo = A02(c7g, A01(c7g, null), c01515r);
            }
            if (advertisingIdInfo != null && !TextUtils.isEmpty(advertisingIdInfo.A03())) {
                A02.set(advertisingIdInfo);
                c01515r.A04(advertisingIdInfo);
            }
        } catch (Throwable t) {
            c7g.A06().A8u(A04(12, 7, 6), C01877l.A1R, new C01887m(t));
        }
    }

    public static boolean A08() {
        boolean z = false;
        boolean updated = KO.A04();
        if (updated) {
            if (A01[0].length() != 23) {
                throw new RuntimeException();
            }
            String[] strArr = A01;
            strArr[3] = "OqjdKmMb";
            strArr[1] = "Sbvi0a9C0";
            String A04 = A04(0, 12, 9);
            boolean updated2 = KO.A05(A04);
            if (updated2) {
                A03.set(KO.A01(A04));
                z = true;
            }
        }
        boolean A042 = KO.A04();
        String[] strArr2 = A01;
        if (strArr2[5].charAt(29) != strArr2[4].charAt(29)) {
            A01[6] = "1QSggKSi3jrfAw1MbHCsavUz8mNGSj1M";
            if (!A042) {
                return z;
            }
        } else {
            A01[6] = "SqTb5lTJEle7YRZML8ItyxwGEN07wws1";
            if (!A042) {
                return z;
            }
        }
        String A043 = A04(19, 13, 79);
        boolean updated3 = KO.A05(A043);
        if (updated3) {
            String A012 = KO.A01(A043);
            AtomicReference<C01505q> atomicReference = A02;
            if (A012 == null) {
                A012 = A04(0, 0, 68);
            }
            atomicReference.set(new C01505q(A012, false, EnumC01495p.A04));
            return true;
        }
        return z;
    }
}
