package com.facebook.ads.redexgen.X;

import java.util.Arrays;
import java.util.Map;
/* renamed from: com.facebook.ads.redexgen.X.0p  reason: invalid class name and case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public abstract class AbstractC00220p {
    public static byte[] A04;
    public static String[] A05 = {"OqcLT37Xtir4oyEfNmT1h4Rk4YkQZZDY", "Uwe5RI", "pL0dXLjcEL0YvPTfwlaTsWSX1DbaAkE5", "xtw7OOYBvYdKgcW8WzcZrKA0PDZy4bwg", "f918FI", "0rYE8aKdqB5alUcDRGHr7byWf0zxjLED", "HJdrWZ0hD1uhwEG", "W2AWehjS6wPr2mpVEIqcODXDVwSDQEbA"};
    public boolean A00;
    public final C0806Wj A01;
    public final AbstractC00230q A02;
    public final C0627Pi A03;

    public static String A00(int i, int i2, int i3) {
        byte[] copyOfRange = Arrays.copyOfRange(A04, i, i + i2);
        for (int i4 = 0; i4 < copyOfRange.length; i4++) {
            copyOfRange[i4] = (byte) ((copyOfRange[i4] - i3) - 37);
            String[] strArr = A05;
            if (strArr[7].charAt(19) == strArr[3].charAt(19)) {
                throw new RuntimeException();
            }
            String[] strArr2 = A05;
            strArr2[5] = "ralyQsFIfJjHchT6ijaCYOn7xcrh9SYP";
            strArr2[0] = "lf1tsTh5P7IODA8hmkOKCVUdKtrYifbk";
        }
        return new String(copyOfRange);
    }

    public static void A01() {
        A04 = new byte[]{-126, -90, -87, -85, -98, -84, -84, -94, -88, -89, 89, -91, -88, -96, -96, -98, -99};
    }

    public abstract void A06(Map<String, String> map);

    static {
        A01();
    }

    public AbstractC00220p(C0806Wj c0806Wj, AbstractC00230q abstractC00230q, C0627Pi c0627Pi) {
        this.A01 = c0806Wj;
        this.A02 = abstractC00230q;
        this.A03 = c0627Pi;
    }

    public final void A02() {
        if (this.A00) {
            return;
        }
        AbstractC00230q abstractC00230q = this.A02;
        if (abstractC00230q != null) {
            abstractC00230q.A00();
        }
        Map<String, String> extraData = new N2().A03(this.A03).A05();
        A06(extraData);
        this.A00 = true;
        KS.A02(this.A01, A00(0, 17, 20));
        AbstractC00230q abstractC00230q2 = this.A02;
    }
}
