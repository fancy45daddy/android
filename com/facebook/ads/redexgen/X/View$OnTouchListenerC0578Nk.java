package com.facebook.ads.redexgen.X;

import android.view.MotionEvent;
import android.view.View;
/* renamed from: com.facebook.ads.redexgen.X.Nk  reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public class View$OnTouchListenerC0578Nk implements View.OnTouchListener {
    public final /* synthetic */ C02178p A00;

    public View$OnTouchListenerC0578Nk(C02178p c02178p) {
        this.A00 = c02178p;
    }

    @Override // android.view.View.OnTouchListener
    public final boolean onTouch(View view, MotionEvent motionEvent) {
        C0582No c0582No;
        c0582No = this.A00.A0E;
        c0582No.dispatchTouchEvent(MotionEvent.obtain(motionEvent));
        return false;
    }
}
