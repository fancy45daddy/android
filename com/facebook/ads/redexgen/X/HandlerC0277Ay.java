package com.facebook.ads.redexgen.X;

import android.annotation.SuppressLint;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import java.util.List;
@SuppressLint({"HandlerLeak"})
/* renamed from: com.facebook.ads.redexgen.X.Ay  reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public class HandlerC0277Ay extends Handler {
    public final /* synthetic */ C0780Vj A00;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.Ay != com.facebook.ads.internal.exoplayer2.drm.DefaultDrmSessionManager<T>$MediaDrmHandler */
    public HandlerC0277Ay(C0780Vj c0780Vj, Looper looper) {
        super(looper);
        this.A00 = c0780Vj;
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.Ay != com.facebook.ads.internal.exoplayer2.drm.DefaultDrmSessionManager<T>$MediaDrmHandler */
    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.Vk != com.facebook.ads.internal.exoplayer2.drm.DefaultDrmSession<T> */
    @Override // android.os.Handler
    public final void handleMessage(Message msg) {
        List<C0781Vk> list;
        if (C0480Jm.A02(this)) {
            return;
        }
        try {
            byte[] bArr = (byte[]) msg.obj;
            list = this.A00.A09;
            for (C0781Vk c0781Vk : list) {
                if (c0781Vk.A0N(bArr)) {
                    c0781Vk.A0J(msg.what);
                    return;
                }
            }
        } catch (Throwable th) {
            C0480Jm.A00(th, this);
        }
    }
}
