package com.facebook.ads.redexgen.X;

import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import androidx.annotation.Nullable;
import androidx.annotation.VisibleForTesting;
import java.util.HashMap;
/* loaded from: assets/audience_network.dex */
public abstract class N5 extends LinearLayout {
    public static final LinearLayout.LayoutParams A05 = new LinearLayout.LayoutParams(-2, -2);
    public final int A00;
    public final RelativeLayout A01;
    public final C0806Wj A02;
    public final View$OnClickListenerC0683Rm A03;
    public final NI A04;

    public abstract void A0A(int i);

    public N5(C0806Wj c0806Wj, int i, C1K c1k, boolean z, String str, IT it, InterfaceC0519Lc interfaceC0519Lc, C0627Pi c0627Pi, L6 l6) {
        super(c0806Wj);
        LE.A0K(this);
        this.A02 = c0806Wj;
        this.A00 = i;
        this.A04 = new NI(c0806Wj);
        LE.A0M(this.A04, 0);
        LE.A0K(this.A04);
        this.A03 = new View$OnClickListenerC0683Rm(c0806Wj, str, c1k, z, it, interfaceC0519Lc, c0627Pi, l6);
        LE.A0G(1001, this.A03);
        this.A01 = new RelativeLayout(c0806Wj);
        this.A01.setLayoutParams(A05);
        LE.A0K(this.A01);
    }

    public void A08() {
    }

    public void A09() {
    }

    public final View$OnClickListenerC0683Rm getCTAButton() {
        return this.A03;
    }

    public View getExpandableLayout() {
        return null;
    }

    @VisibleForTesting
    public final ImageView getIconView() {
        return this.A04;
    }

    public void setInfo(C1I c1i, C1L c1l, String str, String str2, @Nullable N8 n8) {
        this.A03.setCta(c1l, str, new HashMap(), n8);
        AsyncTaskC0685Ro asyncTaskC0685Ro = new AsyncTaskC0685Ro(this.A04, this.A02);
        int i = this.A00;
        asyncTaskC0685Ro.A05(i, i).A07(str2);
    }

    public void setTitleMaxLines(int i) {
    }
}
