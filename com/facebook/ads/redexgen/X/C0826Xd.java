package com.facebook.ads.redexgen.X;
/* renamed from: com.facebook.ads.redexgen.X.Xd  reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public class C0826Xd implements C4N {
    public static String[] A01 = {"IP6gXu3Aic9rrZpr", "DSm6OHbiM4aoMyjFh2wy7Spd3inn5axc", "lJd94ygIcpnkIi9oYNWqXg3HQV8t0X4Q", "337I3pVrWHOBtYrFGcdtPHZp8Kpz9VIJ", "vd5lczoeg9gY82TvyWngHoQKFpNC9gt0", "CefcuhKyPhUbDvzsvxPUhaoMgi2Xy5FO", "Qia1n7qQgpdEP2KZeQvga8Xzcvoo51Ij", "UfDKqgBAky8ekVpIbdpaQQPTuf6RISL4"};
    public final /* synthetic */ C0339Dw A00;

    public C0826Xd(C0339Dw c0339Dw) {
        this.A00 = c0339Dw;
    }

    @Override // com.facebook.ads.redexgen.X.C4N
    public final void A9t(AbstractC01194l abstractC01194l) {
        boolean A0A;
        abstractC01194l.A0Z(true);
        if (abstractC01194l.A06 != null && abstractC01194l.A07 == null) {
            abstractC01194l.A06 = null;
        }
        abstractC01194l.A07 = null;
        A0A = abstractC01194l.A0A();
        if (!A0A && !this.A00.A1z(abstractC01194l.A0H) && abstractC01194l.A0e()) {
            C0339Dw c0339Dw = this.A00;
            if (A01[6].charAt(16) != 'e') {
                throw new RuntimeException();
            }
            A01[0] = "BbBTSQcWyeSpGVnm";
            c0339Dw.removeDetachedView(abstractC01194l.A0H, false);
        }
    }
}
