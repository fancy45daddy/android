package com.facebook.ads.redexgen.X;

import a.a.j;
import android.annotation.SuppressLint;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.os.SystemClock;
import android.util.Log;
import androidx.annotation.Nullable;
import com.facebook.ads.redexgen.X.InterfaceC0397Ge;
import java.io.IOException;
import java.util.Arrays;
import java.util.concurrent.ExecutorService;
@SuppressLint({"HandlerLeak"})
/* renamed from: com.facebook.ads.redexgen.X.Gd  reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public final class HandlerC0396Gd<T extends InterfaceC0397Ge> extends Handler implements Runnable {
    public static byte[] A0A;
    public int A00;
    @Nullable
    public InterfaceC0395Gc<T> A01;
    public IOException A02;
    public final int A03;
    public final long A04;
    public final T A05;
    public volatile Thread A06;
    public volatile boolean A07;
    public volatile boolean A08;
    public final /* synthetic */ C0729Th A09;

    static {
        A04();
    }

    public static String A01(int i, int i2, int i3) {
        byte[] copyOfRange = Arrays.copyOfRange(A0A, i, i + i2);
        for (int i4 = 0; i4 < copyOfRange.length; i4++) {
            copyOfRange[i4] = (byte) ((copyOfRange[i4] - i3) - 16);
        }
        return new String(copyOfRange);
    }

    public static void A04() {
        A0A = new byte[]{-112, -125, -73, -64, -57, -110, -116, -81, -95, -92, -108, -95, -77, -85, -76, -38, -39, -76, -53, -78, -54, -46, -44, -41, -34, -123, -54, -41, -41, -44, -41, -123, -47, -44, -58, -55, -50, -45, -52, -123, -40, -39, -41, -54, -58, -46, -87, -62, -71, -52, -60, -71, -73, -56, -71, -72, 116, -71, -58, -58, -61, -58, 116, -64, -61, -75, -72, -67, -62, -69, 116, -57, -56, -58, -71, -75, -63, -38, -13, -22, -3, -11, -22, -24, -7, -22, -23, -91, -22, -3, -24, -22, -11, -7, -18, -12, -13, -91, -19, -26, -13, -23, -15, -18, -13, -20, -91, -15, -12, -26, -23, -91, -24, -12, -14, -11, -15, -22, -7, -22, -23, -117, -92, -101, -82, -90, -101, -103, -86, -101, -102, 86, -101, -82, -103, -101, -90, -86, -97, -91, -92, 86, -94, -91, -105, -102, -97, -92, -99, 86, -87, -86, -88, -101, -105, -93, -46, -43, -57, -54, -96, -94, -55, -46, -39, -92};
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.Gc != com.facebook.ads.internal.exoplayer2.upstream.Loader$Callback<T extends com.facebook.ads.redexgen.X.Ge> */
    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.Gd != com.facebook.ads.internal.exoplayer2.upstream.Loader$LoadTask<T extends com.facebook.ads.redexgen.X.Ge> */
    public HandlerC0396Gd(C0729Th c0729Th, Looper looper, T loadable, InterfaceC0395Gc<T> interfaceC0395Gc, int i, long j) {
        super(looper);
        this.A09 = c0729Th;
        this.A05 = loadable;
        this.A01 = interfaceC0395Gc;
        this.A03 = i;
        this.A04 = j;
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.Gd != com.facebook.ads.internal.exoplayer2.upstream.Loader$LoadTask<T extends com.facebook.ads.redexgen.X.Ge> */
    private long A00() {
        return Math.min((this.A00 - 1) * 1000, 5000);
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.Gd != com.facebook.ads.internal.exoplayer2.upstream.Loader$LoadTask<T extends com.facebook.ads.redexgen.X.Ge> */
    private void A02() {
        ExecutorService executorService;
        HandlerC0396Gd handlerC0396Gd;
        this.A02 = null;
        executorService = this.A09.A02;
        handlerC0396Gd = this.A09.A00;
        executorService.execute(handlerC0396Gd);
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.Gd != com.facebook.ads.internal.exoplayer2.upstream.Loader$LoadTask<T extends com.facebook.ads.redexgen.X.Ge> */
    private void A03() {
        this.A09.A00 = null;
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.Gd != com.facebook.ads.internal.exoplayer2.upstream.Loader$LoadTask<T extends com.facebook.ads.redexgen.X.Ge> */
    public final void A05(int i) throws IOException {
        IOException iOException = this.A02;
        if (iOException == null || this.A00 <= i) {
            return;
        }
        throw iOException;
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.Gd != com.facebook.ads.internal.exoplayer2.upstream.Loader$LoadTask<T extends com.facebook.ads.redexgen.X.Ge> */
    public final void A06(long j) {
        HandlerC0396Gd handlerC0396Gd;
        handlerC0396Gd = this.A09.A00;
        H6.A04(handlerC0396Gd == null);
        this.A09.A00 = this;
        if (j > 0) {
            sendEmptyMessageDelayed(0, j);
        } else {
            A02();
        }
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.Gd != com.facebook.ads.internal.exoplayer2.upstream.Loader$LoadTask<T extends com.facebook.ads.redexgen.X.Ge> */
    public final void A07(boolean z) {
        this.A08 = z;
        this.A02 = null;
        if (hasMessages(0)) {
            removeMessages(0);
            if (!z) {
                sendEmptyMessage(1);
            }
        } else {
            this.A07 = true;
            this.A05.A3y();
            if (this.A06 != null) {
                this.A06.interrupt();
            }
        }
        if (z) {
            A03();
            long elapsedRealtime = SystemClock.elapsedRealtime();
            this.A01.AB9(this.A05, elapsedRealtime, elapsedRealtime - this.A04, true);
            this.A01 = null;
        }
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.Gd != com.facebook.ads.internal.exoplayer2.upstream.Loader$LoadTask<T extends com.facebook.ads.redexgen.X.Ge> */
    @Override // android.os.Handler
    public final void handleMessage(Message message) {
        if (C0480Jm.A02(this)) {
            return;
        }
        try {
            if (this.A08) {
                return;
            }
            if (message.what == 0) {
                A02();
            } else if (message.what != 4) {
                A03();
                long elapsedRealtime = SystemClock.elapsedRealtime();
                long j = elapsedRealtime - this.A04;
                if (this.A07) {
                    this.A01.AB9(this.A05, elapsedRealtime, j, false);
                    return;
                }
                int i = message.what;
                if (i == 1) {
                    this.A01.AB9(this.A05, elapsedRealtime, j, false);
                } else if (i == 2) {
                    try {
                        this.A01.ABB(this.A05, elapsedRealtime, j);
                    } catch (RuntimeException e) {
                        Log.e(A01(6, 8, 48), A01(77, 44, j.AppCompatTheme_windowFixedWidthMinor), e);
                        this.A09.A01 = new C0401Gi(e);
                    }
                } else if (i != 3) {
                } else {
                    this.A02 = (IOException) message.obj;
                    int ABC = this.A01.ABC(this.A05, elapsedRealtime, j, this.A02);
                    if (ABC != 3) {
                        if (ABC == 2) {
                            return;
                        }
                        this.A00 = ABC == 1 ? 1 : this.A00 + 1;
                        A06(A00());
                        return;
                    }
                    this.A09.A01 = this.A02;
                }
            } else {
                throw ((Error) message.obj);
            }
        } catch (Throwable th) {
            C0480Jm.A00(th, this);
        }
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.Gd != com.facebook.ads.internal.exoplayer2.upstream.Loader$LoadTask<T extends com.facebook.ads.redexgen.X.Ge> */
    @Override // java.lang.Runnable
    public final void run() {
        String A01 = A01(6, 8, 48);
        if (C0480Jm.A02(this)) {
            return;
        }
        try {
            try {
                try {
                    try {
                        try {
                            this.A06 = Thread.currentThread();
                            if (!this.A07) {
                                C0427Hi.A02(A01(156, 10, 86) + this.A05.getClass().getSimpleName() + A01(0, 6, 68));
                                try {
                                    this.A05.A8j();
                                } finally {
                                    C0427Hi.A00();
                                }
                            }
                            if (!this.A08) {
                                sendEmptyMessage(2);
                            }
                        } catch (InterruptedException unused) {
                            H6.A04(this.A07);
                            if (!this.A08) {
                                sendEmptyMessage(2);
                            }
                        }
                    } catch (OutOfMemoryError e) {
                        Log.e(A01, A01(14, 32, 85), e);
                        if (!this.A08) {
                            obtainMessage(3, new C0401Gi(e)).sendToTarget();
                        }
                    }
                } catch (Error e2) {
                    Log.e(A01, A01(46, 31, 68), e2);
                    if (!this.A08) {
                        obtainMessage(4, e2).sendToTarget();
                    }
                    throw e2;
                }
            } catch (IOException e3) {
                if (!this.A08) {
                    obtainMessage(3, e3).sendToTarget();
                }
            } catch (Exception e4) {
                Log.e(A01, A01(121, 35, 38), e4);
                if (!this.A08) {
                    obtainMessage(3, new C0401Gi(e4)).sendToTarget();
                }
            }
        } catch (Throwable th) {
            C0480Jm.A00(th, this);
        }
    }
}
