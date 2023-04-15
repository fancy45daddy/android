package com.facebook.ads.redexgen.X;

import android.text.TextUtils;
import android.util.Pair;
import android.view.View;
import android.widget.LinearLayout;
import androidx.annotation.Nullable;
/* renamed from: com.facebook.ads.redexgen.X.Oc  reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public final class C0595Oc {
    public final AnonymousClass19 A00;
    public final C1I A01;
    public final C1M A02;
    public final C1U A03;
    public final C0806Wj A04;
    public final C0444Ib A05;
    public static String[] A06 = {"67PC1vS7qkP", "IjFo3BG6VwtzNtFBLMxB3hm7uxcMitzp", "CicRHWg02u8tYTVNboa", "Lc1HqPOOGgkkm0o4iF185HVfJQb2Oy4J", "rfUiy7qGv2cTTJD", "veTQu7RBhk0w6DuY7Y8JViB1PkIKs", "nFnk8VxBkehLa6QhTm5QccOE2IAl", "l0nPd7gOfqjUiTZVoVDHfvPfOU4VPF8e"};
    public static final int A09 = (int) (Kd.A02 * 4.0f);
    public static final int A07 = (int) (Kd.A02 * 72.0f);
    public static final int A08 = (int) (Kd.A02 * 8.0f);

    public C0595Oc(C0806Wj c0806Wj, IT it, AnonymousClass18 anonymousClass18) {
        this.A04 = c0806Wj;
        this.A05 = new C0444Ib(anonymousClass18.A0U(), it);
        this.A00 = anonymousClass18.A0N();
        this.A01 = anonymousClass18.A0O().A0E();
        this.A03 = anonymousClass18.A0R();
        this.A02 = anonymousClass18.A0O().A0G();
    }

    private View A00() {
        C0339Dw c0339Dw = new C0339Dw(this.A04);
        c0339Dw.setLayoutManager(new C0833Xk(this.A04, 0, false));
        c0339Dw.setAdapter(new C0651Qg(this.A04, this.A02.A00(), A09));
        return c0339Dw;
    }

    private View A01(@Nullable View$OnClickListenerC0683Rm view$OnClickListenerC0683Rm) {
        NO no = new NO(this.A04, this.A00.A01(), true, false, false);
        no.A01(this.A01.A06(), this.A01.A01(), null, false, true);
        no.setAlignment(17);
        NI ni = new NI(this.A04);
        LE.A0M(ni, 0);
        ni.setRadius(50);
        new AsyncTaskC0685Ro(ni, this.A04).A04().A07(this.A03.A01());
        LinearLayout linearLayout = new LinearLayout(this.A04);
        linearLayout.setOrientation(1);
        linearLayout.setGravity(17);
        int i = A07;
        linearLayout.addView(ni, new LinearLayout.LayoutParams(i, i));
        LinearLayout.LayoutParams imageParams = new LinearLayout.LayoutParams(-2, -2);
        int i2 = A08;
        imageParams.setMargins(0, i2, 0, i2);
        linearLayout.addView(no, imageParams);
        if (view$OnClickListenerC0683Rm != null) {
            LE.A0J(view$OnClickListenerC0683Rm);
            linearLayout.addView(view$OnClickListenerC0683Rm, imageParams);
            if (TextUtils.isEmpty(view$OnClickListenerC0683Rm.getText())) {
                LE.A0H(view$OnClickListenerC0683Rm);
            }
        }
        return linearLayout;
    }

    private final EnumC0594Ob A02() {
        if (!this.A02.A00().isEmpty()) {
            return EnumC0594Ob.A04;
        }
        EnumC0594Ob enumC0594Ob = EnumC0594Ob.A03;
        String[] strArr = A06;
        if (strArr[3].charAt(8) != strArr[7].charAt(8)) {
            A06[4] = "qwlEjiYhEcV8j1J";
            return enumC0594Ob;
        }
        throw new RuntimeException();
    }

    public final Pair<EnumC0594Ob, View> A03(@Nullable View$OnClickListenerC0683Rm view$OnClickListenerC0683Rm) {
        View A00;
        EnumC0594Ob A02 = A02();
        if (C0593Oa.A00[A02.ordinal()] != 1) {
            A00 = A01(view$OnClickListenerC0683Rm);
        } else {
            A00 = A00();
        }
        C0446Id.A04(A00, this.A05, EnumC0443Ia.A0S);
        return new Pair<>(A02, A00);
    }
}
