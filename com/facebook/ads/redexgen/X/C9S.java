package com.facebook.ads.redexgen.X;

import androidx.annotation.Nullable;
import com.facebook.ads.internal.exoplayer2.source.TrackGroupArray;
/* renamed from: com.facebook.ads.redexgen.X.9S  reason: invalid class name */
/* loaded from: assets/audience_network.dex */
public final class C9S {
    public final int A00;
    public final long A01;
    public final long A02;
    public final AbstractC02409n A03;
    public final EK A04;
    public final TrackGroupArray A05;
    public final GG A06;
    @Nullable
    public final Object A07;
    public final boolean A08;
    public volatile long A09;
    public volatile long A0A;

    public C9S(AbstractC02409n abstractC02409n, long j, TrackGroupArray trackGroupArray, GG gg) {
        this(abstractC02409n, null, new EK(0), j, -9223372036854775807L, 1, false, trackGroupArray, gg);
    }

    public C9S(AbstractC02409n abstractC02409n, @Nullable Object obj, EK ek, long j, long j2, int i, boolean z, TrackGroupArray trackGroupArray, GG gg) {
        this.A03 = abstractC02409n;
        this.A07 = obj;
        this.A04 = ek;
        this.A02 = j;
        this.A01 = j2;
        this.A0A = j;
        this.A09 = j;
        this.A00 = i;
        this.A08 = z;
        this.A05 = trackGroupArray;
        this.A06 = gg;
    }

    public static void A00(C9S c9s, C9S c9s2) {
        c9s2.A0A = c9s.A0A;
        c9s2.A09 = c9s.A09;
    }

    public final C9S A01(int i) {
        C9S c9s = new C9S(this.A03, this.A07, this.A04.A00(i), this.A02, this.A01, this.A00, this.A08, this.A05, this.A06);
        A00(this, c9s);
        return c9s;
    }

    public final C9S A02(int i) {
        C9S playbackInfo = new C9S(this.A03, this.A07, this.A04, this.A02, this.A01, i, this.A08, this.A05, this.A06);
        A00(this, playbackInfo);
        return playbackInfo;
    }

    public final C9S A03(AbstractC02409n abstractC02409n, Object obj) {
        C9S playbackInfo = new C9S(abstractC02409n, obj, this.A04, this.A02, this.A01, this.A00, this.A08, this.A05, this.A06);
        A00(this, playbackInfo);
        return playbackInfo;
    }

    public final C9S A04(EK ek, long j, long j2) {
        long j3 = j2;
        AbstractC02409n abstractC02409n = this.A03;
        Object obj = this.A07;
        if (!ek.A01()) {
            j3 = -9223372036854775807L;
        }
        return new C9S(abstractC02409n, obj, ek, j, j3, this.A00, this.A08, this.A05, this.A06);
    }

    public final C9S A05(TrackGroupArray trackGroupArray, GG gg) {
        C9S playbackInfo = new C9S(this.A03, this.A07, this.A04, this.A02, this.A01, this.A00, this.A08, trackGroupArray, gg);
        A00(this, playbackInfo);
        return playbackInfo;
    }

    public final C9S A06(boolean z) {
        C9S playbackInfo = new C9S(this.A03, this.A07, this.A04, this.A02, this.A01, this.A00, z, this.A05, this.A06);
        A00(this, playbackInfo);
        return playbackInfo;
    }
}
