package com.facebook.ads.redexgen.X;
/* renamed from: com.facebook.ads.redexgen.X.Og  reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public class C0599Og extends C8O<C01726r> {
    public final /* synthetic */ C01756y A00;

    public C0599Og(C01756y c01756y) {
        this.A00 = c01756y;
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Override // com.facebook.ads.redexgen.X.C8O
    /* renamed from: A00 */
    public final void A03(C01726r c01726r) {
        P1 p1;
        P1 p12;
        int A00 = c01726r.A00();
        int currentPositionMS = this.A00.A00;
        if (currentPositionMS > 0) {
            p1 = this.A00.A0B;
            int currentPositionMS2 = p1.getDuration();
            if (A00 == currentPositionMS2) {
                p12 = this.A00.A0B;
                int duration = p12.getDuration();
                int currentPositionMS3 = this.A00.A00;
                if (duration > currentPositionMS3) {
                    return;
                }
            }
        }
        this.A00.A0e(A00);
    }

    @Override // com.facebook.ads.redexgen.X.C8O
    public final Class<C01726r> A01() {
        return C01726r.class;
    }
}
