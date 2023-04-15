package com.facebook.ads.redexgen.X;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;
/* renamed from: com.facebook.ads.redexgen.X.Vo  reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public final class C0785Vo implements A7 {
    public static String[] A0B = {"r", "4", "I5O53mReJYgY4Jy6Te4gmLvwKot1lmjj", "5S", "zkj4NaHy3qG", "EJmI2pRz04", "Xqte5C1rywD", "1UQbdYDvzSk5pKr4kl4SZHHNZLcQI2bC"};
    public int A01;
    public int A02;
    public int A04;
    public int A05;
    public boolean A08;
    public boolean A09;
    public ByteBuffer A06 = A7.A00;
    public ByteBuffer A07 = A7.A00;
    public int A00 = -1;
    public int A03 = -1;
    public byte[] A0A = new byte[0];

    public final void A00(int i, int i2) {
        this.A05 = i;
        this.A04 = i2;
    }

    @Override // com.facebook.ads.redexgen.X.A7
    public final boolean A47(int i, int i2, int i3) throws A6 {
        if (i3 == 2) {
            this.A00 = i2;
            this.A03 = i;
            int i4 = this.A04;
            this.A0A = new byte[i4 * i2 * 2];
            this.A01 = 0;
            int i5 = this.A05;
            this.A02 = i5 * i2 * 2;
            boolean z = this.A09;
            boolean wasActive = (i5 == 0 && i4 == 0) ? false : true;
            this.A09 = wasActive;
            boolean wasActive2 = this.A09;
            return z != wasActive2;
        }
        throw new A6(i, i2, i3);
    }

    @Override // com.facebook.ads.redexgen.X.A7
    public final ByteBuffer A71() {
        ByteBuffer byteBuffer = this.A07;
        ByteBuffer outputBuffer = A7.A00;
        this.A07 = outputBuffer;
        return byteBuffer;
    }

    @Override // com.facebook.ads.redexgen.X.A7
    public final int A72() {
        return this.A00;
    }

    @Override // com.facebook.ads.redexgen.X.A7
    public final int A73() {
        return 2;
    }

    @Override // com.facebook.ads.redexgen.X.A7
    public final int A74() {
        return this.A03;
    }

    @Override // com.facebook.ads.redexgen.X.A7
    public final boolean A8L() {
        return this.A09;
    }

    @Override // com.facebook.ads.redexgen.X.A7
    public final boolean A8P() {
        return this.A08 && this.A07 == A7.A00;
    }

    @Override // com.facebook.ads.redexgen.X.A7
    public final void ADN() {
        this.A08 = true;
    }

    @Override // com.facebook.ads.redexgen.X.A7
    public final void ADO(ByteBuffer byteBuffer) {
        int remaining = byteBuffer.position();
        int endBufferBytesToOutput = byteBuffer.limit();
        int trimBytes = endBufferBytesToOutput - remaining;
        int position = this.A02;
        int limit = Math.min(trimBytes, position);
        int position2 = this.A02;
        this.A02 = position2 - limit;
        byteBuffer.position(remaining + limit);
        int position3 = this.A02;
        if (position3 > 0) {
            return;
        }
        int trimBytes2 = trimBytes - limit;
        int position4 = this.A0A.length;
        int i = (this.A01 + trimBytes2) - position4;
        int position5 = this.A06.capacity();
        if (position5 < i) {
            ByteBuffer allocateDirect = ByteBuffer.allocateDirect(i);
            if (A0B[3].length() == 18) {
                throw new RuntimeException();
            }
            A0B[3] = "Xd8Hzn34smT7X798Wj1HPKCywQ0V";
            this.A06 = allocateDirect.order(ByteOrder.nativeOrder());
        } else {
            this.A06.clear();
        }
        int position6 = this.A01;
        int remaining2 = C0430Hl.A06(i, 0, position6);
        this.A06.put(this.A0A, 0, remaining2);
        int limit2 = C0430Hl.A06(i - remaining2, 0, trimBytes2);
        int position7 = byteBuffer.position();
        byteBuffer.limit(position7 + limit2);
        this.A06.put(byteBuffer);
        byteBuffer.limit(endBufferBytesToOutput);
        int trimBytes3 = trimBytes2 - limit2;
        int position8 = this.A01;
        this.A01 = position8 - remaining2;
        byte[] bArr = this.A0A;
        int position9 = this.A01;
        System.arraycopy(bArr, remaining2, bArr, 0, position9);
        byte[] bArr2 = this.A0A;
        int position10 = this.A01;
        byteBuffer.get(bArr2, position10, trimBytes3);
        int position11 = this.A01;
        this.A01 = position11 + trimBytes3;
        this.A06.flip();
        this.A07 = this.A06;
    }

    @Override // com.facebook.ads.redexgen.X.A7
    public final void flush() {
        this.A07 = A7.A00;
        this.A08 = false;
        this.A02 = 0;
        this.A01 = 0;
    }

    @Override // com.facebook.ads.redexgen.X.A7
    public final void reset() {
        flush();
        this.A06 = A7.A00;
        this.A00 = -1;
        this.A03 = -1;
        this.A0A = new byte[0];
    }
}
