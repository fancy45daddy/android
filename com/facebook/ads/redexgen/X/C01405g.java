package com.facebook.ads.redexgen.X;

import android.os.Handler;
import android.os.Looper;
import java.util.Arrays;
import org.json.JSONObject;
/* renamed from: com.facebook.ads.redexgen.X.5g  reason: invalid class name and case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public final class C01405g {
    public static byte[] A07;
    public static String[] A08 = {"QC6ROF3GbFPL6U2BchtfuOIlWA", "mAXyphBg0ZoA2", "nmk1i7vNQUMlLTVPnMJLcVhB6M", "xf2dPS9SncVtV17kxTxgHOfrSuJpis3", "Y24xgR3", "pU5dMF2zEzzc2yzou8JPWDE5BQxzeO1x", "dnQEZ1usH0f6s5VsA3sVBX2XHmBfQenJ", "5qnsTvKOcggfe9NlhRnI8aAzom1PIzJ"};
    public final Handler A00;
    public final InterfaceC01395f A01;
    public final C6G A02;
    public final String A03;
    public final String A04;
    public final JSONObject A05;
    public final boolean A06;

    public static String A03(int i, int i2, int i3) {
        byte[] copyOfRange = Arrays.copyOfRange(A07, i, i + i2);
        for (int i4 = 0; i4 < copyOfRange.length; i4++) {
            copyOfRange[i4] = (byte) ((copyOfRange[i4] ^ i3) ^ 52);
        }
        return new String(copyOfRange);
    }

    public static void A07() {
        A07 = new byte[]{72, 90, 90, 76, 93, 90, 78, 65, 68, 77, 105, 109, 97, 103, 101, 0, 31, 18, 19, 25};
    }

    static {
        A07();
    }

    public C01405g(C6G c6g, JSONObject jSONObject, String str, String str2, boolean z, InterfaceC01395f interfaceC01395f) {
        this.A02 = c6g;
        this.A05 = jSONObject;
        this.A03 = str;
        this.A04 = str2;
        this.A06 = z && A0A(this.A05);
        this.A01 = interfaceC01395f;
        this.A00 = new Handler(Looper.getMainLooper());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void A09(boolean z, C01385e c01385e) {
        String A03 = A03(6, 4, 28);
        String A032 = A03(15, 5, 66);
        String A033 = A03(10, 5, 52);
        if (z) {
            boolean equals = A033.equals(c01385e.A02);
            if (A08[6].charAt(22) == 'q') {
                throw new RuntimeException();
            }
            String[] strArr = A08;
            strArr[3] = "Ngd5gA2SMQ4Pqx2mjoy1oHjbJUKCicI";
            strArr[7] = "LorLYeRbgteEMpgZiQ82pTGbH7n24yI";
            if (equals) {
                this.A02.A0c(new C6E(c01385e.A03, -1, -1, this.A04, this.A03));
            } else if (A032.equals(c01385e.A02)) {
                this.A02.A0Z(new C6C(c01385e.A03, this.A04, this.A03));
            } else if (!A03.equals(c01385e.A02)) {
            } else {
                this.A02.A0Y(new C6C(c01385e.A03, this.A04, this.A03));
            }
        } else if (A033.equals(c01385e.A02)) {
            this.A02.A0b(new C6E(c01385e.A03, -1, -1, this.A04, this.A03));
        } else if (A032.equals(c01385e.A02)) {
            this.A02.A0a(new C6C(c01385e.A03, this.A04, this.A03));
        } else if (!A03.equals(c01385e.A02)) {
        } else {
            this.A02.A0X(new C6C(c01385e.A03, this.A04, this.A03));
        }
    }

    public static boolean A0A(JSONObject jSONObject) {
        return jSONObject != null && jSONObject.has(A03(0, 6, 29));
    }

    public final void A0B() {
        if (!this.A06) {
            this.A01.A9w();
        }
        LJ.A06.execute(new X0(this));
    }
}
