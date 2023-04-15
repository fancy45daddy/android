package com.facebook.ads.redexgen.X;

import androidx.annotation.Nullable;
import com.facebook.ads.AdExperienceType;
import com.facebook.ads.AdSettings;
import com.facebook.ads.CacheFlag;
import com.facebook.ads.RewardData;
import com.facebook.ads.internal.protocol.AdPlacementType;
import java.util.EnumSet;
/* renamed from: com.facebook.ads.redexgen.X.1p  reason: invalid class name and case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public final class C00481p {
    public static String[] A0D = {"erlsxJKV5RGKo0fyhsjft4C8myFkBTFD", "xxCOSS58nTJL4g358MAx2boWparhVsnt", "50HA7KO7TX73z1", "kwTSvTyvqMkAeNvnsZNufhK8xoNKpC5A", "CvvJJ5wn5WoPjh", "PJeUG8MSArG13FCqdbuWaTyquTMQa3YW", "KbVXHt7uQSAfPtAdYM2eE220TAgmiqZ3", "QWgxf2msfb1fWKXeTjGnwNJbVHOPLzwf"};
    public int A00;
    public long A01;
    @Nullable
    public RewardData A02;
    @Nullable
    public EnumC0454Il A03;
    @Nullable
    public String A04;
    @Nullable
    public String A05;
    public boolean A06;
    public final J6 A07;
    public final J8 A08;
    public final String A09;
    @Nullable
    public final EnumSet<CacheFlag> A0A;
    public final int A0B;
    public final AdPlacementType A0C;

    public C00481p(String str, J8 j8, AdPlacementType adPlacementType, J6 j6, int i) {
        this(str, j8, adPlacementType, j6, i, EnumSet.of(CacheFlag.NONE));
    }

    public C00481p(String str, J8 j8, AdPlacementType adPlacementType, J6 j6, int i, @Nullable EnumSet<CacheFlag> cacheFlags) {
        this.A09 = str;
        this.A0C = adPlacementType;
        this.A07 = j6;
        this.A0B = i;
        this.A0A = cacheFlags;
        this.A08 = j8;
        this.A00 = -1;
    }

    public final AdPlacementType A00() {
        AdPlacementType adPlacementType = this.A0C;
        if (adPlacementType != null) {
            return adPlacementType;
        }
        J6 j6 = this.A07;
        if (j6 == null) {
            return AdPlacementType.NATIVE;
        }
        if (j6 == J6.A07) {
            return AdPlacementType.INTERSTITIAL;
        }
        return AdPlacementType.BANNER;
    }

    public final JT A01(C0806Wj c0806Wj, JD jd, @Nullable AdExperienceType adExperienceType) {
        C0507Kq c0507Kq;
        String str;
        String str2 = this.A09;
        J6 j6 = this.A07;
        if (j6 != null) {
            c0507Kq = new C0507Kq(j6.A03(), this.A07.A02());
        } else {
            c0507Kq = null;
        }
        J8 j8 = this.A08;
        if (AdSettings.getTestAdType() != AdSettings.TestAdType.DEFAULT) {
            str = AdSettings.getTestAdType().getAdTypeString();
        } else {
            str = null;
        }
        JT jt = new JT(c0806Wj, str2, c0507Kq, j8, str, this.A0B, AdSettings.isTestMode(c0806Wj), AdSettings.isMixedAudience(), jd, C0513Kw.A01(ID.A0I(c0806Wj)), this.A04, adExperienceType != null ? adExperienceType.getAdExperienceType() : null);
        String[] strArr = A0D;
        if (strArr[2].length() != strArr[4].length()) {
            throw new RuntimeException();
        }
        String[] strArr2 = A0D;
        strArr2[0] = "1YKhexqCB6oyofjWexJTrFb8PReFz0lW";
        strArr2[3] = "PDYLpd11u8hpbIrKg4rw9QV8MRNrtAlX";
        return jt;
    }

    public final void A02(int i) {
        this.A00 = i;
    }

    public final void A03(long j) {
        this.A01 = j;
    }

    public final void A04(@Nullable RewardData rewardData) {
        this.A02 = rewardData;
    }

    public final void A05(@Nullable EnumC0454Il enumC0454Il) {
        this.A03 = enumC0454Il;
    }

    public final void A06(@Nullable String str) {
        this.A04 = str;
    }

    public final void A07(@Nullable String str) {
        this.A05 = str;
    }

    public final void A08(boolean z) {
        this.A06 = z;
    }
}
