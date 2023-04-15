package com.facebook.ads.redexgen.X;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;
/* renamed from: com.facebook.ads.redexgen.X.Vq  reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public final class C0787Vq implements A7 {
    public static String[] A0E = {"tvm2mqRs7a3ehYHdc1yBQoSNsWCnK", "tOWfSaULM8EnbecBF3SZtCA", "iNgvpQne2", "1AcoT6GEPIUQ3JZIKBz6KhI4GHeuy79P", "lryhUlLd6yxpw4rz006xnThMb", "3cZRB", "VTjWgXugqiR9aqruhTtZOoVTfcJyB76i", "EEKliZG5v6PVzs3xPcyqxwhc3FAivYta"};
    public int A00;
    public int A02;
    public int A03;
    public int A05;
    public long A06;
    public boolean A09;
    public boolean A0A;
    public boolean A0B;
    public ByteBuffer A07 = A7.A00;
    public ByteBuffer A08 = A7.A00;
    public int A01 = -1;
    public int A04 = -1;
    public byte[] A0C = new byte[0];
    public byte[] A0D = new byte[0];

    private int A00(long j) {
        return (int) ((this.A04 * j) / 1000000);
    }

    /* JADX WARN: Incorrect condition in loop: B:4:0x000a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private int A01(java.nio.ByteBuffer r5) {
        /*
            r4 = this;
            int r0 = r5.limit()
            int r2 = r0 + (-1)
        L6:
            int r0 = r5.position()
            if (r2 < r0) goto L20
            byte r0 = r5.get(r2)
            int r1 = java.lang.Math.abs(r0)
            r0 = 4
            if (r1 <= r0) goto L1d
            int r0 = r4.A00
            int r2 = r2 / r0
            int r2 = r2 * r0
            int r2 = r2 + r0
            return r2
        L1d:
            int r2 = r2 + (-2)
            goto L6
        L20:
            int r3 = r5.position()
            java.lang.String[] r2 = com.facebook.ads.redexgen.X.C0787Vq.A0E
            r0 = 5
            r1 = r2[r0]
            r0 = 1
            r0 = r2[r0]
            int r1 = r1.length()
            int r0 = r0.length()
            if (r1 == r0) goto L43
            java.lang.String[] r2 = com.facebook.ads.redexgen.X.C0787Vq.A0E
            java.lang.String r1 = "KbmXU"
            r0 = 5
            r2[r0] = r1
            java.lang.String r1 = "sStp2WQndpDzY5UDNElAkrU"
            r0 = 1
            r2[r0] = r1
            return r3
        L43:
            java.lang.RuntimeException r0 = new java.lang.RuntimeException
            r0.<init>()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.ads.redexgen.X.C0787Vq.A01(java.nio.ByteBuffer):int");
    }

    /* JADX WARN: Incorrect condition in loop: B:4:0x000a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private int A02(java.nio.ByteBuffer r4) {
        /*
            r3 = this;
            int r0 = r4.position()
            int r2 = r0 + 1
        L6:
            int r0 = r4.limit()
            if (r2 >= r0) goto L1f
            byte r0 = r4.get(r2)
            int r1 = java.lang.Math.abs(r0)
            r0 = 4
            if (r1 <= r0) goto L1c
            int r0 = r3.A00
            int r2 = r2 / r0
            int r0 = r0 * r2
            return r0
        L1c:
            int r2 = r2 + 2
            goto L6
        L1f:
            int r0 = r4.limit()
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.ads.redexgen.X.C0787Vq.A02(java.nio.ByteBuffer):int");
    }

    private void A03(int i) {
        if (this.A07.capacity() < i) {
            this.A07 = ByteBuffer.allocateDirect(i).order(ByteOrder.nativeOrder());
        } else {
            this.A07.clear();
        }
        if (i > 0) {
            this.A0A = true;
        }
    }

    private void A04(ByteBuffer byteBuffer) {
        A03(byteBuffer.remaining());
        this.A07.put(byteBuffer);
        this.A07.flip();
        this.A08 = this.A07;
    }

    private void A05(ByteBuffer byteBuffer) {
        int limit = byteBuffer.limit();
        int maybeSilenceBufferRemaining = A02(byteBuffer);
        int position = maybeSilenceBufferRemaining - byteBuffer.position();
        byte[] bArr = this.A0C;
        int noisePosition = bArr.length;
        int limit2 = this.A02;
        int noisePosition2 = noisePosition - limit2;
        if (maybeSilenceBufferRemaining < limit && position < noisePosition2) {
            A09(bArr, limit2);
            this.A02 = 0;
            this.A05 = 0;
            return;
        }
        int bytesToWrite = Math.min(position, noisePosition2);
        byteBuffer.limit(byteBuffer.position() + bytesToWrite);
        String[] strArr = A0E;
        String str = strArr[0];
        String str2 = strArr[2];
        int noisePosition3 = str.length();
        if (noisePosition3 == str2.length()) {
            throw new RuntimeException();
        }
        String[] strArr2 = A0E;
        strArr2[6] = "wWIHZuTOncQcUu5TT4FAsoGOHgVjS7Hw";
        strArr2[3] = "FL1HwHnzDnNmmMdWBTP73LL49pAAT75M";
        byteBuffer.get(this.A0C, this.A02, bytesToWrite);
        this.A02 += bytesToWrite;
        int i = this.A02;
        byte[] bArr2 = this.A0C;
        if (i == bArr2.length) {
            if (this.A0A) {
                A09(bArr2, this.A03);
                long j = this.A06;
                int noisePosition4 = this.A02;
                this.A06 = j + ((noisePosition4 - (this.A03 * 2)) / this.A00);
            } else {
                this.A06 += (i - this.A03) / this.A00;
            }
            A08(byteBuffer, this.A0C, this.A02);
            this.A02 = 0;
            this.A05 = 2;
        }
        byteBuffer.limit(limit);
    }

    private void A06(ByteBuffer byteBuffer) {
        int limit = byteBuffer.limit();
        int position = byteBuffer.position();
        int limit2 = this.A0C.length;
        byteBuffer.limit(Math.min(limit, position + limit2));
        int noiseLimit = A01(byteBuffer);
        int limit3 = byteBuffer.position();
        if (noiseLimit == limit3) {
            this.A05 = 1;
        } else {
            byteBuffer.limit(noiseLimit);
            A04(byteBuffer);
        }
        byteBuffer.limit(limit);
    }

    private void A07(ByteBuffer byteBuffer) {
        int limit = byteBuffer.limit();
        int A02 = A02(byteBuffer);
        byteBuffer.limit(A02);
        long j = this.A06;
        int noisyPosition = byteBuffer.remaining();
        int limit2 = this.A00;
        this.A06 = j + (noisyPosition / limit2);
        byte[] bArr = this.A0D;
        int limit3 = this.A03;
        A08(byteBuffer, bArr, limit3);
        if (A02 < limit) {
            byte[] bArr2 = this.A0D;
            int limit4 = this.A03;
            A09(bArr2, limit4);
            this.A05 = 0;
            byteBuffer.limit(limit);
        }
    }

    private void A08(ByteBuffer byteBuffer, byte[] bArr, int i) {
        int min = Math.min(byteBuffer.remaining(), this.A03);
        int i2 = this.A03 - min;
        System.arraycopy(bArr, i - i2, this.A0D, 0, i2);
        int fromInputSize = byteBuffer.limit();
        byteBuffer.position(fromInputSize - min);
        byteBuffer.get(this.A0D, i2, min);
    }

    private void A09(byte[] bArr, int i) {
        A03(i);
        this.A07.put(bArr, 0, i);
        this.A07.flip();
        this.A08 = this.A07;
    }

    public final long A0A() {
        return this.A06;
    }

    public final void A0B(boolean z) {
        this.A09 = z;
        flush();
    }

    @Override // com.facebook.ads.redexgen.X.A7
    public final boolean A47(int i, int i2, int i3) throws A6 {
        if (i3 == 2) {
            if (this.A04 == i) {
                int i4 = this.A01;
                if (A0E[4].length() != 25) {
                    throw new RuntimeException();
                }
                String[] strArr = A0E;
                strArr[0] = "H8XMnFWveFctl2wFWM9cW2gP9UHr1";
                strArr[2] = "PgSQZHBtM";
                if (i4 == i2) {
                    return false;
                }
            }
            this.A04 = i;
            this.A01 = i2;
            this.A00 = i2 * 2;
            return true;
        }
        throw new A6(i, i2, i3);
    }

    @Override // com.facebook.ads.redexgen.X.A7
    public final ByteBuffer A71() {
        ByteBuffer byteBuffer = this.A08;
        ByteBuffer outputBuffer = A7.A00;
        this.A08 = outputBuffer;
        return byteBuffer;
    }

    @Override // com.facebook.ads.redexgen.X.A7
    public final int A72() {
        return this.A01;
    }

    @Override // com.facebook.ads.redexgen.X.A7
    public final int A73() {
        return 2;
    }

    @Override // com.facebook.ads.redexgen.X.A7
    public final int A74() {
        return this.A04;
    }

    @Override // com.facebook.ads.redexgen.X.A7
    public final boolean A8L() {
        return this.A04 != -1 && this.A09;
    }

    @Override // com.facebook.ads.redexgen.X.A7
    public final boolean A8P() {
        return this.A0B && this.A08 == A7.A00;
    }

    @Override // com.facebook.ads.redexgen.X.A7
    public final void ADN() {
        this.A0B = true;
        int i = this.A02;
        if (i > 0) {
            A09(this.A0C, i);
        }
        if (!this.A0A) {
            this.A06 += this.A03 / this.A00;
        }
    }

    @Override // com.facebook.ads.redexgen.X.A7
    public final void ADO(ByteBuffer byteBuffer) {
        while (byteBuffer.hasRemaining() && !this.A08.hasRemaining()) {
            int i = this.A05;
            if (i != 0) {
                String[] strArr = A0E;
                if (strArr[5].length() == strArr[1].length()) {
                    throw new RuntimeException();
                }
                A0E[4] = "AiWUvfGcxq4zga3HVbzIicdLH";
                if (i == 1) {
                    A05(byteBuffer);
                } else if (i == 2) {
                    A07(byteBuffer);
                } else {
                    throw new IllegalStateException();
                }
            } else {
                A06(byteBuffer);
            }
        }
    }

    @Override // com.facebook.ads.redexgen.X.A7
    public final void flush() {
        if (A8L()) {
            int A00 = A00(150000L) * this.A00;
            int maybeSilenceBufferSize = this.A0C.length;
            if (maybeSilenceBufferSize != A00) {
                this.A0C = new byte[A00];
            }
            int A002 = A00(20000L);
            int maybeSilenceBufferSize2 = this.A00;
            this.A03 = A002 * maybeSilenceBufferSize2;
            int length = this.A0D.length;
            int maybeSilenceBufferSize3 = this.A03;
            if (length != maybeSilenceBufferSize3) {
                this.A0D = new byte[maybeSilenceBufferSize3];
            }
        }
        this.A05 = 0;
        this.A08 = A7.A00;
        this.A0B = false;
        this.A06 = 0L;
        String[] strArr = A0E;
        if (strArr[5].length() == strArr[1].length()) {
            throw new RuntimeException();
        }
        String[] strArr2 = A0E;
        strArr2[5] = "CYbGl";
        strArr2[1] = "FkXGzwkTO5dsiSfEVL3DvOQ";
        this.A02 = 0;
        this.A0A = false;
    }

    @Override // com.facebook.ads.redexgen.X.A7
    public final void reset() {
        this.A09 = false;
        flush();
        this.A07 = A7.A00;
        this.A01 = -1;
        this.A04 = -1;
        this.A03 = 0;
        this.A0C = new byte[0];
        this.A0D = new byte[0];
    }
}
