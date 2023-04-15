package com.facebook.ads.redexgen.X;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
/* loaded from: assets/audience_network.dex */
public final class TT implements HJ {
    public final Handler A00;

    public TT(Handler handler) {
        this.A00 = handler;
    }

    @Override // com.facebook.ads.redexgen.X.HJ
    public final Looper A6t() {
        return this.A00.getLooper();
    }

    @Override // com.facebook.ads.redexgen.X.HJ
    public final Message A9e(int i, int i2, int i3) {
        return this.A00.obtainMessage(i, i2, i3);
    }

    @Override // com.facebook.ads.redexgen.X.HJ
    public final Message A9f(int i, int i2, int i3, Object obj) {
        return this.A00.obtainMessage(i, i2, i3, obj);
    }

    @Override // com.facebook.ads.redexgen.X.HJ
    public final Message A9g(int i, Object obj) {
        return this.A00.obtainMessage(i, obj);
    }

    @Override // com.facebook.ads.redexgen.X.HJ
    public final void ADp(int i) {
        this.A00.removeMessages(i);
    }

    @Override // com.facebook.ads.redexgen.X.HJ
    public final boolean AEJ(int i) {
        return this.A00.sendEmptyMessage(i);
    }

    @Override // com.facebook.ads.redexgen.X.HJ
    public final boolean AEK(int i, long j) {
        return this.A00.sendEmptyMessageAtTime(i, j);
    }
}
