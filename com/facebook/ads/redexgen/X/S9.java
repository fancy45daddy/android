package com.facebook.ads.redexgen.X;

import android.annotation.SuppressLint;
import android.annotation.TargetApi;
import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import android.util.Pair;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import android.widget.Toast;
import androidx.annotation.Nullable;
import androidx.annotation.VisibleForTesting;
import com.facebook.ads.internal.view.FullScreenAdToolbar;
import java.text.NumberFormat;
import java.util.Arrays;
import java.util.HashMap;
import java.util.concurrent.atomic.AtomicBoolean;
@SuppressLint({"ViewConstructor"})
@TargetApi(16)
/* loaded from: assets/audience_network.dex */
public final class S9 extends RelativeLayout implements InterfaceC0520Ld {
    public static byte[] A0W;
    public static String[] A0X = {"57rzzR6raHrat8cHk0n2c9utIvWN6OL8", "vZo4DQACnHxpUIABCEPhLIrXR", "3pKkUgRnbq5D8", "3oPHUcYdGBLGT6sjvwgTS6nCZs8dHXKK", "yMOWmEDq6oq3Yf8aoY", "BRjJ0geTmUVj6Aeo1VqVThKYcHpwhF7A", "bCnfD5Zsza6fNT9UI62TNCVdI9Gt63Qd", "0XbQU4AacrxlEwxF12eBigHvJ8"};
    public static final int A0Y;
    public static final int A0Z;
    public static final int A0a;
    public static final int A0b;
    public static final int A0c;
    public static final int A0d;
    public static final int A0e;
    public static final int A0f;
    public static final int A0g;
    public static final RelativeLayout.LayoutParams A0h;
    @Nullable
    public View A00;
    @Nullable
    public RelativeLayout A01;
    @Nullable
    public RelativeLayout A02;
    public Toast A03;
    @Nullable
    public AnonymousClass59 A04;
    @Nullable
    public View$OnClickListenerC0683Rm A05;
    public OX A06;
    public C0596Od A07;
    public boolean A08;
    public boolean A09;
    public boolean A0A;
    public boolean A0B;
    public boolean A0C;
    public final AnonymousClass18 A0D;
    public final C1W A0E;
    public final AnonymousClass57 A0F;
    public final C0806Wj A0G;
    public final IT A0H;
    public final C0444Ib A0I;
    public final KX A0J;
    public final L1 A0K;
    public final InterfaceC0519Lc A0L;
    public final M4 A0M;
    public final NF A0N;
    public final NG A0O;
    public final C0595Oc A0P;
    public final AtomicBoolean A0Q;
    public final AtomicBoolean A0R;
    public final boolean A0S;
    public final boolean A0T;
    public final boolean A0U;
    @VisibleForTesting
    public final AbstractC0518Lb A0V;

    /* JADX WARN: Failed to parse debug info
    java.lang.ArrayIndexOutOfBoundsException: Index 20 out of bounds for length 19
    	at jadx.plugins.input.dex.sections.debuginfo.DebugInfoParser.startVar(DebugInfoParser.java:203)
    	at jadx.plugins.input.dex.sections.debuginfo.DebugInfoParser.process(DebugInfoParser.java:125)
    	at jadx.plugins.input.dex.sections.DexCodeReader.getDebugInfo(DexCodeReader.java:118)
    	at jadx.core.dex.nodes.MethodNode.getDebugInfo(MethodNode.java:567)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.visit(DebugInfoAttachVisitor.java:39)
     */
    public S9(C0806Wj c0806Wj, IT it, InterfaceC0519Lc interfaceC0519Lc, AnonymousClass18 anonymousClass18, @Nullable String str, M4 m4) {
        super(c0806Wj);
        this.A0F = new SG(this);
        this.A0R = new AtomicBoolean(false);
        this.A0Q = new AtomicBoolean(false);
        this.A0A = false;
        this.A0C = true;
        this.A0G = c0806Wj;
        this.A0L = interfaceC0519Lc;
        this.A0H = it;
        this.A0D = anonymousClass18;
        this.A0E = anonymousClass18.A0O().A0D().A06();
        this.A0I = new C0444Ib(this.A0D.A0U(), this.A0H);
        this.A0M = m4;
        this.A07 = new C0596Od(c0806Wj, this.A0M, str, this.A0L);
        this.A09 = this.A0D.A0O().A0M() && this.A0D.A0O().A0D().A02() > 0;
        this.A0U = this.A0D.A0O().A0D().A0A();
        if (this.A0E == null) {
            this.A0L.A3s(this.A0M.A6X());
            this.A0L.A3s(this.A0M.A6S());
        }
        int A02 = (this.A09 && this.A0U) ? this.A0D.A0O().A0D().A02() : this.A0E.A07();
        this.A0R.set(!this.A0E.A0I());
        this.A0J = new KX(A02, new SB(this, null));
        this.A0T = ID.A25(this.A0G);
        this.A0S = ID.A0k(this.A0G);
        this.A0V = A06();
        this.A0P = new C0595Oc(this.A0G, this.A0H, this.A0D);
        if (this.A0T) {
            NP.A00(c0806Wj, this, anonymousClass18.A0O().A0D().A07());
        } else {
            LE.A0M(this, -14473425);
        }
        this.A0K = new L1(this);
        this.A0K.A05(L0.A03);
        if (ID.A1Z(this.A0G)) {
            this.A0V.setProgressSpinnerInvisible(true);
        }
        HashMap hashMap = new HashMap();
        hashMap.put(A0E(44, 9, 51), this.A0M.A7A());
        this.A06 = new OX(this.A0G, this.A0D, this.A0E, this.A0H, new SA(this, null), hashMap);
        A0L();
        this.A0L.A3I(this, new RelativeLayout.LayoutParams(-1, -1));
        A0I();
        this.A0N = new SF(this);
        this.A0O = new NG(this.A0G, this.A0V, this.A0D, (P1) null, this.A0L, this.A0N, this.A05, this.A01, this.A06);
    }

    public static String A0E(int i, int i2, int i3) {
        byte[] copyOfRange = Arrays.copyOfRange(A0W, i, i + i2);
        for (int i4 = 0; i4 < copyOfRange.length; i4++) {
            copyOfRange[i4] = (byte) ((copyOfRange[i4] - i3) - 40);
        }
        return new String(copyOfRange);
    }

    public static void A0P() {
        A0W = new byte[]{-110, -97, -94, -70, -84, -86, -70, -92, 4, 13, 10, 4, 12, 0, 16, 19, 10, 8, 10, 15, -71, -66, -60, -75, -62, -61, -60, -71, -60, -71, -79, -68, -6, -19, 0, -11, 2, -15, -21, -17, -8, -11, -17, -9, -53, -57, -68, -66, -64, -56, -64, -55, -49, -41, -54, -36, -58, -41, -55, -54, -55, -60, -37, -50, -55, -54, -44, -60, -78, -81, -61, -74, -78, -60, -84, -80, -71, -74, -80, -72};
    }

    static {
        A0P();
        A0f = (int) (Kd.A02 * 64.0f);
        A0a = (int) (Kd.A02 * 16.0f);
        A0g = (int) (Kd.A02 * 12.0f);
        A0Y = (int) (Kd.A02 * 10.0f);
        A0h = new RelativeLayout.LayoutParams(-1, -1);
        A0b = (int) (Kd.A02 * 48.0f);
        A0c = (int) (Kd.A02 * 16.0f);
        A0e = (int) (Kd.A02 * 14.0f);
        A0d = C2U.A01(-1, 77);
        A0Z = (int) (Kd.A02 * 8.0f);
    }

    private AbstractC0518Lb A06() {
        FullScreenAdToolbar fullScreenAdToolbar = new FullScreenAdToolbar(this.A0G, this.A0L, this.A0I, 0, this.A0D.A0F());
        fullScreenAdToolbar.A04(this.A0D.A0N().A01(), true);
        fullScreenAdToolbar.setPageDetailsVisible(false);
        fullScreenAdToolbar.setPageDetails(this.A0D.A0R(), this.A0D.A0U(), this.A0E.A07(), this.A0D.A0S());
        fullScreenAdToolbar.setToolbarListener(new SD(this));
        return fullScreenAdToolbar;
    }

    @Nullable
    private View$OnClickListenerC0683Rm A09() {
        OX ox = this.A06;
        if (ox == null || ox.getViewabilityChecker() == null || this.A06.getTouchDataRecorder() == null) {
            return null;
        }
        View$OnClickListenerC0683Rm button = new View$OnClickListenerC0683Rm(this.A0G, this.A0M.A62(), this.A0D.A0N().A01(), this.A0H, this.A0L, this.A06.getViewabilityChecker(), this.A06.getTouchDataRecorder());
        LE.A0K(button);
        button.setText(this.A0D.A0O().A0F().A04());
        button.setTextSize(14.0f);
        button.setIncludeFontPadding(false);
        int i = A0Y;
        button.setPadding(i, i, i, i);
        if (!this.A0T) {
            LE.A0N(button, 8);
        }
        button.setOnClickListener(new View$OnClickListenerC0530Ln(this));
        return button;
    }

    private NO A0C() {
        NO no = new NO(this.A0G, this.A0D.A0N().A01(), true, 16, 14, 0);
        no.A01(this.A0D.A0O().A0E().A06(), this.A0D.A0O().A0E().A05(), null, false, true);
        TextView descriptionTv = no.getDescriptionTextView();
        descriptionTv.setAlpha(0.8f);
        descriptionTv.setMaxLines(1);
        descriptionTv.setEllipsize(TextUtils.TruncateAt.END);
        TextView descriptionTv2 = no.getTitleTextView();
        descriptionTv2.setMaxLines(1);
        descriptionTv2.setEllipsize(TextUtils.TruncateAt.END);
        return no;
    }

    private void A0H() {
        int i = A0b;
        RelativeLayout.LayoutParams ratingInfoContainerParams = new RelativeLayout.LayoutParams(i, i);
        ratingInfoContainerParams.addRule(15);
        ratingInfoContainerParams.addRule(9);
        NI ni = new NI(this.A0G);
        LE.A0M(ni, 0);
        LE.A0K(ni);
        AsyncTaskC0685Ro asyncTaskC0685Ro = new AsyncTaskC0685Ro(ni, this.A0G);
        int i2 = A0b;
        asyncTaskC0685Ro.A05(i2, i2).A07(this.A0D.A0R().A01());
        TextView textView = new TextView(this.A0G);
        LE.A0K(textView);
        textView.setLayoutParams(new LinearLayout.LayoutParams(-2, -2));
        textView.setTextColor(this.A0D.A0N().A01().A06(true));
        textView.setText(this.A0D.A0O().A0E().A06());
        textView.setTextSize(16.0f);
        textView.setMaxLines(1);
        textView.setEllipsize(TextUtils.TruncateAt.END);
        NK nk = new NK(this.A0G, A0e, 5, A0d, -1);
        nk.setGravity(16);
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-2, -1);
        TextView textView2 = new TextView(this.A0G);
        textView2.setTextColor(this.A0D.A0N().A01().A06(true));
        textView2.setGravity(16);
        textView2.setIncludeFontPadding(false);
        LinearLayout.LayoutParams layoutParams2 = new LinearLayout.LayoutParams(-2, -1);
        layoutParams2.leftMargin = A0Z;
        LinearLayout linearLayout = new LinearLayout(this.A0G);
        linearLayout.setOrientation(0);
        linearLayout.setGravity(16);
        RelativeLayout.LayoutParams layoutParams3 = new RelativeLayout.LayoutParams(-2, A0c);
        layoutParams3.topMargin = A0Z / 2;
        layoutParams3.addRule(3, textView.getId());
        linearLayout.addView(nk, layoutParams);
        linearLayout.addView(textView2, layoutParams2);
        RelativeLayout.LayoutParams layoutParams4 = new RelativeLayout.LayoutParams(-2, -2);
        layoutParams4.leftMargin = A0Z;
        layoutParams4.addRule(1, ni.getId());
        layoutParams4.addRule(15);
        RelativeLayout relativeLayout = new RelativeLayout(getContext());
        relativeLayout.addView(linearLayout, layoutParams3);
        relativeLayout.addView(textView);
        RelativeLayout relativeLayout2 = this.A02;
        if (relativeLayout2 != null) {
            relativeLayout2.removeAllViews();
            RelativeLayout relativeLayout3 = this.A02;
            if (A0X[4].length() != 18) {
                throw new RuntimeException();
            }
            A0X[4] = "bsFsSO04IJ4eZVQxRT";
            relativeLayout3.addView(relativeLayout, layoutParams4);
            this.A02.addView(ni, ratingInfoContainerParams);
        }
        if (TextUtils.isEmpty(this.A0D.A0O().A0E().A03())) {
            linearLayout.setVisibility(8);
            return;
        }
        linearLayout.setVisibility(0);
        nk.setRating(Float.parseFloat(this.A0D.A0O().A0E().A03()));
        if (this.A0D.A0O().A0E().A02() == null) {
            return;
        }
        textView2.setText(A0E(0, 1, 66) + NumberFormat.getNumberInstance().format(Integer.parseInt(this.A0D.A0O().A0E().A02())) + A0E(1, 1, 78));
    }

    private void A0I() {
        if (this.A0E.A0I()) {
            A0K();
        } else {
            A0N();
        }
        if (Build.VERSION.SDK_INT >= 19) {
            this.A0K.A05(L0.A04);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void A0J() {
        this.A0B = true;
        if (this.A0D.A0O().A0M()) {
            this.A07.A05();
            this.A0L.A3t(this.A0M.A5Y(), new C6v(0, 0));
            if (this.A08) {
                boolean z = this.A0T;
                if (A0X[4].length() != 18) {
                    throw new RuntimeException();
                }
                String[] strArr = A0X;
                strArr[1] = "I0JtICznoezMzS0InHXj65Cim";
                strArr[2] = "YxqOCBuXvZfwM";
                if (!z) {
                    N9.A03(this.A0G, this.A06.getViewabilityChecker(), this.A06.getTouchDataRecorder(), this.A0H, this.A0D.A0O().A0F(), this.A0D.A0U());
                }
            }
        }
    }

    private void A0K() {
        OD A0B = new OB(this.A0G, this.A0D.A0O().A0E(), this.A0D.A0R()).A08(this.A0D.A0N().A01()).A0A(this.A0E.A0G()).A09(this.A0E.A0D()).A07(2000).A0B();
        C0446Id.A04(A0B, this.A0I, EnumC0443Ia.A0U);
        addView(A0B, A0h);
        A0B.A04(new SE(this));
    }

    private void A0L() {
        this.A05 = A09();
        this.A01 = new RelativeLayout(getContext());
        LE.A0K(this.A01);
        RelativeLayout.LayoutParams adWebViewParams = new RelativeLayout.LayoutParams(-2, -2);
        int i = A0a;
        int i2 = A0g;
        adWebViewParams.setMargins(i, i2, i, i2);
        adWebViewParams.addRule(12);
        this.A02 = new RelativeLayout(getContext());
        LE.A0K(this.A02);
        if (this.A0S) {
            A0H();
        } else {
            RelativeLayout relativeLayout = this.A02;
            NO A0C = A0C();
            RelativeLayout.LayoutParams appMetadataLayoutParams = new RelativeLayout.LayoutParams(-2, -2);
            relativeLayout.addView(A0C, appMetadataLayoutParams);
        }
        RelativeLayout.LayoutParams iconAndMetaDataContainerParams = new RelativeLayout.LayoutParams(-1, -2);
        iconAndMetaDataContainerParams.setMargins(0, 0, A0a, 0);
        this.A01.addView(this.A02, iconAndMetaDataContainerParams);
        View$OnClickListenerC0683Rm view$OnClickListenerC0683Rm = this.A05;
        if (view$OnClickListenerC0683Rm != null) {
            iconAndMetaDataContainerParams.addRule(0, view$OnClickListenerC0683Rm.getId());
            RelativeLayout.LayoutParams iconAndMetaDataContainerParams2 = new RelativeLayout.LayoutParams(-2, -2);
            iconAndMetaDataContainerParams2.addRule(11);
            iconAndMetaDataContainerParams2.addRule(6, this.A02.getId());
            iconAndMetaDataContainerParams2.addRule(8, this.A02.getId());
            this.A01.addView(this.A05, iconAndMetaDataContainerParams2);
        }
        LE.A0K(this.A0V);
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-1, -2);
        layoutParams.addRule(10);
        RelativeLayout.LayoutParams iconAndMetaDataContainerParams3 = new RelativeLayout.LayoutParams(-1, -1);
        int i3 = A0a;
        iconAndMetaDataContainerParams3.setMargins(i3, 0, i3, 0);
        iconAndMetaDataContainerParams3.addRule(3, this.A0V.getId());
        iconAndMetaDataContainerParams3.addRule(2, this.A01.getId());
        this.A0V.setVisibility(4);
        this.A06.setVisibility(4);
        this.A01.setVisibility(4);
        addView(this.A0V, layoutParams);
        addView(this.A06, iconAndMetaDataContainerParams3);
        addView(this.A01, adWebViewParams);
        if (this.A0E.A0J()) {
            this.A06.A0B();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void A0M() {
        new C0444Ib(this.A0D.A0U(), this.A0H).A02(EnumC0443Ia.A0r, null);
        this.A0Q.set(true);
        LE.A0T(this);
        LE.A0H(this.A06);
        LE.A0Z(this.A0O, this.A00, this.A06);
        LE.A0L(this.A0V);
        LE.A0L(this.A05);
        Pair<EnumC0594Ob, View> A03 = this.A0P.A03(this.A05);
        this.A00 = (View) A03.second;
        int i = C0531Lo.A00[((EnumC0594Ob) A03.first).ordinal()];
        if (i != 1) {
            if (i != 2) {
                return;
            }
            RelativeLayout relativeLayout = this.A01;
            if (relativeLayout != null) {
                LE.A0Z(relativeLayout);
            }
            addView(this.A00, new RelativeLayout.LayoutParams(-1, -1));
            return;
        }
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-1, -1);
        layoutParams.setMargins(0, this.A0V.getToolbarHeight(), 0, 0);
        LE.A0L(this.A01);
        RelativeLayout relativeLayout2 = this.A01;
        if (relativeLayout2 != null) {
            layoutParams.addRule(2, relativeLayout2.getId());
        }
        addView(this.A00, layoutParams);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void A0N() {
        LE.A0T(this);
        if (!this.A0E.A0J()) {
            OX ox = this.A06;
            if (A0X[4].length() != 18) {
                throw new RuntimeException();
            }
            String[] strArr = A0X;
            strArr[1] = "xj34PAIXy0BC0JvFurkBkOtWc";
            strArr[2] = "hWQrQPNffHRqy";
            ox.A0B();
        }
        this.A0V.setVisibility(0);
        this.A06.setVisibility(0);
        RelativeLayout relativeLayout = this.A01;
        if (relativeLayout != null) {
            relativeLayout.setVisibility(0);
        }
        this.A0J.A07();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void A0O() {
        Toast toast = this.A03;
        if (toast != null && toast.getView().getWindowVisibility() == 0) {
            return;
        }
        this.A03 = Toast.makeText(getContext(), this.A0E.A0C(), 1);
        A0Q((int) this.A0J.A03());
        this.A03.show();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void A0Q(int i) {
        String valueOf = String.valueOf(i);
        Toast toast = this.A03;
        String A0C = this.A0E.A0C();
        String progress = A0E(2, 6, 31);
        LE.A0Y(toast, A0C.replace(progress, valueOf), 49, 0, A0f);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void A0X(boolean z) {
        HashMap hashMap = new HashMap();
        hashMap.put(A0E(8, 12, 121), z ? A0E(67, 13, 37) : A0E(32, 12, 100));
        N9 n9 = new N9(this.A0G, this.A0M.A62(), this.A06.getViewabilityChecker(), this.A06.getTouchDataRecorder(), this.A0H, this.A0L);
        if (this.A0T) {
            n9.A08(this.A0D.A0U(), this.A0D.A0O().A0F().A05(), hashMap);
            return;
        }
        boolean z2 = !this.A0J.A04();
        n9.A0A(!z2);
        n9.A08(this.A0D.A0U(), this.A0D.A0O().A0F().A05(), hashMap);
        if (z2) {
            new Handler(Looper.getMainLooper()).post(new SC(this));
        }
        this.A08 = true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean A0Y() {
        if (!this.A0D.A0Y().equals(A0E(53, 14, 61))) {
            if (this.A0D.A0Y().equals(A0E(20, 12, 40))) {
                AnonymousClass18 anonymousClass18 = this.A0D;
                if (A0X[4].length() != 18) {
                    throw new RuntimeException();
                }
                A0X[0] = "r5y7OBqhAYVA47bIfl4AlIWKO2XfiX80";
                if (anonymousClass18.A0O().A0O()) {
                }
            }
            return false;
        }
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean A0Z() {
        return this.A0U && !this.A0A && !this.A0C && this.A0E.A07() < this.A0D.A0O().A0D().A02();
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC0520Ld
    public final void A8k(Intent intent, Bundle bundle, AnonymousClass59 anonymousClass59) {
        this.A04 = anonymousClass59;
        this.A04.A0K(this.A0F);
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC0520Ld
    public final void ABd(boolean z) {
        this.A0J.A06();
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC0520Ld
    public final void AC2(boolean z) {
        if (this.A0U && this.A0C) {
            return;
        }
        boolean z2 = this.A0A;
        if (A0X[5].charAt(2) == 'm') {
            throw new RuntimeException();
        }
        A0X[0] = "UQp6GtSKm4mkcrS1rXAjxFqYQJcA6U4M";
        if (!z2 && this.A0R.get() && !this.A0J.A05()) {
            this.A0J.A07();
        }
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC0520Ld
    public final void AEA(Bundle bundle) {
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC0520Ld
    public final boolean onActivityResult(int i, int i2, Intent intent) {
        return false;
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC0520Ld
    public final void onDestroy() {
        this.A0K.A03();
        AnonymousClass59 anonymousClass59 = this.A04;
        if (anonymousClass59 != null) {
            anonymousClass59.A0L(this.A0F);
        }
        if (this.A06 != null) {
            AnonymousClass18 anonymousClass18 = this.A0D;
            if (A0X[0].charAt(29) == 'D') {
                throw new RuntimeException();
            }
            A0X[0] = "voPpcOtL9PQSCLq1wYvqOCQr8JaLbGKq";
            if (!TextUtils.isEmpty(anonymousClass18.A0U())) {
                this.A0H.A8r(this.A0D.A0U(), new N2().A03(this.A06.getViewabilityChecker()).A02(this.A06.getTouchDataRecorder()).A05());
            }
            this.A06.A0C();
        }
        this.A0J.A06();
        this.A0V.setToolbarListener(null);
        this.A03 = null;
        this.A04 = null;
    }

    @Override // android.view.View
    public final void onWindowFocusChanged(boolean z) {
        super.onWindowFocusChanged(z);
        if (z) {
            AC2(false);
        } else {
            ABd(false);
        }
    }

    public void setListener(InterfaceC0519Lc interfaceC0519Lc) {
    }

    @VisibleForTesting
    public void setServerSideRewardHandler(C0596Od c0596Od) {
        this.A07 = c0596Od;
    }
}
