package com.facebook.ads.redexgen.X;

import android.view.animation.AccelerateInterpolator;
import android.view.animation.AlphaAnimation;
/* loaded from: assets/audience_network.dex */
public class R6 extends AbstractRunnableC0487Ju {
    public final /* synthetic */ OC A00;
    public final /* synthetic */ OD A01;

    public R6(OD od, OC oc) {
        this.A01 = od;
        this.A00 = oc;
    }

    @Override // com.facebook.ads.redexgen.X.AbstractRunnableC0487Ju
    public final void A06() {
        AlphaAnimation alphaAnimation = new AlphaAnimation(1.0f, 0.0f);
        alphaAnimation.setDuration(300L);
        alphaAnimation.setInterpolator(new AccelerateInterpolator());
        alphaAnimation.setAnimationListener(new R7(this));
        this.A01.startAnimation(alphaAnimation);
    }
}
