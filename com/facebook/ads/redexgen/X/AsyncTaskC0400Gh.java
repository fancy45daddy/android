package com.facebook.ads.redexgen.X;

import a.a.j;
import android.os.AsyncTask;
import java.util.Arrays;
import java.util.Locale;
import java.util.concurrent.Executor;
/* renamed from: com.facebook.ads.redexgen.X.Gh  reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public final class AsyncTaskC0400Gh extends AsyncTask<Q0, Void, InterfaceC0632Pn> implements InterfaceC0642Px {
    public static byte[] A04;
    public InterfaceC0634Pp A00;
    public GT A01;
    public Exception A02;
    public Executor A03;

    static {
        A02();
    }

    /* JADX WARN: Failed to parse debug info
    java.lang.ArrayIndexOutOfBoundsException: Index 13 out of bounds for length 12
    	at jadx.plugins.input.dex.sections.debuginfo.DebugInfoParser.startVar(DebugInfoParser.java:203)
    	at jadx.plugins.input.dex.sections.debuginfo.DebugInfoParser.process(DebugInfoParser.java:125)
    	at jadx.plugins.input.dex.sections.DexCodeReader.getDebugInfo(DexCodeReader.java:118)
    	at jadx.core.dex.nodes.MethodNode.getDebugInfo(MethodNode.java:567)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.visit(DebugInfoAttachVisitor.java:39)
     */
    private final InterfaceC0632Pn A00(Q0... q0Arr) {
        if (C0480Jm.A02(this)) {
            return null;
        }
        try {
            if (q0Arr != null) {
                try {
                    if (q0Arr.length > 0) {
                        InterfaceC0632Pn A0J = this.A01.A0J(q0Arr[0]);
                        if (this.A01.A0K().A04() && A0J != null) {
                            String.format(Locale.US, A01(j.AppCompatTheme_tooltipForegroundColor, 21, 6), Integer.valueOf(A0J.A7Y()), A0J.getUrl(), A0J.A5n());
                        }
                        if (A0J != null) {
                            return A0J;
                        }
                        throw new IllegalStateException(A01(87, 21, j.AppCompatTheme_windowMinWidthMinor));
                    }
                } catch (Exception e) {
                    this.A02 = e;
                    if (this.A01.A0K().A04()) {
                        String.format(Locale.US, A01(64, 23, 98), e.getMessage());
                    }
                    cancel(true);
                    return null;
                }
            }
            throw new IllegalArgumentException(A01(0, 64, 69));
        } catch (Throwable th) {
            C0480Jm.A00(th, this);
            return null;
        }
    }

    public static String A01(int i, int i2, int i3) {
        byte[] copyOfRange = Arrays.copyOfRange(A04, i, i + i2);
        for (int i4 = 0; i4 < copyOfRange.length; i4++) {
            copyOfRange[i4] = (byte) ((copyOfRange[i4] - i3) - 101);
        }
        return new String(copyOfRange);
    }

    public static void A02() {
        A04 = new byte[]{-18, 25, -14, 30, 30, 26, -4, 15, 27, 31, 15, 29, 30, -2, 11, 29, 21, -54, 30, 11, 21, 15, 29, -54, 15, 34, 11, 13, 30, 22, 35, -54, 25, 24, 15, -54, 11, 28, 17, 31, 23, 15, 24, 30, -54, 25, 16, -54, 30, 35, 26, 15, -54, -14, 30, 30, 26, -4, 15, 27, 31, 15, 29, 30, 15, 27, 27, 23, -25, 57, 44, 56, 60, 44, 58, 59, -25, 45, 40, 48, 51, 44, 43, 1, -25, -20, 58, 36, 80, 80, 76, -4, 78, 65, 79, 76, 75, 74, 79, 65, -4, 69, 79, -4, 74, 81, 72, 72, -67, -48, -34, -37, -38, -39, -34, -48, -91, -117, -112, -49, -117, -109, -112, -34, -108, -91, 117, -112, -34};
    }

    public AsyncTaskC0400Gh(GT gt, InterfaceC0634Pp interfaceC0634Pp, Executor executor) {
        this.A01 = gt;
        this.A00 = interfaceC0634Pp;
        this.A03 = executor;
    }

    private final void A03(InterfaceC0632Pn result) {
        if (C0480Jm.A02(this)) {
            return;
        }
        try {
            this.A00.AAG(result);
        } catch (Throwable th) {
            C0480Jm.A00(th, this);
        }
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC0642Px
    public final void A5G(Q0 q0) {
        super.executeOnExecutor(this.A03, q0);
    }

    @Override // android.os.AsyncTask
    public final /* bridge */ /* synthetic */ InterfaceC0632Pn doInBackground(Q0[] q0Arr) {
        if (C0480Jm.A02(this)) {
            return null;
        }
        try {
            return A00(q0Arr);
        } catch (Throwable th) {
            C0480Jm.A00(th, this);
            return null;
        }
    }

    @Override // android.os.AsyncTask
    public final void onCancelled() {
        this.A00.AAd(this.A02);
    }

    @Override // android.os.AsyncTask
    public final /* bridge */ /* synthetic */ void onPostExecute(InterfaceC0632Pn interfaceC0632Pn) {
        if (C0480Jm.A02(this)) {
            return;
        }
        try {
            A03(interfaceC0632Pn);
        } catch (Throwable th) {
            C0480Jm.A00(th, this);
        }
    }
}
