package com.facebook.ads.redexgen.X;

import android.net.Uri;
import java.io.IOException;
import java.util.Arrays;
/* renamed from: com.facebook.ads.redexgen.X.Tp  reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public final class C0737Tp implements GQ {
    public static byte[] A00;
    public static final GP A01;
    public static final C0737Tp A02;

    public static String A00(int i, int i2, int i3) {
        byte[] copyOfRange = Arrays.copyOfRange(A00, i, i + i2);
        for (int i4 = 0; i4 < copyOfRange.length; i4++) {
            copyOfRange[i4] = (byte) ((copyOfRange[i4] - i3) - 72);
        }
        return new String(copyOfRange);
    }

    public static void A01() {
        A00 = new byte[]{10, 59, 51, 51, 63, -26, 57, 53, 59, 56, 41, 43};
    }

    static {
        A01();
        A02 = new C0737Tp();
        A01 = new C0738Tq();
    }

    public C0737Tp() {
    }

    public /* synthetic */ C0737Tp(C0738Tq c0738Tq) {
        this();
    }

    @Override // com.facebook.ads.redexgen.X.GQ
    public final Uri A7i() {
        return null;
    }

    @Override // com.facebook.ads.redexgen.X.GQ
    public final long ACq(GU gu) throws IOException {
        throw new IOException(A00(0, 12, 126));
    }

    @Override // com.facebook.ads.redexgen.X.GQ
    public final void close() throws IOException {
    }

    @Override // com.facebook.ads.redexgen.X.GQ
    public final int read(byte[] bArr, int i, int i2) throws IOException {
        throw new UnsupportedOperationException();
    }
}
