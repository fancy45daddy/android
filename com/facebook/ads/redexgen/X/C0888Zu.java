package com.facebook.ads.redexgen.X;

import android.graphics.Rect;
import android.os.Handler;
import android.view.View;
import androidx.annotation.Nullable;
import com.facebook.infer.annotation.Nullsafe;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
@Nullsafe(Nullsafe.Mode.LOCAL)
/* renamed from: com.facebook.ads.redexgen.X.Zu  reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public final class C0888Zu {
    public static byte[] A0C;
    public static String[] A0D = {"YcCIPLCDTe1wGTKdO7xqYhpFwQzvmXtt", "FfIdHaSVTal814YVh5tJNVr21T0wsSAo", "HLDls6wic6LzndIKtUvgWnGJ4QMP07cO", "ccYpD8PuArRKO9YkPTuVfhIh5pDN1br2", "LFFD576NBTVByEN649EglQB81U0zBBuc", "sO5gz1O188I9hNkbLLxzl8j4JWiDgVKK", "Hord6YvHX1lmSPmhXyMRW660HCYjcXOm", "5HbQDpK1pfSpB47EOovGOWVGJlrw1BSl"};
    @Nullable
    public InterfaceC0892Zy A00;
    public boolean A01;
    public final Rect A02;
    public final Rect A03;
    public final Handler A04;
    public final InterfaceC0667Qw A05;
    public final InterfaceC0899a5 A06;
    public final C0890Zw A07;
    public final F9 A08;
    public final Runnable A09;
    public final List<Rect> A0A;
    public final List<View> A0B;

    public static String A03(int i, int i2, int i3) {
        byte[] copyOfRange = Arrays.copyOfRange(A0C, i, i + i2);
        for (int i4 = 0; i4 < copyOfRange.length; i4++) {
            copyOfRange[i4] = (byte) ((copyOfRange[i4] - i3) - 73);
        }
        return new String(copyOfRange);
    }

    public static void A04() {
        A0C = new byte[]{-4, -5, -32, -16, -18, -5, -46, -5, -15};
    }

    static {
        A04();
    }

    public C0888Zu(InterfaceC0899a5 interfaceC0899a5, InterfaceC0667Qw interfaceC0667Qw, F9 f9, C0890Zw c0890Zw, Handler handler) {
        this(interfaceC0899a5, interfaceC0667Qw, f9, c0890Zw, handler, 100);
    }

    public C0888Zu(InterfaceC0899a5 interfaceC0899a5, InterfaceC0667Qw interfaceC0667Qw, F9 f9, C0890Zw c0890Zw, Handler handler, int i) {
        this.A03 = new Rect();
        this.A02 = new Rect();
        this.A0B = new ArrayList();
        this.A0A = new ArrayList();
        this.A01 = false;
        this.A06 = interfaceC0899a5;
        this.A05 = interfaceC0667Qw;
        this.A08 = f9;
        this.A07 = c0890Zw;
        this.A04 = handler;
        this.A09 = new RunnableC0889Zv(this, i);
    }

    private void A05(long j) {
        if (this.A0B.isEmpty()) {
            this.A06.A7q(this.A0A);
            this.A08.A3q(j, this.A0A);
            this.A08.A5D();
            return;
        }
        throw new IllegalStateException();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void A06(long j) {
        this.A06.A7q(this.A0A);
        this.A08.A3q(j, this.A0A);
        if (this.A0B.isEmpty()) {
            this.A07.A03(this.A0B);
            Iterator<View> it = this.A0B.iterator();
            loop0: while (true) {
                if (it.hasNext()) {
                    View next = it.next();
                    C0897a3 A00 = this.A07.A00(next);
                    for (Rect rect : this.A0A) {
                        if (C0881Zn.A00(next, this.A03, this.A02, rect) && A00 != C0897a3.A06) {
                            F9 f9 = this.A08;
                            Rect containerRect = this.A03;
                            Rect rect2 = this.A02;
                            if (A0D[0].charAt(21) != 'h') {
                                break loop0;
                            }
                            A0D[6] = "BhrT0c14O8Thrmtg3HRzOfRcpCyh5HNl";
                            f9.A3J(A00, containerRect, rect2);
                        }
                    }
                } else {
                    this.A08.A5D();
                    if (this.A00 != null) {
                        throw new NullPointerException(A03(0, 9, 68));
                    }
                    this.A0B.clear();
                    String[] strArr = A0D;
                    if (strArr[1].charAt(9) != strArr[3].charAt(9)) {
                        String[] strArr2 = A0D;
                        strArr2[1] = "lmQ3TWUKEycrXTOUs6diKoA3HcDn9Pdd";
                        strArr2[3] = "T2sieqBmgvCwHjMtYcExspPM2F3LyLlD";
                        return;
                    }
                }
            }
            throw new RuntimeException();
        }
        throw new IllegalStateException();
    }

    public final void A09() {
        if (this.A01) {
            this.A04.removeCallbacks(this.A09);
            A05(this.A05.A9d());
        }
        this.A01 = false;
    }

    public final void A0A() {
        if (!this.A01) {
            this.A01 = true;
            this.A04.post(this.A09);
        }
    }

    public final void A0B(@Nullable InterfaceC0894a0 interfaceC0894a0) {
        this.A08.AEc(interfaceC0894a0);
    }

    public final void A0C(@Nullable InterfaceC0892Zy interfaceC0892Zy) {
        this.A00 = interfaceC0892Zy;
    }
}
