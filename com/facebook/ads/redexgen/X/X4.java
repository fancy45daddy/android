package com.facebook.ads.redexgen.X;

import android.graphics.drawable.Drawable;
import android.widget.ImageView;
import androidx.annotation.Nullable;
/* loaded from: assets/audience_network.dex */
public class X4 implements C5S {
    public final /* synthetic */ ImageView A00;
    public final /* synthetic */ C5U A01;
    public final /* synthetic */ C0718Sw A02;

    public X4(C5U c5u, ImageView imageView, C0718Sw c0718Sw) {
        this.A01 = c5u;
        this.A00 = imageView;
        this.A02 = c0718Sw;
    }

    @Override // com.facebook.ads.redexgen.X.C5S
    public final void AAs(@Nullable Drawable drawable) {
        C0718Sw.A0e(drawable, this.A00);
        this.A02.A1J(drawable);
    }
}
