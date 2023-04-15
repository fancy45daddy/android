package com.facebook.ads.redexgen.X;

import androidx.annotation.Nullable;
import com.facebook.ads.internal.protocol.AdPlacementType;
/* renamed from: com.facebook.ads.redexgen.X.0s  reason: invalid class name and case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public final class C00250s {
    public static InterfaceC00200n A00;

    @Nullable
    public final InterfaceC00200n A00(C0806Wj c0806Wj, AdPlacementType adPlacementType) {
        InterfaceC00200n interfaceC00200n = A00;
        if (interfaceC00200n != null) {
            return interfaceC00200n;
        }
        int i = C00240r.A00[adPlacementType.ordinal()];
        if (i != 1) {
            if (i != 2) {
                if (i != 3) {
                    if (i != 4) {
                        if (i != 5) {
                            return null;
                        }
                        return new C0344Eb();
                    }
                    return new C0353Ek(c0806Wj);
                }
                return new Z9(c0806Wj);
            }
            return new ZB();
        }
        return new ZC();
    }
}
