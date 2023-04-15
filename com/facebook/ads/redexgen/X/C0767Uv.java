package com.facebook.ads.redexgen.X;

import com.facebook.ads.internal.exoplayer2.Format;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
/* renamed from: com.facebook.ads.redexgen.X.Uv  reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public final class C0767Uv implements CU {
    public static byte[] A06;
    public static String[] A07 = {"Jiy", "2wEJIBTa4RvP8yrIwKSodHRjo9", "akcZBAKpF", "EuZb8kUx1OZ", "XeLxT4hCbfpB8vk3L3qpbFThh9kK", "oaj", "R8TqjunyKtvNfOkCV", "nGIequV"};
    public int A00;
    public int A01;
    public long A02;
    public boolean A03;
    public final List<C0298Cf> A04;
    public final InterfaceC0279Ba[] A05;

    public static String A00(int i, int i2, int i3) {
        byte[] copyOfRange = Arrays.copyOfRange(A06, i, i + i2);
        for (int i4 = 0; i4 < copyOfRange.length; i4++) {
            copyOfRange[i4] = (byte) ((copyOfRange[i4] ^ i3) ^ 76);
        }
        return new String(copyOfRange);
    }

    public static void A01() {
        A06 = new byte[]{117, 100, 100, 120, 125, 119, 117, 96, 125, 123, 122, 59, 112, 98, 118, 103, 97, 118, 103};
    }

    static {
        A01();
    }

    public C0767Uv(List<C0298Cf> list) {
        this.A04 = list;
        this.A05 = new InterfaceC0279Ba[list.size()];
    }

    private boolean A02(HV hv, int i) {
        if (hv.A04() == 0) {
            return false;
        }
        if (hv.A0E() != i) {
            this.A03 = false;
        }
        this.A00--;
        return this.A03;
    }

    @Override // com.facebook.ads.redexgen.X.CU
    public final void A48(HV hv) {
        InterfaceC0279Ba[] interfaceC0279BaArr;
        if (this.A03) {
            if (this.A00 == 2 && !A02(hv, 32)) {
                return;
            }
            if (this.A00 == 1 && !A02(hv, 0)) {
                return;
            }
            int A062 = hv.A06();
            int A04 = hv.A04();
            for (InterfaceC0279Ba interfaceC0279Ba : this.A05) {
                hv.A0Y(A062);
                interfaceC0279Ba.AE8(hv, A04);
            }
            int dataPosition = this.A01;
            this.A01 = dataPosition + A04;
        }
    }

    @Override // com.facebook.ads.redexgen.X.CU
    public final void A4V(BQ bq, C0301Ci c0301Ci) {
        int i = 0;
        while (true) {
            InterfaceC0279Ba[] interfaceC0279BaArr = this.A05;
            String[] strArr = A07;
            String str = strArr[7];
            String str2 = strArr[1];
            int length = str.length();
            int i2 = str2.length();
            if (length == i2) {
                throw new RuntimeException();
            }
            String[] strArr2 = A07;
            strArr2[6] = "6Yign7KSgGvnaQ3UG";
            strArr2[0] = "Q7U";
            int i3 = interfaceC0279BaArr.length;
            if (i < i3) {
                C0298Cf c0298Cf = this.A04.get(i);
                c0301Ci.A05();
                InterfaceC0279Ba output = bq.AF2(c0301Ci.A03(), 3);
                output.A5T(Format.A0A(c0301Ci.A04(), A00(0, 19, 88), null, -1, 0, Collections.singletonList(c0298Cf.A02), c0298Cf.A01, null));
                this.A05[i] = output;
                i++;
            } else {
                return;
            }
        }
    }

    @Override // com.facebook.ads.redexgen.X.CU
    public final void ACx() {
        if (this.A03) {
            for (InterfaceC0279Ba interfaceC0279Ba : this.A05) {
                interfaceC0279Ba.AE9(this.A02, 1, this.A01, 0, null);
            }
            this.A03 = false;
        }
    }

    @Override // com.facebook.ads.redexgen.X.CU
    public final void ACy(long j, boolean z) {
        if (!z) {
            return;
        }
        this.A03 = true;
        this.A02 = j;
        this.A01 = 0;
        this.A00 = 2;
    }

    @Override // com.facebook.ads.redexgen.X.CU
    public final void AEC() {
        this.A03 = false;
    }
}
