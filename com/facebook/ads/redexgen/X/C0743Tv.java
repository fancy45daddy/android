package com.facebook.ads.redexgen.X;

import a.a.j;
import android.net.Uri;
import android.util.Base64;
import java.io.IOException;
import java.net.URLDecoder;
import java.util.Arrays;
/* renamed from: com.facebook.ads.redexgen.X.Tv  reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public final class C0743Tv implements GQ {
    public static byte[] A03;
    public static String[] A04 = {"moGtNK96e9Al47TRfaGhqgNZaCCQZMrY", "dDjGu6T1nGcXaD4MN5VqyIi9xIOLfrVa", "SRI2bo", "WZDamcSmsks0kneQaoNnaVFzgRD59bga", "Euhi8Hajh73EHZ", "h73c4EBBc1ElpNHDE1RNYorrMsvABQfz", "Cft6Vy93uvDnG7biqQNtEhDJ3", "YtIQrPkH6VpJaJVwafduIvy1b"};
    public int A00;
    public GU A01;
    public byte[] A02;

    public static String A00(int i, int i2, int i3) {
        byte[] copyOfRange = Arrays.copyOfRange(A03, i, i + i2);
        for (int i4 = 0; i4 < copyOfRange.length; i4++) {
            copyOfRange[i4] = (byte) ((copyOfRange[i4] - i3) - 59);
        }
        return new String(copyOfRange);
    }

    public static void A01() {
        A03 = new byte[]{121, -32, 7, 6, 24, 10, -37, -39, -2, 43, 43, 40, 43, -39, 48, 33, 34, 37, 30, -39, 41, 26, 43, 44, 34, 39, 32, -39, -5, 26, 44, 30, -17, -19, -39, 30, 39, 28, 40, 29, 30, 29, -39, 44, 45, 43, 34, 39, 32, -13, -39, -24, -26, -64, -44, -26, -42, -36, -36, -91, -66, -75, -56, -64, -75, -77, -60, -75, -76, 112, -91, -94, -103, 112, -74, -65, -62, -67, -79, -60, -118, 112, -13, 12, 17, 19, 14, 14, 13, 16, 18, 3, 2, -66, 17, 1, 6, 3, 11, 3, -40, -66, -35, -38, -19, -38};
    }

    static {
        A01();
    }

    @Override // com.facebook.ads.redexgen.X.GQ
    public final Uri A7i() {
        GU gu = this.A01;
        if (gu != null) {
            return gu.A04;
        }
        return null;
    }

    @Override // com.facebook.ads.redexgen.X.GQ
    public final long ACq(GU gu) throws IOException {
        this.A01 = gu;
        Uri uri = gu.A04;
        String scheme = uri.getScheme();
        if (A00(j.AppCompatTheme_textAppearanceSearchResultTitle, 4, 62).equals(scheme)) {
            String[] uriParts = C0430Hl.A0l(uri.getSchemeSpecificPart(), A00(0, 1, 18));
            if (uriParts.length == 2) {
                String str = uriParts[1];
                String str2 = uriParts[0];
                String[] uriParts2 = A04;
                String scheme2 = uriParts2[4];
                if (scheme2.length() != uriParts2[0].length()) {
                    A04[5] = "WIkZ4UHmbJsePGJfUuOe0OgY6EWx9D8V";
                    if (str2.contains(A00(1, 7, j.AppCompatTheme_toolbarNavigationButtonStyle))) {
                        try {
                            this.A02 = Base64.decode(str, 0);
                        } catch (IllegalArgumentException e) {
                            String scheme3 = A00(8, 43, 126) + str;
                            throw new C9R(scheme3, e);
                        }
                    } else {
                        this.A02 = URLDecoder.decode(str, A00(51, 8, 88)).getBytes();
                    }
                    return this.A02.length;
                }
                throw new RuntimeException();
            }
            String scheme4 = A00(59, 23, 21) + uri;
            throw new C9R(scheme4);
        }
        String scheme5 = A00(82, 20, 99) + scheme;
        throw new C9R(scheme5);
    }

    @Override // com.facebook.ads.redexgen.X.GQ
    public final void close() throws IOException {
        this.A01 = null;
        this.A02 = null;
    }

    @Override // com.facebook.ads.redexgen.X.GQ
    public final int read(byte[] bArr, int i, int i2) {
        if (i2 == 0) {
            return 0;
        }
        int length = this.A02.length - this.A00;
        if (length == 0) {
            return -1;
        }
        int min = Math.min(i2, length);
        byte[] bArr2 = this.A02;
        int remainingBytes = this.A00;
        System.arraycopy(bArr2, remainingBytes, bArr, i, min);
        int remainingBytes2 = this.A00;
        this.A00 = remainingBytes2 + min;
        return min;
    }
}
