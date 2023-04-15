package com.facebook.ads.redexgen.X;

import a.a.j;
import android.util.Log;
import android.util.Pair;
import android.util.SparseArray;
import androidx.annotation.Nullable;
import com.facebook.ads.internal.exoplayer2.Format;
import com.facebook.ads.internal.exoplayer2.drm.DrmInitData;
import java.io.IOException;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.UUID;
/* loaded from: assets/audience_network.dex */
public final class VF implements BO {
    public static byte[] A0X;
    public static String[] A0Y = {"bw2Pz5UYSLOOesGIJaWlA3GOzVLZPAg", "gG3", "yjdYoV9UEi8qMqqcqGKRK6SXbov0CwAj", "4kzePG", "OMn6r0AgRGwk9BJzU", "o", "aMFqcwP4FMZJ2yTkvuTBoGT2vGZy4ax", "h66GloOgbywQ1e6PB204dGM9vAJrPucq"};
    public static final BR A0Z;
    public static final int A0a;
    public static final Format A0b;
    public static final byte[] A0c;
    public int A00;
    public int A01;
    public int A02;
    public int A03;
    public int A04;
    public int A05;
    public int A06;
    public long A07;
    public long A08;
    public long A09;
    public long A0A;
    public long A0B;
    public BQ A0C;
    public C1 A0D;
    public HV A0E;
    public boolean A0F;
    public boolean A0G;
    public InterfaceC0279Ba[] A0H;
    public InterfaceC0279Ba[] A0I;
    public final int A0J;
    public final SparseArray<C1> A0K;
    @Nullable
    public final DrmInitData A0L;
    @Nullable
    public final InterfaceC0279Ba A0M;
    @Nullable
    public final CA A0N;
    public final HV A0O;
    public final HV A0P;
    public final HV A0Q;
    public final HV A0R;
    @Nullable
    public final C0426Hh A0S;
    public final ArrayDeque<VL> A0T;
    public final ArrayDeque<C0> A0U;
    public final List<Format> A0V;
    public final byte[] A0W;

    /* JADX WARN: Code restructure failed: missing block: B:27:0x00a6, code lost:
        if (r10 != 0) goto L27;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x00a8, code lost:
        r22 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:49:0x0107, code lost:
        if (r10 != 0) goto L27;
     */
    /* JADX WARN: Code restructure failed: missing block: B:51:0x010a, code lost:
        r22 = false;
     */
    /* JADX WARN: Failed to parse debug info
    java.lang.ArrayIndexOutOfBoundsException: Index 35 out of bounds for length 35
    	at jadx.plugins.input.dex.sections.debuginfo.DebugInfoParser.startVar(DebugInfoParser.java:203)
    	at jadx.plugins.input.dex.sections.debuginfo.DebugInfoParser.process(DebugInfoParser.java:125)
    	at jadx.plugins.input.dex.sections.DexCodeReader.getDebugInfo(DexCodeReader.java:118)
    	at jadx.core.dex.nodes.MethodNode.getDebugInfo(MethodNode.java:567)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.visit(DebugInfoAttachVisitor.java:39)
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static int A00(com.facebook.ads.redexgen.X.C1 r28, int r29, long r30, int r32, com.facebook.ads.redexgen.X.HV r33, int r34) {
        /*
            Method dump skipped, instructions count: 447
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.ads.redexgen.X.VF.A00(com.facebook.ads.redexgen.X.C1, int, long, int, com.facebook.ads.redexgen.X.HV, int):int");
    }

    /* JADX WARN: Failed to parse debug info
    java.lang.ArrayIndexOutOfBoundsException: Index 24 out of bounds for length 23
    	at jadx.plugins.input.dex.sections.debuginfo.DebugInfoParser.startVar(DebugInfoParser.java:203)
    	at jadx.plugins.input.dex.sections.debuginfo.DebugInfoParser.process(DebugInfoParser.java:125)
    	at jadx.plugins.input.dex.sections.DexCodeReader.getDebugInfo(DexCodeReader.java:118)
    	at jadx.core.dex.nodes.MethodNode.getDebugInfo(MethodNode.java:567)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.visit(DebugInfoAttachVisitor.java:39)
     */
    public static Pair<Long, C0777Vg> A04(HV hv, long j) throws C9R {
        long A0N;
        long A0N2;
        hv.A0Y(8);
        int A01 = AbstractC0283Bp.A01(hv.A08());
        hv.A0Z(4);
        long A0M = hv.A0M();
        if (A01 == 0) {
            A0N = hv.A0M();
            A0N2 = j + hv.A0M();
        } else {
            A0N = hv.A0N();
            A0N2 = j + hv.A0N();
        }
        long A0F = C0430Hl.A0F(A0N, 1000000L, A0M);
        hv.A0Z(2);
        int A0I = hv.A0I();
        int[] iArr = new int[A0I];
        long[] jArr = new long[A0I];
        long[] jArr2 = new long[A0I];
        long[] jArr3 = new long[A0I];
        if (A0Y[2].charAt(18) != 'K') {
            throw new RuntimeException();
        }
        A0Y[5] = "s";
        int i = 0;
        long j2 = A0F;
        while (i < A0I) {
            int A08 = hv.A08();
            if ((Integer.MIN_VALUE & A08) != 0) {
                throw new C9R(A0A(581, 28, 75));
            }
            long A0M2 = hv.A0M();
            iArr[i] = Integer.MAX_VALUE & A08;
            jArr[i] = A0N2;
            jArr3[i] = j2;
            A0N += A0M2;
            j2 = C0430Hl.A0F(A0N, 1000000L, A0M);
            jArr2[i] = j2 - jArr3[i];
            hv.A0Z(4);
            int i2 = iArr[i];
            if (A0Y[3].length() != 6) {
                A0Y[1] = "dhc";
                A0N2 += i2;
                i += 0;
            } else {
                A0Y[5] = "h";
                A0N2 += i2;
                i++;
            }
        }
        return Pair.create(Long.valueOf(A0F), new C0777Vg(iArr, jArr, jArr2, jArr3));
    }

    /* JADX WARN: Failed to parse debug info
    java.lang.ArrayIndexOutOfBoundsException: Index 12 out of bounds for length 10
    	at jadx.plugins.input.dex.sections.debuginfo.DebugInfoParser.startVar(DebugInfoParser.java:203)
    	at jadx.plugins.input.dex.sections.debuginfo.DebugInfoParser.process(DebugInfoParser.java:135)
    	at jadx.plugins.input.dex.sections.DexCodeReader.getDebugInfo(DexCodeReader.java:118)
    	at jadx.core.dex.nodes.MethodNode.getDebugInfo(MethodNode.java:567)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.visit(DebugInfoAttachVisitor.java:39)
     */
    public static C1 A09(HV hv, SparseArray<C1> sparseArray) {
        hv.A0Y(8);
        int A00 = AbstractC0283Bp.A00(hv.A08());
        C1 A08 = A08(sparseArray, hv.A08());
        if (A08 == null) {
            return null;
        }
        if ((A00 & 1) != 0) {
            long A0N = hv.A0N();
            A08.A07.A05 = A0N;
            A08.A07.A04 = A0N;
        }
        C0289Bv c0289Bv = A08.A04;
        A08.A07.A07 = new C0289Bv((A00 & 2) != 0 ? hv.A0H() - 1 : c0289Bv.A02, (A00 & 8) != 0 ? hv.A0H() : c0289Bv.A00, (A00 & 16) != 0 ? hv.A0H() : c0289Bv.A03, (A00 & 32) != 0 ? hv.A0H() : c0289Bv.A01);
        return A08;
    }

    public static String A0A(int i, int i2, int i3) {
        byte[] copyOfRange = Arrays.copyOfRange(A0X, i, i + i2);
        for (int i4 = 0; i4 < copyOfRange.length; i4++) {
            copyOfRange[i4] = (byte) ((copyOfRange[i4] ^ i3) ^ 85);
        }
        return new String(copyOfRange);
    }

    public static void A0D() {
        A0X = new byte[]{76, 64, 11, 62, 37, 39, 106, 57, 35, 48, 47, 106, 38, 47, 57, 57, 106, 62, 34, 43, 36, 106, 34, 47, 43, 46, 47, 56, 106, 38, 47, 36, 45, 62, 34, 106, 98, 63, 36, 57, 63, 58, 58, 37, 56, 62, 47, 46, 99, 100, 104, 67, 89, 95, 84, 13, 78, 66, 88, 67, 89, 13, 68, 67, 13, 94, 79, 74, 93, 13, 12, 16, 13, 28, 13, 5, 88, 67, 94, 88, 93, 93, 66, 95, 89, 72, 73, 4, 3, 5, 46, 52, 50, 57, 96, 35, 47, 53, 46, 52, 96, 41, 46, 96, 51, 39, 48, 36, 96, 97, 125, 96, 113, 96, 104, 53, 46, 51, 53, 48, 48, 47, 50, 52, 37, 36, 105, 110, 29, 41, 58, 60, 54, 62, 53, 47, 62, 63, 22, 43, 111, 30, 35, 47, 41, 58, 56, 47, 52, 41, 4, 42, 35, 34, 63, 36, 35, 42, 109, 35, 40, 42, 44, 57, 36, 59, 40, 109, 34, 43, 43, 62, 40, 57, 109, 57, 34, 109, 62, 44, 32, 61, 33, 40, 109, 41, 44, 57, 44, 99, 110, 71, 67, 68, 2, 67, 86, 77, 79, 2, 70, 71, 68, 75, 76, 71, 81, 2, 71, 90, 86, 71, 76, 70, 71, 70, 2, 67, 86, 77, 79, 2, 81, 75, 88, 71, 2, 10, 87, 76, 81, 87, 82, 82, 77, 80, 86, 71, 70, 11, 12, 38, 15, 11, 12, 74, 11, 30, 5, 7, 74, 29, 3, 30, 2, 74, 6, 15, 4, 13, 30, 2, 74, 84, 74, 88, 91, 94, 93, 94, 82, 89, 92, 94, 93, 74, 66, 31, 4, 25, 31, 26, 26, 5, 24, 30, 15, 14, 67, 68, 97, 72, 67, 74, 89, 69, 13, 64, 68, 94, 64, 76, 89, 78, 69, 23, 13, 88, 113, 113, 100, 114, 99, 55, 99, 120, 55, 114, 121, 116, 101, 110, 103, 99, 126, 120, 121, 55, 115, 118, 99, 118, 55, 96, 118, 100, 55, 121, 114, 112, 118, 99, 126, 97, 114, 57, 22, 63, 63, 42, 60, 45, 121, 45, 54, 121, 60, 55, 61, 121, 54, 63, 121, 52, 61, 56, 45, 121, 46, 56, 42, 121, 55, 60, 62, 56, 45, 48, 47, 60, 119, 84, 109, 126, 105, 105, 114, Byte.MAX_VALUE, 114, 117, 124, 59, 79, 105, 122, 120, 112, 94, 117, 120, 105, 98, 107, 111, 114, 116, 117, 89, 116, 99, 59, 107, 122, 105, 122, 118, 126, 111, 126, 105, 104, 59, 114, 104, 59, 110, 117, 104, 110, 107, 107, 116, 105, 111, 126, Byte.MAX_VALUE, 53, 107, 83, 81, 72, 72, 93, 92, 24, 72, 75, 75, 80, 24, 89, 76, 87, 85, 24, 16, 94, 89, 81, 84, 93, 92, 24, 76, 87, 24, 93, 64, 76, 74, 89, 91, 76, 24, 77, 77, 81, 92, 17, 105, 81, 83, 74, 74, 83, 84, 93, 26, 91, 78, 85, 87, 26, 77, 83, 78, 82, 26, 86, 95, 84, 93, 78, 82, 26, 4, 26, 8, 11, 14, 13, 14, 2, 9, 12, 14, 13, 26, 18, 79, 84, 73, 79, 74, 74, 85, 72, 78, 95, 94, 19, 20, 11, 48, 59, 38, 46, 59, 61, 42, 59, 58, 126, 51, 49, 49, 40, 126, 60, 49, 38, 112, 95, 100, 111, 114, 122, 111, 105, 126, 111, 110, 42, 121, 107, 99, 101, 42, 111, 100, 126, 120, 115, 42, 105, 101, Byte.MAX_VALUE, 100, 126, 48, 42, 75, 112, 118, Byte.MAX_VALUE, 112, 122, 114, 123, 122, 62, 119, 112, 122, 119, 108, 123, 125, 106, 62, 108, 123, 120, 123, 108, 123, 112, 125, 123, 41, 30, 13, 22, 30, 29, 19, 26, 95, 19, 26, 17, 24, 11, 23, 95, 27, 26, 12, 28, 13, 22, 15, 11, 22, 16, 17, 95, 22, 17, 95, 12, 24, 15, 27, 95, 25, 16, 10, 17, 27, 95, 87, 10, 17, 12, 10, 15, 15, 16, 13, 11, 26, 27, 86, 3, 18, 18, 14, 11, 1, 3, 22, 11, 13, 12, 77, 26, 79, 7, 15, 17, 5, 62, 40, 36, 42, 46, 49, 60, 61, 55, 119, 48, 61, 46, 59, 61, 34, 47, 46, 36, 100, 38, 59, Byte.MAX_VALUE};
    }

    /* JADX WARN: Failed to parse debug info
    java.lang.ArrayIndexOutOfBoundsException: Index 18 out of bounds for length 16
    	at jadx.plugins.input.dex.sections.debuginfo.DebugInfoParser.startVar(DebugInfoParser.java:203)
    	at jadx.plugins.input.dex.sections.debuginfo.DebugInfoParser.process(DebugInfoParser.java:125)
    	at jadx.plugins.input.dex.sections.DexCodeReader.getDebugInfo(DexCodeReader.java:118)
    	at jadx.core.dex.nodes.MethodNode.getDebugInfo(MethodNode.java:567)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.visit(DebugInfoAttachVisitor.java:39)
     */
    private void A0K(VL vl) throws C9R {
        H6.A06(this.A0N == null, A0A(532, 20, 11));
        DrmInitData drmInitData = this.A0L;
        if (drmInitData == null) {
            drmInitData = A05(vl.A02);
        }
        VL A06 = vl.A06(AbstractC0283Bp.A0m);
        SparseArray<C0289Bv> sparseArray = new SparseArray<>();
        long j = -9223372036854775807L;
        int size = A06.A02.size();
        for (int i = 0; i < size; i++) {
            VK vk = A06.A02.get(i);
            if (((AbstractC0283Bp) vk).A00 == AbstractC0283Bp.A1M) {
                Pair<Integer, C0289Bv> A03 = A03(vk.A00);
                sparseArray.put(((Integer) A03.first).intValue(), (C0289Bv) A03.second);
            } else if (((AbstractC0283Bp) vk).A00 == AbstractC0283Bp.A0f) {
                j = A01(vk.A00);
            }
        }
        SparseArray sparseArray2 = new SparseArray();
        int size2 = vl.A01.size();
        for (int i2 = 0; i2 < size2; i2++) {
            VL vl2 = vl.A01.get(i2);
            if (((AbstractC0283Bp) vl2).A00 == AbstractC0283Bp.A1L) {
                CA A0C = C0288Bu.A0C(vl2, vl.A07(AbstractC0283Bp.A0n), j, drmInitData, (this.A0J & 16) != 0, false);
                if (A0C != null) {
                    sparseArray2.put(A0C.A00, A0C);
                }
            }
        }
        int size3 = sparseArray2.size();
        if (this.A0K.size() != 0) {
            H6.A04(this.A0K.size() == size3);
            for (int i3 = 0; i3 < size3; i3++) {
                CA ca = (CA) sparseArray2.valueAt(i3);
                this.A0K.get(ca.A00).A07(ca, A06(sparseArray, ca.A00));
            }
            return;
        }
        for (int i4 = 0; i4 < size3; i4++) {
            CA ca2 = (CA) sparseArray2.valueAt(i4);
            C1 c1 = new C1(this.A0C.AF2(i4, ca2.A03));
            c1.A07(ca2, A06(sparseArray, ca2.A00));
            this.A0K.put(ca2.A00, c1);
            this.A08 = Math.max(this.A08, ca2.A04);
        }
        A0C();
        if (A0Y[5].length() != 1) {
            throw new RuntimeException();
        }
        A0Y[5] = "d";
        this.A0C.A5C();
    }

    /* JADX WARN: Failed to parse debug info
    java.lang.ArrayIndexOutOfBoundsException: Index 19 out of bounds for length 13
    	at jadx.plugins.input.dex.sections.debuginfo.DebugInfoParser.startVar(DebugInfoParser.java:203)
    	at jadx.plugins.input.dex.sections.debuginfo.DebugInfoParser.process(DebugInfoParser.java:135)
    	at jadx.plugins.input.dex.sections.DexCodeReader.getDebugInfo(DexCodeReader.java:118)
    	at jadx.core.dex.nodes.MethodNode.getDebugInfo(MethodNode.java:567)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.visit(DebugInfoAttachVisitor.java:39)
     */
    public static void A0M(VL vl, SparseArray<C1> sparseArray, int i, byte[] bArr) throws C9R {
        C1 A09 = A09(vl.A07(AbstractC0283Bp.A1I).A00, sparseArray);
        if (A09 == null) {
            return;
        }
        CC cc = A09.A07;
        long j = cc.A06;
        A09.A04();
        if (vl.A07(AbstractC0283Bp.A1H) != null && (i & 2) == 0) {
            j = A02(vl.A07(AbstractC0283Bp.A1H).A00);
        }
        A0N(vl, A09, j, i);
        CB A00 = A09.A05.A00(cc.A07.A02);
        VK A07 = vl.A07(AbstractC0283Bp.A0u);
        if (A07 != null) {
            A0P(A00, A07.A00, cc);
        }
        VK A072 = vl.A07(AbstractC0283Bp.A0t);
        if (A072 != null) {
            A0S(A072.A00, cc);
        }
        VK A073 = vl.A07(AbstractC0283Bp.A10);
        if (A073 != null) {
            A0T(A073.A00, cc);
        }
        VK A074 = vl.A07(AbstractC0283Bp.A0x);
        VK A075 = vl.A07(AbstractC0283Bp.A11);
        if (A074 != null && A075 != null) {
            A0V(A074.A00, A075.A00, A00 != null ? A00.A02 : null, cc);
        }
        int size = vl.A02.size();
        for (int i2 = 0; i2 < size; i2++) {
            VK vk = vl.A02.get(i2);
            int i3 = ((AbstractC0283Bp) vk).A00;
            int i4 = AbstractC0283Bp.A1Q;
            if (A0Y[7].charAt(27) != 'r') {
                throw new RuntimeException();
            }
            String[] strArr = A0Y;
            strArr[6] = "tWuQt3qCpORkhzaHtCNFkUwj420xxTd";
            strArr[4] = "yKRRCTery0iDoE3P4";
            if (i3 == i4) {
                A0U(vk.A00, cc, bArr);
            }
        }
    }

    /* JADX WARN: Failed to parse debug info
    java.lang.ArrayIndexOutOfBoundsException: Index 10 out of bounds for length 10
    	at jadx.plugins.input.dex.sections.debuginfo.DebugInfoParser.startVar(DebugInfoParser.java:203)
    	at jadx.plugins.input.dex.sections.debuginfo.DebugInfoParser.process(DebugInfoParser.java:125)
    	at jadx.plugins.input.dex.sections.DexCodeReader.getDebugInfo(DexCodeReader.java:118)
    	at jadx.core.dex.nodes.MethodNode.getDebugInfo(MethodNode.java:567)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.visit(DebugInfoAttachVisitor.java:39)
     */
    public static void A0P(CB cb, HV hv, CC cc) throws C9R {
        int i = cb.A00;
        hv.A0Y(8);
        if ((AbstractC0283Bp.A00(hv.A08()) & 1) == 1) {
            hv.A0Z(8);
        }
        int A0E = hv.A0E();
        int A0H = hv.A0H();
        String[] strArr = A0Y;
        if (strArr[6].length() == strArr[4].length()) {
            throw new RuntimeException();
        }
        A0Y[3] = "qY4fk5";
        if (A0H != cc.A00) {
            throw new C9R(A0A(290, 17, j.AppCompatTheme_windowNoTitle) + A0H + A0A(0, 2, 53) + cc.A00);
        }
        int i2 = 0;
        if (A0E == 0) {
            boolean[] zArr = cc.A0H;
            for (int i3 = 0; i3 < A0H; i3++) {
                int A0E2 = hv.A0E();
                i2 += A0E2;
                zArr[i3] = A0E2 > i;
            }
        } else {
            i2 = 0 + (A0E * A0H);
            Arrays.fill(cc.A0H, 0, A0H, A0E > i);
        }
        cc.A02(i2);
    }

    /* JADX WARN: Failed to parse debug info
    java.lang.ArrayIndexOutOfBoundsException: Index 18 out of bounds for length 15
    	at jadx.plugins.input.dex.sections.debuginfo.DebugInfoParser.startVar(DebugInfoParser.java:203)
    	at jadx.plugins.input.dex.sections.debuginfo.DebugInfoParser.process(DebugInfoParser.java:125)
    	at jadx.plugins.input.dex.sections.DexCodeReader.getDebugInfo(DexCodeReader.java:118)
    	at jadx.core.dex.nodes.MethodNode.getDebugInfo(MethodNode.java:567)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.visit(DebugInfoAttachVisitor.java:39)
     */
    public static void A0V(HV hv, HV hv2, String str, CC cc) throws C9R {
        hv.A0Y(8);
        int A08 = hv.A08();
        if (hv.A08() != A0a) {
            return;
        }
        if (AbstractC0283Bp.A01(A08) == 1) {
            hv.A0Z(4);
        }
        int A082 = hv.A08();
        String[] strArr = A0Y;
        if (strArr[6].length() == strArr[4].length()) {
            throw new RuntimeException();
        }
        A0Y[3] = "cve2FA";
        if (A082 != 1) {
            throw new C9R(A0A(50, 39, j.AppCompatTheme_windowNoTitle));
        }
        hv2.A0Y(8);
        int A083 = hv2.A08();
        if (hv2.A08() != A0a) {
            return;
        }
        int A01 = AbstractC0283Bp.A01(A083);
        if (A0Y[1].length() != 3) {
            throw new RuntimeException();
        }
        A0Y[7] = "iX8BjoZjE8Q6Igd9BCVMMRG15zWrcCbA";
        if (A01 == 1) {
            if (hv2.A0M() == 0) {
                throw new C9R(A0A(609, 55, 42));
            }
        } else if (A01 >= 2) {
            hv2.A0Z(4);
        }
        if (hv2.A0M() != 1) {
            throw new C9R(A0A(89, 39, 21));
        }
        hv2.A0Z(1);
        int A0E = hv2.A0E();
        int i = (A0E & 240) >> 4;
        int i2 = A0E & 15;
        boolean z = hv2.A0E() == 1;
        if (z) {
            int A0E2 = hv2.A0E();
            byte[] bArr = new byte[16];
            hv2.A0c(bArr, 0, bArr.length);
            if (A0Y[7].charAt(27) != 'r') {
                throw new RuntimeException();
            }
            A0Y[0] = "v2evuoi5ipUorqJI1yS0NRy";
            byte[] bArr2 = null;
            if (z && A0E2 == 0) {
                int A0E3 = hv2.A0E();
                bArr2 = new byte[A0E3];
                hv2.A0c(bArr2, 0, A0E3);
            }
            cc.A0A = true;
            cc.A08 = new CB(z, str, A0E2, bArr, i, i2, bArr2);
        }
    }

    static {
        A0D();
        A0Z = new VG();
        A0a = C0430Hl.A08(A0A(682, 4, 24));
        A0c = new byte[]{-94, 57, 79, 82, 90, -101, 79, 20, -94, 68, 108, 66, 124, 100, -115, -12};
        A0b = Format.A02(null, A0A(664, 18, 55), Long.MAX_VALUE);
    }

    public VF() {
        this(0);
    }

    public VF(int i) {
        this(i, null);
    }

    public VF(int i, @Nullable C0426Hh c0426Hh) {
        this(i, c0426Hh, null, null);
    }

    public VF(int i, @Nullable C0426Hh c0426Hh, @Nullable CA ca, @Nullable DrmInitData drmInitData) {
        this(i, c0426Hh, ca, drmInitData, Collections.emptyList());
    }

    public VF(int i, @Nullable C0426Hh c0426Hh, @Nullable CA ca, @Nullable DrmInitData drmInitData, List<Format> closedCaptionFormats) {
        this(i, c0426Hh, ca, drmInitData, closedCaptionFormats, null);
    }

    public VF(int i, @Nullable C0426Hh c0426Hh, @Nullable CA ca, @Nullable DrmInitData drmInitData, List<Format> closedCaptionFormats, @Nullable InterfaceC0279Ba interfaceC0279Ba) {
        this.A0J = (ca != null ? 8 : 0) | i;
        this.A0S = c0426Hh;
        this.A0N = ca;
        this.A0L = drmInitData;
        this.A0V = Collections.unmodifiableList(closedCaptionFormats);
        this.A0M = interfaceC0279Ba;
        this.A0O = new HV(16);
        this.A0R = new HV(HR.A03);
        this.A0Q = new HV(5);
        this.A0P = new HV();
        this.A0W = new byte[16];
        this.A0T = new ArrayDeque<>();
        this.A0U = new ArrayDeque<>();
        this.A0K = new SparseArray<>();
        this.A08 = -9223372036854775807L;
        this.A0A = -9223372036854775807L;
        this.A0B = -9223372036854775807L;
        A0B();
    }

    public static long A01(HV hv) {
        hv.A0Y(8);
        int fullAtom = hv.A08();
        return AbstractC0283Bp.A01(fullAtom) == 0 ? hv.A0M() : hv.A0N();
    }

    public static long A02(HV hv) {
        hv.A0Y(8);
        int fullAtom = hv.A08();
        int version = AbstractC0283Bp.A01(fullAtom);
        return version == 1 ? hv.A0N() : hv.A0M();
    }

    public static Pair<Integer, C0289Bv> A03(HV hv) {
        hv.A0Y(12);
        int defaultSampleDescriptionIndex = hv.A08();
        int trackId = hv.A0H();
        int defaultSampleFlags = hv.A0H();
        int defaultSampleSize = hv.A0H();
        int defaultSampleDuration = hv.A08();
        return Pair.create(Integer.valueOf(defaultSampleDescriptionIndex), new C0289Bv(trackId - 1, defaultSampleFlags, defaultSampleSize, defaultSampleDuration));
    }

    public static DrmInitData A05(List<VK> list) {
        ArrayList arrayList = null;
        int size = list.size();
        for (int i = 0; i < size; i++) {
            VK vk = list.get(i);
            int leafChildrenSize = ((AbstractC0283Bp) vk).A00;
            if (leafChildrenSize == AbstractC0283Bp.A0r) {
                if (arrayList == null) {
                    arrayList = new ArrayList();
                }
                byte[] bArr = vk.A00.A00;
                UUID A03 = C7.A03(bArr);
                if (A03 == null) {
                    Log.w(A0A(128, 22, 14), A0A(437, 42, j.AppCompatTheme_tooltipFrameBackground));
                } else {
                    arrayList.add(new DrmInitData.SchemeData(A03, A0A(696, 9, 30), bArr));
                }
            }
        }
        if (arrayList == null) {
            return null;
        }
        return new DrmInitData(arrayList);
    }

    private C0289Bv A06(SparseArray<C0289Bv> sparseArray, int i) {
        if (sparseArray.size() == 1) {
            if (A0Y[7].charAt(27) != 'r') {
                throw new RuntimeException();
            }
            A0Y[3] = "nw8rk4";
            return sparseArray.valueAt(0);
        }
        return (C0289Bv) H6.A01(sparseArray.get(i));
    }

    public static C1 A07(SparseArray<C1> sparseArray) {
        C1 c1 = null;
        long j = Long.MAX_VALUE;
        int size = sparseArray.size();
        for (int i = 0; i < size; i++) {
            C1 valueAt = sparseArray.valueAt(i);
            if (valueAt.A02 != valueAt.A07.A02) {
                long nextTrackRunOffset = valueAt.A07.A0G[valueAt.A02];
                if (nextTrackRunOffset < j) {
                    c1 = valueAt;
                    j = nextTrackRunOffset;
                }
            }
        }
        return c1;
    }

    @Nullable
    public static C1 A08(SparseArray<C1> sparseArray, int i) {
        if (sparseArray.size() == 1) {
            return sparseArray.valueAt(0);
        }
        C1 c1 = sparseArray.get(i);
        if (A0Y[0].length() != 21) {
            A0Y[1] = "fYJ";
            return c1;
        }
        throw new RuntimeException();
    }

    private void A0B() {
        this.A02 = 0;
        this.A00 = 0;
    }

    /* JADX WARN: Incorrect condition in loop: B:17:0x005a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private void A0C() {
        /*
            r6 = this;
            com.facebook.ads.redexgen.X.Ba[] r0 = r6.A0I
            if (r0 != 0) goto L48
            r0 = 2
            com.facebook.ads.redexgen.X.Ba[] r0 = new com.facebook.ads.redexgen.X.InterfaceC0279Ba[r0]
            r6.A0I = r0
            r5 = 0
            com.facebook.ads.redexgen.X.Ba r2 = r6.A0M
            if (r2 == 0) goto L15
            com.facebook.ads.redexgen.X.Ba[] r1 = r6.A0I
            int r0 = r5 + 1
            r1[r5] = r2
            r5 = r0
        L15:
            int r0 = r6.A0J
            r4 = 4
            r0 = r0 & r4
            if (r0 == 0) goto L2e
            com.facebook.ads.redexgen.X.Ba[] r3 = r6.A0I
            int r2 = r5 + 1
            com.facebook.ads.redexgen.X.BQ r1 = r6.A0C
            android.util.SparseArray<com.facebook.ads.redexgen.X.C1> r0 = r6.A0K
            int r0 = r0.size()
            com.facebook.ads.redexgen.X.Ba r0 = r1.AF2(r0, r4)
            r3[r5] = r0
            r5 = r2
        L2e:
            com.facebook.ads.redexgen.X.Ba[] r0 = r6.A0I
            java.lang.Object[] r0 = java.util.Arrays.copyOf(r0, r5)
            com.facebook.ads.redexgen.X.Ba[] r0 = (com.facebook.ads.redexgen.X.InterfaceC0279Ba[]) r0
            r6.A0I = r0
            com.facebook.ads.redexgen.X.Ba[] r4 = r6.A0I
            int r3 = r4.length
            r2 = 0
        L3c:
            if (r2 >= r3) goto L48
            r1 = r4[r2]
            com.facebook.ads.internal.exoplayer2.Format r0 = com.facebook.ads.redexgen.X.VF.A0b
            r1.A5T(r0)
            int r2 = r2 + 1
            goto L3c
        L48:
            com.facebook.ads.redexgen.X.Ba[] r0 = r6.A0H
            if (r0 != 0) goto L9d
            java.util.List<com.facebook.ads.internal.exoplayer2.Format> r0 = r6.A0V
            int r0 = r0.size()
            com.facebook.ads.redexgen.X.Ba[] r0 = new com.facebook.ads.redexgen.X.InterfaceC0279Ba[r0]
            r6.A0H = r0
            r3 = 0
        L57:
            com.facebook.ads.redexgen.X.Ba[] r0 = r6.A0H
            int r0 = r0.length
            if (r3 >= r0) goto L9d
            com.facebook.ads.redexgen.X.BQ r2 = r6.A0C
            android.util.SparseArray<com.facebook.ads.redexgen.X.C1> r0 = r6.A0K
            int r0 = r0.size()
            int r1 = r0 + 1
            int r1 = r1 + r3
            r0 = 3
            com.facebook.ads.redexgen.X.Ba r1 = r2.AF2(r1, r0)
            java.util.List<com.facebook.ads.internal.exoplayer2.Format> r0 = r6.A0V
            java.lang.Object r0 = r0.get(r3)
            com.facebook.ads.internal.exoplayer2.Format r0 = (com.facebook.ads.internal.exoplayer2.Format) r0
            r1.A5T(r0)
            com.facebook.ads.redexgen.X.Ba[] r0 = r6.A0H
            r0[r3] = r1
            java.lang.String[] r2 = com.facebook.ads.redexgen.X.VF.A0Y
            r0 = 6
            r1 = r2[r0]
            r0 = 4
            r0 = r2[r0]
            int r1 = r1.length()
            int r0 = r0.length()
            if (r1 == r0) goto L97
            java.lang.String[] r2 = com.facebook.ads.redexgen.X.VF.A0Y
            java.lang.String r1 = "E0z9VN5IoStoNoHPwfepvpkncforV8p8"
            r0 = 7
            r2[r0] = r1
            int r3 = r3 + 1
            goto L57
        L97:
            java.lang.RuntimeException r0 = new java.lang.RuntimeException
            r0.<init>()
            throw r0
        L9d:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.ads.redexgen.X.VF.A0C():void");
    }

    private void A0E(long j) {
        while (!this.A0U.isEmpty()) {
            C0 removeFirst = this.A0U.removeFirst();
            this.A03 -= removeFirst.A00;
            long j2 = j + removeFirst.A01;
            C0426Hh c0426Hh = this.A0S;
            if (c0426Hh != null) {
                j2 = c0426Hh.A06(j2);
            }
            for (InterfaceC0279Ba interfaceC0279Ba : this.A0I) {
                interfaceC0279Ba.AE9(j2, 1, removeFirst.A00, this.A03, null);
            }
        }
    }

    private void A0F(long j) throws C9R {
        while (!this.A0T.isEmpty() && this.A0T.peek().A00 == j) {
            A0I(this.A0T.pop());
        }
        A0B();
    }

    private void A0G(BP bp) throws IOException, InterruptedException {
        int i = ((int) this.A07) - this.A00;
        HV hv = this.A0E;
        if (hv != null) {
            bp.readFully(hv.A00, 8, i);
            int atomPayloadSize = this.A01;
            A0O(new VK(atomPayloadSize, this.A0E), bp.A7D());
        } else {
            bp.AEk(i);
        }
        A0F(bp.A7D());
    }

    private void A0H(BP bp) throws IOException, InterruptedException {
        C1 c1 = null;
        long j = Long.MAX_VALUE;
        int size = this.A0K.size();
        for (int i = 0; i < size; i++) {
            C1 nextTrackBundle = this.A0K.valueAt(i);
            CC cc = nextTrackBundle.A07;
            if (cc.A0B) {
                int i2 = (cc.A04 > j ? 1 : (cc.A04 == j ? 0 : -1));
                if (A0Y[2].charAt(18) != 'K') {
                    throw new RuntimeException();
                }
                A0Y[3] = "TcDom5";
                if (i2 < 0) {
                    j = cc.A04;
                    c1 = this.A0K.valueAt(i);
                }
            }
        }
        if (c1 == null) {
            if (A0Y[3].length() != 6) {
                throw new RuntimeException();
            }
            A0Y[2] = "BU1FqSGZUKIp3lmSYzKBGxc2Z86jKcpe";
            this.A02 = 3;
            return;
        }
        long A7D = j - bp.A7D();
        if (A0Y[3].length() != 6) {
            throw new RuntimeException();
        }
        A0Y[0] = "Cvsa72edMITB5GhT";
        int i3 = (int) A7D;
        if (i3 >= 0) {
            bp.AEk(i3);
            c1.A07.A04(bp);
            return;
        }
        throw new C9R(A0A(307, 39, 66));
    }

    private void A0I(VL vl) throws C9R {
        if (((AbstractC0283Bp) vl).A00 == AbstractC0283Bp.A0j) {
            A0K(vl);
        } else if (((AbstractC0283Bp) vl).A00 == AbstractC0283Bp.A0i) {
            A0J(vl);
        } else if (this.A0T.isEmpty()) {
        } else {
            ArrayDeque<VL> arrayDeque = this.A0T;
            if (A0Y[1].length() != 3) {
                throw new RuntimeException();
            }
            A0Y[7] = "6RjYlEZz613sKxZIpZ2APlvoVeArWnyB";
            arrayDeque.peek().A08(vl);
        }
    }

    private void A0J(VL vl) throws C9R {
        A0L(vl, this.A0K, this.A0J, this.A0W);
        DrmInitData A05 = this.A0L != null ? null : A05(vl.A02);
        if (A05 != null) {
            int i = this.A0K.size();
            for (int trackCount = 0; trackCount < i; trackCount++) {
                this.A0K.valueAt(trackCount).A06(A05);
            }
        }
        if (this.A0A != -9223372036854775807L) {
            int size = this.A0K.size();
            for (int i2 = 0; i2 < size; i2++) {
                this.A0K.valueAt(i2).A05(this.A0A);
            }
            this.A0A = -9223372036854775807L;
        }
    }

    public static void A0L(VL vl, SparseArray<C1> sparseArray, int i, byte[] bArr) throws C9R {
        int size = vl.A01.size();
        for (int i2 = 0; i2 < size; i2++) {
            VL child = vl.A01.get(i2);
            int i3 = ((AbstractC0283Bp) child).A00;
            int moofContainerChildrenSize = AbstractC0283Bp.A1K;
            if (i3 == moofContainerChildrenSize) {
                A0M(child, sparseArray, i, bArr);
            }
        }
    }

    public static void A0N(VL vl, C1 c1, long j, int trunIndex) {
        int i = 0;
        int trunSampleCount = 0;
        List<VK> list = vl.A02;
        int size = list.size();
        for (int i2 = 0; i2 < size; i2++) {
            VK vk = list.get(i2);
            int i3 = ((AbstractC0283Bp) vk).A00;
            int i4 = AbstractC0283Bp.A1N;
            if (A0Y[2].charAt(18) != 'K') {
                throw new RuntimeException();
            }
            A0Y[0] = "HX3CrwnoNkNpp8Diq6RFqVXtJKh";
            if (i3 == i4) {
                HV trunData = vk.A00;
                trunData.A0Y(12);
                int A0H = trunData.A0H();
                if (A0H > 0) {
                    trunSampleCount += A0H;
                    i++;
                }
            }
        }
        c1.A02 = 0;
        c1.A00 = 0;
        c1.A01 = 0;
        c1.A07.A03(i, trunSampleCount);
        int i5 = 0;
        int i6 = 0;
        int trunStartPosition = A0Y[7].charAt(27);
        if (trunStartPosition == 114) {
            A0Y[1] = "K2a";
        }
        for (int i7 = 0; i7 < size; i7++) {
            VK vk2 = list.get(i7);
            int trunIndex2 = ((AbstractC0283Bp) vk2).A00;
            if (trunIndex2 == AbstractC0283Bp.A1N) {
                int trunIndex3 = i5 + 1;
                i6 = A00(c1, i5, j, trunIndex, vk2.A00, i6);
                i5 = trunIndex3;
            }
        }
    }

    private void A0O(VK vk, long j) throws C9R {
        if (!this.A0T.isEmpty()) {
            this.A0T.peek().A09(vk);
        } else if (((AbstractC0283Bp) vk).A00 == AbstractC0283Bp.A12) {
            Pair<Long, C0777Vg> A04 = A04(vk.A00, j);
            this.A0B = ((Long) A04.first).longValue();
            this.A0C.AEE((BX) A04.second);
            this.A0F = true;
        } else if (((AbstractC0283Bp) vk).A00 != AbstractC0283Bp.A0P) {
        } else {
            A0Q(vk.A00);
        }
    }

    private void A0Q(HV hv) {
        InterfaceC0279Ba[] interfaceC0279BaArr;
        InterfaceC0279Ba[] interfaceC0279BaArr2 = this.A0I;
        if (interfaceC0279BaArr2 == null || interfaceC0279BaArr2.length == 0) {
            return;
        }
        hv.A0Y(12);
        int sampleSize = hv.A04();
        hv.A0Q();
        hv.A0Q();
        long A0M = hv.A0M();
        long timescale = hv.A0M();
        long A0F = C0430Hl.A0F(timescale, 1000000L, A0M);
        for (InterfaceC0279Ba interfaceC0279Ba : this.A0I) {
            hv.A0Y(12);
            interfaceC0279Ba.AE8(hv, sampleSize);
        }
        long j = this.A0B;
        if (j != -9223372036854775807L) {
            long j2 = j + A0F;
            C0426Hh c0426Hh = this.A0S;
            if (c0426Hh != null) {
                j2 = c0426Hh.A06(j2);
            }
            for (InterfaceC0279Ba interfaceC0279Ba2 : this.A0I) {
                interfaceC0279Ba2.AE9(j2, 1, sampleSize, 0, null);
            }
            return;
        }
        this.A0U.addLast(new C0(A0F, sampleSize));
        this.A03 += sampleSize;
    }

    public static void A0R(HV hv, int i, CC cc) throws C9R {
        hv.A0Y(i + 8);
        int fullAtom = hv.A08();
        int flags = AbstractC0283Bp.A00(fullAtom);
        int fullAtom2 = flags & 1;
        if (fullAtom2 == 0) {
            int fullAtom3 = flags & 2;
            boolean z = fullAtom3 != 0;
            int sampleCount = hv.A0H();
            int i2 = cc.A00;
            if (A0Y[2].charAt(18) != 75) {
                throw new RuntimeException();
            }
            String[] strArr = A0Y;
            strArr[6] = "UNCiZzJs5PDRpvixsYfSSk1mhxuZgiq";
            strArr[4] = "wrSUtL8XPGusZqeHm";
            if (sampleCount == i2) {
                Arrays.fill(cc.A0H, 0, sampleCount, z);
                int fullAtom4 = hv.A04();
                cc.A02(fullAtom4);
                cc.A05(hv);
                return;
            }
            StringBuilder sb = new StringBuilder();
            sb.append(A0A(290, 17, j.AppCompatTheme_windowNoTitle));
            sb.append(sampleCount);
            sb.append(A0A(0, 2, 53));
            int fullAtom5 = cc.A00;
            sb.append(fullAtom5);
            throw new C9R(sb.toString());
        }
        throw new C9R(A0A(381, 56, 78));
    }

    public static void A0S(HV hv, CC cc) throws C9R {
        hv.A0Y(8);
        int A08 = hv.A08();
        if ((AbstractC0283Bp.A00(A08) & 1) == 1) {
            hv.A0Z(8);
        }
        int A0H = hv.A0H();
        int fullAtom = A0Y[3].length();
        if (fullAtom != 6) {
            throw new RuntimeException();
        }
        A0Y[3] = "xMtqR0";
        if (A0H == 1) {
            int entryCount = AbstractC0283Bp.A01(A08);
            long A0M = cc.A04 + (entryCount == 0 ? hv.A0M() : hv.A0N());
            String[] strArr = A0Y;
            String str = strArr[6];
            String str2 = strArr[4];
            int fullAtom2 = str.length();
            int entryCount2 = str2.length();
            if (fullAtom2 != entryCount2) {
                String[] strArr2 = A0Y;
                strArr2[6] = "QBYjlSuWWzNHcmXjWc7avhw4MqaHk82";
                strArr2[4] = "P5zbNSbq1MUS3wdHf";
                cc.A04 = A0M;
                return;
            }
            A0Y[7] = "vg5EJJPWiTbIFzTVTJFrvfHkMClrP8RJ";
            cc.A04 = A0M;
            return;
        }
        throw new C9R(A0A(552, 29, 95) + A0H);
    }

    public static void A0T(HV hv, CC cc) throws C9R {
        A0R(hv, 0, cc);
    }

    public static void A0U(HV hv, CC cc, byte[] bArr) throws C9R {
        hv.A0Y(8);
        hv.A0c(bArr, 0, 16);
        if (!Arrays.equals(bArr, A0c)) {
            return;
        }
        A0R(hv, 16, cc);
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x0032, code lost:
        if (r4 != r3) goto L13;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x0036, code lost:
        if (r4 == com.facebook.ads.redexgen.X.AbstractC0283Bp.A0h) goto L30;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x003a, code lost:
        if (r4 == com.facebook.ads.redexgen.X.AbstractC0283Bp.A16) goto L30;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x003e, code lost:
        if (r4 == com.facebook.ads.redexgen.X.AbstractC0283Bp.A0i) goto L30;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x0042, code lost:
        if (r4 == com.facebook.ads.redexgen.X.AbstractC0283Bp.A1K) goto L30;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x0044, code lost:
        r3 = com.facebook.ads.redexgen.X.AbstractC0283Bp.A0m;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x0050, code lost:
        if (com.facebook.ads.redexgen.X.VF.A0Y[5].length() == 1) goto L23;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x005a, code lost:
        if (r4 != r3) goto L13;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x005d, code lost:
        com.facebook.ads.redexgen.X.VF.A0Y[5] = "P";
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x0064, code lost:
        if (r4 == r3) goto L30;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x0068, code lost:
        if (r4 != com.facebook.ads.redexgen.X.AbstractC0283Bp.A0N) goto L27;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x006c, code lost:
        return false;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static boolean A0W(int r4) {
        /*
            int r0 = com.facebook.ads.redexgen.X.AbstractC0283Bp.A0j
            if (r4 == r0) goto L6a
            int r3 = com.facebook.ads.redexgen.X.AbstractC0283Bp.A1L
            java.lang.String[] r1 = com.facebook.ads.redexgen.X.VF.A0Y
            r0 = 2
            r1 = r1[r0]
            r0 = 18
            char r1 = r1.charAt(r0)
            r0 = 75
            if (r1 == r0) goto L1b
        L15:
            java.lang.RuntimeException r0 = new java.lang.RuntimeException
            r0.<init>()
            throw r0
        L1b:
            java.lang.String[] r2 = com.facebook.ads.redexgen.X.VF.A0Y
            java.lang.String r1 = "T3RhZdPh4OhUklIpt3KHsdu4Qu4SXFxX"
            r0 = 2
            r2[r0] = r1
            if (r4 == r3) goto L6a
            int r3 = com.facebook.ads.redexgen.X.AbstractC0283Bp.A0d
            java.lang.String[] r1 = com.facebook.ads.redexgen.X.VF.A0Y
            r0 = 1
            r0 = r1[r0]
            int r1 = r0.length()
            r0 = 3
            if (r1 == r0) goto L53
            if (r4 == r3) goto L6a
        L34:
            int r0 = com.facebook.ads.redexgen.X.AbstractC0283Bp.A0h
            if (r4 == r0) goto L6a
            int r0 = com.facebook.ads.redexgen.X.AbstractC0283Bp.A16
            if (r4 == r0) goto L6a
            int r0 = com.facebook.ads.redexgen.X.AbstractC0283Bp.A0i
            if (r4 == r0) goto L6a
            int r0 = com.facebook.ads.redexgen.X.AbstractC0283Bp.A1K
            if (r4 == r0) goto L6a
            int r3 = com.facebook.ads.redexgen.X.AbstractC0283Bp.A0m
            java.lang.String[] r1 = com.facebook.ads.redexgen.X.VF.A0Y
            r0 = 5
            r0 = r1[r0]
            int r1 = r0.length()
            r0 = 1
            if (r1 == r0) goto L5d
            goto L15
        L53:
            java.lang.String[] r2 = com.facebook.ads.redexgen.X.VF.A0Y
            java.lang.String r1 = "W"
            r0 = 0
            r2[r0] = r1
            if (r4 == r3) goto L6a
            goto L34
        L5d:
            java.lang.String[] r2 = com.facebook.ads.redexgen.X.VF.A0Y
            java.lang.String r1 = "P"
            r0 = 5
            r2[r0] = r1
            if (r4 == r3) goto L6a
            int r0 = com.facebook.ads.redexgen.X.AbstractC0283Bp.A0N
            if (r4 != r0) goto L6c
        L6a:
            r0 = 1
        L6b:
            return r0
        L6c:
            r0 = 0
            goto L6b
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.ads.redexgen.X.VF.A0W(int):boolean");
    }

    public static boolean A0X(int i) {
        return i == AbstractC0283Bp.A0V || i == AbstractC0283Bp.A0c || i == AbstractC0283Bp.A0n || i == AbstractC0283Bp.A12 || i == AbstractC0283Bp.A1A || i == AbstractC0283Bp.A1H || i == AbstractC0283Bp.A1I || i == AbstractC0283Bp.A1J || i == AbstractC0283Bp.A1M || i == AbstractC0283Bp.A1N || i == AbstractC0283Bp.A0r || i == AbstractC0283Bp.A0u || i == AbstractC0283Bp.A0t || i == AbstractC0283Bp.A10 || i == AbstractC0283Bp.A1Q || i == AbstractC0283Bp.A0x || i == AbstractC0283Bp.A11 || i == AbstractC0283Bp.A0O || i == AbstractC0283Bp.A0f || i == AbstractC0283Bp.A0P;
    }

    /* JADX WARN: Code restructure failed: missing block: B:37:0x00e5, code lost:
        if (r10.A0F == false) goto L25;
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x00e7, code lost:
        r10.A0C.AEE(new com.facebook.ads.redexgen.X.C0772Vb(r10.A08, r2));
        r10.A0F = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x0100, code lost:
        if (com.facebook.ads.redexgen.X.VF.A0Y[3].length() == 6) goto L30;
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x0102, code lost:
        r10.A02 = 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x0104, code lost:
        return true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x0110, code lost:
        if (r10.A0F == false) goto L25;
     */
    /* JADX WARN: Code restructure failed: missing block: B:46:0x0113, code lost:
        com.facebook.ads.redexgen.X.VF.A0Y[2] = "kMQb8Kdhh0k2oCY1DKK8Lkjm8envfnKE";
        r10.A02 = 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:47:0x011c, code lost:
        return true;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private boolean A0Y(com.facebook.ads.redexgen.X.BP r11) throws java.io.IOException, java.lang.InterruptedException {
        /*
            Method dump skipped, instructions count: 476
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.ads.redexgen.X.VF.A0Y(com.facebook.ads.redexgen.X.BP):boolean");
    }

    /* JADX WARN: Multi-variable type inference failed */
    private boolean A0Z(BP bp) throws IOException, InterruptedException {
        CB A00;
        int nalUnitLengthFieldLengthDiff;
        int sampleIndex = 4;
        int i = 1;
        int i2 = 0;
        if (this.A02 == 3) {
            if (this.A0D == null) {
                C1 A07 = A07(this.A0K);
                if (A07 == null) {
                    int A7D = (int) (this.A09 - bp.A7D());
                    if (A7D >= 0) {
                        bp.AEk(A7D);
                        A0B();
                        return false;
                    }
                    throw new C9R(A0A(346, 35, 12));
                }
                int A7D2 = (int) (A07.A07.A0G[A07.A02] - bp.A7D());
                if (A7D2 < 0) {
                    Log.w(A0A(128, 22, 14), A0A(150, 40, 24));
                    A7D2 = 0;
                }
                bp.AEk(A7D2);
                this.A0D = A07;
            }
            this.A06 = this.A0D.A07.A0D[this.A0D.A01];
            if (this.A0D.A01 < this.A0D.A03) {
                bp.AEk(this.A06);
                this.A0D.A01();
                if (!this.A0D.A08()) {
                    this.A0D = null;
                }
                this.A02 = 3;
                return true;
            }
            C1 c1 = this.A0D;
            if (A0Y[3].length() != 6) {
                throw new RuntimeException();
            }
            A0Y[3] = "st8dZG";
            if (c1.A05.A02 == 1) {
                this.A06 -= 8;
                bp.AEk(8);
            }
            this.A04 = this.A0D.A03();
            this.A06 += this.A04;
            this.A02 = 4;
            this.A05 = 0;
        }
        CC cc = this.A0D.A07;
        CA ca = this.A0D.A05;
        InterfaceC0279Ba interfaceC0279Ba = this.A0D.A06;
        int i3 = this.A0D.A01;
        long A002 = cc.A00(i3) * 1000;
        C0426Hh c0426Hh = this.A0S;
        if (c0426Hh != null) {
            A002 = c0426Hh.A06(A002);
        }
        if (ca.A01 == 0) {
            while (true) {
                int i4 = this.A04;
                int i5 = this.A06;
                if (i4 >= i5) {
                    break;
                }
                this.A04 += interfaceC0279Ba.AE7(bp, i5 - i4, false);
            }
        } else {
            byte[] bArr = this.A0Q.A00;
            bArr[0] = 0;
            bArr[1] = 0;
            bArr[2] = 0;
            int i6 = ca.A01 + 1;
            int i7 = 4 - ca.A01;
            while (this.A04 < this.A06) {
                int nalUnitLengthFieldLengthDiff2 = this.A05;
                if (nalUnitLengthFieldLengthDiff2 == 0) {
                    bp.readFully(bArr, i7, i6);
                    this.A0Q.A0Y(i2);
                    this.A05 = this.A0Q.A0H() - i;
                    this.A0R.A0Y(i2);
                    interfaceC0279Ba.AE8(this.A0R, sampleIndex);
                    interfaceC0279Ba.AE8(this.A0Q, i);
                    this.A0G = this.A0H.length > 0 && HR.A0C(ca.A07.A0O, bArr[sampleIndex]);
                    this.A04 += 5;
                    this.A06 += i7;
                } else {
                    if (this.A0G) {
                        this.A0P.A0W(nalUnitLengthFieldLengthDiff2);
                        bp.readFully(this.A0P.A00, i2, this.A05);
                        interfaceC0279Ba.AE8(this.A0P, this.A05);
                        nalUnitLengthFieldLengthDiff = this.A05;
                        int A02 = HR.A02(this.A0P.A00, this.A0P.A07());
                        this.A0P.A0Y(A0A(686, 10, 13).equals(ca.A07.A0O) ? 1 : 0);
                        this.A0P.A0X(A02);
                        FU.A03(A002, this.A0P, this.A0H);
                    } else {
                        nalUnitLengthFieldLengthDiff = interfaceC0279Ba.AE7(bp, nalUnitLengthFieldLengthDiff2, false);
                    }
                    this.A04 += nalUnitLengthFieldLengthDiff;
                    this.A05 -= nalUnitLengthFieldLengthDiff;
                    sampleIndex = 4;
                    i = 1;
                    i2 = 0;
                }
            }
        }
        boolean z = cc.A0I[i3];
        BZ bz = null;
        int i8 = z;
        if (cc.A0A) {
            boolean z2 = (z ? 1 : 0) | true;
            if (cc.A08 != null) {
                A00 = cc.A08;
            } else {
                A00 = ca.A00(cc.A07.A02);
            }
            bz = A00.A01;
            i8 = z2;
        }
        int nalUnitPrefixLength = this.A06;
        interfaceC0279Ba.AE9(A002, i8, nalUnitPrefixLength, 0, bz);
        A0E(A002);
        if (!this.A0D.A08()) {
            this.A0D = null;
        }
        this.A02 = 3;
        return true;
    }

    @Override // com.facebook.ads.redexgen.X.BO
    public final void A8G(BQ bq) {
        this.A0C = bq;
        CA ca = this.A0N;
        if (ca != null) {
            C1 c1 = new C1(bq.AF2(0, ca.A03));
            c1.A07(this.A0N, new C0289Bv(0, 0, 0, 0));
            this.A0K.put(0, c1);
            A0C();
            this.A0C.A5C();
        }
    }

    @Override // com.facebook.ads.redexgen.X.BO
    public final int ADQ(BP bp, BV bv) throws IOException, InterruptedException {
        while (true) {
            int i = this.A02;
            if (i != 0) {
                if (A0Y[2].charAt(18) != 'K') {
                    throw new RuntimeException();
                }
                A0Y[2] = "Ub8SUYMnE0bQG8CZo0KwdlTNogw2mbM0";
                if (i == 1) {
                    A0G(bp);
                } else if (i != 2) {
                    boolean A0Z2 = A0Z(bp);
                    if (A0Y[7].charAt(27) == 'r') {
                        A0Y[5] = "b";
                        if (A0Z2) {
                            return 0;
                        }
                    } else if (A0Z2) {
                        return 0;
                    }
                } else {
                    A0H(bp);
                }
            } else if (!A0Y(bp)) {
                return -1;
            }
        }
    }

    @Override // com.facebook.ads.redexgen.X.BO
    public final void AED(long j, long j2) {
        int size = this.A0K.size();
        for (int i = 0; i < size; i++) {
            this.A0K.valueAt(i).A04();
        }
        this.A0U.clear();
        this.A03 = 0;
        this.A0A = j2;
        this.A0T.clear();
        A0B();
    }

    @Override // com.facebook.ads.redexgen.X.BO
    public final boolean AEm(BP bp) throws IOException, InterruptedException {
        return C8.A03(bp);
    }
}
