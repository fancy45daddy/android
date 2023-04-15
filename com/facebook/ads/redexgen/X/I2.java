package com.facebook.ads.redexgen.X;
/* loaded from: assets/audience_network.dex */
public class I2 implements Runnable {
    public final /* synthetic */ long A00;
    public final /* synthetic */ long A01;
    public final /* synthetic */ I8 A02;
    public final /* synthetic */ String A03;

    public I2(I8 i8, String str, long j, long j2) {
        this.A02 = i8;
        this.A03 = str;
        this.A01 = j;
        this.A00 = j2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        I9 i9;
        if (C0480Jm.A02(this)) {
            return;
        }
        try {
            i9 = this.A02.A01;
            i9.ACa(this.A03, this.A01, this.A00);
        } catch (Throwable th) {
            C0480Jm.A00(th, this);
        }
    }
}
