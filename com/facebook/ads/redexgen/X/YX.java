package com.facebook.ads.redexgen.X;

import a.a.j;
import java.util.Arrays;
import java.util.Map;
/* loaded from: assets/audience_network.dex */
public class YX implements AnonymousClass12 {
    public static byte[] A07;
    public static String[] A08 = {"NdU3dTBV9vpPy6YybD2Qky8Xp9oiymUK", "iGXlqhzjj4re98AW13mRmUxQt0ip7heY", "i4JUsV98mtHDxTx4GI", "uX4rqc35PVKyGMlab4Ievks4AeXTKuCR", "rLO13ppjW7wMy", "YX8F9O1K3gbo5OniWABn3Un2bmHHQded", "vQnjhTu4uDmsPPd6tCmWM2PRV3nZ7tVA", "6doRqStA7fW6oocsKlayDSgQ6jqa5ScM"};
    public final /* synthetic */ long A03;
    public final /* synthetic */ EB A04;
    public final /* synthetic */ AnonymousClass81 A05;
    public final /* synthetic */ Runnable A06;
    public boolean A02 = false;
    public boolean A01 = false;
    public boolean A00 = false;

    public static String A00(int i, int i2, int i3) {
        byte[] copyOfRange = Arrays.copyOfRange(A07, i, i + i2);
        for (int i4 = 0; i4 < copyOfRange.length; i4++) {
            copyOfRange[i4] = (byte) ((copyOfRange[i4] ^ i3) ^ j.AppCompatTheme_textAppearanceSearchResultTitle);
        }
        return new String(copyOfRange);
    }

    public static void A01() {
        A07 = new byte[]{57, 46, 46, 51, 46, 67, 93, 73};
    }

    static {
        A01();
    }

    public YX(EB eb, Runnable runnable, long j, AnonymousClass81 anonymousClass81) {
        this.A04 = eb;
        this.A06 = runnable;
        this.A03 = j;
        this.A05 = anonymousClass81;
    }

    @Override // com.facebook.ads.redexgen.X.AnonymousClass12
    public final void ABU(Z9 z9) {
        if (!this.A00) {
            this.A00 = true;
            this.A04.A05(this.A05.A03(AnonymousClass85.A03), null);
        }
        if (this.A04.A06 != null) {
            this.A04.A06.A0C();
        }
    }

    @Override // com.facebook.ads.redexgen.X.AnonymousClass12
    public final void ABV(Z9 z9) {
        Map A01;
        if (z9 != this.A04.A00) {
            return;
        }
        this.A04.A0C().removeCallbacks(this.A06);
        EB eb = this.A04;
        eb.A01 = z9;
        eb.A06.A0F(z9);
        if (!this.A02) {
            this.A02 = true;
            A01 = this.A04.A01(this.A03);
            this.A04.A05(this.A05.A03(AnonymousClass85.A05), A01);
        }
    }

    @Override // com.facebook.ads.redexgen.X.AnonymousClass12
    public final void ABW(Z9 z9) {
        if (!this.A01) {
            this.A01 = true;
            EB eb = this.A04;
            AnonymousClass81 anonymousClass81 = this.A05;
            AnonymousClass85 anonymousClass85 = AnonymousClass85.A04;
            String[] strArr = A08;
            if (strArr[3].charAt(16) != strArr[0].charAt(16)) {
                throw new RuntimeException();
            }
            String[] strArr2 = A08;
            strArr2[3] = "w5hMaJohNUScvyTMb6YchiksjKW7iU2S";
            strArr2[0] = "lwejxTPFHVjkcDrib15s3w6szJ9sWeR6";
            eb.A05(anonymousClass81.A03(anonymousClass85), null);
        }
        this.A04.A0I();
    }

    @Override // com.facebook.ads.redexgen.X.AnonymousClass12
    public final void ABY(Z9 z9, J3 j3) {
        Map A01;
        if (z9 != this.A04.A00) {
            return;
        }
        this.A04.A0C().removeCallbacks(this.A06);
        this.A04.A0K(z9);
        if (!this.A02) {
            this.A02 = true;
            A01 = this.A04.A01(this.A03);
            A01.put(A00(0, 5, 58), String.valueOf(j3.A03().getErrorCode()));
            A01.put(A00(5, 3, 72), String.valueOf(j3.A04()));
            this.A04.A05(this.A05.A03(AnonymousClass85.A05), A01);
        }
        this.A04.AAc(j3);
    }
}
