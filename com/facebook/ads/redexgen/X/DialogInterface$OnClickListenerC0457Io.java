package com.facebook.ads.redexgen.X;

import android.content.DialogInterface;
import java.util.Map;
/* renamed from: com.facebook.ads.redexgen.X.Io  reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public class DialogInterface$OnClickListenerC0457Io implements DialogInterface.OnClickListener {
    public final /* synthetic */ View$OnClickListenerC0720Sy A00;

    public DialogInterface$OnClickListenerC0457Io(View$OnClickListenerC0720Sy view$OnClickListenerC0720Sy) {
        this.A00 = view$OnClickListenerC0720Sy;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(DialogInterface dialogInterface, int i) {
        Map<String, String> A01;
        if (this.A00.A01.A0a != null) {
            Z9 z9 = this.A00.A01.A0a;
            A01 = this.A00.A01();
            z9.A0P(A01);
        }
    }
}
