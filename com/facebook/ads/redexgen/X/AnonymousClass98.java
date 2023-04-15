package com.facebook.ads.redexgen.X;

import java.io.IOException;
/* renamed from: com.facebook.ads.redexgen.X.98  reason: invalid class name */
/* loaded from: assets/audience_network.dex */
public final class AnonymousClass98 extends Exception {
    public final int A00;
    public final int A01;

    public AnonymousClass98(int i, String str, Throwable th, int i2) {
        super(str, th);
        this.A01 = i;
        this.A00 = i2;
    }

    public static AnonymousClass98 A00(IOException iOException) {
        return new AnonymousClass98(0, null, iOException, -1);
    }

    public static AnonymousClass98 A01(Exception exc, int i) {
        return new AnonymousClass98(1, null, exc, i);
    }

    public static AnonymousClass98 A02(RuntimeException runtimeException) {
        return new AnonymousClass98(2, null, runtimeException, -1);
    }
}
