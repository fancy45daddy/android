package com.facebook.ads.redexgen.X;

import android.view.View;
/* loaded from: assets/audience_network.dex */
public class PA implements View.OnClickListener {
    public final /* synthetic */ C6A A00;

    public PA(C6A c6a) {
        this.A00 = c6a;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        P1 videoView;
        C0444Ib c0444Ib;
        C0806Wj c0806Wj;
        P1 videoView2;
        P1 videoView3;
        P1 videoView4;
        C0444Ib c0444Ib2;
        if (C0480Jm.A02(this)) {
            return;
        }
        try {
            videoView = this.A00.getVideoView();
            if (videoView != null) {
                c0444Ib = this.A00.A02;
                if (c0444Ib != null) {
                    c0444Ib2 = this.A00.A02;
                    c0444Ib2.A02(EnumC0443Ia.A0p, null);
                }
                c0806Wj = this.A00.A01;
                c0806Wj.A0D().A2t();
                int[] iArr = PB.A00;
                videoView2 = this.A00.getVideoView();
                int i = iArr[videoView2.getState().ordinal()];
                if (i == 1 || i == 2 || i == 3 || i == 4) {
                    videoView3 = this.A00.getVideoView();
                    videoView3.A0b(EnumC0611Os.A04, 12);
                } else if (i == 5) {
                    videoView4 = this.A00.getVideoView();
                    videoView4.A0e(true, 8);
                }
            }
        } catch (Throwable th) {
            C0480Jm.A00(th, this);
        }
    }
}
