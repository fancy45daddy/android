package com.facebook.ads.redexgen.X;

import android.os.Bundle;
import java.util.ArrayList;
import java.util.List;
/* renamed from: com.facebook.ads.redexgen.X.Xp  reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public class C0838Xp implements InterfaceC00873e {
    public final /* synthetic */ E0 A00;
    public final /* synthetic */ C3Z A01;

    public C0838Xp(E0 e0, C3Z c3z) {
        this.A00 = e0;
        this.A01 = c3z;
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC00873e
    public final Object A4D(int i) {
        C3X compatInfo = this.A01.A00(i);
        if (compatInfo == null) {
            return null;
        }
        return compatInfo.A0M();
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC00873e
    public final List<Object> A5M(String str, int i) {
        List<C3X> A03 = this.A01.A03(str, i);
        if (A03 == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        int infoCount = A03.size();
        for (int i2 = 0; i2 < infoCount; i2++) {
            arrayList.add(A03.get(i2).A0M());
        }
        return arrayList;
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC00873e
    public final Object A5N(int i) {
        C3X compatInfo = this.A01.A01(i);
        if (compatInfo == null) {
            return null;
        }
        return compatInfo.A0M();
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC00873e
    public final boolean AD2(int i, int i2, Bundle bundle) {
        return this.A01.A04(i, i2, bundle);
    }
}
