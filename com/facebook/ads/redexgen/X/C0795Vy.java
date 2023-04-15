package com.facebook.ads.redexgen.X;

import android.view.Surface;
import androidx.annotation.Nullable;
import com.facebook.ads.internal.exoplayer2.Format;
import com.facebook.ads.internal.exoplayer2.analytics.AnalyticsCollector;
import com.facebook.ads.internal.exoplayer2.metadata.Metadata;
import com.facebook.ads.internal.exoplayer2.source.TrackGroupArray;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArraySet;
/* renamed from: com.facebook.ads.redexgen.X.Vy  reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public final class C0795Vy implements C9W, D5, AF, I9, InterfaceC0343Ea, GK, InterfaceC0275Aw {
    public static String[] A05 = {"oWxliEG", "84CCzfJSWHAMzlT", "dVPYU5AFfnLld9", "202VfNqPV04zLFr42xUQnFXcv", "6C2OHs0d6U2aNpx0mThNdUqCMJf7H", "j36hHuSQknS9Y2BeP2DWP06EygcBzL55", "WN9koNHhTr4SbLKtJDKTY2JTPC", "f2Eog"};
    public InterfaceC02299b A00;
    public final H9 A03;
    public final CopyOnWriteArraySet<InterfaceC02459s> A04 = new CopyOnWriteArraySet<>();
    public final C02429p A02 = new C02429p();
    public final C02399m A01 = new C02399m();

    /* JADX WARN: Failed to parse debug info
    java.lang.ArrayIndexOutOfBoundsException: Index 19 out of bounds for length 18
    	at jadx.plugins.input.dex.sections.debuginfo.DebugInfoParser.startVar(DebugInfoParser.java:203)
    	at jadx.plugins.input.dex.sections.debuginfo.DebugInfoParser.process(DebugInfoParser.java:125)
    	at jadx.plugins.input.dex.sections.DexCodeReader.getDebugInfo(DexCodeReader.java:118)
    	at jadx.core.dex.nodes.MethodNode.getDebugInfo(MethodNode.java:567)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.visit(DebugInfoAttachVisitor.java:39)
     */
    /* JADX WARN: Type inference failed for: r3v0, types: [com.facebook.ads.redexgen.X.9r] */
    private final C02449r A04(final int i, @Nullable final EK ek) {
        H6.A01(this.A00);
        final long A57 = this.A03.A57();
        final AbstractC02409n A6F = this.A00.A6F();
        final long A68 = i == this.A00.A6G() ? (ek == null || !ek.A01()) ? this.A00.A68() : (this.A00.A6A() == ek.A00 && this.A00.A6B() == ek.A01) ? this.A00.A6D() : 0L : (i >= A6F.A01() || (ek != null && ek.A01())) ? 0L : A6F.A0B(i, this.A01).A00();
        final long A5q = this.A00.A5q() - this.A00.A68();
        final long A6D = this.A00.A6D();
        return new Object(A57, A6F, i, ek, A68, A6D, A5q) { // from class: com.facebook.ads.redexgen.X.9r
            public final int A00;
            public final long A01;
            public final long A02;
            public final long A03;
            public final long A04;
            public final AbstractC02409n A05;
            @Nullable
            public final EK A06;

            {
                this.A03 = A57;
                this.A05 = A6F;
                this.A00 = i;
                this.A06 = ek;
                this.A02 = A68;
                this.A01 = A6D;
                this.A04 = A5q;
            }
        };
    }

    /* JADX WARN: Failed to parse debug info
    java.lang.ArrayIndexOutOfBoundsException: Index 9 out of bounds for length 8
    	at jadx.plugins.input.dex.sections.debuginfo.DebugInfoParser.startVar(DebugInfoParser.java:203)
    	at jadx.plugins.input.dex.sections.debuginfo.DebugInfoParser.process(DebugInfoParser.java:125)
    	at jadx.plugins.input.dex.sections.DexCodeReader.getDebugInfo(DexCodeReader.java:118)
    	at jadx.core.dex.nodes.MethodNode.getDebugInfo(MethodNode.java:567)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.visit(DebugInfoAttachVisitor.java:39)
     */
    @Override // com.facebook.ads.redexgen.X.GK
    public final void AA5(int i, long j, long j2) {
        A01();
        Iterator<InterfaceC02459s> it = this.A04.iterator();
        while (it.hasNext()) {
            it.next();
        }
    }

    public C0795Vy(@Nullable InterfaceC02299b interfaceC02299b, H9 h9) {
        this.A00 = interfaceC02299b;
        this.A03 = (H9) H6.A01(h9);
    }

    private C02449r A00() {
        return A05(this.A02.A03());
    }

    private C02449r A01() {
        return A05(this.A02.A04());
    }

    private C02449r A02() {
        return A05(this.A02.A05());
    }

    private C02449r A03() {
        return A05(this.A02.A06());
    }

    private C02449r A05(@Nullable C02439q c02439q) {
        if (c02439q == null) {
            int A6G = ((InterfaceC02299b) H6.A01(this.A00)).A6G();
            return A04(A6G, this.A02.A07(A6G));
        }
        return A04(c02439q.A00, c02439q.A01);
    }

    public final void A06() {
        if (!this.A02.A0F()) {
            C02449r A02 = A02();
            this.A02.A09();
            Iterator<InterfaceC02459s> it = this.A04.iterator();
            while (it.hasNext()) {
                InterfaceC02459s next = it.next();
                String[] strArr = A05;
                if (strArr[1].length() == strArr[4].length()) {
                    throw new RuntimeException();
                }
                String[] strArr2 = A05;
                strArr2[1] = "PBkwxeOlbvYzAOz";
                strArr2[4] = "zMCnce58Qhbdr93RoMzV7EOLVlkYq";
                next.onSeekStarted(A02);
            }
        }
    }

    public final void A07() {
        ArrayList arrayList;
        arrayList = this.A02.A05;
        List<AnalyticsCollector.WindowAndMediaPeriodId> activeMediaPeriods = new ArrayList<>(arrayList);
        Iterator<AnalyticsCollector.WindowAndMediaPeriodId> it = activeMediaPeriods.iterator();
        while (true) {
            boolean hasNext = it.hasNext();
            String[] strArr = A05;
            if (strArr[1].length() == strArr[4].length()) {
                throw new RuntimeException();
            }
            A05[0] = "gG2PlvUwOW39eC8R";
            if (hasNext) {
                C02439q c02439q = (C02439q) it.next();
                ABP(c02439q.A00, c02439q.A01);
            } else {
                return;
            }
        }
    }

    @Override // com.facebook.ads.redexgen.X.AF
    public final void A9y(String str, long j, long j2) {
        C02449r A03 = A03();
        Iterator<InterfaceC02459s> it = this.A04.iterator();
        while (it.hasNext()) {
            it.next().onDecoderInitialized(A03, 1, str, j2);
        }
    }

    @Override // com.facebook.ads.redexgen.X.AF
    public final void A9z(C0261Ai c0261Ai) {
        C02449r A00 = A00();
        Iterator<InterfaceC02459s> it = this.A04.iterator();
        while (it.hasNext()) {
            it.next().onDecoderDisabled(A00, 1, c0261Ai);
        }
    }

    @Override // com.facebook.ads.redexgen.X.AF
    public final void AA0(C0261Ai c0261Ai) {
        C02449r A02 = A02();
        Iterator<InterfaceC02459s> it = this.A04.iterator();
        while (it.hasNext()) {
            it.next().onDecoderEnabled(A02, 1, c0261Ai);
        }
    }

    @Override // com.facebook.ads.redexgen.X.AF
    public final void AA1(Format format) {
        C02449r A03 = A03();
        Iterator<InterfaceC02459s> it = this.A04.iterator();
        while (it.hasNext()) {
            it.next().onDecoderInputFormatChanged(A03, 1, format);
        }
    }

    @Override // com.facebook.ads.redexgen.X.AF
    public final void AA2(int i) {
        C02449r A03 = A03();
        Iterator<InterfaceC02459s> it = this.A04.iterator();
        while (it.hasNext()) {
            it.next().onAudioSessionId(A03, i);
        }
    }

    @Override // com.facebook.ads.redexgen.X.AF
    public final void AA3(int i, long j, long j2) {
        C02449r A03 = A03();
        Iterator<InterfaceC02459s> it = this.A04.iterator();
        while (true) {
            boolean hasNext = it.hasNext();
            if (A05[2].length() == 13) {
                throw new RuntimeException();
            }
            String[] strArr = A05;
            strArr[1] = "uqo4gq1KBxiMktN";
            strArr[4] = "Ndm2ibG2UK8Su1apjnSt0jhcojAUZ";
            if (hasNext) {
                it.next().onAudioUnderrun(A03, i, j, j2);
            } else {
                return;
            }
        }
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC0343Ea
    public final void AAT(int i, @Nullable EK ek, EZ ez) {
        C02449r A04 = A04(i, ek);
        Iterator<InterfaceC02459s> it = this.A04.iterator();
        while (it.hasNext()) {
            it.next().onDownstreamFormatChanged(A04, ez);
        }
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC0275Aw
    public final void AAU() {
        C02449r A03 = A03();
        Iterator<InterfaceC02459s> it = this.A04.iterator();
        while (it.hasNext()) {
            it.next().onDrmKeysLoaded(A03);
        }
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC0275Aw
    public final void AAV() {
        C02449r A03 = A03();
        Iterator<InterfaceC02459s> it = this.A04.iterator();
        while (it.hasNext()) {
            it.next().onDrmKeysRemoved(A03);
        }
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC0275Aw
    public final void AAW() {
        C02449r A03 = A03();
        Iterator<InterfaceC02459s> it = this.A04.iterator();
        while (it.hasNext()) {
            it.next().onDrmKeysRestored(A03);
        }
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC0275Aw
    public final void AAX(Exception exc) {
        C02449r A03 = A03();
        Iterator<InterfaceC02459s> it = this.A04.iterator();
        while (it.hasNext()) {
            it.next().onDrmSessionManagerError(A03, exc);
        }
    }

    @Override // com.facebook.ads.redexgen.X.I9
    public final void AAY(int i, long j) {
        C02449r A00 = A00();
        Iterator<InterfaceC02459s> it = this.A04.iterator();
        while (it.hasNext()) {
            it.next().onDroppedVideoFrames(A00, i, j);
        }
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC0343Ea
    public final void AB8(int i, @Nullable EK ek, EY ey, EZ ez) {
        A04(i, ek);
        Iterator<InterfaceC02459s> it = this.A04.iterator();
        while (it.hasNext()) {
            it.next();
        }
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC0343Ea
    public final void ABA(int i, @Nullable EK ek, EY ey, EZ ez) {
        A04(i, ek);
        Iterator<InterfaceC02459s> it = this.A04.iterator();
        while (it.hasNext()) {
            it.next();
        }
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC0343Ea
    public final void ABD(int i, @Nullable EK ek, EY ey, EZ ez, IOException iOException, boolean z) {
        C02449r A04 = A04(i, ek);
        Iterator<InterfaceC02459s> it = this.A04.iterator();
        while (it.hasNext()) {
            it.next().onLoadError(A04, ey, ez, iOException, z);
        }
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC0343Ea
    public final void ABF(int i, @Nullable EK ek, EY ey, EZ ez) {
        A04(i, ek);
        Iterator<InterfaceC02459s> it = this.A04.iterator();
        while (it.hasNext()) {
            it.next();
        }
    }

    @Override // com.facebook.ads.redexgen.X.C9W
    public final void ABH(boolean z) {
        C02449r A02 = A02();
        Iterator<InterfaceC02459s> it = this.A04.iterator();
        while (it.hasNext()) {
            InterfaceC02459s next = it.next();
            if (A05[2].length() == 13) {
                throw new RuntimeException();
            }
            A05[5] = "61iKEbH7Elk598B8IvoVeyiFcghmzjBq";
            next.onLoadingChanged(A02, z);
        }
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC0343Ea
    public final void ABO(int i, EK ek) {
        this.A02.A0B(i, ek);
        C02449r A04 = A04(i, ek);
        Iterator<InterfaceC02459s> it = this.A04.iterator();
        while (it.hasNext()) {
            it.next().onMediaPeriodCreated(A04);
        }
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC0343Ea
    public final void ABP(int i, EK ek) {
        this.A02.A0C(i, ek);
        C02449r A04 = A04(i, ek);
        Iterator<InterfaceC02459s> it = this.A04.iterator();
        while (true) {
            boolean hasNext = it.hasNext();
            String[] strArr = A05;
            if (strArr[7].length() == strArr[6].length()) {
                throw new RuntimeException();
            }
            String[] strArr2 = A05;
            strArr2[1] = "xQuAJnMHmsnkUtn";
            strArr2[4] = "I7nuhInD03G6TyFgZN1tEp7XA66Po";
            if (hasNext) {
                it.next().onMediaPeriodReleased(A04);
            } else {
                return;
            }
        }
    }

    @Override // com.facebook.ads.redexgen.X.D5
    public final void ABS(Metadata metadata) {
        C02449r A02 = A02();
        Iterator<InterfaceC02459s> it = this.A04.iterator();
        while (it.hasNext()) {
            it.next().onMetadata(A02, metadata);
        }
    }

    @Override // com.facebook.ads.redexgen.X.C9W
    public final void ABi(C9T c9t) {
        C02449r A02 = A02();
        Iterator<InterfaceC02459s> it = this.A04.iterator();
        while (it.hasNext()) {
            InterfaceC02459s next = it.next();
            if (A05[5].charAt(25) != 'g') {
                throw new RuntimeException();
            }
            A05[5] = "6kCd761y4Sm0JC2HIy7vlDu4Zge9adCZ";
            next.onPlaybackParametersChanged(A02, c9t);
        }
    }

    @Override // com.facebook.ads.redexgen.X.C9W
    public final void ABk(AnonymousClass98 anonymousClass98) {
        C02449r A02 = A02();
        Iterator<InterfaceC02459s> it = this.A04.iterator();
        while (it.hasNext()) {
            InterfaceC02459s next = it.next();
            String[] strArr = A05;
            if (strArr[7].length() == strArr[6].length()) {
                throw new RuntimeException();
            }
            A05[3] = "4uLQlqFUz3TKu9PUP8Ua0";
            next.onPlayerError(A02, anonymousClass98);
        }
    }

    @Override // com.facebook.ads.redexgen.X.C9W
    public final void ABm(boolean z, int i) {
        C02449r A02 = A02();
        Iterator<InterfaceC02459s> it = this.A04.iterator();
        while (it.hasNext()) {
            it.next().onPlayerStateChanged(A02, z, i);
        }
    }

    @Override // com.facebook.ads.redexgen.X.C9W
    public final void ABo(int i) {
        this.A02.A0A(i);
        C02449r A02 = A02();
        Iterator<InterfaceC02459s> it = this.A04.iterator();
        while (it.hasNext()) {
            it.next().onPositionDiscontinuity(A02, i);
        }
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC0343Ea
    public final void ABx(int i, EK ek) {
        this.A02.A0D(i, ek);
        C02449r A04 = A04(i, ek);
        Iterator<InterfaceC02459s> it = this.A04.iterator();
        while (it.hasNext()) {
            it.next().onReadingStarted(A04);
        }
    }

    @Override // com.facebook.ads.redexgen.X.I9
    public final void AC1(Surface surface) {
        C02449r A03 = A03();
        Iterator<InterfaceC02459s> it = this.A04.iterator();
        while (true) {
            boolean hasNext = it.hasNext();
            String[] strArr = A05;
            if (strArr[1].length() == strArr[4].length()) {
                throw new RuntimeException();
            }
            A05[0] = "zEYrHw08cBp169ZitgaAlaUGutwvX";
            if (hasNext) {
                it.next().onRenderedFirstFrame(A03, surface);
            } else {
                return;
            }
        }
    }

    @Override // com.facebook.ads.redexgen.X.C9W
    public final void ACB() {
        if (this.A02.A0F()) {
            this.A02.A08();
            C02449r A02 = A02();
            Iterator<InterfaceC02459s> it = this.A04.iterator();
            while (it.hasNext()) {
                it.next().onSeekProcessed(A02);
            }
        }
    }

    @Override // com.facebook.ads.redexgen.X.C9W
    public final void ACQ(AbstractC02409n abstractC02409n, @Nullable Object obj, int i) {
        this.A02.A0E(abstractC02409n);
        C02449r A02 = A02();
        Iterator<InterfaceC02459s> it = this.A04.iterator();
        while (it.hasNext()) {
            it.next().onTimelineChanged(A02, i);
        }
    }

    @Override // com.facebook.ads.redexgen.X.C9W
    public final void ACS(TrackGroupArray trackGroupArray, GD gd) {
        C02449r A02 = A02();
        Iterator<InterfaceC02459s> it = this.A04.iterator();
        while (it.hasNext()) {
            it.next().onTracksChanged(A02, trackGroupArray, gd);
        }
    }

    @Override // com.facebook.ads.redexgen.X.I9
    public final void ACa(String str, long j, long j2) {
        C02449r A03 = A03();
        Iterator<InterfaceC02459s> it = this.A04.iterator();
        while (it.hasNext()) {
            it.next().onDecoderInitialized(A03, 2, str, j2);
        }
    }

    @Override // com.facebook.ads.redexgen.X.I9
    public final void ACb(C0261Ai c0261Ai) {
        C02449r A00 = A00();
        Iterator<InterfaceC02459s> it = this.A04.iterator();
        while (it.hasNext()) {
            it.next().onDecoderDisabled(A00, 2, c0261Ai);
        }
    }

    @Override // com.facebook.ads.redexgen.X.I9
    public final void ACc(C0261Ai c0261Ai) {
        C02449r A02 = A02();
        Iterator<InterfaceC02459s> it = this.A04.iterator();
        while (it.hasNext()) {
            it.next().onDecoderEnabled(A02, 2, c0261Ai);
        }
    }

    @Override // com.facebook.ads.redexgen.X.I9
    public final void ACf(Format format) {
        C02449r A03 = A03();
        Iterator<InterfaceC02459s> it = this.A04.iterator();
        while (it.hasNext()) {
            it.next().onDecoderInputFormatChanged(A03, 2, format);
        }
    }

    @Override // com.facebook.ads.redexgen.X.I9
    public final void ACk(int i, int i2, int i3, float f) {
        C02449r A03 = A03();
        Iterator<InterfaceC02459s> it = this.A04.iterator();
        while (it.hasNext()) {
            it.next().onVideoSizeChanged(A03, i, i2, i3, f);
        }
    }
}
