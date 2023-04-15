package com.facebook.ads.redexgen.X;

import android.os.Handler;
import androidx.annotation.Nullable;
import com.facebook.ads.AdSettings;
import com.facebook.ads.AdSize;
import com.facebook.ads.internal.dynamicloading.DynamicLoaderFactory;
import com.facebook.ads.internal.protocol.AdErrorType;
import com.facebook.ads.internal.protocol.AdPlacementType;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
/* loaded from: assets/audience_network.dex */
public final class YV implements JV {
    public static byte[] A0E;
    public static String[] A0F = {"Um", "5O6Pi5UhekEiJBNtL2", "ByBiFstlzS", "VNZICTTmM6bBZ", "I3ykA2cHAONkN", "xnUs6VMzToWHuFoC", "Qkjm3fg24P6DD7pmZ7L4neN1zLjqdukp", "LFB8Dcv49A6aPeUL"};
    @Nullable
    public InterfaceC00511s A00;
    public AnonymousClass83 A01;
    @Nullable
    public String A02;
    public boolean A03;
    public final int A04;
    public final Handler A05;
    @Nullable
    public final AdSize A06;
    public final C00250s A07;
    public final C0806Wj A08;
    public final IT A09;
    public final J8 A0A;
    public final JW A0B;
    public final Runnable A0C;
    public final String A0D;

    public static String A03(int i, int i2, int i3) {
        byte[] copyOfRange = Arrays.copyOfRange(A0E, i, i + i2);
        int i4 = 0;
        while (true) {
            int length = copyOfRange.length;
            if (A0F[2].length() != 10) {
                throw new RuntimeException();
            }
            A0F[1] = "uoxYJqIRleds8fPMMv";
            if (i4 >= length) {
                return new String(copyOfRange);
            }
            copyOfRange[i4] = (byte) ((copyOfRange[i4] - i3) - 87);
            i4++;
        }
    }

    public static void A05() {
        byte[] bArr = {64, 65, -14, 66, 62, 51, 53, 55, 63, 55, 64, 70, -14, 59, 64, -14, 68, 55, 69, 66, 65, 64, 69, 55};
        if (A0F[0].length() != 2) {
            throw new RuntimeException();
        }
        A0F[1] = "dKV76OJFyRmVPWeRzZ";
        A0E = bArr;
    }

    static {
        A05();
        LG.A02();
    }

    public YV(C0806Wj c0806Wj, String str, J8 j8, @Nullable AdSize adSize, int i) {
        this.A08 = c0806Wj;
        this.A0D = str;
        this.A0A = j8;
        this.A06 = adSize;
        this.A04 = i;
        this.A0B = new JW(this.A08);
        this.A0B.A0P(this);
        this.A07 = new C00250s();
        this.A03 = true;
        this.A05 = new Handler();
        this.A0C = new E9(this);
        this.A09 = c0806Wj.A08();
        DynamicLoaderFactory.makeLoader(this.A08).getInitApi().onAdLoadInvoked(this.A08);
    }

    private List<Z9> A04() {
        AnonymousClass83 anonymousClass83 = this.A01;
        ArrayList arrayList = new ArrayList(anonymousClass83.A02());
        for (AnonymousClass81 A04 = anonymousClass83.A04(); A04 != null; A04 = anonymousClass83.A04()) {
            InterfaceC00200n A00 = this.A07.A00(this.A08, AdPlacementType.NATIVE);
            if (A00 != null && A00.A79() == AdPlacementType.NATIVE) {
                Z9 nativeAdapter = (Z9) A00;
                nativeAdapter.A0L(this.A08, new EA(this, arrayList, nativeAdapter), this.A09, new C00491q(A04.A04(), anonymousClass83.A05(), this.A0D, anonymousClass83.A05().A0C()), C0718Sw.A0K());
            }
        }
        return arrayList;
    }

    public final void A06() {
        this.A03 = false;
        this.A05.removeCallbacks(this.A0C);
    }

    public final void A07() {
        try {
            JD jd = new JD(this.A08, null, null, null);
            C0806Wj c0806Wj = this.A08;
            String str = this.A0D;
            AdSize adSize = this.A06;
            this.A0B.A0O(new JT(c0806Wj, str, adSize != null ? new C0507Kq(adSize.getWidth(), this.A06.getHeight()) : null, this.A0A, null, this.A04, AdSettings.isTestMode(this.A08), AdSettings.isMixedAudience(), jd, C0513Kw.A01(ID.A0I(this.A08)), this.A02, null));
        } catch (J4 e) {
            AAc(J3.A02(e));
        }
    }

    public final void A08(InterfaceC00511s interfaceC00511s) {
        this.A00 = interfaceC00511s;
    }

    public final void A09(String str) {
        this.A02 = str;
    }

    public final boolean A0A() {
        AnonymousClass83 anonymousClass83 = this.A01;
        return anonymousClass83 == null || anonymousClass83.A0A();
    }

    @Override // com.facebook.ads.redexgen.X.JV
    public final void AAc(J3 j3) {
        if (this.A03) {
            this.A05.postDelayed(this.A0C, 1800000L);
        }
        InterfaceC00511s interfaceC00511s = this.A00;
        if (A0F[2].length() != 10) {
            throw new RuntimeException();
        }
        A0F[2] = "yGn7NPCZVX";
        if (interfaceC00511s != null) {
            interfaceC00511s.AAc(j3);
        }
    }

    @Override // com.facebook.ads.redexgen.X.JV
    public final void ACM(C0706Sj c0706Sj) {
        AnonymousClass83 A00 = c0706Sj.A00();
        if (A00 != null) {
            if (this.A03) {
                long A0A = A00.A05().A0A();
                if (A0A == 0) {
                    A0A = 1800000;
                }
                this.A05.postDelayed(this.A0C, A0A);
            }
            this.A01 = A00;
            List<Z9> A04 = A04();
            if (this.A00 != null) {
                if (A04.isEmpty()) {
                    this.A00.AAc(J3.A01(AdErrorType.NO_FILL, A03(0, 0, 68)));
                    return;
                } else {
                    this.A00.ABX(A04);
                    return;
                }
            }
            return;
        }
        throw new IllegalStateException(A03(0, 24, 123));
    }
}
