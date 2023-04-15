package com.facebook.ads.redexgen.X;

import android.text.SpannableStringBuilder;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
/* loaded from: assets/audience_network.dex */
public final class U1 implements FK {
    public static byte[] A04;
    public final int A00;
    public final List<U2> A01;
    public final long[] A02;
    public final long[] A03;

    static {
        A01();
    }

    public static String A00(int i, int i2, int i3) {
        byte[] copyOfRange = Arrays.copyOfRange(A04, i, i + i2);
        for (int i4 = 0; i4 < copyOfRange.length; i4++) {
            copyOfRange[i4] = (byte) ((copyOfRange[i4] - i3) - 125);
        }
        return new String(copyOfRange);
    }

    public static void A01() {
        A04 = new byte[]{5};
    }

    /* JADX WARN: Incorrect condition in loop: B:4:0x0016 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public U1(java.util.List<com.facebook.ads.redexgen.X.U2> r8) {
        /*
            r7 = this;
            r7.<init>()
            r7.A01 = r8
            int r0 = r8.size()
            r7.A00 = r0
            int r0 = r7.A00
            int r0 = r0 * 2
            long[] r0 = new long[r0]
            r7.A02 = r0
            r6 = 0
        L14:
            int r0 = r7.A00
            if (r6 >= r0) goto L31
            java.lang.Object r5 = r8.get(r6)
            com.facebook.ads.redexgen.X.U2 r5 = (com.facebook.ads.redexgen.X.U2) r5
            int r4 = r6 * 2
            long[] r2 = r7.A02
            long r0 = r5.A01
            r2[r4] = r0
            long[] r3 = r7.A02
            int r2 = r4 + 1
            long r0 = r5.A00
            r3[r2] = r0
            int r6 = r6 + 1
            goto L14
        L31:
            long[] r1 = r7.A02
            int r0 = r1.length
            long[] r0 = java.util.Arrays.copyOf(r1, r0)
            r7.A03 = r0
            long[] r0 = r7.A03
            java.util.Arrays.sort(r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.ads.redexgen.X.U1.<init>(java.util.List):void");
    }

    @Override // com.facebook.ads.redexgen.X.FK
    public final List<FJ> A69(long j) {
        ArrayList arrayList = null;
        U2 u2 = null;
        SpannableStringBuilder normalCueTextBuilder = null;
        for (int i = 0; i < this.A00; i++) {
            long[] jArr = this.A02;
            if (jArr[i * 2] <= j && j < jArr[(i * 2) + 1]) {
                if (arrayList == null) {
                    arrayList = new ArrayList();
                }
                U2 u22 = this.A01.get(i);
                if (u22.A00()) {
                    if (u2 == null) {
                        u2 = u22;
                    } else {
                        String A00 = A00(0, 1, 126);
                        if (normalCueTextBuilder == null) {
                            normalCueTextBuilder = new SpannableStringBuilder();
                            normalCueTextBuilder.append(u2.A0C).append((CharSequence) A00).append(u22.A0C);
                        } else {
                            normalCueTextBuilder.append((CharSequence) A00).append(u22.A0C);
                        }
                    }
                } else {
                    arrayList.add(u22);
                }
            }
        }
        if (normalCueTextBuilder != null) {
            arrayList.add(new U2(normalCueTextBuilder));
        } else if (u2 != null) {
            arrayList.add(u2);
        }
        if (arrayList != null) {
            return arrayList;
        }
        return Collections.emptyList();
    }

    @Override // com.facebook.ads.redexgen.X.FK
    public final long A6Z(int i) {
        boolean z = true;
        H6.A03(i >= 0);
        if (i >= this.A03.length) {
            z = false;
        }
        H6.A03(z);
        return this.A03[i];
    }

    @Override // com.facebook.ads.redexgen.X.FK
    public final int A6a() {
        return this.A03.length;
    }

    @Override // com.facebook.ads.redexgen.X.FK
    public final int A6y(long j) {
        int A0A = C0430Hl.A0A(this.A03, j, false, false);
        int index = this.A03.length;
        if (A0A < index) {
            return A0A;
        }
        return -1;
    }
}
