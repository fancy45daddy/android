package com.facebook.ads.redexgen.X;

import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import com.facebook.ads.internal.api.AdNativeComponentView;
/* renamed from: com.facebook.ads.redexgen.X.Li  reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public final class C0525Li extends AdNativeComponentView {
    public static final int A01 = (int) (Kd.A02 * 1.0f);
    public final ImageView A00;

    public C0525Li(C0806Wj c0806Wj) {
        super(c0806Wj);
        this.A00 = new C0537Lu(c0806Wj);
        this.A00.setScaleType(ImageView.ScaleType.CENTER_CROP);
        EnumC0499Ki.A04(this.A00, EnumC0499Ki.A0A);
        addView(this.A00, new ViewGroup.LayoutParams(-1, -1));
        LE.A0M(this.A00, -2130706433);
        int i = A01;
        setPadding(i, i, i, i);
    }

    public View getAdContentsView() {
        return this.A00;
    }

    public ImageView getImageCardView() {
        return this.A00;
    }
}
