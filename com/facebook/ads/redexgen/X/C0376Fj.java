package com.facebook.ads.redexgen.X;

import a.a.j;
import android.text.Layout;
import android.text.SpannableStringBuilder;
import android.text.style.AbsoluteSizeSpan;
import android.text.style.AlignmentSpan;
import android.text.style.BackgroundColorSpan;
import android.text.style.ForegroundColorSpan;
import android.text.style.RelativeSizeSpan;
import android.text.style.StrikethroughSpan;
import android.text.style.StyleSpan;
import android.text.style.TypefaceSpan;
import android.text.style.UnderlineSpan;
import java.util.Arrays;
import java.util.Map;
/* renamed from: com.facebook.ads.redexgen.X.Fj  reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public final class C0376Fj {
    public static byte[] A00;
    public static String[] A01 = {"gehgTzpUAqg89EXiGGasdpNXUtk8k2dp", "VbYmpptfSIV8qdRodswF8V1n59zym7XK", "E44YX0wg", "TCU5yEG5ZIofchF4EQjDHlsQntmp46Yu", "EkmeYw2kQLbBECw2eANnaw7CzESY", "H", "OFssNajfj", "bi8IHmxX7dNFBPIWLmj9QBiFjZgAYPjN"};

    /* JADX WARN: Failed to parse debug info
    java.lang.ArrayIndexOutOfBoundsException: Index 7 out of bounds for length 7
    	at jadx.plugins.input.dex.sections.debuginfo.DebugInfoParser.startVar(DebugInfoParser.java:203)
    	at jadx.plugins.input.dex.sections.debuginfo.DebugInfoParser.process(DebugInfoParser.java:135)
    	at jadx.plugins.input.dex.sections.DexCodeReader.getDebugInfo(DexCodeReader.java:118)
    	at jadx.core.dex.nodes.MethodNode.getDebugInfo(MethodNode.java:567)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.visit(DebugInfoAttachVisitor.java:39)
     */
    public static C0380Fn A00(C0380Fn c0380Fn, String[] strArr, Map<String, C0380Fn> map) {
        if (c0380Fn == null && strArr == null) {
            return null;
        }
        int i = 0;
        if (c0380Fn == null && strArr.length == 1) {
            return map.get(strArr[0]);
        }
        if (c0380Fn == null && strArr.length > 1) {
            C0380Fn c0380Fn2 = new C0380Fn();
            int length = strArr.length;
            while (i < length) {
                c0380Fn2.A0E(map.get(strArr[i]));
                i++;
            }
            return c0380Fn2;
        } else if (c0380Fn == null || strArr == null || strArr.length != 1) {
            if (c0380Fn == null || strArr == null || strArr.length <= 1) {
                return c0380Fn;
            }
            int length2 = strArr.length;
            while (i < length2) {
                c0380Fn.A0E(map.get(strArr[i]));
                i++;
            }
            return c0380Fn;
        } else {
            return c0380Fn.A0E(map.get(strArr[0]));
        }
    }

    public static String A01(int i, int i2, int i3) {
        byte[] copyOfRange = Arrays.copyOfRange(A00, i, i + i2);
        for (int i4 = 0; i4 < copyOfRange.length; i4++) {
            copyOfRange[i4] = (byte) ((copyOfRange[i4] ^ i3) ^ 92);
        }
        return new String(copyOfRange);
    }

    public static void A03() {
        A00 = new byte[]{60, 12, 11, 53, 27, 17, 49, 27, 17, 100, 31, 54, 99, 71, 15, 125, 51, 50, 98, 20};
    }

    static {
        A03();
    }

    public static String A02(String str) {
        String A012 = A01(0, 1, j.AppCompatTheme_toolbarNavigationButtonStyle);
        String replaceAll = str.replaceAll(A01(1, 2, 93), A012).replaceAll(A01(4, 5, j.AppCompatTheme_textAppearanceSmallPopupMenu), A012);
        String A013 = A01(3, 1, 73);
        String replaceAll2 = replaceAll.replaceAll(A012, A013);
        String out = A01(9, 11, 99);
        return replaceAll2.replaceAll(out, A013);
    }

    public static void A04(SpannableStringBuilder spannableStringBuilder) {
        int length = spannableStringBuilder.length() - 1;
        while (length >= 0 && spannableStringBuilder.charAt(length) == ' ') {
            length--;
        }
        if (length >= 0 && spannableStringBuilder.charAt(length) != '\n') {
            spannableStringBuilder.append('\n');
        }
    }

    public static void A05(SpannableStringBuilder spannableStringBuilder, int i, int i2, C0380Fn c0380Fn) {
        if (c0380Fn.A07() != -1) {
            spannableStringBuilder.setSpan(new StyleSpan(c0380Fn.A07()), i, i2, 33);
        }
        if (c0380Fn.A0P()) {
            spannableStringBuilder.setSpan(new StrikethroughSpan(), i, i2, 33);
        }
        if (c0380Fn.A0Q()) {
            spannableStringBuilder.setSpan(new UnderlineSpan(), i, i2, 33);
        }
        if (c0380Fn.A0O()) {
            spannableStringBuilder.setSpan(new ForegroundColorSpan(c0380Fn.A05()), i, i2, 33);
        }
        if (c0380Fn.A0N()) {
            spannableStringBuilder.setSpan(new BackgroundColorSpan(c0380Fn.A04()), i, i2, 33);
        }
        if (c0380Fn.A0L() != null) {
            spannableStringBuilder.setSpan(new TypefaceSpan(c0380Fn.A0L()), i, i2, 33);
        }
        Layout.Alignment A08 = c0380Fn.A08();
        String[] strArr = A01;
        if (strArr[0].charAt(0) == strArr[1].charAt(0)) {
            throw new RuntimeException();
        }
        String[] strArr2 = A01;
        strArr2[5] = "m";
        strArr2[2] = "ujiHtYdg";
        if (A08 != null) {
            spannableStringBuilder.setSpan(new AlignmentSpan.Standard(c0380Fn.A08()), i, i2, 33);
        }
        int A06 = c0380Fn.A06();
        if (A06 == 1) {
            spannableStringBuilder.setSpan(new AbsoluteSizeSpan((int) c0380Fn.A03(), true), i, i2, 33);
        } else if (A06 == 2) {
            spannableStringBuilder.setSpan(new RelativeSizeSpan(c0380Fn.A03()), i, i2, 33);
        } else if (A06 != 3) {
        } else {
            spannableStringBuilder.setSpan(new RelativeSizeSpan(c0380Fn.A03() / 100.0f), i, i2, 33);
        }
    }
}
