package com.facebook.ads.redexgen.X;

import androidx.annotation.Nullable;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.Map;
/* renamed from: com.facebook.ads.redexgen.X.Nx  reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public final class C0590Nx {
    public static final Map<String, WeakReference<C0589Nw>> A00 = new HashMap();

    public static int A00() {
        return A00.size();
    }

    public static C0589Nw A01(C0806Wj c0806Wj, AnonymousClass18 anonymousClass18, int i, InterfaceC0587Nu interfaceC0587Nu) {
        C0589Nw c0589Nw = new C0589Nw(c0806Wj, anonymousClass18, c0806Wj.A00().A08(), i);
        c0589Nw.A0b(interfaceC0587Nu);
        c0589Nw.A0X();
        A00.put(anonymousClass18.A0Z(), new WeakReference<>(c0589Nw));
        return c0589Nw;
    }

    @Nullable
    public static C0589Nw A02(String str) {
        WeakReference<C0589Nw> weakReference = A00.get(str);
        if (weakReference != null) {
            return weakReference.get();
        }
        return null;
    }

    public static void A03(AnonymousClass18 anonymousClass18, C0589Nw c0589Nw) {
        A00.put(anonymousClass18.A0Z(), new WeakReference<>(c0589Nw));
    }

    public static void A04(String str) {
        A00.remove(str);
    }
}
