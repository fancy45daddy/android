package com.facebook.ads.redexgen.X;
/* loaded from: assets/audience_network.dex */
public class I7 implements Runnable {
    public final /* synthetic */ C0261Ai A00;
    public final /* synthetic */ I8 A01;

    public I7(I8 i8, C0261Ai c0261Ai) {
        this.A01 = i8;
        this.A00 = c0261Ai;
    }

    @Override // java.lang.Runnable
    public final void run() {
        I9 i9;
        if (C0480Jm.A02(this)) {
            return;
        }
        try {
            this.A00.A00();
            i9 = this.A01.A01;
            i9.ACb(this.A00);
        } catch (Throwable th) {
            C0480Jm.A00(th, this);
        }
    }
}
