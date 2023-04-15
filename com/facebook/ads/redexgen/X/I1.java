package com.facebook.ads.redexgen.X;
/* loaded from: assets/audience_network.dex */
public class I1 implements Runnable {
    public final /* synthetic */ C0261Ai A00;
    public final /* synthetic */ I8 A01;

    public I1(I8 i8, C0261Ai c0261Ai) {
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
            i9 = this.A01.A01;
            i9.ACc(this.A00);
        } catch (Throwable th) {
            C0480Jm.A00(th, this);
        }
    }
}
