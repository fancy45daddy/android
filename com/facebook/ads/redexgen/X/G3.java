package com.facebook.ads.redexgen.X;

import androidx.annotation.Nullable;
import com.facebook.ads.internal.exoplayer2.Format;
import com.facebook.ads.internal.exoplayer2.trackselection.DefaultTrackSelector$Parameters;
/* loaded from: assets/audience_network.dex */
public final class G3 implements Comparable<G3> {
    public static String[] A07 = {"UOhnAWHUvWrKh39blc2", "rJoZ4rjs3", "mwxErCj8CFXQtRdeT7I", "OMBsSVN1m", "xKR0iM7hb", "rY23JmNnbt4", "7JhRM9", "FTdecT"};
    public final int A00;
    public final int A01;
    public final int A02;
    public final int A03;
    public final int A04;
    public final int A05;
    public final DefaultTrackSelector$Parameters A06;

    public G3(Format format, DefaultTrackSelector$Parameters defaultTrackSelector$Parameters, int i) {
        this.A06 = defaultTrackSelector$Parameters;
        this.A05 = AZ.A0H(i, false) ? 1 : 0;
        this.A03 = AZ.A0K(format, defaultTrackSelector$Parameters.A07) ? 1 : 0;
        this.A02 = (format.A0D & 1) != 0 ? 1 : 0;
        this.A01 = format.A05;
        this.A04 = format.A0C;
        this.A00 = format.A04;
    }

    @Override // java.lang.Comparable
    /* renamed from: A00 */
    public final int compareTo(G3 g3) {
        int resultSign;
        int resultSign2;
        int resultSign3;
        int A01;
        int A012;
        int A013;
        int A014;
        int i = this.A05;
        int i2 = g3.A05;
        if (i != i2) {
            A014 = AZ.A01(i, i2);
            return A014;
        }
        int i3 = this.A03;
        int i4 = g3.A03;
        if (i3 != i4) {
            A013 = AZ.A01(i3, i4);
            return A013;
        }
        int i5 = this.A02;
        int i6 = g3.A02;
        if (i5 != i6) {
            A012 = AZ.A01(i5, i6);
            return A012;
        } else if (this.A06.A0D) {
            A01 = AZ.A01(g3.A00, this.A00);
            return A01;
        } else {
            int i7 = this.A05 != 1 ? -1 : 1;
            int i8 = this.A01;
            int i9 = g3.A01;
            String[] strArr = A07;
            if (strArr[6].length() != strArr[7].length()) {
                throw new RuntimeException();
            }
            A07[3] = "q1nzmC2W0";
            if (i8 != i9) {
                resultSign3 = AZ.A01(i8, i9);
                return resultSign3 * i7;
            }
            int i10 = this.A04;
            int resultSign4 = g3.A04;
            if (i10 != resultSign4) {
                resultSign2 = AZ.A01(i10, resultSign4);
                return resultSign2 * i7;
            }
            resultSign = AZ.A01(this.A00, g3.A00);
            return resultSign * i7;
        }
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        G3 g3 = (G3) obj;
        if (this.A05 == g3.A05 && this.A03 == g3.A03 && this.A02 == g3.A02 && this.A01 == g3.A01 && this.A04 == g3.A04) {
            int i = this.A00;
            if (A07[5].length() != 11) {
                throw new RuntimeException();
            }
            String[] strArr = A07;
            strArr[0] = "5gFFNpUtyAKNtlVcilC";
            strArr[2] = "oFDw9vE2Y7jHYxyqfLD";
            if (i == g3.A00) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int result = this.A05;
        int i = result * 31;
        int result2 = this.A03;
        int result3 = this.A01;
        int result4 = this.A00;
        return ((((((((i + result2) * 31) + this.A02) * 31) + result3) * 31) + this.A04) * 31) + result4;
    }
}
