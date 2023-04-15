package com.facebook.ads.redexgen.X;

import androidx.annotation.Nullable;
/* renamed from: com.facebook.ads.redexgen.X.Dr  reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public final class C0336Dr {
    public final GN A00;
    public final GP A01;
    public final GP A02;
    public final InterfaceC0409Gq A03;
    public final HZ A04;

    public C0336Dr(InterfaceC0409Gq interfaceC0409Gq, GP gp) {
        this(interfaceC0409Gq, gp, null, null, null);
    }

    public C0336Dr(InterfaceC0409Gq interfaceC0409Gq, GP gp, @Nullable GP gp2, @Nullable GN gn, @Nullable HZ hz) {
        H6.A01(gp);
        this.A03 = interfaceC0409Gq;
        this.A02 = gp;
        this.A01 = gp2;
        this.A00 = gn;
        this.A04 = hz;
    }

    public final InterfaceC0409Gq A00() {
        return this.A03;
    }

    public final C0723Tb A01(boolean z) {
        GQ c0736To;
        GO c0724Tc;
        GP gp = this.A01;
        if (gp != null) {
            c0736To = gp.A4E();
        } else {
            c0736To = new C0736To();
        }
        if (z) {
            return new C0723Tb(this.A03, C0737Tp.A02, c0736To, null, 1, null);
        }
        GN gn = this.A00;
        if (gn != null) {
            c0724Tc = gn.createDataSink();
        } else {
            c0724Tc = new C0724Tc(this.A03, 2097152L);
        }
        GQ A4E = this.A02.A4E();
        HZ hz = this.A04;
        if (hz != null) {
            A4E = new C0728Tg(A4E, hz, -1000);
        }
        GQ upstream = c0736To;
        return new C0723Tb(this.A03, A4E, upstream, c0724Tc, 1, null);
    }

    public final HZ A02() {
        HZ hz = this.A04;
        return hz != null ? hz : new HZ();
    }
}
