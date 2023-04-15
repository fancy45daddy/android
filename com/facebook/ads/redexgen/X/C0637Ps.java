package com.facebook.ads.redexgen.X;

import java.util.Set;
/* renamed from: com.facebook.ads.redexgen.X.Ps  reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public class C0637Ps {
    public C0641Pw A00;
    public Set<String> A01;
    public Set<String> A02;
    public boolean A03;
    public boolean A04 = true;

    public final C0637Ps A00(C0641Pw c0641Pw) {
        this.A00 = c0641Pw;
        return this;
    }

    public final C0637Ps A01(Set<String> pinnedCertificates) {
        this.A01 = pinnedCertificates;
        return this;
    }

    public final C0637Ps A02(Set<String> pinnedPublicKeys) {
        this.A02 = pinnedPublicKeys;
        return this;
    }

    public final C0637Ps A03(boolean z) {
        this.A04 = z;
        return this;
    }

    public final C0637Ps A04(boolean z) {
        this.A03 = z;
        return this;
    }

    public final C0638Pt A05() {
        return new C0638Pt(this.A00, this.A04, this.A02, this.A01, this.A03);
    }
}
