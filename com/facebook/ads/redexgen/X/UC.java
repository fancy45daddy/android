package com.facebook.ads.redexgen.X;

import a.a.j;
import android.text.Html;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.text.style.ForegroundColorSpan;
import android.text.style.StyleSpan;
import android.text.style.TypefaceSpan;
import android.text.style.UnderlineSpan;
import android.util.Log;
import com.facebook.ads.internal.exoplayer2.Format;
import com.facebook.ads.internal.exoplayer2.text.ttml.TtmlNode;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.nio.charset.Charset;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.zip.DataFormatException;
import java.util.zip.Inflater;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;
import org.xmlpull.v1.XmlPullParserFactory;
/* loaded from: assets/audience_network.dex */
public class UC implements FM {
    public static byte[] A00;

    static {
        A01();
    }

    public static String A00(int i, int i2, int i3) {
        byte[] copyOfRange = Arrays.copyOfRange(A00, i, i + i2);
        for (int i4 = 0; i4 < copyOfRange.length; i4++) {
            copyOfRange[i4] = (byte) ((copyOfRange[i4] ^ i3) ^ j.AppCompatTheme_textAppearanceSmallPopupMenu);
        }
        return new String(copyOfRange);
    }

    public static void A01() {
        A00 = new byte[]{62, 11, 11, 26, 18, 15, 11, 26, 27, 95, 11, 16, 95, 28, 13, 26, 30, 11, 26, 95, 27, 26, 28, 16, 27, 26, 13, 95, 25, 16, 13, 95, 10, 17, 12, 10, 15, 15, 16, 13, 11, 26, 27, 95, 25, 16, 13, 18, 30, 11, 113, 96, 96, 124, 121, 115, 113, 100, 121, Byte.MAX_VALUE, 126, 63, 115, 117, 113, 61, 38, 32, 40, 29, 12, 12, 16, 21, 31, 29, 8, 21, 19, 18, 83, 31, 25, 29, 81, 75, 76, 68, 103, 118, 118, 106, 111, 101, 103, 114, 111, 105, 104, 41, 98, 112, 100, 117, 115, 100, 117, 28, 13, 13, 17, 20, 30, 28, 9, 20, 18, 19, 82, 13, 26, 14, 81, 64, 64, 92, 89, 83, 81, 68, 89, 95, 94, 31, 68, 68, 93, 92, 27, 72, 93, 92, 33, 48, 48, 44, 41, 35, 33, 52, 41, 47, 46, 111, 56, 109, 45, 48, 116, 109, 35, 37, 33, 109, 118, 112, 120, 63, 46, 46, 50, 55, 61, 63, 42, 55, 49, 48, 113, 38, 115, 51, 46, 106, 115, 40, 42, 42, 123, 106, 106, 118, 115, 121, 123, 110, 115, 117, 116, 53, 98, 55, 107, 111, 115, 121, 113, 110, 115, 119, Byte.MAX_VALUE, 55, 110, 98, 41, 125, 4, 21, 21, 9, 12, 6, 4, 17, 12, 10, 11, 74, 29, 72, 22, 16, 7, 23, 12, 21, 99, 114, 111, 99, 56, 97, 99, 99, 70, 87, 74, 70, 29, 74, 31, 65, 65, 83};
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    @Override // com.facebook.ads.redexgen.X.FM
    public final UD A4G(Format format) {
        char c;
        String str = format.A0O;
        switch (str.hashCode()) {
            case -1351681404:
                if (str.equals(A00(88, 19, 97))) {
                    c = '\t';
                    break;
                }
                c = 65535;
                break;
            case -1248334819:
                if (str.equals(A00(j.AppCompatTheme_toolbarStyle, 15, 26))) {
                    c = '\n';
                    break;
                }
                c = 65535;
                break;
            case -1026075066:
                if (str.equals(A00(167, 21, 57))) {
                    c = 2;
                    break;
                }
                c = 65535;
                break;
            case -1004728940:
                if (str.equals(A00(236, 8, j.AppCompatTheme_windowActionBarOverlay))) {
                    c = 0;
                    break;
                }
                c = 65535;
                break;
            case 691401887:
                if (str.equals(A00(188, 28, 125))) {
                    c = 5;
                    break;
                }
                c = 65535;
                break;
            case 822864842:
                if (str.equals(A00(244, 10, 85))) {
                    c = 1;
                    break;
                }
                c = 65535;
                break;
            case 930165504:
                if (str.equals(A00(142, 25, 39))) {
                    c = 7;
                    break;
                }
                c = 65535;
                break;
            case 1566015601:
                if (str.equals(A00(50, 19, j.AppCompatTheme_windowMinWidthMinor))) {
                    c = 6;
                    break;
                }
                c = 65535;
                break;
            case 1566016562:
                if (str.equals(A00(69, 19, 27))) {
                    c = '\b';
                    break;
                }
                c = 65535;
                break;
            case 1668750253:
                if (str.equals(A00(216, 20, 2))) {
                    c = 4;
                    break;
                }
                c = 65535;
                break;
            case 1693976202:
                if (str.equals(A00(122, 20, 87))) {
                    c = 3;
                    break;
                }
                c = 65535;
                break;
            default:
                c = 65535;
                break;
        }
        switch (c) {
            case 0:
                return new AbstractC0265Am() { // from class: com.facebook.ads.redexgen.X.2O
                    public static byte[] A05;
                    public static String[] A06 = {"CMeD5mXDZDTfb", "fWYAWHkLFKDlflVtn3klkQMszSy2czx5", "00RFRgIDsqiIARLTNA3N6SPhWhBdnLh1", "U8JLQKkyCBG48OlAsiyvwZYOetZ2qreJ", "pY35d7af18sebuviuQ2bLCANBl7hHJuY", "f8ToU2BaHxZg9tVTog2hKPYEgQcC6j0M", "sxXavdrivd5JbbwFv9VJPSRnNTBEZ25u", "aixApfSzl80yG78LfLrSNW905rKMIX1l"};
                    public final C0381Fo A00;
                    public final C0387Fu A01;
                    public final C0390Fx A02;
                    public final HV A03;
                    public final List<C0385Fs> A04;

                    public static String A02(int i, int i2, int i3) {
                        byte[] copyOfRange = Arrays.copyOfRange(A05, i, i + i2);
                        for (int i4 = 0; i4 < copyOfRange.length; i4++) {
                            copyOfRange[i4] = (byte) ((copyOfRange[i4] ^ i3) ^ j.AppCompatTheme_windowActionModeOverlay);
                        }
                        return new String(copyOfRange);
                    }

                    public static void A03() {
                        A05 = new byte[]{89, 56, 107, 108, 97, 116, 125, 56, 122, 116, 119, 123, 115, 56, 111, 121, 107, 56, 126, 119, 109, 118, 124, 56, 121, 126, 108, 125, 106, 56, 108, 112, 125, 56, 126, 113, 106, 107, 108, 56, 123, 109, 125, 54, 52, 53, 46, 63, 28, 27, 22, 3, 10, 29, 47, 40, 60, 62, 62, 14, 47, 41, 37, 46, 47, 56};
                    }

                    static {
                        A03();
                    }

                    {
                        A02(53, 13, 59);
                        this.A02 = new C0390Fx();
                        this.A03 = new HV();
                        this.A01 = new C0387Fu();
                        this.A00 = new C0381Fo();
                        this.A04 = new ArrayList();
                    }

                    public static int A00(HV hv) {
                        int i = -1;
                        int i2 = 0;
                        while (i == -1) {
                            i2 = hv.A06();
                            String A0P = hv.A0P();
                            if (A0P == null) {
                                i = 0;
                            } else if (A02(48, 5, 62).equals(A0P)) {
                                i = 2;
                            } else if (A02(44, 4, 11).startsWith(A0P)) {
                                i = 1;
                            } else {
                                i = 3;
                            }
                        }
                        hv.A0Y(i2);
                        String[] strArr = A06;
                        String str2 = strArr[1];
                        String line = strArr[2];
                        int currentInputPosition = str2.charAt(4);
                        int foundEvent = line.charAt(4);
                        if (currentInputPosition != foundEvent) {
                            String[] strArr2 = A06;
                            strArr2[1] = "wICfUq6cRqM8QSRmpIxw59la3C0B28Gh";
                            strArr2[2] = "UCa9DZD1GiApguhXmO9GHmNOpL0AOlSY";
                            return i;
                        }
                        throw new RuntimeException();
                    }

                    /* JADX INFO: Access modifiers changed from: private */
                    /* JADX WARN: Removed duplicated region for block: B:50:0x00a0 A[SYNTHETIC] */
                    /* JADX WARN: Removed duplicated region for block: B:58:0x0042 A[SYNTHETIC] */
                    @Override // com.facebook.ads.redexgen.X.AbstractC0265Am
                    /* renamed from: A01 */
                    /*
                        Code decompiled incorrectly, please refer to instructions dump.
                        To view partially-correct add '--show-bad-code' argument
                    */
                    public final com.facebook.ads.redexgen.X.U1 A0b(byte[] r7, int r8, boolean r9) throws com.facebook.ads.redexgen.X.FL {
                        /*
                            Method dump skipped, instructions count: 235
                            To view this dump add '--comments-level debug' option
                        */
                        throw new UnsupportedOperationException("Method not decompiled: com.facebook.ads.redexgen.X.C2O.A0b(byte[], int, boolean):com.facebook.ads.redexgen.X.U1");
                    }

                    public static void A04(HV hv) {
                        do {
                        } while (!TextUtils.isEmpty(hv.A0P()));
                    }
                };
            case 1:
                return new C00802w(format.A0P);
            case 2:
                return new AbstractC0265Am() { // from class: com.facebook.ads.redexgen.X.2f
                    public static byte[] A02;
                    public static final int A03;
                    public static final int A04;
                    public static final int A05;
                    public final C0387Fu A00;
                    public final HV A01;

                    public static String A02(int i, int i2, int i3) {
                        byte[] copyOfRange = Arrays.copyOfRange(A02, i, i + i2);
                        for (int i4 = 0; i4 < copyOfRange.length; i4++) {
                            copyOfRange[i4] = (byte) ((copyOfRange[i4] - i3) - 118);
                        }
                        return new String(copyOfRange);
                    }

                    public static void A03() {
                        A02 = new byte[]{1, 38, 27, 39, 37, 40, 36, 29, 44, 29, -40, 5, 40, -20, 15, 29, 26, 46, 44, 44, -40, 12, 39, 40, -40, 4, 29, 46, 29, 36, -40, 26, 39, 48, -40, 32, 29, 25, 28, 29, 42, -40, 30, 39, 45, 38, 28, -26, 43, 80, 69, 81, 79, 82, 78, 71, 86, 71, 2, 88, 86, 86, 2, 69, 87, 71, 2, 68, 81, 90, 2, 74, 71, 67, 70, 71, 84, 2, 72, 81, 87, 80, 70, 16, 16, 51, -9, 26, 40, 37, 57, 55, 55, 7, 40, 38, 50, 39, 40, 53, 3, -12, 12, -1, -14, -13, -13, -26, 54, 52, 52, 35};
                    }

                    static {
                        A03();
                        A03 = C0430Hl.A08(A02(100, 4, 29));
                        A04 = C0430Hl.A08(A02(j.AppCompatTheme_textColorAlertDialogListItem, 4, 9));
                        A05 = C0430Hl.A08(A02(j.AppCompatTheme_tooltipForegroundColor, 4, 74));
                    }

                    {
                        A02(84, 16, 77);
                        this.A01 = new HV();
                        this.A00 = new C0387Fu();
                    }

                    public static FJ A00(HV hv, C0387Fu c0387Fu, int i) throws FL {
                        c0387Fu.A0E();
                        while (i > 0) {
                            if (i >= 8) {
                                int boxSize = hv.A08();
                                int A08 = hv.A08();
                                int payloadLength = boxSize - 8;
                                byte[] bArr = hv.A00;
                                int boxSize2 = hv.A06();
                                String A0R = C0430Hl.A0R(bArr, boxSize2, payloadLength);
                                hv.A0Z(payloadLength);
                                i = (i - 8) - payloadLength;
                                int boxSize3 = A04;
                                if (A08 == boxSize3) {
                                    C0390Fx.A08(A0R, c0387Fu);
                                } else {
                                    int boxSize4 = A03;
                                    if (A08 == boxSize4) {
                                        C0390Fx.A0C(null, A0R.trim(), c0387Fu, Collections.emptyList());
                                    }
                                }
                            } else {
                                throw new FL(A02(48, 36, j.AppCompatTheme_tooltipForegroundColor));
                            }
                        }
                        return c0387Fu.A0D();
                    }

                    /* JADX INFO: Access modifiers changed from: private */
                    @Override // com.facebook.ads.redexgen.X.AbstractC0265Am
                    /* renamed from: A01 */
                    public final U3 A0b(byte[] bArr, int i, boolean z) throws FL {
                        this.A01.A0b(bArr, i);
                        ArrayList arrayList = new ArrayList();
                        while (this.A01.A04() > 0) {
                            if (this.A01.A04() >= 8) {
                                int A08 = this.A01.A08();
                                int boxSize = this.A01.A08();
                                if (boxSize == A05) {
                                    arrayList.add(A00(this.A01, this.A00, A08 - 8));
                                } else {
                                    this.A01.A0Z(A08 - 8);
                                }
                            } else {
                                throw new FL(A02(0, 48, 66));
                            }
                        }
                        return new U3(arrayList);
                    }
                };
            case 3:
                return new AbstractC0265Am() { // from class: com.facebook.ads.redexgen.X.2u
                    public static byte[] A01;
                    public static String[] A02 = {"PhyvuE7y18", "xBnTZw3ZbiLDM63QcLiGd0", "O9uX8", "8b1nsz8L9hYpMQj9k3QW3WLnldrKItOm", "IMNHpcvYsehX8cLei6jDJchiF9gMYU0V", "8kdCvXuY1XJXgrxFttVDI6044U6IZeyY", "sEif2eB2MLrj2k4lXiRDbZReHYoJKwJL", "5aPBLAKnhKpgqnxagNkfr0"};
                    public static final C0372Ff A03;
                    public static final C0373Fg A04;
                    public static final Pattern A05;
                    public static final Pattern A06;
                    public static final Pattern A07;
                    public static final Pattern A08;
                    public static final Pattern A09;
                    public final XmlPullParserFactory A00;

                    /* JADX WARN: Failed to parse debug info
                    java.lang.ArrayIndexOutOfBoundsException: Index 14 out of bounds for length 13
                    	at jadx.plugins.input.dex.sections.debuginfo.DebugInfoParser.startVar(DebugInfoParser.java:203)
                    	at jadx.plugins.input.dex.sections.debuginfo.DebugInfoParser.process(DebugInfoParser.java:125)
                    	at jadx.plugins.input.dex.sections.DexCodeReader.getDebugInfo(DexCodeReader.java:118)
                    	at jadx.core.dex.nodes.MethodNode.getDebugInfo(MethodNode.java:567)
                    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.visit(DebugInfoAttachVisitor.java:39)
                     */
                    public static long A00(String str2, C0373Fg c0373Fg) throws FL {
                        Matcher matcher = A06.matcher(str2);
                        if (matcher.matches()) {
                            double parseLong = (Long.parseLong(matcher.group(1)) * 3600) + (Long.parseLong(matcher.group(2)) * 60) + Long.parseLong(matcher.group(3));
                            String group = matcher.group(4);
                            double parseDouble = parseLong + (group != null ? Double.parseDouble(group) : 0.0d);
                            String group2 = matcher.group(5);
                            double parseLong2 = parseDouble + (group2 != null ? ((float) Long.parseLong(group2)) / c0373Fg.A00 : 0.0d);
                            String group3 = matcher.group(6);
                            return (long) (1000000.0d * (parseLong2 + (group3 != null ? (Long.parseLong(group3) / c0373Fg.A01) / c0373Fg.A00 : 0.0d)));
                        }
                        Matcher matcher2 = A08.matcher(str2);
                        if (!matcher2.matches()) {
                            throw new FL(A08(556, 27, 38) + str2);
                        }
                        double parseDouble2 = Double.parseDouble(matcher2.group(1));
                        String group4 = matcher2.group(2);
                        char c2 = 65535;
                        int hashCode = group4.hashCode();
                        if (hashCode != 102) {
                            if (hashCode != 104) {
                                if (hashCode != 109) {
                                    if (hashCode != 3494) {
                                        if (hashCode != 115) {
                                            if (hashCode == 116 && group4.equals(A08(1374, 1, 68))) {
                                                c2 = 5;
                                            }
                                        } else if (group4.equals(A08(1302, 1, 5))) {
                                            c2 = 2;
                                        }
                                    } else if (group4.equals(A08(1256, 2, 1))) {
                                        c2 = 3;
                                    }
                                } else if (group4.equals(A08(1247, 1, 86))) {
                                    c2 = 1;
                                }
                            } else if (group4.equals(A08(1178, 1, 87))) {
                                c2 = 0;
                            }
                        } else if (group4.equals(A08(1072, 1, 23))) {
                            c2 = 4;
                        }
                        if (c2 == 0) {
                            parseDouble2 *= 3600.0d;
                        } else if (c2 == 1) {
                            parseDouble2 *= 60.0d;
                        } else if (c2 != 2) {
                            if (c2 == 3) {
                                String[] strArr = A02;
                                if (strArr[1].length() != strArr[7].length()) {
                                    throw new RuntimeException();
                                }
                                String[] strArr2 = A02;
                                strArr2[6] = "4wWFQkJIgDUDxvhbLoyjDEJLfIHbXKXA";
                                strArr2[4] = "i9Tkte0qzP2dvhcWyRZLUYoYUmQQFstK";
                                parseDouble2 /= 1000.0d;
                            } else if (c2 == 4) {
                                parseDouble2 /= c0373Fg.A00;
                            } else if (c2 == 5) {
                                parseDouble2 /= c0373Fg.A02;
                            }
                        }
                        return (long) (1000000.0d * parseDouble2);
                    }

                    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
                    /* JADX WARN: Failed to parse debug info
                    java.lang.ArrayIndexOutOfBoundsException: Index 26 out of bounds for length 23
                    	at jadx.plugins.input.dex.sections.debuginfo.DebugInfoParser.startVar(DebugInfoParser.java:203)
                    	at jadx.plugins.input.dex.sections.debuginfo.DebugInfoParser.process(DebugInfoParser.java:135)
                    	at jadx.plugins.input.dex.sections.DexCodeReader.getDebugInfo(DexCodeReader.java:118)
                    	at jadx.core.dex.nodes.MethodNode.getDebugInfo(MethodNode.java:567)
                    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.visit(DebugInfoAttachVisitor.java:39)
                     */
                    private C0374Fh A03(XmlPullParser xmlPullParser, C0374Fh c0374Fh, Map<String, C0375Fi> map, C0373Fg c0373Fg) throws FL {
                        char c2;
                        C00782u c00782u = this;
                        long j = -9223372036854775807L;
                        long j2 = -9223372036854775807L;
                        long j3 = -9223372036854775807L;
                        String A082 = A08(0, 0, j.AppCompatTheme_textColorSearchUrl);
                        String[] strArr = null;
                        int attributeCount = xmlPullParser.getAttributeCount();
                        C0380Fn A062 = c00782u.A06(xmlPullParser, null);
                        int i = 0;
                        while (i < attributeCount) {
                            String attributeName = xmlPullParser.getAttributeName(i);
                            String attributeValue = xmlPullParser.getAttributeValue(i);
                            switch (attributeName.hashCode()) {
                                case -934795532:
                                    if (attributeName.equals(A08(1291, 6, 83))) {
                                        c2 = 4;
                                        break;
                                    }
                                    c2 = 65535;
                                    break;
                                case 99841:
                                    if (attributeName.equals(A08(1058, 3, 0))) {
                                        c2 = 2;
                                        break;
                                    }
                                    c2 = 65535;
                                    break;
                                case 100571:
                                    if (attributeName.equals(A08(1063, 3, 76))) {
                                        c2 = 1;
                                        break;
                                    }
                                    c2 = 65535;
                                    break;
                                case 93616297:
                                    if (attributeName.equals(A08(1003, 5, 47))) {
                                        c2 = 0;
                                        break;
                                    }
                                    c2 = 65535;
                                    break;
                                case 109780401:
                                    if (attributeName.equals(A08(1350, 5, 96))) {
                                        c2 = 3;
                                        break;
                                    }
                                    c2 = 65535;
                                    break;
                                default:
                                    c2 = 65535;
                                    break;
                            }
                            if (c2 == 0) {
                                j2 = A00(attributeValue, c0373Fg);
                            } else if (c2 == 1) {
                                j3 = A00(attributeValue, c0373Fg);
                            } else if (c2 == 2) {
                                j = A00(attributeValue, c0373Fg);
                            } else if (c2 == 3) {
                                String[] A0D = c00782u.A0D(attributeValue);
                                if (A0D.length > 0) {
                                    strArr = A0D;
                                }
                            } else if (c2 == 4 && map.containsKey(attributeValue)) {
                                A082 = attributeValue;
                            }
                            i++;
                            c00782u = this;
                        }
                        if (c0374Fh != null && c0374Fh.A02 != -9223372036854775807L) {
                            if (j2 != -9223372036854775807L) {
                                j2 += c0374Fh.A02;
                            }
                            if (j3 != -9223372036854775807L) {
                                j3 += c0374Fh.A02;
                            }
                        }
                        if (j3 == -9223372036854775807L) {
                            if (j != -9223372036854775807L) {
                                j3 = j2 + j;
                            } else if (c0374Fh != null && c0374Fh.A01 != -9223372036854775807L) {
                                j3 = c0374Fh.A01;
                            }
                        }
                        return C0374Fh.A05(xmlPullParser.getName(), j2, j3, A062, strArr, A082);
                    }

                    public static String A08(int i, int i2, int i3) {
                        byte[] copyOfRange = Arrays.copyOfRange(A01, i, i + i2);
                        for (int i4 = 0; i4 < copyOfRange.length; i4++) {
                            copyOfRange[i4] = (byte) ((copyOfRange[i4] - i3) - 51);
                        }
                        return new String(copyOfRange);
                    }

                    public static void A0A() {
                        A01 = new byte[]{-69, -61, -98, -91, 113, -52, -8, -2, -11, -19, -9, -80, -3, -87, -20, -5, -18, -22, -3, -18, -87, -31, -10, -11, -39, -2, -11, -11, -39, -22, -5, -4, -18, -5, -49, -22, -20, -3, -8, -5, 2, -87, -14, -9, -4, -3, -22, -9, -20, -18, -43, -16, -8, -5, -12, -13, -81, -1, -16, 1, 2, -8, -3, -10, -81, -15, -16, -14, -6, -10, 1, -2, 4, -3, -13, -81, 5, -16, -5, 4, -12, -55, -81, -117, -90, -82, -79, -86, -87, 101, -75, -90, -73, -72, -82, -77, -84, 101, -88, -76, -79, -76, -73, 101, -69, -90, -79, -70, -86, Byte.MAX_VALUE, 101, -10, 17, 25, 28, 21, 20, -48, 32, 17, 34, 35, 25, 30, 23, -48, 22, 31, 30, 36, 3, 25, 42, 21, -48, 38, 17, 28, 37, 21, -22, -48, -101, -71, -64, -63, -60, -69, -64, -71, 114, -65, -77, -66, -72, -63, -60, -65, -73, -74, 114, -75, -73, -66, -66, 114, -60, -73, -59, -63, -66, -57, -58, -69, -63, -64, -116, 114, -90, -60, -53, -52, -49, -58, -53, -60, 125, -49, -62, -60, -58, -52, -53, 125, -44, -58, -47, -59, 125, -54, -66, -55, -61, -52, -49, -54, -62, -63, 125, -62, -43, -47, -62, -53, -47, -105, 125, -39, -9, -2, -1, 2, -7, -2, -9, -80, 2, -11, -9, -7, -1, -2, -80, 7, -7, 4, -8, -80, -3, -15, -4, -10, -1, 2, -3, -11, -12, -80, -1, 2, -7, -9, -7, -2, -54, -80, -108, -78, -71, -70, -67, -76, -71, -78, 107, -67, -80, -78, -76, -70, -71, 107, -62, -76, -65, -77, 107, -64, -71, -66, -64, -69, -69, -70, -67, -65, -80, -81, 107, -80, -61, -65, -80, -71, -65, -123, 107, -95, -65, -58, -57, -54, -63, -58, -65, 120, -54, -67, -65, -63, -57, -58, 120, -49, -63, -52, -64, 120, -51, -58, -53, -51, -56, -56, -57, -54, -52, -67, -68, 120, -57, -54, -63, -65, -63, -58, -110, 120, -54, -24, -17, -16, -13, -22, -17, -24, -95, -13, -26, -24, -22, -16, -17, -95, -8, -22, -11, -23, -16, -10, -11, -95, -30, -17, -95, -26, -7, -11, -26, -17, -11, -75, -45, -38, -37, -34, -43, -38, -45, -116, -34, -47, -45, -43, -37, -38, -116, -29, -43, -32, -44, -37, -31, -32, -116, -51, -38, -116, -37, -34, -43, -45, -43, -38, -50, -20, -13, -12, -9, -18, -13, -20, -91, -6, -13, -8, -6, -11, -11, -12, -9, -7, -22, -23, -91, -7, -26, -20, -65, -91, -111, -74, -66, -87, -76, -79, -84, 104, -85, -83, -76, -76, 104, -70, -83, -69, -73, -76, -67, -68, -79, -73, -74, 104, -6, 31, 39, 18, 29, 26, 21, -47, 22, 41, 33, 35, 22, 36, 36, 26, 32, 31, -47, 23, 32, 35, -47, 23, 32, 31, 37, 4, 26, 43, 22, -21, -47, -40, -19, 18, 26, 5, 16, 13, 8, -60, 18, 25, 17, 6, 9, 22, -60, 19, 10, -60, 9, 18, 24, 22, 13, 9, 23, -60, 10, 19, 22, -60, 10, 19, 18, 24, -9, 13, 30, 9, -34, -60, -9, 28, 36, 15, 26, 23, 18, -50, 35, 28, 23, 34, -50, 20, 29, 32, -50, 20, 29, 28, 34, 1, 23, 40, 19, -24, -50, -43, -90, -70, -59, -65, -56, -53, -58, -66, -67, 121, -51, -62, -58, -66, 121, -66, -47, -55, -53, -66, -52, -52, -62, -56, -57, -109, 121, -43, -3, -12, -4, -15, -8, -12, -19, -88, -2, -23, -12, -3, -19, -5, -88, -15, -10, -88, -18, -9, -10, -4, -37, -15, 2, -19, -88, -23, -4, -4, -6, -15, -22, -3, -4, -19, -74, -88, -40, -15, -21, -13, -15, -10, -17, -88, -4, -16, -19, -88, -5, -19, -21, -9, -10, -20, -88, -2, -23, -12, -3, -19, -88, -18, -9, -6, -88, -2, -19, -6, -4, -15, -21, -23, -12, -88, -18, -9, -10, -4, -88, -5, -15, 2, -19, -88, -23, -10, -20, -88, -15, -17, -10, -9, -6, -15, -10, -17, -88, -4, -16, -19, -88, -18, -15, -6, -5, -4, -74, 1, 35, 30, 30, 32, 19, 33, 33, 23, 28, 21, -50, 30, 15, 32, 33, 19, 32, -50, 19, 32, 32, 29, 32, -97, -65, -72, -73, -113, -80, -82, -70, -81, -80, -67, -18, 7, -6, -5, 5, -2, -71, 13, 8, -71, -3, -2, -4, 8, -3, -2, -71, 12, 8, 14, 11, -4, -2, -60, -35, -44, -25, -33, -44, -46, -29, -44, -45, -113, -44, -31, -31, -34, -31, -113, -26, -41, -44, -35, -113, -31, -44, -48, -45, -40, -35, -42, -113, -40, -35, -33, -28, -29, -99, -41, -18, -90, 9, -45, -45, 6, -37, -40, -28, 8, -43, -39, -44, -22, 6, -37, -40, -28, 8, -42, -44, -45, 27, 35, 39, 16, 24, 39, -48, -44, -49, -105, 97, -108, 105, 102, 114, -106, 100, 97, 120, 115, -107, 103, -108, 105, 102, 114, -106, 100, 98, 120, 98, 97, -95, -75, -90, -75, -84, -75, -90, -84, -75, -97, -75, -83, 98, 93, -39, -93, -42, -85, -88, -76, -40, -42, -85, -88, -76, -40, -90, -92, -75, -93, -42, -85, -88, -76, -40, -42, -85, -88, -76, -40, -92, -75, -93, -42, -85, -88, -76, -40, -42, -85, -88, -76, -40, -92, -93, -70, -75, -93, -41, -87, -42, -85, -88, -76, -40, -90, -92, -9, -75, -93, -42, -85, -88, -76, -40, -42, -85, -88, -76, -40, -92, -93, -70, -75, -41, -87, -93, -42, -85, -88, -76, -40, -90, -92, -92, -70, -92, -70, -97, -35, -89, -37, -29, -86, -88, -97, -89, -37, -29, -86, -88, -93, -20, -74, -22, -14, -71, -22, -68, -51, -22, -14, -72, -51, -73, -77, -82, -74, -22, -14, -71, -22, -68, -51, -22, -14, -72, -51, -73, -77, -78, -64, -59, -45, -60, -47, -79, -80, -78, -70, -74, -63, -66, -60, -67, -77, -110, -66, 
                        -69, -66, -63, -60, -57, -55, -53, -48, -94, -81, -92, -71, -100, -87, -90, -98, -54, -38, -28, -26, -19, -19, -45, -26, -12, -16, -19, -10, -11, -22, -16, -17, -62, -60, -51, -45, -60, -47, -15, -3, -6, -3, 0, -72, -67, -57, -60, -64, -75, -51, -107, -64, -67, -69, -62, -24, -19, -6, -105, -88, -91, -92, -84, -28, -19, -29, -52, -33, -37, -52, -43, -37, -80, -58, -49, -50, -44, -90, -63, -51, -55, -52, -39, -82, -73, -74, -68, -101, -79, -62, -83, -61, -52, -53, -47, -80, -47, -42, -55, -62, -2, 7, 6, 12, -17, -3, 1, -1, 0, 12, -13, -1, -18, -6, -14, -33, -18, 1, -14, -60, -48, -65, -53, -61, -80, -65, -46, -61, -85, -45, -54, -46, -57, -50, -54, -57, -61, -48, 2, 14, -3, 9, 1, -18, -3, 16, 1, -23, 17, 8, 16, 5, 12, 8, 5, 1, 14, -68, 0, 11, 1, 15, 10, -61, 16, -68, 4, -3, 18, 1, -68, -50, -68, 12, -3, 14, 16, 15, -14, 6, 3, -1, 2, 0, 12, 12, 8, -46, -57, -57, 15, 15, 15, -58, 15, -53, -58, 7, 10, -1, -57, 6, 11, -57, 12, 12, 5, 4, -69, 8, -7, 10, -7, 5, -3, 12, -3, 10, 23, 18, -24, -13, -32, -21, -24, -30, -10, -21, 3, -7, -1, -2, -49, -56, -55, -41, -1, -4, 1, -8, 7, -5, 5, 2, 8, -6, -5, -10, 14, 6, 21, 2, 5, 2, 21, 2, -95, -89, 17, 18, 15, 12, 17, 8, 23, 11, 21, 18, 24, 10, 11, -67, -66, -60, -67, -77, -76, -63, -69, -72, -67, -76, -3, 0, -9, -11, -9, -4, -7, -89, -81, -8, -21, -19, -17, -11, -12, -67, -76, -78, -77, -65, -85, -44, -50, -47, -43, -58, -101, -59, -62, -43, -62, -46, -52, -49, -45, -60, -103, -56, -52, -64, -58, -60, 20, 14, 17, 21, 6, -37, 10, 15, 7, 16, 19, 14, 2, 21, 10, 16, 15, 4, 1, -14, -1, -85, -84, -103, -86, -84, 6, 7, 12, -1, -8, -80, -79, -74, -87, -90, -85, -92, 7, 9, -10, -38, 6, -11, 1, -7, -26, -11, 8, -7, -21, 2, -13, 6, 2, -49, -6, -9, -11, -4, -33, -48, -29, -33, -81, -48, -50, -38, -35, -52, -33, -44, -38, -39, -62, -73, -79, -71, -96, -81, -62, -77, -12, -12, -16, -23, -33, -32, -19, -25, -28, -23, -32};
                    }

                    static {
                        A0A();
                        A06 = Pattern.compile(A08(856, 85, 72));
                        A08 = Pattern.compile(A08(819, 37, 6));
                        A07 = Pattern.compile(A08(790, 29, j.AppCompatTheme_windowNoTitle));
                        A09 = Pattern.compile(A08(954, 29, 91));
                        A05 = Pattern.compile(A08(941, 13, 76));
                        A04 = new C0373Fg(30.0f, 1, 1);
                        A03 = new C0372Ff(32, 15);
                    }

                    {
                        A08(717, 11, 24);
                        try {
                            this.A00 = XmlPullParserFactory.newInstance();
                            this.A00.setNamespaceAware(true);
                        } catch (XmlPullParserException e) {
                            throw new RuntimeException(A08(5, 45, 86), e);
                        }
                    }

                    private C0372Ff A01(XmlPullParser xmlPullParser, C0372Ff c0372Ff) throws FL {
                        String attributeValue = xmlPullParser.getAttributeValue(A08(1183, 35, j.AppCompatTheme_textAppearanceSearchResultSubtitle), A08(1018, 14, 78));
                        if (attributeValue == null) {
                            return c0372Ff;
                        }
                        Matcher matcher = A05.matcher(attributeValue);
                        boolean matches = matcher.matches();
                        String A082 = A08(142, 36, 31);
                        String A083 = A08(717, 11, 24);
                        if (!matches) {
                            String cellResolution = A082 + attributeValue;
                            Log.w(A083, cellResolution);
                            return c0372Ff;
                        }
                        try {
                            String cellResolution2 = matcher.group(1);
                            int parseInt = Integer.parseInt(cellResolution2);
                            String cellResolution3 = matcher.group(2);
                            int parseInt2 = Integer.parseInt(cellResolution3);
                            if (parseInt != 0 && parseInt2 != 0) {
                                return new C0372Ff(parseInt, parseInt2);
                            }
                            StringBuilder sb = new StringBuilder();
                            String cellResolution4 = A08(430, 24, 21);
                            sb.append(cellResolution4);
                            sb.append(parseInt);
                            String cellResolution5 = A08(0, 1, j.AppCompatTheme_textColorAlertDialogListItem);
                            sb.append(cellResolution5);
                            sb.append(parseInt2);
                            throw new FL(sb.toString());
                        } catch (NumberFormatException unused) {
                            String cellResolution6 = A082 + attributeValue;
                            Log.w(A083, cellResolution6);
                            return c0372Ff;
                        }
                    }

                    /* JADX WARN: Code restructure failed: missing block: B:17:0x009f, code lost:
                        if (r0 != null) goto L20;
                     */
                    /* JADX WARN: Code restructure failed: missing block: B:18:0x00a1, code lost:
                        r4 = java.lang.Integer.parseInt(r0);
                     */
                    /* JADX WARN: Code restructure failed: missing block: B:19:0x00a5, code lost:
                        r3 = com.facebook.ads.redexgen.X.C00782u.A04.A02;
                        r0 = r10.getAttributeValue(r7, A08(1398, 8, 27));
                     */
                    /* JADX WARN: Code restructure failed: missing block: B:20:0x00b7, code lost:
                        if (r0 == null) goto L24;
                     */
                    /* JADX WARN: Code restructure failed: missing block: B:21:0x00b9, code lost:
                        r3 = java.lang.Integer.parseInt(r0);
                     */
                    /* JADX WARN: Code restructure failed: missing block: B:23:0x00c4, code lost:
                        return new com.facebook.ads.redexgen.X.C0373Fg(r6 * r5, r4, r3);
                     */
                    /* JADX WARN: Code restructure failed: missing block: B:25:0x00d6, code lost:
                        if (r0 != null) goto L20;
                     */
                    /*
                        Code decompiled incorrectly, please refer to instructions dump.
                        To view partially-correct add '--show-bad-code' argument
                    */
                    private com.facebook.ads.redexgen.X.C0373Fg A02(org.xmlpull.v1.XmlPullParser r10) throws com.facebook.ads.redexgen.X.FL {
                        /*
                            Method dump skipped, instructions count: 233
                            To view this dump add '--comments-level debug' option
                        */
                        throw new UnsupportedOperationException("Method not decompiled: com.facebook.ads.redexgen.X.C00782u.A02(org.xmlpull.v1.XmlPullParser):com.facebook.ads.redexgen.X.Fg");
                    }

                    /* JADX WARN: Removed duplicated region for block: B:28:0x00cf  */
                    /* JADX WARN: Removed duplicated region for block: B:32:0x00e6  */
                    /*
                        Code decompiled incorrectly, please refer to instructions dump.
                        To view partially-correct add '--show-bad-code' argument
                    */
                    private com.facebook.ads.redexgen.X.C0375Fi A04(org.xmlpull.v1.XmlPullParser r20, com.facebook.ads.redexgen.X.C0372Ff r21) {
                        /*
                            Method dump skipped, instructions count: 420
                            To view this dump add '--comments-level debug' option
                        */
                        throw new UnsupportedOperationException("Method not decompiled: com.facebook.ads.redexgen.X.C00782u.A04(org.xmlpull.v1.XmlPullParser, com.facebook.ads.redexgen.X.Ff):com.facebook.ads.redexgen.X.Fi");
                    }

                    private C0380Fn A05(C0380Fn c0380Fn) {
                        return c0380Fn == null ? new C0380Fn() : c0380Fn;
                    }

                    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
                    /* JADX WARN: Code restructure failed: missing block: B:115:0x0366, code lost:
                        if (r14.equals(r15) != false) goto L145;
                     */
                    /* JADX WARN: Code restructure failed: missing block: B:116:0x0368, code lost:
                        r15 = 0;
                     */
                    /* JADX WARN: Code restructure failed: missing block: B:118:0x0376, code lost:
                        if (r14.equals(r15) != false) goto L145;
                     */
                    /* JADX WARN: Code restructure failed: missing block: B:72:0x0230, code lost:
                        if (r2.equals(r14) != false) goto L100;
                     */
                    /* JADX WARN: Code restructure failed: missing block: B:73:0x0232, code lost:
                        r8 = 1;
                     */
                    /* JADX WARN: Code restructure failed: missing block: B:75:0x023f, code lost:
                        if (r2.equals(r14) != false) goto L100;
                     */
                    /* JADX WARN: Code restructure failed: missing block: B:80:0x026b, code lost:
                        if (r2.equals(A08(1236, 11, 96)) != false) goto L107;
                     */
                    /* JADX WARN: Code restructure failed: missing block: B:81:0x026d, code lost:
                        r8 = 0;
                     */
                    /* JADX WARN: Code restructure failed: missing block: B:83:0x027a, code lost:
                        if (r2.equals(A08(1236, 11, 96)) != false) goto L107;
                     */
                    /* JADX WARN: Code restructure failed: missing block: B:92:0x02ce, code lost:
                        if (r14 != false) goto L122;
                     */
                    /* JADX WARN: Code restructure failed: missing block: B:93:0x02d0, code lost:
                        r15 = 6;
                     */
                    /* JADX WARN: Code restructure failed: missing block: B:94:0x02d3, code lost:
                        if (r14 != false) goto L122;
                     */
                    /*
                        Code decompiled incorrectly, please refer to instructions dump.
                        To view partially-correct add '--show-bad-code' argument
                    */
                    private com.facebook.ads.redexgen.X.C0380Fn A06(org.xmlpull.v1.XmlPullParser r17, com.facebook.ads.redexgen.X.C0380Fn r18) {
                        /*
                            Method dump skipped, instructions count: 1052
                            To view this dump add '--comments-level debug' option
                        */
                        throw new UnsupportedOperationException("Method not decompiled: com.facebook.ads.redexgen.X.C00782u.A06(org.xmlpull.v1.XmlPullParser, com.facebook.ads.redexgen.X.Fn):com.facebook.ads.redexgen.X.Fn");
                    }

                    /* JADX INFO: Access modifiers changed from: private */
                    @Override // com.facebook.ads.redexgen.X.AbstractC0265Am
                    /* renamed from: A07 */
                    public final U5 A0b(byte[] bArr, int i, boolean z) throws FL {
                        XmlPullParser newPullParser;
                        HashMap hashMap;
                        HashMap hashMap2;
                        try {
                            newPullParser = this.A00.newPullParser();
                            hashMap = new HashMap();
                            hashMap2 = new HashMap();
                            hashMap2.put(A08(0, 0, j.AppCompatTheme_textColorSearchUrl), new C0375Fi(null));
                        } catch (IOException e) {
                            e = e;
                        } catch (XmlPullParserException e2) {
                            e = e2;
                        }
                        try {
                            newPullParser.setInput(new ByteArrayInputStream(bArr, 0, i), null);
                            U5 u5 = null;
                            ArrayDeque<TtmlNode> nodeStack = new ArrayDeque<>();
                            int i2 = 0;
                            C0373Fg c0373Fg = A04;
                            C0372Ff c0372Ff = A03;
                            for (int eventType = newPullParser.getEventType(); eventType != 1; eventType = newPullParser.getEventType()) {
                                C0374Fh c0374Fh = (C0374Fh) nodeStack.peek();
                                if (i2 == 0) {
                                    String name = newPullParser.getName();
                                    String A082 = A08(1406, 2, 77);
                                    if (eventType == 2) {
                                        if (A082.equals(name)) {
                                            c0373Fg = A02(newPullParser);
                                            c0372Ff = A01(newPullParser, A03);
                                        }
                                        boolean A0C = A0C(name);
                                        String A083 = A08(717, 11, 24);
                                        if (!A0C) {
                                            Log.i(A083, A08(404, 26, 82) + newPullParser.getName());
                                            i2++;
                                        } else if (A08(1179, 4, j.AppCompatTheme_toolbarStyle).equals(name)) {
                                            A09(newPullParser, hashMap, hashMap2, c0372Ff);
                                        } else {
                                            try {
                                                C0374Fh node = A03(newPullParser, c0374Fh, hashMap2, c0373Fg);
                                                nodeStack.push(node);
                                                if (c0374Fh != null) {
                                                    c0374Fh.A0E(node);
                                                }
                                            } catch (FL e3) {
                                                Log.w(A083, A08(693, 24, 123), e3);
                                                i2++;
                                            }
                                        }
                                    } else if (eventType == 4) {
                                        c0374Fh.A0E(C0374Fh.A04(newPullParser.getText()));
                                    } else if (eventType == 3) {
                                        if (newPullParser.getName().equals(A082)) {
                                            u5 = new U5((C0374Fh) nodeStack.peek(), hashMap, hashMap2);
                                        }
                                        nodeStack.pop();
                                    }
                                } else if (eventType == 2) {
                                    i2++;
                                } else if (eventType == 3) {
                                    i2--;
                                }
                                newPullParser.next();
                            }
                            return u5;
                        } catch (IOException e4) {
                            e = e4;
                            throw new IllegalStateException(A08(751, 36, 60), e);
                        } catch (XmlPullParserException e5) {
                            e = e5;
                            throw new FL(A08(728, 23, j.AppCompatTheme_textAppearanceSearchResultTitle), e);
                        }
                    }

                    private Map<String, C0380Fn> A09(XmlPullParser xmlPullParser, Map<String, C0380Fn> map, Map<String, C0375Fi> map2, C0372Ff c0372Ff) throws IOException, XmlPullParserException {
                        C0375Fi A042;
                        String[] A0D;
                        do {
                            xmlPullParser.next();
                            String A082 = A08(1350, 5, 96);
                            if (C0431Hm.A04(xmlPullParser, A082)) {
                                String A002 = C0431Hm.A00(xmlPullParser, A082);
                                C0380Fn A062 = A06(xmlPullParser, new C0380Fn());
                                if (A002 != null) {
                                    for (String parentStyleId : A0D(A002)) {
                                        A062.A0E(map.get(parentStyleId));
                                        String parentStyleId2 = A02[0];
                                        if (parentStyleId2.length() == 24) {
                                            throw new RuntimeException();
                                        }
                                        A02[3] = "r1XXjzavA19mnteqm7IXmxWY8MBC2sF6";
                                    }
                                }
                                if (A062.A0M() != null) {
                                    map.put(A062.A0M(), A062);
                                }
                            } else if (C0431Hm.A04(xmlPullParser, A08(1291, 6, 83)) && (A042 = A04(xmlPullParser, c0372Ff)) != null) {
                                map2.put(A042.A07, A042);
                            }
                        } while (!C0431Hm.A03(xmlPullParser, A08(1179, 4, j.AppCompatTheme_toolbarStyle)));
                        return map;
                    }

                    public static void A0B(String str2, C0380Fn c0380Fn) throws FL {
                        Matcher matcher;
                        String[] A0l = C0430Hl.A0l(str2, A08(787, 3, 72));
                        if (A0l.length == 1) {
                            matcher = A07.matcher(str2);
                        } else if (A0l.length == 2) {
                            matcher = A07.matcher(A0l[1]);
                            Log.w(A08(717, 11, 24), A08(583, j.AppCompatTheme_viewInflaterClass, 85));
                        } else {
                            throw new FL(A08(488, 40, j.AppCompatTheme_windowActionModeOverlay) + A0l.length + A08(4, 1, 16));
                        }
                        boolean matches = matcher.matches();
                        String A082 = A08(2, 2, 68);
                        if (matches) {
                            String group = matcher.group(3);
                            char c2 = 65535;
                            int hashCode = group.hashCode();
                            if (hashCode != 37) {
                                if (A02[5].charAt(9) == 'f') {
                                    throw new RuntimeException();
                                }
                                A02[2] = "t0LdGmQ0v8qyO2";
                                if (hashCode != 3240) {
                                    if (hashCode == 3592 && group.equals(A08(1289, 2, 4))) {
                                        c2 = 0;
                                    }
                                } else if (group.equals(A08(1061, 2, 12))) {
                                    c2 = 1;
                                }
                            } else if (group.equals(A08(1, 1, j.AppCompatTheme_toolbarStyle))) {
                                c2 = 2;
                            }
                            if (c2 == 0) {
                                c0380Fn.A0C(1);
                            } else if (c2 == 1) {
                                c0380Fn.A0C(2);
                            } else if (c2 == 2) {
                                c0380Fn.A0C(3);
                            } else {
                                throw new FL(A08(528, 28, 123) + group + A082);
                            }
                            float floatValue = Float.valueOf(matcher.group(1)).floatValue();
                            String[] strArr = A02;
                            if (strArr[1].length() != strArr[7].length()) {
                                String[] strArr2 = A02;
                                strArr2[1] = "urdYGq7WwvJk1zliqVN4P2";
                                strArr2[7] = "ZdoJtzuRVAPxJXqYig85Db";
                                c0380Fn.A09(floatValue);
                                return;
                            }
                            String[] strArr3 = A02;
                            strArr3[1] = "Kk4kf6fnicwp8j22CAgUPO";
                            strArr3[7] = "fW8tIDgKJv3U6D0UEBEE9j";
                            c0380Fn.A09(floatValue);
                            return;
                        }
                        throw new FL(A08(454, 34, 126) + str2 + A082);
                    }

                    public static boolean A0C(String str2) {
                        return str2.equals(A08(1406, 2, 77)) || str2.equals(A08(1179, 4, j.AppCompatTheme_toolbarStyle)) || str2.equals(A08(1008, 4, 13)) || str2.equals(A08(1055, 3, 81)) || str2.equals(A08(1288, 1, 86)) || str2.equals(A08(1341, 4, 94)) || str2.equals(A08(1016, 2, 53)) || str2.equals(A08(1350, 5, 96)) || str2.equals(A08(1355, 7, 10)) || str2.equals(A08(1226, 6, 87)) || str2.equals(A08(1291, 6, 83)) || str2.equals(A08(1248, 8, j.AppCompatTheme_viewInflaterClass)) || str2.equals(A08(1313, 11, 44)) || str2.equals(A08(1303, 10, 46)) || str2.equals(A08(1324, 17, j.AppCompatTheme_viewInflaterClass));
                    }

                    private String[] A0D(String str2) {
                        String trim = str2.trim();
                        return trim.isEmpty() ? new String[0] : C0430Hl.A0l(trim, A08(787, 3, 72));
                    }
                };
            case 4:
                return new AbstractC0265Am() { // from class: com.facebook.ads.redexgen.X.2v
                    public static byte[] A01;
                    public static String[] A02 = {"3MOBlr", "0DhiPEnslefQ61m7AjWKH0Dx7dIlVLH6", "rp7TRUp2Utk2Kzh0KXhj1OM3FBWO", "kN44IufTXn3JrEQj4nNHg0bfvC0oTmjD", "OifCwo2rldbue0L51wUPSBWzKiQKf6dm", "cz3ck9zx8XU8dqptbmXcRQWSnweik5k", "6fY6w3uzibwvfWVjzeUSGJKNywar3ei2", "sygTD4E3XWLeExwvPEtpnqdNQjJK5lOm"};
                    public static final Pattern A03;
                    public final StringBuilder A00;

                    public static String A02(int i, int i2, int i3) {
                        byte[] copyOfRange = Arrays.copyOfRange(A01, i, i + i2);
                        for (int i4 = 0; i4 < copyOfRange.length; i4++) {
                            copyOfRange[i4] = (byte) ((copyOfRange[i4] ^ i3) ^ 61);
                        }
                        return new String(copyOfRange);
                    }

                    public static void A03() {
                        A01 = new byte[]{46, 112, 96, 44, 78, 118, 116, 109, 109, 116, 115, 122, 61, 116, 115, 107, 124, 113, 116, 121, 61, 116, 115, 121, 120, 101, 39, 61, 40, 16, 18, 11, 11, 18, 21, 28, 91, 18, 21, 13, 26, 23, 18, 31, 91, 15, 18, 22, 18, 21, 28, 65, 91, 59, 29, 10, 26, 1, 24, 44, 13, 11, 7, 12, 13, 26, 14, 53, 62, 35, 43, 62, 56, 47, 62, 63, 123, 62, 53, 63, 111, 64, 25, 27, 27, 12, 9, 27, 111, 87, 24, 26, 9, 26, 12, 27, 111, 87, 24, 26, 9, 27, 111, 87, 24, 26, 31, 27, 111, 87, 24, 26, 26, 111, 64, 25, 30, 30, 13, 111, 64, 25, 27, 27, 12, 9, 27, 111, 87, 24, 26, 9, 26, 12, 27, 111, 87, 24, 26, 9, 27, 111, 87, 24, 26, 31, 27, 111, 87, 24, 26, 26, 12, 111, 64, 25};
                    }

                    static {
                        A03();
                        A03 = Pattern.compile(A02(80, 76, 14));
                    }

                    {
                        A02(53, 13, 85);
                        this.A00 = new StringBuilder();
                    }

                    public static long A00(Matcher matcher, int i) {
                        long timestampMs = Long.parseLong(matcher.group(i + 2));
                        long parseLong = (Long.parseLong(matcher.group(i + 1)) * 60 * 60 * 1000) + (timestampMs * 60 * 1000);
                        long timestampMs2 = Long.parseLong(matcher.group(i + 3));
                        long j = parseLong + (timestampMs2 * 1000);
                        long timestampMs3 = Long.parseLong(matcher.group(i + 4));
                        return 1000 * (j + timestampMs3);
                    }

                    /* JADX INFO: Access modifiers changed from: private */
                    @Override // com.facebook.ads.redexgen.X.AbstractC0265Am
                    /* renamed from: A01 */
                    public final U6 A0b(byte[] bArr, int i, boolean z) {
                        String A022 = A02(53, 13, 85);
                        ArrayList arrayList = new ArrayList();
                        HL hl = new HL();
                        HV subripData = new HV(bArr, i);
                        while (true) {
                            String A0P = subripData.A0P();
                            if (A0P == null) {
                                break;
                            } else if (A0P.length() != 0) {
                                try {
                                    Integer.parseInt(A0P);
                                    boolean z2 = false;
                                    String A0P2 = subripData.A0P();
                                    if (A0P2 == null) {
                                        Log.w(A022, A02(66, 14, j.AppCompatTheme_textAppearanceSearchResultTitle));
                                        break;
                                    }
                                    Matcher matcher = A03.matcher(A0P2);
                                    if (!matcher.matches()) {
                                        Log.w(A022, A02(28, 25, 70) + A0P2);
                                    } else if (A02[2].length() == 5) {
                                        throw new RuntimeException();
                                    } else {
                                        A02[5] = "w8SSp6GDTl1u71HT2BYG3nb3Lg3oTFs";
                                        hl.A04(A00(matcher, 1));
                                        if (!TextUtils.isEmpty(matcher.group(6))) {
                                            z2 = true;
                                            hl.A04(A00(matcher, 6));
                                        }
                                        this.A00.setLength(0);
                                        while (true) {
                                            String A0P3 = subripData.A0P();
                                            if (TextUtils.isEmpty(A0P3)) {
                                                break;
                                            }
                                            if (this.A00.length() > 0) {
                                                this.A00.append(A02(0, 4, 47));
                                            }
                                            this.A00.append(A0P3.trim());
                                        }
                                        arrayList.add(new FJ(Html.fromHtml(this.A00.toString())));
                                        if (z2) {
                                            arrayList.add(null);
                                        }
                                    }
                                } catch (NumberFormatException unused) {
                                    Log.w(A022, A02(4, 24, 32) + A0P);
                                }
                            }
                        }
                        FJ[] fjArr = new FJ[arrayList.size()];
                        arrayList.toArray(fjArr);
                        return new U6(fjArr, hl.A05());
                    }
                };
            case 5:
                final List<byte[]> list = format.A0P;
                return new AbstractC0265Am(list) { // from class: com.facebook.ads.redexgen.X.2n
                    public static byte[] A07;
                    public static final int A08;
                    public static final int A09;
                    public float A00;
                    public int A01;
                    public int A02;
                    public int A03;
                    public String A04;
                    public boolean A05;
                    public final HV A06;

                    public static String A00(int i, int i2, int i3) {
                        byte[] copyOfRange = Arrays.copyOfRange(A07, i, i + i2);
                        for (int i4 = 0; i4 < copyOfRange.length; i4++) {
                            copyOfRange[i4] = (byte) ((copyOfRange[i4] - i3) - 21);
                        }
                        return new String(copyOfRange);
                    }

                    public static void A02() {
                        A07 = new byte[]{120, -118, -105, -114, -117, 116, -104, 83, -121, 100, -123, -125, -113, -124, -123, -110, -67, -68, -82, -107, -103, -98, -49, -50, -64, -89, -78, 119, -112, -121, -102, -110, -121, -123, -106, -121, -122, 66, -107, -105, -124, -106, -117, -106, -114, -121, 66, -120, -111, -108, -113, -125, -106, 80, -1, -19, -6, -1, -71, -1, -15, -2, -11, -14, -93, -107, -94, -103, -106, -101, -100, -95, -108, -34, -52, -39, -30};
                    }

                    static {
                        A02();
                        A08 = C0430Hl.A08(A00(69, 4, 19));
                        A09 = C0430Hl.A08(A00(73, 4, 85));
                    }

                    {
                        super(A00(5, 11, 11));
                        this.A06 = new HV();
                        A07(list);
                    }

                    public static String A01(HV hv) throws FL {
                        char firstChar;
                        A08(hv.A04() >= 2);
                        int A0I = hv.A0I();
                        if (A0I == 0) {
                            return A00(0, 0, 91);
                        }
                        int textLength = hv.A04();
                        if (textLength >= 2 && ((firstChar = hv.A02()) == 65279 || firstChar == 65534)) {
                            return hv.A0T(A0I, Charset.forName(A00(16, 6, 83)));
                        }
                        return hv.A0T(A0I, Charset.forName(A00(22, 5, j.AppCompatTheme_textAppearanceSearchResultSubtitle)));
                    }

                    public static void A03(SpannableStringBuilder spannableStringBuilder, int i, int i2, int i3, int i4, int i5) {
                        if (i != i2) {
                            int colorArgb = i5 | 33;
                            spannableStringBuilder.setSpan(new ForegroundColorSpan(((i & 255) << 24) | (i >>> 8)), i3, i4, colorArgb);
                        }
                    }

                    public static void A04(SpannableStringBuilder spannableStringBuilder, int i, int i2, int i3, int i4, int i5) {
                        if (i != i2) {
                            int i6 = i5 | 33;
                            int flags = i & 1;
                            boolean z = flags != 0;
                            int flags2 = i & 2;
                            boolean z2 = flags2 != 0;
                            if (z) {
                                if (z2) {
                                    spannableStringBuilder.setSpan(new StyleSpan(3), i3, i4, i6);
                                } else {
                                    spannableStringBuilder.setSpan(new StyleSpan(1), i3, i4, i6);
                                }
                            } else if (z2) {
                                spannableStringBuilder.setSpan(new StyleSpan(2), i3, i4, i6);
                            }
                            int flags3 = i & 4;
                            boolean z3 = flags3 != 0;
                            if (z3) {
                                spannableStringBuilder.setSpan(new UnderlineSpan(), i3, i4, i6);
                            }
                            if (!z3 && !z && !z2) {
                                spannableStringBuilder.setSpan(new StyleSpan(0), i3, i4, i6);
                            }
                        }
                    }

                    public static void A05(SpannableStringBuilder spannableStringBuilder, String str2, String str3, int i, int i2, int i3) {
                        if (str2 != str3) {
                            spannableStringBuilder.setSpan(new TypefaceSpan(str2), i, i2, i3 | 33);
                        }
                    }

                    private void A06(HV hv, SpannableStringBuilder spannableStringBuilder) throws FL {
                        A08(hv.A04() >= 12);
                        int A0I = hv.A0I();
                        int A0I2 = hv.A0I();
                        hv.A0Z(2);
                        int A0E = hv.A0E();
                        hv.A0Z(1);
                        int end = hv.A08();
                        A04(spannableStringBuilder, A0E, this.A03, A0I, A0I2, 0);
                        int fontFace = this.A02;
                        A03(spannableStringBuilder, end, fontFace, A0I, A0I2, 0);
                    }

                    private void A07(List<byte[]> list2) {
                        String A002 = A00(54, 10, j.AppCompatTheme_windowMinWidthMinor);
                        if (list2 != null && list2.size() == 1 && (list2.get(0).length == 48 || list2.get(0).length == 53)) {
                            byte[] initializationBytes = list2.get(0);
                            this.A03 = initializationBytes[24];
                            this.A02 = ((initializationBytes[26] & 255) << 24) | ((initializationBytes[27] & 255) << 16) | ((initializationBytes[28] & 255) << 8) | (initializationBytes[29] & 255);
                            if (A00(0, 5, 16).equals(C0430Hl.A0R(initializationBytes, 43, initializationBytes.length - 43))) {
                                A002 = A00(64, 5, 27);
                            }
                            this.A04 = A002;
                            this.A01 = initializationBytes[25] * 20;
                            this.A05 = (initializationBytes[0] & 32) != 0;
                            if (this.A05) {
                                int requestedVerticalPlacement = this.A01;
                                this.A00 = (((initializationBytes[10] & 255) << 8) | (initializationBytes[11] & 255)) / requestedVerticalPlacement;
                                this.A00 = C0430Hl.A00(this.A00, 0.0f, 0.95f);
                                return;
                            }
                            this.A00 = 0.85f;
                            return;
                        }
                        this.A03 = 0;
                        this.A02 = -1;
                        this.A04 = A002;
                        this.A05 = false;
                        this.A00 = 0.85f;
                    }

                    public static void A08(boolean z) throws FL {
                        if (z) {
                            return;
                        }
                        throw new FL(A00(27, 27, 13));
                    }

                    @Override // com.facebook.ads.redexgen.X.AbstractC0265Am
                    public final FK A0b(byte[] bArr, int i, boolean z) throws FL {
                        this.A06.A0b(bArr, i);
                        String A01 = A01(this.A06);
                        if (A01.isEmpty()) {
                            return U4.A01;
                        }
                        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(A01);
                        A04(spannableStringBuilder, this.A03, 0, 0, spannableStringBuilder.length(), 16711680);
                        A03(spannableStringBuilder, this.A02, -1, 0, spannableStringBuilder.length(), 16711680);
                        A05(spannableStringBuilder, this.A04, A00(54, 10, j.AppCompatTheme_windowMinWidthMinor), 0, spannableStringBuilder.length(), 16711680);
                        float verticalPlacement = this.A00;
                        while (this.A06.A04() >= 8) {
                            int A06 = this.A06.A06();
                            int atomSize = this.A06.A08();
                            int position = this.A06.A08();
                            if (position == A08) {
                                A08(this.A06.A04() >= 2);
                                int A0I = this.A06.A0I();
                                for (int i2 = 0; i2 < A0I; i2++) {
                                    A06(this.A06, spannableStringBuilder);
                                }
                            } else if (position == A09 && this.A05) {
                                A08(this.A06.A04() >= 2);
                                verticalPlacement = C0430Hl.A00(this.A06.A0I() / this.A01, 0.0f, 0.95f);
                            }
                            this.A06.A0Y(A06 + atomSize);
                        }
                        return new U4(new FJ(spannableStringBuilder, null, verticalPlacement, 0, 0, Float.MIN_VALUE, Integer.MIN_VALUE, Float.MIN_VALUE));
                    }
                };
            case 6:
            case 7:
                return new AnonymousClass32(format.A0O, format.A03);
            case '\b':
                final int i = format.A03;
                return new AbstractC0254Ab(i) { // from class: com.facebook.ads.redexgen.X.31
                    public static byte[] A09;
                    public static String[] A0A = {"L1xpy5cp85DZhci17XuVPwuBI", "YkTNFPOzwzkJtYlViXkR23NQqoCQppA0", "SGim0bOTaYlclFO3csKadT6H6g9xYkcM", "jQ8PzV3P", "QC0kpNF7RiOrPOmNNHkvJn0tMmNRSOb3", "UpfI1Vr3VxozUqaf4r1nY355XZgGFNi", "PidsADYQpUdS401V", "6iBltx3Oq3HhhZI1vDwKIUw2PCH0pZTk"};
                    public int A00;
                    public FR A01;
                    public FS A02;
                    public List<FJ> A03;
                    public List<FJ> A04;
                    public final int A05;
                    public final FR[] A08;
                    public final HV A07 = new HV();
                    public final HU A06 = new HU();

                    public static String A00(int i2, int i3, int i4) {
                        byte[] copyOfRange = Arrays.copyOfRange(A09, i2, i2 + i3);
                        for (int i5 = 0; i5 < copyOfRange.length; i5++) {
                            copyOfRange[i5] = (byte) ((copyOfRange[i5] - i4) - 14);
                        }
                        return new String(copyOfRange);
                    }

                    /* JADX WARN: Failed to parse debug info
                    java.lang.ArrayIndexOutOfBoundsException: Index 10 out of bounds for length 10
                    	at jadx.plugins.input.dex.sections.debuginfo.DebugInfoParser.startVar(DebugInfoParser.java:203)
                    	at jadx.plugins.input.dex.sections.debuginfo.DebugInfoParser.process(DebugInfoParser.java:125)
                    	at jadx.plugins.input.dex.sections.DexCodeReader.getDebugInfo(DexCodeReader.java:118)
                    	at jadx.core.dex.nodes.MethodNode.getDebugInfo(MethodNode.java:567)
                    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.visit(DebugInfoAttachVisitor.java:39)
                     */
                    private void A03() {
                        this.A01.A0C(this.A06.A04(4), this.A06.A04(2), this.A06.A04(2), this.A06.A0F(), this.A06.A0F(), this.A06.A04(3), this.A06.A04(3));
                    }

                    /* JADX WARN: Failed to parse debug info
                    java.lang.ArrayIndexOutOfBoundsException: Index 7 out of bounds for length 7
                    	at jadx.plugins.input.dex.sections.debuginfo.DebugInfoParser.startVar(DebugInfoParser.java:203)
                    	at jadx.plugins.input.dex.sections.debuginfo.DebugInfoParser.process(DebugInfoParser.java:125)
                    	at jadx.plugins.input.dex.sections.DexCodeReader.getDebugInfo(DexCodeReader.java:118)
                    	at jadx.core.dex.nodes.MethodNode.getDebugInfo(MethodNode.java:567)
                    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.visit(DebugInfoAttachVisitor.java:39)
                     */
                    private void A04() {
                        int A01 = FR.A01(this.A06.A04(2), this.A06.A04(2), this.A06.A04(2), this.A06.A04(2));
                        int A012 = FR.A01(this.A06.A04(2), this.A06.A04(2), this.A06.A04(2), this.A06.A04(2));
                        this.A06.A08(2);
                        this.A01.A0B(A01, A012, FR.A00(this.A06.A04(2), this.A06.A04(2), this.A06.A04(2)));
                    }

                    /* JADX WARN: Failed to parse debug info
                    java.lang.ArrayIndexOutOfBoundsException: Index 14 out of bounds for length 13
                    	at jadx.plugins.input.dex.sections.debuginfo.DebugInfoParser.startVar(DebugInfoParser.java:203)
                    	at jadx.plugins.input.dex.sections.debuginfo.DebugInfoParser.process(DebugInfoParser.java:125)
                    	at jadx.plugins.input.dex.sections.DexCodeReader.getDebugInfo(DexCodeReader.java:118)
                    	at jadx.core.dex.nodes.MethodNode.getDebugInfo(MethodNode.java:567)
                    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.visit(DebugInfoAttachVisitor.java:39)
                     */
                    private void A06() {
                        int A01 = FR.A01(this.A06.A04(2), this.A06.A04(2), this.A06.A04(2), this.A06.A04(2));
                        int A04 = this.A06.A04(2);
                        int A002 = FR.A00(this.A06.A04(2), this.A06.A04(2), this.A06.A04(2));
                        if (this.A06.A0F()) {
                            A04 |= 4;
                        }
                        boolean A0F = this.A06.A0F();
                        int A042 = this.A06.A04(2);
                        int A043 = this.A06.A04(2);
                        int A044 = this.A06.A04(2);
                        this.A06.A08(8);
                        this.A01.A0D(A01, A002, A0F, A04, A042, A043, A044);
                    }

                    public static void A09() {
                        A09 = new byte[]{-102, -94, -19, -33, -21, -17, -33, -24, -35, -33, -102, -24, -17, -25, -36, -33, -20, -102, 108, 99, -70, -85, -88, -79, 99, -91, -81, -78, -90, -82, -106, -84, -67, -88, 99, -84, -74, 99, 115, 112, -126, 103, -80, -82, -75, -74, -71, -80, -75, -82, 103, -73, -88, -86, -78, -84, -69, 101, 89, -101, -82, -83, 89, -100, -82, -85, -85, -98, -89, -83, 89, -94, -89, -99, -98, -79, 89, -94, -84, 89, 116, -106, -110, 104, 97, 105, 117, -106, -108, -96, -107, -106, -93, -127, -77, -80, -80, -93, -84, -78, -86, -73, 94, -77, -84, -79, -77, -82, -82, -83, -80, -78, -93, -94, 94, -127, -115, -117, -117, Byte.MAX_VALUE, -116, -126, -99, -125, -106, -110, 111, 94, -127, -83, -85, -85, -97, -84, -94, 120, 94, -59, -9, -12, -12, -25, -16, -10, -18, -5, -94, -9, -16, -11, -9, -14, -14, -15, -12, -10, -25, -26, -94, -59, -47, -49, -49, -61, -48, -58, -31, -46, -77, -72, -94, -59, -15, -17, -17, -29, -16, -26, -68, -94, -103, -55, -53, -104, -72, -91, -74, -72, -64, -70, -55, 117, -70, -61, -71, -70, -71, 117, -59, -57, -70, -62, -74, -55, -54, -57, -70, -63, -50, -112, 117, -56, -66, -49, -70, 117, -66, -56, 117, 109, -106, -117, -105, -99, -106, -100, -115, -102, -115, -116, 72, 108, 124, 126, 107, 107, -121, 120, 105, 107, 115, 109, 124, -121, 108, 105, 124, 105, 72, -118, -115, -114, -105, -102, -115, 72, 108, 124, 126, 107, 107, -121, 120, 105, 107, 115, 109, 124, -121, 123, 124, 105, 122, 124, -119, -82, -74, -95, -84, -87, -92, 96, -125, 112, 96, -93, -81, -83, -83, -95, -82, -92, 122, 96, -42, -5, 3, -18, -7, -10, -15, -83, -48, -66, -83, -16, -4, -6, -6, -18, -5, -15, -57, -83, -110, -73, -65, -86, -75, -78, -83, 105, -112, 123, 105, -84, -79, -86, -69, -86, -84, -67, -82, -69, -125, 105, 118, -101, -93, -114, -103, -106, -111, 77, 116, 96, 77, -112, -107, -114, -97, -114, -112, -95, -110, -97, 103, 77, -104, -67, -59, -80, -69, -72, -77, 111, -79, -80, -62, -76, 111, -78, -66, -68, -68, -80, -67, -77, -119, 111, -55, -18, -10, -31, -20, -23, -28, -96, -27, -8, -12, -27, -18, -28, -27, -28, -96, -29, -17, -19, -19, -31, -18, -28, -70, -96, -6, -20, -7, -3, -16, -22, -20, -43, -4, -12, -23, -20, -7, -89, -16, -6, -89, -11, -10, -11, -76, 1, -20, -7, -10, -89, -81};
                    }

                    /* JADX WARN: Failed to parse debug info
                    java.lang.ArrayIndexOutOfBoundsException: Index 20 out of bounds for length 20
                    	at jadx.plugins.input.dex.sections.debuginfo.DebugInfoParser.startVar(DebugInfoParser.java:203)
                    	at jadx.plugins.input.dex.sections.debuginfo.DebugInfoParser.process(DebugInfoParser.java:125)
                    	at jadx.plugins.input.dex.sections.DexCodeReader.getDebugInfo(DexCodeReader.java:118)
                    	at jadx.core.dex.nodes.MethodNode.getDebugInfo(MethodNode.java:567)
                    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.visit(DebugInfoAttachVisitor.java:39)
                     */
                    private void A0E(int i2) {
                        FR fr = this.A08[i2];
                        this.A06.A08(2);
                        boolean A0F = this.A06.A0F();
                        boolean A0F2 = this.A06.A0F();
                        boolean A0F3 = this.A06.A0F();
                        int A04 = this.A06.A04(3);
                        boolean A0F4 = this.A06.A0F();
                        int A042 = this.A06.A04(7);
                        int A043 = this.A06.A04(8);
                        int A044 = this.A06.A04(4);
                        int A045 = this.A06.A04(4);
                        this.A06.A08(2);
                        int A046 = this.A06.A04(6);
                        this.A06.A08(2);
                        fr.A0F(A0F, A0F2, A0F3, A04, A0F4, A042, A043, A045, A046, A044, this.A06.A04(3), this.A06.A04(3));
                    }

                    static {
                        A09();
                    }

                    {
                        this.A05 = i == -1 ? 1 : i;
                        this.A08 = new FR[8];
                        for (int i2 = 0; i2 < 8; i2++) {
                            this.A08[i2] = new FR();
                        }
                        this.A01 = this.A08[0];
                        A08();
                    }

                    private List<FJ> A01() {
                        ArrayList arrayList = new ArrayList();
                        for (int i2 = 0; i2 < 8; i2++) {
                            if (!this.A08[i2].A0H() && this.A08[i2].A0I()) {
                                arrayList.add(this.A08[i2].A05());
                            }
                        }
                        Collections.sort(arrayList);
                        return Collections.unmodifiableList(arrayList);
                    }

                    private void A02() {
                        if (this.A02 == null) {
                            return;
                        }
                        A07();
                        this.A02 = null;
                    }

                    private void A05() {
                        this.A06.A08(4);
                        int A04 = this.A06.A04(4);
                        this.A06.A08(2);
                        int column = this.A06.A04(6);
                        this.A01.A0A(A04, column);
                    }

                    /* JADX WARN: Incorrect condition in loop: B:18:0x00d7 */
                    /*
                        Code decompiled incorrectly, please refer to instructions dump.
                        To view partially-correct add '--show-bad-code' argument
                    */
                    private void A07() {
                        /*
                            Method dump skipped, instructions count: 405
                            To view this dump add '--comments-level debug' option
                        */
                        throw new UnsupportedOperationException("Method not decompiled: com.facebook.ads.redexgen.X.AnonymousClass31.A07():void");
                    }

                    private void A08() {
                        for (int i2 = 0; i2 < 8; i2++) {
                            FR[] frArr = this.A08;
                            if (A0A[5].length() == 25) {
                                throw new RuntimeException();
                            }
                            A0A[5] = "s2U2A8";
                            frArr[i2].A08();
                        }
                    }

                    /* JADX WARN: Code restructure failed: missing block: B:15:0x0050, code lost:
                        if (r7 <= 23) goto L15;
                     */
                    /* JADX WARN: Code restructure failed: missing block: B:16:0x0052, code lost:
                        android.util.Log.w(r4, A00(93, 44, 48) + r7);
                        r6.A06.A08(8);
                     */
                    /* JADX WARN: Code restructure failed: missing block: B:17:0x0073, code lost:
                        return;
                     */
                    /* JADX WARN: Code restructure failed: missing block: B:18:0x0074, code lost:
                        if (r7 <= 23) goto L15;
                     */
                    /*
                        Code decompiled incorrectly, please refer to instructions dump.
                        To view partially-correct add '--show-bad-code' argument
                    */
                    private void A0A(int r7) {
                        /*
                            Method dump skipped, instructions count: 270
                            To view this dump add '--comments-level debug' option
                        */
                        throw new UnsupportedOperationException("Method not decompiled: com.facebook.ads.redexgen.X.AnonymousClass31.A0A(int):void");
                    }

                    private void A0B(int i2) {
                        FR fr;
                        switch (i2) {
                            case 128:
                            case 129:
                            case 130:
                            case 131:
                            case 132:
                            case 133:
                            case 134:
                            case 135:
                                int i3 = i2 - 128;
                                int window = this.A00;
                                if (window == i3) {
                                    return;
                                }
                                this.A00 = i3;
                                this.A01 = this.A08[i3];
                                return;
                            case 136:
                                for (int i4 = 1; i4 <= 8; i4++) {
                                    if (this.A06.A0F()) {
                                        int window2 = 8 - i4;
                                        this.A08[window2].A07();
                                    }
                                }
                                return;
                            case 137:
                                for (int i5 = 1; i5 <= 8; i5++) {
                                    boolean A0F = this.A06.A0F();
                                    String[] strArr = A0A;
                                    String str2 = strArr[4];
                                    String str3 = strArr[7];
                                    int charAt = str2.charAt(10);
                                    int window3 = str3.charAt(10);
                                    if (charAt == window3) {
                                        throw new RuntimeException();
                                    }
                                    A0A[5] = "EEpd";
                                    if (A0F) {
                                        int window4 = 8 - i5;
                                        this.A08[window4].A0E(true);
                                    }
                                }
                                return;
                            case 138:
                                for (int i6 = 1; i6 <= 8; i6++) {
                                    if (this.A06.A0F()) {
                                        int window5 = 8 - i6;
                                        this.A08[window5].A0E(false);
                                    }
                                }
                                return;
                            case 139:
                                for (int i7 = 1; i7 <= 8; i7++) {
                                    if (this.A06.A0F()) {
                                        int window6 = 8 - i7;
                                        this.A08[window6].A0E(!fr.A0I());
                                    }
                                }
                                return;
                            case 140:
                                for (int i8 = 1; i8 <= 8; i8++) {
                                    if (this.A06.A0F()) {
                                        int i9 = 8 - i8;
                                        this.A08[i9].A08();
                                    }
                                }
                                return;
                            case 141:
                                this.A06.A08(8);
                                return;
                            case 142:
                                return;
                            case 143:
                                A08();
                                return;
                            case 144:
                                if (!this.A01.A0G()) {
                                    this.A06.A08(16);
                                    return;
                                } else {
                                    A03();
                                    return;
                                }
                            case 145:
                                if (!this.A01.A0G()) {
                                    this.A06.A08(24);
                                    return;
                                } else {
                                    A04();
                                    return;
                                }
                            case 146:
                                if (!this.A01.A0G()) {
                                    this.A06.A08(16);
                                    return;
                                } else {
                                    A05();
                                    return;
                                }
                            case 147:
                            case 148:
                            case 149:
                            case 150:
                            default:
                                Log.w(A00(80, 13, 35), A00(294, 20, 127) + i2);
                                return;
                            case 151:
                                if (!this.A01.A0G()) {
                                    this.A06.A08(32);
                                    return;
                                } else {
                                    A06();
                                    return;
                                }
                            case 152:
                            case 153:
                            case 154:
                            case 155:
                            case 156:
                            case 157:
                            case 158:
                            case 159:
                                int i10 = i2 - 152;
                                A0E(i10);
                                int window7 = this.A00;
                                if (window7 == i10) {
                                    return;
                                }
                                this.A00 = i10;
                                this.A01 = this.A08[i10];
                                return;
                        }
                    }

                    private void A0C(int i2) {
                        if (i2 <= 7) {
                            return;
                        }
                        if (i2 <= 15) {
                            this.A06.A08(8);
                        } else if (i2 <= 23) {
                            this.A06.A08(16);
                        } else if (i2 > 31) {
                        } else {
                            this.A06.A08(24);
                        }
                    }

                    private void A0D(int i2) {
                        if (i2 <= 135) {
                            this.A06.A08(32);
                            return;
                        }
                        String[] strArr = A0A;
                        if (strArr[3].length() == strArr[6].length()) {
                            throw new RuntimeException();
                        }
                        String[] strArr2 = A0A;
                        strArr2[3] = "CkyZUSwm";
                        strArr2[6] = "y0ZSf6RqH8VvK6A8";
                        if (i2 <= 143) {
                            this.A06.A08(40);
                        } else if (i2 > 159) {
                        } else {
                            this.A06.A08(2);
                            int length = this.A06.A04(6);
                            this.A06.A08(length * 8);
                        }
                    }

                    private void A0F(int i2) {
                        if (i2 == 127) {
                            this.A01.A09((char) 9835);
                        } else {
                            this.A01.A09((char) (i2 & 255));
                        }
                    }

                    private void A0G(int i2) {
                        this.A01.A09((char) (i2 & 255));
                    }

                    private void A0H(int i2) {
                        if (i2 == 32) {
                            this.A01.A09(' ');
                        } else if (i2 == 33) {
                            this.A01.A09((char) 160);
                        } else if (i2 == 37) {
                            this.A01.A09((char) 8230);
                        } else if (i2 == 42) {
                            this.A01.A09((char) 352);
                        } else if (i2 == 44) {
                            this.A01.A09((char) 338);
                        } else if (i2 == 63) {
                            this.A01.A09((char) 376);
                        } else {
                            String[] strArr = A0A;
                            if (strArr[2].charAt(6) == strArr[1].charAt(6)) {
                                A0A[5] = "VBgxEtCZM8hUXU02q62ejO2N";
                                if (i2 == 57) {
                                    this.A01.A09((char) 8482);
                                    return;
                                } else if (i2 != 58) {
                                    if (i2 == 60) {
                                        this.A01.A09((char) 339);
                                        return;
                                    } else if (i2 != 61) {
                                        switch (i2) {
                                            case 48:
                                                this.A01.A09((char) 9608);
                                                return;
                                            case 49:
                                                this.A01.A09((char) 8216);
                                                return;
                                            case 50:
                                                FR fr = this.A01;
                                                String[] strArr2 = A0A;
                                                if (strArr2[3].length() == strArr2[6].length()) {
                                                    throw new RuntimeException();
                                                }
                                                A0A[0] = "pntPsILDFVvSJsAkqe";
                                                fr.A09((char) 8217);
                                                return;
                                            case 51:
                                                this.A01.A09((char) 8220);
                                                return;
                                            case 52:
                                                FR fr2 = this.A01;
                                                if (A0A[0].length() == 12) {
                                                    throw new RuntimeException();
                                                }
                                                String[] strArr3 = A0A;
                                                strArr3[4] = "pjkXXm09rSmpulg3ZnQvc2tVnRpvsPhy";
                                                strArr3[7] = "1ZIH3c3lD2nrVh46isF21y1NEU8S3DGz";
                                                fr2.A09((char) 8221);
                                                return;
                                            case 53:
                                                this.A01.A09((char) 8226);
                                                return;
                                            default:
                                                switch (i2) {
                                                    case j.AppCompatTheme_windowMinWidthMajor /* 118 */:
                                                        this.A01.A09((char) 8539);
                                                        return;
                                                    case j.AppCompatTheme_windowMinWidthMinor /* 119 */:
                                                        this.A01.A09((char) 8540);
                                                        return;
                                                    case j.AppCompatTheme_windowNoTitle /* 120 */:
                                                        this.A01.A09((char) 8541);
                                                        return;
                                                    case 121:
                                                        this.A01.A09((char) 8542);
                                                        return;
                                                    case 122:
                                                        this.A01.A09((char) 9474);
                                                        return;
                                                    case 123:
                                                        this.A01.A09((char) 9488);
                                                        return;
                                                    case 124:
                                                        this.A01.A09((char) 9492);
                                                        return;
                                                    case 125:
                                                        this.A01.A09((char) 9472);
                                                        return;
                                                    case 126:
                                                        this.A01.A09((char) 9496);
                                                        return;
                                                    case 127:
                                                        this.A01.A09((char) 9484);
                                                        return;
                                                    default:
                                                        Log.w(A00(80, 13, 35), A00(314, 22, 59) + i2);
                                                        return;
                                                }
                                        }
                                    } else {
                                        this.A01.A09((char) 8480);
                                        return;
                                    }
                                } else {
                                    FR fr3 = this.A01;
                                    if (A0A[0].length() != 12) {
                                        String[] strArr4 = A0A;
                                        strArr4[2] = "Hn1frjObrkKWee9bQkUvSoGsCyNbx6K5";
                                        strArr4[1] = "5jLxiAOonCPZsccE4Rlf5xBOSnJI2Mxj";
                                        fr3.A09((char) 353);
                                        return;
                                    }
                                }
                            }
                            throw new RuntimeException();
                        }
                    }

                    private void A0I(int i2) {
                        if (i2 == 160) {
                            this.A01.A09((char) 13252);
                            return;
                        }
                        Log.w(A00(80, 13, 35), A00(336, 22, 31) + i2);
                        this.A01.A09('_');
                    }

                    @Override // com.facebook.ads.redexgen.X.AbstractC0254Ab
                    public final FK A0L() {
                        List<FJ> list2 = this.A03;
                        this.A04 = list2;
                        return new UA(list2);
                    }

                    @Override // com.facebook.ads.redexgen.X.AbstractC0254Ab
                    public final /* bridge */ /* synthetic */ C0264Al A0M() throws FL {
                        return super.A4k();
                    }

                    @Override // com.facebook.ads.redexgen.X.AbstractC0254Ab
                    public final /* bridge */ /* synthetic */ AbstractC0262Aj A0N() throws FL {
                        return super.A4l();
                    }

                    @Override // com.facebook.ads.redexgen.X.AbstractC0254Ab
                    public final /* bridge */ /* synthetic */ void A0O(C0264Al c0264Al) throws FL {
                        super.ADP(c0264Al);
                    }

                    @Override // com.facebook.ads.redexgen.X.AbstractC0254Ab
                    public final void A0P(C0264Al c0264Al) {
                        FS fs;
                        this.A07.A0b(c0264Al.A01.array(), c0264Al.A01.limit());
                        while (this.A07.A04() >= 3) {
                            int A0E = this.A07.A0E() & 7;
                            int ccType = A0E & 3;
                            int ccTypeAndValid = A0E & 4;
                            boolean z = ccTypeAndValid == 4;
                            int A0E2 = this.A07.A0E();
                            int ccTypeAndValid2 = A0A[0].length();
                            if (ccTypeAndValid2 == 12) {
                                throw new RuntimeException();
                            }
                            String[] strArr = A0A;
                            strArr[4] = "mPNkJPPaAQUsGFTknTy0QJ3qIgBWTNxI";
                            strArr[7] = "fItgrykYfXnNqjhR9xK6GfD4mEN43S7J";
                            byte b2 = (byte) A0E2;
                            byte A0E3 = (byte) this.A07.A0E();
                            if (ccType == 2 || ccType == 3) {
                                if (z) {
                                    if (ccType == 3) {
                                        A02();
                                        int sequenceNumber = (b2 & 192) >> 6;
                                        int ccTypeAndValid3 = b2 & 63;
                                        if (ccTypeAndValid3 == 0) {
                                            ccTypeAndValid3 = 64;
                                        }
                                        this.A02 = new FS(sequenceNumber, ccTypeAndValid3);
                                        byte[] bArr = this.A02.A03;
                                        FS fs2 = this.A02;
                                        int ccTypeAndValid4 = fs2.A00;
                                        fs2.A00 = ccTypeAndValid4 + 1;
                                        bArr[ccTypeAndValid4] = A0E3;
                                    } else {
                                        H6.A03(ccType == 2);
                                        int ccTypeAndValid5 = A0A[0].length();
                                        if (ccTypeAndValid5 != 12) {
                                            String[] strArr2 = A0A;
                                            strArr2[3] = "0p2cTlko";
                                            strArr2[6] = "0zmBBYWCDQbGLnH6";
                                            fs = this.A02;
                                            if (fs == null) {
                                                Log.e(A00(80, 13, 35), A00(219, 55, 26));
                                            } else {
                                                byte[] bArr2 = fs.A03;
                                                FS fs3 = this.A02;
                                                int ccTypeAndValid6 = fs3.A00;
                                                fs3.A00 = ccTypeAndValid6 + 1;
                                                bArr2[ccTypeAndValid6] = b2;
                                                byte[] bArr3 = this.A02.A03;
                                                FS fs4 = this.A02;
                                                int ccTypeAndValid7 = fs4.A00;
                                                fs4.A00 = ccTypeAndValid7 + 1;
                                                bArr3[ccTypeAndValid7] = A0E3;
                                            }
                                        } else {
                                            String[] strArr3 = A0A;
                                            strArr3[3] = "AnSv654l";
                                            strArr3[6] = "VDMP1o28JZezz2Cr";
                                            fs = this.A02;
                                            if (fs == null) {
                                                Log.e(A00(80, 13, 35), A00(219, 55, 26));
                                            } else {
                                                byte[] bArr22 = fs.A03;
                                                FS fs32 = this.A02;
                                                int ccTypeAndValid62 = fs32.A00;
                                                fs32.A00 = ccTypeAndValid62 + 1;
                                                bArr22[ccTypeAndValid62] = b2;
                                                byte[] bArr32 = this.A02.A03;
                                                FS fs42 = this.A02;
                                                int ccTypeAndValid72 = fs42.A00;
                                                fs42.A00 = ccTypeAndValid72 + 1;
                                                bArr32[ccTypeAndValid72] = A0E3;
                                            }
                                        }
                                    }
                                    int ccTypeAndValid8 = this.A02.A00;
                                    if (ccTypeAndValid8 == (this.A02.A01 * 2) - 1) {
                                        A02();
                                    }
                                }
                            }
                        }
                    }

                    @Override // com.facebook.ads.redexgen.X.AbstractC0254Ab
                    public final boolean A0R() {
                        return this.A03 != this.A04;
                    }

                    @Override // com.facebook.ads.redexgen.X.AbstractC0254Ab, com.facebook.ads.redexgen.X.InterfaceC0260Ah
                    public final /* bridge */ /* synthetic */ void ADf() {
                        super.ADf();
                    }

                    @Override // com.facebook.ads.redexgen.X.AbstractC0254Ab, com.facebook.ads.redexgen.X.UD
                    public final /* bridge */ /* synthetic */ void AEY(long j) {
                        super.AEY(j);
                    }

                    @Override // com.facebook.ads.redexgen.X.AbstractC0254Ab, com.facebook.ads.redexgen.X.InterfaceC0260Ah
                    public final void flush() {
                        super.flush();
                        this.A03 = null;
                        this.A04 = null;
                        this.A00 = 0;
                        this.A01 = this.A08[this.A00];
                        A08();
                        this.A02 = null;
                    }
                };
            case '\t':
                final List<byte[]> list2 = format.A0P;
                return new AbstractC0265Am(list2) { // from class: com.facebook.ads.redexgen.X.2y
                    public static byte[] A01;
                    public final C0370Fd A00;

                    static {
                        A02();
                    }

                    /* JADX WARN: Failed to parse debug info
                    java.lang.ArrayIndexOutOfBoundsException: Index 5 out of bounds for length 5
                    	at jadx.plugins.input.dex.sections.debuginfo.DebugInfoParser.startVar(DebugInfoParser.java:203)
                    	at jadx.plugins.input.dex.sections.debuginfo.DebugInfoParser.process(DebugInfoParser.java:135)
                    	at jadx.plugins.input.dex.sections.DexCodeReader.getDebugInfo(DexCodeReader.java:118)
                    	at jadx.core.dex.nodes.MethodNode.getDebugInfo(MethodNode.java:567)
                    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.visit(DebugInfoAttachVisitor.java:39)
                     */
                    {
                        super(A01(0, 10, 61));
                        HV hv = new HV(list2.get(0));
                        this.A00 = new C0370Fd(hv.A0I(), hv.A0I());
                    }

                    public static String A01(int i2, int i3, int i4) {
                        byte[] copyOfRange = Arrays.copyOfRange(A01, i2, i2 + i3);
                        for (int i5 = 0; i5 < copyOfRange.length; i5++) {
                            copyOfRange[i5] = (byte) ((copyOfRange[i5] - i4) - 44);
                        }
                        return new String(copyOfRange);
                    }

                    public static void A02() {
                        A01 = new byte[]{-83, -33, -53, -83, -50, -52, -40, -51, -50, -37};
                    }

                    /* JADX INFO: Access modifiers changed from: private */
                    @Override // com.facebook.ads.redexgen.X.AbstractC0265Am
                    /* renamed from: A00 */
                    public final U9 A0b(byte[] bArr, int i2, boolean z) {
                        if (z) {
                            this.A00.A0J();
                        }
                        return new U9(this.A00.A0I(bArr, i2));
                    }
                };
            case '\n':
                return new AbstractC0265Am() { // from class: com.facebook.ads.redexgen.X.2x
                    public static byte[] A05;
                    public static String[] A06 = {"D8ktImD4gI341B9dMX", "p", "8S1Qfr0uQHuWlKinBNgV3mwJeBc1O2wn", "O", "UgOsD1qslkvgk8WTNW5IJqqmR5mppeJL", "YmudOgNfte0R1MlRzZs3i7R", "t", "Vvarb6mClw"};
                    public int A00;
                    public Inflater A01;
                    public byte[] A02;
                    public final C0371Fe A03;
                    public final HV A04;

                    public static String A01(int i2, int i3, int i4) {
                        byte[] copyOfRange = Arrays.copyOfRange(A05, i2, i2 + i3);
                        for (int i5 = 0; i5 < copyOfRange.length; i5++) {
                            copyOfRange[i5] = (byte) ((copyOfRange[i5] ^ i4) ^ j.AppCompatTheme_windowFixedWidthMinor);
                        }
                        return new String(copyOfRange);
                    }

                    public static void A02() {
                        A05 = new byte[]{97, 86, 66, 117, 84, 82, 94, 85, 84, 67};
                    }

                    static {
                        A02();
                    }

                    {
                        A01(0, 10, 68);
                        this.A04 = new HV();
                        this.A03 = new C0371Fe();
                    }

                    public static FJ A00(HV hv, C0371Fe c0371Fe) {
                        int limit = hv.A07();
                        int sectionLength = hv.A0E();
                        int sectionType = hv.A0I();
                        int A062 = hv.A06() + sectionType;
                        if (A062 > limit) {
                            hv.A0Y(limit);
                            return null;
                        }
                        FJ fj = null;
                        if (sectionLength == 128) {
                            fj = c0371Fe.A06();
                            String[] strArr = A06;
                            if (strArr[5].length() != strArr[7].length()) {
                                A06[0] = "8Q7r9e8nqCgCYEZ6IU";
                                c0371Fe.A07();
                            } else {
                                c0371Fe.A07();
                            }
                        } else {
                            switch (sectionLength) {
                                case 20:
                                    c0371Fe.A05(hv, sectionType);
                                    break;
                                case 21:
                                    c0371Fe.A03(hv, sectionType);
                                    break;
                                case 22:
                                    c0371Fe.A04(hv, sectionType);
                                    break;
                            }
                        }
                        hv.A0Y(A062);
                        if (A06[0].length() != 18) {
                            throw new RuntimeException();
                        }
                        A06[2] = "BTE07TDUmys5OOcsYpYqmwkAe847KCkG";
                        return fj;
                    }

                    private boolean A03(byte[] bArr, int i2) {
                        if (i2 != 0) {
                            byte b2 = bArr[0];
                            if (A06[3].length() != 1) {
                                throw new RuntimeException();
                            }
                            A06[4] = "3s6wsel2PksO74PVHVwG8hUXCMbdJ5Q0";
                            if (b2 == 120) {
                                if (this.A01 == null) {
                                    this.A01 = new Inflater();
                                    this.A02 = new byte[i2];
                                }
                                this.A00 = 0;
                                this.A01.setInput(bArr, 0, i2);
                                while (!this.A01.finished() && !this.A01.needsDictionary() && !this.A01.needsInput()) {
                                    try {
                                        if (this.A00 == this.A02.length) {
                                            this.A02 = Arrays.copyOf(this.A02, this.A02.length * 2);
                                        }
                                        this.A00 += this.A01.inflate(this.A02, this.A00, this.A02.length - this.A00);
                                    } catch (DataFormatException unused) {
                                        return false;
                                    } finally {
                                        this.A01.reset();
                                    }
                                }
                                return this.A01.finished();
                            }
                        }
                        return false;
                    }

                    @Override // com.facebook.ads.redexgen.X.AbstractC0265Am
                    public final FK A0b(byte[] bArr, int i2, boolean z) throws FL {
                        if (A03(bArr, i2)) {
                            this.A04.A0b(this.A02, this.A00);
                        } else {
                            HV hv = this.A04;
                            if (A06[0].length() != 18) {
                                throw new RuntimeException();
                            }
                            A06[2] = "roAZZspd009Dh1499aBQr6xCTRbeSGaA";
                            hv.A0b(bArr, i2);
                        }
                        this.A03.A07();
                        ArrayList arrayList = new ArrayList();
                        while (this.A04.A04() >= 3) {
                            FJ A002 = A00(this.A04, this.A03);
                            if (A002 != null) {
                                arrayList.add(A002);
                            }
                        }
                        return new U8(Collections.unmodifiableList(arrayList));
                    }
                };
            default:
                throw new IllegalArgumentException(A00(0, 50, 24));
        }
    }

    @Override // com.facebook.ads.redexgen.X.FM
    public final boolean AEz(Format format) {
        String str = format.A0O;
        String mimeType = A00(236, 8, j.AppCompatTheme_windowActionBarOverlay);
        if (!mimeType.equals(str)) {
            String mimeType2 = A00(244, 10, 85);
            if (!mimeType2.equals(str)) {
                String mimeType3 = A00(122, 20, 87);
                if (!mimeType3.equals(str)) {
                    String mimeType4 = A00(167, 21, 57);
                    if (!mimeType4.equals(str)) {
                        String mimeType5 = A00(216, 20, 2);
                        if (!mimeType5.equals(str)) {
                            String mimeType6 = A00(188, 28, 125);
                            if (!mimeType6.equals(str)) {
                                String mimeType7 = A00(50, 19, j.AppCompatTheme_windowMinWidthMinor);
                                if (!mimeType7.equals(str)) {
                                    String mimeType8 = A00(142, 25, 39);
                                    if (!mimeType8.equals(str)) {
                                        String mimeType9 = A00(69, 19, 27);
                                        if (!mimeType9.equals(str)) {
                                            String mimeType10 = A00(88, 19, 97);
                                            if (!mimeType10.equals(str)) {
                                                String mimeType11 = A00(j.AppCompatTheme_toolbarStyle, 15, 26);
                                                if (!mimeType11.equals(str)) {
                                                    return false;
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        return true;
    }
}
