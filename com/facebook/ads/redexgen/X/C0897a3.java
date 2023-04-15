package com.facebook.ads.redexgen.X;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
/* renamed from: com.facebook.ads.redexgen.X.a3  reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public final class C0897a3<ModelType, StateType> {
    public static byte[] A05;
    public static final C0897a3 A06;
    public final C0897a3 A00;
    public final ModelType A01;
    public final StateType A02;
    public final String A03;
    public final List<InterfaceC0900a6<ModelType, StateType>> A04;

    public static String A01(int i, int i2, int i3) {
        byte[] copyOfRange = Arrays.copyOfRange(A05, i, i + i2);
        for (int i4 = 0; i4 < copyOfRange.length; i4++) {
            copyOfRange[i4] = (byte) ((copyOfRange[i4] - i3) - 113);
        }
        return new String(copyOfRange);
    }

    public static void A02() {
        A05 = new byte[]{81, 89, 92, 96, 101};
    }

    /* JADX WARN: Failed to parse debug info
    java.lang.ArrayIndexOutOfBoundsException: Index 4 out of bounds for length 4
    	at jadx.plugins.input.dex.sections.debuginfo.DebugInfoParser.startVar(DebugInfoParser.java:203)
    	at jadx.plugins.input.dex.sections.debuginfo.DebugInfoParser.process(DebugInfoParser.java:135)
    	at jadx.plugins.input.dex.sections.DexCodeReader.getDebugInfo(DexCodeReader.java:118)
    	at jadx.core.dex.nodes.MethodNode.getDebugInfo(MethodNode.java:567)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.visit(DebugInfoAttachVisitor.java:39)
     */
    public final void A03(InterfaceC0886Zs interfaceC0886Zs) {
        for (InterfaceC0900a6<ModelType, StateType> interfaceC0900a6 : this.A04) {
            interfaceC0900a6.A5H(this, interfaceC0886Zs);
        }
    }

    static {
        A02();
        A06 = new C0897a3(null, null, A01(0, 5, 123), Collections.emptyList(), A06);
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.a3 != com.instagram.common.viewpoint.core.ViewpointData<ModelType, StateType> */
    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.a4 != com.instagram.common.viewpoint.core.ViewpointData$Builder<ModelType, StateType> */
    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public C0897a3(com.facebook.ads.redexgen.X.C0898a4<ModelType, StateType> r7) {
        /*
            r6 = this;
            java.lang.Object r1 = com.facebook.ads.redexgen.X.C0898a4.A01(r7)
            java.lang.Object r2 = com.facebook.ads.redexgen.X.C0898a4.A02(r7)
            java.lang.String r3 = com.facebook.ads.redexgen.X.C0898a4.A03(r7)
            java.util.List r0 = com.facebook.ads.redexgen.X.C0898a4.A04(r7)
            if (r0 != 0) goto L1f
            java.util.List r4 = java.util.Collections.emptyList()
        L16:
            com.facebook.ads.redexgen.X.a3 r5 = com.facebook.ads.redexgen.X.C0898a4.A00(r7)
            r0 = r6
            r0.<init>(r1, r2, r3, r4, r5)
            return
        L1f:
            java.util.List r4 = com.facebook.ads.redexgen.X.C0898a4.A04(r7)
            goto L16
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.ads.redexgen.X.C0897a3.<init>(com.facebook.ads.redexgen.X.a4):void");
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.a3 != com.instagram.common.viewpoint.core.ViewpointData<ModelType, StateType> */
    public C0897a3(ModelType model, StateType state, String str, List<InterfaceC0900a6<ModelType, StateType>> list, C0897a3 c0897a3) {
        this.A01 = model;
        this.A02 = state;
        this.A03 = str;
        this.A00 = c0897a3;
        this.A04 = list;
    }

    public static <ModelType, StateType> C0898a4<ModelType, StateType> A00(ModelType model, StateType state, String str) {
        return new C0898a4<>(model, state, str);
    }
}
