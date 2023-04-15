package com.facebook.ads.redexgen.X;

import java.util.Arrays;
/* renamed from: com.facebook.ads.redexgen.X.Fv  reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public final class C0388Fv {
    public static byte[] A04;
    public static String[] A05 = {"zFpRfifZkCIQawK1FUSg1K3EtGdV6Nz", "WEmq", "TVYpI9shQgf8MMEfvFWnKjXtFk1mYiaB", "WCXJZ", "VBPbo", "2erUCN4YfMxeKpPmRmxhBeZiE0shrr6A", "I2AaOQprvAMyyOLMUfVLbbt0mFwKyNVO", "ZVSAIqFm1ddnxSH"};
    public static final String[] A06;
    public final int A00;
    public final String A01;
    public final String A02;
    public final String[] A03;

    public static String A02(int i, int i2, int i3) {
        byte[] copyOfRange = Arrays.copyOfRange(A04, i, i + i2);
        int i4 = 0;
        while (true) {
            int length = copyOfRange.length;
            if (A05[5].charAt(16) != 'R') {
                throw new RuntimeException();
            }
            String[] strArr = A05;
            strArr[1] = "hhyK";
            strArr[4] = "wZqiL";
            if (i4 >= length) {
                return new String(copyOfRange);
            }
            copyOfRange[i4] = (byte) ((copyOfRange[i4] ^ i3) ^ 6);
            i4++;
        }
    }

    public static void A03() {
        A04 = new byte[]{36, 114, 0};
    }

    static {
        A03();
        A06 = new String[0];
    }

    public C0388Fv(String str, int i, String str2, String[] strArr) {
        this.A00 = i;
        this.A01 = str;
        this.A02 = str2;
        this.A03 = strArr;
    }

    public static C0388Fv A00() {
        String A02 = A02(0, 0, 1);
        return new C0388Fv(A02, 0, A02, new String[0]);
    }

    public static C0388Fv A01(String str, int i) {
        String trim;
        String[] strArr;
        String trim2 = str.trim();
        if (trim2.isEmpty()) {
            return null;
        }
        int indexOf = trim2.indexOf(A02(0, 1, 2));
        if (indexOf == -1) {
            trim = A02(0, 0, 1);
        } else {
            trim = trim2.substring(indexOf).trim();
            String[] strArr2 = A05;
            String str2 = strArr2[1];
            String str3 = strArr2[4];
            int length = str2.length();
            int voiceStartIndex = str3.length();
            if (length == voiceStartIndex) {
                throw new RuntimeException();
            }
            A05[5] = "Nr5OesO8C9sIOUHXRuAUw2kYPHmeguzx";
            trim2 = trim2.substring(0, indexOf);
        }
        String[] A0l = C0430Hl.A0l(trim2, A02(1, 2, 40));
        String name = A0l[0];
        int voiceStartIndex2 = A0l.length;
        if (voiceStartIndex2 > 1) {
            int voiceStartIndex3 = A0l.length;
            strArr = (String[]) Arrays.copyOfRange(A0l, 1, voiceStartIndex3);
        } else {
            strArr = A06;
        }
        return new C0388Fv(name, i, trim, strArr);
    }
}
