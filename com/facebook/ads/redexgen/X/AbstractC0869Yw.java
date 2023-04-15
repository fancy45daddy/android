package com.facebook.ads.redexgen.X;

import android.view.ViewGroup;
import android.widget.ImageView;
import androidx.annotation.Nullable;
import com.facebook.proguard.annotations.DoNotStrip;
import java.util.List;
/* renamed from: com.facebook.ads.redexgen.X.Yw  reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public abstract class AbstractC0869Yw extends C4H<SN> {
    public static final int A05 = (int) (Kd.A02 * 4.0f);
    @Nullable
    public AnonymousClass17 A00;
    public final List<C0718Sw> A01;
    public final int A02;
    public final C0806Wj A03;
    @DoNotStrip
    public final AbstractC0626Ph A04 = new C0871Yy(this);

    public AbstractC0869Yw(C1A c1a, List<C0718Sw> list, C0806Wj c0806Wj) {
        this.A03 = c0806Wj;
        this.A02 = c1a.getChildSpacing();
        this.A01 = list;
    }

    private ViewGroup.MarginLayoutParams A02(int i) {
        ViewGroup.MarginLayoutParams marginLayoutParams = new ViewGroup.MarginLayoutParams(-2, -1);
        int i2 = this.A02;
        if (i == 0) {
            i2 *= 2;
        }
        marginLayoutParams.setMargins(i2, 0, i >= this.A01.size() + (-1) ? this.A02 * 2 : this.A02, 0);
        return marginLayoutParams;
    }

    @Override // com.facebook.ads.redexgen.X.C4H
    public final int A0D() {
        return this.A01.size();
    }

    public final void A0F(ImageView imageView, int i) {
        C0718Sw c0718Sw = this.A01.get(i);
        C0460Ir adCoverImage = c0718Sw.getAdCoverImage();
        if (adCoverImage != null) {
            AsyncTaskC0685Ro A04 = new AsyncTaskC0685Ro(imageView, this.A03).A04();
            A04.A06(new C0870Yx(this, i, c0718Sw));
            A04.A07(adCoverImage.getUrl());
        }
    }

    public final void A0G(AnonymousClass17 anonymousClass17) {
        this.A00 = anonymousClass17;
    }

    @Override // com.facebook.ads.redexgen.X.C4H
    /* renamed from: A0H */
    public void A0E(SN sn, int i) {
        sn.A0l().setLayoutParams(A02(i));
    }
}
