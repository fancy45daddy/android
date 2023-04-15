package com.facebook.ads.redexgen.X;

import androidx.annotation.RequiresApi;
/* loaded from: assets/audience_network.dex */
public class RZ implements InterfaceC0554Mm {
    public final /* synthetic */ RX A00;

    public RZ(RX rx) {
        this.A00 = rx;
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC0554Mm
    public final void ABa(String str) {
        C0547Mf c0547Mf;
        C0547Mf c0547Mf2;
        this.A00.A0I = false;
        c0547Mf = this.A00.A0C;
        c0547Mf.setProgress(100);
        c0547Mf2 = this.A00.A0C;
        LE.A0N(c0547Mf2, 8);
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC0554Mm
    public final void ABc(String str) {
        C0547Mf c0547Mf;
        C0546Me c0546Me;
        this.A00.A0I = true;
        c0547Mf = this.A00.A0C;
        LE.A0N(c0547Mf, 0);
        c0546Me = this.A00.A0B;
        c0546Me.setUrl(str);
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC0554Mm
    public final void ABt(int i) {
        boolean z;
        C0547Mf c0547Mf;
        z = this.A00.A0I;
        if (z) {
            c0547Mf = this.A00.A0C;
            c0547Mf.setProgress(i);
        }
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC0554Mm
    public final void ABy(String str) {
        C0546Me c0546Me;
        c0546Me = this.A00.A0B;
        c0546Me.setTitle(str);
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC0554Mm
    @RequiresApi(api = 26)
    public final void AC0() {
        NV nv;
        nv = this.A00.A0E;
        nv.A09().AA9(14);
    }
}
