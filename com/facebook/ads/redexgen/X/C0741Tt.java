package com.facebook.ads.redexgen.X;

import android.os.Handler;
import androidx.annotation.Nullable;
/* renamed from: com.facebook.ads.redexgen.X.Tt  reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public final class C0741Tt implements GL, InterfaceC0405Gm<Object> {
    public static String[] A0A = {"8v43OWLt8X4Ft8FSsUnUJEljk6O9jZtl", "gqJU9rJqtCXP9nVsCJhzhjWr3OTUONn5", "evi8lnvhIGFpGwxvrEQ2HxpF9HfAYNb4", "XM9iQGBoaLQIRrKYvs1BFwTGSVuWakLP", "oYKHkHYzGvwdV8VAJO5FvOndhShHo3uL", "GsOQXWL80Wqi8CBj4PFxcrgidstVbv5Z", "TfEJwESWFeUjyASkqvscuoRhiyKsiSGj", "R3GeLkF45fmp7DtCtFYf0NMS1ko1sZ3Y"};
    public int A00;
    public long A01;
    public long A02;
    public long A03;
    public long A04;
    public long A05;
    @Nullable
    public final Handler A06;
    @Nullable
    public final GK A07;
    public final H9 A08;
    public final C0425Hg A09;

    public C0741Tt() {
        this(null, null, 1000000L, 2000, H9.A00);
    }

    public C0741Tt(@Nullable Handler handler, @Nullable GK gk, long j, int i, H9 h9) {
        this.A06 = handler;
        this.A07 = gk;
        this.A09 = new C0425Hg(i);
        this.A08 = h9;
        this.A01 = j;
    }

    private void A01(int i, long j, long j2) {
        Handler handler = this.A06;
        if (handler != null) {
            GK gk = this.A07;
            String[] strArr = A0A;
            if (strArr[3].charAt(14) == strArr[2].charAt(14)) {
                throw new RuntimeException();
            }
            String[] strArr2 = A0A;
            strArr2[3] = "mcMhHiKL1Hs40ZODL70g4thjgDTU4mJQ";
            strArr2[2] = "gdrxxP25NVrEqdTm0xFGwMteDAr0ERpE";
            if (gk != null) {
                handler.post(new GV(this, i, j, j2));
            }
        }
    }

    @Override // com.facebook.ads.redexgen.X.GL
    public final synchronized long A5l() {
        return this.A01;
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC0405Gm
    public final synchronized void AAA(Object obj, int i) {
        this.A02 += i;
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x004c, code lost:
        if (r16.A04 >= 524288) goto L13;
     */
    @Override // com.facebook.ads.redexgen.X.InterfaceC0405Gm
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final synchronized void ACU(java.lang.Object r17) {
        /*
            r16 = this;
            r4 = r16
            monitor-enter(r4)
            int r0 = r4.A00     // Catch: java.lang.Throwable -> L70
            r9 = 1
            if (r0 <= 0) goto La
            r0 = 1
            goto Lb
        La:
            r0 = 0
        Lb:
            com.facebook.ads.redexgen.X.H6.A04(r0)     // Catch: java.lang.Throwable -> L70
            com.facebook.ads.redexgen.X.H9 r0 = r4.A08     // Catch: java.lang.Throwable -> L70
            long r2 = r0.A57()     // Catch: java.lang.Throwable -> L70
            long r5 = r4.A03     // Catch: java.lang.Throwable -> L70
            long r0 = r2 - r5
            int r11 = (int) r0     // Catch: java.lang.Throwable -> L70
            long r5 = r4.A05     // Catch: java.lang.Throwable -> L70
            long r0 = (long) r11     // Catch: java.lang.Throwable -> L70
            long r5 = r5 + r0
            r4.A05 = r5     // Catch: java.lang.Throwable -> L70
            long r5 = r4.A04     // Catch: java.lang.Throwable -> L70
            long r0 = r4.A02     // Catch: java.lang.Throwable -> L70
            long r5 = r5 + r0
            r4.A04 = r5     // Catch: java.lang.Throwable -> L70
            if (r11 <= 0) goto L59
            long r5 = r4.A02     // Catch: java.lang.Throwable -> L70
            r0 = 8000(0x1f40, double:3.9525E-320)
            long r5 = r5 * r0
            long r0 = (long) r11     // Catch: java.lang.Throwable -> L70
            long r5 = r5 / r0
            float r8 = (float) r5     // Catch: java.lang.Throwable -> L70
            com.facebook.ads.redexgen.X.Hg r7 = r4.A09     // Catch: java.lang.Throwable -> L70
            long r5 = r4.A02     // Catch: java.lang.Throwable -> L70
            double r0 = (double) r5     // Catch: java.lang.Throwable -> L70
            double r5 = java.lang.Math.sqrt(r0)     // Catch: java.lang.Throwable -> L70
            int r0 = (int) r5     // Catch: java.lang.Throwable -> L70
            r7.A03(r0, r8)     // Catch: java.lang.Throwable -> L70
            long r7 = r4.A05     // Catch: java.lang.Throwable -> L70
            r5 = 2000(0x7d0, double:9.88E-321)
            int r0 = (r7 > r5 ? 1 : (r7 == r5 ? 0 : -1))
            if (r0 >= 0) goto L4e
            long r7 = r4.A04     // Catch: java.lang.Throwable -> L70
            r5 = 524288(0x80000, double:2.590327E-318)
            int r0 = (r7 > r5 ? 1 : (r7 == r5 ? 0 : -1))
            if (r0 < 0) goto L59
        L4e:
            com.facebook.ads.redexgen.X.Hg r1 = r4.A09     // Catch: java.lang.Throwable -> L70
            r0 = 1056964608(0x3f000000, float:0.5)
            float r0 = r1.A02(r0)     // Catch: java.lang.Throwable -> L70
            long r0 = (long) r0     // Catch: java.lang.Throwable -> L70
            r4.A01 = r0     // Catch: java.lang.Throwable -> L70
        L59:
            long r12 = r4.A02     // Catch: java.lang.Throwable -> L70
            long r14 = r4.A01     // Catch: java.lang.Throwable -> L70
            r10 = r4
            r10.A01(r11, r12, r14)     // Catch: java.lang.Throwable -> L70
            int r0 = r4.A00     // Catch: java.lang.Throwable -> L70
            int r0 = r0 - r9
            r4.A00 = r0     // Catch: java.lang.Throwable -> L70
            if (r0 <= 0) goto L6a
            r4.A03 = r2     // Catch: java.lang.Throwable -> L70
        L6a:
            r0 = 0
            r4.A02 = r0     // Catch: java.lang.Throwable -> L70
            monitor-exit(r4)
            return
        L70:
            r0 = move-exception
            monitor-exit(r4)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.ads.redexgen.X.C0741Tt.ACU(java.lang.Object):void");
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC0405Gm
    public final synchronized void ACV(Object obj, GU gu) {
        if (this.A00 == 0) {
            this.A03 = this.A08.A57();
        }
        this.A00++;
    }
}
