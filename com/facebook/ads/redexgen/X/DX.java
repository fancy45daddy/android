package com.facebook.ads.redexgen.X;

import android.database.sqlite.SQLiteDatabase;
import android.text.TextUtils;
import androidx.annotation.Nullable;
import java.util.Arrays;
import java.util.Map;
import java.util.concurrent.locks.Lock;
/* loaded from: assets/audience_network.dex */
public class DX extends AbstractC0802Wf<String> {
    public static byte[] A08;
    public static String[] A09 = {"l", "T0JdG9ZEnLfTeCeftC9G7d8cUsVG3XZb", "aLcPLzyPnyiGnlL0eBnocVG2Im", "W3EwFUE7CvVeZV", "t2q4fu0Y0bIBimY2SigNyotMmunbmEsF", "TUpEXXUjgi8xLksArOVlucAVZCM", "AqOn5F5Mae0spU5kh0gbanyLcs", "chqW8UrgIl8Ef4OOKimE4h"};
    public final /* synthetic */ double A00;
    public final /* synthetic */ double A01;
    public final /* synthetic */ int A02;
    public final /* synthetic */ C7P A03;
    public final /* synthetic */ String A04;
    public final /* synthetic */ String A05;
    public final /* synthetic */ String A06;
    public final /* synthetic */ Map A07;

    public static String A01(int i, int i2, int i3) {
        byte[] copyOfRange = Arrays.copyOfRange(A08, i, i + i2);
        for (int i4 = 0; i4 < copyOfRange.length; i4++) {
            copyOfRange[i4] = (byte) ((copyOfRange[i4] - i3) - 32);
        }
        return new String(copyOfRange);
    }

    public static void A02() {
        A08 = new byte[]{-112, -115, -96, -115, -114, -115, -97, -111};
    }

    static {
        A02();
    }

    public DX(C7P c7p, String str, String str2, int i, double d, double d2, String str3, Map map) {
        this.A03 = c7p;
        this.A06 = str;
        this.A05 = str2;
        this.A02 = i;
        this.A01 = d;
        this.A00 = d2;
        this.A04 = str3;
        this.A07 = map;
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Override // com.facebook.ads.redexgen.X.C7S
    @Nullable
    /* renamed from: A00 */
    public final String A03() {
        C0805Wi c0805Wi;
        Lock lock;
        C0805Wi c0805Wi2;
        Lock lock2;
        C0805Wi c0805Wi3;
        Lock lock3;
        C0805Wi c0805Wi4;
        C0804Wh c0804Wh;
        C0803Wg c0803Wg;
        C0805Wi c0805Wi5;
        Lock lock4;
        String A01 = A01(0, 8, 12);
        c0805Wi = this.A03.A01;
        c0805Wi.A06().A8D(this.A06);
        if (TextUtils.isEmpty(this.A05)) {
            return null;
        }
        lock = C7P.A08;
        lock.lock();
        String[] strArr = A09;
        if (strArr[6].length() != strArr[2].length()) {
            throw new RuntimeException();
        }
        String[] strArr2 = A09;
        strArr2[1] = "mqnyRlomjFPPGlBu5iJ3A4HRnrnsorAH";
        strArr2[4] = "vLAqNnzkqKgbXCY8NZfbbPBhHyGRm9s6";
        SQLiteDatabase sQLiteDatabase = null;
        try {
            try {
                sQLiteDatabase = this.A03.A0E();
                sQLiteDatabase.beginTransaction();
                c0804Wh = this.A03.A02;
                c0803Wg = this.A03.A03;
                String A0E = c0804Wh.A0E(c0803Wg.A0C(this.A05), this.A02, this.A06, this.A01, this.A00, this.A04, this.A07);
                sQLiteDatabase.setTransactionSuccessful();
                if (sQLiteDatabase.isOpen()) {
                    try {
                        if (sQLiteDatabase.inTransaction()) {
                            sQLiteDatabase.endTransaction();
                        }
                    } catch (Exception e) {
                        c0805Wi5 = this.A03.A01;
                        c0805Wi5.A06().A8u(A01, C01877l.A0z, new C01887m(e));
                    }
                }
                lock4 = C7P.A08;
                String[] strArr3 = A09;
                if (strArr3[0].length() != strArr3[3].length()) {
                    String[] strArr4 = A09;
                    strArr4[6] = "euwrYX6ZBvkkPfbLG6LTpx3NDj";
                    strArr4[2] = "qLYaMtYi2WKu9oTuT6ElhKmpF4";
                    lock4.unlock();
                    return A0E;
                }
                throw new RuntimeException();
            } catch (Exception e2) {
                A01(C7R.A06);
                c0805Wi2 = this.A03.A01;
                c0805Wi2.A06().A8u(A01, C01877l.A0y, new C01887m(e2));
                if (sQLiteDatabase != null && sQLiteDatabase.isOpen()) {
                    try {
                        if (sQLiteDatabase.inTransaction()) {
                            sQLiteDatabase.endTransaction();
                        }
                    } catch (Exception e3) {
                        c0805Wi3 = this.A03.A01;
                        c0805Wi3.A06().A8u(A01, C01877l.A0z, new C01887m(e3));
                    }
                }
                lock2 = C7P.A08;
                lock2.unlock();
                return null;
            }
        } catch (Throwable th) {
            if (sQLiteDatabase != null && sQLiteDatabase.isOpen()) {
                try {
                    if (sQLiteDatabase.inTransaction()) {
                        sQLiteDatabase.endTransaction();
                    }
                } catch (Exception e4) {
                    c0805Wi4 = this.A03.A01;
                    c0805Wi4.A06().A8u(A01, C01877l.A0z, new C01887m(e4));
                }
            }
            lock3 = C7P.A08;
            lock3.unlock();
            throw th;
        }
    }
}
