package com.facebook.ads.redexgen.X;

import a.a.j;
import android.os.ConditionVariable;
import android.util.Log;
import androidx.annotation.NonNull;
import java.io.File;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.NavigableSet;
import java.util.TreeSet;
/* loaded from: assets/audience_network.dex */
public final class TX implements InterfaceC0409Gq {
    public static boolean A06;
    public static byte[] A07;
    public static final HashSet<File> A08;
    public long A00;
    public boolean A01;
    public final TZ A02;
    public final C0417Gy A03;
    public final File A04;
    public final HashMap<String, ArrayList<InterfaceC0408Gp>> A05;

    public static String A03(int i, int i2, int i3) {
        byte[] copyOfRange = Arrays.copyOfRange(A07, i, i + i2);
        for (int i4 = 0; i4 < copyOfRange.length; i4++) {
            copyOfRange[i4] = (byte) ((copyOfRange[i4] ^ i3) ^ 71);
        }
        return new String(copyOfRange);
    }

    public static void A06() {
        A07 = new byte[]{106, 69, 68, 95, 67, 78, 89, 11, 120, 66, 70, 91, 71, 78, 104, 74, 72, 67, 78, 11, 66, 69, 88, 95, 74, 69, 72, 78, 11, 94, 88, 78, 88, 11, 95, 67, 78, 11, 77, 68, 71, 79, 78, 89, 17, 11, 82, 104, 108, 113, 109, 100, 66, 96, 98, 105, 100, 94, 100, 96, 125, 97, 104, 78, 108, 110, 101, 104, 35, 100, 99, 100, 121, 100, 108, 97, 100, 119, 104, 37, 36, 0, 39, 60, 33, 58, 61, 52, 115, 58, 61, 55, 54, 43, 115, 53, 58, 63, 54, 115, 53, 50, 58, 63, 54, 55, 28, 30, 28, 23, 26, 27, 32, 28, 16, 17, 11, 26, 17, 11, 32, 22, 17, 27, 26, 7, 81, 26, 7, 22};
    }

    /* JADX WARN: Failed to parse debug info
    java.lang.ArrayIndexOutOfBoundsException: Index 10 out of bounds for length 10
    	at jadx.plugins.input.dex.sections.debuginfo.DebugInfoParser.process(DebugInfoParser.java:147)
    	at jadx.plugins.input.dex.sections.DexCodeReader.getDebugInfo(DexCodeReader.java:118)
    	at jadx.core.dex.nodes.MethodNode.getDebugInfo(MethodNode.java:567)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.visit(DebugInfoAttachVisitor.java:39)
     */
    @Override // com.facebook.ads.redexgen.X.InterfaceC0409Gq
    public final synchronized void A44(File file) throws C0407Go {
        H6.A04(!this.A01);
        TW A00 = TW.A00(file, this.A03);
        H6.A04(A00 != null);
        C0416Gx A09 = this.A03.A09(A00.A04);
        H6.A01(A09);
        H6.A04(A09.A0D());
        if (file.exists()) {
            if (file.length() == 0) {
                file.delete();
                return;
            }
            long A002 = H1.A00(A09.A05());
            if (A002 != -1) {
                H6.A04(A00.A02 + A00.A01 <= A002);
            }
            A0A(A00);
            this.A03.A0G();
            notifyAll();
        }
    }

    /* JADX WARN: Failed to parse debug info
    java.lang.ArrayIndexOutOfBoundsException: Index 4 out of bounds for length 4
    	at jadx.plugins.input.dex.sections.debuginfo.DebugInfoParser.process(DebugInfoParser.java:147)
    	at jadx.plugins.input.dex.sections.DexCodeReader.getDebugInfo(DexCodeReader.java:118)
    	at jadx.core.dex.nodes.MethodNode.getDebugInfo(MethodNode.java:567)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.visit(DebugInfoAttachVisitor.java:39)
     */
    @Override // com.facebook.ads.redexgen.X.InterfaceC0409Gq
    @NonNull
    public final synchronized NavigableSet<C0413Gu> A5v(String str) {
        C0416Gx A09;
        H6.A04(!this.A01);
        A09 = this.A03.A09(str);
        return (A09 == null || A09.A0C()) ? new TreeSet() : new TreeSet((Collection) A09.A08());
    }

    static {
        A06();
        A08 = new HashSet<>();
    }

    public TX(File file, TZ tz) {
        this(file, tz, null, false);
    }

    public TX(File file, TZ tz, C0417Gy c0417Gy) {
        if (A0D(file)) {
            this.A04 = file;
            this.A02 = tz;
            this.A03 = c0417Gy;
            this.A05 = new HashMap<>();
            ConditionVariable conditionVariable = new ConditionVariable();
            new H3(this, A03(57, 24, 74), conditionVariable).start();
            conditionVariable.block();
            return;
        }
        throw new IllegalStateException(A03(0, 46, j.AppCompatTheme_tooltipForegroundColor) + file);
    }

    public TX(File file, TZ tz, byte[] bArr, boolean z) {
        this(file, tz, new C0417Gy(file, bArr, z));
    }

    private TW A00(String str, long j) throws C0407Go {
        TW span;
        C0416Gx A09 = this.A03.A09(str);
        if (A09 == null) {
            return TW.A02(str, j);
        }
        while (true) {
            span = A09.A06(j);
            if (!span.A05 || span.A03.exists()) {
                break;
            }
            A05();
        }
        return span;
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Override // com.facebook.ads.redexgen.X.InterfaceC0409Gq
    /* renamed from: A01 */
    public final synchronized TW AEq(String str, long j) throws InterruptedException, C0407Go {
        TW span;
        while (true) {
            span = AEr(str, j);
            if (span == null) {
                wait();
            }
        }
        return span;
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Override // com.facebook.ads.redexgen.X.InterfaceC0409Gq
    /* renamed from: A02 */
    public final synchronized TW AEr(String str, long j) throws C0407Go {
        H6.A04(!this.A01);
        TW A00 = A00(str, j);
        if (A00.A05) {
            TW cacheSpan = this.A03.A09(str).A07(A00);
            A0C(A00, cacheSpan);
            return cacheSpan;
        }
        C0416Gx A0A = this.A03.A0A(str);
        if (!A0A.A0D()) {
            A0A.A0B(true);
            return A00;
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void A04() {
        if (!this.A04.exists()) {
            this.A04.mkdirs();
            return;
        }
        this.A03.A0E();
        File[] listFiles = this.A04.listFiles();
        if (listFiles == null) {
            return;
        }
        for (File file : listFiles) {
            if (!file.getName().equals(A03(j.AppCompatTheme_toolbarNavigationButtonStyle, 24, 56))) {
                TW A00 = file.length() > 0 ? TW.A00(file, this.A03) : null;
                if (A00 != null) {
                    A0A(A00);
                } else {
                    file.delete();
                }
            }
        }
        this.A03.A0F();
        try {
            this.A03.A0G();
        } catch (C0407Go e) {
            Log.e(A03(46, 11, 70), A03(81, 25, 20), e);
        }
    }

    private void A05() throws C0407Go {
        ArrayList arrayList = new ArrayList();
        for (C0416Gx c0416Gx : this.A03.A0D()) {
            Iterator<TW> it = c0416Gx.A08().iterator();
            while (it.hasNext()) {
                TW next = it.next();
                if (!next.A03.exists()) {
                    arrayList.add(next);
                }
            }
        }
        for (int i = 0; i < arrayList.size(); i++) {
            A08((C0413Gu) arrayList.get(i), false);
        }
        this.A03.A0F();
        this.A03.A0G();
    }

    private void A07(C0413Gu c0413Gu) {
        ArrayList<InterfaceC0408Gp> arrayList = this.A05.get(c0413Gu.A04);
        if (arrayList != null) {
            for (int i = arrayList.size() - 1; i >= 0; i--) {
                arrayList.get(i).ACI(this, c0413Gu);
            }
        }
        this.A02.ACI(this, c0413Gu);
    }

    private void A08(C0413Gu c0413Gu, boolean z) throws C0407Go {
        C0416Gx A09 = this.A03.A09(c0413Gu.A04);
        if (A09 == null || !A09.A0E(c0413Gu)) {
            return;
        }
        this.A00 -= c0413Gu.A01;
        if (z) {
            try {
                this.A03.A0H(A09.A03);
                this.A03.A0G();
            } finally {
                A07(c0413Gu);
            }
        }
    }

    private void A0A(TW tw) {
        this.A03.A0A(tw.A04).A09(tw);
        this.A00 += tw.A01;
        A0B(tw);
    }

    private void A0B(TW tw) {
        ArrayList<InterfaceC0408Gp> arrayList = this.A05.get(tw.A04);
        if (arrayList != null) {
            for (int i = arrayList.size() - 1; i >= 0; i--) {
                arrayList.get(i).ACH(this, tw);
            }
        }
        this.A02.ACH(this, tw);
    }

    private void A0C(TW tw, C0413Gu c0413Gu) {
        ArrayList<InterfaceC0408Gp> arrayList = this.A05.get(tw.A04);
        if (arrayList != null) {
            for (int i = arrayList.size() - 1; i >= 0; i--) {
                arrayList.get(i).ACJ(this, tw, c0413Gu);
            }
        }
        this.A02.ACJ(this, tw, c0413Gu);
    }

    public static synchronized boolean A0D(File file) {
        synchronized (TX.class) {
            if (A06) {
                return true;
            }
            return A08.add(file.getAbsoluteFile());
        }
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC0409Gq
    public final synchronized void A3P(String str, H2 h2) throws C0407Go {
        H6.A04(!this.A01);
        this.A03.A0I(str, h2);
        this.A03.A0G();
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC0409Gq
    public final synchronized long A5t() {
        H6.A04(!this.A01);
        return this.A00;
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC0409Gq
    public final synchronized long A5u(String str, long j, long j2) {
        C0416Gx cachedContent;
        H6.A04(!this.A01);
        cachedContent = this.A03.A09(str);
        return cachedContent != null ? cachedContent.A04(j, j2) : -j2;
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC0409Gq
    public final synchronized long A66(String str) {
        return H1.A00(A67(str));
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC0409Gq
    public final synchronized H0 A67(String str) {
        H6.A04(!this.A01);
        return this.A03.A0B(str);
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC0409Gq
    public final synchronized void ADj(C0413Gu c0413Gu) {
        H6.A04(!this.A01);
        C0416Gx A09 = this.A03.A09(c0413Gu.A04);
        H6.A01(A09);
        H6.A04(A09.A0D());
        A09.A0B(false);
        this.A03.A0H(A09.A03);
        notifyAll();
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC0409Gq
    public final synchronized void ADq(C0413Gu c0413Gu) throws C0407Go {
        H6.A04(!this.A01);
        A08(c0413Gu, true);
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC0409Gq
    public final synchronized void AEO(String str, long j) throws C0407Go {
        H2 mutations = new H2();
        H1.A05(mutations, j);
        A3P(str, mutations);
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC0409Gq
    public final synchronized File AEo(String str, long j, long j2) throws C0407Go {
        C0416Gx A09;
        H6.A04(!this.A01);
        A09 = this.A03.A09(str);
        H6.A01(A09);
        H6.A04(A09.A0D());
        if (!this.A04.exists()) {
            this.A04.mkdirs();
            A05();
        }
        this.A02.ACK(this, str, j, j2);
        return TW.A04(this.A04, A09.A02, j, System.currentTimeMillis());
    }
}
