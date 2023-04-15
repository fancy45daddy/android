package com.facebook.ads.redexgen.X;

import a.a.j;
import android.net.Uri;
import androidx.annotation.Nullable;
import java.util.Arrays;
import java.util.Map;
/* renamed from: com.facebook.ads.redexgen.X.Em  reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public final class C0355Em extends ZO {
    public static byte[] A02;
    public static final String A03;
    public final Uri A00;
    public final Map<String, String> A01;

    public static String A00(int i, int i2, int i3) {
        byte[] copyOfRange = Arrays.copyOfRange(A02, i, i + i2);
        for (int i4 = 0; i4 < copyOfRange.length; i4++) {
            copyOfRange[i4] = (byte) ((copyOfRange[i4] ^ i3) ^ 79);
        }
        return new String(copyOfRange);
    }

    public static void A01() {
        A02 = new byte[]{122, 93, 85, 80, 89, 88, 28, 72, 83, 28, 83, 76, 89, 82, 28, 80, 85, 82, 87, 28, 73, 78, 80, 6, 28, 43, 46, 41, 44};
    }

    static {
        A01();
        A03 = C0355Em.class.getSimpleName();
    }

    public C0355Em(C0806Wj c0806Wj, IT it, String str, Uri uri, Map<String, String> mExtraData, @Nullable C00190m c00190m, boolean z) {
        super(c0806Wj, it, str, c00190m, z);
        this.A00 = uri;
        this.A01 = mExtraData;
    }

    @Override // com.facebook.ads.redexgen.X.AbstractC00130f
    @Nullable
    public final EnumC00120e A0A() {
        try {
            KL.A09(new KL(), ((AbstractC00130f) this).A00, KM.A00(this.A00.getQueryParameter(A00(25, 4, 8))), ((AbstractC00130f) this).A02);
            return null;
        } catch (Exception unused) {
            String str = A00(0, 25, j.AppCompatTheme_windowFixedHeightMinor) + this.A00.toString();
            return EnumC00120e.A02;
        }
    }

    @Override // com.facebook.ads.redexgen.X.ZO
    public final void A0D() {
        EnumC00120e enumC00120e = null;
        if (((ZO) this).A02) {
            enumC00120e = A0A();
        }
        A0E(this.A01, enumC00120e);
    }
}
