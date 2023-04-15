package com.facebook.ads.redexgen.X;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
/* loaded from: assets/audience_network.dex */
public class FB implements InterfaceC0901a7 {
    public final List<InterfaceC0902a8> A00 = new ArrayList();

    @Override // com.facebook.ads.redexgen.X.InterfaceC0901a7
    public final InterfaceC0902a8 A5W(int i) {
        return this.A00.get(i);
    }

    @Override // java.lang.Iterable
    public final Iterator<InterfaceC0902a8> iterator() {
        return this.A00.iterator();
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC0901a7
    public final int size() {
        return this.A00.size();
    }
}
