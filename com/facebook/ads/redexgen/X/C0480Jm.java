package com.facebook.ads.redexgen.X;

import android.annotation.SuppressLint;
import java.util.Collections;
import java.util.Set;
import java.util.WeakHashMap;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;
/* renamed from: com.facebook.ads.redexgen.X.Jm  reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public final class C0480Jm {
    public static final Set<Object> A00 = Collections.newSetFromMap(new WeakHashMap());
    public static final AtomicBoolean A01 = new AtomicBoolean(true);
    public static final AtomicReference<InterfaceC0478Jk> A02 = new AtomicReference<>();

    @SuppressLint({"RethrownThrowableArgument"})
    public static void A00(Throwable th, Object obj) throws Throwable {
        if (A01.get()) {
            A00.add(obj);
            K1.A00().A8m(3306, th);
            InterfaceC0478Jk contextRepairHelper = A02.get();
            if (contextRepairHelper != null) {
                contextRepairHelper.ADt(th, obj);
                return;
            }
            return;
        }
        throw th;
    }

    public static void A01(boolean z, InterfaceC0478Jk interfaceC0478Jk) {
        A01.set(z);
        A02.set(interfaceC0478Jk);
    }

    public static boolean A02(Object obj) {
        return A00.contains(obj);
    }
}
