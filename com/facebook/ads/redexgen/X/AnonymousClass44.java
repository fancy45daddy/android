package com.facebook.ads.redexgen.X;

import androidx.annotation.Nullable;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.concurrent.TimeUnit;
/* renamed from: com.facebook.ads.redexgen.X.44  reason: invalid class name */
/* loaded from: assets/audience_network.dex */
public final class AnonymousClass44 implements Runnable {
    public static Comparator<AnonymousClass43> A04;
    public static byte[] A05;
    public static String[] A06 = {"C", "g", "thIgEQWd9nx", "UJ", "nKFIv9xSQBz", "WKzZJ6F0j2u08DpGCnjDR9E", "2Nt4JwZoKXCf4OpJNcF1oxTto7W5gJbD", "RW"};
    public static final ThreadLocal<AnonymousClass44> A07;
    public long A00;
    public long A01;
    public ArrayList<C0339Dw> A02 = new ArrayList<>();
    public ArrayList<AnonymousClass43> A03 = new ArrayList<>();

    public static String A01(int i, int i2, int i3) {
        byte[] copyOfRange = Arrays.copyOfRange(A05, i, i + i2);
        for (int i4 = 0; i4 < copyOfRange.length; i4++) {
            copyOfRange[i4] = (byte) ((copyOfRange[i4] - i3) - 8);
        }
        return new String(copyOfRange);
    }

    public static void A03() {
        A05 = new byte[]{97, 101, 47, 93, 116, -126, -125, 116, 115, 47, 95, -127, 116, 117, 116, -125, 114, 119, 92, 96, 42, 90, 124, 111, 112, 111, 126, 109, 114};
    }

    static {
        A03();
        A07 = new ThreadLocal<>();
        A04 = new Comparator<AnonymousClass43>() { // from class: com.facebook.ads.redexgen.X.42
            /* JADX INFO: Access modifiers changed from: private */
            @Override // java.util.Comparator
            /* renamed from: A00 */
            public final int compare(AnonymousClass43 anonymousClass43, AnonymousClass43 anonymousClass432) {
                if ((anonymousClass43.A03 == null) != (anonymousClass432.A03 == null)) {
                    return anonymousClass43.A03 == null ? 1 : -1;
                } else if (anonymousClass43.A04 != anonymousClass432.A04) {
                    return anonymousClass43.A04 ? -1 : 1;
                } else {
                    int i = anonymousClass432.A02 - anonymousClass43.A02;
                    if (i != 0) {
                        return i;
                    }
                    int i2 = anonymousClass43.A00;
                    int deltaViewVelocity = anonymousClass432.A00;
                    int i3 = i2 - deltaViewVelocity;
                    if (i3 != 0) {
                        return i3;
                    }
                    return 0;
                }
            }
        };
    }

    private AbstractC01194l A00(C0339Dw c0339Dw, int i, long j) {
        if (A08(c0339Dw, i)) {
            return null;
        }
        C01094b c01094b = c0339Dw.A0r;
        try {
            c0339Dw.A1L();
            AbstractC01194l A0I = c01094b.A0I(i, false, j);
            if (A0I != null) {
                if (A0I.A0a() && !A0I.A0b()) {
                    c01094b.A0X(A0I.A0H);
                } else {
                    c01094b.A0d(A0I, false);
                }
            }
            return A0I;
        } finally {
            c0339Dw.A1q(false);
        }
    }

    /* JADX WARN: Incorrect condition in loop: B:20:0x0078 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private void A02() {
        /*
            r10 = this;
            java.util.ArrayList<com.facebook.ads.redexgen.X.Dw> r0 = r10.A02
            int r9 = r0.size()
            r4 = 0
            r3 = 0
        L8:
            r2 = 0
            if (r3 >= r9) goto L26
            java.util.ArrayList<com.facebook.ads.redexgen.X.Dw> r0 = r10.A02
            java.lang.Object r1 = r0.get(r3)
            com.facebook.ads.redexgen.X.Dw r1 = (com.facebook.ads.redexgen.X.C0339Dw) r1
            int r0 = r1.getWindowVisibility()
            if (r0 != 0) goto L23
            com.facebook.ads.redexgen.X.Xl r0 = r1.A02
            r0.A04(r1, r2)
            com.facebook.ads.redexgen.X.Xl r0 = r1.A02
            int r0 = r0.A00
            int r4 = r4 + r0
        L23:
            int r3 = r3 + 1
            goto L8
        L26:
            java.util.ArrayList<com.facebook.ads.redexgen.X.43> r0 = r10.A03
            r0.ensureCapacity(r4)
            r8 = 0
            java.lang.String[] r2 = com.facebook.ads.redexgen.X.AnonymousClass44.A06
            r0 = 3
            r1 = r2[r0]
            r0 = 7
            r0 = r2[r0]
            int r1 = r1.length()
            int r0 = r0.length()
            if (r1 == r0) goto L44
            java.lang.RuntimeException r0 = new java.lang.RuntimeException
            r0.<init>()
            throw r0
        L44:
            java.lang.String[] r2 = com.facebook.ads.redexgen.X.AnonymousClass44.A06
            java.lang.String r1 = "OH"
            r0 = 3
            r2[r0] = r1
            java.lang.String r1 = "7S"
            r0 = 7
            r2[r0] = r1
            r7 = 0
        L51:
            if (r7 >= r9) goto Lb3
            java.util.ArrayList<com.facebook.ads.redexgen.X.Dw> r0 = r10.A02
            java.lang.Object r6 = r0.get(r7)
            com.facebook.ads.redexgen.X.Dw r6 = (com.facebook.ads.redexgen.X.C0339Dw) r6
            int r0 = r6.getWindowVisibility()
            if (r0 == 0) goto L64
        L61:
            int r7 = r7 + 1
            goto L51
        L64:
            com.facebook.ads.redexgen.X.Xl r5 = r6.A02
            int r0 = r5.A01
            int r4 = java.lang.Math.abs(r0)
            int r0 = r5.A02
            int r0 = java.lang.Math.abs(r0)
            int r4 = r4 + r0
            r3 = 0
        L74:
            int r0 = r5.A00
            int r0 = r0 * 2
            if (r3 >= r0) goto L61
            java.util.ArrayList<com.facebook.ads.redexgen.X.43> r0 = r10.A03
            int r0 = r0.size()
            if (r8 < r0) goto Laa
            com.facebook.ads.redexgen.X.43 r0 = new com.facebook.ads.redexgen.X.43
            r0.<init>()
            java.util.ArrayList<com.facebook.ads.redexgen.X.43> r1 = r10.A03
            r1.add(r0)
        L8c:
            int[] r2 = r5.A03
            int r1 = r3 + 1
            r2 = r2[r1]
            if (r2 > r4) goto La8
            r1 = 1
        L95:
            r0.A04 = r1
            r0.A02 = r4
            r0.A00 = r2
            r0.A03 = r6
            int[] r1 = r5.A03
            r1 = r1[r3]
            r0.A01 = r1
            int r8 = r8 + 1
            int r3 = r3 + 2
            goto L74
        La8:
            r1 = 0
            goto L95
        Laa:
            java.util.ArrayList<com.facebook.ads.redexgen.X.43> r0 = r10.A03
            java.lang.Object r0 = r0.get(r8)
            com.facebook.ads.redexgen.X.43 r0 = (com.facebook.ads.redexgen.X.AnonymousClass43) r0
            goto L8c
        Lb3:
            java.util.ArrayList<com.facebook.ads.redexgen.X.43> r1 = r10.A03
            java.util.Comparator<com.facebook.ads.redexgen.X.43> r0 = com.facebook.ads.redexgen.X.AnonymousClass44.A04
            java.util.Collections.sort(r1, r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.ads.redexgen.X.AnonymousClass44.A02():void");
    }

    /* JADX WARN: Incorrect condition in loop: B:4:0x0007 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private void A04(long r4) {
        /*
            r3 = this;
            r2 = 0
        L1:
            java.util.ArrayList<com.facebook.ads.redexgen.X.43> r0 = r3.A03
            int r0 = r0.size()
            if (r2 >= r0) goto L15
            java.util.ArrayList<com.facebook.ads.redexgen.X.43> r0 = r3.A03
            java.lang.Object r1 = r0.get(r2)
            com.facebook.ads.redexgen.X.43 r1 = (com.facebook.ads.redexgen.X.AnonymousClass43) r1
            com.facebook.ads.redexgen.X.Dw r0 = r1.A03
            if (r0 != 0) goto L16
        L15:
            return
        L16:
            r3.A06(r1, r4)
            r1.A00()
            int r2 = r2 + 1
            goto L1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.ads.redexgen.X.AnonymousClass44.A04(long):void");
    }

    private final void A05(long j) {
        A02();
        A04(j);
    }

    private void A06(AnonymousClass43 anonymousClass43, long j) {
        AbstractC01194l A00 = A00(anonymousClass43.A03, anonymousClass43.A01, anonymousClass43.A04 ? Long.MAX_VALUE : j);
        if (A00 != null && A00.A09 != null && A00.A0a() && !A00.A0b()) {
            A07(A00.A09.get(), j);
        }
    }

    private void A07(@Nullable C0339Dw c0339Dw, long j) {
        if (c0339Dw == null) {
            return;
        }
        if (c0339Dw.A0C) {
            C01003r c01003r = c0339Dw.A01;
            if (A06[5].length() != 17) {
                A06[6] = "t2x0aSlbBonOFe0N5m1ttILNz4IaYpUW";
                if (c01003r.A06() != 0) {
                    c0339Dw.A1O();
                }
            }
            throw new RuntimeException();
        }
        C0834Xl c0834Xl = c0339Dw.A02;
        c0834Xl.A04(c0339Dw, true);
        if (c0834Xl.A00 != 0) {
            try {
                C2V.A01(A01(0, 18, 7));
                c0339Dw.A0s.A05(c0339Dw.A04);
                int i = 0;
                while (true) {
                    int i2 = c0834Xl.A00 * 2;
                    int i3 = A06[6].charAt(8);
                    if (i3 == 73) {
                        break;
                    }
                    String[] strArr = A06;
                    strArr[3] = "nG";
                    strArr[7] = "TD";
                    if (i < i2) {
                        A00(c0339Dw, c0834Xl.A03[i], j);
                        i += 2;
                    } else {
                        return;
                    }
                }
                throw new RuntimeException();
            } finally {
                C2V.A00();
            }
        }
    }

    public static boolean A08(C0339Dw c0339Dw, int i) {
        int A062 = c0339Dw.A01.A06();
        for (int i2 = 0; i2 < A062; i2++) {
            AbstractC01194l A0G = C0339Dw.A0G(c0339Dw.A01.A0A(i2));
            int childCount = A0G.A03;
            if (childCount == i && !A0G.A0b()) {
                return true;
            }
        }
        return false;
    }

    public final void A09(C0339Dw c0339Dw) {
        this.A02.add(c0339Dw);
    }

    public final void A0A(C0339Dw c0339Dw) {
        this.A02.remove(c0339Dw);
    }

    public final void A0B(C0339Dw c0339Dw, int i, int i2) {
        if (c0339Dw.isAttachedToWindow() && this.A01 == 0) {
            this.A01 = c0339Dw.getNanoTime();
            c0339Dw.post(this);
        }
        c0339Dw.A02.A03(i, i2);
    }

    @Override // java.lang.Runnable
    public final void run() {
        try {
            C2V.A01(A01(18, 11, 2));
            if (this.A02.isEmpty()) {
                return;
            }
            int size = this.A02.size();
            long j = 0;
            for (int i = 0; i < size; i++) {
                C0339Dw c0339Dw = this.A02.get(i);
                if (c0339Dw.getWindowVisibility() == 0) {
                    j = Math.max(c0339Dw.getDrawingTime(), j);
                }
            }
            if (j == 0) {
                this.A01 = 0L;
                if (A06[5].length() == 17) {
                    throw new RuntimeException();
                }
                A06[5] = "H4nD1dOrFb1";
                C2V.A00();
                return;
            }
            A05(TimeUnit.MILLISECONDS.toNanos(j) + this.A00);
        } finally {
            this.A01 = 0L;
            C2V.A00();
        }
    }
}
