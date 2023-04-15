package com.facebook.ads.redexgen.X;

import a.a.j;
import android.util.Log;
import androidx.annotation.Nullable;
import com.facebook.ads.internal.exoplayer2.metadata.Metadata;
import com.facebook.ads.internal.exoplayer2.metadata.id3.ApicFrame;
import com.facebook.ads.internal.exoplayer2.metadata.id3.BinaryFrame;
import com.facebook.ads.internal.exoplayer2.metadata.id3.ChapterFrame;
import com.facebook.ads.internal.exoplayer2.metadata.id3.ChapterTocFrame;
import com.facebook.ads.internal.exoplayer2.metadata.id3.CommentFrame;
import com.facebook.ads.internal.exoplayer2.metadata.id3.GeobFrame;
import com.facebook.ads.internal.exoplayer2.metadata.id3.Id3Frame;
import com.facebook.ads.internal.exoplayer2.metadata.id3.PrivFrame;
import com.facebook.ads.internal.exoplayer2.metadata.id3.TextInformationFrame;
import com.facebook.ads.internal.exoplayer2.metadata.id3.UrlLinkFrame;
import java.io.UnsupportedEncodingException;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Locale;
/* loaded from: assets/audience_network.dex */
public final class UV implements D2 {
    public static byte[] A01;
    public static String[] A02 = {"sMUxEv8h1aqUKtOfXRhWvF4cd3jhCIiv", "2", "jdWxaIwDf600E5fQi1jvtrBwOfx6AZo5", "VxysSZONWs4Fbmb", "6vXrI6nW4BVssue1T84qDnzAdKjaXJyK", "dpBJthFwlwkteZKALF9GwsW9kwjpNbjg", "2vyk08U", "E"};
    public static final int A03;
    public static final DE A04;
    @Nullable
    public final DE A00;

    /* JADX WARN: Failed to parse debug info
    java.lang.ArrayIndexOutOfBoundsException: Index 20 out of bounds for length 20
    	at jadx.plugins.input.dex.sections.debuginfo.DebugInfoParser.startVar(DebugInfoParser.java:203)
    	at jadx.plugins.input.dex.sections.debuginfo.DebugInfoParser.process(DebugInfoParser.java:125)
    	at jadx.plugins.input.dex.sections.DexCodeReader.getDebugInfo(DexCodeReader.java:118)
    	at jadx.core.dex.nodes.MethodNode.getDebugInfo(MethodNode.java:567)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.visit(DebugInfoAttachVisitor.java:39)
     */
    public static ChapterFrame A06(HV hv, int i, int i2, boolean z, int i3, @Nullable DE de) throws UnsupportedEncodingException {
        int A06 = hv.A06();
        int A022 = A02(hv.A00, A06);
        String str = new String(hv.A00, A06, A022 - A06, A0I(169, 10, 52));
        hv.A0Y(A022 + 1);
        int A08 = hv.A08();
        int A082 = hv.A08();
        long A0M = hv.A0M();
        if (A0M == 4294967295L) {
            A0M = -1;
        }
        long A0M2 = hv.A0M();
        if (A0M2 == 4294967295L) {
            A0M2 = -1;
        }
        ArrayList arrayList = new ArrayList();
        int i4 = A06 + i;
        while (hv.A06() < i4) {
            Id3Frame A0B = A0B(i2, hv, z, i3, de);
            if (A0B != null) {
                arrayList.add(A0B);
            }
        }
        Id3Frame[] id3FrameArr = new Id3Frame[arrayList.size()];
        arrayList.toArray(id3FrameArr);
        return new ChapterFrame(str, A08, A082, A0M, A0M2, id3FrameArr);
    }

    /* JADX WARN: Failed to parse debug info
    java.lang.ArrayIndexOutOfBoundsException: Index 11 out of bounds for length 11
    	at jadx.plugins.input.dex.sections.debuginfo.DebugInfoParser.startVar(DebugInfoParser.java:203)
    	at jadx.plugins.input.dex.sections.debuginfo.DebugInfoParser.process(DebugInfoParser.java:125)
    	at jadx.plugins.input.dex.sections.DexCodeReader.getDebugInfo(DexCodeReader.java:118)
    	at jadx.core.dex.nodes.MethodNode.getDebugInfo(MethodNode.java:567)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.visit(DebugInfoAttachVisitor.java:39)
     */
    public static GeobFrame A09(HV hv, int i) throws UnsupportedEncodingException {
        int A0E = hv.A0E();
        String A0H = A0H(A0E);
        byte[] bArr = new byte[i - 1];
        hv.A0c(bArr, 0, i - 1);
        int A022 = A02(bArr, 0);
        String str = new String(bArr, 0, A022, A0I(169, 10, 52));
        int i2 = A022 + 1;
        int A032 = A03(bArr, i2, A0E);
        String A0K = A0K(bArr, i2, A032, A0H);
        int A00 = A00(A0E) + A032;
        int A033 = A03(bArr, A00, A0E);
        return new GeobFrame(str, A0K, A0K(bArr, A00, A033, A0H), A0N(bArr, A00(A0E) + A033, bArr.length));
    }

    public static String A0I(int i, int i2, int i3) {
        byte[] copyOfRange = Arrays.copyOfRange(A01, i, i + i2);
        for (int i4 = 0; i4 < copyOfRange.length; i4++) {
            copyOfRange[i4] = (byte) ((copyOfRange[i4] - i3) - 106);
        }
        return new String(copyOfRange);
    }

    public static void A0L() {
        A01 = new byte[]{-4, 58, -4, 58, -4, 58, -103, -41, -103, -41, -103, -41, -103, -41, -51, -63, 7, 19, 2, 14, 6, -12, 10, 27, 6, -34, 38, 67, 86, 67, 2, 86, 81, 81, 2, 85, 74, 81, 84, 86, 2, 86, 81, 2, 68, 71, 2, 67, 80, 2, 43, 38, 21, 2, 86, 67, 73, 16, 43, 51, 54, 47, 46, -22, 62, 57, -22, 46, 47, 45, 57, 46, 47, -22, 48, 60, 43, 55, 47, 4, -22, 51, 46, 7, -78, -51, -43, -40, -47, -48, -116, -32, -37, -116, -30, -51, -40, -43, -48, -51, -32, -47, -116, -75, -80, -97, -116, -32, -51, -45, -116, -29, -43, -32, -44, -116, -39, -51, -42, -37, -34, -62, -47, -34, -33, -43, -37, -38, -87, -38, 6, -11, 1, -7, -76, 7, -3, 14, -7, -76, -7, 12, -9, -7, -7, -8, 7, -76, 6, -7, 1, -11, -3, 2, -3, 2, -5, -76, 8, -11, -5, -76, -8, -11, 8, -11, 10, 5, -12, -25, -15, -19, -53, -42, -42, -45, -41, -53, -49, 37, 64, 15, 32, 65, 63, 75, 64, 65, 78, -19, 5, 3, 10, 10, -1, -2, -70, -29, -34, -51, -70, 14, -5, 1, -70, 17, 3, 14, 2, -70, 7, -5, 4, 9, 12, -16, -1, 12, 13, 3, 9, 8, -41, -52, -70, -5, 8, -2, -70, 15, 8, -2, -1, 0, 3, 8, -1, -2, -70, -3, 9, 7, 10, 12, -1, 13, 13, 3, 9, 8, -70, 13, -3, 2, -1, 7, -1, -25, -1, -3, 4, 4, -7, -8, -76, -35, -40, -57, -76, 8, -11, -5, -76, 11, -3, 8, -4, -76, 9, 2, 7, 9, 4, 4, 3, 6, 8, -7, -8, -76, 1, -11, -2, 3, 6, -22, -7, 6, 7, -3, 3, 2, -47, 49, 73, 71, 78, 78, 71, 76, 69, -2, 83, 76, 81, 83, 78, 78, 77, 80, 82, 67, 66, -2, 65, 77, 75, 78, 80, 67, 81, 81, 67, 66, -2, 77, 80, -2, 67, 76, 65, 80, 87, 78, 82, 67, 66, -2, 68, 80, 63, 75, 67, 20, 24, 24, 24, -60, -61, -75, -100, -96, -91, -61, -62, -76, -101, -97, -92, -80, -77, 59, 58, 44, 19, 30, 38, 63, 54, 73, 65, 54, 52, 69, 54, 53, -15, 55, 58, 67, 68, 69, -15, 69, 57, 67, 54, 54, -15, 51, 74, 69, 54, 68, -15, 64, 55, -15, 26, 21, 4, -15, 69, 50, 56, -15, 57, 54, 50, 53, 54, 67, 11, -15, -18, 7, 12, 14, 9, 9, 8, 11, 13, -2, -3, -71, -4, 1, -6, 11, -6, -4, 13, -2, 11, -71, -2, 7, -4, 8, -3, 2, 7, 0, -47, -46, -46, -46, 18, 22, 10, 16, 14, -40, -4, 0, -12, -6, -8, -62, -3, 3, -8, -6, -31, -27, -39, -33, -35, -89, -30, -24, -33};
    }

    static {
        A0L();
        A04 = new UW();
        A03 = C0430Hl.A08(A0I(166, 3, 87));
    }

    public UV() {
        this(null);
    }

    public UV(@Nullable DE de) {
        this.A00 = de;
    }

    public static int A00(int i) {
        if (i == 0 || i == 3) {
            return 1;
        }
        return 2;
    }

    public static int A01(HV hv, int i) {
        byte[] bArr = hv.A00;
        for (int A06 = hv.A06(); A06 + 1 < i; A06++) {
            int i2 = bArr[A06];
            if ((i2 & 255) == 255 && bArr[A06 + 1] == 0) {
                int i3 = A06 + 1;
                System.arraycopy(bArr, A06 + 2, bArr, i3, (i - A06) - 2);
                i--;
            }
        }
        return i;
    }

    /* JADX WARN: Incorrect condition in loop: B:3:0x0001 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static int A02(byte[] r1, int r2) {
        /*
        L0:
            int r0 = r1.length
            if (r2 >= r0) goto Lb
            r0 = r1[r2]
            if (r0 != 0) goto L8
            return r2
        L8:
            int r2 = r2 + 1
            goto L0
        Lb:
            int r0 = r1.length
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.ads.redexgen.X.UV.A02(byte[], int):int");
    }

    /* JADX WARN: Incorrect condition in loop: B:8:0x000d */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static int A03(byte[] r2, int r3, int r4) {
        /*
            int r1 = A02(r2, r3)
            if (r4 == 0) goto L9
            r0 = 3
            if (r4 != r0) goto La
        L9:
            return r1
        La:
            int r0 = r2.length
            int r0 = r0 + (-1)
            if (r1 >= r0) goto L21
            int r0 = r1 % 2
            if (r0 != 0) goto L1a
            int r0 = r1 + 1
            r0 = r2[r0]
            if (r0 != 0) goto L1a
            return r1
        L1a:
            int r0 = r1 + 1
            int r1 = A02(r2, r0)
            goto La
        L21:
            int r0 = r2.length
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.ads.redexgen.X.UV.A03(byte[], int, int):int");
    }

    public static ApicFrame A04(HV hv, int i, int i2) throws UnsupportedEncodingException {
        int A022;
        String A0M;
        int descriptionEndIndex = hv.A0E();
        String A0H = A0H(descriptionEndIndex);
        int encoding = i - 1;
        byte[] bArr = new byte[encoding];
        int encoding2 = i - 1;
        hv.A0c(bArr, 0, encoding2);
        String description = A0I(458, 6, 63);
        String A0I = A0I(169, 10, 52);
        if (i2 == 2) {
            A022 = 2;
            A0M = description + C0430Hl.A0M(new String(bArr, 0, 3, A0I));
            if (A0I(474, 9, 14).equals(A0M)) {
                A0M = A0I(464, 10, 41);
            }
        } else {
            A022 = A02(bArr, 0);
            A0M = C0430Hl.A0M(new String(bArr, 0, A022, A0I));
            if (A0M.indexOf(47) == -1) {
                A0M = description + A0M;
            }
        }
        int encoding3 = A022 + 1;
        int i3 = bArr[encoding3] & 255;
        int i4 = A022 + 2;
        int pictureType = A03(bArr, i4, descriptionEndIndex);
        int encoding4 = pictureType - i4;
        String mimeType = new String(bArr, i4, encoding4, A0H);
        int encoding5 = bArr.length;
        return new ApicFrame(A0M, mimeType, i3, A0N(bArr, A00(descriptionEndIndex) + pictureType, encoding5));
    }

    public static BinaryFrame A05(HV hv, int i, String str) {
        byte[] bArr = new byte[i];
        hv.A0c(bArr, 0, i);
        return new BinaryFrame(str, bArr);
    }

    public static ChapterTocFrame A07(HV hv, int i, int i2, boolean z, int elementIdEndIndex, @Nullable DE de) throws UnsupportedEncodingException {
        int A06 = hv.A06();
        int A022 = A02(hv.A00, A06);
        String A0I = A0I(169, 10, 52);
        String str = new String(hv.A00, A06, A022 - A06, A0I);
        hv.A0Y(A022 + 1);
        int framePosition = hv.A0E();
        boolean z2 = (framePosition & 2) != 0;
        boolean z3 = (framePosition & 1) != 0;
        int A0E = hv.A0E();
        String[] strArr = new String[A0E];
        for (int i3 = 0; i3 < A0E; i3++) {
            int startIndex = hv.A06();
            int i4 = A02(hv.A00, startIndex);
            strArr[i3] = new String(hv.A00, startIndex, i4 - startIndex, A0I);
            hv.A0Y(i4 + 1);
        }
        ArrayList arrayList = new ArrayList();
        int i5 = A06 + i;
        while (hv.A06() < i5) {
            Id3Frame A0B = A0B(i2, hv, z, elementIdEndIndex, de);
            if (A0B != null) {
                arrayList.add(A0B);
            }
        }
        Id3Frame[] id3FrameArr = new Id3Frame[arrayList.size()];
        arrayList.toArray(id3FrameArr);
        return new ChapterTocFrame(str, z2, z3, strArr, id3FrameArr);
    }

    public static CommentFrame A08(HV hv, int i) throws UnsupportedEncodingException {
        if (i < 4) {
            return null;
        }
        int textStartIndex = hv.A0E();
        String A0H = A0H(textStartIndex);
        byte[] bArr = new byte[3];
        hv.A0c(bArr, 0, 3);
        String description = new String(bArr, 0, 3);
        int encoding = i - 4;
        byte[] data = new byte[encoding];
        int encoding2 = i - 4;
        hv.A0c(data, 0, encoding2);
        int encoding3 = A03(data, 0, textStartIndex);
        String language = new String(data, 0, encoding3, A0H);
        int A00 = A00(textStartIndex) + encoding3;
        int encoding4 = A03(data, A00, textStartIndex);
        String charset = A0K(data, A00, encoding4, A0H);
        return new CommentFrame(description, language, charset);
    }

    /* JADX WARN: Code restructure failed: missing block: B:15:0x0082, code lost:
        if (r4 == 1) goto L16;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x0084, code lost:
        r0 = r6 & 64;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x0086, code lost:
        if (r0 == 0) goto L28;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x0088, code lost:
        r0 = 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x0089, code lost:
        if (r0 == 0) goto L22;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x008b, code lost:
        android.util.Log.w(r7, A0I(189, 68, 48));
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x0098, code lost:
        return null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x0099, code lost:
        r0 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x00b0, code lost:
        if (r4 == 2) goto L16;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x00b4, code lost:
        if (r4 != 3) goto L37;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x00b6, code lost:
        r0 = r6 & 64;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x00b8, code lost:
        if (r0 == 0) goto L36;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x00ba, code lost:
        r0 = 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x00bb, code lost:
        if (r0 == 0) goto L22;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x00bd, code lost:
        r0 = r9.A08();
        r9.A0Z(r0);
        r2 = r2 - (r0 + 4);
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x00cb, code lost:
        if (r0 != 0) goto L25;
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x00d5, code lost:
        r0 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x00d7, code lost:
        if (r4 != r5) goto L50;
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x00d9, code lost:
        r0 = r6 & 64;
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x00db, code lost:
        if (r0 == 0) goto L49;
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x00dd, code lost:
        r0 = 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x00de, code lost:
        if (r0 == 0) goto L43;
     */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x00e0, code lost:
        r1 = r9.A0D();
        r0 = r1 - 4;
        r9.A0Z(r0);
        r2 = r2 - r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:46:0x00ea, code lost:
        r0 = r6 & 16;
     */
    /* JADX WARN: Code restructure failed: missing block: B:47:0x00ec, code lost:
        if (r0 == 0) goto L48;
     */
    /* JADX WARN: Code restructure failed: missing block: B:48:0x00ee, code lost:
        r0 = 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:49:0x00ef, code lost:
        if (r0 == 0) goto L22;
     */
    /* JADX WARN: Code restructure failed: missing block: B:50:0x00f1, code lost:
        r2 = r2 - 10;
     */
    /* JADX WARN: Code restructure failed: missing block: B:51:0x00f4, code lost:
        r0 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:52:0x00f6, code lost:
        r0 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:53:0x00f8, code lost:
        android.util.Log.w(r7, A0I(257, 46, 42) + r4);
     */
    /* JADX WARN: Code restructure failed: missing block: B:54:0x0114, code lost:
        return null;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static com.facebook.ads.redexgen.X.DF A0A(com.facebook.ads.redexgen.X.HV r9) {
        /*
            Method dump skipped, instructions count: 283
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.ads.redexgen.X.UV.A0A(com.facebook.ads.redexgen.X.HV):com.facebook.ads.redexgen.X.DF");
    }

    /* JADX WARN: Code restructure failed: missing block: B:130:0x019f, code lost:
        if (r8 == 67) goto L99;
     */
    /* JADX WARN: Removed duplicated region for block: B:138:0x01bd  */
    /* JADX WARN: Removed duplicated region for block: B:142:0x01cf  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static com.facebook.ads.internal.exoplayer2.metadata.id3.Id3Frame A0B(int r23, com.facebook.ads.redexgen.X.HV r24, boolean r25, int r26, @androidx.annotation.Nullable com.facebook.ads.redexgen.X.DE r27) {
        /*
            Method dump skipped, instructions count: 601
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.ads.redexgen.X.UV.A0B(int, com.facebook.ads.redexgen.X.HV, boolean, int, com.facebook.ads.redexgen.X.DE):com.facebook.ads.internal.exoplayer2.metadata.id3.Id3Frame");
    }

    public static PrivFrame A0C(HV hv, int i) throws UnsupportedEncodingException {
        byte[] bArr = new byte[i];
        hv.A0c(bArr, 0, i);
        int A022 = A02(bArr, 0);
        return new PrivFrame(new String(bArr, 0, A022, A0I(169, 10, 52)), A0N(bArr, A022 + 1, bArr.length));
    }

    public static TextInformationFrame A0D(HV hv, int i) throws UnsupportedEncodingException {
        if (i < 1) {
            return null;
        }
        int valueStartIndex = hv.A0E();
        String A0H = A0H(valueStartIndex);
        int encoding = i - 1;
        byte[] data = new byte[encoding];
        int encoding2 = i - 1;
        hv.A0c(data, 0, encoding2);
        int encoding3 = A03(data, 0, valueStartIndex);
        String description = new String(data, 0, encoding3, A0H);
        int A00 = A00(valueStartIndex) + encoding3;
        int encoding4 = A03(data, A00, valueStartIndex);
        String A0K = A0K(data, A00, encoding4, A0H);
        String charset = A0I(353, 4, 86);
        return new TextInformationFrame(charset, description, A0K);
    }

    public static TextInformationFrame A0E(HV hv, int i, String str) throws UnsupportedEncodingException {
        if (i < 1) {
            return null;
        }
        int encoding = hv.A0E();
        String A0H = A0H(encoding);
        byte[] data = new byte[i - 1];
        hv.A0c(data, 0, i - 1);
        return new TextInformationFrame(str, null, new String(data, 0, A03(data, 0, encoding), A0H));
    }

    public static UrlLinkFrame A0F(HV hv, int i) throws UnsupportedEncodingException {
        if (i < 1) {
            String[] strArr = A02;
            if (strArr[2].charAt(11) != strArr[5].charAt(11)) {
                String[] strArr2 = A02;
                strArr2[7] = "x";
                strArr2[1] = "0";
                return null;
            }
            throw new RuntimeException();
        }
        int descriptionEndIndex = hv.A0E();
        String A0H = A0H(descriptionEndIndex);
        int encoding = i - 1;
        byte[] bArr = new byte[encoding];
        int encoding2 = i - 1;
        hv.A0c(bArr, 0, encoding2);
        int encoding3 = A03(bArr, 0, descriptionEndIndex);
        String str = new String(bArr, 0, encoding3, A0H);
        int A00 = A00(descriptionEndIndex) + encoding3;
        String A0K = A0K(bArr, A00, A02(bArr, A00), A0I(169, 10, 52));
        String charset = A0I(454, 4, 16);
        return new UrlLinkFrame(charset, str, A0K);
    }

    public static UrlLinkFrame A0G(HV hv, int i, String str) throws UnsupportedEncodingException {
        byte[] bArr = new byte[i];
        hv.A0c(bArr, 0, i);
        return new UrlLinkFrame(str, null, new String(bArr, 0, A02(bArr, 0), A0I(169, 10, 52)));
    }

    public static String A0H(int i) {
        String A0I = A0I(169, 10, 52);
        if (i != 0) {
            if (i != 1) {
                if (i != 2) {
                    if (i != 3) {
                        return A0I;
                    }
                    String[] strArr = A02;
                    if (strArr[2].charAt(11) != strArr[5].charAt(11)) {
                        A02[0] = "Xs3p10eLQltfrtGuZ9I87GBEYIMhEDM2";
                        return A0I(371, 5, 124);
                    }
                    throw new RuntimeException();
                }
                return A0I(363, 8, 4);
            }
            return A0I(357, 6, 5);
        }
        return A0I;
    }

    public static String A0J(int i, int i2, int i3, int i4, int i5) {
        return i == 2 ? String.format(Locale.US, A0I(0, 6, j.AppCompatTheme_tooltipFrameBackground), Integer.valueOf(i2), Integer.valueOf(i3), Integer.valueOf(i4)) : String.format(Locale.US, A0I(6, 8, 10), Integer.valueOf(i2), Integer.valueOf(i3), Integer.valueOf(i4), Integer.valueOf(i5));
    }

    public static String A0K(byte[] bArr, int i, int i2, String str) throws UnsupportedEncodingException {
        if (i2 <= i || i2 > bArr.length) {
            return A0I(0, 0, j.AppCompatTheme_textColorSearchUrl);
        }
        return new String(bArr, i, i2 - i, str);
    }

    /* JADX WARN: Code restructure failed: missing block: B:37:0x00a2, code lost:
        if (r8 != false) goto L40;
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x00a4, code lost:
        r7 = 0 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x00a6, code lost:
        if (r12 == false) goto L43;
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x00a8, code lost:
        r7 = r7 + 4;
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x00aa, code lost:
        r0 = (r3 > r7 ? 1 : (r3 == r7 ? 0 : -1));
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x00ad, code lost:
        if (r0 >= 0) goto L45;
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x00af, code lost:
        r17.A0Y(r5);
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x00b2, code lost:
        return false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x00b3, code lost:
        if (r8 != false) goto L40;
     */
    /* JADX WARN: Code restructure failed: missing block: B:58:0x00ce, code lost:
        r0 = r17.A04();
     */
    /* JADX WARN: Code restructure failed: missing block: B:59:0x00d5, code lost:
        if (r0 >= r3) goto L47;
     */
    /* JADX WARN: Code restructure failed: missing block: B:62:0x00de, code lost:
        r17.A0Y(r5);
     */
    /* JADX WARN: Code restructure failed: missing block: B:63:0x00e1, code lost:
        return false;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static boolean A0M(com.facebook.ads.redexgen.X.HV r17, int r18, int r19, boolean r20) {
        /*
            Method dump skipped, instructions count: 243
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.ads.redexgen.X.UV.A0M(com.facebook.ads.redexgen.X.HV, int, int, boolean):boolean");
    }

    public static byte[] A0N(byte[] bArr, int i, int i2) {
        if (i2 <= i) {
            return new byte[0];
        }
        byte[] copyOfRange = Arrays.copyOfRange(bArr, i, i2);
        if (A02[3].length() != 29) {
            String[] strArr = A02;
            strArr[2] = "BXfcBk8SW4yeYxu44B11cVVkBGYBzlAv";
            strArr[5] = "okWvwdNSxMQpYeQbiZnCLiGxFx7BKew9";
            return copyOfRange;
        }
        throw new RuntimeException();
    }

    public final Metadata A0O(byte[] bArr, int i) {
        int i2;
        int i3;
        boolean z;
        int i4;
        int i5;
        int i6;
        int i7;
        int i8;
        ArrayList arrayList = new ArrayList();
        HV hv = new HV(bArr, i);
        DF A0A = A0A(hv);
        if (A0A == null) {
            return null;
        }
        int A06 = hv.A06();
        i2 = A0A.A01;
        int frameHeaderSize = i2 == 2 ? 6 : 10;
        i3 = A0A.A00;
        z = A0A.A02;
        if (z) {
            i8 = A0A.A00;
            i3 = A01(hv, i8);
        }
        hv.A0X(A06 + i3);
        boolean z2 = false;
        i4 = A0A.A01;
        if (!A0M(hv, i4, frameHeaderSize, false)) {
            i6 = A0A.A01;
            if (A02[4].charAt(24) == '1') {
                throw new RuntimeException();
            }
            A02[0] = "uYZb4rh3wheJht2DQ5CIaEPvRS4bXzrD";
            if (i6 == 4 && A0M(hv, 4, frameHeaderSize, true)) {
                z2 = true;
            } else {
                StringBuilder sb = new StringBuilder();
                sb.append(A0I(84, 45, 2));
                i7 = A0A.A01;
                sb.append(i7);
                Log.w(A0I(179, 10, j.AppCompatTheme_windowFixedHeightMajor), sb.toString());
                return null;
            }
        }
        while (hv.A04() >= frameHeaderSize) {
            i5 = A0A.A01;
            Id3Frame A0B = A0B(i5, hv, z2, frameHeaderSize, this.A00);
            if (A0B != null) {
                arrayList.add(A0B);
            }
        }
        return new Metadata(arrayList);
    }

    @Override // com.facebook.ads.redexgen.X.D2
    public final Metadata A4h(C9 c9) {
        ByteBuffer buffer = c9.A01;
        return A0O(buffer.array(), buffer.limit());
    }
}
