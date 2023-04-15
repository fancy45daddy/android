package com.facebook.ads.redexgen.X;

import android.os.Handler;
import java.util.ArrayList;
import java.util.concurrent.atomic.AtomicBoolean;
/* renamed from: com.facebook.ads.redexgen.X.Wn  reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public class C0810Wn extends AbstractRunnableC0487Ju {
    public final /* synthetic */ AnonymousClass68 A00;
    public final /* synthetic */ AnonymousClass69 A01;
    public final /* synthetic */ C6G A02;
    public final /* synthetic */ ArrayList A03;
    public final /* synthetic */ ArrayList A04;

    public C0810Wn(C6G c6g, ArrayList arrayList, AnonymousClass68 anonymousClass68, AnonymousClass69 anonymousClass69, ArrayList arrayList2) {
        this.A02 = c6g;
        this.A03 = arrayList;
        this.A00 = anonymousClass68;
        this.A01 = anonymousClass69;
        this.A04 = arrayList2;
    }

    @Override // com.facebook.ads.redexgen.X.AbstractRunnableC0487Ju
    public final void A06() {
        AtomicBoolean A0D;
        C7G c7g;
        Handler handler;
        C7G c7g2;
        long j;
        long j2;
        A0D = C6G.A0D(this.A03);
        c7g = this.A02.A04;
        if (c7g instanceof C0806Wj) {
            c7g2 = this.A02.A04;
            C0806Wj adContext = (C0806Wj) c7g2;
            if (A0D.get()) {
                C0R A0D2 = adContext.A0D();
                j2 = this.A02.A00;
                A0D2.A3w(L5.A01(j2));
            } else {
                C0R A0D3 = adContext.A0D();
                j = this.A02.A00;
                A0D3.A3v(L5.A01(j));
            }
        }
        handler = this.A02.A02;
        handler.post(new C0811Wo(this, A0D));
        C6G.A0D(this.A04);
    }
}
