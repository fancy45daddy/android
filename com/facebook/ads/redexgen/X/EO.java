package com.facebook.ads.redexgen.X;
/* loaded from: assets/audience_network.dex */
public class EO implements Runnable {
    public final /* synthetic */ EX A00;
    public final /* synthetic */ InterfaceC0343Ea A01;

    public EO(EX ex, InterfaceC0343Ea interfaceC0343Ea) {
        this.A00 = ex;
        this.A01 = interfaceC0343Ea;
    }

    @Override // java.lang.Runnable
    public final void run() {
        if (C0480Jm.A02(this)) {
            return;
        }
        try {
            this.A01.ABP(this.A00.A00, this.A00.A01);
        } catch (Throwable th) {
            C0480Jm.A00(th, this);
        }
    }
}
