package com.facebook.ads.redexgen.X;

import android.view.ViewGroup;
import java.util.List;
/* renamed from: com.facebook.ads.redexgen.X.Qg  reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public final class C0651Qg extends C4H<C0649Qe> {
    public final int A00;
    public final C0806Wj A01;
    public final List<String> A02;

    public C0651Qg(C0806Wj c0806Wj, List<String> screenshotUrls, int i) {
        this.A02 = screenshotUrls;
        this.A00 = i;
        this.A01 = c0806Wj;
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Override // com.facebook.ads.redexgen.X.C4H
    /* renamed from: A01 */
    public final C0649Qe A06(ViewGroup viewGroup, int i) {
        return new C0649Qe(new C0650Qf(this.A01));
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Override // com.facebook.ads.redexgen.X.C4H
    /* renamed from: A02 */
    public final void A0E(C0649Qe c0649Qe, int i) {
        String str = this.A02.get(i);
        ViewGroup.MarginLayoutParams marginLayoutParams = new ViewGroup.MarginLayoutParams(-2, -1);
        int leftMargin = this.A00;
        int i2 = leftMargin * 4;
        if (i == 0) {
            leftMargin = i2;
        }
        marginLayoutParams.setMargins(leftMargin, 0, i >= A0D() + (-1) ? this.A00 * 4 : this.A00, 0);
        c0649Qe.A0l().setLayoutParams(marginLayoutParams);
        c0649Qe.A0l().A00(str);
    }

    @Override // com.facebook.ads.redexgen.X.C4H
    public final int A0D() {
        return this.A02.size();
    }
}
