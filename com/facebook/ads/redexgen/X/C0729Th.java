package com.facebook.ads.redexgen.X;

import android.os.Looper;
import android.os.SystemClock;
import androidx.annotation.Nullable;
import java.io.IOException;
import java.util.concurrent.ExecutorService;
/* renamed from: com.facebook.ads.redexgen.X.Th  reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public final class C0729Th implements InterfaceC0402Gj {
    public static String[] A03 = {"zA1HDLVhPd9PsL9PenCbpcrAKXxlN0d6", "FLS1DqH1RbizqOpj", "1z8O9NEtb5xyjYGA", "8w8GUSv0BTEQmaLhHrYTkFjQIFXWxu0p", "o1jGjvwpoOOHSDmJh0w1BZ4ZQReO8O7V", "", "IXAYHKYtOagUrLCRc2OBPi2ErH2JE5Q2", "ufrZt7t49gDVq6vRzV1VlqPqnp3Kfu3W"};
    public HandlerC0396Gd<? extends InterfaceC0397Ge> A00;
    public IOException A01;
    public final ExecutorService A02;

    /* JADX WARN: Failed to parse debug info
    java.lang.ArrayIndexOutOfBoundsException: Index 14 out of bounds for length 14
    	at jadx.plugins.input.dex.sections.debuginfo.DebugInfoParser.startVar(DebugInfoParser.java:203)
    	at jadx.plugins.input.dex.sections.debuginfo.DebugInfoParser.process(DebugInfoParser.java:135)
    	at jadx.plugins.input.dex.sections.DexCodeReader.getDebugInfo(DexCodeReader.java:118)
    	at jadx.core.dex.nodes.MethodNode.getDebugInfo(MethodNode.java:567)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.visit(DebugInfoAttachVisitor.java:39)
     */
    public final <T extends InterfaceC0397Ge> long A04(T t, InterfaceC0395Gc<T> interfaceC0395Gc, int i) {
        Looper myLooper = Looper.myLooper();
        H6.A04(myLooper != null);
        this.A01 = null;
        long elapsedRealtime = SystemClock.elapsedRealtime();
        new HandlerC0396Gd(this, myLooper, t, interfaceC0395Gc, i, elapsedRealtime).A06(0L);
        return elapsedRealtime;
    }

    public C0729Th(String str) {
        this.A02 = C0430Hl.A0T(str);
    }

    public final void A05() {
        this.A00.A07(false);
    }

    public final void A06(int i) throws IOException {
        IOException iOException = this.A01;
        if (iOException == null) {
            HandlerC0396Gd<? extends InterfaceC0397Ge> handlerC0396Gd = this.A00;
            if (handlerC0396Gd != null) {
                if (A03[0].charAt(1) != 'f') {
                    String[] strArr = A03;
                    strArr[2] = "ShO16ogjgPVIHMzl";
                    strArr[1] = "8gZONBnlwtDMou1V";
                    if (i == Integer.MIN_VALUE) {
                        i = handlerC0396Gd.A03;
                    }
                    handlerC0396Gd.A05(i);
                    return;
                }
                throw new RuntimeException();
            }
            return;
        }
        throw iOException;
    }

    public final void A07(@Nullable InterfaceC0398Gf interfaceC0398Gf) {
        HandlerC0396Gd<? extends InterfaceC0397Ge> handlerC0396Gd = this.A00;
        if (handlerC0396Gd != null) {
            handlerC0396Gd.A07(true);
        }
        if (interfaceC0398Gf != null) {
            this.A02.execute(new RunnableC0399Gg(interfaceC0398Gf));
        }
        this.A02.shutdown();
    }

    public final boolean A08() {
        return this.A00 != null;
    }
}
