package com.facebook.ads.redexgen.X;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
/* renamed from: com.facebook.ads.redexgen.X.Xg  reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public class C0829Xg implements InterfaceC01264s {
    public final /* synthetic */ C0339Dw A00;

    public C0829Xg(C0339Dw c0339Dw) {
        this.A00 = c0339Dw;
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC01264s
    public final void ADE(AbstractC01194l abstractC01194l, C4O c4o, C4O c4o2) {
        this.A00.A1n(abstractC01194l, c4o, c4o2);
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC01264s
    public final void ADG(AbstractC01194l abstractC01194l, @NonNull C4O c4o, @Nullable C4O c4o2) {
        this.A00.A0r.A0c(abstractC01194l);
        this.A00.A1o(abstractC01194l, c4o, c4o2);
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC01264s
    public final void ADI(AbstractC01194l abstractC01194l, @NonNull C4O c4o, @NonNull C4O c4o2) {
        abstractC01194l.A0Z(false);
        if (this.A00.A0C) {
            if (this.A00.A05.A0H(abstractC01194l, abstractC01194l, c4o, c4o2)) {
                this.A00.A1N();
            }
        } else if (!this.A00.A05.A0G(abstractC01194l, c4o, c4o2)) {
        } else {
            this.A00.A1N();
        }
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC01264s
    public final void AF8(AbstractC01194l abstractC01194l) {
        this.A00.A06.A1D(abstractC01194l.A0H, this.A00.A0r);
    }
}
