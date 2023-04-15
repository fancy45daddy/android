package com.facebook.ads.redexgen.X;

import android.text.TextUtils;
import com.facebook.ads.NativeAdBase;
import java.util.Arrays;
import java.util.List;
/* loaded from: assets/audience_network.dex */
public final class X5 implements InterfaceC00511s {
    public static byte[] A03;
    public C5Q A00;
    public C0806Wj A01;
    public final NativeAdBase.MediaCacheFlag A02;

    static {
        A03();
    }

    public static String A02(int i, int i2, int i3) {
        byte[] copyOfRange = Arrays.copyOfRange(A03, i, i + i2);
        for (int i4 = 0; i4 < copyOfRange.length; i4++) {
            copyOfRange[i4] = (byte) ((copyOfRange[i4] ^ i3) ^ 87);
        }
        return new String(copyOfRange);
    }

    public static void A03() {
        A03 = new byte[]{59, 52, 33, 60, 35, 48, 100, Byte.MAX_VALUE, 122, Byte.MAX_VALUE, 126, 102, Byte.MAX_VALUE};
    }

    public X5(C5Q c5q, C0806Wj c0806Wj, NativeAdBase.MediaCacheFlag mediaCacheFlag) {
        this.A00 = c5q;
        this.A01 = c0806Wj;
        this.A02 = mediaCacheFlag;
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC00511s
    public final void AAc(J3 j3) {
        C0479Jl.A00(new X8(this, j3));
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC00511s
    public final void ABX(List<Z9> list) {
        C6G manager = new C6G(this.A01);
        String firstRequestId = A02(6, 7, 70);
        for (Z9 z9 : list) {
            if (A02(6, 7, 70).equals(firstRequestId)) {
                firstRequestId = z9.A0G();
            }
            if (this.A02.equals(NativeAdBase.MediaCacheFlag.ALL)) {
                if (z9.A0E().A0G() != null) {
                    manager.A0b(new C6E(z9.A0E().A0G().getUrl(), z9.A0E().A0G().getHeight(), z9.A0E().A0G().getWidth(), z9.A0G(), A02(0, 6, 2)));
                }
                if (z9.A0E().A0F() != null) {
                    manager.A0b(new C6E(z9.A0E().A0F().getUrl(), z9.A0E().A0F().getHeight(), z9.A0E().A0F().getWidth(), z9.A0G(), A02(0, 6, 2)));
                }
                if (!TextUtils.isEmpty(z9.A0E().A0d())) {
                    manager.A0a(new C6C(z9.A0E().A0d(), z9.A0G(), A02(0, 6, 2), z9.A0E().A0A()));
                }
            }
        }
        manager.A0W(new X6(this, list), new AnonymousClass69(firstRequestId, A02(0, 6, 2)));
    }
}
