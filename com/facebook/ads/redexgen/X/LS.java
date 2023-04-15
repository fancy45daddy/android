package com.facebook.ads.redexgen.X;

import androidx.annotation.Nullable;
import java.util.concurrent.Executor;
/* loaded from: assets/audience_network.dex */
public final class LS {
    @Nullable
    public static LS A02;
    public final SS A00;
    public final LU A01;

    public LS(C0806Wj c0806Wj, Executor executor, AnonymousClass83 anonymousClass83) {
        this.A01 = new LU(c0806Wj);
        this.A00 = new SS(executor, anonymousClass83, c0806Wj);
    }

    private void A00() {
        this.A01.A03(this.A00);
    }

    public static void A01(C0806Wj c0806Wj, Executor executor, AnonymousClass83 anonymousClass83) {
        if (!ID.A12(c0806Wj)) {
            return;
        }
        LS ls = A02;
        if (ls == null) {
            A02 = new LS(c0806Wj, executor, anonymousClass83);
            A02.A00();
            return;
        }
        ls.A02(anonymousClass83);
    }

    private void A02(AnonymousClass83 anonymousClass83) {
        this.A00.A07(anonymousClass83);
    }
}
