package com.facebook.ads.redexgen.X;

import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.TextView;
import androidx.annotation.Nullable;
import com.facebook.ads.AdOptionsView;
import com.facebook.ads.MediaView;
import com.facebook.ads.NativeAd;
import java.util.ArrayList;
/* renamed from: com.facebook.ads.redexgen.X.Qb  reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public final class C0646Qb extends FrameLayout implements InterfaceC0600Oh {
    @Nullable
    public TextView A00;
    @Nullable
    public TextView A01;
    @Nullable
    public TextView A02;
    @Nullable
    public TextView A03;
    public final MediaView A04;
    public final NativeAd A05;
    public final C0601Oi A06;
    public final ArrayList<View> A07;
    public static String[] A08 = {"LrUXeZd5oXG5wJ7", "S6ePTdxfK6c7yhvbHMQjZqIgQsLDz3QO", "YqVXoEdDoNpK3nL0El5", "Exhg7LXIw6HgSAmcccR052cOKtX3WF", "LN", "59F20xOEewuTmZzPatOKMeF6XI6ZvB1j", "IRBrDKvf2o0dBHWjf99N02m12yrR0Bg7", "KZ90h8EmVWfLUNKv0pT"};
    public static final int A0E = (int) (Kd.A02 * 6.0f);
    public static final int A0D = (int) (Kd.A02 * 8.0f);
    public static final int A0C = (int) (Kd.A02 * 12.0f);
    public static final int A0A = (int) (Kd.A02 * 350.0f);
    public static final int A09 = (int) (Kd.A02 * 250.0f);
    public static final int A0B = (int) (Kd.A02 * 175.0f);

    public C0646Qb(C0806Wj c0806Wj, NativeAd nativeAd, C0462It c0462It, EnumC0463Iu enumC0463Iu, NI ni, MediaView mediaView, AdOptionsView adOptionsView) {
        super(c0806Wj);
        this.A07 = new ArrayList<>();
        this.A05 = nativeAd;
        this.A04 = mediaView;
        this.A06 = new C0601Oi(c0806Wj, this.A05, c0462It, ni, adOptionsView);
        C0601Oi c0601Oi = this.A06;
        int i = A0C;
        c0601Oi.setPadding(i, i, i, A0E);
        addView(this.A06, new FrameLayout.LayoutParams(-1, -2));
        if (enumC0463Iu == EnumC0463Iu.A09 || enumC0463Iu == EnumC0463Iu.A0B) {
            A07(c0462It);
        }
        addView((View) this.A04, (ViewGroup.LayoutParams) new FrameLayout.LayoutParams(-1, -2));
        if (enumC0463Iu != EnumC0463Iu.A0B || this.A05.getAdCreativeType() != NativeAd.AdCreativeType.CAROUSEL) {
            A06(c0462It);
            A04(c0462It);
            A05(c0462It);
        }
        this.A07.add(ni);
        this.A07.add(mediaView);
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x003f  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x005b  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0091  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private int A00() {
        /*
            r8 = this;
            android.widget.TextView r0 = r8.A03
            r2 = 0
            if (r0 == 0) goto L8f
            int r0 = r0.getVisibility()
            if (r0 != 0) goto L8f
            android.widget.TextView r0 = r8.A03
            int r7 = r0.getMeasuredHeight()
        L11:
            android.widget.TextView r4 = r8.A02
            java.lang.String[] r1 = com.facebook.ads.redexgen.X.C0646Qb.A08
            r0 = 1
            r1 = r1[r0]
            r0 = 0
            char r1 = r1.charAt(r0)
            r0 = 107(0x6b, float:1.5E-43)
            if (r1 == r0) goto L97
            java.lang.String[] r3 = com.facebook.ads.redexgen.X.C0646Qb.A08
            java.lang.String r1 = "SrhbzBCrZmwJCsE1GN19GBhRpshhKBl4"
            r0 = 6
            r3[r0] = r1
            java.lang.String r1 = "lZXGEU0s5y97LRskCQS4IC0Q6rEMlB8o"
            r0 = 5
            r3[r0] = r1
            if (r4 == 0) goto L8d
            int r0 = r4.getVisibility()
            if (r0 != 0) goto L8d
            android.widget.TextView r0 = r8.A02
            int r6 = r0.getMeasuredHeight()
        L3b:
            android.widget.TextView r0 = r8.A00
            if (r0 == 0) goto L8b
            int r0 = r0.getVisibility()
            if (r0 != 0) goto L8b
            android.widget.TextView r0 = r8.A00
            int r5 = r0.getMeasuredHeight()
        L4b:
            android.widget.TextView r4 = r8.A01
            java.lang.String[] r1 = com.facebook.ads.redexgen.X.C0646Qb.A08
            r0 = 1
            r1 = r1[r0]
            r0 = 0
            char r1 = r1.charAt(r0)
            r0 = 107(0x6b, float:1.5E-43)
            if (r1 == r0) goto L91
            java.lang.String[] r3 = com.facebook.ads.redexgen.X.C0646Qb.A08
            java.lang.String r1 = "nRuc5lutSXPKh9f7kKzdW2kIhLu3nB9m"
            r0 = 6
            r3[r0] = r1
            java.lang.String r1 = "FuxAmHJZMOFMUG38wB3yXnFuBZuRMBRE"
            r0 = 5
            r3[r0] = r1
            if (r4 == 0) goto L7b
            int r0 = r4.getVisibility()
            if (r0 != 0) goto L7b
            android.widget.TextView r0 = r8.A01
            int r2 = r0.getMeasuredHeight()
            int r0 = com.facebook.ads.redexgen.X.C0646Qb.A0C
            int r2 = r2 + r0
            int r0 = com.facebook.ads.redexgen.X.C0646Qb.A0D
            int r2 = r2 + r0
        L7b:
            int r1 = r8.getMeasuredHeight()
            com.facebook.ads.redexgen.X.Oi r0 = r8.A06
            int r0 = r0.getMeasuredHeight()
            int r1 = r1 - r0
            int r1 = r1 - r7
            int r1 = r1 - r6
            int r1 = r1 - r5
            int r1 = r1 - r2
            return r1
        L8b:
            r5 = 0
            goto L4b
        L8d:
            r6 = 0
            goto L3b
        L8f:
            r7 = 0
            goto L11
        L91:
            java.lang.RuntimeException r0 = new java.lang.RuntimeException
            r0.<init>()
            throw r0
        L97:
            java.lang.RuntimeException r0 = new java.lang.RuntimeException
            r0.<init>()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.ads.redexgen.X.C0646Qb.A00():int");
    }

    private void A01() {
        TextView textView = this.A03;
        if (textView != null) {
            textView.setLines(1);
        }
        TextView textView2 = this.A02;
        if (textView2 != null) {
            textView2.setLines(1);
        }
        TextView textView3 = this.A00;
        if (textView3 != null) {
            textView3.setLines(1);
        }
    }

    private void A02(int i) {
        LE.A0N(this.A04, i > A0B ? 0 : 8);
        LE.A0N(this.A03, i > A0A ? 0 : 8);
        LE.A0N(this.A00, i <= A09 ? 8 : 0);
    }

    public static void A03(int i, int i2, TextView... textViewArr) {
        for (TextView textView : textViewArr) {
            if (textView != null && textView.getVisibility() == 0) {
                int A04 = LE.A04(textView, i2);
                textView.setLines(A04 + 1);
                textView.measure(i, View.MeasureSpec.makeMeasureSpec(textView.getMeasuredHeight() + (textView.getLineHeight() * A04), 1073741824));
                i2 -= textView.getLineHeight() * A04;
            }
        }
    }

    private void A04(C0462It c0462It) {
        if (this.A05.getAdBodyText() != null && !this.A05.getAdBodyText().trim().isEmpty()) {
            this.A00 = new TextView(getContext());
            c0462It.A06(this.A00);
            this.A00.setText(this.A05.getAdBodyText());
            TextView textView = this.A00;
            int i = A0C;
            textView.setPadding(i, 0, i, 0);
            addView(this.A00, new FrameLayout.LayoutParams(-1, -2));
        }
    }

    private void A05(C0462It c0462It) {
        if (this.A05.hasCallToAction()) {
            this.A01 = new TextView(getContext());
            LE.A0K(this.A01);
            c0462It.A05(this.A01);
            this.A01.setText(this.A05.getAdCallToAction());
            TextView textView = this.A01;
            int i = A0D;
            textView.setPadding(i, i, i, i);
            FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, -2);
            int i2 = A0D;
            layoutParams.setMargins(i2, 0, i2, 0);
            addView(this.A01, layoutParams);
            this.A07.add(this.A01);
        }
    }

    private void A06(C0462It c0462It) {
        if (this.A05.getAdHeadline() != null && !this.A05.getAdHeadline().trim().isEmpty()) {
            this.A02 = new TextView(getContext());
            c0462It.A07(this.A02);
            this.A02.setText(this.A05.getAdHeadline());
            TextView textView = this.A02;
            int i = A0C;
            textView.setPadding(i, A0D, i, 0);
            addView(this.A02, new FrameLayout.LayoutParams(-1, -2));
        }
    }

    private void A07(C0462It c0462It) {
        if (this.A05.getAdLinkDescription() != null && !this.A05.getAdLinkDescription().trim().isEmpty()) {
            this.A03 = new TextView(getContext());
            c0462It.A06(this.A03);
            this.A03.setText(this.A05.getAdLinkDescription());
            TextView textView = this.A03;
            int i = A0C;
            textView.setPadding(i, 0, i, A0D);
            addView(this.A03, new FrameLayout.LayoutParams(-1, -2));
        }
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC0600Oh
    public View getView() {
        return this;
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC0600Oh
    public ArrayList<View> getViewsForInteraction() {
        return this.A07;
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        C0601Oi c0601Oi = this.A06;
        int top = c0601Oi.getMeasuredHeight();
        c0601Oi.layout(i, i2, i3, top + i2);
        int top2 = this.A06.getMeasuredHeight();
        int i5 = i2 + top2;
        TextView textView = this.A03;
        if (textView != null) {
            int top3 = textView.getVisibility();
            if (top3 == 0) {
                int measuredHeight = this.A03.getMeasuredHeight();
                int top4 = i5 + measuredHeight;
                this.A03.layout(i, i5, i3, top4);
                i5 += measuredHeight;
            }
        }
        MediaView mediaView = this.A04;
        int top5 = mediaView.getMeasuredHeight();
        mediaView.layout(i, i5, i3, top5 + i5);
        int top6 = this.A04.getMeasuredHeight();
        int i6 = i5 + top6;
        TextView textView2 = this.A02;
        if (textView2 != null) {
            int top7 = textView2.getMeasuredHeight();
            textView2.layout(i, i6, i3, top7 + i6);
            int top8 = this.A02.getMeasuredHeight();
            i6 += top8;
        }
        TextView textView3 = this.A00;
        if (textView3 != null) {
            int top9 = textView3.getVisibility();
            if (top9 == 0) {
                TextView textView4 = this.A00;
                if (A08[1].charAt(0) == 'k') {
                    throw new RuntimeException();
                }
                A08[3] = "gjv6mmFqHT0";
                int top10 = textView4.getMeasuredHeight();
                textView4.layout(i, i6, i3, top10 + i6);
            }
        }
        TextView textView5 = this.A01;
        if (textView5 != null) {
            int top11 = textView5.getMeasuredHeight();
            int i7 = i4 - top11;
            int top12 = A0C;
            textView5.layout(A0C + i, i7 - top12, i3 - top12, i4 - top12);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:15:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:9:0x002f  */
    @Override // android.widget.FrameLayout, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void onMeasure(int r5, int r6) {
        /*
            r4 = this;
            int r0 = android.view.View.MeasureSpec.getSize(r6)
            r4.A02(r0)
            r4.A01()
            super.onMeasure(r5, r6)
            int r2 = r4.A00()
            com.facebook.ads.MediaView r0 = r4.A04
            int r0 = r0.getMediaWidth()
            if (r0 == 0) goto L21
            com.facebook.ads.MediaView r0 = r4.A04
            int r0 = r0.getMediaHeight()
            if (r0 != 0) goto L46
        L21:
            r3 = r2
        L22:
            com.facebook.ads.MediaView r1 = r4.A04
            r0 = 1073741824(0x40000000, float:2.0)
            int r0 = android.view.View.MeasureSpec.makeMeasureSpec(r3, r0)
            r1.measure(r5, r0)
            if (r3 >= r2) goto L45
            int r2 = r2 - r3
            r0 = 3
            android.widget.TextView[] r3 = new android.widget.TextView[r0]
            r1 = 0
            android.widget.TextView r0 = r4.A02
            r3[r1] = r0
            r1 = 1
            android.widget.TextView r0 = r4.A00
            r3[r1] = r0
            r1 = 2
            android.widget.TextView r0 = r4.A03
            r3[r1] = r0
            A03(r5, r2, r3)
        L45:
            return
        L46:
            com.facebook.ads.MediaView r0 = r4.A04
            com.facebook.ads.internal.api.MediaViewApi r0 = r0.getMediaViewApi()
            com.facebook.ads.redexgen.X.XC r0 = (com.facebook.ads.redexgen.X.XC) r0
            boolean r0 = r0.A0N()
            if (r0 == 0) goto L56
            r3 = r2
            goto L22
        L56:
            com.facebook.ads.MediaView r0 = r4.A04
            int r0 = r0.getMediaHeight()
            float r1 = (float) r0
            com.facebook.ads.MediaView r0 = r4.A04
            int r0 = r0.getMediaWidth()
            float r0 = (float) r0
            float r1 = r1 / r0
            com.facebook.ads.MediaView r0 = r4.A04
            int r0 = r0.getMeasuredWidth()
            float r0 = (float) r0
            float r0 = r0 * r1
            int r0 = (int) r0
            int r3 = java.lang.Math.min(r0, r2)
            goto L22
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.ads.redexgen.X.C0646Qb.onMeasure(int, int):void");
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC0600Oh
    public final void unregisterView() {
        this.A05.unregisterView();
    }
}
