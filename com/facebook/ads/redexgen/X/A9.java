package com.facebook.ads.redexgen.X;
/* loaded from: assets/audience_network.dex */
public class A9 implements Runnable {
    public final /* synthetic */ long A00;
    public final /* synthetic */ long A01;
    public final /* synthetic */ AE A02;
    public final /* synthetic */ String A03;

    public A9(AE ae, String str, long j, long j2) {
        this.A02 = ae;
        this.A03 = str;
        this.A01 = j;
        this.A00 = j2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        AF af;
        if (C0480Jm.A02(this)) {
            return;
        }
        try {
            af = this.A02.A01;
            af.A9y(this.A03, this.A01, this.A00);
        } catch (Throwable th) {
            C0480Jm.A00(th, this);
        }
    }
}
