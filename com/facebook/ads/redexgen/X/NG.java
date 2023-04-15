package com.facebook.ads.redexgen.X;

import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.RelativeLayout;
import androidx.annotation.Nullable;
import com.facebook.ads.RewardData;
/* loaded from: assets/audience_network.dex */
public final class NG extends FrameLayout {
    public static String[] A07 = {"Lu0oG19N", "JNY", "Ev6F9eDhg42RHlCeRuJfEtiFO07AluFn", "qSbaO4FE34QcNqD1YWxCxyT8wr5s9kWw", "hZddA1hSD7Y", "v9TnLSaOxYneacolptRVdRHaZQ0ab06L", "iyW9tyIIQvF7WQz3LOxNHXxa074IcWbN", "vzh"};
    @Nullable
    public AbstractC0518Lb A00;
    public final AnonymousClass18 A01;
    public final C0806Wj A02;
    public final InterfaceC0519Lc A03;
    public final NF A04;
    @Nullable
    public final P1 A05;
    public final View[] A06;

    public NG(NV nv, AnonymousClass18 anonymousClass18, @Nullable P1 p1, IX ix, N5 n5, InterfaceC0519Lc interfaceC0519Lc, NF nf) {
        this(nv, anonymousClass18, p1, interfaceC0519Lc, nf, ix, n5);
    }

    public NG(NV nv, AnonymousClass18 anonymousClass18, @Nullable P1 p1, InterfaceC0519Lc interfaceC0519Lc, NF nf, View... viewArr) {
        this(nv.A05(), nv.A08(), anonymousClass18, p1, interfaceC0519Lc, nf, viewArr);
    }

    public NG(C0806Wj c0806Wj, @Nullable AbstractC0518Lb abstractC0518Lb, AnonymousClass18 anonymousClass18, @Nullable P1 p1, InterfaceC0519Lc interfaceC0519Lc, NF nf, View... viewArr) {
        super(c0806Wj);
        this.A02 = c0806Wj;
        this.A00 = abstractC0518Lb;
        this.A01 = anonymousClass18;
        this.A06 = viewArr;
        this.A03 = interfaceC0519Lc;
        this.A05 = p1;
        this.A04 = nf;
        A03();
    }

    private void A03() {
        String title;
        RewardData A0M = this.A01.A0M();
        if (A0M == null) {
            title = this.A01.A0Q().A05();
        } else {
            title = this.A01.A0Q().A06(A0M.getCurrency(), A0M.getQuantity());
        }
        C0528Ll c0528Ll = new C0528Ll(this.A02, -1, -16777216, title, null, this.A01.A0Q().A04(), this.A01.A0Q().A03(), LN.A01(LM.REWARD_ICON));
        c0528Ll.A02.setOnClickListener(new ND(this));
        c0528Ll.A01.setOnClickListener(new NE(this));
        addView(c0528Ll, new RelativeLayout.LayoutParams(-1, -1));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void A04() {
        P1 p1 = this.A05;
        if (p1 != null) {
            p1.A0a(EnumC0606On.A07);
        }
        this.A04.A9r();
        if (!this.A01.A0O().A0O()) {
            this.A01.A0h(this.A03);
        }
    }

    public final void A07(ViewGroup viewGroup) {
        View[] viewArr;
        P1 p1 = this.A05;
        if (p1 != null && !p1.A0j()) {
            this.A05.A0f(false, false, 11);
            LE.A0N(this.A05, 4);
        }
        AbstractC0518Lb abstractC0518Lb = this.A00;
        String[] strArr = A07;
        if (strArr[7].length() != strArr[1].length()) {
            throw new RuntimeException();
        }
        A07[0] = "vGH3jzSu";
        if (abstractC0518Lb != null) {
            LE.A0H(abstractC0518Lb);
        }
        for (View view : this.A06) {
            view.clearAnimation();
            LE.A0N(view, 4);
        }
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-1, -1);
        viewGroup.addView(this, layoutParams);
        this.A04.ABK();
    }
}
