package com.facebook.ads.redexgen.X;

import com.facebook.ads.RewardData;
import com.facebook.ads.internal.protocol.AdPlacementType;
import java.util.Arrays;
/* loaded from: assets/audience_network.dex */
public final class E8 extends AbstractC0848Yb {
    public static byte[] A00;
    public static String[] A01 = {"QPajxPBXawZguZvIACdyFqOYUKJhGG1P", "5fhxQ1wmDDZwcYW6vVZtBFGAbpCppeaF", "0C8PIOmzvjBgpmOh8JUWA", "4kKOVZ4CcWBKVljagfvAN2XyBryastSO", "Oy7EzKzQwTS7e9udIDBq4FtqglrDvqBF", "BZaaKRqUw", "6zOS7wuF6dlGz7u6SsHniaRnv53e8kon", "jwUp8OtoUlvjJY1bP74aKb8UsU7a0Ko9"};

    public static String A01(int i, int i2, int i3) {
        byte[] copyOfRange = Arrays.copyOfRange(A00, i, i + i2);
        int i4 = 0;
        while (true) {
            int length = copyOfRange.length;
            String[] strArr = A01;
            if (strArr[7].charAt(30) != strArr[6].charAt(30)) {
                throw new RuntimeException();
            }
            String[] strArr2 = A01;
            strArr2[1] = "Dg0tZg7IxBj4D2AEunqK4FRxjbaI0pzK";
            strArr2[4] = "5sVR5Q40j80Tm4EH72ZLdFDAQDj0jOHn";
            if (i4 >= length) {
                return new String(copyOfRange);
            }
            copyOfRange[i4] = (byte) ((copyOfRange[i4] - i3) - 112);
            i4++;
        }
    }

    public static void A02() {
        A00 = new byte[]{-11, -13, 0, -78, 1, 0, -2, 11, -78, 5, -9, 6, -78, 1, 0, -78, 4, -9, 9, -13, 4, -10, -9, -10, -78, 8, -5, -10, -9, 1, -78, -13, -10, 5, -15, -14, -93, -28, -25, -28, -13, -9, -24, -11, -93, -11, -24, -28, -25, -4, -93, -9, -14, -93, -10, -24, -9, -93, -11, -24, -6, -28, -11, -25, -93, -14, -15};
    }

    static {
        A02();
    }

    public E8(C0806Wj c0806Wj, C00481p c00481p) {
        super(c0806Wj, c00481p);
    }

    private AnonymousClass14 A00(Runnable runnable) {
        return new YT(this, runnable);
    }

    @Override // com.facebook.ads.redexgen.X.AbstractC0848Yb
    public final void A0J() {
        AbstractC0872Yz abstractC0872Yz = (AbstractC0872Yz) this.A01;
        abstractC0872Yz.A00(this.A07.A00);
        abstractC0872Yz.A01(this.A07.A01);
        abstractC0872Yz.A0F();
    }

    @Override // com.facebook.ads.redexgen.X.AbstractC0848Yb
    public final void A0L(InterfaceC00200n interfaceC00200n, AnonymousClass83 anonymousClass83, AnonymousClass81 anonymousClass81, C00491q c00491q) {
        C0344Eb c0344Eb = (C0344Eb) interfaceC00200n;
        YU yu = new YU(this, c00491q, c0344Eb);
        if (ID.A1p(this.A0B)) {
            A0C().postDelayed(yu, anonymousClass83.A05().A05());
        }
        C0806Wj c0806Wj = this.A0B;
        AnonymousClass14 A002 = A00(yu);
        boolean z = this.A07.A06;
        String str = this.A07.A04;
        C00481p c00481p = this.A07;
        String[] strArr = A01;
        if (strArr[3].charAt(31) == strArr[0].charAt(31)) {
            throw new RuntimeException();
        }
        String[] strArr2 = A01;
        strArr2[3] = "qv162d7nxdmOCgZ5HSNnY6lM4lD0tO4m";
        strArr2[0] = "JwvltbAvbK0MQjlZGmmyrgC4vpl52SAH";
        c0344Eb.A0G(c0806Wj, A002, c00491q, z, str, c00481p.A05);
    }

    public final AnonymousClass18 A0T() {
        return ((AbstractC0872Yz) this.A01).A0E();
    }

    public final void A0U(RewardData rewardData) {
        if (this.A01 != null) {
            if (this.A01.A79() == AdPlacementType.REWARDED_VIDEO) {
                AbstractC0872Yz rewardedVideoAdapter = (AbstractC0872Yz) this.A01;
                rewardedVideoAdapter.A02(rewardData);
                return;
            }
            throw new IllegalStateException(A01(0, 34, 34));
        }
        throw new IllegalStateException(A01(34, 33, 19));
    }
}
