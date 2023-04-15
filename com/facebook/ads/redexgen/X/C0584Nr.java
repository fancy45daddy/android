package com.facebook.ads.redexgen.X;

import a.a.j;
import android.webkit.ConsoleMessage;
import android.webkit.WebChromeClient;
import java.util.Arrays;
import org.json.JSONException;
import org.json.JSONObject;
/* renamed from: com.facebook.ads.redexgen.X.Nr  reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public class C0584Nr extends WebChromeClient {
    public static byte[] A01;
    public final /* synthetic */ C0589Nw A00;

    static {
        A01();
    }

    public static String A00(int i, int i2, int i3) {
        byte[] copyOfRange = Arrays.copyOfRange(A01, i, i + i2);
        for (int i4 = 0; i4 < copyOfRange.length; i4++) {
            copyOfRange[i4] = (byte) ((copyOfRange[i4] - i3) - 107);
        }
        return new String(copyOfRange);
    }

    public static void A01() {
        A01 = new byte[]{-41, -44, -39, -48, -71, -32, -40, -51, -48, -35, 83, 75, 89, 89, 71, 77, 75, 68, 64, 70, 67, 52, 54, 26, 53};
    }

    public C0584Nr(C0589Nw c0589Nw) {
        this.A00 = c0589Nw;
    }

    @Override // android.webkit.WebChromeClient
    public final boolean onConsoleMessage(ConsoleMessage consoleMessage) {
        C0444Ib c0444Ib;
        C0577Nj c0577Nj;
        C0806Wj c0806Wj;
        if (consoleMessage.messageLevel() == ConsoleMessage.MessageLevel.ERROR) {
            JSONObject jSONObject = new JSONObject();
            try {
                jSONObject.put(A00(10, 7, 123), consoleMessage.message());
                jSONObject.put(A00(0, 10, 0), consoleMessage.lineNumber());
                jSONObject.put(A00(17, 8, j.AppCompatTheme_textAppearanceSearchResultTitle), consoleMessage.sourceId());
            } catch (JSONException unused) {
            }
            String jSONObject2 = jSONObject.toString();
            c0444Ib = this.A00.A0D;
            c0444Ib.A02(EnumC0443Ia.A0N, null);
            c0577Nj = this.A00.A0E;
            c0577Nj.A04(C01877l.A14, jSONObject2);
            c0806Wj = this.A00.A0B;
            c0806Wj.A0D().A4y(jSONObject2);
        }
        return super.onConsoleMessage(consoleMessage);
    }
}
