package com.facebook.ads.redexgen.X;

import android.graphics.Point;
import android.text.TextUtils;
import androidx.annotation.Nullable;
import com.facebook.ads.internal.exoplayer2.Format;
import com.facebook.ads.internal.exoplayer2.source.TrackGroup;
import com.facebook.ads.internal.exoplayer2.source.TrackGroupArray;
import com.facebook.ads.internal.exoplayer2.trackselection.DefaultTrackSelector$Parameters;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.concurrent.atomic.AtomicReference;
/* loaded from: assets/audience_network.dex */
public final class AZ extends AbstractC0746Ty {
    public static byte[] A02;
    public static String[] A03 = {"1W0E1A", "gmqFy6ZQaP5ka1WITOse6lKCqSKhRNov", "yPEYbIXQTZij2dUvfHyn6qa5Z66I89l5", "Xhoxo0MeXbgag07m9diWTgmUhgioDUlF", "BIkkp", "x2Y7ova5yP2MY4Z3NAONKiEwX", "ON8", "BctZyAj3hw00k98sEs0CoZ2k5"};
    public static final int[] A04;
    @Nullable
    public final GB A00;
    public final AtomicReference<DefaultTrackSelector$Parameters> A01;

    public static String A0C(int i, int i2, int i3) {
        byte[] copyOfRange = Arrays.copyOfRange(A02, i, i + i2);
        for (int i4 = 0; i4 < copyOfRange.length; i4++) {
            copyOfRange[i4] = (byte) ((copyOfRange[i4] - i3) - 92);
        }
        return new String(copyOfRange);
    }

    public static void A0E() {
        if (A03[6].length() != 3) {
            throw new RuntimeException();
        }
        A03[6] = "oTI";
        A02 = new byte[]{-26, -33, -43};
    }

    /* JADX WARN: Failed to parse debug info
    java.lang.ArrayIndexOutOfBoundsException: Index 18 out of bounds for length 18
    	at jadx.plugins.input.dex.sections.debuginfo.DebugInfoParser.startVar(DebugInfoParser.java:203)
    	at jadx.plugins.input.dex.sections.debuginfo.DebugInfoParser.process(DebugInfoParser.java:135)
    	at jadx.plugins.input.dex.sections.DexCodeReader.getDebugInfo(DexCodeReader.java:118)
    	at jadx.core.dex.nodes.MethodNode.getDebugInfo(MethodNode.java:567)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.visit(DebugInfoAttachVisitor.java:39)
     */
    public static void A0F(TrackGroup trackGroup, int[] iArr, int i, @Nullable String str, int i2, int i3, int i4, List<Integer> list) {
        for (int size = list.size() - 1; size >= 0; size--) {
            int intValue = list.get(size).intValue();
            if (!A0L(trackGroup.A01(intValue), str, iArr[intValue], i, i2, i3, i4)) {
                list.remove(size);
            }
        }
    }

    static {
        A0E();
        A04 = new int[0];
    }

    public AZ() {
        this(null);
    }

    public AZ(@Nullable GB gb) {
        this.A00 = gb;
        this.A01 = new AtomicReference<>(DefaultTrackSelector$Parameters.A0J);
    }

    public static int A00(int i, int i2) {
        if (i == -1) {
            return i2 == -1 ? 0 : -1;
        } else if (i2 == -1) {
            return 1;
        } else {
            return i - i2;
        }
    }

    public static int A01(int i, int i2) {
        if (i > i2) {
            return 1;
        }
        return i2 > i ? -1 : 0;
    }

    public static int A03(TrackGroup trackGroup, int[] iArr, int i, @Nullable String str, int i2, int i3, int i4, List<Integer> list) {
        int i5 = 0;
        for (int trackIndex = 0; trackIndex < list.size(); trackIndex++) {
            Integer num = list.get(trackIndex);
            int i6 = A03[2].charAt(31);
            if (i6 == 111) {
                throw new RuntimeException();
            }
            String[] strArr = A03;
            strArr[7] = "3Iv8b3o73oRbqkF65Z5c5dFgz";
            strArr[5] = "e7BsWd0zc9qEfvrmMSkcTfHGf";
            int adaptiveTrackCount = num.intValue();
            if (A0L(trackGroup.A01(adaptiveTrackCount), str, iArr[adaptiveTrackCount], i, i2, i3, i4)) {
                i5++;
            }
        }
        return i5;
    }

    /* JADX WARN: Incorrect condition in loop: B:4:0x0004 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static int A04(com.facebook.ads.internal.exoplayer2.source.TrackGroup r4, int[] r5, com.facebook.ads.redexgen.X.G2 r6) {
        /*
            r3 = 0
            r2 = 0
        L2:
            int r0 = r4.A01
            if (r2 >= r0) goto L17
            com.facebook.ads.internal.exoplayer2.Format r1 = r4.A01(r2)
            r0 = r5[r2]
            boolean r0 = A0J(r1, r0, r6)
            if (r0 == 0) goto L14
            int r3 = r3 + 1
        L14:
            int r2 = r2 + 1
            goto L2
        L17:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.ads.redexgen.X.AZ.A04(com.facebook.ads.internal.exoplayer2.source.TrackGroup, int[], com.facebook.ads.redexgen.X.G2):int");
    }

    public static Point A05(boolean z, int tempViewportWidth, int i, int i2, int i3) {
        if (z) {
            if ((i2 > i3) != (tempViewportWidth > i)) {
                tempViewportWidth = i;
                i = tempViewportWidth;
            }
        }
        int i4 = i2 * i;
        int i5 = i3 * tempViewportWidth;
        if (A03[2].charAt(31) != 'o') {
            A03[6] = "nfw";
            if (i4 >= i5) {
                return new Point(tempViewportWidth, C0430Hl.A04(tempViewportWidth * i3, i2));
            }
            return new Point(C0430Hl.A04(i * i2, i3), i);
        }
        throw new RuntimeException();
    }

    @Nullable
    private final GC A06(int i, TrackGroupArray trackGroupArray, int[][] iArr, DefaultTrackSelector$Parameters defaultTrackSelector$Parameters) throws AnonymousClass98 {
        TrackGroup trackGroup = null;
        int i2 = 0;
        int i3 = 0;
        int i4 = 0;
        while (true) {
            int selectedTrackScore = trackGroupArray.A01;
            if (A03[3].charAt(2) == 'E') {
                throw new RuntimeException();
            }
            A03[3] = "VerUiBJDpf251zcJKkmQW7r5SVlKN9oM";
            if (i4 < selectedTrackScore) {
                TrackGroup A01 = trackGroupArray.A01(i4);
                int[] iArr2 = iArr[i4];
                for (int selectedTrackScore2 = 0; selectedTrackScore2 < A01.A01; selectedTrackScore2++) {
                    if (A0H(iArr2[selectedTrackScore2], defaultTrackSelector$Parameters.A0B)) {
                        int selectedTrackIndex = (A01.A01(selectedTrackScore2).A0D & 1) != 0 ? 2 : 1;
                        if (A0H(iArr2[selectedTrackScore2], false)) {
                            selectedTrackIndex += 1000;
                        }
                        if (selectedTrackIndex > i3) {
                            trackGroup = A01;
                            i2 = selectedTrackScore2;
                            i3 = selectedTrackIndex;
                        }
                    }
                }
                i4++;
            } else if (trackGroup == null) {
                return null;
            } else {
                return new AW(trackGroup, i2);
            }
        }
    }

    @Nullable
    public static GC A07(TrackGroupArray trackGroupArray, int[][] iArr, int i, DefaultTrackSelector$Parameters defaultTrackSelector$Parameters, GB gb) throws AnonymousClass98 {
        int i2;
        if (defaultTrackSelector$Parameters.A0A) {
            i2 = 24;
        } else {
            i2 = 16;
        }
        boolean z = defaultTrackSelector$Parameters.A09 && (i & i2) != 0;
        for (int i3 = 0; i3 < trackGroupArray.A01; i3++) {
            TrackGroup A01 = trackGroupArray.A01(i3);
            int[] A0O = A0O(A01, iArr[i3], z, i2, defaultTrackSelector$Parameters.A03, defaultTrackSelector$Parameters.A02, defaultTrackSelector$Parameters.A01, defaultTrackSelector$Parameters.A06, defaultTrackSelector$Parameters.A05, defaultTrackSelector$Parameters.A0F);
            if (A0O.length > 0) {
                return ((GB) H6.A01(gb)).A4U(A01, A0O);
            }
        }
        return null;
    }

    /* JADX WARN: Incorrect condition in loop: B:4:0x0006 */
    /* JADX WARN: Incorrect condition in loop: B:7:0x0011 */
    @androidx.annotation.Nullable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final com.facebook.ads.redexgen.X.GC A08(com.facebook.ads.internal.exoplayer2.source.TrackGroupArray r11, int[][] r12, int r13, com.facebook.ads.internal.exoplayer2.trackselection.DefaultTrackSelector$Parameters r14, @androidx.annotation.Nullable com.facebook.ads.redexgen.X.GB r15) throws com.facebook.ads.redexgen.X.AnonymousClass98 {
        /*
            r10 = this;
            r3 = -1
            r5 = -1
            r8 = 0
            r7 = 0
        L4:
            int r0 = r11.A01
            if (r7 >= r0) goto L39
            com.facebook.ads.internal.exoplayer2.source.TrackGroup r6 = r11.A01(r7)
            r9 = r12[r7]
            r4 = 0
        Lf:
            int r0 = r6.A01
            if (r4 >= r0) goto L36
            r1 = r9[r4]
            boolean r0 = r14.A0B
            boolean r0 = A0H(r1, r0)
            if (r0 == 0) goto L33
            com.facebook.ads.internal.exoplayer2.Format r2 = r6.A01(r4)
            com.facebook.ads.redexgen.X.G3 r1 = new com.facebook.ads.redexgen.X.G3
            r0 = r9[r4]
            r1.<init>(r2, r14, r0)
            if (r8 == 0) goto L30
            int r0 = r1.A00(r8)
            if (r0 <= 0) goto L33
        L30:
            r5 = r7
            r3 = r4
            r8 = r1
        L33:
            int r4 = r4 + 1
            goto Lf
        L36:
            int r7 = r7 + 1
            goto L4
        L39:
            r0 = -1
            if (r5 != r0) goto L3e
            r0 = 0
            return r0
        L3e:
            com.facebook.ads.internal.exoplayer2.source.TrackGroup r2 = r11.A01(r5)
            boolean r0 = r14.A0D
            if (r0 != 0) goto L58
            if (r15 == 0) goto L58
            r1 = r12[r5]
            boolean r0 = r14.A09
            int[] r1 = A0N(r2, r1, r0)
            int r0 = r1.length
            if (r0 <= 0) goto L58
            com.facebook.ads.redexgen.X.GC r0 = r15.A4U(r2, r1)
            return r0
        L58:
            com.facebook.ads.redexgen.X.AW r0 = new com.facebook.ads.redexgen.X.AW
            r0.<init>(r2, r3)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.ads.redexgen.X.AZ.A08(com.facebook.ads.internal.exoplayer2.source.TrackGroupArray, int[][], int, com.facebook.ads.internal.exoplayer2.trackselection.DefaultTrackSelector$Parameters, com.facebook.ads.redexgen.X.GB):com.facebook.ads.redexgen.X.GC");
    }

    @Nullable
    private final GC A09(TrackGroupArray trackGroupArray, int[][] iArr, int i, DefaultTrackSelector$Parameters defaultTrackSelector$Parameters, @Nullable GB gb) throws AnonymousClass98 {
        GC gc = null;
        if (!defaultTrackSelector$Parameters.A0D && gb != null) {
            gc = A07(trackGroupArray, iArr, i, defaultTrackSelector$Parameters, gb);
        }
        if (gc == null) {
            return A0A(trackGroupArray, iArr, defaultTrackSelector$Parameters);
        }
        return gc;
    }

    /* JADX WARN: Code restructure failed: missing block: B:25:0x0082, code lost:
        if (r3 <= r2) goto L27;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x00c5, code lost:
        if (r1 <= r21.A01) goto L37;
     */
    /* JADX WARN: Code restructure failed: missing block: B:75:0x013f, code lost:
        if (r1 <= r21.A01) goto L37;
     */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00cb  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00d5  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x00df  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x00e3  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x00e6  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x00f5  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x0139  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x013b  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x00cf A[SYNTHETIC] */
    @androidx.annotation.Nullable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static com.facebook.ads.redexgen.X.GC A0A(com.facebook.ads.internal.exoplayer2.source.TrackGroupArray r19, int[][] r20, com.facebook.ads.internal.exoplayer2.trackselection.DefaultTrackSelector$Parameters r21) {
        /*
            Method dump skipped, instructions count: 345
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.ads.redexgen.X.AZ.A0A(com.facebook.ads.internal.exoplayer2.source.TrackGroupArray, int[][], com.facebook.ads.internal.exoplayer2.trackselection.DefaultTrackSelector$Parameters):com.facebook.ads.redexgen.X.GC");
    }

    @Nullable
    private final GC A0B(TrackGroupArray trackGroupArray, int[][] iArr, DefaultTrackSelector$Parameters defaultTrackSelector$Parameters) throws AnonymousClass98 {
        int trackIndex;
        int trackIndex2;
        TrackGroup trackGroup = null;
        int groupIndex = 0;
        int i = 0;
        for (int i2 = 0; i2 < trackGroupArray.A01; i2++) {
            TrackGroup A01 = trackGroupArray.A01(i2);
            int[] iArr2 = iArr[i2];
            for (int selectedTrackIndex = 0; selectedTrackIndex < A01.A01; selectedTrackIndex++) {
                if (A0H(iArr2[selectedTrackIndex], defaultTrackSelector$Parameters.A0B)) {
                    Format A012 = A01.A01(selectedTrackIndex);
                    int i3 = A012.A0D & (defaultTrackSelector$Parameters.A00 ^ (-1));
                    boolean isDefault = (i3 & 1) != 0;
                    boolean z = (i3 & 2) != 0;
                    boolean A0K = A0K(A012, defaultTrackSelector$Parameters.A08);
                    if (A0K || (defaultTrackSelector$Parameters.A0E && A0I(A012))) {
                        if (isDefault) {
                            trackIndex = 8;
                        } else if (!z) {
                            trackIndex = 6;
                        } else {
                            trackIndex = 4;
                        }
                        trackIndex2 = trackIndex + (A0K ? 1 : 0);
                    } else if (isDefault) {
                        trackIndex2 = 3;
                    } else if (!z) {
                        continue;
                    } else if (A0K(A012, defaultTrackSelector$Parameters.A07)) {
                        trackIndex2 = 2;
                    } else {
                        trackIndex2 = 1;
                    }
                    if (A0H(iArr2[selectedTrackIndex], false)) {
                        trackIndex2 += 1000;
                    }
                    if (trackIndex2 > i) {
                        trackGroup = A01;
                        groupIndex = selectedTrackIndex;
                        if (A03[6].length() != 3) {
                            throw new RuntimeException();
                        }
                        A03[2] = "ytO6VNlSXI4nyu5127ZVkMBSWij4cMOM";
                        i = trackIndex2;
                    } else {
                        continue;
                    }
                }
            }
        }
        if (trackGroup == null) {
            return null;
        }
        return new AW(trackGroup, groupIndex);
    }

    public static List<Integer> A0D(TrackGroup trackGroup, int i, int i2, boolean z) {
        ArrayList arrayList = new ArrayList(trackGroup.A01);
        for (int i3 = 0; i3 < trackGroup.A01; i3++) {
            arrayList.add(Integer.valueOf(i3));
        }
        if (i == Integer.MAX_VALUE || i2 == Integer.MAX_VALUE) {
            return arrayList;
        }
        int i4 = Integer.MAX_VALUE;
        for (int videoPixels = 0; videoPixels < trackGroup.A01; videoPixels++) {
            Format A01 = trackGroup.A01(videoPixels);
            if (A01.A0F > 0) {
                int i5 = A01.A08;
                if (A03[3].charAt(2) == 'E') {
                    throw new RuntimeException();
                }
                A03[2] = "kSz4FX5ZHsEkHeXGD1Cn3cbmsF2hLdtD";
                if (i5 > 0) {
                    Point A05 = A05(z, i, i2, A01.A0F, A01.A08);
                    int i6 = A01.A0F * A01.A08;
                    if (A01.A0F >= ((int) (A05.x * 0.98f)) && A01.A08 >= ((int) (A05.y * 0.98f)) && i6 < i4) {
                        i4 = i6;
                    }
                }
            }
        }
        if (i4 != Integer.MAX_VALUE) {
            for (int maxVideoPixelsToRetain = arrayList.size() - 1; maxVideoPixelsToRetain >= 0; maxVideoPixelsToRetain--) {
                int i7 = trackGroup.A01(((Integer) arrayList.get(maxVideoPixelsToRetain)).intValue()).A0E();
                if (i7 == -1 || i7 > i4) {
                    arrayList.remove(maxVideoPixelsToRetain);
                }
            }
        }
        return arrayList;
    }

    public static void A0G(GA ga, int[][][] iArr, C02359h[] c02359hArr, GC[] gcArr, int i) {
        if (i == 0) {
            return;
        }
        int rendererType = -1;
        int i2 = -1;
        if (A03[1].charAt(3) != 'F') {
            throw new RuntimeException();
        }
        String[] strArr = A03;
        strArr[4] = "rTjwD";
        strArr[0] = "uX38vm";
        boolean z = true;
        int i3 = 0;
        while (true) {
            int tunnelingAudioRendererIndex = ga.A00();
            boolean z2 = true;
            if (i3 >= tunnelingAudioRendererIndex) {
                break;
            }
            int A01 = ga.A01(i3);
            GC gc = gcArr[i3];
            if ((A01 == 1 || A01 == 2) && gc != null && A0M(iArr[i3], ga.A02(i3), gc)) {
                if (A01 == 1) {
                    if (rendererType != -1) {
                        z = false;
                        break;
                    }
                    rendererType = i3;
                } else if (i2 != -1) {
                    z = false;
                    break;
                } else {
                    i2 = i3;
                }
            }
            i3++;
        }
        boolean z3 = z & ((rendererType == -1 || i2 == -1) ? false : false);
        int tunnelingVideoRendererIndex = A03[3].charAt(2);
        if (tunnelingVideoRendererIndex != 69) {
            String[] strArr2 = A03;
            strArr2[4] = "aY4hR";
            strArr2[0] = "2v7HMH";
            if (!z3) {
                return;
            }
        } else if (!z3) {
            return;
        }
        C02359h c02359h = new C02359h(i);
        c02359hArr[rendererType] = c02359h;
        c02359hArr[i2] = c02359h;
    }

    public static boolean A0H(int i, boolean z) {
        int i2 = i & 7;
        return i2 == 4 || (z && i2 == 3);
    }

    public static boolean A0I(Format format) {
        return TextUtils.isEmpty(format.A0N) || A0K(format, A0C(0, 3, 21));
    }

    public static boolean A0J(Format format, int i, G2 g2) {
        if (A0H(i, false) && format.A05 == g2.A00 && format.A0C == g2.A01) {
            return g2.A02 == null || TextUtils.equals(g2.A02, format.A0O);
        }
        return false;
    }

    public static boolean A0K(Format format, @Nullable String str) {
        return str != null && TextUtils.equals(str, C0430Hl.A0L(format.A0N));
    }

    public static boolean A0L(Format format, @Nullable String str, int i, int i2, int i3, int i4, int i5) {
        if (!A0H(i, false) || (i & i2) == 0) {
            return false;
        }
        if (str == null || C0430Hl.A0g(format.A0O, str)) {
            if (format.A0F == -1 || format.A0F <= i3) {
                if (format.A08 == -1 || format.A08 <= i4) {
                    if (format.A04 != -1) {
                        int i6 = format.A04;
                        if (A03[2].charAt(31) == 'o') {
                            throw new RuntimeException();
                        }
                        A03[2] = "FNCbzyr7QyRP3SA06TqNXuxS80zpa9Bi";
                        if (i6 > i5) {
                            return false;
                        }
                    }
                    return true;
                }
                return false;
            }
            return false;
        }
        return false;
    }

    public static boolean A0M(int[][] iArr, TrackGroupArray trackGroupArray, GC gc) {
        if (gc == null) {
            return false;
        }
        int A00 = trackGroupArray.A00(gc.A7e());
        if (A03[2].charAt(31) != 'o') {
            A03[1] = "tyUFTMgWRFIbU9oMa0yVOFtav5LFL8C4";
            for (int i = 0; i < gc.length(); i++) {
                int trackGroupIndex = iArr[A00][gc.A6l(i)] & 32;
                if (trackGroupIndex != 32) {
                    return false;
                }
            }
            int trackGroupIndex2 = A03[2].charAt(31);
            if (trackGroupIndex2 != 111) {
                String[] strArr = A03;
                strArr[4] = "AvWfp";
                strArr[0] = "jnm8oH";
                return true;
            }
            A03[3] = "hBflC2WcQfSqXI4XtpzFNLmvHBtesKLi";
            return true;
        }
        throw new RuntimeException();
    }

    /* JADX WARN: Incorrect condition in loop: B:25:0x006d */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static int[] A0N(com.facebook.ads.internal.exoplayer2.source.TrackGroup r8, int[] r9, boolean r10) {
        /*
            r5 = 0
            r7 = 0
            java.util.HashSet r6 = new java.util.HashSet
            r6.<init>()
            r4 = 0
        L8:
            int r0 = r8.A01
            if (r4 >= r0) goto L49
            com.facebook.ads.internal.exoplayer2.Format r0 = r8.A01(r4)
            com.facebook.ads.redexgen.X.G2 r3 = new com.facebook.ads.redexgen.X.G2
            int r2 = r0.A05
            int r1 = r0.A0C
            if (r10 == 0) goto L46
            r0 = 0
        L19:
            r3.<init>(r2, r1, r0)
            java.lang.String[] r2 = com.facebook.ads.redexgen.X.AZ.A03
            r0 = 4
            r1 = r2[r0]
            r0 = 0
            r0 = r2[r0]
            int r1 = r1.length()
            int r0 = r0.length()
            if (r1 == r0) goto L5c
            java.lang.String[] r2 = com.facebook.ads.redexgen.X.AZ.A03
            java.lang.String r1 = "SWl"
            r0 = 6
            r2[r0] = r1
            boolean r0 = r6.add(r3)
            if (r0 == 0) goto L43
            int r0 = A04(r8, r9, r3)
            if (r0 <= r5) goto L43
            r7 = r3
            r5 = r0
        L43:
            int r4 = r4 + 1
            goto L8
        L46:
            java.lang.String r0 = r0.A0O
            goto L19
        L49:
            r0 = 1
            if (r5 <= r0) goto L8a
            int[] r5 = new int[r5]
            java.lang.String[] r1 = com.facebook.ads.redexgen.X.AZ.A03
            r0 = 1
            r1 = r1[r0]
            r0 = 3
            char r1 = r1.charAt(r0)
            r0 = 70
            if (r1 == r0) goto L62
        L5c:
            java.lang.RuntimeException r0 = new java.lang.RuntimeException
            r0.<init>()
            throw r0
        L62:
            java.lang.String[] r2 = com.facebook.ads.redexgen.X.AZ.A03
            java.lang.String r1 = "ndqJYBN4kzCrcISGfJ6gLQAVvTseYRAq"
            r0 = 2
            r2[r0] = r1
            r4 = 0
            r3 = 0
        L6b:
            int r0 = r8.A01
            if (r3 >= r0) goto L89
            com.facebook.ads.internal.exoplayer2.Format r2 = r8.A01(r3)
            r1 = r9[r3]
            java.lang.Object r0 = com.facebook.ads.redexgen.X.H6.A01(r7)
            com.facebook.ads.redexgen.X.G2 r0 = (com.facebook.ads.redexgen.X.G2) r0
            boolean r0 = A0J(r2, r1, r0)
            if (r0 == 0) goto L86
            int r0 = r4 + 1
            r5[r4] = r3
            r4 = r0
        L86:
            int r3 = r3 + 1
            goto L6b
        L89:
            return r5
        L8a:
            int[] r0 = com.facebook.ads.redexgen.X.AZ.A04
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.ads.redexgen.X.AZ.A0N(com.facebook.ads.internal.exoplayer2.source.TrackGroup, int[], boolean):int[]");
    }

    public static int[] A0O(TrackGroup trackGroup, int[] iArr, boolean z, int selectedMimeTypeTrackCount, int selectedMimeTypeTrackCount2, int trackIndex, int i, int i2, int i3, boolean z2) {
        int A032;
        if (trackGroup.A01 >= 2) {
            List<Integer> A0D = A0D(trackGroup, i2, i3, z2);
            if (A0D.size() < 2) {
                return A04;
            }
            String selectedMimeType = null;
            if (!z) {
                HashSet hashSet = new HashSet();
                int selectedMimeTypeTrackCount3 = 0;
                for (int i4 = 0; i4 < A0D.size(); i4++) {
                    String str = trackGroup.A01(A0D.get(i4).intValue()).A0O;
                    if (hashSet.add(str) && (A032 = A03(trackGroup, iArr, selectedMimeTypeTrackCount, str, selectedMimeTypeTrackCount2, trackIndex, i, A0D)) > selectedMimeTypeTrackCount3) {
                        if (A03[3].charAt(2) == 'E') {
                            throw new RuntimeException();
                        }
                        String[] strArr = A03;
                        strArr[7] = "YYn4Z0UW1tJYYEwj5MQ7L1Rhi";
                        strArr[5] = "BvRHCOG0R11gnbm1vcetrlVSM";
                        selectedMimeType = str;
                        selectedMimeTypeTrackCount3 = A032;
                    }
                }
            }
            A0F(trackGroup, iArr, selectedMimeTypeTrackCount, selectedMimeType, selectedMimeTypeTrackCount2, trackIndex, i, A0D);
            return A0D.size() < 2 ? A04 : C0430Hl.A0j(A0D);
        }
        return A04;
    }

    private final GC[] A0P(GA ga, int[][][] iArr, int[] iArr2, DefaultTrackSelector$Parameters defaultTrackSelector$Parameters) throws AnonymousClass98 {
        boolean z;
        int A00 = ga.A00();
        GC[] gcArr = new GC[A00];
        boolean seenVideoRendererWithMappedTracks = false;
        int i = 0;
        for (int i2 = 0; i2 < A00; i2++) {
            int A01 = ga.A01(i2);
            if (A03[2].charAt(31) == 'o') {
                throw new RuntimeException();
            }
            A03[2] = "HeTTodjeOHNf6YJV3Oi2xZW4zDR7myJi";
            if (2 == A01) {
                if (i == 0) {
                    z = true;
                    gcArr[i2] = A09(ga.A02(i2), iArr[i2], iArr2[i2], defaultTrackSelector$Parameters, this.A00);
                    i = gcArr[i2] != null ? 1 : 0;
                } else {
                    z = true;
                }
                if (ga.A02(i2).A01 <= 0) {
                    z = false;
                }
                seenVideoRendererWithMappedTracks |= z;
            }
        }
        boolean selectedVideoTracks = false;
        int i3 = 0;
        int rendererCount = A03[3].charAt(2);
        if (rendererCount != 69) {
            A03[2] = "aVwUyHxCeGesw16VUIJPDtFnHPxsnnXC";
            for (int i4 = 0; i4 < A00; i4++) {
                int A012 = ga.A01(i4);
                if (A012 != 1) {
                    if (A012 != 2) {
                        if (A012 != 3) {
                            gcArr[i4] = A06(A012, ga.A02(i4), iArr[i4], defaultTrackSelector$Parameters);
                        } else if (i3 == 0) {
                            gcArr[i4] = A0B(ga.A02(i4), iArr[i4], defaultTrackSelector$Parameters);
                            i3 = gcArr[i4] != null ? 1 : 0;
                        }
                    }
                } else if (!selectedVideoTracks) {
                    gcArr[i4] = A08(ga.A02(i4), iArr[i4], iArr2[i4], defaultTrackSelector$Parameters, seenVideoRendererWithMappedTracks ? null : this.A00);
                    selectedVideoTracks = gcArr[i4] != null;
                }
            }
            return gcArr;
        }
        throw new RuntimeException();
    }

    /* JADX WARN: Removed duplicated region for block: B:28:0x007a  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0081  */
    @Override // com.facebook.ads.redexgen.X.AbstractC0746Ty
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final android.util.Pair<com.facebook.ads.redexgen.X.C02359h[], com.facebook.ads.redexgen.X.GC[]> A0V(com.facebook.ads.redexgen.X.GA r11, int[][][] r12, int[] r13) throws com.facebook.ads.redexgen.X.AnonymousClass98 {
        /*
            r10 = this;
            java.util.concurrent.atomic.AtomicReference<com.facebook.ads.internal.exoplayer2.trackselection.DefaultTrackSelector$Parameters> r0 = r10.A01
            java.lang.Object r6 = r0.get()
            com.facebook.ads.internal.exoplayer2.trackselection.DefaultTrackSelector$Parameters r6 = (com.facebook.ads.internal.exoplayer2.trackselection.DefaultTrackSelector$Parameters) r6
            int r5 = r11.A00()
            com.facebook.ads.redexgen.X.GC[] r4 = r10.A0P(r11, r12, r13, r6)
            r3 = 0
        L11:
            r9 = 0
            r8 = 0
            r2 = 1
            if (r3 >= r5) goto L61
            boolean r0 = r6.A06(r3)
            if (r0 == 0) goto L21
            r4[r3] = r8
        L1e:
            int r3 = r3 + 1
            goto L11
        L21:
            com.facebook.ads.internal.exoplayer2.source.TrackGroupArray r1 = r11.A02(r3)
            boolean r0 = r6.A07(r3, r1)
            if (r0 == 0) goto L1e
            com.facebook.ads.internal.exoplayer2.trackselection.DefaultTrackSelector$SelectionOverride r7 = r6.A05(r3, r1)
            if (r7 != 0) goto L34
            r4[r3] = r8
            goto L1e
        L34:
            int r0 = r7.A01
            if (r0 != r2) goto L4a
            int r0 = r7.A00
            com.facebook.ads.internal.exoplayer2.source.TrackGroup r2 = r1.A01(r0)
            int[] r0 = r7.A02
            r1 = r0[r9]
            com.facebook.ads.redexgen.X.AW r0 = new com.facebook.ads.redexgen.X.AW
            r0.<init>(r2, r1)
            r4[r3] = r0
            goto L1e
        L4a:
            com.facebook.ads.redexgen.X.GB r0 = r10.A00
            java.lang.Object r2 = com.facebook.ads.redexgen.X.H6.A01(r0)
            com.facebook.ads.redexgen.X.GB r2 = (com.facebook.ads.redexgen.X.GB) r2
            int r0 = r7.A00
            com.facebook.ads.internal.exoplayer2.source.TrackGroup r1 = r1.A01(r0)
            int[] r0 = r7.A02
            com.facebook.ads.redexgen.X.GC r0 = r2.A4U(r1, r0)
            r4[r3] = r0
            goto L1e
        L61:
            com.facebook.ads.redexgen.X.9h[] r3 = new com.facebook.ads.redexgen.X.C02359h[r5]
            r2 = 0
        L64:
            if (r2 >= r5) goto L85
            boolean r0 = r6.A06(r2)
            if (r0 != 0) goto L83
            int r1 = r11.A01(r2)
            r0 = 5
            if (r1 == r0) goto L77
            r0 = r4[r2]
            if (r0 == 0) goto L83
        L77:
            r0 = 1
        L78:
            if (r0 == 0) goto L81
            com.facebook.ads.redexgen.X.9h r0 = com.facebook.ads.redexgen.X.C02359h.A01
        L7c:
            r3[r2] = r0
            int r2 = r2 + 1
            goto L64
        L81:
            r0 = r8
            goto L7c
        L83:
            r0 = 0
            goto L78
        L85:
            int r0 = r6.A04
            A0G(r11, r12, r3, r4, r0)
            android.util.Pair r0 = android.util.Pair.create(r3, r4)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.ads.redexgen.X.AZ.A0V(com.facebook.ads.redexgen.X.GA, int[][][], int[]):android.util.Pair");
    }
}
