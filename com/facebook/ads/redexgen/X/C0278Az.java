package com.facebook.ads.redexgen.X;

import java.util.Arrays;
import java.util.UUID;
/* renamed from: com.facebook.ads.redexgen.X.Az  reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public final class C0278Az extends Exception {
    public static byte[] A00;
    public static String[] A01 = {"jybu9AmlZPNYJFO5CETURgZbL9", "roja0bhL1B9gUBQhWiTEX", "WMiIg6bDBi41NZoApBFo0", "", "oT4iuMPk3LT2VVBhdE9cDO7Myr", "ruzB4PX8Fu4D5Uvu", "vAhBirgpsYGDvsbxec1VAyH2PJeSZTTh", "yf8hg5uJFg3VA494hRWQ5mGXrAA"};

    public static String A00(int i, int i2, int i3) {
        byte[] copyOfRange = Arrays.copyOfRange(A00, i, i + i2);
        for (int i4 = 0; i4 < copyOfRange.length; i4++) {
            copyOfRange[i4] = (byte) ((copyOfRange[i4] - i3) - 119);
            if (A01[6].charAt(20) != 'A') {
                throw new RuntimeException();
            }
            A01[3] = "o3d2o9ikgoxA5z1";
        }
        return new String(copyOfRange);
    }

    public static void A01() {
        A00 = new byte[]{-15, 9, 8, 13, 5, -60, 8, 19, 9, 23, -60, 18, 19, 24, -60, 23, 25, 20, 20, 19, 22, 24, -60, 25, 25, 13, 8, -34, -60};
    }

    static {
        A01();
    }

    public C0278Az(UUID uuid) {
        super(A00(0, 29, 45) + uuid);
    }
}
