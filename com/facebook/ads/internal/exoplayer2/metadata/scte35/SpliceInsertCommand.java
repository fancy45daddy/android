package com.facebook.ads.internal.exoplayer2.metadata.scte35;

import android.os.Parcel;
import android.os.Parcelable;
import com.facebook.ads.redexgen.X.C0426Hh;
import com.facebook.ads.redexgen.X.DL;
import com.facebook.ads.redexgen.X.DM;
import com.facebook.ads.redexgen.X.HV;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
/* loaded from: assets/audience_network.dex */
public final class SpliceInsertCommand extends SpliceCommand {
    public static final Parcelable.Creator<SpliceInsertCommand> CREATOR = new DL();
    public final int A00;
    public final int A01;
    public final int A02;
    public final long A03;
    public final long A04;
    public final long A05;
    public final long A06;
    public final List<DM> A07;
    public final boolean A08;
    public final boolean A09;
    public final boolean A0A;
    public final boolean A0B;
    public final boolean A0C;

    /* JADX WARN: Failed to parse debug info
    java.lang.ArrayIndexOutOfBoundsException: Index 27 out of bounds for length 20
    	at jadx.plugins.input.dex.sections.debuginfo.DebugInfoParser.startVar(DebugInfoParser.java:203)
    	at jadx.plugins.input.dex.sections.debuginfo.DebugInfoParser.process(DebugInfoParser.java:135)
    	at jadx.plugins.input.dex.sections.DexCodeReader.getDebugInfo(DexCodeReader.java:118)
    	at jadx.core.dex.nodes.MethodNode.getDebugInfo(MethodNode.java:567)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.visit(DebugInfoAttachVisitor.java:39)
     */
    public SpliceInsertCommand(long j, boolean z, boolean z2, boolean z3, boolean z4, long j2, long j3, List<DM> list, boolean z5, long j4, int i, int i2, int i3) {
        this.A06 = j;
        this.A0B = z;
        this.A09 = z2;
        this.A0A = z3;
        this.A0C = z4;
        this.A05 = j2;
        this.A04 = j3;
        this.A07 = Collections.unmodifiableList(list);
        this.A08 = z5;
        this.A03 = j4;
        this.A02 = i;
        this.A00 = i2;
        this.A01 = i3;
    }

    public SpliceInsertCommand(Parcel parcel) {
        this.A06 = parcel.readLong();
        this.A0B = parcel.readByte() == 1;
        this.A09 = parcel.readByte() == 1;
        this.A0A = parcel.readByte() == 1;
        this.A0C = parcel.readByte() == 1;
        this.A05 = parcel.readLong();
        this.A04 = parcel.readLong();
        int readInt = parcel.readInt();
        ArrayList arrayList = new ArrayList(readInt);
        for (int i = 0; i < readInt; i++) {
            arrayList.add(DM.A00(parcel));
        }
        this.A07 = Collections.unmodifiableList(arrayList);
        int componentSpliceListSize = parcel.readByte();
        this.A08 = componentSpliceListSize == 1;
        this.A03 = parcel.readLong();
        int componentSpliceListSize2 = parcel.readInt();
        this.A02 = componentSpliceListSize2;
        int componentSpliceListSize3 = parcel.readInt();
        this.A00 = componentSpliceListSize3;
        int componentSpliceListSize4 = parcel.readInt();
        this.A01 = componentSpliceListSize4;
    }

    public /* synthetic */ SpliceInsertCommand(Parcel parcel, DL dl) {
        this(parcel);
    }

    public static SpliceInsertCommand A00(HV hv, long j, C0426Hh c0426Hh) {
        long A0M = hv.A0M();
        boolean z = (hv.A0E() & 128) != 0;
        boolean z2 = false;
        boolean outOfNetworkIndicator = false;
        boolean z3 = false;
        long j2 = -9223372036854775807L;
        List emptyList = Collections.emptyList();
        int availNum = 0;
        int availsExpected = 0;
        int i = 0;
        boolean z4 = false;
        long j3 = -9223372036854775807L;
        if (!z) {
            int A0E = hv.A0E();
            z2 = (A0E & 128) != 0;
            outOfNetworkIndicator = (A0E & 64) != 0;
            boolean autoReturn = (A0E & 32) != 0;
            z3 = (A0E & 16) != 0;
            if (outOfNetworkIndicator && !z3) {
                j2 = TimeSignalCommand.A00(hv, j);
            }
            if (!outOfNetworkIndicator) {
                int componentCount = hv.A0E();
                emptyList = new ArrayList(componentCount);
                for (int i2 = 0; i2 < componentCount; i2++) {
                    int componentTag = hv.A0E();
                    long j4 = -9223372036854775807L;
                    if (!z3) {
                        j4 = TimeSignalCommand.A00(hv, j);
                    }
                    emptyList.add(new DM(componentTag, j4, c0426Hh.A07(j4), null));
                }
            }
            if (autoReturn) {
                long A0E2 = hv.A0E();
                z4 = (A0E2 & 128) != 0;
                j3 = (1000 * (((A0E2 & 1) << 32) | hv.A0M())) / 90;
            }
            availNum = hv.A0I();
            availsExpected = hv.A0E();
            i = hv.A0E();
        }
        return new SpliceInsertCommand(A0M, z, z2, outOfNetworkIndicator, z3, j2, c0426Hh.A07(j2), emptyList, z4, j3, availNum, availsExpected, i);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeLong(this.A06);
        parcel.writeByte(this.A0B ? (byte) 1 : (byte) 0);
        parcel.writeByte(this.A09 ? (byte) 1 : (byte) 0);
        parcel.writeByte(this.A0A ? (byte) 1 : (byte) 0);
        parcel.writeByte(this.A0C ? (byte) 1 : (byte) 0);
        parcel.writeLong(this.A05);
        parcel.writeLong(this.A04);
        int size = this.A07.size();
        parcel.writeInt(size);
        for (int i2 = 0; i2 < size; i2++) {
            this.A07.get(i2).A01(parcel);
        }
        parcel.writeByte(this.A08 ? (byte) 1 : (byte) 0);
        parcel.writeLong(this.A03);
        int componentSpliceListSize = this.A02;
        parcel.writeInt(componentSpliceListSize);
        int componentSpliceListSize2 = this.A00;
        parcel.writeInt(componentSpliceListSize2);
        int componentSpliceListSize3 = this.A01;
        parcel.writeInt(componentSpliceListSize3);
    }
}
