package com.facebook.ads.redexgen.X;

import java.util.ArrayList;
import java.util.Collection;
/* renamed from: com.facebook.ads.redexgen.X.Sb  reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public class C0698Sb implements InterfaceC0511Ku {
    public final Collection<String> A00;

    public C0698Sb() {
        this.A00 = new ArrayList();
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC0511Ku
    public final void ADD(String str) {
        this.A00.add(str);
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC0511Ku
    public final void flush() {
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        for (String str : this.A00) {
            sb.append(str);
            sb.append('\n');
        }
        return sb.toString();
    }
}
