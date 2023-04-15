package com.facebook.ads.redexgen.X;

import a.a.j;
import android.annotation.TargetApi;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.drawable.ColorDrawable;
import android.os.Build;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import androidx.annotation.Nullable;
import com.facebook.ads.DefaultMediaViewVideoRenderer;
import com.facebook.ads.MediaView;
import com.facebook.ads.MediaViewListener;
import com.facebook.ads.MediaViewVideoRenderer;
import com.facebook.ads.NativeAd;
import com.facebook.ads.internal.api.AdComponentView;
import com.facebook.ads.internal.api.AdComponentViewApi;
import com.facebook.ads.internal.api.AdComponentViewParentApi;
import com.facebook.ads.internal.api.AdViewConstructorParams;
import com.facebook.ads.internal.api.MediaViewApi;
import com.facebook.ads.internal.api.NativeAdBaseApi;
import com.facebook.ads.internal.context.Repairable;
import com.facebook.ads.internal.protocol.AdErrorType;
import java.util.Arrays;
import java.util.List;
/* loaded from: assets/audience_network.dex */
public final class XC extends C5E implements MediaViewApi, Repairable, C7E {
    public static byte[] A0E;
    public static String[] A0F = {"5egxRyJvv3hsImr6xVPVZGZzS", "S92E58UIdGCmPOb4LYA51SRur0tU5vPU", "gB2LJBWgacco1yi3dwEv6yCRJyLib4yq", "IRYDxixZynQ1VjnPzR0JfxvjieAE", "Yx6PPUM30uHFy3rHO75LIsUaVykI", "YSQgGTlHzzB", "fqdcFq1cD4m6uZ0nLvDLKOa7nCA9CaYH", "MqJIv4BM2hfR6AMSoGkEEGT8SPZgcE8o"};
    public static final String A0G;
    public View A00;
    public View A01;
    public ImageView A02;
    public MediaView A03;
    @Nullable
    public MediaViewListener A04;
    public MediaViewVideoRenderer A05;
    public AdComponentViewParentApi A06;
    public C0806Wj A07;
    public C1A A08;
    public C0567Mz A09;
    @Nullable
    public C02168o A0A;
    @Nullable
    public OU A0B;
    public boolean A0C;
    public boolean A0D;

    public static String A04(int i, int i2, int i3) {
        byte[] copyOfRange = Arrays.copyOfRange(A0E, i, i + i2);
        for (int i4 = 0; i4 < copyOfRange.length; i4++) {
            copyOfRange[i4] = (byte) ((copyOfRange[i4] ^ i3) ^ 47);
        }
        return new String(copyOfRange);
    }

    public static void A08() {
        A0E = new byte[]{56, 26, 9, 20, 14, 8, 30, 23, 91, 9, 30, 21, 31, 30, 9, 30, 9, 91, 22, 14, 8, 15, 91, 25, 30, 91, 8, 30, 15, 91, 25, 30, 29, 20, 9, 30, 91, 21, 26, 15, 18, 13, 30, 58, 31, 85, 26, 30, 29, 41, 56, 53, 57, 50, 63, 57, 18, 57, 40, 43, 51, 46, 55, 64, 100, 104, 110, 108, 41, 123, 108, 103, 109, 108, 123, 108, 123, 41, 100, 124, 122, 125, 41, 107, 108, 41, 122, 108, 125, 41, 107, 108, 111, 102, 123, 108, 41, 103, 104, 125, 96, Byte.MAX_VALUE, 108, 72, 109, 39, 96, 68, 72, 78, 76, 9, 91, 76, 71, 77, 76, 91, 76, 91, 9, 68, 92, 90, 93, 9, 75, 76, 9, 90, 76, 93, 9, 75, 76, 79, 70, 91, 76, 9, 71, 72, 93, 64, 95, 76, 107, 72, 71, 71, 76, 91, 104, 77, 7, 18, 53, 45, 58, 55, 50, 63, 123, 13, 50, 62, 44, 123, 56, 52, 53, 40, 47, 41, 46, 56, 47, 52, 41, 123, 43, 58, 41, 58, 54, 40, 123, 47, 34, 43, 62, 117, 1, 46, 59, 38, 57, 42, 111, 14, 43, 111, 6, 44, 32, 33, 111, 38, 60, 111, 33, 58, 35, 35, 97, 11, 52, 57, 56, 50, 125, 47, 56, 51, 57, 56, 47, 56, 47, 125, 48, 40, 46, 41, 125, 63, 56, 125, 46, 56, 41, 125, 63, 56, 59, 50, 47, 56, 125, 51, 60, 41, 52, 43, 56, 28, 57, 115, 26, 11, 18, 96, 108, 110, 45, 101, 98, 96, 102, 97, 108, 108, 104, 45, 98, 103, 112, 45, 109, 98, 119, 106, 117, 102, 45, 96, 111, 106, 96, 104, 102, 103, 117, 106, 103, 102, 108, 86, 113, 111, 62};
    }

    static {
        A08();
        A0G = MediaView.class.getSimpleName();
    }

    private void A05() {
        C02168o c02168o = this.A0A;
        if (c02168o != null) {
            c02168o.setVisibility(8);
            AnonymousClass38.A0A(this.A0A.getDynamicWebViewController().A0O(), new ColorDrawable(0));
            this.A03.removeView(this.A0A);
            this.A0A = null;
        }
    }

    private void A06() {
        if (!this.A0D) {
            View view = this.A01;
            String[] strArr = A0F;
            if (strArr[4].length() != strArr[3].length()) {
                throw new RuntimeException();
            }
            String[] strArr2 = A0F;
            strArr2[5] = "HiqmuX4YAHl";
            strArr2[0] = "JtgDxExoVYEb5OmxUIRsQ7gjV";
            if (view != null) {
                LE.A0J(this.A08);
            }
            float f = Kd.A02;
            float density = 4.0f * f;
            int hPadding = Math.round(density);
            float density2 = 12.0f * f;
            int vPadding = Math.round(density2);
            this.A08.setChildSpacing(hPadding);
            this.A08.setPadding(0, vPadding, 0, vPadding);
            this.A08.setVisibility(8);
            RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-1, -1);
            layoutParams.addRule(13);
            this.A01 = this.A08;
            this.A03.addView(this.A01, layoutParams);
            return;
        }
        throw new IllegalStateException(A04(0, 46, 84));
    }

    private void A07() {
        EnumC0499Ki.A04(this.A03, EnumC0499Ki.A0A);
        EnumC0499Ki.A04(this.A09, EnumC0499Ki.A0A);
        EnumC0499Ki.A04(this.A05, EnumC0499Ki.A0A);
        EnumC0499Ki.A04(this.A01, EnumC0499Ki.A0A);
    }

    private final void A09(View view, ViewGroup.LayoutParams layoutParams) {
        A01(false);
        this.A03.addView(view, layoutParams);
        A01(true);
    }

    private void A0A(View view, C0718Sw c0718Sw) {
        OU ou = this.A0B;
        if (ou != null) {
            MediaView mediaView = this.A03;
            String[] strArr = A0F;
            if (strArr[5].length() == strArr[0].length()) {
                throw new RuntimeException();
            }
            String[] strArr2 = A0F;
            strArr2[6] = "tYahJlzELN2bWoIKGOvNb4V2q4om3tal";
            strArr2[2] = "knO8IZUpKtredd0Q2IkvjJrJQGpJW1Qq";
            mediaView.removeView(ou);
        }
        if (!c0718Sw.A1d()) {
            return;
        }
        String A1C = c0718Sw.A1C();
        Context context = this.A03.getContext();
        String[] strArr3 = A0F;
        String str = strArr3[5];
        String mediationData = strArr3[0];
        if (str.length() != mediationData.length()) {
            String[] strArr4 = A0F;
            strArr4[4] = "LedcnhOkj71a4gNr9a9uwwPVwkpS";
            strArr4[3] = "bOPNktfa058vxRDYU7HJ2aiUk3a2";
            if (context == null) {
                return;
            }
        } else if (context == null) {
            return;
        }
        OU A01 = OT.A01(this.A07, A1C);
        if (A0F[7].charAt(21) != 'L') {
            A0F[1] = "IBU68ioTGuVBWJ1dkmCJ7UK76Osi7EVF";
            this.A0B = A01;
            if (this.A0B == null) {
                return;
            }
        } else {
            this.A0B = A01;
            if (this.A0B == null) {
                return;
            }
        }
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-1, -1);
        layoutParams.addRule(5, view.getId());
        layoutParams.addRule(7, view.getId());
        layoutParams.addRule(6, view.getId());
        layoutParams.addRule(8, view.getId());
        if (Build.VERSION.SDK_INT >= 17) {
            layoutParams.addRule(16, view.getId());
            layoutParams.addRule(17, view.getId());
        }
        A09(this.A0B, layoutParams);
        this.A06.bringChildToFront(this.A0B);
    }

    private void A0B(ImageView imageView) {
        if (!this.A0D) {
            ImageView imageView2 = this.A02;
            String[] strArr = A0F;
            if (strArr[5].length() == strArr[0].length()) {
                throw new RuntimeException();
            }
            String[] strArr2 = A0F;
            strArr2[6] = "9onWrVOda1qlu0pAvyXYf5LKITz29A5r";
            strArr2[2] = "G6pev0JETY7bhqmEZOziJsmCoQM1bBBX";
            if (imageView2 != null) {
                LE.A0J(imageView2);
            }
            imageView.setVisibility(8);
            RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-1, -1);
            layoutParams.addRule(13);
            this.A03.addView(imageView, layoutParams);
            imageView.setId(LE.A00());
            this.A02 = imageView;
            return;
        }
        throw new IllegalStateException(A04(j.AppCompatTheme_toolbarNavigationButtonStyle, 49, 6));
    }

    @TargetApi(21)
    private final void A0C(C0806Wj c0806Wj, AttributeSet attributeSet, int i, int i2, MediaView mediaView) {
        this.A03 = mediaView;
        A0B(new ImageView(c0806Wj, attributeSet, i, i2));
        A0H(new C0567Mz(c0806Wj, attributeSet, i, i2));
        this.A08 = new C1A(c0806Wj, attributeSet, i);
        A06();
        setVideoRenderer(new DefaultMediaViewVideoRenderer(c0806Wj, attributeSet, i, i2));
        A07();
    }

    private final void A0D(C0806Wj c0806Wj, AttributeSet attributeSet, int i, MediaView mediaView) {
        this.A03 = mediaView;
        A0B(new ImageView(c0806Wj, attributeSet, i));
        A0H(new C0567Mz(c0806Wj, attributeSet, i));
        this.A08 = new C1A(c0806Wj, attributeSet, i);
        A06();
        setVideoRenderer(new DefaultMediaViewVideoRenderer(c0806Wj, attributeSet, i));
        A07();
    }

    private final void A0E(C0806Wj c0806Wj, AttributeSet attributeSet, MediaView mediaView) {
        this.A03 = mediaView;
        A0B(new ImageView(c0806Wj, attributeSet));
        A0H(new C0567Mz(c0806Wj, attributeSet));
        this.A08 = new C1A(c0806Wj, attributeSet);
        A06();
        setVideoRenderer(new DefaultMediaViewVideoRenderer(c0806Wj, attributeSet));
        A07();
    }

    private final void A0F(C0806Wj c0806Wj, MediaView mediaView) {
        this.A03 = mediaView;
        A0B(new ImageView(c0806Wj));
        A0H(new C0567Mz(c0806Wj));
        this.A08 = new C1A(c0806Wj);
        A06();
        setVideoRenderer(new DefaultMediaViewVideoRenderer(c0806Wj));
        A07();
    }

    private void A0G(C0718Sw c0718Sw, boolean z, C0460Ir c0460Ir) {
        AsyncTaskC0685Ro A04 = new AsyncTaskC0685Ro(this.A02, this.A07).A04();
        if (z) {
            A04.A06(new XJ(this, c0718Sw));
        }
        A04.A07(c0460Ir.getUrl());
    }

    private void A0H(C0567Mz c0567Mz) {
        if (!this.A0D) {
            C0567Mz c0567Mz2 = this.A09;
            if (c0567Mz2 != null) {
                this.A03.removeView(c0567Mz2);
            }
            c0567Mz.setVisibility(8);
            RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-1, -1);
            layoutParams.addRule(13);
            this.A03.addView(c0567Mz, layoutParams);
            this.A09 = c0567Mz;
            return;
        }
        throw new IllegalStateException(A04(63, 43, 38));
    }

    private boolean A0I(NativeAd nativeAd) {
        List<NativeAd> carousel = ((C5M) nativeAd.getNativeAdApi()).A03();
        if (carousel == null) {
            return false;
        }
        for (NativeAd nativeAd2 : carousel) {
            if (nativeAd2.getAdCoverImage() == null) {
                return false;
            }
        }
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean A0J(NativeAd nativeAd) {
        return Build.VERSION.SDK_INT >= 14 && !TextUtils.isEmpty(((C5M) nativeAd.getNativeAdApi()).A02());
    }

    /* JADX WARN: Code restructure failed: missing block: B:65:0x0364, code lost:
        if ((r1 instanceof com.facebook.ads.redexgen.X.C0558Mq) != false) goto L72;
     */
    /* JADX WARN: Code restructure failed: missing block: B:66:0x0366, code lost:
        ((com.facebook.ads.redexgen.X.C0558Mq) r1).A04();
     */
    /* JADX WARN: Code restructure failed: missing block: B:69:0x03b9, code lost:
        if ((r1 instanceof com.facebook.ads.redexgen.X.C0558Mq) != false) goto L72;
     */
    /* JADX WARN: Code restructure failed: missing block: B:71:0x03bc, code lost:
        ((com.facebook.ads.redexgen.X.C0339Dw) r1).setAdapter(null);
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void A0L(com.facebook.ads.NativeAd r18) {
        /*
            Method dump skipped, instructions count: 968
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.ads.redexgen.X.XC.A0L(com.facebook.ads.NativeAd):void");
    }

    public final void A0M(NativeAdBaseApi nativeAdBaseApi, boolean z) {
        C0806Wj A11 = ((C0718Sw) nativeAdBaseApi).A11();
        C0806Wj adObjectContext = this.A07;
        adObjectContext.A0F(A11);
        A11.A0G(this);
        this.A0D = true;
        C0718Sw A0L = C0718Sw.A0L(nativeAdBaseApi);
        A0L.A1P(this.A03);
        this.A09.setVisibility(8);
        this.A09.setImage(null, null);
        this.A05.setVisibility(8);
        this.A05.unsetNativeAd();
        ((C5L) this.A05.getMediaViewVideoRendererApi()).A03();
        View view = this.A01;
        if (view != null) {
            view.setVisibility(8);
            View view2 = this.A01;
            if (view2 instanceof C0558Mq) {
                ((C0558Mq) view2).A04();
            } else {
                ((C0339Dw) view2).setAdapter(null);
            }
        }
        this.A02.setVisibility(0);
        bringChildToFront(this.A02);
        this.A00 = this.A02;
        C0460Ir adIcon = A0L.getAdIcon();
        if (adIcon != null) {
            Bitmap A0M = A0L.A10().A0M(adIcon.getUrl());
            if (A0M != null) {
                this.A02.setImageBitmap(A0M);
                if (z) {
                    this.A03.post(new XK(this, A0L));
                }
            } else {
                A0G(A0L, z, adIcon);
            }
        } else {
            InterfaceC0717Sv A15 = A0L.A15();
            AdErrorType adErrorType = AdErrorType.NATIVE_AD_IS_NOT_LOADED;
            A11.A0D().A2a(A0L.A0x(), adErrorType.getErrorCode(), adErrorType.getDefaultErrorMessage());
            if (A15 != null) {
                A15.AAc(J3.A00(adErrorType));
            }
            Log.e(A04(46, 17, j.AppCompatTheme_windowFixedHeightMinor), adErrorType.getDefaultErrorMessage());
            if (nativeAdBaseApi.isAdLoaded()) {
                C0806Wj adObjectContext2 = this.A07;
                adObjectContext2.A06().A8u(A04(258, 3, 84), C01877l.A0W, new C01887m(A04(192, 23, 96)));
            }
        }
        A0A(this.A02, A0L);
    }

    public final boolean A0N() {
        View view = this.A01;
        return view != null && view.getVisibility() == 0;
    }

    @Override // com.facebook.ads.redexgen.X.C7E
    public final C0806Wj A5Z() {
        return this.A07;
    }

    @Override // com.facebook.ads.redexgen.X.C5E
    public final void bringChildToFront(View view) {
        if (view == this.A01 || view == this.A05 || view == this.A09 || view == this.A02) {
            this.A06.bringChildToFront(view);
            OU ou = this.A0B;
            if (ou != null) {
                this.A06.bringChildToFront(ou);
            }
        }
    }

    public final void destroy() {
        this.A05.pause(false);
        this.A05.getMediaViewVideoRendererApi().destroy();
    }

    public final AdComponentViewApi getAdComponentViewApi() {
        return this;
    }

    public final View getAdContentsView() {
        return this.A00;
    }

    public final int getMediaHeight() {
        if (this.A09.getVisibility() == 0) {
            return this.A09.getImageHeight();
        }
        if (this.A05.getVisibility() == 0) {
            return this.A05.getMediaViewVideoRendererApi().getVideoView().getHeight();
        }
        if (this.A03.getVisibility() == 0) {
            return this.A03.getHeight();
        }
        if (A0F[1].charAt(24) != 't') {
            A0F[7] = "3C5Zne3gt6SFfa7y1AnuQltffgpI3Oh8";
            return 0;
        }
        throw new RuntimeException();
    }

    public final int getMediaWidth() {
        if (this.A09.getVisibility() == 0) {
            return this.A09.getImageWidth();
        }
        if (this.A05.getVisibility() == 0) {
            return this.A05.getMediaViewVideoRendererApi().getVideoView().getWidth();
        }
        if (this.A03.getVisibility() == 0) {
            return this.A03.getWidth();
        }
        String[] strArr = A0F;
        if (strArr[6].charAt(12) != strArr[2].charAt(12)) {
            String[] strArr2 = A0F;
            strArr2[5] = "pFreRfYdfw1";
            strArr2[0] = "pVUprXCJsnglf8IlGtX2XFBaJ";
            return 0;
        }
        throw new RuntimeException();
    }

    public final void initialize(AdViewConstructorParams adViewConstructorParams, MediaView mediaView) {
        Context context = adViewConstructorParams.getContext();
        if (context instanceof C0806Wj) {
            this.A07 = (C0806Wj) context;
        } else {
            this.A07 = C5G.A02(context);
        }
        this.A07.A0G(this);
        int initializationType = adViewConstructorParams.getInitializationType();
        if (initializationType == 0) {
            A0F(this.A07, mediaView);
        } else if (initializationType == 1) {
            A0E(this.A07, adViewConstructorParams.getAttributeSet(), mediaView);
        } else if (initializationType == 2) {
            A0D(this.A07, adViewConstructorParams.getAttributeSet(), adViewConstructorParams.getDefStyleAttr(), mediaView);
        } else if (initializationType == 3) {
            A0C(this.A07, adViewConstructorParams.getAttributeSet(), adViewConstructorParams.getDefStyleAttr(), adViewConstructorParams.getDefStyleRes(), mediaView);
        } else {
            throw new IllegalArgumentException(A04(155, 37, j.AppCompatTheme_windowFixedWidthMajor));
        }
        A01(true);
    }

    @Override // com.facebook.ads.redexgen.X.C5E
    public final void onAttachedToView(AdComponentView adComponentView, AdComponentViewParentApi adComponentViewParentApi) {
        super.onAttachedToView(adComponentView, adComponentViewParentApi);
        this.A06 = adComponentViewParentApi;
    }

    public final void repair(Throwable th) {
        int currentHeight = this.A03.getWidth();
        int height = this.A03.getHeight();
        if (currentHeight > 0 && height > 0) {
            this.A03.repair(th);
            this.A03.getLayoutParams().width = currentHeight;
            MediaView mediaView = this.A03;
            if (A0F[1].charAt(24) == 116) {
                throw new RuntimeException();
            }
            String[] strArr = A0F;
            strArr[5] = "Mgb6bOJjyiN";
            strArr[0] = "MTEeDXbdwkPsq4eW7ABfM3WBi";
            mediaView.getLayoutParams().height = height;
            this.A03.setBackgroundColor(-3355444);
            return;
        }
        this.A03.repair(th);
    }

    public final void setListener(MediaViewListener mediaViewListener) {
        this.A04 = mediaViewListener;
        if (mediaViewListener == null) {
            ((C5L) this.A05.getMediaViewVideoRendererApi()).A07(null);
        } else {
            ((C5L) this.A05.getMediaViewVideoRendererApi()).A07(new XD(this, mediaViewListener));
        }
    }

    public final void setVideoRenderer(MediaViewVideoRenderer mediaViewVideoRenderer) {
        if (!this.A0D) {
            MediaViewVideoRenderer mediaViewVideoRenderer2 = this.A05;
            if (A0F[7].charAt(21) == 'L') {
                throw new RuntimeException();
            }
            String[] strArr = A0F;
            strArr[6] = "ifAS5bhxfK6Gg4eu5Yemnhg9EBEfp9jT";
            strArr[2] = "R5YDbsM1msNnvJcIFydw3DY2O0brJ9d9";
            if (mediaViewVideoRenderer2 != null) {
                this.A03.removeView(mediaViewVideoRenderer2);
                this.A05.getMediaViewVideoRendererApi().destroy();
            }
            ((C5L) mediaViewVideoRenderer.getMediaViewVideoRendererApi()).A05(this.A07.A08());
            mediaViewVideoRenderer.setVisibility(8);
            RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-1, -1);
            layoutParams.addRule(13);
            ((XC) this.A03.getMediaViewApi()).A09(mediaViewVideoRenderer, layoutParams);
            this.A05 = mediaViewVideoRenderer;
            this.A0C = !(this.A05 instanceof DefaultMediaViewVideoRenderer);
            mediaViewVideoRenderer.setId(LE.A00());
            return;
        }
        throw new IllegalStateException(A04(215, 43, j.AppCompatTheme_windowFixedHeightMajor));
    }
}
