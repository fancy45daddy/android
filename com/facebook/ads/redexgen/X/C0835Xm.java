package com.facebook.ads.redexgen.X;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
/* renamed from: com.facebook.ads.redexgen.X.Xm  reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public final class C0835Xm implements C4B {
    public static byte[] A08;
    public static String[] A09 = {"X1JWoRd1RTsi5LXg3YfkE890Z0SkAp6s", "8cHG76lMVFwKxBGRg2kgut24eHhxfbd", "G9TzZa55JFGh4eGgvGtqHGY1m3qrW6LM", "T7A4lgHZzGr7V1uQcw7LfDSO4lerGRH7", "wT7nveBXif1G6UL4LkiEJi9kfhK", "XR1Jqmc9zxsTs7lfyBsyi3NvUHLKhP3K", "pVA6ZWYUVwE4UScIoRBBosOqE3FsfWwK", "nWmw"};
    public int A00;
    public InterfaceC00632e<C00973o> A01;
    public final InterfaceC00963n A02;
    public final C4C A03;
    public final Runnable A04;
    public final ArrayList<C00973o> A05;
    public final ArrayList<C00973o> A06;
    public final boolean A07;

    public static String A02(int i, int i2, int i3) {
        byte[] copyOfRange = Arrays.copyOfRange(A08, i, i + i2);
        for (int i4 = 0; i4 < copyOfRange.length; i4++) {
            copyOfRange[i4] = (byte) ((copyOfRange[i4] - i3) - 66);
        }
        return new String(copyOfRange);
    }

    public static void A03() {
        A08 = new byte[]{-100, -75, -78, -75, -74, -66, -75, 103, -68, -73, -85, -88, -69, -84, 103, -74, -73, 103, -69, -64, -73, -84, 103, -83, -74, -71, 103, -44, -45, -47, -34, -123, -41, -54, -46, -44, -37, -54, -123, -58, -45, -55, -123, -38, -43, -55, -58, -39, -54, -123, -44, -43, -40, -123, -56, -58, -45, -123, -57, -54, -123, -55, -50, -40, -43, -58, -39, -56, -51, -54, -55, -123, -50, -45, -123, -53, -50, -41, -40, -39, -123, -43, -58, -40, -40, -24, -23, -103, -20, -31, -24, -18, -27, -35, -103, -37, -34, -103, -21, -34, -26, -24, -17, -34, -103, -24, -21, -103, -18, -23, -35, -38, -19, -34, -89, 30, 19, 26, 32, 23, 15, -53, 25, 26, 31, -53, 15, 20, 30, 27, 12, 31, 14, 19, -53, 12, 15, 15, -53, 26, 29, -53, 24, 26, 33, 16, -53, 17, 26, 29, -53, 27, 29, 16, -53, 23, 12, 36, 26, 32, 31};
    }

    static {
        A03();
    }

    public C0835Xm(InterfaceC00963n interfaceC00963n) {
        this(interfaceC00963n, false);
    }

    public C0835Xm(InterfaceC00963n interfaceC00963n, boolean z) {
        this.A01 = new Y2(30);
        this.A05 = new ArrayList<>();
        this.A06 = new ArrayList<>();
        this.A00 = 0;
        this.A02 = interfaceC00963n;
        this.A07 = z;
        this.A03 = new C4C(this);
    }

    private int A00(int i, int i2) {
        int i3;
        int count;
        int count2 = this.A06.size();
        for (int i4 = count2 - 1; i4 >= 0; i4--) {
            C00973o c00973o = this.A06.get(i4);
            int count3 = c00973o.A00;
            if (count3 == 8) {
                int i5 = c00973o.A02;
                int count4 = c00973o.A01;
                if (i5 < count4) {
                    i3 = c00973o.A02;
                    count = c00973o.A01;
                } else {
                    i3 = c00973o.A01;
                    count = c00973o.A02;
                }
                if (i >= i3 && i <= count) {
                    int count5 = c00973o.A02;
                    if (i3 == count5) {
                        if (i2 == 1) {
                            int count6 = c00973o.A01;
                            c00973o.A01 = count6 + 1;
                        } else if (i2 == 2) {
                            int count7 = c00973o.A01;
                            c00973o.A01 = count7 - 1;
                        }
                        i++;
                    } else {
                        if (i2 == 1) {
                            int count8 = c00973o.A02;
                            c00973o.A02 = count8 + 1;
                        } else if (i2 == 2) {
                            int count9 = c00973o.A02;
                            c00973o.A02 = count9 - 1;
                        }
                        i--;
                    }
                } else {
                    int count10 = c00973o.A02;
                    if (i < count10) {
                        if (i2 == 1) {
                            int count11 = c00973o.A02;
                            c00973o.A02 = count11 + 1;
                            int count12 = c00973o.A01;
                            c00973o.A01 = count12 + 1;
                        } else if (i2 == 2) {
                            int count13 = c00973o.A02;
                            c00973o.A02 = count13 - 1;
                            int count14 = c00973o.A01;
                            c00973o.A01 = count14 - 1;
                        }
                    }
                }
            } else {
                int count15 = c00973o.A02;
                if (count15 <= i) {
                    int count16 = c00973o.A00;
                    if (count16 == 1) {
                        int i6 = c00973o.A01;
                        int i7 = A09[7].length();
                        if (i7 != 4) {
                            throw new RuntimeException();
                        }
                        A09[7] = "N0sU";
                        i -= i6;
                    } else {
                        int count17 = c00973o.A00;
                        if (count17 == 2) {
                            int count18 = c00973o.A01;
                            i += count18;
                        }
                    }
                } else if (i2 == 1) {
                    int count19 = c00973o.A02;
                    c00973o.A02 = count19 + 1;
                } else if (i2 == 2) {
                    int count20 = c00973o.A02;
                    c00973o.A02 = count20 - 1;
                }
            }
        }
        for (int size = this.A06.size() - 1; size >= 0; size--) {
            C00973o c00973o2 = this.A06.get(size);
            int count21 = c00973o2.A00;
            if (count21 == 8) {
                int i8 = c00973o2.A01;
                int count22 = c00973o2.A02;
                if (i8 != count22) {
                    int count23 = c00973o2.A01;
                    if (count23 >= 0) {
                    }
                }
                this.A06.remove(size);
                ADa(c00973o2);
            } else {
                int count24 = c00973o2.A01;
                if (count24 <= 0) {
                    this.A06.remove(size);
                    ADa(c00973o2);
                }
            }
        }
        return i;
    }

    private final int A01(int i, int i2) {
        int size = this.A06.size();
        while (i2 < size) {
            C00973o c00973o = this.A06.get(i2);
            int i3 = c00973o.A00;
            if (i3 == 8) {
                int count = c00973o.A02;
                if (count == i) {
                    i = c00973o.A01;
                } else {
                    int count2 = c00973o.A02;
                    if (count2 < i) {
                        i--;
                    }
                    int count3 = c00973o.A01;
                    if (count3 <= i) {
                        i++;
                    }
                }
            } else {
                int count4 = c00973o.A02;
                if (count4 <= i) {
                    int i4 = c00973o.A00;
                    if (i4 == 2) {
                        int i5 = c00973o.A02;
                        int count5 = c00973o.A01;
                        if (i < i5 + count5) {
                            return -1;
                        }
                        int count6 = c00973o.A01;
                        i -= count6;
                    } else {
                        int i6 = c00973o.A00;
                        String[] strArr = A09;
                        String str = strArr[6];
                        String str2 = strArr[5];
                        int i7 = str.charAt(31);
                        int count7 = str2.charAt(31);
                        if (i7 != count7) {
                            throw new RuntimeException();
                        }
                        A09[1] = "6d2Cvy1MfGwOem3AHh21iiz4RwVuOhP";
                        if (i6 == 1) {
                            int count8 = c00973o.A01;
                            i += count8;
                        }
                    }
                } else {
                    continue;
                }
            }
            i2++;
        }
        return i;
    }

    private void A04(C00973o c00973o) {
        A09(c00973o);
    }

    private void A05(C00973o c00973o) {
        A09(c00973o);
    }

    private void A06(C00973o c00973o) {
        int i = c00973o.A02;
        int i2 = 0;
        int i3 = c00973o.A02;
        int tmpStart = c00973o.A01;
        int i4 = i3 + tmpStart;
        char c = 65535;
        int i5 = c00973o.A02;
        while (i5 < i4) {
            int tmpEnd = 0;
            if (this.A02.A5O(i5) != null || A0C(i5)) {
                if (c == 0) {
                    A08(A9h(2, i, i2, null));
                    tmpEnd = 1;
                }
                c = 1;
            } else {
                if (c == 1) {
                    A09(A9h(2, i, i2, null));
                    tmpEnd = 1;
                }
                c = 0;
            }
            if (tmpEnd != 0) {
                i5 -= i2;
                i4 -= i2;
                i2 = 1;
            } else {
                i2++;
            }
            i5++;
        }
        int tmpStart2 = c00973o.A01;
        if (i2 != tmpStart2) {
            ADa(c00973o);
            c00973o = A9h(2, i, i2, null);
        }
        if (c == 0) {
            A08(c00973o);
        } else {
            A09(c00973o);
        }
    }

    private void A07(C00973o c00973o) {
        int i = c00973o.A02;
        int i2 = 0;
        int i3 = c00973o.A02;
        int tmpStart = c00973o.A01;
        int position = i3 + tmpStart;
        char c = 65535;
        int type = c00973o.A02;
        while (true) {
            String[] strArr = A09;
            String str = strArr[6];
            String str2 = strArr[5];
            int tmpCount = str.charAt(31);
            int tmpStart2 = str2.charAt(31);
            if (tmpCount != tmpStart2) {
                throw new RuntimeException();
            }
            A09[0] = "QVMb2fRXyzWHiAZPpRD1aZXDVthvAAWC";
            if (type < position) {
                if (this.A02.A5O(type) != null || A0C(type)) {
                    if (c == 0) {
                        A08(A9h(4, i, i2, c00973o.A03));
                        i2 = 0;
                        i = type;
                    }
                    c = 1;
                } else {
                    if (c == 1) {
                        A09(A9h(4, i, i2, c00973o.A03));
                        i2 = 0;
                        i = type;
                    }
                    c = 0;
                }
                i2++;
                type++;
            } else {
                int tmpStart3 = c00973o.A01;
                if (i2 != tmpStart3) {
                    Object obj = c00973o.A03;
                    ADa(c00973o);
                    c00973o = A9h(4, i, i2, obj);
                }
                if (c == 0) {
                    A08(c00973o);
                    return;
                } else {
                    A09(c00973o);
                    return;
                }
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x0056  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x005a  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x005f  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0099  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private void A08(com.facebook.ads.redexgen.X.C00973o r12) {
        /*
            Method dump skipped, instructions count: 243
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.ads.redexgen.X.C0835Xm.A08(com.facebook.ads.redexgen.X.3o):void");
    }

    private void A09(C00973o c00973o) {
        this.A06.add(c00973o);
        int i = c00973o.A00;
        if (i == 1) {
            this.A02.A9i(c00973o.A02, c00973o.A01);
        } else if (i == 2) {
            this.A02.A9l(c00973o.A02, c00973o.A01);
        } else if (i == 4) {
            this.A02.A9O(c00973o.A02, c00973o.A01, c00973o.A03);
        } else if (i == 8) {
            this.A02.A9j(c00973o.A02, c00973o.A01);
        } else {
            throw new IllegalArgumentException(A02(0, 27, 5) + c00973o);
        }
    }

    private final void A0A(C00973o c00973o, int i) {
        this.A02.AAP(c00973o);
        int i2 = c00973o.A00;
        if (i2 == 2) {
            this.A02.A9k(i, c00973o.A01);
        } else if (i2 == 4) {
            this.A02.A9O(i, c00973o.A01, c00973o.A03);
        } else {
            throw new IllegalArgumentException(A02(27, 58, 35));
        }
    }

    private final void A0B(List<C00973o> list) {
        int size = list.size();
        for (int i = 0; i < size; i++) {
            ADa(list.get(i));
        }
        list.clear();
    }

    private boolean A0C(int i) {
        int size = this.A06.size();
        for (int pos = 0; pos < size; pos++) {
            C00973o c00973o = this.A06.get(pos);
            int i2 = c00973o.A00;
            if (i2 == 8) {
                int i3 = c00973o.A01;
                int count = pos + 1;
                if (A01(i3, count) == i) {
                    return true;
                }
            } else {
                int i4 = c00973o.A00;
                int i5 = A09[4].length();
                if (i5 != 28) {
                    A09[7] = "h3FT";
                    if (i4 == 1) {
                        int i6 = c00973o.A02;
                        int count2 = c00973o.A01;
                        int i7 = i6 + count2;
                        for (int i8 = c00973o.A02; i8 < i7; i8++) {
                            int count3 = pos + 1;
                            if (A01(i8, count3) == i) {
                                return true;
                            }
                        }
                        continue;
                    } else {
                        continue;
                    }
                } else {
                    throw new RuntimeException();
                }
            }
        }
        return false;
    }

    public final int A0D(int i) {
        return A01(i, 0);
    }

    public final int A0E(int i) {
        int size = this.A05.size();
        for (int i2 = 0; i2 < size; i2++) {
            C00973o c00973o = this.A05.get(i2);
            int i3 = c00973o.A00;
            if (i3 == 1) {
                int size2 = c00973o.A02;
                if (size2 <= i) {
                    int size3 = c00973o.A01;
                    i += size3;
                }
            } else if (i3 == 2) {
                int size4 = c00973o.A02;
                if (size4 <= i) {
                    int i4 = c00973o.A02;
                    int size5 = c00973o.A01;
                    if (i4 + size5 > i) {
                        return -1;
                    }
                    int size6 = c00973o.A01;
                    i -= size6;
                } else {
                    continue;
                }
            } else if (i3 == 8) {
                int size7 = c00973o.A02;
                if (size7 == i) {
                    i = c00973o.A01;
                } else {
                    int size8 = c00973o.A02;
                    if (size8 < i) {
                        i--;
                    }
                    int size9 = c00973o.A01;
                    if (size9 <= i) {
                        i++;
                    }
                }
            }
        }
        return i;
    }

    public final void A0F() {
        int size = this.A06.size();
        for (int i = 0; i < size; i++) {
            this.A02.AAR(this.A06.get(i));
        }
        A0B(this.A06);
        this.A00 = 0;
    }

    public final void A0G() {
        A0F();
        int size = this.A05.size();
        for (int i = 0; i < size; i++) {
            C00973o c00973o = this.A05.get(i);
            int i2 = c00973o.A00;
            if (i2 == 1) {
                this.A02.AAR(c00973o);
                InterfaceC00963n interfaceC00963n = this.A02;
                int i3 = c00973o.A02;
                int count = c00973o.A01;
                interfaceC00963n.A9i(i3, count);
            } else if (i2 == 2) {
                this.A02.AAR(c00973o);
                InterfaceC00963n interfaceC00963n2 = this.A02;
                int i4 = c00973o.A02;
                int i5 = c00973o.A01;
                if (A09[0].charAt(28) != 65) {
                    A09[0] = "CM7MK7KhSxDopOj0YrHNMoPSB3hYAvlM";
                    interfaceC00963n2.A9k(i4, i5);
                } else {
                    A09[0] = "0a4GBd0juwjU6ZOPGBL8pgIRsQZTAwEC";
                    interfaceC00963n2.A9k(i4, i5);
                }
            } else if (i2 == 4) {
                this.A02.AAR(c00973o);
                InterfaceC00963n interfaceC00963n3 = this.A02;
                int i6 = c00973o.A02;
                int i7 = c00973o.A01;
                if (A09[0].charAt(28) != 65) {
                    throw new RuntimeException();
                }
                A09[1] = "6Qpi3zwbHCTXm3nhA4JhLro11ECL3LU";
                interfaceC00963n3.A9O(i6, i7, c00973o.A03);
            } else if (i2 == 8) {
                this.A02.AAR(c00973o);
                InterfaceC00963n interfaceC00963n4 = this.A02;
                int i8 = c00973o.A02;
                int count2 = c00973o.A01;
                interfaceC00963n4.A9j(i8, count2);
            }
            Runnable runnable = this.A04;
            if (runnable != null) {
                runnable.run();
            }
        }
        A0B(this.A05);
        this.A00 = 0;
    }

    public final void A0H() {
        this.A03.A05(this.A05);
        int size = this.A05.size();
        for (int i = 0; i < size; i++) {
            C00973o c00973o = this.A05.get(i);
            int i2 = c00973o.A00;
            String[] strArr = A09;
            String str = strArr[6];
            String str2 = strArr[5];
            int i3 = str.charAt(31);
            int count = str2.charAt(31);
            if (i3 != count) {
                throw new RuntimeException();
            }
            A09[1] = "1BDdKJQJlsgxETOK14Gjs1hC7fjbuKK";
            if (i2 == 1) {
                A04(c00973o);
            } else if (i2 == 2) {
                A06(c00973o);
            } else if (i2 == 4) {
                A07(c00973o);
            } else if (i2 == 8) {
                A05(c00973o);
            }
            Runnable runnable = this.A04;
            if (runnable != null) {
                runnable.run();
            }
        }
        this.A05.clear();
    }

    public final void A0I() {
        A0B(this.A05);
        A0B(this.A06);
        this.A00 = 0;
    }

    public final boolean A0J() {
        return this.A05.size() > 0;
    }

    public final boolean A0K() {
        return (this.A06.isEmpty() || this.A05.isEmpty()) ? false : true;
    }

    public final boolean A0L(int i) {
        return (this.A00 & i) != 0;
    }

    @Override // com.facebook.ads.redexgen.X.C4B
    public final C00973o A9h(int i, int i2, int i3, Object obj) {
        C00973o op = this.A01.A2O();
        if (op == null) {
            return new C00973o(i, i2, i3, obj);
        }
        op.A00 = i;
        op.A02 = i2;
        op.A01 = i3;
        op.A03 = obj;
        return op;
    }

    @Override // com.facebook.ads.redexgen.X.C4B
    public final void ADa(C00973o c00973o) {
        if (!this.A07) {
            c00973o.A03 = null;
            this.A01.ADi(c00973o);
        }
    }
}
