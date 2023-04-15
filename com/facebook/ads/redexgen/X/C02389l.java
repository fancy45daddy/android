package com.facebook.ads.redexgen.X;
/* renamed from: com.facebook.ads.redexgen.X.9l  reason: invalid class name and case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public final class C02389l {
    public int A00;
    public long A01;
    public Object A02;
    public Object A03;
    public long A04;
    public C0362Ev A05;

    public final int A00() {
        return this.A05.A00;
    }

    public final int A01(int i) {
        return this.A05.A04[i].A00;
    }

    public final int A02(int i) {
        return this.A05.A04[i].A00();
    }

    public final int A03(int i, int i2) {
        return this.A05.A04[i].A01(i2);
    }

    public final int A04(long j) {
        return this.A05.A00(j);
    }

    public final int A05(long j) {
        return this.A05.A01(j);
    }

    public final long A06() {
        return this.A05.A01;
    }

    public final long A07() {
        return this.A01;
    }

    public final long A08() {
        return AnonymousClass92.A01(this.A04);
    }

    public final long A09(int i) {
        return this.A05.A03[i];
    }

    public final long A0A(int i, int i2) {
        C0360Et c0360Et = this.A05.A04[i];
        if (c0360Et.A00 != -1) {
            return c0360Et.A02[i2];
        }
        return -9223372036854775807L;
    }

    public final C02389l A0B(Object obj, Object obj2, int i, long j, long j2) {
        return A0C(obj, obj2, i, j, j2, C0362Ev.A06);
    }

    public final C02389l A0C(Object obj, Object obj2, int i, long j, long j2, C0362Ev c0362Ev) {
        this.A02 = obj;
        this.A03 = obj2;
        this.A00 = i;
        this.A01 = j;
        this.A04 = j2;
        this.A05 = c0362Ev;
        return this;
    }

    public final boolean A0D(int i) {
        return !this.A05.A04[i].A02();
    }

    public final boolean A0E(int i, int i2) {
        C0360Et c0360Et = this.A05.A04[i];
        return (c0360Et.A00 == -1 || c0360Et.A01[i2] == 0) ? false : true;
    }
}
