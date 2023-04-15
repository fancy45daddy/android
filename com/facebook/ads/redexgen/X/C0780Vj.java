package com.facebook.ads.redexgen.X;

import a.a.j;
import android.annotation.TargetApi;
import android.os.Handler;
import android.os.Looper;
import android.util.Log;
import androidx.annotation.NonNull;
import com.facebook.ads.internal.exoplayer2.drm.DrmInitData;
import com.facebook.ads.redexgen.X.B9;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.UUID;
@TargetApi(18)
/* renamed from: com.facebook.ads.redexgen.X.Vj  reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public final class C0780Vj<T extends B9> implements B8<T>, InterfaceC0268Ap<T> {
    public static byte[] A0D;
    public static String[] A0E = {"0jHq0iWGhsIySlQoDiDGup3biHh1u6", "i2l5O7Dt7qLUzCpPXTMvAA2Zo4KmgWR2", "WWWB5", "5af5rLtbMnzIwH5Nva3tIodv6", "N1ag4SyeR1bkHrLLU69ntDAZG70pDTMe", "aZncB9cokv9961OmHq", "gIBDsbvLQEgXIogWiAeZHaFgFZc1jweS", "Prja9buVBy0glhaqAx1SHba3MELDXzlR"};
    public int A00;
    public Looper A01;
    public byte[] A02;
    public final int A03;
    public final C0274Av A04;
    public final BF<T> A05;
    public final BJ A06;
    public final HashMap<String, String> A07;
    public final List<C0781Vk<T>> A08;
    public final List<C0781Vk<T>> A09;
    public final UUID A0A;
    public final boolean A0B;
    /* JADX WARN: Incorrect inner types in field signature: Lcom/facebook/ads/redexgen/X/Vj<TT;>.MediaDrmHandler; */
    public volatile HandlerC0277Ay A0C;

    public static String A01(int i, int i2, int i3) {
        byte[] copyOfRange = Arrays.copyOfRange(A0D, i, i + i2);
        for (int i4 = 0; i4 < copyOfRange.length; i4++) {
            copyOfRange[i4] = (byte) ((copyOfRange[i4] ^ i3) ^ 37);
        }
        return new String(copyOfRange);
    }

    public static void A03() {
        A0D = new byte[]{74, 107, 104, 111, 123, 98, 122, 74, 124, 99, 93, 107, 125, 125, 103, 97, 96, 67, 105, 124, 9, 63, 32, 4, 35, 36, 57, 9, 44, 57, 44, 109, 34, 35, 33, 52, 109, 46, 34, 35, 57, 44, 36, 35, 62, 109, 46, 34, 32, 32, 34, 35, 109, 29, 30, 30, 5, 109, 30, 46, 37, 40, 32, 40, 9, 44, 57, 44, 99, 109, 12, 62, 62, 56, 32, 36, 35, 42, 109, 62, 56, 61, 61, 34, 63, 57, 109, 43, 34, 63, 119, 109, 109, 108, 109, 63, 120, 121, 120, 104, 10, 12, 7, 10, 49, 55, 60, 33};
    }

    /* JADX WARN: Failed to parse debug info
    java.lang.ArrayIndexOutOfBoundsException: Index 5 out of bounds for length 5
    	at jadx.plugins.input.dex.sections.debuginfo.DebugInfoParser.startVar(DebugInfoParser.java:203)
    	at jadx.plugins.input.dex.sections.debuginfo.DebugInfoParser.process(DebugInfoParser.java:135)
    	at jadx.plugins.input.dex.sections.DexCodeReader.getDebugInfo(DexCodeReader.java:118)
    	at jadx.core.dex.nodes.MethodNode.getDebugInfo(MethodNode.java:567)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.visit(DebugInfoAttachVisitor.java:39)
     */
    @Override // com.facebook.ads.redexgen.X.B8
    public final void ADl(B7<T> b7) {
        if (b7 instanceof C0779Vi) {
            return;
        }
        C0781Vk<T> c0781Vk = (C0781Vk) b7;
        if (c0781Vk.A0L()) {
            this.A09.remove(c0781Vk);
            if (this.A08.size() > 1 && this.A08.get(0) == c0781Vk) {
                this.A08.get(1).A0I();
            }
            this.A08.remove(c0781Vk);
        }
    }

    static {
        A03();
    }

    /* JADX WARN: Code restructure failed: missing block: B:8:0x0028, code lost:
        throw new java.lang.RuntimeException();
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static com.facebook.ads.internal.exoplayer2.drm.DrmInitData.SchemeData A00(com.facebook.ads.internal.exoplayer2.drm.DrmInitData r8, java.util.UUID r9, boolean r10) {
        /*
            int r0 = r8.A01
            java.util.ArrayList r7 = new java.util.ArrayList
            r7.<init>(r0)
            r3 = 0
        L8:
            int r0 = r8.A01
            r6 = 0
            r5 = 1
            if (r3 >= r0) goto L51
            com.facebook.ads.internal.exoplayer2.drm.DrmInitData$SchemeData r4 = r8.A01(r3)
            boolean r5 = r4.A02(r9)
            java.lang.String[] r1 = com.facebook.ads.redexgen.X.C0780Vj.A0E
            r0 = 0
            r0 = r1[r0]
            int r1 = r0.length()
            r0 = 30
            if (r1 == r0) goto L29
        L23:
            java.lang.RuntimeException r0 = new java.lang.RuntimeException
            r0.<init>()
            throw r0
        L29:
            java.lang.String[] r2 = com.facebook.ads.redexgen.X.C0780Vj.A0E
            java.lang.String r1 = "V0Q9eaLMfBF3CEdW"
            r0 = 2
            r2[r0] = r1
            if (r5 != 0) goto L42
            java.util.UUID r0 = com.facebook.ads.redexgen.X.AnonymousClass92.A01
            boolean r0 = r0.equals(r9)
            if (r0 == 0) goto L43
            java.util.UUID r0 = com.facebook.ads.redexgen.X.AnonymousClass92.A02
            boolean r0 = r4.A02(r0)
            if (r0 == 0) goto L43
        L42:
            r6 = 1
        L43:
            if (r6 == 0) goto L4e
            byte[] r0 = r4.A04
            if (r0 != 0) goto L4b
            if (r10 == 0) goto L4e
        L4b:
            r7.add(r4)
        L4e:
            int r3 = r3 + 1
            goto L8
        L51:
            boolean r0 = r7.isEmpty()
            if (r0 == 0) goto L59
            r0 = 0
            return r0
        L59:
            java.util.UUID r0 = com.facebook.ads.redexgen.X.AnonymousClass92.A05
            boolean r0 = r0.equals(r9)
            if (r0 == 0) goto L8f
            r4 = 0
        L62:
            int r0 = r7.size()
            if (r4 >= r0) goto L8f
            java.lang.Object r3 = r7.get(r4)
            com.facebook.ads.internal.exoplayer2.drm.DrmInitData$SchemeData r3 = (com.facebook.ads.internal.exoplayer2.drm.DrmInitData.SchemeData) r3
            boolean r0 = r3.A01()
            if (r0 == 0) goto L8d
            byte[] r0 = r3.A04
            int r2 = com.facebook.ads.redexgen.X.C7.A00(r0)
        L7a:
            int r0 = com.facebook.ads.redexgen.X.C0430Hl.A02
            r1 = 23
            if (r0 >= r1) goto L83
            if (r2 != 0) goto L83
            return r3
        L83:
            int r0 = com.facebook.ads.redexgen.X.C0430Hl.A02
            if (r0 < r1) goto L8a
            if (r2 != r5) goto L8a
            return r3
        L8a:
            int r4 = r4 + 1
            goto L62
        L8d:
            r2 = -1
            goto L7a
        L8f:
            java.lang.Object r3 = r7.get(r6)
            com.facebook.ads.internal.exoplayer2.drm.DrmInitData$SchemeData r3 = (com.facebook.ads.internal.exoplayer2.drm.DrmInitData.SchemeData) r3
            java.lang.String[] r1 = com.facebook.ads.redexgen.X.C0780Vj.A0E
            r0 = 6
            r1 = r1[r0]
            r0 = 29
            char r1 = r1.charAt(r0)
            r0 = 119(0x77, float:1.67E-43)
            if (r1 == r0) goto La6
            goto L23
        La6:
            java.lang.String[] r2 = com.facebook.ads.redexgen.X.C0780Vj.A0E
            java.lang.String r1 = "QMUEyZuv57oImxraVf5zIpun0ErJkPMX"
            r0 = 7
            r2[r0] = r1
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.ads.redexgen.X.C0780Vj.A00(com.facebook.ads.internal.exoplayer2.drm.DrmInitData, java.util.UUID, boolean):com.facebook.ads.internal.exoplayer2.drm.DrmInitData$SchemeData");
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.Vj != com.facebook.ads.internal.exoplayer2.drm.DefaultDrmSessionManager<T extends com.facebook.ads.redexgen.X.B9> */
    public final void A04(Handler handler, InterfaceC0275Aw interfaceC0275Aw) {
        this.A04.A03(handler, interfaceC0275Aw);
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.Vj != com.facebook.ads.internal.exoplayer2.drm.DefaultDrmSessionManager<T extends com.facebook.ads.redexgen.X.B9> */
    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.Vk != com.facebook.ads.internal.exoplayer2.drm.DefaultDrmSession<T extends com.facebook.ads.redexgen.X.B9> */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.facebook.ads.redexgen.X.B8
    public final B7<T> A2P(Looper looper, DrmInitData drmInitData) {
        C0781Vk<T> c0781Vk;
        Looper looper2 = this.A01;
        H6.A04(looper2 == null || looper2 == looper);
        if (this.A09.isEmpty()) {
            this.A01 = looper;
            if (this.A0C == null) {
                this.A0C = new HandlerC0277Ay(this, looper);
            }
        }
        DrmInitData.SchemeData schemeData = null;
        C0781Vk<T> c0781Vk2 = (C0781Vk<T>) false;
        if (this.A02 == null && (schemeData = A00(drmInitData, this.A0A, false)) == null) {
            C0278Az c0278Az = new C0278Az(this.A0A);
            this.A04.A04(c0278Az);
            return new C0779Vi(new B5(c0278Az));
        }
        if (!this.A0B) {
            c0781Vk = c0781Vk2;
            if (!this.A09.isEmpty()) {
                C0781Vk<T> c0781Vk3 = this.A09.get(0);
                if (A0E[0].length() != 30) {
                    throw new RuntimeException();
                }
                A0E[5] = "NYlDF58TVUPxDFfWvHrOlngI";
                c0781Vk = c0781Vk3;
            }
        } else if (A0E[6].charAt(29) == 'w') {
            A0E[7] = "2tfSkouS8gaRHNrU7OMeTyiBrWH6VnUA";
            byte[] bArr = c0781Vk2;
            if (schemeData != null) {
                bArr = (C0781Vk<T>) schemeData.A04;
            }
            Iterator<C0781Vk<T>> it = this.A09.iterator();
            while (true) {
                if (it.hasNext()) {
                    C0781Vk<T> next = it.next();
                    if (next.A0M(bArr)) {
                        c0781Vk = next;
                        break;
                    }
                } else {
                    c0781Vk = null;
                    break;
                }
            }
        } else {
            throw new RuntimeException();
        }
        if (c0781Vk == null) {
            c0781Vk = new C0781Vk<>(this.A0A, this.A05, this, schemeData, this.A00, this.A02, this.A07, this.A06, looper, this.A04, this.A03);
            this.A09.add(c0781Vk);
        }
        c0781Vk.A0G();
        return c0781Vk;
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.Vj != com.facebook.ads.internal.exoplayer2.drm.DefaultDrmSessionManager<T extends com.facebook.ads.redexgen.X.B9> */
    @Override // com.facebook.ads.redexgen.X.B8
    public final boolean A3x(@NonNull DrmInitData drmInitData) {
        if (this.A02 != null) {
            return true;
        }
        DrmInitData.SchemeData A00 = A00(drmInitData, this.A0A, true);
        if (A0E[2].length() != 25) {
            A0E[2] = "f9Fo7yPZ7tYjgWekbXY";
            if (A00 == null) {
                if (drmInitData.A01 != 1 || !drmInitData.A01(0).A02(AnonymousClass92.A02)) {
                    return false;
                }
                Log.w(A01(0, 20, 43), A01(20, 72, j.AppCompatTheme_textColorAlertDialogListItem) + this.A0A);
            }
            String str = drmInitData.A02;
            if (str == null || A01(100, 4, 76).equals(str)) {
                return true;
            }
            return !(A01(92, 4, 43).equals(str) || A01(96, 4, 62).equals(str) || A01(j.AppCompatTheme_textColorAlertDialogListItem, 4, j.AppCompatTheme_windowMinWidthMinor).equals(str)) || C0430Hl.A02 >= 25;
        }
        throw new RuntimeException();
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.Vj != com.facebook.ads.internal.exoplayer2.drm.DefaultDrmSessionManager<T extends com.facebook.ads.redexgen.X.B9> */
    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.Vk != com.facebook.ads.internal.exoplayer2.drm.DefaultDrmSession<T extends com.facebook.ads.redexgen.X.B9> */
    @Override // com.facebook.ads.redexgen.X.InterfaceC0268Ap
    public final void ABu() {
        for (C0781Vk<T> c0781Vk : this.A08) {
            c0781Vk.A0H();
        }
        this.A08.clear();
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.Vj != com.facebook.ads.internal.exoplayer2.drm.DefaultDrmSessionManager<T extends com.facebook.ads.redexgen.X.B9> */
    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.Vk != com.facebook.ads.internal.exoplayer2.drm.DefaultDrmSession<T extends com.facebook.ads.redexgen.X.B9> */
    @Override // com.facebook.ads.redexgen.X.InterfaceC0268Ap
    public final void ABv(Exception exc) {
        for (C0781Vk<T> c0781Vk : this.A08) {
            c0781Vk.A0K(exc);
        }
        List<C0781Vk<T>> list = this.A08;
        String[] strArr = A0E;
        if (strArr[4].charAt(7) == strArr[1].charAt(7)) {
            throw new RuntimeException();
        }
        A0E[3] = "LfmgySfdwng";
        list.clear();
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.Vj != com.facebook.ads.internal.exoplayer2.drm.DefaultDrmSessionManager<T extends com.facebook.ads.redexgen.X.B9> */
    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.Vk != com.facebook.ads.internal.exoplayer2.drm.DefaultDrmSession<T extends com.facebook.ads.redexgen.X.B9> */
    @Override // com.facebook.ads.redexgen.X.InterfaceC0268Ap
    public final void ADJ(C0781Vk<T> c0781Vk) {
        this.A08.add(c0781Vk);
        if (this.A08.size() == 1) {
            c0781Vk.A0I();
        }
    }
}
