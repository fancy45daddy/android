package com.facebook.ads.redexgen.X;
/* loaded from: assets/audience_network.dex */
public class ER implements Runnable {
    public final /* synthetic */ EX A00;
    public final /* synthetic */ EY A01;
    public final /* synthetic */ EZ A02;
    public final /* synthetic */ InterfaceC0343Ea A03;

    public ER(EX ex, InterfaceC0343Ea interfaceC0343Ea, EY ey, EZ ez) {
        this.A00 = ex;
        this.A03 = interfaceC0343Ea;
        this.A01 = ey;
        this.A02 = ez;
    }

    @Override // java.lang.Runnable
    public final void run() {
        if (C0480Jm.A02(this)) {
            return;
        }
        try {
            this.A03.AB8(this.A00.A00, this.A00.A01, this.A01, this.A02);
        } catch (Throwable th) {
            C0480Jm.A00(th, this);
        }
    }
}
