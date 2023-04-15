package com.facebook.ads.redexgen.X;

import a.a.j;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import com.facebook.ads.internal.exoplayer2.offline.DownloadAction;
import java.io.File;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArraySet;
/* renamed from: com.facebook.ads.redexgen.X.Dm  reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public final class C0331Dm {
    public static byte[] A0F;
    public static String[] A0G = {"8avf0Jibg", "29lNoiTUBE2uYEjX9VQOmTXDz5OY", "iVCyimFGxTrkRtFibV9levDJM5ZeLgZu", "gsRFpTOWHqJbEx7", "Kz1bOIham", "JnXM2eLoSoNer4vADvBB94foIijHhZU8", "txozpLaaBXvdIU5pC59NuAEDTSpBHfjF", "fwU5WNlYuxW7JC9kmXc8msxXEM9ymJ0s"};
    public int A00;
    public boolean A01;
    public boolean A02;
    public boolean A03;
    public final int A04;
    public final int A05;
    public final Handler A06;
    public final Handler A07;
    public final HandlerThread A08;
    public final DS A09;
    public final C0336Dr A0A;
    public final ArrayList<RunnableC0328Dj> A0B;
    public final ArrayList<RunnableC0328Dj> A0C;
    public final CopyOnWriteArraySet<InterfaceC0324Df> A0D;
    public final DownloadAction.Deserializer[] A0E;

    public static String A05(int i, int i2, int i3) {
        byte[] copyOfRange = Arrays.copyOfRange(A0F, i, i + i2);
        int i4 = 0;
        while (true) {
            int length = copyOfRange.length;
            if (A0G[7].charAt(18) == 'd') {
                throw new RuntimeException();
            }
            A0G[5] = "QeXCOK5E1pPej2TxlzyNK8QEELc16ejC";
            if (i4 >= length) {
                return new String(copyOfRange);
            }
            copyOfRange[i4] = (byte) ((copyOfRange[i4] ^ i3) ^ j.AppCompatTheme_textAppearanceSmallPopupMenu);
            i4++;
        }
    }

    public static void A0C() {
        A0F = new byte[]{40, 107, 100, 105, 123, 96, 109, 123, 40, Byte.MAX_VALUE, 97, 124, 96, 40, 13, 23, 101, 80, 4, 72, 65, 69, 87, 80, 4, 75, 74, 65, 4, 96, 65, 87, 65, 86, 77, 69, 72, 77, 94, 65, 86, 4, 77, 87, 4, 86, 65, 85, 81, 77, 86, 65, 64, 10, 82, 121, 97, 120, 122, 121, 119, 114, 91, 119, 120, 119, 113, 115, 100, 54, 112, Byte.MAX_VALUE, 122, 115, 54, Byte.MAX_VALUE, 57, 121, 37, 16, 2, 26, 81, 24, 2, 81, 16, 21, 21, 20, 21, 21, 32, 50, 42, 97, 50, 53, 32, 53, 36, 97, 40, 50, 97, 34, 41, 32, 47, 38, 36, 37};
    }

    static {
        A0C();
    }

    public C0331Dm(C0336Dr c0336Dr, int i, int i2, File file, DownloadAction.Deserializer... deserializerArr) {
        H6.A05(deserializerArr.length > 0, A05(16, 38, 67));
        this.A0A = c0336Dr;
        this.A04 = i;
        this.A05 = i2;
        this.A09 = new DS(file);
        this.A0E = deserializerArr;
        this.A01 = true;
        this.A0C = new ArrayList<>();
        this.A0B = new ArrayList<>();
        Looper myLooper = Looper.myLooper();
        this.A07 = new Handler(myLooper == null ? Looper.getMainLooper() : myLooper);
        this.A08 = new HandlerThread(A05(54, 24, j.AppCompatTheme_windowActionModeOverlay));
        this.A08.start();
        this.A06 = new Handler(this.A08.getLooper());
        this.A0D = new CopyOnWriteArraySet<>();
        A08();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public RunnableC0328Dj A02(DownloadAction downloadAction) {
        int i = this.A00;
        this.A00 = i + 1;
        RunnableC0328Dj runnableC0328Dj = new RunnableC0328Dj(i, this, downloadAction, this.A05, null);
        this.A0C.add(runnableC0328Dj);
        A0J(A05(78, 13, 22), runnableC0328Dj);
        return runnableC0328Dj;
    }

    private void A08() {
        this.A06.post(new RunnableC0322Dd(this));
    }

    private void A09() {
        if (!A0R()) {
            return;
        }
        Iterator<InterfaceC0324Df> it = this.A0D.iterator();
        while (it.hasNext()) {
            it.next().AAq(this);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void A0A() {
        DownloadAction A06;
        boolean canStartTask;
        if (!this.A02 || this.A03) {
            return;
        }
        boolean skipDownloadActions = this.A01 || this.A0B.size() == this.A04;
        for (int i = 0; i < this.A0C.size(); i++) {
            RunnableC0328Dj runnableC0328Dj = this.A0C.get(i);
            if (RunnableC0328Dj.A0H(runnableC0328Dj) && ((canStartTask = (A06 = RunnableC0328Dj.A06(runnableC0328Dj)).A03) || !skipDownloadActions)) {
                boolean z = true;
                int i2 = 0;
                while (true) {
                    if (i2 >= i) {
                        break;
                    }
                    RunnableC0328Dj runnableC0328Dj2 = this.A0C.get(i2);
                    if (RunnableC0328Dj.A06(runnableC0328Dj2).A09(A06)) {
                        if (canStartTask) {
                            z = false;
                            String str = runnableC0328Dj + A05(0, 14, j.AppCompatTheme_windowActionBar) + runnableC0328Dj2;
                            RunnableC0328Dj.A0C(runnableC0328Dj2);
                        } else if (RunnableC0328Dj.A06(runnableC0328Dj2).A03) {
                            z = false;
                            skipDownloadActions = true;
                            break;
                        }
                    }
                    i2++;
                }
                if (z) {
                    RunnableC0328Dj.A0D(runnableC0328Dj);
                    if (!canStartTask) {
                        this.A0B.add(runnableC0328Dj);
                        skipDownloadActions = this.A0B.size() == this.A04;
                    }
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void A0B() {
        if (this.A03) {
            return;
        }
        DownloadAction[] downloadActionArr = new DownloadAction[this.A0C.size()];
        for (int i = 0; i < this.A0C.size(); i++) {
            downloadActionArr[i] = RunnableC0328Dj.A06(this.A0C.get(i));
        }
        this.A06.post(new RunnableC0323De(this, downloadActionArr));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void A0D(RunnableC0328Dj runnableC0328Dj) {
        A0J(A05(91, 21, 38), runnableC0328Dj);
        C0330Dl A0K = runnableC0328Dj.A0K();
        Iterator<InterfaceC0324Df> it = this.A0D.iterator();
        while (it.hasNext()) {
            it.next().ACP(this, A0K);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void A0E(RunnableC0328Dj runnableC0328Dj) {
        if (this.A03) {
            return;
        }
        boolean A0L = runnableC0328Dj.A0L();
        String[] strArr = A0G;
        if (strArr[2].charAt(18) != strArr[6].charAt(18)) {
            throw new RuntimeException();
        }
        A0G[5] = "MuXE9yewg4GnYpwcSobAkjsL3VeJsTJN";
        boolean z = !A0L;
        if (z) {
            this.A0B.remove(runnableC0328Dj);
        }
        A0D(runnableC0328Dj);
        boolean stopped = runnableC0328Dj.A0M();
        if (stopped) {
            this.A0C.remove(runnableC0328Dj);
            A0B();
        }
        if (z) {
            A0A();
            A09();
        }
    }

    public static void A0J(String str, RunnableC0328Dj runnableC0328Dj) {
        String str2 = str + A05(14, 2, 80) + runnableC0328Dj;
    }

    public final int A0O(DownloadAction downloadAction) {
        H6.A04(!this.A03);
        RunnableC0328Dj A02 = A02(downloadAction);
        if (this.A02) {
            A0B();
            A0A();
            if (RunnableC0328Dj.A03(A02) == 0) {
                A0D(A02);
            }
        }
        return RunnableC0328Dj.A04(A02);
    }

    public final void A0P() {
        H6.A04(!this.A03);
        if (this.A01) {
            this.A01 = false;
            A0A();
        }
    }

    public final void A0Q(InterfaceC0324Df interfaceC0324Df) {
        this.A0D.add(interfaceC0324Df);
    }

    /* JADX WARN: Incorrect condition in loop: B:7:0x0014 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean A0R() {
        /*
            r4 = this;
            boolean r0 = r4.A03
            r3 = 1
            r0 = r0 ^ r3
            com.facebook.ads.redexgen.X.H6.A04(r0)
            boolean r0 = r4.A02
            r2 = 0
            if (r0 != 0) goto Ld
            return r2
        Ld:
            r1 = 0
        Le:
            java.util.ArrayList<com.facebook.ads.redexgen.X.Dj> r0 = r4.A0C
            int r0 = r0.size()
            if (r1 >= r0) goto L28
            java.util.ArrayList<com.facebook.ads.redexgen.X.Dj> r0 = r4.A0C
            java.lang.Object r0 = r0.get(r1)
            com.facebook.ads.redexgen.X.Dj r0 = (com.facebook.ads.redexgen.X.RunnableC0328Dj) r0
            boolean r0 = r0.A0L()
            if (r0 == 0) goto L25
            return r2
        L25:
            int r1 = r1 + 1
            goto Le
        L28:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.ads.redexgen.X.C0331Dm.A0R():boolean");
    }

    public final C0330Dl[] A0S() {
        H6.A04(!this.A03);
        C0330Dl[] c0330DlArr = new C0330Dl[this.A0C.size()];
        for (int i = 0; i < c0330DlArr.length; i++) {
            c0330DlArr[i] = this.A0C.get(i).A0K();
        }
        return c0330DlArr;
    }
}
