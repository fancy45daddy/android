package com.facebook.ads.redexgen.X;

import android.content.SharedPreferences;
import androidx.annotation.Nullable;
/* loaded from: assets/audience_network.dex */
public class Y6 implements C2I {
    public final SharedPreferences.Editor A00;

    public Y6(SharedPreferences.Editor editor) {
        this.A00 = editor;
    }

    @Override // com.facebook.ads.redexgen.X.C2I
    public final void A3N() {
        this.A00.apply();
    }

    @Override // com.facebook.ads.redexgen.X.C2I
    public final C2I ADK(String str, long j) {
        this.A00.putLong(str, j);
        return this;
    }

    @Override // com.facebook.ads.redexgen.X.C2I
    public final C2I ADL(String str, @Nullable String str2) {
        this.A00.putString(str, str2);
        return this;
    }
}
