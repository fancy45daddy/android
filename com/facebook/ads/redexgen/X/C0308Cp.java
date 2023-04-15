package com.facebook.ads.redexgen.X;

import a.a.j;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import android.os.Message;
import android.util.Log;
import android.util.Pair;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.facebook.ads.internal.exoplayer2.Format;
import com.facebook.ads.internal.exoplayer2.source.TrackGroupArray;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
/* renamed from: com.facebook.ads.redexgen.X.Cp  reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public final class C0308Cp implements Handler.Callback, UI, GE, EL, AnonymousClass95, InterfaceC02309c {
    public static byte[] A0V;
    public static String[] A0W = {"86glHvEVsTHsOarjgO3yrK", "TuAJpp7uzbfmMtpdLTRiZnKK78MiZtWb", "2J1ujHTPZohQZteX1j6kCS7zhajZ8mZI", "eCxkC7v7XtRVNueTNXvbthBaIEqCwNNl", "l3Yyub2xLFiYeWCCac", "TG0XkoHYQCfebcNj4J", "6SVWI1Jvh0Z3jrcRBB9hLc8AjjQAtTry", "lVbeqNrXIfO7zu9EZv7JtI"};
    public int A00;
    public int A01;
    public int A02;
    public long A03;
    public C9H A04;
    public C9S A05;
    public EM A07;
    public boolean A08;
    public boolean A09;
    public boolean A0A;
    public boolean A0B;
    public W1[] A0C;
    public final long A0D;
    public final Handler A0E;
    public final HandlerThread A0F;
    public final W4 A0G;
    public final W2 A0H;
    public final C9N A0J;
    public final C02389l A0L;
    public final C02399m A0M;
    public final GF A0N;
    public final GG A0O;
    public final H9 A0P;
    public final HJ A0Q;
    public final ArrayList<C9F> A0R;
    public final boolean A0S;
    public final W1[] A0T;
    public final InterfaceC02349g[] A0U;
    public final C9Q A0K = new C9Q();
    public C02379j A06 = C02379j.A03;
    public final C9G A0I = new C9G();

    public static String A06(int i, int i2, int i3) {
        byte[] copyOfRange = Arrays.copyOfRange(A0V, i, i + i2);
        for (int i4 = 0; i4 < copyOfRange.length; i4++) {
            copyOfRange[i4] = (byte) ((copyOfRange[i4] ^ i3) ^ 98);
        }
        return new String(copyOfRange);
    }

    /* JADX WARN: Failed to parse debug info
    java.lang.ArrayIndexOutOfBoundsException: Index 18 out of bounds for length 14
    	at jadx.plugins.input.dex.sections.debuginfo.DebugInfoParser.restartVar(DebugInfoParser.java:193)
    	at jadx.plugins.input.dex.sections.debuginfo.DebugInfoParser.process(DebugInfoParser.java:141)
    	at jadx.plugins.input.dex.sections.DexCodeReader.getDebugInfo(DexCodeReader.java:118)
    	at jadx.core.dex.nodes.MethodNode.getDebugInfo(MethodNode.java:567)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.visit(DebugInfoAttachVisitor.java:39)
     */
    private void A0E() throws AnonymousClass98 {
        if (this.A0K.A0P()) {
            float f = this.A0G.A7C().A01;
            C9O A0H = this.A0K.A0H();
            boolean z = true;
            for (C9O A0G = this.A0K.A0G(); A0G != null && A0G.A06; A0G = A0G.A01) {
                if (A0G.A0I(f)) {
                    if (z) {
                        C9O A0G2 = this.A0K.A0G();
                        boolean A0S = this.A0K.A0S(A0G2);
                        boolean[] zArr = new boolean[this.A0T.length];
                        long A0B = A0G2.A0B(this.A05.A0A, A0S, zArr);
                        A0i(A0G2.A03, A0G2.A04);
                        if (this.A05.A00 != 4 && A0B != this.A05.A0A) {
                            C9S c9s = this.A05;
                            this.A05 = c9s.A04(c9s.A04, A0B, this.A05.A01);
                            this.A0I.A04(4);
                            A0P(A0B);
                        }
                        int i = 0;
                        boolean[] zArr2 = new boolean[this.A0T.length];
                        int i2 = 0;
                        while (true) {
                            W1[] w1Arr = this.A0T;
                            if (i2 >= w1Arr.length) {
                                this.A05 = this.A05.A05(A0G2.A03, A0G2.A04);
                                A0p(zArr2, i);
                                break;
                            }
                            W1 w1 = w1Arr[i2];
                            zArr2[i2] = w1.A7U() != 0;
                            InterfaceC0350Eh interfaceC0350Eh = A0G2.A0A[i2];
                            if (interfaceC0350Eh != null) {
                                i++;
                            }
                            if (zArr2[i2]) {
                                InterfaceC0350Eh A7Z = w1.A7Z();
                                if (A0W[4].length() == 29) {
                                    throw new RuntimeException();
                                }
                                A0W[4] = "CIOLNyaJNw";
                                if (interfaceC0350Eh != A7Z) {
                                    A0b(w1);
                                } else if (zArr[i2]) {
                                    w1.AE4(this.A03);
                                }
                            }
                            i2++;
                        }
                    } else {
                        this.A0K.A0S(A0G);
                        if (A0G.A06) {
                            A0G.A0A(Math.max(A0G.A02.A03, A0G.A08(this.A03)), false);
                            A0i(A0G.A03, A0G.A04);
                        }
                    }
                    if (this.A05.A00 != 4) {
                        A09();
                        A0J();
                        this.A0Q.AEJ(2);
                        return;
                    }
                    return;
                }
                if (A0G == A0H) {
                    z = false;
                }
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:101:0x01d6, code lost:
        r13 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:103:0x01de, code lost:
        throw new java.lang.RuntimeException();
     */
    /* JADX WARN: Code restructure failed: missing block: B:105:0x01e4, code lost:
        throw new java.lang.RuntimeException();
     */
    /* JADX WARN: Code restructure failed: missing block: B:106:0x01e5, code lost:
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:134:?, code lost:
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:135:?, code lost:
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x00a8, code lost:
        if (r4.A02.A05 == false) goto L55;
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x00aa, code lost:
        r5 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x00ab, code lost:
        r2 = r1.A0T;
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x00ae, code lost:
        if (r5 >= r2.length) goto L53;
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x00b0, code lost:
        r3 = r2[r5];
        r2 = r4.A0A[r5];
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x00b6, code lost:
        if (r2 == null) goto L52;
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x00bc, code lost:
        if (r3.A7Z() != r2) goto L51;
     */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x00c2, code lost:
        if (r3.A82() == false) goto L50;
     */
    /* JADX WARN: Code restructure failed: missing block: B:46:0x00c4, code lost:
        r3.AEP();
     */
    /* JADX WARN: Code restructure failed: missing block: B:47:0x00c7, code lost:
        r5 = r5 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:48:0x00ca, code lost:
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:50:0x00cd, code lost:
        if (r4.A01 == null) goto L126;
     */
    /* JADX WARN: Code restructure failed: missing block: B:52:0x00d3, code lost:
        if (r4.A01.A06 != false) goto L59;
     */
    /* JADX WARN: Code restructure failed: missing block: B:53:0x00d5, code lost:
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:54:0x00d6, code lost:
        r5 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:55:0x00d7, code lost:
        r7 = r1.A0T;
        r6 = r7.length;
     */
    /* JADX WARN: Code restructure failed: missing block: B:56:0x00e6, code lost:
        if (com.facebook.ads.redexgen.X.C0308Cp.A0W[3].charAt(0) == 'c') goto L122;
     */
    /* JADX WARN: Code restructure failed: missing block: B:57:0x00e8, code lost:
        com.facebook.ads.redexgen.X.C0308Cp.A0W[4] = "ghsgso7PHHKUfGJDBRDWa58h1rLx";
     */
    /* JADX WARN: Code restructure failed: missing block: B:58:0x00ef, code lost:
        if (r5 >= r6) goto L76;
     */
    /* JADX WARN: Code restructure failed: missing block: B:59:0x00f1, code lost:
        r3 = r7[r5];
        r2 = r4.A0A[r5];
     */
    /* JADX WARN: Code restructure failed: missing block: B:60:0x00fb, code lost:
        if (r3.A7Z() != r2) goto L74;
     */
    /* JADX WARN: Code restructure failed: missing block: B:61:0x00fd, code lost:
        if (r2 == null) goto L73;
     */
    /* JADX WARN: Code restructure failed: missing block: B:63:0x0103, code lost:
        if (r3.A82() != false) goto L71;
     */
    /* JADX WARN: Code restructure failed: missing block: B:64:0x0105, code lost:
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:65:0x0106, code lost:
        r5 = r5 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:66:0x0109, code lost:
        r3 = com.facebook.ads.redexgen.X.C0308Cp.A0W;
        r3[1] = "W3Zxvi1uQeiwcOM1a3uIixoX4KFWrQEX";
        r3[2] = "hMjrL9hJ9zdobOz7Vqnbeo3Jken9e002";
     */
    /* JADX WARN: Code restructure failed: missing block: B:67:0x0115, code lost:
        if (r5 >= r6) goto L124;
     */
    /* JADX WARN: Code restructure failed: missing block: B:69:0x0118, code lost:
        r8 = r4.A04;
        r7 = r1.A0K.A0D();
        r6 = r7.A04;
        r4 = (r7.A08.ADU() > (-9223372036854775807L) ? 1 : (r7.A08.ADU() == (-9223372036854775807L) ? 0 : -1));
     */
    /* JADX WARN: Code restructure failed: missing block: B:70:0x013a, code lost:
        if (com.facebook.ads.redexgen.X.C0308Cp.A0W[4].length() == 29) goto L121;
     */
    /* JADX WARN: Code restructure failed: missing block: B:71:0x013c, code lost:
        com.facebook.ads.redexgen.X.C0308Cp.A0W[6] = "vjt4oSs9hMr9NwWN4mwojUjVUYrN8cQ6";
     */
    /* JADX WARN: Code restructure failed: missing block: B:72:0x0143, code lost:
        if (r4 == 0) goto L120;
     */
    /* JADX WARN: Code restructure failed: missing block: B:73:0x0145, code lost:
        r13 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:74:0x0146, code lost:
        r5 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:75:0x0147, code lost:
        r2 = r1.A0T;
     */
    /* JADX WARN: Code restructure failed: missing block: B:76:0x014a, code lost:
        if (r5 >= r2.length) goto L118;
     */
    /* JADX WARN: Code restructure failed: missing block: B:77:0x014c, code lost:
        r4 = r2[r5];
     */
    /* JADX WARN: Code restructure failed: missing block: B:78:0x0152, code lost:
        if (r8.A00(r5) != false) goto L87;
     */
    /* JADX WARN: Code restructure failed: missing block: B:79:0x0154, code lost:
        r5 = r5 + 1;
        r1 = r14;
     */
    /* JADX WARN: Code restructure failed: missing block: B:80:0x0158, code lost:
        if (r13 == false) goto L91;
     */
    /* JADX WARN: Code restructure failed: missing block: B:81:0x015a, code lost:
        r4.AEP();
     */
    /* JADX WARN: Code restructure failed: missing block: B:83:0x0162, code lost:
        if (r4.A8M() != false) goto L116;
     */
    /* JADX WARN: Code restructure failed: missing block: B:84:0x0164, code lost:
        r12 = r6.A01.A00(r5);
        r11 = r6.A00(r5);
     */
    /* JADX WARN: Code restructure failed: missing block: B:85:0x0177, code lost:
        if (r1.A0U[r5].A7g() != 5) goto L115;
     */
    /* JADX WARN: Code restructure failed: missing block: B:86:0x0179, code lost:
        r10 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:87:0x017a, code lost:
        r3 = r8.A03[r5];
        r9 = r6.A03;
        r2 = com.facebook.ads.redexgen.X.C0308Cp.A0W;
     */
    /* JADX WARN: Code restructure failed: missing block: B:88:0x0192, code lost:
        if (r2[1].charAt(27) == r2[2].charAt(27)) goto L112;
     */
    /* JADX WARN: Code restructure failed: missing block: B:89:0x0194, code lost:
        com.facebook.ads.redexgen.X.C0308Cp.A0W[5] = "Ap10Ra2l8gLZ0YRne2";
        r0 = r9[r5];
     */
    /* JADX WARN: Code restructure failed: missing block: B:90:0x019d, code lost:
        if (r11 == false) goto L110;
     */
    /* JADX WARN: Code restructure failed: missing block: B:92:0x01a3, code lost:
        if (r0.equals(r3) == false) goto L110;
     */
    /* JADX WARN: Code restructure failed: missing block: B:93:0x01a5, code lost:
        if (r10 != false) goto L110;
     */
    /* JADX WARN: Code restructure failed: missing block: B:94:0x01a7, code lost:
        r3 = A0v(r12);
        r9 = r7.A0A;
     */
    /* JADX WARN: Code restructure failed: missing block: B:95:0x01b9, code lost:
        if (com.facebook.ads.redexgen.X.C0308Cp.A0W[3].charAt(0) == 'c') goto L107;
     */
    /* JADX WARN: Code restructure failed: missing block: B:96:0x01bb, code lost:
        com.facebook.ads.redexgen.X.C0308Cp.A0W[5] = "P6QWonkpaKbLAx4pgk";
        r4.ADu(r3, r9[r5], r7.A07());
     */
    /* JADX WARN: Code restructure failed: missing block: B:97:0x01cc, code lost:
        r10 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:98:0x01ce, code lost:
        r4.AEP();
     */
    /* JADX WARN: Code restructure failed: missing block: B:99:0x01d2, code lost:
        if (r4 == 0) goto L120;
     */
    /* JADX WARN: Failed to parse debug info
    java.lang.ArrayIndexOutOfBoundsException: Index 16 out of bounds for length 15
    	at jadx.plugins.input.dex.sections.debuginfo.DebugInfoParser.restartVar(DebugInfoParser.java:193)
    	at jadx.plugins.input.dex.sections.debuginfo.DebugInfoParser.process(DebugInfoParser.java:141)
    	at jadx.plugins.input.dex.sections.DexCodeReader.getDebugInfo(DexCodeReader.java:118)
    	at jadx.core.dex.nodes.MethodNode.getDebugInfo(MethodNode.java:567)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.visit(DebugInfoAttachVisitor.java:39)
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private void A0I() throws com.facebook.ads.redexgen.X.AnonymousClass98, java.io.IOException {
        /*
            Method dump skipped, instructions count: 492
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.ads.redexgen.X.C0308Cp.A0I():void");
    }

    public static void A0K() {
        A0V = new byte[]{40, 21, 2, 61, 1, 12, 20, 8, 31, 36, 0, 29, 1, 36, 3, 25, 8, 31, 3, 12, 1, 40, 21, 2, 61, 1, 12, 20, 8, 31, 36, 0, 29, 1, 36, 3, 25, 8, 31, 3, 12, 1, 87, 37, 12, 3, 9, 1, 8, 31, 25, 55, 62, 63, 34, 57, 62, 55, 112, 61, 53, 35, 35, 49, 55, 53, 35, 112, 35, 53, 62, 36, 112, 49, 54, 36, 53, 34, 112, 34, 53, 60, 53, 49, 35, 53, 126, 71, 96, 122, 107, 124, 96, 111, 98, 46, 124, 123, 96, 122, 103, 99, 107, 46, 107, 124, 124, 97, 124, 32, 50, 14, 3, 27, 0, 3, 1, 9, 66, 7, 16, 16, 13, 16, 76, 102, 90, 64, 71, 86, 80, 21, 80, 71, 71, 90, 71, 27, 74, 109, 118, 105, 57, Byte.MAX_VALUE, 120, 112, 117, 124, 125, 55, 119, 124, 64, 124, 126, 118, 68, 124, 97, 120};
    }

    /* JADX WARN: Failed to parse debug info
    java.lang.ArrayIndexOutOfBoundsException: Index 19 out of bounds for length 17
    	at jadx.plugins.input.dex.sections.debuginfo.DebugInfoParser.startVar(DebugInfoParser.java:203)
    	at jadx.plugins.input.dex.sections.debuginfo.DebugInfoParser.process(DebugInfoParser.java:125)
    	at jadx.plugins.input.dex.sections.DexCodeReader.getDebugInfo(DexCodeReader.java:118)
    	at jadx.core.dex.nodes.MethodNode.getDebugInfo(MethodNode.java:567)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.visit(DebugInfoAttachVisitor.java:39)
     */
    private void A0S(C9E c9e) throws AnonymousClass98 {
        Object obj;
        if (c9e.A01 != this.A07) {
            return;
        }
        AbstractC02409n abstractC02409n = this.A05.A03;
        AbstractC02409n abstractC02409n2 = c9e.A00;
        Object obj2 = c9e.A02;
        this.A0K.A0N(abstractC02409n2);
        this.A05 = this.A05.A03(abstractC02409n2, obj2);
        A0F();
        int i = this.A01;
        if (i > 0) {
            this.A0I.A03(i);
            this.A01 = 0;
            C9H c9h = this.A04;
            if (c9h != null) {
                Pair<Integer, Long> A04 = A04(c9h, true);
                this.A04 = null;
                if (A04 == null) {
                    A08();
                    return;
                }
                int intValue = ((Integer) A04.first).intValue();
                long longValue = ((Long) A04.second).longValue();
                EK A0L = this.A0K.A0L(intValue, longValue);
                this.A05 = this.A05.A04(A0L, A0L.A01() ? 0L : longValue, longValue);
                return;
            } else if (this.A05.A02 == -9223372036854775807L) {
                boolean A0E = abstractC02409n2.A0E();
                String[] strArr = A0W;
                if (strArr[1].charAt(27) == strArr[2].charAt(27)) {
                    throw new RuntimeException();
                }
                A0W[4] = "lH2oXw2RUPBHBuRA0";
                if (A0E) {
                    A08();
                    return;
                }
                Pair<Integer, Long> A05 = A05(abstractC02409n2, abstractC02409n2.A05(this.A0B), -9223372036854775807L);
                int intValue2 = ((Integer) A05.first).intValue();
                long longValue2 = ((Long) A05.second).longValue();
                EK A0L2 = this.A0K.A0L(intValue2, longValue2);
                this.A05 = this.A05.A04(A0L2, A0L2.A01() ? 0L : longValue2, longValue2);
                return;
            } else {
                return;
            }
        }
        int i2 = this.A05.A04.A02;
        long j = this.A05.A01;
        if (abstractC02409n.A0E()) {
            if (abstractC02409n2.A0E()) {
                return;
            }
            EK A0L3 = this.A0K.A0L(i2, j);
            this.A05 = this.A05.A04(A0L3, A0L3.A01() ? 0L : j, j);
            return;
        }
        C9O A0E2 = this.A0K.A0E();
        if (A0E2 == null) {
            C02389l c02389l = this.A0L;
            if (A0W[3].charAt(0) != 'c') {
                String[] strArr2 = A0W;
                strArr2[0] = "AIgzGczszMkheYOO0l2WDA";
                strArr2[7] = "AQm6fITMTu1q9a2hy8bL0W";
                obj = abstractC02409n.A0A(i2, c02389l, true).A03;
            } else {
                A0W[6] = "kxPd1uECtZJZCmNWUxsBgkB7loYAAl3C";
                obj = abstractC02409n.A0A(i2, c02389l, true).A03;
            }
        } else {
            obj = A0E2.A09;
        }
        int A042 = abstractC02409n2.A04(obj);
        if (A042 != -1) {
            if (A042 != i2) {
                C9S A01 = this.A05.A01(A042);
                if (A0W[4].length() == 29) {
                    throw new RuntimeException();
                }
                A0W[4] = "bxSLNYRWzgoGTszax8Z4I";
                this.A05 = A01;
            }
            EK ek = this.A05.A04;
            if (ek.A01()) {
                EK A0L4 = this.A0K.A0L(A042, j);
                if (!A0L4.equals(ek)) {
                    this.A05 = this.A05.A04(A0L4, A02(A0L4, A0L4.A01() ? 0L : j), j);
                    return;
                }
            }
            if (this.A0K.A0U(ek, this.A03)) {
                return;
            }
            A0j(false);
            return;
        }
        int A012 = A01(i2, abstractC02409n, abstractC02409n2);
        if (A012 == -1) {
            A08();
            return;
        }
        Pair<Integer, Long> A052 = A05(abstractC02409n2, abstractC02409n2.A09(A012, this.A0L).A00, -9223372036854775807L);
        int intValue3 = ((Integer) A052.first).intValue();
        long longValue3 = ((Long) A052.second).longValue();
        EK A0L5 = this.A0K.A0L(intValue3, longValue3);
        abstractC02409n2.A0A(intValue3, this.A0L, true);
        if (A0E2 != null) {
            Object obj3 = this.A0L.A03;
            A0E2.A02 = A0E2.A02.A00(-1);
            while (A0E2.A01 != null) {
                A0E2 = A0E2.A01;
                if (A0E2.A09.equals(obj3)) {
                    A0E2.A02 = this.A0K.A0J(A0E2.A02, intValue3);
                } else {
                    A0E2.A02 = A0E2.A02.A00(-1);
                }
            }
        }
        this.A05 = this.A05.A04(A0L5, A02(A0L5, A0L5.A01() ? 0L : longValue3), longValue3);
    }

    static {
        A0K();
    }

    public C0308Cp(W1[] w1Arr, GF gf, GG gg, C9N c9n, boolean z, int i, boolean z2, Handler handler, W2 w2, H9 h9) {
        this.A0T = w1Arr;
        this.A0N = gf;
        this.A0O = gg;
        this.A0J = c9n;
        this.A08 = z;
        this.A02 = i;
        this.A0B = z2;
        this.A0E = handler;
        this.A0H = w2;
        this.A0P = h9;
        this.A0D = c9n.A5k();
        this.A0S = c9n.AE5();
        this.A05 = new C9S(AbstractC02409n.A01, -9223372036854775807L, TrackGroupArray.A04, gg);
        this.A0U = new InterfaceC02349g[w1Arr.length];
        for (int i2 = 0; i2 < w1Arr.length; i2++) {
            w1Arr[i2].AER(i2);
            this.A0U[i2] = w1Arr[i2].A5w();
        }
        this.A0G = new W4(this, h9);
        this.A0R = new ArrayList<>();
        this.A0C = new W1[0];
        this.A0M = new C02399m();
        this.A0L = new C02389l();
        gf.A00(this);
        this.A0F = new HandlerThread(A06(21, 29, 15), -16);
        this.A0F.start();
        this.A0Q = h9.A4J(this.A0F.getLooper(), this);
    }

    private int A00() {
        AbstractC02409n abstractC02409n = this.A05.A03;
        if (abstractC02409n.A0E()) {
            return 0;
        }
        return abstractC02409n.A0B(abstractC02409n.A05(this.A0B), this.A0M).A00;
    }

    private int A01(int i, AbstractC02409n abstractC02409n, AbstractC02409n abstractC02409n2) {
        int i2 = i;
        int maxIterations = -1;
        int A00 = abstractC02409n.A00();
        for (int i3 = 0; i3 < A00 && maxIterations == -1; i3++) {
            i2 = abstractC02409n.A03(i2, this.A0L, this.A0M, this.A02, this.A0B);
            if (i2 == -1) {
                break;
            }
            maxIterations = abstractC02409n2.A04(abstractC02409n.A0A(i2, this.A0L, true).A03);
        }
        return maxIterations;
    }

    private long A02(EK ek, long j) throws AnonymousClass98 {
        return A03(ek, j, this.A0K.A0G() != this.A0K.A0H());
    }

    private long A03(EK ek, long j, boolean z) throws AnonymousClass98 {
        A0H();
        this.A09 = false;
        A0N(2);
        C9O A0G = this.A0K.A0G();
        C9O newPlayingPeriodHolder = A0G;
        while (true) {
            if (newPlayingPeriodHolder == null) {
                break;
            } else if (A0t(ek, j, newPlayingPeriodHolder)) {
                this.A0K.A0S(newPlayingPeriodHolder);
                break;
            } else {
                newPlayingPeriodHolder = this.A0K.A0C();
            }
        }
        if (A0G != newPlayingPeriodHolder || z) {
            W1[] w1Arr = this.A0C;
            if (A0W[5].length() == 18) {
                A0W[4] = "MfZ5b0v7S5HL";
                for (W1 w1 : w1Arr) {
                    if (A0W[6].charAt(23) == 'j') {
                        break;
                    }
                    A0W[4] = "gre2iAEzIfwakAGQE6Y0w4gvRDGAgj";
                    A0b(w1);
                }
                this.A0C = new W1[0];
                A0G = null;
            }
            throw new RuntimeException();
        }
        if (newPlayingPeriodHolder != null) {
            A0V(A0G);
            boolean z2 = newPlayingPeriodHolder.A05;
            String[] strArr = A0W;
            if (strArr[1].charAt(27) != strArr[2].charAt(27)) {
                A0W[5] = "xpv6IUpjcorvZnU437";
                if (z2) {
                    j = newPlayingPeriodHolder.A08.AEH(j);
                    newPlayingPeriodHolder.A08.A4p(j - this.A0D, this.A0S);
                }
                A0P(j);
                A09();
            }
            throw new RuntimeException();
        }
        this.A0K.A0O(true);
        A0P(j);
        this.A0Q.AEJ(2);
        return j;
    }

    private Pair<Integer, Long> A04(C9H c9h, boolean z) {
        int A01;
        AbstractC02409n abstractC02409n = this.A05.A03;
        AbstractC02409n abstractC02409n2 = c9h.A02;
        if (abstractC02409n.A0E()) {
            return null;
        }
        if (abstractC02409n2.A0E()) {
            abstractC02409n2 = abstractC02409n;
        }
        try {
            Pair<Integer, Long> A07 = abstractC02409n2.A07(this.A0M, this.A0L, c9h.A00, c9h.A01);
            if (abstractC02409n == abstractC02409n2) {
                return A07;
            }
            int A04 = abstractC02409n.A04(abstractC02409n2.A0A(((Integer) A07.first).intValue(), this.A0L, true).A03);
            if (A04 != -1) {
                Integer valueOf = Integer.valueOf(A04);
                Object obj = A07.second;
                if (A0W[5].length() != 18) {
                    throw new RuntimeException();
                }
                A0W[4] = "NzmvKaw5D7qN";
                return Pair.create(valueOf, (Long) obj);
            } else if (!z || (A01 = A01(((Integer) A07.first).intValue(), abstractC02409n2, abstractC02409n)) == -1) {
                return null;
            } else {
                int i = abstractC02409n.A09(A01, this.A0L).A00;
                String[] strArr = A0W;
                if (strArr[1].charAt(27) != strArr[2].charAt(27)) {
                    A0W[4] = "Yw40DLhiFndXC7wfBusX4OUMnHZHVu";
                    return A05(abstractC02409n, i, -9223372036854775807L);
                }
                return A05(abstractC02409n, i, -9223372036854775807L);
            }
        } catch (IndexOutOfBoundsException unused) {
            throw new C9M(abstractC02409n, c9h.A00, c9h.A01);
        }
    }

    private Pair<Integer, Long> A05(AbstractC02409n abstractC02409n, int i, long j) {
        return abstractC02409n.A07(this.A0M, this.A0L, i, j);
    }

    /* JADX WARN: Code restructure failed: missing block: B:76:0x0196, code lost:
        if (r8 != false) goto L65;
     */
    /* JADX WARN: Code restructure failed: missing block: B:78:0x019c, code lost:
        if (r16.A05.A00 == 3) goto L67;
     */
    /* JADX WARN: Code restructure failed: missing block: B:80:0x01a2, code lost:
        if (r16.A05.A00 != 2) goto L72;
     */
    /* JADX WARN: Code restructure failed: missing block: B:81:0x01a4, code lost:
        A0R(r2, 10);
     */
    /* JADX WARN: Code restructure failed: missing block: B:82:0x01a9, code lost:
        com.facebook.ads.redexgen.X.C0427Hi.A00();
     */
    /* JADX WARN: Code restructure failed: missing block: B:83:0x01ac, code lost:
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:85:0x01b0, code lost:
        if (r16.A0C.length == 0) goto L77;
     */
    /* JADX WARN: Code restructure failed: missing block: B:87:0x01b6, code lost:
        if (r16.A05.A00 == 4) goto L77;
     */
    /* JADX WARN: Code restructure failed: missing block: B:88:0x01b8, code lost:
        A0R(r2, 1000);
     */
    /* JADX WARN: Code restructure failed: missing block: B:89:0x01be, code lost:
        r16.A0Q.ADp(2);
     */
    /* JADX WARN: Code restructure failed: missing block: B:91:0x01d0, code lost:
        if (r8 != false) goto L65;
     */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0094  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x011f  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x01d3  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x008e A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private void A07() throws com.facebook.ads.redexgen.X.AnonymousClass98, java.io.IOException {
        /*
            Method dump skipped, instructions count: 479
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.ads.redexgen.X.C0308Cp.A07():void");
    }

    private void A08() {
        A0N(4);
        A0o(false, true, false);
    }

    private void A09() {
        C9O A0F = this.A0K.A0F();
        long nextLoadPositionUs = A0F.A06();
        if (nextLoadPositionUs == Long.MIN_VALUE) {
            A0k(false);
            return;
        }
        boolean AEd = this.A0J.AEd(nextLoadPositionUs - A0F.A08(this.A03), this.A0G.A7C().A01);
        A0k(AEd);
        if (AEd) {
            A0F.A0F(this.A03);
        }
    }

    private void A0A() {
        int i;
        boolean z;
        int i2;
        if (this.A0I.A06(this.A05)) {
            Handler handler = this.A0E;
            i = this.A0I.A01;
            z = this.A0I.A03;
            if (z) {
                i2 = this.A0I.A00;
            } else {
                i2 = -1;
            }
            handler.obtainMessage(0, i, i2, this.A05).sendToTarget();
            this.A0I.A05(this.A05);
        }
    }

    private void A0B() throws IOException {
        C9O A0F = this.A0K.A0F();
        C9O readingPeriodHolder = this.A0K.A0H();
        if (A0F != null && !A0F.A06) {
            if (readingPeriodHolder != null) {
                C9O loadingPeriodHolder = readingPeriodHolder.A01;
                if (loadingPeriodHolder != A0F) {
                    return;
                }
            }
            for (W1 w1 : this.A0C) {
                if (!w1.A82()) {
                    return;
                }
            }
            A0F.A08.A9S();
        }
    }

    private void A0C() throws IOException {
        this.A0K.A0M(this.A03);
        if (this.A0K.A0Q()) {
            C9P A0I = this.A0K.A0I(this.A03, this.A05);
            if (A0I == null) {
                this.A07.A9T();
                return;
            }
            UH mediaPeriod = this.A0K.A0K(this.A0U, this.A0N, this.A0J.A5f(), this.A07, this.A05.A03.A0A(A0I.A04.A02, this.A0L, true).A03, A0I);
            mediaPeriod.AD9(this, A0I.A03);
            A0k(true);
        }
    }

    private void A0D() {
        A0o(true, true, true);
        this.A0J.ABz();
        A0N(1);
        this.A0F.quit();
        synchronized (this) {
            this.A0A = true;
            notifyAll();
        }
    }

    private void A0F() {
        for (int size = this.A0R.size() - 1; size >= 0; size--) {
            if (!A0r(this.A0R.get(size))) {
                this.A0R.get(size).A03.A0A(false);
                this.A0R.remove(size);
            }
        }
        Collections.sort(this.A0R);
    }

    private void A0G() throws AnonymousClass98 {
        this.A09 = false;
        this.A0G.A05();
        for (W1 w1 : this.A0C) {
            w1.start();
        }
    }

    private void A0H() throws AnonymousClass98 {
        this.A0G.A06();
        for (W1 w1 : this.A0C) {
            A0c(w1);
        }
    }

    private void A0J() throws AnonymousClass98 {
        long A0C;
        if (!this.A0K.A0P()) {
            return;
        }
        C9O A0G = this.A0K.A0G();
        long ADU = A0G.A08.ADU();
        if (ADU != -9223372036854775807L) {
            A0P(ADU);
            if (ADU != this.A05.A0A) {
                C9S c9s = this.A05;
                this.A05 = c9s.A04(c9s.A04, ADU, this.A05.A01);
                this.A0I.A04(4);
            }
        } else {
            this.A03 = this.A0G.A04();
            long A08 = A0G.A08(this.A03);
            A0Q(this.A05.A0A, A08);
            this.A05.A0A = A08;
        }
        C9S c9s2 = this.A05;
        if (this.A0C.length == 0) {
            A0C = A0G.A02.A01;
        } else {
            A0C = A0G.A0C(true);
        }
        c9s2.A09 = A0C;
    }

    private void A0L(float f) {
        GC[] A01;
        for (C9O A0E = this.A0K.A0E(); A0E != null; A0E = A0E.A01) {
            if (A0E.A04 != null) {
                for (GC gc : A0E.A04.A01.A01()) {
                    if (gc != null) {
                        gc.ABj(f);
                    }
                }
            }
        }
    }

    private void A0M(int i) throws AnonymousClass98 {
        this.A02 = i;
        if (!this.A0K.A0R(i)) {
            A0j(true);
        }
    }

    private void A0N(int i) {
        if (this.A05.A00 != i) {
            this.A05 = this.A05.A02(i);
        }
    }

    private void A0O(int i, boolean z, int i2) throws AnonymousClass98 {
        C9O A0G = this.A0K.A0G();
        W1 w1 = this.A0T[i];
        this.A0C[i2] = w1;
        if (w1.A7U() == 0) {
            C02359h c02359h = A0G.A04.A03[i];
            Format[] A0v = A0v(A0G.A04.A01.A00(i));
            boolean z2 = this.A08 && this.A05.A00 == 3;
            boolean joining = !z && z2;
            w1.A59(c02359h, A0v, A0G.A0A[i], this.A03, joining, A0G.A07());
            this.A0G.A09(w1);
            if (z2) {
                w1.start();
            }
        }
    }

    private void A0P(long j) throws AnonymousClass98 {
        if (this.A0K.A0P()) {
            C9O A0G = this.A0K.A0G();
            if (A0W[4].length() == 29) {
                throw new RuntimeException();
            }
            String[] strArr = A0W;
            strArr[0] = "3Dp2X759xi1gKy2gc8ykMJ";
            strArr[7] = "GcHSrS1OF4oxjH6XmPjhKR";
            j = A0G.A09(j);
        }
        this.A03 = j;
        this.A0G.A07(this.A03);
        for (W1 w1 : this.A0C) {
            w1.AE4(this.A03);
        }
    }

    private void A0Q(long j, long j2) throws AnonymousClass98 {
        C9F previousInfo;
        if (this.A0R.isEmpty() || this.A05.A04.A01()) {
            return;
        }
        if (this.A05.A02 == j) {
            j--;
        }
        int i = this.A05.A04.A02;
        int currentPeriodIndex = this.A00;
        C9F c9f = currentPeriodIndex > 0 ? this.A0R.get(currentPeriodIndex - 1) : null;
        while (c9f != null) {
            if (c9f.A00 <= i) {
                int i2 = c9f.A00;
                if (A0W[3].charAt(0) == 'c') {
                    throw new RuntimeException();
                }
                String[] strArr = A0W;
                strArr[0] = "ZbbXGQ7fBHqOH9bFx5EieA";
                strArr[7] = "wqQaVgv9yDX8FIaCovLxd4";
                if (i2 == i) {
                    if (c9f.A01 <= j) {
                        break;
                    }
                } else {
                    break;
                }
            }
            this.A00--;
            int currentPeriodIndex2 = this.A00;
            c9f = currentPeriodIndex2 > 0 ? this.A0R.get(currentPeriodIndex2 - 1) : null;
        }
        if (this.A00 < this.A0R.size()) {
            C9F previousInfo2 = this.A0R.get(this.A00);
            previousInfo = previousInfo2;
        } else {
            previousInfo = null;
        }
        while (previousInfo != null && previousInfo.A02 != null && (previousInfo.A00 < i || (previousInfo.A00 == i && previousInfo.A01 <= j))) {
            this.A00++;
            if (this.A00 < this.A0R.size()) {
                C9F previousInfo3 = this.A0R.get(this.A00);
                previousInfo = previousInfo3;
            } else {
                previousInfo = null;
            }
        }
        while (previousInfo != null && previousInfo.A02 != null && previousInfo.A00 == i && previousInfo.A01 > j && previousInfo.A01 <= j2) {
            A0Z(previousInfo.A03);
            if (previousInfo.A03.A0B() || previousInfo.A03.A0D()) {
                this.A0R.remove(this.A00);
            } else {
                this.A00++;
            }
            if (this.A00 < this.A0R.size()) {
                C9F previousInfo4 = this.A0R.get(this.A00);
                previousInfo = previousInfo4;
            } else {
                previousInfo = null;
            }
        }
    }

    private void A0R(long j, long j2) {
        this.A0Q.ADp(2);
        this.A0Q.AEK(2, j + j2);
    }

    /* JADX WARN: Removed duplicated region for block: B:54:0x0113  */
    /* JADX WARN: Removed duplicated region for block: B:70:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private void A0T(com.facebook.ads.redexgen.X.C9H r20) throws com.facebook.ads.redexgen.X.AnonymousClass98 {
        /*
            Method dump skipped, instructions count: 304
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.ads.redexgen.X.C0308Cp.A0T(com.facebook.ads.redexgen.X.9H):void");
    }

    private void A0V(@Nullable C9O c9o) throws AnonymousClass98 {
        C9O A0G = this.A0K.A0G();
        if (A0G == null || c9o == A0G) {
            return;
        }
        int i = 0;
        boolean[] zArr = new boolean[this.A0T.length];
        int i2 = 0;
        while (true) {
            W1[] w1Arr = this.A0T;
            if (i2 >= w1Arr.length) {
                break;
            }
            W1 w1 = w1Arr[i2];
            zArr[i2] = w1.A7U() != 0;
            if (A0G.A04.A00(i2)) {
                i++;
            }
            if (zArr[i2] && (!A0G.A04.A00(i2) || (w1.A8M() && w1.A7Z() == c9o.A0A[i2]))) {
                A0b(w1);
            }
            i2++;
        }
        C9S c9s = this.A05;
        int enabledRendererCount = A0W[6].charAt(23);
        if (enabledRendererCount == 106) {
            throw new RuntimeException();
        }
        String[] strArr = A0W;
        strArr[0] = "YeyTuc4hJN2cviDoFTSuVw";
        strArr[7] = "y3cCzPpceybwtUTWhAu8hu";
        this.A05 = c9s.A05(A0G.A03, A0G.A04);
        A0p(zArr, i);
    }

    private void A0W(C9T c9t) {
        this.A0G.AEX(c9t);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void A0X(C02329e c02329e) throws AnonymousClass98 {
        if (c02329e.A0D()) {
            return;
        }
        try {
            c02329e.A04().A7x(c02329e.A00(), c02329e.A09());
        } finally {
            c02329e.A0A(true);
        }
    }

    private void A0Y(C02329e c02329e) throws AnonymousClass98 {
        if (c02329e.A02() == -9223372036854775807L) {
            A0Z(c02329e);
        } else if (this.A07 == null || this.A01 > 0) {
            this.A0R.add(new C9F(c02329e));
        } else {
            C9F c9f = new C9F(c02329e);
            if (A0r(c9f)) {
                ArrayList<C9F> arrayList = this.A0R;
                String[] strArr = A0W;
                if (strArr[0].length() != strArr[7].length()) {
                    throw new RuntimeException();
                }
                A0W[6] = "bdowkwDe22b4JBVUMCxt2Emm6YTTpUJh";
                arrayList.add(c9f);
                Collections.sort(this.A0R);
                return;
            }
            c02329e.A0A(false);
        }
    }

    private void A0Z(C02329e c02329e) throws AnonymousClass98 {
        if (c02329e.A03().getLooper() == this.A0Q.A6t()) {
            A0X(c02329e);
            if (this.A05.A00 == 3 || this.A05.A00 == 2) {
                this.A0Q.AEJ(2);
                return;
            }
            return;
        }
        this.A0Q.A9g(15, c02329e).sendToTarget();
    }

    private void A0a(final C02329e c02329e) {
        c02329e.A03().post(new Runnable() { // from class: com.facebook.ads.redexgen.X.9D
            public static byte[] A02;

            static {
                A01();
            }

            public static String A00(int i, int i2, int i3) {
                byte[] copyOfRange = Arrays.copyOfRange(A02, i, i + i2);
                for (int i4 = 0; i4 < copyOfRange.length; i4++) {
                    copyOfRange[i4] = (byte) ((copyOfRange[i4] - i3) - 119);
                }
                return new String(copyOfRange);
            }

            public static void A01() {
                A02 = new byte[]{-20, 31, 22, -9, 19, 8, 32, 12, 25, -16, 20, 23, 19, -16, 21, 27, 12, 25, 21, 8, 19, -30, -5, -14, 5, -3, -14, -16, 1, -14, -15, -83, -14, -1, -1, -4, -1, -83, -15, -14, -7, -10, 3, -14, -1, -10, -5, -12, -83, -6, -14, 0, 0, -18, -12, -14, -83, -4, -5, -83, -14, 5, 1, -14, -1, -5, -18, -7, -83, 1, -11, -1, -14, -18, -15, -69};
            }

            @Override // java.lang.Runnable
            public final void run() {
                if (C0480Jm.A02(this)) {
                    return;
                }
                try {
                    try {
                        C0308Cp.this.A0X(c02329e);
                    } catch (AnonymousClass98 e) {
                        Log.e(A00(0, 21, 48), A00(21, 55, 22), e);
                        throw new RuntimeException(e);
                    }
                } catch (Throwable th) {
                    C0480Jm.A00(th, this);
                }
            }
        });
    }

    private void A0b(W1 w1) throws AnonymousClass98 {
        this.A0G.A08(w1);
        A0c(w1);
        w1.A4n();
    }

    private void A0c(W1 w1) throws AnonymousClass98 {
        if (w1.A7U() == 2) {
            w1.stop();
        }
    }

    private void A0d(C02379j c02379j) {
        this.A06 = c02379j;
    }

    private void A0e(UH uh) {
        if (!this.A0K.A0T(uh)) {
            return;
        }
        this.A0K.A0M(this.A03);
        A09();
    }

    private void A0f(UH uh) throws AnonymousClass98 {
        if (!this.A0K.A0T(uh)) {
            return;
        }
        C9O A0F = this.A0K.A0F();
        A0F.A0E(this.A0G.A7C().A01);
        A0i(A0F.A03, A0F.A04);
        if (!this.A0K.A0P()) {
            C9O loadingPeriodHolder = this.A0K.A0C();
            A0P(loadingPeriodHolder.A02.A03);
            A0V(null);
        }
        A09();
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Override // com.facebook.ads.redexgen.X.InterfaceC0351Ei
    /* renamed from: A0g */
    public final void AAJ(UH uh) {
        this.A0Q.A9g(10, uh).sendToTarget();
    }

    private void A0h(EM em, boolean z, boolean z2) {
        this.A01++;
        A0o(true, z, z2);
        this.A0J.onPrepared();
        this.A07 = em;
        A0N(2);
        em.ADC(this.A0H, true, this);
        this.A0Q.AEJ(2);
    }

    private void A0i(TrackGroupArray trackGroupArray, GG gg) {
        this.A0J.ACT(this.A0T, trackGroupArray, gg.A01);
    }

    private void A0j(boolean z) throws AnonymousClass98 {
        EK ek = this.A0K.A0G().A02.A04;
        long A03 = A03(ek, this.A05.A0A, true);
        if (A03 != this.A05.A0A) {
            C9S c9s = this.A05;
            this.A05 = c9s.A04(ek, A03, c9s.A01);
            if (z) {
                this.A0I.A04(4);
            }
        }
    }

    private void A0k(boolean z) {
        if (this.A05.A08 != z) {
            this.A05 = this.A05.A06(z);
        }
    }

    private void A0l(boolean z) throws AnonymousClass98 {
        this.A09 = false;
        this.A08 = z;
        if (!z) {
            A0H();
            A0J();
        } else if (this.A05.A00 == 3) {
            A0G();
            if (A0W[4].length() == 29) {
                throw new RuntimeException();
            }
            A0W[6] = "X2QfJ1e23pCpGilE5nvaFXYxLnWx3Vax";
            this.A0Q.AEJ(2);
        } else if (this.A05.A00 != 2) {
        } else {
            this.A0Q.AEJ(2);
        }
    }

    private void A0m(boolean z) throws AnonymousClass98 {
        this.A0B = z;
        if (!this.A0K.A0V(z)) {
            A0j(true);
        }
    }

    private void A0n(boolean z, boolean z2) {
        A0o(true, z, z);
        this.A0I.A03(this.A01 + (z2 ? 1 : 0));
        this.A01 = 0;
        this.A0J.ACL();
        A0N(1);
    }

    private void A0o(boolean z, boolean z2, boolean z3) {
        Object obj;
        long j;
        TrackGroupArray trackGroupArray;
        GG gg;
        EM em;
        this.A0Q.ADp(2);
        this.A09 = false;
        this.A0G.A06();
        this.A03 = 0L;
        for (W1 w1 : this.A0C) {
            try {
                A0b(w1);
            } catch (AnonymousClass98 | RuntimeException e) {
                Log.e(A06(0, 21, 15), A06(138, 12, 123), e);
            }
        }
        this.A0C = new W1[0];
        C9Q c9q = this.A0K;
        String[] strArr = A0W;
        if (strArr[1].charAt(27) == strArr[2].charAt(27)) {
            throw new RuntimeException();
        }
        String[] strArr2 = A0W;
        strArr2[0] = "2WNzaDjkqcOaPFAy0QOPwI";
        strArr2[7] = "unAKX8spYNQMyMddShLfR5";
        c9q.A0O(!z2);
        A0k(false);
        if (z2) {
            this.A04 = null;
        }
        if (z3) {
            this.A0K.A0N(AbstractC02409n.A01);
            Iterator<C9F> it = this.A0R.iterator();
            while (it.hasNext()) {
                C9F next = it.next();
                if (A0W[5].length() != 18) {
                    throw new RuntimeException();
                }
                A0W[6] = "oYGfQB8mGDj6jmVX6XAe4nZE0DoRm7Og";
                next.A03.A0A(false);
            }
            this.A0R.clear();
            this.A00 = 0;
        }
        AbstractC02409n abstractC02409n = z3 ? AbstractC02409n.A01 : this.A05.A03;
        if (z3) {
            obj = null;
        } else {
            obj = this.A05.A07;
        }
        EK ek = z2 ? new EK(A00()) : this.A05.A04;
        long j2 = -9223372036854775807L;
        if (z2) {
            j = -9223372036854775807L;
        } else {
            j = this.A05.A0A;
        }
        if (!z2) {
            j2 = this.A05.A01;
        }
        int i = this.A05.A00;
        if (z3) {
            trackGroupArray = TrackGroupArray.A04;
        } else {
            C9S c9s = this.A05;
            if (A0W[5].length() != 18) {
                trackGroupArray = c9s.A05;
            } else {
                String[] strArr3 = A0W;
                strArr3[1] = "udHBd6VluCWpjwypGpbQkm44C5lEXr7W";
                strArr3[2] = "ikIjUWR3chEMULYYaopllYxVSgtPleKx";
                trackGroupArray = c9s.A05;
            }
        }
        if (z3) {
            gg = this.A0O;
        } else {
            gg = this.A05.A06;
        }
        this.A05 = new C9S(abstractC02409n, obj, ek, j, j2, i, false, trackGroupArray, gg);
        if (z && (em = this.A07) != null) {
            em.ADm(this);
            this.A07 = null;
        }
    }

    /* JADX WARN: Incorrect condition in loop: B:4:0x000f */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private void A0p(boolean[] r6, int r7) throws com.facebook.ads.redexgen.X.AnonymousClass98 {
        /*
            r5 = this;
            com.facebook.ads.redexgen.X.W1[] r0 = new com.facebook.ads.redexgen.X.W1[r7]
            r5.A0C = r0
            r4 = 0
            com.facebook.ads.redexgen.X.9Q r0 = r5.A0K
            com.facebook.ads.redexgen.X.9O r3 = r0.A0G()
            r2 = 0
        Lc:
            com.facebook.ads.redexgen.X.W1[] r0 = r5.A0T
            int r0 = r0.length
            if (r2 >= r0) goto L24
            com.facebook.ads.redexgen.X.GG r0 = r3.A04
            boolean r0 = r0.A00(r2)
            if (r0 == 0) goto L21
            boolean r1 = r6[r2]
            int r0 = r4 + 1
            r5.A0O(r2, r1, r4)
            r4 = r0
        L21:
            int r2 = r2 + 1
            goto Lc
        L24:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.ads.redexgen.X.C0308Cp.A0p(boolean[], int):void");
    }

    private boolean A0q() {
        C9O A0G = this.A0K.A0G();
        long j = A0G.A02.A01;
        if (j != -9223372036854775807L) {
            long playingPeriodDurationUs = this.A05.A0A;
            if (playingPeriodDurationUs >= j) {
                C9O playingPeriodHolder = A0G.A01;
                if (playingPeriodHolder != null) {
                    C9O playingPeriodHolder2 = A0G.A01;
                    if (!playingPeriodHolder2.A06) {
                        C9O playingPeriodHolder3 = A0G.A01;
                        if (playingPeriodHolder3.A02.A04.A01()) {
                        }
                    }
                }
                return false;
            }
        }
        return true;
    }

    private boolean A0r(C9F c9f) {
        if (c9f.A02 == null) {
            Pair<Integer, Long> A04 = A04(new C9H(c9f.A03.A08(), c9f.A03.A01(), AnonymousClass92.A00(c9f.A03.A02())), false);
            if (A04 == null) {
                return false;
            }
            c9f.A01(((Integer) A04.first).intValue(), ((Long) A04.second).longValue(), this.A05.A03.A0A(((Integer) A04.first).intValue(), this.A0L, true).A03);
        } else {
            int A042 = this.A05.A03.A04(c9f.A02);
            if (A042 == -1) {
                return false;
            }
            c9f.A00 = A042;
        }
        return true;
    }

    private boolean A0s(W1 w1) {
        C9O A0H = this.A0K.A0H();
        C9O readingPeriodHolder = A0H.A01;
        if (readingPeriodHolder != null) {
            C9O readingPeriodHolder2 = A0H.A01;
            if (readingPeriodHolder2.A06 && w1.A82()) {
                return true;
            }
        }
        return false;
    }

    private boolean A0t(EK ek, long j, C9O c9o) {
        if (ek.equals(c9o.A02.A04) && c9o.A06) {
            this.A05.A03.A09(c9o.A02.A04.A02, this.A0L);
            int A04 = this.A0L.A04(j);
            if (A04 != -1) {
                int nextAdGroupIndex = (this.A0L.A09(A04) > c9o.A02.A02 ? 1 : (this.A0L.A09(A04) == c9o.A02.A02 ? 0 : -1));
                if (nextAdGroupIndex == 0) {
                    return true;
                }
                return false;
            }
            return true;
        }
        return false;
    }

    /* JADX WARN: Code restructure failed: missing block: B:19:0x0068, code lost:
        if (r3 != Long.MIN_VALUE) goto L20;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x0081, code lost:
        if (r7.A0J.AEg(r3 - r5.A08(r7.A03), r7.A0G.A7C().A01, r7.A09) == false) goto L22;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x0083, code lost:
        return true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x009e, code lost:
        if (r3 != Long.MIN_VALUE) goto L20;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:?, code lost:
        return false;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private boolean A0u(boolean r8) {
        /*
            r7 = this;
            com.facebook.ads.redexgen.X.W1[] r0 = r7.A0C
            int r0 = r0.length
            if (r0 != 0) goto La
            boolean r0 = r7.A0q()
            return r0
        La:
            r6 = 0
            java.lang.String[] r2 = com.facebook.ads.redexgen.X.C0308Cp.A0W
            r0 = 0
            r1 = r2[r0]
            r0 = 7
            r0 = r2[r0]
            int r1 = r1.length()
            int r0 = r0.length()
            if (r1 == r0) goto L23
            java.lang.RuntimeException r0 = new java.lang.RuntimeException
            r0.<init>()
            throw r0
        L23:
            java.lang.String[] r2 = com.facebook.ads.redexgen.X.C0308Cp.A0W
            java.lang.String r1 = "XitCw2lYTMNoWfZ3MNfhmS"
            r0 = 0
            r2[r0] = r1
            java.lang.String r1 = "pjSmPGutCkFid20LDJR8Tk"
            r0 = 7
            r2[r0] = r1
            if (r8 != 0) goto L32
            return r6
        L32:
            com.facebook.ads.redexgen.X.9S r0 = r7.A05
            boolean r0 = r0.A08
            r3 = 1
            if (r0 != 0) goto L3a
            return r3
        L3a:
            com.facebook.ads.redexgen.X.9Q r0 = r7.A0K
            com.facebook.ads.redexgen.X.9O r5 = r0.A0F()
            java.lang.String[] r2 = com.facebook.ads.redexgen.X.C0308Cp.A0W
            r0 = 1
            r1 = r2[r0]
            r0 = 2
            r2 = r2[r0]
            r0 = 27
            char r1 = r1.charAt(r0)
            char r0 = r2.charAt(r0)
            if (r1 == r0) goto L85
            java.lang.String[] r2 = com.facebook.ads.redexgen.X.C0308Cp.A0W
            java.lang.String r1 = "c9QtbAseiMx42ehTAZ"
            r0 = 5
            r2[r0] = r1
            com.facebook.ads.redexgen.X.9P r0 = r5.A02
            boolean r0 = r0.A05
            r0 = r0 ^ r3
            long r3 = r5.A0C(r0)
            r1 = -9223372036854775808
            int r0 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r0 == 0) goto L83
        L6a:
            com.facebook.ads.redexgen.X.9N r2 = r7.A0J
            long r0 = r7.A03
            long r0 = r5.A08(r0)
            long r3 = r3 - r0
            com.facebook.ads.redexgen.X.W4 r0 = r7.A0G
            com.facebook.ads.redexgen.X.9T r0 = r0.A7C()
            float r1 = r0.A01
            boolean r0 = r7.A09
            boolean r0 = r2.AEg(r3, r1, r0)
            if (r0 == 0) goto L84
        L83:
            r6 = 1
        L84:
            return r6
        L85:
            java.lang.String[] r2 = com.facebook.ads.redexgen.X.C0308Cp.A0W
            java.lang.String r1 = "5BPuibQqZ5NKjWZyuTION1z1lHkA3o6b"
            r0 = 1
            r2[r0] = r1
            java.lang.String r1 = "lue4BzZmQF8ChJf2GK4Pk4NwU097v1o6"
            r0 = 2
            r2[r0] = r1
            com.facebook.ads.redexgen.X.9P r0 = r5.A02
            boolean r0 = r0.A05
            r0 = r0 ^ r3
            long r3 = r5.A0C(r0)
            r1 = -9223372036854775808
            int r0 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r0 == 0) goto L83
            goto L6a
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.ads.redexgen.X.C0308Cp.A0u(boolean):boolean");
    }

    @NonNull
    public static Format[] A0v(GC gc) {
        int length = gc != null ? gc.length() : 0;
        Format[] formatArr = new Format[length];
        for (int i = 0; i < length; i++) {
            formatArr[i] = gc.A6f(i);
            if (A0W[3].charAt(0) == 'c') {
                throw new RuntimeException();
            }
            String[] strArr = A0W;
            strArr[1] = "cHoAaTwhCyKnC5gIlgOheFkD17ImOLE4";
            strArr[2] = "NdVO49IoL7wvUQC4on3mokgCd3AJvc50";
        }
        return formatArr;
    }

    public final Looper A0w() {
        return this.A0F.getLooper();
    }

    /* JADX WARN: Incorrect condition in loop: B:9:0x0010 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final synchronized void A0x() {
        /*
            r2 = this;
            monitor-enter(r2)
            boolean r0 = r2.A0A     // Catch: java.lang.Throwable -> L23
            if (r0 == 0) goto L7
            monitor-exit(r2)
            return
        L7:
            com.facebook.ads.redexgen.X.HJ r1 = r2.A0Q     // Catch: java.lang.Throwable -> L23
            r0 = 7
            r1.AEJ(r0)     // Catch: java.lang.Throwable -> L23
            r1 = 0
        Le:
            boolean r0 = r2.A0A     // Catch: java.lang.Throwable -> L23
            if (r0 != 0) goto L18
            r2.wait()     // Catch: java.lang.InterruptedException -> L16 java.lang.Throwable -> L23
            goto Le
        L16:
            r1 = 1
            goto Le
        L18:
            if (r1 == 0) goto L21
            java.lang.Thread r0 = java.lang.Thread.currentThread()     // Catch: java.lang.Throwable -> L23
            r0.interrupt()     // Catch: java.lang.Throwable -> L23
        L21:
            monitor-exit(r2)
            return
        L23:
            r0 = move-exception
            monitor-exit(r2)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.ads.redexgen.X.C0308Cp.A0x():void");
    }

    public final void A0y(AbstractC02409n abstractC02409n, int i, long j) {
        this.A0Q.A9g(3, new C9H(abstractC02409n, i, j)).sendToTarget();
    }

    public final void A0z(EM em, boolean z, boolean z2) {
        this.A0Q.A9f(0, z ? 1 : 0, z2 ? 1 : 0, em).sendToTarget();
    }

    public final void A10(boolean z) {
        this.A0Q.A9e(1, z ? 1 : 0, 0).sendToTarget();
    }

    public final void A11(boolean z) {
        this.A0Q.A9e(6, z ? 1 : 0, 0).sendToTarget();
    }

    @Override // com.facebook.ads.redexgen.X.AnonymousClass95
    public final void ABi(C9T c9t) {
        this.A0E.obtainMessage(1, c9t).sendToTarget();
        A0L(c9t.A01);
    }

    @Override // com.facebook.ads.redexgen.X.UI
    public final void ABq(UH uh) {
        this.A0Q.A9g(9, uh).sendToTarget();
    }

    @Override // com.facebook.ads.redexgen.X.EL
    public final void ACG(EM em, AbstractC02409n abstractC02409n, Object obj) {
        this.A0Q.A9g(8, new C9E(em, abstractC02409n, obj)).sendToTarget();
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC02309c
    public final synchronized void AEL(C02329e c02329e) {
        if (this.A0A) {
            Log.w(A06(0, 21, 15), A06(50, 37, 50));
            c02329e.A0A(false);
            return;
        }
        this.A0Q.A9g(14, c02329e).sendToTarget();
    }

    @Override // android.os.Handler.Callback
    public final boolean handleMessage(Message message) {
        String A06 = A06(0, 21, 15);
        try {
            switch (message.what) {
                case 0:
                    A0h((EM) message.obj, message.arg1 != 0, message.arg2 != 0);
                    break;
                case 1:
                    A0l(message.arg1 != 0);
                    break;
                case 2:
                    A07();
                    break;
                case 3:
                    A0T((C9H) message.obj);
                    break;
                case 4:
                    A0W((C9T) message.obj);
                    break;
                case 5:
                    A0d((C02379j) message.obj);
                    break;
                case 6:
                    A0n(message.arg1 != 0, true);
                    break;
                case 7:
                    A0D();
                    return true;
                case 8:
                    A0S((C9E) message.obj);
                    break;
                case 9:
                    A0f((UH) message.obj);
                    break;
                case 10:
                    A0e((UH) message.obj);
                    break;
                case 11:
                    A0E();
                    break;
                case 12:
                    A0M(message.arg1);
                    break;
                case 13:
                    A0m(message.arg1 != 0);
                    break;
                case 14:
                    A0Y((C02329e) message.obj);
                    break;
                case 15:
                    A0a((C02329e) message.obj);
                    break;
                default:
                    return false;
            }
            A0A();
        } catch (AnonymousClass98 e) {
            Log.e(A06, A06(j.AppCompatTheme_viewInflaterClass, 15, 0), e);
            A0n(false, false);
            this.A0E.obtainMessage(2, e).sendToTarget();
            A0A();
        } catch (IOException e2) {
            Log.e(A06, A06(125, 13, 87), e2);
            A0n(false, false);
            this.A0E.obtainMessage(2, AnonymousClass98.A00(e2)).sendToTarget();
            A0A();
        } catch (RuntimeException e3) {
            Log.e(A06, A06(87, 23, j.AppCompatTheme_tooltipForegroundColor), e3);
            A0n(false, false);
            this.A0E.obtainMessage(2, AnonymousClass98.A02(e3)).sendToTarget();
            if (A0W[6].charAt(23) == 'j') {
                throw new RuntimeException();
            }
            A0W[5] = "BLVAUEtDSJNWXrvjpr";
            A0A();
        }
        return true;
    }
}
