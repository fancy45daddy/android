package com.facebook.ads.redexgen.X;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.util.DisplayMetrics;
import android.view.View;
import android.widget.RelativeLayout;
import androidx.annotation.Nullable;
/* renamed from: com.facebook.ads.redexgen.X.6A  reason: invalid class name */
/* loaded from: assets/audience_network.dex */
public final class C6A extends M1 {
    public final Paint A00;
    public final C0806Wj A01;
    @Nullable
    public final C0444Ib A02;
    public final AbstractC0534Lr A03;
    public final AbstractC0501Kk A04;
    public final K6 A05;
    public final PD A06;

    public C6A(C0806Wj c0806Wj, boolean z, @Nullable C0444Ib c0444Ib) {
        super(c0806Wj);
        this.A04 = new AbstractC0501Kk() { // from class: com.facebook.ads.redexgen.X.6O
            /* JADX INFO: Access modifiers changed from: private */
            @Override // com.facebook.ads.redexgen.X.C8O
            /* renamed from: A00 */
            public final void A03(C01736s c01736s) {
                PD pd;
                pd = C6A.this.A06;
                pd.setChecked(true);
            }
        };
        this.A05 = new K6() { // from class: com.facebook.ads.redexgen.X.6N
            /* JADX INFO: Access modifiers changed from: private */
            @Override // com.facebook.ads.redexgen.X.C8O
            /* renamed from: A00 */
            public final void A03(KV kv) {
                PD pd;
                pd = C6A.this.A06;
                pd.setChecked(false);
            }
        };
        this.A03 = new AbstractC0534Lr() { // from class: com.facebook.ads.redexgen.X.6M
            /* JADX INFO: Access modifiers changed from: private */
            @Override // com.facebook.ads.redexgen.X.C8O
            /* renamed from: A00 */
            public final void A03(C6v c6v) {
                PD pd;
                pd = C6A.this.A06;
                pd.setChecked(true);
            }
        };
        this.A02 = c0444Ib;
        this.A01 = c0806Wj;
        this.A06 = new PD(c0806Wj, z);
        DisplayMetrics displayMetrics = getResources().getDisplayMetrics();
        RelativeLayout.LayoutParams btnLayout = new RelativeLayout.LayoutParams((int) (displayMetrics.density * 23.76d), (int) (displayMetrics.density * 23.76d));
        btnLayout.addRule(13);
        this.A06.setLayoutParams(btnLayout);
        this.A06.setChecked(true);
        this.A06.setClickable(false);
        this.A00 = new Paint();
        this.A00.setStyle(Paint.Style.FILL);
        if (z) {
            this.A00.setColor(-1728053248);
        } else {
            this.A00.setColor(-1);
            this.A00.setAlpha(204);
        }
        LE.A0M(this, 0);
        addView(this.A06);
        setGravity(17);
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams((int) (displayMetrics.density * 72.0d), (int) (displayMetrics.density * 72.0d));
        layoutParams.addRule(13);
        setLayoutParams(layoutParams);
        LE.A0G(1004, this);
    }

    @Override // com.facebook.ads.redexgen.X.M1
    public final void A07() {
        super.A07();
        if (getVideoView() != null) {
            getVideoView().getEventBus().A03(this.A04, this.A05, this.A03);
        }
        View.OnClickListener clickListener = new PA(this);
        setOnClickListener(clickListener);
    }

    @Override // com.facebook.ads.redexgen.X.M1
    public final void A08() {
        setOnClickListener(null);
        if (getVideoView() != null) {
            getVideoView().getEventBus().A04(this.A03, this.A05, this.A04);
        }
        super.A08();
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        int width = (getWidth() - getPaddingLeft()) - getPaddingRight();
        int height = getHeight();
        int width2 = getPaddingTop();
        int i = height - width2;
        int width3 = getPaddingBottom();
        int height2 = i - width3;
        int width4 = Math.min(width, height2);
        int centerY = width4 / 2;
        int height3 = width4 / 2;
        int width5 = getPaddingLeft();
        float f = width5 + centerY;
        int width6 = getPaddingTop();
        canvas.drawCircle(f, width6 + height3, centerY, this.A00);
        super.onDraw(canvas);
    }
}
