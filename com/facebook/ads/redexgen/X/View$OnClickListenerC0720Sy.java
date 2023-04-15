package com.facebook.ads.redexgen.X;

import a.a.j;
import android.util.Log;
import android.view.MotionEvent;
import android.view.View;
import com.facebook.ads.internal.util.activity.ActivityUtils;
import java.util.Arrays;
import java.util.Map;
/* renamed from: com.facebook.ads.redexgen.X.Sy  reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public class View$OnClickListenerC0720Sy implements View.OnClickListener, View.OnLongClickListener, View.OnTouchListener, C7E {
    public static byte[] A02;
    public final C0806Wj A00;
    public final /* synthetic */ C0718Sw A01;

    static {
        A03();
    }

    public static String A00(int i, int i2, int i3) {
        byte[] copyOfRange = Arrays.copyOfRange(A02, i, i + i2);
        for (int i4 = 0; i4 < copyOfRange.length; i4++) {
            copyOfRange[i4] = (byte) ((copyOfRange[i4] ^ i3) ^ 59);
        }
        return new String(copyOfRange);
    }

    public static void A03() {
        A02 = new byte[]{43, 14, 74, 9, 11, 4, 4, 5, 30, 74, 8, 15, 74, 9, 6, 3, 9, 1, 15, 14, 74, 8, 15, 12, 5, 24, 15, 74, 3, 30, 74, 3, 25, 74, 28, 3, 15, 29, 15, 14, 68, 66, 109, 104, 98, 106, 114, 33, 105, 96, 113, 113, 100, 111, 100, 101, 33, 117, 110, 110, 33, 103, 96, 114, 117, 47, 20, 16, 19, 39, 54, 59, 55, 60, 49, 55, 28, 55, 38, 37, 61, 32, 57, 56, 25, 86, 2, 25, 3, 21, 30, 86, 18, 23, 2, 23, 86, 4, 19, 21, 25, 4, 18, 19, 18, 90, 86, 6, 26, 19, 23, 5, 19, 86, 19, 24, 5, 3, 4, 19, 86, 2, 25, 3, 21, 30, 86, 19, 0, 19, 24, 2, 5, 86, 4, 19, 23, 21, 30, 86, 2, 30, 19, 86, 23, 18, 86, 32, 31, 19, 1, 86, 20, 15, 86, 4, 19, 2, 3, 4, 24, 31, 24, 17, 86, 16, 23, 26, 5, 19, 86, 31, 16, 86, 15, 25, 3, 86, 31, 24, 2, 19, 4, 21, 19, 6, 2, 86, 2, 30, 19, 86, 19, 0, 19, 24, 2, 88, 33, 39, 60, 94, 68, 89};
    }

    /* JADX WARN: Failed to parse debug info
    java.lang.ArrayIndexOutOfBoundsException: Index 9 out of bounds for length 9
    	at jadx.plugins.input.dex.sections.debuginfo.DebugInfoParser.startVar(DebugInfoParser.java:203)
    	at jadx.plugins.input.dex.sections.debuginfo.DebugInfoParser.process(DebugInfoParser.java:125)
    	at jadx.plugins.input.dex.sections.DexCodeReader.getDebugInfo(DexCodeReader.java:118)
    	at jadx.core.dex.nodes.MethodNode.getDebugInfo(MethodNode.java:567)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.visit(DebugInfoAttachVisitor.java:39)
     */
    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        L6 l6;
        C0806Wj c0806Wj;
        L6 l62;
        C0806Wj c0806Wj2;
        C0806Wj c0806Wj3;
        L6 l63;
        L6 l64;
        if (C0480Jm.A02(this)) {
            return;
        }
        try {
            l6 = this.A01.A0f;
            boolean A08 = l6.A08();
            String A00 = A00(66, 17, j.AppCompatTheme_textColorSearchUrl);
            if (!A08) {
                Log.e(A00, A00(83, j.AppCompatTheme_windowFixedHeightMinor, 77));
            }
            c0806Wj = this.A01.A0c;
            int A0F = ID.A0F(c0806Wj);
            if (A0F >= 0) {
                l63 = this.A01.A0f;
                if (l63.A03() < A0F) {
                    l64 = this.A01.A0f;
                    if (l64.A07()) {
                        Log.e(A00, A00(41, 25, 58));
                        return;
                    } else {
                        Log.e(A00, A00(0, 41, 81));
                        return;
                    }
                }
            }
            l62 = this.A01.A0f;
            c0806Wj2 = this.A01.A0c;
            if (l62.A09(c0806Wj2)) {
                if (this.A01.A0a != null) {
                    this.A01.A0a.A0N(A01());
                    return;
                }
                return;
            }
            c0806Wj3 = this.A01.A0c;
            if (!ID.A16(c0806Wj3)) {
                A05(A01());
                return;
            }
            if (this.A01.A0a != null) {
                this.A01.A0a.A0Q(A01());
            }
            Kc.A00(new DialogInterface$OnClickListenerC0456In(this), new DialogInterface$OnClickListenerC0457Io(this), ActivityUtils.A00());
        } catch (Throwable th) {
            C0480Jm.A00(th, this);
        }
    }

    public View$OnClickListenerC0720Sy(C0718Sw c0718Sw, C0806Wj c0806Wj) {
        this.A01 = c0718Sw;
        this.A00 = c0806Wj;
    }

    public /* synthetic */ View$OnClickListenerC0720Sy(C0718Sw c0718Sw, C0806Wj c0806Wj, T7 t7) {
        this(c0718Sw, c0806Wj);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public Map<String, String> A01() {
        C0627Pi c0627Pi;
        L6 l6;
        EnumC0463Iu enumC0463Iu;
        boolean z;
        boolean z2;
        EnumC0463Iu enumC0463Iu2;
        N2 n2 = new N2();
        c0627Pi = this.A01.A0R;
        N2 A03 = n2.A03(c0627Pi);
        l6 = this.A01.A0f;
        Map<String, String> A05 = A03.A02(l6).A05();
        enumC0463Iu = this.A01.A0I;
        if (enumC0463Iu != null) {
            enumC0463Iu2 = this.A01.A0I;
            A05.put(A00(201, 3, 11), String.valueOf(enumC0463Iu2.A04()));
        }
        z = this.A01.A0W;
        if (z) {
            z2 = this.A01.A0W;
            A05.put(A00(198, 3, j.AppCompatTheme_windowFixedWidthMajor), String.valueOf(z2));
        }
        return A05;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void A05(Map<String, String> extraData) {
        if (this.A01.A0a != null) {
            this.A01.A0a.A0M(extraData);
        }
    }

    @Override // com.facebook.ads.redexgen.X.C7E
    public final C0806Wj A5Z() {
        return this.A00;
    }

    @Override // android.view.View.OnLongClickListener
    public final boolean onLongClick(View view) {
        View view2;
        N0 n0;
        N0 n02;
        View view3;
        View view4;
        N0 n03;
        N0 n04;
        view2 = this.A01.A04;
        if (view2 != null) {
            n0 = this.A01.A0L;
            if (n0 != null) {
                n02 = this.A01.A0L;
                view3 = this.A01.A04;
                int width = view3.getWidth();
                view4 = this.A01.A04;
                n02.setBounds(0, 0, width, view4.getHeight());
                n03 = this.A01.A0L;
                n04 = this.A01.A0L;
                n03.A0D(!n04.A0E());
                return true;
            }
        }
        return false;
    }

    @Override // android.view.View.OnTouchListener
    public final boolean onTouch(View view, MotionEvent motionEvent) {
        L6 l6;
        C0806Wj c0806Wj;
        View view2;
        View.OnTouchListener onTouchListener;
        View.OnTouchListener onTouchListener2;
        l6 = this.A01.A0f;
        c0806Wj = this.A01.A0c;
        view2 = this.A01.A04;
        l6.A06(c0806Wj, motionEvent, view2, view);
        onTouchListener = this.A01.A02;
        if (onTouchListener != null) {
            onTouchListener2 = this.A01.A02;
            if (onTouchListener2.onTouch(view, motionEvent)) {
                return true;
            }
        }
        return false;
    }
}
