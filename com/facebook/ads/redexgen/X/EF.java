package com.facebook.ads.redexgen.X;
/* loaded from: assets/audience_network.dex */
public class EF implements Runnable {
    public final /* synthetic */ B6 A00;

    public EF(B6 b6) {
        this.A00 = b6;
    }

    @Override // java.lang.Runnable
    public final void run() {
        boolean z;
        UI ui;
        if (C0480Jm.A02(this)) {
            return;
        }
        try {
            z = this.A00.A0G;
            if (!z) {
                ui = this.A00.A08;
                ui.AAJ(this.A00);
            }
        } catch (Throwable th) {
            C0480Jm.A00(th, this);
        }
    }
}
