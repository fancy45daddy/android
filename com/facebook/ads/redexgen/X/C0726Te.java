package com.facebook.ads.redexgen.X;

import android.net.Uri;
import java.io.IOException;
/* renamed from: com.facebook.ads.redexgen.X.Te  reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public final class C0726Te implements GQ {
    public static String[] A04 = {"jlvJAgNeHWnJa3dPhRRd4EpOWMdB4X8x", "basxIWwUdkqjCj33WkHPX1XLcRlnz9UL", "EJ8jlkQXjQdwyr2PvL7NnSmrIKvSoKH9", "vRfpY4dXxgFvSAkqLCYO6SFKljAHuCzv", "ygfsCaK9ODNV1JdDOAbtF6as7T2mwjea", "kZYhIpAIarjEuyurYojB34Vr8jYSU6r4", "j4JmDL8bElApoe2AoNbHhKsqdvNkVwQT", "xpYPLrN7DnWMQWubBysNzF9"};
    public long A00;
    public boolean A01;
    public final GO A02;
    public final GQ A03;

    /* JADX WARN: Failed to parse debug info
    java.lang.ArrayIndexOutOfBoundsException: Index 18 out of bounds for length 16
    	at jadx.plugins.input.dex.sections.debuginfo.DebugInfoParser.process(DebugInfoParser.java:147)
    	at jadx.plugins.input.dex.sections.DexCodeReader.getDebugInfo(DexCodeReader.java:118)
    	at jadx.core.dex.nodes.MethodNode.getDebugInfo(MethodNode.java:567)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.visit(DebugInfoAttachVisitor.java:39)
     */
    @Override // com.facebook.ads.redexgen.X.GQ
    public final long ACq(GU gu) throws IOException {
        this.A00 = this.A03.ACq(gu);
        if (this.A00 == 0) {
            return 0L;
        }
        int i = (gu.A02 > (-1L) ? 1 : (gu.A02 == (-1L) ? 0 : -1));
        if (A04[4].charAt(25) != 'd') {
            A04[4] = "5eBqCtKJCfmd3joSOHW3VJl5u39JA8K8";
            if (i == 0 && this.A00 != -1) {
                gu = new GU(gu.A04, gu.A01, gu.A03, this.A00, gu.A05, gu.A00);
            }
            this.A01 = true;
            this.A02.ACs(gu);
            return this.A00;
        }
        throw new RuntimeException();
    }

    public C0726Te(GQ gq, GO go) {
        this.A03 = (GQ) H6.A01(gq);
        this.A02 = (GO) H6.A01(go);
    }

    @Override // com.facebook.ads.redexgen.X.GQ
    public final Uri A7i() {
        return this.A03.A7i();
    }

    @Override // com.facebook.ads.redexgen.X.GQ
    public final void close() throws IOException {
        try {
            this.A03.close();
        } finally {
            if (this.A01) {
                this.A01 = false;
                this.A02.close();
            }
        }
    }

    @Override // com.facebook.ads.redexgen.X.GQ
    public final int read(byte[] bArr, int i, int i2) throws IOException {
        if (this.A00 == 0) {
            return -1;
        }
        int read = this.A03.read(bArr, i, i2);
        if (read > 0) {
            this.A02.write(bArr, i, read);
            long j = this.A00;
            int bytesRead = (j > (-1L) ? 1 : (j == (-1L) ? 0 : -1));
            if (bytesRead != 0) {
                long j2 = read;
                if (A04[2].charAt(20) == 'R') {
                    throw new RuntimeException();
                }
                String[] strArr = A04;
                strArr[0] = "pjLm1ZauVMrHAqpQAI7gN0n14eRh7O52";
                strArr[5] = "T96N4GskjcbGLsEcsrwL44bvdnkYKV6X";
                this.A00 = j - j2;
            }
        }
        return read;
    }
}
