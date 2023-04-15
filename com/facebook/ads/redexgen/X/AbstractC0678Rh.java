package com.facebook.ads.redexgen.X;

import android.content.res.Configuration;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.view.View;
import android.widget.RelativeLayout;
import androidx.annotation.Nullable;
import java.util.Arrays;
/* renamed from: com.facebook.ads.redexgen.X.Rh  reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public abstract class AbstractC0678Rh extends NR {
    public static byte[] A06;
    public static String[] A07 = {"1qM0UqBuKeNFs4931PZdKXfB5ZchECK5", "3ZSmcCEAG5Dz0dWrJNlp2MNszP7YT25A", "Vrvau7r1HMpQKQXhvyVkTfJZAsfHOW4A", "oVRoE2FdK0le1s2SfNIozg00Kc9sH4MP", "npYoVlwUwM4clRwIxvjz9nauDkw8jySV", "7Yuh663Y", "kkRlGGIMUj7iwn7pYEfT9Vq54HRzcbQk", "UynwTjbvMY6JmtelA"};
    public static final int A08;
    public static final int A09;
    public static final int A0A;
    public static final int A0B;
    public static final int A0C;
    public static final int A0D;
    public static final int A0E;
    public static final int A0F;
    public static final int A0G;
    public static final int A0H;
    public JK A00;
    @Nullable
    public HT A01;
    public HH A02;
    public final AnonymousClass18 A03;
    public final C1B A04;
    public final N5 A05;

    public static String A0A(int i, int i2, int i3) {
        byte[] copyOfRange = Arrays.copyOfRange(A06, i, i + i2);
        for (int i4 = 0; i4 < copyOfRange.length; i4++) {
            copyOfRange[i4] = (byte) ((copyOfRange[i4] ^ i3) ^ 22);
        }
        return new String(copyOfRange);
    }

    public static void A0B() {
        A06 = new byte[]{9, 5, 7, 68, 12, 11, 9, 15, 8, 5, 5, 1, 68, 11, 14, 25, 68, 3, 4, 30, 15, 24, 25, 30, 3, 30, 3, 11, 6, 68, 9, 6, 3, 9, 1, 15, 14, 92, 75, 89, 79, 92, 74, 75, 74, 113, 88, 71, 74, 75, 65};
    }

    static {
        A0B();
        A0B = (int) (Kd.A02 * 48.0f);
        A0F = (int) (Kd.A02 * 16.0f);
        A08 = (int) (Kd.A02 * 4.0f);
        A0E = (int) (Kd.A02 * 44.0f);
        A0C = (int) (Kd.A02 * 8.0f);
        A0D = (int) (Kd.A02 * 12.0f);
        A0H = (int) (Kd.A02 * 12.0f);
        A0G = (int) (Kd.A02 * 26.0f);
        A09 = C2U.A01(-1, 77);
        A0A = C2U.A01(A09, 90);
    }

    public AbstractC0678Rh(NV nv, boolean z) {
        super(nv, z);
        this.A03 = nv.A04();
        this.A04 = this.A03.A0O();
        this.A05 = A09(nv);
        AbstractC0518Lb A082 = nv.A08();
        if (A082 != null) {
            A082.setLayoutParams(new RelativeLayout.LayoutParams(-1, A082.getToolbarHeight()));
            A082.setPageDetailsVisible(false);
        }
    }

    private N5 A09(NV nv) {
        String A0A2;
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-1, -2);
        layoutParams.addRule(12);
        if (nv.A04().A0Y().equals(A0A(37, 14, 56))) {
            A0A2 = EnumC0614Ov.A04.A02();
        } else {
            A0A2 = A0A(0, 37, 124);
        }
        C0679Ri c0679Ri = new C0679Ri(nv.A05(), A0B, this.A04.A0E().A00() == C1G.A05, getColors(), this.A04.A0F().A06(), A0A2, nv.A06(), nv.A09(), nv.A0B(), nv.A07());
        this.A02 = new HH(c0679Ri, 400, 100, 0);
        LE.A0K(c0679Ri);
        c0679Ri.A0A(nv.A00());
        addView(c0679Ri, layoutParams);
        return c0679Ri;
    }

    @Override // com.facebook.ads.redexgen.X.NR
    public void A0b(C1B c1b, String str, double d, @Nullable Bundle bundle) {
        super.A0b(c1b, str, d, bundle);
        this.A05.setInfo(c1b.A0E(), c1b.A0F(), str, this.A03.A0R().A01(), null);
    }

    public final int A0e(@Nullable AbstractC0518Lb abstractC0518Lb) {
        return abstractC0518Lb == null ? AbstractC0518Lb.A00 : abstractC0518Lb.getToolbarHeight();
    }

    public void A0f() {
        View expandableLayout = getAdDetailsView().getExpandableLayout();
        if (expandableLayout != null) {
            this.A00 = new JK(true);
            HT ht = this.A01;
            if (ht != null) {
                JK jk = this.A00;
                if (A07[0].charAt(30) == 'l') {
                    throw new RuntimeException();
                }
                A07[7] = "KTvg88bTO6HmKn15GgbH1";
                jk.A0I(ht);
            }
            C1K A01 = this.A03.A0N().A01();
            this.A00.A0I(new HK(getAdDetailsView().getCTAButton(), 300, -1, A01.A09(true)));
            Drawable A082 = LE.A08(A09, A0A, A08);
            Drawable startDrawable = LE.A05(A01.A08(true), A08);
            this.A00.A0I(new C0419Ha(getAdDetailsView().getCTAButton(), 300, A082, startDrawable));
            this.A00.A0I(new HS(expandableLayout, 150, false));
            this.A00.A0H(2300);
        }
    }

    public AnonymousClass18 getAdDataBundle() {
        return this.A03;
    }

    public HH getAdDetailsAnimation() {
        return this.A02;
    }

    public N5 getAdDetailsView() {
        return this.A05;
    }

    public C1B getAdInfo() {
        return this.A04;
    }

    public JK getAnimationPlugin() {
        return this.A00;
    }

    @Override // com.facebook.ads.redexgen.X.NR, android.view.View
    public void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        getAdDetailsView().A0A(configuration.orientation);
    }

    @Override // android.widget.RelativeLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        View expandableLayout = getAdDetailsView().getExpandableLayout();
        if (expandableLayout == null || !z) {
            return;
        }
        HT ht = this.A01;
        if (A07[2].charAt(30) != '4') {
            throw new RuntimeException();
        }
        A07[0] = "AO2Vor543jhYYkt1oYijcT7buZTkR3eI";
        if (ht == null) {
            this.A01 = new HT(expandableLayout, 300, expandableLayout.getHeight(), 0);
            this.A00.A0I(this.A01);
            this.A00.A0G();
        }
    }
}
