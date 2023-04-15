package com.facebook.ads.redexgen.X;

import android.annotation.TargetApi;
import android.os.Handler;
import android.os.Looper;
import android.util.Log;
import android.view.Surface;
import android.view.SurfaceHolder;
import android.view.TextureView;
import androidx.annotation.Nullable;
import com.facebook.ads.internal.exoplayer2.Format;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.CopyOnWriteArraySet;
@TargetApi(16)
/* renamed from: com.facebook.ads.redexgen.X.Cn */
/* loaded from: assets/audience_network.dex */
public final class C0306Cn implements W2, InterfaceC02289a, C9Y {
    public static byte[] A0O;
    public static String[] A0P = {"p1p2g9mbI7jG28uS1AIjZaN2DuNLisT4", "5M6TC2sONh3rGys5YKd78dMRKX2wOUqH", "h92WNkWPJTM", "jYXxaa6xf7axcTjhEWPmUH7zZsfwsjgI", "vYDSW5DyAu5jQwnIRgw24Ezub5gSEfu7", "VyMVayVAQGyPc0QthTR0tkMwCD52dsyF", "LU4FXKZXpKPxotYf", "puFnwNxTYtdaaLd9gUGAlTVzIEShK4ZY"};
    public float A00;
    public int A01;
    public int A02;
    @Nullable
    public Surface A03;
    @Nullable
    public SurfaceHolder A04;
    @Nullable
    public TextureView A05;
    public Format A06;
    public Format A07;
    public C02529z A08;
    public C0261Ai A09;
    public C0261Ai A0A;
    public EM A0B;
    public List<FJ> A0C;
    public boolean A0D;
    public final Handler A0E;
    public final W2 A0F;
    public final W0 A0G;
    public final C0795Vy A0H;
    public final CopyOnWriteArraySet<AF> A0I;
    public final CopyOnWriteArraySet<D5> A0J;
    public final CopyOnWriteArraySet<FN> A0K;
    public final CopyOnWriteArraySet<I9> A0L;
    public final CopyOnWriteArraySet<I0> A0M;
    public final W1[] A0N;

    public static String A07(int i, int i2, int i3) {
        byte[] copyOfRange = Arrays.copyOfRange(A0O, i, i + i2);
        for (int i4 = 0; i4 < copyOfRange.length; i4++) {
            copyOfRange[i4] = (byte) ((copyOfRange[i4] ^ i3) ^ 58);
        }
        return new String(copyOfRange);
    }

    public static void A0F() {
        A0O = new byte[]{45, 23, 19, 14, 18, 27, 59, 6, 17, 46, 18, 31, 7, 27, 12, 9, 47, 40, 60, 59, 57, 63, 14, 63, 34, 46, 47, 40, 63, 22, 51, 41, 46, 63, 52, 63, 40, 122, 59, 54, 40, 63, 59, 62, 35, 122, 47, 52, 41, 63, 46, 122, 53, 40, 122, 40, 63, 42, 54, 59, 57, 63, 62, 116};
    }

    static {
        A0F();
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.B8 != com.facebook.ads.internal.exoplayer2.drm.DrmSessionManager<com.facebook.ads.internal.exoplayer2.drm.FrameworkMediaCrypto> */
    public C0306Cn(InterfaceC02369i interfaceC02369i, GF gf, C9N c9n, @Nullable B8<C0778Vh> b8) {
        this(interfaceC02369i, gf, c9n, b8, new C02419o());
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.B8 != com.facebook.ads.internal.exoplayer2.drm.DrmSessionManager<com.facebook.ads.internal.exoplayer2.drm.FrameworkMediaCrypto> */
    public C0306Cn(InterfaceC02369i interfaceC02369i, GF gf, C9N c9n, @Nullable B8<C0778Vh> b8, C02419o c02419o) {
        this(interfaceC02369i, gf, c9n, b8, c02419o, H9.A00);
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.B8 != com.facebook.ads.internal.exoplayer2.drm.DrmSessionManager<com.facebook.ads.internal.exoplayer2.drm.FrameworkMediaCrypto> */
    public C0306Cn(InterfaceC02369i interfaceC02369i, GF gf, C9N c9n, @Nullable B8<C0778Vh> b8, C02419o c02419o, H9 h9) {
        this.A0G = new W0(this);
        this.A0M = new CopyOnWriteArraySet<>();
        this.A0K = new CopyOnWriteArraySet<>();
        this.A0J = new CopyOnWriteArraySet<>();
        this.A0L = new CopyOnWriteArraySet<>();
        this.A0I = new CopyOnWriteArraySet<>();
        this.A0E = new Handler(Looper.myLooper() != null ? Looper.myLooper() : Looper.getMainLooper());
        Handler handler = this.A0E;
        W0 w0 = this.A0G;
        this.A0N = interfaceC02369i.A4R(handler, w0, w0, w0, w0, b8);
        this.A00 = 1.0f;
        this.A01 = 0;
        this.A08 = C02529z.A04;
        this.A02 = 1;
        this.A0C = Collections.emptyList();
        this.A0F = A02(this.A0N, gf, c9n, h9);
        this.A0H = c02419o.A00(this.A0F, h9);
        A3E(this.A0H);
        this.A0L.add(this.A0H);
        this.A0I.add(this.A0H);
        A0I(this.A0H);
        if (b8 instanceof C0780Vj) {
            ((C0780Vj) b8).A04(this.A0E, this.A0H);
        }
    }

    private final W2 A02(W1[] w1Arr, GF gf, C9N c9n, H9 h9) {
        return new C0309Cq(w1Arr, gf, c9n, h9);
    }

    private void A0E() {
        TextureView textureView = this.A05;
        if (textureView != null) {
            if (textureView.getSurfaceTextureListener() != this.A0G) {
                Log.w(A07(0, 15, 68), A07(15, 49, 96));
            } else {
                this.A05.setSurfaceTextureListener(null);
            }
            this.A05 = null;
        }
        SurfaceHolder surfaceHolder = this.A04;
        if (surfaceHolder != null) {
            surfaceHolder.removeCallback(this.A0G);
            this.A04 = null;
        }
    }

    public void A0G(@Nullable Surface surface, boolean z) {
        W1[] w1Arr;
        ArrayList<C02329e> arrayList = new ArrayList();
        for (W1 w1 : this.A0N) {
            int A7g = w1.A7g();
            String[] strArr = A0P;
            if (strArr[5].charAt(24) == strArr[4].charAt(24)) {
                throw new RuntimeException();
            }
            String[] strArr2 = A0P;
            strArr2[6] = "VrJ3McZcw7cn2zeT";
            strArr2[0] = "MNepmlV8OvsHi61EfIBswCx5NcPOIPrl";
            if (A7g == 2) {
                arrayList.add(this.A0F.A4L(w1).A06(1).A07(surface).A05());
            }
        }
        Surface surface2 = this.A03;
        if (surface2 != null && surface2 != surface) {
            try {
                for (C02329e c02329e : arrayList) {
                    c02329e.A0C();
                }
            } catch (InterruptedException unused) {
                Thread.currentThread().interrupt();
            }
            if (this.A0D) {
                this.A03.release();
            }
        }
        this.A03 = surface;
        if (A0P[7].charAt(22) != 'V') {
            throw new RuntimeException();
        }
        String[] strArr3 = A0P;
        strArr3[5] = "BcNzrhvciYYCifYD3J0kGNpt4Q56t2ws";
        strArr3[4] = "LBzJc3KMaCoazXjGhEegCXyOf3paMmXp";
        this.A0D = z;
    }

    private final void A0I(D5 d5) {
        this.A0J.add(d5);
    }

    public final int A0J() {
        return this.A01;
    }

    public final Format A0K() {
        return this.A06;
    }

    @Nullable
    public final Format A0L() {
        return this.A07;
    }

    public final void A0M() {
        AEv(false);
    }

    public final void A0N(float f) {
        W1[] w1Arr;
        this.A00 = f;
        for (W1 w1 : this.A0N) {
            String[] strArr = A0P;
            if (strArr[5].charAt(24) == strArr[4].charAt(24)) {
                throw new RuntimeException();
            }
            String[] strArr2 = A0P;
            strArr2[6] = "TZ1OBcEbhXggSiRE";
            strArr2[0] = "o47SCfAcsD46THYYRPii4HELThPbmwG8";
            if (w1.A7g() == 1) {
                this.A0F.A4L(w1).A06(2).A07(Float.valueOf(f)).A05();
            }
        }
    }

    public final void A0O(@Nullable Surface surface) {
        A0E();
        A0G(surface, false);
    }

    public final void A0P(EM em) {
        ADA(em, true, true);
    }

    public final void A0Q(I0 i0) {
        this.A0M.add(i0);
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC02299b
    public final void A3E(C9W c9w) {
        this.A0F.A3E(c9w);
    }

    @Override // com.facebook.ads.redexgen.X.W2
    public final C02329e A4L(InterfaceC02319d interfaceC02319d) {
        return this.A0F.A4L(interfaceC02319d);
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC02299b
    public final int A5p() {
        return this.A0F.A5p();
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC02299b
    public final long A5q() {
        return this.A0F.A5q();
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC02299b
    public final long A68() {
        return this.A0F.A68();
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC02299b
    public final int A6A() {
        return this.A0F.A6A();
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC02299b
    public final int A6B() {
        return this.A0F.A6B();
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC02299b
    public final long A6D() {
        return this.A0F.A6D();
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC02299b
    public final AbstractC02409n A6F() {
        return this.A0F.A6F();
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC02299b
    public final int A6G() {
        return this.A0F.A6G();
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC02299b
    public final long A6P() {
        return this.A0F.A6P();
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC02299b
    public final boolean A7B() {
        return this.A0F.A7B();
    }

    @Override // com.facebook.ads.redexgen.X.W2
    public final void ADA(EM em, boolean z, boolean z2) {
        EM em2 = this.A0B;
        if (em2 != em) {
            if (em2 != null) {
                em2.ADo(this.A0H);
                this.A0H.A07();
            }
            em.A3C(this.A0E, this.A0H);
            this.A0B = em;
        }
        this.A0F.ADA(em, z, z2);
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC02299b
    public final void ADf() {
        this.A0F.ADf();
        A0E();
        Surface surface = this.A03;
        if (surface != null) {
            if (this.A0D) {
                surface.release();
            }
            this.A03 = null;
        }
        EM em = this.A0B;
        if (em != null) {
            em.ADo(this.A0H);
        }
        this.A0C = Collections.emptyList();
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC02299b
    public final void AEF(long j) {
        this.A0H.A06();
        this.A0F.AEF(j);
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC02299b
    public final void AEG() {
        this.A0H.A06();
        this.A0F.AEG();
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC02299b
    public final void AEW(boolean z) {
        this.A0F.AEW(z);
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC02299b
    public final void AEv(boolean z) {
        this.A0F.AEv(z);
        EM em = this.A0B;
        if (em != null) {
            em.ADo(this.A0H);
            this.A0B = null;
            this.A0H.A07();
        }
        this.A0C = Collections.emptyList();
        String[] strArr = A0P;
        if (strArr[6].length() == strArr[0].length()) {
            throw new RuntimeException();
        }
        String[] strArr2 = A0P;
        strArr2[5] = "8NqoZsSfBCZ1v43okD4Pix8d8oY1Moxp";
        strArr2[4] = "VfYOa1CKuZhM9jsFhHY6jw4UB0OoLmrV";
    }
}
