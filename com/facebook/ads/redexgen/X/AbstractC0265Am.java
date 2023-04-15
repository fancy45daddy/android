package com.facebook.ads.redexgen.X;

import a.a.j;
import java.nio.ByteBuffer;
import java.util.Arrays;
/* renamed from: com.facebook.ads.redexgen.X.Am  reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public abstract class AbstractC0265Am extends AbstractC0782Vl<C0264Al, AbstractC0262Aj, FL> implements UD {
    public static byte[] A01;
    public final String A00;

    static {
        A0J();
    }

    public static String A0I(int i, int i2, int i3) {
        byte[] copyOfRange = Arrays.copyOfRange(A01, i, i + i2);
        for (int i4 = 0; i4 < copyOfRange.length; i4++) {
            copyOfRange[i4] = (byte) ((copyOfRange[i4] - i3) - 125);
        }
        return new String(copyOfRange);
    }

    public static void A0J() {
        A01 = new byte[]{63, 88, 79, 98, 90, 79, 77, 94, 79, 78, 10, 78, 79, 77, 89, 78, 79, 10, 79, 92, 92, 89, 92};
    }

    public abstract FK A0b(byte[] bArr, int i, boolean z) throws FL;

    public AbstractC0265Am(String str) {
        super(new C0264Al[2], new AbstractC0262Aj[2]);
        this.A00 = str;
        A0Y(1024);
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Override // com.facebook.ads.redexgen.X.AbstractC0782Vl
    /* renamed from: A0E */
    public final FL A0W(C0264Al c0264Al, AbstractC0262Aj abstractC0262Aj, boolean z) {
        try {
            ByteBuffer inputData = c0264Al.A01;
            abstractC0262Aj.A09(((C0784Vn) c0264Al).A00, A0b(inputData.array(), inputData.limit(), z), c0264Al.A00);
            abstractC0262Aj.A01(Integer.MIN_VALUE);
            return null;
        } catch (FL e) {
            return e;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Override // com.facebook.ads.redexgen.X.AbstractC0782Vl
    /* renamed from: A0F */
    public final FL A0X(Throwable th) {
        return new FL(A0I(0, 23, j.AppCompatTheme_tooltipFrameBackground), th);
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Override // com.facebook.ads.redexgen.X.AbstractC0782Vl
    /* renamed from: A0G */
    public final C0264Al A0T() {
        return new C0264Al();
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Override // com.facebook.ads.redexgen.X.AbstractC0782Vl
    /* renamed from: A0H */
    public final AbstractC0262Aj A0V() {
        return new AbstractC0262Aj(this) { // from class: com.facebook.ads.redexgen.X.34
            public final AbstractC0265Am A00;

            {
                this.A00 = this;
            }

            @Override // com.facebook.ads.redexgen.X.AbstractC0262Aj
            public final void A08() {
                this.A00.A0a(this);
            }
        };
    }

    @Override // com.facebook.ads.redexgen.X.AbstractC0782Vl
    /* renamed from: A0c */
    public final void A0a(AbstractC0262Aj abstractC0262Aj) {
        super.A0a(abstractC0262Aj);
    }

    @Override // com.facebook.ads.redexgen.X.UD
    public final void AEY(long j) {
    }
}
