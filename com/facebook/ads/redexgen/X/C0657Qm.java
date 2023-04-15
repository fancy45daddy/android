package com.facebook.ads.redexgen.X;

import android.text.TextUtils;
import java.util.Map;
/* renamed from: com.facebook.ads.redexgen.X.Qm  reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public class C0657Qm extends AbstractC0626Ph {
    public final /* synthetic */ AnonymousClass77 A00;

    public C0657Qm(AnonymousClass77 anonymousClass77) {
        this.A00 = anonymousClass77;
    }

    @Override // com.facebook.ads.redexgen.X.AbstractC0626Ph
    public final void A02() {
        L6 l6;
        L6 l62;
        String str;
        C0627Pi c0627Pi;
        L6 l63;
        C0865Ys c0865Ys;
        IT it;
        String str2;
        C0806Wj c0806Wj;
        C0865Ys c0865Ys2;
        l6 = this.A00.A0D;
        if (!l6.A07()) {
            AnonymousClass77 anonymousClass77 = this.A00;
            l62 = anonymousClass77.A0D;
            anonymousClass77.setImpressionRecordingFlag(l62);
            str = this.A00.A0A;
            if (!TextUtils.isEmpty(str)) {
                N2 n2 = new N2();
                c0627Pi = this.A00.A09;
                N2 A03 = n2.A03(c0627Pi);
                l63 = this.A00.A0D;
                N2 A02 = A03.A02(l63);
                c0865Ys = ((SH) this.A00).A08;
                Map<String, String> A05 = A02.A04(c0865Ys.A0X()).A05();
                it = ((SH) this.A00).A0A;
                str2 = this.A00.A0A;
                it.A8z(str2, A05);
                c0806Wj = this.A00.A0C;
                c0806Wj.A0D().A2Y();
                c0865Ys2 = this.A00.A03;
                AnonymousClass29.A00(c0865Ys2.A0W());
            }
        }
    }
}
