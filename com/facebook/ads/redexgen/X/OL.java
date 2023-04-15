package com.facebook.ads.redexgen.X;

import android.text.TextUtils;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
/* loaded from: assets/audience_network.dex */
public final class OL extends LinearLayout {
    public static final int A04 = (int) (Kd.A02 * 32.0f);
    public static final int A05 = (int) (Kd.A02 * 8.0f);
    public TextView A00;
    public TextView A01;
    public NI A02;
    public final C0806Wj A03;

    public OL(C0806Wj c0806Wj) {
        super(c0806Wj);
        this.A03 = c0806Wj;
        A00(c0806Wj);
    }

    private final void A00(C0806Wj c0806Wj) {
        setGravity(16);
        this.A02 = new NI(c0806Wj);
        this.A02.setFullCircleCorners(true);
        int i = A04;
        LinearLayout.LayoutParams pageImageViewParams = new LinearLayout.LayoutParams(i, i);
        pageImageViewParams.setMargins(0, 0, A05, 0);
        addView(this.A02, pageImageViewParams);
        LinearLayout pageInfoView = new LinearLayout(c0806Wj);
        pageInfoView.setOrientation(1);
        this.A00 = new TextView(c0806Wj);
        ViewGroup.LayoutParams layoutParams = new LinearLayout.LayoutParams(-1, -2);
        LE.A0X(this.A00, true, 16);
        this.A00.setEllipsize(TextUtils.TruncateAt.END);
        this.A00.setSingleLine(true);
        this.A01 = new TextView(c0806Wj);
        LE.A0X(this.A01, false, 14);
        pageInfoView.addView(this.A00);
        pageInfoView.addView(this.A01);
        addView(pageInfoView, layoutParams);
    }

    public final void A01(int i, int i2) {
        this.A00.setTextColor(i);
        this.A01.setTextColor(i2);
    }

    public void setPageDetails(C1U c1u) {
        AsyncTaskC0685Ro asyncTaskC0685Ro = new AsyncTaskC0685Ro(this.A02, this.A03);
        int i = A04;
        asyncTaskC0685Ro.A05(i, i);
        asyncTaskC0685Ro.A07(c1u.A01());
        this.A00.setText(c1u.A02());
        this.A01.setText(c1u.A03());
    }
}
