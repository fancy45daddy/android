package com.facebook.ads.redexgen.X;

import android.view.Surface;
/* loaded from: assets/audience_network.dex */
public class I6 implements Runnable {
    public final /* synthetic */ Surface A00;
    public final /* synthetic */ I8 A01;

    public I6(I8 i8, Surface surface) {
        this.A01 = i8;
        this.A00 = surface;
    }

    @Override // java.lang.Runnable
    public final void run() {
        I9 i9;
        if (C0480Jm.A02(this)) {
            return;
        }
        try {
            i9 = this.A01.A01;
            i9.AC1(this.A00);
        } catch (Throwable th) {
            C0480Jm.A00(th, this);
        }
    }
}
