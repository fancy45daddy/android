package com.facebook.ads.redexgen.X;

import android.widget.RelativeLayout;
import androidx.annotation.Nullable;
import java.util.HashMap;
/* loaded from: assets/audience_network.dex */
public final class NA {
    /* JADX WARN: Type inference failed for: r0v0, types: [com.facebook.ads.redexgen.X.2L] */
    public static C2L A00(final NV nv, final C0718Sw c0718Sw, final String str, final AnonymousClass96 anonymousClass96) {
        return new C02268y(nv, c0718Sw, true, str, anonymousClass96) { // from class: com.facebook.ads.redexgen.X.2L
            @Nullable
            public View$OnClickListenerC0683Rm A00;
            @Nullable
            public OM A01;
            public final IT A02 = this.A0I.A05().A00().A08();
            public final C0718Sw A03;
            public final AnonymousClass96 A04;
            public final String A05;
            public static final int A07 = (int) (Kd.A02 * (-4.0f));
            public static final int A06 = (int) (Kd.A02 * 6.0f);

            {
                this.A03 = c0718Sw;
                this.A05 = str;
                this.A04 = anonymousClass96;
                this.A03.A1K(this);
            }

            @Override // com.facebook.ads.redexgen.X.RW
            public void setupNativeCtaExtension(OM om) {
                this.A01 = om;
                int A0L = ID.A0L(this.A0I.A05());
                C1K A01 = this.A03.A0z().A0N().A01();
                this.A00 = new View$OnClickListenerC0683Rm(this.A0I.A05(), this.A03.A0z().A0T(), A01, this.A02, C0558Mq.getDummyListener(), this.A04.A0c(), this.A03.A19());
                this.A00.setCta(om.A03().A0F(), this.A05, new HashMap());
                this.A03.A1K(this.A00);
                RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-1, -2);
                if (A0L == 1) {
                    layoutParams.addRule(12);
                    View$OnClickListenerC0683Rm view$OnClickListenerC0683Rm = this.A00;
                    int i = A06;
                    int extensionVariant = A01.A09(false);
                    LE.A0P(view$OnClickListenerC0683Rm, i, 5, extensionVariant);
                    ((C02268y) this).A06.addView(this.A00, layoutParams);
                } else if (A0L != 2) {
                } else {
                    int extensionVariant2 = ((C02268y) this).A06.getId();
                    layoutParams.addRule(3, extensionVariant2);
                    int extensionVariant3 = A07;
                    layoutParams.setMargins(0, extensionVariant3, 0, 0);
                    addView(this.A00, 0, layoutParams);
                    ((C02268y) this).A06.bringToFront();
                }
            }
        };
    }

    public static C02268y A01(NV nv, String str, C0666Qv c0666Qv) {
        return new C02268y(nv, true, str, c0666Qv);
    }
}
