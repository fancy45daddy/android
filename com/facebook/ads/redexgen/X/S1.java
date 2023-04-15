package com.facebook.ads.redexgen.X;

import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ScrollView;
import java.util.Arrays;
/* loaded from: assets/audience_network.dex */
public final class S1 extends M9 {
    public static byte[] A05;
    public static final int A06;
    public static final int A07;
    public static final int A08;
    public final ImageView A00;
    public final LinearLayout A01;
    public final ScrollView A02;
    public final C2D A03;
    public final C0806Wj A04;

    public static String A0B(int i, int i2, int i3) {
        byte[] copyOfRange = Arrays.copyOfRange(A05, i, i + i2);
        for (int i4 = 0; i4 < copyOfRange.length; i4++) {
            copyOfRange[i4] = (byte) ((copyOfRange[i4] ^ i3) ^ 55);
        }
        return new String(copyOfRange);
    }

    public static void A0C() {
        A05 = new byte[]{53, 22, 20, 28, 105, 70, 69, 89, 79, 10, 107, 78, 10, 120, 79, 90, 69, 88, 94, 67, 68, 77};
    }

    static {
        A0C();
        A08 = (int) (Kd.A02 * 8.0f);
        A07 = (int) (Kd.A02 * 10.0f);
        A06 = (int) (Kd.A02 * 44.0f);
    }

    public S1(C0806Wj c0806Wj, IT it, String str) {
        super(c0806Wj, it, str);
        this.A04 = c0806Wj;
        this.A03 = C2E.A00(this.A04.A00());
        this.A00 = new ImageView(getContext());
        ImageView imageView = this.A00;
        int i = A07;
        imageView.setPadding(i, i, i, i);
        this.A00.setColorFilter(-10459280);
        int i2 = A06;
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(i2, i2);
        layoutParams.gravity = 3;
        this.A00.setLayoutParams(layoutParams);
        this.A02 = new ScrollView(getContext());
        this.A02.setFillViewport(true);
        LE.A0M(this.A02, -218103809);
        this.A01 = new LinearLayout(getContext());
        this.A01.setOrientation(1);
        LinearLayout linearLayout = this.A01;
        int i3 = A08;
        linearLayout.setPadding(i3, i3, i3, i3);
        this.A02.addView(this.A01, new FrameLayout.LayoutParams(-1, -2));
        addView(this.A02, new FrameLayout.LayoutParams(-1, -1));
    }

    @Override // com.facebook.ads.redexgen.X.M9
    public final void A0L() {
        this.A00.setImageBitmap(LN.A01(LM.CROSS));
        this.A00.setOnClickListener(new MS(this));
        this.A00.setContentDescription(A0B(4, 18, 29));
        MD md = new MD(this.A04);
        md.setData(this.A03.A0H(), LM.HIDE_AD);
        md.setOnClickListener(new MT(this, md));
        MD md2 = new MD(this.A04);
        md2.setData(this.A03.A0L(), LM.REPORT_AD);
        md2.setOnClickListener(new MU(this, md2));
        MD md3 = new MD(this.A04);
        md3.setData(this.A03.A0M(), LM.AD_CHOICES_ICON);
        md3.setOnClickListener(new MV(this, md3));
        LinearLayout.LayoutParams menuParams = new LinearLayout.LayoutParams(-2, -2);
        int i = A08;
        menuParams.setMargins(i, i, i, i);
        menuParams.gravity = 17;
        LinearLayout linearLayout = new LinearLayout(getContext());
        linearLayout.setOrientation(1);
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-2, 0);
        layoutParams.gravity = 17;
        layoutParams.weight = 1.0f;
        LE.A0T(this.A01);
        this.A01.removeAllViews();
        this.A01.addView(this.A00);
        this.A01.addView(linearLayout, layoutParams);
        linearLayout.addView(md, menuParams);
        linearLayout.addView(md2, menuParams);
        linearLayout.addView(md3, menuParams);
    }

    @Override // com.facebook.ads.redexgen.X.M9
    public final void A0M() {
        LE.A0I(this);
        LE.A0J(this);
    }

    @Override // com.facebook.ads.redexgen.X.M9
    public final void A0N(C2H c2h, C2F c2f) {
        String A0H;
        LM lm;
        int i;
        this.A00.setOnClickListener(null);
        if (c2f == C2F.A05) {
            A0H = this.A03.A0F();
            lm = LM.REPORT_AD;
            i = -552389;
        } else {
            A0H = this.A03.A0H();
            lm = LM.HIDE_AD;
            i = -13272859;
        }
        M7 A0I = new M7(this.A04, this.A0B).A0I(A0H);
        String title = this.A03.A0D();
        M7 A0H2 = A0I.A0H(title);
        String title2 = c2h.A04();
        M8 adHiddenView = A0H2.A0F(title2).A0K(false).A0E(lm).A0D(i).A0L(false).A0J(false).A0M();
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-1, 0);
        layoutParams.gravity = 17;
        layoutParams.weight = 1.0f;
        LE.A0T(this.A01);
        this.A02.fullScroll(33);
        this.A01.removeAllViews();
        this.A01.addView(adHiddenView, layoutParams);
    }

    @Override // com.facebook.ads.redexgen.X.M9
    public final void A0O(C2H c2h, C2F c2f) {
        boolean isReportFlow = c2f == C2F.A05;
        MR mr = new MR(this.A04, c2h, this.A0B, isReportFlow ? LM.REPORT_AD : LM.HIDE_AD);
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-2, 0);
        layoutParams.gravity = 17;
        layoutParams.weight = 1.0f;
        this.A00.setImageBitmap(LN.A01(LM.BACK_ARROW));
        this.A00.setOnClickListener(new MW(this));
        this.A00.setContentDescription(A0B(0, 4, 64));
        LE.A0T(this.A01);
        this.A02.fullScroll(33);
        this.A01.removeAllViews();
        this.A01.addView(this.A00);
        this.A01.addView(mr, layoutParams);
    }

    @Override // com.facebook.ads.redexgen.X.M9
    public final boolean A0P() {
        return true;
    }
}
