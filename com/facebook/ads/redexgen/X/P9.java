package com.facebook.ads.redexgen.X;

import android.os.Handler;
/* loaded from: assets/audience_network.dex */
public class P9 extends AbstractRunnableC0487Ju {
    public static String[] A04 = {"pUIboC8CwdUMtM1tPR8iEtPz8p", "ladzvmq", "gZiIZXhhpFNWaRiPv", "vQtAVDGFp8M", "7j30UYRlUEXcM4Kd2wK", "XchzO9Mtzl1GyvdPdWlZd1J0iwZmFx3H", "VTwPVxpRcW0", "YPnzN72MuP4y3lnuBhqZ0NoSyY"};
    public final /* synthetic */ int A00;
    public final /* synthetic */ int A01;
    public final /* synthetic */ P1 A02;
    public final /* synthetic */ EnumC0624Pf A03;

    public P9(P1 p1, EnumC0624Pf enumC0624Pf, int i, int i2) {
        this.A02 = p1;
        this.A03 = enumC0624Pf;
        this.A00 = i;
        this.A01 = i2;
    }

    @Override // com.facebook.ads.redexgen.X.AbstractRunnableC0487Ju
    public final void A06() {
        C0806Wj c0806Wj;
        Handler handler;
        C8N c8n;
        C0806Wj c0806Wj2;
        C8N c8n2;
        C0474Jg c0474Jg;
        Handler handler2;
        C0806Wj c0806Wj3;
        C8N c8n3;
        Handler handler3;
        C0806Wj c0806Wj4;
        C0806Wj c0806Wj5;
        C8N c8n4;
        KV kv;
        Handler handler4;
        C0806Wj c0806Wj6;
        C0806Wj c0806Wj7;
        Handler handler5;
        C8N c8n5;
        C8N c8n6;
        C0533Lq c0533Lq;
        C0806Wj c0806Wj8;
        C8N c8n7;
        if (this.A03 == EnumC0624Pf.A07) {
            this.A02.A0L(EnumC0443Ia.A0q);
            c0806Wj8 = this.A02.A0A;
            c0806Wj8.A0D().A2w();
            c8n7 = this.A02.A0B;
            c8n7.A02(P1.A0C());
        } else if (this.A03 == EnumC0624Pf.A03) {
            this.A02.A0L(EnumC0443Ia.A0l);
            this.A02.A03 = true;
            c8n6 = this.A02.A0B;
            c0533Lq = P1.A0G;
            c8n6.A02(c0533Lq);
            this.A02.A0K(this.A00);
        } else {
            EnumC0624Pf enumC0624Pf = this.A03;
            EnumC0624Pf enumC0624Pf2 = EnumC0624Pf.A06;
            String[] strArr = A04;
            if (strArr[0].length() != strArr[7].length()) {
                throw new RuntimeException();
            }
            A04[5] = "Wlqb3PCyph61UkVVxo7ng7VZa1hYfmo4";
            if (enumC0624Pf == enumC0624Pf2) {
                this.A02.A0L(EnumC0443Ia.A0k);
                c0806Wj7 = this.A02.A0A;
                c0806Wj7.A0D().A2o();
                this.A02.A03 = true;
                handler5 = this.A02.A07;
                handler5.removeCallbacksAndMessages(null);
                c8n5 = this.A02.A0B;
                int i = this.A01;
                c8n5.A02(new C6v(i, i));
                this.A02.A0K(this.A01);
            } else if (this.A03 == EnumC0624Pf.A0A) {
                c0806Wj4 = this.A02.A0A;
                if (ID.A1K(c0806Wj4)) {
                    c0806Wj6 = this.A02.A0A;
                    c0806Wj6.A09().ACl();
                }
                this.A02.A0L(EnumC0443Ia.A0o);
                c0806Wj5 = this.A02.A0A;
                c0806Wj5.A0D().A33();
                c8n4 = this.A02.A0B;
                kv = P1.A0H;
                c8n4.A02(kv);
                handler4 = this.A02.A07;
                handler4.removeCallbacksAndMessages(null);
                this.A02.A0H();
            } else if (this.A03 == EnumC0624Pf.A05) {
                this.A02.A0L(EnumC0443Ia.A0n);
                c0806Wj3 = this.A02.A0A;
                c0806Wj3.A0D().A2s();
                c8n3 = this.A02.A0B;
                final int i2 = this.A00;
                c8n3.A02(new AbstractC0535Ls(i2) { // from class: com.facebook.ads.redexgen.X.6s
                });
                handler3 = this.A02.A07;
                handler3.removeCallbacksAndMessages(null);
                this.A02.A0K(this.A00);
            } else if (this.A03 == EnumC0624Pf.A04) {
                this.A02.A0L(EnumC0443Ia.A0m);
                c0806Wj2 = this.A02.A0A;
                c0806Wj2.A0D().A2p();
                c8n2 = this.A02.A0B;
                c0474Jg = P1.A0K;
                c8n2.A02(c0474Jg);
                handler2 = this.A02.A07;
                handler2.removeCallbacksAndMessages(null);
            } else if (this.A03 == EnumC0624Pf.A09) {
                this.A02.A0L(EnumC0443Ia.A0k);
                c0806Wj = this.A02.A0A;
                c0806Wj.A0D().A2y();
                this.A02.A03 = true;
                handler = this.A02.A07;
                handler.removeCallbacksAndMessages(null);
                c8n = this.A02.A0B;
                c8n.A02(new C6v(this.A00, this.A01));
                this.A02.A0K(this.A00);
            }
        }
    }
}
