package com.facebook.ads.redexgen.X;

import android.os.Handler;
import android.os.Looper;
/* renamed from: com.facebook.ads.redexgen.X.7h  reason: invalid class name and case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public class C01837h extends AbstractC0532Lp {
    public final /* synthetic */ C7C A00;

    public C01837h(C7C c7c) {
        this.A00 = c7c;
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Override // com.facebook.ads.redexgen.X.C8O
    /* renamed from: A00 */
    public final void A03(C0533Lq c0533Lq) {
        new Handler(Looper.getMainLooper()).post(new OE(this));
    }
}
