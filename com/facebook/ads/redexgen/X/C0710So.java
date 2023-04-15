package com.facebook.ads.redexgen.X;

import a.a.j;
import android.content.pm.PackageManager;
import android.util.Base64;
import com.facebook.ads.internal.protocol.AdErrorType;
import java.util.Arrays;
import java.util.Map;
/* renamed from: com.facebook.ads.redexgen.X.So  reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public class C0710So extends AbstractRunnableC0487Ju {
    public static byte[] A02;
    public static String[] A03 = {"jAsZfZwQ15YE1xm95Uum6vWOaDH1Az8A", "fi77qJmjg5Rwb", "EORDPJJatEjTyV", "9q4WoxWSHvvys", "ZnqFv4LDFQ916SUcrxzb43hFVVFJOLFp", "nu1Fhr1q5Uq1RKDrD4GP42DLl0Uj", "wJhiR1cxoop1phUk5wYOXEGX7ooerIC3", "cvoiCCK"};
    public final /* synthetic */ JT A00;
    public final /* synthetic */ JW A01;

    public static String A00(int i, int i2, int i3) {
        byte[] copyOfRange = Arrays.copyOfRange(A02, i, i + i2);
        for (int i4 = 0; i4 < copyOfRange.length; i4++) {
            copyOfRange[i4] = (byte) ((copyOfRange[i4] ^ i3) ^ j.AppCompatTheme_windowMinWidthMinor);
        }
        return new String(copyOfRange);
    }

    public static void A02() {
        A02 = new byte[]{10, 75, 89, 68, 71, 72, 72, 67, 84, 89, 77, 67, 95, 101, 68, 11, 69, 78, 95, 92, 68, 89, 64, 11, 72, 68, 69, 69, 78, 72, 95, 66, 68, 69};
    }

    static {
        A02();
    }

    public C0710So(JW jw, JT jt) {
        this.A01 = jw;
        this.A00 = jt;
    }

    @Override // com.facebook.ads.redexgen.X.AbstractRunnableC0487Ju
    public final void A06() {
        C0806Wj c0806Wj;
        C0806Wj c0806Wj2;
        C0806Wj c0806Wj3;
        C0806Wj c0806Wj4;
        C0806Wj c0806Wj5;
        long j;
        C0806Wj c0806Wj6;
        String str;
        Map<String, String> adRequestParameters;
        InterfaceC0634Pp A032;
        C0806Wj c0806Wj7;
        C0806Wj c0806Wj8;
        C0806Wj c0806Wj9;
        C0806Wj c0806Wj10;
        long j2;
        c0806Wj = this.A01.A04;
        if (L3.A00(c0806Wj) != L2.A07) {
            c0806Wj2 = this.A01.A04;
            C01967u.A08(c0806Wj2);
            c0806Wj3 = this.A01.A04;
            C01525s.A07(c0806Wj3);
            JT jt = this.A00;
            C8G A00 = C8G.A00();
            c0806Wj4 = this.A01.A04;
            boolean z = true;
            Map<String, String> A08 = jt.A08(A00.A01(c0806Wj4, true).A6U());
            this.A01.A02 = A08;
            try {
                c0806Wj7 = this.A01.A04;
                PackageManager packageManager = c0806Wj7.getPackageManager();
                if (packageManager != null) {
                    String A002 = A00(1, 12, j.AppCompatTheme_windowActionModeOverlay);
                    StringBuilder sb = new StringBuilder();
                    c0806Wj8 = this.A01.A04;
                    sb.append(c0806Wj8.getPackageName());
                    sb.append(A00(0, 1, 93));
                    c0806Wj9 = this.A01.A04;
                    sb.append(packageManager.getInstallerPackageName(c0806Wj9.getPackageName()));
                    A08.put(A002, new String(Base64.encode(sb.toString().getBytes(), 2)));
                }
            } catch (Exception unused) {
            }
            try {
                if (this.A00.A05() != J8.A03 && this.A00.A05() != J8.A05 && this.A00.A05() != J8.A04 && this.A00.A05() != null) {
                    z = false;
                }
                c0806Wj6 = this.A01.A04;
                InterfaceC0633Po A022 = Q6.A02(z, c0806Wj6);
                str = this.A01.A06;
                Q2 q2 = new Q2();
                adRequestParameters = this.A01.A02;
                byte[] A082 = q2.A05(adRequestParameters).A08();
                A032 = this.A01.A03(L5.A00(), this.A00);
                A022.AD5(str, A082, A032);
                return;
            } catch (Exception e) {
                AdErrorType adRequestFailed = AdErrorType.AD_REQUEST_FAILED;
                String message = e.getMessage();
                c0806Wj5 = this.A01.A04;
                C0R A0D = c0806Wj5.A0D();
                if (A03[5].length() == 14) {
                    throw new RuntimeException();
                }
                String[] strArr = A03;
                strArr[3] = "KP51TgwZ8p9oo";
                strArr[2] = "i0Q8y5VFLDaPT7";
                j = this.A01.A00;
                A0D.A2j(L5.A01(j), adRequestFailed.getErrorCode(), message, adRequestFailed.isPublicError());
                this.A01.A0D(J3.A01(adRequestFailed, message));
                return;
            }
        }
        this.A01.A09();
        AdErrorType adErrorType = AdErrorType.NETWORK_ERROR;
        String errorMessage = A00(13, 21, 92);
        c0806Wj10 = this.A01.A04;
        C0R A0D2 = c0806Wj10.A0D();
        j2 = this.A01.A00;
        A0D2.A2j(L5.A01(j2), adErrorType.getErrorCode(), errorMessage, adErrorType.isPublicError());
        this.A01.A0D(new J3(adErrorType, errorMessage));
    }
}
