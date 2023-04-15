package com.facebook.ads.redexgen.X;

import android.view.View;
import java.util.Arrays;
/* renamed from: com.facebook.ads.redexgen.X.Yd  reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public class C0850Yd implements InterfaceC00280v {
    public static byte[] A02;
    public static String[] A03 = {"7FIKHU9lgq27", "AgQqvAltXhi1bYF8zppFCZ", "CRAmwsbXNtyv0vmCJJ9qOPCwxUiND3E6", "ItQqdqoRYHMWKQzbVRTeHzNwEAi", "W2szVhKnaW", "HNVKE5hkEvipBMdeuLWXlSQ07SgK2Jmi", "9NOG2BA2dnlUEqMWgY53wMXC47FXKBrl", "EneshuO9jiHnlHF2bjWwp7WA0EKVaMOF"};
    public final /* synthetic */ ED A00;
    public final /* synthetic */ Runnable A01;

    public static String A00(int i, int i2, int i3) {
        byte[] copyOfRange = Arrays.copyOfRange(A02, i, i + i2);
        for (int i4 = 0; i4 < copyOfRange.length; i4++) {
            byte b2 = (byte) ((copyOfRange[i4] - i3) - 16);
            if (A03[2].charAt(4) == 'y') {
                throw new RuntimeException();
            }
            String[] strArr = A03;
            strArr[5] = "2VG06oAYTcRzKBDE7gWFCU36hzL5px1b";
            strArr[7] = "j1xG2z3v9jq0UO66H2WqYNbpklLAu6IG";
            copyOfRange[i4] = b2;
        }
        return new String(copyOfRange);
    }

    public static void A01() {
        A02 = new byte[]{115, 112, 119, -93, 117, -92, 115, -94, -124, -93, -80, -80, -89, -76, 98, -85, -81, -78, -76, -89, -75, -75, -85, -79, -80, 98, -88, -85, -76, -89, -90, -118, -119, 93, 124, -119, -119, Byte.MIN_VALUE, -115, 103, -118, -126, -126, -124, -119, -126, 100, -120, -117, -115, Byte.MIN_VALUE, -114, -114, -124, -118, -119};
    }

    static {
        A01();
    }

    public C0850Yd(ED ed, Runnable runnable) {
        this.A00 = ed;
        this.A01 = runnable;
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC00280v
    public final void AA6(ZC zc) {
        DY dy;
        dy = this.A00.A01;
        dy.A0D().A3j();
        this.A00.A06.A0C();
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC00280v
    public final void AA7(ZC zc, View view) {
        DY dy;
        dy = this.A00.A01;
        dy.A0D().A3i(zc == ((AbstractC0848Yb) this.A00).A00);
        if (zc != ((AbstractC0848Yb) this.A00).A00) {
            return;
        }
        this.A00.A0C().removeCallbacks(this.A01);
        InterfaceC00200n interfaceC00200n = ((AbstractC0848Yb) this.A00).A01;
        ED ed = this.A00;
        ((AbstractC0848Yb) ed).A01 = zc;
        ed.A00 = view;
        if (!this.A00.A0C) {
            this.A00.A06.A0F(zc);
            return;
        }
        this.A00.A06.A0E(view);
        this.A00.A0K(interfaceC00200n);
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC00280v
    public final void AA8(ZC zc) {
        DY dy;
        JH.A05(A00(31, 25, 11), A00(8, 23, 50), A00(0, 8, 46));
        dy = this.A00.A01;
        dy.A0D().A3l();
        this.A00.A06.A0D();
        this.A00.A0I();
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC00280v
    public final void AB6(ZC zc, J3 j3) {
        DY dy;
        dy = this.A00.A01;
        dy.A0D().A3k(zc == ((AbstractC0848Yb) this.A00).A00, j3.A03().getErrorCode());
        if (zc != ((AbstractC0848Yb) this.A00).A00) {
            return;
        }
        this.A00.A0C().removeCallbacks(this.A01);
        this.A00.A0K(zc);
        this.A00.AAc(j3);
    }
}
