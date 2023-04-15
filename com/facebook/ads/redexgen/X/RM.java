package com.facebook.ads.redexgen.X;

import android.content.Intent;
import android.os.Bundle;
import android.widget.FrameLayout;
import android.widget.RelativeLayout;
import androidx.annotation.Nullable;
/* loaded from: assets/audience_network.dex */
public final class RM extends FrameLayout implements InterfaceC0520Ld {
    public final InterfaceC0519Lc A00;
    public final C0589Nw A01;

    public RM(C0806Wj c0806Wj, InterfaceC0519Lc interfaceC0519Lc, C0589Nw c0589Nw) {
        super(c0806Wj);
        this.A01 = c0589Nw;
        this.A00 = interfaceC0519Lc;
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC0520Ld
    public final void A8k(Intent intent, @Nullable Bundle bundle, AnonymousClass59 anonymousClass59) {
        C0589Nw.A0B().incrementAndGet();
        this.A01.A0V();
        LE.A0J(this.A01.A0O());
        addView(this.A01.A0O(), new FrameLayout.LayoutParams(-1, -1));
        this.A00.A3I(this, new RelativeLayout.LayoutParams(-1, -1));
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC0520Ld
    public final void ABd(boolean z) {
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC0520Ld
    public final void AC2(boolean z) {
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC0520Ld
    public final void AEA(Bundle bundle) {
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC0520Ld
    public final boolean onActivityResult(int i, int i2, Intent intent) {
        return false;
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC0520Ld
    public final void onDestroy() {
        this.A01.A0U();
        if (this.A01.A0N() != null) {
            this.A01.A0N().AAn();
        }
        C0589Nw.A0B().decrementAndGet();
    }

    public void setListener(InterfaceC0519Lc interfaceC0519Lc) {
    }
}
