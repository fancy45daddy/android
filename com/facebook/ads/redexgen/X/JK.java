package com.facebook.ads.redexgen.X;

import android.os.Handler;
import androidx.annotation.Nullable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
/* loaded from: assets/audience_network.dex */
public final class JK implements InterfaceC0612Ot {
    public static String[] A0C = {"ua4Z1F3Vn1tdURaP0tTj5Z", "VlqKJtfjGqtNso0qX2A6lmnvOZsZ2xTE", "1pb0xsuTqC4ySw1JjiCpjHk6a0KK", "HW9a8amQa56v9usqS4J3KzzxMBRp7oUY", "lzg290ZQq0ECc78zj7A2Pt", "9JBQniCNh78hbF6UnJo6", "DIRAqcjzgSQz4x9q8OrEXdtc6Zce0V5V", "FPN1H6gS7aT4O5CCkRk249I"};
    @Nullable
    public P1 A01;
    public boolean A02;
    public boolean A03;
    public boolean A04;
    public final AbstractC0501Kk A07 = new AbstractC0501Kk() { // from class: com.facebook.ads.redexgen.X.6q
        /* JADX INFO: Access modifiers changed from: private */
        @Override // com.facebook.ads.redexgen.X.C8O
        /* renamed from: A00 */
        public final void A03(C01736s c01736s) {
            Handler handler;
            boolean A0D;
            handler = JK.this.A05;
            handler.removeCallbacksAndMessages(null);
            A0D = JK.this.A0D(PE.A05);
            if (A0D) {
                JK.this.A03();
                JK.this.A06(true, false);
            }
            JK.this.A03 = true;
        }
    };
    public final AbstractC0534Lr A06 = new AbstractC0534Lr() { // from class: com.facebook.ads.redexgen.X.6p
        /* JADX INFO: Access modifiers changed from: private */
        @Override // com.facebook.ads.redexgen.X.C8O
        /* renamed from: A00 */
        public final void A03(C6v c6v) {
            JK.this.A03();
            JK.this.A06(false, false);
            JK.this.A03 = true;
        }
    };
    public final K6 A08 = new C01706o(this);
    public final AbstractC0483Jq A09 = new AbstractC0483Jq() { // from class: com.facebook.ads.redexgen.X.6n
        /* JADX INFO: Access modifiers changed from: private */
        @Override // com.facebook.ads.redexgen.X.C8O
        /* renamed from: A00 */
        public final void A03(C01726r c01726r) {
            boolean z;
            boolean A0D;
            z = JK.this.A02;
            if (z) {
                return;
            }
            A0D = JK.this.A0D(PE.A05);
            if (!A0D) {
                return;
            }
            JK.this.A03();
            JK.this.A06(true, false);
        }
    };
    public final AbstractC0470Jb A0A = new C01686m(this);
    public final Handler A05 = new Handler();
    public final List<PF> A0B = new ArrayList();
    public int A00 = 2000;

    public JK(boolean z) {
        this.A02 = z;
    }

    public static /* synthetic */ int A00(JK jk) {
        return jk.A00;
    }

    public static /* synthetic */ Handler A01(JK jk) {
        return jk.A05;
    }

    public void A03() {
        this.A05.removeCallbacksAndMessages(null);
        Iterator<PF> it = this.A0B.iterator();
        while (true) {
            boolean hasNext = it.hasNext();
            if (A0C[2].length() != 28) {
                throw new RuntimeException();
            }
            A0C[1] = "SzC94btdcN1119JNHgRanzsWdfoutew0";
            if (hasNext) {
                it.next().cancel();
            } else {
                return;
            }
        }
    }

    public static /* synthetic */ void A04(JK jk) {
        jk.A03();
    }

    public static /* synthetic */ void A05(JK jk, boolean z, boolean z2) {
        jk.A06(z, z2);
    }

    public void A06(boolean z, boolean z2) {
        for (PF pf : this.A0B) {
            if (A0C[2].length() != 28) {
                throw new RuntimeException();
            }
            A0C[1] = "qWrr7wKcnD6M25Nm7U3j0NNRElcnIA4d";
            pf.A3M(z, z2);
        }
    }

    public static /* synthetic */ boolean A07(JK jk) {
        return jk.A03;
    }

    public static /* synthetic */ boolean A08(JK jk) {
        return jk.A02;
    }

    public static /* synthetic */ boolean A09(JK jk) {
        return jk.A04;
    }

    public static /* synthetic */ boolean A0A(JK jk, PE pe) {
        return jk.A0D(pe);
    }

    public static /* synthetic */ boolean A0B(JK jk, boolean z) {
        jk.A03 = z;
        return z;
    }

    public static /* synthetic */ boolean A0C(JK jk, boolean z) {
        jk.A04 = z;
        return z;
    }

    public boolean A0D(PE pe) {
        for (PF pf : this.A0B) {
            if (pf.A7V() != pe) {
                return false;
            }
        }
        return true;
    }

    public final void A0E() {
        this.A0B.clear();
    }

    public final void A0F() {
        if (this.A02) {
            this.A05.removeCallbacksAndMessages(null);
            this.A02 = false;
        }
    }

    public final void A0G() {
        this.A04 = true;
        this.A03 = true;
        A06(false, false);
    }

    public final void A0H(int i) {
        this.A00 = i;
    }

    public final void A0I(PF pf) {
        this.A0B.add(pf);
    }

    public final boolean A0J() {
        return this.A02;
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC0612Ot
    public final void A8l(P1 p1) {
        this.A01 = p1;
        p1.getEventBus().A03(this.A07, this.A0A, this.A08, this.A09, this.A06);
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC0612Ot
    public final void AF5(P1 p1) {
        A03();
        p1.getEventBus().A04(this.A06, this.A0A, this.A08, this.A09, this.A07);
        this.A01 = null;
    }
}
