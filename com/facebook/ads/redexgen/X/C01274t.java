package com.facebook.ads.redexgen.X;

import androidx.annotation.Nullable;
import androidx.annotation.VisibleForTesting;
import java.util.Arrays;
/* renamed from: com.facebook.ads.redexgen.X.4t  reason: invalid class name and case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public final class C01274t {
    public static byte[] A02;
    public static String[] A03 = {"WXpxlTya5H7kpLIT7UUfzIgXOYds4Vfk", "JVDNa5tAOP", "C1CZfaM4quGDjTOWU4x6KBGTC5pPu33J", "VymAVHyd", "K8p7KG0zsDoAf7GmBTiUCUpdPzk9iS4o", "MydLOSuorekD0WEADrXIrTB2aFx1Ufvf", "1zIVUT6Fxq52O6VZbnoN9TsXnO1jN3fj", "z9Q03TMU5lxkReREt3I6AE4mCa6N3G46"};
    @VisibleForTesting
    public final Y3<AbstractC01194l, C01254r> A00 = new Y3<>();
    @VisibleForTesting
    public final C2X<AbstractC01194l> A01 = new C2X<>();

    public static String A01(int i, int i2, int i3) {
        byte[] copyOfRange = Arrays.copyOfRange(A02, i, i + i2);
        for (int i4 = 0; i4 < copyOfRange.length; i4++) {
            copyOfRange[i4] = (byte) ((copyOfRange[i4] - i3) - 71);
        }
        return new String(copyOfRange);
    }

    public static void A02() {
        A02 = new byte[]{-99, -59, -61, -60, 112, -64, -62, -65, -58, -71, -76, -75, 112, -74, -68, -79, -73, 112, -96, -94, -107, 112, -65, -62, 112, -96, -97, -93, -92};
    }

    static {
        A02();
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x0041, code lost:
        if (r5 != 0) goto L12;
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x0043, code lost:
        r0 = r9 ^ (-1);
        r3.A00 &= r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x004b, code lost:
        if (r9 != 4) goto L23;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x004d, code lost:
        r5 = r3.A02;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x004f, code lost:
        r6 = r3.A00;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x005e, code lost:
        if (com.facebook.ads.redexgen.X.C01274t.A03[5].charAt(20) == 'R') goto L21;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x0060, code lost:
        r2 = com.facebook.ads.redexgen.X.C01274t.A03;
        r2[0] = "LDlhycQGZBtlD6IMRSONBH11SqKxQWfy";
        r2[6] = "DCgYh9gvbnrpKHe96mnmPCff01xTtOfJ";
        r0 = r6 & 12;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x006e, code lost:
        if (r0 != 0) goto L20;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x0070, code lost:
        r7.A00.A0A(r4);
        com.facebook.ads.redexgen.X.C01254r.A02(r3);
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x0078, code lost:
        return r5;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x0079, code lost:
        r2 = com.facebook.ads.redexgen.X.C01274t.A03;
        r2[7] = "9mfdPnfY5V3FVy8Q2gQ6uDsmmOIXndsz";
        r2[2] = "ekMjHGebRREBiMI4gT56rHDvbCCByAvd";
        r0 = r6 & 12;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x0087, code lost:
        if (r0 != 0) goto L20;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x008a, code lost:
        r2 = com.facebook.ads.redexgen.X.C01274t.A03;
        r1 = r2[7];
        r2 = r2[2];
        r1 = r1.charAt(19);
        r0 = r2.charAt(19);
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x009e, code lost:
        if (r1 == r0) goto L27;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x00a5, code lost:
        throw new java.lang.RuntimeException();
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x00a6, code lost:
        r2 = com.facebook.ads.redexgen.X.C01274t.A03;
        r2[1] = "AZoo0ocwP6";
        r2[3] = "Mxzo3dXJ";
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x00b2, code lost:
        if (r9 != 8) goto L30;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x00b4, code lost:
        r5 = r3.A01;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x00c3, code lost:
        if (r5 != 0) goto L12;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x00d5, code lost:
        throw new java.lang.IllegalArgumentException(A01(0, 29, 9));
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private com.facebook.ads.redexgen.X.C4O A00(com.facebook.ads.redexgen.X.AbstractC01194l r8, int r9) {
        /*
            Method dump skipped, instructions count: 221
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.ads.redexgen.X.C01274t.A00(com.facebook.ads.redexgen.X.4l, int):com.facebook.ads.redexgen.X.4O");
    }

    @Nullable
    public final C4O A03(AbstractC01194l abstractC01194l) {
        return A00(abstractC01194l, 8);
    }

    @Nullable
    public final C4O A04(AbstractC01194l abstractC01194l) {
        return A00(abstractC01194l, 4);
    }

    public final AbstractC01194l A05(long j) {
        return this.A01.A08(j);
    }

    public final void A06() {
        this.A00.clear();
        this.A01.A09();
    }

    public final void A07() {
        C01254r.A01();
    }

    public final void A08(long j, AbstractC01194l abstractC01194l) {
        this.A01.A0B(j, abstractC01194l);
    }

    public final void A09(AbstractC01194l abstractC01194l) {
        C01254r c01254r = this.A00.get(abstractC01194l);
        if (c01254r == null) {
            c01254r = C01254r.A00();
            this.A00.put(abstractC01194l, c01254r);
        }
        c01254r.A00 |= 1;
    }

    public final void A0A(AbstractC01194l abstractC01194l) {
        C01254r c01254r = this.A00.get(abstractC01194l);
        if (c01254r == null) {
            return;
        }
        c01254r.A00 &= -2;
    }

    public final void A0B(AbstractC01194l abstractC01194l) {
        int A06 = this.A01.A06() - 1;
        while (true) {
            if (A06 < 0) {
                break;
            } else if (abstractC01194l == this.A01.A07(A06)) {
                this.A01.A0A(A06);
                break;
            } else {
                A06--;
            }
        }
        C01254r info = this.A00.remove(abstractC01194l);
        if (info != null) {
            C01254r.A02(info);
        }
    }

    public final void A0C(AbstractC01194l abstractC01194l) {
        A0A(abstractC01194l);
    }

    public final void A0D(AbstractC01194l abstractC01194l, C4O c4o) {
        C01254r c01254r = this.A00.get(abstractC01194l);
        if (c01254r == null) {
            c01254r = C01254r.A00();
            this.A00.put(abstractC01194l, c01254r);
        }
        c01254r.A00 |= 2;
        c01254r.A02 = c4o;
    }

    public final void A0E(AbstractC01194l abstractC01194l, C4O c4o) {
        C01254r c01254r = this.A00.get(abstractC01194l);
        if (c01254r == null) {
            c01254r = C01254r.A00();
            this.A00.put(abstractC01194l, c01254r);
        }
        c01254r.A01 = c4o;
        c01254r.A00 |= 8;
    }

    public final void A0F(AbstractC01194l abstractC01194l, C4O c4o) {
        C01254r c01254r = this.A00.get(abstractC01194l);
        if (c01254r == null) {
            c01254r = C01254r.A00();
            this.A00.put(abstractC01194l, c01254r);
        }
        c01254r.A02 = c4o;
        c01254r.A00 |= 4;
    }

    public final void A0G(InterfaceC01264s interfaceC01264s) {
        for (int size = this.A00.size() - 1; size >= 0; size--) {
            AbstractC01194l A09 = this.A00.A09(size);
            C01254r record = this.A00.A0A(size);
            if ((record.A00 & 3) == 3) {
                interfaceC01264s.AF8(A09);
            } else {
                int index = record.A00;
                if ((index & 1) != 0) {
                    if (record.A02 == null) {
                        interfaceC01264s.AF8(A09);
                    } else {
                        C4O c4o = record.A02;
                        C4O c4o2 = record.A01;
                        if (A03[5].charAt(20) == 'R') {
                            throw new RuntimeException();
                        }
                        String[] strArr = A03;
                        strArr[1] = "fJVAe19tdP";
                        strArr[3] = "3fJsXDGb";
                        interfaceC01264s.ADG(A09, c4o, c4o2);
                    }
                } else if ((record.A00 & 14) == 14) {
                    interfaceC01264s.ADE(A09, record.A02, record.A01);
                } else if ((record.A00 & 12) == 12) {
                    interfaceC01264s.ADI(A09, record.A02, record.A01);
                } else {
                    int index2 = record.A00;
                    if ((index2 & 4) != 0) {
                        interfaceC01264s.ADG(A09, record.A02, null);
                    } else {
                        int index3 = record.A00;
                        if ((index3 & 8) != 0) {
                            interfaceC01264s.ADE(A09, record.A02, record.A01);
                        }
                    }
                }
            }
            C01254r.A02(record);
        }
    }

    public final boolean A0H(AbstractC01194l abstractC01194l) {
        C01254r record = this.A00.get(abstractC01194l);
        return (record == null || (record.A00 & 1) == 0) ? false : true;
    }

    public final boolean A0I(AbstractC01194l abstractC01194l) {
        C01254r record = this.A00.get(abstractC01194l);
        return (record == null || (record.A00 & 4) == 0) ? false : true;
    }
}
