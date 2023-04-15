package com.facebook.ads.redexgen.X;
/* renamed from: com.facebook.ads.redexgen.X.5q  reason: invalid class name and case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public final class C01505q {
    public final long A00;
    public final EnumC01495p A01;
    public final String A02;
    public final boolean A03;

    public C01505q(String str, boolean z, EnumC01495p enumC01495p) {
        this(str, z, enumC01495p, System.currentTimeMillis());
    }

    public C01505q(String str, boolean z, EnumC01495p enumC01495p, long j) {
        this.A02 = str;
        this.A03 = z;
        this.A01 = enumC01495p;
        this.A00 = j;
    }

    public static C01505q A00() {
        return new C01505q("", true, EnumC01495p.A06, -1L);
    }

    public final long A01() {
        return this.A00;
    }

    public final EnumC01495p A02() {
        return this.A01;
    }

    public final String A03() {
        return this.A02;
    }

    public final boolean A04() {
        return this.A03;
    }
}
