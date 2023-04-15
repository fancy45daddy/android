package com.facebook.ads.redexgen.X;

import java.io.IOException;
/* loaded from: assets/audience_network.dex */
public final class UK implements InterfaceC0350Eh {
    public final int A00;
    public final /* synthetic */ B6 A01;

    public UK(B6 b6, int i) {
        this.A01 = b6;
        this.A00 = i;
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC0350Eh
    public final boolean A8Z() {
        return this.A01.A0S(this.A00);
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC0350Eh
    public final void A9R() throws IOException {
        this.A01.A0Q();
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC0350Eh
    public final int ADT(C9L c9l, C0784Vn c0784Vn, boolean z) {
        return this.A01.A0P(this.A00, c9l, c0784Vn, z);
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC0350Eh
    public final int AEj(long j) {
        return this.A01.A0O(this.A00, j);
    }
}
