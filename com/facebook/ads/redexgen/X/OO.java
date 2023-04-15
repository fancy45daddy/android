package com.facebook.ads.redexgen.X;

import android.view.View;
import android.widget.FrameLayout;
import android.widget.RelativeLayout;
import androidx.annotation.Nullable;
import java.util.Map;
/* loaded from: assets/audience_network.dex */
public final class OO extends FrameLayout {
    public static final int A08 = (int) (Kd.A02 * 16.0f);
    public C9X A00;
    @Nullable
    public C0602Oj A01;
    @Nullable
    public C01756y A02;
    public JF A03;
    public C6Z A04;
    public C6A A05;
    public final C0806Wj A06;
    public final C0444Ib A07;

    /* JADX WARN: Failed to parse debug info
    java.lang.ArrayIndexOutOfBoundsException: Index 10 out of bounds for length 10
    	at jadx.plugins.input.dex.sections.debuginfo.DebugInfoParser.startVar(DebugInfoParser.java:203)
    	at jadx.plugins.input.dex.sections.debuginfo.DebugInfoParser.process(DebugInfoParser.java:135)
    	at jadx.plugins.input.dex.sections.DexCodeReader.getDebugInfo(DexCodeReader.java:118)
    	at jadx.core.dex.nodes.MethodNode.getDebugInfo(MethodNode.java:567)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.visit(DebugInfoAttachVisitor.java:39)
     */
    public final void A04(IT it, String str, Map<String, String> map) {
        A02();
        this.A02 = new C01756y(this.A06, it, this.A00, str, map);
        if (ID.A1L(this.A06)) {
            this.A01 = new C0602Oj(this.A06, it, this.A00, str, map);
        } else {
            this.A01 = null;
        }
    }

    public OO(C0806Wj c0806Wj, C0444Ib c0444Ib) {
        super(c0806Wj);
        this.A07 = c0444Ib;
        this.A06 = c0806Wj;
        setUpView(c0806Wj);
    }

    public final void A01() {
        A0e(true, 10);
    }

    public final void A02() {
        C0602Oj c0602Oj = this.A01;
        if (c0602Oj != null) {
            c0602Oj.A0A();
            this.A01 = null;
        }
        C01756y c01756y = this.A02;
        if (c01756y != null) {
            c01756y.A0g();
            this.A02 = null;
        }
    }

    public final void A03(C8O c8o) {
        getEventBus().A05(c8o);
    }

    public final void A05(EnumC0611Os enumC0611Os) {
        A0b(enumC0611Os, 13);
    }

    public final boolean A06() {
        return A0k();
    }

    public P1 getSimpleVideoView() {
        return this.A00;
    }

    public float getVolume() {
        return getVolume();
    }

    public void setPlaceholderUrl(String str) {
        this.A04.setImage(str);
    }

    private void setUpPlugins(C0806Wj c0806Wj) {
        A0X();
        this.A04 = new C6Z(c0806Wj);
        A0c(this.A04);
        this.A03 = new JF(c0806Wj, this.A07);
        A0c(new C01646h(c0806Wj));
        A0c(this.A03);
        this.A05 = new C6A(c0806Wj, true, this.A07);
        A0c(this.A05);
        A0c(new JG(this.A05, P5.A03, true, true));
        if (!A0g() && !ID.A23(c0806Wj)) {
            return;
        }
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-2, -2);
        layoutParams.addRule(10);
        layoutParams.addRule(11);
        int i = A08;
        layoutParams.setMargins(i, i, i, i);
        this.A03.setLayoutParams(layoutParams);
        addView(this.A03);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [com.facebook.ads.redexgen.X.9X] */
    private void setUpVideo(final C0806Wj c0806Wj) {
        this.A00 = new P1(c0806Wj) { // from class: com.facebook.ads.redexgen.X.9X
            @Override // android.widget.RelativeLayout, android.view.View
            public final void onMeasure(int i, int i2) {
                int newWidthSpec = View.MeasureSpec.getMode(i);
                if (newWidthSpec == 1073741824) {
                    i2 = i;
                } else {
                    int newWidthSpec2 = View.MeasureSpec.getMode(i2);
                    if (newWidthSpec2 == 1073741824) {
                        i = i2;
                    }
                }
                super.onMeasure(i, i2);
            }
        };
        setLayoutParams(new FrameLayout.LayoutParams(-1, -2));
        LE.A0K(this.A00);
        addView(this.A00);
        setOnClickListener(new ON(this));
    }

    private void setUpView(C0806Wj c0806Wj) {
        setUpVideo(c0806Wj);
        setUpPlugins(c0806Wj);
    }

    public void setVideoURI(String str) {
        setVideoURI(str);
    }

    public void setVolume(float f) {
        setVolume(f);
        this.A03.A09();
    }
}
