package com.facebook.ads.redexgen.X;

import androidx.annotation.Nullable;
import com.facebook.ads.internal.exoplayer2.Format;
import com.facebook.ads.internal.exoplayer2.drm.DrmInitData;
import java.io.IOException;
/* renamed from: com.facebook.ads.redexgen.X.Cr  reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public abstract class AbstractC0310Cr implements W1, InterfaceC02349g {
    public int A00;
    public int A01;
    public long A02;
    public C02359h A03;
    public InterfaceC0350Eh A04;
    public boolean A05 = true;
    public boolean A06;
    public Format[] A07;
    public final int A08;

    public AbstractC0310Cr(int i) {
        this.A08 = i;
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.B8 != com.facebook.ads.internal.exoplayer2.drm.DrmSessionManager<?> */
    public static boolean A0x(@Nullable B8<?> b8, @Nullable DrmInitData drmInitData) {
        if (drmInitData == null) {
            return true;
        }
        if (b8 == null) {
            return false;
        }
        return b8.A3x(drmInitData);
    }

    public final int A0y() {
        return this.A00;
    }

    public final int A0z(long j) {
        return this.A04.AEj(j - this.A02);
    }

    public final int A10(C9L c9l, C0784Vn c0784Vn, boolean z) {
        int ADT = this.A04.ADT(c9l, c0784Vn, z);
        if (ADT == -4) {
            if (c0784Vn.A04()) {
                this.A05 = true;
                return this.A06 ? -4 : -3;
            }
            c0784Vn.A00 += this.A02;
        } else if (ADT == -5) {
            Format format = c9l.A00;
            int result = (format.A0G > Long.MAX_VALUE ? 1 : (format.A0G == Long.MAX_VALUE ? 0 : -1));
            if (result != 0) {
                c9l.A00 = format.A0H(format.A0G + this.A02);
            }
        }
        return ADT;
    }

    public final C02359h A11() {
        return this.A03;
    }

    public void A12() {
    }

    public void A13() throws AnonymousClass98 {
    }

    public void A14() throws AnonymousClass98 {
    }

    public void A15(long j, boolean z) throws AnonymousClass98 {
    }

    public void A16(boolean z) throws AnonymousClass98 {
    }

    public void A17(Format[] formatArr, long j) throws AnonymousClass98 {
    }

    public final boolean A18() {
        return this.A05 ? this.A06 : this.A04.A8Z();
    }

    public final Format[] A19() {
        return this.A07;
    }

    @Override // com.facebook.ads.redexgen.X.W1
    public final void A4n() {
        H6.A04(this.A01 == 1);
        this.A01 = 0;
        this.A04 = null;
        this.A07 = null;
        this.A06 = false;
        A12();
    }

    @Override // com.facebook.ads.redexgen.X.W1
    public final void A59(C02359h c02359h, Format[] formatArr, InterfaceC0350Eh interfaceC0350Eh, long j, boolean z, long j2) throws AnonymousClass98 {
        H6.A04(this.A01 == 0);
        this.A03 = c02359h;
        this.A01 = 1;
        A16(z);
        ADu(formatArr, interfaceC0350Eh, j2);
        A15(j, z);
    }

    @Override // com.facebook.ads.redexgen.X.W1
    public final InterfaceC02349g A5w() {
        return this;
    }

    @Override // com.facebook.ads.redexgen.X.W1
    public HM A6u() {
        return null;
    }

    @Override // com.facebook.ads.redexgen.X.W1
    public final int A7U() {
        return this.A01;
    }

    @Override // com.facebook.ads.redexgen.X.W1
    public final InterfaceC0350Eh A7Z() {
        return this.A04;
    }

    @Override // com.facebook.ads.redexgen.X.W1, com.facebook.ads.redexgen.X.InterfaceC02349g
    public final int A7g() {
        return this.A08;
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC02319d
    public void A7x(int i, Object obj) throws AnonymousClass98 {
    }

    @Override // com.facebook.ads.redexgen.X.W1
    public final boolean A82() {
        return this.A05;
    }

    @Override // com.facebook.ads.redexgen.X.W1
    public final boolean A8M() {
        return this.A06;
    }

    @Override // com.facebook.ads.redexgen.X.W1
    public final void A9U() throws IOException {
        this.A04.A9R();
    }

    @Override // com.facebook.ads.redexgen.X.W1
    public final void ADu(Format[] formatArr, InterfaceC0350Eh interfaceC0350Eh, long j) throws AnonymousClass98 {
        H6.A04(!this.A06);
        this.A04 = interfaceC0350Eh;
        this.A05 = false;
        this.A07 = formatArr;
        this.A02 = j;
        A17(formatArr, j);
    }

    @Override // com.facebook.ads.redexgen.X.W1
    public final void AE4(long j) throws AnonymousClass98 {
        this.A06 = false;
        this.A05 = false;
        A15(j, false);
    }

    @Override // com.facebook.ads.redexgen.X.W1
    public final void AEP() {
        this.A06 = true;
    }

    @Override // com.facebook.ads.redexgen.X.W1
    public final void AER(int i) {
        this.A00 = i;
    }

    public int AF0() throws AnonymousClass98 {
        return 0;
    }

    @Override // com.facebook.ads.redexgen.X.W1
    public final void start() throws AnonymousClass98 {
        H6.A04(this.A01 == 1);
        this.A01 = 2;
        A13();
    }

    @Override // com.facebook.ads.redexgen.X.W1
    public final void stop() throws AnonymousClass98 {
        H6.A04(this.A01 == 2);
        this.A01 = 1;
        A14();
    }
}
