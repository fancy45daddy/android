package com.facebook.ads.redexgen.X;

import android.view.View;
/* loaded from: assets/audience_network.dex */
public class MM implements View.OnClickListener {
    public static String[] A01 = {"KnJgliGO", "VwHKKtvbMk7FPKbBmIqapgeuC2T6fwds", "wENtEeepoPFkxQkEwI5qJp4A5OxzxToD", "COqx4q9kDUbjFrhSKPpHQyyB6JO5bBDL", "v63", "lzTgDb46XsVjhse8XoOOStoy8Mg7tCsc", "1yL2I4AIQTHR8fVHiYQ7c9e8uwPzvL3", "TX4RO1m5K"};
    public final /* synthetic */ S2 A00;

    public MM(S2 s2) {
        this.A00 = s2;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        if (C0480Jm.A02(this)) {
            return;
        }
        try {
            this.A00.A0B.A7r();
        } catch (Throwable th) {
            String[] strArr = A01;
            if (strArr[3].charAt(11) != strArr[5].charAt(11)) {
                throw new RuntimeException();
            }
            A01[0] = "zPAJp5EfhF2KrfBUqv";
            C0480Jm.A00(th, this);
        }
    }
}
