package com.facebook.ads.redexgen.X;

import a.a.j;
import android.util.Log;
import android.util.Pair;
import androidx.annotation.Nullable;
import com.facebook.ads.internal.exoplayer2.drm.DrmInitData;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.UUID;
/* loaded from: assets/audience_network.dex */
public final class Bk {
    public static byte[] A0h;
    public static String[] A0i = {"8TpqgOaNUSLeAK", "gH4cNYX0T", "RxL", "kj1UdyKUA", "aiTHi296we72LwNhd9xiUHTfsQD7UP14", "nYCZaclp", "WtVme8bpEWm7CPp05BwAvQTPTn4MSMoI", "2CEJS7GQKAShoAR5BcckvYDLq4kjdsx3"};
    public float A00;
    public float A01;
    public float A02;
    public float A03;
    public float A04;
    public float A05;
    public float A06;
    public float A07;
    public float A08;
    public float A09;
    public int A0A;
    public int A0B;
    public int A0C;
    public int A0D;
    public int A0E;
    public int A0F;
    public int A0G;
    public int A0H;
    public int A0I;
    public int A0J;
    public int A0K;
    public int A0L;
    public int A0M;
    public int A0N;
    public int A0O;
    public int A0P;
    public int A0Q;
    public int A0R;
    public long A0S;
    public long A0T;
    public DrmInitData A0U;
    public BZ A0V;
    public InterfaceC0279Ba A0W;
    @Nullable
    public Bl A0X;
    public String A0Y;
    public boolean A0Z;
    public boolean A0a;
    public boolean A0b;
    public boolean A0c;
    public byte[] A0d;
    public byte[] A0e;
    public byte[] A0f;
    public String A0g;

    /* JADX WARN: Failed to parse debug info
    java.lang.ArrayIndexOutOfBoundsException: Index 9 out of bounds for length 8
    	at jadx.plugins.input.dex.sections.debuginfo.DebugInfoParser.process(DebugInfoParser.java:147)
    	at jadx.plugins.input.dex.sections.DexCodeReader.getDebugInfo(DexCodeReader.java:118)
    	at jadx.core.dex.nodes.MethodNode.getDebugInfo(MethodNode.java:567)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.visit(DebugInfoAttachVisitor.java:39)
     */
    public static Pair<String, List<byte[]>> A00(HV hv) throws C9R {
        try {
            hv.A0Z(16);
            long A0K = hv.A0K();
            if (A0K == 1482049860) {
                return new Pair<>(A01(881, 10, 96), null);
            }
            if (A0K != 826496599) {
                Log.w(A01(283, 17, 56), A01(419, 51, 124));
                return new Pair<>(A01(944, 15, 9), null);
            }
            byte[] bArr = hv.A00;
            for (int A06 = hv.A06() + 20; A06 < bArr.length - 4; A06++) {
                if (bArr[A06] == 0 && bArr[A06 + 1] == 0 && bArr[A06 + 2] == 1 && bArr[A06 + 3] == 15) {
                    return new Pair<>(A01(934, 10, j.AppCompatTheme_toolbarStyle), Collections.singletonList(Arrays.copyOfRange(bArr, A06, bArr.length)));
                }
            }
            throw new C9R(A01(238, 45, j.AppCompatTheme_tooltipFrameBackground));
        } catch (ArrayIndexOutOfBoundsException unused) {
            throw new C9R(A01(137, 33, 53));
        }
    }

    public static String A01(int i, int i2, int i3) {
        byte[] copyOfRange = Arrays.copyOfRange(A0h, i, i + i2);
        int i4 = 0;
        while (true) {
            int length = copyOfRange.length;
            String[] strArr = A0i;
            if (strArr[2].length() == strArr[4].length()) {
                throw new RuntimeException();
            }
            String[] strArr2 = A0i;
            strArr2[3] = "YyA2yq7rE";
            strArr2[1] = "s5NQwzdwS";
            if (i4 >= length) {
                return new String(copyOfRange);
            }
            copyOfRange[i4] = (byte) ((copyOfRange[i4] - i3) - 50);
            i4++;
        }
    }

    public static void A04() {
        A0h = new byte[]{102, 88, -117, -99, -84, -84, -95, -90, -97, 88, -91, -95, -91, -99, -116, -79, -88, -99, 88, -84, -89, 88, -89, -59, -89, -89, -87, -57, -27, -57, -55, -71, -24, 6, -21, -5, -6, 118, -108, 121, -119, -120, 100, 122, -115, -123, -121, 122, -120, -120, -104, -74, -101, -85, -86, -122, -93, -90, -86, -86, -93, -100, -86, -86, -119, -89, -115, -119, -117, 123, -55, -25, -50, -44, -55, -53, -88, -58, -76, -73, -84, -82, -106, -77, -103, -120, -90, -108, -105, -116, -114, 118, -109, 122, -96, -66, -84, -78, -114, -96, -94, -84, -67, -37, -53, -52, -47, -49, -86, -56, -71, -84, -74, -104, -78, -73, -67, -104, -75, -78, -67, -88, -58, -69, -71, -68, -84, -81, -85, -42, -12, -21, -28, -25, -41, -34, -24, -84, -39, -39, -42, -39, -121, -41, -56, -39, -38, -48, -43, -50, -121, -83, -42, -36, -39, -86, -86, -121, -41, -39, -48, -35, -56, -37, -52, -121, -53, -56, -37, -56, -124, -79, -79, -82, -79, 95, -81, -96, -79, -78, -88, -83, -90, 95, -116, -110, 110, Byte.MIN_VALUE, -126, -116, 95, -94, -82, -93, -92, -94, 95, -81, -79, -88, -75, -96, -77, -92, -12, 33, 33, 30, 33, -49, 31, 16, 33, 34, 24, 29, 22, -49, 37, 30, 33, 17, 24, 34, -49, 18, 30, 19, 20, 18, -49, 31, 33, 24, 37, 16, 35, 20, -27, 0, 8, 11, 4, 3, -65, 19, 14, -65, 5, 8, 13, 3, -65, -27, 14, 20, 17, -30, -30, -65, -11, -30, -48, -65, 8, 13, 8, 19, 8, 0, 11, 8, 25, 0, 19, 8, 14, 13, -65, 3, 0, 19, 0, -73, -53, -34, -36, -39, -35, -43, -53, -81, -30, -34, -36, -53, -51, -34, -39, -36, -71, -38, -39, -104, -69, -82, -72, -117, -72, -66, -102, -84, -82, -72, -117, -44, -34, -117, -32, -39, -34, -32, -37, -37, -38, -35, -33, -48, -49, -103, -117, -66, -48, -33, -33, -44, -39, -46, -117, -40, -44, -40, -48, -65, -28, -37, -48, -117, -33, -38, -117, -89, -77, -104, -86, -106, -89, -87, -106, -27, -15, -38, -42, -33, -24, -63, -30, -39, -27, -29, -17, -28, -43, -24, -28, -65, -47, -29, -29, -121, -109, -120, 121, -116, -120, 99, -119, -120, 122, 108, -61, -49, -58, -65, -78, -61, -59, -78, -39, -14, -23, -4, -12, -23, -25, -8, -23, -24, -92, -47, -51, -47, -55, -92, -8, -3, -12, -23, -78, 3, 28, 25, 28, 29, 37, 28, -50, -12, 29, 35, 32, -15, -15, -36, -50, 1, 19, 34, 34, 23, 28, 21, -50, 27, 23, 27, 19, 2, 39, 30, 19, -50, 34, 29, -50, 36, 23, 18, 19, 29, -35, 38, -37, 35, 28, 25, 28, 29, 37, 28, -79, -54, -50, -63, -65, -53, -61, -54, -59, -42, -63, -64, 124, -65, -53, -64, -63, -65, 124, -59, -64, -63, -54, -48, -59, -62, -59, -63, -50, -118, -58, -33, -28, -26, -31, -31, -32, -29, -27, -42, -43, -111, -63, -76, -66, -111, -45, -38, -27, -111, -43, -42, -31, -27, -39, -85, -111, -98, -89, -107, -104, -115, -113, 122, -32, -23, -41, -38, -49, -47, -66, -71, -45, -35, -39, -71, -53, -38, -85, -76, -94, -91, -102, -100, -119, -124, -98, -88, -92, -124, -106, -88, -91, -110, -101, -119, -116, -127, -125, 112, 107, -123, -113, -117, 107, 125, -110, Byte.MAX_VALUE, -40, -31, -49, -46, -57, -55, -74, -79, -53, -43, -47, -79, -43, -46, -72, -63, -81, -78, -89, -87, -86, -111, -85, -75, -79, -111, -86, -89, -72, -91, -50, -41, -59, -53, -89, -50, -66, -49, -89, -66, -57, -51, -54, -69, -69, -51, -42, -53, -65, -68, -58, -55, -72, -120, -111, -120, -126, 106, -59, -50, -59, -65, -88, -104, -89, -89, -93, -96, -102, -104, -85, -96, -90, -91, 102, -101, -83, -103, -86, -84, -103, -86, -84, -69, -69, -73, -76, -82, -84, -65, -76, -70, -71, 122, -69, -78, -66, -80, -65, -65, -69, -72, -78, -80, -61, -72, -66, -67, 126, -59, -66, -79, -62, -60, -79, -69, -54, -54, -58, -61, -67, -69, -50, -61, -55, -56, -119, -46, -121, -51, -49, -68, -52, -61, -54, -51, -31, -48, -43, -37, -101, -51, -49, -97, -94, -74, -91, -86, -80, 112, -90, -94, -92, 116, -76, -56, -73, -68, -62, -126, -71, -65, -76, -74, -55, -35, -52, -47, -41, -105, -43, -40, -100, -55, -107, -44, -55, -36, -43, -67, -47, -64, -59, -53, -117, -55, -52, -63, -61, -88, -68, -85, -80, -74, 118, -76, -73, -84, -82, 116, -109, 121, -51, -31, -48, -43, -37, -101, -37, -36, -31, -33, -20, 0, -17, -12, -6, -70, -3, -20, 2, -4, 16, -1, 4, 10, -54, 15, 13, 16, 0, -56, 3, -1, -32, -12, -29, -24, -18, -82, -11, -19, -29, -83, -29, -13, -14, -52, -32, -49, -44, -38, -102, -31, -39, -49, -103, -49, -33, -34, -103, -45, -49, -97, -77, -94, -89, -83, 109, -76, -83, -80, -96, -89, -79, -86, -66, -83, -78, -72, 120, -63, 118, -66, -73, -76, -73, -72, -64, -73, -26, -17, -24, -12, -27, -8, -12, -81, -8, -83, -13, -13, -31, 8, -5, -10, -9, 1, -63, -59, -7, 2, 2, 30, 17, 12, 13, 23, -41, 9, 30, 11, -17, -30, -35, -34, -24, -88, -31, -34, -17, -36, -61, -74, -79, -78, -68, 124, -70, -67, -127, -61, 122, -78, -64, -44, -57, -62, -61, -51, -115, -53, -50, -61, -59, -112, 19, 6, 1, 2, 12, -52, 20, 19, 0, -50, -79, -92, -97, -96, -86, 106, -77, 104, -80, -87, -90, -87, -86, -78, -87, 7, -6, -11, -10, 0, -64, 9, -66, 7, -1, -11, -65, 0, -1, -61, -65, 7, 1, -55, 6, -7, -12, -11, -1, -65, 8, -67, 6, -2, -12, -66, -1, -2, -62, -66, 6, 0, -55};
    }

    static {
        A04();
    }

    public Bk() {
        this.A0R = -1;
        this.A0J = -1;
        this.A0I = -1;
        this.A0G = -1;
        this.A0H = 0;
        this.A0e = null;
        this.A0P = -1;
        this.A0b = false;
        this.A0D = -1;
        this.A0E = -1;
        this.A0C = -1;
        this.A0K = 1000;
        this.A0L = 200;
        this.A06 = -1.0f;
        this.A07 = -1.0f;
        this.A04 = -1.0f;
        this.A05 = -1.0f;
        this.A02 = -1.0f;
        this.A03 = -1.0f;
        this.A08 = -1.0f;
        this.A09 = -1.0f;
        this.A00 = -1.0f;
        this.A01 = -1.0f;
        this.A0B = 1;
        this.A0A = -1;
        this.A0O = 8000;
        this.A0S = 0L;
        this.A0T = 0L;
        this.A0Z = true;
        this.A0g = A01(868, 3, 79);
    }

    public /* synthetic */ Bk(VR vr) {
        this();
    }

    public static /* synthetic */ String A02(Bk bk, String str) {
        bk.A0g = str;
        return str;
    }

    public static List<byte[]> A03(byte[] bArr) throws C9R {
        String A01 = A01(204, 34, 125);
        try {
            if (bArr[0] == 2) {
                int vorbisInfoLength = 1;
                int i = 0;
                while (bArr[vorbisInfoLength] == -1) {
                    i += 255;
                    vorbisInfoLength++;
                }
                int i2 = vorbisInfoLength + 1;
                int i3 = i + bArr[vorbisInfoLength];
                int i4 = 0;
                while (bArr[i2] == -1) {
                    i4 += 255;
                    i2++;
                }
                int vorbisInfoLength2 = i2 + 1;
                int i5 = i4 + bArr[i2];
                if (bArr[vorbisInfoLength2] == 1) {
                    byte[] bArr2 = new byte[i3];
                    System.arraycopy(bArr, vorbisInfoLength2, bArr2, 0, i3);
                    int vorbisInfoLength3 = vorbisInfoLength2 + i3;
                    if (bArr[vorbisInfoLength3] == 3) {
                        int vorbisInfoLength4 = vorbisInfoLength3 + i5;
                        if (bArr[vorbisInfoLength4] == 5) {
                            byte[] bArr3 = new byte[bArr.length - vorbisInfoLength4];
                            System.arraycopy(bArr, vorbisInfoLength4, bArr3, 0, bArr.length - vorbisInfoLength4);
                            ArrayList arrayList = new ArrayList(2);
                            arrayList.add(bArr2);
                            arrayList.add(bArr3);
                            return arrayList;
                        }
                        throw new C9R(A01);
                    }
                    throw new C9R(A01);
                }
                throw new C9R(A01);
            }
            throw new C9R(A01);
        } catch (ArrayIndexOutOfBoundsException unused) {
            throw new C9R(A01);
        }
    }

    public static boolean A05(HV hv) throws C9R {
        UUID uuid;
        UUID uuid2;
        try {
            int A0C = hv.A0C();
            if (A0C == 1) {
                return true;
            }
            if (A0C == 65534) {
                hv.A0Y(24);
                long A0L = hv.A0L();
                uuid = VP.A0s;
                int formatTag = (A0L > uuid.getMostSignificantBits() ? 1 : (A0L == uuid.getMostSignificantBits() ? 0 : -1));
                if (formatTag == 0) {
                    long A0L2 = hv.A0L();
                    uuid2 = VP.A0s;
                    int formatTag2 = (A0L2 > uuid2.getLeastSignificantBits() ? 1 : (A0L2 == uuid2.getLeastSignificantBits() ? 0 : -1));
                    if (formatTag2 == 0) {
                        return true;
                    }
                }
                return false;
            }
            return false;
        } catch (ArrayIndexOutOfBoundsException unused) {
            throw new C9R(A01(170, 34, 13));
        }
    }

    private byte[] A06() {
        if (this.A06 == -1.0f || this.A07 == -1.0f) {
            return null;
        }
        int i = (this.A04 > (-1.0f) ? 1 : (this.A04 == (-1.0f) ? 0 : -1));
        String[] strArr = A0i;
        if (strArr[0].length() != strArr[5].length()) {
            String[] strArr2 = A0i;
            strArr2[2] = "mbc";
            strArr2[4] = "GijrUN633WOPM1ihGB7sVJQ0vA2mo6CS";
            if (i == 0 || this.A05 == -1.0f || this.A02 == -1.0f || this.A03 == -1.0f || this.A08 == -1.0f || this.A09 == -1.0f || this.A00 == -1.0f || this.A01 == -1.0f) {
                return null;
            }
            byte[] bArr = new byte[25];
            ByteBuffer hdrStaticInfo = ByteBuffer.wrap(bArr);
            hdrStaticInfo.put((byte) 0);
            hdrStaticInfo.putShort((short) ((this.A06 * 50000.0f) + 0.5f));
            hdrStaticInfo.putShort((short) ((this.A07 * 50000.0f) + 0.5f));
            hdrStaticInfo.putShort((short) ((this.A04 * 50000.0f) + 0.5f));
            hdrStaticInfo.putShort((short) ((this.A05 * 50000.0f) + 0.5f));
            hdrStaticInfo.putShort((short) ((this.A02 * 50000.0f) + 0.5f));
            hdrStaticInfo.putShort((short) ((this.A03 * 50000.0f) + 0.5f));
            hdrStaticInfo.putShort((short) ((this.A08 * 50000.0f) + 0.5f));
            hdrStaticInfo.putShort((short) ((this.A09 * 50000.0f) + 0.5f));
            hdrStaticInfo.putShort((short) (this.A00 + 0.5f));
            hdrStaticInfo.putShort((short) (this.A01 + 0.5f));
            hdrStaticInfo.putShort((short) this.A0K);
            hdrStaticInfo.putShort((short) this.A0L);
            return bArr;
        }
        throw new RuntimeException();
    }

    public final void A07() {
        Bl bl = this.A0X;
        if (bl != null) {
            bl.A02(this);
        }
    }

    public final void A08() {
        Bl bl = this.A0X;
        if (bl != null) {
            bl.A00();
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:292:0x03e7, code lost:
        if (r4.equals(r1) != false) goto L50;
     */
    /* JADX WARN: Code restructure failed: missing block: B:293:0x03e9, code lost:
        r4 = 3;
        r2 = com.facebook.ads.internal.exoplayer2.Format.A01(java.lang.Integer.toString(r29), r1, r3, r27.A0g, r27.A0U);
     */
    /* JADX WARN: Code restructure failed: missing block: B:295:0x0409, code lost:
        if (r4.equals(r1) != false) goto L50;
     */
    /* JADX WARN: Code restructure failed: missing block: B:297:0x040c, code lost:
        r4 = A01(871, 10, 78);
     */
    /* JADX WARN: Code restructure failed: missing block: B:298:0x041a, code lost:
        if (r4.equals(r1) == false) goto L54;
     */
    /* JADX WARN: Code restructure failed: missing block: B:299:0x041c, code lost:
        r4 = 3;
        r7 = new java.util.ArrayList(2);
        r2 = com.facebook.ads.redexgen.X.VP.A0t;
        r7.add(r2);
        r7.add(r27.A0d);
        r2 = com.facebook.ads.internal.exoplayer2.Format.A09(java.lang.Integer.toString(r29), r1, null, -1, r3, r27.A0g, -1, r27.A0U, Long.MAX_VALUE, r7);
     */
    /* JADX WARN: Code restructure failed: missing block: B:300:0x044a, code lost:
        r4 = A01(675, 18, 29);
     */
    /* JADX WARN: Code restructure failed: missing block: B:301:0x0458, code lost:
        if (r4.equals(r1) != false) goto L66;
     */
    /* JADX WARN: Code restructure failed: missing block: B:302:0x045a, code lost:
        r4 = A01(660, 15, 25);
        r7 = r4.equals(r1);
        r5 = com.facebook.ads.redexgen.X.Bk.A0i[6].charAt(13);
     */
    /* JADX WARN: Code restructure failed: missing block: B:303:0x0475, code lost:
        if (r5 == 80) goto L60;
     */
    /* JADX WARN: Code restructure failed: missing block: B:305:0x047c, code lost:
        throw new java.lang.RuntimeException();
     */
    /* JADX WARN: Code restructure failed: missing block: B:306:0x047d, code lost:
        r6 = com.facebook.ads.redexgen.X.Bk.A0i;
        r6[2] = "mzu";
        r6[4] = "qu0J2ADkyWaVBa9kD7o9Qirh7WEjYJw0";
     */
    /* JADX WARN: Code restructure failed: missing block: B:307:0x0489, code lost:
        if (r7 != false) goto L66;
     */
    /* JADX WARN: Code restructure failed: missing block: B:308:0x048b, code lost:
        r4 = A01(641, 19, 5);
     */
    /* JADX WARN: Code restructure failed: missing block: B:309:0x0498, code lost:
        if (r4.equals(r1) == false) goto L64;
     */
    /* JADX WARN: Code restructure failed: missing block: B:310:0x049a, code lost:
        r4 = 3;
        r8 = java.lang.Integer.toString(r29);
        r7 = com.facebook.ads.redexgen.X.Bk.A0i;
        r6 = r7[0];
        r5 = r7[5];
        r6 = r6.length();
        r5 = r5.length();
     */
    /* JADX WARN: Code restructure failed: missing block: B:311:0x04b0, code lost:
        if (r6 == r5) goto L69;
     */
    /* JADX WARN: Code restructure failed: missing block: B:312:0x04b2, code lost:
        r7 = com.facebook.ads.redexgen.X.Bk.A0i;
        r7[0] = "GDRTIaIlzs7O11";
        r7[5] = "6URnVLVv";
        r2 = com.facebook.ads.internal.exoplayer2.Format.A0A(r8, r1, null, -1, r3, r2, r27.A0g, r27.A0U);
     */
    /* JADX WARN: Code restructure failed: missing block: B:313:0x04ce, code lost:
        com.facebook.ads.redexgen.X.Bk.A0i[6] = "fbrpEOPCxs8P1PkqPKxhpgVrBLZobrss";
        r2 = com.facebook.ads.internal.exoplayer2.Format.A0A(r8, r1, null, -1, r3, r2, r27.A0g, r27.A0U);
     */
    /* JADX WARN: Code restructure failed: missing block: B:355:0x0616, code lost:
        if (r9.equals(A01(50, 14, 32)) != false) goto L151;
     */
    /* JADX WARN: Code restructure failed: missing block: B:356:0x0618, code lost:
        r12 = 20;
     */
    /* JADX WARN: Code restructure failed: missing block: B:358:0x062d, code lost:
        if (r9.equals(A01(50, 14, 37)) != false) goto L151;
     */
    /* JADX WARN: Code restructure failed: missing block: B:413:0x0790, code lost:
        throw new com.facebook.ads.redexgen.X.C9R(A01(398, 21, 82));
     */
    /* JADX WARN: Removed duplicated region for block: B:214:0x0038  */
    /* JADX WARN: Removed duplicated region for block: B:216:0x0048  */
    /* JADX WARN: Removed duplicated region for block: B:217:0x0054  */
    /* JADX WARN: Removed duplicated region for block: B:218:0x0060  */
    /* JADX WARN: Removed duplicated region for block: B:219:0x006c  */
    /* JADX WARN: Removed duplicated region for block: B:223:0x0083  */
    /* JADX WARN: Removed duplicated region for block: B:224:0x00a0  */
    /* JADX WARN: Removed duplicated region for block: B:225:0x00bd  */
    /* JADX WARN: Removed duplicated region for block: B:226:0x00d2  */
    /* JADX WARN: Removed duplicated region for block: B:227:0x00de  */
    /* JADX WARN: Removed duplicated region for block: B:228:0x00f2  */
    /* JADX WARN: Removed duplicated region for block: B:229:0x013c  */
    /* JADX WARN: Removed duplicated region for block: B:230:0x014e  */
    /* JADX WARN: Removed duplicated region for block: B:231:0x015c  */
    /* JADX WARN: Removed duplicated region for block: B:232:0x016a  */
    /* JADX WARN: Removed duplicated region for block: B:233:0x0176  */
    /* JADX WARN: Removed duplicated region for block: B:234:0x0182  */
    /* JADX WARN: Removed duplicated region for block: B:235:0x0195  */
    /* JADX WARN: Removed duplicated region for block: B:236:0x01a1  */
    /* JADX WARN: Removed duplicated region for block: B:237:0x01ad  */
    /* JADX WARN: Removed duplicated region for block: B:238:0x01bf  */
    /* JADX WARN: Removed duplicated region for block: B:244:0x022e  */
    /* JADX WARN: Removed duplicated region for block: B:249:0x0285  */
    /* JADX WARN: Removed duplicated region for block: B:250:0x0290  */
    /* JADX WARN: Removed duplicated region for block: B:251:0x029b  */
    /* JADX WARN: Removed duplicated region for block: B:252:0x02ac  */
    /* JADX WARN: Removed duplicated region for block: B:253:0x02b7  */
    /* JADX WARN: Removed duplicated region for block: B:256:0x02e0  */
    /* JADX WARN: Removed duplicated region for block: B:259:0x02e8  */
    /* JADX WARN: Removed duplicated region for block: B:262:0x0318  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void A09(com.facebook.ads.redexgen.X.BQ r28, int r29) throws com.facebook.ads.redexgen.X.C9R {
        /*
            Method dump skipped, instructions count: 2118
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.ads.redexgen.X.Bk.A09(com.facebook.ads.redexgen.X.BQ, int):void");
    }
}
