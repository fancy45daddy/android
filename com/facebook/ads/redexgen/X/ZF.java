package com.facebook.ads.redexgen.X;

import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import android.view.MotionEvent;
import android.view.View;
/* loaded from: assets/audience_network.dex */
public class ZF implements InterfaceC0579Nl {
    public final /* synthetic */ ZC A00;

    /* JADX WARN: Failed to parse debug info
    java.lang.ArrayIndexOutOfBoundsException: Index 5 out of bounds for length 5
    	at jadx.plugins.input.dex.sections.debuginfo.DebugInfoParser.startVar(DebugInfoParser.java:203)
    	at jadx.plugins.input.dex.sections.debuginfo.DebugInfoParser.process(DebugInfoParser.java:135)
    	at jadx.plugins.input.dex.sections.DexCodeReader.getDebugInfo(DexCodeReader.java:118)
    	at jadx.core.dex.nodes.MethodNode.getDebugInfo(MethodNode.java:567)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.visit(DebugInfoAttachVisitor.java:39)
     */
    @Override // com.facebook.ads.redexgen.X.InterfaceC0579Nl
    public final void A8f() {
        C0867Yu c0867Yu;
        DY dy;
        c0867Yu = this.A00.A02;
        String A00 = c0867Yu.A0R().A00();
        if (TextUtils.isEmpty(A00)) {
            return;
        }
        KL kl = new KL();
        dy = this.A00.A03;
        KL.A0E(kl, dy, KM.A00(A00), this.A00.A63());
    }

    public ZF(ZC zc) {
        this.A00 = zc;
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC0579Nl
    public final void AAZ(C02168o c02168o) {
        new Handler(Looper.getMainLooper()).postDelayed(new ZG(this, c02168o), 1L);
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC0579Nl
    public final void AAn() {
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC0579Nl
    public final void ACR(View view, MotionEvent motionEvent) {
    }
}
