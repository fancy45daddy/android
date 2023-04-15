package com.facebook.ads.redexgen.X;
/* loaded from: assets/audience_network.dex */
public class OI extends C8O<C6v> {
    public final /* synthetic */ C01756y A00;

    public OI(C01756y c01756y) {
        this.A00 = c01756y;
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Override // com.facebook.ads.redexgen.X.C8O
    /* renamed from: A00 */
    public final void A03(C6v c6v) {
        int A00 = c6v.A00();
        int duration = c6v.A01();
        int currentPosition = this.A00.A00;
        if (currentPosition > 0 && A00 == duration) {
            int currentPosition2 = this.A00.A00;
            if (duration > currentPosition2) {
                return;
            }
        }
        int currentPosition3 = A00 + 500;
        if (duration < currentPosition3) {
            if (duration == 0) {
                C01756y c01756y = this.A00;
                int currentPosition4 = c01756y.A00;
                c01756y.A0d(currentPosition4);
                return;
            }
            this.A00.A0d(duration);
            return;
        }
        this.A00.A0d(A00);
    }

    @Override // com.facebook.ads.redexgen.X.C8O
    public final Class<C6v> A01() {
        return C6v.class;
    }
}
