package com.facebook.ads.redexgen.X;

import android.media.MediaCodecInfo;
import android.media.MediaCodecList;
import java.util.Arrays;
/* renamed from: com.facebook.ads.redexgen.X.Ub  reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public final class C0749Ub implements InterfaceC0315Cw {
    public static byte[] A00;

    static {
        A01();
    }

    public static String A00(int i, int i2, int i3) {
        byte[] copyOfRange = Arrays.copyOfRange(A00, i, i + i2);
        for (int i4 = 0; i4 < copyOfRange.length; i4++) {
            copyOfRange[i4] = (byte) ((copyOfRange[i4] ^ i3) ^ 13);
        }
        return new String(copyOfRange);
    }

    public static void A01() {
        A00 = new byte[]{72, 87, 90, 91, 81, 17, 95, 72, 93};
    }

    public C0749Ub() {
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC0315Cw
    public final int A64() {
        return MediaCodecList.getCodecCount();
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC0315Cw
    public final MediaCodecInfo A65(int i) {
        return MediaCodecList.getCodecInfoAt(i);
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC0315Cw
    public final boolean A8c(String str, MediaCodecInfo.CodecCapabilities codecCapabilities) {
        return A00(0, 9, 51).equals(str);
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC0315Cw
    public final boolean AEB() {
        return false;
    }
}
