package com.facebook.ads.redexgen.X;

import android.os.Handler;
import java.util.Arrays;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
/* loaded from: assets/audience_network.dex */
public class X0 extends AbstractRunnableC0487Ju {
    public static byte[] A01;
    public final /* synthetic */ C01405g A00;

    static {
        A02();
    }

    public static String A00(int i, int i2, int i3) {
        byte[] copyOfRange = Arrays.copyOfRange(A01, i, i + i2);
        for (int i4 = 0; i4 < copyOfRange.length; i4++) {
            copyOfRange[i4] = (byte) ((copyOfRange[i4] ^ i3) ^ 18);
        }
        return new String(copyOfRange);
    }

    public static void A02() {
        A01 = new byte[]{62, 44, 44, 58, 43, 44};
    }

    public X0(C01405g c01405g) {
        this.A00 = c01405g;
    }

    @Override // com.facebook.ads.redexgen.X.AbstractRunnableC0487Ju
    public final void A06() {
        Handler handler;
        JSONObject jSONObject;
        C6G c6g;
        String str;
        String str2;
        try {
            jSONObject = this.A00.A05;
            JSONArray jSONArray = jSONObject.getJSONArray(A00(0, 6, 77));
            for (int i = 0; i < jSONArray.length(); i++) {
                C01385e assetData = C01385e.A00(jSONArray.getJSONObject(i));
                this.A00.A09(assetData.A04, assetData);
            }
            c6g = this.A00.A02;
            X2 x2 = new X2(this);
            str = this.A00.A04;
            str2 = this.A00.A03;
            c6g.A0W(x2, new AnonymousClass69(str, str2));
        } catch (JSONException unused) {
            handler = this.A00.A00;
            handler.post(new X1(this));
        }
    }
}
