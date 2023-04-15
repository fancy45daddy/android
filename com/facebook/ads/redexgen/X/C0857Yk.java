package com.facebook.ads.redexgen.X;

import com.facebook.ads.AdError;
/* renamed from: com.facebook.ads.redexgen.X.Yk  reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public class C0857Yk implements AnonymousClass68 {
    public static String[] A03 = {"SGxBKOT0PnlxeQ2jGccieZy3bFeI", "1PQaT", "uVEahNbfwTxCxKVGO7p", "rVPhbhRBlKfAg8fviAhE", "2ov", "KrP87Bn8e271VzBAE5Wi", "4No2VIB7eIWgh7ub8hExBeYUcY", "mEjh"};
    public final /* synthetic */ C00361d A00;
    public final /* synthetic */ C0806Wj A01;
    public final /* synthetic */ boolean A02;

    public C0857Yk(C00361d c00361d, C0806Wj c0806Wj, boolean z) {
        this.A00 = c00361d;
        this.A01 = c0806Wj;
        this.A02 = z;
    }

    private void A00(boolean z) {
        InterfaceC00351c interfaceC00351c;
        InterfaceC00351c interfaceC00351c2;
        C0865Ys c0865Ys;
        if (!z) {
            interfaceC00351c = this.A00.A04;
            String[] strArr = A03;
            if (strArr[7].length() == strArr[0].length()) {
                throw new RuntimeException();
            }
            String[] strArr2 = A03;
            strArr2[5] = "3TR1ccuSepVqqTAhPt5x";
            strArr2[3] = "2nf30Z9fIqCCPDXuu277";
            interfaceC00351c.A9o(AdError.CACHE_ERROR);
            return;
        }
        if (ID.A1C(this.A01)) {
            boolean z2 = this.A02;
            String[] strArr3 = A03;
            if (strArr3[7].length() == strArr3[0].length()) {
                throw new RuntimeException();
            }
            A03[4] = "td5rO8fwqS2g7pt7eIgv7CCFkrrD";
            if (z2) {
                C00361d c00361d = this.A00;
                C0806Wj c0806Wj = this.A01;
                c0865Ys = c00361d.A03;
                c00361d.A02 = C0590Nx.A01(c0806Wj, c0865Ys, 1, new C0858Yl(this));
                return;
            }
        }
        interfaceC00351c2 = this.A00.A04;
        interfaceC00351c2.A9p();
    }

    @Override // com.facebook.ads.redexgen.X.AnonymousClass68
    public final void AAB() {
        A00(false);
    }

    @Override // com.facebook.ads.redexgen.X.AnonymousClass68
    public final void AAI() {
        A00(true);
    }
}
