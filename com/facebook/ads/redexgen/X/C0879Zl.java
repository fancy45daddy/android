package com.facebook.ads.redexgen.X;

import android.os.Handler;
import android.view.View;
import androidx.annotation.Nullable;
import com.facebook.infer.annotation.Nullsafe;
@Nullsafe(Nullsafe.Mode.LOCAL)
/* renamed from: com.facebook.ads.redexgen.X.Zl  reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public final class C0879Zl {
    public final C0890Zw A00;
    public final C0888Zu A01;

    public C0879Zl(AbstractC0895a1 abstractC0895a1, C0888Zu c0888Zu, C0890Zw c0890Zw) {
        this.A00 = c0890Zw;
        this.A01 = c0888Zu;
        abstractC0895a1.A02(new F7(c0888Zu));
    }

    public static C0879Zl A00(AbstractC0895a1 abstractC0895a1, InterfaceC0899a5 interfaceC0899a5, F9 f9) {
        C0890Zw c0890Zw = new C0890Zw();
        C0888Zu viewpointScanner = new C0888Zu(interfaceC0899a5, new FC(), f9, c0890Zw, new Handler());
        return new C0879Zl(abstractC0895a1, viewpointScanner, c0890Zw);
    }

    public final void A01(View view) {
        this.A00.A01(view);
    }

    public final void A02(View view, C0897a3 c0897a3) {
        this.A00.A02(view, c0897a3);
    }

    public final void A03(@Nullable InterfaceC0894a0 interfaceC0894a0) {
        this.A01.A0B(interfaceC0894a0);
    }

    public final void A04(@Nullable InterfaceC0892Zy interfaceC0892Zy) {
        this.A01.A0C(interfaceC0892Zy);
    }
}
