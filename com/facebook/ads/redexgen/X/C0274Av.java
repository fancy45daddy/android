package com.facebook.ads.redexgen.X;

import android.os.Handler;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;
/* renamed from: com.facebook.ads.redexgen.X.Av  reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public final class C0274Av {
    public final CopyOnWriteArrayList<C0273Au> A00 = new CopyOnWriteArrayList<>();

    public final void A00() {
        Iterator<C0273Au> it = this.A00.iterator();
        while (it.hasNext()) {
            C0273Au next = it.next();
            InterfaceC0275Aw listener = next.A01;
            next.A00.post(new RunnableC0269Aq(this, listener));
        }
    }

    public final void A01() {
        Iterator<C0273Au> it = this.A00.iterator();
        while (it.hasNext()) {
            C0273Au next = it.next();
            InterfaceC0275Aw listener = next.A01;
            next.A00.post(new RunnableC0272At(this, listener));
        }
    }

    public final void A02() {
        Iterator<C0273Au> it = this.A00.iterator();
        while (it.hasNext()) {
            C0273Au next = it.next();
            InterfaceC0275Aw listener = next.A01;
            next.A00.post(new RunnableC0271As(this, listener));
        }
    }

    public final void A03(Handler handler, InterfaceC0275Aw interfaceC0275Aw) {
        H6.A03((handler == null || interfaceC0275Aw == null) ? false : true);
        this.A00.add(new C0273Au(handler, interfaceC0275Aw));
    }

    public final void A04(Exception exc) {
        Iterator<C0273Au> it = this.A00.iterator();
        while (it.hasNext()) {
            C0273Au next = it.next();
            InterfaceC0275Aw listener = next.A01;
            next.A00.post(new RunnableC0270Ar(this, listener, exc));
        }
    }
}
