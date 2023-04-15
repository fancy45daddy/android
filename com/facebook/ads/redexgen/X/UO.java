package com.facebook.ads.redexgen.X;

import android.os.Handler;
import androidx.annotation.Nullable;
import java.util.ArrayList;
import java.util.Iterator;
/* loaded from: assets/audience_network.dex */
public abstract class UO implements EM {
    public W2 A00;
    public AbstractC02409n A01;
    public Object A02;
    public final ArrayList<EL> A04 = new ArrayList<>(1);
    public final EX A03 = new EX();

    public abstract void A02();

    public abstract void A03(W2 w2, boolean z);

    public final EX A00(@Nullable EK ek) {
        return this.A03.A02(0, ek, 0L);
    }

    public final void A01(AbstractC02409n abstractC02409n, @Nullable Object obj) {
        this.A01 = abstractC02409n;
        this.A02 = obj;
        Iterator<EL> it = this.A04.iterator();
        while (it.hasNext()) {
            it.next().ACG(this, abstractC02409n, obj);
        }
    }

    @Override // com.facebook.ads.redexgen.X.EM
    public final void A3C(Handler handler, InterfaceC0343Ea interfaceC0343Ea) {
        this.A03.A07(handler, interfaceC0343Ea);
    }

    @Override // com.facebook.ads.redexgen.X.EM
    public final void ADC(W2 w2, boolean z, EL el) {
        W2 w22 = this.A00;
        H6.A03(w22 == null || w22 == w2);
        this.A04.add(el);
        if (this.A00 == null) {
            this.A00 = w2;
            A03(w2, z);
            return;
        }
        AbstractC02409n abstractC02409n = this.A01;
        if (abstractC02409n == null) {
            return;
        }
        el.ACG(this, abstractC02409n, this.A02);
    }

    @Override // com.facebook.ads.redexgen.X.EM
    public final void ADm(EL el) {
        this.A04.remove(el);
        if (this.A04.isEmpty()) {
            this.A00 = null;
            this.A01 = null;
            this.A02 = null;
            A02();
        }
    }

    @Override // com.facebook.ads.redexgen.X.EM
    public final void ADo(InterfaceC0343Ea interfaceC0343Ea) {
        this.A03.A0D(interfaceC0343Ea);
    }
}
