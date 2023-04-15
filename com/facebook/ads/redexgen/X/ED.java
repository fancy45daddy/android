package com.facebook.ads.redexgen.X;

import android.view.View;
import androidx.annotation.Nullable;
/* loaded from: assets/audience_network.dex */
public final class ED extends AbstractC0848Yb {
    @Nullable
    public View A00;
    public DY A01;

    public ED(DY dy, C00481p c00481p) {
        super(dy, c00481p);
        this.A01 = dy;
    }

    @Override // com.facebook.ads.redexgen.X.AbstractC0848Yb
    public final void A0J() {
        if (this.A00 != null) {
            this.A01.A0D().A3n();
            this.A06.A0E(this.A00);
            return;
        }
        this.A01.A0D().A3o();
    }

    @Override // com.facebook.ads.redexgen.X.AbstractC0848Yb
    public final void A0L(InterfaceC00200n interfaceC00200n, AnonymousClass83 anonymousClass83, AnonymousClass81 anonymousClass81, C00491q c00491q) {
        this.A01.A0D().A3h();
        ZC zc = (ZC) interfaceC00200n;
        C0851Ye c0851Ye = new C0851Ye(this, c00491q, zc);
        A0C().postDelayed(c0851Ye, anonymousClass83.A05().A05());
        zc.A0I(this.A01, this.A08, this.A07.A07, new C0850Yd(this, c0851Ye), c00491q);
    }

    @Override // com.facebook.ads.redexgen.X.AbstractC0848Yb
    public final void A0O(String str) {
        this.A01.A0D().A3m(str != null);
        super.A0O(str);
    }

    @Override // com.facebook.ads.redexgen.X.AbstractC0848Yb
    public final void A0R(boolean z) {
        super.A0R(z);
        this.A00 = null;
    }
}
