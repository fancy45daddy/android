package com.facebook.ads.redexgen.X;

import android.os.Bundle;
import android.view.View;
import android.view.accessibility.AccessibilityEvent;
/* loaded from: assets/audience_network.dex */
public final class XX extends C00702m {
    public static String[] A02 = {"kCJseLSqSIrXu4CFjUZgH7qP37OfZeHD", "xEAmwUG5TGVzyoKH1PTTnmgJSds6zi0t", "yfye5wiKddzXjwKpYSAHRZ10SdbOyGIS", "FmBYeFx3U0BhjOzbepjZtX", "pFd99JFbVQiCxR8NKRmLZvqZPwpJ8hMq", "9sA", "zOMSQIOQC2uzgyYA4i3GoXbtL5yC1N4Y", "6JUJmYz6"};
    public final C00702m A00 = new XY(this);
    public final C0339Dw A01;

    public XX(C0339Dw c0339Dw) {
        this.A01 = c0339Dw;
    }

    @Override // com.facebook.ads.redexgen.X.C00702m
    public final void A07(View view, AccessibilityEvent accessibilityEvent) {
        super.A07(view, accessibilityEvent);
        accessibilityEvent.setClassName(C0339Dw.class.getName());
        if ((view instanceof C0339Dw) && !A0B()) {
            C0339Dw c0339Dw = (C0339Dw) view;
            if (c0339Dw.getLayoutManager() != null) {
                c0339Dw.getLayoutManager().A1x(accessibilityEvent);
            }
        }
    }

    @Override // com.facebook.ads.redexgen.X.C00702m
    public final void A08(View view, C3X c3x) {
        super.A08(view, c3x);
        c3x.A0O(C0339Dw.class.getName());
        if (!A0B() && this.A01.getLayoutManager() != null) {
            this.A01.getLayoutManager().A1F(c3x);
        }
    }

    @Override // com.facebook.ads.redexgen.X.C00702m
    public final boolean A09(View view, int i, Bundle bundle) {
        if (super.A09(view, i, bundle)) {
            String[] strArr = A02;
            if (strArr[2].charAt(11) != strArr[0].charAt(11)) {
                throw new RuntimeException();
            }
            A02[4] = "nByhcE3HAON4xHhAaRL71J2smf2uyoDS";
            return true;
        } else if (!A0B() && this.A01.getLayoutManager() != null) {
            C4T layoutManager = this.A01.getLayoutManager();
            if (A02[5].length() != 3) {
                throw new RuntimeException();
            }
            String[] strArr2 = A02;
            strArr2[7] = "ZdbAAVtg";
            strArr2[3] = "rBKlzqXoYmUf6BYv0O8fT1";
            return layoutManager.A1Z(i, bundle);
        } else {
            return false;
        }
    }

    public final C00702m A0A() {
        return this.A00;
    }

    public final boolean A0B() {
        return this.A01.A1t();
    }
}
