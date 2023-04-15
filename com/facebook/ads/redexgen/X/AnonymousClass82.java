package com.facebook.ads.redexgen.X;

import android.os.Handler;
import android.os.Looper;
import java.util.Arrays;
import org.json.JSONObject;
/* renamed from: com.facebook.ads.redexgen.X.82  reason: invalid class name */
/* loaded from: assets/audience_network.dex */
public class AnonymousClass82 extends AbstractC0532Lp {
    public static byte[] A01;
    public final /* synthetic */ C0582No A00;

    static {
        A01();
    }

    public static String A00(int i, int i2, int i3) {
        byte[] copyOfRange = Arrays.copyOfRange(A01, i, i + i2);
        for (int i4 = 0; i4 < copyOfRange.length; i4++) {
            copyOfRange[i4] = (byte) ((copyOfRange[i4] - i3) - 17);
        }
        return new String(copyOfRange);
    }

    public static void A01() {
        A01 = new byte[]{-78, -65, -65, -68, -65};
    }

    public AnonymousClass82(C0582No c0582No) {
        this.A00 = c0582No;
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Override // com.facebook.ads.redexgen.X.C8O
    /* renamed from: A02 */
    public final void A03(C0533Lq c0533Lq) {
        InterfaceC0581Nn interfaceC0581Nn;
        JSONObject A03;
        new Handler(Looper.getMainLooper()).post(new RunnableC0580Nm(this));
        interfaceC0581Nn = this.A00.A0B;
        A03 = this.A00.A03();
        interfaceC0581Nn.ACd(A00(0, 5, 60), A03);
    }
}
