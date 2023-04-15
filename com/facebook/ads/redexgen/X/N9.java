package com.facebook.ads.redexgen.X;

import a.a.j;
import android.content.ActivityNotFoundException;
import android.util.Log;
import androidx.annotation.Nullable;
import com.facebook.ads.internal.util.activity.ActivityUtils;
import java.util.Arrays;
import java.util.Map;
/* loaded from: assets/audience_network.dex */
public final class N9 {
    public static byte[] A09;
    @Nullable
    public N8 A00;
    public boolean A01;
    public boolean A02;
    public final C0806Wj A03;
    public final IT A04;
    public final L6 A05;
    public final InterfaceC0519Lc A06;
    @Nullable
    public final C0627Pi A07;
    public final String A08;

    static {
        A02();
    }

    public static String A01(int i, int i2, int i3) {
        byte[] copyOfRange = Arrays.copyOfRange(A09, i, i + i2);
        for (int i4 = 0; i4 < copyOfRange.length; i4++) {
            copyOfRange[i4] = (byte) ((copyOfRange[i4] ^ i3) ^ j.AppCompatTheme_textColorAlertDialogListItem);
        }
        return new String(copyOfRange);
    }

    public static void A02() {
        A09 = new byte[]{31, 8, 29, 30, 41, 40, 40, 51, 50, 31, 48, 53, 63, 55, 16, 53, 47, 40, 57, 50, 57, 46, 114, 69, 69, 88, 69, 23, 82, 79, 82, 84, 66, 67, 94, 89, 80, 23, 86, 84, 67, 94, 88, 89, 73, 126, 126, 99, 126, 44, 123, 100, 101, 96, 105, 44, 99, 124, 105, 98, 101, 98, 107, 44};
    }

    public N9(C0806Wj c0806Wj, String str, @Nullable C0627Pi c0627Pi, L6 l6, IT it) {
        this.A01 = true;
        this.A03 = c0806Wj;
        this.A08 = str;
        this.A07 = c0627Pi;
        this.A05 = l6;
        this.A04 = it;
        this.A06 = new C0684Rn(this);
    }

    public N9(C0806Wj c0806Wj, String str, @Nullable C0627Pi c0627Pi, L6 l6, IT it, InterfaceC0519Lc interfaceC0519Lc) {
        this.A01 = true;
        this.A03 = c0806Wj;
        this.A08 = str;
        this.A07 = c0627Pi;
        this.A05 = l6;
        this.A04 = it;
        this.A06 = interfaceC0519Lc;
    }

    public static void A03(C0806Wj c0806Wj, @Nullable C0627Pi c0627Pi, L6 l6, IT it, C1L c1l, String str) {
        AbstractC00130f A01 = C00140g.A01(c0806Wj, it, str, KM.A00(c1l.A05()), new N2().A03(c0627Pi).A02(l6).A05(), false, false);
        if (A01 != null) {
            A01.A0A();
        }
    }

    private void A05(String str, String str2, Map<String, String> extraData) {
        this.A04.A9I(str, extraData);
        Kc.A00(new N6(this, extraData, str, str2), new N7(this, str, extraData), ActivityUtils.A00());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void A06(String str, String str2, Map<String, String> map) {
        String A01 = A01(0, 22, 52);
        try {
            AbstractC00130f A012 = C00140g.A01(this.A03, this.A04, str, KM.A00(str2), new N2(map).A03(this.A07).A02(this.A05).A05(), this.A01, this.A02);
            if (A012 != null) {
                A012.A0C();
            }
            if (this.A00 != null) {
                this.A00.AAL();
            }
            this.A06.A3s(this.A08);
        } catch (ActivityNotFoundException e) {
            Log.e(A01, A01(44, 20, 100) + str2, e);
        } catch (Exception e2) {
            Log.e(A01, A01(22, 22, 95), e2);
        }
    }

    public final void A07(N8 n8) {
        this.A00 = n8;
    }

    public final void A08(String str, String str2, Map<String, String> extraData) {
        new C0444Ib(str, this.A04).A02(EnumC0443Ia.A0J, null);
        if (this.A05.A09(this.A03)) {
            this.A04.A8q(str, extraData);
        } else if (ID.A16(this.A03)) {
            A05(str, str2, extraData);
        } else {
            A06(str, str2, extraData);
        }
    }

    public final void A09(boolean z) {
        this.A02 = z;
    }

    public final void A0A(boolean z) {
        this.A01 = z;
    }
}
