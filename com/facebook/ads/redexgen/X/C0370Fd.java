package com.facebook.ads.redexgen.X;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.util.Log;
import android.util.SparseArray;
import androidx.annotation.Nullable;
import java.util.Arrays;
/* renamed from: com.facebook.ads.redexgen.X.Fd  reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public final class C0370Fd {
    public static byte[] A07;
    public static String[] A08 = {"0rGqU9QbqgRhw9xCYiy2ikjdJF0tZxW0", "O5zJjRmwn", "Zuwvbdj2tlT5lxRkpa9deVxz18dZQdtj", "3cu9YvSu9oYTgNu7SXt0BZa9RO8c3dJe", "fSpgVoQESo9i788g3Yt2BRpnP7rxN0lE", "PNJ5rPmEA0nUP9bGeJM8wQu7KuAYrDy", "AGqKR696jXLUBqkrCQSQW886irj6NtRI", "IRr9cxFu4Mtz1eOchhtcqFpk7Zjv6sDY"};
    public static final byte[] A09;
    public static final byte[] A0A;
    public static final byte[] A0B;
    public Bitmap A00;
    public final Canvas A01;
    public final Paint A02 = new Paint();
    public final Paint A03;
    public final FV A04;
    public final FW A05;
    public final C0369Fc A06;

    /* JADX WARN: Failed to parse debug info
    java.lang.ArrayIndexOutOfBoundsException: Index 19 out of bounds for length 19
    	at jadx.plugins.input.dex.sections.debuginfo.DebugInfoParser.startVar(DebugInfoParser.java:203)
    	at jadx.plugins.input.dex.sections.debuginfo.DebugInfoParser.process(DebugInfoParser.java:125)
    	at jadx.plugins.input.dex.sections.DexCodeReader.getDebugInfo(DexCodeReader.java:118)
    	at jadx.core.dex.nodes.MethodNode.getDebugInfo(MethodNode.java:567)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.visit(DebugInfoAttachVisitor.java:39)
     */
    public static FV A04(HU hu, int i) {
        int A04;
        int A042;
        int A043;
        int A044;
        int i2 = 8;
        int A045 = hu.A04(8);
        hu.A08(8);
        int i3 = i - 2;
        int[] A0F = A0F();
        int[] A0G = A0G();
        int[] A0H = A0H();
        while (i3 > 0) {
            int A046 = hu.A04(i2);
            int A047 = hu.A04(i2);
            int i4 = i3 - 2;
            int[] iArr = (A047 & 128) != 0 ? A0F : (A047 & 64) != 0 ? A0G : A0H;
            if ((A047 & 1) != 0) {
                A04 = hu.A04(i2);
                A042 = hu.A04(i2);
                A043 = hu.A04(i2);
                A044 = hu.A04(i2);
                i3 = i4 - 4;
            } else {
                A04 = hu.A04(6) << 2;
                A042 = hu.A04(4) << 4;
                A043 = hu.A04(4) << 4;
                A044 = hu.A04(2) << 6;
                i3 = i4 - 2;
            }
            if (A04 == 0) {
                A042 = 0;
                A043 = 0;
                A044 = 255;
            }
            iArr[A046] = A00((byte) (255 - (A044 & 255)), C0430Hl.A06((int) (A04 + ((A042 - 128) * 1.402d)), 0, 255), C0430Hl.A06((int) ((A04 - ((A043 - 128) * 0.34414d)) - ((A042 - 128) * 0.71414d)), 0, 255), C0430Hl.A06((int) (A04 + ((A043 - 128) * 1.772d)), 0, 255));
            i2 = 8;
        }
        return new FV(A045, A0F, A0G, A0H);
    }

    /* JADX WARN: Failed to parse debug info
    java.lang.ArrayIndexOutOfBoundsException: Index 9 out of bounds for length 8
    	at jadx.plugins.input.dex.sections.debuginfo.DebugInfoParser.startVar(DebugInfoParser.java:203)
    	at jadx.plugins.input.dex.sections.debuginfo.DebugInfoParser.process(DebugInfoParser.java:125)
    	at jadx.plugins.input.dex.sections.DexCodeReader.getDebugInfo(DexCodeReader.java:118)
    	at jadx.core.dex.nodes.MethodNode.getDebugInfo(MethodNode.java:567)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.visit(DebugInfoAttachVisitor.java:39)
     */
    public static FW A05(HU hu) {
        int i;
        int i2;
        int i3;
        int i4;
        hu.A08(4);
        boolean A0F = hu.A0F();
        hu.A08(3);
        int A04 = hu.A04(16);
        int A042 = hu.A04(16);
        if (A0F) {
            i = hu.A04(16);
            i3 = hu.A04(16);
            i2 = hu.A04(16);
            i4 = hu.A04(16);
        } else {
            i = 0;
            i2 = 0;
            i3 = A04;
            i4 = A042;
        }
        return new FW(A04, A042, i, i3, i2, i4);
    }

    /* JADX WARN: Failed to parse debug info
    java.lang.ArrayIndexOutOfBoundsException: Index 28 out of bounds for length 28
    	at jadx.plugins.input.dex.sections.debuginfo.DebugInfoParser.startVar(DebugInfoParser.java:203)
    	at jadx.plugins.input.dex.sections.debuginfo.DebugInfoParser.process(DebugInfoParser.java:125)
    	at jadx.plugins.input.dex.sections.DexCodeReader.getDebugInfo(DexCodeReader.java:118)
    	at jadx.core.dex.nodes.MethodNode.getDebugInfo(MethodNode.java:567)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.visit(DebugInfoAttachVisitor.java:39)
     */
    public static C0367Fa A08(HU hu, int i) {
        int i2 = 8;
        int A04 = hu.A04(8);
        hu.A08(4);
        boolean A0F = hu.A0F();
        hu.A08(3);
        int A042 = hu.A04(16);
        int A043 = hu.A04(16);
        int A044 = hu.A04(3);
        int A045 = hu.A04(3);
        hu.A08(2);
        int A046 = hu.A04(8);
        int A047 = hu.A04(8);
        int A048 = hu.A04(4);
        int A049 = hu.A04(2);
        hu.A08(2);
        int i3 = i - 10;
        SparseArray sparseArray = new SparseArray();
        while (i3 > 0) {
            int A0410 = hu.A04(16);
            int A0411 = hu.A04(2);
            int A0412 = hu.A04(2);
            int A0413 = hu.A04(12);
            hu.A08(4);
            int A0414 = hu.A04(12);
            i3 -= 6;
            int i4 = 0;
            int i5 = 0;
            if (A0411 == 1 || A0411 == 2) {
                i4 = hu.A04(i2);
                i5 = hu.A04(i2);
                i3 -= 2;
                if (A08[2].charAt(23) == 'o') {
                    throw new RuntimeException();
                }
                String[] strArr = A08;
                strArr[4] = "2juIiSC4ZxHJWLrTtxN2ANki5argYjtZ";
                strArr[0] = "MWq7TNsVs7aXK0A5Gh22llfb9AkLnJo6";
            }
            sparseArray.put(A0410, new C0368Fb(A0411, A0412, A0413, A0414, i4, i5));
            i2 = 8;
        }
        return new C0367Fa(A04, A0F, A042, A043, A044, A045, A046, A047, A048, A049, sparseArray);
    }

    public static String A09(int i, int i2, int i3) {
        byte[] copyOfRange = Arrays.copyOfRange(A07, i, i + i2);
        for (int i4 = 0; i4 < copyOfRange.length; i4++) {
            byte b2 = (byte) ((copyOfRange[i4] - i3) - 74);
            String[] strArr = A08;
            if (strArr[4].charAt(19) != strArr[0].charAt(19)) {
                throw new RuntimeException();
            }
            String[] strArr2 = A08;
            strArr2[1] = "o838eL9fL";
            strArr2[5] = "J6qCpr7RcsAqb79Ub3PrHCSZxMucifP";
            copyOfRange[i4] = b2;
        }
        return new String(copyOfRange);
    }

    public static void A0A() {
        A07 = new byte[]{-109, -80, -61, -80, 111, -75, -72, -76, -69, -77, 111, -69, -76, -67, -74, -61, -73, 111, -76, -57, -78, -76, -76, -77, -62, 111, -69, -72, -68, -72, -61, -16, 34, 14, -4, 13, 30, 31, 17, 30};
    }

    /* JADX WARN: Code restructure failed: missing block: B:32:0x0121, code lost:
        if (r14 == null) goto L33;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x0123, code lost:
        r11 = r20.A06;
        r10 = com.facebook.ads.redexgen.X.C0370Fd.A08;
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x0136, code lost:
        if (r10[6].charAt(3) == r10[3].charAt(3)) goto L38;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x0138, code lost:
        r10 = com.facebook.ads.redexgen.X.C0370Fd.A08;
        r10[4] = "FqzyOIY2SO0zI5B62Gz2koPoL8lG6Y83";
        r10[0] = "OO5P85uWBDMqMzJuElY2BFz2z3H1SOXI";
        r14 = r11.A04.get(r1.A00);
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x014e, code lost:
        if (r14 != null) goto L40;
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x0150, code lost:
        r14 = r20.A04;
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x0152, code lost:
        r10 = r1.A09;
        r9 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x0155, code lost:
        r13 = r10.size();
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x0166, code lost:
        if (com.facebook.ads.redexgen.X.C0370Fd.A08[2].charAt(23) == 'o') goto L74;
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x0168, code lost:
        com.facebook.ads.redexgen.X.C0370Fd.A08[2] = "8CBvTLi9MCYkuIvOm7pX0icqjNgV3H5L";
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x016f, code lost:
        if (r9 >= r13) goto L57;
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x0171, code lost:
        r12 = r10.keyAt(r9);
        r11 = r10.valueAt(r9);
        r13 = r20.A06.A07.get(r12);
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x0185, code lost:
        if (r13 != null) goto L48;
     */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x0187, code lost:
        r13 = r20.A06.A05.get(r12);
     */
    /* JADX WARN: Code restructure failed: missing block: B:46:0x0191, code lost:
        if (r13 == null) goto L56;
     */
    /* JADX WARN: Code restructure failed: missing block: B:48:0x0195, code lost:
        if (r13.A01 == false) goto L55;
     */
    /* JADX WARN: Code restructure failed: missing block: B:49:0x0197, code lost:
        r8 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:50:0x0198, code lost:
        A0B(r13, r14, r1.A01, r4 + r11.A02, r3 + r11.A05, r8, r20.A01);
     */
    /* JADX WARN: Code restructure failed: missing block: B:51:0x01ab, code lost:
        r9 = r9 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:52:0x01ae, code lost:
        r8 = r20.A02;
     */
    /* JADX WARN: Code restructure failed: missing block: B:54:0x01b3, code lost:
        if (r1.A0A == false) goto L73;
     */
    /* JADX WARN: Code restructure failed: missing block: B:56:0x01b8, code lost:
        if (r1.A01 != 3) goto L66;
     */
    /* JADX WARN: Code restructure failed: missing block: B:57:0x01ba, code lost:
        r9 = r14.A03[r1.A07];
     */
    /* JADX WARN: Code restructure failed: missing block: B:58:0x01c0, code lost:
        r20.A03.setColor(r9);
        r20.A01.drawRect(r4, r3, r1.A08 + r4, r1.A02 + r3, r20.A03);
     */
    /* JADX WARN: Code restructure failed: missing block: B:61:0x0213, code lost:
        if (r1.A01 != 2) goto L69;
     */
    /* JADX WARN: Code restructure failed: missing block: B:62:0x0215, code lost:
        r9 = r14.A02[r1.A06];
     */
    /* JADX WARN: Code restructure failed: missing block: B:63:0x021c, code lost:
        r11 = r14.A01;
        r10 = com.facebook.ads.redexgen.X.C0370Fd.A08;
     */
    /* JADX WARN: Code restructure failed: missing block: B:64:0x0230, code lost:
        if (r10[4].charAt(19) == r10[0].charAt(19)) goto L72;
     */
    /* JADX WARN: Code restructure failed: missing block: B:65:0x0232, code lost:
        r9 = r11[r1.A05];
     */
    /* JADX WARN: Code restructure failed: missing block: B:66:0x0237, code lost:
        r10 = com.facebook.ads.redexgen.X.C0370Fd.A08;
        r10[1] = "SK7qwpqeD";
        r10[5] = "H8yQ2FZGH97VM0iLZGupvWVfM60nEcr";
        r9 = r11[r1.A05];
     */
    /* JADX WARN: Code restructure failed: missing block: B:67:0x0249, code lost:
        r14 = r11.A04.get(r1.A00);
     */
    /* JADX WARN: Code restructure failed: missing block: B:68:0x0253, code lost:
        if (r14 != null) goto L40;
     */
    /* JADX WARN: Code restructure failed: missing block: B:71:0x028c, code lost:
        if (r14 == null) goto L33;
     */
    /* JADX WARN: Code restructure failed: missing block: B:76:0x0298, code lost:
        return r7;
     */
    /* JADX WARN: Failed to parse debug info
    java.lang.ArrayIndexOutOfBoundsException: Index 28 out of bounds for length 23
    	at jadx.plugins.input.dex.sections.debuginfo.DebugInfoParser.startVar(DebugInfoParser.java:203)
    	at jadx.plugins.input.dex.sections.debuginfo.DebugInfoParser.process(DebugInfoParser.java:125)
    	at jadx.plugins.input.dex.sections.DexCodeReader.getDebugInfo(DexCodeReader.java:118)
    	at jadx.core.dex.nodes.MethodNode.getDebugInfo(MethodNode.java:567)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.visit(DebugInfoAttachVisitor.java:39)
     */
    /* JADX WARN: Removed duplicated region for block: B:31:0x00e7  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x0257  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.util.List<com.facebook.ads.redexgen.X.FJ> A0I(byte[] r21, int r22) {
        /*
            Method dump skipped, instructions count: 671
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.ads.redexgen.X.C0370Fd.A0I(byte[], int):java.util.List");
    }

    static {
        A0A();
        A09 = new byte[]{0, 7, 8, 15};
        A0A = new byte[]{0, 119, -120, -1};
        A0B = new byte[]{0, 17, 34, 51, 68, 85, 102, 119, -120, -103, -86, -69, -52, -35, -18, -1};
    }

    public C0370Fd(int i, int i2) {
        this.A02.setStyle(Paint.Style.FILL_AND_STROKE);
        this.A02.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.SRC));
        this.A02.setPathEffect(null);
        this.A03 = new Paint();
        this.A03.setStyle(Paint.Style.FILL);
        this.A03.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.DST_OVER));
        this.A03.setPathEffect(null);
        this.A01 = new Canvas();
        this.A05 = new FW(719, 575, 0, 719, 0, 575);
        this.A04 = new FV(0, A0F(), A0G(), A0H());
        this.A06 = new C0369Fc(i, i2);
    }

    public static int A00(int i, int i2, int i3, int i4) {
        return (i << 24) | (i2 << 16) | (i3 << 8) | i4;
    }

    public static int A01(HU hu, int[] iArr, byte[] bArr, int i, int i2, Paint paint, Canvas canvas) {
        int i3 = i;
        boolean z = false;
        do {
            int i4 = 0;
            byte A04 = hu.A04(2);
            if (A04 != 0) {
                i4 = 1;
            } else {
                boolean A0F = hu.A0F();
                String[] strArr = A08;
                if (strArr[6].charAt(3) == strArr[3].charAt(3)) {
                    throw new RuntimeException();
                }
                String[] strArr2 = A08;
                strArr2[1] = "NWJ2j8DR8";
                strArr2[5] = "tuFwEgjWv5QsbV2rgY7O01mW2P3xd0b";
                if (A0F) {
                    i4 = hu.A04(3) + 3;
                    A04 = hu.A04(2);
                } else if (hu.A0F()) {
                    i4 = 1;
                    A04 = 0;
                } else {
                    int A042 = hu.A04(2);
                    if (A042 == 0) {
                        z = true;
                        A04 = 0;
                    } else if (A042 != 1) {
                        if (A042 == 2) {
                            i4 = hu.A04(4) + 12;
                            A04 = hu.A04(2);
                        } else if (A042 != 3) {
                            A04 = 0;
                        } else {
                            int A043 = hu.A04(8);
                            String[] strArr3 = A08;
                            if (strArr3[1].length() == strArr3[5].length()) {
                                String[] strArr4 = A08;
                                strArr4[1] = "EWrEb5ztJ";
                                strArr4[5] = "osfW1bR5YMm4TxT0YESgxQn9EHcmZGy";
                                i4 = A043 + 12;
                                A04 = hu.A04(2);
                            } else {
                                A08[7] = "aK1SAaExMssx18Id1roywrSfe1Et1yGa";
                                i4 = A043 + 29;
                                A04 = hu.A04(2);
                            }
                        }
                    } else {
                        i4 = 2;
                        A04 = 0;
                    }
                }
            }
            if (i4 != 0 && paint != null) {
                if (bArr != null) {
                    A04 = bArr[A04];
                }
                paint.setColor(iArr[A04]);
                canvas.drawRect(i3, i2, i3 + i4, i2 + 1, paint);
            }
            i3 += i4;
        } while (!z);
        return i3;
    }

    public static int A02(HU hu, int[] iArr, byte[] bArr, int i, int i2, Paint paint, Canvas canvas) {
        int i3 = i;
        boolean z = false;
        do {
            int i4 = 0;
            byte A04 = hu.A04(4);
            if (A04 != 0) {
                i4 = 1;
            } else if (!hu.A0F()) {
                int A042 = hu.A04(3);
                if (A042 != 0) {
                    i4 = A042 + 2;
                    A04 = 0;
                } else {
                    z = true;
                    A04 = 0;
                }
            } else if (!hu.A0F()) {
                i4 = hu.A04(2) + 4;
                A04 = hu.A04(4);
            } else {
                int A043 = hu.A04(2);
                if (A043 == 0) {
                    i4 = 1;
                    A04 = 0;
                } else if (A043 == 1) {
                    i4 = 2;
                    A04 = 0;
                } else if (A043 == 2) {
                    i4 = hu.A04(4) + 9;
                    A04 = hu.A04(4);
                } else if (A043 != 3) {
                    A04 = 0;
                } else {
                    i4 = hu.A04(8) + 25;
                    A04 = hu.A04(4);
                }
            }
            if (i4 != 0 && paint != null) {
                if (bArr != null) {
                    A04 = bArr[A04];
                }
                paint.setColor(iArr[A04]);
                canvas.drawRect(i3, i2, i3 + i4, i2 + 1, paint);
            }
            i3 += i4;
        } while (!z);
        return i3;
    }

    public static int A03(HU hu, int[] iArr, @Nullable byte[] bArr, int i, int i2, Paint paint, Canvas canvas) {
        int clutIndex;
        int i3 = i;
        boolean z = false;
        do {
            byte A04 = hu.A04(8);
            if (A04 != 0) {
                clutIndex = 1;
            } else if (!hu.A0F()) {
                clutIndex = hu.A04(7);
                if (clutIndex != 0) {
                    A04 = 0;
                } else {
                    z = true;
                    clutIndex = 0;
                    A04 = 0;
                }
            } else {
                clutIndex = hu.A04(7);
                A04 = hu.A04(8);
                String[] strArr = A08;
                if (strArr[4].charAt(19) != strArr[0].charAt(19)) {
                    throw new RuntimeException();
                }
                A08[7] = "oE62i0kU0YacGkvCLxgFzKdMfiudOn3o";
            }
            if (clutIndex != 0 && paint != null) {
                if (bArr != null) {
                    A04 = bArr[A04];
                }
                paint.setColor(iArr[A04]);
                canvas.drawRect(i3, i2, i3 + clutIndex, i2 + 1, paint);
            }
            i3 += clutIndex;
            String[] strArr2 = A08;
            if (strArr2[1].length() == strArr2[5].length()) {
                throw new RuntimeException();
            }
            String[] strArr3 = A08;
            strArr3[6] = "jmdilAXdKLha38CDbN17xGIpmuplWnFc";
            strArr3[3] = "1PNl1axnrexK2c7Nxi5CJrHaXY90XFpd";
        } while (!z);
        return i3;
    }

    public static FX A06(HU hu) {
        int A04 = hu.A04(16);
        hu.A08(4);
        int objectCodingMethod = hu.A04(2);
        boolean A0F = hu.A0F();
        hu.A08(1);
        byte[] topFieldData = null;
        byte[] bArr = null;
        if (objectCodingMethod == 1) {
            int numberOfCodes = hu.A04(8);
            hu.A08(numberOfCodes * 16);
        } else if (objectCodingMethod == 0) {
            int topFieldDataLength = hu.A04(16);
            int A042 = hu.A04(16);
            String[] strArr = A08;
            String str = strArr[4];
            String str2 = strArr[0];
            int objectId = str.charAt(19);
            if (objectId != str2.charAt(19)) {
                throw new RuntimeException();
            }
            A08[2] = "pcqe5F2CDJi5oBWvBkq2zbdYSROcg8Hm";
            if (topFieldDataLength > 0) {
                topFieldData = new byte[topFieldDataLength];
                hu.A0E(topFieldData, 0, topFieldDataLength);
            }
            if (A042 > 0) {
                bArr = new byte[A042];
                hu.A0E(bArr, 0, A042);
            } else {
                bArr = topFieldData;
            }
        }
        return new FX(A04, A0F, topFieldData, bArr);
    }

    public static FY A07(HU hu, int i) {
        int A04 = hu.A04(8);
        int A042 = hu.A04(4);
        int A043 = hu.A04(2);
        hu.A08(2);
        int i2 = i - 2;
        SparseArray sparseArray = new SparseArray();
        while (i2 > 0) {
            int remainingLength = hu.A04(8);
            hu.A08(8);
            int version = hu.A04(16);
            int timeoutSecs = hu.A04(16);
            i2 -= 6;
            sparseArray.put(remainingLength, new FZ(version, timeoutSecs));
        }
        return new FY(A04, A042, A043, sparseArray);
    }

    public static void A0B(FX fx, FV fv, int i, int i2, int i3, Paint paint, Canvas canvas) {
        int[] iArr;
        if (i == 3) {
            iArr = fv.A03;
        } else if (i == 2) {
            iArr = fv.A02;
        } else {
            iArr = fv.A01;
        }
        A0D(fx.A03, iArr, i, i2, i3, paint, canvas);
        A0D(fx.A02, iArr, i, i2, i3 + 1, paint, canvas);
    }

    public static void A0C(HU hu, C0369Fc c0369Fc) {
        int A04 = hu.A04(8);
        int A042 = hu.A04(16);
        int pageId = hu.A04(16);
        int dataFieldLimit = hu.A02() + pageId;
        int dataFieldLength = pageId * 8;
        int segmentType = hu.A01();
        if (dataFieldLength > segmentType) {
            Log.w(A09(31, 9, 98), A09(0, 31, 5));
            int segmentType2 = hu.A01();
            hu.A08(segmentType2);
            return;
        }
        switch (A04) {
            case 16:
                int segmentType3 = c0369Fc.A03;
                if (A042 == segmentType3) {
                    FY fy = c0369Fc.A01;
                    FY A072 = A07(hu, pageId);
                    int segmentType4 = A072.A00;
                    if (segmentType4 != 0) {
                        c0369Fc.A01 = A072;
                        c0369Fc.A08.clear();
                        c0369Fc.A06.clear();
                        c0369Fc.A07.clear();
                        break;
                    } else if (fy != null) {
                        int dataFieldLength2 = fy.A02;
                        int segmentType5 = A072.A02;
                        if (dataFieldLength2 != segmentType5) {
                            c0369Fc.A01 = A072;
                            break;
                        }
                    }
                }
                break;
            case 17:
                FY fy2 = c0369Fc.A01;
                int segmentType6 = c0369Fc.A03;
                if (A042 == segmentType6 && fy2 != null) {
                    C0367Fa A082 = A08(hu, pageId);
                    int segmentType7 = fy2.A00;
                    if (segmentType7 == 0) {
                        SparseArray<C0367Fa> sparseArray = c0369Fc.A08;
                        int segmentType8 = A082.A03;
                        A082.A00(sparseArray.get(segmentType8));
                    }
                    SparseArray<C0367Fa> sparseArray2 = c0369Fc.A08;
                    int segmentType9 = A082.A03;
                    sparseArray2.put(segmentType9, A082);
                    break;
                }
                break;
            case 18:
                int segmentType10 = c0369Fc.A03;
                if (A042 == segmentType10) {
                    FV A043 = A04(hu, pageId);
                    SparseArray<FV> sparseArray3 = c0369Fc.A06;
                    int segmentType11 = A043.A00;
                    sparseArray3.put(segmentType11, A043);
                    break;
                } else {
                    int segmentType12 = c0369Fc.A02;
                    if (A042 == segmentType12) {
                        FV A044 = A04(hu, pageId);
                        SparseArray<FV> sparseArray4 = c0369Fc.A04;
                        int segmentType13 = A044.A00;
                        sparseArray4.put(segmentType13, A044);
                        break;
                    }
                }
                break;
            case 19:
                int segmentType14 = c0369Fc.A03;
                if (A042 == segmentType14) {
                    FX A06 = A06(hu);
                    SparseArray<FX> sparseArray5 = c0369Fc.A07;
                    int segmentType15 = A06.A00;
                    sparseArray5.put(segmentType15, A06);
                    break;
                } else {
                    int segmentType16 = c0369Fc.A02;
                    if (A042 == segmentType16) {
                        FX A062 = A06(hu);
                        SparseArray<FX> sparseArray6 = c0369Fc.A05;
                        int segmentType17 = A062.A00;
                        sparseArray6.put(segmentType17, A062);
                        break;
                    }
                }
                break;
            case 20:
                int segmentType18 = c0369Fc.A03;
                if (A042 == segmentType18) {
                    c0369Fc.A00 = A05(hu);
                    break;
                }
                break;
        }
        int segmentType19 = hu.A02();
        hu.A09(dataFieldLimit - segmentType19);
    }

    public static void A0D(byte[] bArr, int[] iArr, int i, int i2, int i3, Paint paint, Canvas canvas) {
        byte[] bArr2;
        byte[] bArr3;
        int column = i3;
        HU hu = new HU(bArr);
        byte[] bArr4 = null;
        byte[] bArr5 = null;
        int i4 = i2;
        while (hu.A01() != 0) {
            int A04 = hu.A04(8);
            if (A04 != 240) {
                switch (A04) {
                    case 16:
                        if (i == 3) {
                            bArr3 = bArr5 == null ? A0A : bArr5;
                        } else if (i == 2) {
                            bArr3 = bArr4 == null ? A09 : bArr4;
                        } else {
                            bArr3 = null;
                        }
                        i4 = A01(hu, iArr, bArr3, i4, column, paint, canvas);
                        hu.A05();
                        continue;
                    case 17:
                        if (i == 3) {
                            bArr2 = 0 == 0 ? A0B : null;
                        } else {
                            bArr2 = null;
                            String[] strArr = A08;
                            if (strArr[4].charAt(19) != strArr[0].charAt(19)) {
                                throw new RuntimeException();
                            }
                            A08[2] = "ywEr7H1ZkU3fUIk8F5vLu65dTGZjfu1h";
                        }
                        i4 = A02(hu, iArr, bArr2, i4, column, paint, canvas);
                        hu.A05();
                        continue;
                    case 18:
                        i4 = A03(hu, iArr, null, i4, column, paint, canvas);
                        continue;
                    default:
                        String[] strArr2 = A08;
                        if (strArr2[1].length() == strArr2[5].length()) {
                            throw new RuntimeException();
                        }
                        String[] strArr3 = A08;
                        strArr3[6] = "nnJuFIsGV5CjoI7UJHQ2Bk6wbONoIcvD";
                        strArr3[3] = "B7N9QxouVzPbBX96zhiMkNdTz6ghfWa9";
                        switch (A04) {
                            case 32:
                                bArr4 = A0E(4, 4, hu);
                                continue;
                            case 33:
                                bArr5 = A0E(4, 8, hu);
                                continue;
                            case 34:
                                bArr5 = A0E(16, 8, hu);
                                continue;
                            default:
                                continue;
                        }
                }
            } else {
                i4 = i2;
                if (A08[2].charAt(23) != 'o') {
                    String[] strArr4 = A08;
                    strArr4[6] = "9tyozG4lbSXUGnB14yX0PwlmOZMu8mKn";
                    strArr4[3] = "zB65tdLGIFDHc3IIcHjCnZN0WwQ6SUlQ";
                    column += 2;
                } else {
                    column += 2;
                }
            }
        }
    }

    public static byte[] A0E(int i, int i2, HU hu) {
        byte[] bArr = new byte[i];
        for (int i3 = 0; i3 < i; i3++) {
            bArr[i3] = (byte) hu.A04(i2);
        }
        return bArr;
    }

    public static int[] A0F() {
        return new int[]{0, -1, -16777216, -8421505};
    }

    public static int[] A0G() {
        int[] iArr = new int[16];
        iArr[0] = 0;
        for (int i = 1; i < iArr.length; i++) {
            if (i < 8) {
                int i2 = (i & 1) != 0 ? 255 : 0;
                iArr[i] = A00(255, i2, (i & 2) != 0 ? 255 : 0, (i & 4) != 0 ? 255 : 0);
            } else {
                int i3 = (i & 1) != 0 ? 127 : 0;
                iArr[i] = A00(255, i3, (i & 2) != 0 ? 127 : 0, (i & 4) == 0 ? 0 : 127);
            }
        }
        return iArr;
    }

    /* JADX WARN: Code restructure failed: missing block: B:100:0x0143, code lost:
        r0 = 170;
     */
    /* JADX WARN: Code restructure failed: missing block: B:108:0x015b, code lost:
        if (r9 != 0) goto L133;
     */
    /* JADX WARN: Code restructure failed: missing block: B:110:0x015e, code lost:
        r0 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:117:0x0183, code lost:
        if (r7 != 0) goto L91;
     */
    /* JADX WARN: Code restructure failed: missing block: B:118:0x0185, code lost:
        r2 = 85;
     */
    /* JADX WARN: Code restructure failed: missing block: B:141:0x01cc, code lost:
        if (r7 != 0) goto L91;
     */
    /* JADX WARN: Code restructure failed: missing block: B:143:0x01cf, code lost:
        r2 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:48:0x0093, code lost:
        if (r10 != 0) goto L48;
     */
    /* JADX WARN: Code restructure failed: missing block: B:49:0x0095, code lost:
        r5[r4] = A00(255, r9, r3, r8 + r6);
     */
    /* JADX WARN: Code restructure failed: missing block: B:51:0x00a9, code lost:
        if (r10 != 0) goto L48;
     */
    /* JADX WARN: Code restructure failed: missing block: B:53:0x00ac, code lost:
        r6 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:65:0x00dc, code lost:
        if ((r4 & 16) != 0) goto L66;
     */
    /* JADX WARN: Code restructure failed: missing block: B:66:0x00de, code lost:
        r0 = 85;
     */
    /* JADX WARN: Code restructure failed: missing block: B:83:0x010b, code lost:
        if ((r4 & 16) != 0) goto L66;
     */
    /* JADX WARN: Code restructure failed: missing block: B:85:0x010e, code lost:
        r0 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:99:0x0141, code lost:
        if (r9 != 0) goto L133;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static int[] A0H() {
        /*
            Method dump skipped, instructions count: 477
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.ads.redexgen.X.C0370Fd.A0H():int[]");
    }

    public final void A0J() {
        this.A06.A00();
    }
}
