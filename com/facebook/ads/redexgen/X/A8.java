package com.facebook.ads.redexgen.X;
/* loaded from: assets/audience_network.dex */
public class A8 implements Runnable {
    public final /* synthetic */ AE A00;
    public final /* synthetic */ C0261Ai A01;

    public A8(AE ae, C0261Ai c0261Ai) {
        this.A00 = ae;
        this.A01 = c0261Ai;
    }

    @Override // java.lang.Runnable
    public final void run() {
        AF af;
        if (C0480Jm.A02(this)) {
            return;
        }
        try {
            af = this.A00.A01;
            af.AA0(this.A01);
        } catch (Throwable th) {
            C0480Jm.A00(th, this);
        }
    }
}
