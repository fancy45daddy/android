package com.facebook.ads.redexgen.X;

import android.text.TextUtils;
import android.util.SparseBooleanArray;
import android.view.ViewGroup;
import androidx.annotation.Nullable;
import com.facebook.proguard.annotations.DoNotStrip;
import java.lang.ref.WeakReference;
/* renamed from: com.facebook.ads.redexgen.X.Qo  reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public final class C0659Qo extends AbstractC01194l {
    @Nullable
    @DoNotStrip
    public AbstractC0626Ph A00;
    public C0627Pi A01;
    @Nullable
    public C0627Pi A02;
    public final int A03;
    public final SparseBooleanArray A04;
    public final C0806Wj A05;
    public final C02268y A06;

    public C0659Qo(C02268y c02268y, SparseBooleanArray sparseBooleanArray, C0627Pi c0627Pi, int i, C0806Wj c0806Wj) {
        super(c02268y);
        this.A05 = c0806Wj;
        this.A06 = c02268y;
        this.A04 = sparseBooleanArray;
        this.A01 = c0627Pi;
        this.A03 = i;
    }

    private void A08(IT it, L6 l6, String str, OM om) {
        if (this.A04.get(om.A02())) {
            return;
        }
        C0627Pi c0627Pi = this.A02;
        if (c0627Pi != null) {
            c0627Pi.A0V();
            this.A02 = null;
        }
        this.A00 = new C0661Qq(this, str, om, it, om.A04(), l6);
        this.A02 = new C0627Pi(this.A06, 10, new WeakReference(this.A00), this.A05);
        this.A02.A0Y(false);
        this.A02.A0W(100);
        this.A02.A0X(100);
        this.A06.setOnAssetsLoadedListener(new C0660Qp(this, om));
    }

    public final void A0l(OM om, IT it, C6G c6g, L6 l6, String str, int i, int i2, int i3) {
        int A02 = om.A02();
        this.A06.setTag(-1593835536, Integer.valueOf(A02));
        this.A06.setupNativeCtaExtension(om);
        ViewGroup.MarginLayoutParams params = new ViewGroup.MarginLayoutParams(i, -2);
        int i4 = A02 == 0 ? i3 : i2;
        if (A02 < this.A03 - 1) {
            i3 = i2;
        }
        params.setMargins(i4, 0, i3, 0);
        String A07 = om.A03().A0D().A07();
        String A08 = om.A03().A0D().A08();
        this.A06.setIsVideo(!TextUtils.isEmpty(A08));
        if (this.A06.A0i()) {
            this.A06.setVideoPlaceholderUrl(A07);
            this.A06.setVideoUrl(c6g.A0S(A08));
        } else {
            this.A06.setImageUrl(A07);
        }
        this.A06.setLayoutParams(params);
        this.A06.A0j(om.A04());
        A08(it, l6, str, om);
    }

    public final void A0m(C0627Pi c0627Pi) {
        this.A01 = c0627Pi;
    }
}
