package com.facebook.ads.redexgen.X;
/* loaded from: assets/audience_network.dex */
public final class VI implements InterfaceC0285Br {
    public int A00;
    public int A01;
    public final int A02;
    public final int A03;
    public final HV A04;

    public VI(VK vk) {
        this.A04 = vk.A00;
        this.A04.A0Y(12);
        this.A02 = this.A04.A0H() & 255;
        this.A03 = this.A04.A0H();
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC0285Br
    public final int A7H() {
        return this.A03;
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC0285Br
    public final boolean A8R() {
        return false;
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC0285Br
    public final int ADW() {
        int i = this.A02;
        if (i == 8) {
            return this.A04.A0E();
        }
        if (i == 16) {
            return this.A04.A0I();
        }
        int i2 = this.A01;
        this.A01 = i2 + 1;
        if (i2 % 2 == 0) {
            this.A00 = this.A04.A0E();
            return (this.A00 & 240) >> 4;
        }
        return this.A00 & 15;
    }
}
