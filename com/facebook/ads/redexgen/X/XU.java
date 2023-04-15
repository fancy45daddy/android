package com.facebook.ads.redexgen.X;

import a.a.j;
import android.view.View;
import android.view.animation.DecelerateInterpolator;
import android.widget.Scroller;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import java.util.Arrays;
/* loaded from: assets/audience_network.dex */
public abstract class XU extends C4W {
    public static byte[] A03;
    public static String[] A04 = {"WP5CpU5dCfM1vj2iCgRczyLeS833jqA7", "f0t6mABNpir4NiI1IJBR", "VMSqLwjWc3fXvu7D9B7JwatTJSWiKmSt", "2kGOlvpEajHcc9JJ5BV7kSrV8Uhb9VDh", "BGGgbgkg4NpzKA2XjpG6Q8iHB2GG9zH0", "ziOTckvigWpUqNYWulExTvMWDfbzI1Sq", "WkLWBkQ13lLgYVln8HDaQ7gYbGPRUWfj", "hZJ2tRP2pGaevCKAXmW2Fr9GhnOGACBf"};
    public C0339Dw A00;
    public Scroller A01;
    public final C4Y A02 = new XV(this);

    public static String A06(int i, int i2, int i3) {
        byte[] copyOfRange = Arrays.copyOfRange(A03, i, i + i2);
        for (int i4 = 0; i4 < copyOfRange.length; i4++) {
            copyOfRange[i4] = (byte) ((copyOfRange[i4] - i3) - 53);
        }
        return new String(copyOfRange);
    }

    public static void A09() {
        byte[] bArr = {-35, 10, -68, 5, 10, 15, 16, -3, 10, -1, 1, -68, 11, 2, -68, -21, 10, -30, 8, 5, 10, 3, -24, 5, 15, 16, 1, 10, 1, 14, -68, -3, 8, 14, 1, -3, 0, 21, -68, 15, 1, 16, -54};
        if (A04[2].length() != 32) {
            throw new RuntimeException();
        }
        String[] strArr = A04;
        strArr[3] = "Gfsvb5V6ZkZ1EjPhJmDEOg0wCX37AMGK";
        strArr[5] = "BogmwpJuEiSgKohE6B9VLJKkNQC2pxlX";
        A03 = bArr;
    }

    public abstract int A0C(C4T c4t, int i, int i2);

    @Nullable
    public abstract View A0D(C4T c4t);

    @Nullable
    public abstract int[] A0H(@NonNull C4T c4t, @NonNull View view);

    static {
        A09();
    }

    @Nullable
    private final AbstractC01144g A05(C4T c4t) {
        return A0E(c4t);
    }

    private void A07() {
        this.A00.A1k(this.A02);
        this.A00.setOnFlingListener(null);
    }

    private void A08() throws IllegalStateException {
        if (this.A00.getOnFlingListener() == null) {
            this.A00.A1j(this.A02);
            this.A00.setOnFlingListener(this);
            return;
        }
        throw new IllegalStateException(A06(0, 43, j.AppCompatTheme_textAppearanceSmallPopupMenu));
    }

    private boolean A0A(@NonNull C4T c4t, int i, int i2) {
        AbstractC01144g A05;
        if ((c4t instanceof InterfaceC01134f) && (A05 = A05(c4t)) != null) {
            int A0C = A0C(c4t, i, i2);
            String[] strArr = A04;
            if (strArr[0].charAt(25) != strArr[7].charAt(25)) {
                String[] strArr2 = A04;
                strArr2[0] = "3QNQgzU1MIdfo8xP0zEWa1SfaSPVi8u7";
                strArr2[7] = "BhxrOivCOMjMD1hwED78TbVHZR3oyoMb";
                if (A0C == -1) {
                    return false;
                }
                A05.A0A(A0C);
                c4t.A1L(A05);
                return true;
            }
            throw new RuntimeException();
        }
        return false;
    }

    @Override // com.facebook.ads.redexgen.X.C4W
    public final boolean A0B(int i, int i2) {
        C4T layoutManager = this.A00.getLayoutManager();
        if (layoutManager == null || this.A00.getAdapter() == null) {
            return false;
        }
        int minFlingVelocity = this.A00.getMinFlingVelocity();
        return (Math.abs(i2) > minFlingVelocity || Math.abs(i) > minFlingVelocity) && A0A(layoutManager, i, i2);
    }

    @Nullable
    @Deprecated
    public C0832Xj A0E(C4T c4t) {
        if (!(c4t instanceof InterfaceC01134f)) {
            return null;
        }
        return new C0338Dv(this, this.A00.getContext());
    }

    public final void A0F() {
        C4T layoutManager;
        View A0D;
        C0339Dw c0339Dw = this.A00;
        if (c0339Dw == null || (layoutManager = c0339Dw.getLayoutManager()) == null || (A0D = A0D(layoutManager)) == null) {
            return;
        }
        int[] A0H = A0H(layoutManager, A0D);
        if (A0H[0] != 0 || A0H[1] != 0) {
            this.A00.A1e(A0H[0], A0H[1]);
        }
    }

    public final void A0G(@Nullable C0339Dw c0339Dw) throws IllegalStateException {
        C0339Dw c0339Dw2 = this.A00;
        if (c0339Dw2 == c0339Dw) {
            return;
        }
        if (c0339Dw2 != null) {
            A07();
        }
        this.A00 = c0339Dw;
        if (this.A00 != null) {
            A08();
            this.A01 = new Scroller(this.A00.getContext(), new DecelerateInterpolator());
            A0F();
        }
    }
}
