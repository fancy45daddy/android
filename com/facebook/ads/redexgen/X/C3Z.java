package com.facebook.ads.redexgen.X;

import android.os.Build;
import android.os.Bundle;
import androidx.annotation.Nullable;
import java.util.List;
/* renamed from: com.facebook.ads.redexgen.X.3Z  reason: invalid class name */
/* loaded from: assets/audience_network.dex */
public final class C3Z {
    public static final C3Y A01;
    public final Object A00;

    static {
        if (Build.VERSION.SDK_INT >= 19) {
            A01 = new E0();
        } else if (Build.VERSION.SDK_INT >= 16) {
            A01 = new E1();
        } else {
            A01 = new C0837Xo();
        }
    }

    public C3Z() {
        this.A00 = A01.A9b(this);
    }

    public C3Z(Object obj) {
        this.A00 = obj;
    }

    @Nullable
    public final C3X A00(int i) {
        return null;
    }

    @Nullable
    public final C3X A01(int i) {
        return null;
    }

    public final Object A02() {
        return this.A00;
    }

    @Nullable
    public final List<C3X> A03(String str, int i) {
        return null;
    }

    public final boolean A04(int i, int i2, Bundle bundle) {
        return false;
    }
}
