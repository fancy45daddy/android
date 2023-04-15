package com.facebook.ads.redexgen.X;

import a.a.j;
import com.facebook.ads.internal.exoplayer2.Format;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
/* loaded from: assets/audience_network.dex */
public final class V4 extends CK {
    public static byte[] A05;
    public static String[] A06 = {"Wz5kpI", "Qu4rCXWHGrZxyCLJ91nJYm9HwbbNBaAB", "jcFxTUNQ9mBSPSNjMUJY07wGvzfGS2C0", "wRecpgZSCUfboq2e81nqZjs5B", "2wu5mHiieWPMNFHGOEN0thCm6IWO9Xya", "P54DBngSoaRE6HRNMaW6H3WNUnBy8S0x", "u1kez8Hi5IXqm6uzKKQ3Ad3inAYpSzVQ", "yOq9tmgmQLY5WHe8QvjpkSndY9PHYfSY"};
    public int A00;
    public CM A01;
    public CO A02;
    public CQ A03;
    public boolean A04;

    /* JADX WARN: Failed to parse debug info
    java.lang.ArrayIndexOutOfBoundsException: Index 8 out of bounds for length 8
    	at jadx.plugins.input.dex.sections.debuginfo.DebugInfoParser.startVar(DebugInfoParser.java:203)
    	at jadx.plugins.input.dex.sections.debuginfo.DebugInfoParser.process(DebugInfoParser.java:125)
    	at jadx.plugins.input.dex.sections.DexCodeReader.getDebugInfo(DexCodeReader.java:118)
    	at jadx.core.dex.nodes.MethodNode.getDebugInfo(MethodNode.java:567)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.visit(DebugInfoAttachVisitor.java:39)
     */
    private final CM A02(HV hv) throws IOException {
        if (this.A03 == null) {
            this.A03 = CR.A04(hv);
            return null;
        }
        CO co = this.A02;
        if (A06[7].charAt(1) != 'O') {
            throw new RuntimeException();
        }
        String[] strArr = A06;
        strArr[3] = "EnVW7ymY5FyvrkHYKpVAYit2P";
        strArr[0] = "59lsEN";
        if (co == null) {
            this.A02 = CR.A03(hv);
            return null;
        }
        byte[] bArr = new byte[hv.A07()];
        System.arraycopy(hv.A00, 0, bArr, 0, hv.A07());
        CP[] A0C = CR.A0C(hv, this.A03.A05);
        return new CM(this.A03, this.A02, bArr, A0C, CR.A00(A0C.length - 1));
    }

    public static String A03(int i, int i2, int i3) {
        byte[] copyOfRange = Arrays.copyOfRange(A05, i, i + i2);
        for (int i4 = 0; i4 < copyOfRange.length; i4++) {
            copyOfRange[i4] = (byte) ((copyOfRange[i4] ^ i3) ^ 51);
        }
        return new String(copyOfRange);
    }

    public static void A04() {
        A05 = new byte[]{61, 41, 56, 53, 51, 115, 42, 51, 46, 62, 53, 47};
    }

    static {
        A04();
    }

    public static int A00(byte b2, int i, int i2) {
        return (b2 >> i2) & (255 >>> (8 - i));
    }

    public static int A01(byte b2, CM cm) {
        if (!cm.A04[A00(b2, cm.A00, 1)].A03) {
            int modeNumber = cm.A02.A03;
            return modeNumber;
        }
        int modeNumber2 = cm.A02.A04;
        return modeNumber2;
    }

    public static void A05(HV hv, long j) {
        hv.A0X(hv.A07() + 4);
        hv.A00[hv.A07() - 4] = (byte) (j & 255);
        hv.A00[hv.A07() - 3] = (byte) ((j >>> 8) & 255);
        hv.A00[hv.A07() - 2] = (byte) ((j >>> 16) & 255);
        hv.A00[hv.A07() - 1] = (byte) (255 & (j >>> 24));
    }

    public static boolean A06(HV hv) {
        try {
            return CR.A0A(1, hv, true);
        } catch (C9R unused) {
            return false;
        }
    }

    @Override // com.facebook.ads.redexgen.X.CK
    public final long A07(HV hv) {
        int i = 0;
        if ((hv.A00[0] & 1) == 1) {
            return -1L;
        }
        int A01 = A01(hv.A00[0], this.A01);
        if (this.A04) {
            int packetBlockSize = this.A00;
            i = (packetBlockSize + A01) / 4;
        }
        A05(hv, i);
        this.A04 = true;
        this.A00 = A01;
        return i;
    }

    @Override // com.facebook.ads.redexgen.X.CK
    public final void A08(long j) {
        super.A08(j);
        this.A04 = j != 0;
        CQ cq = this.A03;
        this.A00 = cq != null ? cq.A03 : 0;
    }

    @Override // com.facebook.ads.redexgen.X.CK
    public final void A09(boolean z) {
        super.A09(z);
        if (z) {
            this.A01 = null;
            this.A03 = null;
            this.A02 = null;
        }
        this.A00 = 0;
        this.A04 = false;
    }

    @Override // com.facebook.ads.redexgen.X.CK
    public final boolean A0A(HV hv, long j, CJ cj) throws IOException, InterruptedException {
        if (this.A01 != null) {
            String[] strArr = A06;
            if (strArr[5].charAt(2) != strArr[1].charAt(2)) {
                throw new RuntimeException();
            }
            A06[2] = "mO0nJ77ourwQSXFSw31DnFJId1Q3DZ07";
            return false;
        }
        this.A01 = A02(hv);
        if (this.A01 == null) {
            return true;
        }
        ArrayList arrayList = new ArrayList();
        arrayList.add(this.A01.A02.A09);
        arrayList.add(this.A01.A03);
        cj.A00 = Format.A07(null, A03(0, 12, j.AppCompatTheme_windowActionBar), null, this.A01.A02.A02, -1, this.A01.A02.A05, (int) this.A01.A02.A06, arrayList, null, 0, null);
        return true;
    }
}
