package com.facebook.ads.redexgen.X;

import a.a.j;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebChromeClient;
import android.webkit.WebViewClient;
import java.util.Arrays;
/* loaded from: assets/audience_network.dex */
public class RI extends AbstractC0560Ms {
    public static byte[] A01;
    public final /* synthetic */ C0589Nw A00;

    static {
        A04();
    }

    public static String A03(int i, int i2, int i3) {
        byte[] copyOfRange = Arrays.copyOfRange(A01, i, i + i2);
        for (int i4 = 0; i4 < copyOfRange.length; i4++) {
            copyOfRange[i4] = (byte) ((copyOfRange[i4] ^ i3) ^ j.AppCompatTheme_windowFixedHeightMajor);
        }
        return new String(copyOfRange);
    }

    public static void A04() {
        A01 = new byte[]{5, 24, 15, 0, 12, 8, 2, 62, 18, 5, 10, 62, 13, 0, 24, 4, 19, 62, 2, 14, 15, 21, 4, 15, 21, 62, 9, 4, 8, 6, 9, 21, 12, 17, 6, 9, 5, 1, 11, 55, 27, 12, 3, 55, 4, 9, 17, 13, 26, 55, 11, 7, 6, 28, 13, 6, 28, 55, 31, 1, 12, 28, 0};
    }

    /* JADX WARN: Failed to parse debug info
    java.lang.ArrayIndexOutOfBoundsException: Index 14 out of bounds for length 14
    	at jadx.plugins.input.dex.sections.debuginfo.DebugInfoParser.startVar(DebugInfoParser.java:203)
    	at jadx.plugins.input.dex.sections.debuginfo.DebugInfoParser.process(DebugInfoParser.java:125)
    	at jadx.plugins.input.dex.sections.DexCodeReader.getDebugInfo(DexCodeReader.java:118)
    	at jadx.core.dex.nodes.MethodNode.getDebugInfo(MethodNode.java:567)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.visit(DebugInfoAttachVisitor.java:39)
     */
    @Override // android.webkit.WebView, android.widget.AbsoluteLayout, android.view.View
    public final void onMeasure(int i, int i2) {
        int dynamicWebViewWidth = getDynamicWebViewWidth();
        int dynamicWebViewHeight = getDynamicWebViewHeight();
        if (dynamicWebViewWidth <= 0 || dynamicWebViewHeight <= 0) {
            super.onMeasure(i, i2);
            return;
        }
        float f = dynamicWebViewWidth / dynamicWebViewHeight;
        int mode = View.MeasureSpec.getMode(i);
        int mode2 = View.MeasureSpec.getMode(i2);
        boolean z = mode != 1073741824;
        boolean z2 = mode2 != 1073741824;
        int i3 = getResources().getDisplayMetrics().widthPixels;
        int i4 = getResources().getDisplayMetrics().heightPixels;
        ViewGroup viewGroup = (ViewGroup) getParent();
        if (viewGroup != null) {
            i4 = Integer.MAX_VALUE;
            i3 = viewGroup.getWidth() != 0 ? viewGroup.getWidth() : Integer.MAX_VALUE;
            if (viewGroup.getHeight() != 0) {
                i4 = viewGroup.getHeight();
            }
        }
        int A012 = A01(dynamicWebViewWidth, i3, i);
        int A013 = A01(dynamicWebViewHeight, i4, i2);
        if ((z2 || z) && Math.abs((A012 / A013) - f) > 1.0E-7d) {
            boolean z3 = false;
            if (z2) {
                A013 = (int) (A012 / f);
                z3 = true;
            }
            if (!z3 && z) {
                A012 = (int) (A013 * f);
            }
        }
        setMeasuredDimension(A012, A013);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RI(C0589Nw c0589Nw, C0806Wj c0806Wj) {
        super(c0806Wj);
        this.A00 = c0589Nw;
        getSettings().setAllowFileAccess(true);
        setBackgroundColor(0);
    }

    private int A01(int i, int i2, int i3) {
        int specSize = View.MeasureSpec.getMode(i3);
        int specMode = View.MeasureSpec.getSize(i3);
        if (specSize == Integer.MIN_VALUE) {
            int result = Math.min(i, specMode);
            return Math.min(result, i2);
        } else if (specSize != 0) {
            if (specSize != 1073741824) {
                return i;
            }
            return specMode;
        } else {
            return Math.min(i, i2);
        }
    }

    @Override // com.facebook.ads.redexgen.X.AbstractC0560Ms
    public final WebChromeClient A0D() {
        return new C0584Nr(this.A00);
    }

    @Override // com.facebook.ads.redexgen.X.AbstractC0560Ms
    public final WebViewClient A0E() {
        return new C0585Ns(this.A00);
    }

    private int getDynamicWebViewHeight() {
        return C0589Nw.A01(this.A00).A0d().optInt(A03(0, 32, 19));
    }

    private int getDynamicWebViewWidth() {
        return C0589Nw.A01(this.A00).A0d().optInt(A03(32, 31, 26));
    }

    @Override // android.webkit.WebView, android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        if (C0589Nw.A06(this.A00) != null) {
            C0589Nw.A06(this.A00).ACR(this, motionEvent);
        }
        return super.onTouchEvent(motionEvent);
    }
}
