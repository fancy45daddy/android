package com.facebook.ads.redexgen.X;

import android.content.res.Configuration;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;
import android.os.Build;
import android.view.View;
import android.widget.RelativeLayout;
import androidx.annotation.Nullable;
import java.util.Map;
/* renamed from: com.facebook.ads.redexgen.X.8y  reason: invalid class name and case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public class C02268y extends RW {
    @Nullable
    public C0537Lu A00;
    @Nullable
    public InterfaceC0572Ne A01;
    @Nullable
    public OO A02;
    public boolean A03;
    public boolean A04;
    public boolean A05;
    @Nullable
    public RelativeLayout A06;
    public C0666Qv A07;
    public final C0806Wj A08;
    public final AbstractC0534Lr A09;
    public final AbstractC0501Kk A0A;
    public final K6 A0B;
    public final K2 A0C;
    public final JP A0D;
    public final String A0E;
    public final Paint A0F;
    public final Path A0G;
    public final RectF A0H;
    public final NV A0I;
    public static String[] A0J = {"dJoea1DbFsfm9GTpKIzcXYdmCRfBe4FS", "N1xc2MysRccxXRgwDgHXZSQeh7bFq7uk", "3nDu3mubCrSGPsHb", "SUxuavEQD34fwSKO8hxc7w", "hmAyL1Y1BI3zOyZEMNvfuG", "1nycCDmAbpyAo4RWRzHJ2ixoeiRT", "fh6VcnyoMwgZMcb2oBIx6", "bmD"};
    public static final int A0L = (int) (Kd.A02 * 0.0f);
    public static final int A0M = (int) (Kd.A02 * 9.0f);
    public static final int A0K = (int) (Kd.A02 * 9.0f);

    public C02268y(NV nv, boolean z, String str, C0666Qv c0666Qv) {
        super(nv, z);
        this.A0G = new Path();
        this.A0H = new RectF();
        this.A0D = new JP() { // from class: com.facebook.ads.redexgen.X.94
            /* JADX INFO: Access modifiers changed from: private */
            @Override // com.facebook.ads.redexgen.X.C8O
            /* renamed from: A00 */
            public final void A03(JQ jq) {
                if (C02268y.this.getVideoView() != null) {
                    C02268y.this.A07.A0P().setVolume(C02268y.this.getVideoView().getVolume());
                }
            }
        };
        this.A09 = new AbstractC0534Lr() { // from class: com.facebook.ads.redexgen.X.93
            /* JADX INFO: Access modifiers changed from: private */
            @Override // com.facebook.ads.redexgen.X.C8O
            /* renamed from: A00 */
            public final void A03(C6v c6v) {
                C02268y.this.A01();
                Object tag = C02268y.this.getTag(-1593835536);
                if (tag != null) {
                    C02268y.this.A07.A0N().ACZ(((Integer) tag).intValue());
                }
            }
        };
        this.A0B = new K6() { // from class: com.facebook.ads.redexgen.X.91
            /* JADX INFO: Access modifiers changed from: private */
            @Override // com.facebook.ads.redexgen.X.C8O
            /* renamed from: A00 */
            public final void A03(KV kv) {
                C02268y.this.A00();
                C02268y.this.A07.A0O().ACi(C02268y.this);
            }
        };
        this.A0A = new AbstractC0501Kk() { // from class: com.facebook.ads.redexgen.X.90
            /* JADX INFO: Access modifiers changed from: private */
            @Override // com.facebook.ads.redexgen.X.C8O
            /* renamed from: A00 */
            public final void A03(C01736s c01736s) {
                C02268y.this.A01();
                C02268y.this.A07.A0O().ACg(C02268y.this);
            }
        };
        this.A0C = new K2() { // from class: com.facebook.ads.redexgen.X.8z
            /* JADX INFO: Access modifiers changed from: private */
            @Override // com.facebook.ads.redexgen.X.C8O
            /* renamed from: A00 */
            public final void A03(K5 k5) {
                C02268y.this.A05 = true;
                C02268y.this.A02();
            }
        };
        this.A0I = nv;
        this.A07 = c0666Qv;
        this.A0E = str;
        this.A08 = nv.A05();
        setGravity(17);
        int i = A0L;
        setPadding(i, 0, i, i);
        LE.A0M(this, 0);
        setUpView(this.A08);
        this.A0F = new Paint();
        this.A0F.setColor(-16777216);
        this.A0F.setStyle(Paint.Style.FILL);
        this.A0F.setAlpha(16);
        this.A0F.setAntiAlias(true);
        if (Build.VERSION.SDK_INT < 18) {
            setLayerType(1, null);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void A00() {
        if (this.A0I.A0A() != null && this.A02 != null) {
            this.A0I.A0A().A8l(this.A02.getSimpleVideoView());
            if (ID.A1a(getContext())) {
                this.A0I.A0A().A07(false);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void A01() {
        if (this.A0I.A0A() != null) {
            this.A0I.A0A().A05();
            if (this.A02 != null) {
                this.A0I.A0A().AF5(this.A02.getSimpleVideoView());
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void A02() {
        if (this.A01 == null) {
            return;
        }
        if (!A0i() || !this.A05) {
            boolean A0i = A0i();
            String[] strArr = A0J;
            if (strArr[3].length() != strArr[4].length()) {
                throw new RuntimeException();
            }
            String[] strArr2 = A0J;
            strArr2[3] = "whWH7G9NZGoicUCMK8TGye";
            strArr2[4] = "jQqQ2QRGHP0rmsCqitHuog";
            if (A0i || !this.A04) {
                return;
            }
        }
        this.A01.A9x();
    }

    private void A03(@Nullable View view) {
        RelativeLayout.LayoutParams layoutParams;
        if (view == null || (layoutParams = (RelativeLayout.LayoutParams) view.getLayoutParams()) == null) {
            return;
        }
        layoutParams.addRule(13, -1);
        view.setLayoutParams(layoutParams);
    }

    public static void A04(View view) {
        view.setLayoutParams(new RelativeLayout.LayoutParams(-1, -2));
        LE.A0K(view);
    }

    @Override // com.facebook.ads.redexgen.X.NR
    public final boolean A0B() {
        return false;
    }

    @Override // com.facebook.ads.redexgen.X.NR
    public final boolean A0c() {
        return false;
    }

    @Override // com.facebook.ads.redexgen.X.RW
    public final void A0e() {
        OO oo;
        if (A0i() && (oo = this.A02) != null) {
            oo.A01();
        }
    }

    @Override // com.facebook.ads.redexgen.X.RW
    public final void A0f() {
        if (A0i()) {
            A0g();
            OO oo = this.A02;
            if (oo != null) {
                oo.A05(EnumC0611Os.A02);
            }
        }
    }

    @Override // com.facebook.ads.redexgen.X.RW
    public final void A0g() {
        OO oo;
        float volume = this.A07.A0P().getVolume();
        if (!A0i() || (oo = this.A02) == null) {
            return;
        }
        float newVolume = oo.getVolume();
        if (volume != newVolume) {
            this.A02.setVolume(volume);
        }
    }

    @Override // com.facebook.ads.redexgen.X.RW
    public final boolean A0h() {
        OO oo;
        return A0i() && (oo = this.A02) != null && oo.A06();
    }

    @Override // com.facebook.ads.redexgen.X.RW
    public final boolean A0i() {
        return this.A03;
    }

    public final void A0j(Map<String, String> extraParams) {
        OO oo = this.A02;
        if (oo != null) {
            oo.A02();
            if (A0i()) {
                this.A02.A04(getAdEventManager(), this.A0E, extraParams);
            }
        }
    }

    @Nullable
    public final OO getVideoView() {
        return this.A02;
    }

    @Override // com.facebook.ads.redexgen.X.NR, android.view.View
    public final void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        this.A0G.reset();
        this.A0H.set(0.0f, 0.0f, getWidth(), getHeight());
        int i = 0;
        int radius = getResources().getConfiguration().orientation;
        boolean z = radius == 1;
        if (z) {
            i = A0K;
        }
        this.A0G.addRoundRect(this.A0H, i, i, Path.Direction.CW);
        canvas.drawPath(this.A0G, this.A0F);
        RectF rectF = this.A0H;
        int radius2 = A0L;
        float f = radius2;
        int width = getWidth();
        int radius3 = A0L;
        float f2 = width - radius3;
        int height = getHeight();
        int radius4 = A0L;
        rectF.set(f, 0.0f, f2, height - radius4);
        if (z) {
            i = A0M;
        }
        this.A0G.addRoundRect(this.A0H, i, i, Path.Direction.CW);
        canvas.clipPath(this.A0G);
        super.onDraw(canvas);
    }

    public void setImageUrl(String str) {
        C0537Lu c0537Lu = this.A00;
        if (c0537Lu != null) {
            c0537Lu.setVisibility(0);
            new AsyncTaskC0685Ro(this.A00, this.A08).A04().A06(new C0680Rj(this)).A07(str);
        }
        OO oo = this.A02;
        if (oo != null) {
            oo.setVisibility(8);
        }
    }

    public void setIsVideo(boolean z) {
        this.A03 = z;
    }

    public void setOnAssetsLoadedListener(InterfaceC0572Ne interfaceC0572Ne) {
        this.A01 = interfaceC0572Ne;
    }

    public void setUpImageView(C0806Wj c0806Wj) {
        this.A00 = new C0537Lu(c0806Wj);
        A04(this.A00);
    }

    public void setUpMediaContainer(C0806Wj c0806Wj) {
        this.A06 = new RelativeLayout(c0806Wj);
        A04(this.A06);
        C0537Lu c0537Lu = this.A00;
        if (c0537Lu != null) {
            this.A06.addView(c0537Lu);
            A03(this.A00);
        }
        OO oo = this.A02;
        if (oo != null) {
            this.A06.addView(oo);
            A03(this.A02);
        }
        addView(this.A06);
    }

    public void setUpVideoView(C0806Wj c0806Wj) {
        this.A02 = new OO(c0806Wj, new C0444Ib(this.A0E, getAdEventManager()));
        A04(this.A02);
    }

    private void setUpView(C0806Wj c0806Wj) {
        setUpImageView(c0806Wj);
        setUpVideoView(c0806Wj);
        setUpMediaContainer(c0806Wj);
    }

    public void setVideoPlaceholderUrl(String str) {
        OO oo = this.A02;
        if (oo != null) {
            oo.setPlaceholderUrl(str);
        }
    }

    public void setVideoUrl(String str) {
        C0537Lu c0537Lu = this.A00;
        if (c0537Lu != null) {
            if (A0J[5].length() == 10) {
                throw new RuntimeException();
            }
            A0J[2] = "s54OOOYMcUndmM7F";
            c0537Lu.setVisibility(8);
        }
        OO oo = this.A02;
        if (oo != null) {
            oo.setVisibility(0);
            this.A02.setVideoURI(str);
            this.A02.A03(this.A0D);
            this.A02.A03(this.A09);
            this.A02.A03(this.A0B);
            this.A02.A03(this.A0A);
            this.A02.A03(this.A0C);
        }
    }
}
