package com.facebook.ads.redexgen.X;

import android.util.SparseArray;
import com.facebook.ads.internal.exoplayer2.Format;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
/* renamed from: com.facebook.ads.redexgen.X.Ux  reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public final class C0769Ux implements InterfaceC0300Ch {
    public static byte[] A02;
    public static String[] A03 = {"ggGLmhyInJSffjkfPU8VRn", "WisLA7DCjwWBxH7MqLlw8w9Z4gicIVYK", "baeaQjGS5RYnakDSUMD4HiL2ABi7hiKM", "QvfNkpkg0VH", "dkSLNeeU5ck3Twa6KyaCdOuwvlu7l8iW", "e6Ade", "C9ShSy7zMtGRXyHgR8PAzFWulvZi4KLP", "w2lskP6GH6NJyN70rzATNYjf2L9mjjHA"};
    public final int A00;
    public final List<Format> A01;

    /* JADX WARN: Failed to parse debug info
    java.lang.ArrayIndexOutOfBoundsException: Index 18 out of bounds for length 18
    	at jadx.plugins.input.dex.sections.debuginfo.DebugInfoParser.startVar(DebugInfoParser.java:203)
    	at jadx.plugins.input.dex.sections.debuginfo.DebugInfoParser.process(DebugInfoParser.java:125)
    	at jadx.plugins.input.dex.sections.DexCodeReader.getDebugInfo(DexCodeReader.java:118)
    	at jadx.core.dex.nodes.MethodNode.getDebugInfo(MethodNode.java:567)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.visit(DebugInfoAttachVisitor.java:39)
     */
    private C0296Cd A00(C0299Cg c0299Cg) {
        String A01;
        int i;
        if (A03(32)) {
            return new C0296Cd(this.A01);
        }
        HV hv = new HV(c0299Cg.A03);
        List<Format> list = this.A01;
        while (true) {
            int A04 = hv.A04();
            String[] strArr = A03;
            if (strArr[3].length() == strArr[0].length()) {
                throw new RuntimeException();
            }
            String[] strArr2 = A03;
            strArr2[6] = "9wGqNU4xey1NmHgGithGb88lbeAMl0Qa";
            strArr2[5] = "Me3yU";
            if (A04 <= 0) {
                return new C0296Cd(list);
            }
            int A0E = hv.A0E();
            int A06 = hv.A06() + hv.A0E();
            if (A0E == 134) {
                list = new ArrayList<>();
                int A0E2 = hv.A0E() & 31;
                for (int i2 = 0; i2 < A0E2; i2++) {
                    String A0S = hv.A0S(3);
                    int A0E3 = hv.A0E();
                    if ((A0E3 & 128) != 0) {
                        A01 = A01(19, 19, 39);
                        i = A0E3 & 63;
                    } else {
                        A01 = A01(0, 19, 33);
                        i = 1;
                    }
                    list.add(Format.A08(null, A01, null, -1, 0, A0S, i, null));
                    hv.A0Z(2);
                }
            }
            hv.A0Y(A06);
        }
    }

    public static String A01(int i, int i2, int i3) {
        byte[] copyOfRange = Arrays.copyOfRange(A02, i, i + i2);
        for (int i4 = 0; i4 < copyOfRange.length; i4++) {
            copyOfRange[i4] = (byte) ((copyOfRange[i4] - i3) - 6);
        }
        return new String(copyOfRange);
    }

    public static void A02() {
        A02 = new byte[]{-120, -105, -105, -109, -112, -118, -120, -101, -112, -106, -107, 86, -118, -116, -120, 84, 93, 87, 95, -114, -99, -99, -103, -106, -112, -114, -95, -106, -100, -101, 92, -112, -110, -114, 90, 100, 93, 101};
    }

    static {
        A02();
    }

    public C0769Ux() {
        this(0);
    }

    public C0769Ux(int i) {
        this(i, Collections.emptyList());
    }

    public C0769Ux(int i, List<Format> list) {
        this.A00 = i;
        if (!A03(32) && list.isEmpty()) {
            list = Collections.singletonList(Format.A00(null, A01(0, 19, 33), 0, null));
        }
        this.A01 = list;
    }

    private boolean A03(int i) {
        return (this.A00 & i) != 0;
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC0300Ch
    public final SparseArray<InterfaceC0302Cj> A4K() {
        return new SparseArray<>();
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC0300Ch
    public final InterfaceC0302Cj A4P(int i, C0299Cg c0299Cg) {
        if (i != 2) {
            if (i == 3 || i == 4) {
                return new C0762Uo(new C0763Up(c0299Cg.A01));
            }
            if (i == 15) {
                if (A03(2)) {
                    return null;
                }
                return new C0762Uo(new Uy(false, c0299Cg.A01));
            } else if (i == 17) {
                if (A03(2)) {
                    return null;
                }
                return new C0762Uo(new C0764Uq(c0299Cg.A01));
            } else if (i != 21) {
                if (i == 27) {
                    if (A03(4)) {
                        return null;
                    }
                    return new C0762Uo(new Ut(A00(c0299Cg), A03(1), A03(8)));
                } else if (i != 36) {
                    if (i != 89) {
                        if (i != 138) {
                            if (i != 129) {
                                if (i != 130) {
                                    if (A03[7].charAt(7) != 'G') {
                                        throw new RuntimeException();
                                    }
                                    A03[2] = "XLjLYE0qXOuIs9WeBuWhNfn9nKSLWrdd";
                                    if (i == 134) {
                                        if (A03(16)) {
                                            return null;
                                        }
                                        return new C0759Ul(new C0758Uk());
                                    } else if (i != 135) {
                                        return null;
                                    }
                                }
                            }
                            return new C0762Uo(new V1(c0299Cg.A01));
                        }
                        return new C0762Uo(new C0768Uw(c0299Cg.A01));
                    }
                    return new C0762Uo(new C0767Uv(c0299Cg.A02));
                } else {
                    return new C0762Uo(new C0766Us(A00(c0299Cg)));
                }
            } else {
                return new C0762Uo(new C0765Ur());
            }
        }
        return new C0762Uo(new Uu());
    }
}
