package com.facebook.ads.redexgen.X;
/* loaded from: assets/audience_network.dex */
public class SQ implements InterfaceC0554Mm {
    public final /* synthetic */ InterfaceC0519Lc A00;
    public final /* synthetic */ SO A01;

    public SQ(SO so, InterfaceC0519Lc interfaceC0519Lc) {
        this.A01 = so;
        this.A00 = interfaceC0519Lc;
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC0554Mm
    public final void ABa(String str) {
        C0547Mf c0547Mf;
        c0547Mf = this.A01.A0A;
        c0547Mf.setProgress(100);
        this.A01.A05 = false;
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC0554Mm
    public final void ABc(String str) {
        C0546Me c0546Me;
        this.A01.A05 = true;
        c0546Me = this.A01.A09;
        c0546Me.setUrl(str);
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC0554Mm
    public final void ABt(int i) {
        boolean z;
        C0547Mf c0547Mf;
        z = this.A01.A05;
        if (z) {
            c0547Mf = this.A01.A0A;
            c0547Mf.setProgress(i);
        }
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC0554Mm
    public final void ABy(String str) {
        C0546Me c0546Me;
        c0546Me = this.A01.A09;
        c0546Me.setTitle(str);
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC0554Mm
    public final void AC0() {
        this.A00.AA9(14);
    }
}
