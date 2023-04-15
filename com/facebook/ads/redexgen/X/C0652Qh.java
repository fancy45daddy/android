package com.facebook.ads.redexgen.X;

import android.text.TextUtils;
import android.util.SparseBooleanArray;
import android.view.ViewGroup;
import androidx.annotation.Nullable;
import com.facebook.proguard.annotations.DoNotStrip;
import java.lang.ref.WeakReference;
/* renamed from: com.facebook.ads.redexgen.X.Qh  reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public final class C0652Qh extends AbstractC01194l {
    public static String[] A0A = {"av2tITPhYKbVn20ukUfJR25ELbcgjHbj", "MLeLe181lhP7dC21QqjxU1VDKV9lNkzJ", "XUmY4VBJ2tlJWKlPJ7YkBdCsKtcC", "bK6oHsXedskfaWsjnVeS6YyvP0sRA20b", "BhCeFQN4dHt9z3MLE3p7bnIzhrf86Cw8", "mLW9T0fP2Q5Hob07hRXsv0QUH1fN4", "pNzPXZ5fcby2PvmlRsfUzns43oHDF5Mi", "3YktW7BrcDIc4Xw2f2zdWv5xFETbHIAE"};
    @DoNotStrip
    public AbstractC0626Ph A00;
    public C0627Pi A01;
    @Nullable
    public C0627Pi A02;
    public final int A03;
    public final int A04;
    public final int A05;
    public final int A06;
    public final SparseBooleanArray A07;
    public final C0806Wj A08;
    public final AbstractC02188q A09;

    public C0652Qh(AbstractC02188q abstractC02188q, SparseBooleanArray sparseBooleanArray, C0627Pi c0627Pi, int i, int i2, int i3, int i4, C0806Wj c0806Wj) {
        super(abstractC02188q);
        this.A08 = c0806Wj;
        this.A09 = abstractC02188q;
        this.A07 = sparseBooleanArray;
        this.A01 = c0627Pi;
        this.A03 = i;
        this.A04 = i2;
        this.A05 = i3;
        this.A06 = i4;
    }

    private void A08(IT it, L6 l6, String str, OM om) {
        if (this.A07.get(om.A02())) {
            return;
        }
        C0627Pi c0627Pi = this.A02;
        if (c0627Pi != null) {
            c0627Pi.A0V();
            if (A0A[4].charAt(16) != 'E') {
                throw new RuntimeException();
            }
            A0A[4] = "iteeE4SnfkkyQnEAEqI0za4snrHpWaXy";
            this.A02 = null;
        }
        this.A00 = new C0654Qj(this, str, om, it, om.A04(), l6);
        this.A02 = new C0627Pi(this.A09, 10, new WeakReference(this.A00), this.A08);
        this.A02.A0Y(false);
        this.A02.A0W(100);
        this.A02.A0X(100);
        this.A09.setOnAssetsLoadedListener(new C0653Qi(this, om));
    }

    public final void A0l(OM om, IT it, C6G c6g, L6 l6, String str) {
        int A02 = om.A02();
        this.A09.setTag(-1593835536, Integer.valueOf(A02));
        ViewGroup.MarginLayoutParams marginLayoutParams = new ViewGroup.MarginLayoutParams(this.A03, -2);
        int rightMargin = A02 == 0 ? this.A04 : this.A05;
        int position = this.A06;
        marginLayoutParams.setMargins(rightMargin, 0, A02 >= position + (-1) ? this.A04 : this.A05, 0);
        String imageUrl = om.A03().A0D().A07();
        String A08 = om.A03().A0D().A08();
        this.A09.setIsVideo(!TextUtils.isEmpty(A08));
        if (this.A09.A0i()) {
            this.A09.setVideoPlaceholderUrl(imageUrl);
            this.A09.setVideoUrl(c6g.A0S(A08));
        } else {
            this.A09.setImageUrl(imageUrl);
        }
        this.A09.setLayoutParams(marginLayoutParams);
        this.A09.setAdTitleAndDescription(om.A03().A0E().A06(), om.A03().A0E().A01());
        this.A09.setCTAInfo(om.A03().A0F(), om.A04());
        this.A09.A0k(om.A04());
        A08(it, l6, str, om);
    }
}
