package com.facebook.ads.redexgen.X;

import android.os.ConditionVariable;
/* loaded from: assets/audience_network.dex */
public class H3 extends Thread {
    public final /* synthetic */ ConditionVariable A00;
    public final /* synthetic */ TX A01;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public H3(TX tx, String str, ConditionVariable conditionVariable) {
        super(str);
        this.A01 = tx;
        this.A00 = conditionVariable;
    }

    @Override // java.lang.Thread, java.lang.Runnable
    public final void run() {
        if (C0480Jm.A02(this)) {
            return;
        }
        try {
            synchronized (this.A01) {
                this.A00.open();
                this.A01.A04();
            }
        } catch (Throwable th) {
            C0480Jm.A00(th, this);
        }
    }
}
