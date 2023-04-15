package com.facebook.ads.redexgen.X;

import android.view.View;
/* renamed from: com.facebook.ads.redexgen.X.4q  reason: invalid class name and case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public final class C01244q {
    public C01214n A00 = new C01214n();
    public final InterfaceC01224o A01;

    public C01244q(InterfaceC01224o interfaceC01224o) {
        this.A01 = interfaceC01224o;
    }

    public final View A00(int i, int i2, int i3, int i4) {
        int A76 = this.A01.A76();
        int next = this.A01.A75();
        int childEnd = i2 > i ? 1 : -1;
        View view = null;
        while (i != i2) {
            View A5x = this.A01.A5x(i);
            int A60 = this.A01.A60(A5x);
            int i5 = this.A01.A5z(A5x);
            this.A00.A03(A76, next, A60, i5);
            if (i3 != 0) {
                this.A00.A01();
                this.A00.A02(i3);
                if (this.A00.A04()) {
                    return A5x;
                }
            }
            if (i4 != 0) {
                this.A00.A01();
                this.A00.A02(i4);
                if (this.A00.A04()) {
                    view = A5x;
                }
            }
            i += childEnd;
        }
        return view;
    }
}
