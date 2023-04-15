package com.facebook.ads.redexgen.X;

import a.a.j;
import android.text.TextUtils;
import java.util.Arrays;
/* renamed from: com.facebook.ads.redexgen.X.65  reason: invalid class name */
/* loaded from: assets/audience_network.dex */
public final class AnonymousClass65 {
    public static boolean A04;
    public static byte[] A05;
    public static final String A06;
    public final AnonymousClass66 A00;
    public final AnonymousClass67 A01;
    public final C0805Wi A02;
    public final QD A03;

    public static String A00(int i, int i2, int i3) {
        byte[] copyOfRange = Arrays.copyOfRange(A05, i, i + i2);
        for (int i4 = 0; i4 < copyOfRange.length; i4++) {
            copyOfRange[i4] = (byte) ((copyOfRange[i4] ^ i3) ^ j.AppCompatTheme_windowFixedHeightMajor);
        }
        return new String(copyOfRange);
    }

    public static void A01() {
        A05 = new byte[]{46, 56, 19, 41, 52, 56, 62, 45, 63};
    }

    static {
        A01();
        A06 = AnonymousClass65.class.getSimpleName();
    }

    public AnonymousClass65(C0805Wi c0805Wi, FH fh, AnonymousClass66 anonymousClass66, AnonymousClass67 anonymousClass67) {
        this.A02 = c0805Wi;
        this.A03 = fh.A4O(QE.A06);
        this.A00 = anonymousClass66;
        this.A01 = anonymousClass67;
        this.A03.A3F(new C0813Wq(this));
        A02();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public synchronized void A02() {
        if (C0480Jm.A02(this)) {
            return;
        }
        if (!this.A03.A8Z()) {
            this.A02.A03().A8N();
            return;
        }
        String btExtras = this.A03.A6H().optString(A00(0, 9, 62));
        if (!TextUtils.isEmpty(btExtras)) {
            this.A00.A04(this.A02, btExtras);
            if (!A04 || ID.A0h(this.A02)) {
                A04 = true;
                this.A01.A07();
            }
        }
    }
}
