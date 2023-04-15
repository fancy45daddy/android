package com.facebook.ads.redexgen.X;

import a.a.j;
import androidx.annotation.Nullable;
import java.io.File;
import java.util.Arrays;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
/* loaded from: assets/audience_network.dex */
public final class TW extends C0413Gu {
    public static byte[] A00;
    public static final Pattern A01;
    public static final Pattern A02;
    public static final Pattern A03;

    /* JADX WARN: Failed to parse debug info
    java.lang.ArrayIndexOutOfBoundsException: Index 17 out of bounds for length 12
    	at jadx.plugins.input.dex.sections.debuginfo.DebugInfoParser.process(DebugInfoParser.java:147)
    	at jadx.plugins.input.dex.sections.DexCodeReader.getDebugInfo(DexCodeReader.java:118)
    	at jadx.core.dex.nodes.MethodNode.getDebugInfo(MethodNode.java:567)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.visit(DebugInfoAttachVisitor.java:39)
     */
    @Nullable
    public static TW A00(File file, C0417Gy c0417Gy) {
        String name = file.getName();
        if (!name.endsWith(A06(1, 7, j.AppCompatTheme_toolbarNavigationButtonStyle))) {
            file = A05(file, c0417Gy);
            if (file == null) {
                return null;
            }
            name = file.getName();
        }
        Matcher matcher = A03.matcher(name);
        if (matcher.matches()) {
            long length = file.length();
            String A0C = c0417Gy.A0C(Integer.parseInt(matcher.group(1)));
            if (A0C == null) {
                return null;
            }
            return new TW(A0C, Long.parseLong(matcher.group(2)), length, Long.parseLong(matcher.group(3)), file);
        }
        return null;
    }

    public static String A06(int i, int i2, int i3) {
        byte[] copyOfRange = Arrays.copyOfRange(A00, i, i + i2);
        for (int i4 = 0; i4 < copyOfRange.length; i4++) {
            copyOfRange[i4] = (byte) ((copyOfRange[i4] ^ i3) ^ 18);
        }
        return new String(copyOfRange);
    }

    public static void A07() {
        A00 = new byte[]{120, 86, 14, 75, 86, 29, 0, 23, 39, 81, 87, 82, 80, 37, 87, 81, 37, 29, 82, 80, 37, 87, 81, 37, 29, 82, 80, 37, 87, 15, 72, 37, 87, 28, 1, 22, 93, 107, 29, 27, 30, 28, 105, 27, 29, 105, 81, 30, 28, 105, 27, 29, 105, 81, 30, 28, 105, 27, 67, 7, 105, 27, 80, 77, 90, 17, 85, 35, 87, 111, 32, 34, 87, 37, 35, 87, 111, 32, 34, 87, 37, 35, 87, 111, 32, 34, 87, 37, 125, 56, 87, 37, 110, 115, 100, 47};
    }

    static {
        A07();
        A01 = Pattern.compile(A06(8, 29, j.AppCompatTheme_toolbarStyle), 32);
        A02 = Pattern.compile(A06(37, 29, 39), 32);
        A03 = Pattern.compile(A06(66, 30, 25), 32);
    }

    public TW(String str, long j, long j2, long j3, @Nullable File file) {
        super(str, j, j2, j3, file);
    }

    public static TW A01(String str, long j) {
        return new TW(str, j, -1L, -9223372036854775807L, null);
    }

    public static TW A02(String str, long j) {
        return new TW(str, j, -1L, -9223372036854775807L, null);
    }

    public static TW A03(String str, long j, long j2) {
        return new TW(str, j, j2, -9223372036854775807L, null);
    }

    public static File A04(File file, int i, long j, long j2) {
        StringBuilder sb = new StringBuilder();
        sb.append(i);
        String A06 = A06(0, 1, 68);
        sb.append(A06);
        sb.append(j);
        sb.append(A06);
        sb.append(j2);
        sb.append(A06(1, 7, j.AppCompatTheme_toolbarNavigationButtonStyle));
        return new File(file, sb.toString());
    }

    @Nullable
    public static File A05(File file, C0417Gy c0417Gy) {
        String filename;
        String name = file.getName();
        Matcher matcher = A02.matcher(name);
        if (matcher.matches()) {
            String filename2 = matcher.group(1);
            filename = C0430Hl.A0O(filename2);
            if (filename == null) {
                return null;
            }
        } else {
            matcher = A01.matcher(name);
            if (!matcher.matches()) {
                return null;
            }
            filename = matcher.group(1);
        }
        File parentFile = file.getParentFile();
        int A08 = c0417Gy.A08(filename);
        String filename3 = matcher.group(2);
        long parseLong = Long.parseLong(filename3);
        String filename4 = matcher.group(3);
        File A04 = A04(parentFile, A08, parseLong, Long.parseLong(filename4));
        if (file.renameTo(A04)) {
            return A04;
        }
        return null;
    }

    public final TW A08(int i) {
        H6.A04(this.A05);
        long currentTimeMillis = System.currentTimeMillis();
        return new TW(this.A04, this.A02, this.A01, currentTimeMillis, A04(this.A03.getParentFile(), i, this.A02, currentTimeMillis));
    }
}
