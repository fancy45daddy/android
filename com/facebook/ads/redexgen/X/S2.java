package com.facebook.ads.redexgen.X;

import android.widget.FrameLayout;
import android.widget.HorizontalScrollView;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import java.util.Arrays;
/* loaded from: assets/audience_network.dex */
public final class S2 extends M9 {
    public static byte[] A06;
    public static final int A07;
    public static final int A08;
    public static final int A09;
    public final HorizontalScrollView A00;
    public final ImageView A01;
    public final LinearLayout A02;
    public final LinearLayout A03;
    public final C2D A04;
    public final C0806Wj A05;

    public static String A0B(int i, int i2, int i3) {
        byte[] copyOfRange = Arrays.copyOfRange(A06, i, i + i2);
        for (int i4 = 0; i4 < copyOfRange.length; i4++) {
            copyOfRange[i4] = (byte) ((copyOfRange[i4] - i3) - 8);
        }
        return new String(copyOfRange);
    }

    public static void A0C() {
        A06 = new byte[]{-57, -26, -24, -16, -92, -51, -48, -44, -58, -127, -94, -59, -127, -77, -58, -47, -48, -45, -43, -54, -49, -56};
    }

    static {
        A0C();
        A09 = (int) (Kd.A02 * 4.0f);
        A08 = (int) (Kd.A02 * 10.0f);
        A07 = (int) (Kd.A02 * 44.0f);
    }

    public S2(C0806Wj c0806Wj, IT it, String str) {
        super(c0806Wj, it, str);
        this.A05 = c0806Wj;
        this.A04 = C2E.A00(c0806Wj.A00());
        this.A01 = new ImageView(getContext());
        ImageView imageView = this.A01;
        int i = A08;
        imageView.setPadding(i, i, i, i);
        this.A01.setScaleType(ImageView.ScaleType.FIT_CENTER);
        this.A01.setColorFilter(-10459280);
        int i2 = A07;
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(i2, i2);
        layoutParams.gravity = 16;
        this.A02 = new LinearLayout(getContext());
        this.A02.setOrientation(0);
        LinearLayout.LayoutParams layoutParams2 = new LinearLayout.LayoutParams(-1, -2);
        layoutParams2.gravity = 17;
        this.A00 = new HorizontalScrollView(getContext());
        this.A00.setHorizontalScrollBarEnabled(false);
        this.A00.setLayoutParams(layoutParams2);
        this.A00.addView(this.A02, layoutParams2);
        this.A03 = new LinearLayout(getContext());
        this.A03.setOrientation(0);
        LE.A0M(this.A03, -218103809);
        this.A03.setMotionEventSplittingEnabled(false);
        this.A03.addView(this.A01, layoutParams);
        this.A03.addView(this.A00, layoutParams2);
        addView(this.A03, new FrameLayout.LayoutParams(-1, -1));
        this.A03.setClickable(true);
    }

    @Override // com.facebook.ads.redexgen.X.M9
    public final void A0L() {
        this.A01.setImageBitmap(LN.A01(LM.CROSS));
        this.A01.setOnClickListener(new MI(this));
        this.A01.setContentDescription(A0B(4, 18, 89));
        MD md = new MD(this.A05);
        md.setData(this.A04.A0H(), LM.HIDE_AD);
        md.setOnClickListener(new MJ(this, md));
        MD md2 = new MD(this.A05);
        md2.setData(this.A04.A0L(), LM.REPORT_AD);
        md2.setOnClickListener(new MK(this, md2));
        MD md3 = new MD(this.A05);
        md3.setData(this.A04.A0M(), LM.AD_CHOICES_ICON);
        md3.setOnClickListener(new ML(this, md3));
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-2, -2);
        int i = A09;
        layoutParams.setMargins(0, i, i, i);
        LE.A0T(this.A03);
        this.A02.removeAllViews();
        this.A02.addView(md, layoutParams);
        this.A02.addView(md2, layoutParams);
        this.A02.addView(md3, layoutParams);
    }

    @Override // com.facebook.ads.redexgen.X.M9
    public final void A0M() {
        LE.A0I(this);
        LE.A0J(this);
    }

    @Override // com.facebook.ads.redexgen.X.M9
    public final void A0N(C2H c2h, C2F c2f) {
        this.A01.setOnClickListener(null);
        TextView textView = new TextView(getContext());
        LE.A0X(textView, true, 14);
        textView.setText(this.A04.A0D());
        textView.setGravity(17);
        LE.A0T(this.A03);
        this.A03.removeAllViews();
        this.A03.addView(textView, new LinearLayout.LayoutParams(-1, -1));
    }

    @Override // com.facebook.ads.redexgen.X.M9
    public final void A0O(C2H c2h, C2F c2f) {
        LE.A0T(this.A03);
        this.A01.setImageBitmap(LN.A01(LM.BACK_ARROW));
        this.A01.setOnClickListener(new MM(this));
        this.A01.setContentDescription(A0B(0, 4, 125));
        this.A02.removeAllViews();
        this.A00.fullScroll(17);
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-2, -2);
        int i = A09;
        layoutParams.setMargins(0, i, i, i);
        for (C2H c2h2 : c2h.A05()) {
            MD md = new MD(this.A05);
            md.setData(c2h2.A04(), null);
            md.setOnClickListener(new MN(this, md, c2h2));
            this.A02.addView(md, layoutParams);
        }
    }

    @Override // com.facebook.ads.redexgen.X.M9
    public final boolean A0P() {
        return true;
    }
}
