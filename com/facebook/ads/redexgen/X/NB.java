package com.facebook.ads.redexgen.X;

import android.animation.ObjectAnimator;
import android.content.res.Resources;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.view.View;
import android.view.animation.LinearInterpolator;
import androidx.annotation.Keep;
import java.util.Arrays;
/* loaded from: assets/audience_network.dex */
public final class NB extends View {
    public static byte[] A05;
    public float A00;
    public final float A01;
    public final Paint A02;
    public final Paint A03;
    public final RectF A04;

    static {
        A01();
    }

    public static String A00(int i, int i2, int i3) {
        byte[] copyOfRange = Arrays.copyOfRange(A05, i, i + i2);
        for (int i4 = 0; i4 < copyOfRange.length; i4++) {
            copyOfRange[i4] = (byte) ((copyOfRange[i4] ^ i3) ^ 80);
        }
        return new String(copyOfRange);
    }

    public static void A01() {
        A05 = new byte[]{0, 2, 31, 23, 2, 21, 3, 3};
    }

    public NB(C0806Wj c0806Wj) {
        super(c0806Wj);
        this.A01 = Resources.getSystem().getDisplayMetrics().density * 3.0f;
        this.A00 = 0.0f;
        this.A04 = new RectF();
        this.A02 = new Paint(1);
        this.A02.setStyle(Paint.Style.STROKE);
        this.A02.setStrokeWidth(this.A01);
        this.A03 = new Paint(1);
        this.A03.setStyle(Paint.Style.STROKE);
        this.A03.setStrokeWidth(this.A01);
    }

    public final void A02(int i, int i2) {
        this.A02.setColor(i);
        this.A03.setColor(i2);
    }

    @Keep
    public float getProgress() {
        return this.A00;
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        canvas.drawArc(this.A04, 0.0f, 360.0f, false, this.A02);
        canvas.drawArc(this.A04, -90.0f, ((100.0f - this.A00) * 360.0f) / 100.0f, false, this.A03);
    }

    @Override // android.view.View
    public final void onMeasure(int i, int i2) {
        int min = Math.min(getDefaultSize(getSuggestedMinimumHeight(), i2), getDefaultSize(getSuggestedMinimumWidth(), i));
        setMeasuredDimension(min, min);
        RectF rectF = this.A04;
        int min2 = getPaddingLeft();
        float f = (this.A01 / 2.0f) + 0.0f + min2;
        int min3 = getPaddingTop();
        float f2 = (this.A01 / 2.0f) + 0.0f + min3;
        float f3 = min - (this.A01 / 2.0f);
        int min4 = getPaddingRight();
        float f4 = f3 - min4;
        float f5 = min - (this.A01 / 2.0f);
        int min5 = getPaddingBottom();
        rectF.set(f, f2, f4, f5 - min5);
    }

    @Keep
    public void setProgress(float f) {
        this.A00 = Math.min(f, 100.0f);
        postInvalidate();
    }

    public void setProgressWithAnimation(float f) {
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(this, A00(0, 8, 32), f);
        ofFloat.setDuration(400L);
        ofFloat.setInterpolator(new LinearInterpolator());
        ofFloat.start();
    }
}
