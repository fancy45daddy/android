package com.facebook.ads.redexgen.X;
/* renamed from: com.facebook.ads.redexgen.X.2N  reason: invalid class name */
/* loaded from: assets/audience_network.dex */
public final class C2N extends AM {
    public final int A00;
    public final int A01;
    public final InterfaceC0405Gm<? super GQ> A02;
    public final String A03;
    public final boolean A04;

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.Gm != com.facebook.ads.internal.exoplayer2.upstream.TransferListener<? super com.facebook.ads.internal.exoplayer2.upstream.DataSource> */
    public C2N(String str, InterfaceC0405Gm<? super GQ> interfaceC0405Gm) {
        this(str, interfaceC0405Gm, 8000, 8000, false);
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.Gm != com.facebook.ads.internal.exoplayer2.upstream.TransferListener<? super com.facebook.ads.internal.exoplayer2.upstream.DataSource> */
    public C2N(String str, InterfaceC0405Gm<? super GQ> interfaceC0405Gm, int i, int i2, boolean z) {
        this.A03 = str;
        this.A02 = interfaceC0405Gm;
        this.A00 = i;
        this.A01 = i2;
        this.A04 = z;
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Override // com.facebook.ads.redexgen.X.AM
    /* renamed from: A00 */
    public final AP A01(C0394Gb c0394Gb) {
        return new AP(this.A03, null, this.A02, this.A00, this.A01, this.A04, c0394Gb);
    }
}
