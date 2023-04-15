package com.facebook.ads.redexgen.X;

import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.facebook.ads.AdOptionsView;
import com.facebook.ads.MediaView;
import com.facebook.ads.NativeBannerAd;
import java.util.ArrayList;
/* renamed from: com.facebook.ads.redexgen.X.Qc  reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public final class C0647Qc extends LinearLayout implements InterfaceC0600Oh {
    public final NativeBannerAd A00;
    public final C0806Wj A01;
    public final ArrayList<View> A02;
    public static final int A04 = (int) (Kd.A02 * 42.0f);
    public static final int A03 = (int) (Kd.A02 * 48.0f);
    public static final int A05 = (int) (Kd.A02 * 54.0f);
    public static final int A07 = (int) (Kd.A02 * 4.0f);
    public static final int A06 = (int) (Kd.A02 * 8.0f);

    public C0647Qc(C0806Wj c0806Wj, NativeBannerAd nativeBannerAd, C0462It c0462It, EnumC0463Iu enumC0463Iu, MediaView mediaView, AdOptionsView adOptionsView) {
        super(c0806Wj);
        LinearLayout.LayoutParams layoutParams;
        LinearLayout.LayoutParams ctaButtonParams;
        this.A02 = new ArrayList<>();
        this.A00 = nativeBannerAd;
        this.A01 = c0806Wj;
        LinearLayout linearLayout = new LinearLayout(getContext());
        linearLayout.setOrientation(0);
        int A00 = A00(enumC0463Iu);
        NJ nj = new NJ(this.A01);
        nj.setFullCircleCorners(true);
        LinearLayout.LayoutParams layoutParams2 = new LinearLayout.LayoutParams(A00, A00);
        layoutParams2.gravity = 16;
        nj.addView((View) mediaView, (ViewGroup.LayoutParams) new LinearLayout.LayoutParams(-1, -1));
        linearLayout.addView(nj, layoutParams2);
        C0597Oe c0597Oe = new C0597Oe(c0806Wj, this.A00, enumC0463Iu, c0462It, adOptionsView);
        c0597Oe.setPadding(A06, 0, 0, 0);
        LinearLayout.LayoutParams layoutParams3 = new LinearLayout.LayoutParams(0, -2);
        layoutParams3.weight = 1.0f;
        layoutParams3.gravity = 16;
        linearLayout.addView(c0597Oe, layoutParams3);
        if (enumC0463Iu == EnumC0463Iu.A0A) {
            int i = A07;
            setPadding(i, i, i, i);
            setOrientation(0);
            layoutParams = new LinearLayout.LayoutParams(0, -1);
            ctaButtonParams = new LinearLayout.LayoutParams(-2, -1);
            linearLayout.setPadding(0, 0, A07, 0);
        } else {
            int i2 = A06;
            setPadding(i2, i2, i2, i2);
            setOrientation(1);
            layoutParams = new LinearLayout.LayoutParams(-1, 0);
            ctaButtonParams = new LinearLayout.LayoutParams(-1, -2);
            linearLayout.setPadding(0, 0, 0, A06);
        }
        layoutParams.weight = 1.0f;
        addView(linearLayout, layoutParams);
        TextView textView = new TextView(getContext());
        int i3 = A06;
        int i4 = A07;
        textView.setPadding(i3, i4, i3, i4);
        c0462It.A05(textView);
        textView.setText(this.A00.getAdCallToAction());
        addView(textView, ctaButtonParams);
        this.A02.add(mediaView);
        this.A02.add(textView);
    }

    public static int A00(EnumC0463Iu enumC0463Iu) {
        int i = C0598Of.A00[enumC0463Iu.ordinal()];
        if (i != 1) {
            if (i != 2) {
                return A05;
            }
            return A03;
        }
        return A04;
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC0600Oh
    public View getView() {
        return this;
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC0600Oh
    public ArrayList<View> getViewsForInteraction() {
        return this.A02;
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC0600Oh
    public final void unregisterView() {
        this.A00.unregisterView();
    }
}
