package com.facebook.ads.redexgen.X;

import android.view.View;
import android.widget.RelativeLayout;
import androidx.annotation.Nullable;
import java.lang.ref.WeakReference;
/* renamed from: com.facebook.ads.redexgen.X.Op  reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public final class C0608Op extends RelativeLayout {
    public static String[] A03 = {"Z7YDROQZDOzGgLZ6JRzm0VB6SZj4zDor", "PEDxZ1hmcJv2HtokqPZuboN03zqPqfuu", "ZN3aiXgGzfL", "UoQOzdqMFdmvRVk6jZTbQbhJ01APWmUd", "BWydKlRDXGFiivyHlYlBLR13h8bygoZy", "calSGpe10AH6YV6oPZJsWkhcYoOFDSm8", "CqyCvSup05V", "6oqVw1T1HmkJfSZKyFG8rr7XXeYSScI0"};
    @Nullable
    public C6Z A00;
    public WeakReference<InterfaceC0607Oo> A01;
    public final InterfaceC0622Pd A02;

    public C0608Op(C0806Wj c0806Wj, InterfaceC0622Pd interfaceC0622Pd) {
        super(c0806Wj);
        this.A02 = interfaceC0622Pd;
        LE.A0J((View) this.A02);
        addView(this.A02.getView(), new RelativeLayout.LayoutParams(-1, -1));
    }

    public final void A00(M1 m1) {
        addView(m1, new RelativeLayout.LayoutParams(-1, -1));
        this.A00 = (C6Z) m1;
    }

    public final void A01(M1 m1) {
        LE.A0J(m1);
        this.A00 = null;
    }

    public final boolean A02() {
        return this.A02.A84();
    }

    public int getCurrentPosition() {
        return this.A02.getCurrentPosition();
    }

    @Override // android.widget.RelativeLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        ((View) this.A02).layout(0, 0, getWidth(), getHeight());
        C6Z c6z = this.A00;
        if (c6z != null) {
            c6z.layout(0, 0, getWidth(), getHeight());
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:28:0x00a4, code lost:
        if (r6 > r5) goto L16;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x00a6, code lost:
        r4 = (r0 * r8) / r9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x00aa, code lost:
        if (r6 > r5) goto L16;
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x00e0, code lost:
        if (r5 == Integer.MIN_VALUE) goto L29;
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x00e2, code lost:
        if (r0 <= r6) goto L42;
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x00e4, code lost:
        r0 = r6;
     */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x00e7, code lost:
        if (r5 == Integer.MIN_VALUE) goto L29;
     */
    @Override // android.widget.RelativeLayout, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void onMeasure(int r12, int r13) {
        /*
            Method dump skipped, instructions count: 260
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.ads.redexgen.X.C0608Op.onMeasure(int, int):void");
    }

    public void setViewImplInflationListener(InterfaceC0607Oo interfaceC0607Oo) {
        this.A01 = new WeakReference<>(interfaceC0607Oo);
    }
}
