package com.facebook.ads.redexgen.X;

import androidx.annotation.NonNull;
/* renamed from: com.facebook.ads.redexgen.X.30  reason: invalid class name */
/* loaded from: assets/audience_network.dex */
public final class AnonymousClass30 extends C0264Al implements Comparable<AnonymousClass30> {
    public long A00;

    public AnonymousClass30() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Override // java.lang.Comparable
    /* renamed from: A00 */
    public final int compareTo(@NonNull AnonymousClass30 anonymousClass30) {
        if (A04() != anonymousClass30.A04()) {
            return A04() ? 1 : -1;
        }
        long j = ((C0784Vn) this).A00 - ((C0784Vn) anonymousClass30).A00;
        if (j == 0) {
            long j2 = this.A00;
            long delta = anonymousClass30.A00;
            j = j2 - delta;
            if (j == 0) {
                return 0;
            }
        }
        return j > 0 ? 1 : -1;
    }
}
