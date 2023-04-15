package com.facebook.ads.redexgen.X;

import android.view.View;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
/* loaded from: assets/audience_network.dex */
public abstract class XW extends C4P {
    public static String[] A01 = {"ufm8s7LRmOM7", "sIBwdoM05ajejE", "0NxvrnR7UZDHrBy4xVhLU5lsqzWJ5R3x", "FsILnIqpIa8iE3wffvJrO4tNlZdDmpUd", "wKnqjXSh8f61FKWyknAGi8xlXXoDdiLA", "lpMPMGmveEx5YZPPZgDkriuB4nzdouJK", "fQPzW90JHWOApVaaQbndX59CGXgCnXlm", "Pp9SKBa6RS3IfLIGXA9e4oeVKGHa5CsE"};
    public boolean A00 = true;

    public abstract boolean A0R(AbstractC01194l abstractC01194l);

    public abstract boolean A0S(AbstractC01194l abstractC01194l);

    public abstract boolean A0T(AbstractC01194l abstractC01194l, int i, int i2, int i3, int i4);

    public abstract boolean A0U(AbstractC01194l abstractC01194l, AbstractC01194l abstractC01194l2, int i, int i2, int i3, int i4);

    @Override // com.facebook.ads.redexgen.X.C4P
    public final boolean A0D(@NonNull AbstractC01194l abstractC01194l) {
        return !this.A00 || abstractC01194l.A0b();
    }

    @Override // com.facebook.ads.redexgen.X.C4P
    public final boolean A0E(@NonNull AbstractC01194l abstractC01194l, @Nullable C4O c4o, @NonNull C4O c4o2) {
        if (c4o != null && (c4o.A01 != c4o2.A01 || c4o.A03 != c4o2.A03)) {
            return A0T(abstractC01194l, c4o.A01, c4o.A03, c4o2.A01, c4o2.A03);
        }
        return A0R(abstractC01194l);
    }

    @Override // com.facebook.ads.redexgen.X.C4P
    public final boolean A0F(@NonNull AbstractC01194l abstractC01194l, @NonNull C4O c4o, @Nullable C4O c4o2) {
        int i = c4o.A01;
        int i2 = c4o.A03;
        View view = abstractC01194l.A0H;
        int oldLeft = c4o2 == null ? view.getLeft() : c4o2.A01;
        int oldTop = c4o2 == null ? view.getTop() : c4o2.A03;
        if (!abstractC01194l.A0c() && (i != oldLeft || i2 != oldTop)) {
            view.layout(oldLeft, oldTop, view.getWidth() + oldLeft, view.getHeight() + oldTop);
            return A0T(abstractC01194l, i, i2, oldLeft, oldTop);
        }
        return A0S(abstractC01194l);
    }

    @Override // com.facebook.ads.redexgen.X.C4P
    public final boolean A0G(@NonNull AbstractC01194l abstractC01194l, @NonNull C4O c4o, @NonNull C4O c4o2) {
        if (c4o.A01 != c4o2.A01 || c4o.A03 != c4o2.A03) {
            return A0T(abstractC01194l, c4o.A01, c4o.A03, c4o2.A01, c4o2.A03);
        }
        A0O(abstractC01194l);
        return false;
    }

    @Override // com.facebook.ads.redexgen.X.C4P
    public final boolean A0H(@NonNull AbstractC01194l abstractC01194l, @NonNull AbstractC01194l abstractC01194l2, @NonNull C4O c4o, @NonNull C4O c4o2) {
        int fromTop;
        int toLeft;
        int i = c4o.A01;
        int fromLeft = c4o.A03;
        if (abstractC01194l2.A0h()) {
            fromTop = c4o.A01;
            toLeft = c4o.A03;
        } else {
            fromTop = c4o2.A01;
            toLeft = c4o2.A03;
        }
        int toTop = A01[1].length();
        if (toTop != 14) {
            throw new RuntimeException();
        }
        A01[1] = "7F8ns227Orjao7";
        return A0U(abstractC01194l, abstractC01194l2, i, fromLeft, fromTop, toLeft);
    }

    public final void A0N(AbstractC01194l abstractC01194l) {
        A0C(abstractC01194l);
    }

    public final void A0O(AbstractC01194l abstractC01194l) {
        A0C(abstractC01194l);
    }

    public final void A0P(AbstractC01194l abstractC01194l) {
        A0C(abstractC01194l);
    }

    public final void A0Q(AbstractC01194l abstractC01194l, boolean z) {
        A0C(abstractC01194l);
    }
}
