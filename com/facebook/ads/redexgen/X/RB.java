package com.facebook.ads.redexgen.X;

import android.content.Intent;
import android.content.res.Configuration;
import android.os.Build;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.MotionEvent;
import android.widget.FrameLayout;
import android.widget.RelativeLayout;
import androidx.annotation.Nullable;
import com.facebook.ads.internal.view.FullScreenAdToolbar;
import com.facebook.proguard.annotations.DoNotStrip;
import java.lang.ref.WeakReference;
/* loaded from: assets/audience_network.dex */
public abstract class RB extends FrameLayout implements InterfaceC0520Ld {
    public static final RelativeLayout.LayoutParams A0D = new RelativeLayout.LayoutParams(-1, -1);
    public boolean A00;
    public final AnonymousClass18 A01;
    public final C6G A02;
    public final C0806Wj A03;
    public final IT A04;
    public final C0444Ib A05;
    public final L6 A06;
    public final AbstractC0518Lb A07;
    public final InterfaceC0519Lc A08;
    public final M4 A09;
    public final C0627Pi A0A;
    public final L1 A0B;
    @DoNotStrip
    public final AbstractC0626Ph A0C;

    public abstract void A0Q();

    public abstract void A0S(AnonymousClass59 anonymousClass59);

    public abstract boolean A0T();

    public RB(C0806Wj c0806Wj, M4 m4, IT it, AnonymousClass18 anonymousClass18, C6G c6g, InterfaceC0519Lc interfaceC0519Lc) {
        super(c0806Wj);
        this.A0C = new RF(this);
        this.A06 = new L6();
        this.A00 = false;
        this.A03 = c0806Wj;
        this.A09 = m4;
        this.A04 = it;
        this.A01 = anonymousClass18;
        this.A02 = c6g;
        this.A08 = interfaceC0519Lc;
        this.A05 = new C0444Ib(this.A01.A0U(), this.A04);
        this.A0A = new C0627Pi(this, 1, new WeakReference(this.A0C), this.A03);
        this.A0A.A0W(this.A01.A0H());
        this.A0A.A0X(this.A01.A0I());
        this.A07 = A0N();
        this.A0B = new L1(this);
        this.A0B.A05(L0.A03);
    }

    private AbstractC0518Lb A0N() {
        FullScreenAdToolbar fullScreenAdToolbar = new FullScreenAdToolbar(this.A03, this.A08, this.A05, 1, this.A01.A0F());
        int A03 = this.A01.A0O().A0D().A03();
        fullScreenAdToolbar.setPageDetails(this.A01.A0R(), this.A01.A0U(), A03, this.A01.A0S());
        fullScreenAdToolbar.A04(this.A01.A0N().A01(), true);
        if (A03 < 0 && this.A01.A0O().A0M()) {
            fullScreenAdToolbar.setToolbarActionMode(4);
        }
        fullScreenAdToolbar.setToolbarListener(new RC(this));
        return fullScreenAdToolbar;
    }

    private void A0O() {
        if (this.A01.A0O().A0P()) {
            OD A0B = new OB(this.A03, this.A01.A0O().A0E(), this.A01.A0R()).A08(this.A01.A0N().A01()).A0B();
            C0446Id.A04(A0B, this.A05, EnumC0443Ia.A0U);
            addView(A0B, A0D);
            A0B.A04(new RD(this));
            return;
        }
        A0Q();
    }

    public final void A0P() {
        if (!this.A00) {
            this.A0A.A0U();
            this.A00 = true;
        }
    }

    public final void A0R(int i, AbstractRunnableC0487Ju abstractRunnableC0487Ju) {
        new KX(i, new RE(this, i, abstractRunnableC0487Ju)).A07();
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC0520Ld
    public final void A8k(Intent intent, @Nullable Bundle bundle, AnonymousClass59 anonymousClass59) {
        this.A08.A3I(this, A0D);
        A0S(anonymousClass59);
        A0O();
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC0520Ld
    public final void AEA(Bundle bundle) {
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC0520Ld
    public final boolean onActivityResult(int i, int i2, Intent intent) {
        return false;
    }

    @Override // android.view.View
    public void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
    }

    public void onDestroy() {
        this.A0B.A03();
        if (!TextUtils.isEmpty(this.A01.A0U())) {
            this.A04.A8r(this.A01.A0U(), new N2().A03(this.A0A).A02(this.A06).A05());
        }
    }

    @Override // android.view.ViewGroup
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        this.A06.A06(this.A03, motionEvent, this, this);
        return super.onInterceptTouchEvent(motionEvent);
    }

    public void setListener(InterfaceC0519Lc interfaceC0519Lc) {
    }

    public void setUpFullscreenMode(boolean z) {
        L0 l0;
        if (Build.VERSION.SDK_INT < 19) {
            return;
        }
        if (z) {
            l0 = L0.A04;
        } else {
            l0 = L0.A03;
        }
        this.A0B.A05(l0);
    }
}
