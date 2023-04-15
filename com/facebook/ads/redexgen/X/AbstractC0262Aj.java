package com.facebook.ads.redexgen.X;

import java.util.List;
/* renamed from: com.facebook.ads.redexgen.X.Aj  reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public abstract class AbstractC0262Aj extends AbstractC0783Vm implements FK {
    public static String[] A02 = {"", "mui60dwzFhaHNm2Uk6c71g13RzPqoL9o", "B0rzWlns", "IaExOe45iIyqIoKsg3ghGHNojNO5y7aX", "6x0KWKc5lmTcd6rSDKCIntspSHI5N7vM", "fpXFGNqhd64a2XzCiJ5Y2uwqVb67lOfi", "JEeTPk6X6cicZdwnLWr3cLjXKJNjxOw", "om0z9vsHwazWN6uDNjDMJ"};
    public long A00;
    public FK A01;

    public abstract void A08();

    @Override // com.facebook.ads.redexgen.X.AbstractC0256Ad
    public final void A07() {
        super.A07();
        this.A01 = null;
    }

    public final void A09(long j, FK fk, long j2) {
        super.A01 = j;
        this.A01 = fk;
        if (j2 == Long.MAX_VALUE) {
            j2 = super.A01;
        }
        this.A00 = j2;
        if (A02[0].length() != 0) {
            throw new RuntimeException();
        }
        A02[1] = "xukRyz5yFwN1nVXA8Rs2f92E1X9llmA1";
    }

    @Override // com.facebook.ads.redexgen.X.FK
    public final List<FJ> A69(long j) {
        return this.A01.A69(j - this.A00);
    }

    @Override // com.facebook.ads.redexgen.X.FK
    public final long A6Z(int i) {
        return this.A01.A6Z(i) + this.A00;
    }

    @Override // com.facebook.ads.redexgen.X.FK
    public final int A6a() {
        return this.A01.A6a();
    }

    @Override // com.facebook.ads.redexgen.X.FK
    public final int A6y(long j) {
        return this.A01.A6y(j - this.A00);
    }
}
