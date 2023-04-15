package com.facebook.ads.redexgen.X;

import android.util.Pair;
import androidx.annotation.Nullable;
import com.facebook.ads.internal.exoplayer2.source.TrackGroup;
import com.facebook.ads.internal.exoplayer2.source.TrackGroupArray;
/* renamed from: com.facebook.ads.redexgen.X.Ty  reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public abstract class AbstractC0746Ty extends GF {
    public static String[] A01 = {"26JblF4b6dorFS8jU2vwriUxZ0G71mwq", "Xnpi2o2sUEOze", "R71e3dTOAhzB09tZHggtqRTS0V3by", "x11tshWAsx1g8", "baPvwG8wSWpB2aFi4", "NgcUJ4cAOsbj9", "II", "FdNrM275eXYBmZtzCUl1db95x7ONP"};
    @Nullable
    public GA A00;

    /* JADX WARN: Failed to parse debug info
    java.lang.ArrayIndexOutOfBoundsException: Index 14 out of bounds for length 14
    	at jadx.plugins.input.dex.sections.debuginfo.DebugInfoParser.startVar(DebugInfoParser.java:203)
    	at jadx.plugins.input.dex.sections.debuginfo.DebugInfoParser.process(DebugInfoParser.java:125)
    	at jadx.plugins.input.dex.sections.DexCodeReader.getDebugInfo(DexCodeReader.java:118)
    	at jadx.core.dex.nodes.MethodNode.getDebugInfo(MethodNode.java:567)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.visit(DebugInfoAttachVisitor.java:39)
     */
    @Override // com.facebook.ads.redexgen.X.GF
    public final GG A0T(InterfaceC02349g[] interfaceC02349gArr, TrackGroupArray trackGroupArray) throws AnonymousClass98 {
        int[] iArr = new int[interfaceC02349gArr.length + 1];
        TrackGroup[][] trackGroupArr = new TrackGroup[interfaceC02349gArr.length + 1];
        int[][][] iArr2 = new int[interfaceC02349gArr.length + 1][];
        for (int i = 0; i < trackGroupArr.length; i++) {
            trackGroupArr[i] = new TrackGroup[trackGroupArray.A01];
            iArr2[i] = new int[trackGroupArray.A01];
        }
        int[] A0S = A0S(interfaceC02349gArr);
        for (int i2 = 0; i2 < trackGroupArray.A01; i2++) {
            TrackGroup A012 = trackGroupArray.A01(i2);
            int A0Q = A0Q(interfaceC02349gArr, A012);
            int[] A0R = A0Q == interfaceC02349gArr.length ? new int[A012.A01] : A0R(interfaceC02349gArr[A0Q], A012);
            int i3 = iArr[A0Q];
            trackGroupArr[A0Q][i3] = A012;
            iArr2[A0Q][i3] = A0R;
            iArr[A0Q] = iArr[A0Q] + 1;
        }
        TrackGroupArray[] trackGroupArrayArr = new TrackGroupArray[interfaceC02349gArr.length];
        int[] iArr3 = new int[interfaceC02349gArr.length];
        for (int i4 = 0; i4 < interfaceC02349gArr.length; i4++) {
            int i5 = iArr[i4];
            trackGroupArrayArr[i4] = new TrackGroupArray((TrackGroup[]) C0430Hl.A0k(trackGroupArr[i4], i5));
            iArr2[i4] = (int[][]) C0430Hl.A0k(iArr2[i4], i5);
            iArr3[i4] = interfaceC02349gArr[i4].A7g();
        }
        GA ga = new GA(iArr3, trackGroupArrayArr, A0S, iArr2, new TrackGroupArray((TrackGroup[]) C0430Hl.A0k(trackGroupArr[interfaceC02349gArr.length], iArr[interfaceC02349gArr.length])));
        Pair<C02359h[], GC[]> A0V = A0V(ga, iArr2, A0S);
        return new GG((C02359h[]) A0V.first, (GC[]) A0V.second, ga);
    }

    public abstract Pair<C02359h[], GC[]> A0V(GA ga, int[][][] iArr, int[] iArr2) throws AnonymousClass98;

    /* JADX WARN: Incorrect condition in loop: B:4:0x0004 */
    /* JADX WARN: Incorrect condition in loop: B:7:0x000b */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static int A0Q(com.facebook.ads.redexgen.X.InterfaceC02349g[] r6, com.facebook.ads.internal.exoplayer2.source.TrackGroup r7) throws com.facebook.ads.redexgen.X.AnonymousClass98 {
        /*
            int r5 = r6.length
            r4 = 0
            r3 = 0
        L3:
            int r0 = r6.length
            if (r3 >= r0) goto L25
            r2 = r6[r3]
            r1 = 0
        L9:
            int r0 = r7.A01
            if (r1 >= r0) goto L22
            com.facebook.ads.internal.exoplayer2.Format r0 = r7.A01(r1)
            int r0 = r2.AEy(r0)
            r0 = r0 & 7
            if (r0 <= r4) goto L1f
            r5 = r3
            r4 = r0
            r0 = 4
            if (r4 != r0) goto L1f
            return r5
        L1f:
            int r1 = r1 + 1
            goto L9
        L22:
            int r3 = r3 + 1
            goto L3
        L25:
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.ads.redexgen.X.AbstractC0746Ty.A0Q(com.facebook.ads.redexgen.X.9g[], com.facebook.ads.internal.exoplayer2.source.TrackGroup):int");
    }

    public static int[] A0R(InterfaceC02349g interfaceC02349g, TrackGroup trackGroup) throws AnonymousClass98 {
        int[] iArr = new int[trackGroup.A01];
        for (int i = 0; i < trackGroup.A01; i++) {
            iArr[i] = interfaceC02349g.AEy(trackGroup.A01(i));
        }
        return iArr;
    }

    public static int[] A0S(InterfaceC02349g[] interfaceC02349gArr) throws AnonymousClass98 {
        int[] iArr = new int[interfaceC02349gArr.length];
        int i = 0;
        while (true) {
            int length = iArr.length;
            String[] strArr = A01;
            String str = strArr[4];
            String str2 = strArr[5];
            int i2 = str.length();
            if (i2 == str2.length()) {
                throw new RuntimeException();
            }
            A01[0] = "xB4ZDOqJN2K9OUw5kZCJNg4ll7dteaQM";
            if (i < length) {
                iArr[i] = interfaceC02349gArr[i].AF0();
                i++;
            } else {
                return iArr;
            }
        }
    }

    @Override // com.facebook.ads.redexgen.X.GF
    public final void A0U(Object obj) {
        this.A00 = (GA) obj;
    }
}
