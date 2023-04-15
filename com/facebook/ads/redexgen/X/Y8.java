package com.facebook.ads.redexgen.X;

import android.os.Bundle;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
/* loaded from: assets/audience_network.dex */
public final class Y8 implements InterfaceC0514Kx<Bundle> {
    public static byte[] A03;
    public final C2C A00;
    public final InterfaceC0609Oq A01;
    public final List<Y7> A02;

    static {
        A01();
    }

    public static String A00(int i, int i2, int i3) {
        byte[] copyOfRange = Arrays.copyOfRange(A03, i, i + i2);
        for (int i4 = 0; i4 < copyOfRange.length; i4++) {
            copyOfRange[i4] = (byte) ((copyOfRange[i4] ^ i3) ^ 49);
        }
        return new String(copyOfRange);
    }

    public static void A01() {
        A03 = new byte[]{126, 121, 108, 121, 100, 126, 121, 100, 110, 126, 106, 123, 109, 106, 109};
    }

    public Y8(List<C2A> list, Bundle bundle, InterfaceC0609Oq interfaceC0609Oq) {
        this.A02 = new ArrayList(list.size());
        this.A01 = interfaceC0609Oq;
        ArrayList parcelableArrayList = bundle.getParcelableArrayList(A00(10, 5, 15));
        for (int i = 0; i < list.size(); i++) {
            this.A02.add(new Y7(list.get(i), (Bundle) parcelableArrayList.get(i)));
        }
        this.A00 = (C2C) C0508Kr.A00(bundle.getByteArray(A00(0, 10, 28)));
    }

    public Y8(List<C2A> list, InterfaceC0609Oq interfaceC0609Oq) {
        this.A02 = new ArrayList(list.size());
        this.A01 = interfaceC0609Oq;
        for (C2A c2a : list) {
            this.A02.add(new Y7(c2a));
        }
        this.A00 = new C2C();
    }

    public final Bundle A02() {
        Bundle bundle = new Bundle();
        bundle.putByteArray(A00(0, 10, 28), C0508Kr.A01(this.A00));
        ArrayList<? extends Parcelable> arrayList = new ArrayList<>(this.A02.size());
        for (Y7 y7 : this.A02) {
            Bundle bundle2 = y7.A05();
            arrayList.add(bundle2);
        }
        bundle.putParcelableArrayList(A00(10, 5, 15), arrayList);
        return bundle;
    }

    public final C2C A03() {
        return this.A00;
    }

    public final void A04() {
        this.A00.A03();
        for (Y7 y7 : this.A02) {
            y7.A06();
        }
    }

    public final void A05() {
        this.A00.A02();
    }

    public final void A06(double d, double d2) {
        if (d2 >= 0.0d) {
            this.A00.A05(d, d2);
        }
        double A7n = this.A01.A7n();
        this.A00.A04(d, A7n);
        for (Y7 y7 : this.A02) {
            y7.A07(d, A7n);
        }
    }
}
