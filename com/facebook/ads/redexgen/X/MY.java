package com.facebook.ads.redexgen.X;

import android.view.MotionEvent;
import android.view.View;
/* loaded from: assets/audience_network.dex */
public class MY implements View.OnTouchListener {
    @Override // android.view.View.OnTouchListener
    public final boolean onTouch(View view, MotionEvent motionEvent) {
        int i;
        int action = motionEvent.getAction();
        if (action == 0) {
            i = C0546Me.A0D;
            LE.A0M(view, i);
        } else if (action == 1) {
            LE.A0M(view, 0);
        }
        return false;
    }
}
