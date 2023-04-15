package com.facebook.ads.redexgen.X;

import java.nio.ShortBuffer;
import java.util.Arrays;
/* renamed from: com.facebook.ads.redexgen.X.Ac  reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public final class C0255Ac {
    public static String[] A0M = {"ohCL8W0", "KQz7BMIeF4Z94D8gT8Jgt17pY9ay2sPb", "WHqc", "zdEVbBlbYLVxAkbZHAQvOg0x6UERU0KV", "RqBqTDSsJG3NS", "FmAwfgCi2dLCVzfY4ysR6r9BF", "Bq6occebnHk", "mWE0rLrmKK4IIqcH7c7itMEBPX65A8Us"};
    public int A00;
    public int A01;
    public int A02;
    public int A03;
    public int A04;
    public int A05;
    public int A06;
    public int A07;
    public int A08;
    public int A09;
    public short[] A0A;
    public short[] A0B;
    public short[] A0C;
    public final float A0D;
    public final float A0E;
    public final float A0F;
    public final int A0G;
    public final int A0H;
    public final int A0I;
    public final int A0J;
    public final int A0K;
    public final short[] A0L;

    public C0255Ac(int i, int i2, float f, float f2, int i3) {
        this.A0H = i;
        this.A0G = i2;
        this.A0F = f;
        this.A0D = f2;
        this.A0E = i / i3;
        this.A0K = i / 400;
        this.A0I = i / 65;
        this.A0J = this.A0I * 2;
        int i4 = this.A0J;
        this.A0L = new short[i4];
        this.A0A = new short[i4 * i2];
        this.A0B = new short[i4 * i2];
        this.A0C = new short[i4 * i2];
    }

    private int A00(int i) {
        int min = Math.min(this.A0J, this.A09);
        A0D(this.A0A, i, min);
        int frameCount = this.A09;
        this.A09 = frameCount - min;
        return min;
    }

    private int A01(short[] sArr, int i) {
        int retPeriod;
        int period;
        int i2 = this.A0H;
        int minP = i2 > 4000 ? i2 / 4000 : 1;
        int skip = this.A0G;
        if (skip == 1 && minP == 1) {
            int i3 = this.A0K;
            int skip2 = this.A0I;
            retPeriod = A04(sArr, i, i3, skip2);
        } else {
            A0E(sArr, i, minP);
            int skip3 = this.A0I;
            retPeriod = A04(this.A0L, 0, this.A0K / minP, skip3 / minP);
            if (minP != 1) {
                int i4 = retPeriod * minP;
                int skip4 = minP * 4;
                int maxP = i4 - skip4;
                int minP2 = (minP * 4) + i4;
                int skip5 = this.A0K;
                if (maxP < skip5) {
                    maxP = this.A0K;
                }
                int skip6 = this.A0I;
                if (minP2 > skip6) {
                    minP2 = this.A0I;
                }
                int i5 = this.A0G;
                int period2 = A0M[2].length();
                if (period2 != 4) {
                    throw new RuntimeException();
                }
                String[] strArr = A0M;
                strArr[7] = "JAo85nDeN7hM6ugSVwGhvUnreF2qbK1o";
                strArr[1] = "l4YUjJfL7ivyphsQmVZd9dZE6KXUcfPo";
                if (i5 == 1) {
                    retPeriod = A04(sArr, i, maxP, minP2);
                } else {
                    A0E(sArr, i, 1);
                    int period3 = A0M[2].length();
                    if (period3 != 4) {
                        retPeriod = A04(this.A0L, 0, maxP, minP2);
                    } else {
                        String[] strArr2 = A0M;
                        strArr2[6] = "Av8EYvFT4XF";
                        strArr2[5] = "OBBgqqBYNHA95X1QZrayaR0nl";
                        retPeriod = A04(this.A0L, 0, maxP, minP2);
                    }
                }
            }
        }
        int period4 = this.A02;
        int skip7 = this.A01;
        if (A0F(period4, skip7)) {
            period = this.A08;
        } else {
            period = retPeriod;
        }
        int skip8 = this.A02;
        this.A07 = skip8;
        this.A08 = retPeriod;
        return period;
    }

    private int A02(short[] sArr, int i, float f, int i2) {
        int i3;
        if (f < 0.5f) {
            i3 = (int) ((i2 * f) / (1.0f - f));
        } else {
            this.A09 = (int) ((i2 * ((2.0f * f) - 1.0f)) / (1.0f - f));
            i3 = i2;
        }
        int newFrameCount = i2 + i3;
        this.A0B = A0G(this.A0B, this.A05, newFrameCount);
        int i4 = this.A0G;
        short[] sArr2 = this.A0B;
        int newFrameCount2 = this.A05;
        System.arraycopy(sArr, i * i4, sArr2, newFrameCount2 * i4, i4 * i2);
        A0C(i3, this.A0G, this.A0B, this.A05 + i2, sArr, i + i2, sArr, i);
        int newFrameCount3 = this.A05;
        this.A05 = newFrameCount3 + i2 + i3;
        return i3;
    }

    private int A03(short[] sArr, int i, float f, int i2) {
        int newFrameCount;
        if (f >= 2.0f) {
            newFrameCount = (int) (i2 / (f - 1.0f));
        } else {
            this.A09 = (int) ((i2 * (2.0f - f)) / (f - 1.0f));
            newFrameCount = i2;
        }
        short[] sArr2 = this.A0B;
        int newFrameCount2 = this.A05;
        this.A0B = A0G(sArr2, newFrameCount2, newFrameCount);
        A0C(newFrameCount, this.A0G, this.A0B, this.A05, sArr, i, sArr, i + i2);
        int newFrameCount3 = this.A05;
        this.A05 = newFrameCount3 + newFrameCount;
        return newFrameCount;
    }

    private int A04(short[] sArr, int i, int i2, int i3) {
        int i4 = 0;
        int i5 = 255;
        int period = 1;
        int maxDiff = 0;
        int bestPeriod = this.A0G;
        int i6 = i * bestPeriod;
        while (i2 <= i3) {
            int diff = 0;
            for (int minDiff = 0; minDiff < i2; minDiff++) {
                int bestPeriod2 = i6 + minDiff;
                short s = sArr[bestPeriod2];
                int bestPeriod3 = i6 + i2;
                int worstPeriod = s - sArr[bestPeriod3 + minDiff];
                int bestPeriod4 = Math.abs(worstPeriod);
                diff += bestPeriod4;
            }
            int worstPeriod2 = diff * i4;
            int bestPeriod5 = period * i2;
            if (worstPeriod2 < bestPeriod5) {
                period = diff;
                i4 = i2;
            }
            int worstPeriod3 = diff * i5;
            int bestPeriod6 = maxDiff * i2;
            if (worstPeriod3 > bestPeriod6) {
                maxDiff = diff;
                i5 = i2;
            }
            i2++;
        }
        this.A02 = period / i4;
        this.A01 = maxDiff / i5;
        return i4;
    }

    private short A05(short[] sArr, int i, int i2, int i3) {
        short s = sArr[i];
        short s2 = sArr[this.A0G + i];
        int rightPosition = this.A03 * i2;
        int i4 = this.A04;
        int i5 = i4 * i3;
        int position = (i4 + 1) * i3;
        int i6 = position - rightPosition;
        int position2 = position - i5;
        short left = (short) (((i6 * s) + ((position2 - i6) * s2)) / position2);
        return left;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0027  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private void A06() {
        /*
            r8 = this;
            int r6 = r8.A05
            float r7 = r8.A0F
            float r0 = r8.A0D
            float r7 = r7 / r0
            float r5 = r8.A0E
            float r5 = r5 * r0
            double r3 = (double) r7
            r1 = 4607182463836013682(0x3ff0000a7c5ac472, double:1.00001)
            int r0 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r0 > 0) goto L1e
            double r3 = (double) r7
            r1 = 4607182328728024861(0x3fefffeb074a771d, double:0.99999)
            int r0 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r0 >= 0) goto L2b
        L1e:
            r8.A07(r7)
        L21:
            r0 = 1065353216(0x3f800000, float:1.0)
            int r0 = (r5 > r0 ? 1 : (r5 == r0 ? 0 : -1))
            if (r0 == 0) goto L2a
            r8.A08(r5, r6)
        L2a:
            return
        L2b:
            short[] r2 = r8.A0A
            int r1 = r8.A00
            r0 = 0
            r8.A0D(r2, r0, r1)
            r8.A00 = r0
            goto L21
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.ads.redexgen.X.C0255Ac.A06():void");
    }

    private void A07(float f) {
        int frameCount;
        if (this.A00 < this.A0J) {
            return;
        }
        int i = this.A00;
        int i2 = 0;
        do {
            int frameCount2 = this.A09;
            if (frameCount2 > 0) {
                int frameCount3 = A00(i2);
                i2 += frameCount3;
            } else {
                int A01 = A01(this.A0A, i2);
                int frameCount4 = (f > 1.0d ? 1 : (f == 1.0d ? 0 : -1));
                if (frameCount4 > 0) {
                    int frameCount5 = A03(this.A0A, i2, f, A01);
                    i2 += frameCount5 + A01;
                } else {
                    int frameCount6 = A02(this.A0A, i2, f, A01);
                    i2 += frameCount6;
                }
            }
            frameCount = this.A0J;
        } while (frameCount + i2 <= i);
        A0B(i2);
    }

    private void A08(float f, int i) {
        int i2;
        int oldSampleRate;
        if (this.A05 == i) {
            return;
        }
        int i3 = (int) (this.A0H / f);
        int i4 = this.A0H;
        while (true) {
            if (i3 > 16384 || i4 > 16384) {
                i3 /= 2;
                int oldSampleRate2 = A0M[0].length();
                if (oldSampleRate2 != 7) {
                    break;
                }
                A0M[0] = "V4vENqc";
                i4 /= 2;
            } else {
                A09(i);
                int i5 = 0;
                while (true) {
                    int i6 = this.A06;
                    int i7 = i6 - 1;
                    String[] strArr = A0M;
                    String str = strArr[7];
                    String str2 = strArr[1];
                    int oldSampleRate3 = str.charAt(13);
                    int newSampleRate = str2.charAt(13);
                    if (oldSampleRate3 == newSampleRate) {
                        break;
                    }
                    String[] strArr2 = A0M;
                    strArr2[7] = "S0FZlq4hqR1MtwM4zltGGLcwqbHHLsP7";
                    strArr2[1] = "aAsnKYirvcv97dya3O8NjUmjHgDgPMP0";
                    if (i5 < i7) {
                        while (true) {
                            i2 = this.A04;
                            int position = i2 + 1;
                            int position2 = position * i3;
                            oldSampleRate = this.A03;
                            int newSampleRate2 = oldSampleRate * i4;
                            if (position2 <= newSampleRate2) {
                                break;
                            }
                            short[] sArr = this.A0B;
                            int newSampleRate3 = this.A05;
                            this.A0B = A0G(sArr, newSampleRate3, 1);
                            int i8 = 0;
                            while (true) {
                                int i9 = this.A0G;
                                if (i8 < i9) {
                                    short[] sArr2 = this.A0B;
                                    int oldSampleRate4 = this.A05;
                                    sArr2[(oldSampleRate4 * i9) + i8] = A05(this.A0C, (i9 * i5) + i8, i4, i3);
                                    i8++;
                                }
                            }
                            int newSampleRate4 = this.A03;
                            this.A03 = newSampleRate4 + 1;
                            int newSampleRate5 = this.A05;
                            this.A05 = newSampleRate5 + 1;
                        }
                        int newSampleRate6 = i2 + 1;
                        this.A04 = newSampleRate6;
                        int newSampleRate7 = this.A04;
                        if (newSampleRate7 == i4) {
                            this.A04 = 0;
                            H6.A04(oldSampleRate == i3);
                            this.A03 = 0;
                        }
                        i5++;
                    } else {
                        A0A(i6 - 1);
                        return;
                    }
                }
            }
        }
        throw new RuntimeException();
    }

    private void A09(int i) {
        int i2 = this.A05 - i;
        short[] sArr = this.A0C;
        int frameCount = this.A06;
        this.A0C = A0G(sArr, frameCount, i2);
        short[] sArr2 = this.A0B;
        int i3 = this.A0G;
        short[] sArr3 = this.A0C;
        int frameCount2 = this.A06;
        System.arraycopy(sArr2, i * i3, sArr3, frameCount2 * i3, i3 * i2);
        this.A05 = i;
        int frameCount3 = this.A06;
        this.A06 = frameCount3 + i2;
    }

    private void A0A(int i) {
        if (i == 0) {
            return;
        }
        short[] sArr = this.A0C;
        int i2 = this.A0G;
        System.arraycopy(sArr, i * i2, sArr, 0, (this.A06 - i) * i2);
        this.A06 -= i;
    }

    private void A0B(int i) {
        int i2 = this.A00 - i;
        short[] sArr = this.A0A;
        int i3 = this.A0G;
        System.arraycopy(sArr, i * i3, sArr, 0, i3 * i2);
        this.A00 = i2;
    }

    public static void A0C(int i, int i2, short[] sArr, int i3, short[] sArr2, int i4, short[] sArr3, int i5) {
        for (int i6 = 0; i6 < i2; i6++) {
            int i7 = (i3 * i2) + i6;
            int t = (i5 * i2) + i6;
            int d = (i4 * i2) + i6;
            for (int u = 0; u < i; u++) {
                int i8 = i - u;
                int o = sArr2[d] * i8;
                int i9 = sArr3[t] * u;
                sArr[i7] = (short) ((o + i9) / i);
                i7 += i2;
                d += i2;
                t += i2;
            }
        }
    }

    private void A0D(short[] sArr, int i, int i2) {
        this.A0B = A0G(this.A0B, this.A05, i2);
        int i3 = this.A0G;
        System.arraycopy(sArr, i * i3, this.A0B, this.A05 * i3, i3 * i2);
        this.A05 += i2;
    }

    private void A0E(short[] sArr, int i, int i2) {
        int i3 = this.A0J / i2;
        int frameCount = this.A0G;
        int j = frameCount * i2;
        int i4 = i * frameCount;
        for (int value = 0; value < i3; value++) {
            int samplesPerValue = 0;
            for (int i5 = 0; i5 < j; i5++) {
                samplesPerValue += sArr[(value * j) + i4 + i5];
            }
            this.A0L[value] = (short) (samplesPerValue / j);
        }
    }

    private boolean A0F(int i, int i2) {
        if (i == 0 || this.A08 == 0 || i2 > i * 3 || i * 2 <= this.A07 * 3) {
            return false;
        }
        return true;
    }

    private short[] A0G(short[] sArr, int i, int i2) {
        int length = sArr.length;
        int i3 = this.A0G;
        int currentCapacityFrames = length / i3;
        if (i + i2 <= currentCapacityFrames) {
            return sArr;
        }
        return Arrays.copyOf(sArr, i3 * (((currentCapacityFrames * 3) / 2) + i2));
    }

    public final int A0H() {
        return this.A05;
    }

    public final void A0I() {
        this.A00 = 0;
        this.A05 = 0;
        this.A06 = 0;
        this.A04 = 0;
        this.A03 = 0;
        this.A09 = 0;
        this.A08 = 0;
        this.A07 = 0;
        this.A02 = 0;
        this.A01 = 0;
    }

    public final void A0J() {
        int i = this.A00;
        float f = this.A0F;
        float f2 = this.A0D;
        float r = f / f2;
        float f3 = this.A0E * f2;
        int i2 = this.A05;
        float s = i;
        int remainingFrameCount = this.A06;
        int i3 = i2 + ((int) ((((s / r) + remainingFrameCount) / f3) + 0.5f));
        short[] sArr = this.A0A;
        int i4 = this.A00;
        int remainingFrameCount2 = this.A0J;
        this.A0A = A0G(sArr, i4, (remainingFrameCount2 * 2) + i);
        int i5 = 0;
        while (true) {
            int expectedOutputFrames = this.A0J;
            int remainingFrameCount3 = expectedOutputFrames * 2;
            int i6 = this.A0G;
            if (i5 < remainingFrameCount3 * i6) {
                short[] sArr2 = this.A0A;
                String[] strArr = A0M;
                String str = strArr[7];
                String str2 = strArr[1];
                int charAt = str.charAt(13);
                int remainingFrameCount4 = str2.charAt(13);
                if (charAt == remainingFrameCount4) {
                    throw new RuntimeException();
                }
                String[] strArr2 = A0M;
                strArr2[6] = "8uqTwc5xmM3";
                strArr2[5] = "8QSOBZmBR7CYVXHwBaCnC4p1f";
                sArr2[(i6 * i) + i5] = 0;
                i5++;
            } else {
                int remainingFrameCount5 = expectedOutputFrames * 2;
                this.A00 += remainingFrameCount5;
                A06();
                int remainingFrameCount6 = this.A05;
                if (remainingFrameCount6 > i3) {
                    this.A05 = i3;
                }
                this.A00 = 0;
                this.A09 = 0;
                this.A06 = 0;
                return;
            }
        }
    }

    public final void A0K(ShortBuffer shortBuffer) {
        int min = Math.min(shortBuffer.remaining() / this.A0G, this.A05);
        short[] sArr = this.A0B;
        int framesToRead = this.A0G;
        shortBuffer.put(sArr, 0, framesToRead * min);
        int framesToRead2 = this.A05;
        this.A05 = framesToRead2 - min;
        short[] sArr2 = this.A0B;
        int i = this.A0G;
        int framesToRead3 = this.A05;
        System.arraycopy(sArr2, min * i, sArr2, 0, framesToRead3 * i);
    }

    public final void A0L(ShortBuffer shortBuffer) {
        int remaining = shortBuffer.remaining();
        int framesToWrite = this.A0G;
        int i = remaining / framesToWrite;
        this.A0A = A0G(this.A0A, this.A00, i);
        short[] sArr = this.A0A;
        int bytesToWrite = this.A00;
        shortBuffer.get(sArr, bytesToWrite * this.A0G, ((framesToWrite * i) * 2) / 2);
        this.A00 += i;
        A06();
    }
}
