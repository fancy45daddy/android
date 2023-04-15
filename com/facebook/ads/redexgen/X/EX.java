package com.facebook.ads.redexgen.X;

import android.os.Handler;
import android.os.Looper;
import androidx.annotation.CheckResult;
import androidx.annotation.Nullable;
import com.facebook.ads.internal.exoplayer2.Format;
import java.io.IOException;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;
/* loaded from: assets/audience_network.dex */
public final class EX {
    public static String[] A04 = {"HGHzNcawqnVFgJx8ceQNwcxcn1SDkpDb", "AD2ta0a", "biSUTEi4nYJndXTTLsT", "38FOXeSW4cnwnxdXp60to", "WtyRCcfaPM", "iLolo35", "fvJAwdggv90DLF", "FbA7S8K"};
    public final int A00;
    @Nullable
    public final EK A01;
    public final long A02;
    public final CopyOnWriteArrayList<EW> A03;

    public EX() {
        this(new CopyOnWriteArrayList(), 0, null, 0L);
    }

    public EX(CopyOnWriteArrayList<EW> copyOnWriteArrayList, int i, @Nullable EK ek, long j) {
        this.A03 = copyOnWriteArrayList;
        this.A00 = i;
        this.A01 = ek;
        this.A02 = j;
    }

    private long A00(long j) {
        long A01 = AnonymousClass92.A01(j);
        if (A01 == -9223372036854775807L) {
            return -9223372036854775807L;
        }
        long j2 = this.A02;
        if (A04[2].length() != 19) {
            throw new RuntimeException();
        }
        A04[7] = "vQJR5ZN";
        return j2 + A01;
    }

    private void A01(Handler handler, Runnable runnable) {
        if (handler.getLooper() == Looper.myLooper()) {
            runnable.run();
        } else {
            handler.post(runnable);
        }
    }

    @CheckResult
    public final EX A02(int i, @Nullable EK ek, long j) {
        return new EX(this.A03, i, ek, j);
    }

    public final void A03() {
        H6.A04(this.A01 != null);
        Iterator<EW> it = this.A03.iterator();
        while (it.hasNext()) {
            EW next = it.next();
            InterfaceC0343Ea listener = next.A01;
            A01(next.A00, new EN(this, listener));
        }
    }

    public final void A04() {
        H6.A04(this.A01 != null);
        Iterator<EW> it = this.A03.iterator();
        while (it.hasNext()) {
            EW next = it.next();
            InterfaceC0343Ea listener = next.A01;
            A01(next.A00, new EO(this, listener));
        }
    }

    public final void A05() {
        H6.A04(this.A01 != null);
        Iterator<EW> it = this.A03.iterator();
        while (true) {
            boolean hasNext = it.hasNext();
            if (A04[7].length() != 7) {
                throw new RuntimeException();
            }
            A04[2] = "JAadAeVCHcunsRCfoQL";
            if (hasNext) {
                EW next = it.next();
                InterfaceC0343Ea listener = next.A01;
                A01(next.A00, new ET(this, listener));
            } else {
                return;
            }
        }
    }

    public final void A06(int i, @Nullable Format format, int i2, @Nullable Object obj, long j) {
        A0C(new EZ(1, i, format, i2, obj, A00(j), -9223372036854775807L));
    }

    public final void A07(Handler handler, InterfaceC0343Ea interfaceC0343Ea) {
        H6.A03((handler == null || interfaceC0343Ea == null) ? false : true);
        this.A03.add(new EW(handler, interfaceC0343Ea));
    }

    public final void A08(EY ey, EZ ez) {
        Iterator<EW> it = this.A03.iterator();
        while (it.hasNext()) {
            EW next = it.next();
            InterfaceC0343Ea listener = next.A01;
            A01(next.A00, new ER(this, listener, ey, ez));
        }
    }

    public final void A09(EY ey, EZ ez) {
        Iterator<EW> it = this.A03.iterator();
        while (it.hasNext()) {
            EW next = it.next();
            InterfaceC0343Ea listener = next.A01;
            A01(next.A00, new EQ(this, listener, ey, ez));
        }
    }

    public final void A0A(EY ey, EZ ez) {
        Iterator<EW> it = this.A03.iterator();
        while (it.hasNext()) {
            EW next = it.next();
            InterfaceC0343Ea listener = next.A01;
            A01(next.A00, new EP(this, listener, ey, ez));
        }
    }

    public final void A0B(EY ey, EZ ez, IOException iOException, boolean z) {
        Iterator<EW> it = this.A03.iterator();
        while (it.hasNext()) {
            EW next = it.next();
            A01(next.A00, new ES(this, next.A01, ey, ez, iOException, z));
        }
    }

    public final void A0C(EZ ez) {
        Iterator<EW> it = this.A03.iterator();
        while (it.hasNext()) {
            EW next = it.next();
            InterfaceC0343Ea listener = next.A01;
            A01(next.A00, new EV(this, listener, ez));
        }
    }

    public final void A0D(InterfaceC0343Ea interfaceC0343Ea) {
        Iterator<EW> it = this.A03.iterator();
        while (it.hasNext()) {
            EW listenerAndHandler = it.next();
            if (listenerAndHandler.A01 == interfaceC0343Ea) {
                this.A03.remove(listenerAndHandler);
            }
        }
    }

    public final void A0E(GU gu, int i, int i2, @Nullable Format format, int i3, @Nullable Object obj, long j, long j2, long j3) {
        A0A(new EY(gu, j3, 0L, 0L), new EZ(i, i2, format, i3, obj, A00(j), A00(j2)));
    }

    public final void A0F(GU gu, int i, int i2, @Nullable Format format, int i3, @Nullable Object obj, long j, long j2, long j3, long j4, long j5) {
        A08(new EY(gu, j3, j4, j5), new EZ(i, i2, format, i3, obj, A00(j), A00(j2)));
    }

    public final void A0G(GU gu, int i, int i2, @Nullable Format format, int i3, @Nullable Object obj, long j, long j2, long j3, long j4, long j5) {
        A09(new EY(gu, j3, j4, j5), new EZ(i, i2, format, i3, obj, A00(j), A00(j2)));
    }

    public final void A0H(GU gu, int i, int i2, @Nullable Format format, int i3, @Nullable Object obj, long j, long j2, long j3, long j4, long j5, IOException iOException, boolean z) {
        A0B(new EY(gu, j3, j4, j5), new EZ(i, i2, format, i3, obj, A00(j), A00(j2)), iOException, z);
    }
}
