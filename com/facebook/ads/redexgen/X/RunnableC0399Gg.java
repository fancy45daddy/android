package com.facebook.ads.redexgen.X;
/* renamed from: com.facebook.ads.redexgen.X.Gg  reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public final class RunnableC0399Gg implements Runnable {
    public final InterfaceC0398Gf A00;

    public RunnableC0399Gg(InterfaceC0398Gf interfaceC0398Gf) {
        this.A00 = interfaceC0398Gf;
    }

    @Override // java.lang.Runnable
    public final void run() {
        if (C0480Jm.A02(this)) {
            return;
        }
        try {
            this.A00.ABG();
        } catch (Throwable th) {
            C0480Jm.A00(th, this);
        }
    }
}
