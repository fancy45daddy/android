package com.facebook.ads.redexgen.X;

import android.content.Context;
/* renamed from: com.facebook.ads.redexgen.X.Tr  reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public final class C0739Tr implements GP {
    public final Context A00;
    public final GP A01;
    public final InterfaceC0405Gm<? super GQ> A02;

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.Gm != com.facebook.ads.internal.exoplayer2.upstream.TransferListener<? super com.facebook.ads.internal.exoplayer2.upstream.DataSource> */
    public C0739Tr(Context context, InterfaceC0405Gm<? super GQ> interfaceC0405Gm, GP gp) {
        this.A00 = context.getApplicationContext();
        this.A02 = interfaceC0405Gm;
        this.A01 = gp;
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.Gm != com.facebook.ads.internal.exoplayer2.upstream.TransferListener<? super com.facebook.ads.internal.exoplayer2.upstream.DataSource> */
    public C0739Tr(Context context, String str, InterfaceC0405Gm<? super GQ> interfaceC0405Gm) {
        this(context, interfaceC0405Gm, new C2N(str, interfaceC0405Gm));
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Override // com.facebook.ads.redexgen.X.GP
    /* renamed from: A00 */
    public final C0740Ts A4E() {
        return new C0740Ts(this.A00, this.A02, this.A01.A4E());
    }
}
