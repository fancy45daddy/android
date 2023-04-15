package com.facebook.ads.redexgen.X;

import android.content.Intent;
import android.content.res.Configuration;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.MotionEvent;
import android.widget.LinearLayout;
import androidx.annotation.Nullable;
import com.facebook.ads.internal.adapters.datamodels.AdInfo;
import com.facebook.ads.internal.view.ToolbarActionView$ToolbarActionMode;
import com.facebook.proguard.annotations.DoNotStrip;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
/* renamed from: com.facebook.ads.redexgen.X.77  reason: invalid class name */
/* loaded from: assets/audience_network.dex */
public final class AnonymousClass77 extends SH {
    public static byte[] A0E;
    public static String[] A0F = {"hEO5MspmmQwWZDjfO9hYkGtE8t8ljCUN", "895GOd6GqHS2SDNwtQvAqIE", "zBXblOu1CdgXx49mdyV8flA", "GxqIbNjcrUQMSJiuMkyJv1mwkudVYaGP", "be3ZgXhlaup3yXbKLr41yKjcTusIQNjx", "HLi8FTj59ZkYUe8FmXrpO0CEflvtIm0o", "7bereGXxKpIS6kk2UNHV0kt11i4QSfeP", "LRvrjmvhZNKPrr4qRukG9JYrfPQqD7wd"};
    public static final int A0G;
    public static final int A0H;
    public static final int A0I;
    public static final int A0J;
    public static final int A0K;
    public int A00;
    public int A01;
    @Nullable
    public LinearLayout A02;
    public C0865Ys A03;
    public C6G A04;
    @Nullable
    public C2M A05;
    @Nullable
    public NH A06;
    public C0666Qv A07;
    @DoNotStrip
    public AbstractC0626Ph A08;
    public C0627Pi A09;
    public String A0A;
    public List<OM> A0B;
    public final C0806Wj A0C;
    public final L6 A0D;

    public static String A07(int i, int i2, int i3) {
        byte[] copyOfRange = Arrays.copyOfRange(A0E, i, i + i2);
        int i4 = 0;
        while (true) {
            int length = copyOfRange.length;
            String[] strArr = A0F;
            if (strArr[0].charAt(22) != strArr[6].charAt(22)) {
                throw new RuntimeException();
            }
            String[] strArr2 = A0F;
            strArr2[5] = "I427OJiZERIl1pgFYs7VIJxgJMuHqTWY";
            strArr2[4] = "m1VK8a3APoHjuOOKlTc7gi9yCeUy6Tbh";
            if (i4 >= length) {
                return new String(copyOfRange);
            }
            copyOfRange[i4] = (byte) ((copyOfRange[i4] ^ i3) ^ 74);
            i4++;
        }
    }

    public static void A09() {
        A0E = new byte[]{118, 115, 72, 115, 118, 99, 118, 72, 117, 98, 121, 115, 123, 114};
    }

    /* JADX WARN: Code restructure failed: missing block: B:20:0x011f, code lost:
        if (r5 != false) goto L23;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x0121, code lost:
        r4.A0C.A09().AFD(r4.A05, ((com.facebook.ads.redexgen.X.SH) r4).A08.A0U(), false);
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x0132, code lost:
        r4.A0U(r4.A02, false, r18);
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x0137, code lost:
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x013f, code lost:
        if (r5 != false) goto L23;
     */
    /* JADX WARN: Failed to parse debug info
    java.lang.ArrayIndexOutOfBoundsException: Index 20 out of bounds for length 20
    	at jadx.plugins.input.dex.sections.debuginfo.DebugInfoParser.startVar(DebugInfoParser.java:203)
    	at jadx.plugins.input.dex.sections.debuginfo.DebugInfoParser.process(DebugInfoParser.java:125)
    	at jadx.plugins.input.dex.sections.DexCodeReader.getDebugInfo(DexCodeReader.java:118)
    	at jadx.core.dex.nodes.MethodNode.getDebugInfo(MethodNode.java:567)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.visit(DebugInfoAttachVisitor.java:39)
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final void A0B(int r18, @androidx.annotation.Nullable android.os.Bundle r19) {
        /*
            Method dump skipped, instructions count: 391
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.ads.redexgen.X.AnonymousClass77.A0B(int, android.os.Bundle):void");
    }

    static {
        A09();
        A0G = (int) (Kd.A02 * 48.0f);
        A0H = (int) (Kd.A02 * 8.0f);
        A0I = (int) (Kd.A02 * 8.0f);
        A0K = (int) (Kd.A02 * 56.0f);
        A0J = (int) (Kd.A02 * 12.0f);
    }

    public AnonymousClass77(C0806Wj c0806Wj, IT it, C6G c6g, InterfaceC0519Lc interfaceC0519Lc, C0865Ys c0865Ys) {
        super(c0806Wj, it, interfaceC0519Lc, c0865Ys);
        this.A0D = new L6();
        this.A04 = c6g;
        this.A0C = c0806Wj;
    }

    private final void A0A() {
        LinearLayout linearLayout = this.A02;
        if (linearLayout != null) {
            linearLayout.removeAllViews();
            this.A02 = null;
        }
        C2M c2m = this.A05;
        if (c2m != null) {
            c2m.removeAllViews();
            this.A05 = null;
        }
        NH nh = this.A06;
        if (nh != null) {
            nh.removeAllViews();
            this.A06 = null;
        }
    }

    private void A0C(C0865Ys c0865Ys) {
        this.A03 = c0865Ys;
        this.A0A = this.A03.A0U();
        this.A00 = this.A03.A0H();
        this.A01 = this.A03.A0I();
        List<C1B> A0c = this.A03.A0c();
        List<AdInfo> adInfoList = new ArrayList<>(A0c.size());
        this.A0B = adInfoList;
        for (int i = 0; i < A0c.size(); i++) {
            List<OM> list = this.A0B;
            int i2 = A0c.size();
            list.add(new OM(i, i2, A0c.get(i)));
        }
    }

    private void A0D(C0666Qv c0666Qv) {
        new C0340Dx().A0G(this.A05);
        c0666Qv.A0Z(new C0656Ql(this));
        this.A06 = new NH(this.A0C, super.A05.A01(), this.A0B.size());
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-1, A0I);
        layoutParams.setMargins(0, A0J, 0, 0);
        this.A06.setLayoutParams(layoutParams);
    }

    @Override // com.facebook.ads.redexgen.X.SH
    public final boolean A0a() {
        return false;
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC0520Ld
    public final void A8k(Intent intent, Bundle bundle, AnonymousClass59 anonymousClass59) {
        C0865Ys dataBundle = (C0865Ys) intent.getSerializableExtra(A07(0, 14, 93));
        A0V(anonymousClass59);
        A0C(dataBundle);
        A0B(anonymousClass59.A0H().getResources().getConfiguration().orientation, bundle);
        anonymousClass59.A0K(new C0655Qk(this, anonymousClass59));
        C0865Ys dataBundle2 = super.A08;
        int A03 = dataBundle2.A0O().A0D().A03();
        if (A03 > 0) {
            A0T(A03);
        }
    }

    @Override // com.facebook.ads.redexgen.X.SH, com.facebook.ads.redexgen.X.InterfaceC0520Ld
    public final void ABd(boolean z) {
        super.ABd(z);
        C0666Qv c0666Qv = this.A07;
        if (c0666Qv != null) {
            c0666Qv.A0Q();
        }
    }

    @Override // com.facebook.ads.redexgen.X.SH, com.facebook.ads.redexgen.X.InterfaceC0520Ld
    public final void AC2(boolean z) {
        super.AC2(z);
        this.A07.A0R();
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC0520Ld
    public final void AEA(Bundle bundle) {
        C0666Qv c0666Qv = this.A07;
        if (c0666Qv != null) {
            c0666Qv.A0X(bundle);
        }
    }

    @Override // com.facebook.ads.redexgen.X.SH
    @ToolbarActionView$ToolbarActionMode
    public int getCloseButtonStyle() {
        return 0;
    }

    @Override // android.view.View
    public final void onConfigurationChanged(Configuration configuration) {
        Bundle bundle = new Bundle();
        AEA(bundle);
        A0A();
        A0B(configuration.orientation, bundle);
        super.onConfigurationChanged(configuration);
    }

    @Override // com.facebook.ads.redexgen.X.SH, com.facebook.ads.redexgen.X.InterfaceC0520Ld
    public final void onDestroy() {
        super.onDestroy();
        if (ID.A1K(this.A0C)) {
            this.A0C.A09().AF4(this.A05);
        }
        if (!TextUtils.isEmpty(this.A0A)) {
            super.A0A.A8r(this.A0A, new N2().A03(this.A09).A02(this.A0D).A05());
        }
        A0A();
        this.A09.A0V();
        this.A09 = null;
        this.A08 = null;
        this.A0B = null;
    }

    @Override // android.view.ViewGroup
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        this.A0D.A06(this.A0C, motionEvent, this, this);
        return super.onInterceptTouchEvent(motionEvent);
    }
}
