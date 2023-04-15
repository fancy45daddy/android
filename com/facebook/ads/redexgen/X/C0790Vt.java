package com.facebook.ads.redexgen.X;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;
/* renamed from: com.facebook.ads.redexgen.X.Vt  reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public final class C0790Vt implements A7 {
    public static String[] A06 = {"grqzXl31Ib3CwgbOGLAhXGiUSybb3G6k", "HqCRL2sDmMVhvd9OffyzWNuXpbgyFlqg", "IpTiYMxyYV6xHW6l8ixVEePHdVdY3VZ5", "ZRTEafxouxRK9cmvY3V1KAxZT1cXIFF2", "yUYM5z5ItqNmKdZaBdfrwPcFTl5oQFEz", "Jf72zunVfpVe04eAXULupQi0ZX1Zqvmv", "BX9HD2aywQJTDQtUbY1GrFeREy6of4gh", "vYXD58apfp8PH7rmktr19THixNAKPTAD"};
    public static final int A07 = Float.floatToIntBits(Float.NaN);
    public boolean A05;
    public int A01 = -1;
    public int A00 = -1;
    public int A02 = 0;
    public ByteBuffer A03 = A7.A00;
    public ByteBuffer A04 = A7.A00;

    public static void A00(int i, ByteBuffer byteBuffer) {
        float pcm32BitFloat = (float) (i * 4.656612875245797E-10d);
        int floatBits = Float.floatToIntBits(pcm32BitFloat);
        if (floatBits == A07) {
            floatBits = Float.floatToIntBits(0.0f);
        }
        byteBuffer.putInt(floatBits);
    }

    @Override // com.facebook.ads.redexgen.X.A7
    public final boolean A47(int i, int i2, int i3) throws A6 {
        if (C0430Hl.A0b(i3)) {
            int i4 = this.A01;
            String[] strArr = A06;
            if (strArr[1].charAt(10) != strArr[5].charAt(10)) {
                throw new RuntimeException();
            }
            A06[0] = "leVPKBI8NIDC3IwFclJng7rkdIPGoQ7e";
            if (i4 == i && this.A00 == i2 && this.A02 == i3) {
                return false;
            }
            this.A01 = i;
            this.A00 = i2;
            this.A02 = i3;
            return true;
        }
        throw new A6(i, i2, i3);
    }

    @Override // com.facebook.ads.redexgen.X.A7
    public final ByteBuffer A71() {
        ByteBuffer byteBuffer = this.A04;
        ByteBuffer outputBuffer = A7.A00;
        this.A04 = outputBuffer;
        return byteBuffer;
    }

    @Override // com.facebook.ads.redexgen.X.A7
    public final int A72() {
        return this.A00;
    }

    @Override // com.facebook.ads.redexgen.X.A7
    public final int A73() {
        return 4;
    }

    @Override // com.facebook.ads.redexgen.X.A7
    public final int A74() {
        return this.A01;
    }

    @Override // com.facebook.ads.redexgen.X.A7
    public final boolean A8L() {
        return C0430Hl.A0b(this.A02);
    }

    @Override // com.facebook.ads.redexgen.X.A7
    public final boolean A8P() {
        return this.A05 && this.A04 == A7.A00;
    }

    @Override // com.facebook.ads.redexgen.X.A7
    public final void ADN() {
        this.A05 = true;
    }

    @Override // com.facebook.ads.redexgen.X.A7
    public final void ADO(ByteBuffer byteBuffer) {
        boolean z = this.A02 == 1073741824;
        int size = byteBuffer.position();
        int limit = byteBuffer.limit();
        int i = limit - size;
        if (!z) {
            i = (i / 3) * 4;
        }
        int capacity = this.A03.capacity();
        String[] strArr = A06;
        String str = strArr[1];
        String str2 = strArr[5];
        int position = str.charAt(10);
        if (position != str2.charAt(10)) {
            throw new RuntimeException();
        }
        A06[2] = "93WHocDEPVvmBm0SxxEdEuUxxAP6dl6i";
        if (capacity < i) {
            this.A03 = ByteBuffer.allocateDirect(i).order(ByteOrder.nativeOrder());
        } else {
            this.A03.clear();
        }
        if (z) {
            while (size < limit) {
                int position2 = byteBuffer.get(size) & 255;
                A00(position2 | ((byteBuffer.get(size + 1) & 255) << 8) | ((byteBuffer.get(size + 2) & 255) << 16) | ((byteBuffer.get(size + 3) & 255) << 24), this.A03);
                size += 4;
            }
        } else {
            while (size < limit) {
                int position3 = (byteBuffer.get(size) & 255) << 8;
                A00(position3 | ((byteBuffer.get(size + 1) & 255) << 16) | ((byteBuffer.get(size + 2) & 255) << 24), this.A03);
                size += 3;
            }
        }
        byteBuffer.position(byteBuffer.limit());
        this.A03.flip();
        this.A04 = this.A03;
    }

    @Override // com.facebook.ads.redexgen.X.A7
    public final void flush() {
        this.A04 = A7.A00;
        this.A05 = false;
    }

    @Override // com.facebook.ads.redexgen.X.A7
    public final void reset() {
        flush();
        this.A01 = -1;
        this.A00 = -1;
        this.A02 = 0;
        this.A03 = A7.A00;
    }
}
