package com.facebook.ads.redexgen.X;
/* renamed from: com.facebook.ads.redexgen.X.Ak  reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public class C0263Ak extends Thread {
    public final /* synthetic */ AbstractC0782Vl A00;

    public C0263Ak(AbstractC0782Vl abstractC0782Vl) {
        this.A00 = abstractC0782Vl;
    }

    @Override // java.lang.Thread, java.lang.Runnable
    public final void run() {
        if (C0480Jm.A02(this)) {
            return;
        }
        try {
            this.A00.A0M();
        } catch (Throwable th) {
            C0480Jm.A00(th, this);
        }
    }
}
