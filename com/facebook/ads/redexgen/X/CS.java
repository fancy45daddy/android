package com.facebook.ads.redexgen.X;

import a.a.j;
import android.util.Log;
import java.util.Arrays;
/* loaded from: assets/audience_network.dex */
public final class CS implements VN {
    public static byte[] A05;
    public static String[] A06 = {"BIb1Y700RDmcL7JF9Fn", "lk1IRtv8jtyAOasrQbC6YrAcVcFJ9", "71nm4ncPUlnpG5PegzVfukIlQIS7yUOP", "GCiVubWGa77lALd1Rb0", "chLweuz0mMl4FbXf4CPkrAmx2V", "NRv5J71Oqm94bOZTTnySoFkmq1d86Acc", "fJm6FHaelFV0WMwBghon3E9Gns2th", "ObA7Byd4NJEP2M9ay6ZCFLfldVonyLqe"};
    public final int A00;
    public final long A01;
    public final long A02;
    public final long A03;
    public final long[] A04;

    /* JADX WARN: Failed to parse debug info
    java.lang.ArrayIndexOutOfBoundsException: Index 19 out of bounds for length 19
    	at jadx.plugins.input.dex.sections.debuginfo.DebugInfoParser.process(DebugInfoParser.java:147)
    	at jadx.plugins.input.dex.sections.DexCodeReader.getDebugInfo(DexCodeReader.java:118)
    	at jadx.core.dex.nodes.MethodNode.getDebugInfo(MethodNode.java:567)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.visit(DebugInfoAttachVisitor.java:39)
     */
    public static CS A01(long j, long j2, BU bu, HV hv) {
        int A0H;
        int i = bu.A04;
        int i2 = bu.A03;
        int A08 = hv.A08();
        if ((A08 & 1) != 1 || (A0H = hv.A0H()) == 0) {
            return null;
        }
        long A0F = C0430Hl.A0F(A0H, i * 1000000, i2);
        if ((A08 & 6) != 6) {
            return new CS(j2, bu.A02, A0F);
        }
        long A0H2 = hv.A0H();
        long[] jArr = new long[100];
        for (int i3 = 0; i3 < 100; i3++) {
            jArr[i3] = hv.A0E();
        }
        if (j != -1 && j != j2 + A0H2) {
            Log.w(A02(27, 10, 96), A02(2, 25, 81) + j + A02(0, 2, 17) + (j2 + A0H2));
        }
        return new CS(j2, bu.A02, A0F, A0H2, jArr);
    }

    public static String A02(int i, int i2, int i3) {
        byte[] copyOfRange = Arrays.copyOfRange(A05, i, i + i2);
        int i4 = 0;
        while (true) {
            int length = copyOfRange.length;
            String[] strArr = A06;
            if (strArr[0].length() != strArr[3].length()) {
                throw new RuntimeException();
            }
            A06[5] = "xDmrh2CysME7FGpg0OVAAWQWrb1b5rm7";
            if (i4 >= length) {
                return new String(copyOfRange);
            }
            copyOfRange[i4] = (byte) ((copyOfRange[i4] ^ i3) ^ j.AppCompatTheme_toolbarNavigationButtonStyle);
            i4++;
        }
    }

    public static void A03() {
        String[] strArr = A06;
        if (strArr[6].length() != strArr[1].length()) {
            throw new RuntimeException();
        }
        A06[5] = "O7i6ampyP1fRYbe4QOmd9JyFrRUTDP0J";
        A05 = new byte[]{87, 91, 99, 114, 117, 124, 27, 95, 90, 79, 90, 27, 72, 82, 65, 94, 27, 86, 82, 72, 86, 90, 79, 88, 83, 1, 27, 82, 99, 100, 109, 89, 111, 111, 97, 111, 120};
    }

    /* JADX WARN: Failed to parse debug info
    java.lang.ArrayIndexOutOfBoundsException: Index 18 out of bounds for length 17
    	at jadx.plugins.input.dex.sections.debuginfo.DebugInfoParser.process(DebugInfoParser.java:147)
    	at jadx.plugins.input.dex.sections.DexCodeReader.getDebugInfo(DexCodeReader.java:118)
    	at jadx.core.dex.nodes.MethodNode.getDebugInfo(MethodNode.java:567)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.visit(DebugInfoAttachVisitor.java:39)
     */
    @Override // com.facebook.ads.redexgen.X.BX
    public final BW A7M(long j) {
        long[] jArr;
        double d;
        if (A8d()) {
            long A0E = C0430Hl.A0E(j, 0L, this.A03);
            double d2 = (A0E * 100.0d) / this.A03;
            if (d2 <= 0.0d) {
                d = 0.0d;
            } else if (d2 >= 100.0d) {
                d = 256.0d;
            } else {
                int i = (int) d2;
                double d3 = this.A04[i];
                if (A06[4].length() == 1) {
                    throw new RuntimeException();
                }
                A06[4] = "";
                d = d3 + (((i == 99 ? 256.0d : jArr[i + 1]) - d3) * (d2 - i));
            }
            return new BW(new BY(A0E, this.A02 + C0430Hl.A0E(Math.round((d / 256.0d) * this.A01), this.A00, this.A01 - 1)));
        }
        return new BW(new BY(0L, this.A02 + this.A00));
    }

    /* JADX WARN: Failed to parse debug info
    java.lang.ArrayIndexOutOfBoundsException: Index 15 out of bounds for length 15
    	at jadx.plugins.input.dex.sections.debuginfo.DebugInfoParser.restartVar(DebugInfoParser.java:193)
    	at jadx.plugins.input.dex.sections.debuginfo.DebugInfoParser.process(DebugInfoParser.java:141)
    	at jadx.plugins.input.dex.sections.DexCodeReader.getDebugInfo(DexCodeReader.java:118)
    	at jadx.core.dex.nodes.MethodNode.getDebugInfo(MethodNode.java:567)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.visit(DebugInfoAttachVisitor.java:39)
     */
    @Override // com.facebook.ads.redexgen.X.VN
    public final long A7c(long j) {
        long j2;
        long j3 = j - this.A02;
        if (A8d()) {
            long j4 = this.A00;
            if (A06[4].length() != 1) {
                A06[5] = "XBnVl7Vf2qRXlKywSNR3LOgq8shxQKKO";
                if (j3 <= j4) {
                    return 0L;
                }
                double d = (j3 * 256.0d) / this.A01;
                int A0B = C0430Hl.A0B(this.A04, (long) d, true, true);
                long A00 = A00(A0B);
                long j5 = this.A04[A0B];
                long A002 = A00(A0B + 1);
                return Math.round((A002 - A00) * (j5 == (A0B == 99 ? 256L : this.A04[A0B + 1]) ? 0.0d : (d - j5) / (j2 - j5))) + A00;
            }
            throw new RuntimeException();
        }
        return 0L;
    }

    static {
        A03();
    }

    public CS(long j, int i, long j2) {
        this(j, i, j2, -1L, null);
    }

    public CS(long j, int i, long j2, long j3, long[] jArr) {
        this.A02 = j;
        this.A00 = i;
        this.A03 = j2;
        this.A01 = j3;
        this.A04 = jArr;
    }

    private long A00(int i) {
        return (this.A03 * i) / 100;
    }

    @Override // com.facebook.ads.redexgen.X.BX
    public final long A6Q() {
        return this.A03;
    }

    @Override // com.facebook.ads.redexgen.X.BX
    public final boolean A8d() {
        return this.A04 != null;
    }
}
