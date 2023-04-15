package com.facebook.ads.redexgen.X;

import androidx.annotation.Nullable;
import java.util.ArrayList;
/* renamed from: com.facebook.ads.redexgen.X.9p  reason: invalid class name and case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public final class C02429p {
    public static String[] A06 = {"KiEP2P9b6TLdkEYwaN5ndNVtk9NQ5Y9p", "yrQkoPMIPCp0FUw5bDslSTdDJuyK", "OV0qCkDU4pR0s48LAW0LoXOWDo4ZunO9", "CNzCLbPvty9jTQMUswZxpqZWQtb7JEv9", "Vf", "ol3MR5ayifXszMqJK7WjfrE4Lr8bJhi8", "Hh8EscwfVF04VFT3j4sJSJqD2SmetI3K", "DN3PdRai96zSFxDytd4qNigxYecPuw8S"};
    public C02439q A01;
    public C02439q A02;
    public boolean A03;
    public final ArrayList<C02439q> A05 = new ArrayList<>();
    public final C02389l A04 = new C02389l();
    public AbstractC02409n A00 = AbstractC02409n.A01;

    private C02439q A00(C02439q c02439q, AbstractC02409n abstractC02409n) {
        if (abstractC02409n.A0E() || this.A00.A0E()) {
            return c02439q;
        }
        Object uid = this.A00.A0A(c02439q.A01.A02, this.A04, true).A03;
        int newPeriodIndex = abstractC02409n.A04(uid);
        if (newPeriodIndex == -1) {
            return c02439q;
        }
        int newWindowIndex = abstractC02409n.A09(newPeriodIndex, this.A04).A00;
        return new C02439q(newWindowIndex, c02439q.A01.A00(newPeriodIndex));
    }

    private void A02() {
        if (!this.A05.isEmpty()) {
            this.A01 = this.A05.get(0);
        }
    }

    @Nullable
    public final C02439q A03() {
        return this.A01;
    }

    @Nullable
    public final C02439q A04() {
        if (this.A05.isEmpty()) {
            return null;
        }
        ArrayList<C02439q> arrayList = this.A05;
        return arrayList.get(arrayList.size() - 1);
    }

    @Nullable
    public final C02439q A05() {
        if (this.A05.isEmpty() || this.A00.A0E() || this.A03) {
            return null;
        }
        return this.A05.get(0);
    }

    @Nullable
    public final C02439q A06() {
        return this.A02;
    }

    @Nullable
    public final EK A07(int i) {
        EK ek = null;
        AbstractC02409n abstractC02409n = this.A00;
        if (abstractC02409n != null) {
            int A00 = abstractC02409n.A00();
            for (int periodIndex = 0; periodIndex < this.A05.size(); periodIndex++) {
                C02439q mediaPeriod = this.A05.get(periodIndex);
                EK match = mediaPeriod.A01;
                int i2 = match.A02;
                if (i2 < A00 && this.A00.A09(i2, this.A04).A00 == i) {
                    if (ek != null) {
                        return null;
                    }
                    ek = mediaPeriod.A01;
                }
            }
        }
        return ek;
    }

    public final void A08() {
        this.A03 = false;
        A02();
    }

    public final void A09() {
        this.A03 = true;
    }

    public final void A0A(int i) {
        A02();
    }

    public final void A0B(int i, EK ek) {
        this.A05.add(new C02439q(i, ek));
        if (this.A05.size() == 1) {
            boolean A0E = this.A00.A0E();
            if (A06[0].charAt(21) == 'U') {
                throw new RuntimeException();
            }
            A06[0] = "SFS5Xb2c2LrmqtbhPrHYALinOi1MehvJ";
            if (!A0E) {
                A02();
            }
        }
    }

    public final void A0C(int i, EK ek) {
        C02439q mediaPeriod;
        C02439q c02439q = new C02439q(i, ek);
        this.A05.remove(c02439q);
        C02439q mediaPeriod2 = this.A02;
        if (c02439q.equals(mediaPeriod2)) {
            if (this.A05.isEmpty()) {
                mediaPeriod = null;
            } else {
                C02439q mediaPeriod3 = this.A05.get(0);
                mediaPeriod = mediaPeriod3;
            }
            this.A02 = mediaPeriod;
        }
    }

    public final void A0D(int i, EK ek) {
        this.A02 = new C02439q(i, ek);
    }

    /* JADX WARN: Incorrect condition in loop: B:4:0x0007 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void A0E(com.facebook.ads.redexgen.X.AbstractC02409n r5) {
        /*
            r4 = this;
            r2 = 0
        L1:
            java.util.ArrayList<com.facebook.ads.redexgen.X.9q> r0 = r4.A05
            int r0 = r0.size()
            if (r2 >= r0) goto L1b
            java.util.ArrayList<com.facebook.ads.redexgen.X.9q> r1 = r4.A05
            java.lang.Object r0 = r1.get(r2)
            com.facebook.ads.redexgen.X.9q r0 = (com.facebook.ads.redexgen.X.C02439q) r0
            com.facebook.ads.redexgen.X.9q r0 = r4.A00(r0, r5)
            r1.set(r2, r0)
            int r2 = r2 + 1
            goto L1
        L1b:
            com.facebook.ads.redexgen.X.9q r3 = r4.A02
            java.lang.String[] r1 = com.facebook.ads.redexgen.X.C02429p.A06
            r0 = 0
            r1 = r1[r0]
            r0 = 21
            char r1 = r1.charAt(r0)
            r0 = 85
            if (r1 == r0) goto L41
            java.lang.String[] r2 = com.facebook.ads.redexgen.X.C02429p.A06
            java.lang.String r1 = "OE27bQwCbSc4SHZoCTNTYydrCDTv"
            r0 = 1
            r2[r0] = r1
            if (r3 == 0) goto L3b
            com.facebook.ads.redexgen.X.9q r0 = r4.A00(r3, r5)
            r4.A02 = r0
        L3b:
            r4.A00 = r5
            r4.A02()
            return
        L41:
            java.lang.RuntimeException r0 = new java.lang.RuntimeException
            r0.<init>()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.ads.redexgen.X.C02429p.A0E(com.facebook.ads.redexgen.X.9n):void");
    }

    public final boolean A0F() {
        return this.A03;
    }
}
