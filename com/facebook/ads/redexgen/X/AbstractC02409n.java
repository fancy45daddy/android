package com.facebook.ads.redexgen.X;

import android.util.Pair;
/* renamed from: com.facebook.ads.redexgen.X.9n  reason: invalid class name and case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public abstract class AbstractC02409n {
    public static String[] A00 = {"jU13W9NSebta1ZmimveRwiImSwvynw8G", "bR9yhpeYgYLfxjGn405sIF1CLUaNKRNv", "y6GS60dgSiOKDJGhj3wt9T6pcdF3KRzS", "kAdv6lw0fV2hZ8Ef8nLl5eDcrpXJ", "gDoO0sRHxUPo6SrSL989dqr7yWBZykVP", "xoqdGlgoaRmw7wZuwViSR5WxyeJjGGpo", "tn8QhSSQsmhaZqBgPW05rXLjjsf9pF2E", "LT5aPkpwV7"};
    public static final AbstractC02409n A01 = new C0796Vz();

    public abstract int A00();

    public abstract int A01();

    public abstract int A04(Object obj);

    public abstract C02389l A0A(int i, C02389l c02389l, boolean z);

    public abstract C02399m A0D(int i, C02399m c02399m, boolean z, long j);

    public int A02(int i, int i2, boolean z) {
        if (i2 == 0) {
            if (i == A06(z)) {
                return -1;
            }
            return i + 1;
        } else if (i2 != 1) {
            if (i2 == 2) {
                if (i == A06(z)) {
                    return A05(z);
                }
                return i + 1;
            }
            throw new IllegalStateException();
        } else {
            return i;
        }
    }

    public final int A03(int i, C02389l c02389l, C02399m c02399m, int i2, boolean z) {
        int i3 = A09(i, c02389l).A00;
        int windowIndex = A0B(i3, c02399m).A01;
        if (windowIndex == i) {
            int nextWindowIndex = A02(i3, i2, z);
            if (nextWindowIndex == -1) {
                return -1;
            }
            int windowIndex2 = A0B(nextWindowIndex, c02399m).A00;
            return windowIndex2;
        }
        int windowIndex3 = i + 1;
        return windowIndex3;
    }

    public int A05(boolean z) {
        return A0E() ? -1 : 0;
    }

    public int A06(boolean z) {
        if (A0E()) {
            return -1;
        }
        return A01() - 1;
    }

    public final Pair<Integer, Long> A07(C02399m c02399m, C02389l c02389l, int i, long j) {
        return A08(c02399m, c02389l, i, j, 0L);
    }

    public final Pair<Integer, Long> A08(C02399m c02399m, C02389l c02389l, int i, long j, long j2) {
        H6.A00(i, 0, A01());
        A0D(i, c02399m, false, j2);
        if (j == -9223372036854775807L) {
            j = c02399m.A01();
            if (j == -9223372036854775807L) {
                return null;
            }
        }
        int i2 = c02399m.A00;
        long A03 = c02399m.A03() + j;
        long A07 = A09(i2, c02389l).A07();
        while (A07 != -9223372036854775807L) {
            int i3 = (A03 > A07 ? 1 : (A03 == A07 ? 0 : -1));
            if (A00[7].length() == 24) {
                throw new RuntimeException();
            }
            A00[7] = "t4u2YUU8OEdoMFYJ2jQWzxX4wha";
            if (i3 < 0 || i2 >= c02399m.A01) {
                break;
            }
            A03 -= A07;
            i2++;
            A07 = A09(i2, c02389l).A07();
        }
        return Pair.create(Integer.valueOf(i2), Long.valueOf(A03));
    }

    public final C02389l A09(int i, C02389l c02389l) {
        return A0A(i, c02389l, false);
    }

    public final C02399m A0B(int i, C02399m c02399m) {
        return A0C(i, c02399m, false);
    }

    public final C02399m A0C(int i, C02399m c02399m, boolean z) {
        return A0D(i, c02399m, z, 0L);
    }

    public final boolean A0E() {
        return A01() == 0;
    }

    public final boolean A0F(int i, C02389l c02389l, C02399m c02399m, int i2, boolean z) {
        return A03(i, c02389l, c02399m, i2, z) == -1;
    }
}
