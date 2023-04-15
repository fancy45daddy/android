package com.facebook.ads.redexgen.X;

import android.media.AudioTrack;
import android.os.ConditionVariable;
/* loaded from: assets/audience_network.dex */
public class AR extends Thread {
    public final /* synthetic */ AudioTrack A00;
    public final /* synthetic */ C0791Vu A01;

    public AR(C0791Vu c0791Vu, AudioTrack audioTrack) {
        this.A01 = c0791Vu;
        this.A00 = audioTrack;
    }

    @Override // java.lang.Thread, java.lang.Runnable
    public final void run() {
        ConditionVariable conditionVariable;
        if (C0480Jm.A02(this)) {
            return;
        }
        try {
            this.A00.flush();
            this.A00.release();
            conditionVariable = this.A01.A0f;
            conditionVariable.open();
        } catch (Throwable th) {
            C0480Jm.A00(th, this);
        }
    }
}
