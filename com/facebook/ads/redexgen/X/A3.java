package com.facebook.ads.redexgen.X;

import android.graphics.PointF;
import android.util.DisplayMetrics;
import android.view.View;
/* loaded from: assets/audience_network.dex */
public class A3 extends C0832Xj {
    public final /* synthetic */ A2 A00;

    /* JADX WARN: Failed to parse debug info
    java.lang.ArrayIndexOutOfBoundsException: Index 11 out of bounds for length 11
    	at jadx.plugins.input.dex.sections.debuginfo.DebugInfoParser.startVar(DebugInfoParser.java:203)
    	at jadx.plugins.input.dex.sections.debuginfo.DebugInfoParser.process(DebugInfoParser.java:125)
    	at jadx.plugins.input.dex.sections.DexCodeReader.getDebugInfo(DexCodeReader.java:118)
    	at jadx.core.dex.nodes.MethodNode.getDebugInfo(MethodNode.java:567)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.visit(DebugInfoAttachVisitor.java:39)
     */
    @Override // com.facebook.ads.redexgen.X.C0832Xj
    public final int A0O(View view, int i) {
        int i2;
        C4T A08 = A08();
        if (A08.A24()) {
            C4U c4u = (C4U) view.getLayoutParams();
            int A0N = A0N(A08.A0k(view) - c4u.leftMargin, A08.A0n(view) + c4u.rightMargin, A08.A0e(), A08.A0h() - A08.A0f(), i);
            i2 = this.A00.A02;
            return A0N + i2;
        }
        return 0;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public A3(A2 a2, C0806Wj c0806Wj) {
        super(c0806Wj);
        this.A00 = a2;
    }

    @Override // com.facebook.ads.redexgen.X.C0832Xj
    public final float A0J(DisplayMetrics displayMetrics) {
        float f;
        f = this.A00.A00;
        return f / displayMetrics.densityDpi;
    }

    @Override // com.facebook.ads.redexgen.X.C0832Xj
    public final int A0K() {
        return -1;
    }

    @Override // com.facebook.ads.redexgen.X.C0832Xj
    public final PointF A0P(int i) {
        return this.A00.A45(i);
    }
}
