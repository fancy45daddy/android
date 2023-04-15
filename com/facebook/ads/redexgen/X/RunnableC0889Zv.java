package com.facebook.ads.redexgen.X;

import android.os.Handler;
/* renamed from: com.facebook.ads.redexgen.X.Zv  reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public class RunnableC0889Zv implements Runnable {
    public final /* synthetic */ int A00;
    public final /* synthetic */ C0888Zu A01;

    public RunnableC0889Zv(C0888Zu c0888Zu, int i) {
        this.A01 = c0888Zu;
        this.A00 = i;
    }

    @Override // java.lang.Runnable
    public final void run() {
        boolean z;
        InterfaceC0667Qw interfaceC0667Qw;
        Handler handler;
        Runnable runnable;
        if (C0480Jm.A02(this)) {
            return;
        }
        try {
            z = this.A01.A01;
            if (z) {
                C0888Zu c0888Zu = this.A01;
                interfaceC0667Qw = this.A01.A05;
                c0888Zu.A06(interfaceC0667Qw.A9d());
                handler = this.A01.A04;
                runnable = this.A01.A09;
                handler.postDelayed(runnable, this.A00);
            }
        } catch (Throwable th) {
            C0480Jm.A00(th, this);
        }
    }
}
