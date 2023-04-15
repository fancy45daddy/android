package com.facebook.ads.redexgen.X;

import android.graphics.drawable.ColorDrawable;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
/* renamed from: com.facebook.ads.redexgen.X.Ni  reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public final class C0576Ni {
    public static AbstractC02188q A00(final NV nv, int i, final String str, final C0666Qv c0666Qv) {
        if (i == 1) {
            return new AbstractC02188q(nv, str, c0666Qv) { // from class: com.facebook.ads.redexgen.X.1i
                public static final int A00 = (int) (Kd.A02 * 20.0f);
                public static final int A01 = (int) (Kd.A02 * 16.0f);

                @Override // com.facebook.ads.redexgen.X.NR
                public final boolean A01() {
                    return false;
                }

                @Override // com.facebook.ads.redexgen.X.AbstractC02188q
                public final void A0j(C0806Wj c0806Wj) {
                    NO titleDescContainer = getTitleDescContainer();
                    titleDescContainer.setAlignment(3);
                    titleDescContainer.setLayoutParams(new RelativeLayout.LayoutParams(-1, -2));
                    titleDescContainer.setPadding(0, 0, 0, A00);
                    getCtaButton().setLayoutParams(new RelativeLayout.LayoutParams(-1, -2));
                    LinearLayout linearLayout = new LinearLayout(c0806Wj);
                    LE.A0S(linearLayout, new ColorDrawable(-1));
                    RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-1, -2);
                    layoutParams.addRule(3, getMediaContainer().getId());
                    linearLayout.setLayoutParams(layoutParams);
                    linearLayout.setOrientation(1);
                    int i2 = A01;
                    linearLayout.setPadding(i2, i2, i2, i2);
                    linearLayout.addView(titleDescContainer);
                    linearLayout.addView(getCtaButton());
                    addView(getMediaContainer());
                    addView(linearLayout);
                }
            };
        }
        return new AbstractC02188q(nv, str, c0666Qv) { // from class: com.facebook.ads.redexgen.X.26
            public static final int A00 = (int) (Kd.A02 * 12.0f);

            @Override // com.facebook.ads.redexgen.X.NR
            public final boolean A00() {
                return false;
            }

            @Override // com.facebook.ads.redexgen.X.AbstractC02188q, com.facebook.ads.redexgen.X.NR
            public final boolean A0B() {
                return false;
            }

            @Override // com.facebook.ads.redexgen.X.AbstractC02188q
            public final void A0j(C0806Wj c0806Wj) {
                NO titleDescContainer = getTitleDescContainer();
                titleDescContainer.setAlignment(3);
                RelativeLayout.LayoutParams adTitleAndDescriptionLayoutParams = new RelativeLayout.LayoutParams(-1, -2);
                adTitleAndDescriptionLayoutParams.addRule(8, getMediaContainer().getId());
                titleDescContainer.setLayoutParams(adTitleAndDescriptionLayoutParams);
                int i2 = A00;
                titleDescContainer.setPadding(i2, i2, i2, i2);
                LE.A0R(titleDescContainer, getAdContextWrapper());
                RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-1, -2);
                layoutParams.addRule(3, getMediaContainer().getId());
                getCtaButton().setLayoutParams(layoutParams);
                addView(getMediaContainer());
                addView(titleDescContainer);
                addView(getCtaButton());
            }
        };
    }
}
