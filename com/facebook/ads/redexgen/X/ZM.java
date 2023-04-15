package com.facebook.ads.redexgen.X;

import android.net.Uri;
import java.util.Arrays;
/* loaded from: assets/audience_network.dex */
public final class ZM extends AbstractC00130f {
    public static byte[] A01;
    public static final String A02;
    public final Uri A00;

    public static String A00(int i, int i2, int i3) {
        byte[] copyOfRange = Arrays.copyOfRange(A01, i, i + i2);
        for (int i4 = 0; i4 < copyOfRange.length; i4++) {
            copyOfRange[i4] = (byte) ((copyOfRange[i4] - i3) - 1);
        }
        return new String(copyOfRange);
    }

    public static void A01() {
        A01 = new byte[]{88, 115, 123, 126, 119, 118, 50, -122, -127, 50, -127, -126, 119, Byte.MIN_VALUE, 50, 126, 123, Byte.MIN_VALUE, 125, 50, -121, -124, 126, 76, 50};
    }

    static {
        A01();
        A02 = ZM.class.getSimpleName();
    }

    public ZM(C0806Wj c0806Wj, IT it, String str, Uri uri) {
        super(c0806Wj, it, str);
        this.A00 = uri;
    }

    @Override // com.facebook.ads.redexgen.X.AbstractC00130f
    public final void A0C() {
        try {
            KL.A0A(new KL(), super.A00, this.A00, this.A02);
        } catch (Exception unused) {
            String str = A00(0, 25, 17) + this.A00.toString();
        }
    }
}
