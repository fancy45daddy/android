package com.facebook.ads.internal.exoplayer2.metadata.scte35;

import android.os.Parcel;
import android.os.Parcelable;
import com.facebook.ads.redexgen.X.DK;
import com.facebook.ads.redexgen.X.HV;
/* loaded from: assets/audience_network.dex */
public final class PrivateCommand extends SpliceCommand {
    public static final Parcelable.Creator<PrivateCommand> CREATOR = new DK();
    public final long A00;
    public final long A01;
    public final byte[] A02;

    public PrivateCommand(long j, byte[] bArr, long j2) {
        this.A01 = j2;
        this.A00 = j;
        this.A02 = bArr;
    }

    public PrivateCommand(Parcel parcel) {
        this.A01 = parcel.readLong();
        this.A00 = parcel.readLong();
        this.A02 = new byte[parcel.readInt()];
        parcel.readByteArray(this.A02);
    }

    public /* synthetic */ PrivateCommand(Parcel parcel, DK dk) {
        this(parcel);
    }

    public static PrivateCommand A00(HV hv, int i, long j) {
        long A0M = hv.A0M();
        byte[] bArr = new byte[i - 4];
        hv.A0c(bArr, 0, bArr.length);
        return new PrivateCommand(A0M, bArr, j);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeLong(this.A01);
        parcel.writeLong(this.A00);
        parcel.writeInt(this.A02.length);
        parcel.writeByteArray(this.A02);
    }
}
