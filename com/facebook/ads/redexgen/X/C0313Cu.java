package com.facebook.ads.redexgen.X;

import android.text.TextUtils;
import androidx.annotation.Nullable;
/* renamed from: com.facebook.ads.redexgen.X.Cu  reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public final class C0313Cu {
    public final String A00;
    public final boolean A01;

    public C0313Cu(String str, boolean z) {
        this.A00 = str;
        this.A01 = z;
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || obj.getClass() != C0313Cu.class) {
            return false;
        }
        C0313Cu c0313Cu = (C0313Cu) obj;
        return TextUtils.equals(this.A00, c0313Cu.A00) && this.A01 == c0313Cu.A01;
    }

    public final int hashCode() {
        int result = 1 * 31;
        String str = this.A00;
        int prime = str == null ? 0 : str.hashCode();
        int result2 = (result + prime) * 31;
        int prime2 = this.A01 ? 1231 : 1237;
        return result2 + prime2;
    }
}
