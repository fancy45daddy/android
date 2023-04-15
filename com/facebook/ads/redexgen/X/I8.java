package com.facebook.ads.redexgen.X;

import android.os.Handler;
import android.view.Surface;
import androidx.annotation.Nullable;
import com.facebook.ads.internal.exoplayer2.Format;
/* loaded from: assets/audience_network.dex */
public final class I8 {
    @Nullable
    public final Handler A00;
    @Nullable
    public final I9 A01;

    public I8(@Nullable Handler handler, @Nullable I9 i9) {
        this.A00 = i9 != null ? (Handler) H6.A01(handler) : null;
        this.A01 = i9;
    }

    public final void A01(int i, int i2, int i3, float f) {
        if (this.A01 != null) {
            this.A00.post(new I5(this, i, i2, i3, f));
        }
    }

    public final void A02(int i, long j) {
        if (this.A01 != null) {
            this.A00.post(new I4(this, i, j));
        }
    }

    public final void A03(Surface surface) {
        if (this.A01 != null) {
            this.A00.post(new I6(this, surface));
        }
    }

    public final void A04(Format format) {
        if (this.A01 != null) {
            this.A00.post(new I3(this, format));
        }
    }

    public final void A05(C0261Ai c0261Ai) {
        if (this.A01 != null) {
            this.A00.post(new I7(this, c0261Ai));
        }
    }

    public final void A06(C0261Ai c0261Ai) {
        if (this.A01 != null) {
            this.A00.post(new I1(this, c0261Ai));
        }
    }

    public final void A07(String str, long j, long j2) {
        if (this.A01 != null) {
            this.A00.post(new I2(this, str, j, j2));
        }
    }
}
