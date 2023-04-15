package com.facebook.ads.redexgen.X;
/* loaded from: assets/audience_network.dex */
public class AD implements Runnable {
    public final /* synthetic */ int A00;
    public final /* synthetic */ AE A01;

    public AD(AE ae, int i) {
        this.A01 = ae;
        this.A00 = i;
    }

    @Override // java.lang.Runnable
    public final void run() {
        AF af;
        if (C0480Jm.A02(this)) {
            return;
        }
        try {
            af = this.A01.A01;
            af.AA2(this.A00);
        } catch (Throwable th) {
            C0480Jm.A00(th, this);
        }
    }
}
