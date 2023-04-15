package com.facebook.ads.redexgen.X;

import androidx.annotation.Nullable;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.util.Arrays;
import java.util.TreeSet;
/* renamed from: com.facebook.ads.redexgen.X.Gx  reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public final class C0416Gx {
    public static byte[] A05;
    public static String[] A06 = {"MBceJWRKAgeQJNY3ZRBdRhYJgpL3jkFQ", "518xlpwWcjlWASul8lHAahT8PqQVPF3u", "9RLjFZMlaqPSYVxgrCr3N29CAF4vaCFh", "Nd9PnywG3g8LluWsmNbg8PXBjZKSlX8G", "s", "C1TdeuC5gtnvKYkq95Rq", "MkXsOhuicHq9DXlwRCZefot2VxsvXJH1", "VJm3srbtmlXEw3gKHWc"};
    public boolean A01;
    public final int A02;
    public final String A03;
    public TY A00 = TY.A04;
    public final TreeSet<TW> A04 = new TreeSet<>();

    public static String A01(int i, int i2, int i3) {
        byte[] copyOfRange = Arrays.copyOfRange(A05, i, i + i2);
        for (int i4 = 0; i4 < copyOfRange.length; i4++) {
            copyOfRange[i4] = (byte) ((copyOfRange[i4] ^ i3) ^ 28);
        }
        return new String(copyOfRange);
    }

    public static void A02() {
        A05 = new byte[]{70, 0, 7, 15, 10, 3, 2, 72, 58, 110, 117, 58, 0, 55, 60, 51, 63, 59, 60, 53, 114, 61, 52, 114};
    }

    static {
        A02();
    }

    public C0416Gx(int i, String str) {
        this.A02 = i;
        this.A03 = str;
    }

    public static C0416Gx A00(int i, DataInputStream dataInputStream) throws IOException {
        C0416Gx c0416Gx = new C0416Gx(dataInputStream.readInt(), dataInputStream.readUTF());
        if (i < 2) {
            long readLong = dataInputStream.readLong();
            H2 h2 = new H2();
            H1.A05(h2, readLong);
            c0416Gx.A0F(h2);
        } else {
            TY A00 = TY.A00(dataInputStream);
            if (A06[4].length() == 13) {
                throw new RuntimeException();
            }
            A06[1] = "w2ExrNvXNhLYBLEt12rGyqcfRXmaXRhw";
            c0416Gx.A00 = A00;
        }
        return c0416Gx;
    }

    public final int A03(int i) {
        int result = this.A02;
        int i2 = result * 31;
        int result2 = this.A03.hashCode();
        int result3 = i2 + result2;
        if (i < 2) {
            long A00 = H1.A00(this.A00);
            return (result3 * 31) + ((int) ((A00 >>> 32) ^ A00));
        }
        return (result3 * 31) + this.A00.hashCode();
    }

    public final long A04(long j, long j2) {
        TW A062 = A06(j);
        if (A062.A01()) {
            long j3 = -Math.min(A062.A02() ? Long.MAX_VALUE : A062.A01, j2);
            if (A06[3].charAt(14) != 'W') {
                throw new RuntimeException();
            }
            String[] strArr = A06;
            strArr[7] = "ZNj15xTvoSD0UBJTiXr";
            strArr[5] = "u99g5dbJfvVcRXaISwTW";
            return j3;
        }
        long j4 = j + j2;
        long queryEndPosition = A062.A02 + A062.A01;
        if (queryEndPosition < j4) {
            for (TW tw : this.A04.tailSet(A062, false)) {
                long currentEndPosition = tw.A02;
                if (currentEndPosition > queryEndPosition) {
                    break;
                }
                long currentEndPosition2 = tw.A02;
                queryEndPosition = Math.max(queryEndPosition, currentEndPosition2 + tw.A01);
                if (queryEndPosition >= j4) {
                    break;
                }
            }
        }
        return Math.min(queryEndPosition - j, j2);
    }

    public final H0 A05() {
        return this.A00;
    }

    public final TW A06(long j) {
        TW A01 = TW.A01(this.A03, j);
        TW floor = this.A04.floor(A01);
        if (floor != null && floor.A02 + floor.A01 > j) {
            return floor;
        }
        TW lookupSpan = this.A04.ceiling(A01);
        if (lookupSpan == null) {
            return TW.A02(this.A03, j);
        }
        return TW.A03(this.A03, j, lookupSpan.A02 - j);
    }

    public final TW A07(TW tw) throws C0407Go {
        H6.A04(this.A04.remove(tw));
        TW A08 = tw.A08(this.A02);
        if (tw.A03.renameTo(A08.A03)) {
            this.A04.add(A08);
            return A08;
        }
        throw new C0407Go(A01(12, 12, 78) + tw.A03 + A01(8, 4, 6) + A08.A03 + A01(0, 8, 122));
    }

    public final TreeSet<TW> A08() {
        return this.A04;
    }

    public final void A09(TW tw) {
        this.A04.add(tw);
    }

    public final void A0A(DataOutputStream dataOutputStream) throws IOException {
        dataOutputStream.writeInt(this.A02);
        dataOutputStream.writeUTF(this.A03);
        this.A00.A09(dataOutputStream);
    }

    public final void A0B(boolean z) {
        this.A01 = z;
    }

    public final boolean A0C() {
        return this.A04.isEmpty();
    }

    public final boolean A0D() {
        return this.A01;
    }

    public final boolean A0E(C0413Gu c0413Gu) {
        if (this.A04.remove(c0413Gu)) {
            c0413Gu.A03.delete();
            return true;
        }
        return false;
    }

    public final boolean A0F(H2 h2) {
        TY ty = this.A00;
        TY oldMetadata = this.A00;
        this.A00 = oldMetadata.A08(h2);
        TY oldMetadata2 = this.A00;
        return !oldMetadata2.equals(ty);
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        C0416Gx c0416Gx = (C0416Gx) obj;
        if (this.A02 == c0416Gx.A02 && this.A03.equals(c0416Gx.A03)) {
            TreeSet<TW> treeSet = this.A04;
            if (A06[4].length() == 13) {
                throw new RuntimeException();
            }
            A06[4] = "qw9AeUbTiw";
            if (treeSet.equals(c0416Gx.A04) && this.A00.equals(c0416Gx.A00)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int result = A03(Integer.MAX_VALUE);
        int i = result * 31;
        int result2 = this.A04.hashCode();
        return i + result2;
    }
}
