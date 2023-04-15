package com.facebook.ads.redexgen.X;

import com.facebook.ads.internal.exoplayer2.Format;
import java.io.EOFException;
import java.io.IOException;
/* renamed from: com.facebook.ads.redexgen.X.Vd  reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public final class C0774Vd implements InterfaceC0279Ba {
    @Override // com.facebook.ads.redexgen.X.InterfaceC0279Ba
    public final void A5T(Format format) {
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC0279Ba
    public final int AE7(BP bp, int i, boolean z) throws IOException, InterruptedException {
        int AEh = bp.AEh(i);
        if (AEh == -1) {
            if (z) {
                return -1;
            }
            throw new EOFException();
        }
        return AEh;
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC0279Ba
    public final void AE8(HV hv, int i) {
        hv.A0Z(i);
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC0279Ba
    public final void AE9(long j, int i, int i2, int i3, BZ bz) {
    }
}
