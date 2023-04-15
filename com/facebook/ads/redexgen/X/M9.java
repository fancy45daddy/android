package com.facebook.ads.redexgen.X;

import android.widget.FrameLayout;
import androidx.annotation.Nullable;
/* loaded from: assets/audience_network.dex */
public abstract class M9 extends FrameLayout {
    public int A00;
    public C2F A01;
    public C2G A02;
    @Nullable
    public C2H A03;
    public final C2D A04;
    public final C0806Wj A05;
    public final IT A06;
    @Nullable
    public final InterfaceC0519Lc A07;
    @Nullable
    public final InterfaceC0520Ld A08;
    public final String A09;
    @Nullable
    public final C1U A0A;
    public final MB A0B;

    public abstract void A0L();

    public abstract void A0M();

    public abstract void A0N(C2H c2h, C2F c2f);

    public abstract void A0O(C2H c2h, C2F c2f);

    public abstract boolean A0P();

    public M9(C0806Wj c0806Wj, IT it, String str) {
        this(c0806Wj, it, str, null, null, null);
    }

    public M9(C0806Wj c0806Wj, IT it, String str, @Nullable C1U c1u, @Nullable InterfaceC0520Ld interfaceC0520Ld, @Nullable InterfaceC0519Lc interfaceC0519Lc) {
        super(c0806Wj);
        this.A00 = 0;
        this.A01 = C2F.A04;
        this.A03 = null;
        this.A0B = new S4(this);
        this.A05 = c0806Wj;
        this.A06 = it;
        this.A08 = interfaceC0520Ld;
        this.A07 = interfaceC0519Lc;
        this.A09 = str;
        this.A0A = c1u;
        this.A04 = C2E.A00(this.A05.A00());
    }

    public static /* synthetic */ int A00(M9 m9) {
        int i = m9.A00;
        m9.A00 = i + 1;
        return i;
    }

    public static /* synthetic */ int A01(M9 m9) {
        int i = m9.A00;
        m9.A00 = i - 1;
        return i;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void A0B() {
        if (this.A02.A0A()) {
            this.A06.A8n(this.A09, this.A02.A02());
            this.A02.A03();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void A0C() {
        this.A03 = null;
        this.A02.A05();
        A0L();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void A0D(C2H c2h) {
        this.A02.A08(this.A01);
        A0N(c2h, this.A01);
        C00270u.A01(this.A05).A0L();
        if (A0P()) {
            A0B();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void A0E(C2H c2h) {
        this.A03 = c2h;
        this.A02.A09(this.A01, this.A00);
        A0O(c2h, this.A01);
    }

    public final void A0J() {
        A0B();
    }

    public final void A0K() {
        this.A02 = new C2G(new C0444Ib(this.A09, this.A06));
        InterfaceC0520Ld interfaceC0520Ld = this.A08;
        if (interfaceC0520Ld != null) {
            interfaceC0520Ld.ABd(true);
        }
        A0C();
    }
}
