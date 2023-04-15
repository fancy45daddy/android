package com.facebook.ads.internal.exoplayer2.metadata.scte35;

import android.os.Parcel;
import android.os.Parcelable;
import com.facebook.ads.redexgen.X.C0426Hh;
import com.facebook.ads.redexgen.X.DR;
import com.facebook.ads.redexgen.X.HV;
/* loaded from: assets/audience_network.dex */
public final class TimeSignalCommand extends SpliceCommand {
    public static final Parcelable.Creator<TimeSignalCommand> CREATOR = new DR();
    public final long A00;
    public final long A01;

    public TimeSignalCommand(long j, long j2) {
        this.A01 = j;
        this.A00 = j2;
    }

    public /* synthetic */ TimeSignalCommand(long j, long j2, DR dr) {
        this(j, j2);
    }

    public static long A00(HV hv, long j) {
        long A0E = hv.A0E();
        if ((128 & A0E) == 0) {
            return -9223372036854775807L;
        }
        long ptsTime = 1 & A0E;
        long firstByte = hv.A0M();
        return (((ptsTime << 32) | firstByte) + j) & 8589934591L;
    }

    public static TimeSignalCommand A01(HV hv, long j, C0426Hh c0426Hh) {
        long A00 = A00(hv, j);
        return new TimeSignalCommand(A00, c0426Hh.A07(A00));
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeLong(this.A01);
        parcel.writeLong(this.A00);
    }
}
