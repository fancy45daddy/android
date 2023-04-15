package com.facebook.ads.redexgen.X;

import java.util.Arrays;
import java.util.concurrent.atomic.AtomicBoolean;
/* renamed from: com.facebook.ads.redexgen.X.Wo  reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public class C0811Wo extends AbstractRunnableC0487Ju {
    public static byte[] A02;
    public final /* synthetic */ C0810Wn A00;
    public final /* synthetic */ AtomicBoolean A01;

    static {
        A02();
    }

    public static String A00(int i, int i2, int i3) {
        byte[] copyOfRange = Arrays.copyOfRange(A02, i, i + i2);
        for (int i4 = 0; i4 < copyOfRange.length; i4++) {
            copyOfRange[i4] = (byte) ((copyOfRange[i4] ^ i3) ^ 31);
        }
        return new String(copyOfRange);
    }

    public static void A02() {
        A02 = new byte[]{117, 87, 85, 94, 83, 22, 80, 87, 95, 90, 24, 77, 111, 109, 102, 107, 46, 125, 123, 109, 109, 107, 125, 125, 32};
    }

    public C0811Wo(C0810Wn c0810Wn, AtomicBoolean atomicBoolean) {
        this.A00 = c0810Wn;
        this.A01 = atomicBoolean;
    }

    @Override // com.facebook.ads.redexgen.X.AbstractRunnableC0487Ju
    public final void A06() {
        C7G c7g;
        long j;
        C7G c7g2;
        long j2;
        if (this.A00.A00 != null) {
            if (this.A01.get()) {
                this.A00.A02.A0I(EnumC0443Ia.A0H);
                c7g2 = this.A00.A02.A04;
                AnonymousClass69 anonymousClass69 = this.A00.A01;
                int i = C6J.A00;
                j2 = this.A00.A02.A00;
                C6J.A02(c7g2, anonymousClass69, i, A00(11, 14, 17), j2);
                this.A00.A02.A0T();
                this.A00.A00.AAI();
                return;
            }
            this.A00.A02.A0I(EnumC0443Ia.A0G);
            c7g = this.A00.A02.A04;
            AnonymousClass69 anonymousClass692 = this.A00.A01;
            int i2 = C6J.A04;
            j = this.A00.A02.A00;
            C6J.A02(c7g, anonymousClass692, i2, A00(0, 11, 41), j);
            this.A00.A02.A0U();
            this.A00.A00.AAB();
        }
    }
}
