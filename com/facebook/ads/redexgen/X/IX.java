package com.facebook.ads.redexgen.X;

import android.animation.ObjectAnimator;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import android.graphics.drawable.ScaleDrawable;
import android.view.animation.LinearInterpolator;
import android.widget.ProgressBar;
import android.widget.RelativeLayout;
import androidx.annotation.Nullable;
import java.util.Arrays;
/* loaded from: assets/audience_network.dex */
public final class IX extends RelativeLayout implements InterfaceC0612Ot {
    public static byte[] A08;
    public static final int A09;
    public int A00;
    public ObjectAnimator A01;
    public ProgressBar A02;
    public C8O A03;
    public C8O A04;
    public C8O A05;
    public C8O A06;
    @Nullable
    public P1 A07;

    public static String A01(int i, int i2, int i3) {
        byte[] copyOfRange = Arrays.copyOfRange(A08, i, i + i2);
        for (int i4 = 0; i4 < copyOfRange.length; i4++) {
            copyOfRange[i4] = (byte) ((copyOfRange[i4] - i3) - 20);
        }
        return new String(copyOfRange);
    }

    public static void A03() {
        A08 = new byte[]{-71, -69, -72, -80, -69, -82, -68, -68};
    }

    static {
        A03();
        A09 = (int) (Kd.A02 * 6.0f);
    }

    public IX(C0806Wj c0806Wj) {
        this(c0806Wj, A09, -12549889, 0);
    }

    public IX(C0806Wj c0806Wj, int i, int i2, int i3) {
        super(c0806Wj);
        this.A00 = -1;
        this.A06 = new AbstractC0483Jq() { // from class: com.facebook.ads.redexgen.X.64
            public static String[] A01 = {"5cZwmFwOCvoIimHKJKs7c8Wrfuwl5", "kR6Rx7ETQGlVhfpD5OxJcFg21Ovz094i", "oaAjYFLN3m9AYmyloxlSIBJp6ETHW3KF", "dCQrNLE74jmKWuOaqJJ4Sbhiwuuv5ad", "onBgfHhqxGhqxLvpU2wfKqg3mDsyExyq", "SCROov7hAW1gh5oss5LLtyUv0yBfa", "SAPoZVZ00ZwZwmL71sxtzrpJli3hIy2X", "TEn6j3AzMnGgqeyMrOghHZKrMbMLSMuC"};

            /* JADX INFO: Access modifiers changed from: private */
            @Override // com.facebook.ads.redexgen.X.C8O
            /* renamed from: A00 */
            public final void A03(C01726r c01726r) {
                P1 p1;
                p1 = IX.this.A07;
                if (p1 != null) {
                    IX ix = IX.this;
                    String[] strArr = A01;
                    if (strArr[2].charAt(14) == strArr[4].charAt(14)) {
                        throw new RuntimeException();
                    }
                    A01[1] = "B8raFzKF2tgWcMrESvgtBPeFcOBIsHL1";
                    ix.A07(true);
                }
            }
        };
        this.A04 = new AbstractC0501Kk() { // from class: com.facebook.ads.redexgen.X.4p
            /* JADX INFO: Access modifiers changed from: private */
            @Override // com.facebook.ads.redexgen.X.C8O
            /* renamed from: A00 */
            public final void A03(C01736s c01736s) {
                IX.this.A02();
            }
        };
        this.A05 = new K6() { // from class: com.facebook.ads.redexgen.X.4h
            /* JADX INFO: Access modifiers changed from: private */
            @Override // com.facebook.ads.redexgen.X.C8O
            /* renamed from: A00 */
            public final void A03(KV kv) {
                P1 p1;
                p1 = IX.this.A07;
                if (p1 != null) {
                    IX.this.A07(true);
                }
            }
        };
        this.A03 = new AbstractC0534Lr() { // from class: com.facebook.ads.redexgen.X.4V
            /* JADX INFO: Access modifiers changed from: private */
            @Override // com.facebook.ads.redexgen.X.C8O
            /* renamed from: A00 */
            public final void A03(C6v c6v) {
                P1 p1;
                p1 = IX.this.A07;
                if (p1 != null) {
                    IX.this.A05();
                }
            }
        };
        this.A02 = new ProgressBar(c0806Wj, null, 16842872);
        A06(i2, i3);
        this.A02.setMax(10000);
        addView(this.A02, new RelativeLayout.LayoutParams(-1, i));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void A02() {
        ObjectAnimator objectAnimator = this.A01;
        if (objectAnimator != null) {
            objectAnimator.cancel();
            this.A01.setTarget(null);
            this.A01 = null;
            this.A02.clearAnimation();
        }
    }

    public final void A05() {
        A02();
        this.A01 = ObjectAnimator.ofInt(this.A02, A01(0, 8, 53), 0, 0);
        this.A01.setDuration(0L);
        this.A01.setInterpolator(new LinearInterpolator());
        this.A01.start();
        this.A00 = -1;
    }

    public final void A06(int i, int i2) {
        ColorDrawable colorDrawable = new ColorDrawable(i2);
        ColorDrawable colorDrawable2 = new ColorDrawable(i2);
        Drawable secProgressDr = new ScaleDrawable(new ColorDrawable(i), 8388611, 1.0f, -1.0f);
        LayerDrawable layerDrawable = new LayerDrawable(new Drawable[]{colorDrawable, colorDrawable2, secProgressDr});
        layerDrawable.setId(0, 16908288);
        layerDrawable.setId(1, 16908303);
        layerDrawable.setId(2, 16908301);
        this.A02.setProgressDrawable(layerDrawable);
    }

    public final void A07(boolean z) {
        if (this.A07 == null) {
            return;
        }
        A02();
        int currentPositionInMillis = this.A07.getCurrentPositionInMillis();
        int duration = this.A07.getDuration();
        int progress = duration > 0 ? (currentPositionInMillis * 10000) / duration : 0;
        int duration2 = this.A00;
        if (duration2 >= progress || duration <= currentPositionInMillis) {
            return;
        }
        if (z) {
            this.A01 = ObjectAnimator.ofInt(this.A02, A01(0, 8, 53), duration2, progress);
            ObjectAnimator objectAnimator = this.A01;
            int position = Math.min(250, duration - currentPositionInMillis);
            objectAnimator.setDuration(position);
            this.A01.setInterpolator(new LinearInterpolator());
            this.A01.start();
        } else {
            this.A02.setProgress(progress);
        }
        this.A00 = progress;
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC0612Ot
    public final void A8l(P1 p1) {
        this.A07 = p1;
        p1.getEventBus().A03(this.A04, this.A05, this.A06, this.A03);
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC0612Ot
    public final void AF5(P1 p1) {
        p1.getEventBus().A04(this.A06, this.A05, this.A04, this.A03);
        this.A07 = null;
    }
}
