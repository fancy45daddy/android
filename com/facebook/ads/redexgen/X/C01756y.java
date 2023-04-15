package com.facebook.ads.redexgen.X;

import android.os.Bundle;
import androidx.annotation.Nullable;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
/* renamed from: com.facebook.ads.redexgen.X.6y  reason: invalid class name and case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public final class C01756y extends C0553Ml {
    public int A00;
    public boolean A01;
    public final C8O<C6v> A02;
    public final C8O<C01736s> A03;
    public final C8O<KV> A04;
    public final C8O<C01726r> A05;
    public final C8O<C0482Jp> A06;
    public final C8O<C0477Jj> A07;
    public final C8O<C0474Jg> A08;
    public final C8O<JO> A09;
    public final C8O<JN> A0A;
    public final P1 A0B;
    public final K2 A0C;
    public final JP A0D;

    public C01756y(C0806Wj c0806Wj, IT it, P1 p1, String str) {
        this(c0806Wj, it, p1, new ArrayList(), str);
    }

    public C01756y(C0806Wj c0806Wj, IT it, P1 p1, String str, @Nullable Bundle bundle) {
        this(c0806Wj, it, p1, new ArrayList(), str, bundle, null);
    }

    public C01756y(C0806Wj c0806Wj, IT it, P1 p1, String str, @Nullable Map<String, String> extraParams) {
        this(c0806Wj, it, p1, new ArrayList(), str, null, extraParams);
    }

    public C01756y(C0806Wj c0806Wj, IT it, P1 p1, List<C2A> list, String str) {
        super(c0806Wj, it, p1, list, str, !p1.A0h(), new MC(c0806Wj, p1));
        this.A0D = new JP() { // from class: com.facebook.ads.redexgen.X.6z
            /* JADX INFO: Access modifiers changed from: private */
            @Override // com.facebook.ads.redexgen.X.C8O
            /* renamed from: A00 */
            public final void A03(JQ jq) {
                C01756y.this.A0Z();
            }
        };
        this.A07 = new C0617Oy(this);
        this.A03 = new C0616Ox(this);
        this.A04 = new C0615Ow(this);
        this.A05 = new C0599Og(this);
        this.A02 = new OI(this);
        this.A06 = new OH(this);
        this.A09 = new C0569Nb(this);
        this.A0A = new NN(this);
        this.A08 = new P0(this);
        this.A0C = new K2() { // from class: com.facebook.ads.redexgen.X.71
            /* JADX INFO: Access modifiers changed from: private */
            @Override // com.facebook.ads.redexgen.X.C8O
            /* renamed from: A00 */
            public final void A03(K5 k5) {
                P1 p12;
                C01756y c01756y = C01756y.this;
                p12 = c01756y.A0B;
                c01756y.A00 = p12.getDuration();
            }
        };
        this.A01 = false;
        this.A0B = p1;
        this.A0B.getEventBus().A03(this.A0D, this.A05, this.A07, this.A04, this.A03, this.A02, this.A06, this.A09, this.A0A, this.A0C, this.A08);
    }

    public C01756y(C0806Wj c0806Wj, IT it, P1 p1, List<C2A> list, String str, @Nullable Bundle bundle, @Nullable Map<String, String> map) {
        super(c0806Wj, it, p1, list, str, !p1.A0h(), bundle, map, new MC(c0806Wj, p1));
        this.A0D = new JP() { // from class: com.facebook.ads.redexgen.X.6z
            /* JADX INFO: Access modifiers changed from: private */
            @Override // com.facebook.ads.redexgen.X.C8O
            /* renamed from: A00 */
            public final void A03(JQ jq) {
                C01756y.this.A0Z();
            }
        };
        this.A07 = new C0617Oy(this);
        this.A03 = new C0616Ox(this);
        this.A04 = new C0615Ow(this);
        this.A05 = new C0599Og(this);
        this.A02 = new OI(this);
        this.A06 = new OH(this);
        this.A09 = new C0569Nb(this);
        this.A0A = new NN(this);
        this.A08 = new P0(this);
        this.A0C = new K2() { // from class: com.facebook.ads.redexgen.X.71
            /* JADX INFO: Access modifiers changed from: private */
            @Override // com.facebook.ads.redexgen.X.C8O
            /* renamed from: A00 */
            public final void A03(K5 k5) {
                P1 p12;
                C01756y c01756y = C01756y.this;
                p12 = c01756y.A0B;
                c01756y.A00 = p12.getDuration();
            }
        };
        this.A01 = false;
        this.A0B = p1;
        this.A0B.getEventBus().A03(this.A0D, this.A05, this.A07, this.A04, this.A03, this.A02, this.A06, this.A09, this.A0A, this.A08);
    }

    public final void A0g() {
        C0618Oz c0618Oz = new C0618Oz(this);
        if (this.A0B.A0l()) {
            L8.A00(c0618Oz);
        } else {
            this.A0B.getStateHandler().post(c0618Oz);
        }
    }
}
