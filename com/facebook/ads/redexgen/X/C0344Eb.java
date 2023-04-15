package com.facebook.ads.redexgen.X;

import a.a.j;
import android.content.ContentResolver;
import android.content.Intent;
import android.provider.Settings;
import android.text.TextUtils;
import androidx.annotation.Nullable;
import com.facebook.ads.AdError;
import com.facebook.ads.internal.util.activity.ActivityUtils;
import com.facebook.ads.internal.util.activity.AdActivityIntent;
import com.facebook.proguard.annotations.DoNotStrip;
import java.util.Arrays;
import java.util.UUID;
import java.util.concurrent.atomic.AtomicBoolean;
/* renamed from: com.facebook.ads.redexgen.X.Eb  reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public final class C0344Eb extends AbstractC0872Yz {
    public static byte[] A0D;
    public static String[] A0E = {"YJVWhBFSVFKs7NrWmWULGh", "0GvTyPfIpVaCupDTXIuhVv", "vKmpQ0k2zgunQxdAFsx7Wlk6dmYtSCUc", "dqRYVPDeGy45RCRFCWIUPRHRtp9NBigI", "NSweCua6lZ8ChPFZ3cKnaOBscLcsrWLc", "HenZyTRrHhMHTWT00jKprDJGPW9d4C4V", "lvvcgtkpn6JHhS0LrJ19j3FN0lJsZZOv", "GmBDkEWrzwPugE8SLtTHysECIxUFQGpg"};
    public long A00;
    public AnonymousClass14 A01;
    public AnonymousClass15 A02;
    public AnonymousClass18 A03;
    public C0806Wj A04;
    public C0444Ib A05;
    public EnumC0471Jc A06;
    @Nullable
    @DoNotStrip
    public C0589Nw A07;
    public String A08;
    @Nullable
    public String A09;
    public String A0A;
    public final String A0B = UUID.randomUUID().toString();
    public final AtomicBoolean A0C = new AtomicBoolean();

    public static String A04(int i, int i2, int i3) {
        byte[] copyOfRange = Arrays.copyOfRange(A0D, i, i + i2);
        for (int i4 = 0; i4 < copyOfRange.length; i4++) {
            copyOfRange[i4] = (byte) ((copyOfRange[i4] ^ i3) ^ 126);
        }
        return new String(copyOfRange);
    }

    public static void A08() {
        A0D = new byte[]{56, 52, 54, 54, 48, 57, 48, 39, 58, 56, 48, 33, 48, 39, 10, 39, 58, 33, 52, 33, 60, 58, 59, 108, 99, 82, 108, 110, 121, 100, 123, 100, 121, 116, 9, 6, 3, 15, 4, 30, 62, 5, 1, 15, 4, 68, 76, 77, 64, 72, 93, 64, 70, 71, 109, 72, 93, 72, 12, 16, 29, 31, 25, 17, 25, 18, 8, 53, 24, 87, 85, 66, 67, 66, 65, 78, 73, 66, 67, 104, 85, 78, 66, 73, 83, 70, 83, 78, 72, 73, 108, 66, 94, 4, 19, 7, 3, 19, 5, 2, 34, 31, 27, 19, 104, Byte.MAX_VALUE, 109, 123, 104, 126, 73, Byte.MAX_VALUE, 104, 108, Byte.MAX_VALUE, 104, 79, 72, 86, 25, 14, 28, 10, 25, 15, 14, 15, 61, 2, 15, 14, 4, 42, 15, 47, 10, 31, 10, 41, 30, 5, 15, 7, 14, 87, 64, 82, 68, 87, 65, 64, 65, 122, 83, 76, 65, 64, 74, 124, 103, 96, 120, 124, 108, 64, 109, 83, 76, 64, 82, 113, 92, 85, 64};
    }

    static {
        A08();
    }

    private void A06() {
        C2T A00 = C2T.A00(this.A04);
        AnonymousClass15 anonymousClass15 = this.A02;
        A00.A06(anonymousClass15, anonymousClass15.A00());
    }

    private void A07() {
        if (this.A02 != null) {
            try {
                C2T.A00(this.A04).A05(this.A02);
            } catch (Exception unused) {
            }
        }
    }

    private void A09(Intent intent) {
        int i = super.A00;
        String A04 = A04(69, 24, 89);
        if (i != -1) {
            ContentResolver contentResolver = this.A04.getContentResolver();
            if (A0E[3].charAt(29) != 'i') {
                throw new RuntimeException();
            }
            String[] strArr = A0E;
            strArr[7] = "ryaiaZaF8EzuUPZd67FeoIG9jUALGHZG";
            strArr[6] = "XITZtpYy2wf6QHmOozCOnY6Xlkm3ca51";
            if (Settings.System.getInt(contentResolver, A04(1, 22, 43), 0) != 1) {
                int i2 = super.A00;
                if (A0E[2].charAt(2) != 'm') {
                    throw new RuntimeException();
                }
                String[] strArr2 = A0E;
                strArr2[1] = "mo2n49jFbf8CHvb7nubztA";
                strArr2[0] = "3h0LYrxRFByrgEG7Z48zJG";
                intent.putExtra(A04, i2);
                return;
            }
        }
        if (!ID.A0f(this.A04)) {
            intent.putExtra(A04, 6);
        }
    }

    private void A0A(boolean z) {
        if (this.A06 == EnumC0471Jc.A0C) {
            A0C(z);
            return;
        }
        EnumC0471Jc enumC0471Jc = this.A06;
        String[] strArr = A0E;
        if (strArr[1].length() != strArr[0].length()) {
            throw new RuntimeException();
        }
        String[] strArr2 = A0E;
        strArr2[4] = "1yOiFacRiwJanRzqDJ6A5hJ77lYfziAe";
        strArr2[5] = "McEelBumOV7dKb1zb6BdvUT5HG6VvrgI";
        if (enumC0471Jc == EnumC0471Jc.A0B) {
            A0B(z);
        } else {
            A0C(z);
        }
    }

    private void A0B(boolean z) {
        C6G c6g = new C6G(this.A04);
        boolean z2 = ID.A1W(this.A04) && C01405g.A0A(this.A03.A0d());
        if (z2) {
            C01405g unifiedAssetsLoader = new C01405g(c6g, this.A03.A0d(), this.A03.A0Y(), this.A03.A0Z(), z2, new Z5(this));
            c6g.A0d(new C0444Ib(this.A03.A0U(), this.A04.A08()));
            unifiedAssetsLoader.A0B();
            return;
        }
        C00461n.A02(this.A04, this.A03, z, new Z4(this));
    }

    private void A0C(boolean isDSL) {
        C6G c6g = new C6G(this.A04);
        c6g.A0d(this.A05);
        boolean z = ID.A1W(this.A04) && C01405g.A0A(this.A03.A0d());
        boolean A0r = this.A03.A0r();
        if (z) {
            new C01405g(c6g, this.A03.A0d(), this.A03.A0Y(), this.A03.A0Z(), z, new Z7(this, A0r)).A0B();
            return;
        }
        C0861Yo c0861Yo = (C0861Yo) this.A03;
        if (TextUtils.isEmpty(c0861Yo.A0O().A0D().A08())) {
            this.A01.AC9(this, AdError.INTERNAL_ERROR);
            return;
        }
        C00471o.A02(this.A04, c6g, c0861Yo);
        c6g.A0W(new C0345Ec(this, isDSL, A0r, c0861Yo, this), new AnonymousClass69(c0861Yo.A0Z(), A04(144, 14, 91)));
    }

    @Override // com.facebook.ads.redexgen.X.AbstractC0872Yz
    public final int A0D() {
        AnonymousClass18 anonymousClass18 = this.A03;
        if (anonymousClass18 == null) {
            String[] strArr = A0E;
            if (strArr[4].charAt(5) != strArr[5].charAt(5)) {
                A0E[3] = "zy8kAWNFspHhc9OUOOhBHMIK4AaCMilm";
                return -1;
            }
            throw new RuntimeException();
        }
        return anonymousClass18.A0K();
    }

    @Override // com.facebook.ads.redexgen.X.AbstractC0872Yz
    public final AnonymousClass18 A0E() {
        return this.A03;
    }

    @Override // com.facebook.ads.redexgen.X.AbstractC0872Yz
    public final boolean A0F() {
        if (!this.A0C.get()) {
            return false;
        }
        this.A03.A0f(super.A01);
        String A03 = C0596Od.A03(super.A02, this.A0B, this.A08);
        this.A03.A0g(super.A02);
        this.A03.A0k(A03);
        AdActivityIntent A04 = K9.A04(this.A04);
        EnumC0471Jc enumC0471Jc = this.A06;
        String rewardUrl = A04(166, 8, 91);
        A04.putExtra(rewardUrl, enumC0471Jc);
        AnonymousClass18 anonymousClass18 = this.A03;
        String rewardUrl2 = A04(j.AppCompatTheme_windowMinWidthMinor, 25, 21);
        A04.putExtra(rewardUrl2, anonymousClass18);
        String str = this.A0B;
        String rewardUrl3 = A04(158, 8, j.AppCompatTheme_windowMinWidthMinor);
        A04.putExtra(rewardUrl3, str);
        if (A03 != null) {
            String rewardUrl4 = A04(j.AppCompatTheme_textColorAlertDialogListItem, 15, 100);
            A04.putExtra(rewardUrl4, A03);
        }
        String str2 = this.A0A;
        String rewardUrl5 = A04(58, 11, 2);
        A04.putExtra(rewardUrl5, str2);
        long j = this.A00;
        String rewardUrl6 = A04(93, 11, 8);
        A04.putExtra(rewardUrl6, j);
        String str3 = this.A09;
        if (str3 != null) {
            String rewardUrl7 = A04(45, 13, 87);
            A04.putExtra(rewardUrl7, str3);
        }
        A09(A04);
        A04.setFlags(A04.getFlags() | 268435456);
        String A0U = this.A03.A0U();
        String rewardUrl8 = A04(34, 11, 20);
        A04.putExtra(rewardUrl8, A0U);
        ActivityUtils.A03(this.A04);
        try {
            K9.A09(this.A04, A04);
        } catch (K7 e) {
            Throwable cause = e.getCause();
            Throwable th = e;
            if (cause != null) {
                th = e.getCause();
            }
            InterfaceC01867k A06 = this.A04.A06();
            int i = C01877l.A01;
            C01887m c01887m = new C01887m(th);
            String rewardUrl9 = A04(23, 11, j.AppCompatTheme_windowFixedHeightMinor);
            A06.A8u(rewardUrl9, i, c01887m);
        }
        String[] strArr = A0E;
        String str4 = strArr[1];
        String rewardUrl10 = strArr[0];
        if (str4.length() != rewardUrl10.length()) {
            throw new RuntimeException();
        }
        String[] strArr2 = A0E;
        strArr2[1] = "L0ou65zbaEHIK9W1EiRqjH";
        strArr2[0] = "MlzKsAmmQguOmiSj0COpPP";
        return true;
    }

    public final void A0G(C0806Wj c0806Wj, AnonymousClass14 anonymousClass14, C00491q c00491q, boolean z, @Nullable String str, @Nullable String str2) {
        this.A0C.set(false);
        this.A04 = c0806Wj;
        this.A01 = anonymousClass14;
        this.A0A = c00491q.A02();
        this.A00 = c00491q.A00();
        this.A09 = str2;
        String str3 = this.A0A;
        this.A08 = str3 != null ? str3.split(A04(0, 1, 25))[0] : A04(0, 0, 20);
        this.A03 = C0861Yo.A01(c00491q.A03(), this.A04);
        this.A03.A0i(str);
        this.A03.A0e(c00491q.A01().A06());
        this.A05 = new C0444Ib(this.A03.A0U(), c0806Wj.A08());
        if (this.A03.A0r()) {
            this.A06 = EnumC0471Jc.A05;
            if (this.A03.A0o()) {
                C0R A0D2 = this.A04.A0D();
                EnumC00100c enumC00100c = EnumC00100c.A04;
                String[] strArr = A0E;
                if (strArr[7].charAt(31) != strArr[6].charAt(31)) {
                    String[] strArr2 = A0E;
                    strArr2[7] = "T6UzDEu82kzY1KsvV3iHB7OkWnIxnMBs";
                    strArr2[6] = "PWXGgNcAlDXPEXP1mMx0dPQCA8p68UI5";
                    A0D2.AEb(enumC00100c);
                }
                throw new RuntimeException();
            }
            this.A04.A0D().AEb(EnumC00100c.A06);
            this.A02 = new AnonymousClass15(this.A0B, this, anonymousClass14);
            A06();
            A0A(z);
        }
        int experienceType = this.A03.A0J();
        if (experienceType == 0) {
            this.A06 = EnumC0471Jc.A0C;
            C0806Wj c0806Wj2 = this.A04;
            String[] strArr3 = A0E;
            if (strArr3[4].charAt(5) != strArr3[5].charAt(5)) {
                String[] strArr4 = A0E;
                strArr4[4] = "sE7A2oUzbi1vVIMuEE2CogviWDEosGc5";
                strArr4[5] = "5NgD8lzbPLe7uQJdX4ST7JevLzoIctPR";
                c0806Wj2.A0D().AEb(EnumC00100c.A09);
            }
            throw new RuntimeException();
        } else if (experienceType == 1) {
            this.A06 = EnumC0471Jc.A0B;
            this.A04.A0D().AEb(EnumC00100c.A08);
        }
        this.A02 = new AnonymousClass15(this.A0B, this, anonymousClass14);
        A06();
        A0A(z);
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC00200n
    public final String A63() {
        return this.A03.A0U();
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC00200n
    public final void onDestroy() {
        A07();
    }
}
