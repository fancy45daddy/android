package com.facebook.ads.redexgen.X;

import a.a.j;
import java.io.IOException;
import java.util.Arrays;
/* renamed from: com.facebook.ads.redexgen.X.Uz  reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public final class C0770Uz implements BO {
    public static byte[] A04;
    public static String[] A05 = {"6Yd3MlxO6zs0On0JMF5Pwnois3aNTjpE", "MmQBoaYzrmdPmtEAYQ3R1Y6Mcsh6By7B", "7RUBoC8KCwVWfiCX9SWb", "GS41ND25W7ytYawGpGonJQP9IOOENLXr", "lL4oomLzy5vPLaNFQ0K", "J26", "emQAR3GMgLzBn72fJq6a", "GcSIxJRAUXsHB0u2DOmppTTbOqtsj228"};
    public static final BR A06;
    public static final int A07;
    public boolean A00;
    public final long A01;
    public final Uy A02;
    public final HV A03;

    public static String A00(int i, int i2, int i3) {
        byte[] copyOfRange = Arrays.copyOfRange(A04, i, i + i2);
        for (int i4 = 0; i4 < copyOfRange.length; i4++) {
            copyOfRange[i4] = (byte) ((copyOfRange[i4] ^ i3) ^ j.AppCompatTheme_windowNoTitle);
        }
        return new String(copyOfRange);
    }

    public static void A01() {
        A04 = new byte[]{27, 22, 97};
    }

    static {
        A01();
        A06 = new V0();
        A07 = C0430Hl.A08(A00(0, 3, 42));
    }

    public C0770Uz() {
        this(0L);
    }

    public C0770Uz(long j) {
        this.A01 = j;
        this.A02 = new Uy(true);
        this.A03 = new HV(200);
    }

    @Override // com.facebook.ads.redexgen.X.BO
    public final void A8G(BQ bq) {
        this.A02.A4V(bq, new C0301Ci(0, 1));
        bq.A5C();
        bq.AEE(new C0772Vb(-9223372036854775807L));
    }

    @Override // com.facebook.ads.redexgen.X.BO
    public final int ADQ(BP bp, BV bv) throws IOException, InterruptedException {
        int read = bp.read(this.A03.A00, 0, 200);
        if (read == -1) {
            return -1;
        }
        this.A03.A0Y(0);
        this.A03.A0X(read);
        if (!this.A00) {
            this.A02.ACy(this.A01, true);
            this.A00 = true;
        }
        this.A02.A48(this.A03);
        return 0;
    }

    @Override // com.facebook.ads.redexgen.X.BO
    public final void AED(long j, long j2) {
        this.A00 = false;
        this.A02.AEC();
    }

    @Override // com.facebook.ads.redexgen.X.BO
    public final boolean AEm(BP bp) throws IOException, InterruptedException {
        HV hv = new HV(10);
        HU hu = new HU(hv.A00);
        int startPosition = 0;
        while (true) {
            bp.AD0(hv.A00, 0, 10);
            hv.A0Y(0);
            if (hv.A0G() != A07) {
                break;
            }
            hv.A0Z(3);
            int A0D = hv.A0D();
            startPosition += A0D + 10;
            bp.A3K(A0D);
        }
        bp.AE3();
        bp.A3K(startPosition);
        int syncBytes = startPosition;
        int validFramesCount = 0;
        int headerPosition = A05[4].length();
        if (headerPosition == 20) {
            throw new RuntimeException();
        }
        A05[1] = "mY90xJHLqPMDpFXgmiZe2UkYD68ZyI7P";
        int i = 0;
        while (true) {
            bp.AD0(hv.A00, 0, 2);
            hv.A0Y(0);
            int headerPosition2 = 65526 & hv.A0I();
            if (headerPosition2 != 65520) {
                i = 0;
                validFramesCount = 0;
                bp.AE3();
                syncBytes++;
                int headerPosition3 = syncBytes - startPosition;
                if (headerPosition3 >= 8192) {
                    return false;
                }
                bp.A3K(syncBytes);
            } else {
                i++;
                if (i >= 4 && validFramesCount > 188) {
                    return true;
                }
                bp.AD0(hv.A00, 0, 4);
                hu.A07(14);
                int headerPosition4 = hu.A04(13);
                if (headerPosition4 <= 6) {
                    return false;
                }
                bp.A3K(headerPosition4 - 6);
                validFramesCount += headerPosition4;
            }
        }
    }
}
