package com.facebook.ads.redexgen.X;

import androidx.annotation.Nullable;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.Arrays;
/* renamed from: com.facebook.ads.redexgen.X.Vx  reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public final class C0794Vx implements A7 {
    public static String[] A08 = {"hI95CJvP", "e7uFmzv8JlxhzV9w6wWiWm3C", "0BfqaNpqjs7ROgqNLFdYFDMF2kIE2JVl", "01nBjZj9wdoXPRYWJREYdbIjHTCf93fz", "xbIGt4PZ2jMEHXqvTGNBXf5J", "qzrNEKfdD0Je3OCcD1S0Cr1qEsV7v9mi", "0sM3QN", "C1cp7SniMnLQ2eyeNR7DTGSoW6Un2OTz"};
    public boolean A04;
    public boolean A05;
    @Nullable
    public int[] A06;
    @Nullable
    public int[] A07;
    public ByteBuffer A02 = A7.A00;
    public ByteBuffer A03 = A7.A00;
    public int A00 = -1;
    public int A01 = -1;

    public final void A00(@Nullable int[] iArr) {
        this.A07 = iArr;
    }

    @Override // com.facebook.ads.redexgen.X.A7
    public final boolean A47(int i, int i2, int i3) throws A6 {
        boolean z = !Arrays.equals(this.A07, this.A06);
        this.A06 = this.A07;
        if (this.A06 == null) {
            this.A04 = false;
            return z;
        } else if (i3 == 2) {
            if (!z && this.A01 == i) {
                int i4 = this.A00;
                String[] strArr = A08;
                if (strArr[6].length() == strArr[0].length()) {
                    throw new RuntimeException();
                }
                String[] strArr2 = A08;
                strArr2[6] = "gVI3SL";
                strArr2[0] = "1HQF1tqI";
                if (i4 == i2) {
                    return false;
                }
            }
            this.A01 = i;
            this.A00 = i2;
            boolean outputChannelsChanged = i2 != this.A06.length;
            this.A04 = outputChannelsChanged;
            int i5 = 0;
            while (true) {
                int[] iArr = this.A06;
                if (i5 >= iArr.length) {
                    return true;
                }
                int i6 = iArr[i5];
                if (i6 < i2) {
                    boolean z2 = this.A04;
                    boolean outputChannelsChanged2 = i6 != i5;
                    this.A04 = z2 | outputChannelsChanged2;
                    i5++;
                } else {
                    throw new A6(i, i2, i3);
                }
            }
        } else {
            throw new A6(i, i2, i3);
        }
    }

    @Override // com.facebook.ads.redexgen.X.A7
    public final ByteBuffer A71() {
        ByteBuffer byteBuffer = this.A03;
        ByteBuffer outputBuffer = A7.A00;
        this.A03 = outputBuffer;
        return byteBuffer;
    }

    @Override // com.facebook.ads.redexgen.X.A7
    public final int A72() {
        int[] iArr = this.A06;
        return iArr == null ? this.A00 : iArr.length;
    }

    @Override // com.facebook.ads.redexgen.X.A7
    public final int A73() {
        return 2;
    }

    @Override // com.facebook.ads.redexgen.X.A7
    public final int A74() {
        return this.A01;
    }

    @Override // com.facebook.ads.redexgen.X.A7
    public final boolean A8L() {
        return this.A04;
    }

    @Override // com.facebook.ads.redexgen.X.A7
    public final boolean A8P() {
        return this.A05 && this.A03 == A7.A00;
    }

    @Override // com.facebook.ads.redexgen.X.A7
    public final void ADN() {
        this.A05 = true;
    }

    @Override // com.facebook.ads.redexgen.X.A7
    public final void ADO(ByteBuffer byteBuffer) {
        int[] iArr;
        H6.A04(this.A06 != null);
        int position = byteBuffer.position();
        int limit = byteBuffer.limit();
        int position2 = this.A00;
        int i = (limit - position) / (position2 * 2);
        int position3 = this.A06.length;
        int i2 = position3 * i * 2;
        int position4 = this.A02.capacity();
        if (position4 < i2) {
            this.A02 = ByteBuffer.allocateDirect(i2).order(ByteOrder.nativeOrder());
        } else {
            this.A02.clear();
        }
        while (position < limit) {
            for (int position5 : this.A06) {
                this.A02.putShort(byteBuffer.getShort((position5 * 2) + position));
            }
            int position6 = this.A00;
            position += position6 * 2;
        }
        byteBuffer.position(limit);
        this.A02.flip();
        this.A03 = this.A02;
    }

    @Override // com.facebook.ads.redexgen.X.A7
    public final void flush() {
        this.A03 = A7.A00;
        this.A05 = false;
    }

    @Override // com.facebook.ads.redexgen.X.A7
    public final void reset() {
        flush();
        this.A02 = A7.A00;
        this.A00 = -1;
        this.A01 = -1;
        this.A06 = null;
        this.A07 = null;
        this.A04 = false;
    }
}
