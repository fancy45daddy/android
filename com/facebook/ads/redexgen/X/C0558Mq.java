package com.facebook.ads.redexgen.X;

import android.widget.RelativeLayout;
import androidx.annotation.Nullable;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
/* renamed from: com.facebook.ads.redexgen.X.Mq  reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public final class C0558Mq extends RelativeLayout {
    public static InterfaceC0519Lc A05;
    public static byte[] A06;
    public static String[] A07 = {"CT308ms2RTF49ixw7iITcI5DvAIGWMXZ", "UVauKq3DlAHpB1vMyeeSD4Us6AaVXCYd", "G3Ivv2DNtSsvdOlvNnw6jHI40eb4uyYL", "qur6nZLrhU9XJET37yOODnXWYcrj37IJ", "OCLfHPrXkMpm02uq88EYR3Uw1JpI2kE3", "KopKmjllEHptdGx3", "mL4xXMXopKoNgp", "1VwEGJcTQNgN7iTbFc9O"};
    public static final int A08;
    public static final int A09;
    public static final int A0A;
    public XU A00;
    public C0806Wj A01;
    public C00290w A02;
    @Nullable
    public C0694Rx A03;
    @Nullable
    public NH A04;

    public static String A00(int i, int i2, int i3) {
        byte[] copyOfRange = Arrays.copyOfRange(A06, i, i + i2);
        int i4 = 0;
        while (true) {
            int length = copyOfRange.length;
            if (A07[6].length() == 9) {
                throw new RuntimeException();
            }
            String[] strArr = A07;
            strArr[2] = "hwjeWCnyrgrPOyFOaJyYR4Ki88uO9bQs";
            strArr[0] = "4m7NTkn57B9pIqsgccGzW0RoTzQfESBy";
            if (i4 >= length) {
                return new String(copyOfRange);
            }
            copyOfRange[i4] = (byte) ((copyOfRange[i4] - i3) - 119);
            i4++;
        }
    }

    public static void A02() {
        A06 = new byte[]{-25, 5, 22, 19, 25, 23, 9, 16, -60, -14, 5, 24, 13, 26, 9, -60, 26, 13, 9, 27, -60, 5, 8, 9, 20, 24, 9, 22, -60, 13, 23, 18, -53, 24, -60, 7, 22, 9, 5, 24, 9, 8, -60, 20, 22, 19, 20, 9, 22, 16, 29, -5, -7, 2, -7, 6, -3, -9};
    }

    static {
        A02();
        A09 = (int) (Kd.A02 * 8.0f);
        A08 = A09 * 10;
        A0A = (int) (Kd.A02 * 15.0f);
        A05 = new C0693Rw();
    }

    public C0558Mq(C0806Wj c0806Wj) {
        super(c0806Wj);
        this.A01 = c0806Wj;
        this.A02 = new C00290w(c0806Wj);
        LE.A0K(this.A02);
        this.A00 = new C0340Dx();
        this.A00.A0G(this.A02);
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-1, -1);
        layoutParams.addRule(13);
        addView(this.A02, layoutParams);
    }

    private ArrayList<OM> A01(AnonymousClass18 anonymousClass18) {
        if (anonymousClass18 == null) {
            return new ArrayList<>();
        }
        List<C1B> A0c = anonymousClass18.A0c();
        ArrayList<OM> arrayList = new ArrayList<>(A0c.size());
        for (int i = 0; i < A0c.size(); i++) {
            arrayList.add(new OM(i, A0c.size(), A0c.get(i)));
        }
        return arrayList;
    }

    public final void A04() {
        this.A02.setAdapter(null);
    }

    public final void A05(C0718Sw c0718Sw, int i) {
        ArrayList<OM> A01 = A01(c0718Sw.A0z());
        this.A02.setCardsInfo(A01);
        this.A03 = new C0694Rx(this.A01, A01, c0718Sw.A0z(), this.A01.A00().A08(), c0718Sw, A05, c0718Sw.A0z().A0U(), this.A02.getCarouselCardBehaviorHelper(), null);
        this.A02.setAdapter(this.A03);
        this.A03.A0F(i - A08, 16, 0);
        this.A03.A07();
        setupDotsLayout(c0718Sw, A01);
    }

    public final void A06(C0627Pi c0627Pi) {
        C0694Rx c0694Rx = this.A03;
        if (c0694Rx != null) {
            c0694Rx.A0G(c0627Pi);
        } else {
            this.A01.A06().A8u(A00(51, 7, 29), C01877l.A1u, new C01887m(A00(0, 51, 45)));
        }
        this.A02.A22(c0627Pi);
    }

    public static InterfaceC0519Lc getDummyListener() {
        return A05;
    }

    @Override // android.widget.RelativeLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        C0694Rx c0694Rx;
        if (z && (c0694Rx = this.A03) != null) {
            c0694Rx.A0F((i3 - i) - A08, 16, 0);
        }
        super.onLayout(z, i, i2, i3, i4);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setUpLayoutForCardAtIndex(int i) {
        NH nh = this.A04;
        if (nh != null) {
            nh.A00(i);
        }
    }

    private void setupDotsLayout(C0718Sw c0718Sw, ArrayList<OM> arrayList) {
        this.A02.getCarouselCardBehaviorHelper().A0Z(new C0692Rv(this));
        this.A04 = new NH(this.A01, c0718Sw.A0z().A0N().A01(), arrayList.size());
        LE.A0K(this.A04);
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-1, -2);
        layoutParams.addRule(3, this.A02.getId());
        layoutParams.setMargins(0, A0A, 0, 0);
        addView(this.A04, layoutParams);
    }
}
