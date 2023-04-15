package com.facebook.ads.redexgen.X;

import java.util.Comparator;
import java.util.TreeSet;
/* loaded from: assets/audience_network.dex */
public final class A5 implements TZ, Comparator<C0413Gu> {
    public static String[] A03 = {"qrCZDebBZXOMsu5PI8FdamZv", "usPTrKdLrE7MLvxS6mJMRwkls4hZpcPz", "BDrpv9J1bckqz2zbQbGMwvdv", "cHdTuf55w1r5Lcr9n47avjSAGBdp9rLc", "v1mI", "NFtkBlX9Mz", "lz", "jBDMosIM65rjrOuIbY8WA7ZUxyDm84U3"};
    public long A00;
    public final long A01;
    public final TreeSet<C0413Gu> A02 = new TreeSet<>(this);

    public A5(long j) {
        this.A01 = j;
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Override // java.util.Comparator
    /* renamed from: A00 */
    public final int compare(C0413Gu c0413Gu, C0413Gu c0413Gu2) {
        if (c0413Gu.A00 - c0413Gu2.A00 == 0) {
            return c0413Gu.compareTo(c0413Gu2);
        }
        return c0413Gu.A00 < c0413Gu2.A00 ? -1 : 1;
    }

    private void A01(InterfaceC0409Gq interfaceC0409Gq, long j) {
        while (this.A00 + j > this.A01) {
            boolean isEmpty = this.A02.isEmpty();
            if (A03[4].length() == 25) {
                throw new RuntimeException();
            }
            String[] strArr = A03;
            strArr[0] = "3qXh8T5e4LOlD1IWJEc6SNWF";
            strArr[2] = "YJzC3pPkQPrTmiUzc4g95RWz";
            if (!isEmpty) {
                try {
                    interfaceC0409Gq.ADq(this.A02.first());
                } catch (C0407Go unused) {
                }
            } else {
                return;
            }
        }
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC0408Gp
    public final void ACH(InterfaceC0409Gq interfaceC0409Gq, C0413Gu c0413Gu) {
        this.A02.add(c0413Gu);
        this.A00 += c0413Gu.A01;
        A01(interfaceC0409Gq, 0L);
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC0408Gp
    public final void ACI(InterfaceC0409Gq interfaceC0409Gq, C0413Gu c0413Gu) {
        this.A02.remove(c0413Gu);
        this.A00 -= c0413Gu.A01;
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC0408Gp
    public final void ACJ(InterfaceC0409Gq interfaceC0409Gq, C0413Gu c0413Gu, C0413Gu c0413Gu2) {
        ACI(interfaceC0409Gq, c0413Gu);
        ACH(interfaceC0409Gq, c0413Gu2);
    }

    @Override // com.facebook.ads.redexgen.X.TZ
    public final void ACK(InterfaceC0409Gq interfaceC0409Gq, String str, long j, long j2) {
        A01(interfaceC0409Gq, j2);
    }
}
