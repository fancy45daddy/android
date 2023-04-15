package com.facebook.ads.redexgen.X;

import android.util.SparseArray;
/* renamed from: com.facebook.ads.redexgen.X.Ui  reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public class C0756Ui implements InterfaceC0295Cc {
    public final HU A00 = new HU(new byte[4]);
    public final /* synthetic */ C0754Ug A01;

    public C0756Ui(C0754Ug c0754Ug) {
        this.A01 = c0754Ug;
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC0295Cc
    public final void A48(HV hv) {
        int programCount;
        SparseArray sparseArray;
        SparseArray sparseArray2;
        int tableId = hv.A0E();
        if (tableId != 0) {
            return;
        }
        hv.A0Z(7);
        int A04 = hv.A04() / 4;
        for (int programNumber = 0; programNumber < A04; programNumber++) {
            hv.A0a(this.A00, 4);
            int A042 = this.A00.A04(16);
            this.A00.A08(3);
            if (A042 == 0) {
                this.A00.A08(13);
            } else {
                int i = this.A00.A04(13);
                sparseArray2 = this.A01.A06;
                sparseArray2.put(i, new C0759Ul(new C0755Uh(this.A01, i)));
                C0754Ug.A01(this.A01);
            }
        }
        programCount = this.A01.A05;
        if (programCount != 2) {
            sparseArray = this.A01.A06;
            sparseArray.remove(0);
        }
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC0295Cc
    public final void A8I(C0426Hh c0426Hh, BQ bq, C0301Ci c0301Ci) {
    }
}
