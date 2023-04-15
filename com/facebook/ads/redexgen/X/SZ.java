package com.facebook.ads.redexgen.X;
/* loaded from: assets/audience_network.dex */
public class SZ implements InterfaceC0511Ku {
    public int A00;
    public final InterfaceC0511Ku A01;

    public SZ(InterfaceC0511Ku interfaceC0511Ku, int i) {
        this.A01 = interfaceC0511Ku;
        this.A00 = i;
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC0511Ku
    public final void ADD(String str) {
        if (this.A00 > 0) {
            this.A01.ADD(str);
            this.A00--;
        }
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC0511Ku
    public final void flush() {
        this.A01.flush();
    }
}
