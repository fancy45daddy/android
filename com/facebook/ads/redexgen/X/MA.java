package com.facebook.ads.redexgen.X;

import androidx.annotation.Nullable;
import com.facebook.ads.NativeAdLayout;
/* loaded from: assets/audience_network.dex */
public final class MA {
    public static String[] A00 = {"Mh7OQPY25mJ4xZdJdnJU4lIWxnSb2W80", "uMvQGqYS2R9kLiwAhxbB5gyg9uPLoFmG", "JD8RnvPxGeaTxsc34jN0O6vhnDfoaLvm", "v", "yiVoJ6", "bh6EDcFJy1WMlrC6ew5uNV", "HsXTYL", "k"};
    public static final int A01 = (int) (Kd.A02 * 200.0f);
    public static final int A03 = (int) (Kd.A02 * 200.0f);
    public static final int A02 = (int) (Kd.A02 * 50.0f);

    public static AnonymousClass10 A00(@Nullable NativeAdLayout nativeAdLayout) {
        if (nativeAdLayout == null) {
            return AnonymousClass10.A05;
        }
        if (A03(nativeAdLayout)) {
            return AnonymousClass10.A06;
        }
        return AnonymousClass10.A04;
    }

    @Nullable
    public static M9 A01(C0806Wj c0806Wj, IT it, String str, @Nullable NativeAdLayout nativeAdLayout) {
        if (nativeAdLayout == null) {
            return null;
        }
        int h = nativeAdLayout.getWidth();
        int w = nativeAdLayout.getHeight();
        int i = A01;
        if (h >= i && w >= i) {
            return new S1(c0806Wj, it, str);
        }
        if (h < A03 || w < A02) {
            return null;
        }
        return new S2(c0806Wj, it, str);
    }

    public static M9 A02(C0806Wj c0806Wj, IT it, String str, C1U c1u, InterfaceC0520Ld interfaceC0520Ld, InterfaceC0519Lc interfaceC0519Lc) {
        return new S3(c0806Wj, it, str, c1u, interfaceC0520Ld, interfaceC0519Lc);
    }

    public static boolean A03(NativeAdLayout nativeAdLayout) {
        int h = nativeAdLayout.getWidth();
        int height = nativeAdLayout.getHeight();
        int w = A01;
        if (h < w || height < w) {
            if (h >= A03) {
                int i = A02;
                if (A00[5].length() != 22) {
                    throw new RuntimeException();
                }
                A00[5] = "hhrIY4o6fKEkU42z4UVpb3";
                if (height < i) {
                }
            }
            return true;
        }
        return false;
    }
}
