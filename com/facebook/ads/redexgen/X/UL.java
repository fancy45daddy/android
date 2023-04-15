package com.facebook.ads.redexgen.X;

import android.net.Uri;
import java.io.IOException;
/* loaded from: assets/audience_network.dex */
public final class UL implements InterfaceC0397Ge {
    public static String[] A0C = {"nBGgOhUJr5w54zk2FcSY", "YYZuUd", "gwBohD1o6c6DfEcFdJm47xfjaEoVukk3", "3TNnSL", "hJWvKqQqk09hkKqv49F3L8Ilz7Jhye22", "G8FOHrMAxxSNQBngbaVWxtAhYQnldn5N", "v6FRbmkBAKb4FwdIpHjrHHJWg4k1tULi", "7hirQzfzNIRD79h7knAyc8"};
    public long A00;
    public long A02;
    public GU A03;
    public final Uri A05;
    public final EG A07;
    public final GQ A08;
    public final HC A09;
    public volatile boolean A0A;
    public final /* synthetic */ B6 A0B;
    public final BV A06 = new BV();
    public boolean A04 = true;
    public long A01 = -1;

    public UL(B6 b6, Uri uri, GQ gq, EG eg, HC hc) {
        this.A0B = b6;
        this.A05 = (Uri) H6.A01(uri);
        this.A08 = (GQ) H6.A01(gq);
        this.A07 = (EG) H6.A01(eg);
        this.A09 = hc;
    }

    public final void A04(long j, long j2) {
        this.A06.A00 = j;
        this.A02 = j2;
        this.A04 = true;
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC0397Ge
    public final void A3y() {
        this.A0A = true;
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC0397Ge
    public final void A8j() throws IOException, InterruptedException {
        int i = 0;
        while (i == 0) {
            boolean z = this.A0A;
            if (A0C[0].length() == 9) {
                throw new RuntimeException();
            }
            String[] strArr = A0C;
            strArr[3] = "6lKOSY";
            strArr[1] = "aO7eUD";
            if (!z) {
                BP bp = null;
                try {
                    long j = this.A06.A00;
                    this.A03 = new GU(this.A05, j, -1L, B6.A08(this.A0B));
                    this.A01 = this.A08.ACq(this.A03);
                    if (this.A01 != -1) {
                        this.A01 += j;
                    }
                    C0776Vf c0776Vf = new C0776Vf(this.A08, j, this.A01);
                    BO extractor = this.A07.A02(c0776Vf, this.A08.A7i());
                    if (this.A04) {
                        extractor.AED(j, this.A02);
                        this.A04 = false;
                    }
                    while (i == 0 && !this.A0A) {
                        this.A09.A00();
                        i = extractor.ADQ(c0776Vf, this.A06);
                        int result = (c0776Vf.A7D() > (B6.A03(this.A0B) + j) ? 1 : (c0776Vf.A7D() == (B6.A03(this.A0B) + j) ? 0 : -1));
                        if (result > 0) {
                            j = c0776Vf.A7D();
                            this.A09.A01();
                            B6.A04(this.A0B).post(B6.A06(this.A0B));
                        }
                    }
                    if (i == 1) {
                        i = 0;
                    } else {
                        this.A06.A00 = c0776Vf.A7D();
                        this.A00 = this.A06.A00 - this.A03.A01;
                    }
                    C0430Hl.A0W(this.A08);
                } catch (Throwable th) {
                    if (i != 1 && 0 != 0) {
                        this.A06.A00 = bp.A7D();
                        this.A00 = this.A06.A00 - this.A03.A01;
                    }
                    C0430Hl.A0W(this.A08);
                    throw th;
                }
            } else {
                return;
            }
        }
    }
}
