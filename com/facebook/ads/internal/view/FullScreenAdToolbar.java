package com.facebook.ads.internal.view;

import a.a.j;
import android.graphics.drawable.GradientDrawable;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import androidx.annotation.Nullable;
import com.facebook.ads.redexgen.X.AbstractC0518Lb;
import com.facebook.ads.redexgen.X.C00341b;
import com.facebook.ads.redexgen.X.C0444Ib;
import com.facebook.ads.redexgen.X.C0538Lw;
import com.facebook.ads.redexgen.X.C0806Wj;
import com.facebook.ads.redexgen.X.C1K;
import com.facebook.ads.redexgen.X.C1U;
import com.facebook.ads.redexgen.X.InterfaceC0517La;
import com.facebook.ads.redexgen.X.InterfaceC0519Lc;
import com.facebook.ads.redexgen.X.Kd;
import com.facebook.ads.redexgen.X.LE;
import com.facebook.ads.redexgen.X.LZ;
import com.facebook.ads.redexgen.X.OL;
import com.facebook.ads.redexgen.X.View$OnClickListenerC0523Lg;
import java.util.Arrays;
/* loaded from: assets/audience_network.dex */
public final class FullScreenAdToolbar extends AbstractC0518Lb {
    public static byte[] A07;
    public static String[] A08 = {"elaUgpg", "xyZ5KhWZZkOCw26QnbyRE89VYXYHkT38", "j2Hg99bd5kkvFLrtwtqoGvtE7T", "FtK0h2Y990QReQxCoMrwn7Y", "09p430KvfvIa5D7TMMbG57be7BWhVuc0", "4K9Dg6G4rdQDm1ubILJxRl9GbBVTjarc", "MQsbPX4", "ODYsITK"};
    public static final int A09;
    public static final int A0A;
    public static final int A0B;
    public static final int A0C;
    public static final int A0D;
    @Nullable
    public InterfaceC0517La A00;
    public final RelativeLayout A01;
    public final C0444Ib A02;
    public final LZ A03;
    public final InterfaceC0519Lc A04;
    public final C0538Lw A05;
    public final OL A06;

    public static String A02(int i, int i2, int i3) {
        byte[] copyOfRange = Arrays.copyOfRange(A07, i, i + i2);
        for (int i4 = 0; i4 < copyOfRange.length; i4++) {
            copyOfRange[i4] = (byte) ((copyOfRange[i4] - i3) - 113);
        }
        return new String(copyOfRange);
    }

    public static void A03() {
        A07 = new byte[]{-26, 15, 18, 22, 8, -61, -28, 7, 56, 75, 86, 85, 88, 90, 6, 39, 74};
    }

    static {
        A03();
        A09 = (int) (Kd.A02 * 10.0f);
        A0D = (int) (Kd.A02 * 16.0f);
        int i = A0D;
        int i2 = A09;
        A0B = i - i2;
        A0C = (i * 2) - i2;
        A0A = (int) (Kd.A02 * 4.0f);
    }

    public FullScreenAdToolbar(C0806Wj c0806Wj, InterfaceC0519Lc interfaceC0519Lc, C0444Ib c0444Ib, @ToolbarActionView$ToolbarActionMode int i, int i2) {
        super(c0806Wj);
        this.A04 = interfaceC0519Lc;
        this.A02 = c0444Ib;
        setGravity(16);
        this.A05 = new C0538Lw(c0806Wj, i);
        this.A05.setContentDescription(A02(0, 8, 50));
        this.A05.setActionClickListener(new View$OnClickListenerC0523Lg(this));
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-2, -2);
        int i3 = A0B;
        layoutParams.setMargins(i3, i3, A0C, i3);
        addView(this.A05, layoutParams);
        this.A01 = new RelativeLayout(c0806Wj);
        LinearLayout.LayoutParams layoutParams2 = new LinearLayout.LayoutParams(0, -2);
        layoutParams2.weight = 1.0f;
        this.A06 = new OL(c0806Wj);
        LinearLayout.LayoutParams layoutParams3 = new LinearLayout.LayoutParams(-2, -2);
        layoutParams3.gravity = 17;
        this.A06.setLayoutParams(layoutParams3);
        this.A01.addView(this.A06);
        addView(this.A01, layoutParams2);
        this.A03 = new LZ(c0806Wj, i2);
        LinearLayout.LayoutParams layoutParams4 = new LinearLayout.LayoutParams(-2, -1);
        int i4 = A0D;
        layoutParams4.setMargins(0, i4 / 2, i4 / 2, i4 / 2);
        addView(this.A03, layoutParams4);
    }

    @Override // com.facebook.ads.redexgen.X.AbstractC0518Lb
    public final void A04(C1K c1k, boolean z) {
        int A04 = c1k.A04(z);
        OL ol = this.A06;
        int accentColor = c1k.A0A(z);
        ol.A01(accentColor, A04);
        this.A03.setIconColors(A04);
        this.A03.setContentDescription(A02(8, 9, j.AppCompatTheme_windowFixedWidthMinor));
        this.A05.setColors(A04);
        if (z) {
            GradientDrawable gradientDrawable = new GradientDrawable(GradientDrawable.Orientation.TOP_BOTTOM, new int[]{-1778384896, 0});
            gradientDrawable.setCornerRadius(0.0f);
            LE.A0S(this, gradientDrawable);
            LZ lz = this.A03;
            int accentColor2 = A0A;
            LE.A0Q(lz, 0, -16777216, accentColor2);
            return;
        }
        LE.A0M(this, 0);
    }

    @Override // com.facebook.ads.redexgen.X.AbstractC0518Lb
    public final boolean A05() {
        return this.A05.A02();
    }

    @Override // com.facebook.ads.redexgen.X.AbstractC0518Lb
    public int getToolbarHeight() {
        return AbstractC0518Lb.A00;
    }

    @Override // com.facebook.ads.redexgen.X.AbstractC0518Lb
    public void setAdReportingVisible(boolean z) {
        this.A03.setVisibility(z ? 0 : 8);
    }

    @Override // com.facebook.ads.redexgen.X.AbstractC0518Lb
    public void setPageDetails(C1U c1u, String str, int i, C00341b c00341b) {
        this.A05.setInitialUnskippableSeconds(i);
        this.A06.setPageDetails(c1u);
        this.A03.setAdDetails(c1u, str, this.A02, this.A04);
    }

    @Override // com.facebook.ads.redexgen.X.AbstractC0518Lb
    public void setPageDetailsVisible(boolean z) {
        this.A01.removeAllViews();
        if (z) {
            RelativeLayout relativeLayout = this.A01;
            OL ol = this.A06;
            if (A08[4].charAt(4) != '3') {
                throw new RuntimeException();
            }
            String[] strArr = A08;
            strArr[2] = "uYrc95dj4mq6YR3RipRhNZPjST";
            strArr[3] = "ufyXPPKrvmASdIniU0CJIS9";
            relativeLayout.addView(ol);
        }
        C0538Lw c0538Lw = this.A05;
        String[] strArr2 = A08;
        if (strArr2[2].length() == strArr2[3].length()) {
            c0538Lw.setToolbarMessageEnabled(!z);
            return;
        }
        A08[1] = "RoBBOPMqmB8G6B1FErbRchWOJuWn3pgq";
        c0538Lw.setToolbarMessageEnabled(!z);
    }

    @Override // com.facebook.ads.redexgen.X.AbstractC0518Lb
    public void setProgress(float f) {
        this.A05.setProgress(f);
    }

    @Override // com.facebook.ads.redexgen.X.AbstractC0518Lb
    public void setProgressSpinnerInvisible(boolean z) {
        this.A05.setProgressSpinnerInvisible(z);
    }

    @Override // com.facebook.ads.redexgen.X.AbstractC0518Lb
    public void setToolbarActionMessage(String str) {
        this.A05.setToolbarMessage(str);
    }

    @Override // com.facebook.ads.redexgen.X.AbstractC0518Lb
    public void setToolbarActionMode(@ToolbarActionView$ToolbarActionMode int i) {
        this.A05.setToolbarActionMode(i);
    }

    @Override // com.facebook.ads.redexgen.X.AbstractC0518Lb
    public void setToolbarListener(InterfaceC0517La interfaceC0517La) {
        this.A00 = interfaceC0517La;
    }
}
