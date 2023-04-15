package com.facebook.ads.redexgen.X;
/* renamed from: com.facebook.ads.redexgen.X.Yf  reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public abstract class AbstractC0852Yf implements AnonymousClass68 {
    public final boolean A00;

    public abstract void A00();

    public abstract void A01(boolean z);

    public AbstractC0852Yf(boolean z) {
        this.A00 = z;
    }

    @Override // com.facebook.ads.redexgen.X.AnonymousClass68
    public final void AAB() {
        if (this.A00) {
            A00();
        } else {
            A01(false);
        }
    }

    @Override // com.facebook.ads.redexgen.X.AnonymousClass68
    public final void AAI() {
        A01(true);
    }
}
