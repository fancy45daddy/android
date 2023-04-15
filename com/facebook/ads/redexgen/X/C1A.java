package com.facebook.ads.redexgen.X;

import a.a.j;
import android.util.AttributeSet;
import android.view.View;
import androidx.annotation.Nullable;
import java.util.Arrays;
/* renamed from: com.facebook.ads.redexgen.X.1A  reason: invalid class name */
/* loaded from: assets/audience_network.dex */
public final class C1A extends View$OnTouchListenerC00401h implements OJ {
    public static byte[] A07;
    public static String[] A08 = {"T7MK6mm4Fzbg8PTMnM4kcHpb21LLpIaw", "PTQtUxKdjysMmbj8hCZsGKEwd1IRWqqZ", "Zw8mt4VncD", "79VYCrnrWW", "2MnAMBnkkiKtyd2cP7mHhabJycDYuMiE", "jaMauIT7sdi", "OgIH7ZaBRtH9hoDgrnw", "xZmsCngT77DU5lblEiekqTVKPqNdsast"};
    public int A00;
    public int A01;
    public int A02;
    public int A03;
    public InterfaceC0524Lh A04;
    public boolean A05;
    public final A2 A06;

    public static String A01(int i, int i2, int i3) {
        byte[] copyOfRange = Arrays.copyOfRange(A07, i, i + i2);
        for (int i4 = 0; i4 < copyOfRange.length; i4++) {
            copyOfRange[i4] = (byte) ((copyOfRange[i4] - i3) - 28);
        }
        return new String(copyOfRange);
    }

    public static void A03() {
        A07 = new byte[]{-6, -7, -37, -20, -14, -16, -50, -13, -20, -7, -14, -16, -17};
    }

    static {
        A03();
    }

    public C1A(C0806Wj c0806Wj) {
        super(c0806Wj);
        this.A03 = -1;
        this.A02 = -1;
        this.A01 = 0;
        this.A00 = 0;
        this.A05 = false;
        this.A06 = new A2(c0806Wj, new OG(), new OF());
        A02();
    }

    public C1A(C0806Wj c0806Wj, AttributeSet attributeSet) {
        super(c0806Wj, attributeSet);
        this.A03 = -1;
        this.A02 = -1;
        this.A01 = 0;
        this.A00 = 0;
        this.A05 = false;
        this.A06 = new A2(c0806Wj, new OG(), new OF());
        A02();
    }

    public C1A(C0806Wj c0806Wj, AttributeSet attributeSet, int i) {
        super(c0806Wj, attributeSet, i);
        this.A03 = -1;
        this.A02 = -1;
        this.A01 = 0;
        this.A00 = 0;
        this.A05 = false;
        this.A06 = new A2(c0806Wj, new OG(), new OF());
        A02();
    }

    private int A00(int i) {
        int i2 = this.A00 * 2;
        int measuredWidth = getMeasuredWidth();
        int spacing = getPaddingLeft();
        int i3 = (measuredWidth - spacing) - i2;
        int itemSize = getAdapter().A0D();
        int numFullItems = 0;
        int spacing2 = Integer.MAX_VALUE;
        while (spacing2 > i) {
            numFullItems++;
            if (numFullItems >= itemSize) {
                return i;
            }
            int spacing3 = numFullItems * i2;
            spacing2 = (int) ((i3 - spacing3) / (numFullItems + 0.333f));
        }
        return spacing2;
    }

    private void A02() {
        this.A06.A2E(0);
        setLayoutManager(this.A06);
        setSaveEnabled(false);
        setSnapDelegate(this);
        LE.A0K(this);
    }

    private void A04(int i, int i2) {
        if (i == this.A03 && i2 == this.A02) {
            return;
        }
        this.A03 = i;
        if (A08[1].charAt(11) == 'q') {
            throw new RuntimeException();
        }
        A08[6] = "hNBaptvkpj";
        this.A02 = i2;
        if (this.A04 != null) {
            throw new NullPointerException(A01(0, 13, j.AppCompatTheme_windowActionBar));
        }
    }

    @Override // com.facebook.ads.redexgen.X.View$OnTouchListenerC00401h
    public final void A22(int i, boolean z) {
        super.A22(i, z);
        A04(i, 0);
    }

    @Override // com.facebook.ads.redexgen.X.OJ
    public final int A7E(int i) {
        int abs = Math.abs(i);
        int scrollXAbs = ((View$OnTouchListenerC00401h) this).A06;
        if (abs <= scrollXAbs) {
            return 0;
        }
        int i2 = this.A01;
        if (i2 == 0) {
            return 1;
        }
        int scrollXAbs2 = 1 + (abs / i2);
        return scrollXAbs2;
    }

    public int getChildSpacing() {
        return this.A00;
    }

    @Override // com.facebook.ads.redexgen.X.C0339Dw, android.view.View
    public final void onMeasure(int i, int i2) {
        int itemSize;
        int itemSize2;
        super.onMeasure(i, i2);
        int paddingTop = getPaddingTop() + getPaddingBottom();
        if (this.A05) {
            int i3 = (int) Kd.A02;
            int verticalPadding = ID.A0D(getContext());
            itemSize = (i3 * verticalPadding) + paddingTop;
        } else {
            int verticalPadding2 = getMeasuredWidth();
            itemSize = Math.round(verticalPadding2 / 1.91f);
        }
        int height = View.MeasureSpec.getMode(i2);
        if (height == Integer.MIN_VALUE) {
            int verticalPadding3 = View.MeasureSpec.getSize(i2);
            itemSize = Math.min(verticalPadding3, itemSize);
        } else if (height == 1073741824) {
            itemSize = View.MeasureSpec.getSize(i2);
        }
        int itemSize3 = itemSize - paddingTop;
        if (this.A05) {
            int verticalPadding4 = C0521Le.A09;
            itemSize2 = Math.min(verticalPadding4, itemSize3);
        } else {
            itemSize2 = A00(itemSize3);
        }
        int verticalPadding5 = itemSize2 + paddingTop;
        setMeasuredDimension(getMeasuredWidth(), verticalPadding5);
        if (!this.A05) {
            int verticalPadding6 = this.A00;
            setChildWidth((verticalPadding6 * 2) + itemSize2);
        }
    }

    @Override // com.facebook.ads.redexgen.X.C0339Dw
    public void setAdapter(@Nullable C4H c4h) {
        this.A06.A2L(c4h == null ? -1 : c4h.hashCode());
        super.setAdapter(c4h);
    }

    public void setChildSpacing(int i) {
        this.A00 = i;
    }

    public void setChildWidth(int i) {
        this.A01 = i;
        int measuredWidth = getMeasuredWidth();
        int pageWidth = getPaddingLeft();
        int i2 = measuredWidth - pageWidth;
        int pageWidth2 = getPaddingRight();
        int i3 = i2 - pageWidth2;
        A2 a2 = this.A06;
        int pageWidth3 = this.A01;
        a2.A2M((i3 - pageWidth3) / 2);
        A2 a22 = this.A06;
        int pageWidth4 = this.A01;
        a22.A2K(pageWidth4 / measuredWidth);
    }

    public void setCurrentPosition(int i) {
        A22(i, false);
    }

    public void setOnPageChangedListener(InterfaceC0524Lh interfaceC0524Lh) {
        this.A04 = interfaceC0524Lh;
    }

    public void setShowTextInCarousel(boolean z) {
        this.A05 = z;
    }
}
