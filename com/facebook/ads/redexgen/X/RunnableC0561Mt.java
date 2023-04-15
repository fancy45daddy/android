package com.facebook.ads.redexgen.X;
/* renamed from: com.facebook.ads.redexgen.X.Mt  reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public class RunnableC0561Mt implements Runnable {
    public final /* synthetic */ C0562Mu A00;
    public final /* synthetic */ InterfaceC0563Mv A01;

    public RunnableC0561Mt(C0562Mu c0562Mu, InterfaceC0563Mv interfaceC0563Mv) {
        this.A00 = c0562Mu;
        this.A01 = interfaceC0563Mv;
    }

    @Override // java.lang.Runnable
    public final void run() {
        if (C0480Jm.A02(this)) {
            return;
        }
        try {
            this.A01.A9x();
        } catch (Throwable th) {
            C0480Jm.A00(th, this);
        }
    }
}
