package com.facebook.ads.redexgen.X;

import java.io.IOException;
/* loaded from: assets/audience_network.dex */
public class VA implements CH, BX {
    public static String[] A05 = {"yHlOCb8hYCUAGFBSR1KAQUls", "juuz7zvmjSSgkVuftf6ZJcl9wJUxZwvI", "9ebISPaipFvwM", "wI75rrP9DnRc8cDmDq6gSrlsVWTLnppT", "4k7x4VjdHI9zouAPkna3Rg4ZAMvyURep", "hKkxNrfwukp47", "HBJCJbTVml8ZYTmPInpazFF5", "aaJAILk2rqVBl9Nm5Oiw"};
    public long A00 = -1;
    public long A01 = -1;
    public long[] A02;
    public long[] A03;
    public final /* synthetic */ V9 A04;

    /* JADX WARN: Failed to parse debug info
    java.lang.ArrayIndexOutOfBoundsException: Index 14 out of bounds for length 13
    	at jadx.plugins.input.dex.sections.debuginfo.DebugInfoParser.process(DebugInfoParser.java:147)
    	at jadx.plugins.input.dex.sections.DexCodeReader.getDebugInfo(DexCodeReader.java:118)
    	at jadx.core.dex.nodes.MethodNode.getDebugInfo(MethodNode.java:567)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.visit(DebugInfoAttachVisitor.java:39)
     */
    @Override // com.facebook.ads.redexgen.X.BX
    public final BW A7M(long j) {
        int A0B = C0430Hl.A0B(this.A02, this.A04.A04(j), true, true);
        long A03 = this.A04.A03(this.A02[A0B]);
        BY by = new BY(A03, this.A00 + this.A03[A0B]);
        if (A03 < j) {
            long[] jArr = this.A02;
            if (A0B != jArr.length - 1) {
                return new BW(by, new BY(this.A04.A03(jArr[A0B + 1]), this.A00 + this.A03[A0B + 1]));
            }
        }
        return new BW(by);
    }

    public VA(V9 v9) {
        this.A04 = v9;
    }

    public final void A00(long j) {
        this.A00 = j;
    }

    public final void A01(HV hv) {
        hv.A0Z(1);
        int length = hv.A0G();
        int i = length / 18;
        this.A02 = new long[i];
        this.A03 = new long[i];
        for (int i2 = 0; i2 < i; i2++) {
            this.A02[i2] = hv.A0L();
            int numberOfSeekPoints = A05[4].charAt(31);
            if (numberOfSeekPoints != 112) {
                throw new RuntimeException();
            }
            String[] strArr = A05;
            strArr[5] = "w9Elnsp9xD6AY";
            strArr[2] = "jAQAlpm0y2ybi";
            this.A03[i2] = hv.A0L();
            hv.A0Z(2);
        }
    }

    @Override // com.facebook.ads.redexgen.X.CH
    public final BX A4S() {
        return this;
    }

    @Override // com.facebook.ads.redexgen.X.BX
    public final long A6Q() {
        HI hi;
        hi = this.A04.A01;
        return hi.A01();
    }

    @Override // com.facebook.ads.redexgen.X.BX
    public final boolean A8d() {
        return true;
    }

    @Override // com.facebook.ads.redexgen.X.CH
    public final long ADR(BP bp) throws IOException, InterruptedException {
        long j = this.A01;
        if (j >= 0) {
            long result = -(j + 2);
            this.A01 = -1L;
            return result;
        }
        return -1L;
    }

    @Override // com.facebook.ads.redexgen.X.CH
    public final long AEs(long j) {
        long A04 = this.A04.A04(j);
        long granule = this.A02[C0430Hl.A0B(this.A02, A04, true, true)];
        this.A01 = granule;
        return A04;
    }
}
