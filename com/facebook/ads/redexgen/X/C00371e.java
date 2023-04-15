package com.facebook.ads.redexgen.X;

import a.a.j;
import android.annotation.SuppressLint;
import android.annotation.TargetApi;
import android.content.Context;
import android.content.pm.PackageManager;
import android.media.MediaCodec;
import android.media.MediaCrypto;
import android.media.MediaFormat;
import android.os.Handler;
import android.view.Surface;
import androidx.annotation.Nullable;
import com.facebook.ads.internal.exoplayer2.Format;
import java.nio.ByteBuffer;
import java.util.Arrays;
@TargetApi(16)
/* renamed from: com.facebook.ads.redexgen.X.1e */
/* loaded from: assets/audience_network.dex */
public final class C00371e extends C3G implements HM {
    public static byte[] A0E;
    public static String[] A0F = {"aLXIjAOeq43kD47uUx47KIQfBztZ5JR6", "bYDvuG1CO7Q3NDumZhhBhB8jHe", "lzauC9VKCpzgBdv7KHug0xPju0EyyDRc", "zBmjWuq", "FwqFg", "FmVSMSIXQUSd0OcxsELVimAN3SmZwHxI", "I9K2sHUvqtNZm1Rj9xJMtQcmEPzsJytW", "SRtBuggTCbvw2MXSYfok3SEL95E53gc0"};
    public int A00;
    public int A01;
    public int A02;
    public int A03;
    public int A04;
    public long A05;
    public MediaFormat A06;
    public boolean A07;
    public boolean A08;
    public boolean A09;
    public boolean A0A;
    public final Context A0B;
    public final AE A0C;
    public final AK A0D;

    public static String A04(int i, int i2, int i3) {
        byte[] copyOfRange = Arrays.copyOfRange(A0E, i, i + i2);
        for (int i4 = 0; i4 < copyOfRange.length; i4++) {
            copyOfRange[i4] = (byte) ((copyOfRange[i4] ^ i3) ^ 16);
        }
        return new String(copyOfRange);
    }

    public static void A06() {
        A0E = new byte[]{7, 5, 16, 102, 27, 13, 11, 102, 41, 41, 43, 102, 44, 45, 43, 65, 67, 86, 32, 105, 97, 97, 105, 98, 107, 32, 124, 111, 121, 32, 106, 107, 109, 97, 106, 107, 124, 54, 57, 51, 37, 56, 62, 51, 121, 36, 56, 49, 35, 32, 54, 37, 50, 121, 59, 50, 54, 57, 53, 54, 52, 60, 64, 84, 69, 72, 78, 14, 83, 64, 86, 24, 19, 26, 21, 21, 30, 23, 86, 24, 20, 14, 21, 15, 63, 50, 37, 56, 59, 35, 50, 76, 65, 86, 75, 85, 72, 80, 65, 95, 83, 74, 31, 91, 92, 66, 71, 70, 31, 65, 91, 72, 87, 70, 66, 70, 78, 48, 50, 41, 47, 50, 41, 52, 57, 121, 107, 103, 122, 102, 111, 39, 120, 107, 126, 111, 70, 84, 88, 70, 64, 91, 82, 5, 26, 13, 16, 25, 19, 11, 26};
    }

    static {
        A06();
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.B8 != com.facebook.ads.internal.exoplayer2.drm.DrmSessionManager<com.facebook.ads.internal.exoplayer2.drm.FrameworkMediaCrypto> */
    public C00371e(Context context, InterfaceC0311Cs interfaceC0311Cs, @Nullable B8<C0778Vh> b8, boolean z, @Nullable Handler handler, @Nullable AF af, @Nullable A0 a0, A7... a7Arr) {
        this(context, interfaceC0311Cs, b8, z, handler, af, new C0791Vu(a0, a7Arr));
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.B8 != com.facebook.ads.internal.exoplayer2.drm.DrmSessionManager<com.facebook.ads.internal.exoplayer2.drm.FrameworkMediaCrypto> */
    public C00371e(Context context, InterfaceC0311Cs interfaceC0311Cs, @Nullable B8<C0778Vh> b8, boolean z, @Nullable Handler handler, @Nullable AF af, AK ak) {
        super(1, interfaceC0311Cs, b8, z);
        this.A0B = context.getApplicationContext();
        this.A0D = ak;
        this.A0C = new AE(handler, af);
        ak.AET(new C0789Vs(this));
    }

    private int A00(C0305Cm c0305Cm, Format format) {
        PackageManager packageManager;
        if (C0430Hl.A02 < 24) {
            if (A04(15, 22, 30).equals(c0305Cm.A02)) {
                boolean z = true;
                if (C0430Hl.A02 == 23 && (packageManager = this.A0B.getPackageManager()) != null) {
                    boolean needsRawDecoderWorkaround = packageManager.hasSystemFeature(A04(37, 25, 71));
                    if (needsRawDecoderWorkaround) {
                        z = false;
                    }
                }
                if (z) {
                    return -1;
                }
            }
        }
        return format.A09;
    }

    private final int A01(C0305Cm c0305Cm, Format format, Format[] formatArr) {
        int maxInputSize = A00(c0305Cm, format);
        return maxInputSize;
    }

    @SuppressLint({"InlinedApi"})
    private final MediaFormat A02(Format format, String str, int i) {
        MediaFormat mediaFormat = new MediaFormat();
        mediaFormat.setString(A04(j.AppCompatTheme_windowActionModeOverlay, 4, 59), str);
        mediaFormat.setInteger(A04(71, 13, j.AppCompatTheme_toolbarStyle), format.A05);
        mediaFormat.setInteger(A04(125, 11, 26), format.A0C);
        C0317Cy.A06(mediaFormat, format.A0P);
        C0317Cy.A04(mediaFormat, A04(99, 14, 34), i);
        if (C0430Hl.A02 >= 23) {
            mediaFormat.setInteger(A04(j.AppCompatTheme_windowFixedWidthMinor, 8, 80), 0);
        }
        return mediaFormat;
    }

    private void A05() {
        long A6E = this.A0D.A6E(A8P());
        if (A6E != Long.MIN_VALUE) {
            if (!this.A08) {
                long newCurrentPositionUs = this.A05;
                A6E = Math.max(newCurrentPositionUs, A6E);
            }
            this.A05 = A6E;
            this.A08 = false;
        }
    }

    public static boolean A08(String str) {
        if (C0430Hl.A02 < 24 && A04(0, 15, 88).equals(str)) {
            if (A04(136, 7, 37).equals(C0430Hl.A05) && (C0430Hl.A03.startsWith(A04(143, 8, j.AppCompatTheme_windowActionBar)) || C0430Hl.A03.startsWith(A04(84, 7, 71)) || C0430Hl.A03.startsWith(A04(91, 8, 52)))) {
                return true;
            }
        }
        return false;
    }

    private final boolean A09(String str) {
        int A00 = HO.A00(str);
        if (A00 != 0) {
            boolean A8O = this.A0D.A8O(A00);
            if (A0F[5].charAt(2) != 'V') {
                throw new RuntimeException();
            }
            A0F[1] = "OP";
            if (A8O) {
                return true;
            }
        }
        return false;
    }

    @Override // com.facebook.ads.redexgen.X.C3G, com.facebook.ads.redexgen.X.AbstractC0310Cr
    public final void A12() {
        try {
            this.A0D.ADf();
            try {
                super.A12();
            } finally {
            }
        } catch (Throwable th) {
            try {
                super.A12();
                throw th;
            } finally {
            }
        }
    }

    @Override // com.facebook.ads.redexgen.X.C3G, com.facebook.ads.redexgen.X.AbstractC0310Cr
    public final void A13() {
        super.A13();
        this.A0D.AD7();
    }

    @Override // com.facebook.ads.redexgen.X.C3G, com.facebook.ads.redexgen.X.AbstractC0310Cr
    public final void A14() {
        A05();
        this.A0D.pause();
        super.A14();
    }

    @Override // com.facebook.ads.redexgen.X.C3G, com.facebook.ads.redexgen.X.AbstractC0310Cr
    public final void A15(long j, boolean z) throws AnonymousClass98 {
        super.A15(j, z);
        this.A0D.reset();
        this.A05 = j;
        this.A07 = true;
        this.A08 = true;
    }

    @Override // com.facebook.ads.redexgen.X.C3G, com.facebook.ads.redexgen.X.AbstractC0310Cr
    public final void A16(boolean z) throws AnonymousClass98 {
        super.A16(z);
        this.A0C.A05(this.A0U);
        int i = A11().A00;
        if (i != 0) {
            this.A0D.A5A(i);
        } else {
            this.A0D.A4o();
        }
    }

    @Override // com.facebook.ads.redexgen.X.C3G
    public final int A1A(MediaCodec mediaCodec, C0305Cm c0305Cm, Format format, Format format2) {
        return 0;
    }

    /* JADX WARN: Code restructure failed: missing block: B:118:0x00cf, code lost:
        if (r7 != (-1)) goto L52;
     */
    /* JADX WARN: Code restructure failed: missing block: B:120:0x00d7, code lost:
        if (r4.A0G(r17.A0C) == false) goto L54;
     */
    /* JADX WARN: Code restructure failed: missing block: B:122:0x00db, code lost:
        if (r17.A05 == (-1)) goto L64;
     */
    /* JADX WARN: Code restructure failed: missing block: B:124:0x00e3, code lost:
        if (r4.A0F(r17.A05) == false) goto L54;
     */
    /* JADX WARN: Code restructure failed: missing block: B:131:0x00fa, code lost:
        if (r7 != (-1)) goto L52;
     */
    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.B8 != com.facebook.ads.internal.exoplayer2.drm.DrmSessionManager<com.facebook.ads.internal.exoplayer2.drm.FrameworkMediaCrypto> */
    /* JADX WARN: Removed duplicated region for block: B:129:0x00ec  */
    @Override // com.facebook.ads.redexgen.X.C3G
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final int A1B(com.facebook.ads.redexgen.X.InterfaceC0311Cs r15, com.facebook.ads.redexgen.X.B8<com.facebook.ads.redexgen.X.C0778Vh> r16, com.facebook.ads.internal.exoplayer2.Format r17) throws com.facebook.ads.redexgen.X.C0314Cv {
        /*
            Method dump skipped, instructions count: 253
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.ads.redexgen.X.C00371e.A1B(com.facebook.ads.redexgen.X.Cs, com.facebook.ads.redexgen.X.B8, com.facebook.ads.internal.exoplayer2.Format):int");
    }

    @Override // com.facebook.ads.redexgen.X.C3G
    public final C0305Cm A1E(InterfaceC0311Cs interfaceC0311Cs, Format format, boolean z) throws C0314Cv {
        C0305Cm passthroughDecoderInfo;
        if (A09(format.A0O) && (passthroughDecoderInfo = interfaceC0311Cs.A77()) != null) {
            return passthroughDecoderInfo;
        }
        return super.A1E(interfaceC0311Cs, format, z);
    }

    @Override // com.facebook.ads.redexgen.X.C3G
    public final void A1H() throws AnonymousClass98 {
        try {
            this.A0D.AD8();
        } catch (AJ e) {
            throw AnonymousClass98.A01(e, A0y());
        }
    }

    /* JADX WARN: Incorrect condition in loop: B:37:0x0043 */
    @Override // com.facebook.ads.redexgen.X.C3G
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void A1K(android.media.MediaCodec r11, android.media.MediaFormat r12) throws com.facebook.ads.redexgen.X.AnonymousClass98 {
        /*
            r10 = this;
            android.media.MediaFormat r3 = r10.A06
            if (r3 == 0) goto L4a
            r2 = 113(0x71, float:1.58E-43)
            r1 = 4
            r0 = 59
            java.lang.String r0 = A04(r2, r1, r0)
            java.lang.String r0 = r3.getString(r0)
            int r3 = com.facebook.ads.redexgen.X.HO.A00(r0)
            android.media.MediaFormat r12 = r10.A06
        L17:
            r2 = 71
            r1 = 13
            r0 = 107(0x6b, float:1.5E-43)
            java.lang.String r0 = A04(r2, r1, r0)
            int r4 = r12.getInteger(r0)
            r2 = 125(0x7d, float:1.75E-43)
            r1 = 11
            r0 = 26
            java.lang.String r0 = A04(r2, r1, r0)
            int r5 = r12.getInteger(r0)
            boolean r0 = r10.A09
            if (r0 == 0) goto L4d
            r1 = 6
            if (r4 != r1) goto L4d
            int r0 = r10.A00
            if (r0 >= r1) goto L4d
            int[] r7 = new int[r0]
            r1 = 0
        L41:
            int r0 = r10.A00
            if (r1 >= r0) goto L4e
            r7[r1] = r1
            int r1 = r1 + 1
            goto L41
        L4a:
            int r3 = r10.A04
            goto L17
        L4d:
            r7 = 0
        L4e:
            com.facebook.ads.redexgen.X.AK r2 = r10.A0D     // Catch: com.facebook.ads.redexgen.X.AG -> L59
            r6 = 0
            int r8 = r10.A02     // Catch: com.facebook.ads.redexgen.X.AG -> L59
            int r9 = r10.A03     // Catch: com.facebook.ads.redexgen.X.AG -> L59
            r2.A46(r3, r4, r5, r6, r7, r8, r9)     // Catch: com.facebook.ads.redexgen.X.AG -> L59
            return
        L59:
            r1 = move-exception
            int r0 = r10.A0y()
            com.facebook.ads.redexgen.X.98 r0 = com.facebook.ads.redexgen.X.AnonymousClass98.A01(r1, r0)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.ads.redexgen.X.C00371e.A1K(android.media.MediaCodec, android.media.MediaFormat):void");
    }

    @Override // com.facebook.ads.redexgen.X.C3G
    public final void A1L(Format format) throws AnonymousClass98 {
        int i;
        super.A1L(format);
        this.A0C.A03(format);
        if (A04(62, 9, 49).equals(format.A0O)) {
            i = format.A0A;
        } else {
            i = 2;
        }
        this.A04 = i;
        this.A00 = format.A05;
        this.A02 = format.A06;
        this.A03 = format.A07;
    }

    @Override // com.facebook.ads.redexgen.X.C3G
    public final void A1M(C0784Vn c0784Vn) {
        if (this.A07 && !c0784Vn.A03()) {
            if (Math.abs(c0784Vn.A00 - this.A05) > 500000) {
                this.A05 = c0784Vn.A00;
            }
            this.A07 = false;
        }
    }

    @Override // com.facebook.ads.redexgen.X.C3G
    public final void A1N(C0305Cm c0305Cm, MediaCodec mediaCodec, Format format, MediaCrypto mediaCrypto) {
        this.A01 = A01(c0305Cm, format, A19());
        this.A09 = A08(c0305Cm.A02);
        this.A0A = c0305Cm.A04;
        MediaFormat A02 = A02(format, c0305Cm.A01 == null ? A04(62, 9, 49) : c0305Cm.A01, this.A01);
        mediaCodec.configure(A02, (Surface) null, mediaCrypto, 0);
        if (this.A0A) {
            this.A06 = A02;
            MediaFormat mediaFormat = this.A06;
            String str = format.A0O;
            String codecMimeType = A04(j.AppCompatTheme_windowActionModeOverlay, 4, 59);
            mediaFormat.setString(codecMimeType, str);
            return;
        }
        this.A06 = null;
    }

    @Override // com.facebook.ads.redexgen.X.C3G
    public final void A1O(String str, long j, long j2) {
        this.A0C.A06(str, j, j2);
    }

    @Override // com.facebook.ads.redexgen.X.C3G
    public final boolean A1P(long j, long j2, MediaCodec mediaCodec, ByteBuffer byteBuffer, int i, int i2, long j3, boolean z) throws AnonymousClass98 {
        if (this.A0A && (i2 & 2) != 0) {
            mediaCodec.releaseOutputBuffer(i, false);
            return true;
        } else if (z) {
            mediaCodec.releaseOutputBuffer(i, false);
            this.A0U.A08++;
            this.A0D.A7w();
            return true;
        } else {
            try {
                if (this.A0D.A7t(byteBuffer, j3)) {
                    mediaCodec.releaseOutputBuffer(i, false);
                    this.A0U.A06++;
                    return true;
                }
                return false;
            } catch (AH | AJ e) {
                throw AnonymousClass98.A01(e, A0y());
            }
        }
    }

    @Override // com.facebook.ads.redexgen.X.AbstractC0310Cr, com.facebook.ads.redexgen.X.W1
    public final HM A6u() {
        return this;
    }

    @Override // com.facebook.ads.redexgen.X.HM
    public final C9T A7C() {
        return this.A0D.A7C();
    }

    @Override // com.facebook.ads.redexgen.X.HM
    public final long A7F() {
        if (A7U() == 2) {
            A05();
        }
        return this.A05;
    }

    @Override // com.facebook.ads.redexgen.X.AbstractC0310Cr, com.facebook.ads.redexgen.X.InterfaceC02319d
    public final void A7x(int i, Object obj) throws AnonymousClass98 {
        if (i != 2) {
            if (i != 3) {
                super.A7x(i, obj);
                return;
            }
            this.A0D.AEM((C02529z) obj);
            return;
        }
        AK ak = this.A0D;
        if (A0F[7].charAt(17) == 'P') {
            throw new RuntimeException();
        }
        A0F[4] = "awvXiH99cLu1HaadjiPENScqQYAeI";
        ak.setVolume(((Float) obj).floatValue());
    }

    @Override // com.facebook.ads.redexgen.X.C3G, com.facebook.ads.redexgen.X.W1
    public final boolean A8P() {
        return super.A8P() && this.A0D.A8P();
    }

    @Override // com.facebook.ads.redexgen.X.C3G, com.facebook.ads.redexgen.X.W1
    public final boolean A8Z() {
        return this.A0D.A81() || super.A8Z();
    }

    @Override // com.facebook.ads.redexgen.X.HM
    public final C9T AEX(C9T c9t) {
        return this.A0D.AEX(c9t);
    }
}
