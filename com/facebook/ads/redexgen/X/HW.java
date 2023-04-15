package com.facebook.ads.redexgen.X;
/* loaded from: assets/audience_network.dex */
public final class HW {
    public static String[] A04 = {"c84vrcH31LBgkMTCK1bohHlXVMnz9AJR", "d1OdysF2oEJNIHjT9033ROKyCX5j9bI3", "fxcqndjlyXUHbVpCK9jm", "aT6eQk8J7bmxuuGVWtHexoeTGFRtLCio", "ywK9OdvkymoDgjlaSqX1MXgGISTKD1G", "kvGKIZl1lyVjOHyD1SwfLq7Qy0hyNYJA", "P5ZowT1yJlaZidguBbmn", "kEUPdIGxbWMHKqV30QNAKk8CqZCFjcZl"};
    public int A00;
    public int A01;
    public int A02;
    public byte[] A03;

    public HW(byte[] bArr, int i, int i2) {
        A08(bArr, i, i2);
    }

    private int A00() {
        int i = 0;
        while (!A0A()) {
            i++;
        }
        int i2 = (1 << i) - 1;
        if (A04[5].charAt(7) != 'Z') {
            String[] strArr = A04;
            strArr[1] = "EO6sj55N530JbeetbwPxyBKxcCLP9BzL";
            strArr[0] = "oyZlo8wPjIkpHiFdOrp6pSDhzRhw9ZCk";
            int leadingZeros = i > 0 ? A05(i) : 0;
            return i2 + leadingZeros;
        }
        throw new RuntimeException();
    }

    private void A01() {
        int i;
        int i2 = this.A02;
        H6.A04(i2 >= 0 && (i2 < (i = this.A01) || (i2 == i && this.A00 == 0)));
    }

    private boolean A02(int i) {
        if (2 <= i && i < this.A01) {
            byte[] bArr = this.A03;
            if (bArr[i] == 3 && bArr[i - 2] == 0 && bArr[i - 1] == 0) {
                return true;
            }
        }
        return false;
    }

    public final int A03() {
        int A00 = A00();
        int codeNum = A00 % 2;
        int i = codeNum == 0 ? -1 : 1;
        int codeNum2 = A00 + 1;
        return i * (codeNum2 / 2);
    }

    public final int A04() {
        return A00();
    }

    public final int A05(int i) {
        int i2;
        int i3 = 0;
        int returnValue = this.A00;
        this.A00 = returnValue + i;
        while (true) {
            i2 = this.A00;
            if (i2 <= 8) {
                break;
            }
            int returnValue2 = i2 - 8;
            this.A00 = returnValue2;
            byte[] bArr = this.A03;
            int i4 = this.A02;
            int returnValue3 = bArr[i4];
            int i5 = returnValue3 & 255;
            int returnValue4 = this.A00;
            i3 |= i5 << returnValue4;
            int returnValue5 = i4 + 1;
            if (!A02(returnValue5)) {
                r4 = 1;
            }
            this.A02 = i4 + r4;
        }
        byte[] bArr2 = this.A03;
        int i6 = this.A02;
        int returnValue6 = bArr2[i6];
        int i7 = returnValue6 & 255;
        int returnValue7 = 8 - i2;
        int returnValue8 = 32 - i;
        int i8 = (i3 | (i7 >> returnValue7)) & ((-1) >>> returnValue8);
        if (i2 == 8) {
            this.A00 = 0;
            int returnValue9 = i6 + 1;
            this.A02 = i6 + (A02(returnValue9) ? 2 : 1);
        }
        A01();
        String[] strArr = A04;
        String str = strArr[6];
        String str2 = strArr[2];
        int length = str.length();
        int returnValue10 = str2.length();
        if (length != returnValue10) {
            throw new RuntimeException();
        }
        String[] strArr2 = A04;
        strArr2[1] = "VwcsjLhlZd9I2ct9XMdPqerwWVhD9SnY";
        strArr2[0] = "SEOCmBzyD2oxYau0L8QhU7fYZrlA9WRm";
        return i8;
    }

    public final void A06() {
        int i = this.A00 + 1;
        this.A00 = i;
        if (i == 8) {
            this.A00 = 0;
            int i2 = this.A02;
            this.A02 = i2 + (A02(i2 + 1) ? 2 : 1);
        }
        A01();
    }

    public final void A07(int i) {
        int i2 = this.A02;
        int i3 = i / 8;
        int oldByteOffset = this.A02;
        this.A02 = oldByteOffset + i3;
        int oldByteOffset2 = i3 * 8;
        this.A00 += i - oldByteOffset2;
        int numBytes = this.A00;
        if (numBytes > 7) {
            int oldByteOffset3 = this.A02;
            this.A02 = oldByteOffset3 + 1;
            int oldByteOffset4 = numBytes - 8;
            this.A00 = oldByteOffset4;
        }
        while (true) {
            i2++;
            int i4 = this.A02;
            String[] strArr = A04;
            String str = strArr[6];
            String str2 = strArr[2];
            int numBytes2 = str.length();
            int oldByteOffset5 = str2.length();
            if (numBytes2 != oldByteOffset5) {
                break;
            }
            String[] strArr2 = A04;
            strArr2[7] = "16ru2e8lXVuKccLj62CTuGGODJDTLMLs";
            strArr2[3] = "ss2rTXlJnNbrcKU9GLjWVNttz382myoQ";
            if (i2 <= i4) {
                boolean A02 = A02(i2);
                String[] strArr3 = A04;
                String str3 = strArr3[6];
                String str4 = strArr3[2];
                int numBytes3 = str3.length();
                int oldByteOffset6 = str4.length();
                if (numBytes3 != oldByteOffset6) {
                    break;
                }
                String[] strArr4 = A04;
                strArr4[6] = "8iP0ukDWZhsNH03XWb9d";
                strArr4[2] = "2ETrOFK8hCpKH2QuP6pQ";
                if (A02) {
                    int oldByteOffset7 = this.A02;
                    this.A02 = oldByteOffset7 + 1;
                    i2 += 2;
                }
            } else {
                A01();
                return;
            }
        }
        throw new RuntimeException();
    }

    public final void A08(byte[] bArr, int i, int i2) {
        this.A03 = bArr;
        this.A02 = i;
        this.A01 = i2;
        this.A00 = 0;
        A01();
    }

    /* JADX WARN: Incorrect condition in loop: B:4:0x0009 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean A09() {
        /*
            r8 = this;
            int r7 = r8.A02
            int r2 = r8.A00
            r6 = 0
        L5:
            int r1 = r8.A02
            int r0 = r8.A01
            if (r1 >= r0) goto L14
            boolean r0 = r8.A0A()
            if (r0 != 0) goto L14
            int r6 = r6 + 1
            goto L5
        L14:
            int r1 = r8.A02
            int r0 = r8.A01
            r5 = 0
            r4 = 1
            if (r1 != r0) goto L48
            r3 = 1
        L1d:
            r8.A02 = r7
            r8.A00 = r2
            java.lang.String[] r1 = com.facebook.ads.redexgen.X.HW.A04
            r0 = 5
            r1 = r1[r0]
            r0 = 7
            char r1 = r1.charAt(r0)
            r0 = 90
            if (r1 == r0) goto L4a
            java.lang.String[] r2 = com.facebook.ads.redexgen.X.HW.A04
            java.lang.String r1 = "4CnifSrgKpd7e7K0x8WVIkfErouhzSPT"
            r0 = 7
            r2[r0] = r1
            java.lang.String r1 = "4ZydgevgZqNlOfL3PtmcBBhuPOTZ7C4b"
            r0 = 3
            r2[r0] = r1
            if (r3 != 0) goto L47
            int r0 = r6 * 2
            int r0 = r0 + r4
            boolean r0 = r8.A0B(r0)
            if (r0 == 0) goto L47
            r5 = 1
        L47:
            return r5
        L48:
            r3 = 0
            goto L1d
        L4a:
            java.lang.RuntimeException r0 = new java.lang.RuntimeException
            r0.<init>()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.ads.redexgen.X.HW.A09():boolean");
    }

    public final boolean A0A() {
        boolean returnValue = (this.A03[this.A02] & (128 >> this.A00)) != 0;
        A06();
        return returnValue;
    }

    public final boolean A0B(int i) {
        int numBytes = this.A02;
        int oldByteOffset = i / 8;
        int i2 = this.A02 + oldByteOffset;
        int newBitOffset = (this.A00 + i) - (oldByteOffset * 8);
        if (newBitOffset > 7) {
            i2++;
            newBitOffset -= 8;
        }
        int newByteOffset = numBytes + 1;
        while (newByteOffset <= i2 && i2 < this.A01) {
            if (A02(newByteOffset)) {
                i2++;
                newByteOffset += 2;
            }
            newByteOffset++;
        }
        int oldByteOffset2 = this.A01;
        if (i2 >= oldByteOffset2) {
            return i2 == oldByteOffset2 && newBitOffset == 0;
        }
        return true;
    }
}
