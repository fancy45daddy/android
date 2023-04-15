package com.facebook.ads.redexgen.X;
/* renamed from: com.facebook.ads.redexgen.X.Dg  reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public class RunnableC0325Dg implements Runnable {
    public final /* synthetic */ RunnableC0328Dj A00;

    public RunnableC0325Dg(RunnableC0328Dj runnableC0328Dj) {
        this.A00 = runnableC0328Dj;
    }

    @Override // java.lang.Runnable
    public final void run() {
        if (C0480Jm.A02(this)) {
            return;
        }
        try {
            this.A00.A0F(5, 3);
        } catch (Throwable th) {
            C0480Jm.A00(th, this);
        }
    }
}
