package com.facebook.ads.redexgen.X;

import a.a.j;
import java.util.Arrays;
import java.util.concurrent.CountDownLatch;
import org.json.JSONException;
import org.json.JSONObject;
/* loaded from: assets/audience_network.dex */
public class ZK extends AbstractRunnableC0487Ju {
    public static byte[] A02;
    public final /* synthetic */ C00270u A00;
    public final /* synthetic */ JSONObject A01;

    static {
        A02();
    }

    public static String A00(int i, int i2, int i3) {
        byte[] copyOfRange = Arrays.copyOfRange(A02, i, i + i2);
        for (int i4 = 0; i4 < copyOfRange.length; i4++) {
            copyOfRange[i4] = (byte) ((copyOfRange[i4] ^ i3) ^ 21);
        }
        return new String(copyOfRange);
    }

    public static void A02() {
        A02 = new byte[]{7, 19, 4, 16, 20, 4, 15, 2, 24, 62, 2, 0, 17, 17, 8, 15, 6};
    }

    public ZK(C00270u c00270u, JSONObject jSONObject) {
        this.A00 = c00270u;
        this.A01 = jSONObject;
    }

    @Override // com.facebook.ads.redexgen.X.AbstractRunnableC0487Ju
    public final void A06() {
        C7G c7g;
        C7G c7g2;
        CountDownLatch countDownLatch;
        C00260t c00260t;
        C00260t c00260t2;
        CountDownLatch countDownLatch2;
        try {
            countDownLatch = this.A00.A05;
            countDownLatch.await();
            c00260t = this.A00.A02;
            synchronized (c00260t) {
                c00260t2 = this.A00.A02;
                c00260t2.A0B(this.A01);
                countDownLatch2 = this.A00.A06;
                countDownLatch2.countDown();
            }
        } catch (InterruptedException e) {
            c7g2 = this.A00.A03;
            c7g2.A06().A8u(A00(0, 17, j.AppCompatTheme_windowFixedWidthMajor), C01877l.A1B, new C01887m(e));
        } catch (JSONException e2) {
            this.A00.A0M();
            c7g = this.A00.A03;
            c7g.A06().A8u(A00(0, 17, j.AppCompatTheme_windowFixedWidthMajor), C01877l.A1A, new C01887m(e2));
        }
    }
}
