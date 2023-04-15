package com.facebook.ads.redexgen.X;

import android.text.TextUtils;
import androidx.annotation.Nullable;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import org.json.JSONArray;
/* renamed from: com.facebook.ads.redexgen.X.0j  reason: invalid class name and case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public final class C00170j {
    public static byte[] A00;
    public static String[] A01 = {"4Fi3cRKjKwjo", "pfwDmZC0EgnSHGG3akphHDiSxRpjxWfc", "OwKyFlCBYoW0NHpoiuFf2exuC", "FTixXnraWBf7yQ9sseM6khJqknPB2", "87lno6sBf8EnLpq9v2WrftgOrdI4V", "hcLSbPhFObKmfxN2jEGb0Jf71EM4", "MV7VLhl", "AE1L1nhQpeYYJvXkfFkincgpQRIdvuit"};

    public static String A00(int i, int i2, int i3) {
        byte[] copyOfRange = Arrays.copyOfRange(A00, i, i + i2);
        for (int i4 = 0; i4 < copyOfRange.length; i4++) {
            copyOfRange[i4] = (byte) ((copyOfRange[i4] ^ i3) ^ 56);
        }
        return new String(copyOfRange);
    }

    public static void A02() {
        A00 = new byte[]{101, 64, 4, 77, 87, 4, 77, 74, 82, 69, 72, 77, 64, 69, 80, 65, 64, 4, 83, 77, 80, 76, 75, 81, 80, 4, 80, 75, 79, 65, 74, 10, 10, 27, 2};
    }

    static {
        A02();
    }

    @Nullable
    public static Collection<String> A01(@Nullable JSONArray jSONArray) {
        if (jSONArray == null || jSONArray.length() == 0) {
            return null;
        }
        HashSet hashSet = new HashSet();
        for (int i = 0; i < jSONArray.length(); i++) {
            hashSet.add(jSONArray.optString(i));
        }
        return hashSet;
    }

    public static boolean A03(C0806Wj c0806Wj, InterfaceC00160i interfaceC00160i, IT it) {
        EnumC00150h A6n = interfaceC00160i.A6n();
        if (A6n != null) {
            EnumC00150h invalidationBehavior = EnumC00150h.A03;
            if (A6n != invalidationBehavior) {
                boolean packageInstalled = false;
                Collection<String> A6M = interfaceC00160i.A6M();
                if (A6M == null || A6M.isEmpty()) {
                    return false;
                }
                Iterator<String> it2 = A6M.iterator();
                while (true) {
                    if (!it2.hasNext()) {
                        break;
                    } else if (C0503Km.A04(c0806Wj, it2.next())) {
                        packageInstalled = true;
                        break;
                    }
                }
                EnumC00150h invalidationBehavior2 = EnumC00150h.A02;
                if (packageInstalled != (A6n == invalidationBehavior2)) {
                    return false;
                }
                String A63 = interfaceC00160i.A63();
                boolean isEmpty = TextUtils.isEmpty(A63);
                String[] strArr = A01;
                String clientToken = strArr[7];
                if (clientToken.charAt(25) != strArr[1].charAt(25)) {
                    throw new RuntimeException();
                }
                A01[2] = "Y0XUyINdugWnNFuKX72emGLWk";
                if (!isEmpty) {
                    it.A90(A63, null);
                    return true;
                }
                c0806Wj.A06().A8u(A00(32, 3, 83), C01877l.A0Z, new C01887m(A00(0, 32, 28)));
                return true;
            }
        }
        return false;
    }
}
