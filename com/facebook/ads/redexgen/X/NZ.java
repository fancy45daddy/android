package com.facebook.ads.redexgen.X;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
/* loaded from: assets/audience_network.dex */
public class NZ extends AnimatorListenerAdapter {
    public static String[] A02 = {"R9x3aA0CxKnsz3as3yTNo", "wj3", "QXJ1VvuxLHED1mtMWLYdqrUglWa9lzRq", "lkNOeAB6Ljcfoc1GYo9neKrfDLaf7fDy", "DjE9g1oV3RhQW9", "kuoJdNjNcIUcz8fbOu7oHrt", "PXWkVVH6OcZLxwrP3oXHVUdgM2dUbdjZ", "8PrLrYluZp2AIaWhf9UgS"};
    public final /* synthetic */ RX A00;
    public final /* synthetic */ boolean A01;

    public NZ(RX rx, boolean z) {
        this.A00 = rx;
        this.A01 = z;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        C0570Nc c0570Nc;
        C0696Rz c0696Rz;
        C0696Rz c0696Rz2;
        super.onAnimationEnd(animator);
        c0570Nc = this.A00.A0F;
        c0570Nc.setTranslationY(0.0f);
        this.A00.A0H();
        if (this.A01) {
            return;
        }
        c0696Rz = this.A00.A0D;
        if (c0696Rz != null) {
            RX rx = this.A00;
            String[] strArr = A02;
            if (strArr[2].charAt(23) != strArr[6].charAt(23)) {
                throw new RuntimeException();
            }
            String[] strArr2 = A02;
            strArr2[2] = "czZD1KZ4paLzcRsa7FTotpjgHmPZqDaL";
            strArr2[6] = "ekjCDFK0XFV5sAsD0BjD76lgNibQF4SI";
            c0696Rz2 = rx.A0D;
            c0696Rz2.destroy();
        }
    }
}
