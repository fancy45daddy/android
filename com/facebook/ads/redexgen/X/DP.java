package com.facebook.ads.redexgen.X;

import android.os.Parcel;
/* loaded from: assets/audience_network.dex */
public final class DP {
    public final int A00;
    public final long A01;

    public DP(int i, long j) {
        this.A00 = i;
        this.A01 = j;
    }

    public /* synthetic */ DP(int i, long j, DO r4) {
        this(i, j);
    }

    public static DP A00(Parcel parcel) {
        return new DP(parcel.readInt(), parcel.readLong());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void A02(Parcel parcel) {
        parcel.writeInt(this.A00);
        parcel.writeLong(this.A01);
    }
}
