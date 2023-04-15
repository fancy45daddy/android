package com.facebook.ads.redexgen.X;

import android.net.Uri;
import android.os.Handler;
import android.util.AttributeSet;
import android.view.TextureView;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RelativeLayout;
import android.widget.Toast;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
/* loaded from: assets/audience_network.dex */
public class P1 extends RelativeLayout implements InterfaceC0625Pg, InterfaceC0604Ol, InterfaceC0623Pe {
    public static byte[] A0E;
    public static String[] A0F = {"bTF0mPynjITMPKd7AWnGFE0wjuUHqGk", "NLuteA0O4hImypGMVaagZ7KROvpQko", "vHIsSgA1dNPe0TxNLDw8T5r", "Tu3OEd7", "fTm", "FLX2LFKD3Z9kyRG7iyj3Ajj18EKg1", "ES7oyLysdjBWPeOJZDQ9P8Sn", "e8"};
    public static final C0533Lq A0G;
    public static final KV A0H;
    public static final K5 A0I;
    public static final C0477Jj A0J;
    public static final C0474Jg A0K;
    public static final JQ A0L;
    public static final JO A0M;
    public static final JN A0N;
    public int A00;
    public C0444Ib A01;
    public C0608Op A02;
    public boolean A03;
    public boolean A04;
    public boolean A05;
    public boolean A06;
    public final Handler A07;
    public final Handler A08;
    public final View.OnTouchListener A09;
    public final C0806Wj A0A;
    public final C8N<C8O, C8M> A0B;
    public final List<InterfaceC0612Ot> A0C;
    public final InterfaceC0622Pd A0D;

    public static String A0F(int i, int i2, int i3) {
        byte[] copyOfRange = Arrays.copyOfRange(A0E, i, i + i2);
        for (int i4 = 0; i4 < copyOfRange.length; i4++) {
            copyOfRange[i4] = (byte) ((copyOfRange[i4] - i3) - 103);
        }
        return new String(copyOfRange);
    }

    public static void A0I() {
        byte[] bArr = {4, 87, 73, 71, 4, 88, 83, 88, 69, 80, 4, 91, 69, 88, 71, 76, 4, 88, 77, 81, 73, 38, 88, 85, 85, 72, 81, 87, 79, 92, 3, 68, 87, 3};
        if (A0F[6].length() != 24) {
            throw new RuntimeException();
        }
        String[] strArr = A0F;
        strArr[5] = "dnbQEbQJ0095hjHrUlDt4BBpkj0Wp";
        strArr[7] = "GI";
        A0E = bArr;
    }

    static {
        A0I();
        A0I = new K5();
        A0G = new C0533Lq();
        A0J = new C0477Jj();
        A0K = new C0474Jg();
        A0H = new KV();
        A0L = new JQ();
        A0N = new JN();
        A0M = new JO();
    }

    public P1(C0806Wj c0806Wj) {
        super(c0806Wj);
        this.A0C = new ArrayList();
        this.A07 = new Handler();
        this.A08 = new Handler();
        this.A0B = new C8N<>();
        this.A05 = true;
        this.A00 = 200;
        this.A09 = new View$OnTouchListenerC0603Ok(this);
        this.A0A = c0806Wj;
        if (A0S(c0806Wj)) {
            this.A0D = new TextureView$SurfaceTextureListenerC0418Gz(c0806Wj);
        } else {
            this.A0D = new TextureView$SurfaceTextureListenerC0412Gt(c0806Wj);
        }
        A0G();
    }

    public P1(C0806Wj c0806Wj, AttributeSet attributeSet) {
        super(c0806Wj, attributeSet);
        this.A0C = new ArrayList();
        this.A07 = new Handler();
        this.A08 = new Handler();
        this.A0B = new C8N<>();
        this.A05 = true;
        this.A00 = 200;
        this.A09 = new View$OnTouchListenerC0603Ok(this);
        this.A0A = c0806Wj;
        if (A0S(c0806Wj)) {
            this.A0D = new TextureView$SurfaceTextureListenerC0418Gz(c0806Wj, attributeSet);
        } else {
            this.A0D = new TextureView$SurfaceTextureListenerC0412Gt(c0806Wj, attributeSet);
        }
        A0G();
    }

    public P1(C0806Wj c0806Wj, AttributeSet attributeSet, int i) {
        super(c0806Wj, attributeSet, i);
        this.A0C = new ArrayList();
        this.A07 = new Handler();
        this.A08 = new Handler();
        this.A0B = new C8N<>();
        this.A05 = true;
        this.A00 = 200;
        this.A09 = new View$OnTouchListenerC0603Ok(this);
        this.A0A = c0806Wj;
        if (A0S(c0806Wj)) {
            this.A0D = new TextureView$SurfaceTextureListenerC0418Gz(c0806Wj, attributeSet, i);
        } else {
            this.A0D = new TextureView$SurfaceTextureListenerC0412Gt(c0806Wj, attributeSet, i);
        }
        A0G();
    }

    public static /* synthetic */ K5 A0C() {
        K5 k5 = A0I;
        if (A0F[0].length() != 31) {
            throw new RuntimeException();
        }
        A0F[6] = "XnBln0F0zo0j2g49JSScdoR2";
        return k5;
    }

    private void A0G() {
        this.A06 = ID.A0o(this.A0A);
        this.A0A.A0D().A2q();
        this.A0D.setRequestedVolume(1.0f);
        this.A0D.setVideoStateChangeListener(this);
        this.A02 = new C0608Op(this.A0A, this.A0D);
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-1, -1);
        layoutParams.addRule(13);
        addView(this.A02, layoutParams);
        setOnTouchListener(this.A09);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void A0H() {
        this.A07.postDelayed(new C0630Pl(this), this.A00);
    }

    private final void A0J() {
        for (InterfaceC0612Ot plugin : this.A0C) {
            if (plugin instanceof M1) {
                A0Q((M1) plugin);
            }
            plugin.A8l(this);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void A0K(int i) {
        if (ID.A0r(this.A0A)) {
            C0806Wj c0806Wj = this.A0A;
            Toast.makeText(c0806Wj, A0F(21, 13, 124) + (i / 1000.0f) + A0F(0, 21, 125), 1).show();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void A0L(EnumC0443Ia enumC0443Ia) {
        C0444Ib c0444Ib = this.A01;
        if (c0444Ib == null) {
            return;
        }
        c0444Ib.A02(enumC0443Ia, null);
    }

    private void A0P(InterfaceC0612Ot interfaceC0612Ot) {
        if (interfaceC0612Ot instanceof M1) {
            A0R((M1) interfaceC0612Ot);
        }
        interfaceC0612Ot.AF5(this);
    }

    private void A0Q(M1 m1) {
        if (m1.getParent() == null) {
            if (m1 instanceof C6Z) {
                this.A02.A00(m1);
            } else {
                addView(m1);
            }
        }
    }

    private void A0R(M1 m1) {
        if (m1 instanceof C6Z) {
            this.A02.A01(m1);
        } else {
            LE.A0J(m1);
        }
    }

    private boolean A0S(C0806Wj c0806Wj) {
        return ID.A2A(c0806Wj, PS.A03());
    }

    public final void A0V() {
        this.A0D.setVideoStateChangeListener(null);
        this.A0D.destroy();
    }

    public final void A0W() {
        if (A0i()) {
            return;
        }
        this.A0D.A7s();
    }

    public final void A0X() {
        Iterator<InterfaceC0612Ot> it = this.A0C.iterator();
        while (true) {
            boolean hasNext = it.hasNext();
            if (A0F[0].length() != 31) {
                throw new RuntimeException();
            }
            A0F[0] = "GYUlZXdJo7nruMh2UHaMalRUd7rYm0D";
            if (hasNext) {
                A0P(it.next());
            } else {
                this.A0C.clear();
                String[] strArr = A0F;
                if (strArr[4].length() != strArr[3].length()) {
                    String[] strArr2 = A0F;
                    strArr2[4] = "dBG";
                    strArr2[3] = "pEPub8w";
                    return;
                }
                return;
            }
        }
    }

    public final void A0Y(int i) {
        this.A07.removeCallbacksAndMessages(null);
        this.A0D.seekTo(i);
    }

    public final void A0Z(int i) {
        this.A0D.AEu(i);
    }

    public final void A0a(EnumC0606On enumC0606On) {
        P6 p6 = new P6(this);
        if (this.A06) {
            L8.A00(p6);
        } else {
            Handler handler = this.A08;
            if (A0F[6].length() != 24) {
                throw new RuntimeException();
            }
            A0F[6] = "kK0l9LoMdPIpLA2D0gOeof4W";
            handler.post(p6);
        }
        this.A0D.AEi(enumC0606On.A02());
    }

    public final void A0b(EnumC0611Os enumC0611Os, int i) {
        if (this.A03 && this.A0D.getState() == EnumC0624Pf.A06) {
            this.A03 = false;
        }
        this.A0D.AEn(enumC0611Os, i);
    }

    public final void A0c(InterfaceC0612Ot interfaceC0612Ot) {
        this.A0C.add(interfaceC0612Ot);
    }

    public final void A0d(InterfaceC0612Ot interfaceC0612Ot) {
        this.A0C.remove(interfaceC0612Ot);
        A0P(interfaceC0612Ot);
    }

    public final void A0e(boolean z, int i) {
        if (A0i()) {
            return;
        }
        this.A0D.ACz(z, i);
    }

    public final void A0f(boolean z, boolean z2, int i) {
        this.A05 = z2;
        A0e(z, i);
    }

    public final boolean A0g() {
        return this.A0D.A83();
    }

    public final boolean A0h() {
        return getVolume() == 0.0f;
    }

    public final boolean A0i() {
        return getState() == EnumC0624Pf.A05;
    }

    public final boolean A0j() {
        return A0i() && this.A0D.A8Y();
    }

    public final boolean A0k() {
        return getState() == EnumC0624Pf.A0A;
    }

    public final boolean A0l() {
        return this.A06;
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC0604Ol
    public final boolean A8Q() {
        return A0S(this.A0A);
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC0604Ol
    public final boolean A8T() {
        return this.A04;
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC0625Pg
    public final void AAk(final long j, final long j2, final long j3, final float f) {
        if (!ID.A1L(this.A0A)) {
            return;
        }
        this.A0B.A02(new M0(j, j2, j3, f) { // from class: com.facebook.ads.redexgen.X.6u
        });
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC0625Pg
    public final void ABL() {
        A0e(true, 4);
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC0625Pg
    public final void ABM() {
        A0b(EnumC0611Os.A04, 6);
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC0625Pg
    public final void ACA(int i, int i2) {
        P8 p8 = new P8(this, i, i2);
        if (this.A06) {
            L8.A00(p8);
        } else {
            this.A08.post(p8);
        }
        A0H();
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC0625Pg
    public final void ACm(EnumC0624Pf enumC0624Pf) {
        int currentPositionInMillis = getCurrentPositionInMillis();
        int currentPositionMS = getDuration();
        P9 p9 = new P9(this, enumC0624Pf, currentPositionInMillis, currentPositionMS);
        if (this.A06) {
            L8.A00(p9);
        } else {
            this.A08.post(p9);
        }
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC0604Ol
    public int getCurrentPositionInMillis() {
        return this.A0D.getCurrentPosition();
    }

    public int getDuration() {
        return this.A0D.getDuration();
    }

    @NonNull
    public C8N<C8O, C8M> getEventBus() {
        return this.A0B;
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC0604Ol
    public long getInitialBufferTime() {
        return this.A0D.getInitialBufferTime();
    }

    public EnumC0624Pf getState() {
        return this.A0D.getState();
    }

    public Handler getStateHandler() {
        return this.A08;
    }

    public TextureView getTextureView() {
        return (TextureView) this.A0D;
    }

    public int getVideoHeight() {
        return this.A0D.getVideoHeight();
    }

    public int getVideoProgressReportIntervalMs() {
        return this.A00;
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC0604Ol
    public EnumC0611Os getVideoStartReason() {
        return this.A0D.getStartReason();
    }

    public View getVideoView() {
        return this.A02;
    }

    public int getVideoWidth() {
        return this.A0D.getVideoWidth();
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC0604Ol
    public float getVolume() {
        return this.A0D.getVolume();
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        this.A0B.A02(A0M);
        super.onAttachedToWindow();
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        this.A0B.A02(A0N);
        super.onDetachedFromWindow();
    }

    public void setControlsAnchorView(View view) {
        InterfaceC0622Pd interfaceC0622Pd = this.A0D;
        if (interfaceC0622Pd != null) {
            interfaceC0622Pd.setControlsAnchorView(view);
        }
    }

    public void setFunnelLoggingHandler(C0444Ib c0444Ib) {
        this.A01 = c0444Ib;
    }

    public void setIsFullScreen(boolean z) {
        this.A04 = z;
        this.A0D.setFullScreen(z);
    }

    @Override // android.view.View
    public void setLayoutParams(ViewGroup.LayoutParams layoutParams) {
        super.setLayoutParams(layoutParams);
    }

    public void setVideoMPD(@Nullable String str) {
        this.A0D.setVideoMPD(str);
    }

    public void setVideoProgressReportIntervalMs(int i) {
        this.A00 = i;
    }

    public void setVideoURI(@Nullable Uri uri) {
        if (uri == null) {
            A0X();
        } else {
            A0J();
            this.A0D.setup(uri);
        }
        this.A03 = false;
    }

    public void setVideoURI(@Nullable String str) {
        this.A0A.A0D().A2x(str);
        setVideoURI(str != null ? KM.A00(str) : null);
    }

    public void setVolume(float f) {
        if (f == 1.0f) {
            A0L(EnumC0443Ia.A0f);
            this.A0A.A0D().A31();
        } else {
            A0L(EnumC0443Ia.A0e);
            this.A0A.A0D().A30();
        }
        this.A0D.setRequestedVolume(f);
        C8N<C8O, C8M> eventBus = getEventBus();
        if (A0F[2].length() == 19) {
            throw new RuntimeException();
        }
        A0F[2] = "etD2zaPMct9y2wbR2YehsJmmTem";
        eventBus.A02(A0L);
    }
}
