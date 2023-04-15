package com.facebook.ads.redexgen.X;

import android.os.Build;
import android.transition.ChangeBounds;
import android.transition.Explode;
import android.transition.TransitionSet;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
/* loaded from: assets/audience_network.dex */
public final class S3 extends M9 {
    public static final int A03 = (int) (Kd.A02 * 8.0f);
    public final RelativeLayout A00;
    public final C2D A01;
    public final C0806Wj A02;

    public S3(C0806Wj c0806Wj, IT it, String str, C1U c1u, InterfaceC0520Ld interfaceC0520Ld, InterfaceC0519Lc interfaceC0519Lc) {
        super(c0806Wj, it, str, c1u, interfaceC0520Ld, interfaceC0519Lc);
        this.A02 = c0806Wj;
        this.A01 = C2E.A00(c0806Wj.A00());
        this.A00 = new RelativeLayout(getContext());
        addView(this.A00, new RelativeLayout.LayoutParams(-1, -1));
        LE.A0M(this.A00, -1728053248);
        this.A00.setOnClickListener(new ME(this));
    }

    public static RelativeLayout.LayoutParams A0B(boolean z) {
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-1, z ? -1 : -2);
        layoutParams.addRule(12);
        return layoutParams;
    }

    private void A0C() {
        if (Build.VERSION.SDK_INT >= 21) {
            TransitionSet transitionSet = new TransitionSet();
            transitionSet.setOrdering(0);
            transitionSet.addTransition(new ChangeBounds()).addTransition(new Explode());
            LE.A0V(this, transitionSet);
            return;
        }
        LE.A0T(this);
    }

    @Override // com.facebook.ads.redexgen.X.M9
    public final void A0L() {
        C2H A0A = this.A01.A0A();
        MO mo = new MO(this.A02);
        mo.setInfo(LM.HIDE_AD, this.A01.A0H(), this.A01.A0G());
        mo.setOnClickListener(new MF(this));
        C2H A0B = this.A01.A0B();
        MO mo2 = new MO(this.A02);
        mo2.setInfo(LM.REPORT_AD, this.A01.A0L(), this.A01.A0K());
        mo2.setOnClickListener(new MG(this));
        MO mo3 = new MO(this.A02);
        mo3.setInfo(LM.AD_CHOICES_ICON, this.A01.A0M(), "");
        mo3.setOnClickListener(new MH(this));
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-1, -2);
        LinearLayout linearLayout = new LinearLayout(getContext());
        linearLayout.setClickable(true);
        linearLayout.setOrientation(1);
        int i = A03;
        linearLayout.setPadding(i * 2, i, i * 2, i);
        LE.A0M(linearLayout, -1);
        if (!A0A.A05().isEmpty()) {
            linearLayout.addView(mo, layoutParams);
        }
        if (!A0B.A05().isEmpty()) {
            linearLayout.addView(mo2, layoutParams);
        }
        linearLayout.addView(mo3, layoutParams);
        A0C();
        this.A00.removeAllViews();
        this.A00.addView(linearLayout, A0B(false));
    }

    @Override // com.facebook.ads.redexgen.X.M9
    public final void A0M() {
        LE.A0I(this);
        this.A00.removeAllViews();
        LE.A0J(this);
    }

    @Override // com.facebook.ads.redexgen.X.M9
    public final void A0N(C2H c2h, C2F c2f) {
        String A0E;
        int i;
        if (c2f == C2F.A04) {
            return;
        }
        boolean z = c2f == C2F.A05;
        M7 m7 = new M7(this.A02, this.A0B);
        if (z) {
            A0E = this.A01.A0F();
        } else {
            A0E = this.A01.A0E();
        }
        M7 A0E2 = m7.A0I(A0E).A0H(this.A01.A0D()).A0F(c2h.A04()).A0E(z ? LM.REPORT_AD : LM.HIDE_AD);
        if (z) {
            i = -552389;
        } else {
            i = -13272859;
        }
        M8 adHiddenView = A0E2.A0D(i).A0G(this.A0A != null ? this.A0A.A01() : "").A0M();
        LE.A0M(adHiddenView, -1);
        LE.A0T(this);
        this.A00.removeAllViews();
        this.A00.addView(adHiddenView, A0B(true));
    }

    @Override // com.facebook.ads.redexgen.X.M9
    public final void A0O(C2H c2h, C2F c2f) {
        String A0H;
        boolean z = c2f == C2F.A05;
        C0806Wj c0806Wj = this.A02;
        MB mb = this.A0B;
        if (z) {
            A0H = this.A01.A0L();
        } else {
            A0H = this.A01.A0H();
        }
        MR mr = new MR(c0806Wj, c2h, mb, A0H, z ? LM.REPORT_AD : LM.HIDE_AD);
        mr.setClickable(true);
        LE.A0M(mr, -1);
        int i = A03;
        mr.setPadding(i * 2, i, i * 2, i);
        A0C();
        this.A00.removeAllViews();
        this.A00.addView(mr, A0B(false));
    }

    @Override // com.facebook.ads.redexgen.X.M9
    public final boolean A0P() {
        return false;
    }
}
