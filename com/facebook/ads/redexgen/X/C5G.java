package com.facebook.ads.redexgen.X;

import android.app.Activity;
import android.content.Context;
/* renamed from: com.facebook.ads.redexgen.X.5G  reason: invalid class name */
/* loaded from: assets/audience_network.dex */
public final class C5G {
    public static C0R A00(Context context, C7I c7i) {
        C0805Wi sdkContext = A07(context);
        C0U A6g = c7i.A6g(sdkContext);
        if (A6g != null) {
            return A6g.A9N();
        }
        return new ZP();
    }

    public static C0806Wj A01(Activity activity) {
        return new C0806Wj(activity, A08(), A00(activity, A08()));
    }

    public static C0806Wj A02(Context context) {
        return new C0806Wj(context, A08(), new ZP());
    }

    public static C0806Wj A03(Context context) {
        return new C0806Wj(context, A08(), A00(context, A08()));
    }

    public static C0806Wj A04(Context context) {
        if (ID.A0q(context)) {
            return new C0806Wj(context, A08(), A00(context, A08()));
        }
        return A02(context);
    }

    public static C0806Wj A05(Context context) {
        return new C0806Wj(context, A08(), A00(context, A08()));
    }

    public static DY A06(Context context) {
        return new DY(context, A08(), A08().A6g(A07(context)));
    }

    public static C0805Wi A07(Context context) {
        return new C0805Wi(context, A08());
    }

    public static synchronized C7I A08() {
        WH A02;
        synchronized (C5G.class) {
            A02 = WH.A02();
        }
        return A02;
    }
}
