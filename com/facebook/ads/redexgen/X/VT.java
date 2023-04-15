package com.facebook.ads.redexgen.X;

import a.a.j;
import com.facebook.ads.internal.exoplayer2.Format;
import java.util.Arrays;
/* loaded from: assets/audience_network.dex */
public final class VT extends Bc {
    public static byte[] A05;
    public static String[] A06 = {"HrBrUDmtAiHhEIFi", "ovhYl7NWEd171z8PJdmzSHTS5BmNRwGh", "O04BUWOaHdfjopELTyPlWCM73tUUR1GH", "jF3DEBpuUmaMt5XqjGdbc3EKLhdJIOP", "6wGSczOuIh6bVbI0f7FgwzIt", "67fT6B3p0kUWiMxqOkjfZNmnVryLDGGV", "w97Hra0FQmNyyw573", "JpIXAL9FgQ2FQzjAVAZn2BwWekNoW7nE"};
    public int A00;
    public int A01;
    public boolean A02;
    public final HV A03;
    public final HV A04;

    public static String A00(int i, int i2, int i3) {
        byte[] copyOfRange = Arrays.copyOfRange(A05, i, i + i2);
        for (int i4 = 0; i4 < copyOfRange.length; i4++) {
            copyOfRange[i4] = (byte) ((copyOfRange[i4] ^ i3) ^ 95);
        }
        return new String(copyOfRange);
    }

    public static void A01() {
        A05 = new byte[]{1, 62, 51, 50, 56, 119, 49, 56, 37, 58, 54, 35, 119, 57, 56, 35, 119, 36, 34, 39, 39, 56, 37, 35, 50, 51, 109, 119, 91, 68, 73, 72, 66, 2, 76, 91, 78};
    }

    /* JADX WARN: Failed to parse debug info
    java.lang.ArrayIndexOutOfBoundsException: Index 24 out of bounds for length 20
    	at jadx.plugins.input.dex.sections.debuginfo.DebugInfoParser.process(DebugInfoParser.java:147)
    	at jadx.plugins.input.dex.sections.DexCodeReader.getDebugInfo(DexCodeReader.java:118)
    	at jadx.core.dex.nodes.MethodNode.getDebugInfo(MethodNode.java:567)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.visit(DebugInfoAttachVisitor.java:39)
     */
    @Override // com.facebook.ads.redexgen.X.Bc
    public final void A0B(HV hv, long j) throws C9R {
        int A0E = hv.A0E();
        long A09 = j + (hv.A09() * 1000);
        if (A0E == 0 && !this.A02) {
            HV hv2 = new HV(new byte[hv.A04()]);
            hv.A0c(hv2.A00, 0, hv.A04());
            C0432Hn A00 = C0432Hn.A00(hv2);
            this.A01 = A00.A02;
            super.A00.A5T(Format.A03(null, A00(28, 9, j.AppCompatTheme_windowFixedHeightMajor), null, -1, -1, A00.A03, A00.A01, -1.0f, A00.A04, -1, A00.A00, null));
            this.A02 = true;
        } else if (A0E == 1 && this.A02) {
            byte[] bArr = this.A03.A00;
            bArr[0] = 0;
            bArr[1] = 0;
            bArr[2] = 0;
            int i = 4 - this.A01;
            int i2 = 0;
            while (hv.A04() > 0) {
                hv.A0c(this.A03.A00, i, this.A01);
                this.A03.A0Y(0);
                int A0H = this.A03.A0H();
                this.A04.A0Y(0);
                super.A00.AE8(this.A04, 4);
                super.A00.AE8(hv, A0H);
                i2 = i2 + 4 + A0H;
            }
            InterfaceC0279Ba interfaceC0279Ba = super.A00;
            int i3 = this.A00 != 1 ? 0 : 1;
            if (A06[6].length() == 3) {
                throw new RuntimeException();
            }
            String[] strArr = A06;
            strArr[1] = "SxoTsTEtYbkIpzmogJvkXCUruqqJ7knT";
            strArr[7] = "DX7TKSEUbLiNIzjv4P1HkLtMAUktYoJf";
            interfaceC0279Ba.AE9(A09, i3, i2, 0, null);
        }
    }

    static {
        A01();
    }

    public VT(InterfaceC0279Ba interfaceC0279Ba) {
        super(interfaceC0279Ba);
        this.A04 = new HV(HR.A03);
        this.A03 = new HV(4);
    }

    @Override // com.facebook.ads.redexgen.X.Bc
    public final boolean A0C(HV hv) throws VU {
        int A0E = hv.A0E();
        int header = A0E >> 4;
        int frameType = header & 15;
        int i = A0E & 15;
        if (i == 7) {
            this.A00 = frameType;
            return frameType != 5;
        }
        throw new VU(A00(0, 28, 8) + i);
    }
}
