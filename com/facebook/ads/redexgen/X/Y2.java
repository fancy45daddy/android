package com.facebook.ads.redexgen.X;

import a.a.j;
import java.util.Arrays;
/* loaded from: assets/audience_network.dex */
public class Y2<T> implements InterfaceC00632e<T> {
    public static byte[] A02;
    public static String[] A03 = {"pRcBA4OWefysSNzvRxIkpBVTVwfc3AVE", "RPn4qv0f1UarsEXGS1XogTnrbpEJEmnV", "xmsaI0t9E", "ZcBN", "DIlRoYRb", "oKMZSswBXiC", "UEhtJ1eDnORTZ2wzgc9obnj9WqOhgFHK", "4xQT2X5Ea9Pr"};
    public int A00;
    public final Object[] A01;

    public static String A00(int i, int i2, int i3) {
        byte[] copyOfRange = Arrays.copyOfRange(A02, i, i + i2);
        for (int i4 = 0; i4 < copyOfRange.length; i4++) {
            byte b2 = copyOfRange[i4];
            String[] strArr = A03;
            if (strArr[4].length() == strArr[7].length()) {
                throw new RuntimeException();
            }
            A03[5] = "P1E265Ge3cQ";
            copyOfRange[i4] = (byte) ((b2 ^ i3) ^ j.AppCompatTheme_toolbarNavigationButtonStyle);
        }
        return new String(copyOfRange);
    }

    public static void A01() {
        A02 = new byte[]{44, 1, 31, 8, 12, 9, 20, 77, 4, 3, 77, 25, 5, 8, 77, 29, 2, 2, 1, 76, 76, 112, 125, 56, 117, 121, 96, 56, 104, 119, 119, 116, 56, 107, 113, 98, 125, 56, 117, 109, 107, 108, 56, 122, 125, 56, 38, 56, 40};
    }

    static {
        A01();
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.Y2 != com.facebook.ads.internal.androidx.support.v4.util.Pools$SimplePool<T> */
    public Y2(int i) {
        if (i > 0) {
            this.A01 = new Object[i];
            return;
        }
        throw new IllegalArgumentException(A00(20, 29, j.AppCompatTheme_windowFixedHeightMajor));
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.Y2 != com.facebook.ads.internal.androidx.support.v4.util.Pools$SimplePool<T> */
    /* JADX WARN: Incorrect condition in loop: B:4:0x0003 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private boolean A02(T r6) {
        /*
            r5 = this;
            r4 = 0
        L1:
            int r0 = r5.A00
            if (r4 >= r0) goto L34
            java.lang.Object[] r0 = r5.A01
            r3 = r0[r4]
            java.lang.String[] r2 = com.facebook.ads.redexgen.X.Y2.A03
            r0 = 2
            r1 = r2[r0]
            r0 = 3
            r0 = r2[r0]
            int r1 = r1.length()
            int r0 = r0.length()
            if (r1 == r0) goto L2e
            java.lang.String[] r2 = com.facebook.ads.redexgen.X.Y2.A03
            java.lang.String r1 = "IsiBXNP8"
            r0 = 4
            r2[r0] = r1
            java.lang.String r1 = "yZIlFrLQCuaZ"
            r0 = 7
            r2[r0] = r1
            if (r3 != r6) goto L2b
            r0 = 1
            return r0
        L2b:
            int r4 = r4 + 1
            goto L1
        L2e:
            java.lang.RuntimeException r0 = new java.lang.RuntimeException
            r0.<init>()
            throw r0
        L34:
            r0 = 0
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.ads.redexgen.X.Y2.A02(java.lang.Object):boolean");
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.Y2 != com.facebook.ads.internal.androidx.support.v4.util.Pools$SimplePool<T> */
    @Override // com.facebook.ads.redexgen.X.InterfaceC00632e
    public T A2O() {
        int i = this.A00;
        if (i > 0) {
            int lastPooledIndex = i - 1;
            Object[] objArr = this.A01;
            T t = (T) objArr[lastPooledIndex];
            objArr[lastPooledIndex] = null;
            this.A00 = i - 1;
            return t;
        }
        return null;
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.Y2 != com.facebook.ads.internal.androidx.support.v4.util.Pools$SimplePool<T> */
    @Override // com.facebook.ads.redexgen.X.InterfaceC00632e
    public boolean ADi(T instance) {
        if (!A02(instance)) {
            int i = this.A00;
            Object[] objArr = this.A01;
            if (i < objArr.length) {
                objArr[i] = instance;
                this.A00 = i + 1;
                return true;
            }
            return false;
        }
        throw new IllegalStateException(A00(0, 20, 7));
    }
}
