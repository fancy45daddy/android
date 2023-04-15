package com.facebook.ads.redexgen.X;

import android.content.DialogInterface;
import java.util.Map;
/* loaded from: assets/audience_network.dex */
public class ST extends AbstractRunnableC0487Ju {
    public static String[] A02 = {"r", "tRYI", "7UJuVMqBcP2QEoAe5I9ReZPElv0qEy55", "leQvAr8Bdm", "IrxDcEzjLLQBxw", "x58zC904VQqUCNnuzCjkyAfM", "58DZzAqOGTGaE", "1xO3"};
    public final /* synthetic */ DialogInterface A00;
    public final /* synthetic */ LR A01;

    public ST(LR lr, DialogInterface dialogInterface) {
        this.A01 = lr;
        this.A00 = dialogInterface;
    }

    @Override // com.facebook.ads.redexgen.X.AbstractRunnableC0487Ju
    public final void A06() {
        InterfaceC0633Po interfaceC0633Po;
        InterfaceC0633Po interfaceC0633Po2;
        C0805Wi c0805Wi;
        Map<? extends String, ? extends String> A04;
        interfaceC0633Po = this.A01.A01.A02;
        if (interfaceC0633Po != null) {
            interfaceC0633Po2 = this.A01.A01.A02;
            c0805Wi = this.A01.A01.A00;
            String A03 = C0469Ja.A03(c0805Wi);
            Q2 q2 = new Q2();
            A04 = this.A01.A01.A04(this.A01.A00.getText().toString());
            interfaceC0633Po2.AD4(A03, q2.A05(A04).A08());
        }
        DialogInterface dialogInterface = this.A00;
        if (A02[6].length() != 13) {
            throw new RuntimeException();
        }
        A02[6] = "1hADnGgCLejuT";
        dialogInterface.cancel();
    }
}
