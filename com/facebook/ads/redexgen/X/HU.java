package com.facebook.ads.redexgen.X;
/* loaded from: assets/audience_network.dex */
public final class HU {
    public static String[] A04 = {"RHSjJGYddlOPzslamo8j", "no2wrOKISs4wdINa", "E7xZIMZbElFQthX5cbe1zXMBiqq9Oct2", "NQ4djAykaRRiHV2nkQWoiztobM3LGBfO", "EDikhWaymQH2jtWvDyx1vViO84FhvN", "TllFBKS94wZfNNX6FcczOhdwmX6snrOZ", "CS63JXje", "QpZzHKHty24GTaxrVVV4B8DIrBZ4Gw8P"};
    public byte[] A00;
    public int A01;
    public int A02;
    public int A03;

    public HU() {
    }

    public HU(byte[] bArr) {
        this(bArr, bArr.length);
    }

    public HU(byte[] bArr, int i) {
        this.A00 = bArr;
        this.A02 = i;
    }

    private void A00() {
        int i;
        int i2 = this.A03;
        H6.A04(i2 >= 0 && (i2 < (i = this.A02) || (i2 == i && this.A01 == 0)));
    }

    public final int A01() {
        return ((this.A02 - this.A03) * 8) - this.A01;
    }

    public final int A02() {
        H6.A04(this.A01 == 0);
        return this.A03;
    }

    public final int A03() {
        return (this.A03 * 8) + this.A01;
    }

    public final int A04(int i) {
        int i2;
        if (i == 0) {
            return 0;
        }
        int i3 = 0;
        this.A01 += i;
        while (true) {
            i2 = this.A01;
            if (i2 <= 8) {
                break;
            }
            this.A01 = i2 - 8;
            byte[] bArr = this.A00;
            int returnValue = this.A03;
            this.A03 = returnValue + 1;
            i3 |= (bArr[returnValue] & 255) << this.A01;
        }
        byte[] bArr2 = this.A00;
        int i4 = this.A03;
        int returnValue2 = bArr2[i4] & 255;
        int i5 = i3 | (returnValue2 >> (8 - i2));
        int returnValue3 = (-1) >>> (32 - i);
        int i6 = i5 & returnValue3;
        if (i2 == 8) {
            this.A01 = 0;
            this.A03 = i4 + 1;
        }
        A00();
        return i6;
    }

    public final void A05() {
        if (this.A01 == 0) {
            return;
        }
        this.A01 = 0;
        this.A03++;
        A00();
    }

    public final void A06() {
        int i = this.A01 + 1;
        this.A01 = i;
        if (i == 8) {
            this.A01 = 0;
            this.A03++;
        }
        A00();
    }

    public final void A07(int i) {
        this.A03 = i / 8;
        this.A01 = i - (this.A03 * 8);
        A00();
    }

    public final void A08(int i) {
        int i2 = i / 8;
        int numBytes = this.A03;
        this.A03 = numBytes + i2;
        int numBytes2 = i2 * 8;
        this.A01 += i - numBytes2;
        int i3 = this.A01;
        if (i3 > 7) {
            int numBytes3 = this.A03;
            this.A03 = numBytes3 + 1;
            int numBytes4 = i3 - 8;
            this.A01 = numBytes4;
        }
        A00();
    }

    public final void A09(int i) {
        H6.A04(this.A01 == 0);
        this.A03 += i;
        A00();
    }

    public final void A0A(int currentByteIndex, int i) {
        if (i < 32) {
            currentByteIndex &= (1 << i) - 1;
        }
        int min = Math.min(8 - this.A01, i);
        int remainingBitsToRead = this.A01;
        int i2 = (8 - remainingBitsToRead) - min;
        int i3 = (65280 >> remainingBitsToRead) | ((1 << i2) - 1);
        byte[] bArr = this.A00;
        int firstByteBitmask = this.A03;
        bArr[firstByteBitmask] = (byte) (bArr[firstByteBitmask] & i3);
        int i4 = currentByteIndex >>> (i - min);
        bArr[firstByteBitmask] = (byte) (bArr[firstByteBitmask] | (i4 << i2));
        int i5 = i - min;
        int firstByteBitmask2 = firstByteBitmask + 1;
        while (i5 > 8) {
            this.A00[firstByteBitmask2] = (byte) (currentByteIndex >>> (i5 - 8));
            i5 -= 8;
            firstByteBitmask2++;
        }
        int firstByteRightPaddingSize = 8 - i5;
        byte[] bArr2 = this.A00;
        bArr2[firstByteBitmask2] = (byte) (bArr2[firstByteBitmask2] & ((1 << firstByteRightPaddingSize) - 1));
        byte b2 = (byte) (bArr2[firstByteBitmask2] | ((currentByteIndex & ((1 << i5) - 1)) << firstByteRightPaddingSize));
        int lastByteInput = A04[3].charAt(20);
        if (lastByteInput != 105) {
            throw new RuntimeException();
        }
        String[] strArr = A04;
        strArr[4] = "HDn8cIfTWSkx257fNKtZvpUDi4vYZW";
        strArr[6] = "YQkUGCO4";
        bArr2[firstByteBitmask2] = b2;
        A08(i);
        A00();
    }

    public final void A0B(byte[] bArr) {
        A0C(bArr, bArr.length);
    }

    public final void A0C(byte[] bArr, int i) {
        this.A00 = bArr;
        this.A03 = 0;
        this.A01 = 0;
        this.A02 = i;
    }

    public final void A0D(byte[] bArr, int i, int i2) {
        int i3 = (i2 >> 3) + i;
        while (i < i3) {
            byte[] bArr2 = this.A00;
            int i4 = this.A03;
            int to = i4 + 1;
            this.A03 = to;
            int to2 = bArr2[i4];
            int i5 = this.A01;
            bArr[i] = (byte) (to2 << i5);
            int i6 = bArr[i];
            int to3 = this.A03;
            bArr[i] = (byte) (((255 & bArr2[to3]) >> (8 - i5)) | i6);
            i++;
        }
        int i7 = i2 & 7;
        if (i7 == 0) {
            return;
        }
        int bitsLeft = bArr[i3];
        int to4 = 255 >> i7;
        bArr[i3] = (byte) (bitsLeft & to4);
        int i8 = this.A01;
        int to5 = i8 + i7;
        if (to5 > 8) {
            int i9 = bArr[i3];
            byte[] bArr3 = this.A00;
            int bitsLeft2 = this.A03;
            int to6 = bitsLeft2 + 1;
            this.A03 = to6;
            int to7 = bArr3[bitsLeft2];
            bArr[i3] = (byte) (i9 | ((to7 & 255) << i8));
            this.A01 = i8 - 8;
        }
        int to8 = this.A01;
        this.A01 = to8 + i7;
        byte[] bArr4 = this.A00;
        int i10 = this.A03;
        int to9 = bArr4[i10];
        int i11 = 255 & to9;
        int lastDataByteTrailingBits = this.A01;
        int to10 = 8 - lastDataByteTrailingBits;
        int i12 = i11 >> to10;
        int bitsLeft3 = bArr[i3];
        int to11 = 8 - i7;
        bArr[i3] = (byte) (bitsLeft3 | ((byte) (i12 << to11)));
        if (lastDataByteTrailingBits == 8) {
            this.A01 = 0;
            int to12 = i10 + 1;
            this.A03 = to12;
        }
        A00();
    }

    public final void A0E(byte[] bArr, int i, int i2) {
        H6.A04(this.A01 == 0);
        System.arraycopy(this.A00, this.A03, bArr, i, i2);
        this.A03 += i2;
        A00();
    }

    public final boolean A0F() {
        boolean returnValue = (this.A00[this.A03] & (128 >> this.A01)) != 0;
        A06();
        return returnValue;
    }
}
