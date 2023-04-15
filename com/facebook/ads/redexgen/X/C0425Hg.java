package com.facebook.ads.redexgen.X;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
/* renamed from: com.facebook.ads.redexgen.X.Hg  reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public final class C0425Hg {
    public static String[] A07 = {"v8bLZp59B3s5kjImuBjcCmNW", "l5XLQfXbQh6R34DBcL2a2gRDiWiOWq7j", "cKC0Gfnr6KNVk9zoAEVguSpqajRxhGsy", "4MzGZFDG0CqgMdioIrH5vwyzFGAbThRu", "MvXRt7wPeDxEfDCDFesb3zWoJZhNCkxf", "mCnVL7G0HMRU3KziMebPW175T1XCPvkW", "oyPZ3wFE5cpoHVmJFEQQrP2WxUjSMaR1", "eOuchRPwSpgwlWmZThUBhEapR1FbTYXS"};
    public static final Comparator<C0424Hf> A08 = new C0422Hd();
    public static final Comparator<C0424Hf> A09 = new C0423He();
    public int A01;
    public int A02;
    public int A03;
    public final int A04;
    public final C0424Hf[] A06 = new C0424Hf[5];
    public final ArrayList<C0424Hf> A05 = new ArrayList<>();
    public int A00 = -1;

    public C0425Hg(int i) {
        this.A04 = i;
    }

    private void A00() {
        if (this.A00 != 1) {
            Collections.sort(this.A05, A08);
            this.A00 = 1;
        }
    }

    private void A01() {
        if (this.A00 != 0) {
            Collections.sort(this.A05, A09);
            this.A00 = 0;
        }
    }

    public final float A02(float f) {
        ArrayList<C0424Hf> arrayList;
        A01();
        float f2 = this.A03 * f;
        int i = 0;
        int i2 = 0;
        while (true) {
            ArrayList<C0424Hf> arrayList2 = this.A05;
            int accumulatedWeight = A07[7].charAt(12);
            if (accumulatedWeight != 108) {
                throw new RuntimeException();
            }
            A07[1] = "MYxxtSQw2w0IEM5GsYZTgS2IPhbXFMQD";
            if (i2 < arrayList2.size()) {
                C0424Hf c0424Hf = this.A05.get(i2);
                i += c0424Hf.A02;
                float desiredWeight = i;
                if (desiredWeight >= f2) {
                    float desiredWeight2 = c0424Hf.A00;
                    return desiredWeight2;
                }
                i2++;
            } else if (this.A05.isEmpty()) {
                return Float.NaN;
            } else {
                float desiredWeight3 = this.A05.get(arrayList.size() - 1).A00;
                return desiredWeight3;
            }
        }
    }

    public final void A03(int i, float f) {
        C0424Hf c0424Hf;
        A00();
        int i2 = this.A02;
        if (i2 > 0) {
            C0424Hf[] c0424HfArr = this.A06;
            int i3 = i2 - 1;
            this.A02 = i3;
            c0424Hf = c0424HfArr[i3];
        } else {
            c0424Hf = new C0424Hf(null);
        }
        int i4 = this.A01;
        this.A01 = i4 + 1;
        c0424Hf.A01 = i4;
        if (A07[6].charAt(29) != 'a') {
            throw new RuntimeException();
        }
        A07[0] = "5E26ZSMWQoSDuNI0YD8YDk9y";
        c0424Hf.A02 = i;
        c0424Hf.A00 = f;
        this.A05.add(c0424Hf);
        this.A03 += i;
        while (true) {
            int i5 = this.A03;
            int i6 = this.A04;
            if (i5 > i6) {
                int excessWeight = i5 - i6;
                C0424Hf c0424Hf2 = this.A05.get(0);
                if (c0424Hf2.A02 <= excessWeight) {
                    this.A03 -= c0424Hf2.A02;
                    this.A05.remove(0);
                    int i7 = this.A02;
                    if (i7 < 5) {
                        C0424Hf[] c0424HfArr2 = this.A06;
                        if (A07[6].charAt(29) != 97) {
                            this.A02 = i7 + 1;
                            c0424HfArr2[i7] = c0424Hf2;
                        } else {
                            A07[0] = "NjEm8Wq6Ir4EIF9DQvkt7JHV";
                            this.A02 = i7 + 1;
                            c0424HfArr2[i7] = c0424Hf2;
                        }
                    }
                } else {
                    c0424Hf2.A02 -= excessWeight;
                    this.A03 -= excessWeight;
                }
            } else {
                return;
            }
        }
    }
}
