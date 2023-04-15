package com.facebook.ads.redexgen.X;
/* loaded from: assets/audience_network.dex */
public class SY implements InterfaceC0511Ku {
    public final C0510Kt A00;
    public final InterfaceC0511Ku A01;

    public SY(InterfaceC0511Ku interfaceC0511Ku, int i, int i2) {
        this.A01 = interfaceC0511Ku;
        this.A00 = new C0510Kt(i, i2);
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC0511Ku
    public final void ADD(String str) {
        boolean A08;
        this.A00.A04(str);
        if (this.A00.A02() != null) {
            A08 = C0513Kw.A08(this.A00);
            if (A08) {
                this.A01.ADD(this.A00.A02());
            }
        }
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC0511Ku
    public final void flush() {
        boolean A08;
        this.A00.A03();
        while (this.A00.A02() != null) {
            A08 = C0513Kw.A08(this.A00);
            if (A08) {
                this.A01.ADD(this.A00.A02());
            }
            this.A00.A03();
        }
    }
}
