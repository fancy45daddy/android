package com.facebook.ads.redexgen.X;

import android.net.Uri;
import androidx.annotation.Nullable;
import com.facebook.ads.internal.exoplayer2.offline.DownloadAction;
import java.io.DataOutputStream;
import java.io.IOException;
import java.util.Arrays;
/* loaded from: assets/audience_network.dex */
public final class UQ extends DownloadAction {
    public static byte[] A01;
    public static String[] A02 = {"zIk8lFjKPo5VqXBeAWetc3TePOqewtK4", "Krv9CUV84BxP4tXlBDsVq5ZfguHkkPOw", "qZweMgdQpTvQjM16IN332AToX", "5wIly2IGyFbenCO8uByiE", "WVTy90LHtMArJ1Mx15Navn95RKOGxxfC", "YMittl3f14YbQo67yPLY6h3Kxcx5v1", "fVvKsKq8KPyH9", "YcDFZjjwvX0vuueDfq7B81mncQMZao1W"};
    public static final DownloadAction.Deserializer A03;
    @Nullable
    public final String A00;

    public static String A05(int i, int i2, int i3) {
        byte[] copyOfRange = Arrays.copyOfRange(A01, i, i + i2);
        for (int i4 = 0; i4 < copyOfRange.length; i4++) {
            copyOfRange[i4] = (byte) ((copyOfRange[i4] ^ i3) ^ 55);
        }
        return new String(copyOfRange);
    }

    public static void A06() {
        A01 = new byte[]{3, 1, 28, 20, 1, 22, 0, 0, 26, 5, 22};
    }

    static {
        A06();
        A03 = new UR(A05(0, 11, 68), 0);
    }

    public UQ(Uri uri, boolean z, @Nullable byte[] bArr, @Nullable String str) {
        super(A05(0, 11, 68), 0, uri, z, bArr);
        this.A00 = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Override // com.facebook.ads.internal.exoplayer2.offline.DownloadAction
    /* renamed from: A02 */
    public final UP A07(C0336Dr c0336Dr) {
        return new UP(this.A01, this.A00, c0336Dr);
    }

    private String A04() {
        String str = this.A00;
        return str != null ? str : C0415Gw.A01(this.A01);
    }

    @Override // com.facebook.ads.internal.exoplayer2.offline.DownloadAction
    public final void A08(DataOutputStream dataOutputStream) throws IOException {
        dataOutputStream.writeUTF(this.A01.toString());
        dataOutputStream.writeBoolean(this.A03);
        dataOutputStream.writeInt(this.A04.length);
        dataOutputStream.write(this.A04);
        boolean customCacheKeySet = this.A00 != null;
        dataOutputStream.writeBoolean(customCacheKeySet);
        if (customCacheKeySet) {
            dataOutputStream.writeUTF(this.A00);
        }
    }

    @Override // com.facebook.ads.internal.exoplayer2.offline.DownloadAction
    public final boolean A09(DownloadAction downloadAction) {
        return (downloadAction instanceof UQ) && A04().equals(((UQ) downloadAction).A04());
    }

    @Override // com.facebook.ads.internal.exoplayer2.offline.DownloadAction
    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        boolean equals = super.equals(obj);
        String[] strArr = A02;
        if (strArr[0].charAt(3) != strArr[1].charAt(3)) {
            A02[3] = "S1dYnav0YyHlHBWJfncCN";
            if (!equals) {
                return false;
            }
            return C0430Hl.A0g(this.A00, ((UQ) obj).A00);
        }
        throw new RuntimeException();
    }

    @Override // com.facebook.ads.internal.exoplayer2.offline.DownloadAction
    public final int hashCode() {
        int result = super.hashCode();
        int i = result * 31;
        String str = this.A00;
        int result2 = str != null ? str.hashCode() : 0;
        int i2 = i + result2;
        String[] strArr = A02;
        String str2 = strArr[6];
        String str3 = strArr[2];
        int length = str2.length();
        int result3 = str3.length();
        if (length != result3) {
            A02[4] = "5idVnwwxM2TXqOP7ezpSPuxFrlenP4PE";
            return i2;
        }
        throw new RuntimeException();
    }
}
