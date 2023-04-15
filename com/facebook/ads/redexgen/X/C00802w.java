package com.facebook.ads.redexgen.X;

import a.a.j;
import android.util.Log;
import androidx.annotation.Nullable;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
/* renamed from: com.facebook.ads.redexgen.X.2w  reason: invalid class name and case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public final class C00802w extends AbstractC0265Am {
    public static byte[] A05;
    public static String[] A06 = {"nLO9L7XoEpR8vgnDFT", "WlEQ0W9HytVOtlcgcYyzDlj1QkZOFGjO", "ODtnbW3mHTyNn479FkodGv794qS9hsWl", "APk9cVzJYKr2vBqvSJCf7k3ktACu2ubu", "Tq9sEDvjDozJ9rvk5K396aURjyjwu7hY", "bGv", "ZQgwsO83xrUrRKbDM61rEvH7uEXNNVYo", "gyYiWp0aVpa2EpLIT9J28do7UtlziSMd"};
    public static final Pattern A07;
    public int A00;
    public int A01;
    public int A02;
    public int A03;
    public final boolean A04;

    public static String A02(int i, int i2, int i3) {
        byte[] copyOfRange = Arrays.copyOfRange(A05, i, i + i2);
        for (int i4 = 0; i4 < copyOfRange.length; i4++) {
            copyOfRange[i4] = (byte) ((copyOfRange[i4] - i3) - 114);
        }
        return new String(copyOfRange);
    }

    public static void A03() {
        A05 = new byte[]{-98, -20, 3, -2, -20, 32, 40, -17, -19, -2, -19, 3, -20, 32, 40, -17, -19, -2, -20, 32, 40, -17, -19, -20, 3, -2, -2, 64, 32, -14, -19, -20, 32, 40, -17, -19, -82, 44, 81, 73, 84, 87, 79, 93, 77, 34, 8, -2, 39, 42, 37, 25, 44, -14, -40, -5, 19, 17, 24, 24, 17, 22, 15, -56, 12, 17, 9, 20, 23, 15, 29, 13, -56, 20, 17, 22, 13, -56, 10, 13, 14, 23, 26, 13, -56, 11, 23, 21, 24, 20, 13, 28, 13, -56, 14, 23, 26, 21, 9, 28, -30, -56, 17, 41, 39, 46, 46, 39, 44, 37, -34, 34, 39, 31, 42, 45, 37, 51, 35, -34, 42, 39, 44, 35, -34, 53, 39, 50, 38, -34, 36, 35, 53, 35, 48, -34, 33, 45, 42, 51, 43, 44, 49, -34, 50, 38, 31, 44, -34, 36, 45, 48, 43, 31, 50, -8, -34, -35, -11, -13, -6, -6, -13, -8, -15, -86, -13, -8, 0, -21, -10, -13, -18, -86, -2, -13, -9, -13, -8, -15, -60, -86, 68, 100, 82, 53, 86, 84, 96, 85, 86, 99, -11, -33, 16, -1, 8, 14, 13, -9, 42, 42, 28, 73, 73, 91, 21, 52, -25, -29, -8, 21, 54, -24, -15, -25, 53, 54, 35, 52, 54, 85, 70, 89, 85};
    }

    static {
        A03();
        A07 = Pattern.compile(A02(1, 35, 82));
    }

    public C00802w() {
        this(null);
    }

    public C00802w(@Nullable List<byte[]> list) {
        super(A02(182, 10, 127));
        if (list != null && !list.isEmpty()) {
            this.A04 = true;
            String A0Q = C0430Hl.A0Q(list.get(0));
            String formatLine = A02(47, 8, 70);
            H6.A03(A0Q.startsWith(formatLine));
            A06(A0Q);
            A04(new HV(list.get(1)));
            return;
        }
        this.A04 = false;
    }

    public static long A00(String str) {
        Matcher matcher = A07.matcher(str);
        if (!matcher.matches()) {
            return -9223372036854775807L;
        }
        return (Long.parseLong(matcher.group(1)) * 60 * 60 * 1000000) + (Long.parseLong(matcher.group(2)) * 60 * 1000000) + (Long.parseLong(matcher.group(3)) * 1000000) + (Long.parseLong(matcher.group(4)) * 10000);
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Override // com.facebook.ads.redexgen.X.AbstractC0265Am
    /* renamed from: A01 */
    public final U7 A0b(byte[] bArr, int i, boolean z) {
        ArrayList arrayList = new ArrayList();
        HL hl = new HL();
        HV hv = new HV(bArr, i);
        if (!this.A04) {
            A04(hv);
        }
        A05(hv, arrayList, hl);
        FJ[] fjArr = new FJ[arrayList.size()];
        arrayList.toArray(fjArr);
        return new U7(fjArr, hl.A05());
    }

    private void A04(HV hv) {
        String A0P;
        do {
            A0P = hv.A0P();
            if (A0P == null) {
                return;
            }
            String currentLine = A06[6];
            if (currentLine.charAt(30) != 'Y') {
                throw new RuntimeException();
            }
            String[] strArr = A06;
            strArr[0] = "7FHmrvaj0sy2XXhHTc";
            strArr[5] = "VJa";
        } while (!A0P.startsWith(A02(192, 8, 40)));
    }

    private void A05(HV hv, List<FJ> list, HL hl) {
        while (true) {
            String A0P = hv.A0P();
            if (A0P != null) {
                if (!this.A04 && A0P.startsWith(A02(47, 8, 70))) {
                    A06(A0P);
                } else if (A0P.startsWith(A02(37, 10, j.AppCompatTheme_windowMinWidthMajor))) {
                    A07(A0P, list, hl);
                }
            } else {
                return;
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:24:0x008a, code lost:
        if (r9.equals(A02(216, 5, 80)) == false) goto L12;
     */
    /* JADX WARN: Removed duplicated region for block: B:17:0x006d  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x007a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private void A06(java.lang.String r11) {
        /*
            Method dump skipped, instructions count: 221
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.ads.redexgen.X.C00802w.A06(java.lang.String):void");
    }

    private void A07(String str, List<FJ> list, HL hl) {
        int i = this.A01;
        String A02 = A02(182, 10, 127);
        if (i == 0) {
            Log.w(A02, A02(55, 47, 54) + str);
            return;
        }
        String[] split = str.substring(A02(37, 10, j.AppCompatTheme_windowMinWidthMajor).length()).split(A02(36, 1, 16), this.A01);
        if (split.length != this.A01) {
            Log.w(A02, A02(j.AppCompatTheme_textAppearanceSearchResultTitle, 55, 76) + str);
            return;
        }
        long startTimeUs = A00(split[this.A02]);
        String A022 = A02(157, 25, 24);
        if (startTimeUs == -9223372036854775807L) {
            Log.w(A02, A022 + str);
            return;
        }
        long j = -9223372036854775807L;
        String str2 = split[this.A00];
        if (!str2.trim().isEmpty()) {
            j = A00(str2);
            if (j == -9223372036854775807L) {
                Log.w(A02, A022 + str);
                return;
            }
        }
        String replaceAll = split[this.A03].replaceAll(A02(206, 7, 71), A02(0, 0, 15));
        String A023 = A02(0, 1, 34);
        list.add(new FJ(replaceAll.replaceAll(A02(200, 3, 92), A023).replaceAll(A02(203, 3, 123), A023)));
        hl.A04(startTimeUs);
        if (j != -9223372036854775807L) {
            list.add(null);
            hl.A04(j);
        }
    }
}
