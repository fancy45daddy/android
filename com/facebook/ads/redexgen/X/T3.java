package com.facebook.ads.redexgen.X;

import a.a.j;
import com.facebook.ads.internal.protocol.AdErrorType;
import java.util.Arrays;
/* loaded from: assets/audience_network.dex */
public class T3 implements AnonymousClass68 {
    public static byte[] A03;
    public static String[] A04 = {"WE91vPqiHLcyJwrbQHRJcIvZwn5D9l", "3LK2x46Pp3Ld9onr8DyN9Ggm", "60IU9PqapOW3gkaytJRkZEg3", "UqNMzTGRyBNLAx", "QjYmXRpW4", "DeQ01HErfJf7NLfnuVX6corDAbYDzPur", "bhlqPTI7mETXQlgoFXHPJBBhjQPpzoup", "oYTMQ3SHL"};
    public final /* synthetic */ Z9 A00;
    public final /* synthetic */ C0718Sw A01;
    public final /* synthetic */ boolean A02;

    public static String A00(int i, int i2, int i3) {
        byte[] copyOfRange = Arrays.copyOfRange(A03, i, i + i2);
        for (int i4 = 0; i4 < copyOfRange.length; i4++) {
            copyOfRange[i4] = (byte) ((copyOfRange[i4] - i3) - 60);
        }
        return new String(copyOfRange);
    }

    public static void A01() {
        A03 = new byte[]{-16, 11, 19, 22, 15, 14, -54, 30, 25, -54, 14, 25, 33, 24, 22, 25, 11, 14, -54, 11, -54, 23, 15, 14, 19, 11, -40};
    }

    static {
        A01();
    }

    public T3(C0718Sw c0718Sw, Z9 z9, boolean z) {
        this.A01 = c0718Sw;
        this.A00 = z9;
        this.A02 = z;
    }

    @Override // com.facebook.ads.redexgen.X.AnonymousClass68
    public final void AAB() {
        C0806Wj c0806Wj;
        long j;
        InterfaceC0717Sv interfaceC0717Sv;
        InterfaceC0717Sv interfaceC0717Sv2;
        if (this.A01.A0a != null) {
            this.A01.A0a.A0J();
            this.A01.A0a = null;
        }
        AdErrorType adErrorType = AdErrorType.CACHE_FAILURE_ERROR;
        String A00 = A00(0, 27, j.AppCompatTheme_viewInflaterClass);
        c0806Wj = this.A01.A0c;
        C0R A0D = c0806Wj.A0D();
        j = this.A01.A00;
        A0D.A2a(L5.A01(j), adErrorType.getErrorCode(), A00);
        interfaceC0717Sv = this.A01.A0G;
        if (interfaceC0717Sv != null) {
            C0718Sw c0718Sw = this.A01;
            String[] strArr = A04;
            String errorMessage = strArr[4];
            if (errorMessage.length() != strArr[7].length()) {
                throw new RuntimeException();
            }
            A04[6] = "7cQ3648pyLFx7h83cxUuTBVDS0jRS450";
            interfaceC0717Sv2 = c0718Sw.A0G;
            interfaceC0717Sv2.AAc(J3.A01(adErrorType, A00));
        }
    }

    @Override // com.facebook.ads.redexgen.X.AnonymousClass68
    public final void AAI() {
        InterfaceC0717Sv interfaceC0717Sv;
        EnumC0454Il enumC0454Il;
        C0806Wj c0806Wj;
        InterfaceC0717Sv interfaceC0717Sv2;
        C0806Wj c0806Wj2;
        boolean A0q;
        InterfaceC0717Sv interfaceC0717Sv3;
        EB eb;
        EB eb2;
        C0718Sw c0718Sw = this.A01;
        c0718Sw.A0a = this.A00;
        if (this.A02) {
            eb = c0718Sw.A0A;
            if (eb != null) {
                eb2 = this.A01.A0A;
                String[] strArr = A04;
                if (strArr[4].length() != strArr[7].length()) {
                    throw new RuntimeException();
                }
                String[] strArr2 = A04;
                strArr2[4] = "vb7V14ygc";
                strArr2[7] = "eJXYUqUMt";
                eb2.A0F();
            }
        }
        interfaceC0717Sv = this.A01.A0G;
        if (interfaceC0717Sv != null) {
            enumC0454Il = this.A01.A0E;
            if (enumC0454Il.equals(EnumC0454Il.A04)) {
                A0q = this.A01.A0q();
                if (!A0q) {
                    interfaceC0717Sv3 = this.A01.A0G;
                    interfaceC0717Sv3.ABN();
                }
            }
            if (this.A02) {
                c0806Wj = this.A01.A0c;
                if (!ID.A1E(c0806Wj) || this.A01.A0z() == null || !this.A01.A0z().A0r()) {
                    interfaceC0717Sv2 = this.A01.A0G;
                    interfaceC0717Sv2.A9q();
                    return;
                }
                C0718Sw c0718Sw2 = this.A01;
                c0806Wj2 = c0718Sw2.A0c;
                c0718Sw2.A0M = C0590Nx.A01(c0806Wj2, this.A01.A0z(), 4, new T4(this));
            }
        }
    }
}
