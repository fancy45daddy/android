package com.facebook.ads.redexgen.X;

import a.a.j;
import android.annotation.TargetApi;
import android.content.Context;
import android.hardware.display.DisplayManager;
import android.view.Display;
import android.view.WindowManager;
import androidx.annotation.Nullable;
import java.util.Arrays;
@TargetApi(16)
/* renamed from: com.facebook.ads.redexgen.X.Hz  reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public final class C0442Hz {
    public static byte[] A0C;
    public static String[] A0D = {"i0Plrx2Nq5R", "0KClt8Z9EM", "nQMuIj2OsVJHQqYmqvawjMpASRVzc92c", "WLkeStMKuRlseW4hkxDKryqccASBMssv", "75mbZl2wj9Oc7L4cfBN0ornHxJ7x4bV4", "cDdFi4obBr6Dm4LziWqhdJNE9f6gL2cC", "Y", "1LOEfBfCv2OZoty488nnb7WvOOH1XlhR"};
    public long A00;
    public long A01;
    public long A02;
    public long A03;
    public long A04;
    public long A05;
    public long A06;
    public long A07;
    public boolean A08;
    public final WindowManager A09;
    public final C0440Hx A0A;
    public final Choreographer$FrameCallbackC0441Hy A0B;

    public static String A02(int i, int i2, int i3) {
        byte[] copyOfRange = Arrays.copyOfRange(A0C, i, i + i2);
        for (int i4 = 0; i4 < copyOfRange.length; i4++) {
            copyOfRange[i4] = (byte) ((copyOfRange[i4] ^ i3) ^ 124);
        }
        return new String(copyOfRange);
    }

    public static void A04() {
        A0C = new byte[]{109, 96, 122, 121, 101, 104, 112, 120, 102, 97, 107, 96, 120};
    }

    static {
        A04();
    }

    public C0442Hz() {
        this(null);
    }

    public C0442Hz(@Nullable Context context) {
        if (context != null) {
            context = context.getApplicationContext();
            this.A09 = (WindowManager) context.getSystemService(A02(7, 6, j.AppCompatTheme_windowFixedHeightMinor));
        } else {
            this.A09 = null;
        }
        if (this.A09 != null) {
            this.A0A = C0430Hl.A02 >= 17 ? A01(context) : null;
            this.A0B = Choreographer$FrameCallbackC0441Hy.A00();
        } else {
            this.A0A = null;
            this.A0B = null;
        }
        this.A06 = -9223372036854775807L;
        this.A07 = -9223372036854775807L;
    }

    public static long A00(long j, long j2, long j3) {
        long j4;
        long vsyncCount = j3 * ((j - j2) / j3);
        long j5 = j2 + vsyncCount;
        if (j <= j5) {
            j4 = j5 - j3;
        } else {
            j4 = j5;
            j5 += j3;
        }
        return j5 - j < j - j4 ? j5 : j4;
    }

    @TargetApi(17)
    private C0440Hx A01(Context context) {
        DisplayManager displayManager = (DisplayManager) context.getSystemService(A02(0, 7, j.AppCompatTheme_windowFixedWidthMinor));
        if (displayManager == null) {
            return null;
        }
        return new C0440Hx(this, displayManager);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void A03() {
        Display defaultDisplay = this.A09.getDefaultDisplay();
        if (defaultDisplay != null) {
            double refreshRate = 1.0E9d / defaultDisplay.getRefreshRate();
            String[] strArr = A0D;
            if (strArr[1].length() == strArr[6].length()) {
                throw new RuntimeException();
            }
            A0D[0] = "cQjBVfAMAaWJXkNWf";
            this.A06 = (long) refreshRate;
            this.A07 = (this.A06 * 80) / 100;
        }
    }

    private boolean A06(long j, long j2) {
        long j3 = j - this.A04;
        long elapsedFrameTimeNs = this.A05;
        return Math.abs((j2 - elapsedFrameTimeNs) - j3) > 20000000;
    }

    public final long A07(long j, long j2) {
        long j3 = 1000 * j;
        long j4 = j3;
        long j5 = j2;
        if (this.A08) {
            if (j != this.A02) {
                this.A01++;
                this.A00 = this.A03;
            }
            long j6 = this.A01;
            if (j6 >= 6) {
                long j7 = this.A00 + ((j3 - this.A04) / j6);
                if (!A06(j7, j2)) {
                    j5 = (this.A05 + j7) - this.A04;
                    j4 = j7;
                } else {
                    this.A08 = false;
                }
            } else if (A06(j3, j2)) {
                this.A08 = false;
            }
        }
        if (!this.A08) {
            this.A04 = j3;
            this.A05 = j2;
            this.A01 = 0L;
            this.A08 = true;
        }
        this.A02 = j;
        this.A03 = j4;
        Choreographer$FrameCallbackC0441Hy choreographer$FrameCallbackC0441Hy = this.A0B;
        if (choreographer$FrameCallbackC0441Hy == null || this.A06 == -9223372036854775807L) {
            return j5;
        }
        long j8 = choreographer$FrameCallbackC0441Hy.A04;
        if (j8 == -9223372036854775807L) {
            return j5;
        }
        return A00(j5, j8, this.A06) - this.A07;
    }

    public final void A08() {
        if (this.A09 != null) {
            C0440Hx c0440Hx = this.A0A;
            if (c0440Hx != null) {
                c0440Hx.A01();
            }
            this.A0B.A07();
        }
    }

    public final void A09() {
        this.A08 = false;
        if (this.A09 != null) {
            this.A0B.A06();
            C0440Hx c0440Hx = this.A0A;
            if (c0440Hx != null) {
                c0440Hx.A00();
            }
            A03();
        }
    }
}
