package com.facebook.ads.redexgen.X;

import android.util.Log;
import androidx.annotation.Nullable;
import java.io.IOException;
import java.net.HttpURLConnection;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
/* loaded from: assets/audience_network.dex */
public final class GW implements InterfaceC0632Pn {
    public static byte[] A04;
    public int A00;
    @Nullable
    public String A01;
    @Nullable
    public Map<String, List<String>> A02;
    @Nullable
    public byte[] A03;

    static {
        A01();
    }

    public static String A00(int i, int i2, int i3) {
        byte[] copyOfRange = Arrays.copyOfRange(A04, i, i + i2);
        for (int i4 = 0; i4 < copyOfRange.length; i4++) {
            copyOfRange[i4] = (byte) ((copyOfRange[i4] - i3) - 65);
        }
        return new String(copyOfRange);
    }

    public static void A01() {
        A04 = new byte[]{-79, -56, -41, -38, -46, -43, -50, -125, -56, -43, -43, -46, -43};
    }

    public GW(HttpURLConnection httpURLConnection, @Nullable byte[] bArr) {
        try {
            this.A00 = httpURLConnection.getResponseCode();
            this.A01 = httpURLConnection.getURL().toString();
        } catch (IOException e) {
            Log.e(getClass().getSimpleName(), A00(0, 13, 34), e);
        }
        this.A02 = httpURLConnection.getHeaderFields();
        this.A03 = bArr;
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC0632Pn
    @Nullable
    public final byte[] A5m() {
        return this.A03;
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC0632Pn
    @Nullable
    public final String A5n() {
        byte[] bArr = this.A03;
        if (bArr != null) {
            return new String(bArr);
        }
        return null;
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC0632Pn
    @Nullable
    public final Map<String, List<String>> A6i() {
        return this.A02;
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC0632Pn
    public final int A7Y() {
        return this.A00;
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC0632Pn
    @Nullable
    public final String getUrl() {
        return this.A01;
    }
}
