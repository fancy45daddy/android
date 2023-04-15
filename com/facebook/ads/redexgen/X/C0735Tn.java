package com.facebook.ads.redexgen.X;
/* renamed from: com.facebook.ads.redexgen.X.Tn  reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public final class C0735Tn implements GP {
    public final InterfaceC0405Gm<? super C0736To> A00;

    public C0735Tn() {
        this(null);
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.Gm != com.facebook.ads.internal.exoplayer2.upstream.TransferListener<? super com.facebook.ads.internal.exoplayer2.upstream.FileDataSource> */
    public C0735Tn(InterfaceC0405Gm<? super C0736To> interfaceC0405Gm) {
        this.A00 = interfaceC0405Gm;
    }

    @Override // com.facebook.ads.redexgen.X.GP
    public final GQ A4E() {
        return new C0736To(this.A00);
    }
}
