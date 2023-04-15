package com.facebook.ads.redexgen.X;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;
import android.os.Build;
import android.view.View;
import android.widget.RelativeLayout;
import java.util.Map;
/* renamed from: com.facebook.ads.redexgen.X.8q  reason: invalid class name and case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public abstract class AbstractC02188q extends RW {
    public RelativeLayout A00;
    public C0537Lu A01;
    public InterfaceC0572Ne A02;
    public C0666Qv A03;
    public OO A04;
    public boolean A05;
    public boolean A06;
    public boolean A07;
    public final Paint A08;
    public final Path A09;
    public final RectF A0A;
    public final C0806Wj A0B;
    public final AbstractC0534Lr A0C;
    public final AbstractC0501Kk A0D;
    public final K6 A0E;
    public final K2 A0F;
    public final JP A0G;
    public final String A0H;
    public static final int A0J = (int) (Kd.A02 * 1.0f);
    public static final int A0K = (int) (Kd.A02 * 4.0f);
    public static final int A0I = (int) (Kd.A02 * 6.0f);

    public abstract void A0j(C0806Wj c0806Wj);

    public AbstractC02188q(NV nv, boolean z, String str, C0666Qv c0666Qv) {
        super(nv, z);
        this.A09 = new Path();
        this.A0A = new RectF();
        this.A0G = new JP() { // from class: com.facebook.ads.redexgen.X.8v
            /* JADX INFO: Access modifiers changed from: private */
            @Override // com.facebook.ads.redexgen.X.C8O
            /* renamed from: A00 */
            public final void A03(JQ jq) {
                C0666Qv c0666Qv2;
                c0666Qv2 = AbstractC02188q.this.A03;
                c0666Qv2.A0P().setVolume(AbstractC02188q.this.getVideoView().getVolume());
            }
        };
        this.A0C = new AbstractC0534Lr() { // from class: com.facebook.ads.redexgen.X.8u
            /* JADX INFO: Access modifiers changed from: private */
            @Override // com.facebook.ads.redexgen.X.C8O
            /* renamed from: A00 */
            public final void A03(C6v c6v) {
                C0666Qv c0666Qv2;
                c0666Qv2 = AbstractC02188q.this.A03;
                c0666Qv2.A0N().ACZ(((Integer) AbstractC02188q.this.getTag(-1593835536)).intValue());
            }
        };
        this.A0E = new K6() { // from class: com.facebook.ads.redexgen.X.8t
            /* JADX INFO: Access modifiers changed from: private */
            @Override // com.facebook.ads.redexgen.X.C8O
            /* renamed from: A00 */
            public final void A03(KV kv) {
                C0666Qv c0666Qv2;
                c0666Qv2 = AbstractC02188q.this.A03;
                c0666Qv2.A0O().ACi(AbstractC02188q.this);
            }
        };
        this.A0D = new AbstractC0501Kk() { // from class: com.facebook.ads.redexgen.X.8s
            /* JADX INFO: Access modifiers changed from: private */
            @Override // com.facebook.ads.redexgen.X.C8O
            /* renamed from: A00 */
            public final void A03(C01736s c01736s) {
                C0666Qv c0666Qv2;
                c0666Qv2 = AbstractC02188q.this.A03;
                c0666Qv2.A0O().ACg(AbstractC02188q.this);
            }
        };
        this.A0F = new K2() { // from class: com.facebook.ads.redexgen.X.8r
            /* JADX INFO: Access modifiers changed from: private */
            @Override // com.facebook.ads.redexgen.X.C8O
            /* renamed from: A00 */
            public final void A03(K5 k5) {
                AbstractC02188q.this.A07 = true;
                AbstractC02188q.this.A01();
            }
        };
        this.A03 = c0666Qv;
        this.A0H = str;
        this.A0B = nv.A05();
        setGravity(17);
        int i = A0J;
        setPadding(i, 0, i, i);
        LE.A0M(this, 0);
        setUpView(this.A0B);
        this.A08 = new Paint();
        this.A08.setColor(-16777216);
        this.A08.setStyle(Paint.Style.FILL);
        this.A08.setAlpha(16);
        this.A08.setAntiAlias(true);
        if (Build.VERSION.SDK_INT < 18) {
            setLayerType(1, null);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void A01() {
        if (this.A02 == null) {
            return;
        }
        if ((A0i() && this.A07) || (!A0i() && this.A06)) {
            this.A02.A9x();
        }
    }

    private void A02(View view) {
        view.setLayoutParams(new RelativeLayout.LayoutParams(-1, -2));
        LE.A0K(view);
    }

    @Override // com.facebook.ads.redexgen.X.NR
    public boolean A0B() {
        return false;
    }

    @Override // com.facebook.ads.redexgen.X.NR
    public final boolean A0c() {
        return false;
    }

    @Override // com.facebook.ads.redexgen.X.RW
    public final void A0e() {
        if (A0i()) {
            this.A04.A01();
        }
    }

    @Override // com.facebook.ads.redexgen.X.RW
    public final void A0f() {
        if (A0i()) {
            A0g();
            this.A04.A05(EnumC0611Os.A02);
        }
    }

    @Override // com.facebook.ads.redexgen.X.RW
    public final void A0g() {
        float volume = this.A03.A0P().getVolume();
        if (A0i()) {
            float newVolume = this.A04.getVolume();
            if (volume != newVolume) {
                this.A04.setVolume(volume);
            }
        }
    }

    @Override // com.facebook.ads.redexgen.X.RW
    public final boolean A0h() {
        return A0i() && this.A04.A06();
    }

    @Override // com.facebook.ads.redexgen.X.RW
    public final boolean A0i() {
        return this.A05;
    }

    public final void A0k(Map<String, String> extraParams) {
        this.A04.A02();
        if (A0i()) {
            this.A04.A04(getAdEventManager(), this.A0H, extraParams);
        }
    }

    public final RelativeLayout getMediaContainer() {
        return this.A00;
    }

    public final OO getVideoView() {
        return this.A04;
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        this.A09.reset();
        this.A0A.set(0.0f, 0.0f, getWidth(), getHeight());
        Path path = this.A09;
        RectF rectF = this.A0A;
        int i = A0I;
        path.addRoundRect(rectF, i, i, Path.Direction.CW);
        canvas.drawPath(this.A09, this.A08);
        this.A0A.set(A0J, 0.0f, getWidth() - A0J, getHeight() - A0J);
        Path path2 = this.A09;
        RectF rectF2 = this.A0A;
        int i2 = A0K;
        path2.addRoundRect(rectF2, i2, i2, Path.Direction.CW);
        canvas.clipPath(this.A09);
        super.onDraw(canvas);
    }

    public void setAdTitleAndDescription(String str, String str2) {
        getTitleDescContainer().A01(str, str2, null, true, false);
    }

    public void setCTAInfo(C1L c1l, Map<String, String> extraData) {
        getCtaButton().setCta(c1l, this.A0H, extraData);
    }

    public void setImageUrl(String str) {
        this.A01.setVisibility(0);
        this.A04.setVisibility(8);
        new AsyncTaskC0685Ro(this.A01, this.A0B).A04().A06(new RV(this)).A07(str);
    }

    public void setIsVideo(boolean z) {
        this.A05 = z;
    }

    public void setOnAssetsLoadedListener(InterfaceC0572Ne interfaceC0572Ne) {
        this.A02 = interfaceC0572Ne;
    }

    public void setUpImageView(C0806Wj c0806Wj) {
        this.A01 = new C0537Lu(c0806Wj);
        A02(this.A01);
    }

    public void setUpMediaContainer(C0806Wj c0806Wj) {
        this.A00 = new RelativeLayout(c0806Wj);
        A02(this.A00);
    }

    public void setUpVideoView(C0806Wj c0806Wj) {
        this.A04 = new OO(c0806Wj, new C0444Ib(this.A0H, getAdEventManager()));
        A02(this.A04);
    }

    private void setUpView(C0806Wj c0806Wj) {
        setUpImageView(c0806Wj);
        setUpVideoView(c0806Wj);
        setUpMediaContainer(c0806Wj);
        this.A00.addView(this.A01);
        this.A00.addView(this.A04);
        A0j(c0806Wj);
    }

    public void setVideoPlaceholderUrl(String str) {
        this.A04.setPlaceholderUrl(str);
    }

    public void setVideoUrl(String str) {
        this.A01.setVisibility(8);
        this.A04.setVisibility(0);
        this.A04.setVideoURI(str);
        this.A04.A03(this.A0G);
        this.A04.A03(this.A0C);
        this.A04.A03(this.A0E);
        this.A04.A03(this.A0D);
        this.A04.A03(this.A0F);
    }
}
