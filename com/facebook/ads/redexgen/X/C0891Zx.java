package com.facebook.ads.redexgen.X;

import android.graphics.Rect;
import android.view.View;
import androidx.annotation.Nullable;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
/* renamed from: com.facebook.ads.redexgen.X.Zx  reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public final class C0891Zx {
    @Nullable
    public InterfaceC0894a0 A00;
    @Nullable
    public InterfaceC0892Zy A01;
    public C0879Zl A02;
    public final InterfaceC0901a7 A03;
    @Nullable
    public final InterfaceC0893Zz A04;

    public C0891Zx(InterfaceC0901a7 interfaceC0901a7, @Nullable InterfaceC0893Zz interfaceC0893Zz) {
        this.A03 = interfaceC0901a7;
        this.A04 = interfaceC0893Zz;
    }

    public static C0891Zx A00() {
        return new C0891Zx(new FB(), null);
    }

    private void A01(AbstractC0895a1 abstractC0895a1, InterfaceC0899a5 interfaceC0899a5, F9 f9) {
        this.A02 = C0879Zl.A00(abstractC0895a1, interfaceC0899a5, f9);
        InterfaceC0894a0 interfaceC0894a0 = this.A00;
        if (interfaceC0894a0 != null) {
            this.A02.A03(interfaceC0894a0);
        }
        InterfaceC0892Zy interfaceC0892Zy = this.A01;
        if (interfaceC0892Zy != null) {
            this.A02.A04(interfaceC0892Zy);
        }
    }

    public final void A02(View view) {
        this.A02.A01(view);
    }

    public final void A03(View view, C0897a3 c0897a3) {
        this.A02.A02(view, c0897a3);
    }

    public final void A04(AbstractC0895a1 abstractC0895a1, View view) {
        FA fa = new FA(view, this.A03);
        final InterfaceC0893Zz interfaceC0893Zz = this.A04;
        A01(abstractC0895a1, fa, new F9(interfaceC0893Zz) { // from class: com.facebook.ads.redexgen.X.3g
            public static byte[] A08;
            public static String[] A09 = {"okBgSYhQGmV0QyU32992deBLR6XrdaZQ", "E", "ZDdZ5rthnspWTI3gzSJHBR7aYCyAxUsq", "EsXM2pc2I6J3hYC1V9OQRTCtALa8wmqB", "DKA0ex9266tXplnV6PUb8C0vdYHWYjG4", "tBgdKBpc94v7LWesC8aTGIaQqZdJYwjy", "iZindrm9v6DBRttH7DMzAa7", "d9237vu9oQoOcpvZwewcjFUDz74P7MIA"};
            public static final String A0A;
            public long A00;
            @Nullable
            public InterfaceC0894a0 A01;
            @Nullable
            public final InterfaceC0893Zz A02;
            public final Map<String, C0883Zp> A06 = new HashMap();
            public final C0884Zq A04 = new C0884Zq();
            public final C0884Zq A03 = new C0884Zq();
            public final List<Rect> A05 = new ArrayList(1);
            public final boolean A07 = false;

            public static String A02(int i, int i2, int i3) {
                byte[] copyOfRange = Arrays.copyOfRange(A08, i, i + i2);
                for (int i4 = 0; i4 < copyOfRange.length; i4++) {
                    copyOfRange[i4] = (byte) ((copyOfRange[i4] ^ i3) ^ 91);
                }
                return new String(copyOfRange);
            }

            public static void A03() {
                A08 = new byte[]{41, 21, 20, 14, 93, 11, 20, 24, 10, 13, 18, 20, 19, 9, 93, 21, 28, 14, 93, 19, 18, 9, 93, 31, 24, 24, 19, 93, 16, 24, 28, 14, 8, 15, 24, 25, 93, 18, 15, 93, 20, 14, 93, 28, 93, 26, 15, 18, 8, 13, 93, 10, 21, 20, 30, 21, 93, 10, 20, 17, 17, 93, 19, 24, 11, 24, 15, 93, 15, 24, 9, 8, 15, 19, 93, 28, 93, 16, 24, 28, 14, 8, 15, 24, 16, 24, 19, 9, 93, 14, 20, 19, 30, 24, 93, 20, 9, 90, 14, 93, 16, 28, 25, 24, 93, 8, 13, 93, 18, 27, 93, 14, 8, 31, 11, 20, 24, 10, 14, 93, 9, 21, 28, 9, 93, 30, 18, 8, 17, 25, 93, 31, 24, 93, 18, 27, 27, 14, 30, 15, 24, 24, 19, 118, 125, 111, 75, 123, 121, 118, 63, 36, 61, 61, 113, 39, 56, 52, 38, 113, 33, 35, 62, 33, 52, 35, 37, 40, 113, 55, 62, 35, 113, 35, 52, 60, 62, 39, 52, 53, 113, 56, 37, 52, 60, 113, 125, 97, 104, 122, 92, 107, 126, 97, 124, 122};
            }

            static {
                A03();
                A0A = C00893g.class.getSimpleName();
            }

            {
                this.A02 = interfaceC0893Zz;
            }

            public static Rect A00(@Nullable C0883Zp c0883Zp) {
                Rect rect;
                Rect rect2;
                Rect rect3;
                Rect rect4;
                Rect rect5;
                if (c0883Zp != null) {
                    rect = c0883Zp.A02;
                    if (rect.top != Integer.MIN_VALUE) {
                        rect2 = c0883Zp.A02;
                        if (rect2.left != Integer.MIN_VALUE) {
                            rect3 = c0883Zp.A02;
                            String[] strArr = A09;
                            if (strArr[1].length() == strArr[6].length()) {
                                throw new RuntimeException();
                            }
                            String[] strArr2 = A09;
                            strArr2[1] = "p";
                            strArr2[6] = "Kr6mbDoiLKwWSgNyXDF2oJW";
                            if (rect3.right != Integer.MIN_VALUE) {
                                rect4 = c0883Zp.A02;
                                if (rect4.bottom != Integer.MIN_VALUE) {
                                    rect5 = c0883Zp.A02;
                                    return rect5;
                                }
                            }
                        }
                    }
                }
                throw new IllegalStateException(A02(0, 143, 38));
            }

            private C0883Zp A01(C0897a3 c0897a3, Rect rect, Rect rect2) {
                boolean A06;
                Rect rect3;
                List list;
                C0883Zp c0883Zp = this.A06.get(c0897a3.A03);
                A06 = this.A04.A06(c0897a3);
                if (A06) {
                    if (c0883Zp != null) {
                        c0883Zp.A01 = EnumC0887Zt.A04;
                    } else {
                        c0883Zp = C0883Zp.A03(this.A00);
                        this.A06.put(c0897a3.A03, c0883Zp);
                    }
                }
                rect3 = c0883Zp.A02;
                rect3.set(rect2);
                list = c0883Zp.A03;
                list.add(new Rect(rect));
                return c0883Zp;
            }

            private void A04(C0884Zq c0884Zq) {
                Collection<C0897a3> A01;
                List list;
                A01 = c0884Zq.A01();
                for (C0897a3 c0897a3 : A01) {
                    C0883Zp c0883Zp = this.A06.get(c0897a3.A03);
                    if (c0883Zp == null) {
                        if (this.A02 != null) {
                            String str = A02(150, 36, 10) + c0897a3.A03;
                            throw new NullPointerException(A02(186, 10, 85));
                        }
                    } else {
                        c0883Zp.A01 = EnumC0887Zt.A03;
                        list = c0883Zp.A03;
                        list.clear();
                        c0897a3.A03(this);
                        if (this.A07) {
                            Map<String, C0883Zp> map = this.A06;
                            String[] strArr = A09;
                            if (strArr[0].charAt(8) == strArr[2].charAt(8)) {
                                throw new RuntimeException();
                            }
                            String[] strArr2 = A09;
                            strArr2[0] = "dCpYPRypiVOHB4OlkAqBqk8EySqTLE1k";
                            strArr2[2] = "r3sjB169HJX8vOmMpko73ANLsggTEmi2";
                            map.remove(c0883Zp);
                        } else {
                            continue;
                        }
                    }
                }
            }

            private void A05(C0884Zq c0884Zq) {
                Collection<C0897a3> A00;
                A00 = c0884Zq.A00();
                for (C0897a3 c0897a3 : A00) {
                    c0897a3.A03(this);
                }
            }

            @Override // com.facebook.ads.redexgen.X.F9
            public final void A3J(C0897a3 c0897a3, Rect rect, Rect rect2) {
                boolean A06;
                List list;
                Rect rect3;
                List list2;
                A01(c0897a3, rect, rect2);
                C0897a3 c0897a32 = c0897a3.A00;
                C0897a3 parentViewpointData = C0897a3.A06;
                if (c0897a32 == parentViewpointData) {
                    return;
                }
                A06 = this.A03.A06(c0897a32);
                C0883Zp parentViewProperties = this.A06.get(c0897a32.A03);
                if (A06) {
                    if (parentViewProperties == null) {
                        parentViewProperties = C0883Zp.A03(this.A00);
                        rect3 = parentViewProperties.A02;
                        rect3.set(Integer.MIN_VALUE, Integer.MIN_VALUE, Integer.MIN_VALUE, Integer.MIN_VALUE);
                        this.A06.put(c0897a32.A03, parentViewProperties);
                    } else {
                        list2 = parentViewProperties.A03;
                        list2.clear();
                        parentViewProperties.A01 = EnumC0887Zt.A04;
                    }
                }
                list = parentViewProperties.A03;
                list.add(new Rect(rect));
            }

            @Override // com.facebook.ads.redexgen.X.F9
            public final void A3q(long j, List<Rect> viewportRects) {
                Collection<C0897a3> A01;
                Collection<C0897a3> A012;
                List list;
                this.A00 = j;
                this.A05.clear();
                for (Rect rect : viewportRects) {
                    this.A05.add(new Rect(rect));
                }
                A01 = this.A04.A01();
                for (C0897a3 c0897a3 : A01) {
                    this.A06.remove(c0897a3.A03);
                }
                A012 = this.A03.A01();
                for (C0897a3 c0897a32 : A012) {
                    this.A06.remove(c0897a32.A03);
                }
                for (C0883Zp c0883Zp : this.A06.values()) {
                    list = c0883Zp.A03;
                    list.clear();
                }
                this.A04.A04();
                this.A03.A04();
            }

            @Override // com.facebook.ads.redexgen.X.F9
            public final void A5D() {
                Collection A00;
                Collection A002;
                A05(this.A04);
                A04(this.A04);
                A05(this.A03);
                A04(this.A03);
                if (this.A01 != null) {
                    String obj = toString();
                    List<Rect> list = this.A05;
                    A00 = this.A04.A00();
                    A002 = this.A03.A00();
                    new C0882Zo(obj, this, list, A00, A002);
                    throw new NullPointerException(A02(143, 7, 67));
                }
            }

            @Override // com.facebook.ads.redexgen.X.InterfaceC0886Zs
            public final void A6h(C0897a3 c0897a3, Rect rect) {
                List<Rect> list;
                rect.setEmpty();
                list = this.A06.get(c0897a3.A03).A03;
                for (Rect rect2 : list) {
                    rect.union(rect2);
                }
            }

            @Override // com.facebook.ads.redexgen.X.InterfaceC0886Zs
            public final EnumC0887Zt A7m(C0897a3 c0897a3) {
                EnumC0887Zt enumC0887Zt;
                enumC0887Zt = this.A06.get(c0897a3.A03).A01;
                return enumC0887Zt;
            }

            @Override // com.facebook.ads.redexgen.X.InterfaceC0886Zs
            public final void A7o(Rect rect) {
                rect.setEmpty();
                for (Rect rect2 : this.A05) {
                    rect.union(rect2);
                }
            }

            @Override // com.facebook.ads.redexgen.X.InterfaceC0886Zs
            public final float A7p(C0897a3 c0897a3) {
                List<Rect> list;
                C0883Zp c0883Zp = this.A06.get(c0897a3.A03);
                if (c0883Zp != null) {
                    Rect A00 = A00(c0883Zp);
                    int height = A00.height() * A00.width();
                    int totalVisibleArea = 0;
                    list = c0883Zp.A03;
                    for (Rect rect : list) {
                        totalVisibleArea += rect.height() * rect.width();
                    }
                    return totalVisibleArea / height;
                }
                return 0.0f;
            }

            @Override // com.facebook.ads.redexgen.X.F9
            public final void AEc(@Nullable InterfaceC0894a0 interfaceC0894a0) {
                this.A01 = interfaceC0894a0;
            }
        });
    }
}
