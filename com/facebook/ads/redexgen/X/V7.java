package com.facebook.ads.redexgen.X;

import a.a.j;
import java.io.IOException;
import java.util.Arrays;
/* loaded from: assets/audience_network.dex */
public final class V7 implements BO {
    public static byte[] A03;
    public static final BR A04;
    public BQ A00;
    public CK A01;
    public boolean A02;

    public static String A01(int i, int i2, int i3) {
        byte[] copyOfRange = Arrays.copyOfRange(A03, i, i + i2);
        for (int i4 = 0; i4 < copyOfRange.length; i4++) {
            copyOfRange[i4] = (byte) ((copyOfRange[i4] ^ i3) ^ j.AppCompatTheme_windowFixedHeightMajor);
        }
        return new String(copyOfRange);
    }

    public static void A02() {
        A03 = new byte[]{95, 120, 112, 117, 124, 125, 57, 109, 118, 57, 125, 124, 109, 124, 107, 116, 112, 119, 124, 57, 123, 112, 109, 106, 109, 107, 124, 120, 116, 57, 109, 96, 105, 124};
    }

    static {
        A02();
        A04 = new V8();
    }

    public static HV A00(HV hv) {
        hv.A0Y(0);
        return hv;
    }

    private boolean A03(BP bp) throws IOException, InterruptedException {
        CG cg = new CG();
        if (cg.A03(bp, true) && (cg.A04 & 2) == 2) {
            int length = Math.min(cg.A00, 8);
            HV hv = new HV(length);
            bp.AD0(hv.A00, 0, length);
            if (V9.A04(A00(hv))) {
                this.A01 = new V9();
            } else if (V4.A06(A00(hv))) {
                this.A01 = new V4();
            } else if (!V6.A04(A00(hv))) {
                return false;
            } else {
                this.A01 = new V6();
            }
            return true;
        }
        return false;
    }

    @Override // com.facebook.ads.redexgen.X.BO
    public final void A8G(BQ bq) {
        this.A00 = bq;
    }

    @Override // com.facebook.ads.redexgen.X.BO
    public final int ADQ(BP bp, BV bv) throws IOException, InterruptedException {
        if (this.A01 == null) {
            if (A03(bp)) {
                bp.AE3();
            } else {
                throw new C9R(A01(0, 34, j.AppCompatTheme_toolbarStyle));
            }
        }
        if (!this.A02) {
            InterfaceC0279Ba AF2 = this.A00.AF2(0, 1);
            this.A00.A5C();
            this.A01.A06(this.A00, AF2);
            this.A02 = true;
        }
        return this.A01.A02(bp, bv);
    }

    @Override // com.facebook.ads.redexgen.X.BO
    public final void AED(long j, long j2) {
        CK ck = this.A01;
        if (ck != null) {
            ck.A05(j, j2);
        }
    }

    @Override // com.facebook.ads.redexgen.X.BO
    public final boolean AEm(BP bp) throws IOException, InterruptedException {
        try {
            return A03(bp);
        } catch (C9R unused) {
            return false;
        }
    }
}
