package com.facebook.ads.redexgen.X;

import java.util.concurrent.atomic.AtomicBoolean;
/* loaded from: assets/audience_network.dex */
public class TE implements InterfaceC0607Oo {
    public static String[] A01 = {"T9VzL8fHxpfySiwwlXedeY7mX", "guyVlBlOMcVDAIfN1wPFopCO0r0Zk0gq", "ttKJ4peW2WPtu1OROjgTykJGR", "A5J8ePX4fIk14ZpUSfaCkLGHXqqMAYt6", "kQp8myZeu", "7L0NbJj9RoUIRUZ", "UhNplE17b8XX", "zMftdbZDucx4tcPG97oOAYZ8vQU5TBbw"};
    public final /* synthetic */ T8 A00;

    public TE(T8 t8) {
        this.A00 = t8;
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC0607Oo
    public final void ACe() {
        AtomicBoolean atomicBoolean;
        InterfaceC0453Ik interfaceC0453Ik;
        InterfaceC0453Ik interfaceC0453Ik2;
        AtomicBoolean atomicBoolean2;
        atomicBoolean = this.A00.A0E;
        atomicBoolean.set(true);
        interfaceC0453Ik = this.A00.A02;
        if (interfaceC0453Ik != null) {
            interfaceC0453Ik2 = this.A00.A02;
            atomicBoolean2 = this.A00.A0D;
            boolean z = atomicBoolean2.get();
            if (A01[1].charAt(3) == 'h') {
                throw new RuntimeException();
            }
            A01[3] = "0cRb1Hjpfivo5OpVdykyl3dtou8RqpBl";
            interfaceC0453Ik2.ABe(z);
        }
    }
}
