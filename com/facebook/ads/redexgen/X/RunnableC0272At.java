package com.facebook.ads.redexgen.X;
/* renamed from: com.facebook.ads.redexgen.X.At  reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public class RunnableC0272At implements Runnable {
    public final /* synthetic */ C0274Av A00;
    public final /* synthetic */ InterfaceC0275Aw A01;

    public RunnableC0272At(C0274Av c0274Av, InterfaceC0275Aw interfaceC0275Aw) {
        this.A00 = c0274Av;
        this.A01 = interfaceC0275Aw;
    }

    @Override // java.lang.Runnable
    public final void run() {
        if (C0480Jm.A02(this)) {
            return;
        }
        try {
            this.A01.AAV();
        } catch (Throwable th) {
            C0480Jm.A00(th, this);
        }
    }
}