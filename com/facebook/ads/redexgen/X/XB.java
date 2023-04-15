package com.facebook.ads.redexgen.X;

import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.Nullable;
import com.facebook.ads.NativeAdLayout;
import com.facebook.ads.internal.api.AdComponentViewApi;
import com.facebook.ads.internal.api.NativeAdLayoutApi;
/* loaded from: assets/audience_network.dex */
public class XB extends C5E implements NativeAdLayoutApi {
    @Nullable
    public View A02;
    public NativeAdLayout A03;
    public int A01 = 0;
    public int A00 = 0;

    public final void A02() {
        LE.A0T(this.A03);
        this.A03.removeView(this.A02);
        this.A02 = null;
    }

    public final void A03(M9 m9) {
        this.A02 = m9;
        m9.setLayoutParams(new ViewGroup.LayoutParams(-1, -1));
        LE.A0T(this.A03);
        this.A03.addView(this.A02);
    }

    public final AdComponentViewApi getAdComponentViewApi() {
        return this;
    }

    public final void initialize(NativeAdLayout nativeAdLayout) {
        this.A03 = nativeAdLayout;
    }

    @Override // com.facebook.ads.redexgen.X.C5E
    public final void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        if (this.A00 > 0) {
            int measuredWidth = this.A03.getMeasuredWidth();
            int i3 = this.A00;
            if (measuredWidth > i3) {
                setMeasuredDimension(i3, this.A03.getMeasuredHeight());
                return;
            }
        }
        int measuredWidth2 = this.A03.getMeasuredWidth();
        int i4 = this.A01;
        if (measuredWidth2 >= i4) {
            return;
        }
        setMeasuredDimension(i4, this.A03.getMeasuredHeight());
    }

    public final void setMaxWidth(int i) {
        this.A00 = i;
    }

    public final void setMinWidth(int i) {
        this.A01 = i;
    }
}
