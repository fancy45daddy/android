package com.facebook.ads.redexgen.X;

import java.io.EOFException;
import java.io.IOException;
import java.util.Arrays;
/* renamed from: com.facebook.ads.redexgen.X.Vf  reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public final class C0776Vf implements BP {
    public int A00;
    public int A01;
    public long A02;
    public final long A04;
    public final GQ A05;
    public byte[] A03 = new byte[65536];
    public final byte[] A06 = new byte[4096];

    public C0776Vf(GQ gq, long j, long j2) {
        this.A05 = gq;
        this.A02 = j;
        this.A04 = j2;
    }

    private int A00(int i) {
        int bytesSkipped = Math.min(this.A00, i);
        A05(bytesSkipped);
        return bytesSkipped;
    }

    private int A01(byte[] bArr, int i, int i2) {
        int i3 = this.A00;
        if (i3 == 0) {
            return 0;
        }
        int min = Math.min(i3, i2);
        System.arraycopy(this.A03, 0, bArr, i, min);
        A05(min);
        return min;
    }

    private int A02(byte[] bArr, int i, int i2, int i3, boolean z) throws InterruptedException, IOException {
        if (!Thread.interrupted()) {
            int read = this.A05.read(bArr, i + i3, i2 - i3);
            if (read == -1) {
                if (i3 == 0 && z) {
                    return -1;
                }
                throw new EOFException();
            }
            return i3 + read;
        }
        throw new InterruptedException();
    }

    private void A03(int i) {
        if (i != -1) {
            this.A02 += i;
        }
    }

    private void A04(int i) {
        int i2 = this.A01 + i;
        byte[] bArr = this.A03;
        int requiredLength = bArr.length;
        if (i2 > requiredLength) {
            int requiredLength2 = bArr.length;
            int requiredLength3 = 524288 + i2;
            int newPeekCapacity = C0430Hl.A06(requiredLength2 * 2, 65536 + i2, requiredLength3);
            this.A03 = Arrays.copyOf(this.A03, newPeekCapacity);
        }
    }

    private void A05(int i) {
        this.A00 -= i;
        this.A01 = 0;
        byte[] bArr = this.A03;
        int i2 = this.A00;
        if (i2 < this.A03.length - 524288) {
            bArr = new byte[i2 + 65536];
        }
        byte[] newPeekBuffer = this.A03;
        System.arraycopy(newPeekBuffer, i, bArr, 0, this.A00);
        this.A03 = bArr;
    }

    public final boolean A06(int i, boolean z) throws IOException, InterruptedException {
        A04(i);
        int min = Math.min(this.A00 - this.A01, i);
        while (min < i) {
            min = A02(this.A03, this.A01, i, min, z);
            if (min == -1) {
                return false;
            }
        }
        int bytesPeeked = this.A01;
        this.A01 = bytesPeeked + i;
        int i2 = this.A00;
        int bytesPeeked2 = this.A01;
        this.A00 = Math.max(i2, bytesPeeked2);
        return true;
    }

    public final boolean A07(int i, boolean z) throws IOException, InterruptedException {
        int A00 = A00(i);
        while (A00 < i && A00 != -1) {
            int bytesSkipped = this.A06.length;
            A00 = A02(this.A06, -A00, Math.min(i, bytesSkipped + A00), A00, z);
        }
        A03(A00);
        return A00 != -1;
    }

    @Override // com.facebook.ads.redexgen.X.BP
    public final void A3K(int i) throws IOException, InterruptedException {
        A06(i, false);
    }

    @Override // com.facebook.ads.redexgen.X.BP
    public final long A6r() {
        return this.A04;
    }

    @Override // com.facebook.ads.redexgen.X.BP
    public final long A78() {
        return this.A02 + this.A01;
    }

    @Override // com.facebook.ads.redexgen.X.BP
    public final long A7D() {
        return this.A02;
    }

    @Override // com.facebook.ads.redexgen.X.BP
    public final void AD0(byte[] bArr, int i, int i2) throws IOException, InterruptedException {
        AD1(bArr, i, i2, false);
    }

    @Override // com.facebook.ads.redexgen.X.BP
    public final boolean AD1(byte[] bArr, int i, int i2, boolean z) throws IOException, InterruptedException {
        if (!A06(i2, z)) {
            return false;
        }
        System.arraycopy(this.A03, this.A01 - i2, bArr, i, i2);
        return true;
    }

    @Override // com.facebook.ads.redexgen.X.BP
    public final boolean ADV(byte[] bArr, int i, int i2, boolean z) throws IOException, InterruptedException {
        int A01 = A01(bArr, i, i2);
        while (A01 < i2 && A01 != -1) {
            A01 = A02(bArr, i, i2, A01, z);
        }
        A03(A01);
        return A01 != -1;
    }

    @Override // com.facebook.ads.redexgen.X.BP
    public final void AE3() {
        this.A01 = 0;
    }

    @Override // com.facebook.ads.redexgen.X.BP
    public final int AEh(int i) throws IOException, InterruptedException {
        int bytesSkipped = A00(i);
        if (bytesSkipped == 0) {
            byte[] bArr = this.A06;
            bytesSkipped = A02(bArr, 0, Math.min(i, bArr.length), 0, true);
        }
        A03(bytesSkipped);
        return bytesSkipped;
    }

    @Override // com.facebook.ads.redexgen.X.BP
    public final void AEk(int i) throws IOException, InterruptedException {
        A07(i, false);
    }

    @Override // com.facebook.ads.redexgen.X.BP
    public final int read(byte[] bArr, int i, int i2) throws IOException, InterruptedException {
        int bytesRead = A01(bArr, i, i2);
        if (bytesRead == 0) {
            bytesRead = A02(bArr, i, i2, 0, true);
        }
        A03(bytesRead);
        return bytesRead;
    }

    @Override // com.facebook.ads.redexgen.X.BP
    public final void readFully(byte[] bArr, int i, int i2) throws IOException, InterruptedException {
        ADV(bArr, i, i2, false);
    }
}
