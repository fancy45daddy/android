package com.facebook.ads.redexgen.X;

import a.a.j;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;
/* loaded from: assets/audience_network.dex */
public final class VV extends Bc {
    public static byte[] A01;
    public static String[] A02 = {"VtWAGSJcoPK1ZfQIT7kg70", "uvijoF7s18JkyzfLjC52JO", "UbwrKHlSsB9uBr4pHbp3GiHEJPcDIn2y", "M5IiKhc4TX4EBu4m9nlnlg4KrGcCYGid", "uZSF2L4tKNd9pS0dTFbwskwuDNdjgXB", "5", "JxfitwILt0nkPD2n3YPqqh4", "RXlbAzoXPs3VSjVZyf6us5"};
    public long A00;

    public static String A04(int i, int i2, int i3) {
        byte[] copyOfRange = Arrays.copyOfRange(A01, i, i + i2);
        for (int i4 = 0; i4 < copyOfRange.length; i4++) {
            copyOfRange[i4] = (byte) ((copyOfRange[i4] ^ i3) ^ 32);
        }
        return new String(copyOfRange);
    }

    public static void A0A() {
        A01 = new byte[]{47, 62, 57, 42, 63, 34, 36, 37, 83, 82, 113, 89, 72, 93, 120, 93, 72, 93};
    }

    static {
        A0A();
    }

    public VV() {
        super(null);
        this.A00 = -9223372036854775807L;
    }

    public static int A00(HV hv) {
        return hv.A0E();
    }

    public static Boolean A01(HV hv) {
        return Boolean.valueOf(hv.A0E() == 1);
    }

    public static Double A02(HV hv) {
        return Double.valueOf(Double.longBitsToDouble(hv.A0L()));
    }

    public static Object A03(HV hv, int i) {
        if (i != 0) {
            if (i != 1) {
                if (i != 2) {
                    if (i != 3) {
                        if (i == 8) {
                            HashMap<String, Object> A08 = A08(hv);
                            if (A02[5].length() != 0) {
                                String[] strArr = A02;
                                strArr[7] = "dv1uUJDV50UY3341cCSHZj";
                                strArr[6] = "lZLu8OCPwS2vewsoll9LjNz";
                                return A08;
                            }
                        } else if (i != 10) {
                            if (i != 11) {
                                return null;
                            }
                            return A07(hv);
                        } else {
                            ArrayList<Object> A06 = A06(hv);
                            String[] strArr2 = A02;
                            if (strArr2[1].length() == strArr2[0].length()) {
                                A02[4] = "2Wm";
                                return A06;
                            }
                        }
                        throw new RuntimeException();
                    }
                    return A09(hv);
                }
                return A05(hv);
            }
            return A01(hv);
        }
        return A02(hv);
    }

    public static String A05(HV hv) {
        int A0I = hv.A0I();
        int A06 = hv.A06();
        hv.A0Z(A0I);
        return new String(hv.A00, A06, A0I);
    }

    public static ArrayList<Object> A06(HV hv) {
        int A0H = hv.A0H();
        ArrayList<Object> arrayList = new ArrayList<>(A0H);
        for (int i = 0; i < A0H; i++) {
            int count = A00(hv);
            arrayList.add(A03(hv, count));
        }
        return arrayList;
    }

    public static Date A07(HV hv) {
        Date date = new Date((long) A02(hv).doubleValue());
        hv.A0Z(2);
        return date;
    }

    public static HashMap<String, Object> A08(HV hv) {
        int A0H = hv.A0H();
        HashMap<String, Object> hashMap = new HashMap<>(A0H);
        for (int i = 0; i < A0H; i++) {
            String A05 = A05(hv);
            int count = A00(hv);
            hashMap.put(A05, A03(hv, count));
        }
        return hashMap;
    }

    public static HashMap<String, Object> A09(HV hv) {
        HashMap<String, Object> hashMap = new HashMap<>();
        while (true) {
            String A05 = A05(hv);
            int A00 = A00(hv);
            if (A02[4].length() == 22) {
                throw new RuntimeException();
            }
            String[] strArr = A02;
            strArr[1] = "V4HwzONZDXYgxClN6ndm7q";
            strArr[0] = "UAxIIFeY73WGzRiRR4AY1i";
            if (A00 == 9) {
                return hashMap;
            }
            hashMap.put(A05, A03(hv, A00));
        }
    }

    @Override // com.facebook.ads.redexgen.X.Bc
    public final void A0B(HV hv, long j) throws C9R {
        if (A00(hv) == 2) {
            if (!A04(8, 10, 28).equals(A05(hv)) || A00(hv) != 8) {
                return;
            }
            Map<String, Object> metadata = A08(hv);
            String name = A04(0, 8, j.AppCompatTheme_toolbarStyle);
            if (metadata.containsKey(name)) {
                double durationSeconds = ((Double) metadata.get(name)).doubleValue();
                int nameType = (durationSeconds > 0.0d ? 1 : (durationSeconds == 0.0d ? 0 : -1));
                if (nameType > 0) {
                    this.A00 = (long) (1000000.0d * durationSeconds);
                    return;
                }
                return;
            }
            return;
        }
        throw new C9R();
    }

    @Override // com.facebook.ads.redexgen.X.Bc
    public final boolean A0C(HV hv) {
        return true;
    }

    public final long A0D() {
        return this.A00;
    }
}
