package com.facebook.ads.redexgen.X;

import android.media.AudioManager;
import android.os.Handler;
import android.os.Looper;
/* loaded from: assets/audience_network.dex */
public class P2 implements AudioManager.OnAudioFocusChangeListener {
    public final /* synthetic */ C01656j A00;

    public P2(C01656j c01656j) {
        this.A00 = c01656j;
    }

    @Override // android.media.AudioManager.OnAudioFocusChangeListener
    public final void onAudioFocusChange(int i) {
        new Handler(Looper.getMainLooper()).post(new JJ(this, i));
    }
}
