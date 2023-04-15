package com.facebook.ads.redexgen.X;

import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
/* renamed from: com.facebook.ads.redexgen.X.Zq  reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public class C0884Zq {
    public final Map<String, C0897a3> A00;
    public final Set<C0897a3> A01;

    public C0884Zq() {
        this.A00 = new HashMap();
        this.A01 = new HashSet();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public Collection<C0897a3> A00() {
        return this.A01;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public Collection<C0897a3> A01() {
        return this.A00.values();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void A04() {
        this.A00.clear();
        for (C0897a3 c0897a3 : this.A01) {
            this.A00.put(c0897a3.A03, c0897a3);
        }
        this.A01.clear();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean A06(C0897a3 c0897a3) {
        if (this.A01.add(c0897a3)) {
            this.A00.remove(c0897a3.A03);
            return true;
        }
        return false;
    }
}
