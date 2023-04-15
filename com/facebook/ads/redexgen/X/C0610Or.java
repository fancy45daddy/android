package com.facebook.ads.redexgen.X;

import android.database.ContentObserver;
import android.os.Handler;
/* renamed from: com.facebook.ads.redexgen.X.Or  reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public final class C0610Or extends ContentObserver {
    public final C0553Ml A00;

    public C0610Or(Handler handler, C0553Ml c0553Ml) {
        super(handler);
        this.A00 = c0553Ml;
    }

    @Override // android.database.ContentObserver
    public final boolean deliverSelfNotifications() {
        return false;
    }

    @Override // android.database.ContentObserver
    public final void onChange(boolean z) {
        this.A00.A0Z();
    }
}
