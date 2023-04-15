package com.facebook.ads.redexgen.X;

import android.text.Layout;
import android.text.SpannableString;
import android.text.SpannableStringBuilder;
import android.text.style.ForegroundColorSpan;
import android.text.style.StyleSpan;
import android.text.style.UnderlineSpan;
import java.util.ArrayList;
import java.util.List;
/* loaded from: assets/audience_network.dex */
public class FQ {
    public static String[] A08 = {"cHi9U0Pg", "VGea8qk0EPS8OqQ4obSD5aeRlTRdn39K", "J", "J", "UkvFMUtno93mVTdlP0lNSPxeQZ", "4fCjFf2htdfAP", "I6h5KAyxQwYPDLtwjcMWBd", "QYcuKDWzo7FBs229Db5R79YAEK36tHpY"};
    public int A00;
    public int A01;
    public int A02;
    public int A03;
    public int A04;
    public final List<FP> A06 = new ArrayList();
    public final List<SpannableString> A07 = new ArrayList();
    public final StringBuilder A05 = new StringBuilder();

    /* JADX WARN: Failed to parse debug info
    java.lang.ArrayIndexOutOfBoundsException: Index 19 out of bounds for length 17
    	at jadx.plugins.input.dex.sections.debuginfo.DebugInfoParser.startVar(DebugInfoParser.java:203)
    	at jadx.plugins.input.dex.sections.debuginfo.DebugInfoParser.process(DebugInfoParser.java:125)
    	at jadx.plugins.input.dex.sections.DexCodeReader.getDebugInfo(DexCodeReader.java:118)
    	at jadx.core.dex.nodes.MethodNode.getDebugInfo(MethodNode.java:567)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.visit(DebugInfoAttachVisitor.java:39)
     */
    public final FJ A05() {
        float f;
        int i;
        int i2;
        int i3;
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        for (int i4 = 0; i4 < this.A07.size(); i4++) {
            SpannableString spannableString = this.A07.get(i4);
            String[] strArr = A08;
            if (strArr[7].charAt(17) != strArr[1].charAt(17)) {
                throw new RuntimeException();
            }
            String[] strArr2 = A08;
            strArr2[4] = "JfGeCXNtH9OkzyiNPcVTkTkkVF";
            strArr2[5] = "U8fcuMPJKIItC";
            spannableStringBuilder.append((CharSequence) spannableString);
            spannableStringBuilder.append('\n');
        }
        spannableStringBuilder.append((CharSequence) A00());
        if (spannableStringBuilder.length() == 0) {
            return null;
        }
        int i5 = this.A02 + this.A04;
        int length = (32 - i5) - spannableStringBuilder.length();
        int i6 = i5 - length;
        if (this.A00 == 2 && (Math.abs(i6) < 3 || length < 0)) {
            f = 0.5f;
            i = 1;
        } else if (this.A00 != 2 || i6 <= 0) {
            f = (0.8f * (i5 / 32.0f)) + 0.1f;
            i = 0;
        } else {
            f = (0.8f * ((32 - length) / 32.0f)) + 0.1f;
            i = 2;
        }
        if (this.A00 == 1 || this.A03 > 7) {
            i2 = 2;
            i3 = (this.A03 - 15) - 2;
        } else {
            i2 = 0;
            i3 = this.A03;
        }
        return new FJ(spannableStringBuilder, Layout.Alignment.ALIGN_NORMAL, i3, 1, i2, f, i, Float.MIN_VALUE);
    }

    public FQ(int i, int i2) {
        A09(i);
        A0A(i2);
    }

    private final SpannableString A00() {
        int i;
        int[] iArr;
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(this.A05);
        int i2 = spannableStringBuilder.length();
        int i3 = -1;
        int color = -1;
        int colorStartPosition = 0;
        int italicStartPosition = -1;
        boolean z = false;
        int i4 = -1;
        for (int underlineStartPosition = 0; underlineStartPosition < this.A06.size(); underlineStartPosition++) {
            FP fp = this.A06.get(underlineStartPosition);
            boolean z2 = fp.A02;
            int length = fp.A01;
            if (length != 8) {
                z = length == 7;
                if (length != 7) {
                    iArr = AnonymousClass32.A0K;
                    i4 = iArr[length];
                }
            }
            int length2 = fp.A00;
            if (underlineStartPosition + 1 < this.A06.size()) {
                i = this.A06.get(underlineStartPosition + 1).A00;
            } else {
                i = i2;
            }
            if (length2 != i) {
                if (i3 != -1 && !z2) {
                    A02(spannableStringBuilder, i3, length2);
                    i3 = -1;
                } else if (i3 == -1 && z2) {
                    i3 = length2;
                }
                String[] strArr = A08;
                if (strArr[4].length() == strArr[5].length()) {
                    throw new RuntimeException();
                }
                String[] strArr2 = A08;
                strArr2[4] = "lr4TMFgGLuEdpqEBom9kPNzU6S";
                strArr2[5] = "0zdhGbgYXkwlZ";
                if (color != -1 && !z) {
                    A01(spannableStringBuilder, color, length2);
                    color = -1;
                } else if (color == -1 && z) {
                    color = length2;
                }
                if (i4 != italicStartPosition) {
                    A03(spannableStringBuilder, colorStartPosition, length2, italicStartPosition);
                    italicStartPosition = i4;
                    colorStartPosition = length2;
                }
            }
        }
        if (i3 != -1 && i3 != i2) {
            A02(spannableStringBuilder, i3, i2);
        }
        if (color != -1 && color != i2) {
            A01(spannableStringBuilder, color, i2);
        }
        if (colorStartPosition != i2) {
            A03(spannableStringBuilder, colorStartPosition, i2, italicStartPosition);
        }
        return new SpannableString(spannableStringBuilder);
    }

    public static void A01(SpannableStringBuilder spannableStringBuilder, int i, int i2) {
        spannableStringBuilder.setSpan(new StyleSpan(2), i, i2, 33);
    }

    public static void A02(SpannableStringBuilder spannableStringBuilder, int i, int i2) {
        spannableStringBuilder.setSpan(new UnderlineSpan(), i, i2, 33);
    }

    public static void A03(SpannableStringBuilder spannableStringBuilder, int i, int i2, int i3) {
        if (i3 == -1) {
            return;
        }
        spannableStringBuilder.setSpan(new ForegroundColorSpan(i3), i, i2, 33);
    }

    public final int A04() {
        return this.A03;
    }

    public final void A06() {
        int length = this.A05.length();
        if (length > 0) {
            int length2 = length - 1;
            this.A05.delete(length2, length);
            int length3 = this.A06.size();
            for (int i = length3 - 1; i >= 0; i--) {
                List<FP> list = this.A06;
                String[] strArr = A08;
                String str = strArr[2];
                String str2 = strArr[3];
                int i2 = str.length();
                int length4 = str2.length();
                if (i2 != length4) {
                    throw new RuntimeException();
                }
                String[] strArr2 = A08;
                strArr2[0] = "cQse4OX3";
                strArr2[6] = "MGHTHr2HMLcimDeu5sZkGF";
                FP fp = list.get(i);
                int length5 = fp.A00;
                if (length5 == length) {
                    int length6 = fp.A00;
                    fp.A00 = length6 - 1;
                } else {
                    return;
                }
            }
        }
    }

    /* JADX WARN: Incorrect condition in loop: B:4:0x0022 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void A07() {
        /*
            r3 = this;
            java.util.List<android.text.SpannableString> r1 = r3.A07
            android.text.SpannableString r0 = r3.A00()
            r1.add(r0)
            java.lang.StringBuilder r0 = r3.A05
            r2 = 0
            r0.setLength(r2)
            java.util.List<com.facebook.ads.redexgen.X.FP> r0 = r3.A06
            r0.clear()
            int r1 = r3.A01
            int r0 = r3.A03
            int r1 = java.lang.Math.min(r1, r0)
        L1c:
            java.util.List<android.text.SpannableString> r0 = r3.A07
            int r0 = r0.size()
            if (r0 < r1) goto L2a
            java.util.List<android.text.SpannableString> r0 = r3.A07
            r0.remove(r2)
            goto L1c
        L2a:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.ads.redexgen.X.FQ.A07():void");
    }

    public final void A08(char c) {
        this.A05.append(c);
    }

    public final void A09(int i) {
        this.A00 = i;
        this.A06.clear();
        this.A07.clear();
        this.A05.setLength(0);
        this.A03 = 15;
        this.A02 = 0;
        this.A04 = 0;
    }

    public final void A0A(int i) {
        this.A01 = i;
    }

    public final void A0B(int i) {
        this.A02 = i;
    }

    public final void A0C(int i) {
        this.A03 = i;
    }

    public final void A0D(int i) {
        this.A04 = i;
    }

    public final void A0E(int i, boolean z) {
        this.A06.add(new FP(i, z, this.A05.length()));
    }

    public final boolean A0F() {
        if (this.A06.isEmpty() && this.A07.isEmpty()) {
            StringBuilder sb = this.A05;
            String[] strArr = A08;
            if (strArr[0].length() == strArr[6].length()) {
                throw new RuntimeException();
            }
            String[] strArr2 = A08;
            strArr2[7] = "ONSLHBaiVChTiCDyCbz7MeGvMb5ZJwv8";
            strArr2[1] = "WV9KVve3dIDV1UZxgbczLfOjx2KW4DPJ";
            if (sb.length() == 0) {
                return true;
            }
        }
        return false;
    }

    public final String toString() {
        return this.A05.toString();
    }
}
