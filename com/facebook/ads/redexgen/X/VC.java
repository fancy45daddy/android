package com.facebook.ads.redexgen.X;
/* loaded from: assets/audience_network.dex */
public class VC implements BX {
    public final /* synthetic */ VB A00;

    public VC(VB vb) {
        this.A00 = vb;
    }

    @Override // com.facebook.ads.redexgen.X.BX
    public final long A6Q() {
        CK ck;
        long j;
        ck = this.A00.A0B;
        j = this.A00.A07;
        return ck.A03(j);
    }

    @Override // com.facebook.ads.redexgen.X.BX
    public final BW A7M(long granule) {
        CK ck;
        long j;
        long A00;
        long j2;
        if (granule == 0) {
            j2 = this.A00.A09;
            return new BW(new BY(0L, j2));
        }
        ck = this.A00.A0B;
        long A04 = ck.A04(granule);
        VB vb = this.A00;
        j = vb.A09;
        A00 = vb.A00(j, A04, 30000L);
        return new BW(new BY(granule, A00));
    }

    @Override // com.facebook.ads.redexgen.X.BX
    public final boolean A8d() {
        return true;
    }
}
