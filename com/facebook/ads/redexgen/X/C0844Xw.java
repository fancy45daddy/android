package com.facebook.ads.redexgen.X;

import android.graphics.Rect;
import android.view.View;
/* renamed from: com.facebook.ads.redexgen.X.Xw  reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public class C0844Xw implements InterfaceC00762s {
    public final Rect A00 = new Rect();
    public final /* synthetic */ C3M A01;

    public C0844Xw(C3M c3m) {
        this.A01 = c3m;
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC00762s
    public final C3P A9u(View view, C3P c3p) {
        C3P A06 = AnonymousClass38.A06(view, c3p);
        if (A06.A07()) {
            return A06;
        }
        Rect rect = this.A00;
        rect.left = A06.A03();
        rect.top = A06.A05();
        rect.right = A06.A04();
        rect.bottom = A06.A02();
        int i = this.A01.getChildCount();
        for (int count = 0; count < i; count++) {
            C3P A05 = AnonymousClass38.A05(this.A01.getChildAt(count), A06);
            rect.left = Math.min(A05.A03(), rect.left);
            rect.top = Math.min(A05.A05(), rect.top);
            rect.right = Math.min(A05.A04(), rect.right);
            rect.bottom = Math.min(A05.A02(), rect.bottom);
        }
        int count2 = rect.left;
        C3P applied = A06.A06(count2, rect.top, rect.right, rect.bottom);
        return applied;
    }
}
