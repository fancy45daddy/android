package com.facebook.ads.redexgen.X;

import android.os.Build;
import android.os.PowerManager;
import android.util.Log;
import java.util.Arrays;
/* loaded from: assets/audience_network.dex */
public final class LV {
    public static byte[] A00;
    public static final String A01;

    public static String A00(int i, int i2, int i3) {
        byte[] copyOfRange = Arrays.copyOfRange(A00, i, i + i2);
        for (int i4 = 0; i4 < copyOfRange.length; i4++) {
            copyOfRange[i4] = (byte) ((copyOfRange[i4] - i3) - 23);
        }
        return new String(copyOfRange);
    }

    public static void A01() {
        A00 = new byte[]{100, -105, -126, -124, -113, -109, -120, -114, -115, 63, -120, -115, 63, -110, -126, -111, -124, -124, -115, 63, -120, -115, -109, -124, -111, Byte.MIN_VALUE, -126, -109, -120, -107, -124, 63, -126, -121, -124, -126, -118, 75, 63, Byte.MIN_VALUE, -110, -110, -108, -116, -120, -115, -122, 63, -120, -115, -109, -124, -111, Byte.MIN_VALUE, -126, -109, -120, -107, -124, 77, -103, -104, -96, -114, -101, -46, -55, -45, -53, -39};
    }

    static {
        A01();
        A01 = LV.class.getSimpleName();
    }

    public static boolean A02(C0806Wj c0806Wj) {
        return A03(c0806Wj) && LW.A03(c0806Wj);
    }

    public static boolean A03(C0806Wj c0806Wj) {
        if (c0806Wj == null) {
            return true;
        }
        try {
            PowerManager powerManager = (PowerManager) c0806Wj.getSystemService(A00(60, 5, 18));
            if (Build.VERSION.SDK_INT >= 20) {
                return powerManager.isInteractive();
            }
            return powerManager.isScreenOn();
        } catch (Exception e) {
            Log.e(A01, A00(0, 60, 8), e);
            c0806Wj.A06().A8u(A00(65, 5, 73), C01877l.A2R, new C01887m(e));
            return true;
        }
    }
}
