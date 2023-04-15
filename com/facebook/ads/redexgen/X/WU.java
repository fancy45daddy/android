package com.facebook.ads.redexgen.X;

import a.a.j;
import com.facebook.ads.AudienceNetworkAds;
import java.util.Arrays;
/* loaded from: assets/audience_network.dex */
public class WU extends AbstractRunnableC0487Ju {
    public static byte[] A02;
    public final /* synthetic */ AudienceNetworkAds.InitListener A00;
    public final /* synthetic */ AudienceNetworkAds.InitResult A01;

    static {
        A02();
    }

    public static String A00(int i, int i2, int i3) {
        byte[] copyOfRange = Arrays.copyOfRange(A02, i, i + i2);
        for (int i4 = 0; i4 < copyOfRange.length; i4++) {
            copyOfRange[i4] = (byte) ((copyOfRange[i4] ^ i3) ^ 70);
        }
        return new String(copyOfRange);
    }

    public static void A02() {
        A02 = new byte[]{113, 102, 105, 2, 75, 76, 75, 86, 75, 67, 78, 75, 88, 67, 86, 75, 77, 76, 2, 65, 77, 79, 82, 78, 71, 86, 71, 105, 108, 52, 104, 62, 60, 60, 69, 66, 89, 100, 86, 81, 82};
    }

    public WU(AudienceNetworkAds.InitListener initListener, AudienceNetworkAds.InitResult initResult) {
        this.A00 = initListener;
        this.A01 = initResult;
    }

    @Override // com.facebook.ads.redexgen.X.AbstractRunnableC0487Ju
    public final void A06() {
        JH.A05(A00(34, 7, j.AppCompatTheme_windowActionModeOverlay), A00(0, 27, 100), A00(27, 7, 75));
        this.A00.onInitialized(this.A01);
    }
}
