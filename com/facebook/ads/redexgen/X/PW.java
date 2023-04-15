package com.facebook.ads.redexgen.X;

import a.a.j;
import android.content.Context;
import android.net.Uri;
import android.os.Handler;
import android.os.Looper;
import android.util.SparseArray;
import androidx.annotation.Nullable;
import androidx.annotation.VisibleForTesting;
import com.facebook.ads.internal.exoplayer2.offline.DownloadAction;
import java.io.File;
import java.net.URI;
import java.net.URISyntaxException;
import java.util.Arrays;
/* loaded from: assets/audience_network.dex */
public final class PW {
    public static PW A09;
    public static byte[] A0A;
    public static final DownloadAction.Deserializer[] A0B;
    public C0331Dm A00;
    @Nullable
    public InterfaceC0409Gq A01;
    public File A02;
    public boolean A03;
    public final C0805Wi A06;
    public final Handler A04 = new Handler(Looper.getMainLooper());
    public final SparseArray<PU> A05 = new SparseArray<>();
    public final Runnable A08 = new PT(this);
    public final InterfaceC0324Df A07 = new H4(this);

    public static String A07(int i, int i2, int i3) {
        byte[] copyOfRange = Arrays.copyOfRange(A0A, i, i + i2);
        for (int i4 = 0; i4 < copyOfRange.length; i4++) {
            copyOfRange[i4] = (byte) ((copyOfRange[i4] - i3) - 103);
        }
        return new String(copyOfRange);
    }

    public static void A0C() {
        A0A = new byte[]{-103, -69, -14, -19, -34, -20, -77, -103, -69, -3, 20, 15, 0, 14, -69, -24, 19, 27, 18, 16, 19, 5, 8, 9, 8, -46, -60, -9, 24, 5, 24, 9, -34, -60, 27, 72, 72, 69, 72, 4, -10, 41, 74, 55, 74, 59, 16, -10, -44, -31, -13, -21, 33, 36, 46, 55, -19, 33, 35, 52, 41, 47, 46, 51, -40, -37, -27, -18, -92, -37, -26, -18, -27, -29, -26, -40, -37, -22, 33, 36, 51, -40, -42, -40, -35, -38};
    }

    static {
        A0C();
        A0B = new DownloadAction.Deserializer[]{UQ.A03};
    }

    @VisibleForTesting
    public PW(C0805Wi c0805Wi, @Nullable C0331Dm c0331Dm) {
        this.A06 = c0805Wi;
        if (c0331Dm != null) {
            this.A00 = c0331Dm;
            c0331Dm.A0Q(this.A07);
        }
        A01().A0P();
    }

    private synchronized C0331Dm A01() {
        if (this.A00 == null) {
            this.A00 = new C0331Dm(new C0336Dr(A03(), A02()), 10, 5, new File(A06(), A07(52, 12, 89)), A0B);
            this.A00.A0Q(this.A07);
        }
        return this.A00;
    }

    private InterfaceC0733Tl A02() {
        return new C2N(A07(78, 3, 89), null);
    }

    private final synchronized InterfaceC0409Gq A03() {
        if (this.A01 == null) {
            this.A01 = new TX(new File(A06(), A07(64, 14, 16)), new A5(ID.A0O(this.A06)));
        }
        return this.A01;
    }

    public static C0722Ta A04(C0739Tr c0739Tr, InterfaceC0409Gq interfaceC0409Gq) {
        return new C0722Ta(interfaceC0409Gq, c0739Tr, new C0735Tn(), null, 2, null);
    }

    public static synchronized PW A05(C0805Wi c0805Wi) {
        PW pw;
        synchronized (PW.class) {
            if (A09 == null) {
                A09 = new PW(c0805Wi, null);
            }
            pw = A09;
        }
        return pw;
    }

    private File A06() {
        if (this.A02 == null) {
            this.A02 = this.A06.getCacheDir();
        }
        return this.A02;
    }

    @Nullable
    public static String A08(C0805Wi c0805Wi, Uri uri) {
        try {
            if (!ID.A1H(c0805Wi)) {
                return null;
            }
            return new URI(uri.getScheme(), uri.getAuthority(), uri.getPath(), null, uri.getFragment()).toString();
        } catch (URISyntaxException e) {
            c0805Wi.A06().A8u(A07(81, 5, 14), C01877l.A0u, new C01887m(e));
            return null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void A09() {
        C0330Dl[] A0S;
        for (C0330Dl c0330Dl : A01().A0S()) {
            int taskId = c0330Dl.A02;
            PU pu = this.A05.get(taskId);
            if (pu != null) {
                int i = c0330Dl.A01;
                if (i == 2 || c0330Dl.A03 > pu.A00) {
                    String str = A07(15, 19, 61) + i + A07(0, 8, 18) + c0330Dl.A03;
                    pu.A01.AAS(pu.A02);
                    this.A05.remove(taskId);
                } else if (i == 4 || i == 3) {
                    String str2 = A07(34, 14, j.AppCompatTheme_windowActionBar) + i;
                    pu.A01.AAe(c0330Dl.A05);
                    this.A05.remove(taskId);
                }
            }
            String str3 = A07(48, 4, 25) + taskId + A07(8, 7, 52) + c0330Dl.A03;
        }
    }

    private void A0A() {
        if (!this.A03) {
            this.A03 = true;
            this.A04.post(this.A08);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void A0B() {
        this.A04.removeCallbacks(this.A08);
        this.A03 = false;
    }

    public final GP A0F(Context context) {
        return A04(new C0739Tr(context, (InterfaceC0405Gm<? super GQ>) null, A02()), A03());
    }

    public final void A0G(Uri uri, PV pv, long j) {
        String A08 = A08(this.A06, uri);
        if (A08 == null) {
            A08 = uri.toString();
        }
        boolean A0H = A0H(A08);
        this.A05.put(A01().A0O(new UQ(uri, false, null, A08)), new PU(pv, j, A0H, null));
        A0A();
    }

    public final boolean A0H(String str) {
        return A03().A5u(str, 0L, 1L) > 0;
    }
}
