package com.facebook.ads.redexgen.X;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
/* renamed from: com.facebook.ads.redexgen.X.9F  reason: invalid class name */
/* loaded from: assets/audience_network.dex */
public final class C9F implements Comparable<C9F> {
    public int A00;
    public long A01;
    @Nullable
    public Object A02;
    public final C02329e A03;

    public C9F(C02329e c02329e) {
        this.A03 = c02329e;
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Override // java.lang.Comparable
    /* renamed from: A00 */
    public final int compareTo(@NonNull C9F c9f) {
        if ((this.A02 == null) != (c9f.A02 == null)) {
            return this.A02 != null ? -1 : 1;
        } else if (this.A02 == null) {
            return 0;
        } else {
            int i = this.A00 - c9f.A00;
            if (i != 0) {
                return i;
            }
            int comparePeriodIndex = C0430Hl.A07(this.A01, c9f.A01);
            return comparePeriodIndex;
        }
    }

    public final void A01(int i, long j, Object obj) {
        this.A00 = i;
        this.A01 = j;
        this.A02 = obj;
    }
}
