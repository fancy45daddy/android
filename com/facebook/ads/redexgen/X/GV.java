package com.facebook.ads.redexgen.X;
/* loaded from: assets/audience_network.dex */
public class GV implements Runnable {
    public final /* synthetic */ int A00;
    public final /* synthetic */ long A01;
    public final /* synthetic */ long A02;
    public final /* synthetic */ C0741Tt A03;

    public GV(C0741Tt c0741Tt, int i, long j, long j2) {
        this.A03 = c0741Tt;
        this.A00 = i;
        this.A02 = j;
        this.A01 = j2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        GK gk;
        if (C0480Jm.A02(this)) {
            return;
        }
        try {
            gk = this.A03.A07;
            gk.AA5(this.A00, this.A02, this.A01);
        } catch (Throwable th) {
            C0480Jm.A00(th, this);
        }
    }
}
