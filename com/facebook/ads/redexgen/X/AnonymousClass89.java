package com.facebook.ads.redexgen.X;

import android.annotation.SuppressLint;
import android.util.Log;
import androidx.annotation.Nullable;
import com.facebook.ads.AudienceNetworkActivity;
import com.facebook.ads.AudienceNetworkAds;
import com.facebook.ads.internal.api.BuildConfigApi;
import com.facebook.ads.internal.settings.AdInternalSettings;
import com.facebook.ads.internal.settings.MultithreadedBundleWrapper;
import com.facebook.ads.internal.util.activity.ActivityUtils;
import java.lang.Thread;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicBoolean;
/* renamed from: com.facebook.ads.redexgen.X.89  reason: invalid class name */
/* loaded from: assets/audience_network.dex */
public final class AnonymousClass89 {
    public static boolean A00;
    public static boolean A01;
    public static byte[] A02;
    public static String[] A03 = {"qrNp1wG", "4f9SKAEMWw8LBpPH9ClfYFaSVVluVAOE", "62aVnpwn360RV3u8SEcmxFYidJmBvefX", "Gce9ySP9MgoEln4cNVrEo5sJO8CSkBrv", "GAv6eBsy68sSiadtgyjEU9blJSusD372", "OMedkGV5dbFzDsS0dZcen", "wlEAAxVLaYYUt0VSnPi", "2B4l1t7rFez9Iyb0KdS6JKEUq9HBo8Fu"};
    public static final AtomicBoolean A04;
    public static final AtomicBoolean A05;
    public static final AtomicBoolean A06;

    public static String A02(int i, int i2, int i3) {
        byte[] copyOfRange = Arrays.copyOfRange(A02, i, i + i2);
        int i4 = 0;
        while (true) {
            int length = copyOfRange.length;
            if (A03[1].charAt(3) == 'A') {
                throw new RuntimeException();
            }
            String[] strArr = A03;
            strArr[4] = "IDfTBPjSyvL4biEe7dLkbKSavqcQmadb";
            strArr[2] = "Oy3yacq1X2KDRnpIDSUXWs28RTZJmhMt";
            if (i4 >= length) {
                return new String(copyOfRange);
            }
            copyOfRange[i4] = (byte) ((copyOfRange[i4] - i3) - 60);
            i4++;
        }
    }

    public static void A03() {
        A02 = new byte[]{-59, -56, -58, -8, -55, -53, -55, -10, -66, -70, -71, -19, -36, -31, -35, -26, -37, -35, -58, -35, -20, -17, -25, -22, -29, -62, -77, -70, -113, -40, -35, -40, -29, -40, -48, -37, -40, -23, -48, -29, -40, -34, -35, -113, -30, -29, -48, -31, -29, -44, -45, -60, -43, -36, -111, -24, -46, -28, -111, -46, -35, -29, -42, -46, -43, -22, -111, -38, -33, -38, -27, -38, -46, -35, -38, -21, -42, -43, -110, -111, -60, -36, -38, -31, -31, -38, -33, -40, -97, -62, -40, -34, -119, -51, -40, -41, -112, -35, -119, -52, -54, -43, -43, -119, -86, -34, -51, -46, -50, -41, -52, -50, -73, -50, -35, -32, -40, -37, -44, -86, -51, -36, -105, -46, -41, -46, -35, -46, -54, -43, -46, -29, -50, -111, -110, -105, -119, -68, -40, -42, -50, -119, -49, -34, -41, -52, -35, -46, -40, -41, -54, -43, -46, -35, -30, -119, -42, -54, -30, -119, -41, -40, -35, -119, -32, -40, -37, -44, -119, -39, -37, -40, -39, -50, -37, -43, -30, -105, -66, -51, -58, -31, -33, -24, -33, -20, -29, -35, -9, -4, -9, 2, -9, -17, -6, -9, 8, -13, 5, 10, 5, 16, 5, -3, 8, 5, 22, 1, -60, -59, -68, 10, 11, 16, -68, -1, -3, 8, 8, 1, 0, -54};
    }

    static {
        A03();
        A06 = new AtomicBoolean();
        A04 = new AtomicBoolean();
        A05 = new AtomicBoolean();
    }

    public static InterfaceC0478Jk A00() {
        return new WT();
    }

    public static K0 A01(C0805Wi c0805Wi) {
        return new WS(c0805Wi);
    }

    public static void A04(AudienceNetworkAds.InitListener initListener, AudienceNetworkAds.InitResult initResult) {
        L8.A01.execute(new WU(initListener, initResult));
    }

    @SuppressLint({"CatchGeneralException"})
    public static void A06(C0805Wi c0805Wi) {
        if (IF.A0P(c0805Wi) && !A05.getAndSet(true)) {
            try {
                Thread.UncaughtExceptionHandler defaultUncaughtExceptionHandler = new C01787b(Thread.getDefaultUncaughtExceptionHandler(), c0805Wi, new WQ());
                Thread.setDefaultUncaughtExceptionHandler(defaultUncaughtExceptionHandler);
            } catch (Exception e) {
                c0805Wi.A06().A8u(A02(181, 7, 62), C01877l.A1X, new C01887m(e));
            }
        }
    }

    public static void A07(C0805Wi c0805Wi) {
        A0G(c0805Wi, null, null, 3);
    }

    public static void A08(C0805Wi c0805Wi) {
        A0G(c0805Wi, null, null, 3);
    }

    public static void A09(C0805Wi c0805Wi) {
        if (ID.A1d(c0805Wi)) {
            A0E(c0805Wi, 0);
        }
        if (ID.A1k(c0805Wi)) {
            A0B(c0805Wi);
        }
    }

    public static void A0A(C0805Wi c0805Wi) {
        if (ID.A1e(c0805Wi)) {
            A0F(c0805Wi, null, 3);
        }
    }

    public static void A0B(C0805Wi c0805Wi) {
        LJ.A06.execute(new WV(c0805Wi));
    }

    public static void A0C(C0805Wi c0805Wi) {
        C01817f.A0C(c0805Wi, new WP(c0805Wi), new WZ(), BuildConfigApi.isDebug());
        c0805Wi.A08();
    }

    public static void A0E(C0805Wi c0805Wi, int i) {
        C7F.A01(c0805Wi);
        if (A04.getAndSet(true)) {
            return;
        }
        if (AdInternalSettings.isDebugBuild() || AdInternalSettings.isDebuggerOn()) {
            JH.A02();
        }
        A06(c0805Wi);
        C0490Jx.A00(ID.A0m(c0805Wi), BuildConfigApi.isDebug(), A00(), A01(c0805Wi));
        AnonymousClass61.A03(ID.A03(c0805Wi));
        Q6.A09(new WR(c0805Wi));
        if (i == 3) {
            Log.e(A02(8, 17, 60), A02(89, 89, 45));
            c0805Wi.A06().A9D(A02(178, 3, 33), C01877l.A0R, new C01887m(A02(198, 24, 96)));
        }
        ActivityUtils.A04(c0805Wi, AudienceNetworkActivity.class);
        LJ.A05(c0805Wi);
        C0447Ie.A05(c0805Wi);
        C00270u.A01(c0805Wi);
        if (ID.A0w(c0805Wi)) {
            C01324y.A00(c0805Wi);
        }
        if (ID.A1K(c0805Wi)) {
            WH.A02().A7L(c0805Wi);
        }
    }

    @SuppressLint({"CatchGeneralException"})
    public static void A0F(C0805Wi c0805Wi, @Nullable AudienceNetworkAds.InitListener initListener, int i) {
        C7F.A01(c0805Wi);
        boolean z = false;
        synchronized (AnonymousClass89.class) {
            boolean execute = A00;
            if (!execute) {
                if (i != 1 && i != 2) {
                    if (i == 3) {
                        boolean execute2 = A01;
                        if (!execute2) {
                            A01 = true;
                            z = true;
                        }
                    }
                }
                A00 = true;
                z = true;
            }
        }
        if (z) {
            A0E(c0805Wi, i);
            LJ.A08.execute(new WW(c0805Wi, initListener));
        } else if (i != 1) {
        } else {
            String A022 = A02(51, 38, 53);
            if (initListener != null) {
                A04(initListener, new AnonymousClass88(true, A022));
            } else {
                Log.w(A02(8, 17, 60), A022);
            }
        }
    }

    public static void A0G(C0805Wi c0805Wi, @Nullable MultithreadedBundleWrapper multithreadedBundleWrapper, @Nullable AudienceNetworkAds.InitListener initListener, int i) {
        JH.A05(A02(188, 10, 82), A02(25, 26, 51), A02(0, 8, 87));
        Q6.A06();
        A0F(c0805Wi, initListener, i);
    }

    public static synchronized boolean A0H() {
        boolean z;
        synchronized (AnonymousClass89.class) {
            z = A00;
        }
        return z;
    }
}
