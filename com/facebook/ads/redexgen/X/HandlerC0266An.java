package com.facebook.ads.redexgen.X;

import android.annotation.SuppressLint;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.util.Pair;
@SuppressLint({"HandlerLeak"})
/* renamed from: com.facebook.ads.redexgen.X.An  reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public class HandlerC0266An extends Handler {
    public final /* synthetic */ C0781Vk A00;

    /* JADX WARN: Failed to parse debug info
    java.lang.ArrayIndexOutOfBoundsException: Index 6 out of bounds for length 6
    	at jadx.plugins.input.dex.sections.debuginfo.DebugInfoParser.startVar(DebugInfoParser.java:203)
    	at jadx.plugins.input.dex.sections.debuginfo.DebugInfoParser.process(DebugInfoParser.java:135)
    	at jadx.plugins.input.dex.sections.DexCodeReader.getDebugInfo(DexCodeReader.java:118)
    	at jadx.core.dex.nodes.MethodNode.getDebugInfo(MethodNode.java:567)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.visit(DebugInfoAttachVisitor.java:39)
     */
    private boolean A01(Message message) {
        int i;
        if (message.arg1 == 1) {
            int i2 = message.arg2 + 1;
            i = this.A00.A0D;
            if (i2 > i) {
                return false;
            }
            Message obtain = Message.obtain(message);
            obtain.arg2 = i2;
            sendMessageDelayed(obtain, A00(i2));
            return true;
        }
        return false;
    }

    /* JADX WARN: Failed to parse debug info
    java.lang.ArrayIndexOutOfBoundsException: Index 8 out of bounds for length 8
    	at jadx.plugins.input.dex.sections.debuginfo.DebugInfoParser.startVar(DebugInfoParser.java:203)
    	at jadx.plugins.input.dex.sections.debuginfo.DebugInfoParser.process(DebugInfoParser.java:125)
    	at jadx.plugins.input.dex.sections.DexCodeReader.getDebugInfo(DexCodeReader.java:118)
    	at jadx.core.dex.nodes.MethodNode.getDebugInfo(MethodNode.java:567)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.visit(DebugInfoAttachVisitor.java:39)
     */
    @Override // android.os.Handler
    public final void handleMessage(Message message) {
        if (C0480Jm.A02(this)) {
            return;
        }
        try {
            Object obj = message.obj;
            try {
                int i = message.what;
                if (i == 0) {
                    e = this.A00.A0B.executeProvisionRequest(this.A00.A0C, (BE) obj);
                } else if (i != 1) {
                    throw new RuntimeException();
                } else {
                    Pair pair = (Pair) obj;
                    e = this.A00.A0B.executeKeyRequest(this.A00.A0C, (BA) pair.first, (String) pair.second);
                }
            } catch (Exception e) {
                e = e;
                if (A01(message)) {
                    return;
                }
            }
            this.A00.A0A.obtainMessage(message.what, Pair.create(obj, e)).sendToTarget();
        } catch (Throwable th) {
            C0480Jm.A00(th, this);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.An != com.facebook.ads.internal.exoplayer2.drm.DefaultDrmSession<T>$PostRequestHandler */
    public HandlerC0266An(C0781Vk c0781Vk, Looper looper) {
        super(looper);
        this.A00 = c0781Vk;
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.An != com.facebook.ads.internal.exoplayer2.drm.DefaultDrmSession<T>$PostRequestHandler */
    private long A00(int i) {
        return Math.min((i - 1) * 1000, 5000);
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.An != com.facebook.ads.internal.exoplayer2.drm.DefaultDrmSession<T>$PostRequestHandler */
    public final void A02(int i, Object obj, boolean z) {
        obtainMessage(i, z ? 1 : 0, 0, obj).sendToTarget();
    }
}
