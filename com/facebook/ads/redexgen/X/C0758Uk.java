package com.facebook.ads.redexgen.X;

import com.facebook.ads.internal.exoplayer2.Format;
import java.util.Arrays;
/* renamed from: com.facebook.ads.redexgen.X.Uk  reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public final class C0758Uk implements InterfaceC0295Cc {
    public static byte[] A03;
    public static String[] A04 = {"9dIhF2X5qYPGZcPrMQjFeU2FMq4Icb5t", "C7lZKzl2OzNugbLE4QJixcZrlcSgCGI7", "v7kvgcbsYqtq4Ou8B7XlURjv8wkzUozH", "8BzUB2zJ4MAZsKVthH28T9QXZJlG29jD", "wOgdV6BnuyxARX3Rbc0CvFDDXWIKfgjM", "mpBmZ", "f47n1mRwiFyOsV4myeWB5UC2YKJiwKop", "3tKYH9iJUyIyPmbH9Trftcv4NWgUsp5b"};
    public InterfaceC0279Ba A00;
    public C0426Hh A01;
    public boolean A02;

    public static String A00(int i, int i2, int i3) {
        byte[] copyOfRange = Arrays.copyOfRange(A03, i, i + i2);
        for (int i4 = 0; i4 < copyOfRange.length; i4++) {
            copyOfRange[i4] = (byte) ((copyOfRange[i4] - i3) - 96);
        }
        return new String(copyOfRange);
    }

    public static void A01() {
        A03 = new byte[]{11, 26, 26, 22, 19, 13, 11, 30, 19, 25, 24, -39, 34, -41, 29, 13, 30, 15, -35, -33};
    }

    static {
        A01();
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC0295Cc
    public final void A48(HV hv) {
        if (!this.A02) {
            if (this.A01.A05() == -9223372036854775807L) {
                return;
            }
            this.A00.A5T(Format.A02(null, A00(0, 20, 74), this.A01.A05()));
            this.A02 = true;
        }
        int A042 = hv.A04();
        this.A00.AE8(hv, A042);
        InterfaceC0279Ba interfaceC0279Ba = this.A00;
        if (A04[0].charAt(13) != 'c') {
            throw new RuntimeException();
        }
        A04[0] = "M4wOXnroCREOIcf8T96EgrMDUu9ExHmM";
        interfaceC0279Ba.AE9(this.A01.A04(), 1, A042, 0, null);
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC0295Cc
    public final void A8I(C0426Hh c0426Hh, BQ bq, C0301Ci c0301Ci) {
        this.A01 = c0426Hh;
        c0301Ci.A05();
        this.A00 = bq.AF2(c0301Ci.A03(), 4);
        this.A00.A5T(Format.A0B(c0301Ci.A04(), A00(0, 20, 74), null, -1, null));
    }
}
