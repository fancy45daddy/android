package com.facebook.ads.redexgen.X;

import android.os.Handler;
import android.os.Looper;
import android.view.MotionEvent;
import android.view.View;
import com.facebook.ads.NativeAd;
/* loaded from: assets/audience_network.dex */
public class XH implements InterfaceC0579Nl {
    public final /* synthetic */ NativeAd A00;
    public final /* synthetic */ XC A01;
    public final /* synthetic */ C0718Sw A02;

    public XH(XC xc, C0718Sw c0718Sw, NativeAd nativeAd) {
        this.A01 = xc;
        this.A02 = c0718Sw;
        this.A00 = nativeAd;
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC0579Nl
    public final void A8f() {
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC0579Nl
    public final void AAZ(C02168o c02168o) {
        new Handler(Looper.getMainLooper()).postDelayed(new XI(this, c02168o), 1L);
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC0579Nl
    public final void AAn() {
        C02168o c02168o;
        C02168o c02168o2;
        c02168o = this.A01.A0A;
        if (c02168o != null) {
            c02168o2 = this.A01.A0A;
            c02168o2.A08();
        }
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC0579Nl
    public final void ACR(View view, MotionEvent motionEvent) {
        C0806Wj c0806Wj;
        boolean A0J;
        L6 A19 = this.A02.A19();
        c0806Wj = this.A01.A07;
        A19.A06(c0806Wj, motionEvent, view, view);
        if (motionEvent.getAction() == 1) {
            A0J = this.A01.A0J(this.A00);
            if (!A0J && this.A02.A12() != null) {
                this.A02.A12().onClick(view);
            }
        }
    }
}
