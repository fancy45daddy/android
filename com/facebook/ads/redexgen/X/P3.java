package com.facebook.ads.redexgen.X;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.os.Handler;
/* loaded from: assets/audience_network.dex */
public class P3 extends AnimatorListenerAdapter {
    public final /* synthetic */ C01606b A00;

    public P3(C01606b c01606b) {
        this.A00 = c01606b;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        Handler handler;
        handler = this.A00.A00.A04;
        handler.postDelayed(new JI(this), 2000L);
    }
}
