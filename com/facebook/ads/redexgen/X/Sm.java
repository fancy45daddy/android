package com.facebook.ads.redexgen.X;

import com.facebook.ads.internal.protocol.AdErrorType;
import java.util.Arrays;
import org.json.JSONException;
/* loaded from: assets/audience_network.dex */
public class Sm implements InterfaceC0634Pp {
    public static byte[] A03;
    public final /* synthetic */ long A00;
    public final /* synthetic */ JT A01;
    public final /* synthetic */ JW A02;

    static {
        A01();
    }

    public static String A00(int i, int i2, int i3) {
        byte[] copyOfRange = Arrays.copyOfRange(A03, i, i + i2);
        for (int i4 = 0; i4 < copyOfRange.length; i4++) {
            copyOfRange[i4] = (byte) ((copyOfRange[i4] ^ i3) ^ 10);
        }
        return new String(copyOfRange);
    }

    public static void A01() {
        A03 = new byte[]{103, 100, 50, 97, 101, 105, 96, 53, 16, 65, 19, 16, 30, 30, 69, 23, 1, 24, 4, 5, 14, 51, 40, 46, 59, 63, 34, 36, 37, 113, 107, 108, 90, 77, 73, 90, 77, 31, 90, 77, 77, 80, 77, 31, 80, 92, 92, 74, 77, 77, 90, 91, 75, 125, 106, 110, 125, 106, 56, 106, 125, 104, 116, 113, 125, 124, 56, 107, 109, 123, 123, 125, 107, 107, 126, 109, 116, 116, 97, 75, 74, 103, 75, 73, 84, 72, 65, 80, 65, 95, 94, 117, 66, 66, 95, 66};
    }

    public Sm(JW jw, JT jt, long j) {
        this.A02 = jw;
        this.A01 = jt;
        this.A00 = j;
    }

    private final void A02(Q1 q1) {
        C0806Wj c0806Wj;
        long j;
        C0806Wj c0806Wj2;
        long j2;
        JX jx;
        C0806Wj c0806Wj3;
        C0806Wj c0806Wj4;
        long j3;
        JS.A06(this.A01);
        try {
            InterfaceC0632Pn response = q1.A00();
            if (response != null) {
                String A5n = response.A5n();
                jx = this.A02.A05;
                c0806Wj3 = this.A02.A04;
                JZ serverResponse = jx.A06(c0806Wj3, A5n, this.A00);
                if (serverResponse.A01() == JY.A03) {
                    C0705Si c0705Si = (C0705Si) serverResponse;
                    String A04 = c0705Si.A04();
                    AdErrorType adErrorTypeFromCode = AdErrorType.adErrorTypeFromCode(c0705Si.A03(), AdErrorType.ERROR_MESSAGE);
                    if (A04 != null) {
                        A5n = A04;
                    }
                    c0806Wj4 = this.A02.A04;
                    C0R A0D = c0806Wj4.A0D();
                    j3 = this.A02.A00;
                    A0D.A2j(L5.A01(j3), adErrorTypeFromCode.getErrorCode(), A5n, adErrorTypeFromCode.isPublicError());
                    this.A02.A0D(J3.A01(adErrorTypeFromCode, A5n));
                    return;
                }
            }
            AdErrorType adErrorType = AdErrorType.NETWORK_ERROR;
            String errorMessage = q1.getMessage();
            c0806Wj2 = this.A02.A04;
            C0R A0D2 = c0806Wj2.A0D();
            j2 = this.A02.A00;
            A0D2.A2j(L5.A01(j2), adErrorType.getErrorCode(), errorMessage, adErrorType.isPublicError());
            this.A02.A0D(J3.A01(adErrorType, errorMessage));
        } catch (JSONException e) {
            AdErrorType adErrorType2 = AdErrorType.NETWORK_ERROR;
            String message = q1.getMessage();
            c0806Wj = this.A02.A04;
            C0R A0D3 = c0806Wj.A0D();
            j = this.A02.A00;
            long A01 = L5.A01(j);
            int errorCode = adErrorType2.getErrorCode();
            A0D3.A2j(A01, errorCode, A00(16, 15, 65) + e.getMessage(), adErrorType2.isPublicError());
            this.A02.A0D(J3.A01(adErrorType2, message));
        }
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC0634Pp
    public final void AAG(InterfaceC0632Pn interfaceC0632Pn) {
        JH.A05(A00(79, 10, 46), A00(52, 27, 18), A00(8, 8, 45));
        if (interfaceC0632Pn != null) {
            String A5n = interfaceC0632Pn.A5n();
            JS.A06(this.A01);
            this.A02.A0N(A5n, this.A00, this.A01);
        }
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC0634Pp
    public final void AAd(Exception exc) {
        C0806Wj c0806Wj;
        long j;
        JH.A05(A00(89, 7, 58), A00(31, 21, 53), A00(0, 8, 90));
        if (Q1.class.equals(exc.getClass())) {
            A02((Q1) exc);
            return;
        }
        AdErrorType adErrorType = AdErrorType.NETWORK_ERROR;
        String errorMessage = exc.getMessage();
        c0806Wj = this.A02.A04;
        C0R A0D = c0806Wj.A0D();
        j = this.A02.A00;
        A0D.A2j(L5.A01(j), adErrorType.getErrorCode(), errorMessage, adErrorType.isPublicError());
        this.A02.A0D(J3.A01(adErrorType, errorMessage));
    }
}
