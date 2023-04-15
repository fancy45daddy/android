package com.facebook.ads.redexgen.X;

import android.os.Handler;
import com.facebook.ads.internal.exoplayer2.offline.DownloadAction;
import java.util.Arrays;
/* renamed from: com.facebook.ads.redexgen.X.Dd  reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public class RunnableC0322Dd implements Runnable {
    public static byte[] A01;
    public final /* synthetic */ C0331Dm A00;

    static {
        A01();
    }

    public static String A00(int i, int i2, int i3) {
        byte[] copyOfRange = Arrays.copyOfRange(A01, i, i + i2);
        for (int i4 = 0; i4 < copyOfRange.length; i4++) {
            copyOfRange[i4] = (byte) ((copyOfRange[i4] - i3) - 116);
        }
        return new String(copyOfRange);
    }

    public static void A01() {
        A01 = new byte[]{-73, -39, -22, -33, -27, -28, -106, -36, -33, -30, -37, -106, -30, -27, -41, -38, -33, -28, -35, -106, -36, -41, -33, -30, -37, -38, -92, -66, -23, -15, -24, -26, -23, -37, -34, -57, -37, -24, -37, -31, -33, -20};
    }

    public RunnableC0322Dd(C0331Dm c0331Dm) {
        this.A00 = c0331Dm;
    }

    @Override // java.lang.Runnable
    public final void run() {
        DS ds;
        DownloadAction.Deserializer[] deserializerArr;
        Handler handler;
        if (C0480Jm.A02(this)) {
            return;
        }
        try {
            ds = this.A00.A09;
            deserializerArr = this.A00.A0E;
            DownloadAction[] actions = ds.A03(deserializerArr);
            handler = this.A00.A07;
            handler.post(new RunnableC0321Dc(this, actions));
        }
    }
}
