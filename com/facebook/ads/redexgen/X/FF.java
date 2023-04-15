package com.facebook.ads.redexgen.X;

import java.util.concurrent.CountDownLatch;
import java.util.concurrent.atomic.AtomicReference;
/* loaded from: assets/audience_network.dex */
public class FF implements InterfaceC0634Pp {
    public final /* synthetic */ C00923j A00;
    public final /* synthetic */ CountDownLatch A01;
    public final /* synthetic */ AtomicReference A02;
    public final /* synthetic */ AtomicReference A03;

    public FF(C00923j c00923j, AtomicReference atomicReference, AtomicReference atomicReference2, CountDownLatch countDownLatch) {
        this.A00 = c00923j;
        this.A03 = atomicReference;
        this.A02 = atomicReference2;
        this.A01 = countDownLatch;
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC0634Pp
    public final void AAG(InterfaceC0632Pn interfaceC0632Pn) {
        C00923j.A06(interfaceC0632Pn.A5n(), this.A03, this.A02);
        this.A01.countDown();
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC0634Pp
    public final void AAd(Exception exc) {
        this.A02.set(exc);
        this.A01.countDown();
    }
}
