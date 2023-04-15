package com.facebook.ads.redexgen.X;

import a.a.j;
import android.content.Context;
import android.net.Uri;
import android.util.Log;
import java.io.IOException;
import java.util.Arrays;
/* renamed from: com.facebook.ads.redexgen.X.Ts  reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public final class C0740Ts implements GQ {
    public static byte[] A0A;
    public static String[] A0B = {"FbuaOXxD8R3r2Sez", "nl2ebpznfahqYQ0iJMeMraM5u9ytbnkM", "LukWv8Q1lv25Jz9VZoWHVgr80BMsfj7N", "UITThFDmXIK6qk0JXllT0SDhOskljLuD", "WWGwJIDbyg2bl1Mdb", "YrbKAvAwCNNri3u3ecPrw9BDMC3UJFWv", "h8pfgUZlB4VhxmKVTbPlaDG6t2cnqOd2", "IQvStArhblJullrSqn3"};
    public GQ A00;
    public GQ A01;
    public GQ A02;
    public GQ A03;
    public GQ A04;
    public GQ A05;
    public GQ A06;
    public final Context A07;
    public final GQ A08;
    public final InterfaceC0405Gm<? super GQ> A09;

    public static String A06(int i, int i2, int i3) {
        byte[] copyOfRange = Arrays.copyOfRange(A0A, i, i + i2);
        for (int i4 = 0; i4 < copyOfRange.length; i4++) {
            copyOfRange[i4] = (byte) ((copyOfRange[i4] - i3) - 49);
        }
        return new String(copyOfRange);
    }

    public static void A07() {
        byte[] bArr = {119, -87, -74, -84, -70, -73, -79, -84, -89, -87, -69, -69, -83, -68, 119, -40, 11, 11, -4, 4, 7, 11, 0, 5, -2, -73, 11, 6, -73, 7, 3, -8, 16, -73, -23, -21, -28, -25, -73, 10, 11, 9, -4, -8, 4, -73, 14, 0, 11, -1, 6, 12, 11, -73, -5, -4, 7, -4, 5, -5, 0, 5, -2, -73, 6, 5, -73, 11, -1, -4, -73, -23, -21, -28, -25, -73, -4, 15, 11, -4, 5, 10, 0, 6, 5, -13, 20, 21, 16, 36, 27, 35, -13, 16, 35, 16, 2, 30, 36, 33, 18, 20, -90, -45, -45, -48, -45, -127, -54, -49, -44, -43, -62, -49, -43, -54, -62, -43, -54, -49, -56, -127, -77, -75, -82, -79, -127, -58, -39, -43, -58, -49, -44, -54, -48, -49, -82, -64, -64, -78, -63, -33, -21, -23, -86, -30, -35, -33, -31, -34, -21, -21, -25, -86, -35, -32, -17, -86, -27, -22, -16, -31, -18, -22, -35, -24, -86, -31, -12, -21, -20, -24, -35, -11, -31, -18, -82, -86, -31, -12, -16, -86, -18, -16, -23, -20, -86, -50, -16, -23, -20, -64, -35, -16, -35, -49, -21, -15, -18, -33, -31, 17, 29, 28, 34, 19, 28, 34, -13, -16, 3, -16, -30, -47, -25, -30, -43, -29, -33, -27, -30, -45, -43, -27, -25, -32, -29};
        if (A0B[7].length() != 19) {
            throw new RuntimeException();
        }
        String[] strArr = A0B;
        strArr[1] = "aTM6G8lKpIJ6RP017QMILejHyUH2B7dh";
        strArr[3] = "ERhfqbVtKjwR0y0XTQNxaBJXl7PFqJQV";
        A0A = bArr;
    }

    static {
        A07();
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.Gm != com.facebook.ads.internal.exoplayer2.upstream.TransferListener<? super com.facebook.ads.internal.exoplayer2.upstream.DataSource> */
    public C0740Ts(Context context, InterfaceC0405Gm<? super GQ> interfaceC0405Gm, GQ gq) {
        this.A07 = context.getApplicationContext();
        this.A09 = interfaceC0405Gm;
        this.A08 = (GQ) H6.A01(gq);
    }

    private GQ A00() {
        if (this.A00 == null) {
            this.A00 = new C0745Tx(this.A07, this.A09);
        }
        return this.A00;
    }

    private GQ A01() {
        if (this.A01 == null) {
            this.A01 = new C0744Tw(this.A07, this.A09);
        }
        GQ gq = this.A01;
        if (A0B[4].length() != 17) {
            throw new RuntimeException();
        }
        A0B[7] = "5KWAQaHsfffdQGrIbOe";
        return gq;
    }

    private GQ A02() {
        if (this.A02 == null) {
            this.A02 = new C0743Tv();
        }
        return this.A02;
    }

    private GQ A03() {
        if (this.A04 == null) {
            this.A04 = new C0736To(this.A09);
        }
        return this.A04;
    }

    private GQ A04() {
        if (this.A05 == null) {
            this.A05 = new C0727Tf(this.A07, this.A09);
        }
        return this.A05;
    }

    private GQ A05() {
        if (this.A06 == null) {
            try {
                this.A06 = (GQ) Class.forName(A06(141, 60, 75)).getConstructor(new Class[0]).newInstance(new Object[0]);
            } catch (ClassNotFoundException unused) {
                Log.w(A06(85, 17, 126), A06(15, 70, j.AppCompatTheme_textAppearanceSearchResultTitle));
            } catch (Exception e) {
                throw new RuntimeException(A06(j.AppCompatTheme_textAppearanceSearchResultTitle, 34, 48), e);
            }
            if (this.A06 == null) {
                this.A06 = this.A08;
            }
        }
        return this.A06;
    }

    @Override // com.facebook.ads.redexgen.X.GQ
    public final Uri A7i() {
        GQ gq = this.A03;
        if (gq == null) {
            return null;
        }
        return gq.A7i();
    }

    @Override // com.facebook.ads.redexgen.X.GQ
    public final long ACq(GU gu) throws IOException {
        H6.A04(this.A03 == null);
        String scheme = gu.A04.getScheme();
        if (C0430Hl.A0e(gu.A04)) {
            String path = gu.A04.getPath();
            String scheme2 = A06(0, 15, 23);
            if (path.startsWith(scheme2)) {
                this.A03 = A00();
            } else {
                this.A03 = A03();
            }
        } else {
            String scheme3 = A06(136, 5, 28);
            if (scheme3.equals(scheme)) {
                this.A03 = A00();
            } else {
                String scheme4 = A06(201, 7, 125);
                if (scheme4.equals(scheme)) {
                    this.A03 = A01();
                } else {
                    String scheme5 = A06(223, 4, 66);
                    if (scheme5.equals(scheme)) {
                        this.A03 = A05();
                    } else {
                        String scheme6 = A06(208, 4, 94);
                        if (scheme6.equals(scheme)) {
                            this.A03 = A02();
                        } else {
                            String scheme7 = A0B[7];
                            if (scheme7.length() != 19) {
                                throw new RuntimeException();
                            }
                            String[] strArr = A0B;
                            strArr[6] = "D4NYqGk09rVUGFQV4qQWMtXs9QaZTkcz";
                            strArr[2] = "qnlKhzyemJcEWBYVQAP4EuZEjLdcMELi";
                            String scheme8 = A06(212, 11, 63);
                            if (scheme8.equals(scheme)) {
                                this.A03 = A04();
                            } else {
                                this.A03 = this.A08;
                            }
                        }
                    }
                }
            }
        }
        return this.A03.ACq(gu);
    }

    @Override // com.facebook.ads.redexgen.X.GQ
    public final void close() throws IOException {
        GQ gq = this.A03;
        if (gq != null) {
            try {
                gq.close();
            } finally {
                this.A03 = null;
            }
        }
    }

    @Override // com.facebook.ads.redexgen.X.GQ
    public final int read(byte[] bArr, int i, int i2) throws IOException {
        return this.A03.read(bArr, i, i2);
    }
}
