package com.facebook.ads.redexgen.X;

import android.view.View;
import java.util.Arrays;
/* renamed from: com.facebook.ads.redexgen.X.Ly  reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public class View$OnClickListenerC0540Ly implements View.OnClickListener {
    public static byte[] A01;
    public final /* synthetic */ S7 A00;

    static {
        A01();
    }

    public static String A00(int i, int i2, int i3) {
        byte[] copyOfRange = Arrays.copyOfRange(A01, i, i + i2);
        for (int i4 = 0; i4 < copyOfRange.length; i4++) {
            copyOfRange[i4] = (byte) ((copyOfRange[i4] - i3) - 108);
        }
        return new String(copyOfRange);
    }

    public static void A01() {
        A01 = new byte[]{-27, -38, -25, -37, -28, -25, -30, -72, -23, -42, -72, -31, -34, -40, -32};
    }

    public View$OnClickListenerC0540Ly(S7 s7) {
        this.A00 = s7;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        InterfaceC0519Lc interfaceC0519Lc;
        if (C0480Jm.A02(this)) {
            return;
        }
        try {
            interfaceC0519Lc = this.A00.A05;
            interfaceC0519Lc.A3s(A00(0, 15, 9));
        } catch (Throwable th) {
            C0480Jm.A00(th, this);
        }
    }
}
