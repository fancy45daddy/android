package com.facebook.ads.redexgen.X;

import android.os.Parcel;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
/* loaded from: assets/audience_network.dex */
public final class DQ {
    public static String[] A0B = {"s27kRN", "abG5pKADna", "w2jztrB", "I7geUVX8H5XW4NGFgS7QGYJa3", "W37aGUNVZO5G", "W3qhVhIXcY", "2nbP2bKsNJFzfOABHc993I7Qj", "6HcftuEFFeXx4hy"};
    public final int A00;
    public final int A01;
    public final int A02;
    public final long A03;
    public final long A04;
    public final long A05;
    public final List<DP> A06;
    public final boolean A07;
    public final boolean A08;
    public final boolean A09;
    public final boolean A0A;

    /* JADX WARN: Failed to parse debug info
    java.lang.ArrayIndexOutOfBoundsException: Index 24 out of bounds for length 23
    	at jadx.plugins.input.dex.sections.debuginfo.DebugInfoParser.startVar(DebugInfoParser.java:203)
    	at jadx.plugins.input.dex.sections.debuginfo.DebugInfoParser.process(DebugInfoParser.java:125)
    	at jadx.plugins.input.dex.sections.DexCodeReader.getDebugInfo(DexCodeReader.java:118)
    	at jadx.core.dex.nodes.MethodNode.getDebugInfo(MethodNode.java:567)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.visit(DebugInfoAttachVisitor.java:39)
     */
    public static DQ A02(HV hv) {
        long A0M = hv.A0M();
        boolean z = (hv.A0E() & 128) != 0;
        boolean z2 = false;
        boolean z3 = false;
        ArrayList arrayList = new ArrayList();
        int i = 0;
        int i2 = 0;
        int i3 = 0;
        boolean z4 = false;
        long j = -9223372036854775807L;
        if (!z) {
            int A0E = hv.A0E();
            if (A0B[2].length() != 7) {
                throw new RuntimeException();
            }
            A0B[6] = "oYMFgXMCdR9ldlOsYeO";
            z2 = (A0E & 128) != 0;
            z3 = (A0E & 64) != 0;
            boolean z5 = (A0E & 32) != 0;
            r14 = z3 ? hv.A0M() : -9223372036854775807L;
            if (!z3) {
                int A0E2 = hv.A0E();
                arrayList = new ArrayList(A0E2);
                for (int i4 = 0; i4 < A0E2; i4++) {
                    arrayList.add(new DP(hv.A0E(), hv.A0M(), null));
                }
            }
            if (z5) {
                long A0E3 = hv.A0E();
                z4 = (128 & A0E3) != 0;
                j = (1000 * (((1 & A0E3) << 32) | hv.A0M())) / 90;
            }
            i = hv.A0I();
            i2 = hv.A0E();
            i3 = hv.A0E();
        }
        return new DQ(A0M, z, z2, z3, arrayList, r14, z4, j, i, i2, i3);
    }

    public DQ(long j, boolean z, boolean z2, boolean z3, List<DP> list, long j2, boolean z4, long j3, int i, int i2, int i3) {
        this.A04 = j;
        this.A0A = z;
        this.A08 = z2;
        this.A09 = z3;
        this.A06 = Collections.unmodifiableList(list);
        this.A05 = j2;
        this.A07 = z4;
        this.A03 = j3;
        this.A02 = i;
        this.A00 = i2;
        this.A01 = i3;
    }

    public DQ(Parcel parcel) {
        DP A00;
        this.A04 = parcel.readLong();
        this.A0A = parcel.readByte() == 1;
        this.A08 = parcel.readByte() == 1;
        this.A09 = parcel.readByte() == 1;
        int readInt = parcel.readInt();
        ArrayList arrayList = new ArrayList(readInt);
        for (int i = 0; i < readInt; i++) {
            A00 = DP.A00(parcel);
            arrayList.add(A00);
        }
        this.A06 = Collections.unmodifiableList(arrayList);
        this.A05 = parcel.readLong();
        int componentSpliceListLength = parcel.readByte();
        this.A07 = componentSpliceListLength == 1;
        this.A03 = parcel.readLong();
        int componentSpliceListLength2 = parcel.readInt();
        this.A02 = componentSpliceListLength2;
        int componentSpliceListLength3 = parcel.readInt();
        this.A00 = componentSpliceListLength3;
        int componentSpliceListLength4 = parcel.readInt();
        this.A01 = componentSpliceListLength4;
    }

    public static DQ A00(Parcel parcel) {
        return new DQ(parcel);
    }

    public static /* synthetic */ DQ A01(Parcel parcel) {
        return A00(parcel);
    }

    public static /* synthetic */ DQ A03(HV hv) {
        return A02(hv);
    }

    public void A04(Parcel parcel) {
        parcel.writeLong(this.A04);
        parcel.writeByte(this.A0A ? (byte) 1 : (byte) 0);
        parcel.writeByte(this.A08 ? (byte) 1 : (byte) 0);
        parcel.writeByte(this.A09 ? (byte) 1 : (byte) 0);
        int size = this.A06.size();
        parcel.writeInt(size);
        for (int i = 0; i < size; i++) {
            this.A06.get(i).A02(parcel);
        }
        parcel.writeLong(this.A05);
        parcel.writeByte(this.A07 ? (byte) 1 : (byte) 0);
        parcel.writeLong(this.A03);
        int componentSpliceListSize = this.A02;
        parcel.writeInt(componentSpliceListSize);
        int componentSpliceListSize2 = this.A00;
        parcel.writeInt(componentSpliceListSize2);
        int componentSpliceListSize3 = this.A01;
        parcel.writeInt(componentSpliceListSize3);
    }

    public static /* synthetic */ void A05(DQ dq, Parcel parcel) {
        dq.A04(parcel);
    }
}
