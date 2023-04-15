package com.facebook.ads.redexgen.X;

import android.widget.ImageView;
/* loaded from: assets/audience_network.dex */
public class S0 implements InterfaceC0555Mn {
    public final /* synthetic */ C0546Me A00;

    public S0(C0546Me c0546Me) {
        this.A00 = c0546Me;
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC0555Mn
    public final void AA4(boolean z) {
        boolean z2;
        ImageView imageView;
        ImageView imageView2;
        ImageView imageView3;
        z2 = this.A00.A07;
        if (z2) {
            imageView = this.A00.A00;
            if (imageView != null) {
                imageView2 = this.A00.A00;
                imageView2.setEnabled(z);
                imageView3 = this.A00.A00;
                imageView3.setAlpha(z ? 1.0f : 0.3f);
            }
        }
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC0555Mn
    public final void AAj(boolean z) {
        boolean z2;
        ImageView imageView;
        ImageView imageView2;
        ImageView imageView3;
        z2 = this.A00.A07;
        if (z2) {
            imageView = this.A00.A02;
            if (imageView != null) {
                imageView2 = this.A00.A02;
                imageView2.setEnabled(z);
                imageView3 = this.A00.A02;
                imageView3.setAlpha(z ? 1.0f : 0.3f);
            }
        }
    }
}
