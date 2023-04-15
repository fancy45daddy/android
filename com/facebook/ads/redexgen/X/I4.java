package com.facebook.ads.redexgen.X;
/* loaded from: assets/audience_network.dex */
public class I4 implements Runnable {
    public final /* synthetic */ int A00;
    public final /* synthetic */ long A01;
    public final /* synthetic */ I8 A02;

    public I4(I8 i8, int i, long j) {
        this.A02 = i8;
        this.A00 = i;
        this.A01 = j;
    }

    @Override // java.lang.Runnable
    public final void run() {
        I9 i9;
        if (C0480Jm.A02(this)) {
            return;
        }
        try {
            i9 = this.A02.A01;
            i9.AAY(this.A00, this.A01);
        } catch (Throwable th) {
            C0480Jm.A00(th, this);
        }
    }
}
