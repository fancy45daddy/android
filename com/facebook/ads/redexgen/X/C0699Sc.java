package com.facebook.ads.redexgen.X;
/* renamed from: com.facebook.ads.redexgen.X.Sc  reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public class C0699Sc implements InterfaceC0511Ku {
    public int A00;
    public final InterfaceC0511Ku A01;
    public final InterfaceC0511Ku A02;

    public C0699Sc(InterfaceC0511Ku interfaceC0511Ku, int i, InterfaceC0511Ku interfaceC0511Ku2) {
        this.A01 = interfaceC0511Ku;
        this.A00 = i;
        this.A02 = interfaceC0511Ku2;
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC0511Ku
    public final void ADD(String str) {
        if (this.A00 > 0) {
            this.A01.ADD(str);
            this.A01.flush();
            this.A00--;
            return;
        }
        this.A02.ADD(str);
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC0511Ku
    public final void flush() {
        this.A02.flush();
    }
}
